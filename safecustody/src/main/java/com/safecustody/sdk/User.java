package com.safecustody.sdk;

import com.alibaba.fastjson.annotation.JSONField;

import java.security.MessageDigest;
import java.util.Date;

public class User {

    /**
     * appid
     */
    private String appid;


    /**
     * userid
     */
    private String userid;

    /**
     * salt
     */
    private String secretKey;

    /**
     * times
     */
    private int times = 0;


    /**
     * api访问公钥
     */
    @JSONField(name = "api_key")
    private String apiKey;


    /**
     * 获取appid
     *
     * @return
     */
    public String getAppid() {
        return appid;
    }


    /**
     * 设置appid
     *
     * @param appid
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }


    /**
     * 获取用户id
     *
     * @return
     */
    public String getUserid() {
        return this.userid;
    }


    /**
     * 设置用户id
     *
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }


    /**
     * 获取用户时间
     *
     * @return
     */
    public int getTimes() {
        if (this.times == 0) {
            this.times = (int) (new Date().getTime() / 1000);
        }
        return this.times;
    }


    /**
     * 设置用户时间
     */
    public void unsetTime() {
        this.times = 0;
    }


    /**
     * 获取apiKey
     * @return
     */
    public String getApiKey() {
        return apiKey;
    }


    /**
     * 设置apiKey
     * @param apiKey
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * 获取token
     *
     * @return
     */
    public String getToken(String time) {
        return md5(this.getApiKey() + "_" + this.getSecretKey() + "_" + this.getUserid() + "_" + time);
    }


    public String getSign(String addr, String memo, String usertags) {
        return md5(this.getApiKey() + "_" + this.getSecretKey() + "_" +
                this.getUserid() + "_" + this.getTimes() + "_" + addr + "_" + memo + "_" + usertags);
    }


    private static String md5(String dataStr) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(dataStr.getBytes("UTF8"));
            byte s[] = m.digest();
            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
