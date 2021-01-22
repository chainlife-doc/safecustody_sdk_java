package pro.safeworld.swasdk.data.Resp;

import pro.safeworld.swasdk.data.comm.RespData;

/**
 * RespQueryWithdrawStatusBody
 */
public class RespQueryWithdrawStatusBody extends RespData {

    /**
     * data
     */
    private RespQueryWithdrawStatusData data;


    /**
     * @return RespQueryWithdrawStatusData
     */
    public RespQueryWithdrawStatusData getData() {
        return data;
    }


    /**
     * @param data RespQueryWithdrawStatusData
     */
    public void setData(RespQueryWithdrawStatusData data) {
        this.data = data;
    }
}
