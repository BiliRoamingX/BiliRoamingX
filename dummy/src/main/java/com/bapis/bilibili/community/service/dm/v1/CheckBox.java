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
public final class CheckBox extends GeneratedMessageLite<CheckBox, CheckBox.Builder> implements MessageLiteOrBuilder {
    private static final CheckBox DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 3;
    private static volatile Parser<CheckBox> PARSER = null;
    public static final int SHOW_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private boolean defaultValue_;
    private boolean show_;
    private String text_ = "";
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.CheckBox$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C71901 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17037xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17037xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17037xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17037xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17037xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17037xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17037xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17037xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CheckBox, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71901 c71901) {
            this();
        }

        public Builder clearDefaultValue() {
            copyOnWrite();
            ((CheckBox) this.instance).clearDefaultValue();
            return this;
        }

        public Builder clearShow() {
            copyOnWrite();
            ((CheckBox) this.instance).clearShow();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((CheckBox) this.instance).clearText();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((CheckBox) this.instance).clearType();
            return this;
        }

        public boolean getDefaultValue() {
            return ((CheckBox) this.instance).getDefaultValue();
        }

        public boolean getShow() {
            return ((CheckBox) this.instance).getShow();
        }

        public String getText() {
            return ((CheckBox) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((CheckBox) this.instance).getTextBytes();
        }

        public CheckboxType getType() {
            return ((CheckBox) this.instance).getType();
        }

        public int getTypeValue() {
            return ((CheckBox) this.instance).getTypeValue();
        }

        public Builder setDefaultValue(boolean z) {
            copyOnWrite();
            ((CheckBox) this.instance).setDefaultValue(z);
            return this;
        }

        public Builder setShow(boolean z) {
            copyOnWrite();
            ((CheckBox) this.instance).setShow(z);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((CheckBox) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((CheckBox) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setType(CheckboxType checkboxType) {
            copyOnWrite();
            ((CheckBox) this.instance).setType(checkboxType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((CheckBox) this.instance).setTypeValue(i);
            return this;
        }

        private Builder() {
            super(CheckBox.DEFAULT_INSTANCE);
        }
    }

    static {
        CheckBox checkBox = new CheckBox();
        DEFAULT_INSTANCE = checkBox;
        GeneratedMessageLite.registerDefaultInstance(CheckBox.class, checkBox);
    }

    private CheckBox() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShow() {
        this.show_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static CheckBox getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CheckBox parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CheckBox) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CheckBox parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CheckBox) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CheckBox> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(boolean z) {
        this.defaultValue_ = z;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(CheckboxType checkboxType) {
        this.type_ = checkboxType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71901.f17037xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CheckBox();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u0007\u0004\u0007", new Object[]{"text_", "type_", "defaultValue_", "show_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CheckBox> parser = PARSER;
                if (parser == null) {
                    synchronized (CheckBox.class) {
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

    public boolean getDefaultValue() {
        return this.defaultValue_;
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

    public CheckboxType getType() {
        CheckboxType forNumber = CheckboxType.forNumber(this.type_);
        return forNumber == null ? CheckboxType.UNRECOGNIZED : forNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(CheckBox checkBox) {
        return DEFAULT_INSTANCE.createBuilder(checkBox);
    }

    public static CheckBox parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CheckBox) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CheckBox parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CheckBox) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CheckBox parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CheckBox) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CheckBox parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CheckBox) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CheckBox parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CheckBox) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CheckBox parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CheckBox) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CheckBox parseFrom(InputStream inputStream) throws IOException {
        return (CheckBox) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CheckBox parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CheckBox) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CheckBox parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CheckBox) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CheckBox parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CheckBox) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
