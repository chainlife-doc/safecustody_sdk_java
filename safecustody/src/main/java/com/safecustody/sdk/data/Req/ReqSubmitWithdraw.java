package com.safecustody.sdk.data.Req;

import com.alibaba.fastjson.annotation.JSONField;
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
     * 该字段主要提供给链上支持备注的币种，内容会更新到链上
     */
    private String memo = "";


    /**
     * 用户标签, 自定义内容，一般作为订单备注使用,辅助说明
     */
    private String usertags="";


    /**
     * 户自定义订单ID，该字段主要是填写用户系统的订单流水号，字段具有唯一性（可选字段)
     */
    @JSONField(name = "user_orderid")
    private String userOrderid="";

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

    public String getUserOrderid() {
        return userOrderid;
    }

    public void setUserOrderid(String userOrderid) {
        this.userOrderid = userOrderid;
    }
}
