package com.safecustody.sdk.data.Req;

import com.safecustody.sdk.data.comm.ReqData;

public class ReqQueryIsInternalAddr extends ReqData {
    /**
     * 链名
     */
    private String chain="";


    /**
     * 币名
     */
    private String coin="";


    /**
     * 查询的地址
     */
    private String addr="";

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
}
