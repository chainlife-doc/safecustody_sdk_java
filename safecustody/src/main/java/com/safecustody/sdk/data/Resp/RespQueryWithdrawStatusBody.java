package com.safecustody.sdk.data.Resp;

import com.safecustody.sdk.data.comm.RespData;

public class RespQueryWithdrawStatusBody extends RespData {

    private RespQueryWithdrawStatusData data;

    public RespQueryWithdrawStatusData getData() {
        return data;
    }

    public void setData(RespQueryWithdrawStatusData data) {
        this.data = data;
    }
}
