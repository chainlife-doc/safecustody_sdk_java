package pro.safeworld.swasdk.data.Resp;

import pro.safeworld.swasdk.data.comm.RespData;


/**
 * RespQueryIsInternalAddrBody
 */
public class RespQueryIsInternalAddrBody extends RespData {

    /**
     * data
     */
    private RespQueryIsInternalAddrData data;


    /**
     * @return RespQueryIsInternalAddrData
     */
    public RespQueryIsInternalAddrData getData() {
        return data;
    }


    /**
     * @param data RespQueryIsInternalAddrData
     */
    public void setData(RespQueryIsInternalAddrData data) {
        this.data = data;
    }
}
