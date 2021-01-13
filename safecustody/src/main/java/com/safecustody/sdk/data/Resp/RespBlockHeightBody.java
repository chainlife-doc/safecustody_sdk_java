package com.safecustody.sdk.data.Resp;

import com.safecustody.sdk.data.comm.RespData;

public class RespBlockHeightBody extends RespData {
    private RespBlockHeightData data;


    public RespBlockHeightData getData() {
        return data;
    }

    public void setData(RespBlockHeightData data) {
        this.data = data;
    }
}
