package com.safecustody.sdk;

import com.alibaba.fastjson.JSON;
import com.safecustody.sdk.data.Req.*;
import com.safecustody.sdk.data.Resp.*;
import com.safecustody.sdk.data.comm.RespData;

import java.util.HashSet;

/**
 * Hello world!
 */
public class example {
    public static void main(String[] args) {
        User user = new User();
        user.setAppid("");
        user.setSalt("");
        user.setUserid("");

        Sdk sdk = new Sdk(user);
        sdk.setHost("");

        //-------------
        //单个币种查询
        //-------------
        ReqQueryCoin queryCoin = new ReqQueryCoin();
        queryCoin.setCoin("btc");
        //TODO 调用api
        RespQueryCoinBody respQueryCoinBody = sdk.QueryCoinConf(queryCoin);
        //TODO 判断错误
        if (respQueryCoinBody.getEmsg().equals("") || respQueryCoinBody.getEno() == 0) {
            System.out.println(respQueryCoinBody.getEmsg());
        }
        //输出字符串
        System.out.println(JSON.toJSONString(respQueryCoinBody));


        //-------------
        //查询币种公共信息
        //-------------
        //TODO 调用api
        RespQueryCoinBody respQueryCoinBodys = sdk.QueryCoin();
        //TODO 判断错误
        if (respQueryCoinBodys.getEmsg().equals("") || respQueryCoinBodys.getEno() == 0) {
            System.out.println(respQueryCoinBodys.getEmsg());
        }
//      输出字符串
        System.out.println(JSON.toJSONString(respQueryCoinBodys));


        //-------------
        //查询余额
        //-------------
        ReqQueryBalanceBodyInfo reqQueryBalanceBodyInfo1 = new ReqQueryBalanceBodyInfo();
        reqQueryBalanceBodyInfo1.setChain("btc");
        reqQueryBalanceBodyInfo1.setCoin("btc");

        ReqQueryBalanceBodyInfo reqQueryBalanceBodyInfo2 = new ReqQueryBalanceBodyInfo();
        reqQueryBalanceBodyInfo2.setChain("trx");
        reqQueryBalanceBodyInfo2.setCoin("trx");

        HashSet<ReqQueryBalanceBodyInfo> balance = new HashSet<>();
        balance.add(reqQueryBalanceBodyInfo1);
        balance.add(reqQueryBalanceBodyInfo2);

        //TODO 调用api
        RespQueryBalanceBody respQueryBalanceBody = sdk.QueryBalance(balance);
        //TODO 判断错误
        if (respQueryBalanceBody.getEmsg().equals("") || respQueryBalanceBody.getEno() == 0) {
            System.out.println(respQueryBalanceBody.getEmsg());
        }
        //输出字符串
        System.out.println(JSON.toJSONString(respQueryBalanceBody));


        //------------
        //获取充值地址
        //------------
        ReqGetDepositAddrBodyInfo reqGetDepositAddrBodyInfo = new ReqGetDepositAddrBodyInfo();
        reqGetDepositAddrBodyInfo.setChain("trx");
        reqGetDepositAddrBodyInfo.setCoin("trx");
        reqGetDepositAddrBodyInfo.setSubuserid("1");

        HashSet<ReqGetDepositAddrBodyInfo> reqGetDepositAddrBodyInfoHashSet = new HashSet<>();
        reqGetDepositAddrBodyInfoHashSet.add(reqGetDepositAddrBodyInfo);

        //TODO 调用api
        RespGetDepositAddrBody respGetDepositAddrBody = sdk.GetDepositAddr(reqGetDepositAddrBodyInfoHashSet);
        //TODO 判断错误
        if (respGetDepositAddrBody.getEmsg().equals("") || respGetDepositAddrBody.getEno() == 0) {
            System.out.println(respGetDepositAddrBody.getEmsg());
        }
        //输出字符串
        System.out.println(JSON.toJSONString(respGetDepositAddrBody));


        //------------
        //获取充值记录
        //------------
        ReqGetDepositHistory reqGetDepositHistory = new ReqGetDepositHistory();
        reqGetDepositHistory.setChain("trx");
        reqGetDepositHistory.setCoin("trx");
        reqGetDepositHistory.setSubuserid("26");
        //TODO 调用api
        RespGetDepositHistoryBody respGetDepositHistoryBody = sdk.GetDepositHistory(reqGetDepositHistory);
        //TODO 判断错误
        if (respGetDepositHistoryBody.getEmsg().equals("") || respGetDepositHistoryBody.getEno() == 0) {
            System.out.println(respGetDepositHistoryBody.getEmsg());
        }
//        输出字符串
        System.out.println(JSON.toJSONString(respGetDepositHistoryBody));


        //------------
        //内部价地址查询
        //------------
        ReqQueryIsInternalAddr reqQueryIsInternalAddr = new ReqQueryIsInternalAddr();
        reqQueryIsInternalAddr.setAddr("sss");
        reqQueryIsInternalAddr.setChain("trx");
        reqQueryIsInternalAddr.setCoin("trx");
//        TODO 调用api
        RespQueryIsInternalAddrBody respQueryIsInternalAddrBody = sdk.QueryIsInternalAddr(reqQueryIsInternalAddr);
//        TODO 判断错误
        if (respQueryIsInternalAddrBody.getEmsg().equals("") || respQueryIsInternalAddrBody.getEno() == 0) {
            System.out.println(respQueryIsInternalAddrBody.getEmsg());
        }
//        输出字符串
        System.out.println(JSON.toJSONString(respQueryIsInternalAddrBody));


        //------------
        //提交提币工单
        //------------
        ReqSubmitWithdraw reqSubmitWithdraw1 = new ReqSubmitWithdraw();
        reqSubmitWithdraw1.setAddr("");
        reqSubmitWithdraw1.setAmount("0.01");
        reqSubmitWithdraw1.setChain("trx");
        reqSubmitWithdraw1.setCoin("trx");
        reqSubmitWithdraw1.setMemo("trx");
        reqSubmitWithdraw1.setUsertags("trx");
        reqSubmitWithdraw1.setSubuserid("26");
        //TODO 调用api
        RespSubmitWithdrawBody respSubmitWithdrawBody = sdk.SubmitWithdraw(reqSubmitWithdraw1);
        //TODO 判断错误
        if (respSubmitWithdrawBody.getEmsg().equals("") || respSubmitWithdrawBody.getEno() == 0) {
            System.out.println(respSubmitWithdrawBody.getEmsg());
        }
//        输出字符串
        System.out.println(JSON.toJSONString(respSubmitWithdrawBody));


        //------------
        //提币预校验接口
        //------------
        ReqSubmitWithdraw reqSubmitWithdraw2 = new ReqSubmitWithdraw();
        reqSubmitWithdraw2.setAddr("");
        reqSubmitWithdraw2.setAmount("0.01");
        reqSubmitWithdraw2.setChain("trx");
        reqSubmitWithdraw2.setCoin("trx");
        reqSubmitWithdraw2.setMemo("trx");
        reqSubmitWithdraw2.setUsertags("trx");
        reqSubmitWithdraw2.setSubuserid("26");
        //TODO 调用api
        RespData respData = sdk.ValidateWithdraw(reqSubmitWithdraw2);
        //TODO 判断错误
        if (respData.getEmsg().equals("") || respData.getEno() == 0) {
            System.out.println(respData.getEmsg());
        }
//        输出字符串
        System.out.println(JSON.toJSONString(respData));


        //------------
        //查询提币工单状态
        //------------
        ReqQueryWithdrawStatus reqQueryWithdrawStatus = new ReqQueryWithdrawStatus();
        reqQueryWithdrawStatus.setChain("trx");
        reqQueryWithdrawStatus.setCoin("trx");
        reqQueryWithdrawStatus.setWithdrawid(1000);
        //TODO 调用api
        RespQueryWithdrawStatusBody respQueryWithdrawStatusBody = sdk.QueryWithdrawStatus(reqQueryWithdrawStatus);
        //TODO 判断错误
        if (respQueryWithdrawStatusBody.getEmsg().equals("") || respQueryWithdrawStatusBody.getEno() == 0) {
            System.out.println(respQueryWithdrawStatusBody.getEmsg());
        }
//        输出字符串
        System.out.println(JSON.toJSONString(respQueryWithdrawStatusBody));


        //------------
        //查询提币记录
        //------------
        ReqQueryWithdrawHistory reqQueryWithdrawHistory = new ReqQueryWithdrawHistory();
        reqQueryWithdrawHistory.setChain("trx");
        reqQueryWithdrawHistory.setCoin("trx");
        reqQueryWithdrawHistory.setSubuserid("26");
        reqQueryWithdrawHistory.setFromid(1);
        reqQueryWithdrawHistory.setLimit(100);
        //TODO 调用api
        RespQueryWithdrawHistoryBody respQueryWithdrawHistoryBody = sdk.QueryWithdrawHistory(reqQueryWithdrawHistory);
        //TODO 判断错误
        if (respQueryWithdrawHistoryBody.getEmsg().equals("") || respQueryWithdrawHistoryBody.getEno() == 0) {
            System.out.println(respQueryWithdrawHistoryBody.getEmsg());
        }
//        输出字符串
        System.out.println(JSON.toJSONString(respQueryWithdrawHistoryBody));
    }
}
