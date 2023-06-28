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
public final class AddContractReq extends GeneratedMessageLite<AddContractReq, AddContractReq.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    private static final AddContractReq DEFAULT_INSTANCE;
    private static volatile Parser<AddContractReq> PARSER = null;
    public static final int SPMID_FIELD_NUMBER = 3;
    public static final int UP_MID_FIELD_NUMBER = 2;
    private long aid_;
    private String spmid_ = "";
    private long upMid_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.AddContractReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67071 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16683xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16683xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16683xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16683xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16683xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16683xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16683xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16683xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AddContractReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67071 c67071) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((AddContractReq) this.instance).clearAid();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((AddContractReq) this.instance).clearSpmid();
            return this;
        }

        public Builder clearUpMid() {
            copyOnWrite();
            ((AddContractReq) this.instance).clearUpMid();
            return this;
        }

        public long getAid() {
            return ((AddContractReq) this.instance).getAid();
        }

        public String getSpmid() {
            return ((AddContractReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((AddContractReq) this.instance).getSpmidBytes();
        }

        public long getUpMid() {
            return ((AddContractReq) this.instance).getUpMid();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((AddContractReq) this.instance).setAid(j);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((AddContractReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((AddContractReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        public Builder setUpMid(long j) {
            copyOnWrite();
            ((AddContractReq) this.instance).setUpMid(j);
            return this;
        }

        private Builder() {
            super(AddContractReq.DEFAULT_INSTANCE);
        }
    }

    static {
        AddContractReq addContractReq = new AddContractReq();
        DEFAULT_INSTANCE = addContractReq;
        GeneratedMessageLite.registerDefaultInstance(AddContractReq.class, addContractReq);
    }

    private AddContractReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpMid() {
        this.upMid_ = 0L;
    }

    public static AddContractReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AddContractReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AddContractReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddContractReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AddContractReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AddContractReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpMid(long j) {
        this.upMid_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67071.f16683xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AddContractReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0208", new Object[]{"aid_", "upMid_", "spmid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AddContractReq> parser = PARSER;
                if (parser == null) {
                    synchronized (AddContractReq.class) {
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

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public long getUpMid() {
        return this.upMid_;
    }

    public static Builder newBuilder(AddContractReq addContractReq) {
        return DEFAULT_INSTANCE.createBuilder(addContractReq);
    }

    public static AddContractReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AddContractReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AddContractReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AddContractReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AddContractReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AddContractReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AddContractReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AddContractReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AddContractReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AddContractReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AddContractReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AddContractReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AddContractReq parseFrom(InputStream inputStream) throws IOException {
        return (AddContractReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddContractReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AddContractReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AddContractReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AddContractReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AddContractReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AddContractReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
