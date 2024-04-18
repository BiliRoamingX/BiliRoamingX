package tv.danmaku.bili.ui.splash.event;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.Nullable;

/* compiled from: BL */
@Keep
/* loaded from: classes15.dex */
public final class Resource {
    private boolean isLocalBirthdayRes;
    @Nullable
    private String localResourcePath;
    @JSONField(name = "resource_hash")
    @Nullable
    private String resourceHash;
    @JSONField(name = "resource_type")
    private int resourceType;
    @JSONField(name = "resource_url")
    @Nullable
    private String resourceUrl;
    @JSONField(name = "video_height")
    private int videoHeight;
    @JSONField(name = "video_width")
    private int videoWidth;

    @Nullable
    public final String getLocalResourcePath() {
        return this.localResourcePath;
    }

    @Nullable
    public final String getResourceHash() {
        return this.resourceHash;
    }

    public final int getResourceType() {
        return this.resourceType;
    }

    @Nullable
    public final String getResourceUrl() {
        return this.resourceUrl;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final boolean isLocalBirthdayRes() {
        return this.isLocalBirthdayRes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0033, code lost:
        if (r0 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isResValid() {
        return false;
    }

    public final void setLocalBirthdayRes(boolean z) {
        this.isLocalBirthdayRes = z;
    }

    public final void setLocalResourcePath(@Nullable String str) {
        this.localResourcePath = str;
    }

    public final void setResourceHash(@Nullable String str) {
        this.resourceHash = str;
    }

    public final void setResourceType(int i) {
        this.resourceType = i;
    }

    public final void setResourceUrl(@Nullable String str) {
        this.resourceUrl = str;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }
}
