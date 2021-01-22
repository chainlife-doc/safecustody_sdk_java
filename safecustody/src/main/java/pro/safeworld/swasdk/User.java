package pro.safeworld.swasdk;

import com.alibaba.fastjson.annotation.JSONField;

import java.security.MessageDigest;
import java.util.Date;

/**
 * 用户类
 */
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
     * @return String
     */
    public String getAppid() {
        return appid;
    }


    /**
     * 设置appid
     *
     * @param appid String
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }


    /**
     * 获取用户id
     *
     * @return String
     */
    public String getUserid() {
        return this.userid;
    }


    /**
     * 设置用户id
     *
     * @param userid String
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }


    /**
     * 获取用户时间
     *
     * @return int
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
     *
     * @return String
     */
    public String getApiKey() {
        return apiKey;
    }


    /**
     * 设置apiKey
     *
     * @param apiKey String
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * 获取token
     *
     * @param time String
     * @return String
     */
    public String getToken(String time) {
        return md5(this.getApiKey() + "_" + this.getSecretKey() + "_" + this.getUserid() + "_" + time);
    }


    /**
     * @param addr           String
     * @param memo           String
     * @param usertags       String
     * @param getUserOrderid String
     * @return String
     */
    public String getSign(String addr, String memo, String usertags, String getUserOrderid) {

        String str = "";

        if (!getUserOrderid.equals("")) {
            str = "_" + getUserOrderid;
        }

        return md5(this.getApiKey() + "_" + this.getSecretKey() + "_" +
                this.getUserid() + "_" + this.getTimes() + "_" + addr + "_" + memo + "_" + usertags + str);
    }


    /**
     * @param dataStr String
     * @return String
     */
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


    /**
     * @return String
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * @param secretKey String
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
