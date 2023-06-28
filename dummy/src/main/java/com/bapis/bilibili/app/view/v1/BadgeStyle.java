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
public final class BadgeStyle extends GeneratedMessageLite<BadgeStyle, BadgeStyle.Builder> implements MessageLiteOrBuilder {
    public static final int BG_COLOR_FIELD_NUMBER = 4;
    public static final int BG_COLOR_NIGHT_FIELD_NUMBER = 5;
    public static final int BG_STYLE_FIELD_NUMBER = 8;
    public static final int BORDER_COLOR_FIELD_NUMBER = 6;
    public static final int BORDER_COLOR_NIGHT_FIELD_NUMBER = 7;
    private static final BadgeStyle DEFAULT_INSTANCE;
    private static volatile Parser<BadgeStyle> PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_COLOR_NIGHT_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bgStyle_;
    private String text_ = "";
    private String textColor_ = "";
    private String textColorNight_ = "";
    private String bgColor_ = "";
    private String bgColorNight_ = "";
    private String borderColor_ = "";
    private String borderColorNight_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.BadgeStyle$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67161 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16692xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16692xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16692xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16692xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16692xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16692xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16692xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16692xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BadgeStyle, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67161 c67161) {
            this();
        }

        public Builder clearBgColor() {
            copyOnWrite();
            ((BadgeStyle) this.instance).clearBgColor();
            return this;
        }

        public Builder clearBgColorNight() {
            copyOnWrite();
            ((BadgeStyle) this.instance).clearBgColorNight();
            return this;
        }

        public Builder clearBgStyle() {
            copyOnWrite();
            ((BadgeStyle) this.instance).clearBgStyle();
            return this;
        }

        public Builder clearBorderColor() {
            copyOnWrite();
            ((BadgeStyle) this.instance).clearBorderColor();
            return this;
        }

        public Builder clearBorderColorNight() {
            copyOnWrite();
            ((BadgeStyle) this.instance).clearBorderColorNight();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((BadgeStyle) this.instance).clearText();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((BadgeStyle) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTextColorNight() {
            copyOnWrite();
            ((BadgeStyle) this.instance).clearTextColorNight();
            return this;
        }

        public String getBgColor() {
            return ((BadgeStyle) this.instance).getBgColor();
        }

        public ByteString getBgColorBytes() {
            return ((BadgeStyle) this.instance).getBgColorBytes();
        }

        public String getBgColorNight() {
            return ((BadgeStyle) this.instance).getBgColorNight();
        }

        public ByteString getBgColorNightBytes() {
            return ((BadgeStyle) this.instance).getBgColorNightBytes();
        }

        public int getBgStyle() {
            return ((BadgeStyle) this.instance).getBgStyle();
        }

        public String getBorderColor() {
            return ((BadgeStyle) this.instance).getBorderColor();
        }

        public ByteString getBorderColorBytes() {
            return ((BadgeStyle) this.instance).getBorderColorBytes();
        }

        public String getBorderColorNight() {
            return ((BadgeStyle) this.instance).getBorderColorNight();
        }

        public ByteString getBorderColorNightBytes() {
            return ((BadgeStyle) this.instance).getBorderColorNightBytes();
        }

        public String getText() {
            return ((BadgeStyle) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((BadgeStyle) this.instance).getTextBytes();
        }

        public String getTextColor() {
            return ((BadgeStyle) this.instance).getTextColor();
        }

        public ByteString getTextColorBytes() {
            return ((BadgeStyle) this.instance).getTextColorBytes();
        }

        public String getTextColorNight() {
            return ((BadgeStyle) this.instance).getTextColorNight();
        }

        public ByteString getTextColorNightBytes() {
            return ((BadgeStyle) this.instance).getTextColorNightBytes();
        }

        public Builder setBgColor(String str) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setBgColor(str);
            return this;
        }

        public Builder setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public Builder setBgColorNight(String str) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setBgColorNight(str);
            return this;
        }

        public Builder setBgColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setBgColorNightBytes(byteString);
            return this;
        }

        public Builder setBgStyle(int i) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setBgStyle(i);
            return this;
        }

        public Builder setBorderColor(String str) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setBorderColor(str);
            return this;
        }

        public Builder setBorderColorBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setBorderColorBytes(byteString);
            return this;
        }

        public Builder setBorderColorNight(String str) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setBorderColorNight(str);
            return this;
        }

        public Builder setBorderColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setBorderColorNightBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTextColorNight(String str) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setTextColorNight(str);
            return this;
        }

        public Builder setTextColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((BadgeStyle) this.instance).setTextColorNightBytes(byteString);
            return this;
        }

        private Builder() {
            super(BadgeStyle.DEFAULT_INSTANCE);
        }
    }

    static {
        BadgeStyle badgeStyle = new BadgeStyle();
        DEFAULT_INSTANCE = badgeStyle;
        GeneratedMessageLite.registerDefaultInstance(BadgeStyle.class, badgeStyle);
    }

    private BadgeStyle() {
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

    public static BadgeStyle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BadgeStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BadgeStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadgeStyle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BadgeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BadgeStyle> parser() {
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67161.f16692xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BadgeStyle();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0004", new Object[]{"text_", "textColor_", "textColorNight_", "bgColor_", "bgColorNight_", "borderColor_", "borderColorNight_", "bgStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BadgeStyle> parser = PARSER;
                if (parser == null) {
                    synchronized (BadgeStyle.class) {
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

    public static Builder newBuilder(BadgeStyle badgeStyle) {
        return DEFAULT_INSTANCE.createBuilder(badgeStyle);
    }

    public static BadgeStyle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadgeStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BadgeStyle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadgeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BadgeStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BadgeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BadgeStyle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadgeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BadgeStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BadgeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BadgeStyle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadgeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BadgeStyle parseFrom(InputStream inputStream) throws IOException {
        return (BadgeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadgeStyle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadgeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BadgeStyle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BadgeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BadgeStyle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadgeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
