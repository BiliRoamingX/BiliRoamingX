package com.bapis.bilibili.app.distribution.setting.experimental;

import com.bapis.bilibili.app.distribution.StringValue;
import com.google.protobuf.AbstractMessageLite;
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
public final class ExperimentalConfig extends GeneratedMessageLite<ExperimentalConfig, ExperimentalConfig.C8358b> implements MessageLiteOrBuilder {
    private static final ExperimentalConfig DEFAULT_INSTANCE;
    public static final int EXPS_FIELD_NUMBER = 2;
    public static final int FLAG_FIELD_NUMBER = 1;
    private static volatile Parser<ExperimentalConfig> PARSER;
    private Internal.ProtobufList<Exp> exps_ = GeneratedMessageLite.emptyProtobufList();
    private StringValue flag_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.experimental.ExperimentalConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8357a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19935xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19935xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19935xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19935xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19935xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19935xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19935xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19935xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.experimental.ExperimentalConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8358b extends GeneratedMessageLite.Builder<ExperimentalConfig, C8358b> implements MessageLiteOrBuilder {
        /* synthetic */ C8358b(C8357a c8357a) {
            this();
        }

        public C8358b addAllExps(Iterable<? extends Exp> iterable) {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).addAllExps(iterable);
            return this;
        }

        public C8358b addExps(Exp exp) {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).addExps(exp);
            return this;
        }

        public C8358b clearExps() {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).clearExps();
            return this;
        }

        public C8358b clearFlag() {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).clearFlag();
            return this;
        }

        public Exp getExps(int i) {
            return ((ExperimentalConfig) this.instance).getExps(i);
        }

        public int getExpsCount() {
            return ((ExperimentalConfig) this.instance).getExpsCount();
        }

        public List<Exp> getExpsList() {
            return Collections.unmodifiableList(((ExperimentalConfig) this.instance).getExpsList());
        }

        public StringValue getFlag() {
            return ((ExperimentalConfig) this.instance).getFlag();
        }

        public boolean hasFlag() {
            return ((ExperimentalConfig) this.instance).hasFlag();
        }

        public C8358b mergeFlag(StringValue stringValue) {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).mergeFlag(stringValue);
            return this;
        }

        public C8358b removeExps(int i) {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).removeExps(i);
            return this;
        }

        public C8358b setExps(int i, Exp exp) {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).setExps(i, exp);
            return this;
        }

        public C8358b setFlag(StringValue stringValue) {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).setFlag(stringValue);
            return this;
        }

        private C8358b() {
            super(ExperimentalConfig.DEFAULT_INSTANCE);
        }

        public C8358b addExps(int i, Exp exp) {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).addExps(i, exp);
            return this;
        }

        public C8358b setExps(int i, Exp.C8356b c8356b) {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).setExps(i, c8356b.build());
            return this;
        }

        public C8358b setFlag(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).setFlag(c8329b.build());
            return this;
        }

        public C8358b addExps(Exp.C8356b c8356b) {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).addExps(c8356b.build());
            return this;
        }

        public C8358b addExps(int i, Exp.C8356b c8356b) {
            copyOnWrite();
            ((ExperimentalConfig) this.instance).addExps(i, c8356b.build());
            return this;
        }
    }

    static {
        ExperimentalConfig experimentalConfig = new ExperimentalConfig();
        DEFAULT_INSTANCE = experimentalConfig;
        GeneratedMessageLite.registerDefaultInstance(ExperimentalConfig.class, experimentalConfig);
    }

    private ExperimentalConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExps(Iterable<? extends Exp> iterable) {
        ensureExpsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.exps_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExps(Exp exp) {
        exp.getClass();
        ensureExpsIsMutable();
        this.exps_.add(exp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExps() {
        this.exps_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlag() {
        this.flag_ = null;
    }

    private void ensureExpsIsMutable() {
        Internal.ProtobufList<Exp> protobufList = this.exps_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.exps_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ExperimentalConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFlag(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.flag_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.flag_ = StringValue.newBuilder(this.flag_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.flag_ = stringValue;
        }
    }

    public static C8358b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExperimentalConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExperimentalConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExperimentalConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExperimentalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExperimentalConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExps(int i) {
        ensureExpsIsMutable();
        this.exps_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExps(int i, Exp exp) {
        exp.getClass();
        ensureExpsIsMutable();
        this.exps_.set(i, exp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlag(StringValue stringValue) {
        stringValue.getClass();
        this.flag_ = stringValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8357a.f19935xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ExperimentalConfig();
            case 2:
                return new C8358b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"flag_", "exps_", Exp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExperimentalConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (ExperimentalConfig.class) {
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

    public Exp getExps(int i) {
        return this.exps_.get(i);
    }

    public int getExpsCount() {
        return this.exps_.size();
    }

    public List<Exp> getExpsList() {
        return this.exps_;
    }

    public InterfaceC8363a getExpsOrBuilder(int i) {
        return this.exps_.get(i);
    }

    public List<? extends InterfaceC8363a> getExpsOrBuilderList() {
        return this.exps_;
    }

    public StringValue getFlag() {
        StringValue stringValue = this.flag_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public boolean hasFlag() {
        return this.flag_ != null;
    }

    public static C8358b newBuilder(ExperimentalConfig experimentalConfig) {
        return DEFAULT_INSTANCE.createBuilder(experimentalConfig);
    }

    public static ExperimentalConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExperimentalConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExperimentalConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExperimentalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExperimentalConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExperimentalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExps(int i, Exp exp) {
        exp.getClass();
        ensureExpsIsMutable();
        this.exps_.add(i, exp);
    }

    public static ExperimentalConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExperimentalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExperimentalConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExperimentalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExperimentalConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExperimentalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExperimentalConfig parseFrom(InputStream inputStream) throws IOException {
        return (ExperimentalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExperimentalConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExperimentalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExperimentalConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExperimentalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExperimentalConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExperimentalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
