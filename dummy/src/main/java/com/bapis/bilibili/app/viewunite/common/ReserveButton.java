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
public final class ReserveButton extends GeneratedMessageLite<ReserveButton, ReserveButton.Builder> implements MessageLiteOrBuilder {
    private static final ReserveButton DEFAULT_INSTANCE;
    public static final int FAV_FIELD_NUMBER = 9;
    public static final int ORDER_TYPE_FIELD_NUMBER = 7;
    private static volatile Parser<ReserveButton> PARSER = null;
    public static final int RESERVE_FIELD_NUMBER = 8;
    public static final int SELECTED_TEXT_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 3;
    private Object orderParam_;
    private int orderType_;
    private boolean status_;
    private int orderParamCase_ = 0;
    private String text_ = "";
    private String selectedText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.ReserveButton$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70521 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17031xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17031xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17031xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17031xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17031xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17031xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17031xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17031xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ReserveButton, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70521 c70521) {
            this();
        }

        public Builder clearFav() {
            copyOnWrite();
            ((ReserveButton) this.instance).clearFav();
            return this;
        }

        public Builder clearOrderParam() {
            copyOnWrite();
            ((ReserveButton) this.instance).clearOrderParam();
            return this;
        }

        public Builder clearOrderType() {
            copyOnWrite();
            ((ReserveButton) this.instance).clearOrderType();
            return this;
        }

        public Builder clearReserve() {
            copyOnWrite();
            ((ReserveButton) this.instance).clearReserve();
            return this;
        }

        public Builder clearSelectedText() {
            copyOnWrite();
            ((ReserveButton) this.instance).clearSelectedText();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((ReserveButton) this.instance).clearStatus();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((ReserveButton) this.instance).clearText();
            return this;
        }

        public BizFavParam getFav() {
            return ((ReserveButton) this.instance).getFav();
        }

        public OrderParamCase getOrderParamCase() {
            return ((ReserveButton) this.instance).getOrderParamCase();
        }

        public ReserveBizType getOrderType() {
            return ((ReserveButton) this.instance).getOrderType();
        }

        public int getOrderTypeValue() {
            return ((ReserveButton) this.instance).getOrderTypeValue();
        }

        public BizReserveActivityParam getReserve() {
            return ((ReserveButton) this.instance).getReserve();
        }

        public String getSelectedText() {
            return ((ReserveButton) this.instance).getSelectedText();
        }

        public ByteString getSelectedTextBytes() {
            return ((ReserveButton) this.instance).getSelectedTextBytes();
        }

        public boolean getStatus() {
            return ((ReserveButton) this.instance).getStatus();
        }

        public String getText() {
            return ((ReserveButton) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((ReserveButton) this.instance).getTextBytes();
        }

        public boolean hasFav() {
            return ((ReserveButton) this.instance).hasFav();
        }

        public boolean hasReserve() {
            return ((ReserveButton) this.instance).hasReserve();
        }

        public Builder mergeFav(BizFavParam bizFavParam) {
            copyOnWrite();
            ((ReserveButton) this.instance).mergeFav(bizFavParam);
            return this;
        }

        public Builder mergeReserve(BizReserveActivityParam bizReserveActivityParam) {
            copyOnWrite();
            ((ReserveButton) this.instance).mergeReserve(bizReserveActivityParam);
            return this;
        }

        public Builder setFav(BizFavParam bizFavParam) {
            copyOnWrite();
            ((ReserveButton) this.instance).setFav(bizFavParam);
            return this;
        }

        public Builder setOrderType(ReserveBizType reserveBizType) {
            copyOnWrite();
            ((ReserveButton) this.instance).setOrderType(reserveBizType);
            return this;
        }

        public Builder setOrderTypeValue(int i) {
            copyOnWrite();
            ((ReserveButton) this.instance).setOrderTypeValue(i);
            return this;
        }

        public Builder setReserve(BizReserveActivityParam bizReserveActivityParam) {
            copyOnWrite();
            ((ReserveButton) this.instance).setReserve(bizReserveActivityParam);
            return this;
        }

        public Builder setSelectedText(String str) {
            copyOnWrite();
            ((ReserveButton) this.instance).setSelectedText(str);
            return this;
        }

        public Builder setSelectedTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ReserveButton) this.instance).setSelectedTextBytes(byteString);
            return this;
        }

        public Builder setStatus(boolean z) {
            copyOnWrite();
            ((ReserveButton) this.instance).setStatus(z);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((ReserveButton) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ReserveButton) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(ReserveButton.DEFAULT_INSTANCE);
        }

        public Builder setFav(BizFavParam.Builder builder) {
            copyOnWrite();
            ((ReserveButton) this.instance).setFav(builder.build());
            return this;
        }

        public Builder setReserve(BizReserveActivityParam.Builder builder) {
            copyOnWrite();
            ((ReserveButton) this.instance).setReserve(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum OrderParamCase {
        RESERVE(8),
        FAV(9),
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
                    return FAV;
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
        ReserveButton reserveButton = new ReserveButton();
        DEFAULT_INSTANCE = reserveButton;
        GeneratedMessageLite.registerDefaultInstance(ReserveButton.class, reserveButton);
    }

    private ReserveButton() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFav() {
        if (this.orderParamCase_ == 9) {
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
        if (this.orderParamCase_ == 8) {
            this.orderParamCase_ = 0;
            this.orderParam_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedText() {
        this.selectedText_ = getDefaultInstance().getSelectedText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static ReserveButton getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFav(BizFavParam bizFavParam) {
        bizFavParam.getClass();
        if (this.orderParamCase_ == 9 && this.orderParam_ != BizFavParam.getDefaultInstance()) {
            this.orderParam_ = BizFavParam.newBuilder((BizFavParam) this.orderParam_).mergeFrom((BizFavParam) bizFavParam).buildPartial();
        } else {
            this.orderParam_ = bizFavParam;
        }
        this.orderParamCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReserve(BizReserveActivityParam bizReserveActivityParam) {
        bizReserveActivityParam.getClass();
        if (this.orderParamCase_ == 8 && this.orderParam_ != BizReserveActivityParam.getDefaultInstance()) {
            this.orderParam_ = BizReserveActivityParam.newBuilder((BizReserveActivityParam) this.orderParam_).mergeFrom((BizReserveActivityParam) bizReserveActivityParam).buildPartial();
        } else {
            this.orderParam_ = bizReserveActivityParam;
        }
        this.orderParamCase_ = 8;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ReserveButton parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReserveButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReserveButton parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ReserveButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ReserveButton> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFav(BizFavParam bizFavParam) {
        bizFavParam.getClass();
        this.orderParam_ = bizFavParam;
        this.orderParamCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderType(ReserveBizType reserveBizType) {
        this.orderType_ = reserveBizType.getNumber();
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
    public void setSelectedText(String str) {
        str.getClass();
        this.selectedText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.selectedText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(boolean z) {
        this.status_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70521.f17031xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ReserveButton();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\t\u0006\u0000\u0000\u0000\u0001\u0007\u0003\u0208\u0004\u0208\u0007\f\b<\u0000\t<\u0000", new Object[]{"orderParam_", "orderParamCase_", "status_", "text_", "selectedText_", "orderType_", BizReserveActivityParam.class, BizFavParam.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReserveButton> parser = PARSER;
                if (parser == null) {
                    synchronized (ReserveButton.class) {
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

    public BizFavParam getFav() {
        if (this.orderParamCase_ == 9) {
            return (BizFavParam) this.orderParam_;
        }
        return BizFavParam.getDefaultInstance();
    }

    public OrderParamCase getOrderParamCase() {
        return OrderParamCase.forNumber(this.orderParamCase_);
    }

    public ReserveBizType getOrderType() {
        ReserveBizType forNumber = ReserveBizType.forNumber(this.orderType_);
        return forNumber == null ? ReserveBizType.UNRECOGNIZED : forNumber;
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

    public String getSelectedText() {
        return this.selectedText_;
    }

    public ByteString getSelectedTextBytes() {
        return ByteString.copyFromUtf8(this.selectedText_);
    }

    public boolean getStatus() {
        return this.status_;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public boolean hasFav() {
        return this.orderParamCase_ == 9;
    }

    public boolean hasReserve() {
        return this.orderParamCase_ == 8;
    }

    public static Builder newBuilder(ReserveButton reserveButton) {
        return DEFAULT_INSTANCE.createBuilder(reserveButton);
    }

    public static ReserveButton parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReserveButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReserveButton parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReserveButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ReserveButton parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ReserveButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ReserveButton parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReserveButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ReserveButton parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ReserveButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReserveButton parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReserveButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ReserveButton parseFrom(InputStream inputStream) throws IOException {
        return (ReserveButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReserveButton parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReserveButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReserveButton parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ReserveButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ReserveButton parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReserveButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
