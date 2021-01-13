package com.safecustody.sdk.data.Req;

import com.safecustody.sdk.data.comm.ReqData;

public class ReqBlockHeight  extends ReqData {
    private String coin = "";

    private String chain = "";

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }
}
