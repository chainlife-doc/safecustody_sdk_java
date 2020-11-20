package com.safecustody.sdk.data.Resp;

import com.safecustody.sdk.data.comm.RespData;

public class RespSubmitWithdrawBody extends RespData {
    private RespSubmitWithdrawData data;

    public RespSubmitWithdrawData getData() {
        return data;
    }

    public void setData(RespSubmitWithdrawData data) {
        this.data = data;
    }
}
