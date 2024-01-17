package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class ArcRefreshReq extends GeneratedMessageLite<ArcRefreshReq, ArcRefreshReq.C8200b> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int BVID_FIELD_NUMBER = 2;
    private static final ArcRefreshReq DEFAULT_INSTANCE;
    private static volatile Parser<ArcRefreshReq> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private long aid_;
    private String bvid_ = "";
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ArcRefreshReq$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C8199a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f18326xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f18326xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18326xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18326xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18326xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18326xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18326xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18326xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ArcRefreshReq$b */
    /* loaded from: classes20.dex */
    public static final class C8200b extends GeneratedMessageLite.Builder<ArcRefreshReq, C8200b> implements MessageLiteOrBuilder {
        /* synthetic */ C8200b(C8199a c8199a) {
            this();
        }

        public C8200b clearAid() {
            copyOnWrite();
            ((ArcRefreshReq) this.instance).clearAid();
            return this;
        }

        public C8200b clearBvid() {
            copyOnWrite();
            ((ArcRefreshReq) this.instance).clearBvid();
            return this;
        }

        public C8200b clearType() {
            copyOnWrite();
            ((ArcRefreshReq) this.instance).clearType();
            return this;
        }

        public long getAid() {
            return ((ArcRefreshReq) this.instance).getAid();
        }

        public String getBvid() {
            return ((ArcRefreshReq) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((ArcRefreshReq) this.instance).getBvidBytes();
        }

        public UnionType getType() {
            return ((ArcRefreshReq) this.instance).getType();
        }

        public int getTypeValue() {
            return ((ArcRefreshReq) this.instance).getTypeValue();
        }

        public C8200b setAid(long j2) {
            copyOnWrite();
            ((ArcRefreshReq) this.instance).setAid(j2);
            return this;
        }

        public C8200b setBvid(String str) {
            copyOnWrite();
            ((ArcRefreshReq) this.instance).setBvid(str);
            return this;
        }

        public C8200b setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((ArcRefreshReq) this.instance).setBvidBytes(byteString);
            return this;
        }

        public C8200b setType(UnionType unionType) {
            copyOnWrite();
            ((ArcRefreshReq) this.instance).setType(unionType);
            return this;
        }

        public C8200b setTypeValue(int i2) {
            copyOnWrite();
            ((ArcRefreshReq) this.instance).setTypeValue(i2);
            return this;
        }

        private C8200b() {
            super(ArcRefreshReq.DEFAULT_INSTANCE);
        }
    }

    static {
        ArcRefreshReq arcRefreshReq = new ArcRefreshReq();
        DEFAULT_INSTANCE = arcRefreshReq;
        GeneratedMessageLite.registerDefaultInstance(ArcRefreshReq.class, arcRefreshReq);
    }

    private ArcRefreshReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static ArcRefreshReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8200b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ArcRefreshReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ArcRefreshReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArcRefreshReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ArcRefreshReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ArcRefreshReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j2) {
        this.aid_ = j2;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(UnionType unionType) {
        this.type_ = unionType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C8199a c8199a = null;
        switch (C8199a.f18326xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ArcRefreshReq();
            case 2:
                return new C8200b(c8199a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\f", new Object[]{"aid_", "bvid_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ArcRefreshReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ArcRefreshReq.class) {
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

    public UnionType getType() {
        UnionType forNumber = UnionType.forNumber(this.type_);
        return forNumber == null ? UnionType.UNRECOGNIZED : forNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static C8200b newBuilder(ArcRefreshReq arcRefreshReq) {
        return DEFAULT_INSTANCE.createBuilder(arcRefreshReq);
    }

    public static ArcRefreshReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcRefreshReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArcRefreshReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcRefreshReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ArcRefreshReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ArcRefreshReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ArcRefreshReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcRefreshReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ArcRefreshReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ArcRefreshReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArcRefreshReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcRefreshReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ArcRefreshReq parseFrom(InputStream inputStream) throws IOException {
        return (ArcRefreshReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArcRefreshReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcRefreshReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArcRefreshReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ArcRefreshReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ArcRefreshReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcRefreshReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
