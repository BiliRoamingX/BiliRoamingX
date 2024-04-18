package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class CM extends GeneratedMessageLite<CM, CM.C14688b> implements MessageLiteOrBuilder {
    private static final CM DEFAULT_INSTANCE;
    private static volatile Parser<CM> PARSER = null;
    public static final int SOURCE_CONTENT_FIELD_NUMBER = 1;
    private Any sourceContent_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.CM$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14687a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21984xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21984xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21984xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21984xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21984xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21984xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21984xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21984xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.CM$b */
    /* loaded from: classes21.dex */
    public static final class C14688b extends GeneratedMessageLite.Builder<CM, C14688b> implements MessageLiteOrBuilder {
        /* synthetic */ C14688b(C14687a c14687a) {
            this();
        }

        public C14688b clearSourceContent() {
            copyOnWrite();
            ((CM) this.instance).clearSourceContent();
            return this;
        }

        public Any getSourceContent() {
            return ((CM) this.instance).getSourceContent();
        }

        public boolean hasSourceContent() {
            return ((CM) this.instance).hasSourceContent();
        }

        public C14688b mergeSourceContent(Any any) {
            copyOnWrite();
            ((CM) this.instance).mergeSourceContent(any);
            return this;
        }

        public C14688b setSourceContent(Any any) {
            copyOnWrite();
            ((CM) this.instance).setSourceContent(any);
            return this;
        }

        private C14688b() {
            super(CM.DEFAULT_INSTANCE);
        }

        public C14688b setSourceContent(Any.Builder builder) {
            copyOnWrite();
            ((CM) this.instance).setSourceContent(builder.build());
            return this;
        }
    }

    static {
        CM cm3 = new CM();
        DEFAULT_INSTANCE = cm3;
        GeneratedMessageLite.registerDefaultInstance(CM.class, cm3);
    }

    private CM() {
    }

    public void clearSourceContent() {
        this.sourceContent_ = null;
    }

    public static CM getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeSourceContent(Any any) {
        any.getClass();
        Any any2 = this.sourceContent_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.sourceContent_ = Any.newBuilder(this.sourceContent_).mergeFrom((Any) any).buildPartial();
        } else {
            this.sourceContent_ = any;
        }
    }

    public static C14688b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CM parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CM) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CM parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CM> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setSourceContent(Any any) {
        any.getClass();
        this.sourceContent_ = any;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14687a.f21984xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CM();
            case 2:
                return new C14688b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"sourceContent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CM> parser = PARSER;
                if (parser == null) {
                    synchronized (CM.class) {
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

    public Any getSourceContent() {
        Any any = this.sourceContent_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public boolean hasSourceContent() {
        return this.sourceContent_ != null;
    }

    public static C14688b newBuilder(CM cm3) {
        return DEFAULT_INSTANCE.createBuilder(cm3);
    }

    public static CM parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CM) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CM parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CM parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CM parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CM parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CM parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CM parseFrom(InputStream inputStream) throws IOException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CM parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CM parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CM parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
