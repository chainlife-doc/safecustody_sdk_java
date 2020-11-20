package com.safecustody.sdk.data.Resp;

import com.safecustody.sdk.data.comm.RespData;

public class RespQueryIsInternalAddrBody extends RespData {
    private RespQueryIsInternalAddrData data;

    public RespQueryIsInternalAddrData getData() {
        return data;
    }

    public void setData(RespQueryIsInternalAddrData data) {
        this.data = data;
    }
}
