package pro.safeworld.swasdk.data.Resp;

import pro.safeworld.swasdk.data.comm.RespData;

import java.util.List;


/**
 * RespGetDepositHistoryBody
 */
public class RespGetDepositHistoryBody extends RespData {

    /**
     * data
     */
    private List<RespGetDepositHistoryData> data;


    /**
     * @return RespGetDepositHistoryData
     */
    public List<RespGetDepositHistoryData> getData() {
        return data;
    }


    /**
     * @param data void
     */
    public void setData(List<RespGetDepositHistoryData> data) {
        this.data = data;
    }
}
