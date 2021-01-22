package pro.safeworld.swasdk.data.Req;

import pro.safeworld.swasdk.data.comm.ReqData;

/**
 * ReqQueryWithdrawHistory
 */
public class ReqQueryWithdrawHistory extends ReqData {

    /**
     * 你的用户id
     */
    private String subuserid = "";


    /**
     * 链名
     */
    private String chain = "";


    /**
     * 币名
     */
    private String coin = "";


    /**
     * 从哪个充值序号开始，值大于等于1,查询结果包含fromId对应的充值记录
     */
    private long fromid = 1;


    /**
     * 最多查询多少条记录，包含fromid这条记录
     */
    private int limit = 50;


    /**
     * getSubuserid
     * @return String
     */
    public String getSubuserid() {
        return subuserid;
    }


    /**
     * setSubuserid
     * @param subuserid String
     */
    public void setSubuserid(String subuserid) {
        this.subuserid = subuserid;
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
     * getFromid
     * @return long
     */
    public long getFromid() {
        return fromid;
    }


    /**
     * setFromid
     * @param fromid void
     */
    public void setFromid(long fromid) {
        this.fromid = fromid;
    }

    /**
     * getLimit
     * @return int
     */
    public int getLimit() {
        return limit;
    }


    /**
     * setLimit
     * @param limit void
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }
}
