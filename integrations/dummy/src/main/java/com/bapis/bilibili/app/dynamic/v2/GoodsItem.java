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
public final class GoodsItem extends GeneratedMessageLite<GoodsItem, GoodsItem.C5505b> implements w1 {
    public static final int AD_MARK_FIELD_NUMBER = 13;
    public static final int APP_NAME_FIELD_NUMBER = 14;
    public static final int BRIEF_FIELD_NUMBER = 7;
    public static final int CM_CACHE_PASSTHROUGH_FIELD_NUMBER = 16;
    public static final int COVER_FIELD_NUMBER = 1;
    private static final GoodsItem DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 9;
    public static final int JUMP_DESC_FIELD_NUMBER = 5;
    public static final int JUMP_TYPE_FIELD_NUMBER = 15;
    public static final int JUMP_URL_FIELD_NUMBER = 4;
    public static final int OPEN_WHITE_LIST_FIELD_NUMBER = 11;
    private static volatile Parser<GoodsItem> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 8;
    public static final int SCHEMA_PACKAGE_NAME_FIELD_NUMBER = 2;
    public static final int SCHEMA_URL_FIELD_NUMBER = 10;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int USER_WEB_V2_FIELD_NUMBER = 12;
    private long itemId_;
    private int jumpType_;
    private int sourceType_;
    private boolean userWebV2_;
    private String cover_ = "";
    private String schemaPackageName_ = "";
    private String jumpUrl_ = "";
    private String jumpDesc_ = "";
    private String title_ = "";
    private String brief_ = "";
    private String price_ = "";
    private String schemaUrl_ = "";
    private Internal.ProtobufList<String> openWhiteList_ = GeneratedMessageLite.emptyProtobufList();
    private String adMark_ = "";
    private String appName_ = "";
    private String cmCachePassthrough_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.GoodsItem$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5504a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17311xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17311xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17311xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17311xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17311xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17311xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17311xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17311xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.GoodsItem$b */
    /* loaded from: classes19.dex */
    public static final class C5505b extends GeneratedMessageLite.Builder<GoodsItem, C5505b> implements w1 {
        /* synthetic */ C5505b(C5504a c5504a) {
            this();
        }

        public C5505b addAllOpenWhiteList(Iterable<String> iterable) {
            copyOnWrite();
            ((GoodsItem) this.instance).addAllOpenWhiteList(iterable);
            return this;
        }

        public C5505b addOpenWhiteList(String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).addOpenWhiteList(str);
            return this;
        }

