package pro.safeworld.www.data.comm;


/**
 * Request
 */
public class Request {


    /**
     * appid
     */
    private String appid = "";


    /**
     * cryptype
     */
    private int cryptype = 0;


    /**
     * data
     */
    private ReqData data;


    /**
     * getAppid
     * @return String
     */
    public String getAppid() {
        return appid;
    }

    /**
     * getCryptype
     * @return int
     */
    public int getCryptype() {
        return cryptype;
    }

    /**
     * getData
     * @return ReqData
     */
    public ReqData getData() {
        return data;
    }

    /**
     * setAppid
     * @param appid void
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * setData
     * @param data void
     */
    public void setData(ReqData data) {
        this.data = data;
    }

}
