package pro.safeworld.swasdk.data.Resp;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * RespQueryBalanceData
 */
public class RespQueryBalanceData {
    /**
     * 链名
     */
    private String chain;


    /**
     * 币名
     */
    private String coin;


    /**
     * 余额数量
     */
    private String balance;

    /**
     * 余额以cnc为单位表示的数量
     */
    @JSONField(name = "as_cny")
    private String asCny;


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
    public String getBalance() {
        return balance;
    }


    /**
     * @param balance String
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }


    /**
     * @return string
     */
    public String getAsCny() {
        return asCny;
    }


    /**
     * @param asCny String
     */
    public void setAsCny(String asCny) {
        this.asCny = asCny;
    }
}