        public C5505b addOpenWhiteListBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsItem) this.instance).addOpenWhiteListBytes(byteString);
            return this;
        }

        public C5505b clearAdMark() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearAdMark();
            return this;
        }

        public C5505b clearAppName() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearAppName();
            return this;
        }

        public C5505b clearBrief() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearBrief();
            return this;
        }

        public C5505b clearCmCachePassthrough() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearCmCachePassthrough();
            return this;
        }

        public C5505b clearCover() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearCover();
            return this;
        }

        public C5505b clearItemId() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearItemId();
            return this;
        }

        public C5505b clearJumpDesc() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearJumpDesc();
            return this;
        }

        public C5505b clearJumpType() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearJumpType();
            return this;
        }

        public C5505b clearJumpUrl() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearJumpUrl();
            return this;
        }

        public C5505b clearOpenWhiteList() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearOpenWhiteList();
            return this;
        }

        public C5505b clearPrice() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearPrice();
            return this;
        }

        public C5505b clearSchemaPackageName() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearSchemaPackageName();
            return this;
        }

        public C5505b clearSchemaUrl() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearSchemaUrl();
            return this;
        }

        public C5505b clearSourceType() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearSourceType();
            return this;
        }

        public C5505b clearTitle() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearTitle();
            return this;
        }

        public C5505b clearUserWebV2() {
            copyOnWrite();
            ((GoodsItem) this.instance).clearUserWebV2();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public String getAdMark() {
            return ((GoodsItem) this.instance).getAdMark();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public ByteString getAdMarkBytes() {
            return ((GoodsItem) this.instance).getAdMarkBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public String getAppName() {
            return ((GoodsItem) this.instance).getAppName();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public ByteString getAppNameBytes() {
            return ((GoodsItem) this.instance).getAppNameBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public String getBrief() {
            return ((GoodsItem) this.instance).getBrief();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public ByteString getBriefBytes() {
            return ((GoodsItem) this.instance).getBriefBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public String getCmCachePassthrough() {
            return ((GoodsItem) this.instance).getCmCachePassthrough();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public ByteString getCmCachePassthroughBytes() {
            return ((GoodsItem) this.instance).getCmCachePassthroughBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public String getCover() {
            return ((GoodsItem) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public ByteString getCoverBytes() {
            return ((GoodsItem) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public long getItemId() {
            return ((GoodsItem) this.instance).getItemId();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public String getJumpDesc() {
            return ((GoodsItem) this.instance).getJumpDesc();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public ByteString getJumpDescBytes() {
            return ((GoodsItem) this.instance).getJumpDescBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public GoodsJumpType getJumpType() {
            return ((GoodsItem) this.instance).getJumpType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public int getJumpTypeValue() {
            return ((GoodsItem) this.instance).getJumpTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public String getJumpUrl() {
            return ((GoodsItem) this.instance).getJumpUrl();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public ByteString getJumpUrlBytes() {
            return ((GoodsItem) this.instance).getJumpUrlBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public String getOpenWhiteList(int i2) {
            return ((GoodsItem) this.instance).getOpenWhiteList(i2);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public ByteString getOpenWhiteListBytes(int i2) {
            return ((GoodsItem) this.instance).getOpenWhiteListBytes(i2);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public int getOpenWhiteListCount() {
            return ((GoodsItem) this.instance).getOpenWhiteListCount();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public List<String> getOpenWhiteListList() {
            return Collections.unmodifiableList(((GoodsItem) this.instance).getOpenWhiteListList());
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public String getPrice() {
            return ((GoodsItem) this.instance).getPrice();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public ByteString getPriceBytes() {
            return ((GoodsItem) this.instance).getPriceBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public String getSchemaPackageName() {
            return ((GoodsItem) this.instance).getSchemaPackageName();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public ByteString getSchemaPackageNameBytes() {
            return ((GoodsItem) this.instance).getSchemaPackageNameBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public String getSchemaUrl() {
            return ((GoodsItem) this.instance).getSchemaUrl();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public ByteString getSchemaUrlBytes() {
            return ((GoodsItem) this.instance).getSchemaUrlBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public int getSourceType() {
            return ((GoodsItem) this.instance).getSourceType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public String getTitle() {
            return ((GoodsItem) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public ByteString getTitleBytes() {
            return ((GoodsItem) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.w1
        public boolean getUserWebV2() {
            return ((GoodsItem) this.instance).getUserWebV2();
        }

        public C5505b setAdMark(String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).setAdMark(str);
            return this;
        }

        public C5505b setAdMarkBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsItem) this.instance).setAdMarkBytes(byteString);
            return this;
        }

        public C5505b setAppName(String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).setAppName(str);
            return this;
        }

        public C5505b setAppNameBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsItem) this.instance).setAppNameBytes(byteString);
            return this;
        }

        public C5505b setBrief(String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).setBrief(str);
            return this;
        }

        public C5505b setBriefBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsItem) this.instance).setBriefBytes(byteString);
            return this;
        }

        public C5505b setCmCachePassthrough(String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).setCmCachePassthrough(str);
            return this;
        }

        public C5505b setCmCachePassthroughBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsItem) this.instance).setCmCachePassthroughBytes(byteString);
            return this;
        }

        public C5505b setCover(String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).setCover(str);
            return this;
        }

        public C5505b setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsItem) this.instance).setCoverBytes(byteString);
            return this;
        }

        public C5505b setItemId(long j2) {
            copyOnWrite();
            ((GoodsItem) this.instance).setItemId(j2);
            return this;
        }

        public C5505b setJumpDesc(String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).setJumpDesc(str);
            return this;
        }

        public C5505b setJumpDescBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsItem) this.instance).setJumpDescBytes(byteString);
            return this;
        }

        public C5505b setJumpType(GoodsJumpType goodsJumpType) {
            copyOnWrite();
            ((GoodsItem) this.instance).setJumpType(goodsJumpType);
            return this;
        }

        public C5505b setJumpTypeValue(int i2) {
            copyOnWrite();
            ((GoodsItem) this.instance).setJumpTypeValue(i2);
            return this;
        }

        public C5505b setJumpUrl(String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).setJumpUrl(str);
            return this;
        }

        public C5505b setJumpUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsItem) this.instance).setJumpUrlBytes(byteString);
            return this;
        }

        public C5505b setOpenWhiteList(int i2, String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).setOpenWhiteList(i2, str);
            return this;
        }

        public C5505b setPrice(String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).setPrice(str);
            return this;
        }

        public C5505b setPriceBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsItem) this.instance).setPriceBytes(byteString);
            return this;
        }

        public C5505b setSchemaPackageName(String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).setSchemaPackageName(str);
            return this;
        }

        public C5505b setSchemaPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsItem) this.instance).setSchemaPackageNameBytes(byteString);
            return this;
        }

        public C5505b setSchemaUrl(String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).setSchemaUrl(str);
            return this;
        }

        public C5505b setSchemaUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsItem) this.instance).setSchemaUrlBytes(byteString);
            return this;
        }

        public C5505b setSourceType(int i2) {
            copyOnWrite();
            ((GoodsItem) this.instance).setSourceType(i2);
            return this;
        }

        public C5505b setTitle(String str) {
            copyOnWrite();
            ((GoodsItem) this.instance).setTitle(str);
            return this;
        }

        public C5505b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((GoodsItem) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C5505b setUserWebV2(boolean z) {
            copyOnWrite();
            ((GoodsItem) this.instance).setUserWebV2(z);
            return this;
        }

        private C5505b() {
            super(GoodsItem.DEFAULT_INSTANCE);
        }
    }

    static {
        GoodsItem goodsItem = new GoodsItem();
        DEFAULT_INSTANCE = goodsItem;
        GeneratedMessageLite.registerDefaultInstance(GoodsItem.class, goodsItem);
    }

    private GoodsItem() {
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
    public void clearBrief() {
        this.brief_ = getDefaultInstance().getBrief();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmCachePassthrough() {
        this.cmCachePassthrough_ = getDefaultInstance().getCmCachePassthrough();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemId() {
        this.itemId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpDesc() {
        this.jumpDesc_ = getDefaultInstance().getJumpDesc();
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
    public void clearPrice() {
        this.price_ = getDefaultInstance().getPrice();
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
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
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

    public static GoodsItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5505b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GoodsItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GoodsItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GoodsItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GoodsItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GoodsItem> parser() {
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
    public void setBrief(String str) {
        str.getClass();
        this.brief_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBriefBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.brief_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmCachePassthrough(String str) {
        str.getClass();
        this.cmCachePassthrough_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmCachePassthroughBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cmCachePassthrough_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemId(long j2) {
        this.itemId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpDesc(String str) {
        str.getClass();
        this.jumpDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpDesc_ = byteString.toStringUtf8();
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
    public void setPrice(String str) {
        str.getClass();
        this.price_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.price_ = byteString.toStringUtf8();
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
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserWebV2(boolean z) {
        this.userWebV2_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5504a c5504a = null;
        switch (C5504a.f17311xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GoodsItem();
            case 2:
                return new C5505b(c5504a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0004\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0002\n\u0208\u000b\u021a\f\u0007\r\u0208\u000e\u0208\u000f\f\u0010\u0208", new Object[]{"cover_", "schemaPackageName_", "sourceType_", "jumpUrl_", "jumpDesc_", "title_", "brief_", "price_", "itemId_", "schemaUrl_", "openWhiteList_", "userWebV2_", "adMark_", "appName_", "jumpType_", "cmCachePassthrough_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GoodsItem> parser = PARSER;
                if (parser == null) {
                    synchronized (GoodsItem.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public String getAdMark() {
        return this.adMark_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public ByteString getAdMarkBytes() {
        return ByteString.copyFromUtf8(this.adMark_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public String getAppName() {
        return this.appName_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public ByteString getAppNameBytes() {
        return ByteString.copyFromUtf8(this.appName_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public String getBrief() {
        return this.brief_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public ByteString getBriefBytes() {
        return ByteString.copyFromUtf8(this.brief_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public String getCmCachePassthrough() {
        return this.cmCachePassthrough_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public ByteString getCmCachePassthroughBytes() {
        return ByteString.copyFromUtf8(this.cmCachePassthrough_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public long getItemId() {
        return this.itemId_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public String getJumpDesc() {
        return this.jumpDesc_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public ByteString getJumpDescBytes() {
        return ByteString.copyFromUtf8(this.jumpDesc_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public GoodsJumpType getJumpType() {
        GoodsJumpType forNumber = GoodsJumpType.forNumber(this.jumpType_);
        return forNumber == null ? GoodsJumpType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public int getJumpTypeValue() {
        return this.jumpType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public String getJumpUrl() {
        return this.jumpUrl_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public ByteString getJumpUrlBytes() {
        return ByteString.copyFromUtf8(this.jumpUrl_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public String getOpenWhiteList(int i2) {
        return this.openWhiteList_.get(i2);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public ByteString getOpenWhiteListBytes(int i2) {
        return ByteString.copyFromUtf8(this.openWhiteList_.get(i2));
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public int getOpenWhiteListCount() {
        return this.openWhiteList_.size();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public List<String> getOpenWhiteListList() {
        return this.openWhiteList_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public String getPrice() {
        return this.price_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public ByteString getPriceBytes() {
        return ByteString.copyFromUtf8(this.price_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public String getSchemaPackageName() {
        return this.schemaPackageName_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public ByteString getSchemaPackageNameBytes() {
        return ByteString.copyFromUtf8(this.schemaPackageName_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public String getSchemaUrl() {
        return this.schemaUrl_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public ByteString getSchemaUrlBytes() {
        return ByteString.copyFromUtf8(this.schemaUrl_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public int getSourceType() {
        return this.sourceType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.w1
    public boolean getUserWebV2() {
        return this.userWebV2_;
    }

    public static C5505b newBuilder(GoodsItem goodsItem) {
        return DEFAULT_INSTANCE.createBuilder(goodsItem);
    }

    public static GoodsItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GoodsItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GoodsItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GoodsItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GoodsItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GoodsItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GoodsItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GoodsItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GoodsItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GoodsItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GoodsItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GoodsItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GoodsItem parseFrom(InputStream inputStream) throws IOException {
        return (GoodsItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GoodsItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GoodsItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GoodsItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GoodsItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GoodsItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GoodsItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
