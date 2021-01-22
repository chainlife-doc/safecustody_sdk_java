package pro.safeworld.swasdk.data.Resp;

import pro.safeworld.swasdk.data.comm.RespData;

import java.util.List;


/**
 * RespQueryCoinBody
 */
public class RespQueryCoinBody extends RespData {


    /**
     * data
     */
    private List<RespQueryCoinData> data;

    /**
     * @return RespQueryCoinData
     */
    public List<RespQueryCoinData> getData() {
        return data;
    }


    /**
     * @param data RespQueryCoinData
     */
    public void setData(List<RespQueryCoinData> data) {
        this.data = data;
    }
}

