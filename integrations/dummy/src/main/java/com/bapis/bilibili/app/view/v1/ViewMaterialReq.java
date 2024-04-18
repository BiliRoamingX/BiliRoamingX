package com.bapis.bilibili.app.view.v1;

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
public final class ViewMaterialReq extends GeneratedMessageLite<ViewMaterialReq, ViewMaterialReq.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int BVID_FIELD_NUMBER = 2;
    public static final int CID_FIELD_NUMBER = 3;
    private static final ViewMaterialReq DEFAULT_INSTANCE;
    private static volatile Parser<ViewMaterialReq> PARSER;
    private long aid_;
    private String bvid_ = "";
    private long cid_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ViewMaterialReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68991 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16853xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16853xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16853xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16853xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16853xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16853xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16853xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16853xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewMaterialReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68991 c68991) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((ViewMaterialReq) this.instance).clearAid();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((ViewMaterialReq) this.instance).clearBvid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((ViewMaterialReq) this.instance).clearCid();
            return this;
        }

        public long getAid() {
            return ((ViewMaterialReq) this.instance).getAid();
        }

        public String getBvid() {
            return ((ViewMaterialReq) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((ViewMaterialReq) this.instance).getBvidBytes();
        }

        public long getCid() {
            return ((ViewMaterialReq) this.instance).getCid();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((ViewMaterialReq) this.instance).setAid(j);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((ViewMaterialReq) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewMaterialReq) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((ViewMaterialReq) this.instance).setCid(j);
            return this;
        }

        private Builder() {
            super(ViewMaterialReq.DEFAULT_INSTANCE);
        }
    }

    static {
        ViewMaterialReq viewMaterialReq = new ViewMaterialReq();
        DEFAULT_INSTANCE = viewMaterialReq;
        GeneratedMessageLite.registerDefaultInstance(ViewMaterialReq.class, viewMaterialReq);
    }

    private ViewMaterialReq() {
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
    public void clearCid() {
        this.cid_ = 0L;
    }

    public static ViewMaterialReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewMaterialReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewMaterialReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewMaterialReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewMaterialReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewMaterialReq> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68991.f16853xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewMaterialReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002", new Object[]{"aid_", "bvid_", "cid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewMaterialReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewMaterialReq.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public long getCid() {
        return this.cid_;
    }

    public static Builder newBuilder(ViewMaterialReq viewMaterialReq) {
        return DEFAULT_INSTANCE.createBuilder(viewMaterialReq);
    }

    public static ViewMaterialReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewMaterialReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewMaterialReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewMaterialReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewMaterialReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewMaterialReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ViewMaterialReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewMaterialReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewMaterialReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewMaterialReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewMaterialReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewMaterialReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewMaterialReq parseFrom(InputStream inputStream) throws IOException {
        return (ViewMaterialReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewMaterialReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewMaterialReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewMaterialReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewMaterialReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewMaterialReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewMaterialReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
