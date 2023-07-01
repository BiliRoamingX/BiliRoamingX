package tv.danmaku.bili.ui.offline.api;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@Keep
public final class EpPlayableV2 implements Parcelable {
    @JSONField(name = "ep_qn_check_list")
    @Nullable
    private List<EpPlayableParams> epPlayableParams;
    @JSONField(name = "login")
    private boolean isLogin;
    @NotNull
    public static final C82630a CREATOR = new C82630a();
    public static final int $stable = 8;

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.offline.api.EpPlayableV2$a */
    /* loaded from: classes10.dex */
    public static final class C82630a implements Parcelable.Creator<EpPlayableV2> {
        private C82630a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public EpPlayableV2 createFromParcel(@NotNull Parcel parcel) {
            return new EpPlayableV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public EpPlayableV2[] newArray(int i) {
            return new EpPlayableV2[i];
        }
    }

    public EpPlayableV2() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final List<EpPlayableParams> getEpPlayableParams() {
        return this.epPlayableParams;
    }

    public final boolean isLogin() {
        return this.isLogin;
    }

    public final void setEpPlayableParams(@Nullable List<EpPlayableParams> list) {
        this.epPlayableParams = list;
    }

    public final void setLogin(boolean z) {
        this.isLogin = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeInt(this.isLogin ? 1 : 0);
        parcel.writeTypedList(this.epPlayableParams);
    }

    public EpPlayableV2(@NotNull Parcel parcel) {
        this();
        this.isLogin = parcel.readInt() == 1;
        this.epPlayableParams = parcel.createTypedArrayList(EpPlayableParams.CREATOR);
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes10.dex */
    public static final class EpPlayableParams implements Parcelable {
        @JSONField(name = "ep_id")
        private int epId;
        @JSONField(name = "message")
        @Nullable
        private String message;
        @JSONField(name = "code")
        private int playableType;
        @NotNull
        public static final C82629a CREATOR = new C82629a();
        public static final int $stable = 8;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.offline.api.EpPlayableV2$EpPlayableParams$a */
        /* loaded from: classes10.dex */
        public static final class C82629a implements Parcelable.Creator<EpPlayableParams> {
            private C82629a() {
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a */
            public EpPlayableParams createFromParcel(@NotNull Parcel parcel) {
                return new EpPlayableParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: b */
            public EpPlayableParams[] newArray(int i) {
                return new EpPlayableParams[i];
            }
        }

        public EpPlayableParams() {
            this.epId = -1;
            this.playableType = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int getEpId() {
            return this.epId;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public final int getPlayableType() {
            return this.playableType;
        }

        public final void setEpId(int i) {
            this.epId = i;
        }

        public final void setMessage(@Nullable String str) {
            this.message = str;
        }

        public final void setPlayableType(int i) {
            this.playableType = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeInt(this.epId);
            parcel.writeInt(this.playableType);
            parcel.writeString(this.message);
        }

        public EpPlayableParams(@NotNull Parcel parcel) {
            this();
            this.epId = parcel.readInt();
            this.playableType = parcel.readInt();
            this.message = parcel.readString();
        }
    }
}
