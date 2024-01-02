package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes19.dex */
public final class OpusItem extends GeneratedMessageLite<OpusItem, OpusItem.C9417b> implements InterfaceC9905pb {
    private static final OpusItem DEFAULT_INSTANCE;
    public static final int EXTEND_FIELD_NUMBER = 5;
    public static final int MODULES_FIELD_NUMBER = 4;
    public static final int OID_FIELD_NUMBER = 3;
    public static final int OPUS_ID_FIELD_NUMBER = 1;
    public static final int OPUS_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser<OpusItem> PARSER;
    private Extend extend_;
    private Internal.ProtobufList<Module> modules_ = GeneratedMessageLite.emptyProtobufList();
    private long oid_;
    private long opusId_;
    private int opusType_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.OpusItem$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C9416a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f20353xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20353xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20353xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20353xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20353xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20353xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20353xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20353xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.OpusItem$b */
    /* loaded from: classes19.dex */
    public static final class C9417b extends GeneratedMessageLite.Builder<OpusItem, C9417b> implements InterfaceC9905pb {
        /* synthetic */ C9417b(C9416a c9416a) {
            this();
        }

        public C9417b addAllModules(Iterable<? extends Module> iterable) {
            copyOnWrite();
            ((OpusItem) this.instance).addAllModules(iterable);
            return this;
        }

        public C9417b addModules(Module module) {
            copyOnWrite();
            ((OpusItem) this.instance).addModules(module);
            return this;
        }

        public C9417b clearExtend() {
            copyOnWrite();
            ((OpusItem) this.instance).clearExtend();
            return this;
        }

        public C9417b clearModules() {
            copyOnWrite();
            ((OpusItem) this.instance).clearModules();
            return this;
        }

        public C9417b clearOid() {
            copyOnWrite();
            ((OpusItem) this.instance).clearOid();
            return this;
        }

        public C9417b clearOpusId() {
            copyOnWrite();
            ((OpusItem) this.instance).clearOpusId();
            return this;
        }

        public C9417b clearOpusType() {
            copyOnWrite();
            ((OpusItem) this.instance).clearOpusType();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
        public Extend getExtend() {
            return ((OpusItem) this.instance).getExtend();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
        public Module getModules(int i) {
            return ((OpusItem) this.instance).getModules(i);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
        public int getModulesCount() {
            return ((OpusItem) this.instance).getModulesCount();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
        public List<Module> getModulesList() {
            return Collections.unmodifiableList(((OpusItem) this.instance).getModulesList());
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
        public long getOid() {
            return ((OpusItem) this.instance).getOid();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
        public long getOpusId() {
            return ((OpusItem) this.instance).getOpusId();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
        public OpusType getOpusType() {
            return ((OpusItem) this.instance).getOpusType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
        public int getOpusTypeValue() {
            return ((OpusItem) this.instance).getOpusTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
        public boolean hasExtend() {
            return ((OpusItem) this.instance).hasExtend();
        }

        public C9417b mergeExtend(Extend extend) {
            copyOnWrite();
            return this;
        }

        public C9417b removeModules(int i) {
            copyOnWrite();
            ((OpusItem) this.instance).removeModules(i);
            return this;
        }

        public C9417b setExtend(Extend extend) {
            copyOnWrite();
            ((OpusItem) this.instance).setExtend(extend);
            return this;
        }

        public C9417b setModules(int i, Module module) {
            copyOnWrite();
            ((OpusItem) this.instance).setModules(i, module);
            return this;
        }

        public C9417b setOid(long j) {
            copyOnWrite();
            ((OpusItem) this.instance).setOid(j);
            return this;
        }

        public C9417b setOpusId(long j) {
            copyOnWrite();
            ((OpusItem) this.instance).setOpusId(j);
            return this;
        }

        public C9417b setOpusType(OpusType opusType) {
            copyOnWrite();
            ((OpusItem) this.instance).setOpusType(opusType);
            return this;
        }

        public C9417b setOpusTypeValue(int i) {
            copyOnWrite();
            ((OpusItem) this.instance).setOpusTypeValue(i);
            return this;
        }

        private C9417b() {
            super(OpusItem.DEFAULT_INSTANCE);
        }

        public C9417b addModules(int i, Module module) {
            copyOnWrite();
            ((OpusItem) this.instance).addModules(i, module);
            return this;
        }
    }

    static {
        OpusItem opusItem = new OpusItem();
        DEFAULT_INSTANCE = opusItem;
        GeneratedMessageLite.registerDefaultInstance(OpusItem.class, opusItem);
    }

    private OpusItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllModules(Iterable<? extends Module> iterable) {
        ensureModulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.modules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addModules(Module module) {
        module.getClass();
        ensureModulesIsMutable();
        this.modules_.add(module);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtend() {
        this.extend_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModules() {
        this.modules_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOid() {
        this.oid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpusId() {
        this.opusId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpusType() {
        this.opusType_ = 0;
    }

    private void ensureModulesIsMutable() {
        Internal.ProtobufList<Module> protobufList = this.modules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.modules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static OpusItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C9417b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OpusItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OpusItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OpusItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OpusItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OpusItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeModules(int i) {
        ensureModulesIsMutable();
        this.modules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtend(Extend extend) {
        extend.getClass();
        this.extend_ = extend;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModules(int i, Module module) {
        module.getClass();
        ensureModulesIsMutable();
        this.modules_.set(i, module);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOid(long j) {
        this.oid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpusId(long j) {
        this.opusId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpusType(OpusType opusType) {
        this.opusType_ = opusType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpusTypeValue(int i) {
        this.opusType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C9416a.f20353xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OpusItem();
            case 2:
                return new C9417b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0002\u0002\f\u0003\u0002\u0004\u001b\u0005\t", new Object[]{"opusId_", "opusType_", "oid_", "modules_", Module.class, "extend_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OpusItem> parser = PARSER;
                if (parser == null) {
                    synchronized (OpusItem.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
    public Extend getExtend() {
        return this.extend_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
    public Module getModules(int i) {
        return this.modules_.get(i);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
    public int getModulesCount() {
        return this.modules_.size();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
    public List<Module> getModulesList() {
        return this.modules_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
    public long getOid() {
        return this.oid_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
    public long getOpusId() {
        return this.opusId_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
    public OpusType getOpusType() {
        OpusType forNumber = OpusType.forNumber(this.opusType_);
        return forNumber == null ? OpusType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
    public int getOpusTypeValue() {
        return this.opusType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.InterfaceC9905pb
    public boolean hasExtend() {
        return this.extend_ != null;
    }

    public static C9417b newBuilder(OpusItem opusItem) {
        return DEFAULT_INSTANCE.createBuilder(opusItem);
    }

    public static OpusItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OpusItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OpusItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OpusItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OpusItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OpusItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addModules(int i, Module module) {
        module.getClass();
        ensureModulesIsMutable();
        this.modules_.add(i, module);
    }

    public static OpusItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OpusItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OpusItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OpusItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OpusItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OpusItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OpusItem parseFrom(InputStream inputStream) throws IOException {
        return (OpusItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OpusItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OpusItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OpusItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OpusItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OpusItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OpusItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
