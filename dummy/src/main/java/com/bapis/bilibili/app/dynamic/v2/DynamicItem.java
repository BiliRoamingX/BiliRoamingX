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
public final class DynamicItem extends GeneratedMessageLite<DynamicItem, DynamicItem.C5440b> implements j1 {
    public static final int CARD_TYPE_FIELD_NUMBER = 1;
    private static final DynamicItem DEFAULT_INSTANCE;
    public static final int EXTEND_FIELD_NUMBER = 4;
    public static final int HAS_FOLD_FIELD_NUMBER = 5;
    public static final int ITEM_TYPE_FIELD_NUMBER = 2;
    public static final int MODULES_FIELD_NUMBER = 3;
    private static volatile Parser<DynamicItem> PARSER = null;
    public static final int SERVER_INFO_FIELD_NUMBER = 6;
    private int cardType_;
    private Extend extend_;
    private int hasFold_;
    private int itemType_;
    private Internal.ProtobufList<Module> modules_ = GeneratedMessageLite.emptyProtobufList();
    private String serverInfo_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.DynamicItem$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5439a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17288xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17288xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17288xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17288xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17288xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17288xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17288xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17288xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.DynamicItem$b */
    /* loaded from: classes19.dex */
    public static final class C5440b extends GeneratedMessageLite.Builder<DynamicItem, C5440b> implements j1 {
        /* synthetic */ C5440b(C5439a c5439a) {
            this();
        }

        public C5440b addAllModules(Iterable<? extends Module> iterable) {
            copyOnWrite();
            ((DynamicItem) this.instance).addAllModules(iterable);
            return this;
        }

        public C5440b addModules(Module module) {
            copyOnWrite();
            ((DynamicItem) this.instance).addModules(module);
            return this;
        }

        public C5440b clearCardType() {
            copyOnWrite();
            ((DynamicItem) this.instance).clearCardType();
            return this;
        }

        public C5440b clearExtend() {
            copyOnWrite();
            ((DynamicItem) this.instance).clearExtend();
            return this;
        }

        public C5440b clearHasFold() {
            copyOnWrite();
            ((DynamicItem) this.instance).clearHasFold();
            return this;
        }

        public C5440b clearItemType() {
            copyOnWrite();
            ((DynamicItem) this.instance).clearItemType();
            return this;
        }

        public C5440b clearModules() {
            copyOnWrite();
            ((DynamicItem) this.instance).clearModules();
            return this;
        }

