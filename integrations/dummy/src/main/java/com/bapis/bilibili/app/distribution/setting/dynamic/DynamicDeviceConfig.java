package com.bapis.bilibili.app.distribution.setting.dynamic;

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
public final class DynamicDeviceConfig extends GeneratedMessageLite<DynamicDeviceConfig, DynamicDeviceConfig.C8352b> implements MessageLiteOrBuilder {
    public static final int AUTO_PLAY_FIELD_NUMBER = 1;
    private static final DynamicDeviceConfig DEFAULT_INSTANCE;
    private static volatile Parser<DynamicDeviceConfig> PARSER;
    private DynamicAutoPlay autoPlay_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.dynamic.DynamicDeviceConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8351a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19932xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19932xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19932xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19932xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19932xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19932xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19932xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19932xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.dynamic.DynamicDeviceConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8352b extends GeneratedMessageLite.Builder<DynamicDeviceConfig, C8352b> implements MessageLiteOrBuilder {
        /* synthetic */ C8352b(C8351a c8351a) {
            this();
        }

        public C8352b clearAutoPlay() {
            copyOnWrite();
            ((DynamicDeviceConfig) this.instance).clearAutoPlay();
            return this;
        }

        public DynamicAutoPlay getAutoPlay() {
            return ((DynamicDeviceConfig) this.instance).getAutoPlay();
        }

        public boolean hasAutoPlay() {
            return ((DynamicDeviceConfig) this.instance).hasAutoPlay();
        }

        public C8352b mergeAutoPlay(DynamicAutoPlay dynamicAutoPlay) {
            copyOnWrite();
            ((DynamicDeviceConfig) this.instance).mergeAutoPlay(dynamicAutoPlay);
            return this;
        }

        public C8352b setAutoPlay(DynamicAutoPlay dynamicAutoPlay) {
            copyOnWrite();
            ((DynamicDeviceConfig) this.instance).setAutoPlay(dynamicAutoPlay);
            return this;
        }

        private C8352b() {
            super(DynamicDeviceConfig.DEFAULT_INSTANCE);
        }

        public C8352b setAutoPlay(DynamicAutoPlay.C8350b c8350b) {
            copyOnWrite();
            ((DynamicDeviceConfig) this.instance).setAutoPlay(c8350b.build());
            return this;
        }
    }

    static {
        DynamicDeviceConfig dynamicDeviceConfig = new DynamicDeviceConfig();
        DEFAULT_INSTANCE = dynamicDeviceConfig;
        GeneratedMessageLite.registerDefaultInstance(DynamicDeviceConfig.class, dynamicDeviceConfig);
    }

    private DynamicDeviceConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoPlay() {
        this.autoPlay_ = null;
    }

    public static DynamicDeviceConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAutoPlay(DynamicAutoPlay dynamicAutoPlay) {
        dynamicAutoPlay.getClass();
        DynamicAutoPlay dynamicAutoPlay2 = this.autoPlay_;
        if (dynamicAutoPlay2 != null && dynamicAutoPlay2 != DynamicAutoPlay.getDefaultInstance()) {
            this.autoPlay_ = DynamicAutoPlay.newBuilder(this.autoPlay_).mergeFrom((DynamicAutoPlay) dynamicAutoPlay).buildPartial();
        } else {
            this.autoPlay_ = dynamicAutoPlay;
        }
    }

    public static C8352b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DynamicDeviceConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DynamicDeviceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynamicDeviceConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DynamicDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DynamicDeviceConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoPlay(DynamicAutoPlay dynamicAutoPlay) {
        dynamicAutoPlay.getClass();
        this.autoPlay_ = dynamicAutoPlay;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8351a.f19932xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DynamicDeviceConfig();
            case 2:
                return new C8352b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"autoPlay_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DynamicDeviceConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (DynamicDeviceConfig.class) {
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

    public DynamicAutoPlay getAutoPlay() {
        DynamicAutoPlay dynamicAutoPlay = this.autoPlay_;
        return dynamicAutoPlay == null ? DynamicAutoPlay.getDefaultInstance() : dynamicAutoPlay;
    }

    public boolean hasAutoPlay() {
        return this.autoPlay_ != null;
    }

    public static C8352b newBuilder(DynamicDeviceConfig dynamicDeviceConfig) {
        return DEFAULT_INSTANCE.createBuilder(dynamicDeviceConfig);
    }

    public static DynamicDeviceConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicDeviceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynamicDeviceConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DynamicDeviceConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DynamicDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DynamicDeviceConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DynamicDeviceConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DynamicDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DynamicDeviceConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DynamicDeviceConfig parseFrom(InputStream inputStream) throws IOException {
        return (DynamicDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynamicDeviceConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynamicDeviceConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DynamicDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DynamicDeviceConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
