package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

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
/* loaded from: classes17.dex */
public final class GyroConfig extends GeneratedMessageLite<GyroConfig, GyroConfig.Builder> implements MessageLiteOrBuilder {
    private static final GyroConfig DEFAULT_INSTANCE;
    public static final int GYROSCOPE_FIELD_NUMBER = 1;
    private static volatile Parser<GyroConfig> PARSER;
    private NFTImageV2 gyroscope_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroConfig$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75411 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17383xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17383xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17383xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17383xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17383xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17383xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17383xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17383xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GyroConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75411 c75411) {
            this();
        }

        public Builder clearGyroscope() {
            copyOnWrite();
            ((GyroConfig) this.instance).clearGyroscope();
            return this;
        }

        public NFTImageV2 getGyroscope() {
            return ((GyroConfig) this.instance).getGyroscope();
        }

        public boolean hasGyroscope() {
            return ((GyroConfig) this.instance).hasGyroscope();
        }

        public Builder mergeGyroscope(NFTImageV2 nFTImageV2) {
            copyOnWrite();
            ((GyroConfig) this.instance).mergeGyroscope(nFTImageV2);
            return this;
        }

        public Builder setGyroscope(NFTImageV2 nFTImageV2) {
            copyOnWrite();
            ((GyroConfig) this.instance).setGyroscope(nFTImageV2);
            return this;
        }

        private Builder() {
            super(GyroConfig.DEFAULT_INSTANCE);
        }

        public Builder setGyroscope(NFTImageV2.Builder builder) {
            copyOnWrite();
            ((GyroConfig) this.instance).setGyroscope(builder.build());
            return this;
        }
    }

    static {
        GyroConfig gyroConfig = new GyroConfig();
        DEFAULT_INSTANCE = gyroConfig;
        GeneratedMessageLite.registerDefaultInstance(GyroConfig.class, gyroConfig);
    }

    private GyroConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGyroscope() {
        this.gyroscope_ = null;
    }

    public static GyroConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGyroscope(NFTImageV2 nFTImageV2) {
        nFTImageV2.getClass();
        NFTImageV2 nFTImageV22 = this.gyroscope_;
        if (nFTImageV22 != null && nFTImageV22 != NFTImageV2.getDefaultInstance()) {
            this.gyroscope_ = NFTImageV2.newBuilder(this.gyroscope_).mergeFrom((NFTImageV2) nFTImageV2).buildPartial();
        } else {
            this.gyroscope_ = nFTImageV2;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GyroConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GyroConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GyroConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GyroConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GyroConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGyroscope(NFTImageV2 nFTImageV2) {
        nFTImageV2.getClass();
        this.gyroscope_ = nFTImageV2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75411.f17383xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GyroConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"gyroscope_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GyroConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (GyroConfig.class) {
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

    public NFTImageV2 getGyroscope() {
        NFTImageV2 nFTImageV2 = this.gyroscope_;
        return nFTImageV2 == null ? NFTImageV2.getDefaultInstance() : nFTImageV2;
    }

    public boolean hasGyroscope() {
        return this.gyroscope_ != null;
    }

    public static Builder newBuilder(GyroConfig gyroConfig) {
        return DEFAULT_INSTANCE.createBuilder(gyroConfig);
    }

    public static GyroConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GyroConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GyroConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GyroConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GyroConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GyroConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GyroConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GyroConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GyroConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GyroConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GyroConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GyroConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GyroConfig parseFrom(InputStream inputStream) throws IOException {
        return (GyroConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GyroConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GyroConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GyroConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GyroConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GyroConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GyroConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
