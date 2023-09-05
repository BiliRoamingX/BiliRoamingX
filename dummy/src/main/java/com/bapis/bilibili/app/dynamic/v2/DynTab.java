package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class DynTab extends GeneratedMessageLite<DynTab, DynTab.Builder> implements DynTabOrBuilder {
    public static final int ANCHOR_FIELD_NUMBER = 10;
    public static final int BACK_UP_FIELD_NUMBER = 13;
    public static final int BUBBLE_FIELD_NUMBER = 3;
    public static final int CITY_ID_FIELD_NUMBER = 5;
    public static final int DEFAULTTAB_FIELD_NUMBER = 8;
    private static final DynTab DEFAULT_INSTANCE;
    public static final int INTERNAL_TEST_FIELD_NUMBER = 11;
    public static final int IS_POPUP_FIELD_NUMBER = 6;
    public static final int JUMP_HOME_POP_FIELD_NUMBER = 14;
    private static volatile Parser<DynTab> PARSER = null;
    public static final int POPUP_FIELD_NUMBER = 7;
    public static final int RED_POINT_FIELD_NUMBER = 4;
    public static final int SUB_TITLE_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 12;
    public static final int URI_FIELD_NUMBER = 2;
    private DynTab backUp_;
    private long cityId_;
    private boolean defaultTab_;
    private int isPopup_;
    private Popup popup_;
    private int redPoint_;
    private int type_;
    private String title_ = "";
    private String uri_ = "";
    private String bubble_ = "";
    private String subTitle_ = "";
    private String anchor_ = "";
    private String internalTest_ = "";
    private String jumpHomePop_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.DynTab$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C59651 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16143xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16143xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16143xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16143xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16143xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16143xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16143xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16143xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DynTab, Builder> implements DynTabOrBuilder {
        /* synthetic */ Builder(C59651 c59651) {
            this();
        }

        public Builder clearAnchor() {
            copyOnWrite();
            ((DynTab) this.instance).clearAnchor();
            return this;
        }

        public Builder clearBackUp() {
            copyOnWrite();
            ((DynTab) this.instance).clearBackUp();
            return this;
        }

        public Builder clearBubble() {
            copyOnWrite();
            ((DynTab) this.instance).clearBubble();
            return this;
        }

        public Builder clearCityId() {
            copyOnWrite();
            ((DynTab) this.instance).clearCityId();
            return this;
        }

        public Builder clearDefaultTab() {
            copyOnWrite();
            ((DynTab) this.instance).clearDefaultTab();
            return this;
        }

        public Builder clearInternalTest() {
            copyOnWrite();
            ((DynTab) this.instance).clearInternalTest();
            return this;
        }

        public Builder clearIsPopup() {
            copyOnWrite();
            ((DynTab) this.instance).clearIsPopup();
            return this;
        }

        public Builder clearJumpHomePop() {
            copyOnWrite();
            ((DynTab) this.instance).clearJumpHomePop();
            return this;
        }

        public Builder clearPopup() {
            copyOnWrite();
            ((DynTab) this.instance).clearPopup();
            return this;
        }

        public Builder clearRedPoint() {
            copyOnWrite();
            ((DynTab) this.instance).clearRedPoint();
            return this;
        }

        public Builder clearSubTitle() {
            copyOnWrite();
            ((DynTab) this.instance).clearSubTitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((DynTab) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((DynTab) this.instance).clearType();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((DynTab) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public String getAnchor() {
            return ((DynTab) this.instance).getAnchor();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public ByteString getAnchorBytes() {
            return ((DynTab) this.instance).getAnchorBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public DynTab getBackUp() {
            return ((DynTab) this.instance).getBackUp();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public String getBubble() {
            return ((DynTab) this.instance).getBubble();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public ByteString getBubbleBytes() {
            return ((DynTab) this.instance).getBubbleBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public long getCityId() {
            return ((DynTab) this.instance).getCityId();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public boolean getDefaultTab() {
            return ((DynTab) this.instance).getDefaultTab();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public String getInternalTest() {
            return ((DynTab) this.instance).getInternalTest();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public ByteString getInternalTestBytes() {
            return ((DynTab) this.instance).getInternalTestBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public int getIsPopup() {
            return ((DynTab) this.instance).getIsPopup();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public String getJumpHomePop() {
            return ((DynTab) this.instance).getJumpHomePop();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public ByteString getJumpHomePopBytes() {
            return ((DynTab) this.instance).getJumpHomePopBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public Popup getPopup() {
            return ((DynTab) this.instance).getPopup();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public int getRedPoint() {
            return ((DynTab) this.instance).getRedPoint();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public String getSubTitle() {
            return ((DynTab) this.instance).getSubTitle();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public ByteString getSubTitleBytes() {
            return ((DynTab) this.instance).getSubTitleBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public String getTitle() {
            return ((DynTab) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public ByteString getTitleBytes() {
            return ((DynTab) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public ShowType getType() {
            return ((DynTab) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public int getTypeValue() {
            return ((DynTab) this.instance).getTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public String getUri() {
            return ((DynTab) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public ByteString getUriBytes() {
            return ((DynTab) this.instance).getUriBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public boolean hasBackUp() {
            return ((DynTab) this.instance).hasBackUp();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
        public boolean hasPopup() {
            return ((DynTab) this.instance).hasPopup();
        }

        public Builder mergeBackUp(DynTab dynTab) {
            copyOnWrite();
            ((DynTab) this.instance).mergeBackUp(dynTab);
            return this;
        }

        public Builder mergePopup(Popup popup) {
            copyOnWrite();
            ((DynTab) this.instance).mergePopup(popup);
            return this;
        }

        public Builder setAnchor(String str) {
            copyOnWrite();
            ((DynTab) this.instance).setAnchor(str);
            return this;
        }

        public Builder setAnchorBytes(ByteString byteString) {
            copyOnWrite();
            ((DynTab) this.instance).setAnchorBytes(byteString);
            return this;
        }

        public Builder setBackUp(DynTab dynTab) {
            copyOnWrite();
            ((DynTab) this.instance).setBackUp(dynTab);
            return this;
        }

        public Builder setBubble(String str) {
            copyOnWrite();
            ((DynTab) this.instance).setBubble(str);
            return this;
        }

        public Builder setBubbleBytes(ByteString byteString) {
            copyOnWrite();
            ((DynTab) this.instance).setBubbleBytes(byteString);
            return this;
        }

        public Builder setCityId(long j) {
            copyOnWrite();
            ((DynTab) this.instance).setCityId(j);
            return this;
        }

        public Builder setDefaultTab(boolean z) {
            copyOnWrite();
            ((DynTab) this.instance).setDefaultTab(z);
            return this;
        }

        public Builder setInternalTest(String str) {
            copyOnWrite();
            ((DynTab) this.instance).setInternalTest(str);
            return this;
        }

        public Builder setInternalTestBytes(ByteString byteString) {
            copyOnWrite();
            ((DynTab) this.instance).setInternalTestBytes(byteString);
            return this;
        }

        public Builder setIsPopup(int i) {
            copyOnWrite();
            ((DynTab) this.instance).setIsPopup(i);
            return this;
        }

        public Builder setJumpHomePop(String str) {
            copyOnWrite();
            ((DynTab) this.instance).setJumpHomePop(str);
            return this;
        }

        public Builder setJumpHomePopBytes(ByteString byteString) {
            copyOnWrite();
            ((DynTab) this.instance).setJumpHomePopBytes(byteString);
            return this;
        }

        public Builder setPopup(Popup popup) {
            copyOnWrite();
            ((DynTab) this.instance).setPopup(popup);
            return this;
        }

        public Builder setRedPoint(int i) {
            copyOnWrite();
            ((DynTab) this.instance).setRedPoint(i);
            return this;
        }

        public Builder setSubTitle(String str) {
            copyOnWrite();
            ((DynTab) this.instance).setSubTitle(str);
            return this;
        }

        public Builder setSubTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((DynTab) this.instance).setSubTitleBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((DynTab) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((DynTab) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setType(ShowType showType) {
            copyOnWrite();
            ((DynTab) this.instance).setType(showType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((DynTab) this.instance).setTypeValue(i);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((DynTab) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((DynTab) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(DynTab.DEFAULT_INSTANCE);
        }

        public Builder setBackUp(Builder builder) {
            copyOnWrite();
            ((DynTab) this.instance).setBackUp(builder.build());
            return this;
        }

        public Builder setPopup(Popup.Builder builder) {
            copyOnWrite();
            ((DynTab) this.instance).setPopup(builder.build());
            return this;
        }
    }

    static {
        DynTab dynTab = new DynTab();
        DEFAULT_INSTANCE = dynTab;
        GeneratedMessageLite.registerDefaultInstance(DynTab.class, dynTab);
    }

    private DynTab() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnchor() {
        this.anchor_ = getDefaultInstance().getAnchor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackUp() {
        this.backUp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBubble() {
        this.bubble_ = getDefaultInstance().getBubble();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCityId() {
        this.cityId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultTab() {
        this.defaultTab_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalTest() {
        this.internalTest_ = getDefaultInstance().getInternalTest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPopup() {
        this.isPopup_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpHomePop() {
        this.jumpHomePop_ = getDefaultInstance().getJumpHomePop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopup() {
        this.popup_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRedPoint() {
        this.redPoint_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubTitle() {
        this.subTitle_ = getDefaultInstance().getSubTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static DynTab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBackUp(DynTab dynTab) {
        dynTab.getClass();
        DynTab dynTab2 = this.backUp_;
        if (dynTab2 != null && dynTab2 != getDefaultInstance()) {
            this.backUp_ = newBuilder(this.backUp_).mergeFrom(dynTab).buildPartial();
        } else {
            this.backUp_ = dynTab;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePopup(Popup popup) {
        popup.getClass();
        Popup popup2 = this.popup_;
        if (popup2 != null && popup2 != Popup.getDefaultInstance()) {
            this.popup_ = Popup.newBuilder(this.popup_).mergeFrom(popup).buildPartial();
        } else {
            this.popup_ = popup;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DynTab parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DynTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynTab parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DynTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DynTab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnchor(String str) {
        str.getClass();
        this.anchor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnchorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.anchor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackUp(DynTab dynTab) {
        dynTab.getClass();
        this.backUp_ = dynTab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBubble(String str) {
        str.getClass();
        this.bubble_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBubbleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bubble_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityId(long j) {
        this.cityId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultTab(boolean z) {
        this.defaultTab_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalTest(String str) {
        str.getClass();
        this.internalTest_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalTestBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.internalTest_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPopup(int i) {
        this.isPopup_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpHomePop(String str) {
        str.getClass();
        this.jumpHomePop_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpHomePopBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpHomePop_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopup(Popup popup) {
        popup.getClass();
        this.popup_ = popup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRedPoint(int i) {
        this.redPoint_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitle(String str) {
        str.getClass();
        this.subTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subTitle_ = byteString.toStringUtf8();
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
    public void setType(ShowType showType) {
        this.type_ = showType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C59651.f16143xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DynTab();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u0002\u0006\u0004\u0007\t\b\u0007\t\u0208\n\u0208\u000b\u0208\f\f\r\t\u000e\u0208", new Object[]{"title_", "uri_", "bubble_", "redPoint_", "cityId_", "isPopup_", "popup_", "defaultTab_", "subTitle_", "anchor_", "internalTest_", "type_", "backUp_", "jumpHomePop_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DynTab> parser = PARSER;
                if (parser == null) {
                    synchronized (DynTab.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public String getAnchor() {
        return this.anchor_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public ByteString getAnchorBytes() {
        return ByteString.copyFromUtf8(this.anchor_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public DynTab getBackUp() {
        DynTab dynTab = this.backUp_;
        return dynTab == null ? getDefaultInstance() : dynTab;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public String getBubble() {
        return this.bubble_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public ByteString getBubbleBytes() {
        return ByteString.copyFromUtf8(this.bubble_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public long getCityId() {
        return this.cityId_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public boolean getDefaultTab() {
        return this.defaultTab_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public String getInternalTest() {
        return this.internalTest_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public ByteString getInternalTestBytes() {
        return ByteString.copyFromUtf8(this.internalTest_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public int getIsPopup() {
        return this.isPopup_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public String getJumpHomePop() {
        return this.jumpHomePop_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public ByteString getJumpHomePopBytes() {
        return ByteString.copyFromUtf8(this.jumpHomePop_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public Popup getPopup() {
        Popup popup = this.popup_;
        return popup == null ? Popup.getDefaultInstance() : popup;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public int getRedPoint() {
        return this.redPoint_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public String getSubTitle() {
        return this.subTitle_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public ByteString getSubTitleBytes() {
        return ByteString.copyFromUtf8(this.subTitle_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public ShowType getType() {
        ShowType forNumber = ShowType.forNumber(this.type_);
        return forNumber == null ? ShowType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public boolean hasBackUp() {
        return this.backUp_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynTabOrBuilder
    public boolean hasPopup() {
        return this.popup_ != null;
    }

    public static Builder newBuilder(DynTab dynTab) {
        return DEFAULT_INSTANCE.createBuilder(dynTab);
    }

    public static DynTab parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynTab parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DynTab parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DynTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DynTab parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DynTab parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DynTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DynTab parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DynTab parseFrom(InputStream inputStream) throws IOException {
        return (DynTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynTab parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynTab parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DynTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DynTab parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
