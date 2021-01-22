package pro.safeworld.swasdk.data.Resp;

import pro.safeworld.swasdk.data.comm.RespData;


/**
 * RespSubmitWithdrawBody
 */
public class RespSubmitWithdrawBody extends RespData {

    /**
     * data
     */
    private RespSubmitWithdrawData data;


    /**
     * @return RespSubmitWithdrawData
     */
    public RespSubmitWithdrawData getData() {
        return data;
    }


    /**
     * @param data RespSubmitWithdrawData
     */
    public void setData(RespSubmitWithdrawData data) {
        this.data = data;
    }
}
