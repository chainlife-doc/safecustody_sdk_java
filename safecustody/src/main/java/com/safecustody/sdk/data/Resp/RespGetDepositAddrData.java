package com.safecustody.sdk.data.Resp;

public class RespGetDepositAddrData {
    /**
     * 链名
     */
    private String chain;


    /**
     * 币名
     */
    private String coin;


    /**
     * 你的用户id
     */
    private String subuserid;


    /**
     * 地址
     */
    private String addr;


    /**
     * 0:不需要，1需要
     */
    private int needmemo;


    /**
     * 如果充值需要填写备注，这个字段会列出需要的备注
     */
    private String memo;

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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getNeedmemo() {
        return needmemo;
    }

    public void setNeedmemo(int needmemo) {
        this.needmemo = needmemo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
