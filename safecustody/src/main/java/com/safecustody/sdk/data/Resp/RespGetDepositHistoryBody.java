package com.safecustody.sdk.data.Resp;

import com.safecustody.sdk.data.comm.RespData;

import java.util.List;

public class RespGetDepositHistoryBody extends RespData {
    private List<RespGetDepositHistoryData> data;

    public List<RespGetDepositHistoryData> getData() {
        return data;
    }

    public void setData(List<RespGetDepositHistoryData> data) {
        this.data = data;
    }
}
