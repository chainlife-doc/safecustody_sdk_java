package pro.safeworld.swasdk.data.Resp;


/**
 * RespQueryIsInternalAddrData
 */
public class RespQueryIsInternalAddrData {

    /**
     * 1：是内部地址，0：非内部地址
     */
    private int exist;


    /**
     * @return int
     */
    public int getExist() {
        return exist;
    }


    /**
     * @param exist int
     */
    public void setExist(int exist) {
        this.exist = exist;
    }
}
