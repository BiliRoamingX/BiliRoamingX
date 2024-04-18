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
public final class StringValue extends GeneratedMessageLite<StringValue, StringValue.C8329b> implements MessageLiteOrBuilder {
    private static final StringValue DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 3;
    public static final int EXP_FIELD_NUMBER = 4;
    public static final int LAST_MODIFIED_FIELD_NUMBER = 2;
    private static volatile Parser<StringValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long lastModified_;
    private String value_ = "";
    private String defaultValue_ = "";
    private String exp_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.StringValue$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8328a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19924xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19924xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19924xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19924xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19924xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19924xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19924xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19924xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.StringValue$b */
    /* loaded from: classes13.dex */
    public static final class C8329b extends GeneratedMessageLite.Builder<StringValue, C8329b> implements MessageLiteOrBuilder {
        /* synthetic */ C8329b(C8328a c8328a) {
            this();
        }

        public C8329b clearDefaultValue() {
            copyOnWrite();
            ((StringValue) this.instance).clearDefaultValue();
            return this;
        }

        public C8329b clearExp() {
            copyOnWrite();
            ((StringValue) this.instance).clearExp();
            return this;
        }

        public C8329b clearLastModified() {
            copyOnWrite();
            ((StringValue) this.instance).clearLastModified();
            return this;
        }

        public C8329b clearValue() {
            copyOnWrite();
            ((StringValue) this.instance).clearValue();
            return this;
        }

        public String getDefaultValue() {
            return ((StringValue) this.instance).getDefaultValue();
        }

        public ByteString getDefaultValueBytes() {
            return ((StringValue) this.instance).getDefaultValueBytes();
        }

        public String getExp() {
            return ((StringValue) this.instance).getExp();
        }

        public ByteString getExpBytes() {
            return ((StringValue) this.instance).getExpBytes();
        }

        public long getLastModified() {
            return ((StringValue) this.instance).getLastModified();
        }

        public String getValue() {
            return ((StringValue) this.instance).getValue();
        }

        public ByteString getValueBytes() {
            return ((StringValue) this.instance).getValueBytes();
        }

        public C8329b setDefaultValue(String str) {
            copyOnWrite();
            ((StringValue) this.instance).setDefaultValue(str);
            return this;
        }

        public C8329b setDefaultValueBytes(ByteString byteString) {
            copyOnWrite();
            ((StringValue) this.instance).setDefaultValueBytes(byteString);
            return this;
        }

        public C8329b setExp(String str) {
            copyOnWrite();
            ((StringValue) this.instance).setExp(str);
            return this;
        }

        public C8329b setExpBytes(ByteString byteString) {
            copyOnWrite();
            ((StringValue) this.instance).setExpBytes(byteString);
            return this;
        }

        public C8329b setLastModified(long j) {
            copyOnWrite();
            ((StringValue) this.instance).setLastModified(j);
            return this;
        }

        public C8329b setValue(String str) {
            copyOnWrite();
            ((StringValue) this.instance).setValue(str);
            return this;
        }

        public C8329b setValueBytes(ByteString byteString) {
            copyOnWrite();
            ((StringValue) this.instance).setValueBytes(byteString);
            return this;
        }

        private C8329b() {
            super(StringValue.DEFAULT_INSTANCE);
        }
    }

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        GeneratedMessageLite.registerDefaultInstance(StringValue.class, stringValue);
    }

    private StringValue() {
    }

    public void clearDefaultValue() {
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    public void clearExp() {
        this.exp_ = getDefaultInstance().getExp();
    }

    public void clearLastModified() {
        this.lastModified_ = 0L;
    }

    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8329b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StringValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<StringValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setDefaultValue(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    public void setDefaultValueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.defaultValue_ = byteString.toStringUtf8();
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

    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    public void setValueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.value_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8328a.f19924xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new StringValue();
            case 2:
                return new C8329b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0208\u0004\u0208", new Object[]{"value_", "lastModified_", "defaultValue_", "exp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<StringValue> parser = PARSER;
                if (parser == null) {
                    synchronized (StringValue.class) {
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

    public String getDefaultValue() {
        return this.defaultValue_;
    }

    public ByteString getDefaultValueBytes() {
        return ByteString.copyFromUtf8(this.defaultValue_);
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

    public String getValue() {
        return this.value_;
    }

    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.value_);
    }

    public static C8329b newBuilder(StringValue stringValue) {
        return DEFAULT_INSTANCE.createBuilder(stringValue);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StringValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static StringValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static StringValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static StringValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StringValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StringValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StringValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
