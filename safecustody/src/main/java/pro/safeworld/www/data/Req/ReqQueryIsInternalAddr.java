package pro.safeworld.www.data.Req;

import pro.safeworld.www.data.comm.ReqData;


/**
 * ReqQueryIsInternalAddr
 */
public class ReqQueryIsInternalAddr extends ReqData {
    /**
     * 链名
     */
    private String chain = "";


    /**
     * 币名
     */
    private String coin = "";


    /**
     * 查询的地址
     */
    private String addr = "";


    /**
     * getChain
     *
     * @return String
     */
    public String getChain() {
        return chain;
    }


    /**
     * setChain
     *
     * @param chain void
     */
    public void setChain(String chain) {
        this.chain = chain;
    }

    /**
     * getCoin
     *
     * @return String
     */
    public String getCoin() {
        return coin;
    }

    /**
     * setCoin
     *
     * @param coin void
     */
    public void setCoin(String coin) {
        this.coin = coin;
    }

    /**
     * getAddr
     *
     * @return String
     */
    public String getAddr() {
        return addr;
    }

    /**
     * setAddr
     * @param addr void
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }
}
