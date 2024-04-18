package com.bapis.bilibili.app.distribution.setting.play;

import com.bapis.bilibili.app.distribution.BoolValue;
import com.bapis.bilibili.app.distribution.Int64Value;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class PlayConfig extends GeneratedMessageLite<PlayConfig, PlayConfig.C8387b> implements MessageLiteOrBuilder {
    public static final int COLORFILTER_FIELD_NUMBER = 11;
    private static final PlayConfig DEFAULT_INSTANCE;
    public static final int ENABLEDANMAKUINTERACTION_FIELD_NUMBER = 4;
    public static final int ENABLEDANMAKUMONOSPACED_FIELD_NUMBER = 8;
    public static final int ENABLEEDITSUBTITLE_FIELD_NUMBER = 9;
    public static final int ENABLEGRAVITYROTATESCREEN_FIELD_NUMBER = 7;
    public static final int ENABLEPLAYURLHTTPS_FIELD_NUMBER = 3;
    public static final int ENABLESUBTITLE_FIELD_NUMBER = 10;
    public static final int LANDSCAPEAUTOSTORY_FIELD_NUMBER = 13;
    private static volatile Parser<PlayConfig> PARSER = null;
    public static final int PLAYERCODECMODEKEY_FIELD_NUMBER = 6;
    public static final int SHOULDAUTOFULLSCREEN_FIELD_NUMBER = 2;
    public static final int SHOULDAUTOPLAY_FIELD_NUMBER = 1;
    public static final int SHOULDAUTOSTORY_FIELD_NUMBER = 12;
    public static final int SMALLSCREENSTATUS_FIELD_NUMBER = 5;
    public static final int VOLUMEBALANCE_FIELD_NUMBER = 14;
    private Int64Value colorFilter_;
    private BoolValue enableDanmakuInteraction_;
    private BoolValue enableDanmakuMonospaced_;
    private BoolValue enableEditSubtitle_;
    private BoolValue enableGravityRotateScreen_;
    private BoolValue enablePlayurlHTTPS_;
    private BoolValue enableSubtitle_;
    private BoolValue landscapeAutoStory_;
    private Int64Value playerCodecModeKey_;
    private BoolValue shouldAutoFullScreen_;
    private BoolValue shouldAutoPlay_;
    private BoolValue shouldAutoStory_;
    private Int64Value smallScreenStatus_;
    private BoolValue volumeBalance_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.play.PlayConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8386a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19947xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19947xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19947xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19947xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19947xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19947xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19947xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19947xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.play.PlayConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8387b extends GeneratedMessageLite.Builder<PlayConfig, C8387b> implements MessageLiteOrBuilder {
        /* synthetic */ C8387b(C8386a c8386a) {
            this();
        }

        public C8387b clearColorFilter() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearColorFilter();
            return this;
        }

        public C8387b clearEnableDanmakuInteraction() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearEnableDanmakuInteraction();
            return this;
        }

        public C8387b clearEnableDanmakuMonospaced() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearEnableDanmakuMonospaced();
            return this;
        }

        public C8387b clearEnableEditSubtitle() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearEnableEditSubtitle();
            return this;
        }

        public C8387b clearEnableGravityRotateScreen() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearEnableGravityRotateScreen();
            return this;
        }

        public C8387b clearEnablePlayurlHTTPS() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearEnablePlayurlHTTPS();
            return this;
        }

        public C8387b clearEnableSubtitle() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearEnableSubtitle();
            return this;
        }

        public C8387b clearLandscapeAutoStory() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearLandscapeAutoStory();
            return this;
        }

        public C8387b clearPlayerCodecModeKey() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearPlayerCodecModeKey();
            return this;
        }

        public C8387b clearShouldAutoFullScreen() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearShouldAutoFullScreen();
            return this;
        }

        public C8387b clearShouldAutoPlay() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearShouldAutoPlay();
            return this;
        }

        public C8387b clearShouldAutoStory() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearShouldAutoStory();
            return this;
        }

        public C8387b clearSmallScreenStatus() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearSmallScreenStatus();
            return this;
        }

        public C8387b clearVolumeBalance() {
            copyOnWrite();
            ((PlayConfig) this.instance).clearVolumeBalance();
            return this;
        }

        public Int64Value getColorFilter() {
            return ((PlayConfig) this.instance).getColorFilter();
        }

        public BoolValue getEnableDanmakuInteraction() {
            return ((PlayConfig) this.instance).getEnableDanmakuInteraction();
        }

        public BoolValue getEnableDanmakuMonospaced() {
            return ((PlayConfig) this.instance).getEnableDanmakuMonospaced();
        }

        public BoolValue getEnableEditSubtitle() {
            return ((PlayConfig) this.instance).getEnableEditSubtitle();
        }

        public BoolValue getEnableGravityRotateScreen() {
            return ((PlayConfig) this.instance).getEnableGravityRotateScreen();
        }

        public BoolValue getEnablePlayurlHTTPS() {
            return ((PlayConfig) this.instance).getEnablePlayurlHTTPS();
        }

        public BoolValue getEnableSubtitle() {
            return ((PlayConfig) this.instance).getEnableSubtitle();
        }

        public BoolValue getLandscapeAutoStory() {
            return ((PlayConfig) this.instance).getLandscapeAutoStory();
        }

        public Int64Value getPlayerCodecModeKey() {
            return ((PlayConfig) this.instance).getPlayerCodecModeKey();
        }

        public BoolValue getShouldAutoFullScreen() {
            return ((PlayConfig) this.instance).getShouldAutoFullScreen();
        }

        public BoolValue getShouldAutoPlay() {
            return ((PlayConfig) this.instance).getShouldAutoPlay();
        }

        public BoolValue getShouldAutoStory() {
            return ((PlayConfig) this.instance).getShouldAutoStory();
        }

        public Int64Value getSmallScreenStatus() {
            return ((PlayConfig) this.instance).getSmallScreenStatus();
        }

        public BoolValue getVolumeBalance() {
            return ((PlayConfig) this.instance).getVolumeBalance();
        }

        public boolean hasColorFilter() {
            return ((PlayConfig) this.instance).hasColorFilter();
        }

        public boolean hasEnableDanmakuInteraction() {
            return ((PlayConfig) this.instance).hasEnableDanmakuInteraction();
        }

        public boolean hasEnableDanmakuMonospaced() {
            return ((PlayConfig) this.instance).hasEnableDanmakuMonospaced();
        }

        public boolean hasEnableEditSubtitle() {
            return ((PlayConfig) this.instance).hasEnableEditSubtitle();
        }

        public boolean hasEnableGravityRotateScreen() {
            return ((PlayConfig) this.instance).hasEnableGravityRotateScreen();
        }

        public boolean hasEnablePlayurlHTTPS() {
            return ((PlayConfig) this.instance).hasEnablePlayurlHTTPS();
        }

        public boolean hasEnableSubtitle() {
            return ((PlayConfig) this.instance).hasEnableSubtitle();
        }

        public boolean hasLandscapeAutoStory() {
            return ((PlayConfig) this.instance).hasLandscapeAutoStory();
        }

        public boolean hasPlayerCodecModeKey() {
            return ((PlayConfig) this.instance).hasPlayerCodecModeKey();
        }

        public boolean hasShouldAutoFullScreen() {
            return ((PlayConfig) this.instance).hasShouldAutoFullScreen();
        }

        public boolean hasShouldAutoPlay() {
            return ((PlayConfig) this.instance).hasShouldAutoPlay();
        }

        public boolean hasShouldAutoStory() {
            return ((PlayConfig) this.instance).hasShouldAutoStory();
        }

        public boolean hasSmallScreenStatus() {
            return ((PlayConfig) this.instance).hasSmallScreenStatus();
        }

        public boolean hasVolumeBalance() {
            return ((PlayConfig) this.instance).hasVolumeBalance();
        }

        public C8387b mergeColorFilter(Int64Value int64Value) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeColorFilter(int64Value);
            return this;
        }

        public C8387b mergeEnableDanmakuInteraction(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeEnableDanmakuInteraction(boolValue);
            return this;
        }

        public C8387b mergeEnableDanmakuMonospaced(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeEnableDanmakuMonospaced(boolValue);
            return this;
        }

        public C8387b mergeEnableEditSubtitle(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeEnableEditSubtitle(boolValue);
            return this;
        }

        public C8387b mergeEnableGravityRotateScreen(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeEnableGravityRotateScreen(boolValue);
            return this;
        }

        public C8387b mergeEnablePlayurlHTTPS(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeEnablePlayurlHTTPS(boolValue);
            return this;
        }

        public C8387b mergeEnableSubtitle(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeEnableSubtitle(boolValue);
            return this;
        }

        public C8387b mergeLandscapeAutoStory(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeLandscapeAutoStory(boolValue);
            return this;
        }

        public C8387b mergePlayerCodecModeKey(Int64Value int64Value) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergePlayerCodecModeKey(int64Value);
            return this;
        }

        public C8387b mergeShouldAutoFullScreen(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeShouldAutoFullScreen(boolValue);
            return this;
        }

        public C8387b mergeShouldAutoPlay(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeShouldAutoPlay(boolValue);
            return this;
        }

        public C8387b mergeShouldAutoStory(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeShouldAutoStory(boolValue);
            return this;
        }

        public C8387b mergeSmallScreenStatus(Int64Value int64Value) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeSmallScreenStatus(int64Value);
            return this;
        }

        public C8387b mergeVolumeBalance(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).mergeVolumeBalance(boolValue);
            return this;
        }

        public C8387b setColorFilter(Int64Value int64Value) {
            copyOnWrite();
            ((PlayConfig) this.instance).setColorFilter(int64Value);
            return this;
        }

        public C8387b setEnableDanmakuInteraction(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).setEnableDanmakuInteraction(boolValue);
            return this;
        }

        public C8387b setEnableDanmakuMonospaced(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).setEnableDanmakuMonospaced(boolValue);
            return this;
        }

        public C8387b setEnableEditSubtitle(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).setEnableEditSubtitle(boolValue);
            return this;
        }

        public C8387b setEnableGravityRotateScreen(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).setEnableGravityRotateScreen(boolValue);
            return this;
        }

        public C8387b setEnablePlayurlHTTPS(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).setEnablePlayurlHTTPS(boolValue);
            return this;
        }

        public C8387b setEnableSubtitle(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).setEnableSubtitle(boolValue);
            return this;
        }

        public C8387b setLandscapeAutoStory(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).setLandscapeAutoStory(boolValue);
            return this;
        }

        public C8387b setPlayerCodecModeKey(Int64Value int64Value) {
            copyOnWrite();
            ((PlayConfig) this.instance).setPlayerCodecModeKey(int64Value);
            return this;
        }

        public C8387b setShouldAutoFullScreen(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).setShouldAutoFullScreen(boolValue);
            return this;
        }

        public C8387b setShouldAutoPlay(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).setShouldAutoPlay(boolValue);
            return this;
        }

        public C8387b setShouldAutoStory(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).setShouldAutoStory(boolValue);
            return this;
        }

        public C8387b setSmallScreenStatus(Int64Value int64Value) {
            copyOnWrite();
            ((PlayConfig) this.instance).setSmallScreenStatus(int64Value);
            return this;
        }

        public C8387b setVolumeBalance(BoolValue boolValue) {
            copyOnWrite();
            ((PlayConfig) this.instance).setVolumeBalance(boolValue);
            return this;
        }

        private C8387b() {
            super(PlayConfig.DEFAULT_INSTANCE);
        }

        public C8387b setColorFilter(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setColorFilter(c8322b.build());
            return this;
        }

        public C8387b setEnableDanmakuInteraction(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setEnableDanmakuInteraction(c8307b.build());
            return this;
        }

        public C8387b setEnableDanmakuMonospaced(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setEnableDanmakuMonospaced(c8307b.build());
            return this;
        }

        public C8387b setEnableEditSubtitle(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setEnableEditSubtitle(c8307b.build());
            return this;
        }

        public C8387b setEnableGravityRotateScreen(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setEnableGravityRotateScreen(c8307b.build());
            return this;
        }

        public C8387b setEnablePlayurlHTTPS(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setEnablePlayurlHTTPS(c8307b.build());
            return this;
        }

        public C8387b setEnableSubtitle(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setEnableSubtitle(c8307b.build());
            return this;
        }

        public C8387b setLandscapeAutoStory(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setLandscapeAutoStory(c8307b.build());
            return this;
        }

        public C8387b setPlayerCodecModeKey(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setPlayerCodecModeKey(c8322b.build());
            return this;
        }

        public C8387b setShouldAutoFullScreen(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setShouldAutoFullScreen(c8307b.build());
            return this;
        }

        public C8387b setShouldAutoPlay(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setShouldAutoPlay(c8307b.build());
            return this;
        }

        public C8387b setShouldAutoStory(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setShouldAutoStory(c8307b.build());
            return this;
        }

        public C8387b setSmallScreenStatus(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setSmallScreenStatus(c8322b.build());
            return this;
        }

        public C8387b setVolumeBalance(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PlayConfig) this.instance).setVolumeBalance(c8307b.build());
            return this;
        }
    }

    static {
        PlayConfig playConfig = new PlayConfig();
        DEFAULT_INSTANCE = playConfig;
        GeneratedMessageLite.registerDefaultInstance(PlayConfig.class, playConfig);
    }

    private PlayConfig() {
    }

    public void clearColorFilter() {
        this.colorFilter_ = null;
    }

    public void clearEnableDanmakuInteraction() {
        this.enableDanmakuInteraction_ = null;
    }

    public void clearEnableDanmakuMonospaced() {
        this.enableDanmakuMonospaced_ = null;
    }

    public void clearEnableEditSubtitle() {
        this.enableEditSubtitle_ = null;
    }

    public void clearEnableGravityRotateScreen() {
        this.enableGravityRotateScreen_ = null;
    }

    public void clearEnablePlayurlHTTPS() {
        this.enablePlayurlHTTPS_ = null;
    }

    public void clearEnableSubtitle() {
        this.enableSubtitle_ = null;
    }

    public void clearLandscapeAutoStory() {
        this.landscapeAutoStory_ = null;
    }

    public void clearPlayerCodecModeKey() {
        this.playerCodecModeKey_ = null;
    }

    public void clearShouldAutoFullScreen() {
        this.shouldAutoFullScreen_ = null;
    }

    public void clearShouldAutoPlay() {
        this.shouldAutoPlay_ = null;
    }

    public void clearShouldAutoStory() {
        this.shouldAutoStory_ = null;
    }

    public void clearSmallScreenStatus() {
        this.smallScreenStatus_ = null;
    }

    public void clearVolumeBalance() {
        this.volumeBalance_ = null;
    }

    public static PlayConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeColorFilter(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.colorFilter_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.colorFilter_ = Int64Value.newBuilder(this.colorFilter_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.colorFilter_ = int64Value;
        }
    }

    public void mergeEnableDanmakuInteraction(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableDanmakuInteraction_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableDanmakuInteraction_ = BoolValue.newBuilder(this.enableDanmakuInteraction_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableDanmakuInteraction_ = boolValue;
        }
    }

    public void mergeEnableDanmakuMonospaced(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableDanmakuMonospaced_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableDanmakuMonospaced_ = BoolValue.newBuilder(this.enableDanmakuMonospaced_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableDanmakuMonospaced_ = boolValue;
        }
    }

    public void mergeEnableEditSubtitle(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableEditSubtitle_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableEditSubtitle_ = BoolValue.newBuilder(this.enableEditSubtitle_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableEditSubtitle_ = boolValue;
        }
    }

    public void mergeEnableGravityRotateScreen(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableGravityRotateScreen_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableGravityRotateScreen_ = BoolValue.newBuilder(this.enableGravityRotateScreen_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableGravityRotateScreen_ = boolValue;
        }
    }

    public void mergeEnablePlayurlHTTPS(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enablePlayurlHTTPS_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enablePlayurlHTTPS_ = BoolValue.newBuilder(this.enablePlayurlHTTPS_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enablePlayurlHTTPS_ = boolValue;
        }
    }

    public void mergeEnableSubtitle(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableSubtitle_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableSubtitle_ = BoolValue.newBuilder(this.enableSubtitle_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableSubtitle_ = boolValue;
        }
    }

    public void mergeLandscapeAutoStory(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.landscapeAutoStory_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.landscapeAutoStory_ = BoolValue.newBuilder(this.landscapeAutoStory_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.landscapeAutoStory_ = boolValue;
        }
    }

    public void mergePlayerCodecModeKey(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.playerCodecModeKey_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.playerCodecModeKey_ = Int64Value.newBuilder(this.playerCodecModeKey_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.playerCodecModeKey_ = int64Value;
        }
    }

    public void mergeShouldAutoFullScreen(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.shouldAutoFullScreen_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.shouldAutoFullScreen_ = BoolValue.newBuilder(this.shouldAutoFullScreen_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.shouldAutoFullScreen_ = boolValue;
        }
    }

    public void mergeShouldAutoPlay(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.shouldAutoPlay_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.shouldAutoPlay_ = BoolValue.newBuilder(this.shouldAutoPlay_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.shouldAutoPlay_ = boolValue;
        }
    }

    public void mergeShouldAutoStory(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.shouldAutoStory_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.shouldAutoStory_ = BoolValue.newBuilder(this.shouldAutoStory_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.shouldAutoStory_ = boolValue;
        }
    }

    public void mergeSmallScreenStatus(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.smallScreenStatus_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.smallScreenStatus_ = Int64Value.newBuilder(this.smallScreenStatus_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.smallScreenStatus_ = int64Value;
        }
    }

    public void mergeVolumeBalance(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.volumeBalance_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.volumeBalance_ = BoolValue.newBuilder(this.volumeBalance_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.volumeBalance_ = boolValue;
        }
    }

    public static C8387b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setColorFilter(Int64Value int64Value) {
        int64Value.getClass();
        this.colorFilter_ = int64Value;
    }

    public void setEnableDanmakuInteraction(BoolValue boolValue) {
        boolValue.getClass();
        this.enableDanmakuInteraction_ = boolValue;
    }

    public void setEnableDanmakuMonospaced(BoolValue boolValue) {
        boolValue.getClass();
        this.enableDanmakuMonospaced_ = boolValue;
    }

    public void setEnableEditSubtitle(BoolValue boolValue) {
        boolValue.getClass();
        this.enableEditSubtitle_ = boolValue;
    }

    public void setEnableGravityRotateScreen(BoolValue boolValue) {
        boolValue.getClass();
        this.enableGravityRotateScreen_ = boolValue;
    }

    public void setEnablePlayurlHTTPS(BoolValue boolValue) {
        boolValue.getClass();
        this.enablePlayurlHTTPS_ = boolValue;
    }

    public void setEnableSubtitle(BoolValue boolValue) {
        boolValue.getClass();
        this.enableSubtitle_ = boolValue;
    }

    public void setLandscapeAutoStory(BoolValue boolValue) {
        boolValue.getClass();
        this.landscapeAutoStory_ = boolValue;
    }

    public void setPlayerCodecModeKey(Int64Value int64Value) {
        int64Value.getClass();
        this.playerCodecModeKey_ = int64Value;
    }

    public void setShouldAutoFullScreen(BoolValue boolValue) {
        boolValue.getClass();
        this.shouldAutoFullScreen_ = boolValue;
    }

    public void setShouldAutoPlay(BoolValue boolValue) {
        boolValue.getClass();
        this.shouldAutoPlay_ = boolValue;
    }

    public void setShouldAutoStory(BoolValue boolValue) {
        boolValue.getClass();
        this.shouldAutoStory_ = boolValue;
    }

    public void setSmallScreenStatus(Int64Value int64Value) {
        int64Value.getClass();
        this.smallScreenStatus_ = int64Value;
    }

    public void setVolumeBalance(BoolValue boolValue) {
        boolValue.getClass();
        this.volumeBalance_ = boolValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8386a.f19947xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayConfig();
            case 2:
                return new C8387b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t", new Object[]{"shouldAutoPlay_", "shouldAutoFullScreen_", "enablePlayurlHTTPS_", "enableDanmakuInteraction_", "smallScreenStatus_", "playerCodecModeKey_", "enableGravityRotateScreen_", "enableDanmakuMonospaced_", "enableEditSubtitle_", "enableSubtitle_", "colorFilter_", "shouldAutoStory_", "landscapeAutoStory_", "volumeBalance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayConfig.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Int64Value getColorFilter() {
        Int64Value int64Value = this.colorFilter_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public BoolValue getEnableDanmakuInteraction() {
        BoolValue boolValue = this.enableDanmakuInteraction_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getEnableDanmakuMonospaced() {
        BoolValue boolValue = this.enableDanmakuMonospaced_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getEnableEditSubtitle() {
        BoolValue boolValue = this.enableEditSubtitle_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getEnableGravityRotateScreen() {
        BoolValue boolValue = this.enableGravityRotateScreen_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getEnablePlayurlHTTPS() {
        BoolValue boolValue = this.enablePlayurlHTTPS_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getEnableSubtitle() {
        BoolValue boolValue = this.enableSubtitle_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getLandscapeAutoStory() {
        BoolValue boolValue = this.landscapeAutoStory_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public Int64Value getPlayerCodecModeKey() {
        Int64Value int64Value = this.playerCodecModeKey_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public BoolValue getShouldAutoFullScreen() {
        BoolValue boolValue = this.shouldAutoFullScreen_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getShouldAutoPlay() {
        BoolValue boolValue = this.shouldAutoPlay_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getShouldAutoStory() {
        BoolValue boolValue = this.shouldAutoStory_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public Int64Value getSmallScreenStatus() {
        Int64Value int64Value = this.smallScreenStatus_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public BoolValue getVolumeBalance() {
        BoolValue boolValue = this.volumeBalance_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public boolean hasColorFilter() {
        return this.colorFilter_ != null;
    }

    public boolean hasEnableDanmakuInteraction() {
        return this.enableDanmakuInteraction_ != null;
    }

    public boolean hasEnableDanmakuMonospaced() {
        return this.enableDanmakuMonospaced_ != null;
    }

    public boolean hasEnableEditSubtitle() {
        return this.enableEditSubtitle_ != null;
    }

    public boolean hasEnableGravityRotateScreen() {
        return this.enableGravityRotateScreen_ != null;
    }

    public boolean hasEnablePlayurlHTTPS() {
        return this.enablePlayurlHTTPS_ != null;
    }

    public boolean hasEnableSubtitle() {
        return this.enableSubtitle_ != null;
    }

    public boolean hasLandscapeAutoStory() {
        return this.landscapeAutoStory_ != null;
    }

    public boolean hasPlayerCodecModeKey() {
        return this.playerCodecModeKey_ != null;
    }

    public boolean hasShouldAutoFullScreen() {
        return this.shouldAutoFullScreen_ != null;
    }

    public boolean hasShouldAutoPlay() {
        return this.shouldAutoPlay_ != null;
    }

    public boolean hasShouldAutoStory() {
        return this.shouldAutoStory_ != null;
    }

    public boolean hasSmallScreenStatus() {
        return this.smallScreenStatus_ != null;
    }

    public boolean hasVolumeBalance() {
        return this.volumeBalance_ != null;
    }

    public static C8387b newBuilder(PlayConfig playConfig) {
        return DEFAULT_INSTANCE.createBuilder(playConfig);
    }

    public static PlayConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayConfig parseFrom(InputStream inputStream) throws IOException {
        return (PlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
