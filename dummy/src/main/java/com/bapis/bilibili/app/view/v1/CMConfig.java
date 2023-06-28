package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Any;
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
public final class CMConfig extends GeneratedMessageLite<CMConfig, CMConfig.Builder> implements MessageLiteOrBuilder {
    public static final int ADS_CONTROL_FIELD_NUMBER = 1;
    private static final CMConfig DEFAULT_INSTANCE;
    private static volatile Parser<CMConfig> PARSER;
    private Any adsControl_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.CMConfig$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67281 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16703xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16703xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16703xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16703xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16703xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16703xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16703xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16703xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CMConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67281 c67281) {
            this();
        }

        public Builder clearAdsControl() {
            copyOnWrite();
            ((CMConfig) this.instance).clearAdsControl();
            return this;
        }

        public Any getAdsControl() {
            return ((CMConfig) this.instance).getAdsControl();
        }

        public boolean hasAdsControl() {
            return ((CMConfig) this.instance).hasAdsControl();
        }

        public Builder mergeAdsControl(Any any) {
            copyOnWrite();
            ((CMConfig) this.instance).mergeAdsControl(any);
            return this;
        }

        public Builder setAdsControl(Any any) {
            copyOnWrite();
            ((CMConfig) this.instance).setAdsControl(any);
            return this;
        }

        private Builder() {
            super(CMConfig.DEFAULT_INSTANCE);
        }

        public Builder setAdsControl(Any.Builder builder) {
            copyOnWrite();
            ((CMConfig) this.instance).setAdsControl(builder.build());
            return this;
        }
    }

    static {
        CMConfig cMConfig = new CMConfig();
        DEFAULT_INSTANCE = cMConfig;
        GeneratedMessageLite.registerDefaultInstance(CMConfig.class, cMConfig);
    }

    private CMConfig() {
    }

    public void clearAdsControl() {
        this.adsControl_ = null;
    }

    public static CMConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAdsControl(Any any) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CMConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CMConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CMConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CMConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CMConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAdsControl(Any any) {
        any.getClass();
        this.adsControl_ = any;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67281.f16703xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CMConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"adsControl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CMConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (CMConfig.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public Any getAdsControl() {
        Any any = this.adsControl_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public boolean hasAdsControl() {
        return this.adsControl_ != null;
    }

    public static Builder newBuilder(CMConfig cMConfig) {
        return DEFAULT_INSTANCE.createBuilder(cMConfig);
    }

    public static CMConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CMConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CMConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CMConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CMConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CMConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CMConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CMConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CMConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CMConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CMConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CMConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CMConfig parseFrom(InputStream inputStream) throws IOException {
        return (CMConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CMConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CMConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CMConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CMConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CMConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CMConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
