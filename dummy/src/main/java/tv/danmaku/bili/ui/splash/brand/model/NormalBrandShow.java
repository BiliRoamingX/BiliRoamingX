package tv.danmaku.bili.ui.splash.brand.model;

import androidx.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: BL */
@Keep
/* loaded from: classes17.dex */
public final class NormalBrandShow {
    private long beginTime;
    private long duration;
    private long endTime;
    private long id;
    @Nullable
    private String mode;
    private int probability;
    private boolean showLogo;
    @Nullable
    private String source;

    public NormalBrandShow(long j, @Nullable String str, @Nullable String str2, long j2, boolean z, long j3, long j4, int i) {
        this.id = j;
        this.source = str;
        this.mode = str2;
        this.duration = j2;
        this.showLogo = z;
        this.beginTime = j3;
        this.endTime = j4;
        this.probability = i;
    }

    public final long component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.source;
    }

    @Nullable
    public final String component3() {
        return this.mode;
    }

    public final long component4() {
        return this.duration;
    }

    public final boolean component5() {
        return this.showLogo;
    }

    public final long component6() {
        return this.beginTime;
    }

    public final long component7() {
        return this.endTime;
    }

    public final int component8() {
        return this.probability;
    }

    @NotNull
    public final NormalBrandShow copy(long j, @Nullable String str, @Nullable String str2, long j2, boolean z, long j3, long j4, int i) {
        return new NormalBrandShow(j, str, str2, j2, z, j3, j4, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NormalBrandShow) {
            NormalBrandShow normalBrandShow = (NormalBrandShow) obj;
            return this.id == normalBrandShow.id && Intrinsics.areEqual(this.source, normalBrandShow.source) && Intrinsics.areEqual(this.mode, normalBrandShow.mode) && this.duration == normalBrandShow.duration && this.showLogo == normalBrandShow.showLogo && this.beginTime == normalBrandShow.beginTime && this.endTime == normalBrandShow.endTime && this.probability == normalBrandShow.probability;
        }
        return false;
    }

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getMode() {
        return this.mode;
    }

    public final int getProbability() {
        return this.probability;
    }

    public final boolean getShowLogo() {
        return this.showLogo;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final void setBeginTime(long j) {
        this.beginTime = j;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setMode(@Nullable String str) {
        this.mode = str;
    }

    public final void setProbability(int i) {
        this.probability = i;
    }

    public final void setShowLogo(boolean z) {
        this.showLogo = z;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    @NotNull
    public String toString() {
        return "NormalBrandShow(id=" + this.id + ", source=" + this.source + ", mode=" + this.mode + ", duration=" + this.duration + ", showLogo=" + this.showLogo + ", beginTime=" + this.beginTime + ", endTime=" + this.endTime + ", probability=" + this.probability + ')';
    }
}
