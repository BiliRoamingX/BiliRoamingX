package tv.danmaku.bili.ui.theme.api;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
@Keep
/* loaded from: classes13.dex */
public class BiliSkin implements Cloneable {
    public static final int STATUS_BOUGHT = 1;
    public static final int STATUS_CANCELED = 4;
    public static final int STATUS_RENEW = 2;
    public static final int STATUS_RENEW_FAILED = 3;
    @JSONField(name = "buy_time")
    public long mBuyTime;
    @JSONField(name = "due_time")
    public long mDueTime;
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "is_bought")
    public boolean mIsBought;
    @JSONField(name = "is_free")
    public boolean mIsFree;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "price")
    public int mPrice;
    @JSONField(name = "skin_img")
    public String mSkinImg;
    @JSONField(name = "status")
    public int mStatus;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "BiliSkin{mId=" + this.mId + ", mName='" + this.mName + "', mSkinImg='" + this.mSkinImg + "', mIsFree=" + this.mIsFree + ", mPrice=" + this.mPrice + ", mIsBought=" + this.mIsBought + ", mStatus=" + this.mStatus + ", mBuyTime=" + this.mBuyTime + ", mDueTime=" + this.mDueTime + '}';
    }
}
