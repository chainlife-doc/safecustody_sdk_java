package pro.safeworld.www.data.Req;

import com.alibaba.fastjson.annotation.JSONField;
import pro.safeworld.www.data.comm.ReqData;


/**
 * ReqWithdrawCancel
 */
public class ReqWithdrawCancel extends ReqData {
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
     * 订单ID
     */
    @JSONField(name = "withdrawid")
    private long withdrawId = 0;


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
     * @return Long
     */
    public Long getWithdrawId() {
        return withdrawId;
    }


    /**
     * @param withdrawId void
     */
    public void setWithdrawId(long withdrawId) {
        this.withdrawId = withdrawId;
    }

}
