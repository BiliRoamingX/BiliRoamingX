package com.bapis.bilibili.app.card.v1;

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
/* loaded from: classes13.dex */
public final class ReasonStyle extends GeneratedMessageLite<ReasonStyle, ReasonStyle.C5853b> implements InterfaceC5938r {
    public static final int BG_COLOR_FIELD_NUMBER = 3;
    public static final int BG_COLOR_NIGHT_FIELD_NUMBER = 7;
    public static final int BG_STYLE_FIELD_NUMBER = 10;
    public static final int BORDER_COLOR_FIELD_NUMBER = 4;
    public static final int BORDER_COLOR_NIGHT_FIELD_NUMBER = 8;
    private static final ReasonStyle DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 13;
    public static final int EVENT_V2_FIELD_NUMBER = 14;
    public static final int ICON_BG_URL_FIELD_NUMBER = 12;
    public static final int ICON_NIGHT_URL_FIELD_NUMBER = 9;
    public static final int ICON_URL_FIELD_NUMBER = 5;
    public static final int LEFT_ICON_TYPE_FIELD_NUMBER = 16;
    private static volatile Parser<ReasonStyle> PARSER = null;
    public static final int RIGHT_ICON_TYPE_FIELD_NUMBER = 15;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_COLOR_NIGHT_FIELD_NUMBER = 6;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 11;
    private int bgStyle_;
    private int rightIconType_;
    private String text_ = "";
    private String textColor_ = "";
    private String bgColor_ = "";
    private String borderColor_ = "";
    private String iconUrl_ = "";
    private String textColorNight_ = "";
    private String bgColorNight_ = "";
    private String borderColorNight_ = "";
    private String iconNightUrl_ = "";
    private String uri_ = "";
    private String iconBgUrl_ = "";
    private String event_ = "";
    private String eventV2_ = "";
    private String leftIconType_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ReasonStyle$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5852a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15975xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15975xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15975xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15975xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15975xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15975xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15975xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15975xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ReasonStyle$b */
    /* loaded from: classes13.dex */
    public static final class C5853b extends GeneratedMessageLite.Builder<ReasonStyle, C5853b> implements InterfaceC5938r {
        /* synthetic */ C5853b(C5852a c5852a) {
            this();
        }

        public C5853b clearBgColor() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearBgColor();
            return this;
        }

