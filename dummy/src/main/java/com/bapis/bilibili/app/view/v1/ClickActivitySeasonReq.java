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
public final class ClickActivitySeasonReq extends GeneratedMessageLite<ClickActivitySeasonReq, ClickActivitySeasonReq.Builder> implements MessageLiteOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 5;
    private static final ClickActivitySeasonReq DEFAULT_INSTANCE;
    public static final int FAV_SEASON_FIELD_NUMBER = 4;
    public static final int ORDER_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<ClickActivitySeasonReq> PARSER = null;
    public static final int RESERVE_FIELD_NUMBER = 3;
    public static final int SPMID_FIELD_NUMBER = 2;
    private long action_;
    private Object orderParam_;
    private int orderType_;
    private int orderParamCase_ = 0;
    private String spmid_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ClickActivitySeasonReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67361 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16710xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16710xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16710xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16710xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16710xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16710xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16710xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16710xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ClickActivitySeasonReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67361 c67361) {
            this();
        }

        public Builder clearAction() {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).clearAction();
            return this;
        }

        public Builder clearFavSeason() {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).clearFavSeason();
            return this;
        }

        public Builder clearOrderParam() {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).clearOrderParam();
            return this;
        }

        public Builder clearOrderType() {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).clearOrderType();
            return this;
        }

        public Builder clearReserve() {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).clearReserve();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).clearSpmid();
            return this;
        }

        public long getAction() {
            return ((ClickActivitySeasonReq) this.instance).getAction();
        }

        public BizFavSeasonParam getFavSeason() {
            return ((ClickActivitySeasonReq) this.instance).getFavSeason();
        }

        public OrderParamCase getOrderParamCase() {
            return ((ClickActivitySeasonReq) this.instance).getOrderParamCase();
        }

        public BizType getOrderType() {
            return ((ClickActivitySeasonReq) this.instance).getOrderType();
        }

        public int getOrderTypeValue() {
            return ((ClickActivitySeasonReq) this.instance).getOrderTypeValue();
        }

        public BizReserveActivityParam getReserve() {
            return ((ClickActivitySeasonReq) this.instance).getReserve();
        }

        public String getSpmid() {
            return ((ClickActivitySeasonReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((ClickActivitySeasonReq) this.instance).getSpmidBytes();
        }

        public boolean hasFavSeason() {
            return ((ClickActivitySeasonReq) this.instance).hasFavSeason();
        }

        public boolean hasReserve() {
            return ((ClickActivitySeasonReq) this.instance).hasReserve();
        }

        public Builder mergeFavSeason(BizFavSeasonParam bizFavSeasonParam) {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).mergeFavSeason(bizFavSeasonParam);
            return this;
        }

        public Builder mergeReserve(BizReserveActivityParam bizReserveActivityParam) {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).mergeReserve(bizReserveActivityParam);
            return this;
        }

        public Builder setAction(long j) {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).setAction(j);
            return this;
        }

        public Builder setFavSeason(BizFavSeasonParam bizFavSeasonParam) {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).setFavSeason(bizFavSeasonParam);
            return this;
        }

        public Builder setOrderType(BizType bizType) {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).setOrderType(bizType);
            return this;
        }

        public Builder setOrderTypeValue(int i) {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).setOrderTypeValue(i);
            return this;
        }

        public Builder setReserve(BizReserveActivityParam bizReserveActivityParam) {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).setReserve(bizReserveActivityParam);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        private Builder() {
            super(ClickActivitySeasonReq.DEFAULT_INSTANCE);
        }

        public Builder setFavSeason(BizFavSeasonParam.Builder builder) {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).setFavSeason(builder.build());
            return this;
        }

        public Builder setReserve(BizReserveActivityParam.Builder builder) {
            copyOnWrite();
            ((ClickActivitySeasonReq) this.instance).setReserve(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public enum OrderParamCase {
        RESERVE(3),
        FAV_SEASON(4),
        ORDERPARAM_NOT_SET(0);
        
        private final int value;

        OrderParamCase(int i) {
            this.value = i;
        }

        public static OrderParamCase forNumber(int i) {
            if (i != 0) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return FAV_SEASON;
                }
                return RESERVE;
            }
            return ORDERPARAM_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static OrderParamCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ClickActivitySeasonReq clickActivitySeasonReq = new ClickActivitySeasonReq();
        DEFAULT_INSTANCE = clickActivitySeasonReq;
        GeneratedMessageLite.registerDefaultInstance(ClickActivitySeasonReq.class, clickActivitySeasonReq);
    }

    private ClickActivitySeasonReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavSeason() {
        if (this.orderParamCase_ == 4) {
            this.orderParamCase_ = 0;
            this.orderParam_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrderParam() {
        this.orderParamCase_ = 0;
        this.orderParam_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrderType() {
        this.orderType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserve() {
        if (this.orderParamCase_ == 3) {
            this.orderParamCase_ = 0;
            this.orderParam_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    public static ClickActivitySeasonReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFavSeason(BizFavSeasonParam bizFavSeasonParam) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReserve(BizReserveActivityParam bizReserveActivityParam) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClickActivitySeasonReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ClickActivitySeasonReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClickActivitySeasonReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ClickActivitySeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ClickActivitySeasonReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(long j) {
        this.action_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavSeason(BizFavSeasonParam bizFavSeasonParam) {
        bizFavSeasonParam.getClass();
        this.orderParam_ = bizFavSeasonParam;
        this.orderParamCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderType(BizType bizType) {
        this.orderType_ = bizType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderTypeValue(int i) {
        this.orderType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserve(BizReserveActivityParam bizReserveActivityParam) {
        bizReserveActivityParam.getClass();
        this.orderParam_ = bizReserveActivityParam;
        this.orderParamCase_ = 3;
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
        switch (C67361.f16710xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ClickActivitySeasonReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003<\u0000\u0004<\u0000\u0005\u0002", new Object[]{"orderParam_", "orderParamCase_", "orderType_", "spmid_", BizReserveActivityParam.class, BizFavSeasonParam.class, "action_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ClickActivitySeasonReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ClickActivitySeasonReq.class) {
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

    public BizFavSeasonParam getFavSeason() {
        if (this.orderParamCase_ == 4) {
            return (BizFavSeasonParam) this.orderParam_;
        }
        return BizFavSeasonParam.getDefaultInstance();
    }

    public OrderParamCase getOrderParamCase() {
        return OrderParamCase.forNumber(this.orderParamCase_);
    }

    public BizType getOrderType() {
        BizType forNumber = BizType.forNumber(this.orderType_);
        return forNumber == null ? BizType.UNRECOGNIZED : forNumber;
    }

    public int getOrderTypeValue() {
        return this.orderType_;
    }

    public BizReserveActivityParam getReserve() {
        if (this.orderParamCase_ == 3) {
            return (BizReserveActivityParam) this.orderParam_;
        }
        return BizReserveActivityParam.getDefaultInstance();
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public boolean hasFavSeason() {
        return this.orderParamCase_ == 4;
    }

    public boolean hasReserve() {
        return this.orderParamCase_ == 3;
    }

    public static Builder newBuilder(ClickActivitySeasonReq clickActivitySeasonReq) {
        return DEFAULT_INSTANCE.createBuilder(clickActivitySeasonReq);
    }

    public static ClickActivitySeasonReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClickActivitySeasonReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClickActivitySeasonReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClickActivitySeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ClickActivitySeasonReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ClickActivitySeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ClickActivitySeasonReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClickActivitySeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ClickActivitySeasonReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ClickActivitySeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClickActivitySeasonReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClickActivitySeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ClickActivitySeasonReq parseFrom(InputStream inputStream) throws IOException {
        return (ClickActivitySeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClickActivitySeasonReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClickActivitySeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClickActivitySeasonReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ClickActivitySeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClickActivitySeasonReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClickActivitySeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
