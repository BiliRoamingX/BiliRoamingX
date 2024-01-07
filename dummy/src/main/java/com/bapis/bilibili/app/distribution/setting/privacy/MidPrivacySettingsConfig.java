package com.bapis.bilibili.app.distribution.setting.privacy;

import com.bapis.bilibili.app.distribution.BoolValue;
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
public final class MidPrivacySettingsConfig extends GeneratedMessageLite<MidPrivacySettingsConfig, MidPrivacySettingsConfig.C8391b> implements MessageLiteOrBuilder {
    private static final MidPrivacySettingsConfig DEFAULT_INSTANCE;
    private static volatile Parser<MidPrivacySettingsConfig> PARSER = null;
    public static final int RECOMMENDTOKNOWN_FIELD_NUMBER = 1;
    private BoolValue recommendToKnown_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8390a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19949xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19949xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19949xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19949xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19949xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19949xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19949xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19949xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.privacy.MidPrivacySettingsConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8391b extends GeneratedMessageLite.Builder<MidPrivacySettingsConfig, C8391b> implements MessageLiteOrBuilder {
        /* synthetic */ C8391b(C8390a c8390a) {
            this();
        }

        public C8391b clearRecommendToKnown() {
            copyOnWrite();
            ((MidPrivacySettingsConfig) this.instance).clearRecommendToKnown();
            return this;
        }

        public BoolValue getRecommendToKnown() {
            return ((MidPrivacySettingsConfig) this.instance).getRecommendToKnown();
        }

        public boolean hasRecommendToKnown() {
            return ((MidPrivacySettingsConfig) this.instance).hasRecommendToKnown();
        }

        public C8391b mergeRecommendToKnown(BoolValue boolValue) {
            copyOnWrite();
            ((MidPrivacySettingsConfig) this.instance).mergeRecommendToKnown(boolValue);
            return this;
        }

        public C8391b setRecommendToKnown(BoolValue boolValue) {
            copyOnWrite();
            ((MidPrivacySettingsConfig) this.instance).setRecommendToKnown(boolValue);
            return this;
        }

        private C8391b() {
            super(MidPrivacySettingsConfig.DEFAULT_INSTANCE);
        }

        public C8391b setRecommendToKnown(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((MidPrivacySettingsConfig) this.instance).setRecommendToKnown(c8307b.build());
            return this;
        }
    }

    static {
        MidPrivacySettingsConfig midPrivacySettingsConfig = new MidPrivacySettingsConfig();
        DEFAULT_INSTANCE = midPrivacySettingsConfig;
        GeneratedMessageLite.registerDefaultInstance(MidPrivacySettingsConfig.class, midPrivacySettingsConfig);
    }

    private MidPrivacySettingsConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecommendToKnown() {
        this.recommendToKnown_ = null;
    }

    public static MidPrivacySettingsConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRecommendToKnown(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.recommendToKnown_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.recommendToKnown_ = BoolValue.newBuilder(this.recommendToKnown_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.recommendToKnown_ = boolValue;
        }
    }

    public static C8391b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MidPrivacySettingsConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MidPrivacySettingsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MidPrivacySettingsConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MidPrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MidPrivacySettingsConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecommendToKnown(BoolValue boolValue) {
        boolValue.getClass();
        this.recommendToKnown_ = boolValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8390a.f19949xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MidPrivacySettingsConfig();
            case 2:
                return new C8391b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"recommendToKnown_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MidPrivacySettingsConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (MidPrivacySettingsConfig.class) {
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

    public BoolValue getRecommendToKnown() {
        BoolValue boolValue = this.recommendToKnown_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public boolean hasRecommendToKnown() {
        return this.recommendToKnown_ != null;
    }

    public static C8391b newBuilder(MidPrivacySettingsConfig midPrivacySettingsConfig) {
        return DEFAULT_INSTANCE.createBuilder(midPrivacySettingsConfig);
    }

    public static MidPrivacySettingsConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MidPrivacySettingsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MidPrivacySettingsConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MidPrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MidPrivacySettingsConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MidPrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MidPrivacySettingsConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MidPrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MidPrivacySettingsConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MidPrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MidPrivacySettingsConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MidPrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MidPrivacySettingsConfig parseFrom(InputStream inputStream) throws IOException {
        return (MidPrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MidPrivacySettingsConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MidPrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MidPrivacySettingsConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MidPrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MidPrivacySettingsConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MidPrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
