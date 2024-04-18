package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes14.dex */
public final class Coupon extends GeneratedMessageLite<Coupon, Coupon.Builder> implements CouponOrBuilder {
    public static final int AMOUNT_FIELD_NUMBER = 12;
    public static final int COUPON_TOKEN_FIELD_NUMBER = 1;
    private static final Coupon DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 6;
    public static final int EXPIRE_TIME_FIELD_NUMBER = 10;
    public static final int OTYPE_FIELD_NUMBER = 11;
    private static volatile Parser<Coupon> PARSER = null;
    public static final int PAY_BUTTON_TEXT_FIELD_NUMBER = 7;
    public static final int PAY_BUTTON_TEXT_LINE_THROUGH_FIELD_NUMBER = 8;
    public static final int REAL_AMOUNT_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int USE_DESC_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 3;
    private Timestamp expireTime_;
    private long otype_;
    private long type_;
    private String couponToken_ = "";
    private String value_ = "";
    private String useDesc_ = "";
    private String title_ = "";
    private String desc_ = "";
    private String payButtonText_ = "";
    private String payButtonTextLineThrough_ = "";
    private String realAmount_ = "";
    private String amount_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.Coupon$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78271 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17552xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17552xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17552xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17552xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17552xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17552xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17552xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17552xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Coupon, Builder> implements CouponOrBuilder {
        /* synthetic */ Builder(C78271 c78271) {
            this();
        }

        public Builder clearAmount() {
            copyOnWrite();
            ((Coupon) this.instance).clearAmount();
            return this;
        }

        public Builder clearCouponToken() {
            copyOnWrite();
            ((Coupon) this.instance).clearCouponToken();
            return this;
        }

        public Builder clearDesc() {
            copyOnWrite();
            ((Coupon) this.instance).clearDesc();
            return this;
        }

        public Builder clearExpireTime() {
            copyOnWrite();
            ((Coupon) this.instance).clearExpireTime();
            return this;
        }

        public Builder clearOtype() {
            copyOnWrite();
            ((Coupon) this.instance).clearOtype();
            return this;
        }

        public Builder clearPayButtonText() {
            copyOnWrite();
            ((Coupon) this.instance).clearPayButtonText();
            return this;
        }

        public Builder clearPayButtonTextLineThrough() {
            copyOnWrite();
            ((Coupon) this.instance).clearPayButtonTextLineThrough();
            return this;
        }

        public Builder clearRealAmount() {
            copyOnWrite();
            ((Coupon) this.instance).clearRealAmount();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Coupon) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Coupon) this.instance).clearType();
            return this;
        }

        public Builder clearUseDesc() {
            copyOnWrite();
            ((Coupon) this.instance).clearUseDesc();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((Coupon) this.instance).clearValue();
            return this;
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public String getAmount() {
            return ((Coupon) this.instance).getAmount();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public ByteString getAmountBytes() {
            return ((Coupon) this.instance).getAmountBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public String getCouponToken() {
            return ((Coupon) this.instance).getCouponToken();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public ByteString getCouponTokenBytes() {
            return ((Coupon) this.instance).getCouponTokenBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public String getDesc() {
            return ((Coupon) this.instance).getDesc();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public ByteString getDescBytes() {
            return ((Coupon) this.instance).getDescBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public Timestamp getExpireTime() {
            return ((Coupon) this.instance).getExpireTime();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public long getOtype() {
            return ((Coupon) this.instance).getOtype();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public String getPayButtonText() {
            return ((Coupon) this.instance).getPayButtonText();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public ByteString getPayButtonTextBytes() {
            return ((Coupon) this.instance).getPayButtonTextBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public String getPayButtonTextLineThrough() {
            return ((Coupon) this.instance).getPayButtonTextLineThrough();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public ByteString getPayButtonTextLineThroughBytes() {
            return ((Coupon) this.instance).getPayButtonTextLineThroughBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public String getRealAmount() {
            return ((Coupon) this.instance).getRealAmount();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public ByteString getRealAmountBytes() {
            return ((Coupon) this.instance).getRealAmountBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public String getTitle() {
            return ((Coupon) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public ByteString getTitleBytes() {
            return ((Coupon) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public long getType() {
            return ((Coupon) this.instance).getType();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public String getUseDesc() {
            return ((Coupon) this.instance).getUseDesc();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public ByteString getUseDescBytes() {
            return ((Coupon) this.instance).getUseDescBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public String getValue() {
            return ((Coupon) this.instance).getValue();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public ByteString getValueBytes() {
            return ((Coupon) this.instance).getValueBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
        public boolean hasExpireTime() {
            return ((Coupon) this.instance).hasExpireTime();
        }

        public Builder mergeExpireTime(Timestamp timestamp) {
            copyOnWrite();
            ((Coupon) this.instance).mergeExpireTime(timestamp);
            return this;
        }

        public Builder setAmount(String str) {
            copyOnWrite();
            ((Coupon) this.instance).setAmount(str);
            return this;
        }

        public Builder setAmountBytes(ByteString byteString) {
            copyOnWrite();
            ((Coupon) this.instance).setAmountBytes(byteString);
            return this;
        }

        public Builder setCouponToken(String str) {
            copyOnWrite();
            ((Coupon) this.instance).setCouponToken(str);
            return this;
        }

        public Builder setCouponTokenBytes(ByteString byteString) {
            copyOnWrite();
            ((Coupon) this.instance).setCouponTokenBytes(byteString);
            return this;
        }

        public Builder setDesc(String str) {
            copyOnWrite();
            ((Coupon) this.instance).setDesc(str);
            return this;
        }

        public Builder setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((Coupon) this.instance).setDescBytes(byteString);
            return this;
        }

        public Builder setExpireTime(Timestamp timestamp) {
            copyOnWrite();
            ((Coupon) this.instance).setExpireTime(timestamp);
            return this;
        }

        public Builder setOtype(long j) {
            copyOnWrite();
            ((Coupon) this.instance).setOtype(j);
            return this;
        }

        public Builder setPayButtonText(String str) {
            copyOnWrite();
            ((Coupon) this.instance).setPayButtonText(str);
            return this;
        }

        public Builder setPayButtonTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Coupon) this.instance).setPayButtonTextBytes(byteString);
            return this;
        }

        public Builder setPayButtonTextLineThrough(String str) {
            copyOnWrite();
            ((Coupon) this.instance).setPayButtonTextLineThrough(str);
            return this;
        }

        public Builder setPayButtonTextLineThroughBytes(ByteString byteString) {
            copyOnWrite();
            ((Coupon) this.instance).setPayButtonTextLineThroughBytes(byteString);
            return this;
        }

        public Builder setRealAmount(String str) {
            copyOnWrite();
            ((Coupon) this.instance).setRealAmount(str);
            return this;
        }

        public Builder setRealAmountBytes(ByteString byteString) {
            copyOnWrite();
            ((Coupon) this.instance).setRealAmountBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Coupon) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Coupon) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setType(long j) {
            copyOnWrite();
            ((Coupon) this.instance).setType(j);
            return this;
        }

        public Builder setUseDesc(String str) {
            copyOnWrite();
            ((Coupon) this.instance).setUseDesc(str);
            return this;
        }

        public Builder setUseDescBytes(ByteString byteString) {
            copyOnWrite();
            ((Coupon) this.instance).setUseDescBytes(byteString);
            return this;
        }

        public Builder setValue(String str) {
            copyOnWrite();
            ((Coupon) this.instance).setValue(str);
            return this;
        }

        public Builder setValueBytes(ByteString byteString) {
            copyOnWrite();
            ((Coupon) this.instance).setValueBytes(byteString);
            return this;
        }

        private Builder() {
            super(Coupon.DEFAULT_INSTANCE);
        }

        public Builder setExpireTime(Timestamp.Builder builder) {
            copyOnWrite();
            ((Coupon) this.instance).setExpireTime(builder.build());
            return this;
        }
    }

    static {
        Coupon coupon = new Coupon();
        DEFAULT_INSTANCE = coupon;
        GeneratedMessageLite.registerDefaultInstance(Coupon.class, coupon);
    }

    private Coupon() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAmount() {
        this.amount_ = getDefaultInstance().getAmount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCouponToken() {
        this.couponToken_ = getDefaultInstance().getCouponToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpireTime() {
        this.expireTime_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtype() {
        this.otype_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayButtonText() {
        this.payButtonText_ = getDefaultInstance().getPayButtonText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayButtonTextLineThrough() {
        this.payButtonTextLineThrough_ = getDefaultInstance().getPayButtonTextLineThrough();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealAmount() {
        this.realAmount_ = getDefaultInstance().getRealAmount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseDesc() {
        this.useDesc_ = getDefaultInstance().getUseDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static Coupon getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExpireTime(Timestamp timestamp) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Coupon parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Coupon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Coupon parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Coupon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Coupon> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmount(String str) {
        str.getClass();
        this.amount_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmountBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.amount_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCouponToken(String str) {
        str.getClass();
        this.couponToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCouponTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.couponToken_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpireTime(Timestamp timestamp) {
        timestamp.getClass();
        this.expireTime_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtype(long j) {
        this.otype_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayButtonText(String str) {
        str.getClass();
        this.payButtonText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayButtonTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.payButtonText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayButtonTextLineThrough(String str) {
        str.getClass();
        this.payButtonTextLineThrough_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayButtonTextLineThroughBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.payButtonTextLineThrough_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealAmount(String str) {
        str.getClass();
        this.realAmount_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealAmountBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.realAmount_ = byteString.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(long j) {
        this.type_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseDesc(String str) {
        str.getClass();
        this.useDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.useDesc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.value_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78271.f17552xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Coupon();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\t\u000b\u0002\f\u0208", new Object[]{"couponToken_", "type_", "value_", "useDesc_", "title_", "desc_", "payButtonText_", "payButtonTextLineThrough_", "realAmount_", "expireTime_", "otype_", "amount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Coupon> parser = PARSER;
                if (parser == null) {
                    synchronized (Coupon.class) {
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

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public String getAmount() {
        return this.amount_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public ByteString getAmountBytes() {
        return ByteString.copyFromUtf8(this.amount_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public String getCouponToken() {
        return this.couponToken_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public ByteString getCouponTokenBytes() {
        return ByteString.copyFromUtf8(this.couponToken_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public String getDesc() {
        return this.desc_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public Timestamp getExpireTime() {
        Timestamp timestamp = this.expireTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public long getOtype() {
        return this.otype_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public String getPayButtonText() {
        return this.payButtonText_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public ByteString getPayButtonTextBytes() {
        return ByteString.copyFromUtf8(this.payButtonText_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public String getPayButtonTextLineThrough() {
        return this.payButtonTextLineThrough_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public ByteString getPayButtonTextLineThroughBytes() {
        return ByteString.copyFromUtf8(this.payButtonTextLineThrough_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public String getRealAmount() {
        return this.realAmount_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public ByteString getRealAmountBytes() {
        return ByteString.copyFromUtf8(this.realAmount_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public long getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public String getUseDesc() {
        return this.useDesc_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public ByteString getUseDescBytes() {
        return ByteString.copyFromUtf8(this.useDesc_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public String getValue() {
        return this.value_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.value_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.CouponOrBuilder
    public boolean hasExpireTime() {
        return this.expireTime_ != null;
    }

    public static Builder newBuilder(Coupon coupon) {
        return DEFAULT_INSTANCE.createBuilder(coupon);
    }

    public static Coupon parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Coupon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Coupon parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Coupon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Coupon parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Coupon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Coupon parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Coupon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Coupon parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Coupon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Coupon parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Coupon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Coupon parseFrom(InputStream inputStream) throws IOException {
        return (Coupon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Coupon parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Coupon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Coupon parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Coupon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Coupon parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Coupon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
