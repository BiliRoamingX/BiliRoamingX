package tv.danmaku.bili.ui.splash.brand.model;

import androidx.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: BL */
@Keep
/* loaded from: classes17.dex */
public final class BrandSplash {
    private long id;
    private boolean isCustomModeOn;
    private boolean isDisabled;
    private boolean isSelected;
    @Nullable
    private String logoHash;
    @Nullable
    private String logoUrl;
    @Nullable
    private String mode;
    private boolean showLogo;
    @Nullable
    private String source;
    @Nullable
    private String thumb;
    @Nullable
    private String thumbHash;
    @Nullable
    private String thumbName;

    public BrandSplash(long j, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, boolean z, boolean z2, boolean z3, boolean z4) {
        this.id = j;
        this.thumb = str;
        this.thumbHash = str2;
        this.thumbName = str3;
        this.logoUrl = str4;
        this.logoHash = str5;
        this.mode = str6;
        this.source = str7;
        this.showLogo = z;
        this.isSelected = z2;
        this.isDisabled = z3;
        this.isCustomModeOn = z4;
    }

    public final long component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.isSelected;
    }

    public final boolean component11() {
        return this.isDisabled;
    }

    public final boolean component12() {
        return this.isCustomModeOn;
    }

    @Nullable
    public final String component2() {
        return this.thumb;
    }

    @Nullable
    public final String component3() {
        return this.thumbHash;
    }

    @Nullable
    public final String component4() {
        return this.thumbName;
    }

    @Nullable
    public final String component5() {
        return this.logoUrl;
    }

    @Nullable
    public final String component6() {
        return this.logoHash;
    }

    @Nullable
    public final String component7() {
        return this.mode;
    }

    @Nullable
    public final String component8() {
        return this.source;
    }

    public final boolean component9() {
        return this.showLogo;
    }

    @NotNull
    public final BrandSplash copy(long j, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, boolean z, boolean z2, boolean z3, boolean z4) {
        return new BrandSplash(j, str, str2, str3, str4, str5, str6, str7, z, z2, z3, z4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrandSplash) {
            BrandSplash brandSplash = (BrandSplash) obj;
            return this.id == brandSplash.id && Intrinsics.areEqual(this.thumb, brandSplash.thumb) && Intrinsics.areEqual(this.thumbHash, brandSplash.thumbHash) && Intrinsics.areEqual(this.thumbName, brandSplash.thumbName) && Intrinsics.areEqual(this.logoUrl, brandSplash.logoUrl) && Intrinsics.areEqual(this.logoHash, brandSplash.logoHash) && Intrinsics.areEqual(this.mode, brandSplash.mode) && Intrinsics.areEqual(this.source, brandSplash.source) && this.showLogo == brandSplash.showLogo && this.isSelected == brandSplash.isSelected && this.isDisabled == brandSplash.isDisabled && this.isCustomModeOn == brandSplash.isCustomModeOn;
        }
        return false;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getLogoHash() {
        return this.logoHash;
    }

    @Nullable
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @Nullable
    public final String getMode() {
        return this.mode;
    }

    public final boolean getShowLogo() {
        return this.showLogo;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getThumb() {
        return this.thumb;
    }

    @Nullable
    public final String getThumbHash() {
        return this.thumbHash;
    }

    @Nullable
    public final String getThumbName() {
        return this.thumbName;
    }

    public final boolean isCustomModeOn() {
        return this.isCustomModeOn;
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setCustomModeOn(boolean z) {
        this.isCustomModeOn = z;
    }

    public final void setDisabled(boolean z) {
        this.isDisabled = z;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setLogoHash(@Nullable String str) {
        this.logoHash = str;
    }

    public final void setLogoUrl(@Nullable String str) {
        this.logoUrl = str;
    }

    public final void setMode(@Nullable String str) {
        this.mode = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setShowLogo(boolean z) {
        this.showLogo = z;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    public final void setThumb(@Nullable String str) {
        this.thumb = str;
    }

    public final void setThumbHash(@Nullable String str) {
        this.thumbHash = str;
    }

    public final void setThumbName(@Nullable String str) {
        this.thumbName = str;
    }

    @NotNull
    public String toString() {
        return "BrandSplash(id=" + this.id + ", thumb=" + this.thumb + ", thumbHash=" + this.thumbHash + ", thumbName=" + this.thumbName + ", logoUrl=" + this.logoUrl + ", logoHash=" + this.logoHash + ", mode=" + this.mode + ", source=" + this.source + ", showLogo=" + this.showLogo + ", isSelected=" + this.isSelected + ", isDisabled=" + this.isDisabled + ", isCustomModeOn=" + this.isCustomModeOn + ')';
    }
}
