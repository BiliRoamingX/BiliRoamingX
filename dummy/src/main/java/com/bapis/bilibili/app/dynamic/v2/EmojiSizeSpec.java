package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes19.dex */
public final class EmojiSizeSpec extends GeneratedMessageLite<EmojiSizeSpec, EmojiSizeSpec.C5454b> implements k1 {
    private static final EmojiSizeSpec DEFAULT_INSTANCE;
    private static volatile Parser<EmojiSizeSpec> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private long width_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.EmojiSizeSpec$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5453a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17290xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17290xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17290xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17290xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17290xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17290xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17290xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17290xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.EmojiSizeSpec$b */
    /* loaded from: classes19.dex */
    public static final class C5454b extends GeneratedMessageLite.Builder<EmojiSizeSpec, C5454b> implements k1 {
        /* synthetic */ C5454b(C5453a c5453a) {
            this();
        }

        public C5454b clearWidth() {
            copyOnWrite();
            ((EmojiSizeSpec) this.instance).clearWidth();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.k1
        public long getWidth() {
            return ((EmojiSizeSpec) this.instance).getWidth();
        }

        public C5454b setWidth(long j2) {
            copyOnWrite();
            ((EmojiSizeSpec) this.instance).setWidth(j2);
            return this;
        }

        private C5454b() {
            super(EmojiSizeSpec.DEFAULT_INSTANCE);
        }
    }

    static {
        EmojiSizeSpec emojiSizeSpec = new EmojiSizeSpec();
        DEFAULT_INSTANCE = emojiSizeSpec;
        GeneratedMessageLite.registerDefaultInstance(EmojiSizeSpec.class, emojiSizeSpec);
    }

    private EmojiSizeSpec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0L;
    }

    public static EmojiSizeSpec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5454b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EmojiSizeSpec parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EmojiSizeSpec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmojiSizeSpec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EmojiSizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EmojiSizeSpec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(long j2) {
        this.width_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5453a c5453a = null;
        switch (C5453a.f17290xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EmojiSizeSpec();
            case 2:
                return new C5454b(c5453a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"width_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EmojiSizeSpec> parser = PARSER;
                if (parser == null) {
                    synchronized (EmojiSizeSpec.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.k1
    public long getWidth() {
        return this.width_;
    }

    public static C5454b newBuilder(EmojiSizeSpec emojiSizeSpec) {
        return DEFAULT_INSTANCE.createBuilder(emojiSizeSpec);
    }

    public static EmojiSizeSpec parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmojiSizeSpec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmojiSizeSpec parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmojiSizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EmojiSizeSpec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EmojiSizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EmojiSizeSpec parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmojiSizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EmojiSizeSpec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EmojiSizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EmojiSizeSpec parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmojiSizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EmojiSizeSpec parseFrom(InputStream inputStream) throws IOException {
        return (EmojiSizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmojiSizeSpec parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmojiSizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmojiSizeSpec parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EmojiSizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EmojiSizeSpec parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmojiSizeSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
