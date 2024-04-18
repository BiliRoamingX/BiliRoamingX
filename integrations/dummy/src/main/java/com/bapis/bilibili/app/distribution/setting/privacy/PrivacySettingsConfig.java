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
public final class PrivacySettingsConfig extends GeneratedMessageLite<PrivacySettingsConfig, PrivacySettingsConfig.C8393b> implements MessageLiteOrBuilder {
    public static final int ADRECOMMANDSTORE_FIELD_NUMBER = 1;
    private static final PrivacySettingsConfig DEFAULT_INSTANCE;
    private static volatile Parser<PrivacySettingsConfig> PARSER = null;
    public static final int SENSORACCESS_FIELD_NUMBER = 2;
    private BoolValue adRecommandStore_;
    private BoolValue sensorAccess_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.privacy.PrivacySettingsConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8392a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19950xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19950xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19950xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19950xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19950xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19950xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19950xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19950xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.privacy.PrivacySettingsConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8393b extends GeneratedMessageLite.Builder<PrivacySettingsConfig, C8393b> implements MessageLiteOrBuilder {
        /* synthetic */ C8393b(C8392a c8392a) {
            this();
        }

        public C8393b clearAdRecommandStore() {
            copyOnWrite();
            ((PrivacySettingsConfig) this.instance).clearAdRecommandStore();
            return this;
        }

        public C8393b clearSensorAccess() {
            copyOnWrite();
            ((PrivacySettingsConfig) this.instance).clearSensorAccess();
            return this;
        }

        public BoolValue getAdRecommandStore() {
            return ((PrivacySettingsConfig) this.instance).getAdRecommandStore();
        }

        public BoolValue getSensorAccess() {
            return ((PrivacySettingsConfig) this.instance).getSensorAccess();
        }

        public boolean hasAdRecommandStore() {
            return ((PrivacySettingsConfig) this.instance).hasAdRecommandStore();
        }

        public boolean hasSensorAccess() {
            return ((PrivacySettingsConfig) this.instance).hasSensorAccess();
        }

        public C8393b mergeAdRecommandStore(BoolValue boolValue) {
            copyOnWrite();
            ((PrivacySettingsConfig) this.instance).mergeAdRecommandStore(boolValue);
            return this;
        }

        public C8393b mergeSensorAccess(BoolValue boolValue) {
            copyOnWrite();
            ((PrivacySettingsConfig) this.instance).mergeSensorAccess(boolValue);
            return this;
        }

        public C8393b setAdRecommandStore(BoolValue boolValue) {
            copyOnWrite();
            ((PrivacySettingsConfig) this.instance).setAdRecommandStore(boolValue);
            return this;
        }

        public C8393b setSensorAccess(BoolValue boolValue) {
            copyOnWrite();
            ((PrivacySettingsConfig) this.instance).setSensorAccess(boolValue);
            return this;
        }

        private C8393b() {
            super(PrivacySettingsConfig.DEFAULT_INSTANCE);
        }

        public C8393b setAdRecommandStore(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PrivacySettingsConfig) this.instance).setAdRecommandStore(c8307b.build());
            return this;
        }

        public C8393b setSensorAccess(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PrivacySettingsConfig) this.instance).setSensorAccess(c8307b.build());
            return this;
        }
    }

    static {
        PrivacySettingsConfig privacySettingsConfig = new PrivacySettingsConfig();
        DEFAULT_INSTANCE = privacySettingsConfig;
        GeneratedMessageLite.registerDefaultInstance(PrivacySettingsConfig.class, privacySettingsConfig);
    }

    private PrivacySettingsConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdRecommandStore() {
        this.adRecommandStore_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSensorAccess() {
        this.sensorAccess_ = null;
    }

    public static PrivacySettingsConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdRecommandStore(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.adRecommandStore_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.adRecommandStore_ = BoolValue.newBuilder(this.adRecommandStore_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.adRecommandStore_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSensorAccess(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.sensorAccess_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.sensorAccess_ = BoolValue.newBuilder(this.sensorAccess_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.sensorAccess_ = boolValue;
        }
    }

    public static C8393b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PrivacySettingsConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PrivacySettingsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PrivacySettingsConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PrivacySettingsConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdRecommandStore(BoolValue boolValue) {
        boolValue.getClass();
        this.adRecommandStore_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSensorAccess(BoolValue boolValue) {
        boolValue.getClass();
        this.sensorAccess_ = boolValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8392a.f19950xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PrivacySettingsConfig();
            case 2:
                return new C8393b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"adRecommandStore_", "sensorAccess_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PrivacySettingsConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (PrivacySettingsConfig.class) {
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

    public BoolValue getAdRecommandStore() {
        BoolValue boolValue = this.adRecommandStore_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getSensorAccess() {
        BoolValue boolValue = this.sensorAccess_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public boolean hasAdRecommandStore() {
        return this.adRecommandStore_ != null;
    }

    public boolean hasSensorAccess() {
        return this.sensorAccess_ != null;
    }

    public static C8393b newBuilder(PrivacySettingsConfig privacySettingsConfig) {
        return DEFAULT_INSTANCE.createBuilder(privacySettingsConfig);
    }

    public static PrivacySettingsConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PrivacySettingsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PrivacySettingsConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PrivacySettingsConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PrivacySettingsConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PrivacySettingsConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PrivacySettingsConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PrivacySettingsConfig parseFrom(InputStream inputStream) throws IOException {
        return (PrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PrivacySettingsConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PrivacySettingsConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PrivacySettingsConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PrivacySettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
