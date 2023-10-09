package tv.danmaku.bili.ui.splash.event;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
@Keep
/* loaded from: classes15.dex */
public final class Layout {
    @JSONField(name = "bottom_percent")
    private float bottomPercent;
    @JSONField(name = "bottom_px")
    private int bottomPx;
    @JSONField(name = "height_percent")
    private float heightPercent;
    @JSONField(name = "height_px")
    private int heightPx;
    @JSONField(name = "layout_type")
    private int layoutType;
    @JSONField(name = "left_percent")
    private float leftPercent;
    @JSONField(name = "left_px")
    private int leftPx;
    @JSONField(name = "top_percent")
    private float topPercent;
    @JSONField(name = "top_px")
    private int topPx;
    @JSONField(name = "width_percent")
    private float widthPercent;
    @JSONField(name = "width_px")
    private int widthPx;

    public final float getBottomPercent() {
        return this.bottomPercent;
    }

    public final int getBottomPx() {
        return this.bottomPx;
    }

    public final float getHeightPercent() {
        return this.heightPercent;
    }

    public final int getHeightPx() {
        return this.heightPx;
    }

    public final int getLayoutType() {
        return this.layoutType;
    }

    public final float getLeftPercent() {
        return this.leftPercent;
    }

    public final int getLeftPx() {
        return this.leftPx;
    }

    public final float getTopPercent() {
        return this.topPercent;
    }

    public final int getTopPx() {
        return this.topPx;
    }

    public final float getWidthPercent() {
        return this.widthPercent;
    }

    public final int getWidthPx() {
        return this.widthPx;
    }

    public final boolean isValid() {
        if (this.widthPx == 0 || this.heightPx == 0) {
            if (!(this.widthPercent == 0.0f)) {
                if (!(this.heightPercent == 0.0f)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void setBottomPercent(float f) {
        this.bottomPercent = f;
    }

    public final void setBottomPx(int i) {
        this.bottomPx = i;
    }

    public final void setHeightPercent(float f) {
        this.heightPercent = f;
    }

    public final void setHeightPx(int i) {
        this.heightPx = i;
    }

    public final void setLayoutType(int i) {
        this.layoutType = i;
    }

    public final void setLeftPercent(float f) {
        this.leftPercent = f;
    }

    public final void setLeftPx(int i) {
        this.leftPx = i;
    }

    public final void setTopPercent(float f) {
        this.topPercent = f;
    }

    public final void setTopPx(int i) {
        this.topPx = i;
    }

    public final void setWidthPercent(float f) {
        this.widthPercent = f;
    }

    public final void setWidthPx(int i) {
        this.widthPx = i;
    }
}
