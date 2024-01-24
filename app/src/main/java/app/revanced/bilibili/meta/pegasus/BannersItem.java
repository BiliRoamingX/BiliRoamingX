package app.revanced.bilibili.meta.pegasus;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.BannerItemV2;

import java.util.Collections;
import java.util.List;

@Keep
public class BannersItem extends BasicIndexItem {
    /**
     * codes will filled by patcher
     */
    @JSONField(deserialize = false, serialize = false)
    public List<BannerItemV2> getBanners() {
        return Collections.emptyList();
    }
}
