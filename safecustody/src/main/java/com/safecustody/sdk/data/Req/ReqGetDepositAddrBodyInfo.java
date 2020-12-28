package com.safecustody.sdk.data.Req;

public class ReqGetDepositAddrBodyInfo {
    /**
     * 链名
     */
    private String chain = "";


    /**
     * 币名
     */
    private String coin = "";


    /**
     * 你的用户id
     */
    private String subuserid;

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

    public String getSubuserid() {
        return subuserid;
    }

    public void setSubuserid(String subuserid) {
        this.subuserid = subuserid;
    }
}
