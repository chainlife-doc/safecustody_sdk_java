package com.safecustody.sdk.data.Resp;

import com.alibaba.fastjson.annotation.JSONField;

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


    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public int getCoinPrecision() {
        return coinPrecision;
    }

    public void setCoinPrecision(int coinPrecision) {
        this.coinPrecision = coinPrecision;
    }

    public String getMinDepositAmount() {
        return minDepositAmount;
    }

    public void setMinDepositAmount(String minDepositAmount) {
        this.minDepositAmount = minDepositAmount;
    }

    public String getMinWithdrawAmount() {
        return minWithdrawAmount;
    }

    public void setMinWithdrawAmount(String minWithdrawAmount) {
        this.minWithdrawAmount = minWithdrawAmount;
    }

    public int getDepositEnabled() {
        return depositEnabled;
    }

    public void setDepositEnabled(int depositEnabled) {
        this.depositEnabled = depositEnabled;
    }

    public int getWithdrawEnabled() {
        return withdrawEnabled;
    }

    public void setWithdrawEnabled(int withdrawEnabled) {
        this.withdrawEnabled = withdrawEnabled;
    }

    public int getDepositConfirmCount() {
        return depositConfirmCount;
    }

    public void setDepositConfirmCount(int depositConfirmCount) {
        this.depositConfirmCount = depositConfirmCount;
    }

    public long getNeedMemo() {
        return needMemo;
    }

    public void setNeedMemo(long needMemo) {
        this.needMemo = needMemo;
    }
}
