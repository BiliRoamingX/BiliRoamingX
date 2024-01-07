package com.bapis.bilibili.app.distribution;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class GetUserPreferenceReply extends GeneratedMessageLite<GetUserPreferenceReply, GetUserPreferenceReply.C8315b> implements MessageLiteOrBuilder {
    private static final GetUserPreferenceReply DEFAULT_INSTANCE;
    private static volatile Parser<GetUserPreferenceReply> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Any> value_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.GetUserPreferenceReply$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8314a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19918xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19918xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19918xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19918xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19918xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19918xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19918xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19918xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.GetUserPreferenceReply$b */
    /* loaded from: classes13.dex */
    public static final class C8315b extends GeneratedMessageLite.Builder<GetUserPreferenceReply, C8315b> implements MessageLiteOrBuilder {
        /* synthetic */ C8315b(C8314a c8314a) {
            this();
        }

        public C8315b addAllValue(Iterable<? extends Any> iterable) {
            copyOnWrite();
            ((GetUserPreferenceReply) this.instance).addAllValue(iterable);
            return this;
        }

        public C8315b addValue(Any any) {
            copyOnWrite();
            ((GetUserPreferenceReply) this.instance).addValue(any);
            return this;
        }

        public C8315b clearValue() {
            copyOnWrite();
            ((GetUserPreferenceReply) this.instance).clearValue();
            return this;
        }

        public Any getValue(int i) {
            return ((GetUserPreferenceReply) this.instance).getValue(i);
        }

        public int getValueCount() {
            return ((GetUserPreferenceReply) this.instance).getValueCount();
        }

        public List<Any> getValueList() {
            return Collections.unmodifiableList(((GetUserPreferenceReply) this.instance).getValueList());
        }

        public C8315b removeValue(int i) {
            copyOnWrite();
            ((GetUserPreferenceReply) this.instance).removeValue(i);
            return this;
        }

        public C8315b setValue(int i, Any any) {
            copyOnWrite();
            ((GetUserPreferenceReply) this.instance).setValue(i, any);
            return this;
        }

        private C8315b() {
            super(GetUserPreferenceReply.DEFAULT_INSTANCE);
        }

        public C8315b addValue(int i, Any any) {
            copyOnWrite();
            ((GetUserPreferenceReply) this.instance).addValue(i, any);
            return this;
        }

        public C8315b setValue(int i, Any.Builder builder) {
            copyOnWrite();
            ((GetUserPreferenceReply) this.instance).setValue(i, builder.build());
            return this;
        }

        public C8315b addValue(Any.Builder builder) {
            copyOnWrite();
            ((GetUserPreferenceReply) this.instance).addValue(builder.build());
            return this;
        }

        public C8315b addValue(int i, Any.Builder builder) {
            copyOnWrite();
            ((GetUserPreferenceReply) this.instance).addValue(i, builder.build());
            return this;
        }
    }

    static {
        GetUserPreferenceReply getUserPreferenceReply = new GetUserPreferenceReply();
        DEFAULT_INSTANCE = getUserPreferenceReply;
        GeneratedMessageLite.registerDefaultInstance(GetUserPreferenceReply.class, getUserPreferenceReply);
    }

    private GetUserPreferenceReply() {
    }

    public void addAllValue(Iterable<? extends Any> iterable) {
        ensureValueIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.value_);
    }

    public void addValue(Any any) {
        any.getClass();
        ensureValueIsMutable();
        this.value_.add(any);
    }

    public void clearValue() {
        this.value_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureValueIsMutable() {
        Internal.ProtobufList<Any> protobufList = this.value_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.value_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static GetUserPreferenceReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8315b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GetUserPreferenceReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetUserPreferenceReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetUserPreferenceReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GetUserPreferenceReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeValue(int i) {
        ensureValueIsMutable();
        this.value_.remove(i);
    }

    public void setValue(int i, Any any) {
        any.getClass();
        ensureValueIsMutable();
        this.value_.set(i, any);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8314a.f19918xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GetUserPreferenceReply();
            case 2:
                return new C8315b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"value_", Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GetUserPreferenceReply> parser = PARSER;
                if (parser == null) {
                    synchronized (GetUserPreferenceReply.class) {
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

    public Any getValue(int i) {
        return this.value_.get(i);
    }

    public int getValueCount() {
        return this.value_.size();
    }

    public List<Any> getValueList() {
        return this.value_;
    }

    public AnyOrBuilder getValueOrBuilder(int i) {
        return this.value_.get(i);
    }

    public List<? extends AnyOrBuilder> getValueOrBuilderList() {
        return this.value_;
    }

    public static C8315b newBuilder(GetUserPreferenceReply getUserPreferenceReply) {
        return DEFAULT_INSTANCE.createBuilder(getUserPreferenceReply);
    }

    public static GetUserPreferenceReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetUserPreferenceReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetUserPreferenceReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GetUserPreferenceReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addValue(int i, Any any) {
        any.getClass();
        ensureValueIsMutable();
        this.value_.add(i, any);
    }

    public static GetUserPreferenceReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GetUserPreferenceReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetUserPreferenceReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GetUserPreferenceReply parseFrom(InputStream inputStream) throws IOException {
        return (GetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetUserPreferenceReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetUserPreferenceReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GetUserPreferenceReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
