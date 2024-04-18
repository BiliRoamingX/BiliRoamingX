package com.bapis.bilibili.app.playurl.v1;

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
public final class FieldValue extends GeneratedMessageLite<FieldValue, FieldValue.Builder> implements MessageLiteOrBuilder {
    private static final FieldValue DEFAULT_INSTANCE;
    private static volatile Parser<FieldValue> PARSER = null;
    public static final int SWITCH_FIELD_NUMBER = 1;
    private int valueCase_ = 0;
    private Object value_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.FieldValue$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C64881 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16522xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16522xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16522xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16522xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16522xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16522xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16522xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16522xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<FieldValue, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C64881 c64881) {
            this();
        }

        public Builder clearSwitch() {
            copyOnWrite();
            ((FieldValue) this.instance).clearSwitch();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((FieldValue) this.instance).clearValue();
            return this;
        }

        public boolean getSwitch() {
            return ((FieldValue) this.instance).getSwitch();
        }

        public ValueCase getValueCase() {
            return ((FieldValue) this.instance).getValueCase();
        }

        public boolean hasSwitch() {
            return ((FieldValue) this.instance).hasSwitch();
        }

        public Builder setSwitch(boolean z) {
            copyOnWrite();
            ((FieldValue) this.instance).setSwitch(z);
            return this;
        }

        private Builder() {
            super(FieldValue.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public enum ValueCase {
        SWITCH(1),
        VALUE_NOT_SET(0);
        
        private final int value;

        ValueCase(int i) {
            this.value = i;
        }

        public static ValueCase forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return SWITCH;
            }
            return VALUE_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ValueCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        FieldValue fieldValue = new FieldValue();
        DEFAULT_INSTANCE = fieldValue;
        GeneratedMessageLite.registerDefaultInstance(FieldValue.class, fieldValue);
    }

    private FieldValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitch() {
        if (this.valueCase_ == 1) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    public static FieldValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FieldValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FieldValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FieldValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FieldValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitch(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C64881.f16522xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FieldValue();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001:\u0000", new Object[]{"value_", "valueCase_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FieldValue> parser = PARSER;
                if (parser == null) {
                    synchronized (FieldValue.class) {
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

    public boolean getSwitch() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public ValueCase getValueCase() {
        return ValueCase.forNumber(this.valueCase_);
    }

    public boolean hasSwitch() {
        return this.valueCase_ == 1;
    }

    public static Builder newBuilder(FieldValue fieldValue) {
        return DEFAULT_INSTANCE.createBuilder(fieldValue);
    }

    public static FieldValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FieldValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FieldValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FieldValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FieldValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FieldValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FieldValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FieldValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FieldValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FieldValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FieldValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FieldValue parseFrom(InputStream inputStream) throws IOException {
        return (FieldValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FieldValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FieldValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FieldValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
