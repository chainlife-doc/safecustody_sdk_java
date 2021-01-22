package pro.safeworld.swasdk.data.Resp;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * RespGetDepositHistoryData
 */
public class RespGetDepositHistoryData {
    /**
     * 内部充值序号
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
     * 订单发送地址
     */
    @JSONField(name = "from_addr")
    private String fromAddr;


    /**
     * api访问公钥
     */
    @JSONField(name = "api_key")
    private String apiKey;

    /**
     * 订单接收地址
     */
    private String addr;


    /**
     * 交易ID
     */
    private String txid;


    /**
     * 充值数量
     */
    private String amount;


    /**
     * 充值后余额
     */
    private String balance;


    /**
     * @return String
     */
    public String getHeight() {
        return height;
    }


    /**
     * @param height void
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * height
     */
    private String height = "";

    /**
     * 订单生成时间
     */
    private String time;


    /**
     * status
     */
    private int status;


    /**
     * @return int
     */
    public int getStatus() {
        return status;
    }


    /**
     * @param status void
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * @return String
     */
    public String getStatus_desc() {
        return status_desc;
    }


    /**
     * @param status_desc void
     */
    public void setStatus_desc(String status_desc) {
        this.status_desc = status_desc;
    }


    /**
     * status_desc
     */
    private String status_desc;


    /**
     * @return long
     */
    public long getId() {
        return id;
    }


    /**
     * @param id void
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
    public String getFromAddr() {
        return fromAddr;
    }

    /**
     * @param fromAddr void
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
     * @param addr void
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }


    /**
     * @return String
     */
    public String getTxid() {
        return txid;
    }


    /**
     * @param txid void
     */
    public void setTxid(String txid) {
        this.txid = txid;
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
    public String getBalance() {
        return balance;
    }


    /**
     * @param balance void
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }


    /**
     * @return String
     */
    public String getTime() {
        return time;
    }


    /**
     * @param time void
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
     * @param apiKey void
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
