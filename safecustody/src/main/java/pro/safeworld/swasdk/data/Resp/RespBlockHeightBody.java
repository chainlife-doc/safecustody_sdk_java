package pro.safeworld.swasdk.data.Resp;

import pro.safeworld.swasdk.data.comm.RespData;


/**
 * RespBlockHeightBody
 */
public class RespBlockHeightBody extends RespData {

    /**
     * RespBlockHeightData
     */
    private RespBlockHeightData data;


    /**
     * @return RespBlockHeightData
     */
    public RespBlockHeightData getData() {
        return data;
    }


    /**
     * @param data void
     */
    public void setData(RespBlockHeightData data) {
        this.data = data;
    }
}
