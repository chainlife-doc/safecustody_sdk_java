package pro.safeworld.www.data.Resp;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * RespSubmitWithdrawData
 */
public class RespSubmitWithdrawData {
    /**
     * 序号
     */
    private long id;


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
     * 提币发送地址
     */
    @JSONField(name = "from_addr")
    private String fromAddr;


    /**
     * 提币接收地址
     */
    private String addr;


    /**
     * 实际发送的提币数量
     */
    @JSONField(name = "amount_sent")
    private String amountSent;


    /**
     * 扣减资金
     */
    @JSONField(name = "sub_balance")
    private String subBalance;


    /**
     * 该字段主要提供给链上支持备注的币种，内容会更新到链上
     */
    private String memo;


    /**
     * 提币状态: 0=无效状态,1=准备发送,2=发送中,3=发送成功,4=发送失败,5=待确认
     */
    private int status;


    /**
     * 状态描述
     */
    @JSONField(name = "status_desc")
    private String statusDesc;


    /**
     * 链上的交易ID
     */
    private String txid;


    /**
     * 用户标签
     */
    private String usertags;


    /**
     * 订单创建时间
     */
    private String time;


    /**
     * 用户系统流水号ID
     */
    @JSONField(name = "user_orderid")
    private String userOrderid;


    /**
     * 手续费币种的链名
     */
    @JSONField(name = "fee_coin_chain")
    private String feeCoinCain;


    /**
     * 手续费币种
     */
    @JSONField(name = "fee_coin")
    private String feeCoin;

    /**
     * api访问公钥
     */
    @JSONField(name = "api_key")
    private String apiKey;


    /**
     * 手续费的链名
     */
    @JSONField(name = "fee_coin_chain")
    private String feeCoinChain;

    /**
     * 手续费数量
     */
    @JSONField(name = "fee_amount")
    private String feeAmount;


    /**
     * @return String
     */
    public String getFeeCoin() {
        return feeCoin;
    }


    /**
     * @param feeCoin String
     */
    public void setFeeCoin(String feeCoin) {
        this.feeCoin = feeCoin;
    }


    /**
     * @return String
     */
    public String getFeeAmount() {
        return feeAmount;
    }


    /**
     * @param feeAmount String
     */
    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * @return String
     */
    public String getFeeCoinCain() {
        return feeCoinCain;
    }


    /**
     * @param feeCoinCain String
     */
    public void setFeeCoinCain(String feeCoinCain) {
        this.feeCoinCain = feeCoinCain;
    }

    /**
     * @return long
     */
    public long getId() {
        return id;
    }


    /**
     * @param id long
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * @return String
     */
    public String getSubuserid() {
        return subuserid;
    }


    /**
     * @param subuserid String
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
     * @param chain String
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
     * @param coin String
     */
    public void setCoin(String coin) {
        this.coin = coin;
    }


    /**
     * @return String
     */
    public String getFromAddr() {
        return fromAddr;
    }


    /**
     * @param fromAddr String
     */
    public void setFromAddr(String fromAddr) {
        this.fromAddr = fromAddr;
    }


    /**
     * @return String
     */
    public String getAddr() {
        return addr;
    }


    /**
     * @param addr String
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * @return String
     */
    public String getAmountSent() {
        return amountSent;
    }


    /**
     * @param amountSent String
     */
    public void setAmountSent(String amountSent) {
        this.amountSent = amountSent;
    }


    /**
     * @return String
     */
    public String getSubBalance() {
        return subBalance;
    }


    /**
     * @param subBalance String
     */
    public void setSubBalance(String subBalance) {
        this.subBalance = subBalance;
    }


    /**
     * @return String
     */
    public String getMemo() {
        return memo;
    }


    /**
     * @param memo String
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return int
     */
    public int getStatus() {
        return status;
    }


    /**
     * @param status int
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * @return String
     */
    public String getStatusDesc() {
        return statusDesc;
    }


    /**
     * @param statusDesc String
     */
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }


    /**
     * @return String
     */
    public String getTxid() {
        return txid;
    }


    /**
     * @param txid String
     */
    public void setTxid(String txid) {
        this.txid = txid;
    }


    /**
     * @return String
     */
    public String getUsertags() {
        return usertags;
    }


    /**
     * @param usertags String
     */
    public void setUsertags(String usertags) {
        this.usertags = usertags;
    }


    /**
     * @return String
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time String
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return String
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * @param apiKey String
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * @return String
     */
    public String getUserOrderid() {
        return userOrderid;
    }


    /**
     * @param userOrderid String
     */
    public void setUserOrderid(String userOrderid) {
        this.userOrderid = userOrderid;
    }


    /**
     * @return String
     */
    public String getFeeCoinChain() {
        return feeCoinChain;
    }


    /**
     * @param feeCoinChain String
     */
    public void setFeeCoinChain(String feeCoinChain) {
        this.feeCoinChain = feeCoinChain;
    }
}
