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
     * 0:不需要，1需要，填写的memo字符串格式: "userid#subuserid#id"（id是申请的appid序号）
     */
    private int needmemo;

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
}
