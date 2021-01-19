# 赛福托管钱包API JAVA-SDK  

### 安装SDK


> 下载源码包,把`com`文件夹放入项目中  
> 可能需要在`pom.xml`引入下面依赖 `import com.alibaba.fastjson.JSON;`
```
<!-- https://mvnrepository.com/artifact/com.alibaba/fastjson -->
<dependency>
  <groupId>com.alibaba</groupId>
  <artifactId>fastjson</artifactId>
  <version>1.2.47</version>
</dependency>
```
    
# 例子

#### 创建sdkApi
 ```java             
import com.alibaba.fastjson.JSON;
import com.safecustody.sdk.Sdk;
import com.safecustody.sdk.User;
import com.safecustody.sdk.data.Resp.RespQueryCoinBody;

public class App {
    public static void main(String[] args) {

    //创建user
    User user = new User();

    //对应商户后台APPID
    user.setAppid("");

    //对应商户后SECRETKEY
    //用来加密token的私钥
    user.setSecretKey("");

    //对应的商户后台的商户id
    user.setUserid("");

    //对应商户后台APIKEY
    //api访问公钥
    user.setApiKey("");

    //创建sdk
    Sdk sdk = new Sdk(user);

    //host
    //请向管理员索取
    sdk.setHost("");

    ...
    }
}
``` 

#### [单个币种查询](https://github.com/chainlife-doc/wallet-api/blob/master/%E5%8D%95%E5%B8%81%E7%A7%8D%E4%BF%A1%E6%81%AF%E6%9F%A5%E8%AF%A2.md)
```java
ReqQueryCoin queryCoin = new ReqQueryCoin();

//传入查询的币名
queryCoin.setCoin("btc");

//请求接口
RespQueryCoinBody respQueryCoinBody = sdk.QueryCoinConf(queryCoin);

//TODO 错误                                                                         
if (!respQueryCoinBody.getEmsg().equals("") || respQueryCoinBody.getEno() != 0) { 
    System.out.println(respQueryCoinBody.getEmsg());                              
    return;                                                                       
}                                                                                 
//输出字符串                                                                           
System.out.println(JSON.toJSONString(respQueryCoinBody));                         
```

#### [查询全部币种](https://github.com/chainlife-doc/wallet-api/blob/master/%E6%9F%A5%E8%AF%A2%E5%B8%81%E7%A7%8D%E4%BF%A1%E6%81%AF.md)
```java
//请求接口
RespQueryCoinBody respQueryCoinBodys = sdk.QueryCoin();

//TODO 错误                                                                           
if (!respQueryCoinBodys.getEmsg().equals("") || respQueryCoinBodys.getEno() != 0) { 
    System.out.println(respQueryCoinBodys.getEmsg());                               
    return;                                                                         
}                                                                                   
//输出字符串                                                                             
System.out.println(JSON.toJSONString(respQueryCoinBodys));                          
```

#### [查询余额](https://github.com/chainlife-doc/wallet-api/blob/master/%E6%9F%A5%E8%AF%A2%E4%BD%99%E9%A2%9D.md)
```java
ReqQueryBalanceBodyInfo reqQueryBalanceBodyInfo1 = new ReqQueryBalanceBodyInfo();
//币名
reqQueryBalanceBodyInfo1.setChain("btc");
//链名
reqQueryBalanceBodyInfo1.setCoin("btc");

//TODO 如果要查询多个就创建多个ReqQueryBalanceBodyInfo对象
ReqQueryBalanceBodyInfo reqQueryBalanceBodyInfo2 = new ReqQueryBalanceBodyInfo();
//币名
reqQueryBalanceBodyInfo2.setChain("trx");
//链名
reqQueryBalanceBodyInfo2.setCoin("trx");

//创建ReqQueryBalanceBodyInfo类型的HashSet结构,add上面的币种对象
HashSet<ReqQueryBalanceBodyInfo> balance = new HashSet<>();
balance.add(reqQueryBalanceBodyInfo1);
balance.add(reqQueryBalanceBodyInfo2);

//请求接口
RespQueryBalanceBody respQueryBalanceBody = sdk.QueryBalance(balance);

//TODO 错误                                                                               
if (!respQueryBalanceBody.getEmsg().equals("") || respQueryBalanceBody.getEno() != 0) { 
    System.out.println(respQueryBalanceBody.getEmsg());                                 
    return;                                                                             
}                                                                                       
//输出字符串                                                                                 
System.out.println(JSON.toJSONString(respQueryBalanceBody));                            
```

