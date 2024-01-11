package com.bapis.bilibili.app.interfaces.v1;

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
/* loaded from: classes19.dex */
public final class ModeStatusReq extends GeneratedMessageLite<ModeStatusReq, ModeStatusReq.C6288b> implements MessageLiteOrBuilder {
    private static final ModeStatusReq DEFAULT_INSTANCE;
    public static final int DEVICE_TOKEN_FIELD_NUMBER = 1;
    private static volatile Parser<ModeStatusReq> PARSER;
    private String deviceToken_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.interfaces.v1.ModeStatusReq$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C6287a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17571xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17571xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17571xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17571xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17571xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17571xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17571xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17571xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.interfaces.v1.ModeStatusReq$b */
    /* loaded from: classes19.dex */
    public static final class C6288b extends GeneratedMessageLite.Builder<ModeStatusReq, C6288b> implements MessageLiteOrBuilder {
        /* synthetic */ C6288b(C6287a c6287a) {
            this();
        }

        public C6288b clearDeviceToken() {
            copyOnWrite();
            ((ModeStatusReq) this.instance).clearDeviceToken();
            return this;
        }

        public String getDeviceToken() {
            return ((ModeStatusReq) this.instance).getDeviceToken();
        }

        public ByteString getDeviceTokenBytes() {
            return ((ModeStatusReq) this.instance).getDeviceTokenBytes();
        }

        public C6288b setDeviceToken(String str) {
            copyOnWrite();
            ((ModeStatusReq) this.instance).setDeviceToken(str);
            return this;
        }

        public C6288b setDeviceTokenBytes(ByteString byteString) {
            copyOnWrite();
            ((ModeStatusReq) this.instance).setDeviceTokenBytes(byteString);
            return this;
        }

        private C6288b() {
            super(ModeStatusReq.DEFAULT_INSTANCE);
        }
    }

    static {
        ModeStatusReq modeStatusReq = new ModeStatusReq();
        DEFAULT_INSTANCE = modeStatusReq;
        GeneratedMessageLite.registerDefaultInstance(ModeStatusReq.class, modeStatusReq);
    }

    private ModeStatusReq() {
    }

    public void clearDeviceToken() {
        this.deviceToken_ = getDefaultInstance().getDeviceToken();
    }

    public static ModeStatusReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6288b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ModeStatusReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ModeStatusReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModeStatusReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModeStatusReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ModeStatusReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setDeviceToken(String str) {
        str.getClass();
        this.deviceToken_ = str;
    }

    public void setDeviceTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceToken_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C6287a c6287a = null;
        switch (C6287a.f17571xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ModeStatusReq();
            case 2:
                return new C6288b(c6287a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"deviceToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ModeStatusReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ModeStatusReq.class) {
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

    public String getDeviceToken() {
        return this.deviceToken_;
    }

    public ByteString getDeviceTokenBytes() {
        return ByteString.copyFromUtf8(this.deviceToken_);
    }

    public static C6288b newBuilder(ModeStatusReq modeStatusReq) {
        return DEFAULT_INSTANCE.createBuilder(modeStatusReq);
    }

    public static ModeStatusReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModeStatusReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ModeStatusReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModeStatusReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ModeStatusReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ModeStatusReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ModeStatusReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModeStatusReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ModeStatusReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ModeStatusReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ModeStatusReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModeStatusReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ModeStatusReq parseFrom(InputStream inputStream) throws IOException {
        return (ModeStatusReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModeStatusReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModeStatusReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ModeStatusReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ModeStatusReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ModeStatusReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModeStatusReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
