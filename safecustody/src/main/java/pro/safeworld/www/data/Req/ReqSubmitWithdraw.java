package pro.safeworld.www.data.Req;

import com.alibaba.fastjson.annotation.JSONField;
import pro.safeworld.www.data.comm.ReqData;


/**
 * ReqSubmitWithdraw
 */
public class ReqSubmitWithdraw extends ReqData {
    /**
     * 你的用户id
     */
    private String subuserid;


    /**
     * 链名
     */
    private String chain;


    /**
     * 币名
     */
    private String coin;


    /**
     * 提笔地址
     */
    private String addr;


    /**
     * 提币数量
     */
    private String amount;


    /**
     * 该字段主要提供给链上支持备注的币种，内容会更新到链上
     */
    private String memo = "";


    /**
     * 用户标签, 自定义内容，一般作为订单备注使用,辅助说明
     */
    private String usertags = "";


    /**
     * 户自定义订单ID，该字段主要是填写用户系统的订单流水号，字段具有唯一性（可选字段)
     */
    @JSONField(name = "user_orderid")
    private String userOrderid = "";

    /**
     * 提币请求签名
     */
    private String sign;


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
     * @return String
     */
    public String getAmount() {
        return amount;
    }


    /**
     * @param amount void
     */
    public void setAmount(String amount) {
        this.amount = amount;
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


    /**
     * @return String
     */
    public String getUsertags() {
        return usertags;
    }


    /**
     * @param usertags void
     */
    public void setUsertags(String usertags) {
        this.usertags = usertags;
    }


    /**
     * @return String
     */
    public String getSign() {
        return sign;
    }


    /**
     * @param sign void
     */
    public void setSign(String sign) {
        this.sign = sign;
    }


    /**
     * @return String
     */
    public String getUserOrderid() {
        return userOrderid;
    }


    /**
     * @param userOrderid void
     */
    public void setUserOrderid(String userOrderid) {
        this.userOrderid = userOrderid;
    }
}
