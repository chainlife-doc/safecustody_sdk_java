package pro.safeworld.www.data.Req;

import pro.safeworld.www.data.comm.ReqData;


/**
 * ReqQueryBalanceBodyInfo
 */
public class ReqQueryBalanceBodyInfo extends ReqData {
    /**
     * 链名
     */
    private String chain="";


    /**
     * 币名
     */
    private String coin="";


    /**
     * getChain
     * @return String
     */
    public String getChain() {
        return chain;
    }


    /**
     * setChain
     * @param chain void
     */
    public void setChain(String chain) {
        this.chain = chain;
    }


    /**
     * getCoin
     * @return String
     */
    public String getCoin() {
        return coin;
    }


    /**
     * setCoin
     * @param coin void
     */
    public void setCoin(String coin) {
        this.coin = coin;
    }
}
