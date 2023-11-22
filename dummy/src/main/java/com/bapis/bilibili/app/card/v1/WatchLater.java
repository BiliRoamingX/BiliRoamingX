package com.bapis.bilibili.app.card.v1;

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
public final class WatchLater extends GeneratedMessageLite<WatchLater, WatchLater.C5918b> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int BVID_FIELD_NUMBER = 2;
    private static final WatchLater DEFAULT_INSTANCE;
    private static volatile Parser<WatchLater> PARSER;
    private long aid_;
    private String bvid_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.WatchLater$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5917a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16007xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16007xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16007xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.WatchLater$b */
    /* loaded from: classes13.dex */
    public static final class C5918b extends GeneratedMessageLite.Builder<WatchLater, C5918b> implements MessageLiteOrBuilder {
        /* synthetic */ C5918b(C5917a c5917a) {
            this();
        }

        public C5918b clearAid() {
            copyOnWrite();
            ((WatchLater) this.instance).clearAid();
            return this;
        }

        public C5918b clearBvid() {
            copyOnWrite();
            ((WatchLater) this.instance).clearBvid();
            return this;
        }

        public long getAid() {
            return ((WatchLater) this.instance).getAid();
        }

        public String getBvid() {
            return ((WatchLater) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((WatchLater) this.instance).getBvidBytes();
        }

        public C5918b setAid(long j) {
            copyOnWrite();
            ((WatchLater) this.instance).setAid(j);
            return this;
        }

        public C5918b setBvid(String str) {
            copyOnWrite();
            ((WatchLater) this.instance).setBvid(str);
            return this;
        }

        public C5918b setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchLater) this.instance).setBvidBytes(byteString);
            return this;
        }

        private C5918b() {
            super(WatchLater.DEFAULT_INSTANCE);
        }
    }

    static {
        WatchLater watchLater = new WatchLater();
        DEFAULT_INSTANCE = watchLater;
        GeneratedMessageLite.registerDefaultInstance(WatchLater.class, watchLater);
    }

    private WatchLater() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    public static WatchLater getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5918b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchLater parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchLater) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchLater parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchLater) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchLater> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvid(String str) {
        str.getClass();
        this.bvid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bvid_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5917a.f16007xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new WatchLater();
            case 2:
                return new C5918b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0208", new Object[]{"aid_", "bvid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchLater> parser = PARSER;
                if (parser == null) {
                    synchronized (WatchLater.class) {
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

    public long getAid() {
        return this.aid_;
    }

    public String getBvid() {
        return this.bvid_;
    }

    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    public static C5918b newBuilder(WatchLater watchLater) {
        return DEFAULT_INSTANCE.createBuilder(watchLater);
    }

    public static WatchLater parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchLater) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchLater parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchLater) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchLater parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchLater) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchLater parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchLater) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchLater parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchLater) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchLater parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchLater) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchLater parseFrom(InputStream inputStream) throws IOException {
        return (WatchLater) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchLater parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchLater) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchLater parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchLater) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchLater parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchLater) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
