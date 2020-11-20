package com.safecustody.sdk.data.Resp;

import com.safecustody.sdk.data.comm.RespData;

import java.util.List;

public class RespQueryCoinBody extends RespData {

    private List<RespQueryCoinData> data;

    public List<RespQueryCoinData> getData() {
        return data;
    }

    public void setData(List<RespQueryCoinData> data) {
        this.data = data;
    }
}

