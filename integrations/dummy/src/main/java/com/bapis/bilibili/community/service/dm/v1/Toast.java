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
public final class Toast extends GeneratedMessageLite<Toast, Toast.Builder> implements MessageLiteOrBuilder {
    public static final int BUTTON_FIELD_NUMBER = 4;
    private static final Toast DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    private static volatile Parser<Toast> PARSER = null;
    public static final int SHOW_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private Button button_;
    private int duration_;
    private boolean show_;
    private String text_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.Toast$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72671 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17101xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17101xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17101xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17101xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17101xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17101xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17101xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17101xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Toast, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72671 c72671) {
            this();
        }

        public Builder clearButton() {
            copyOnWrite();
            ((Toast) this.instance).clearButton();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((Toast) this.instance).clearDuration();
            return this;
        }

        public Builder clearShow() {
            copyOnWrite();
            ((Toast) this.instance).clearShow();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((Toast) this.instance).clearText();
            return this;
        }

        public Button getButton() {
            return ((Toast) this.instance).getButton();
        }

        public int getDuration() {
            return ((Toast) this.instance).getDuration();
        }

        public boolean getShow() {
            return ((Toast) this.instance).getShow();
        }

        public String getText() {
            return ((Toast) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((Toast) this.instance).getTextBytes();
        }

        public boolean hasButton() {
            return ((Toast) this.instance).hasButton();
        }

        public Builder mergeButton(Button button) {
            copyOnWrite();
            ((Toast) this.instance).mergeButton(button);
            return this;
        }

        public Builder setButton(Button button) {
            copyOnWrite();
            ((Toast) this.instance).setButton(button);
            return this;
        }

        public Builder setDuration(int i) {
            copyOnWrite();
            ((Toast) this.instance).setDuration(i);
            return this;
        }

        public Builder setShow(boolean z) {
            copyOnWrite();
            ((Toast) this.instance).setShow(z);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((Toast) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Toast) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(Toast.DEFAULT_INSTANCE);
        }

        public Builder setButton(Button.Builder builder) {
            copyOnWrite();
            ((Toast) this.instance).setButton(builder.build());
            return this;
        }
    }

    static {
        Toast toast = new Toast();
        DEFAULT_INSTANCE = toast;
        GeneratedMessageLite.registerDefaultInstance(Toast.class, toast);
    }

    private Toast() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShow() {
        this.show_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static Toast getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButton(Button button) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Toast parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Toast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Toast parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Toast> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(Button button) {
        button.getClass();
        this.button_ = button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i) {
        this.duration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShow(boolean z) {
        this.show_ = z;
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
        switch (C72671.f17101xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Toast();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0007\u0004\t", new Object[]{"text_", "duration_", "show_", "button_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Toast> parser = PARSER;
                if (parser == null) {
                    synchronized (Toast.class) {
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

    public Button getButton() {
        Button button = this.button_;
        return button == null ? Button.getDefaultInstance() : button;
    }

    public int getDuration() {
        return this.duration_;
    }

    public boolean getShow() {
        return this.show_;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public boolean hasButton() {
        return this.button_ != null;
    }

    public static Builder newBuilder(Toast toast) {
        return DEFAULT_INSTANCE.createBuilder(toast);
    }

    public static Toast parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Toast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Toast parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Toast parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Toast parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Toast parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Toast parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Toast parseFrom(InputStream inputStream) throws IOException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Toast parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Toast parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Toast parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