        public C5853b clearBgColorNight() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearBgColorNight();
            return this;
        }

        public C5853b clearBgStyle() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearBgStyle();
            return this;
        }

        public C5853b clearBorderColor() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearBorderColor();
            return this;
        }

        public C5853b clearBorderColorNight() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearBorderColorNight();
            return this;
        }

        public C5853b clearEvent() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearEvent();
            return this;
        }

        public C5853b clearEventV2() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearEventV2();
            return this;
        }

        public C5853b clearIconBgUrl() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearIconBgUrl();
            return this;
        }

        public C5853b clearIconNightUrl() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearIconNightUrl();
            return this;
        }

        public C5853b clearIconUrl() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearIconUrl();
            return this;
        }

        public C5853b clearLeftIconType() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearLeftIconType();
            return this;
        }

        public C5853b clearRightIconType() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearRightIconType();
            return this;
        }

        public C5853b clearText() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearText();
            return this;
        }

        public C5853b clearTextColor() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearTextColor();
            return this;
        }

        public C5853b clearTextColorNight() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearTextColorNight();
            return this;
        }

        public C5853b clearUri() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getBgColor() {
            return ((ReasonStyle) this.instance).getBgColor();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getBgColorBytes() {
            return ((ReasonStyle) this.instance).getBgColorBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getBgColorNight() {
            return ((ReasonStyle) this.instance).getBgColorNight();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getBgColorNightBytes() {
            return ((ReasonStyle) this.instance).getBgColorNightBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public int getBgStyle() {
            return ((ReasonStyle) this.instance).getBgStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getBorderColor() {
            return ((ReasonStyle) this.instance).getBorderColor();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getBorderColorBytes() {
            return ((ReasonStyle) this.instance).getBorderColorBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getBorderColorNight() {
            return ((ReasonStyle) this.instance).getBorderColorNight();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getBorderColorNightBytes() {
            return ((ReasonStyle) this.instance).getBorderColorNightBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getEvent() {
            return ((ReasonStyle) this.instance).getEvent();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getEventBytes() {
            return ((ReasonStyle) this.instance).getEventBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getEventV2() {
            return ((ReasonStyle) this.instance).getEventV2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getEventV2Bytes() {
            return ((ReasonStyle) this.instance).getEventV2Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getIconBgUrl() {
            return ((ReasonStyle) this.instance).getIconBgUrl();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getIconBgUrlBytes() {
            return ((ReasonStyle) this.instance).getIconBgUrlBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getIconNightUrl() {
            return ((ReasonStyle) this.instance).getIconNightUrl();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getIconNightUrlBytes() {
            return ((ReasonStyle) this.instance).getIconNightUrlBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getIconUrl() {
            return ((ReasonStyle) this.instance).getIconUrl();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getIconUrlBytes() {
            return ((ReasonStyle) this.instance).getIconUrlBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getLeftIconType() {
            return ((ReasonStyle) this.instance).getLeftIconType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getLeftIconTypeBytes() {
            return ((ReasonStyle) this.instance).getLeftIconTypeBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public int getRightIconType() {
            return ((ReasonStyle) this.instance).getRightIconType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getText() {
            return ((ReasonStyle) this.instance).getText();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getTextBytes() {
            return ((ReasonStyle) this.instance).getTextBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getTextColor() {
            return ((ReasonStyle) this.instance).getTextColor();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getTextColorBytes() {
            return ((ReasonStyle) this.instance).getTextColorBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getTextColorNight() {
            return ((ReasonStyle) this.instance).getTextColorNight();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getTextColorNightBytes() {
            return ((ReasonStyle) this.instance).getTextColorNightBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public String getUri() {
            return ((ReasonStyle) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
        public ByteString getUriBytes() {
            return ((ReasonStyle) this.instance).getUriBytes();
        }

        public C5853b setBgColor(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBgColor(str);
            return this;
        }

        public C5853b setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public C5853b setBgColorNight(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBgColorNight(str);
            return this;
        }

        public C5853b setBgColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBgColorNightBytes(byteString);
            return this;
        }

        public C5853b setBgStyle(int i) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBgStyle(i);
            return this;
        }

        public C5853b setBorderColor(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBorderColor(str);
            return this;
        }

        public C5853b setBorderColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBorderColorBytes(byteString);
            return this;
        }

        public C5853b setBorderColorNight(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBorderColorNight(str);
            return this;
        }

        public C5853b setBorderColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBorderColorNightBytes(byteString);
            return this;
        }

        public C5853b setEvent(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setEvent(str);
            return this;
        }

        public C5853b setEventBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setEventBytes(byteString);
            return this;
        }

        public C5853b setEventV2(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setEventV2(str);
            return this;
        }

        public C5853b setEventV2Bytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setEventV2Bytes(byteString);
            return this;
        }

        public C5853b setIconBgUrl(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setIconBgUrl(str);
            return this;
        }

        public C5853b setIconBgUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setIconBgUrlBytes(byteString);
            return this;
        }

        public C5853b setIconNightUrl(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setIconNightUrl(str);
            return this;
        }

        public C5853b setIconNightUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setIconNightUrlBytes(byteString);
            return this;
        }

        public C5853b setIconUrl(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setIconUrl(str);
            return this;
        }

        public C5853b setIconUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setIconUrlBytes(byteString);
            return this;
        }

        public C5853b setLeftIconType(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setLeftIconType(str);
            return this;
        }

        public C5853b setLeftIconTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setLeftIconTypeBytes(byteString);
            return this;
        }

        public C5853b setRightIconType(int i) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setRightIconType(i);
            return this;
        }

        public C5853b setText(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setText(str);
            return this;
        }

        public C5853b setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setTextBytes(byteString);
            return this;
        }

        public C5853b setTextColor(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setTextColor(str);
            return this;
        }

        public C5853b setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public C5853b setTextColorNight(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setTextColorNight(str);
            return this;
        }

        public C5853b setTextColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setTextColorNightBytes(byteString);
            return this;
        }

        public C5853b setUri(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setUri(str);
            return this;
        }

        public C5853b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setUriBytes(byteString);
            return this;
        }

        private C5853b() {
            super(ReasonStyle.DEFAULT_INSTANCE);
        }
    }

    static {
        ReasonStyle reasonStyle = new ReasonStyle();
        DEFAULT_INSTANCE = reasonStyle;
        GeneratedMessageLite.registerDefaultInstance(ReasonStyle.class, reasonStyle);
    }

    private ReasonStyle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgColor() {
        this.bgColor_ = getDefaultInstance().getBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgColorNight() {
        this.bgColorNight_ = getDefaultInstance().getBgColorNight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgStyle() {
        this.bgStyle_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorderColor() {
        this.borderColor_ = getDefaultInstance().getBorderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorderColorNight() {
        this.borderColorNight_ = getDefaultInstance().getBorderColorNight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = getDefaultInstance().getEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventV2() {
        this.eventV2_ = getDefaultInstance().getEventV2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconBgUrl() {
        this.iconBgUrl_ = getDefaultInstance().getIconBgUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconNightUrl() {
        this.iconNightUrl_ = getDefaultInstance().getIconNightUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconUrl() {
        this.iconUrl_ = getDefaultInstance().getIconUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeftIconType() {
        this.leftIconType_ = getDefaultInstance().getLeftIconType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightIconType() {
        this.rightIconType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextColor() {
        this.textColor_ = getDefaultInstance().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextColorNight() {
        this.textColorNight_ = getDefaultInstance().getTextColorNight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static ReasonStyle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5853b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ReasonStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReasonStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReasonStyle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ReasonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ReasonStyle> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgColor(String str) {
        str.getClass();
        this.bgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgColorNight(String str) {
        str.getClass();
        this.bgColorNight_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgColorNight_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgStyle(int i) {
        this.bgStyle_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderColor(String str) {
        str.getClass();
        this.borderColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.borderColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderColorNight(String str) {
        str.getClass();
        this.borderColorNight_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.borderColorNight_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(String str) {
        str.getClass();
        this.event_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.event_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventV2(String str) {
        str.getClass();
        this.eventV2_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventV2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventV2_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBgUrl(String str) {
        str.getClass();
        this.iconBgUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBgUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconBgUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconNightUrl(String str) {
        str.getClass();
        this.iconNightUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconNightUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconNightUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconUrl(String str) {
        str.getClass();
        this.iconUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeftIconType(String str) {
        str.getClass();
        this.leftIconType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeftIconTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.leftIconType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightIconType(int i) {
        this.rightIconType_ = i;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColor(String str) {
        str.getClass();
        this.textColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColorNight(String str) {
        str.getClass();
        this.textColorNight_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColorNight_ = byteString.toStringUtf8();
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
        switch (C5852a.f15975xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ReasonStyle();
            case 2:
                return new C5853b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0004\u000b\u0208\f\u0208\r\u0208\u000e\u0208\u000f\u0004\u0010\u0208", new Object[]{"text_", "textColor_", "bgColor_", "borderColor_", "iconUrl_", "textColorNight_", "bgColorNight_", "borderColorNight_", "iconNightUrl_", "bgStyle_", "uri_", "iconBgUrl_", "event_", "eventV2_", "rightIconType_", "leftIconType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReasonStyle> parser = PARSER;
                if (parser == null) {
                    synchronized (ReasonStyle.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getBgColor() {
        return this.bgColor_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getBgColorBytes() {
        return ByteString.copyFromUtf8(this.bgColor_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getBgColorNight() {
        return this.bgColorNight_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getBgColorNightBytes() {
        return ByteString.copyFromUtf8(this.bgColorNight_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public int getBgStyle() {
        return this.bgStyle_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getBorderColor() {
        return this.borderColor_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getBorderColorBytes() {
        return ByteString.copyFromUtf8(this.borderColor_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getBorderColorNight() {
        return this.borderColorNight_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getBorderColorNightBytes() {
        return ByteString.copyFromUtf8(this.borderColorNight_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getEvent() {
        return this.event_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getEventBytes() {
        return ByteString.copyFromUtf8(this.event_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getEventV2() {
        return this.eventV2_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getEventV2Bytes() {
        return ByteString.copyFromUtf8(this.eventV2_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getIconBgUrl() {
        return this.iconBgUrl_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getIconBgUrlBytes() {
        return ByteString.copyFromUtf8(this.iconBgUrl_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getIconNightUrl() {
        return this.iconNightUrl_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getIconNightUrlBytes() {
        return ByteString.copyFromUtf8(this.iconNightUrl_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getIconUrl() {
        return this.iconUrl_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getIconUrlBytes() {
        return ByteString.copyFromUtf8(this.iconUrl_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getLeftIconType() {
        return this.leftIconType_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getLeftIconTypeBytes() {
        return ByteString.copyFromUtf8(this.leftIconType_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public int getRightIconType() {
        return this.rightIconType_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getText() {
        return this.text_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getTextColor() {
        return this.textColor_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getTextColorNight() {
        return this.textColorNight_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getTextColorNightBytes() {
        return ByteString.copyFromUtf8(this.textColorNight_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5938r
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static C5853b newBuilder(ReasonStyle reasonStyle) {
        return DEFAULT_INSTANCE.createBuilder(reasonStyle);
    }

    public static ReasonStyle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReasonStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReasonStyle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReasonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ReasonStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ReasonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ReasonStyle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReasonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ReasonStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ReasonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReasonStyle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReasonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ReasonStyle parseFrom(InputStream inputStream) throws IOException {
        return (ReasonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReasonStyle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReasonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReasonStyle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ReasonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ReasonStyle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReasonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
