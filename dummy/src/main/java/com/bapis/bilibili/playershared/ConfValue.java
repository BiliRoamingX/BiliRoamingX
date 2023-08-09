package com.bapis.bilibili.playershared;

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
/* loaded from: classes18.dex */
public final class ConfValue extends GeneratedMessageLite<ConfValue, ConfValue.Builder> implements MessageLiteOrBuilder {
    private static final ConfValue DEFAULT_INSTANCE;
    private static volatile Parser<ConfValue> PARSER = null;
    public static final int SELECTED_VAL_FIELD_NUMBER = 2;
    public static final int SWITCH_VAL_FIELD_NUMBER = 1;
    private int valueCase_ = 0;
    private Object value_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.ConfValue$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17892xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17892xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17892xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17892xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17892xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17892xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17892xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17892xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ConfValue, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81661 c81661) {
            this();
        }

        public Builder clearSelectedVal() {
            copyOnWrite();
            ((ConfValue) this.instance).clearSelectedVal();
            return this;
        }

        public Builder clearSwitchVal() {
            copyOnWrite();
            ((ConfValue) this.instance).clearSwitchVal();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((ConfValue) this.instance).clearValue();
            return this;
        }

        public long getSelectedVal() {
            return ((ConfValue) this.instance).getSelectedVal();
        }

        public boolean getSwitchVal() {
            return ((ConfValue) this.instance).getSwitchVal();
        }

        public ValueCase getValueCase() {
            return ((ConfValue) this.instance).getValueCase();
        }

        public boolean hasSelectedVal() {
            return ((ConfValue) this.instance).hasSelectedVal();
        }

        public boolean hasSwitchVal() {
            return ((ConfValue) this.instance).hasSwitchVal();
        }

        public Builder setSelectedVal(long j) {
            copyOnWrite();
            ((ConfValue) this.instance).setSelectedVal(j);
            return this;
        }

        public Builder setSwitchVal(boolean z) {
            copyOnWrite();
            ((ConfValue) this.instance).setSwitchVal(z);
            return this;
        }

        private Builder() {
            super(ConfValue.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public enum ValueCase {
        SWITCH_VAL(1),
        SELECTED_VAL(2),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i) {
            this.value = i;
        }

        public static ValueCase forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return SELECTED_VAL;
                }
                return SWITCH_VAL;
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
        ConfValue confValue = new ConfValue();
        DEFAULT_INSTANCE = confValue;
        GeneratedMessageLite.registerDefaultInstance(ConfValue.class, confValue);
    }

    private ConfValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedVal() {
        if (this.valueCase_ == 2) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitchVal() {
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

    public static ConfValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ConfValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConfValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ConfValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ConfValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedVal(long j) {
        this.valueCase_ = 2;
        this.value_ = Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchVal(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81661.f17892xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ConfValue();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u00025\u0000", new Object[]{"value_", "valueCase_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ConfValue> parser = PARSER;
                if (parser == null) {
                    synchronized (ConfValue.class) {
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

    public long getSelectedVal() {
        if (this.valueCase_ == 2) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public boolean getSwitchVal() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public ValueCase getValueCase() {
        return ValueCase.forNumber(this.valueCase_);
    }

    public boolean hasSelectedVal() {
        return this.valueCase_ == 2;
    }

    public boolean hasSwitchVal() {
        return this.valueCase_ == 1;
    }

    public static Builder newBuilder(ConfValue confValue) {
        return DEFAULT_INSTANCE.createBuilder(confValue);
    }

    public static ConfValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConfValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ConfValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ConfValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ConfValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ConfValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ConfValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConfValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ConfValue parseFrom(InputStream inputStream) throws IOException {
        return (ConfValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConfValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ConfValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ConfValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * setSwitchVal
     */
    static void access$200(ConfValue confValue, boolean val) {
    }
}
