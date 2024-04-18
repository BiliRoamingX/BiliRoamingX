package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class BadgeInfo extends GeneratedMessageLite<BadgeInfo, BadgeInfo.Builder> implements MessageLiteOrBuilder {
    public static final int BG_COLOR_FIELD_NUMBER = 2;
    public static final int BG_COLOR_NIGHT_FIELD_NUMBER = 3;
    public static final int BG_GRADIENT_COLOR_FIELD_NUMBER = 5;
    private static final BadgeInfo DEFAULT_INSTANCE;
    public static final int IMG_FIELD_NUMBER = 6;
    private static volatile Parser<BadgeInfo> PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 1;
    private GradientColor bgGradientColor_;
    private String text_ = "";
    private String bgColor_ = "";
    private String bgColorNight_ = "";
    private String textColor_ = "";
    private String img_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.BadgeInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78191 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17546xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17546xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17546xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17546xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17546xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17546xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17546xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17546xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BadgeInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78191 c78191) {
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

        public Builder clearBgGradientColor() {
            copyOnWrite();
            ((BadgeInfo) this.instance).clearBgGradientColor();
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

        public GradientColor getBgGradientColor() {
            return ((BadgeInfo) this.instance).getBgGradientColor();
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

        public boolean hasBgGradientColor() {
            return ((BadgeInfo) this.instance).hasBgGradientColor();
        }

        public Builder mergeBgGradientColor(GradientColor gradientColor) {
            copyOnWrite();
            ((BadgeInfo) this.instance).mergeBgGradientColor(gradientColor);
            return this;
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

        public Builder setBgGradientColor(GradientColor gradientColor) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setBgGradientColor(gradientColor);
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

        private Builder() {
            super(BadgeInfo.DEFAULT_INSTANCE);
        }

        public Builder setBgGradientColor(GradientColor.Builder builder) {
            copyOnWrite();
            ((BadgeInfo) this.instance).setBgGradientColor(builder.build());
            return this;
        }
    }

    static {
        BadgeInfo badgeInfo = new BadgeInfo();
        DEFAULT_INSTANCE = badgeInfo;
        GeneratedMessageLite.registerDefaultInstance(BadgeInfo.class, badgeInfo);
    }

    private BadgeInfo() {
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
    public void clearBgGradientColor() {
        this.bgGradientColor_ = null;
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

    public static BadgeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBgGradientColor(GradientColor gradientColor) {
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
    public void setBgGradientColor(GradientColor gradientColor) {
        gradientColor.getClass();
        this.bgGradientColor_ = gradientColor;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78191.f17546xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BadgeInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\t\u0006\u0208", new Object[]{"text_", "bgColor_", "bgColorNight_", "textColor_", "bgGradientColor_", "img_"});
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

    public GradientColor getBgGradientColor() {
        GradientColor gradientColor = this.bgGradientColor_;
        return gradientColor == null ? GradientColor.getDefaultInstance() : gradientColor;
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

    public boolean hasBgGradientColor() {
        return this.bgGradientColor_ != null;
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
