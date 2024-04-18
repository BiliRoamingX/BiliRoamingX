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
public final class ClickPlayerCardReq extends GeneratedMessageLite<ClickPlayerCardReq, ClickPlayerCardReq.Builder> implements MessageLiteOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int AID_FIELD_NUMBER = 2;
    public static final int CID_FIELD_NUMBER = 3;
    private static final ClickPlayerCardReq DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<ClickPlayerCardReq> PARSER = null;
    public static final int SPMID_FIELD_NUMBER = 5;
    private long action_;
    private long aid_;
    private long cid_;
    private long id_;
    private String spmid_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ClickPlayerCardReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67381 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16712xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16712xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16712xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16712xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16712xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16712xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16712xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16712xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ClickPlayerCardReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67381 c67381) {
            this();
        }

        public Builder clearAction() {
            copyOnWrite();
            ((ClickPlayerCardReq) this.instance).clearAction();
            return this;
        }

        public Builder clearAid() {
            copyOnWrite();
            ((ClickPlayerCardReq) this.instance).clearAid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((ClickPlayerCardReq) this.instance).clearCid();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((ClickPlayerCardReq) this.instance).clearId();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((ClickPlayerCardReq) this.instance).clearSpmid();
            return this;
        }

        public long getAction() {
            return ((ClickPlayerCardReq) this.instance).getAction();
        }

        public long getAid() {
            return ((ClickPlayerCardReq) this.instance).getAid();
        }

        public long getCid() {
            return ((ClickPlayerCardReq) this.instance).getCid();
        }

        public long getId() {
            return ((ClickPlayerCardReq) this.instance).getId();
        }

        public String getSpmid() {
            return ((ClickPlayerCardReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((ClickPlayerCardReq) this.instance).getSpmidBytes();
        }

        public Builder setAction(long j) {
            copyOnWrite();
            ((ClickPlayerCardReq) this.instance).setAction(j);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((ClickPlayerCardReq) this.instance).setAid(j);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((ClickPlayerCardReq) this.instance).setCid(j);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((ClickPlayerCardReq) this.instance).setId(j);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((ClickPlayerCardReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((ClickPlayerCardReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        private Builder() {
            super(ClickPlayerCardReq.DEFAULT_INSTANCE);
        }
    }

    static {
        ClickPlayerCardReq clickPlayerCardReq = new ClickPlayerCardReq();
        DEFAULT_INSTANCE = clickPlayerCardReq;
        GeneratedMessageLite.registerDefaultInstance(ClickPlayerCardReq.class, clickPlayerCardReq);
    }

    private ClickPlayerCardReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    public static ClickPlayerCardReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClickPlayerCardReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ClickPlayerCardReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClickPlayerCardReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ClickPlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ClickPlayerCardReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(long j) {
        this.action_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmid(String str) {
        str.getClass();
        this.spmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.spmid_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67381.f16712xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ClickPlayerCardReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0208", new Object[]{"id_", "aid_", "cid_", "action_", "spmid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ClickPlayerCardReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ClickPlayerCardReq.class) {
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

    public long getAction() {
        return this.action_;
    }

    public long getAid() {
        return this.aid_;
    }

    public long getCid() {
        return this.cid_;
    }

    public long getId() {
        return this.id_;
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public static Builder newBuilder(ClickPlayerCardReq clickPlayerCardReq) {
        return DEFAULT_INSTANCE.createBuilder(clickPlayerCardReq);
    }

    public static ClickPlayerCardReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClickPlayerCardReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClickPlayerCardReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClickPlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ClickPlayerCardReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ClickPlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ClickPlayerCardReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClickPlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ClickPlayerCardReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ClickPlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClickPlayerCardReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClickPlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ClickPlayerCardReq parseFrom(InputStream inputStream) throws IOException {
        return (ClickPlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClickPlayerCardReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClickPlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClickPlayerCardReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ClickPlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClickPlayerCardReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClickPlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
