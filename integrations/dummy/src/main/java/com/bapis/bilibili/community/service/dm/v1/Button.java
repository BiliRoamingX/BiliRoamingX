package com.bapis.bilibili.community.service.dm.v1;

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
public final class Button extends GeneratedMessageLite<Button, Button.Builder> implements MessageLiteOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final Button DEFAULT_INSTANCE;
    private static volatile Parser<Button> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int action_;
    private String text_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.Button$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C71871 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17034xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17034xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17034xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17034xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17034xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17034xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17034xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17034xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Button, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71871 c71871) {
            this();
        }

        public Builder clearAction() {
            copyOnWrite();
            ((Button) this.instance).clearAction();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((Button) this.instance).clearText();
            return this;
        }

        public ToastFunctionType getAction() {
            return ((Button) this.instance).getAction();
        }

        public int getActionValue() {
            return ((Button) this.instance).getActionValue();
        }

        public String getText() {
            return ((Button) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((Button) this.instance).getTextBytes();
        }

        public Builder setAction(ToastFunctionType toastFunctionType) {
            copyOnWrite();
            ((Button) this.instance).setAction(toastFunctionType);
            return this;
        }

        public Builder setActionValue(int i) {
            copyOnWrite();
            ((Button) this.instance).setActionValue(i);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((Button) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(Button.DEFAULT_INSTANCE);
        }
    }

    static {
        Button button = new Button();
        DEFAULT_INSTANCE = button;
        GeneratedMessageLite.registerDefaultInstance(Button.class, button);
    }

    private Button() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static Button getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Button parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Button parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Button> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ToastFunctionType toastFunctionType) {
        this.action_ = toastFunctionType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i) {
        this.action_ = i;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71871.f17034xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Button();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\f", new Object[]{"text_", "action_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Button> parser = PARSER;
                if (parser == null) {
                    synchronized (Button.class) {
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

    public ToastFunctionType getAction() {
        ToastFunctionType forNumber = ToastFunctionType.forNumber(this.action_);
        return forNumber == null ? ToastFunctionType.UNRECOGNIZED : forNumber;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static Builder newBuilder(Button button) {
        return DEFAULT_INSTANCE.createBuilder(button);
    }

    public static Button parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Button parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Button parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Button parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Button parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Button parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Button parseFrom(InputStream inputStream) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Button parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Button parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Button parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
