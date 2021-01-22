package pro.safeworld.swasdk.data.Resp;

import pro.safeworld.swasdk.data.comm.RespData;

import java.util.List;


/**
 * RespQueryBalanceBody
 */
public class RespQueryBalanceBody extends RespData {

    /**
     * data
     */
    private List<RespQueryBalanceData> data;


    /**
     * @return RespQueryBalanceData
     */
    public List<RespQueryBalanceData> getData() {
        return data;
    }


    /**
     * @param data void
     */
    public void setData(List<RespQueryBalanceData> data) {
        this.data = data;
    }
}
