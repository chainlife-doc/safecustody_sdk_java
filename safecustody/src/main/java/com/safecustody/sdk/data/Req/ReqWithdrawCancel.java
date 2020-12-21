package com.safecustody.sdk.data.Req;

import com.alibaba.fastjson.annotation.JSONField;
import com.safecustody.sdk.data.comm.ReqData;

public class ReqWithdrawCancel extends ReqData {
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
     * 订单ID
     */
    @JSONField(name = "withdrawid")
    private long withdrawId;


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

    public Long getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(long withdrawId) {
        this.withdrawId = withdrawId;
    }

}
