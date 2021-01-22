package pro.safeworld.swasdk.data.Resp;

import pro.safeworld.swasdk.data.comm.RespData;

import java.util.List;


/**
 * RespQueryWithdrawHistoryBody
 */
public class RespQueryWithdrawHistoryBody extends RespData {


    /**
     * data
     */
    private List<RespQueryWithdrawHistoryData> data;


    /**
     * @return RespQueryWithdrawHistoryData
     */
    public List<RespQueryWithdrawHistoryData> getData() {
        return data;
    }


    /**
     * @param data RespQueryWithdrawHistoryData
     */
    public void setData(List<RespQueryWithdrawHistoryData> data) {
        this.data = data;
    }
}
