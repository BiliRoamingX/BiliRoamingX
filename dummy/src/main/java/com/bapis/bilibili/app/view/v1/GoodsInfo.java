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
public final class GoodsInfo extends GeneratedMessageLite<GoodsInfo, GoodsInfo.Builder> implements MessageLiteOrBuilder {
    public static final int CATEGORY_FIELD_NUMBER = 2;
    private static final GoodsInfo DEFAULT_INSTANCE;
    public static final int GOODS_ID_FIELD_NUMBER = 1;
    public static final int GOODS_NAME_FIELD_NUMBER = 5;
    public static final int GOODS_PRICE_FIELD_NUMBER = 3;
    private static volatile Parser<GoodsInfo> PARSER = null;
    public static final int PAY_STATE_FIELD_NUMBER = 4;
    public static final int PRICE_FMT_FIELD_NUMBER = 6;
    private int category_;
    private long goodsPrice_;
    private int payState_;
    private String goodsId_ = "";
    private String goodsName_ = "";
    private String priceFmt_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.GoodsInfo$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67721 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16743xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16743xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16743xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16743xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16743xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16743xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16743xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16743xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GoodsInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67721 c67721) {
            this();
        }

        public Builder clearCategory() {
            copyOnWrite();
            ((GoodsInfo) this.instance).clearCategory();
            return this;
        }

        public Builder clearGoodsId() {
            copyOnWrite();
            ((GoodsInfo) this.instance).clearGoodsId();
            return this;
        }

        public Builder clearGoodsName() {
            copyOnWrite();
            ((GoodsInfo) this.instance).clearGoodsName();
            return this;
        }

        public Builder clearGoodsPrice() {
            copyOnWrite();
            ((GoodsInfo) this.instance).clearGoodsPrice();
            return this;
        }

        public Builder clearPayState() {
            copyOnWrite();
            ((GoodsInfo) this.instance).clearPayState();
            return this;
        }

        public Builder clearPriceFmt() {
            copyOnWrite();
            ((GoodsInfo) this.instance).clearPriceFmt();
            return this;
        }

        public Category getCategory() {
            return ((GoodsInfo) this.instance).getCategory();
        }

        public int getCategoryValue() {
            return ((GoodsInfo) this.instance).getCategoryValue();
        }

        public String getGoodsId() {
            return ((GoodsInfo) this.instance).getGoodsId();
        }

        public ByteString getGoodsIdBytes() {
            return ((GoodsInfo) this.instance).getGoodsIdBytes();
        }

        public String getGoodsName() {
            return ((GoodsInfo) this.instance).getGoodsName();
        }

        public ByteString getGoodsNameBytes() {
            return ((GoodsInfo) this.instance).getGoodsNameBytes();
        }

        public long getGoodsPrice() {
            return ((GoodsInfo) this.instance).getGoodsPrice();
        }

        public PayState getPayState() {
            return ((GoodsInfo) this.instance).getPayState();
        }

        public int getPayStateValue() {
            return ((GoodsInfo) this.instance).getPayStateValue();
        }

        public String getPriceFmt() {
            return ((GoodsInfo) this.instance).getPriceFmt();
        }

        public ByteString getPriceFmtBytes() {
            return ((GoodsInfo) this.instance).getPriceFmtBytes();
        }

        public Builder setCategory(Category category) {
            copyOnWrite();
            ((GoodsInfo) this.instance).setCategory(category);
            return this;
        }

        public Builder setCategoryValue(int i) {
            copyOnWrite();
            ((GoodsInfo) this.instance).setCategoryValue(i);
            return this;
        }

        public Builder setGoodsId(String str) {
            copyOnWrite();
            ((GoodsInfo) this.instance).setGoodsId(str);
            return this;
        }

        public Builder setGoodsIdBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsInfo) this.instance).setGoodsIdBytes(byteString);
            return this;
        }

        public Builder setGoodsName(String str) {
            copyOnWrite();
            ((GoodsInfo) this.instance).setGoodsName(str);
            return this;
        }

        public Builder setGoodsNameBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsInfo) this.instance).setGoodsNameBytes(byteString);
            return this;
        }

        public Builder setGoodsPrice(long j) {
            copyOnWrite();
            ((GoodsInfo) this.instance).setGoodsPrice(j);
            return this;
        }

        public Builder setPayState(PayState payState) {
            copyOnWrite();
            ((GoodsInfo) this.instance).setPayState(payState);
            return this;
        }

        public Builder setPayStateValue(int i) {
            copyOnWrite();
            ((GoodsInfo) this.instance).setPayStateValue(i);
            return this;
        }

        public Builder setPriceFmt(String str) {
            copyOnWrite();
            ((GoodsInfo) this.instance).setPriceFmt(str);
            return this;
        }

        public Builder setPriceFmtBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsInfo) this.instance).setPriceFmtBytes(byteString);
            return this;
        }

        private Builder() {
            super(GoodsInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        GoodsInfo goodsInfo = new GoodsInfo();
        DEFAULT_INSTANCE = goodsInfo;
        GeneratedMessageLite.registerDefaultInstance(GoodsInfo.class, goodsInfo);
    }

    private GoodsInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoodsId() {
        this.goodsId_ = getDefaultInstance().getGoodsId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoodsName() {
        this.goodsName_ = getDefaultInstance().getGoodsName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoodsPrice() {
        this.goodsPrice_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayState() {
        this.payState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceFmt() {
        this.priceFmt_ = getDefaultInstance().getPriceFmt();
    }

    public static GoodsInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GoodsInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GoodsInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GoodsInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GoodsInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GoodsInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(Category category) {
        this.category_ = category.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryValue(int i) {
        this.category_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoodsId(String str) {
        str.getClass();
        this.goodsId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoodsIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.goodsId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoodsName(String str) {
        str.getClass();
        this.goodsName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoodsNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.goodsName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoodsPrice(long j) {
        this.goodsPrice_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayState(PayState payState) {
        this.payState_ = payState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayStateValue(int i) {
        this.payState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceFmt(String str) {
        str.getClass();
        this.priceFmt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceFmtBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.priceFmt_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67721.f16743xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GoodsInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u0002\u0004\f\u0005\u0208\u0006\u0208", new Object[]{"goodsId_", "category_", "goodsPrice_", "payState_", "goodsName_", "priceFmt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GoodsInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (GoodsInfo.class) {
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

    public Category getCategory() {
        Category forNumber = Category.forNumber(this.category_);
        return forNumber == null ? Category.UNRECOGNIZED : forNumber;
    }

    public int getCategoryValue() {
        return this.category_;
    }

    public String getGoodsId() {
        return this.goodsId_;
    }

    public ByteString getGoodsIdBytes() {
        return ByteString.copyFromUtf8(this.goodsId_);
    }

    public String getGoodsName() {
        return this.goodsName_;
    }

    public ByteString getGoodsNameBytes() {
        return ByteString.copyFromUtf8(this.goodsName_);
    }

    public long getGoodsPrice() {
        return this.goodsPrice_;
    }

    public PayState getPayState() {
        PayState forNumber = PayState.forNumber(this.payState_);
        return forNumber == null ? PayState.UNRECOGNIZED : forNumber;
    }

    public int getPayStateValue() {
        return this.payState_;
    }

    public String getPriceFmt() {
        return this.priceFmt_;
    }

    public ByteString getPriceFmtBytes() {
        return ByteString.copyFromUtf8(this.priceFmt_);
    }

    public static Builder newBuilder(GoodsInfo goodsInfo) {
        return DEFAULT_INSTANCE.createBuilder(goodsInfo);
    }

    public static GoodsInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GoodsInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GoodsInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GoodsInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GoodsInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GoodsInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GoodsInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GoodsInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GoodsInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GoodsInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GoodsInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GoodsInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GoodsInfo parseFrom(InputStream inputStream) throws IOException {
        return (GoodsInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GoodsInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GoodsInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GoodsInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GoodsInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GoodsInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GoodsInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
