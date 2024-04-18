package com.bapis.bilibili.app.viewunite.pgcanymodel;

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
/* loaded from: classes17.dex */
public final class EarphoneConf extends GeneratedMessageLite<EarphoneConf, EarphoneConf.Builder> implements MessageLiteOrBuilder {
    private static final EarphoneConf DEFAULT_INSTANCE;
    private static volatile Parser<EarphoneConf> PARSER = null;
    public static final int SP_PHONES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Earphone> spPhones_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneConf$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70881 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17065xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17065xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17065xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17065xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17065xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17065xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17065xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17065xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EarphoneConf, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70881 c70881) {
            this();
        }

        public Builder addAllSpPhones(Iterable<? extends Earphone> iterable) {
            copyOnWrite();
            ((EarphoneConf) this.instance).addAllSpPhones(iterable);
            return this;
        }

        public Builder addSpPhones(Earphone earphone) {
            copyOnWrite();
            ((EarphoneConf) this.instance).addSpPhones(earphone);
            return this;
        }

        public Builder clearSpPhones() {
            copyOnWrite();
            ((EarphoneConf) this.instance).clearSpPhones();
            return this;
        }

        public Earphone getSpPhones(int i) {
            return ((EarphoneConf) this.instance).getSpPhones(i);
        }

        public int getSpPhonesCount() {
            return ((EarphoneConf) this.instance).getSpPhonesCount();
        }

        public List<Earphone> getSpPhonesList() {
            return Collections.unmodifiableList(((EarphoneConf) this.instance).getSpPhonesList());
        }

        public Builder removeSpPhones(int i) {
            copyOnWrite();
            ((EarphoneConf) this.instance).removeSpPhones(i);
            return this;
        }

        public Builder setSpPhones(int i, Earphone earphone) {
            copyOnWrite();
            ((EarphoneConf) this.instance).setSpPhones(i, earphone);
            return this;
        }

        private Builder() {
            super(EarphoneConf.DEFAULT_INSTANCE);
        }

        public Builder addSpPhones(int i, Earphone earphone) {
            copyOnWrite();
            ((EarphoneConf) this.instance).addSpPhones(i, earphone);
            return this;
        }

        public Builder setSpPhones(int i, Earphone.Builder builder) {
            copyOnWrite();
            ((EarphoneConf) this.instance).setSpPhones(i, builder.build());
            return this;
        }

        public Builder addSpPhones(Earphone.Builder builder) {
            copyOnWrite();
            ((EarphoneConf) this.instance).addSpPhones(builder.build());
            return this;
        }

        public Builder addSpPhones(int i, Earphone.Builder builder) {
            copyOnWrite();
            ((EarphoneConf) this.instance).addSpPhones(i, builder.build());
            return this;
        }
    }

    static {
        EarphoneConf earphoneConf = new EarphoneConf();
        DEFAULT_INSTANCE = earphoneConf;
        GeneratedMessageLite.registerDefaultInstance(EarphoneConf.class, earphoneConf);
    }

    private EarphoneConf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpPhones(Iterable<? extends Earphone> iterable) {
        ensureSpPhonesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.spPhones_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpPhones(Earphone earphone) {
        earphone.getClass();
        ensureSpPhonesIsMutable();
        this.spPhones_.add(earphone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpPhones() {
        this.spPhones_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSpPhonesIsMutable() {
        Internal.ProtobufList<Earphone> protobufList = this.spPhones_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.spPhones_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static EarphoneConf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EarphoneConf parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EarphoneConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EarphoneConf parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EarphoneConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EarphoneConf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSpPhones(int i) {
        ensureSpPhonesIsMutable();
        this.spPhones_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpPhones(int i, Earphone earphone) {
        earphone.getClass();
        ensureSpPhonesIsMutable();
        this.spPhones_.set(i, earphone);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70881.f17065xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EarphoneConf();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"spPhones_", Earphone.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EarphoneConf> parser = PARSER;
                if (parser == null) {
                    synchronized (EarphoneConf.class) {
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

    public Earphone getSpPhones(int i) {
        return this.spPhones_.get(i);
    }

    public int getSpPhonesCount() {
        return this.spPhones_.size();
    }

    public List<Earphone> getSpPhonesList() {
        return this.spPhones_;
    }

    public EarphoneOrBuilder getSpPhonesOrBuilder(int i) {
        return this.spPhones_.get(i);
    }

    public List<? extends EarphoneOrBuilder> getSpPhonesOrBuilderList() {
        return this.spPhones_;
    }

    public static Builder newBuilder(EarphoneConf earphoneConf) {
        return DEFAULT_INSTANCE.createBuilder(earphoneConf);
    }

    public static EarphoneConf parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EarphoneConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EarphoneConf parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EarphoneConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EarphoneConf parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EarphoneConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpPhones(int i, Earphone earphone) {
        earphone.getClass();
        ensureSpPhonesIsMutable();
        this.spPhones_.add(i, earphone);
    }

    public static EarphoneConf parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EarphoneConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EarphoneConf parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EarphoneConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EarphoneConf parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EarphoneConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EarphoneConf parseFrom(InputStream inputStream) throws IOException {
        return (EarphoneConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EarphoneConf parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EarphoneConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EarphoneConf parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EarphoneConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EarphoneConf parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EarphoneConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
