package com.safecustody.sdk.data.Resp;

import com.safecustody.sdk.data.comm.RespData;

import java.util.List;

public class RespGetDepositAddrBody extends RespData {
    private List<RespGetDepositAddrData> data;

    public List<RespGetDepositAddrData> getData() {
        return data;
    }

    public void setData(List<RespGetDepositAddrData> data) {
        this.data = data;
    }
}
