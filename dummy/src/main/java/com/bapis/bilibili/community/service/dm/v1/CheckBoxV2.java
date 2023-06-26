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
public final class CheckBoxV2 extends GeneratedMessageLite<CheckBoxV2, CheckBoxV2.Builder> implements MessageLiteOrBuilder {
    private static final CheckBoxV2 DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 3;
    private static volatile Parser<CheckBoxV2> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private boolean defaultValue_;
    private String text_ = "";
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.CheckBoxV2$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C71911 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17038xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17038xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17038xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17038xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17038xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17038xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17038xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17038xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CheckBoxV2, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71911 c71911) {
            this();
        }

        public Builder clearDefaultValue() {
            copyOnWrite();
            ((CheckBoxV2) this.instance).clearDefaultValue();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((CheckBoxV2) this.instance).clearText();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((CheckBoxV2) this.instance).clearType();
            return this;
        }

        public boolean getDefaultValue() {
            return ((CheckBoxV2) this.instance).getDefaultValue();
        }

        public String getText() {
            return ((CheckBoxV2) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((CheckBoxV2) this.instance).getTextBytes();
        }

        public CheckboxType getType() {
            return ((CheckBoxV2) this.instance).getType();
        }

        public int getTypeValue() {
            return ((CheckBoxV2) this.instance).getTypeValue();
        }

        public Builder setDefaultValue(boolean z) {
            copyOnWrite();
            ((CheckBoxV2) this.instance).setDefaultValue(z);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((CheckBoxV2) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((CheckBoxV2) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setType(CheckboxType checkboxType) {
            copyOnWrite();
            ((CheckBoxV2) this.instance).setType(checkboxType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((CheckBoxV2) this.instance).setTypeValue(i);
            return this;
        }

        private Builder() {
            super(CheckBoxV2.DEFAULT_INSTANCE);
        }
    }

    static {
        CheckBoxV2 checkBoxV2 = new CheckBoxV2();
        DEFAULT_INSTANCE = checkBoxV2;
        GeneratedMessageLite.registerDefaultInstance(CheckBoxV2.class, checkBoxV2);
    }

    private CheckBoxV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static CheckBoxV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CheckBoxV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CheckBoxV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CheckBoxV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CheckBoxV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CheckBoxV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(boolean z) {
        this.defaultValue_ = z;
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
        switch (C71911.f17038xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CheckBoxV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u0007", new Object[]{"text_", "type_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CheckBoxV2> parser = PARSER;
                if (parser == null) {
                    synchronized (CheckBoxV2.class) {
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

    public static Builder newBuilder(CheckBoxV2 checkBoxV2) {
        return DEFAULT_INSTANCE.createBuilder(checkBoxV2);
    }

    public static CheckBoxV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CheckBoxV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CheckBoxV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CheckBoxV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CheckBoxV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CheckBoxV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CheckBoxV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CheckBoxV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CheckBoxV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CheckBoxV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CheckBoxV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CheckBoxV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CheckBoxV2 parseFrom(InputStream inputStream) throws IOException {
        return (CheckBoxV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CheckBoxV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CheckBoxV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CheckBoxV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CheckBoxV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CheckBoxV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CheckBoxV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
