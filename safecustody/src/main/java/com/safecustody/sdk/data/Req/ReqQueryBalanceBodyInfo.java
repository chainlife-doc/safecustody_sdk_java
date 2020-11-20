package com.safecustody.sdk.data.Req;

import com.safecustody.sdk.data.comm.ReqData;

import java.util.HashSet;

public class ReqQueryBalanceBodyInfo extends ReqData {
    /**
     * 链名
     */
    private String chain;


    /**
     * 币名
     */
    private String coin;

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }
}
