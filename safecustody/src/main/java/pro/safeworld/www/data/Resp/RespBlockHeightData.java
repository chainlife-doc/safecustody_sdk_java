package pro.safeworld.www.data.Resp;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * RespBlockHeightData
 */
public class RespBlockHeightData {

    /**
     * height
     */
    private String height = "";


    /**
     * updateOn
     */
    @JSONField(name = "update_on")
    private String updateOn = "";


    /**
     * @return String
     */
    public String getHeight() {
        return height;
    }


    /**
     * @param height void
     */
    public void setHeight(String height) {
        this.height = height;
    }


    /**
     * @return String
     */
    public String getUpdateOn() {
        return updateOn;
    }


    /**
     * @param updateOn void
     */
    public void setUpdateOn(String updateOn) {
        this.updateOn = updateOn;
    }
}
