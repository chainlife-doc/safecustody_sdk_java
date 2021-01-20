package pro.safeworld.www;


import com.alibaba.fastjson.JSON;
import pro.safeworld.www.data.Req.*;
import pro.safeworld.www.data.comm.Resp;
import pro.safeworld.www.data.comm.RespData;
import pro.safeworld.www.data.Resp.*;

import java.io.IOException;
import java.util.HashSet;

/**
 * 路由
 */
public class Route extends Request {


    /**
     * int
     */
    private static final int API_SUCC_CODE = 0;

    /**
     * int
     */
    private static final int SDK_ERROE = -1;

    /**
     * @param user User
     */
    public Route(User user) {
        super(user);
    }


    /**
     * 单个币种查询
     *
     * @param coin ReqQueryCoin
     * @return RespQueryCoinBody
     */
    public RespQueryCoinBody QueryCoinConf(ReqQueryCoin coin) {
        try {
            String result = this.request("coinconf.php", coin);
            RespQueryCoin res = JSON.parseObject(result, RespQueryCoin.class);
            if (res.getData().getEno() != API_SUCC_CODE) {
                res.getData().setData(null);
            }
            return res.getData();
        } catch (Exception e) {
            RespQueryCoinBody data = new RespQueryCoinBody();
            data.setEmsg(e.getMessage());
            data.setEno(SDK_ERROE);
            return data;
        }
    }


    /**
     * 查询全部币种
     *
     * @return RespQueryCoinBody
     */
    public RespQueryCoinBody QueryCoin() {
        try {
            String result = this.request("info.php", new ReqQueryCoinAll());
            RespQueryCoin res = JSON.parseObject(result, RespQueryCoin.class);
            if (res.getData().getEno() != API_SUCC_CODE) {
                res.getData().setData(null);
            }
            return res.getData();
        } catch (Exception e) {
            RespQueryCoinBody data = new RespQueryCoinBody();
            data.setEmsg(e.getMessage());
            data.setEno(SDK_ERROE);
            return data;
        }
    }


    /**
     * 查询余额
     *
     * @param reqQueryBalanceBodyInfos ReqQueryBalanceBodyInfo
     * @return RespQueryBalanceBody
     */
    public RespQueryBalanceBody QueryBalance(HashSet<ReqQueryBalanceBodyInfo> reqQueryBalanceBodyInfos) {
        try {
            ReqQueryBalance reqQueryBalance = new ReqQueryBalance();
            reqQueryBalance.setCoins(reqQueryBalanceBodyInfos);
            String result = this.request("balance.php", reqQueryBalance);
            RespQueryBalance res = JSON.parseObject(result, RespQueryBalance.class);
            if (res.getData().getEno() != API_SUCC_CODE) {
                res.getData().setData(null);
            }
            return res.getData();
        } catch (Exception e) {
            RespQueryBalanceBody data = new RespQueryBalanceBody();
            data.setEmsg(e.getMessage());
            data.setEno(SDK_ERROE);
            return data;
        }
    }


    /**
     * 获取充值地址
     *
     * @param reqGetDepositAddrBodyInfoHashSet ReqGetDepositAddrBodyInfo
     * @return RespGetDepositAddrBody
     */
    public RespGetDepositAddrBody GetDepositAddr(HashSet<ReqGetDepositAddrBodyInfo> reqGetDepositAddrBodyInfoHashSet) {
        try {
            ReqGetDepositAddr reqGetDepositAddr = new ReqGetDepositAddr();
            reqGetDepositAddr.setCoins(reqGetDepositAddrBodyInfoHashSet);
            String result = this.request("deposit/addr.php", reqGetDepositAddr);
            RespGetDepositAddr res = JSON.parseObject(result, RespGetDepositAddr.class);
            if (res.getData().getEno() != API_SUCC_CODE) {
                res.getData().setData(null);
            }
            return res.getData();
        } catch (Exception e) {
            RespGetDepositAddrBody data = new RespGetDepositAddrBody();
            data.setEmsg(e.getMessage());
            data.setEno(SDK_ERROE);
            return data;
        }
    }


    /**
     * 获取充值记录
     *
     * @param reqGetDepositHistory ReqGetDepositHistory
     * @return RespGetDepositHistoryBody
     */
    public RespGetDepositHistoryBody GetDepositHistory(ReqGetDepositHistory reqGetDepositHistory) {
        try {
            String result = this.request("deposit/history.php", reqGetDepositHistory);
            RespGetDepositHistory res = JSON.parseObject(result, RespGetDepositHistory.class);
            if (res.getData().getEno() != API_SUCC_CODE) {
                res.getData().setData(null);
            }
            return res.getData();
        } catch (Exception e) {
            RespGetDepositHistoryBody data = new RespGetDepositHistoryBody();
            data.setEmsg(e.getMessage());
            data.setEno(SDK_ERROE);
            return data;
        }
    }


    /**
     * 内部地址查询
     *
     * @param reqQueryIsInternalAddr ReqQueryIsInternalAddr
     * @return RespQueryIsInternalAddrBody
     */
    public RespQueryIsInternalAddrBody QueryIsInternalAddr(ReqQueryIsInternalAddr reqQueryIsInternalAddr) {
        try {
            String result = this.request("internal-addr/query.php", reqQueryIsInternalAddr);
            RespQueryIsInternalAddr res = JSON.parseObject(result, RespQueryIsInternalAddr.class);
            if (res.getData().getEno() != API_SUCC_CODE) {
                res.getData().setData(null);
            }
            return res.getData();
        } catch (Exception e) {
            RespQueryIsInternalAddrBody data = new RespQueryIsInternalAddrBody();
            data.setEmsg(e.getMessage());
            data.setEno(SDK_ERROE);
            return data;
        }
    }

