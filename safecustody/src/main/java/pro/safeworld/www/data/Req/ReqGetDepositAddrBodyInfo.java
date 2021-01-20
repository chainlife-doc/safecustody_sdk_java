package pro.safeworld.www.data.Req;


/**
 * ReqGetDepositAddrBodyInfo
 */
public class ReqGetDepositAddrBodyInfo {
    /**
     * 链名
     */
    private String chain = "";


    /**
     * 币名
     */
    private String coin = "";


    /**
     * 你的用户id
     */
    private String subuserid;


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
     * getSubuserid
     *
     * @return String
     */
    public String getSubuserid() {
        return subuserid;
    }


    /**
     * setSubuserid
     *
     * @param subuserid void
     */
    public void setSubuserid(String subuserid) {
        this.subuserid = subuserid;
    }
}
