package com.safecustody.sdk.data.Resp;

import com.safecustody.sdk.data.comm.RespData;

import java.util.List;

public class RespQueryWithdrawHistoryBody  extends RespData {

    private List<RespQueryWithdrawHistoryData> data ;

    public List<RespQueryWithdrawHistoryData> getData() {
        return data;
    }

    public void setData(List<RespQueryWithdrawHistoryData> data) {
        this.data = data;
    }
}
