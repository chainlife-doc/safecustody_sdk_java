package pro.safeworld.www.data.Req;

import pro.safeworld.www.data.comm.ReqData;

/**
 * ReqBlockHeight
 */
public class ReqBlockHeight  extends ReqData {
    /**
     * coin
     */
    private String coin = "";


    /**
     * chain
     */
    private String chain = "";


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
}
