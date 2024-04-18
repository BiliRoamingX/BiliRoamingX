package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class SimpleArc extends GeneratedMessageLite<SimpleArc, SimpleArc.C8302b> implements MessageLiteOrBuilder {
    public static final int COPYRIGHT_FIELD_NUMBER = 1;
    private static final SimpleArc DEFAULT_INSTANCE;
    private static volatile Parser<SimpleArc> PARSER;
    private int copyright_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.SimpleArc$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C8301a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f18368xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f18368xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18368xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18368xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18368xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18368xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18368xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18368xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.SimpleArc$b */
    /* loaded from: classes20.dex */
    public static final class C8302b extends GeneratedMessageLite.Builder<SimpleArc, C8302b> implements MessageLiteOrBuilder {
        /* synthetic */ C8302b(C8301a c8301a) {
            this();
        }

        public C8302b clearCopyright() {
            copyOnWrite();
            ((SimpleArc) this.instance).clearCopyright();
            return this;
        }

        public int getCopyright() {
            return ((SimpleArc) this.instance).getCopyright();
        }

        public C8302b setCopyright(int i2) {
            copyOnWrite();
            ((SimpleArc) this.instance).setCopyright(i2);
            return this;
        }

        private C8302b() {
            super(SimpleArc.DEFAULT_INSTANCE);
        }
    }

    static {
        SimpleArc simpleArc = new SimpleArc();
        DEFAULT_INSTANCE = simpleArc;
        GeneratedMessageLite.registerDefaultInstance(SimpleArc.class, simpleArc);
    }

    private SimpleArc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyright() {
        this.copyright_ = 0;
    }

    public static SimpleArc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8302b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SimpleArc parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SimpleArc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SimpleArc parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SimpleArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SimpleArc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyright(int i2) {
        this.copyright_ = i2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C8301a c8301a = null;
        switch (C8301a.f18368xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SimpleArc();
            case 2:
                return new C8302b(c8301a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"copyright_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SimpleArc> parser = PARSER;
                if (parser == null) {
                    synchronized (SimpleArc.class) {
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

    public int getCopyright() {
        return this.copyright_;
    }

    public static C8302b newBuilder(SimpleArc simpleArc) {
        return DEFAULT_INSTANCE.createBuilder(simpleArc);
    }

    public static SimpleArc parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SimpleArc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SimpleArc parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SimpleArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SimpleArc parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SimpleArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SimpleArc parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SimpleArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SimpleArc parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SimpleArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SimpleArc parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SimpleArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SimpleArc parseFrom(InputStream inputStream) throws IOException {
        return (SimpleArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SimpleArc parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SimpleArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SimpleArc parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SimpleArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SimpleArc parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SimpleArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
