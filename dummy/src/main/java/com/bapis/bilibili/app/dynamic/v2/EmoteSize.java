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
public final class EmoteSize extends GeneratedMessageLite<EmoteSize, EmoteSize.C5460b> implements m1 {
    private static final EmoteSize DEFAULT_INSTANCE;
    public static final int EMOJI_SIZE_FIELD_NUMBER = 2;
    private static volatile Parser<EmoteSize> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int emojiSize_;
    private double width_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.EmoteSize$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5459a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17292xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17292xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17292xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17292xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17292xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17292xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17292xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17292xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.EmoteSize$b */
    /* loaded from: classes19.dex */
    public static final class C5460b extends GeneratedMessageLite.Builder<EmoteSize, C5460b> implements m1 {
        /* synthetic */ C5460b(C5459a c5459a) {
            this();
        }

        public C5460b clearEmojiSize() {
            copyOnWrite();
            ((EmoteSize) this.instance).clearEmojiSize();
            return this;
        }

        public C5460b clearWidth() {
            copyOnWrite();
            ((EmoteSize) this.instance).clearWidth();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.m1
        public int getEmojiSize() {
            return ((EmoteSize) this.instance).getEmojiSize();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.m1
        public double getWidth() {
            return ((EmoteSize) this.instance).getWidth();
        }

        public C5460b setEmojiSize(int i2) {
            copyOnWrite();
            ((EmoteSize) this.instance).setEmojiSize(i2);
            return this;
        }

        public C5460b setWidth(double d2) {
            copyOnWrite();
            ((EmoteSize) this.instance).setWidth(d2);
            return this;
        }

        private C5460b() {
            super(EmoteSize.DEFAULT_INSTANCE);
        }
    }

    static {
        EmoteSize emoteSize = new EmoteSize();
        DEFAULT_INSTANCE = emoteSize;
        GeneratedMessageLite.registerDefaultInstance(EmoteSize.class, emoteSize);
    }

    private EmoteSize() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmojiSize() {
        this.emojiSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0.0d;
    }

    public static EmoteSize getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5460b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EmoteSize parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EmoteSize) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmoteSize parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EmoteSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EmoteSize> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiSize(int i2) {
        this.emojiSize_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(double d2) {
        this.width_ = d2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5459a c5459a = null;
        switch (C5459a.f17292xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EmoteSize();
            case 2:
                return new C5460b(c5459a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0004", new Object[]{"width_", "emojiSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EmoteSize> parser = PARSER;
                if (parser == null) {
                    synchronized (EmoteSize.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.m1
    public int getEmojiSize() {
        return this.emojiSize_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.m1
    public double getWidth() {
        return this.width_;
    }

    public static C5460b newBuilder(EmoteSize emoteSize) {
        return DEFAULT_INSTANCE.createBuilder(emoteSize);
    }

    public static EmoteSize parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmoteSize) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmoteSize parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmoteSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EmoteSize parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EmoteSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EmoteSize parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmoteSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EmoteSize parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EmoteSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EmoteSize parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmoteSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EmoteSize parseFrom(InputStream inputStream) throws IOException {
        return (EmoteSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmoteSize parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmoteSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmoteSize parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EmoteSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EmoteSize parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmoteSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
