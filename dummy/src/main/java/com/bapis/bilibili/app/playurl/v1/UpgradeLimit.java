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
public final class UpgradeLimit extends GeneratedMessageLite<UpgradeLimit, UpgradeLimit.Builder> implements MessageLiteOrBuilder {
    public static final int BUTTON_FIELD_NUMBER = 4;
    public static final int CODE_FIELD_NUMBER = 1;
    private static final UpgradeLimit DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<UpgradeLimit> PARSER;
    private UpgradeButton button_;
    private int code_;
    private String message_ = "";
    private String image_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.UpgradeLimit$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C65221 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16552xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16552xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16552xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16552xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16552xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16552xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16552xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16552xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UpgradeLimit, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C65221 c65221) {
            this();
        }

        public Builder clearButton() {
            copyOnWrite();
            ((UpgradeLimit) this.instance).clearButton();
            return this;
        }

        public Builder clearCode() {
            copyOnWrite();
            ((UpgradeLimit) this.instance).clearCode();
            return this;
        }

        public Builder clearImage() {
            copyOnWrite();
            ((UpgradeLimit) this.instance).clearImage();
            return this;
        }

        public Builder clearMessage() {
            copyOnWrite();
            ((UpgradeLimit) this.instance).clearMessage();
            return this;
        }

        public UpgradeButton getButton() {
            return ((UpgradeLimit) this.instance).getButton();
        }

        public int getCode() {
            return ((UpgradeLimit) this.instance).getCode();
        }

        public String getImage() {
            return ((UpgradeLimit) this.instance).getImage();
        }

        public ByteString getImageBytes() {
            return ((UpgradeLimit) this.instance).getImageBytes();
        }

        public String getMessage() {
            return ((UpgradeLimit) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((UpgradeLimit) this.instance).getMessageBytes();
        }

        public boolean hasButton() {
            return ((UpgradeLimit) this.instance).hasButton();
        }

        public Builder mergeButton(UpgradeButton upgradeButton) {
            copyOnWrite();
            ((UpgradeLimit) this.instance).mergeButton(upgradeButton);
            return this;
        }

        public Builder setButton(UpgradeButton upgradeButton) {
            copyOnWrite();
            ((UpgradeLimit) this.instance).setButton(upgradeButton);
            return this;
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((UpgradeLimit) this.instance).setCode(i);
            return this;
        }

        public Builder setImage(String str) {
            copyOnWrite();
            ((UpgradeLimit) this.instance).setImage(str);
            return this;
        }

        public Builder setImageBytes(ByteString byteString) {
            copyOnWrite();
            ((UpgradeLimit) this.instance).setImageBytes(byteString);
            return this;
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((UpgradeLimit) this.instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((UpgradeLimit) this.instance).setMessageBytes(byteString);
            return this;
        }

        private Builder() {
            super(UpgradeLimit.DEFAULT_INSTANCE);
        }

        public Builder setButton(UpgradeButton.Builder builder) {
            copyOnWrite();
            ((UpgradeLimit) this.instance).setButton(builder.build());
            return this;
        }
    }

    static {
        UpgradeLimit upgradeLimit = new UpgradeLimit();
        DEFAULT_INSTANCE = upgradeLimit;
        GeneratedMessageLite.registerDefaultInstance(UpgradeLimit.class, upgradeLimit);
    }

    private UpgradeLimit() {
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
    public void clearImage() {
        this.image_ = getDefaultInstance().getImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    public static UpgradeLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButton(UpgradeButton upgradeButton) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UpgradeLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UpgradeLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpgradeLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UpgradeLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UpgradeLimit> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(UpgradeButton upgradeButton) {
        upgradeButton.getClass();
        this.button_ = upgradeButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImage(String str) {
        str.getClass();
        this.image_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.image_ = byteString.toStringUtf8();
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65221.f16552xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UpgradeLimit();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0208\u0004\t", new Object[]{"code_", "message_", "image_", "button_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UpgradeLimit> parser = PARSER;
                if (parser == null) {
                    synchronized (UpgradeLimit.class) {
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

    public UpgradeButton getButton() {
        UpgradeButton upgradeButton = this.button_;
        return upgradeButton == null ? UpgradeButton.getDefaultInstance() : upgradeButton;
    }

    public int getCode() {
        return this.code_;
    }

    public String getImage() {
        return this.image_;
    }

    public ByteString getImageBytes() {
        return ByteString.copyFromUtf8(this.image_);
    }

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    public boolean hasButton() {
        return this.button_ != null;
    }

    public static Builder newBuilder(UpgradeLimit upgradeLimit) {
        return DEFAULT_INSTANCE.createBuilder(upgradeLimit);
    }

    public static UpgradeLimit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpgradeLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpgradeLimit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpgradeLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UpgradeLimit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UpgradeLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UpgradeLimit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpgradeLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UpgradeLimit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UpgradeLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UpgradeLimit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpgradeLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UpgradeLimit parseFrom(InputStream inputStream) throws IOException {
        return (UpgradeLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpgradeLimit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpgradeLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpgradeLimit parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UpgradeLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UpgradeLimit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpgradeLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
