package pro.safeworld.swasdk.data.Resp;

import pro.safeworld.swasdk.data.comm.RespData;

import java.util.List;


/**
 * RespGetDepositAddrBody
 */
public class RespGetDepositAddrBody extends RespData {

    /**
     * data
     */
    private List<RespGetDepositAddrData> data;

    /**
     * @return RespGetDepositAddrData
     */
    public List<RespGetDepositAddrData> getData() {
        return data;
    }


    /**
     * @param data void
     */
    public void setData(List<RespGetDepositAddrData> data) {
        this.data = data;
    }
}
