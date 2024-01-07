package com.bapis.bilibili.app.distribution.setting.download;

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
public final class DownloadSettingsConfig extends GeneratedMessageLite<DownloadSettingsConfig, DownloadSettingsConfig.C8348b> implements MessageLiteOrBuilder {
    private static final DownloadSettingsConfig DEFAULT_INSTANCE;
    public static final int ENABLEDOWNLOADAUTOSTART_FIELD_NUMBER = 1;
    private static volatile Parser<DownloadSettingsConfig> PARSER;
    private BoolValue enableDownloadAutoStart_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.download.DownloadSettingsConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8347a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19930xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19930xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19930xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19930xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19930xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19930xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19930xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19930xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.download.DownloadSettingsConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8348b extends GeneratedMessageLite.Builder<DownloadSettingsConfig, C8348b> implements MessageLiteOrBuilder {
        /* synthetic */ C8348b(C8347a c8347a) {
            this();
        }

        public C8348b clearEnableDownloadAutoStart() {
            copyOnWrite();
            ((DownloadSettingsConfig) this.instance).clearEnableDownloadAutoStart();
            return this;
        }

        public BoolValue getEnableDownloadAutoStart() {
            return ((DownloadSettingsConfig) this.instance).getEnableDownloadAutoStart();
        }

        public boolean hasEnableDownloadAutoStart() {
            return ((DownloadSettingsConfig) this.instance).hasEnableDownloadAutoStart();
        }

        public C8348b mergeEnableDownloadAutoStart(BoolValue boolValue) {
            copyOnWrite();
            ((DownloadSettingsConfig) this.instance).mergeEnableDownloadAutoStart(boolValue);
            return this;
        }

        public C8348b setEnableDownloadAutoStart(BoolValue boolValue) {
            copyOnWrite();
            ((DownloadSettingsConfig) this.instance).setEnableDownloadAutoStart(boolValue);
            return this;
        }

        private C8348b() {
            super(DownloadSettingsConfig.DEFAULT_INSTANCE);
        }

        public C8348b setEnableDownloadAutoStart(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((DownloadSettingsConfig) this.instance).setEnableDownloadAutoStart(c8307b.build());
            return this;
        }
    }

    static {
        DownloadSettingsConfig downloadSettingsConfig = new DownloadSettingsConfig();
        DEFAULT_INSTANCE = downloadSettingsConfig;
        GeneratedMessageLite.registerDefaultInstance(DownloadSettingsConfig.class, downloadSettingsConfig);
    }

    private DownloadSettingsConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableDownloadAutoStart() {
        this.enableDownloadAutoStart_ = null;
    }

    public static DownloadSettingsConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnableDownloadAutoStart(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableDownloadAutoStart_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableDownloadAutoStart_ = BoolValue.newBuilder(this.enableDownloadAutoStart_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableDownloadAutoStart_ = boolValue;
        }
    }

    public static C8348b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DownloadSettingsConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DownloadSettingsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DownloadSettingsConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DownloadSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DownloadSettingsConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableDownloadAutoStart(BoolValue boolValue) {
        boolValue.getClass();
        this.enableDownloadAutoStart_ = boolValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8347a.f19930xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DownloadSettingsConfig();
            case 2:
                return new C8348b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"enableDownloadAutoStart_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DownloadSettingsConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (DownloadSettingsConfig.class) {
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

    public BoolValue getEnableDownloadAutoStart() {
        BoolValue boolValue = this.enableDownloadAutoStart_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public boolean hasEnableDownloadAutoStart() {
        return this.enableDownloadAutoStart_ != null;
    }

    public static C8348b newBuilder(DownloadSettingsConfig downloadSettingsConfig) {
        return DEFAULT_INSTANCE.createBuilder(downloadSettingsConfig);
    }

    public static DownloadSettingsConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DownloadSettingsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DownloadSettingsConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DownloadSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DownloadSettingsConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DownloadSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DownloadSettingsConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DownloadSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DownloadSettingsConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DownloadSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DownloadSettingsConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DownloadSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DownloadSettingsConfig parseFrom(InputStream inputStream) throws IOException {
        return (DownloadSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DownloadSettingsConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DownloadSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DownloadSettingsConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DownloadSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DownloadSettingsConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DownloadSettingsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
