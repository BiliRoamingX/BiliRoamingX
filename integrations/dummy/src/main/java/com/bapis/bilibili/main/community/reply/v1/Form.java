package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class Form extends GeneratedMessageLite<Form, Form.C14730b> implements MessageLiteOrBuilder {
    private static final Form DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile Parser<Form> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private Internal.ProtobufList<QoeOption> options_ = GeneratedMessageLite.emptyProtobufList();
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Form$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14729a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21998xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21998xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21998xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21998xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21998xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21998xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21998xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21998xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Form$b */
    /* loaded from: classes21.dex */
    public static final class C14730b extends GeneratedMessageLite.Builder<Form, C14730b> implements MessageLiteOrBuilder {
        /* synthetic */ C14730b(C14729a c14729a) {
            this();
        }

        public C14730b addAllOptions(Iterable<? extends QoeOption> iterable) {
            copyOnWrite();
            ((Form) this.instance).addAllOptions(iterable);
            return this;
        }

        public C14730b addOptions(QoeOption qoeOption) {
            copyOnWrite();
            ((Form) this.instance).addOptions(qoeOption);
            return this;
        }

        public C14730b clearOptions() {
            copyOnWrite();
            ((Form) this.instance).clearOptions();
            return this;
        }

        public C14730b clearType() {
            copyOnWrite();
            ((Form) this.instance).clearType();
            return this;
        }

        public QoeOption getOptions(int i) {
            return ((Form) this.instance).getOptions(i);
        }

        public int getOptionsCount() {
            return ((Form) this.instance).getOptionsCount();
        }

        public List<QoeOption> getOptionsList() {
            return Collections.unmodifiableList(((Form) this.instance).getOptionsList());
        }

        public int getType() {
            return ((Form) this.instance).getType();
        }

        public C14730b removeOptions(int i) {
            copyOnWrite();
            ((Form) this.instance).removeOptions(i);
            return this;
        }

        public C14730b setOptions(int i, QoeOption qoeOption) {
            copyOnWrite();
            ((Form) this.instance).setOptions(i, qoeOption);
            return this;
        }

        public C14730b setType(int i) {
            copyOnWrite();
            ((Form) this.instance).setType(i);
            return this;
        }

        private C14730b() {
            super(Form.DEFAULT_INSTANCE);
        }

        public C14730b addOptions(int i, QoeOption qoeOption) {
            copyOnWrite();
            ((Form) this.instance).addOptions(i, qoeOption);
            return this;
        }

        public C14730b setOptions(int i, QoeOption.C14798b c14798b) {
            copyOnWrite();
            ((Form) this.instance).setOptions(i, c14798b.build());
            return this;
        }

        public C14730b addOptions(QoeOption.C14798b c14798b) {
            copyOnWrite();
            ((Form) this.instance).addOptions(c14798b.build());
            return this;
        }

        public C14730b addOptions(int i, QoeOption.C14798b c14798b) {
            copyOnWrite();
            ((Form) this.instance).addOptions(i, c14798b.build());
            return this;
        }
    }

    static {
        Form form = new Form();
        DEFAULT_INSTANCE = form;
        GeneratedMessageLite.registerDefaultInstance(Form.class, form);
    }

    private Form() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends QoeOption> iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(QoeOption qoeOption) {
        qoeOption.getClass();
        ensureOptionsIsMutable();
        this.options_.add(qoeOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList<QoeOption> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Form getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14730b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Form parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Form) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Form parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Form) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Form> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i, QoeOption qoeOption) {
        qoeOption.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, qoeOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14729a.f21998xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Form();
            case 2:
                return new C14730b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"type_", "options_", QoeOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Form> parser = PARSER;
                if (parser == null) {
                    synchronized (Form.class) {
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

    public QoeOption getOptions(int i) {
        return this.options_.get(i);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List<QoeOption> getOptionsList() {
        return this.options_;
    }

    public InterfaceC14917e getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    public List<? extends InterfaceC14917e> getOptionsOrBuilderList() {
        return this.options_;
    }

    public int getType() {
        return this.type_;
    }

    public static C14730b newBuilder(Form form) {
        return DEFAULT_INSTANCE.createBuilder(form);
    }

    public static Form parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Form) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Form parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Form) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Form parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Form) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i, QoeOption qoeOption) {
        qoeOption.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, qoeOption);
    }

    public static Form parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Form) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Form parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Form) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Form parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Form) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Form parseFrom(InputStream inputStream) throws IOException {
        return (Form) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Form parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Form) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Form parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Form) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Form parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Form) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
