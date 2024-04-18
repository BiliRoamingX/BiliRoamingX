package com.bapis.bilibili.app.resource.v1;

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
/* loaded from: classes15.dex */
public final class PoolReply extends GeneratedMessageLite<PoolReply, PoolReply.Builder> implements PoolReplyOrBuilder {
    private static final PoolReply DEFAULT_INSTANCE;
    public static final int MODULES_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<PoolReply> PARSER;
    private String name_ = "";
    private Internal.ProtobufList<ModuleReply> modules_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.resource.v1.PoolReply$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C65741 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16591xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16591xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16591xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16591xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16591xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16591xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16591xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16591xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PoolReply, Builder> implements PoolReplyOrBuilder {
        /* synthetic */ Builder(C65741 c65741) {
            this();
        }

        public Builder addAllModules(Iterable<? extends ModuleReply> iterable) {
            copyOnWrite();
            ((PoolReply) this.instance).addAllModules(iterable);
            return this;
        }

        public Builder addModules(ModuleReply moduleReply) {
            copyOnWrite();
            ((PoolReply) this.instance).addModules(moduleReply);
            return this;
        }

        public Builder clearModules() {
            copyOnWrite();
            ((PoolReply) this.instance).clearModules();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((PoolReply) this.instance).clearName();
            return this;
        }

        @Override // com.bapis.bilibili.app.resource.v1.PoolReplyOrBuilder
        public ModuleReply getModules(int i) {
            return ((PoolReply) this.instance).getModules(i);
        }

        @Override // com.bapis.bilibili.app.resource.v1.PoolReplyOrBuilder
        public int getModulesCount() {
            return ((PoolReply) this.instance).getModulesCount();
        }

        @Override // com.bapis.bilibili.app.resource.v1.PoolReplyOrBuilder
        public List<ModuleReply> getModulesList() {
            return Collections.unmodifiableList(((PoolReply) this.instance).getModulesList());
        }

        @Override // com.bapis.bilibili.app.resource.v1.PoolReplyOrBuilder
        public String getName() {
            return ((PoolReply) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.resource.v1.PoolReplyOrBuilder
        public ByteString getNameBytes() {
            return ((PoolReply) this.instance).getNameBytes();
        }

        public Builder removeModules(int i) {
            copyOnWrite();
            ((PoolReply) this.instance).removeModules(i);
            return this;
        }

        public Builder setModules(int i, ModuleReply moduleReply) {
            copyOnWrite();
            ((PoolReply) this.instance).setModules(i, moduleReply);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((PoolReply) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((PoolReply) this.instance).setNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(PoolReply.DEFAULT_INSTANCE);
        }

        public Builder addModules(int i, ModuleReply moduleReply) {
            copyOnWrite();
            ((PoolReply) this.instance).addModules(i, moduleReply);
            return this;
        }

        public Builder setModules(int i, ModuleReply.Builder builder) {
            copyOnWrite();
            ((PoolReply) this.instance).setModules(i, builder.build());
            return this;
        }

        public Builder addModules(ModuleReply.Builder builder) {
            copyOnWrite();
            ((PoolReply) this.instance).addModules(builder.build());
            return this;
        }

        public Builder addModules(int i, ModuleReply.Builder builder) {
            copyOnWrite();
            ((PoolReply) this.instance).addModules(i, builder.build());
            return this;
        }
    }

    static {
        PoolReply poolReply = new PoolReply();
        DEFAULT_INSTANCE = poolReply;
        GeneratedMessageLite.registerDefaultInstance(PoolReply.class, poolReply);
    }

    private PoolReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllModules(Iterable<? extends ModuleReply> iterable) {
        ensureModulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.modules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addModules(ModuleReply moduleReply) {
        moduleReply.getClass();
        ensureModulesIsMutable();
        this.modules_.add(moduleReply);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModules() {
        this.modules_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureModulesIsMutable() {
        Internal.ProtobufList<ModuleReply> protobufList = this.modules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.modules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PoolReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PoolReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PoolReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PoolReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PoolReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PoolReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeModules(int i) {
        ensureModulesIsMutable();
        this.modules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModules(int i, ModuleReply moduleReply) {
        moduleReply.getClass();
        ensureModulesIsMutable();
        this.modules_.set(i, moduleReply);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65741.f16591xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PoolReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[]{"name_", "modules_", ModuleReply.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PoolReply> parser = PARSER;
                if (parser == null) {
                    synchronized (PoolReply.class) {
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

    @Override // com.bapis.bilibili.app.resource.v1.PoolReplyOrBuilder
    public ModuleReply getModules(int i) {
        return this.modules_.get(i);
    }

    @Override // com.bapis.bilibili.app.resource.v1.PoolReplyOrBuilder
    public int getModulesCount() {
        return this.modules_.size();
    }

    @Override // com.bapis.bilibili.app.resource.v1.PoolReplyOrBuilder
    public List<ModuleReply> getModulesList() {
        return this.modules_;
    }

    public ModuleReplyOrBuilder getModulesOrBuilder(int i) {
        return this.modules_.get(i);
    }

    public List<? extends ModuleReplyOrBuilder> getModulesOrBuilderList() {
        return this.modules_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.PoolReplyOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.PoolReplyOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static Builder newBuilder(PoolReply poolReply) {
        return DEFAULT_INSTANCE.createBuilder(poolReply);
    }

    public static PoolReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PoolReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PoolReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PoolReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PoolReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PoolReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addModules(int i, ModuleReply moduleReply) {
        moduleReply.getClass();
        ensureModulesIsMutable();
        this.modules_.add(i, moduleReply);
    }

    public static PoolReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PoolReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PoolReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PoolReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PoolReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PoolReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PoolReply parseFrom(InputStream inputStream) throws IOException {
        return (PoolReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PoolReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PoolReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PoolReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PoolReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PoolReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PoolReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
