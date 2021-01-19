package com.safecustody.sdk;

import com.alibaba.fastjson.JSON;
import com.safecustody.sdk.data.Req.*;
import com.safecustody.sdk.data.Resp.*;
import com.safecustody.sdk.data.comm.RespData;

import java.util.HashSet;

/**
 * 有关身份验证(token加密):
 * 使用SDK不用主动加密了,程序内部已经做好了处理,只需要传入SECRETKEY即可
 * 提币签名(sign验证):
 * 使用SDK不用主动加密了,程序内部已经做好了处理
 */
public class example {
    public static void main(String[] args) {

        //创建user
        User user = new User();

        //对应商户后台APPID
        user.setAppid("dbd7bfa63e54b66954ac8c0ccb291300da83a182bf038fd2161fa9cabecc850d");

        //对应商户后SECRETKEY
        //用来加密token的私钥
        user.setSecretKey("b473acb91abec78ff6adfc7f7c2a83b710ddc013c99248631b53be3dd8ba9972db1a6cb57800df511e70aaa806684eec13f334d15ee1cc41754bc38438313aee");

        //对应的商户后台的商户id
        user.setUserid("1");

        //对应商户后台APIKEY
        //api访问公钥
        user.setApiKey("dbd7bfa63e54b66954ac8c0ccb291300da83a182bf038fd2161fa9cabecc850d");

        ///////////////
        ///////////////


        //创建一个sdk
        Sdk sdk = new Sdk(user);

        //TODO 请向微信群的官方人员获取
        sdk.setHost("https://www.safecustoday.vip/");

        //////////////////////////////
        ///////以下是请求的方法/////////
        /////////////////////////////

        //-------------
        //单个币种查询
        //-------------


        ReqQueryCoin queryCoin = new ReqQueryCoin();
        queryCoin.setCoin("btc");
        //TODO 调用api
        RespQueryCoinBody respQueryCoinBody = sdk.QueryCoinConf(queryCoin);

        //TODO 错误
        if (!respQueryCoinBody.getEmsg().equals("") || respQueryCoinBody.getEno() != 0) {
            System.out.println(respQueryCoinBody.getEmsg());
            return;
        }
        //输出字符串
        System.out.println(JSON.toJSONString(respQueryCoinBody));

        //-------------
        //查询全部币种
        //-------------

        //TODO 调用api
        RespQueryCoinBody respQueryCoinBodys = sdk.QueryCoin();
        //TODO 错误
        if (!respQueryCoinBodys.getEmsg().equals("") || respQueryCoinBodys.getEno() != 0) {
            System.out.println(respQueryCoinBodys.getEmsg());
            return;
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
        //TODO 错误
        if (!respQueryBalanceBody.getEmsg().equals("") || respQueryBalanceBody.getEno() != 0) {
            System.out.println(respQueryBalanceBody.getEmsg());
            return;
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
        //TODO 错误
        if (!respGetDepositAddrBody.getEmsg().equals("") || respGetDepositAddrBody.getEno() != 0) {
            System.out.println(respGetDepositAddrBody.getEmsg());
            return;
        }
        //输出字符串
        System.out.println(JSON.toJSONString(respGetDepositAddrBody));


        //------------
        //获取充值记录
        //------------

        ReqGetDepositHistory reqGetDepositHistory = new ReqGetDepositHistory();
        reqGetDepositHistory.setChain("vsys");
        reqGetDepositHistory.setCoin("vsys");
        reqGetDepositHistory.setSubuserid("26");
        reqGetDepositHistory.setFromid(1);
        reqGetDepositHistory.setLimit(1);

        //TODO 调用api
        RespGetDepositHistoryBody respGetDepositHistoryBody = sdk.GetDepositHistory(reqGetDepositHistory);
        //TODO 错误
        if (!respGetDepositHistoryBody.getEmsg().equals("") || respGetDepositHistoryBody.getEno() != 0) {
            System.out.println(respGetDepositHistoryBody.getEmsg());
            return;
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
//        TODO 错误
        if (!respQueryIsInternalAddrBody.getEmsg().equals("") || respQueryIsInternalAddrBody.getEno() != 0) {
            System.out.println(respQueryIsInternalAddrBody.getEmsg());
            return;
        }
//        输出字符串
        System.out.println(JSON.toJSONString(respQueryIsInternalAddrBody));


        //------------
        //提交提币工单
        //------------

        ReqSubmitWithdraw reqSubmitWithdraw1 = new ReqSubmitWithdraw();
        reqSubmitWithdraw1.setAddr("ATzuR1mRNT3WWciTD4RC6GGt9H4aRammht3");
        reqSubmitWithdraw1.setAmount("10");
        reqSubmitWithdraw1.setChain("trx23");
        reqSubmitWithdraw1.setCoin("trx");
//        reqSubmitWithdraw1.setMemo("vsys");
        reqSubmitWithdraw1.setUsertags("vsys");
        reqSubmitWithdraw1.setSubuserid("26");

        //TODO 调用api
        RespSubmitWithdrawBody respSubmitWithdrawBody = sdk.SubmitWithdraw(reqSubmitWithdraw1);
        //TODO 错误
        if (!respSubmitWithdrawBody.getEmsg().equals("") || respSubmitWithdrawBody.getEno() != 0) {
            System.out.println(respSubmitWithdrawBody.getEmsg());
            return;
        }
//        输出字符串
        System.out.println(JSON.toJSONString(respSubmitWithdrawBody));


        //------------
        //提币预校验接口
        //------------
        ReqSubmitWithdraw reqSubmitWithdraw2 = new ReqSubmitWithdraw();
        reqSubmitWithdraw2.setAddr("2N2ggMSEuvHpHLKBpSJsuyX5zY8Ec16eQBc");
        reqSubmitWithdraw2.setAmount("0.01");
        reqSubmitWithdraw2.setChain("trx");
        reqSubmitWithdraw2.setCoin("trx");
        reqSubmitWithdraw2.setMemo("trx");
        reqSubmitWithdraw2.setUsertags("trx");
        reqSubmitWithdraw2.setSubuserid("26");
        //TODO 调用api
        RespData respData = sdk.ValidateWithdraw(reqSubmitWithdraw2);
        //TODO 错误
        if (!respData.getEmsg().equals("") || respData.getEno() != 0) {
            System.out.println(respData.getEmsg());
            return;
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
        //TODO 错误
        if (!respQueryWithdrawStatusBody.getEmsg().equals("") || respQueryWithdrawStatusBody.getEno() != 0) {
            System.out.println(respQueryWithdrawStatusBody.getEmsg());
            return;
        }
//        输出字符串
        System.out.println(JSON.toJSONString(respQueryWithdrawStatusBody));


        //------------
        //查询提币记录
        //------------

        ReqQueryWithdrawHistory reqQueryWithdrawHistory = new ReqQueryWithdrawHistory();
        reqQueryWithdrawHistory.setChain("vsys");
        reqQueryWithdrawHistory.setCoin("vsys");
        reqQueryWithdrawHistory.setSubuserid("26");
        reqQueryWithdrawHistory.setFromid(4009);
        reqQueryWithdrawHistory.setLimit(100);
        //TODO 调用api
        RespQueryWithdrawHistoryBody respQueryWithdrawHistoryBody = sdk.QueryWithdrawHistory(reqQueryWithdrawHistory);
        //TODO 错误
        if (!respQueryWithdrawHistoryBody.getEmsg().equals("") || respQueryWithdrawHistoryBody.getEno() != 0) {
            System.out.println(respQueryWithdrawHistoryBody.getEmsg());
            return;
        }
//        输出字符串
        System.out.println(JSON.toJSONString(respQueryWithdrawHistoryBody));


        //------------
        //取消提币接口
        //------------

        ReqWithdrawCancel reqWithdrawCancel = new ReqWithdrawCancel();
        reqWithdrawCancel.setChain("vsys");
        reqWithdrawCancel.setCoin("vsys");
        reqWithdrawCancel.setSubuserid("26");
        reqWithdrawCancel.setWithdrawId(4009);
        //TODO 调用api
        RespData respData2 = sdk.WithdrawCancel(reqWithdrawCancel);
        //TODO 错误
        if (!respData2.getEmsg().equals("") || respData2.getEno() != 0) {
            System.out.println(respData2.getEmsg());
            return;
        }
//        输出字符串
        System.out.println(JSON.toJSONString(respData2));


        //----------
        //查询区块高度
        //----------
        ReqBlockHeight reqBlockHeight = new ReqBlockHeight();
        reqBlockHeight.setChain("btc");
        reqBlockHeight.setCoin("btc");
        //TODO 调用api
        RespBlockHeightBody respBlockHeightBody = sdk.BlockHeight(reqBlockHeight);
        //TODO 错误
        if (!respBlockHeightBody.getEmsg().equals("") || respBlockHeightBody.getEno() != 0) {
            System.out.println(respBlockHeightBody.getEmsg());
            return;
        }
        //        输出字符串
        System.out.println(JSON.toJSONString(respBlockHeightBody));
    }
}
