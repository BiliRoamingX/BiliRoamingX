package com.bilibili.pegasus.api.modelv2;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.pegasus.api.model.BasicIndexItem;

public class BannerItemV2 {
    @JSONField(name = "id")
    public long id;
    @JSONField(name = "index")
    public int index;
    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public BasicIndexItem pegasusAdItem;
    @JSONField(name = "resource_id")
    public long resourceId;
    @Nullable
    @JSONField(name = "type")
    public String type;
}
