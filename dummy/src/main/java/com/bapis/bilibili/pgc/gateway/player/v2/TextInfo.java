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
public final class TextInfo extends GeneratedMessageLite<TextInfo, TextInfo.Builder> implements MessageLiteOrBuilder {
    private static final TextInfo DEFAULT_INSTANCE;
    private static volatile Parser<TextInfo> PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_COLOR_NIGHT_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = "";
    private String textColor_ = "";
    private String textColorNight_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.TextInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78901 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17603xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17603xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17603xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17603xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17603xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17603xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17603xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17603xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TextInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78901 c78901) {
            this();
        }

        public Builder clearText() {
            copyOnWrite();
            ((TextInfo) this.instance).clearText();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((TextInfo) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTextColorNight() {
            copyOnWrite();
            ((TextInfo) this.instance).clearTextColorNight();
            return this;
        }

        public String getText() {
            return ((TextInfo) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((TextInfo) this.instance).getTextBytes();
        }

        public String getTextColor() {
            return ((TextInfo) this.instance).getTextColor();
        }

        public ByteString getTextColorBytes() {
            return ((TextInfo) this.instance).getTextColorBytes();
        }

        public String getTextColorNight() {
            return ((TextInfo) this.instance).getTextColorNight();
        }

        public ByteString getTextColorNightBytes() {
            return ((TextInfo) this.instance).getTextColorNightBytes();
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((TextInfo) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((TextInfo) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((TextInfo) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((TextInfo) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTextColorNight(String str) {
            copyOnWrite();
            ((TextInfo) this.instance).setTextColorNight(str);
            return this;
        }

        public Builder setTextColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((TextInfo) this.instance).setTextColorNightBytes(byteString);
            return this;
        }

        private Builder() {
            super(TextInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        TextInfo textInfo = new TextInfo();
        DEFAULT_INSTANCE = textInfo;
        GeneratedMessageLite.registerDefaultInstance(TextInfo.class, textInfo);
    }

    public TextInfo() {
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

    public static TextInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TextInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TextInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TextInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
        switch (C78901.f17603xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TextInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"text_", "textColor_", "textColorNight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TextInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (TextInfo.class) {
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

    public static Builder newBuilder(TextInfo textInfo) {
        return DEFAULT_INSTANCE.createBuilder(textInfo);
    }

    public static TextInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TextInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TextInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TextInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TextInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TextInfo parseFrom(InputStream inputStream) throws IOException {
        return (TextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TextInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
