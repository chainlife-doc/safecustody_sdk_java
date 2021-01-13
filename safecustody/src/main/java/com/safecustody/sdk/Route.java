package com.safecustody.sdk;


import com.alibaba.fastjson.JSON;
import com.safecustody.sdk.data.Req.*;
import com.safecustody.sdk.data.Resp.*;
import com.safecustody.sdk.data.comm.Resp;
import com.safecustody.sdk.data.comm.RespData;

import java.io.IOException;
import java.util.HashSet;

public class Route extends com.safecustody.sdk.Request {


    private static final int API_SUCC_CODE = 0;

    /**
     * @param user
     */
    public Route(User user) {
        super(user);
    }


    /**
     * 单个币种查询
     *
     * @param coin
     * @return
     */
    public RespQueryCoinBody QueryCoinConf(ReqQueryCoin coin) {
        String result = this.request("coinconf.php", coin);
        RespQueryCoin res = JSON.parseObject(result, RespQueryCoin.class);
        if (res.getData().getEno() != API_SUCC_CODE) {
            res.getData().setData(null);
        }
        return res.getData();
    }


    /**
     * 查询全部币种
     *
     * @return
     * @throws IOException
     */
    public RespQueryCoinBody QueryCoin() {
        String result = this.request("info.php", new ReqQueryCoinAll());
        RespQueryCoin res = JSON.parseObject(result, RespQueryCoin.class);
        if (res.getData().getEno() != API_SUCC_CODE) {
            res.getData().setData(null);
        }
        return res.getData();
    }


    /**
     * 查询余额
     *
     * @param reqQueryBalanceBodyInfos
     * @return
     */
    public RespQueryBalanceBody QueryBalance(HashSet<ReqQueryBalanceBodyInfo> reqQueryBalanceBodyInfos) {
        ReqQueryBalance reqQueryBalance = new ReqQueryBalance();
        reqQueryBalance.setCoins(reqQueryBalanceBodyInfos);
        String result = this.request("balance.php", reqQueryBalance);
        RespQueryBalance res = JSON.parseObject(result, RespQueryBalance.class);
        if (res.getData().getEno() != API_SUCC_CODE) {
            res.getData().setData(null);
        }
        return res.getData();
    }


    /**
     * 获取充值地址
     *
     * @param reqGetDepositAddrBodyInfoHashSet
     * @return
     */
    public RespGetDepositAddrBody GetDepositAddr(HashSet<ReqGetDepositAddrBodyInfo> reqGetDepositAddrBodyInfoHashSet) {
        ReqGetDepositAddr reqGetDepositAddr = new ReqGetDepositAddr();
        reqGetDepositAddr.setCoins(reqGetDepositAddrBodyInfoHashSet);
        String result = this.request("deposit/addr.php", reqGetDepositAddr);
        RespGetDepositAddr res = JSON.parseObject(result, RespGetDepositAddr.class);
        if (res.getData().getEno() != API_SUCC_CODE) {
            res.getData().setData(null);
        }
        return res.getData();
    }


    /**
     * 获取充值记录
     *
     * @param reqGetDepositHistory
     * @return
     */
    public RespGetDepositHistoryBody GetDepositHistory(ReqGetDepositHistory reqGetDepositHistory) {
        String result = this.request("deposit/history.php", reqGetDepositHistory);
        RespGetDepositHistory res = JSON.parseObject(result, RespGetDepositHistory.class);
        if (res.getData().getEno() != API_SUCC_CODE) {
            res.getData().setData(null);
        }
        return res.getData();
    }


    /**
     * 内部地址查询
     *
     * @param reqQueryIsInternalAddr
     * @return
     */
    public RespQueryIsInternalAddrBody QueryIsInternalAddr(ReqQueryIsInternalAddr reqQueryIsInternalAddr) {
        String result = this.request("internal-addr/query.php", reqQueryIsInternalAddr);
        RespQueryIsInternalAddr res = JSON.parseObject(result, RespQueryIsInternalAddr.class);
        if (res.getData().getEno() != API_SUCC_CODE) {
            res.getData().setData(null);
        }
        return res.getData();
    }

    /**
     * 提交提币工单
     *
     * @param reqSubmitWithdraw
     * @return
     */
    public RespSubmitWithdrawBody SubmitWithdraw(ReqSubmitWithdraw reqSubmitWithdraw) {
        reqSubmitWithdraw.setSign(this.user.getSign(reqSubmitWithdraw.getAddr(), reqSubmitWithdraw.getMemo(), reqSubmitWithdraw.getUsertags(), reqSubmitWithdraw.getUserOrderid()));
        String result = this.request("withdraw/submit.php", reqSubmitWithdraw);
        RespSubmitWithdraw res = JSON.parseObject(result, RespSubmitWithdraw.class);
        if (res.getData().getEno() != API_SUCC_CODE) {
            res.getData().setData(null);
        }
        return res.getData();
    }


    /**
     * 提币预校验接口
     *
     * @param reqSubmitWithdraw
     * @return
     */
    public RespData ValidateWithdraw(ReqSubmitWithdraw reqSubmitWithdraw) {
        reqSubmitWithdraw.setSign(this.user.getSign(reqSubmitWithdraw.getAddr(), reqSubmitWithdraw.getMemo(), reqSubmitWithdraw.getUsertags(), reqSubmitWithdraw.getUserOrderid()));
        String result = this.request("withdraw/validator.php", reqSubmitWithdraw);
        Resp res = JSON.parseObject(result, Resp.class);
        return res.getData();
    }

    /**
     * 查询提币工单状态
     *
     * @param reqQueryWithdrawStatus
     * @return
     */
    public RespQueryWithdrawStatusBody QueryWithdrawStatus(ReqQueryWithdrawStatus reqQueryWithdrawStatus) {
        String result = this.request("withdraw/status.php", reqQueryWithdrawStatus);
        RespQueryWithdrawStatus res = JSON.parseObject(result, RespQueryWithdrawStatus.class);
        if (res.getData().getEno() != API_SUCC_CODE) {
            res.getData().setData(null);
        }
        return res.getData();
    }


    /**
     * 查询提币记录
     *
     * @param reqQueryWithdrawHistory
     * @return
     */
    public RespQueryWithdrawHistoryBody QueryWithdrawHistory(ReqQueryWithdrawHistory reqQueryWithdrawHistory) {
        String result = this.request("withdraw/history.php", reqQueryWithdrawHistory);
        RespQueryWithdrawHistory res = JSON.parseObject(result, RespQueryWithdrawHistory.class);
        if (res.getData().getEno() != API_SUCC_CODE) {
            res.getData().setData(null);
        }
        return res.getData();
    }


    /**
     * 取消提币接口
     *
     * @param reqWithdrawCancel
     * @return
     */
    public RespData WithdrawCancel(ReqWithdrawCancel reqWithdrawCancel) {
        String result = this.request("withdraw/cancel.php", reqWithdrawCancel);
        Resp res = JSON.parseObject(result, Resp.class);
        return res.getData();
    }

    /**
     * 查询币种节点高度
     *
     * @param reqBlockHeight
     * @return
     */
    public RespBlockHeightBody BlockHeight(ReqBlockHeight reqBlockHeight) {
        String result = this.request("blockheight.php", reqBlockHeight);
        RespBlockHeight res = JSON.parseObject(result, RespBlockHeight.class);
        if (res.getData().getEno() != API_SUCC_CODE) {
            res.getData().setData(null);
        }
        return res.getData();
    }


    public String getHost() {
        return null;
    }
}
