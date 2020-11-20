package com.safecustody.sdk.data.Req;

import com.safecustody.sdk.data.comm.ReqData;

import java.util.HashSet;

public class ReqQueryBalance extends ReqData {
    private HashSet<ReqQueryBalanceBodyInfo> coins;

    public HashSet<ReqQueryBalanceBodyInfo> getCoins() {
        return coins;
    }

    public void setCoins(HashSet<ReqQueryBalanceBodyInfo> coin) {
        this.coins = coin;
    }
}
