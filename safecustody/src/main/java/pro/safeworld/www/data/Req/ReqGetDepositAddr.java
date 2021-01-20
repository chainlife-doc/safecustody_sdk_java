package pro.safeworld.www.data.Req;

import pro.safeworld.www.data.comm.ReqData;

import java.util.HashSet;


/**
 * ReqGetDepositAddr
 */
public class ReqGetDepositAddr extends ReqData {

    /**
     * coins
     */
    private HashSet<ReqGetDepositAddrBodyInfo> coins;


    /**
     * getCoins
     * @return ReqGetDepositAddrBodyInfo
     */
    public HashSet<ReqGetDepositAddrBodyInfo> getCoins() {
        return coins;
    }


    /**
     * setCoins
     * @param coins void
     */
    public void setCoins(HashSet<ReqGetDepositAddrBodyInfo> coins) {
        this.coins = coins;
    }
}