#### [获取充值地址](https://github.com/chainlife-doc/wallet-api/blob/master/deposit/%E8%8E%B7%E5%8F%96%E5%85%85%E5%80%BC%E5%9C%B0%E5%9D%80.md)
```java
ReqGetDepositAddrBodyInfo reqGetDepositAddrBodyInfo = new ReqGetDepositAddrBodyInfo();   
//链名
reqGetDepositAddrBodyInfo.setChain("trx");                                               
//币名
reqGetDepositAddrBodyInfo.setCoin("trx");                                                
//你的用户id
reqGetDepositAddrBodyInfo.setSubuserid("1");                                             
           
//创建ReqGetDepositAddrBodyInfo类型的HashSet结构                                                                              
HashSet<ReqGetDepositAddrBodyInfo> reqGetDepositAddrBodyInfoHashSet = new HashSet<>();   
//add   reqGetDepositAddrBodyInfo
reqGetDepositAddrBodyInfoHashSet.add(reqGetDepositAddrBodyInfo);                         

//请求接口
RespGetDepositAddrBody respGetDepositAddrBody = sdk.GetDepositAddr(reqGetDepositAddrBodyInfoHashSet);

 //TODO 错误                                                                                        
 if (!respGetDepositAddrBody.getEmsg().equals("") || respGetDepositAddrBody.getEno() != 0) {      
     System.out.println(respGetDepositAddrBody.getEmsg());                                        
     return;                                                                                      
 }                                                                                                
 //输出字符串                                                                                          
 System.out.println(JSON.toJSONString(respGetDepositAddrBody));                                   
```

#### [获取充值记录](https://github.com/chainlife-doc/wallet-api/blob/master/deposit/%E8%8E%B7%E5%8F%96%E5%85%85%E5%80%BC%E8%AE%B0%E5%BD%95.md)
```java
ReqGetDepositHistory reqGetDepositHistory = new ReqGetDepositHistory();                 
//链名
reqGetDepositHistory.setChain("trx");                                                   
//币名
reqGetDepositHistory.setCoin("trx");                                                    
//你的用户id
reqGetDepositHistory.setSubuserid("26");                                                

//请求接口
RespGetDepositHistoryBody respGetDepositHistoryBody = sdk.GetDepositHistory(reqGetDepositHistory);

//TODO 错误                                                                                           
if (!respGetDepositHistoryBody.getEmsg().equals("") || respGetDepositHistoryBody.getEno() != 0) {   
    System.out.println(respGetDepositHistoryBody.getEmsg());                                        
    return;                                                                                         
}                                                                                                   
//输出字符串                                                                                             
System.out.println(JSON.toJSONString(respGetDepositHistoryBody));                                   
```

#### [内部地址查询](https://github.com/chainlife-doc/wallet-api/blob/master/internal-addr/%E5%86%85%E9%83%A8%E5%9C%B0%E5%9D%80%E6%9F%A5%E8%AF%A2.md)
```java
ReqQueryIsInternalAddr reqQueryIsInternalAddr = new ReqQueryIsInternalAddr();  
//地址
reqQueryIsInternalAddr.setAddr("sss");                                         
//链名
reqQueryIsInternalAddr.setChain("trx");                                        
//币名
reqQueryIsInternalAddr.setCoin("trx");                                         

//请求接口
RespQueryIsInternalAddrBody respQueryIsInternalAddrBody = sdk.QueryIsInternalAddr(reqQueryIsInternalAddr);

//TODO 错误
if (!respQueryIsInternalAddrBody.getEmsg().equals("") || respQueryIsInternalAddrBody.getEno() != 0) {   
    System.out.println(respQueryIsInternalAddrBody.getEmsg());                                          
    return;                                                                                             
}                                                                                                       
//输出字符串                                                                                                 
System.out.println(JSON.toJSONString(respQueryIsInternalAddrBody));                                     
```