        public C5440b clearServerInfo() {
            copyOnWrite();
            ((DynamicItem) this.instance).clearServerInfo();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.j1
        public DynamicType getCardType() {
            return ((DynamicItem) this.instance).getCardType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.j1
        public int getCardTypeValue() {
            return ((DynamicItem) this.instance).getCardTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.j1
        public Extend getExtend() {
            return ((DynamicItem) this.instance).getExtend();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.j1
        public int getHasFold() {
            return ((DynamicItem) this.instance).getHasFold();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.j1
        public DynamicType getItemType() {
            return ((DynamicItem) this.instance).getItemType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.j1
        public int getItemTypeValue() {
            return ((DynamicItem) this.instance).getItemTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.j1
        public Module getModules(int i2) {
            return ((DynamicItem) this.instance).getModules(i2);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.j1
        public int getModulesCount() {
            return ((DynamicItem) this.instance).getModulesCount();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.j1
        public List<Module> getModulesList() {
            return Collections.unmodifiableList(((DynamicItem) this.instance).getModulesList());
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.j1
        public String getServerInfo() {
            return ((DynamicItem) this.instance).getServerInfo();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.j1
        public ByteString getServerInfoBytes() {
            return ((DynamicItem) this.instance).getServerInfoBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.j1
        public boolean hasExtend() {
            return ((DynamicItem) this.instance).hasExtend();
        }

        public C5440b mergeExtend(Extend extend) {
            copyOnWrite();
            ((DynamicItem) this.instance).mergeExtend(extend);
            return this;
        }

        public C5440b removeModules(int i2) {
            copyOnWrite();
            ((DynamicItem) this.instance).removeModules(i2);
            return this;
        }

        public C5440b setCardType(DynamicType dynamicType) {
            copyOnWrite();
            ((DynamicItem) this.instance).setCardType(dynamicType);
            return this;
        }

        public C5440b setCardTypeValue(int i2) {
            copyOnWrite();
            ((DynamicItem) this.instance).setCardTypeValue(i2);
            return this;
        }

        public C5440b setExtend(Extend extend) {
            copyOnWrite();
            ((DynamicItem) this.instance).setExtend(extend);
            return this;
        }

        public C5440b setHasFold(int i2) {
            copyOnWrite();
            ((DynamicItem) this.instance).setHasFold(i2);
            return this;
        }

        public C5440b setItemType(DynamicType dynamicType) {
            copyOnWrite();
            ((DynamicItem) this.instance).setItemType(dynamicType);
            return this;
        }

        public C5440b setItemTypeValue(int i2) {
            copyOnWrite();
            ((DynamicItem) this.instance).setItemTypeValue(i2);
            return this;
        }

        public C5440b setModules(int i2, Module module) {
            copyOnWrite();
            ((DynamicItem) this.instance).setModules(i2, module);
            return this;
        }

        public C5440b setServerInfo(String str) {
            copyOnWrite();
            ((DynamicItem) this.instance).setServerInfo(str);
            return this;
        }

        public C5440b setServerInfoBytes(ByteString byteString) {
            copyOnWrite();
            ((DynamicItem) this.instance).setServerInfoBytes(byteString);
            return this;
        }

        private C5440b() {
            super(DynamicItem.DEFAULT_INSTANCE);
        }

        public C5440b addModules(int i2, Module module) {
            copyOnWrite();
            ((DynamicItem) this.instance).addModules(i2, module);
            return this;
        }
    }

    static {
        DynamicItem dynamicItem = new DynamicItem();
        DEFAULT_INSTANCE = dynamicItem;
        GeneratedMessageLite.registerDefaultInstance(DynamicItem.class, dynamicItem);
    }

    private DynamicItem() {
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
    public void clearCardType() {
        this.cardType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtend() {
        this.extend_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasFold() {
        this.hasFold_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemType() {
        this.itemType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModules() {
        this.modules_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerInfo() {
        this.serverInfo_ = getDefaultInstance().getServerInfo();
    }

    private void ensureModulesIsMutable() {
        Internal.ProtobufList<Module> protobufList = this.modules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.modules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DynamicItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtend(Extend extend) {
    }

    public static C5440b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DynamicItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DynamicItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynamicItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DynamicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DynamicItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeModules(int i2) {
        ensureModulesIsMutable();
        this.modules_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardType(DynamicType dynamicType) {
        this.cardType_ = dynamicType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardTypeValue(int i2) {
        this.cardType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtend(Extend extend) {
        extend.getClass();
        this.extend_ = extend;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasFold(int i2) {
        this.hasFold_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemType(DynamicType dynamicType) {
        this.itemType_ = dynamicType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemTypeValue(int i2) {
        this.itemType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModules(int i2, Module module) {
        module.getClass();
        ensureModulesIsMutable();
        this.modules_.set(i2, module);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerInfo(String str) {
        str.getClass();
        this.serverInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerInfoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.serverInfo_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5439a c5439a = null;
        switch (C5439a.f17288xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DynamicItem();
            case 2:
                return new C5440b(c5439a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u001b\u0004\t\u0005\u0004\u0006\u0208", new Object[]{"cardType_", "itemType_", "modules_", Module.class, "extend_", "hasFold_", "serverInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DynamicItem> parser = PARSER;
                if (parser == null) {
                    synchronized (DynamicItem.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.j1
    public DynamicType getCardType() {
        DynamicType forNumber = DynamicType.forNumber(this.cardType_);
        return forNumber == null ? DynamicType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.j1
    public int getCardTypeValue() {
        return this.cardType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.j1
    public Extend getExtend() {
        return this.extend_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.j1
    public int getHasFold() {
        return this.hasFold_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.j1
    public DynamicType getItemType() {
        DynamicType forNumber = DynamicType.forNumber(this.itemType_);
        return forNumber == null ? DynamicType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.j1
    public int getItemTypeValue() {
        return this.itemType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.j1
    public Module getModules(int i2) {
        return this.modules_.get(i2);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.j1
    public int getModulesCount() {
        return this.modules_.size();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.j1
    public List<Module> getModulesList() {
        return this.modules_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.j1
    public String getServerInfo() {
        return this.serverInfo_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.j1
    public ByteString getServerInfoBytes() {
        return ByteString.copyFromUtf8(this.serverInfo_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.j1
    public boolean hasExtend() {
        return this.extend_ != null;
    }

    public static C5440b newBuilder(DynamicItem dynamicItem) {
        return DEFAULT_INSTANCE.createBuilder(dynamicItem);
    }

    public static DynamicItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynamicItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DynamicItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DynamicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addModules(int i2, Module module) {
        module.getClass();
        ensureModulesIsMutable();
        this.modules_.add(i2, module);
    }

    public static DynamicItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DynamicItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DynamicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DynamicItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DynamicItem parseFrom(InputStream inputStream) throws IOException {
        return (DynamicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynamicItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynamicItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DynamicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DynamicItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
