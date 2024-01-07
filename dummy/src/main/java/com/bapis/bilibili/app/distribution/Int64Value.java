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
public final class Int64Value extends GeneratedMessageLite<Int64Value, Int64Value.C8322b> implements MessageLiteOrBuilder {
    private static final Int64Value DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 3;
    public static final int EXP_FIELD_NUMBER = 4;
    public static final int LAST_MODIFIED_FIELD_NUMBER = 2;
    private static volatile Parser<Int64Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long defaultValue_;
    private String exp_ = "";
    private long lastModified_;
    private long value_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.Int64Value$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8321a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19921xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19921xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19921xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19921xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19921xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19921xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19921xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19921xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.Int64Value$b */
    /* loaded from: classes13.dex */
    public static final class C8322b extends GeneratedMessageLite.Builder<Int64Value, C8322b> implements MessageLiteOrBuilder {
        /* synthetic */ C8322b(C8321a c8321a) {
            this();
        }

        public C8322b clearDefaultValue() {
            copyOnWrite();
            ((Int64Value) this.instance).clearDefaultValue();
            return this;
        }

        public C8322b clearExp() {
            copyOnWrite();
            ((Int64Value) this.instance).clearExp();
            return this;
        }

        public C8322b clearLastModified() {
            copyOnWrite();
            ((Int64Value) this.instance).clearLastModified();
            return this;
        }

        public C8322b clearValue() {
            copyOnWrite();
            ((Int64Value) this.instance).clearValue();
            return this;
        }

        public long getDefaultValue() {
            return ((Int64Value) this.instance).getDefaultValue();
        }

        public String getExp() {
            return ((Int64Value) this.instance).getExp();
        }

        public ByteString getExpBytes() {
            return ((Int64Value) this.instance).getExpBytes();
        }

        public long getLastModified() {
            return ((Int64Value) this.instance).getLastModified();
        }

        public long getValue() {
            return ((Int64Value) this.instance).getValue();
        }

        public C8322b setDefaultValue(long j) {
            copyOnWrite();
            ((Int64Value) this.instance).setDefaultValue(j);
            return this;
        }

        public C8322b setExp(String str) {
            copyOnWrite();
            ((Int64Value) this.instance).setExp(str);
            return this;
        }

        public C8322b setExpBytes(ByteString byteString) {
            copyOnWrite();
            ((Int64Value) this.instance).setExpBytes(byteString);
            return this;
        }

        public C8322b setLastModified(long j) {
            copyOnWrite();
            ((Int64Value) this.instance).setLastModified(j);
            return this;
        }

        public C8322b setValue(long j) {
            copyOnWrite();
            ((Int64Value) this.instance).setValue(j);
            return this;
        }

        private C8322b() {
            super(Int64Value.DEFAULT_INSTANCE);
        }
    }

    static {
        Int64Value int64Value = new Int64Value();
        DEFAULT_INSTANCE = int64Value;
        GeneratedMessageLite.registerDefaultInstance(Int64Value.class, int64Value);
    }

    private Int64Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExp() {
        this.exp_ = getDefaultInstance().getExp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastModified() {
        this.lastModified_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static Int64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8322b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Int64Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Int64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Int64Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(long j) {
        this.defaultValue_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExp(String str) {
        str.getClass();
        this.exp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.exp_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastModified(long j) {
        this.lastModified_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j) {
        this.value_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8321a.f19921xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Int64Value();
            case 2:
                return new C8322b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0208", new Object[]{"value_", "lastModified_", "defaultValue_", "exp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Int64Value> parser = PARSER;
                if (parser == null) {
                    synchronized (Int64Value.class) {
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

    public long getDefaultValue() {
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

    public long getValue() {
        return this.value_;
    }

    public static C8322b newBuilder(Int64Value int64Value) {
        return DEFAULT_INSTANCE.createBuilder(int64Value);
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Int64Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Int64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Int64Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Int64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Int64Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Int64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Int64Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Int64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Int64Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Int64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Int64Value parseFrom(InputStream inputStream) throws IOException {
        return (Int64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int64Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Int64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Int64Value parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Int64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Int64Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Int64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
