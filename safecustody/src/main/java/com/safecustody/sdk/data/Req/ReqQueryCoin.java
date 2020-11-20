package com.safecustody.sdk.data.Req;

import com.safecustody.sdk.data.comm.ReqData;

public class ReqQueryCoin extends ReqData {
    /**
     * 币名
     */
    private String coin;

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }
}
