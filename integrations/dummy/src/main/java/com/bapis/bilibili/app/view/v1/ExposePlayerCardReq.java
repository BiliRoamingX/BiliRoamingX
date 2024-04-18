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
public final class ExposePlayerCardReq extends GeneratedMessageLite<ExposePlayerCardReq, ExposePlayerCardReq.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 2;
    public static final int CARD_TYPE_FIELD_NUMBER = 1;
    public static final int CID_FIELD_NUMBER = 3;
    private static final ExposePlayerCardReq DEFAULT_INSTANCE;
    private static volatile Parser<ExposePlayerCardReq> PARSER = null;
    public static final int SPMID_FIELD_NUMBER = 4;
    private long aid_;
    private int cardType_;
    private long cid_;
    private String spmid_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ExposePlayerCardReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67621 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16734xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16734xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16734xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16734xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16734xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16734xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16734xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16734xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ExposePlayerCardReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67621 c67621) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((ExposePlayerCardReq) this.instance).clearAid();
            return this;
        }

        public Builder clearCardType() {
            copyOnWrite();
            ((ExposePlayerCardReq) this.instance).clearCardType();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((ExposePlayerCardReq) this.instance).clearCid();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((ExposePlayerCardReq) this.instance).clearSpmid();
            return this;
        }

        public long getAid() {
            return ((ExposePlayerCardReq) this.instance).getAid();
        }

        public PlayerCardType getCardType() {
            return ((ExposePlayerCardReq) this.instance).getCardType();
        }

        public int getCardTypeValue() {
            return ((ExposePlayerCardReq) this.instance).getCardTypeValue();
        }

        public long getCid() {
            return ((ExposePlayerCardReq) this.instance).getCid();
        }

        public String getSpmid() {
            return ((ExposePlayerCardReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((ExposePlayerCardReq) this.instance).getSpmidBytes();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((ExposePlayerCardReq) this.instance).setAid(j);
            return this;
        }

        public Builder setCardType(PlayerCardType playerCardType) {
            copyOnWrite();
            ((ExposePlayerCardReq) this.instance).setCardType(playerCardType);
            return this;
        }

        public Builder setCardTypeValue(int i) {
            copyOnWrite();
            ((ExposePlayerCardReq) this.instance).setCardTypeValue(i);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((ExposePlayerCardReq) this.instance).setCid(j);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((ExposePlayerCardReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((ExposePlayerCardReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        private Builder() {
            super(ExposePlayerCardReq.DEFAULT_INSTANCE);
        }
    }

    static {
        ExposePlayerCardReq exposePlayerCardReq = new ExposePlayerCardReq();
        DEFAULT_INSTANCE = exposePlayerCardReq;
        GeneratedMessageLite.registerDefaultInstance(ExposePlayerCardReq.class, exposePlayerCardReq);
    }

    private ExposePlayerCardReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardType() {
        this.cardType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    public static ExposePlayerCardReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExposePlayerCardReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExposePlayerCardReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExposePlayerCardReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExposePlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExposePlayerCardReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardType(PlayerCardType playerCardType) {
        this.cardType_ = playerCardType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardTypeValue(int i) {
        this.cardType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
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
        switch (C67621.f16734xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ExposePlayerCardReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\u0002\u0004\u0208", new Object[]{"cardType_", "aid_", "cid_", "spmid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExposePlayerCardReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ExposePlayerCardReq.class) {
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

    public PlayerCardType getCardType() {
        PlayerCardType forNumber = PlayerCardType.forNumber(this.cardType_);
        return forNumber == null ? PlayerCardType.UNRECOGNIZED : forNumber;
    }

    public int getCardTypeValue() {
        return this.cardType_;
    }

    public long getCid() {
        return this.cid_;
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public static Builder newBuilder(ExposePlayerCardReq exposePlayerCardReq) {
        return DEFAULT_INSTANCE.createBuilder(exposePlayerCardReq);
    }

    public static ExposePlayerCardReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExposePlayerCardReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExposePlayerCardReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExposePlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExposePlayerCardReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExposePlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExposePlayerCardReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExposePlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExposePlayerCardReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExposePlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExposePlayerCardReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExposePlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExposePlayerCardReq parseFrom(InputStream inputStream) throws IOException {
        return (ExposePlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExposePlayerCardReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExposePlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExposePlayerCardReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExposePlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExposePlayerCardReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExposePlayerCardReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
