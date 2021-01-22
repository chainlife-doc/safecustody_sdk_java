package pro.safeworld.swasdk.data.Resp;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * RespQueryCoinData
 */
public class RespQueryCoinData {
    /**
     * 链名
     */
    private String chain;


    /**
     * 币名
     */
    private String coin;


    /**
     * 币的精度,也就是该币支持多少位小数
     */
    @JSONField(name = "coin_precision")
    private int coinPrecision;

    /**
     * 最小充值数量
     */

    @JSONField(name = "min_deposit_amount")
    private String minDepositAmount;


    /**
     * 最小提币数量
     */
    @JSONField(name = "min_withdraw_amount")
    private String minWithdrawAmount;


    /**
     * 充值是否启用: 1=启用,0=未启用
     */
    @JSONField(name = "deposit_enabled")
    private int depositEnabled;


    /**
     * 提币是否启用: 1=启用,0=未启用
     */
    @JSONField(name = "withdraw_enabled")
    private int withdrawEnabled;

    /**
     * 充值入账确认数
     */
    @JSONField(name = "deposit_confirm_count")
    private int depositConfirmCount;


    /**
     * 充值是否需要备注: 1=充值需要备注,0=充值不需要备注
     */
    @JSONField(name = "need_memo")
    private long needMemo;


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
     * @return int
     */
    public int getCoinPrecision() {
        return coinPrecision;
    }


    /**
     * @param coinPrecision int
     */
    public void setCoinPrecision(int coinPrecision) {
        this.coinPrecision = coinPrecision;
    }


    /**
     * @return String
     */
    public String getMinDepositAmount() {
        return minDepositAmount;
    }


    /**
     * @param minDepositAmount String
     */
    public void setMinDepositAmount(String minDepositAmount) {
        this.minDepositAmount = minDepositAmount;
    }


    /**
     * @return String
     */
    public String getMinWithdrawAmount() {
        return minWithdrawAmount;
    }


    /**
     * @param minWithdrawAmount String
     */
    public void setMinWithdrawAmount(String minWithdrawAmount) {
        this.minWithdrawAmount = minWithdrawAmount;
    }


    /**
     * @return int
     */
    public int getDepositEnabled() {
        return depositEnabled;
    }


    /**
     * @param depositEnabled int
     */
    public void setDepositEnabled(int depositEnabled) {
        this.depositEnabled = depositEnabled;
    }


    /**
     * @return int
     */
    public int getWithdrawEnabled() {
        return withdrawEnabled;
    }

    /**
     * @param withdrawEnabled int
     */
    public void setWithdrawEnabled(int withdrawEnabled) {
        this.withdrawEnabled = withdrawEnabled;
    }


    /**
     * @return int
     */
    public int getDepositConfirmCount() {
        return depositConfirmCount;
    }

    /**
     * @param depositConfirmCount int
     */
    public void setDepositConfirmCount(int depositConfirmCount) {
        this.depositConfirmCount = depositConfirmCount;
    }

    /**
     * @return long
     */
    public long getNeedMemo() {
        return needMemo;
    }

    /**
     * @param needMemo long
     */
    public void setNeedMemo(long needMemo) {
        this.needMemo = needMemo;
    }
}
