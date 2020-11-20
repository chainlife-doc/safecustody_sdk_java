package com.safecustody.sdk.data.comm;

public class Request {


    private String appid = "";

    private int cryptype = 0;

    private ReqData data;

    public String getAppid() {
        return appid;
    }

    public int getCryptype() {
        return cryptype;
    }

    public ReqData getData() {
        return data;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public void setData(ReqData data) {
        this.data = data;
    }

}
