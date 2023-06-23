package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes14.dex */
public final class PopWin extends GeneratedMessageLite<PopWin, PopWin.Builder> implements MessageLiteOrBuilder {
    public static final int BOTTOM_DESC_FIELD_NUMBER = 7;
    public static final int BOTTOM_TEXT_FIELD_NUMBER = 4;
    public static final int BUTTON_FIELD_NUMBER = 3;
    public static final int COUPON_FIELD_NUMBER = 2;
    public static final int COVER_FIELD_NUMBER = 8;
    private static final PopWin DEFAULT_INSTANCE;
    private static volatile Parser<PopWin> PARSER = null;
    public static final int POP_TITLE_FIELD_NUMBER = 5;
    public static final int POP_TYPE_FIELD_NUMBER = 9;
    public static final int SUBTITLE_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 1;
    private ButtonInfo bottomDesc_;
    private TextInfo popTitle_;
    private TextInfo subtitle_;
    private String title_ = "";
    private Internal.ProtobufList<Coupon> coupon_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ButtonInfo> button_ = GeneratedMessageLite.emptyProtobufList();
    private String bottomText_ = "";
    private String cover_ = "";
    private String popType_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.PopWin$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78711 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17586xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17586xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17586xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17586xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17586xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17586xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17586xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17586xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PopWin, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78711 c78711) {
            this();
        }

        public Builder addAllButton(Iterable<? extends ButtonInfo> iterable) {
            copyOnWrite();
            ((PopWin) this.instance).addAllButton(iterable);
            return this;
        }

        public Builder addAllCoupon(Iterable<? extends Coupon> iterable) {
            copyOnWrite();
            ((PopWin) this.instance).addAllCoupon(iterable);
            return this;
        }

        public Builder addButton(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((PopWin) this.instance).addButton(buttonInfo);
            return this;
        }

        public Builder addCoupon(Coupon coupon) {
            copyOnWrite();
            ((PopWin) this.instance).addCoupon(coupon);
            return this;
        }

        public Builder clearBottomDesc() {
            copyOnWrite();
            ((PopWin) this.instance).clearBottomDesc();
            return this;
        }

        public Builder clearBottomText() {
            copyOnWrite();
            ((PopWin) this.instance).clearBottomText();
            return this;
        }

        public Builder clearButton() {
            copyOnWrite();
            ((PopWin) this.instance).clearButton();
            return this;
        }

        public Builder clearCoupon() {
            copyOnWrite();
            ((PopWin) this.instance).clearCoupon();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((PopWin) this.instance).clearCover();
            return this;
        }

        public Builder clearPopTitle() {
            copyOnWrite();
            ((PopWin) this.instance).clearPopTitle();
            return this;
        }

        public Builder clearPopType() {
            copyOnWrite();
            ((PopWin) this.instance).clearPopType();
            return this;
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((PopWin) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((PopWin) this.instance).clearTitle();
            return this;
        }

        public ButtonInfo getBottomDesc() {
            return ((PopWin) this.instance).getBottomDesc();
        }

        public String getBottomText() {
            return ((PopWin) this.instance).getBottomText();
        }

        public ByteString getBottomTextBytes() {
            return ((PopWin) this.instance).getBottomTextBytes();
        }

        public ButtonInfo getButton(int i) {
            return ((PopWin) this.instance).getButton(i);
        }

        public int getButtonCount() {
            return ((PopWin) this.instance).getButtonCount();
        }

        public List<ButtonInfo> getButtonList() {
            return Collections.unmodifiableList(((PopWin) this.instance).getButtonList());
        }

        public Coupon getCoupon(int i) {
            return ((PopWin) this.instance).getCoupon(i);
        }

        public int getCouponCount() {
            return ((PopWin) this.instance).getCouponCount();
        }

        public List<Coupon> getCouponList() {
            return Collections.unmodifiableList(((PopWin) this.instance).getCouponList());
        }

        public String getCover() {
            return ((PopWin) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((PopWin) this.instance).getCoverBytes();
        }

        public TextInfo getPopTitle() {
            return ((PopWin) this.instance).getPopTitle();
        }

        public String getPopType() {
            return ((PopWin) this.instance).getPopType();
        }

        public ByteString getPopTypeBytes() {
            return ((PopWin) this.instance).getPopTypeBytes();
        }

        public TextInfo getSubtitle() {
            return ((PopWin) this.instance).getSubtitle();
        }

        public String getTitle() {
            return ((PopWin) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((PopWin) this.instance).getTitleBytes();
        }

        public boolean hasBottomDesc() {
            return ((PopWin) this.instance).hasBottomDesc();
        }

        public boolean hasPopTitle() {
            return ((PopWin) this.instance).hasPopTitle();
        }

        public boolean hasSubtitle() {
            return ((PopWin) this.instance).hasSubtitle();
        }

        public Builder mergeBottomDesc(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((PopWin) this.instance).mergeBottomDesc(buttonInfo);
            return this;
        }

        public Builder mergePopTitle(TextInfo textInfo) {
            copyOnWrite();
            ((PopWin) this.instance).mergePopTitle(textInfo);
            return this;
        }

        public Builder mergeSubtitle(TextInfo textInfo) {
            copyOnWrite();
            ((PopWin) this.instance).mergeSubtitle(textInfo);
            return this;
        }

        public Builder removeButton(int i) {
            copyOnWrite();
            ((PopWin) this.instance).removeButton(i);
            return this;
        }

        public Builder removeCoupon(int i) {
            copyOnWrite();
            ((PopWin) this.instance).removeCoupon(i);
            return this;
        }

        public Builder setBottomDesc(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((PopWin) this.instance).setBottomDesc(buttonInfo);
            return this;
        }

        public Builder setBottomText(String str) {
            copyOnWrite();
            ((PopWin) this.instance).setBottomText(str);
            return this;
        }

        public Builder setBottomTextBytes(ByteString byteString) {
            copyOnWrite();
            ((PopWin) this.instance).setBottomTextBytes(byteString);
            return this;
        }

        public Builder setButton(int i, ButtonInfo buttonInfo) {
            copyOnWrite();
            ((PopWin) this.instance).setButton(i, buttonInfo);
            return this;
        }

        public Builder setCoupon(int i, Coupon coupon) {
            copyOnWrite();
            ((PopWin) this.instance).setCoupon(i, coupon);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((PopWin) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((PopWin) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setPopTitle(TextInfo textInfo) {
            copyOnWrite();
            ((PopWin) this.instance).setPopTitle(textInfo);
            return this;
        }

        public Builder setPopType(String str) {
            copyOnWrite();
            ((PopWin) this.instance).setPopType(str);
            return this;
        }

        public Builder setPopTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((PopWin) this.instance).setPopTypeBytes(byteString);
            return this;
        }

        public Builder setSubtitle(TextInfo textInfo) {
            copyOnWrite();
            ((PopWin) this.instance).setSubtitle(textInfo);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((PopWin) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((PopWin) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(PopWin.DEFAULT_INSTANCE);
        }

        public Builder addButton(int i, ButtonInfo buttonInfo) {
            copyOnWrite();
            ((PopWin) this.instance).addButton(i, buttonInfo);
            return this;
        }

        public Builder addCoupon(int i, Coupon coupon) {
            copyOnWrite();
            ((PopWin) this.instance).addCoupon(i, coupon);
            return this;
        }

        public Builder setBottomDesc(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((PopWin) this.instance).setBottomDesc(builder.build());
            return this;
        }

        public Builder setButton(int i, ButtonInfo.Builder builder) {
            copyOnWrite();
            ((PopWin) this.instance).setButton(i, builder.build());
            return this;
        }

        public Builder setCoupon(int i, Coupon.Builder builder) {
            copyOnWrite();
            ((PopWin) this.instance).setCoupon(i, builder.build());
            return this;
        }

        public Builder setPopTitle(TextInfo.Builder builder) {
            copyOnWrite();
            ((PopWin) this.instance).setPopTitle(builder.build());
            return this;
        }

        public Builder setSubtitle(TextInfo.Builder builder) {
            copyOnWrite();
            ((PopWin) this.instance).setSubtitle(builder.build());
            return this;
        }

        public Builder addButton(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((PopWin) this.instance).addButton(builder.build());
            return this;
        }

        public Builder addCoupon(Coupon.Builder builder) {
            copyOnWrite();
            ((PopWin) this.instance).addCoupon(builder.build());
            return this;
        }

        public Builder addButton(int i, ButtonInfo.Builder builder) {
            copyOnWrite();
            ((PopWin) this.instance).addButton(i, builder.build());
            return this;
        }

        public Builder addCoupon(int i, Coupon.Builder builder) {
            copyOnWrite();
            ((PopWin) this.instance).addCoupon(i, builder.build());
            return this;
        }
    }

    static {
        PopWin popWin = new PopWin();
        DEFAULT_INSTANCE = popWin;
        GeneratedMessageLite.registerDefaultInstance(PopWin.class, popWin);
    }

    private PopWin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllButton(Iterable<? extends ButtonInfo> iterable) {
        ensureButtonIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.button_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCoupon(Iterable<? extends Coupon> iterable) {
        ensureCouponIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.coupon_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addButton(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.add(buttonInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCoupon(Coupon coupon) {
        coupon.getClass();
        ensureCouponIsMutable();
        this.coupon_.add(coupon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomDesc() {
        this.bottomDesc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomText() {
        this.bottomText_ = getDefaultInstance().getBottomText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoupon() {
        this.coupon_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopTitle() {
        this.popTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopType() {
        this.popType_ = getDefaultInstance().getPopType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureButtonIsMutable() {
        Internal.ProtobufList<ButtonInfo> protobufList = this.button_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.button_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureCouponIsMutable() {
        Internal.ProtobufList<Coupon> protobufList = this.coupon_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.coupon_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PopWin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBottomDesc(ButtonInfo buttonInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePopTitle(TextInfo textInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubtitle(TextInfo textInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PopWin parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PopWin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PopWin parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PopWin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PopWin> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeButton(int i) {
        ensureButtonIsMutable();
        this.button_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCoupon(int i) {
        ensureCouponIsMutable();
        this.coupon_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomDesc(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        this.bottomDesc_ = buttonInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomText(String str) {
        str.getClass();
        this.bottomText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bottomText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(int i, ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.set(i, buttonInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoupon(int i, Coupon coupon) {
        coupon.getClass();
        ensureCouponIsMutable();
        this.coupon_.set(i, coupon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopTitle(TextInfo textInfo) {
        textInfo.getClass();
        this.popTitle_ = textInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopType(String str) {
        str.getClass();
        this.popType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.popType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(TextInfo textInfo) {
        textInfo.getClass();
        this.subtitle_ = textInfo;
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78711.f17586xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PopWin();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0002\u0000\u0001\u0208\u0002\u001b\u0003\u001b\u0004\u0208\u0005\t\u0006\t\u0007\t\b\u0208\t\u0208", new Object[]{"title_", "coupon_", Coupon.class, "button_", ButtonInfo.class, "bottomText_", "popTitle_", "subtitle_", "bottomDesc_", "cover_", "popType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PopWin> parser = PARSER;
                if (parser == null) {
                    synchronized (PopWin.class) {
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

    public ButtonInfo getBottomDesc() {
        ButtonInfo buttonInfo = this.bottomDesc_;
        return buttonInfo == null ? ButtonInfo.getDefaultInstance() : buttonInfo;
    }

    public String getBottomText() {
        return this.bottomText_;
    }

    public ByteString getBottomTextBytes() {
        return ByteString.copyFromUtf8(this.bottomText_);
    }

    public ButtonInfo getButton(int i) {
        return this.button_.get(i);
    }

    public int getButtonCount() {
        return this.button_.size();
    }

    public List<ButtonInfo> getButtonList() {
        return this.button_;
    }

    public ButtonInfoOrBuilder getButtonOrBuilder(int i) {
        return this.button_.get(i);
    }

    public List<? extends ButtonInfoOrBuilder> getButtonOrBuilderList() {
        return this.button_;
    }

    public Coupon getCoupon(int i) {
        return this.coupon_.get(i);
    }

    public int getCouponCount() {
        return this.coupon_.size();
    }

    public List<Coupon> getCouponList() {
        return this.coupon_;
    }

    public CouponOrBuilder getCouponOrBuilder(int i) {
        return this.coupon_.get(i);
    }

    public List<? extends CouponOrBuilder> getCouponOrBuilderList() {
        return this.coupon_;
    }

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public TextInfo getPopTitle() {
        TextInfo textInfo = this.popTitle_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    public String getPopType() {
        return this.popType_;
    }

    public ByteString getPopTypeBytes() {
        return ByteString.copyFromUtf8(this.popType_);
    }

    public TextInfo getSubtitle() {
        TextInfo textInfo = this.subtitle_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public boolean hasBottomDesc() {
        return this.bottomDesc_ != null;
    }

    public boolean hasPopTitle() {
        return this.popTitle_ != null;
    }

    public boolean hasSubtitle() {
        return this.subtitle_ != null;
    }

    public static Builder newBuilder(PopWin popWin) {
        return DEFAULT_INSTANCE.createBuilder(popWin);
    }

    public static PopWin parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopWin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PopWin parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopWin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PopWin parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PopWin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addButton(int i, ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.add(i, buttonInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCoupon(int i, Coupon coupon) {
        coupon.getClass();
        ensureCouponIsMutable();
        this.coupon_.add(i, coupon);
    }

    public static PopWin parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopWin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PopWin parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PopWin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PopWin parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopWin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PopWin parseFrom(InputStream inputStream) throws IOException {
        return (PopWin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PopWin parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopWin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PopWin parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PopWin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PopWin parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopWin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
