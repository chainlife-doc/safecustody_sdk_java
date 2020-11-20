package com.safecustody.sdk.data.Resp;

public class RespQueryIsInternalAddrData {

    /**
     * 1：是内部地址，0：非内部地址
     */
    private int exist;

    public int getExist() {
        return exist;
    }

    public void setExist(int exist) {
        this.exist = exist;
    }
}
