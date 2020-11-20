package com.safecustody.sdk.data.comm;

public class RespData {

    /**
     * 错误码
     */
    private int eno;


    /**
     * 错误信息
     */
    private String emsg;

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEmsg() {
        return emsg;
    }

    public void setEmsg(String emsg) {
        this.emsg = emsg;
    }
}
