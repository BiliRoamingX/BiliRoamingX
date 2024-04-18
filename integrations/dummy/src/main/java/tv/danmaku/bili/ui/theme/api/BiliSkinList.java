package tv.danmaku.bili.ui.theme.api;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.okretro.BaseResponse;

import java.util.ArrayList;

/* compiled from: BL */
@Keep
/* loaded from: classes16.dex */
public class BiliSkinList extends BaseResponse implements Cloneable {
    @JSONField(name = "data")
    public ArrayList<BiliSkin> mList;
    @JSONField(name = "ts")
    public long mTs;

    public Object clone() {
        BiliSkinList biliSkinList = new BiliSkinList();
        if (this.mList != null) {
            biliSkinList.mList = new ArrayList<>(this.mList);
        }
        biliSkinList.mTs = this.mTs;
        biliSkinList.code = this.code;
        return biliSkinList;
    }

    public String toString() {
        return "BiliSkinList{mList=" + this.mList + ", mTs=" + this.mTs + '}';
    }
}
