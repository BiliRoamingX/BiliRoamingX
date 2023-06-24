package com.bapis.bilibili.polymer.app.search.v1;

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
/* loaded from: classes15.dex */
public final class ReasonStyle extends GeneratedMessageLite<ReasonStyle, ReasonStyle.Builder> implements ReasonStyleOrBuilder {
    public static final int BG_COLOR_FIELD_NUMBER = 4;
    public static final int BG_COLOR_NIGHT_FIELD_NUMBER = 5;
    public static final int BG_STYLE_FIELD_NUMBER = 8;
    public static final int BORDER_COLOR_FIELD_NUMBER = 6;
    public static final int BORDER_COLOR_NIGHT_FIELD_NUMBER = 7;
    private static final ReasonStyle DEFAULT_INSTANCE;
    private static volatile Parser<ReasonStyle> PARSER = null;
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
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.ReasonStyle$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C79961 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17698xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17698xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17698xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17698xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17698xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17698xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17698xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17698xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ReasonStyle, Builder> implements ReasonStyleOrBuilder {
        /* synthetic */ Builder(C79961 c79961) {
            this();
        }

        public Builder clearBgColor() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearBgColor();
            return this;
        }

        public Builder clearBgColorNight() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearBgColorNight();
            return this;
        }

        public Builder clearBgStyle() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearBgStyle();
            return this;
        }

        public Builder clearBorderColor() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearBorderColor();
            return this;
        }

        public Builder clearBorderColorNight() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearBorderColorNight();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearText();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTextColorNight() {
            copyOnWrite();
            ((ReasonStyle) this.instance).clearTextColorNight();
            return this;
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public String getBgColor() {
            return ((ReasonStyle) this.instance).getBgColor();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public ByteString getBgColorBytes() {
            return ((ReasonStyle) this.instance).getBgColorBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public String getBgColorNight() {
            return ((ReasonStyle) this.instance).getBgColorNight();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public ByteString getBgColorNightBytes() {
            return ((ReasonStyle) this.instance).getBgColorNightBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public int getBgStyle() {
            return ((ReasonStyle) this.instance).getBgStyle();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public String getBorderColor() {
            return ((ReasonStyle) this.instance).getBorderColor();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public ByteString getBorderColorBytes() {
            return ((ReasonStyle) this.instance).getBorderColorBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public String getBorderColorNight() {
            return ((ReasonStyle) this.instance).getBorderColorNight();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public ByteString getBorderColorNightBytes() {
            return ((ReasonStyle) this.instance).getBorderColorNightBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public String getText() {
            return ((ReasonStyle) this.instance).getText();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public ByteString getTextBytes() {
            return ((ReasonStyle) this.instance).getTextBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public String getTextColor() {
            return ((ReasonStyle) this.instance).getTextColor();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public ByteString getTextColorBytes() {
            return ((ReasonStyle) this.instance).getTextColorBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public String getTextColorNight() {
            return ((ReasonStyle) this.instance).getTextColorNight();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
        public ByteString getTextColorNightBytes() {
            return ((ReasonStyle) this.instance).getTextColorNightBytes();
        }

        public Builder setBgColor(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBgColor(str);
            return this;
        }

        public Builder setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public Builder setBgColorNight(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBgColorNight(str);
            return this;
        }

        public Builder setBgColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBgColorNightBytes(byteString);
            return this;
        }

        public Builder setBgStyle(int i) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBgStyle(i);
            return this;
        }

        public Builder setBorderColor(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBorderColor(str);
            return this;
        }

        public Builder setBorderColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBorderColorBytes(byteString);
            return this;
        }

        public Builder setBorderColorNight(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBorderColorNight(str);
            return this;
        }

        public Builder setBorderColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setBorderColorNightBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTextColorNight(String str) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setTextColorNight(str);
            return this;
        }

        public Builder setTextColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ReasonStyle) this.instance).setTextColorNightBytes(byteString);
            return this;
        }

        private Builder() {
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

    public static ReasonStyle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C79961.f17698xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ReasonStyle();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0004", new Object[]{"text_", "textColor_", "textColorNight_", "bgColor_", "bgColorNight_", "borderColor_", "borderColorNight_", "bgStyle_"});
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

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public String getBgColor() {
        return this.bgColor_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public ByteString getBgColorBytes() {
        return ByteString.copyFromUtf8(this.bgColor_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public String getBgColorNight() {
        return this.bgColorNight_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public ByteString getBgColorNightBytes() {
        return ByteString.copyFromUtf8(this.bgColorNight_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public int getBgStyle() {
        return this.bgStyle_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public String getBorderColor() {
        return this.borderColor_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public ByteString getBorderColorBytes() {
        return ByteString.copyFromUtf8(this.borderColor_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public String getBorderColorNight() {
        return this.borderColorNight_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public ByteString getBorderColorNightBytes() {
        return ByteString.copyFromUtf8(this.borderColorNight_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public String getTextColor() {
        return this.textColor_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public String getTextColorNight() {
        return this.textColorNight_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.ReasonStyleOrBuilder
    public ByteString getTextColorNightBytes() {
        return ByteString.copyFromUtf8(this.textColorNight_);
    }

    public static Builder newBuilder(ReasonStyle reasonStyle) {
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
