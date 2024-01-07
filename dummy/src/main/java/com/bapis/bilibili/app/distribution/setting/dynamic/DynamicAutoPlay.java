package com.bapis.bilibili.app.distribution.setting.dynamic;

import com.bapis.bilibili.app.distribution.Int64Value;
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
public final class DynamicAutoPlay extends GeneratedMessageLite<DynamicAutoPlay, DynamicAutoPlay.C8350b> implements MessageLiteOrBuilder {
    private static final DynamicAutoPlay DEFAULT_INSTANCE;
    private static volatile Parser<DynamicAutoPlay> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private Int64Value value_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.dynamic.DynamicAutoPlay$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8349a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19931xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19931xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19931xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19931xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19931xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19931xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19931xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19931xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.dynamic.DynamicAutoPlay$b */
    /* loaded from: classes13.dex */
    public static final class C8350b extends GeneratedMessageLite.Builder<DynamicAutoPlay, C8350b> implements MessageLiteOrBuilder {
        /* synthetic */ C8350b(C8349a c8349a) {
            this();
        }

        public C8350b clearValue() {
            copyOnWrite();
            ((DynamicAutoPlay) this.instance).clearValue();
            return this;
        }

        public Int64Value getValue() {
            return ((DynamicAutoPlay) this.instance).getValue();
        }

        public boolean hasValue() {
            return ((DynamicAutoPlay) this.instance).hasValue();
        }

        public C8350b mergeValue(Int64Value int64Value) {
            copyOnWrite();
            ((DynamicAutoPlay) this.instance).mergeValue(int64Value);
            return this;
        }

        public C8350b setValue(Int64Value int64Value) {
            copyOnWrite();
            ((DynamicAutoPlay) this.instance).setValue(int64Value);
            return this;
        }

        private C8350b() {
            super(DynamicAutoPlay.DEFAULT_INSTANCE);
        }

        public C8350b setValue(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((DynamicAutoPlay) this.instance).setValue(c8322b.build());
            return this;
        }
    }

    static {
        DynamicAutoPlay dynamicAutoPlay = new DynamicAutoPlay();
        DEFAULT_INSTANCE = dynamicAutoPlay;
        GeneratedMessageLite.registerDefaultInstance(DynamicAutoPlay.class, dynamicAutoPlay);
    }

    private DynamicAutoPlay() {
    }

    public void clearValue() {
        this.value_ = null;
    }

    public static DynamicAutoPlay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeValue(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.value_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.value_ = Int64Value.newBuilder(this.value_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.value_ = int64Value;
        }
    }

    public static C8350b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DynamicAutoPlay parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DynamicAutoPlay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynamicAutoPlay parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DynamicAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DynamicAutoPlay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(Int64Value int64Value) {
        int64Value.getClass();
        this.value_ = int64Value;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8349a.f19931xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DynamicAutoPlay();
            case 2:
                return new C8350b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DynamicAutoPlay> parser = PARSER;
                if (parser == null) {
                    synchronized (DynamicAutoPlay.class) {
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

    public Int64Value getValue() {
        Int64Value int64Value = this.value_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public boolean hasValue() {
        return this.value_ != null;
    }

    public static C8350b newBuilder(DynamicAutoPlay dynamicAutoPlay) {
        return DEFAULT_INSTANCE.createBuilder(dynamicAutoPlay);
    }

    public static DynamicAutoPlay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicAutoPlay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynamicAutoPlay parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DynamicAutoPlay parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DynamicAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DynamicAutoPlay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DynamicAutoPlay parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DynamicAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DynamicAutoPlay parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DynamicAutoPlay parseFrom(InputStream inputStream) throws IOException {
        return (DynamicAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynamicAutoPlay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynamicAutoPlay parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DynamicAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DynamicAutoPlay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
