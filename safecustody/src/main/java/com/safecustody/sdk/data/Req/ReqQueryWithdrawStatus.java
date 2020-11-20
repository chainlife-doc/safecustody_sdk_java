package com.safecustody.sdk.data.Req;

import com.safecustody.sdk.data.comm.ReqData;

public class ReqQueryWithdrawStatus extends ReqData {
    /**
     * 链名
     */
    private String chain;


    /**
     * 币名
     */
    private String coin;


    /**
     * 提币订单ID
     */
    private long withdrawid;

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

    public long getWithdrawid() {
        return withdrawid;
    }

    public void setWithdrawid(long withdrawid) {
        this.withdrawid = withdrawid;
    }
}
