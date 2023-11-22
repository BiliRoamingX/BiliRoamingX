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
public final class Bubble extends GeneratedMessageLite<Bubble, Bubble.C8212b> implements MessageLiteOrBuilder {
    public static final int BUBBLE_CONTENT_FIELD_NUMBER = 1;
    private static final Bubble DEFAULT_INSTANCE;
    private static volatile Parser<Bubble> PARSER = null;
    public static final int STIME_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String bubbleContent_ = "";
    private long stime_;
    private int version_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.show.popular.v1.Bubble$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8211a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16847xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16847xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16847xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16847xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16847xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16847xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16847xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16847xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.show.popular.v1.Bubble$b */
    /* loaded from: classes13.dex */
    public static final class C8212b extends GeneratedMessageLite.Builder<Bubble, C8212b> implements MessageLiteOrBuilder {
        /* synthetic */ C8212b(C8211a c8211a) {
            this();
        }

        public C8212b clearBubbleContent() {
            copyOnWrite();
            ((Bubble) this.instance).clearBubbleContent();
            return this;
        }

        public C8212b clearStime() {
            copyOnWrite();
            ((Bubble) this.instance).clearStime();
            return this;
        }

        public C8212b clearVersion() {
            copyOnWrite();
            ((Bubble) this.instance).clearVersion();
            return this;
        }

        public String getBubbleContent() {
            return ((Bubble) this.instance).getBubbleContent();
        }

        public ByteString getBubbleContentBytes() {
            return ((Bubble) this.instance).getBubbleContentBytes();
        }

        public long getStime() {
            return ((Bubble) this.instance).getStime();
        }

        public int getVersion() {
            return ((Bubble) this.instance).getVersion();
        }

        public C8212b setBubbleContent(String str) {
            copyOnWrite();
            ((Bubble) this.instance).setBubbleContent(str);
            return this;
        }

        public C8212b setBubbleContentBytes(ByteString byteString) {
            copyOnWrite();
            ((Bubble) this.instance).setBubbleContentBytes(byteString);
            return this;
        }

        public C8212b setStime(long j) {
            copyOnWrite();
            ((Bubble) this.instance).setStime(j);
            return this;
        }

        public C8212b setVersion(int i) {
            copyOnWrite();
            ((Bubble) this.instance).setVersion(i);
            return this;
        }

        private C8212b() {
            super(Bubble.DEFAULT_INSTANCE);
        }
    }

    static {
        Bubble bubble = new Bubble();
        DEFAULT_INSTANCE = bubble;
        GeneratedMessageLite.registerDefaultInstance(Bubble.class, bubble);
    }

    private Bubble() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBubbleContent() {
        this.bubbleContent_ = getDefaultInstance().getBubbleContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStime() {
        this.stime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static Bubble getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8212b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Bubble parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Bubble) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Bubble parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Bubble> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBubbleContent(String str) {
        str.getClass();
        this.bubbleContent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBubbleContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bubbleContent_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStime(long j) {
        this.stime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8211a.f16847xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Bubble();
            case 2:
                return new C8212b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0002", new Object[]{"bubbleContent_", "version_", "stime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Bubble> parser = PARSER;
                if (parser == null) {
                    synchronized (Bubble.class) {
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

    public String getBubbleContent() {
        return this.bubbleContent_;
    }

    public ByteString getBubbleContentBytes() {
        return ByteString.copyFromUtf8(this.bubbleContent_);
    }

    public long getStime() {
        return this.stime_;
    }

    public int getVersion() {
        return this.version_;
    }

    public static C8212b newBuilder(Bubble bubble) {
        return DEFAULT_INSTANCE.createBuilder(bubble);
    }

    public static Bubble parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Bubble) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Bubble parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Bubble parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Bubble parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Bubble parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Bubble parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Bubble parseFrom(InputStream inputStream) throws IOException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Bubble parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Bubble parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Bubble parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
