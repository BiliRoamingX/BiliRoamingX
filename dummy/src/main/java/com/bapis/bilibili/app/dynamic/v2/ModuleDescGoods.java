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
public final class ModuleDescGoods extends GeneratedMessageLite<ModuleDescGoods, ModuleDescGoods.C5759b> implements ea {
    public static final int AD_MARK_FIELD_NUMBER = 7;
    public static final int APP_NAME_FIELD_NUMBER = 10;
    private static final ModuleDescGoods DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 4;
    public static final int JUMP_TYPE_FIELD_NUMBER = 9;
    public static final int JUMP_URL_FIELD_NUMBER = 2;
    public static final int OPEN_WHITE_LIST_FIELD_NUMBER = 5;
    private static volatile Parser<ModuleDescGoods> PARSER = null;
    public static final int SCHEMA_PACKAGE_NAME_FIELD_NUMBER = 8;
    public static final int SCHEMA_URL_FIELD_NUMBER = 3;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 1;
    public static final int USER_WEB_V2_FIELD_NUMBER = 6;
    private long itemId_;
    private int jumpType_;
    private int sourceType_;
    private boolean userWebV2_;
    private String jumpUrl_ = "";
    private String schemaUrl_ = "";
    private Internal.ProtobufList<String> openWhiteList_ = GeneratedMessageLite.emptyProtobufList();
    private String adMark_ = "";
    private String schemaPackageName_ = "";
    private String appName_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.ModuleDescGoods$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5758a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17382xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17382xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17382xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17382xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17382xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17382xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17382xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17382xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.ModuleDescGoods$b */
    /* loaded from: classes19.dex */
    public static final class C5759b extends GeneratedMessageLite.Builder<ModuleDescGoods, C5759b> implements ea {
        /* synthetic */ C5759b(C5758a c5758a) {
            this();
        }

