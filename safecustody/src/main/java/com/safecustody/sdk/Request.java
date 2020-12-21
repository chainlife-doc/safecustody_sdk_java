package com.safecustody.sdk;

import com.alibaba.fastjson.JSON;
import com.safecustody.sdk.data.comm.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class Request {

    protected User user;


    /**
     * @param user
     */
    public Request(User user) {
        this.user = user;
    }

    /**
     * @param method
     * @param param
     * @return
     */
    protected String request(String method, ReqData param) {
        String url = this.getUrl(method);
        String json = this.buildParam(param);
        return this.post(url, json);
    }


    /**
     * 获取host
     *
     * @return
     */
    public abstract String getHost();


    /**
     * 构建参数
     *
     * @param param
     * @return
     */
    private String buildParam(ReqData param) {
        int time = this.user.getTimes();
        AuthBody authBody = new AuthBody();
        authBody.setApiKey(this.user.getApiKey());
        authBody.setToken(this.user.getToken(String.valueOf(time)));
        authBody.setTimestamp(this.user.getTimes());
        this.user.unsetTime();
        param.setAuth(authBody);

        com.safecustody.sdk.data.comm.Request request = new com.safecustody.sdk.data.comm.Request();
        request.setAppid(this.user.getAppid());
        request.setData(param);
        System.out.println(JSON.toJSONString(request));

        return JSON.toJSONString(request);
    }

    /**
     * 获取url
     *
     * @param method
     * @return
     */
    private String getUrl(String method) {
        return this.getHost() + method;
    }


    /**
     * @param url
     * @param param
     * @return
     */
    private String post(String url, String param) {
        OutputStreamWriter out = null;
        BufferedReader reader = null;
        String response = "";
        try {
            URL httpUrl = null; //HTTP URL类 用这个类来创建连接
            //创建URL
            httpUrl = new URL(url);
            //建立连接
            HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("connection", "keep-alive");
            conn.setUseCaches(false);//设置不要缓存
            conn.setInstanceFollowRedirects(true);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.connect();
            //POST请求
            out = new OutputStreamWriter(
                    conn.getOutputStream());
            out.write(param);
            out.flush();
            //读取响应
            reader = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
            String lines;
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                response += lines;
            }
            reader.close();
            // 断开连接
            conn.disconnect();

//            log.info(response.toString());
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return response;
    }
}
