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
public final class Order extends GeneratedMessageLite<Order, Order.Builder> implements MessageLiteOrBuilder {
    public static final int BUTTON_SELECTED_TITLE_FIELD_NUMBER = 4;
    public static final int BUTTON_TITLE_FIELD_NUMBER = 3;
    private static final Order DEFAULT_INSTANCE;
    public static final int FAV_SEASON_FIELD_NUMBER = 9;
    public static final int INTRO_FIELD_NUMBER = 10;
    public static final int ORDER_TYPE_FIELD_NUMBER = 7;
    private static volatile Parser<Order> PARSER = null;
    public static final int RESERVE_FIELD_NUMBER = 8;
    public static final int SEASON_STAT_DANMAKU_FIELD_NUMBER = 6;
    public static final int SEASON_STAT_VIEW_FIELD_NUMBER = 5;
    public static final int SEASON_STAT_VIEW_VT_FIELD_NUMBER = 11;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    private Object orderParam_;
    private int orderType_;
    private long seasonStatDanmaku_;
    private StatInfo seasonStatViewVt_;
    private long seasonStatView_;
    private boolean status_;
    private int orderParamCase_ = 0;
    private String title_ = "";
    private String buttonTitle_ = "";
    private String buttonSelectedTitle_ = "";
    private String intro_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Order$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68101 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16775xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16775xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16775xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16775xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16775xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16775xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16775xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16775xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Order, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68101 c68101) {
            this();
        }

        public Builder clearButtonSelectedTitle() {
            copyOnWrite();
            ((Order) this.instance).clearButtonSelectedTitle();
            return this;
        }

        public Builder clearButtonTitle() {
            copyOnWrite();
            ((Order) this.instance).clearButtonTitle();
            return this;
        }

        public Builder clearFavSeason() {
            copyOnWrite();
            ((Order) this.instance).clearFavSeason();
            return this;
        }

        public Builder clearIntro() {
            copyOnWrite();
            ((Order) this.instance).clearIntro();
            return this;
        }

        public Builder clearOrderParam() {
            copyOnWrite();
            ((Order) this.instance).clearOrderParam();
            return this;
        }

        public Builder clearOrderType() {
            copyOnWrite();
            ((Order) this.instance).clearOrderType();
            return this;
        }

        public Builder clearReserve() {
            copyOnWrite();
            ((Order) this.instance).clearReserve();
            return this;
        }

        public Builder clearSeasonStatDanmaku() {
            copyOnWrite();
            ((Order) this.instance).clearSeasonStatDanmaku();
            return this;
        }

        public Builder clearSeasonStatView() {
            copyOnWrite();
            ((Order) this.instance).clearSeasonStatView();
            return this;
        }

        public Builder clearSeasonStatViewVt() {
            copyOnWrite();
            ((Order) this.instance).clearSeasonStatViewVt();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((Order) this.instance).clearStatus();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Order) this.instance).clearTitle();
            return this;
        }

        public String getButtonSelectedTitle() {
            return ((Order) this.instance).getButtonSelectedTitle();
        }

        public ByteString getButtonSelectedTitleBytes() {
            return ((Order) this.instance).getButtonSelectedTitleBytes();
        }

        public String getButtonTitle() {
            return ((Order) this.instance).getButtonTitle();
        }

        public ByteString getButtonTitleBytes() {
            return ((Order) this.instance).getButtonTitleBytes();
        }

        public BizFavSeasonParam getFavSeason() {
            return ((Order) this.instance).getFavSeason();
        }

        public String getIntro() {
            return ((Order) this.instance).getIntro();
        }

        public ByteString getIntroBytes() {
            return ((Order) this.instance).getIntroBytes();
        }

        public OrderParamCase getOrderParamCase() {
            return ((Order) this.instance).getOrderParamCase();
        }

        public BizType getOrderType() {
            return ((Order) this.instance).getOrderType();
        }

        public int getOrderTypeValue() {
            return ((Order) this.instance).getOrderTypeValue();
        }

        public BizReserveActivityParam getReserve() {
            return ((Order) this.instance).getReserve();
        }

        public long getSeasonStatDanmaku() {
            return ((Order) this.instance).getSeasonStatDanmaku();
        }

        public long getSeasonStatView() {
            return ((Order) this.instance).getSeasonStatView();
        }

        public StatInfo getSeasonStatViewVt() {
            return ((Order) this.instance).getSeasonStatViewVt();
        }

        public boolean getStatus() {
            return ((Order) this.instance).getStatus();
        }

        public String getTitle() {
            return ((Order) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Order) this.instance).getTitleBytes();
        }

        public boolean hasFavSeason() {
            return ((Order) this.instance).hasFavSeason();
        }

        public boolean hasReserve() {
            return ((Order) this.instance).hasReserve();
        }

        public boolean hasSeasonStatViewVt() {
            return ((Order) this.instance).hasSeasonStatViewVt();
        }

        public Builder mergeFavSeason(BizFavSeasonParam bizFavSeasonParam) {
            copyOnWrite();
            ((Order) this.instance).mergeFavSeason(bizFavSeasonParam);
            return this;
        }

        public Builder mergeReserve(BizReserveActivityParam bizReserveActivityParam) {
            copyOnWrite();
            ((Order) this.instance).mergeReserve(bizReserveActivityParam);
            return this;
        }

        public Builder mergeSeasonStatViewVt(StatInfo statInfo) {
            copyOnWrite();
            ((Order) this.instance).mergeSeasonStatViewVt(statInfo);
            return this;
        }

        public Builder setButtonSelectedTitle(String str) {
            copyOnWrite();
            ((Order) this.instance).setButtonSelectedTitle(str);
            return this;
        }

        public Builder setButtonSelectedTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Order) this.instance).setButtonSelectedTitleBytes(byteString);
            return this;
        }

        public Builder setButtonTitle(String str) {
            copyOnWrite();
            ((Order) this.instance).setButtonTitle(str);
            return this;
        }

        public Builder setButtonTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Order) this.instance).setButtonTitleBytes(byteString);
            return this;
        }

        public Builder setFavSeason(BizFavSeasonParam bizFavSeasonParam) {
            copyOnWrite();
            ((Order) this.instance).setFavSeason(bizFavSeasonParam);
            return this;
        }

        public Builder setIntro(String str) {
            copyOnWrite();
            ((Order) this.instance).setIntro(str);
            return this;
        }

        public Builder setIntroBytes(ByteString byteString) {
            copyOnWrite();
            ((Order) this.instance).setIntroBytes(byteString);
            return this;
        }

        public Builder setOrderType(BizType bizType) {
            copyOnWrite();
            ((Order) this.instance).setOrderType(bizType);
            return this;
        }

        public Builder setOrderTypeValue(int i) {
            copyOnWrite();
            ((Order) this.instance).setOrderTypeValue(i);
            return this;
        }

        public Builder setReserve(BizReserveActivityParam bizReserveActivityParam) {
            copyOnWrite();
            ((Order) this.instance).setReserve(bizReserveActivityParam);
            return this;
        }

        public Builder setSeasonStatDanmaku(long j) {
            copyOnWrite();
            ((Order) this.instance).setSeasonStatDanmaku(j);
            return this;
        }

        public Builder setSeasonStatView(long j) {
            copyOnWrite();
            ((Order) this.instance).setSeasonStatView(j);
            return this;
        }

        public Builder setSeasonStatViewVt(StatInfo statInfo) {
            copyOnWrite();
            ((Order) this.instance).setSeasonStatViewVt(statInfo);
            return this;
        }

        public Builder setStatus(boolean z) {
            copyOnWrite();
            ((Order) this.instance).setStatus(z);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Order) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Order) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(Order.DEFAULT_INSTANCE);
        }

        public Builder setFavSeason(BizFavSeasonParam.Builder builder) {
            copyOnWrite();
            ((Order) this.instance).setFavSeason(builder.build());
            return this;
        }

        public Builder setReserve(BizReserveActivityParam.Builder builder) {
            copyOnWrite();
            ((Order) this.instance).setReserve(builder.build());
            return this;
        }

        public Builder setSeasonStatViewVt(StatInfo.Builder builder) {
            copyOnWrite();
            ((Order) this.instance).setSeasonStatViewVt(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public enum OrderParamCase {
        RESERVE(8),
        FAV_SEASON(9),
        ORDERPARAM_NOT_SET(0);
        
        private final int value;

        OrderParamCase(int i) {
            this.value = i;
        }

        public static OrderParamCase forNumber(int i) {
            if (i != 0) {
                if (i != 8) {
                    if (i != 9) {
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
        Order order = new Order();
        DEFAULT_INSTANCE = order;
        GeneratedMessageLite.registerDefaultInstance(Order.class, order);
    }

    private Order() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonSelectedTitle() {
        this.buttonSelectedTitle_ = getDefaultInstance().getButtonSelectedTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonTitle() {
        this.buttonTitle_ = getDefaultInstance().getButtonTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavSeason() {
        if (this.orderParamCase_ == 9) {
            this.orderParamCase_ = 0;
            this.orderParam_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntro() {
        this.intro_ = getDefaultInstance().getIntro();
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
        if (this.orderParamCase_ == 8) {
            this.orderParamCase_ = 0;
            this.orderParam_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonStatDanmaku() {
        this.seasonStatDanmaku_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonStatView() {
        this.seasonStatView_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonStatViewVt() {
        this.seasonStatViewVt_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static Order getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFavSeason(BizFavSeasonParam bizFavSeasonParam) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReserve(BizReserveActivityParam bizReserveActivityParam) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSeasonStatViewVt(StatInfo statInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Order parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Order) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Order parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Order> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonSelectedTitle(String str) {
        str.getClass();
        this.buttonSelectedTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonSelectedTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buttonSelectedTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonTitle(String str) {
        str.getClass();
        this.buttonTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buttonTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavSeason(BizFavSeasonParam bizFavSeasonParam) {
        bizFavSeasonParam.getClass();
        this.orderParam_ = bizFavSeasonParam;
        this.orderParamCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntro(String str) {
        str.getClass();
        this.intro_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.intro_ = byteString.toStringUtf8();
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
        this.orderParamCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonStatDanmaku(long j) {
        this.seasonStatDanmaku_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonStatView(long j) {
        this.seasonStatView_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonStatViewVt(StatInfo statInfo) {
        statInfo.getClass();
        this.seasonStatViewVt_ = statInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(boolean z) {
        this.status_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68101.f16775xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Order();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0007\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0002\u0006\u0002\u0007\f\b<\u0000\t<\u0000\n\u0208\u000b\t", new Object[]{"orderParam_", "orderParamCase_", "status_", "title_", "buttonTitle_", "buttonSelectedTitle_", "seasonStatView_", "seasonStatDanmaku_", "orderType_", BizReserveActivityParam.class, BizFavSeasonParam.class, "intro_", "seasonStatViewVt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Order> parser = PARSER;
                if (parser == null) {
                    synchronized (Order.class) {
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

    public String getButtonSelectedTitle() {
        return this.buttonSelectedTitle_;
    }

    public ByteString getButtonSelectedTitleBytes() {
        return ByteString.copyFromUtf8(this.buttonSelectedTitle_);
    }

    public String getButtonTitle() {
        return this.buttonTitle_;
    }

    public ByteString getButtonTitleBytes() {
        return ByteString.copyFromUtf8(this.buttonTitle_);
    }

    public BizFavSeasonParam getFavSeason() {
        if (this.orderParamCase_ == 9) {
            return (BizFavSeasonParam) this.orderParam_;
        }
        return BizFavSeasonParam.getDefaultInstance();
    }

    public String getIntro() {
        return this.intro_;
    }

    public ByteString getIntroBytes() {
        return ByteString.copyFromUtf8(this.intro_);
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
        if (this.orderParamCase_ == 8) {
            return (BizReserveActivityParam) this.orderParam_;
        }
        return BizReserveActivityParam.getDefaultInstance();
    }

    public long getSeasonStatDanmaku() {
        return this.seasonStatDanmaku_;
    }

    public long getSeasonStatView() {
        return this.seasonStatView_;
    }

    public StatInfo getSeasonStatViewVt() {
        StatInfo statInfo = this.seasonStatViewVt_;
        return statInfo == null ? StatInfo.getDefaultInstance() : statInfo;
    }

    public boolean getStatus() {
        return this.status_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public boolean hasFavSeason() {
        return this.orderParamCase_ == 9;
    }

    public boolean hasReserve() {
        return this.orderParamCase_ == 8;
    }

    public boolean hasSeasonStatViewVt() {
        return this.seasonStatViewVt_ != null;
    }

    public static Builder newBuilder(Order order) {
        return DEFAULT_INSTANCE.createBuilder(order);
    }

    public static Order parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Order) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Order parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Order parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Order parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Order parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Order parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Order parseFrom(InputStream inputStream) throws IOException {
        return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Order parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Order parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Order parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
