package com.safecustody.sdk.data.Req;

import com.safecustody.sdk.data.comm.ReqData;

public class ReqSubmitWithdraw extends ReqData {
    /**
     * 你的用户id
     */
    private String subuserid;


    /**
     * 链名
     */
    private String chain;


    /**
     * 币名
     */
    private String coin;


    /**
     * 提笔地址
     */
    private String addr;


    /**
     * 提币数量
     */
    private String amount;


    /**
     * 用户备注,内容自定义（会记录到区块链上）
     */
    private String memo;


    /**
     * 用户标签，内容自定义 （不会记录到区块链上）
     */
    private String usertags;


    /**
     * 提币请求签名
     */
    private String sign;

    public String getSubuserid() {
        return subuserid;
    }

    public void setSubuserid(String subuserid) {
        this.subuserid = subuserid;
    }

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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getUsertags() {
        return usertags;
    }

    public void setUsertags(String usertags) {
        this.usertags = usertags;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
