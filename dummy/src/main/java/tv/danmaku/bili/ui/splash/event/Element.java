package tv.danmaku.bili.ui.splash.event;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BL */
@Keep
/* loaded from: classes15.dex */
public final class Element {
    @JSONField(name = "action")
    @Nullable
    private Action action;
    @JSONField(name = "bg_color")
    @Nullable
    private String bgColor;
    @JSONField(name = "bg_image")
    @Nullable
    private String bgImage;
    @Nullable
    private String bgImageLocalPath;
    @JSONField(name = "element_type")
    private int elementType;
    @JSONField(name = "hide_duration")
    private long hideDuration;
    @JSONField(name = "id")
    private long id;
    @JSONField(name = "image_url")
    @Nullable
    private String imageUrl;
    @Nullable
    private String imageUrlLocalPath;
    @JSONField(name = "interact_style")
    private int interactStyle;
    @JSONField(name = "layout")
    @Nullable
    private Layout layout;
    @JSONField(name = "show_duration")
    private long showDuration;
    @JSONField(name = "text")
    @Nullable
    private String text;
    @JSONField(name = "text_color")
    @Nullable
    private String textColor;

    @Nullable
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public final String getBgColor() {
        return this.bgColor;
    }

    @Nullable
    public final String getBgImage() {
        return this.bgImage;
    }

    @Nullable
    public final String getBgImageLocalPath() {
        return this.bgImageLocalPath;
    }

    public final int getElementType() {
        return this.elementType;
    }

    public final long getHideDuration() {
        return this.hideDuration;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getImageUrlLocalPath() {
        return this.imageUrlLocalPath;
    }

    public final int getInteractStyle() {
        return this.interactStyle;
    }

    @Nullable
    public final Layout getLayout() {
        return this.layout;
    }

    public final int getResourceHash() {
        return 0;
    }

    public final long getShowDuration() {
        return this.showDuration;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTextColor() {
        return this.textColor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0022, code lost:
        if (r0 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0048, code lost:
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isResValid() {
        return false;
    }

    public final void setAction(@Nullable Action action) {
        this.action = action;
    }

    public final void setBgColor(@Nullable String str) {
        this.bgColor = str;
    }

    public final void setBgImage(@Nullable String str) {
        this.bgImage = str;
    }

    public final void setBgImageLocalPath(@Nullable String str) {
        this.bgImageLocalPath = str;
    }

    public final void setElementType(int i) {
        this.elementType = i;
    }

    public final void setHideDuration(long j) {
        this.hideDuration = j;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setImageUrlLocalPath(@Nullable String str) {
        this.imageUrlLocalPath = str;
    }

    public final void setInteractStyle(int i) {
        this.interactStyle = i;
    }

    public final void setLayout(@Nullable Layout layout) {
        this.layout = layout;
    }

    public final void setShowDuration(long j) {
        this.showDuration = j;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setTextColor(@Nullable String str) {
        this.textColor = str;
    }

    @NotNull
    public String toString() {
        return super.toString() + "id:" + this.id + " elementType:" + this.elementType + " text:" + this.text + " layout:" + this.layout + " action:" + this.action;
    }
}
