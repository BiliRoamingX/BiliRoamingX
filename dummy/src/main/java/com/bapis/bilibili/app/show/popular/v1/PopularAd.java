package com.bapis.bilibili.app.show.popular.v1;

import com.google.protobuf.AbstractMessageLite;
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
public final class PopularAd extends GeneratedMessageLite<PopularAd, PopularAd.C8218b> implements MessageLiteOrBuilder {
    private static final PopularAd DEFAULT_INSTANCE;
    public static final int EXTRA_FIELD_NUMBER = 1;
    private static volatile Parser<PopularAd> PARSER;
    private String extra_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.show.popular.v1.PopularAd$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8217a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16850xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16850xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16850xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16850xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16850xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16850xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16850xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16850xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.show.popular.v1.PopularAd$b */
    /* loaded from: classes13.dex */
    public static final class C8218b extends GeneratedMessageLite.Builder<PopularAd, C8218b> implements MessageLiteOrBuilder {
        /* synthetic */ C8218b(C8217a c8217a) {
            this();
        }

        public C8218b clearExtra() {
            copyOnWrite();
            ((PopularAd) this.instance).clearExtra();
            return this;
        }

        public String getExtra() {
            return ((PopularAd) this.instance).getExtra();
        }

        public ByteString getExtraBytes() {
            return ((PopularAd) this.instance).getExtraBytes();
        }

        public C8218b setExtra(String str) {
            copyOnWrite();
            ((PopularAd) this.instance).setExtra(str);
            return this;
        }

        public C8218b setExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((PopularAd) this.instance).setExtraBytes(byteString);
            return this;
        }

        private C8218b() {
            super(PopularAd.DEFAULT_INSTANCE);
        }
    }

    static {
        PopularAd popularAd = new PopularAd();
        DEFAULT_INSTANCE = popularAd;
        GeneratedMessageLite.registerDefaultInstance(PopularAd.class, popularAd);
    }

    private PopularAd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtra() {
        this.extra_ = getDefaultInstance().getExtra();
    }

    public static PopularAd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8218b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PopularAd parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PopularAd) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PopularAd parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PopularAd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PopularAd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtra(String str) {
        str.getClass();
        this.extra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extra_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8217a.f16850xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PopularAd();
            case 2:
                return new C8218b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"extra_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PopularAd> parser = PARSER;
                if (parser == null) {
                    synchronized (PopularAd.class) {
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

    public String getExtra() {
        return this.extra_;
    }

    public ByteString getExtraBytes() {
        return ByteString.copyFromUtf8(this.extra_);
    }

    public static C8218b newBuilder(PopularAd popularAd) {
        return DEFAULT_INSTANCE.createBuilder(popularAd);
    }

    public static PopularAd parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopularAd) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PopularAd parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopularAd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PopularAd parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PopularAd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PopularAd parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopularAd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PopularAd parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PopularAd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PopularAd parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopularAd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PopularAd parseFrom(InputStream inputStream) throws IOException {
        return (PopularAd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PopularAd parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopularAd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PopularAd parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PopularAd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PopularAd parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopularAd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
