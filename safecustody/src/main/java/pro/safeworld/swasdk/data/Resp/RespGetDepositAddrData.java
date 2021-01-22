package pro.safeworld.swasdk.data.Resp;


/**
 * RespGetDepositAddrData
 */
public class RespGetDepositAddrData {
    /**
     * 链名
     */
    private String chain;


    /**
     * 币名
     */
    private String coin;


    /**
     * 你的用户id
     */
    private String subuserid;


    /**
     * 地址
     */
    private String addr;


    /**
     * 0:不需要，1需要
     */
    private int needmemo;


    /**
     * 如果充值需要填写备注，这个字段会列出需要的备注
     */
    private String memo;


    /**
     * @return String
     */
    public String getChain() {
        return chain;
    }


    /**
     * @param chain void
     */
    public void setChain(String chain) {
        this.chain = chain;
    }


    /**
     * @return String
     */
    public String getCoin() {
        return coin;
    }


    /**
     * @param coin void
     */
    public void setCoin(String coin) {
        this.coin = coin;
    }


    /**
     * @return String
     */
    public String getSubuserid() {
        return subuserid;
    }

    /**
     * @param subuserid void
     */
    public void setSubuserid(String subuserid) {
        this.subuserid = subuserid;
    }


    /**
     * @return String
     */
    public String getAddr() {
        return addr;
    }


    /**
     * @param addr void
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }


    /**
     * @return int
     */
    public int getNeedmemo() {
        return needmemo;
    }


    /**
     * @param needmemo void
     */
    public void setNeedmemo(int needmemo) {
        this.needmemo = needmemo;
    }


    /**
     * @return String
     */
    public String getMemo() {
        return memo;
    }


    /**
     * @param memo void
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
}
