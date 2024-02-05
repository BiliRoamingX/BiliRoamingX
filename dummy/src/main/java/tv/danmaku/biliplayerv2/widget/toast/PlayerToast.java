package tv.danmaku.biliplayerv2.widget.toast;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: BL */
@Keep
/* loaded from: classes16.dex */
public class PlayerToast implements Cloneable {
    private long createTime;
    @Nullable
    private View customView;
    private long duration;
    private int level;
    private int location;
    @NonNull
    public Bundle mToastExtra;
    private int queueType;
    private long refreshDuration;
    private int toastType;
    @Nullable
    private View toastView;

    public PlayerToast(@NonNull Bundle bundle) {
        this.mToastExtra = bundle;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public View getCustomView() {
        return this.customView;
    }

    public long getDuration() {
        return this.duration;
    }

    public boolean getExtraBooleanValue(@NonNull String str, boolean z) {
        return this.mToastExtra.getBoolean(str, z);
    }

    @Nullable
    public Float getExtraFloatValue(@NonNull String str) {
        return this.mToastExtra.getFloat(str, -1.0f);
    }

    @Nullable
    public int[] getExtraIntArray(@NonNull String str) {
        return this.mToastExtra.getIntArray(str);
    }

    public int getExtraIntValue(@NonNull String str) {
        return this.mToastExtra.getInt(str, -1);
    }

    @Nullable
    public Parcelable getExtraParcelable(@NonNull String str) {
        return this.mToastExtra.getParcelable(str);
    }

    @Nullable
    public String getExtraString(@NonNull String str) {
        return this.mToastExtra.getString(str, "");
    }

    public int getLevel() {
        return this.level;
    }

    public int getLocation() {
        return this.location;
    }

    public int getQueueType() {
        return this.queueType;
    }

    public long getRefreshDuration() {
        return this.refreshDuration;
    }

    public int getToastType() {
        return this.toastType;
    }

    @Nullable
    public View getToastView() {
        return this.toastView;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setCustomView(@Nullable View view2) {
        this.customView = view2;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setExtraBoolean(@NonNull String str, boolean z) {
        this.mToastExtra.putBoolean(str, z);
    }

    public void setExtraColorResource(@NonNull String str, @ColorRes int i) {
        setExtraInt(str, i);
    }

    public void setExtraDrawableResource(@NonNull String str, @DrawableRes int i) {
        setExtraInt(str, i);
    }

    public void setExtraFloat(@NonNull String str, float f) {
        this.mToastExtra.putFloat(str, f);
    }

    public void setExtraInt(@NonNull String str, int i) {
        this.mToastExtra.putInt(str, i);
    }

    public void setExtraIntArray(@NonNull String str, @NonNull int[] iArr) {
        this.mToastExtra.putIntArray(str, iArr);
    }

    public void setExtraLayoutId(@NonNull String str, @LayoutRes int i) {
        setExtraInt(str, i);
    }

    public void setExtraParcelable(@NonNull String str, @NonNull Parcelable parcelable) {
        this.mToastExtra.putParcelable(str, parcelable);
    }

    public void setExtraString(@NonNull String str, @NonNull String str2) {
        this.mToastExtra.putString(str, str2);
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setLocation(int i) {
        this.location = i;
    }

    public void setQueueType(int i) {
        this.queueType = i;
    }

    public void setRefreshDuration(long j) {
        this.refreshDuration = j;
    }

    public void setToastType(int i) {
        this.toastType = i;
    }

    public void setToastView(@Nullable View view2) {
        this.toastView = view2;
    }

    @NonNull
    public PlayerToast clone() {
        PlayerToast playerToast = new PlayerToast(new Bundle(this.mToastExtra));
        playerToast.level = this.level;
        playerToast.toastType = this.toastType;
        playerToast.queueType = this.queueType;
        playerToast.duration = this.duration;
        playerToast.createTime = this.createTime;
        playerToast.location = this.location;
        playerToast.refreshDuration = this.refreshDuration;
        return playerToast;
    }

    public int getExtraIntValue(@NonNull String str, int i) {
        return this.mToastExtra.getInt(str, i);
    }
}
