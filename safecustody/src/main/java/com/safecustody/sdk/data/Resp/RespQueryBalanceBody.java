package com.safecustody.sdk.data.Resp;

import com.safecustody.sdk.data.comm.RespData;

import java.util.List;

public class RespQueryBalanceBody extends RespData {
    private List<RespQueryBalanceData> data;

    public List<RespQueryBalanceData> getData() {
        return data;
    }

    public void setData(List<RespQueryBalanceData> data) {
        this.data = data;
    }
}
