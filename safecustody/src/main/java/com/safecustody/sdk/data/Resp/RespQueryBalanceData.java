package com.safecustody.sdk.data.Resp;

import com.alibaba.fastjson.annotation.JSONField;

public class RespQueryBalanceData {
    /**
     * 链名
     */
    private String chain;


    /**
     * 币名
     */
    private String coin;


    /**
     * 余额数量
     */
    private String balance;

    /**
     * 余额以cnc为单位表示的数量
     */
    @JSONField(name = "as_cny")
    private String asCny;

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

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getAsCny() {
        return asCny;
    }

    public void setAsCny(String asCny) {
        this.asCny = asCny;
    }
}
