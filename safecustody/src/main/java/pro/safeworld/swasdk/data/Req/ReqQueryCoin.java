package pro.safeworld.swasdk.data.Req;

import pro.safeworld.swasdk.data.comm.ReqData;


/**
 * ReqQueryCoin
 */
public class ReqQueryCoin extends ReqData {
    /**
     * 币名
     */
    private String coin = "";


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
}