#### [提交提币工单](https://github.com/chainlife-doc/wallet-api/blob/master/withdraw/%E6%8F%90%E4%BA%A4%E6%8F%90%E5%B8%81%E5%B7%A5%E5%8D%95.md)
```java
ReqSubmitWithdraw reqSubmitWithdraw1 = new ReqSubmitWithdraw();       
//提币地址
reqSubmitWithdraw1.setAddr("");                                       
//提币数量
reqSubmitWithdraw1.setAmount("0.01");                                 
//链名
reqSubmitWithdraw1.setChain("trx");                                   
//币名
reqSubmitWithdraw1.setCoin("trx");                                    
//memo 提币备注,内容自定义（会记录到区块链上）
reqSubmitWithdraw1.setMemo("trx");       
//usertags 提币标签，内容自定义 （不会记录到区块链上）                             
reqSubmitWithdraw1.setUsertags("trx");  
//你的用户id                              
reqSubmitWithdraw1.setSubuserid("26");  
//用户自定义订单ID，具有唯一性，可避免重复订单(可选字段)                              
reqSubmitWithdraw1.setUserOrderid("26"); 
//请求接口
RespSubmitWithdrawBody respSubmitWithdrawBody = sdk.SubmitWithdraw(reqSubmitWithdraw1);

//TODO 错误                                                                                    
if (!respSubmitWithdrawBody.getEmsg().equals("") || respSubmitWithdrawBody.getEno() != 0) {  
    System.out.println(respSubmitWithdrawBody.getEmsg());                                    
    return;                                                                                  
}                                                                                            
//输出字符串                                                                                      
System.out.println(JSON.toJSONString(respSubmitWithdrawBody));                               
```

#### [提币预校验](https://github.com/chainlife-doc/wallet-api/blob/master/withdraw/%E6%8F%90%E5%B8%81%E9%A2%84%E6%A0%A1%E9%AA%8C%E6%8E%A5%E5%8F%A3.md)
```java
ReqSubmitWithdraw reqSubmitWithdraw2 = new ReqSubmitWithdraw();    
//提币地址
reqSubmitWithdraw2.setAddr("");                       
//提币数量             
reqSubmitWithdraw2.setAmount("0.01");                              
//链名
reqSubmitWithdraw2.setChain("trx");                                
//币名
reqSubmitWithdraw2.setCoin("trx");                                 
//memo 提币备注,内容自定义（会记录到区块链上）
reqSubmitWithdraw2.setMemo("trx");       
//usertags 提币标签，内容自定义 （不会记录到区块链上）                       
reqSubmitWithdraw2.setUsertags("trx");          
//你的用户id                   
reqSubmitWithdraw2.setSubuserid("26");                             
//用户自定义订单ID，具有唯一性，可避免重复订单(可选字段)                              
reqSubmitWithdraw1.setUserOrderid("26"); 
//请求接口
RespData respData = sdk.ValidateWithdraw(reqSubmitWithdraw2);

//TODO 错误
if (!respData.getEmsg().equals("") || respData.getEno() != 0) {    
     System.out.println(respData.getEmsg());                        
     return;                                                        
 }                                                                  
 //输出字符串                                                    
 System.out.println(JSON.toJSONString(respData));                   
```

