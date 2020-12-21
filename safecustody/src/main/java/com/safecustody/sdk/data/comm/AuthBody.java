package com.safecustody.sdk.data.comm;

import com.alibaba.fastjson.annotation.JSONField;

public class AuthBody {

    private String token;

    private int timestamp;

    @JSONField(name = "api_key")
    private String apiKey;

    public String getToken() {
        return token;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
