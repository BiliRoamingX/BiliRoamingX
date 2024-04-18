package com.bapis.bilibili.app.playurl.v1;

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
public final class PlayLimit extends GeneratedMessageLite<PlayLimit, PlayLimit.Builder> implements MessageLiteOrBuilder {
    public static final int BUTTON_FIELD_NUMBER = 4;
    public static final int CODE_FIELD_NUMBER = 1;
    private static final PlayLimit DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<PlayLimit> PARSER = null;
    public static final int SUB_MESSAGE_FIELD_NUMBER = 3;
    private ButtonStyle button_;
    private int code_;
    private String message_ = "";
    private String subMessage_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.PlayLimit$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C65011 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16536xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16536xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16536xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16536xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16536xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16536xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16536xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16536xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayLimit, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C65011 c65011) {
            this();
        }

        public Builder clearButton() {
            copyOnWrite();
            ((PlayLimit) this.instance).clearButton();
            return this;
        }

        public Builder clearCode() {
            copyOnWrite();
            ((PlayLimit) this.instance).clearCode();
            return this;
        }

        public Builder clearMessage() {
            copyOnWrite();
            ((PlayLimit) this.instance).clearMessage();
            return this;
        }

        public Builder clearSubMessage() {
            copyOnWrite();
            ((PlayLimit) this.instance).clearSubMessage();
            return this;
        }

        public ButtonStyle getButton() {
            return ((PlayLimit) this.instance).getButton();
        }

        public PlayLimitCode getCode() {
            return ((PlayLimit) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((PlayLimit) this.instance).getCodeValue();
        }

        public String getMessage() {
            return ((PlayLimit) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((PlayLimit) this.instance).getMessageBytes();
        }

        public String getSubMessage() {
            return ((PlayLimit) this.instance).getSubMessage();
        }

        public ByteString getSubMessageBytes() {
            return ((PlayLimit) this.instance).getSubMessageBytes();
        }

        public boolean hasButton() {
            return ((PlayLimit) this.instance).hasButton();
        }

        public Builder mergeButton(ButtonStyle buttonStyle) {
            copyOnWrite();
            ((PlayLimit) this.instance).mergeButton(buttonStyle);
            return this;
        }

        public Builder setButton(ButtonStyle buttonStyle) {
            copyOnWrite();
            ((PlayLimit) this.instance).setButton(buttonStyle);
            return this;
        }

        public Builder setCode(PlayLimitCode playLimitCode) {
            copyOnWrite();
            ((PlayLimit) this.instance).setCode(playLimitCode);
            return this;
        }

        public Builder setCodeValue(int i) {
            copyOnWrite();
            ((PlayLimit) this.instance).setCodeValue(i);
            return this;
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((PlayLimit) this.instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayLimit) this.instance).setMessageBytes(byteString);
            return this;
        }

        public Builder setSubMessage(String str) {
            copyOnWrite();
            ((PlayLimit) this.instance).setSubMessage(str);
            return this;
        }

        public Builder setSubMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayLimit) this.instance).setSubMessageBytes(byteString);
            return this;
        }

        private Builder() {
            super(PlayLimit.DEFAULT_INSTANCE);
        }

        public Builder setButton(ButtonStyle.Builder builder) {
            copyOnWrite();
            ((PlayLimit) this.instance).setButton(builder.build());
            return this;
        }
    }

    static {
        PlayLimit playLimit = new PlayLimit();
        DEFAULT_INSTANCE = playLimit;
        GeneratedMessageLite.registerDefaultInstance(PlayLimit.class, playLimit);
    }

    private PlayLimit() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubMessage() {
        this.subMessage_ = getDefaultInstance().getSubMessage();
    }

    public static PlayLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButton(ButtonStyle buttonStyle) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayLimit> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(ButtonStyle buttonStyle) {
        buttonStyle.getClass();
        this.button_ = buttonStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(PlayLimitCode playLimitCode) {
        this.code_ = playLimitCode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeValue(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubMessage(String str) {
        str.getClass();
        this.subMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subMessage_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65011.f16536xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayLimit();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003\u0208\u0004\t", new Object[]{"code_", "message_", "subMessage_", "button_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayLimit> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayLimit.class) {
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

    public ButtonStyle getButton() {
        ButtonStyle buttonStyle = this.button_;
        return buttonStyle == null ? ButtonStyle.getDefaultInstance() : buttonStyle;
    }

    public PlayLimitCode getCode() {
        PlayLimitCode forNumber = PlayLimitCode.forNumber(this.code_);
        return forNumber == null ? PlayLimitCode.UNRECOGNIZED : forNumber;
    }

    public int getCodeValue() {
        return this.code_;
    }

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    public String getSubMessage() {
        return this.subMessage_;
    }

    public ByteString getSubMessageBytes() {
        return ByteString.copyFromUtf8(this.subMessage_);
    }

    public boolean hasButton() {
        return this.button_ != null;
    }

    public static Builder newBuilder(PlayLimit playLimit) {
        return DEFAULT_INSTANCE.createBuilder(playLimit);
    }

    public static PlayLimit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayLimit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayLimit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayLimit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayLimit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayLimit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayLimit parseFrom(InputStream inputStream) throws IOException {
        return (PlayLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayLimit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayLimit parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayLimit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
