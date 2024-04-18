package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class Effects extends GeneratedMessageLite<Effects, Effects.C14719b> implements MessageLiteOrBuilder {
    private static final Effects DEFAULT_INSTANCE;
    private static volatile Parser<Effects> PARSER = null;
    public static final int PRELOADING_FIELD_NUMBER = 1;
    private String preloading_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Effects$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14718a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21995xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21995xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21995xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21995xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21995xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21995xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21995xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21995xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Effects$b */
    /* loaded from: classes21.dex */
    public static final class C14719b extends GeneratedMessageLite.Builder<Effects, C14719b> implements MessageLiteOrBuilder {
        /* synthetic */ C14719b(C14718a c14718a) {
            this();
        }

        public C14719b clearPreloading() {
            copyOnWrite();
            ((Effects) this.instance).clearPreloading();
            return this;
        }

        public String getPreloading() {
            return ((Effects) this.instance).getPreloading();
        }

        public ByteString getPreloadingBytes() {
            return ((Effects) this.instance).getPreloadingBytes();
        }

        public C14719b setPreloading(String str) {
            copyOnWrite();
            ((Effects) this.instance).setPreloading(str);
            return this;
        }

        public C14719b setPreloadingBytes(ByteString byteString) {
            copyOnWrite();
            ((Effects) this.instance).setPreloadingBytes(byteString);
            return this;
        }

        private C14719b() {
            super(Effects.DEFAULT_INSTANCE);
        }
    }

    static {
        Effects effects = new Effects();
        DEFAULT_INSTANCE = effects;
        GeneratedMessageLite.registerDefaultInstance(Effects.class, effects);
    }

    private Effects() {
    }

    public void clearPreloading() {
        this.preloading_ = getDefaultInstance().getPreloading();
    }

    public static Effects getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14719b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Effects parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Effects) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Effects parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Effects) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Effects> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setPreloading(String str) {
        str.getClass();
        this.preloading_ = str;
    }

    public void setPreloadingBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.preloading_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14718a.f21995xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Effects();
            case 2:
                return new C14719b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"preloading_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Effects> parser = PARSER;
                if (parser == null) {
                    synchronized (Effects.class) {
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

    public String getPreloading() {
        return this.preloading_;
    }

    public ByteString getPreloadingBytes() {
        return ByteString.copyFromUtf8(this.preloading_);
    }

    public static C14719b newBuilder(Effects effects) {
        return DEFAULT_INSTANCE.createBuilder(effects);
    }

    public static Effects parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Effects) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Effects parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Effects) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Effects parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Effects) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Effects parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Effects) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Effects parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Effects) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Effects parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Effects) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Effects parseFrom(InputStream inputStream) throws IOException {
        return (Effects) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Effects parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Effects) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Effects parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Effects) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Effects parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Effects) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