#### [查询工单状态](https://github.com/chainlife-doc/wallet-api/blob/master/withdraw/%E6%9F%A5%E8%AF%A2%E6%8F%90%E5%B8%81%E5%B7%A5%E5%8D%95%E7%8A%B6%E6%80%81.md)
```java
ReqQueryWithdrawStatus reqQueryWithdrawStatus = new ReqQueryWithdrawStatus();  
//链名
reqQueryWithdrawStatus.setChain("trx");                                        
//币名
reqQueryWithdrawStatus.setCoin("trx");                                         
//提币订单ID
reqQueryWithdrawStatus.setWithdrawid(1000);                                    

//请求接口
RespQueryWithdrawStatusBody respQueryWithdrawStatusBody = sdk.QueryWithdrawStatus(reqQueryWithdrawStatus); 

//TODO 错误                                                                                             
if (!respQueryWithdrawStatusBody.getEmsg().equals("") || respQueryWithdrawStatusBody.getEno() != 0) { 
    System.out.println(respQueryWithdrawStatusBody.getEmsg());                                        
    return;                                                                                           
}                                                                                                     
//输出字符串                                                                                               
System.out.println(JSON.toJSONString(respQueryWithdrawStatusBody));                                   
```

#### [查询历史提币记录](https://github.com/chainlife-doc/wallet-api/blob/master/withdraw/%E6%9F%A5%E8%AF%A2%E6%8F%90%E5%B8%81%E8%AE%B0%E5%BD%95.md)
```java
ReqQueryWithdrawHistory reqQueryWithdrawHistory = new ReqQueryWithdrawHistory();                   
//链名
reqQueryWithdrawHistory.setChain("trx");                                                           
//币名
reqQueryWithdrawHistory.setCoin("trx");                                                            
//你的用户id
reqQueryWithdrawHistory.setSubuserid("26");                                                        
//从哪个提币序号开始，值大于等于1,查询结果包含fromId对应的提币记录   
reqQueryWithdrawHistory.setFromid(1);    
//最多查询多少条记录，包含fromid这条记录                                                          
reqQueryWithdrawHistory.setLimit(100);                                                             

//请求接口
RespQueryWithdrawHistoryBody respQueryWithdrawHistoryBody = sdk.QueryWithdrawHistory(reqQueryWithdrawHistory);

//TODO 错误                                                                                                
if (!respQueryWithdrawHistoryBody.getEmsg().equals("") || respQueryWithdrawHistoryBody.getEno() != 0) {  
    System.out.println(respQueryWithdrawHistoryBody.getEmsg());                                          
    return;                                                                                              
}                                                                                                        
//输出字符串                                                                                                  
System.out.println(JSON.toJSONString(respQueryWithdrawHistoryBody));                                     
```

#### [取消提币接口](https://github.com/chainlife-doc/wallet-api/blob/master/withdraw/%E5%8F%96%E6%B6%88%E6%8F%90%E5%B8%81%E6%8E%A5%E5%8F%A3.md)
```java
ReqWithdrawCancel reqWithdrawCancel = new ReqWithdrawCancel();
//链名        
reqWithdrawCancel.setChain("");
//币名
reqWithdrawCancel.setCoin("");
//你的用户id
reqWithdrawCancel.setSubuserid("");
//订单id
reqWithdrawCancel.setWithdrawId(1000);

//请求接口
RespData respData2 = sdk.WithdrawCancel(reqWithdrawCancel);

//TODO 错误                                                          
if (!respData2.getEmsg().equals("") || respData2.getEno() != 0) {  
    System.out.println(respData2.getEmsg());                       
    return;                                                        
}                                                                  
//输出字符串                                                            
System.out.println(JSON.toJSONString(respData2));                  
```


#### [查询区块高度](https://github.com/chainlife-doc/wallet-api/blob/master/%E6%9F%A5%E8%AF%A2%E5%B8%81%E7%A7%8D%E8%8A%82%E7%82%B9%E9%AB%98%E5%BA%A6.md)
```java
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
//输出字符串                                                                         
System.out.println(JSON.toJSONString(respBlockHeightBody));                             
```