package com.safecustody.sdk.data.Req;

import com.safecustody.sdk.data.comm.ReqData;

import java.util.HashSet;

public class ReqGetDepositAddr extends ReqData {
    private HashSet<ReqGetDepositAddrBodyInfo> coins;

    public HashSet<ReqGetDepositAddrBodyInfo> getCoins() {
        return coins;
    }

    public void setCoins(HashSet<ReqGetDepositAddrBodyInfo> coins) {
        this.coins = coins;
    }
}
