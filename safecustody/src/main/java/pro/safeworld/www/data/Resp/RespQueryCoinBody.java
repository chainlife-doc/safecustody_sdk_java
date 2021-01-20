package pro.safeworld.www.data.Resp;

import pro.safeworld.www.data.comm.RespData;

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

