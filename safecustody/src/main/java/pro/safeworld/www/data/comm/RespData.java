package pro.safeworld.www.data.comm;


/**
 * RespData
 */
public class RespData {

    /**
     * 错误码
     */
    private int eno;


    /**
     * 错误信息
     */
    private String emsg;

    /**
     * getEno
     * @return int
     */
    public int getEno() {
        return eno;
    }


    /**
     * setEno
     * @param eno void
     */
    public void setEno(int eno) {
        this.eno = eno;
    }


    /**
     * getEmsg
     * @return String
     */
    public String getEmsg() {
        return emsg;
    }

    /**
     * setEmsg
     * @param emsg void
     */
    public void setEmsg(String emsg) {
        this.emsg = emsg;
    }
}
