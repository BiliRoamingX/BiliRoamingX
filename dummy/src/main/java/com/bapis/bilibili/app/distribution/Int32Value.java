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
public final class Int32Value extends GeneratedMessageLite<Int32Value, Int32Value.C8320b> implements MessageLiteOrBuilder {
    private static final Int32Value DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 3;
    public static final int EXP_FIELD_NUMBER = 4;
    public static final int LAST_MODIFIED_FIELD_NUMBER = 2;
    private static volatile Parser<Int32Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int defaultValue_;
    private String exp_ = "";
    private long lastModified_;
    private int value_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.Int32Value$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8319a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19920xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19920xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19920xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19920xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19920xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19920xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19920xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19920xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.Int32Value$b */
    /* loaded from: classes13.dex */
    public static final class C8320b extends GeneratedMessageLite.Builder<Int32Value, C8320b> implements MessageLiteOrBuilder {
        /* synthetic */ C8320b(C8319a c8319a) {
            this();
        }

        public C8320b clearDefaultValue() {
            copyOnWrite();
            ((Int32Value) this.instance).clearDefaultValue();
            return this;
        }

        public C8320b clearExp() {
            copyOnWrite();
            ((Int32Value) this.instance).clearExp();
            return this;
        }

        public C8320b clearLastModified() {
            copyOnWrite();
            ((Int32Value) this.instance).clearLastModified();
            return this;
        }

        public C8320b clearValue() {
            copyOnWrite();
            ((Int32Value) this.instance).clearValue();
            return this;
        }

        public int getDefaultValue() {
            return ((Int32Value) this.instance).getDefaultValue();
        }

        public String getExp() {
            return ((Int32Value) this.instance).getExp();
        }

        public ByteString getExpBytes() {
            return ((Int32Value) this.instance).getExpBytes();
        }

        public long getLastModified() {
            return ((Int32Value) this.instance).getLastModified();
        }

        public int getValue() {
            return ((Int32Value) this.instance).getValue();
        }

        public C8320b setDefaultValue(int i) {
            copyOnWrite();
            ((Int32Value) this.instance).setDefaultValue(i);
            return this;
        }

        public C8320b setExp(String str) {
            copyOnWrite();
            ((Int32Value) this.instance).setExp(str);
            return this;
        }

        public C8320b setExpBytes(ByteString byteString) {
            copyOnWrite();
            ((Int32Value) this.instance).setExpBytes(byteString);
            return this;
        }

        public C8320b setLastModified(long j) {
            copyOnWrite();
            ((Int32Value) this.instance).setLastModified(j);
            return this;
        }

        public C8320b setValue(int i) {
            copyOnWrite();
            ((Int32Value) this.instance).setValue(i);
            return this;
        }

        private C8320b() {
            super(Int32Value.DEFAULT_INSTANCE);
        }
    }

    static {
        Int32Value int32Value = new Int32Value();
        DEFAULT_INSTANCE = int32Value;
        GeneratedMessageLite.registerDefaultInstance(Int32Value.class, int32Value);
    }

    private Int32Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = 0;
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
        this.value_ = 0;
    }

    public static Int32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8320b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Int32Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Int32Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(int i) {
        this.defaultValue_ = i;
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
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8319a.f19920xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Int32Value();
            case 2:
                return new C8320b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0004\u0004\u0208", new Object[]{"value_", "lastModified_", "defaultValue_", "exp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Int32Value> parser = PARSER;
                if (parser == null) {
                    synchronized (Int32Value.class) {
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

    public int getDefaultValue() {
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

    public int getValue() {
        return this.value_;
    }

    public static C8320b newBuilder(Int32Value int32Value) {
        return DEFAULT_INSTANCE.createBuilder(int32Value);
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Int32Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Int32Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Int32Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Int32Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Int32Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Int32Value parseFrom(InputStream inputStream) throws IOException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int32Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Int32Value parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Int32Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Int32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
