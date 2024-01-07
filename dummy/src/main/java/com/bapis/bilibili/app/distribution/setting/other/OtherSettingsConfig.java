package com.bapis.bilibili.app.distribution.setting.other;

import com.bapis.bilibili.app.distribution.BoolValue;
import com.bapis.bilibili.app.distribution.Int64Value;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class OtherSettingsConfig extends GeneratedMessageLite<OtherSettingsConfig, OtherSettingsConfig.C8373b> implements MessageLiteOrBuilder {
    private static final OtherSettingsConfig DEFAULT_INSTANCE;
    public static final int ENABLEGUIDESCREENSHOTSHARE_FIELD_NUMBER = 8;
    public static final int ENABLEREADPASTEBOARD_FIELD_NUMBER = 3;
    public static final int ENABLERESUMEPLAYING_FIELD_NUMBER = 6;
    public static final int ENABLEWIFIAUTOUPDATE_FIELD_NUMBER = 7;
    public static final int MINISCREENPLAYWHENBACK_FIELD_NUMBER = 5;
    private static volatile Parser<OtherSettingsConfig> PARSER = null;
    public static final int PASTEAUTOJUMP_FIELD_NUMBER = 4;
    public static final int WATERMARKTYPE_FIELD_NUMBER = 1;
    public static final int WEBIMAGEQUALITYTYPE_FIELD_NUMBER = 2;
    private BoolValue enableGuideScreenshotShare_;
    private BoolValue enableReadPasteboard_;
    private BoolValue enableResumePlaying_;
    private BoolValue enableWifiAutoUpdate_;
    private BoolValue miniScreenPlayWhenBack_;
    private BoolValue pasteAutoJump_;
    private Int64Value watermarkType_;
    private Int64Value webImageQualityType_;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public enum WatermarkType implements Internal.EnumLite {
        WT_UNKNOW(0),
        None(1),
        Center(2),
        BottomRight(3),
        UNRECOGNIZED(-1);
        
        public static final int BottomRight_VALUE = 3;
        public static final int Center_VALUE = 2;
        public static final int None_VALUE = 1;
        public static final int WT_UNKNOW_VALUE = 0;
        private static final Internal.EnumLiteMap<WatermarkType> internalValueMap = new C8368a();
        private final int value;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.distribution.setting.other.OtherSettingsConfig$WatermarkType$a */
        /* loaded from: classes13.dex */
        static class C8368a implements Internal.EnumLiteMap<WatermarkType> {
            C8368a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WatermarkType findValueByNumber(int i) {
                return WatermarkType.forNumber(i);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.distribution.setting.other.OtherSettingsConfig$WatermarkType$b */
        /* loaded from: classes13.dex */
        private static final class C8369b implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new C8369b();

            private C8369b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return WatermarkType.forNumber(i) != null;
            }
        }

        WatermarkType(int i) {
            this.value = i;
        }

        public static WatermarkType forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return BottomRight;
                    }
                    return Center;
                }
                return None;
            }
            return WT_UNKNOW;
        }

        public static Internal.EnumLiteMap<WatermarkType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C8369b.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static WatermarkType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public enum WebImageQualityType implements Internal.EnumLite {
        High(0),
        Low(1),
        Auto(2),
        UNRECOGNIZED(-1);
        
        public static final int Auto_VALUE = 2;
        public static final int High_VALUE = 0;
        public static final int Low_VALUE = 1;
        private static final Internal.EnumLiteMap<WebImageQualityType> internalValueMap = new C8370a();
        private final int value;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.distribution.setting.other.OtherSettingsConfig$WebImageQualityType$a */
        /* loaded from: classes13.dex */
        static class C8370a implements Internal.EnumLiteMap<WebImageQualityType> {
            C8370a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WebImageQualityType findValueByNumber(int i) {
                return WebImageQualityType.forNumber(i);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.distribution.setting.other.OtherSettingsConfig$WebImageQualityType$b */
        /* loaded from: classes13.dex */
        private static final class C8371b implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new C8371b();

            private C8371b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return WebImageQualityType.forNumber(i) != null;
            }
        }

        WebImageQualityType(int i) {
            this.value = i;
        }

        public static WebImageQualityType forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return Auto;
                }
                return Low;
            }
            return High;
        }

        public static Internal.EnumLiteMap<WebImageQualityType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C8371b.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static WebImageQualityType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.other.OtherSettingsConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8372a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19940xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19940xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19940xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19940xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19940xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19940xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19940xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19940xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.other.OtherSettingsConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8373b extends GeneratedMessageLite.Builder<OtherSettingsConfig, C8373b> implements MessageLiteOrBuilder {
        /* synthetic */ C8373b(C8372a c8372a) {
            this();
        }

        public C8373b clearEnableGuideScreenshotShare() {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).clearEnableGuideScreenshotShare();
            return this;
        }

        public C8373b clearEnableReadPasteboard() {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).clearEnableReadPasteboard();
            return this;
        }

        public C8373b clearEnableResumePlaying() {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).clearEnableResumePlaying();
            return this;
        }

        public C8373b clearEnableWifiAutoUpdate() {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).clearEnableWifiAutoUpdate();
            return this;
        }

        public C8373b clearMiniScreenPlayWhenBack() {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).clearMiniScreenPlayWhenBack();
            return this;
        }

        public C8373b clearPasteAutoJump() {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).clearPasteAutoJump();
            return this;
        }

        public C8373b clearWatermarkType() {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).clearWatermarkType();
            return this;
        }

        public C8373b clearWebImageQualityType() {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).clearWebImageQualityType();
            return this;
        }

        public BoolValue getEnableGuideScreenshotShare() {
            return ((OtherSettingsConfig) this.instance).getEnableGuideScreenshotShare();
        }

        public BoolValue getEnableReadPasteboard() {
            return ((OtherSettingsConfig) this.instance).getEnableReadPasteboard();
        }

        public BoolValue getEnableResumePlaying() {
            return ((OtherSettingsConfig) this.instance).getEnableResumePlaying();
        }

        public BoolValue getEnableWifiAutoUpdate() {
            return ((OtherSettingsConfig) this.instance).getEnableWifiAutoUpdate();
        }

        public BoolValue getMiniScreenPlayWhenBack() {
            return ((OtherSettingsConfig) this.instance).getMiniScreenPlayWhenBack();
        }

        public BoolValue getPasteAutoJump() {
            return ((OtherSettingsConfig) this.instance).getPasteAutoJump();
        }

        public Int64Value getWatermarkType() {
            return ((OtherSettingsConfig) this.instance).getWatermarkType();
        }

        public Int64Value getWebImageQualityType() {
            return ((OtherSettingsConfig) this.instance).getWebImageQualityType();
        }

        public boolean hasEnableGuideScreenshotShare() {
            return ((OtherSettingsConfig) this.instance).hasEnableGuideScreenshotShare();
        }

        public boolean hasEnableReadPasteboard() {
            return ((OtherSettingsConfig) this.instance).hasEnableReadPasteboard();
        }

        public boolean hasEnableResumePlaying() {
            return ((OtherSettingsConfig) this.instance).hasEnableResumePlaying();
        }

        public boolean hasEnableWifiAutoUpdate() {
            return ((OtherSettingsConfig) this.instance).hasEnableWifiAutoUpdate();
        }

        public boolean hasMiniScreenPlayWhenBack() {
            return ((OtherSettingsConfig) this.instance).hasMiniScreenPlayWhenBack();
        }

        public boolean hasPasteAutoJump() {
            return ((OtherSettingsConfig) this.instance).hasPasteAutoJump();
        }

        public boolean hasWatermarkType() {
            return ((OtherSettingsConfig) this.instance).hasWatermarkType();
        }

        public boolean hasWebImageQualityType() {
            return ((OtherSettingsConfig) this.instance).hasWebImageQualityType();
        }

        public C8373b mergeEnableGuideScreenshotShare(BoolValue boolValue) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).mergeEnableGuideScreenshotShare(boolValue);
            return this;
        }

        public C8373b mergeEnableReadPasteboard(BoolValue boolValue) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).mergeEnableReadPasteboard(boolValue);
            return this;
        }

        public C8373b mergeEnableResumePlaying(BoolValue boolValue) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).mergeEnableResumePlaying(boolValue);
            return this;
        }

        public C8373b mergeEnableWifiAutoUpdate(BoolValue boolValue) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).mergeEnableWifiAutoUpdate(boolValue);
            return this;
        }

        public C8373b mergeMiniScreenPlayWhenBack(BoolValue boolValue) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).mergeMiniScreenPlayWhenBack(boolValue);
            return this;
        }

        public C8373b mergePasteAutoJump(BoolValue boolValue) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).mergePasteAutoJump(boolValue);
            return this;
        }

        public C8373b mergeWatermarkType(Int64Value int64Value) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).mergeWatermarkType(int64Value);
            return this;
        }

        public C8373b mergeWebImageQualityType(Int64Value int64Value) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).mergeWebImageQualityType(int64Value);
            return this;
        }

        public C8373b setEnableGuideScreenshotShare(BoolValue boolValue) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setEnableGuideScreenshotShare(boolValue);
            return this;
        }

        public C8373b setEnableReadPasteboard(BoolValue boolValue) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setEnableReadPasteboard(boolValue);
            return this;
        }

        public C8373b setEnableResumePlaying(BoolValue boolValue) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setEnableResumePlaying(boolValue);
            return this;
        }

        public C8373b setEnableWifiAutoUpdate(BoolValue boolValue) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setEnableWifiAutoUpdate(boolValue);
            return this;
        }

        public C8373b setMiniScreenPlayWhenBack(BoolValue boolValue) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setMiniScreenPlayWhenBack(boolValue);
            return this;
        }

        public C8373b setPasteAutoJump(BoolValue boolValue) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setPasteAutoJump(boolValue);
            return this;
        }

        public C8373b setWatermarkType(Int64Value int64Value) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setWatermarkType(int64Value);
            return this;
        }

        public C8373b setWebImageQualityType(Int64Value int64Value) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setWebImageQualityType(int64Value);
            return this;
        }

        private C8373b() {
            super(OtherSettingsConfig.DEFAULT_INSTANCE);
        }

        public C8373b setEnableGuideScreenshotShare(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setEnableGuideScreenshotShare(c8307b.build());
            return this;
        }

        public C8373b setEnableReadPasteboard(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setEnableReadPasteboard(c8307b.build());
            return this;
        }

        public C8373b setEnableResumePlaying(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setEnableResumePlaying(c8307b.build());
            return this;
        }

        public C8373b setEnableWifiAutoUpdate(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setEnableWifiAutoUpdate(c8307b.build());
            return this;
        }

        public C8373b setMiniScreenPlayWhenBack(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setMiniScreenPlayWhenBack(c8307b.build());
            return this;
        }

        public C8373b setPasteAutoJump(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setPasteAutoJump(c8307b.build());
            return this;
        }

        public C8373b setWatermarkType(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setWatermarkType(c8322b.build());
            return this;
        }

        public C8373b setWebImageQualityType(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((OtherSettingsConfig) this.instance).setWebImageQualityType(c8322b.build());
            return this;
        }
    }

    static {
        OtherSettingsConfig otherSettingsConfig = new OtherSettingsConfig();
        DEFAULT_INSTANCE = otherSettingsConfig;
        GeneratedMessageLite.registerDefaultInstance(OtherSettingsConfig.class, otherSettingsConfig);
    }

    private OtherSettingsConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableGuideScreenshotShare() {
        this.enableGuideScreenshotShare_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableReadPasteboard() {
        this.enableReadPasteboard_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableResumePlaying() {
        this.enableResumePlaying_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableWifiAutoUpdate() {
        this.enableWifiAutoUpdate_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMiniScreenPlayWhenBack() {
        this.miniScreenPlayWhenBack_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPasteAutoJump() {
        this.pasteAutoJump_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatermarkType() {
        this.watermarkType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebImageQualityType() {
        this.webImageQualityType_ = null;
    }

    public static OtherSettingsConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnableGuideScreenshotShare(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableGuideScreenshotShare_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableGuideScreenshotShare_ = BoolValue.newBuilder(this.enableGuideScreenshotShare_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableGuideScreenshotShare_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnableReadPasteboard(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableReadPasteboard_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableReadPasteboard_ = BoolValue.newBuilder(this.enableReadPasteboard_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableReadPasteboard_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnableResumePlaying(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableResumePlaying_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableResumePlaying_ = BoolValue.newBuilder(this.enableResumePlaying_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableResumePlaying_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnableWifiAutoUpdate(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableWifiAutoUpdate_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableWifiAutoUpdate_ = BoolValue.newBuilder(this.enableWifiAutoUpdate_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableWifiAutoUpdate_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMiniScreenPlayWhenBack(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.miniScreenPlayWhenBack_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.miniScreenPlayWhenBack_ = BoolValue.newBuilder(this.miniScreenPlayWhenBack_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.miniScreenPlayWhenBack_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePasteAutoJump(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.pasteAutoJump_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.pasteAutoJump_ = BoolValue.newBuilder(this.pasteAutoJump_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.pasteAutoJump_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWatermarkType(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.watermarkType_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.watermarkType_ = Int64Value.newBuilder(this.watermarkType_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.watermarkType_ = int64Value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWebImageQualityType(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.webImageQualityType_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.webImageQualityType_ = Int64Value.newBuilder(this.webImageQualityType_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.webImageQualityType_ = int64Value;
        }
    }

    public static C8373b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OtherSettingsConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OtherSettingsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OtherSettingsConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OtherSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OtherSettingsConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableGuideScreenshotShare(BoolValue boolValue) {
        boolValue.getClass();
        this.enableGuideScreenshotShare_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableReadPasteboard(BoolValue boolValue) {
        boolValue.getClass();
        this.enableReadPasteboard_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableResumePlaying(BoolValue boolValue) {
        boolValue.getClass();
        this.enableResumePlaying_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableWifiAutoUpdate(BoolValue boolValue) {
        boolValue.getClass();
        this.enableWifiAutoUpdate_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMiniScreenPlayWhenBack(BoolValue boolValue) {
        boolValue.getClass();
        this.miniScreenPlayWhenBack_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasteAutoJump(BoolValue boolValue) {
        boolValue.getClass();
        this.pasteAutoJump_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatermarkType(Int64Value int64Value) {
        int64Value.getClass();
        this.watermarkType_ = int64Value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebImageQualityType(Int64Value int64Value) {
        int64Value.getClass();
        this.webImageQualityType_ = int64Value;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8372a.f19940xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OtherSettingsConfig();
            case 2:
                return new C8373b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t", new Object[]{"watermarkType_", "webImageQualityType_", "enableReadPasteboard_", "pasteAutoJump_", "miniScreenPlayWhenBack_", "enableResumePlaying_", "enableWifiAutoUpdate_", "enableGuideScreenshotShare_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OtherSettingsConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (OtherSettingsConfig.class) {
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

    public BoolValue getEnableGuideScreenshotShare() {
        BoolValue boolValue = this.enableGuideScreenshotShare_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getEnableReadPasteboard() {
        BoolValue boolValue = this.enableReadPasteboard_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getEnableResumePlaying() {
        BoolValue boolValue = this.enableResumePlaying_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getEnableWifiAutoUpdate() {
        BoolValue boolValue = this.enableWifiAutoUpdate_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getMiniScreenPlayWhenBack() {
        BoolValue boolValue = this.miniScreenPlayWhenBack_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getPasteAutoJump() {
        BoolValue boolValue = this.pasteAutoJump_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public Int64Value getWatermarkType() {
        Int64Value int64Value = this.watermarkType_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public Int64Value getWebImageQualityType() {
        Int64Value int64Value = this.webImageQualityType_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public boolean hasEnableGuideScreenshotShare() {
        return this.enableGuideScreenshotShare_ != null;
    }

    public boolean hasEnableReadPasteboard() {
        return this.enableReadPasteboard_ != null;
    }

    public boolean hasEnableResumePlaying() {
        return this.enableResumePlaying_ != null;
    }

    public boolean hasEnableWifiAutoUpdate() {
        return this.enableWifiAutoUpdate_ != null;
    }

    public boolean hasMiniScreenPlayWhenBack() {
        return this.miniScreenPlayWhenBack_ != null;
    }

    public boolean hasPasteAutoJump() {
        return this.pasteAutoJump_ != null;
    }

    public boolean hasWatermarkType() {
        return this.watermarkType_ != null;
    }

    public boolean hasWebImageQualityType() {
        return this.webImageQualityType_ != null;
    }

    public static C8373b newBuilder(OtherSettingsConfig otherSettingsConfig) {
        return DEFAULT_INSTANCE.createBuilder(otherSettingsConfig);
    }

    public static OtherSettingsConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OtherSettingsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OtherSettingsConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OtherSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OtherSettingsConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OtherSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OtherSettingsConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OtherSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OtherSettingsConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OtherSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OtherSettingsConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OtherSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OtherSettingsConfig parseFrom(InputStream inputStream) throws IOException {
        return (OtherSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OtherSettingsConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OtherSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OtherSettingsConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OtherSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OtherSettingsConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OtherSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
