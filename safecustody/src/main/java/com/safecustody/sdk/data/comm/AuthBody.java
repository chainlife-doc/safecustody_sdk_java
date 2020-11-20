package com.safecustody.sdk.data.comm;

public class AuthBody {

    private String token;

    private int timestamp;

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
}
