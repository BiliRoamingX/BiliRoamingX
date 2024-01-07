package com.bapis.bilibili.app.distribution.setting.night;

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
public final class NightSettingsConfig extends GeneratedMessageLite<NightSettingsConfig, NightSettingsConfig.C8367b> implements MessageLiteOrBuilder {
    private static final NightSettingsConfig DEFAULT_INSTANCE;
    public static final int ISNIGHTFOLLOWSYSTEM_FIELD_NUMBER = 1;
    private static volatile Parser<NightSettingsConfig> PARSER;
    private BoolValue isNightFollowSystem_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.night.NightSettingsConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8366a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19939xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19939xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19939xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19939xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19939xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19939xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19939xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19939xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.night.NightSettingsConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8367b extends GeneratedMessageLite.Builder<NightSettingsConfig, C8367b> implements MessageLiteOrBuilder {
        /* synthetic */ C8367b(C8366a c8366a) {
            this();
        }

        public C8367b clearIsNightFollowSystem() {
            copyOnWrite();
            ((NightSettingsConfig) this.instance).clearIsNightFollowSystem();
            return this;
        }

        public BoolValue getIsNightFollowSystem() {
            return ((NightSettingsConfig) this.instance).getIsNightFollowSystem();
        }

        public boolean hasIsNightFollowSystem() {
            return ((NightSettingsConfig) this.instance).hasIsNightFollowSystem();
        }

        public C8367b mergeIsNightFollowSystem(BoolValue boolValue) {
            copyOnWrite();
            ((NightSettingsConfig) this.instance).mergeIsNightFollowSystem(boolValue);
            return this;
        }

        public C8367b setIsNightFollowSystem(BoolValue boolValue) {
            copyOnWrite();
            ((NightSettingsConfig) this.instance).setIsNightFollowSystem(boolValue);
            return this;
        }

        private C8367b() {
            super(NightSettingsConfig.DEFAULT_INSTANCE);
        }

        public C8367b setIsNightFollowSystem(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((NightSettingsConfig) this.instance).setIsNightFollowSystem(c8307b.build());
            return this;
        }
    }

    static {
        NightSettingsConfig nightSettingsConfig = new NightSettingsConfig();
        DEFAULT_INSTANCE = nightSettingsConfig;
        GeneratedMessageLite.registerDefaultInstance(NightSettingsConfig.class, nightSettingsConfig);
    }

    private NightSettingsConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNightFollowSystem() {
        this.isNightFollowSystem_ = null;
    }

    public static NightSettingsConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIsNightFollowSystem(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.isNightFollowSystem_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.isNightFollowSystem_ = BoolValue.newBuilder(this.isNightFollowSystem_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.isNightFollowSystem_ = boolValue;
        }
    }

    public static C8367b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NightSettingsConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NightSettingsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NightSettingsConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NightSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NightSettingsConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNightFollowSystem(BoolValue boolValue) {
        boolValue.getClass();
        this.isNightFollowSystem_ = boolValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8366a.f19939xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new NightSettingsConfig();
            case 2:
                return new C8367b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"isNightFollowSystem_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NightSettingsConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (NightSettingsConfig.class) {
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

    public BoolValue getIsNightFollowSystem() {
        BoolValue boolValue = this.isNightFollowSystem_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public boolean hasIsNightFollowSystem() {
        return this.isNightFollowSystem_ != null;
    }

    public static C8367b newBuilder(NightSettingsConfig nightSettingsConfig) {
        return DEFAULT_INSTANCE.createBuilder(nightSettingsConfig);
    }

    public static NightSettingsConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NightSettingsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NightSettingsConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NightSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NightSettingsConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NightSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NightSettingsConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NightSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NightSettingsConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NightSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NightSettingsConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NightSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NightSettingsConfig parseFrom(InputStream inputStream) throws IOException {
        return (NightSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NightSettingsConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NightSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NightSettingsConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NightSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NightSettingsConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NightSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
