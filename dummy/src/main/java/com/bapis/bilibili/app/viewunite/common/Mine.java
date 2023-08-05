package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class Mine extends GeneratedMessageLite<Mine, Mine.Builder> implements MessageLiteOrBuilder {
    public static final int AMOUNT_FIELD_NUMBER = 1;
    private static final Mine DEFAULT_INSTANCE;
    public static final int MSG_FIELD_NUMBER = 3;
    private static volatile Parser<Mine> PARSER = null;
    public static final int RANK_FIELD_NUMBER = 2;
    private double amount_;
    private String msg_ = "";
    private int rank_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Mine$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70141 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16997xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16997xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16997xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16997xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16997xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16997xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16997xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16997xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Mine, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70141 c70141) {
            this();
        }

        public Builder clearAmount() {
            copyOnWrite();
            ((Mine) this.instance).clearAmount();
            return this;
        }

        public Builder clearMsg() {
            copyOnWrite();
            ((Mine) this.instance).clearMsg();
            return this;
        }

        public Builder clearRank() {
            copyOnWrite();
            ((Mine) this.instance).clearRank();
            return this;
        }

        public double getAmount() {
            return ((Mine) this.instance).getAmount();
        }

        public String getMsg() {
            return ((Mine) this.instance).getMsg();
        }

        public ByteString getMsgBytes() {
            return ((Mine) this.instance).getMsgBytes();
        }

        public int getRank() {
            return ((Mine) this.instance).getRank();
        }

        public Builder setAmount(double d) {
            copyOnWrite();
            ((Mine) this.instance).setAmount(d);
            return this;
        }

        public Builder setMsg(String str) {
            copyOnWrite();
            ((Mine) this.instance).setMsg(str);
            return this;
        }

        public Builder setMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((Mine) this.instance).setMsgBytes(byteString);
            return this;
        }

        public Builder setRank(int i) {
            copyOnWrite();
            ((Mine) this.instance).setRank(i);
            return this;
        }

        private Builder() {
            super(Mine.DEFAULT_INSTANCE);
        }
    }

    static {
        Mine mine = new Mine();
        DEFAULT_INSTANCE = mine;
        GeneratedMessageLite.registerDefaultInstance(Mine.class, mine);
    }

    private Mine() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAmount() {
        this.amount_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsg() {
        this.msg_ = getDefaultInstance().getMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRank() {
        this.rank_ = 0;
    }

    public static Mine getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Mine parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Mine) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mine parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Mine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Mine> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmount(double d) {
        this.amount_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsg(String str) {
        str.getClass();
        this.msg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.msg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRank(int i) {
        this.rank_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70141.f16997xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Mine();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0004\u0003\u0208", new Object[]{"amount_", "rank_", "msg_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Mine> parser = PARSER;
                if (parser == null) {
                    synchronized (Mine.class) {
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

    public double getAmount() {
        return this.amount_;
    }

    public String getMsg() {
        return this.msg_;
    }

    public ByteString getMsgBytes() {
        return ByteString.copyFromUtf8(this.msg_);
    }

    public int getRank() {
        return this.rank_;
    }

    public static Builder newBuilder(Mine mine) {
        return DEFAULT_INSTANCE.createBuilder(mine);
    }

    public static Mine parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Mine) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Mine parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Mine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Mine parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Mine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Mine parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Mine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Mine parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Mine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Mine parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Mine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Mine parseFrom(InputStream inputStream) throws IOException {
        return (Mine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mine parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Mine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Mine parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Mine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Mine parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Mine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