    /**
     * 提交提币工单
     *
     * @param reqSubmitWithdraw ReqSubmitWithdraw
     * @return RespSubmitWithdrawBody
     */
    public RespSubmitWithdrawBody SubmitWithdraw(ReqSubmitWithdraw reqSubmitWithdraw) {
        try {
            reqSubmitWithdraw.setSign(this.user.getSign(reqSubmitWithdraw.getAddr(), reqSubmitWithdraw.getMemo(), reqSubmitWithdraw.getUsertags(), reqSubmitWithdraw.getUserOrderid()));
            String result = this.request("withdraw/submit.php", reqSubmitWithdraw);
            RespSubmitWithdraw res = JSON.parseObject(result, RespSubmitWithdraw.class);
            if (res.getData().getEno() != API_SUCC_CODE) {
                res.getData().setData(null);
            }
            return res.getData();
        } catch (Exception e) {
            RespSubmitWithdrawBody data = new RespSubmitWithdrawBody();
            data.setEmsg(e.getMessage());
            data.setEno(SDK_ERROE);
            return data;
        }
    }


    /**
     * 提币预校验接口
     *
     * @param reqSubmitWithdraw ReqSubmitWithdraw
     * @return RespData
     */
    public RespData ValidateWithdraw(ReqSubmitWithdraw reqSubmitWithdraw) {
        try {
            reqSubmitWithdraw.setSign(this.user.getSign(reqSubmitWithdraw.getAddr(), reqSubmitWithdraw.getMemo(), reqSubmitWithdraw.getUsertags(), reqSubmitWithdraw.getUserOrderid()));
            String result = this.request("withdraw/validator.php", reqSubmitWithdraw);
            Resp res = JSON.parseObject(result, Resp.class);
            return res.getData();
        } catch (Exception e) {
            RespData data = new RespData();
            data.setEmsg(e.getMessage());
            data.setEno(SDK_ERROE);
            return data;
        }
    }

    /**
     * 查询提币工单状态
     *
     * @param reqQueryWithdrawStatus ReqQueryWithdrawStatus
     * @return RespQueryWithdrawStatusBody
     */
    public RespQueryWithdrawStatusBody QueryWithdrawStatus(ReqQueryWithdrawStatus reqQueryWithdrawStatus) {
        try {
            String result = this.request("withdraw/status.php", reqQueryWithdrawStatus);
            RespQueryWithdrawStatus res = JSON.parseObject(result, RespQueryWithdrawStatus.class);
            if (res.getData().getEno() != API_SUCC_CODE) {
                res.getData().setData(null);
            }
            return res.getData();
        } catch (Exception e) {
            RespQueryWithdrawStatusBody data = new RespQueryWithdrawStatusBody();
            data.setEmsg(e.getMessage());
            data.setEno(SDK_ERROE);
            return data;
        }
    }


    /**
     * 查询提币记录
     *
     * @param reqQueryWithdrawHistory ReqQueryWithdrawHistory
     * @return RespQueryWithdrawHistoryBody
     */
    public RespQueryWithdrawHistoryBody QueryWithdrawHistory(ReqQueryWithdrawHistory reqQueryWithdrawHistory) {
        try {
            String result = this.request("withdraw/history.php", reqQueryWithdrawHistory);
            RespQueryWithdrawHistory res = JSON.parseObject(result, RespQueryWithdrawHistory.class);
            if (res.getData().getEno() != API_SUCC_CODE) {
                res.getData().setData(null);
            }
            return res.getData();
        } catch (Exception e) {
            RespQueryWithdrawHistoryBody data = new RespQueryWithdrawHistoryBody();
            data.setEmsg(e.getMessage());
            data.setEno(SDK_ERROE);
            return data;
        }
    }


    /**
     * 取消提币接口
     *
     * @param reqWithdrawCancel ReqWithdrawCancel
     * @return RespData
     */
    public RespData WithdrawCancel(ReqWithdrawCancel reqWithdrawCancel) {
        try {
            String result = this.request("withdraw/cancel.php", reqWithdrawCancel);
            Resp res = JSON.parseObject(result, Resp.class);
            return res.getData();
        } catch (Exception e) {
            RespData data = new RespData();
            data.setEmsg(e.getMessage());
            data.setEno(SDK_ERROE);
            return data;
        }
    }

    /**
     * 查询币种节点高度
     *
     * @param reqBlockHeight ReqBlockHeight
     * @return RespBlockHeightBody
     */
    public RespBlockHeightBody BlockHeight(ReqBlockHeight reqBlockHeight) {
        try {
            String result = this.request("blockheight.php", reqBlockHeight);
            RespBlockHeight res = JSON.parseObject(result, RespBlockHeight.class);
            if (res.getData().getEno() != API_SUCC_CODE) {
                res.getData().setData(null);
            }
            return res.getData();
        } catch (Exception e) {
            RespBlockHeightBody data = new RespBlockHeightBody();
            data.setEmsg(e.getMessage());
            data.setEno(SDK_ERROE);
            return data;
        }
    }


    /**
     * @return String
     */
    public String getHost() {
        return null;
    }
}