        public C5759b addAllOpenWhiteList(Iterable<String> iterable) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).addAllOpenWhiteList(iterable);
            return this;
        }

        public C5759b addOpenWhiteList(String str) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).addOpenWhiteList(str);
            return this;
        }

        public C5759b addOpenWhiteListBytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).addOpenWhiteListBytes(byteString);
            return this;
        }

        public C5759b clearAdMark() {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).clearAdMark();
            return this;
        }

        public C5759b clearAppName() {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).clearAppName();
            return this;
        }

        public C5759b clearItemId() {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).clearItemId();
            return this;
        }

        public C5759b clearJumpType() {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).clearJumpType();
            return this;
        }

        public C5759b clearJumpUrl() {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).clearJumpUrl();
            return this;
        }

        public C5759b clearOpenWhiteList() {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).clearOpenWhiteList();
            return this;
        }

        public C5759b clearSchemaPackageName() {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).clearSchemaPackageName();
            return this;
        }

        public C5759b clearSchemaUrl() {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).clearSchemaUrl();
            return this;
        }

        public C5759b clearSourceType() {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).clearSourceType();
            return this;
        }

        public C5759b clearUserWebV2() {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).clearUserWebV2();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public String getAdMark() {
            return ((ModuleDescGoods) this.instance).getAdMark();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public ByteString getAdMarkBytes() {
            return ((ModuleDescGoods) this.instance).getAdMarkBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public String getAppName() {
            return ((ModuleDescGoods) this.instance).getAppName();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public ByteString getAppNameBytes() {
            return ((ModuleDescGoods) this.instance).getAppNameBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public long getItemId() {
            return ((ModuleDescGoods) this.instance).getItemId();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public GoodsJumpType getJumpType() {
            return ((ModuleDescGoods) this.instance).getJumpType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public int getJumpTypeValue() {
            return ((ModuleDescGoods) this.instance).getJumpTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public String getJumpUrl() {
            return ((ModuleDescGoods) this.instance).getJumpUrl();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public ByteString getJumpUrlBytes() {
            return ((ModuleDescGoods) this.instance).getJumpUrlBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public String getOpenWhiteList(int i2) {
            return ((ModuleDescGoods) this.instance).getOpenWhiteList(i2);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public ByteString getOpenWhiteListBytes(int i2) {
            return ((ModuleDescGoods) this.instance).getOpenWhiteListBytes(i2);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public int getOpenWhiteListCount() {
            return ((ModuleDescGoods) this.instance).getOpenWhiteListCount();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public List<String> getOpenWhiteListList() {
            return Collections.unmodifiableList(((ModuleDescGoods) this.instance).getOpenWhiteListList());
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public String getSchemaPackageName() {
            return ((ModuleDescGoods) this.instance).getSchemaPackageName();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public ByteString getSchemaPackageNameBytes() {
            return ((ModuleDescGoods) this.instance).getSchemaPackageNameBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public String getSchemaUrl() {
            return ((ModuleDescGoods) this.instance).getSchemaUrl();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public ByteString getSchemaUrlBytes() {
            return ((ModuleDescGoods) this.instance).getSchemaUrlBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public int getSourceType() {
            return ((ModuleDescGoods) this.instance).getSourceType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ea
        public boolean getUserWebV2() {
            return ((ModuleDescGoods) this.instance).getUserWebV2();
        }

        public C5759b setAdMark(String str) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setAdMark(str);
            return this;
        }

        public C5759b setAdMarkBytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setAdMarkBytes(byteString);
            return this;
        }

        public C5759b setAppName(String str) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setAppName(str);
            return this;
        }

        public C5759b setAppNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setAppNameBytes(byteString);
            return this;
        }

        public C5759b setItemId(long j2) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setItemId(j2);
            return this;
        }

        public C5759b setJumpType(GoodsJumpType goodsJumpType) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setJumpType(goodsJumpType);
            return this;
        }

        public C5759b setJumpTypeValue(int i2) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setJumpTypeValue(i2);
            return this;
        }

        public C5759b setJumpUrl(String str) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setJumpUrl(str);
            return this;
        }

        public C5759b setJumpUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setJumpUrlBytes(byteString);
            return this;
        }

        public C5759b setOpenWhiteList(int i2, String str) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setOpenWhiteList(i2, str);
            return this;
        }

        public C5759b setSchemaPackageName(String str) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setSchemaPackageName(str);
            return this;
        }

        public C5759b setSchemaPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setSchemaPackageNameBytes(byteString);
            return this;
        }

        public C5759b setSchemaUrl(String str) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setSchemaUrl(str);
            return this;
        }

        public C5759b setSchemaUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setSchemaUrlBytes(byteString);
            return this;
        }

        public C5759b setSourceType(int i2) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setSourceType(i2);
            return this;
        }

        public C5759b setUserWebV2(boolean z) {
            copyOnWrite();
            ((ModuleDescGoods) this.instance).setUserWebV2(z);
            return this;
        }

        private C5759b() {
            super(ModuleDescGoods.DEFAULT_INSTANCE);
        }
    }

    static {
        ModuleDescGoods moduleDescGoods = new ModuleDescGoods();
        DEFAULT_INSTANCE = moduleDescGoods;
        GeneratedMessageLite.registerDefaultInstance(ModuleDescGoods.class, moduleDescGoods);
    }

    private ModuleDescGoods() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOpenWhiteList(Iterable<String> iterable) {
        ensureOpenWhiteListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.openWhiteList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpenWhiteList(String str) {
        str.getClass();
        ensureOpenWhiteListIsMutable();
        this.openWhiteList_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpenWhiteListBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureOpenWhiteListIsMutable();
        this.openWhiteList_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdMark() {
        this.adMark_ = getDefaultInstance().getAdMark();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppName() {
        this.appName_ = getDefaultInstance().getAppName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemId() {
        this.itemId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpType() {
        this.jumpType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpUrl() {
        this.jumpUrl_ = getDefaultInstance().getJumpUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenWhiteList() {
        this.openWhiteList_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaPackageName() {
        this.schemaPackageName_ = getDefaultInstance().getSchemaPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaUrl() {
        this.schemaUrl_ = getDefaultInstance().getSchemaUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceType() {
        this.sourceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserWebV2() {
        this.userWebV2_ = false;
    }

    private void ensureOpenWhiteListIsMutable() {
        Internal.ProtobufList<String> protobufList = this.openWhiteList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.openWhiteList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ModuleDescGoods getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5759b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ModuleDescGoods parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ModuleDescGoods) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModuleDescGoods parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModuleDescGoods) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ModuleDescGoods> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdMark(String str) {
        str.getClass();
        this.adMark_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdMarkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adMark_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppName(String str) {
        str.getClass();
        this.appName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemId(long j2) {
        this.itemId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpType(GoodsJumpType goodsJumpType) {
        this.jumpType_ = goodsJumpType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpTypeValue(int i2) {
        this.jumpType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpUrl(String str) {
        str.getClass();
        this.jumpUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenWhiteList(int i2, String str) {
        str.getClass();
        ensureOpenWhiteListIsMutable();
        this.openWhiteList_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaPackageName(String str) {
        str.getClass();
        this.schemaPackageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaPackageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.schemaPackageName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaUrl(String str) {
        str.getClass();
        this.schemaUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.schemaUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceType(int i2) {
        this.sourceType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserWebV2(boolean z) {
        this.userWebV2_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5758a c5758a = null;
        switch (C5758a.f17382xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ModuleDescGoods();
            case 2:
                return new C5759b(c5758a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001\u0004\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u021a\u0006\u0007\u0007\u0208\b\u0208\t\f\n\u0208", new Object[]{"sourceType_", "jumpUrl_", "schemaUrl_", "itemId_", "openWhiteList_", "userWebV2_", "adMark_", "schemaPackageName_", "jumpType_", "appName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ModuleDescGoods> parser = PARSER;
                if (parser == null) {
                    synchronized (ModuleDescGoods.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public String getAdMark() {
        return this.adMark_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public ByteString getAdMarkBytes() {
        return ByteString.copyFromUtf8(this.adMark_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public String getAppName() {
        return this.appName_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public ByteString getAppNameBytes() {
        return ByteString.copyFromUtf8(this.appName_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public long getItemId() {
        return this.itemId_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public GoodsJumpType getJumpType() {
        GoodsJumpType forNumber = GoodsJumpType.forNumber(this.jumpType_);
        return forNumber == null ? GoodsJumpType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public int getJumpTypeValue() {
        return this.jumpType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public String getJumpUrl() {
        return this.jumpUrl_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public ByteString getJumpUrlBytes() {
        return ByteString.copyFromUtf8(this.jumpUrl_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public String getOpenWhiteList(int i2) {
        return this.openWhiteList_.get(i2);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public ByteString getOpenWhiteListBytes(int i2) {
        return ByteString.copyFromUtf8(this.openWhiteList_.get(i2));
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public int getOpenWhiteListCount() {
        return this.openWhiteList_.size();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public List<String> getOpenWhiteListList() {
        return this.openWhiteList_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public String getSchemaPackageName() {
        return this.schemaPackageName_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public ByteString getSchemaPackageNameBytes() {
        return ByteString.copyFromUtf8(this.schemaPackageName_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public String getSchemaUrl() {
        return this.schemaUrl_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public ByteString getSchemaUrlBytes() {
        return ByteString.copyFromUtf8(this.schemaUrl_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public int getSourceType() {
        return this.sourceType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ea
    public boolean getUserWebV2() {
        return this.userWebV2_;
    }

    public static C5759b newBuilder(ModuleDescGoods moduleDescGoods) {
        return DEFAULT_INSTANCE.createBuilder(moduleDescGoods);
    }

    public static ModuleDescGoods parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModuleDescGoods) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ModuleDescGoods parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModuleDescGoods) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ModuleDescGoods parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ModuleDescGoods) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ModuleDescGoods parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModuleDescGoods) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ModuleDescGoods parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ModuleDescGoods) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ModuleDescGoods parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModuleDescGoods) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ModuleDescGoods parseFrom(InputStream inputStream) throws IOException {
        return (ModuleDescGoods) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModuleDescGoods parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModuleDescGoods) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ModuleDescGoods parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ModuleDescGoods) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ModuleDescGoods parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModuleDescGoods) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
