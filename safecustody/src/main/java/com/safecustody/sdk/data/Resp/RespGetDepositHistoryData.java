package com.safecustody.sdk.data.Resp;

import com.alibaba.fastjson.annotation.JSONField;

public class RespGetDepositHistoryData {
    /**
     * 内部充值序号
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
     * 订单发送地址
     */
    @JSONField(name = "from_addr")
    private String fromAddr;


    /**
     * api访问公钥
     */
    @JSONField(name = "api_key")
    private String apiKey;

    /**
     * 订单接收地址
     */
    private String addr;


    /**
     * 交易ID
     */
    private String txid;


    /**
     * 充值数量
     */
    private String amount;


    /**
     * 充值后余额
     */
    private String balance;


    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    private String height="";

    /**
     * 订单生成时间
     */
    private String time;

    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus_desc() {
        return status_desc;
    }

    public void setStatus_desc(String status_desc) {
        this.status_desc = status_desc;
    }

    private String status_desc;

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

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
