package com.safecustody.sdk.data.Resp;

import com.alibaba.fastjson.annotation.JSONField;

public class RespBlockHeight {
    private RespBlockHeightBody data;

    public RespBlockHeightBody getData() {
        return data;
    }

    public void setData(RespBlockHeightBody data) {
        this.data = data;
    }
}
