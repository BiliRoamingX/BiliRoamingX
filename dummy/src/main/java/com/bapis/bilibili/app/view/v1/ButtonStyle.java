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
public final class ButtonStyle extends GeneratedMessageLite<ButtonStyle, ButtonStyle.Builder> implements MessageLiteOrBuilder {
    public static final int BG_COLOR_FIELD_NUMBER = 4;
    public static final int BG_COLOR_NIGHT_FIELD_NUMBER = 5;
    private static final ButtonStyle DEFAULT_INSTANCE;
    public static final int JUMP_LINK_FIELD_NUMBER = 6;
    private static volatile Parser<ButtonStyle> PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_COLOR_NIGHT_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = "";
    private String textColor_ = "";
    private String textColorNight_ = "";
    private String bgColor_ = "";
    private String bgColorNight_ = "";
    private String jumpLink_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ButtonStyle$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67251 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16700xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16700xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16700xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16700xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16700xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16700xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16700xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16700xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ButtonStyle, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67251 c67251) {
            this();
        }

        public Builder clearBgColor() {
            copyOnWrite();
            ((ButtonStyle) this.instance).clearBgColor();
            return this;
        }

        public Builder clearBgColorNight() {
            copyOnWrite();
            ((ButtonStyle) this.instance).clearBgColorNight();
            return this;
        }

        public Builder clearJumpLink() {
            copyOnWrite();
            ((ButtonStyle) this.instance).clearJumpLink();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((ButtonStyle) this.instance).clearText();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((ButtonStyle) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTextColorNight() {
            copyOnWrite();
            ((ButtonStyle) this.instance).clearTextColorNight();
            return this;
        }

        public String getBgColor() {
            return ((ButtonStyle) this.instance).getBgColor();
        }

        public ByteString getBgColorBytes() {
            return ((ButtonStyle) this.instance).getBgColorBytes();
        }

        public String getBgColorNight() {
            return ((ButtonStyle) this.instance).getBgColorNight();
        }

        public ByteString getBgColorNightBytes() {
            return ((ButtonStyle) this.instance).getBgColorNightBytes();
        }

        public String getJumpLink() {
            return ((ButtonStyle) this.instance).getJumpLink();
        }

        public ByteString getJumpLinkBytes() {
            return ((ButtonStyle) this.instance).getJumpLinkBytes();
        }

        public String getText() {
            return ((ButtonStyle) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((ButtonStyle) this.instance).getTextBytes();
        }

        public String getTextColor() {
            return ((ButtonStyle) this.instance).getTextColor();
        }

        public ByteString getTextColorBytes() {
            return ((ButtonStyle) this.instance).getTextColorBytes();
        }

        public String getTextColorNight() {
            return ((ButtonStyle) this.instance).getTextColorNight();
        }

        public ByteString getTextColorNightBytes() {
            return ((ButtonStyle) this.instance).getTextColorNightBytes();
        }

        public Builder setBgColor(String str) {
            copyOnWrite();
            ((ButtonStyle) this.instance).setBgColor(str);
            return this;
        }

        public Builder setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonStyle) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public Builder setBgColorNight(String str) {
            copyOnWrite();
            ((ButtonStyle) this.instance).setBgColorNight(str);
            return this;
        }

        public Builder setBgColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonStyle) this.instance).setBgColorNightBytes(byteString);
            return this;
        }

        public Builder setJumpLink(String str) {
            copyOnWrite();
            ((ButtonStyle) this.instance).setJumpLink(str);
            return this;
        }

        public Builder setJumpLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonStyle) this.instance).setJumpLinkBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((ButtonStyle) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonStyle) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((ButtonStyle) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonStyle) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTextColorNight(String str) {
            copyOnWrite();
            ((ButtonStyle) this.instance).setTextColorNight(str);
            return this;
        }

        public Builder setTextColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonStyle) this.instance).setTextColorNightBytes(byteString);
            return this;
        }

        private Builder() {
            super(ButtonStyle.DEFAULT_INSTANCE);
        }
    }

    static {
        ButtonStyle buttonStyle = new ButtonStyle();
        DEFAULT_INSTANCE = buttonStyle;
        GeneratedMessageLite.registerDefaultInstance(ButtonStyle.class, buttonStyle);
    }

    private ButtonStyle() {
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
    public void clearJumpLink() {
        this.jumpLink_ = getDefaultInstance().getJumpLink();
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

    public static ButtonStyle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ButtonStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ButtonStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ButtonStyle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ButtonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ButtonStyle> parser() {
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
    public void setJumpLink(String str) {
        str.getClass();
        this.jumpLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpLink_ = byteString.toStringUtf8();
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
        switch (C67251.f16700xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ButtonStyle();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208", new Object[]{"text_", "textColor_", "textColorNight_", "bgColor_", "bgColorNight_", "jumpLink_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ButtonStyle> parser = PARSER;
                if (parser == null) {
                    synchronized (ButtonStyle.class) {
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

    public String getJumpLink() {
        return this.jumpLink_;
    }

    public ByteString getJumpLinkBytes() {
        return ByteString.copyFromUtf8(this.jumpLink_);
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

    public static Builder newBuilder(ButtonStyle buttonStyle) {
        return DEFAULT_INSTANCE.createBuilder(buttonStyle);
    }

    public static ButtonStyle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ButtonStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ButtonStyle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ButtonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ButtonStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ButtonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ButtonStyle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ButtonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ButtonStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ButtonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ButtonStyle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ButtonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ButtonStyle parseFrom(InputStream inputStream) throws IOException {
        return (ButtonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ButtonStyle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ButtonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ButtonStyle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ButtonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ButtonStyle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ButtonStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
