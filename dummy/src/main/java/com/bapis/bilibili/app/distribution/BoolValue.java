package com.bapis.bilibili.app.distribution;

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
public final class BoolValue extends GeneratedMessageLite<BoolValue, BoolValue.C8307b> implements MessageLiteOrBuilder {
    private static final BoolValue DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 3;
    public static final int EXP_FIELD_NUMBER = 4;
    public static final int LAST_MODIFIED_FIELD_NUMBER = 2;
    private static volatile Parser<BoolValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean defaultValue_;
    private String exp_ = "";
    private long lastModified_;
    private boolean value_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.BoolValue$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8306a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19914xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19914xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19914xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19914xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19914xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19914xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19914xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19914xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.BoolValue$b */
    /* loaded from: classes13.dex */
    public static final class C8307b extends GeneratedMessageLite.Builder<BoolValue, C8307b> implements MessageLiteOrBuilder {
        /* synthetic */ C8307b(C8306a c8306a) {
            this();
        }

        public C8307b clearDefaultValue() {
            copyOnWrite();
            ((BoolValue) this.instance).clearDefaultValue();
            return this;
        }

        public C8307b clearExp() {
            copyOnWrite();
            ((BoolValue) this.instance).clearExp();
            return this;
        }

        public C8307b clearLastModified() {
            copyOnWrite();
            ((BoolValue) this.instance).clearLastModified();
            return this;
        }

        public C8307b clearValue() {
            copyOnWrite();
            ((BoolValue) this.instance).clearValue();
            return this;
        }

        public boolean getDefaultValue() {
            return ((BoolValue) this.instance).getDefaultValue();
        }

        public String getExp() {
            return ((BoolValue) this.instance).getExp();
        }

        public ByteString getExpBytes() {
            return ((BoolValue) this.instance).getExpBytes();
        }

        public long getLastModified() {
            return ((BoolValue) this.instance).getLastModified();
        }

        public boolean getValue() {
            return ((BoolValue) this.instance).getValue();
        }

        public C8307b setDefaultValue(boolean z) {
            copyOnWrite();
            ((BoolValue) this.instance).setDefaultValue(z);
            return this;
        }

        public C8307b setExp(String str) {
            copyOnWrite();
            ((BoolValue) this.instance).setExp(str);
            return this;
        }

        public C8307b setExpBytes(ByteString byteString) {
            copyOnWrite();
            ((BoolValue) this.instance).setExpBytes(byteString);
            return this;
        }

        public C8307b setLastModified(long j) {
            copyOnWrite();
            ((BoolValue) this.instance).setLastModified(j);
            return this;
        }

        public C8307b setValue(boolean z) {
            copyOnWrite();
            ((BoolValue) this.instance).setValue(z);
            return this;
        }

        private C8307b() {
            super(BoolValue.DEFAULT_INSTANCE);
        }
    }

    static {
        BoolValue boolValue = new BoolValue();
        DEFAULT_INSTANCE = boolValue;
        GeneratedMessageLite.registerDefaultInstance(BoolValue.class, boolValue);
    }

    private BoolValue() {
    }

    public void clearDefaultValue() {
        this.defaultValue_ = false;
    }

    public void clearExp() {
        this.exp_ = getDefaultInstance().getExp();
    }

    public void clearLastModified() {
        this.lastModified_ = 0L;
    }

    public void clearValue() {
        this.value_ = false;
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8307b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BoolValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setDefaultValue(boolean z) {
        this.defaultValue_ = z;
    }

    public void setExp(String str) {
        str.getClass();
        this.exp_ = str;
    }

    public void setExpBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.exp_ = byteString.toStringUtf8();
    }

    public void setLastModified(long j) {
        this.lastModified_ = j;
    }

    public void setValue(boolean z) {
        this.value_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8306a.f19914xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BoolValue();
            case 2:
                return new C8307b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0003\u0007\u0004\u0208", new Object[]{"value_", "lastModified_", "defaultValue_", "exp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BoolValue> parser = PARSER;
                if (parser == null) {
                    synchronized (BoolValue.class) {
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

    public String getExp() {
        return this.exp_;
    }

    public ByteString getExpBytes() {
        return ByteString.copyFromUtf8(this.exp_);
    }

    public long getLastModified() {
        return this.lastModified_;
    }

    public boolean getValue() {
        return this.value_;
    }

    public static C8307b newBuilder(BoolValue boolValue) {
        return DEFAULT_INSTANCE.createBuilder(boolValue);
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BoolValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BoolValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BoolValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BoolValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BoolValue parseFrom(InputStream inputStream) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BoolValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BoolValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
