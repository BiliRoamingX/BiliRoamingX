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
public final class BadgeInfo extends GeneratedMessageLite<BadgeInfo, BadgeInfo.Builder> implements MessageLiteOrBuilder {
    public static final int BG_COLOR_FIELD_NUMBER = 4;
    public static final int BG_COLOR_NIGHT_FIELD_NUMBER = 5;
    public static final int BG_STYLE_FIELD_NUMBER = 8;
    public static final int BORDER_COLOR_FIELD_NUMBER = 6;
    public static final int BORDER_COLOR_NIGHT_FIELD_NUMBER = 7;
    private static final BadgeInfo DEFAULT_INSTANCE;
    public static final int IMG_FIELD_NUMBER = 9;
    private static volatile Parser<BadgeInfo> PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_COLOR_NIGHT_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 10;
    private int bgStyle_;
    private int type_;
    private String text_ = "";
    private String textColor_ = "";
    private String textColorNight_ = "";
    private String bgColor_ = "";
    private String bgColorNight_ = "";
    private String borderColor_ = "";
    private String borderColorNight_ = "";
    private String img_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.BadgeInfo$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69781 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16965xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16965xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16965xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16965xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16965xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16965xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16965xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16965xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BadgeInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69781 c69781) {
            this();
        }

        public Builder clearBgColor() {
            copyOnWrite();
            ((BadgeInfo) this.instance).clearBgColor();
            return this;
        }

        public Builder clearBgColorNight() {
            copyOnWrite();
            ((BadgeInfo) this.instance).clearBgColorNight();
            return this;
        }

        public Builder clearBgStyle() {
            copyOnWrite();
            ((BadgeInfo) this.instance).clearBgStyle();
            return this;
        }

        public Builder clearBorderColor() {
            copyOnWrite();
            ((BadgeInfo) this.instance).clearBorderColor();
            return this;
        }

        public Builder clearBorderColorNight() {
            copyOnWrite();
            ((BadgeInfo) this.instance).clearBorderColorNight();
            return this;
        }

        public Builder clearImg() {
            copyOnWrite();
            ((BadgeInfo) this.instance).clearImg();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((BadgeInfo) this.instance).clearText();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((BadgeInfo) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTextColorNight() {
            copyOnWrite();
            ((BadgeInfo) this.instance).clearTextColorNight();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((BadgeInfo) this.instance).clearType();
            return this;
        }

        public String getBgColor() {
            return ((BadgeInfo) this.instance).getBgColor();
        }

        public ByteString getBgColorBytes() {
            return ((BadgeInfo) this.instance).getBgColorBytes();
        }

        public String getBgColorNight() {
            return ((BadgeInfo) this.instance).getBgColorNight();
        }

        public ByteString getBgColorNightBytes() {
            return ((BadgeInfo) this.instance).getBgColorNightBytes();
        }

        public int getBgStyle() {
            return ((BadgeInfo) this.instance).getBgStyle();
        }

        public String getBorderColor() {
            return ((BadgeInfo) this.instance).getBorderColor();
        }

        public ByteString getBorderColorBytes() {
            return ((BadgeInfo) this.instance).getBorderColorBytes();
        }

        public String getBorderColorNight() {
            return ((BadgeInfo) this.instance).getBorderColorNight();
        }

        public ByteString getBorderColorNightBytes() {
            return ((BadgeInfo) this.instance).getBorderColorNightBytes();
        }

        public String getImg() {
            return ((BadgeInfo) this.instance).getImg();
        }

        public ByteString getImgBytes() {
            return ((BadgeInfo) this.instance).getImgBytes();
        }

        public String getText() {
            return ((BadgeInfo) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((BadgeInfo) this.instance).getTextBytes();
        }

        public String getTextColor() {
            return ((BadgeInfo) this.instance).getTextColor();
        }

        public ByteString getTextColorBytes() {
            return ((BadgeInfo) this.instance).getTextColorBytes();
        }

        public String getTextColorNight() {
            return ((BadgeInfo) this.instance).getTextColorNight();
        }

        public ByteString getTextColorNightBytes() {
            return ((BadgeInfo) this.instance).getTextColorNightBytes();
        }

        public int getType() {
            return ((BadgeInfo) this.instance).getType();
        }

        public Builder setBgColor(String str) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setBgColor(str);
            return this;
        }

        public Builder setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public Builder setBgColorNight(String str) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setBgColorNight(str);
            return this;
        }

        public Builder setBgColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setBgColorNightBytes(byteString);
            return this;
        }

        public Builder setBgStyle(int i) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setBgStyle(i);
            return this;
        }

        public Builder setBorderColor(String str) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setBorderColor(str);
            return this;
        }

        public Builder setBorderColorBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setBorderColorBytes(byteString);
            return this;
        }

        public Builder setBorderColorNight(String str) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setBorderColorNight(str);
            return this;
        }

        public Builder setBorderColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setBorderColorNightBytes(byteString);
            return this;
        }

        public Builder setImg(String str) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setImg(str);
            return this;
        }

        public Builder setImgBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setImgBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTextColorNight(String str) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setTextColorNight(str);
            return this;
        }

        public Builder setTextColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setTextColorNightBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(BadgeInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        BadgeInfo badgeInfo = new BadgeInfo();
        DEFAULT_INSTANCE = badgeInfo;
        GeneratedMessageLite.registerDefaultInstance(BadgeInfo.class, badgeInfo);
    }

    public BadgeInfo() {
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
    public void clearImg() {
        this.img_ = getDefaultInstance().getImg();
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
    public void clearType() {
        this.type_ = 0;
    }

    public static BadgeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BadgeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BadgeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadgeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BadgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BadgeInfo> parser() {
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
    public void setImg(String str) {
        str.getClass();
        this.img_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.img_ = byteString.toStringUtf8();
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
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69781.f16965xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BadgeInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0004\t\u0208\n\u0004", new Object[]{"text_", "textColor_", "textColorNight_", "bgColor_", "bgColorNight_", "borderColor_", "borderColorNight_", "bgStyle_", "img_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BadgeInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (BadgeInfo.class) {
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

    public String getBgColor() {
        return this.bgColor_;
    }

    public ByteString getBgColorBytes() {
        return ByteString.copyFromUtf8(this.bgColor_);
    }

    public String getBgColorNight() {
        return this.bgColorNight_;
    }

    public ByteString getBgColorNightBytes() {
        return ByteString.copyFromUtf8(this.bgColorNight_);
    }

    public int getBgStyle() {
        return this.bgStyle_;
    }

    public String getBorderColor() {
        return this.borderColor_;
    }

    public ByteString getBorderColorBytes() {
        return ByteString.copyFromUtf8(this.borderColor_);
    }

    public String getBorderColorNight() {
        return this.borderColorNight_;
    }

    public ByteString getBorderColorNightBytes() {
        return ByteString.copyFromUtf8(this.borderColorNight_);
    }

    public String getImg() {
        return this.img_;
    }

    public ByteString getImgBytes() {
        return ByteString.copyFromUtf8(this.img_);
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public String getTextColor() {
        return this.textColor_;
    }

    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    public String getTextColorNight() {
        return this.textColorNight_;
    }

    public ByteString getTextColorNightBytes() {
        return ByteString.copyFromUtf8(this.textColorNight_);
    }

    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(BadgeInfo badgeInfo) {
        return DEFAULT_INSTANCE.createBuilder(badgeInfo);
    }

    public static BadgeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadgeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BadgeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BadgeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BadgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BadgeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BadgeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BadgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BadgeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BadgeInfo parseFrom(InputStream inputStream) throws IOException {
        return (BadgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadgeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BadgeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BadgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BadgeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
