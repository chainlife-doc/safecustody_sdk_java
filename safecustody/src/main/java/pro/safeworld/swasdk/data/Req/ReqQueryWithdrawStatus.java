package pro.safeworld.swasdk.data.Req;

import pro.safeworld.swasdk.data.comm.ReqData;


/**
 * ReqQueryWithdrawStatus
 */
public class ReqQueryWithdrawStatus extends ReqData {
    /**
     * 链名
     */
    private String chain = "";


    /**
     * 币名
     */
    private String coin = "";


    /**
     * 提币订单ID
     */
    private long withdrawid = 0;


    /**
     * getChain
     * @return string
     */
    public String getChain() {
        return chain;
    }


    /**
     * setChain
     * @param chain string
     */
    public void setChain(String chain) {
        this.chain = chain;
    }


    /**
     * getCoin
     * @return string
     */
    public String getCoin() {
        return coin;
    }


    /**
     * setCoin
     * @param coin string
     */
    public void setCoin(String coin) {
        this.coin = coin;
    }


    /**
     * getWithdrawid
     * @return long
     */
    public long getWithdrawid() {
        return withdrawid;
    }


    /**
     * setWithdrawid
     * @param withdrawid long
     */
    public void setWithdrawid(long withdrawid) {
        this.withdrawid = withdrawid;
    }
}
