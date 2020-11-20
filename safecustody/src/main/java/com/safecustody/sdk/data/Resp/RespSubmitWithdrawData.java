package com.safecustody.sdk.data.Resp;

import com.alibaba.fastjson.annotation.JSONField;

public class RespSubmitWithdrawData {
    /**
     * 序号
     */
    private long id;


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
     * 提币发送地址
     */
    @JSONField(name = "from_addr")
    private String fromAddr;


    /**
     * 提币接收地址
     */
    private String addr;


    /**
     * 实际发送的提币数量
     */
    @JSONField(name = "amount_sent")
    private String amountSent;


    /**
     * 扣减资金
     */
    @JSONField(name = "sub_balance")
    private String subBalance;


    /**
     * 提币备注，比如用户ID之类的，可以是任意内容
     */
    private String memo;


    /**
     * 提币状态: 1=准备发送,2=发送中,3=发送成功,4=发送失败,5=发送已取消
     */
    private int status;


    /**
     * 状态描述
     */
    @JSONField(name = "status_desc")
    private String statusDesc;


    /**
     * 链上的交易ID
     */
    private String txid;


    /**
     * 用户标签
     */
    private String usertags;


    /**
     * 订单创建时间
     */
    private String time;


    /**
     * 手续费币种的链名
     */
    @JSONField(name = "fee_coin_chain")
    private String feeCoinCain;


    /**
     * 手续费币种
     */
    @JSONField(name = "fee_coin")
    private String feeCoin;


    /**
     * 手续费数量
     */
    @JSONField(name = "fee_amount")
    private String feeAmount;

    public String getFeeCoin() {
        return feeCoin;
    }

    public void setFeeCoin(String feeCoin) {
        this.feeCoin = feeCoin;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFeeCoinCain() {
        return feeCoinCain;
    }

    public void setFeeCoinCain(String feeCoinCain) {
        this.feeCoinCain = feeCoinCain;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getFromAddr() {
        return fromAddr;
    }

    public void setFromAddr(String fromAddr) {
        this.fromAddr = fromAddr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAmountSent() {
        return amountSent;
    }

    public void setAmountSent(String amountSent) {
        this.amountSent = amountSent;
    }

    public String getSubBalance() {
        return subBalance;
    }

    public void setSubBalance(String subBalance) {
        this.subBalance = subBalance;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getUsertags() {
        return usertags;
    }

    public void setUsertags(String usertags) {
        this.usertags = usertags;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
