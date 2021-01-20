package pro.safeworld.www.data.comm;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * authBody
 */
public class AuthBody {

    /**
     * token
     */
    private String token;

    /**
     * timestamp
     */
    private int timestamp;

    /**
     * apiKey
     */
    @JSONField(name = "api_key")
    private String apiKey;

    /**
     * getToken
     * @return String
     */
    public String getToken() {
        return token;
    }

    /**
     * getTimestamp
     * @return int
     */
    public int getTimestamp() {
        return timestamp;
    }

    /**
     * setToken
     * @param token void
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * setTimestamp
     * @param timestamp void
     */
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * getApiKey
     * @return String
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * setApiKey
     * @param apiKey void
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
