package tv.danmaku.bili.ui.splash.brand.model;

import androidx.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: BL */
@Keep
/* loaded from: classes17.dex */
public final class PreloadBrandData {
    private long beginTime;
    private long endTime;
    private boolean forcibly;
    @NotNull
    private String rule;
    @Nullable
    private List<NormalBrandShow> showList;

    public PreloadBrandData(boolean z, @NotNull String str, @Nullable List<NormalBrandShow> list, long j, long j2) {
        this.forcibly = z;
        this.rule = str;
        this.showList = list;
        this.beginTime = j;
        this.endTime = j2;
    }

    public static /* synthetic */ PreloadBrandData copy$default(PreloadBrandData preloadBrandData, boolean z, String str, List list, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = preloadBrandData.forcibly;
        }
        if ((i & 2) != 0) {
            str = preloadBrandData.rule;
        }
        String str2 = str;
        List<NormalBrandShow> list2 = list;
        if ((i & 4) != 0) {
            list2 = preloadBrandData.showList;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            j = preloadBrandData.beginTime;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = preloadBrandData.endTime;
        }
        return preloadBrandData.copy(z, str2, list3, j3, j2);
    }

    public final boolean component1() {
        return this.forcibly;
    }

    @NotNull
    public final String component2() {
        return this.rule;
    }

    @Nullable
    public final List<NormalBrandShow> component3() {
        return this.showList;
    }

    public final long component4() {
        return this.beginTime;
    }

    public final long component5() {
        return this.endTime;
    }

    @NotNull
    public final PreloadBrandData copy(boolean z, @NotNull String str, @Nullable List<NormalBrandShow> list, long j, long j2) {
        return new PreloadBrandData(z, str, list, j, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PreloadBrandData) {
            PreloadBrandData preloadBrandData = (PreloadBrandData) obj;
            return this.forcibly == preloadBrandData.forcibly && Intrinsics.areEqual(this.rule, preloadBrandData.rule) && Intrinsics.areEqual(this.showList, preloadBrandData.showList) && this.beginTime == preloadBrandData.beginTime && this.endTime == preloadBrandData.endTime;
        }
        return false;
    }

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final boolean getForcibly() {
        return this.forcibly;
    }

    @NotNull
    public final String getRule() {
        return this.rule;
    }

    @Nullable
    public final List<NormalBrandShow> getShowList() {
        return this.showList;
    }

    public final void setBeginTime(long j) {
        this.beginTime = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setForcibly(boolean z) {
        this.forcibly = z;
    }

    public final void setRule(@NotNull String str) {
        this.rule = str;
    }

    public final void setShowList(@Nullable List<NormalBrandShow> list) {
        this.showList = list;
    }

    @NotNull
    public String toString() {
        return "PreloadBrandData(forcibly=" + this.forcibly + ", rule=" + this.rule + ", showList=" + this.showList + ", beginTime=" + this.beginTime + ", endTime=" + this.endTime + ')';
    }
}
