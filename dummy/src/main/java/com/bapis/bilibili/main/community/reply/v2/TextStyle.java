package com.bapis.bilibili.main.community.reply.v2;

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

/* compiled from: BL */
/* loaded from: classes18.dex */
public final class TextStyle extends GeneratedMessageLite<TextStyle, TextStyle.Builder> implements MessageLiteOrBuilder {
    private static final TextStyle DEFAULT_INSTANCE;
    public static final int FONT_SIZE_FIELD_NUMBER = 1;
    public static final int FONT_STYLE_FIELD_NUMBER = 2;
    private static volatile Parser<TextStyle> PARSER = null;
    public static final int TEXT_DAY_COLOR_FIELD_NUMBER = 3;
    public static final int TEXT_NIGHT_COLOR_FIELD_NUMBER = 4;
    private int fontSize_;
    private int fontStyle_;
    private String textDayColor_ = "";
    private String textNightColor_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v2.TextStyle$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C80051 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17765xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17765xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17765xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17765xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17765xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17765xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17765xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17765xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TextStyle, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C80051 c80051) {
            this();
        }

        public Builder clearFontSize() {
            copyOnWrite();
            ((TextStyle) this.instance).clearFontSize();
            return this;
        }

        public Builder clearFontStyle() {
            copyOnWrite();
            ((TextStyle) this.instance).clearFontStyle();
            return this;
        }

        public Builder clearTextDayColor() {
            copyOnWrite();
            ((TextStyle) this.instance).clearTextDayColor();
            return this;
        }

        public Builder clearTextNightColor() {
            copyOnWrite();
            ((TextStyle) this.instance).clearTextNightColor();
            return this;
        }

        public int getFontSize() {
            return ((TextStyle) this.instance).getFontSize();
        }

        public FontStyle getFontStyle() {
            return ((TextStyle) this.instance).getFontStyle();
        }

        public int getFontStyleValue() {
            return ((TextStyle) this.instance).getFontStyleValue();
        }

        public String getTextDayColor() {
            return ((TextStyle) this.instance).getTextDayColor();
        }

        public ByteString getTextDayColorBytes() {
            return ((TextStyle) this.instance).getTextDayColorBytes();
        }

        public String getTextNightColor() {
            return ((TextStyle) this.instance).getTextNightColor();
        }

        public ByteString getTextNightColorBytes() {
            return ((TextStyle) this.instance).getTextNightColorBytes();
        }

        public Builder setFontSize(int i) {
            copyOnWrite();
            ((TextStyle) this.instance).setFontSize(i);
            return this;
        }

        public Builder setFontStyle(FontStyle fontStyle) {
            copyOnWrite();
            ((TextStyle) this.instance).setFontStyle(fontStyle);
            return this;
        }

        public Builder setFontStyleValue(int i) {
            copyOnWrite();
            ((TextStyle) this.instance).setFontStyleValue(i);
            return this;
        }

        public Builder setTextDayColor(String str) {
            copyOnWrite();
            ((TextStyle) this.instance).setTextDayColor(str);
            return this;
        }

        public Builder setTextDayColorBytes(ByteString byteString) {
            copyOnWrite();
            ((TextStyle) this.instance).setTextDayColorBytes(byteString);
            return this;
        }

        public Builder setTextNightColor(String str) {
            copyOnWrite();
            ((TextStyle) this.instance).setTextNightColor(str);
            return this;
        }

        public Builder setTextNightColorBytes(ByteString byteString) {
            copyOnWrite();
            ((TextStyle) this.instance).setTextNightColorBytes(byteString);
            return this;
        }

        private Builder() {
            super(TextStyle.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public enum FontStyle implements Internal.EnumLite {
        NORMAL(0),
        BOLD(1),
        UNRECOGNIZED(-1);
        
        public static final int BOLD_VALUE = 1;
        public static final int NORMAL_VALUE = 0;
        private static final Internal.EnumLiteMap<FontStyle> internalValueMap = new Internal.EnumLiteMap<FontStyle>() { // from class: com.bapis.bilibili.main.community.reply.v2.TextStyle.FontStyle.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public FontStyle findValueByNumber(int i) {
                return FontStyle.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes18.dex */
        private static final class FontStyleVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new FontStyleVerifier();

            private FontStyleVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return FontStyle.forNumber(i) != null;
            }
        }

        FontStyle(int i) {
            this.value = i;
        }

        public static FontStyle forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return BOLD;
            }
            return NORMAL;
        }

        public static Internal.EnumLiteMap<FontStyle> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return FontStyleVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static FontStyle valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        TextStyle textStyle = new TextStyle();
        DEFAULT_INSTANCE = textStyle;
        GeneratedMessageLite.registerDefaultInstance(TextStyle.class, textStyle);
    }

    private TextStyle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFontSize() {
        this.fontSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFontStyle() {
        this.fontStyle_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextDayColor() {
        this.textDayColor_ = getDefaultInstance().getTextDayColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextNightColor() {
        this.textNightColor_ = getDefaultInstance().getTextNightColor();
    }

    public static TextStyle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TextStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TextStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextStyle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TextStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TextStyle> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontSize(int i) {
        this.fontSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontStyle(FontStyle fontStyle) {
        this.fontStyle_ = fontStyle.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontStyleValue(int i) {
        this.fontStyle_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextDayColor(String str) {
        str.getClass();
        this.textDayColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextDayColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textDayColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextNightColor(String str) {
        str.getClass();
        this.textNightColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextNightColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textNightColor_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C80051.f17765xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TextStyle();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003\u0208\u0004\u0208", new Object[]{"fontSize_", "fontStyle_", "textDayColor_", "textNightColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TextStyle> parser = PARSER;
                if (parser == null) {
                    synchronized (TextStyle.class) {
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

    public int getFontSize() {
        return this.fontSize_;
    }

    public FontStyle getFontStyle() {
        FontStyle forNumber = FontStyle.forNumber(this.fontStyle_);
        return forNumber == null ? FontStyle.UNRECOGNIZED : forNumber;
    }

    public int getFontStyleValue() {
        return this.fontStyle_;
    }

    public String getTextDayColor() {
        return this.textDayColor_;
    }

    public ByteString getTextDayColorBytes() {
        return ByteString.copyFromUtf8(this.textDayColor_);
    }

    public String getTextNightColor() {
        return this.textNightColor_;
    }

    public ByteString getTextNightColorBytes() {
        return ByteString.copyFromUtf8(this.textNightColor_);
    }

    public static Builder newBuilder(TextStyle textStyle) {
        return DEFAULT_INSTANCE.createBuilder(textStyle);
    }

    public static TextStyle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextStyle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TextStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TextStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TextStyle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TextStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TextStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TextStyle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TextStyle parseFrom(InputStream inputStream) throws IOException {
        return (TextStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextStyle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextStyle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TextStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TextStyle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
