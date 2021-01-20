package pro.safeworld.www.data.Req;

import pro.safeworld.www.data.comm.ReqData;

import java.util.HashSet;

/**
 * ReqQueryBalance
 */
public class ReqQueryBalance extends ReqData {

    /**
     * coins
     */
    private HashSet<ReqQueryBalanceBodyInfo> coins;


    /**
     * getCoins
     * @return ReqQueryBalanceBodyInfo
     */
    public HashSet<ReqQueryBalanceBodyInfo> getCoins() {
        return coins;
    }


    /**
     * setCoins
     * @param coin void
     */
    public void setCoins(HashSet<ReqQueryBalanceBodyInfo> coin) {
        this.coins = coin;
    }
}
