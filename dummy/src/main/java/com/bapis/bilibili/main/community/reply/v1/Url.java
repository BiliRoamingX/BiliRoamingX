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

/* compiled from: BL */
/* loaded from: classes21.dex */
public final class Url extends GeneratedMessageLite<Url, Url.C14896b> implements MessageLiteOrBuilder {
    public static final int APP_NAME_FIELD_NUMBER = 5;
    public static final int APP_PACKAGE_NAME_FIELD_NUMBER = 6;
    public static final int APP_URL_SCHEMA_FIELD_NUMBER = 4;
    public static final int CLICK_REPORT_FIELD_NUMBER = 7;
    private static final Url DEFAULT_INSTANCE;
    public static final int EXPOSURE_REPORT_FIELD_NUMBER = 9;
    public static final int EXTRA_FIELD_NUMBER = 10;
    public static final int ICON_POSITION_FIELD_NUMBER = 14;
    public static final int IS_HALF_SCREEN_FIELD_NUMBER = 8;
    public static final int MATCH_ONCE_FIELD_NUMBER = 12;
    private static volatile Parser<Url> PARSER = null;
    public static final int PC_URL_FIELD_NUMBER = 13;
    public static final int PREFIX_ICON_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int UNDERLINE_FIELD_NUMBER = 11;
    private Extra extra_;
    private int iconPosition_;
    private boolean isHalfScreen_;
    private boolean matchOnce_;
    private long state_;
    private boolean underline_;
    private String title_ = "";
    private String prefixIcon_ = "";
    private String appUrlSchema_ = "";
    private String appName_ = "";
    private String appPackageName_ = "";
    private String clickReport_ = "";
    private String exposureReport_ = "";
    private String pcUrl_ = "";

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class Extra extends GeneratedMessageLite<Extra, Extra.C14892a> implements MessageLiteOrBuilder {
        private static final Extra DEFAULT_INSTANCE;
        public static final int GOODS_CLICK_REPORT_FIELD_NUMBER = 6;
        public static final int GOODS_CM_CONTROL_FIELD_NUMBER = 5;
        public static final int GOODS_EXPOSURE_REPORT_FIELD_NUMBER = 7;
        public static final int GOODS_ITEM_ID_FIELD_NUMBER = 1;
        public static final int GOODS_PREFETCHED_CACHE_FIELD_NUMBER = 2;
        public static final int GOODS_SHOW_POP_WINDOW_FIELD_NUMBER = 8;
        public static final int GOODS_SHOW_TYPE_FIELD_NUMBER = 3;
        public static final int IS_WORD_SEARCH_FIELD_NUMBER = 4;
        private static volatile Parser<Extra> PARSER;
        private long goodsCmControl_;
        private long goodsItemId_;
        private long goodsShowPopWindow_;
        private int goodsShowType_;
        private boolean isWordSearch_;
        private String goodsPrefetchedCache_ = "";
        private String goodsClickReport_ = "";
        private String goodsExposureReport_ = "";

        /* compiled from: BL */
        /* loaded from: classes21.dex */
        public enum GoodsShowType implements Internal.EnumLite {
            Popup(0),
            FullScreen(1),
            HalfScreen(2),
            UNRECOGNIZED(-1);
            
            public static final int FullScreen_VALUE = 1;
            public static final int HalfScreen_VALUE = 2;
            public static final int Popup_VALUE = 0;
            private static final Internal.EnumLiteMap<GoodsShowType> internalValueMap = new C14890a();
            private final int value;

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.Url$Extra$GoodsShowType$a */
            /* loaded from: classes21.dex */
            static class C14890a implements Internal.EnumLiteMap<GoodsShowType> {
                C14890a() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public GoodsShowType findValueByNumber(int i) {
                    return GoodsShowType.forNumber(i);
                }
            }

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.Url$Extra$GoodsShowType$b */
            /* loaded from: classes21.dex */
            private static final class C14891b implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new C14891b();

                private C14891b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return GoodsShowType.forNumber(i) != null;
                }
            }

            GoodsShowType(int i) {
                this.value = i;
            }

            public static GoodsShowType forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return HalfScreen;
                    }
                    return FullScreen;
                }
                return Popup;
            }

            public static Internal.EnumLiteMap<GoodsShowType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return C14891b.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static GoodsShowType valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.Url$Extra$a */
        /* loaded from: classes21.dex */
        public static final class C14892a extends GeneratedMessageLite.Builder<Extra, C14892a> implements MessageLiteOrBuilder {
            /* synthetic */ C14892a(C14895a c14895a) {
                this();
            }

            public C14892a clearGoodsClickReport() {
                copyOnWrite();
                ((Extra) this.instance).clearGoodsClickReport();
                return this;
            }

            public C14892a clearGoodsCmControl() {
                copyOnWrite();
                ((Extra) this.instance).clearGoodsCmControl();
                return this;
            }

            public C14892a clearGoodsExposureReport() {
                copyOnWrite();
                ((Extra) this.instance).clearGoodsExposureReport();
                return this;
            }

            public C14892a clearGoodsItemId() {
                copyOnWrite();
                ((Extra) this.instance).clearGoodsItemId();
                return this;
            }

            public C14892a clearGoodsPrefetchedCache() {
                copyOnWrite();
                ((Extra) this.instance).clearGoodsPrefetchedCache();
                return this;
            }

            public C14892a clearGoodsShowPopWindow() {
                copyOnWrite();
                ((Extra) this.instance).clearGoodsShowPopWindow();
                return this;
            }

            public C14892a clearGoodsShowType() {
                copyOnWrite();
                ((Extra) this.instance).clearGoodsShowType();
                return this;
            }

            public C14892a clearIsWordSearch() {
                copyOnWrite();
                ((Extra) this.instance).clearIsWordSearch();
                return this;
            }

            public String getGoodsClickReport() {
                return ((Extra) this.instance).getGoodsClickReport();
            }

            public ByteString getGoodsClickReportBytes() {
                return ((Extra) this.instance).getGoodsClickReportBytes();
            }

            public long getGoodsCmControl() {
                return ((Extra) this.instance).getGoodsCmControl();
            }

            public String getGoodsExposureReport() {
                return ((Extra) this.instance).getGoodsExposureReport();
            }

            public ByteString getGoodsExposureReportBytes() {
                return ((Extra) this.instance).getGoodsExposureReportBytes();
            }

            public long getGoodsItemId() {
                return ((Extra) this.instance).getGoodsItemId();
            }

            public String getGoodsPrefetchedCache() {
                return ((Extra) this.instance).getGoodsPrefetchedCache();
            }

            public ByteString getGoodsPrefetchedCacheBytes() {
                return ((Extra) this.instance).getGoodsPrefetchedCacheBytes();
            }

            public long getGoodsShowPopWindow() {
                return ((Extra) this.instance).getGoodsShowPopWindow();
            }

            public GoodsShowType getGoodsShowType() {
                return ((Extra) this.instance).getGoodsShowType();
            }

            public int getGoodsShowTypeValue() {
                return ((Extra) this.instance).getGoodsShowTypeValue();
            }

            public boolean getIsWordSearch() {
                return ((Extra) this.instance).getIsWordSearch();
            }

            public C14892a setGoodsClickReport(String str) {
                copyOnWrite();
                ((Extra) this.instance).setGoodsClickReport(str);
                return this;
            }

            public C14892a setGoodsClickReportBytes(ByteString byteString) {
                copyOnWrite();
                ((Extra) this.instance).setGoodsClickReportBytes(byteString);
                return this;
            }

            public C14892a setGoodsCmControl(long j) {
                copyOnWrite();
                ((Extra) this.instance).setGoodsCmControl(j);
                return this;
            }

            public C14892a setGoodsExposureReport(String str) {
                copyOnWrite();
                ((Extra) this.instance).setGoodsExposureReport(str);
                return this;
            }

            public C14892a setGoodsExposureReportBytes(ByteString byteString) {
                copyOnWrite();
                ((Extra) this.instance).setGoodsExposureReportBytes(byteString);
                return this;
            }

            public C14892a setGoodsItemId(long j) {
                copyOnWrite();
                ((Extra) this.instance).setGoodsItemId(j);
                return this;
            }

            public C14892a setGoodsPrefetchedCache(String str) {
                copyOnWrite();
                ((Extra) this.instance).setGoodsPrefetchedCache(str);
                return this;
            }

            public C14892a setGoodsPrefetchedCacheBytes(ByteString byteString) {
                copyOnWrite();
                ((Extra) this.instance).setGoodsPrefetchedCacheBytes(byteString);
                return this;
            }

            public C14892a setGoodsShowPopWindow(long j) {
                copyOnWrite();
                ((Extra) this.instance).setGoodsShowPopWindow(j);
                return this;
            }

            public C14892a setGoodsShowType(GoodsShowType goodsShowType) {
                copyOnWrite();
                ((Extra) this.instance).setGoodsShowType(goodsShowType);
                return this;
            }

            public C14892a setGoodsShowTypeValue(int i) {
                copyOnWrite();
                ((Extra) this.instance).setGoodsShowTypeValue(i);
                return this;
            }

            public C14892a setIsWordSearch(boolean z) {
                copyOnWrite();
                ((Extra) this.instance).setIsWordSearch(z);
                return this;
            }

            private C14892a() {
                super(Extra.DEFAULT_INSTANCE);
            }
        }

        static {
            Extra extra = new Extra();
            DEFAULT_INSTANCE = extra;
            GeneratedMessageLite.registerDefaultInstance(Extra.class, extra);
        }

        private Extra() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoodsClickReport() {
            this.goodsClickReport_ = getDefaultInstance().getGoodsClickReport();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoodsCmControl() {
            this.goodsCmControl_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoodsExposureReport() {
            this.goodsExposureReport_ = getDefaultInstance().getGoodsExposureReport();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoodsItemId() {
            this.goodsItemId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoodsPrefetchedCache() {
            this.goodsPrefetchedCache_ = getDefaultInstance().getGoodsPrefetchedCache();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoodsShowPopWindow() {
            this.goodsShowPopWindow_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoodsShowType() {
            this.goodsShowType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsWordSearch() {
            this.isWordSearch_ = false;
        }

        public static Extra getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C14892a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Extra parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Extra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Extra parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Extra> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoodsClickReport(String str) {
            str.getClass();
            this.goodsClickReport_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoodsClickReportBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.goodsClickReport_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoodsCmControl(long j) {
            this.goodsCmControl_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoodsExposureReport(String str) {
            str.getClass();
            this.goodsExposureReport_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoodsExposureReportBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.goodsExposureReport_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoodsItemId(long j) {
            this.goodsItemId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoodsPrefetchedCache(String str) {
            str.getClass();
            this.goodsPrefetchedCache_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoodsPrefetchedCacheBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.goodsPrefetchedCache_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoodsShowPopWindow(long j) {
            this.goodsShowPopWindow_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoodsShowType(GoodsShowType goodsShowType) {
            this.goodsShowType_ = goodsShowType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoodsShowTypeValue(int i) {
            this.goodsShowType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsWordSearch(boolean z) {
            this.isWordSearch_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14895a.f22048xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Extra();
                case 2:
                    return new C14892a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\f\u0004\u0007\u0005\u0002\u0006\u0208\u0007\u0208\b\u0002", new Object[]{"goodsItemId_", "goodsPrefetchedCache_", "goodsShowType_", "isWordSearch_", "goodsCmControl_", "goodsClickReport_", "goodsExposureReport_", "goodsShowPopWindow_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Extra> parser = PARSER;
                    if (parser == null) {
                        synchronized (Extra.class) {
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

        public String getGoodsClickReport() {
            return this.goodsClickReport_;
        }

        public ByteString getGoodsClickReportBytes() {
            return ByteString.copyFromUtf8(this.goodsClickReport_);
        }

        public long getGoodsCmControl() {
            return this.goodsCmControl_;
        }

        public String getGoodsExposureReport() {
            return this.goodsExposureReport_;
        }

        public ByteString getGoodsExposureReportBytes() {
            return ByteString.copyFromUtf8(this.goodsExposureReport_);
        }

        public long getGoodsItemId() {
            return this.goodsItemId_;
        }

        public String getGoodsPrefetchedCache() {
            return this.goodsPrefetchedCache_;
        }

        public ByteString getGoodsPrefetchedCacheBytes() {
            return ByteString.copyFromUtf8(this.goodsPrefetchedCache_);
        }

        public long getGoodsShowPopWindow() {
            return this.goodsShowPopWindow_;
        }

        public GoodsShowType getGoodsShowType() {
            GoodsShowType forNumber = GoodsShowType.forNumber(this.goodsShowType_);
            return forNumber == null ? GoodsShowType.UNRECOGNIZED : forNumber;
        }

        public int getGoodsShowTypeValue() {
            return this.goodsShowType_;
        }

        public boolean getIsWordSearch() {
            return this.isWordSearch_;
        }

        public static C14892a newBuilder(Extra extra) {
            return DEFAULT_INSTANCE.createBuilder(extra);
        }

        public static Extra parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Extra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Extra parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Extra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Extra parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Extra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Extra parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Extra parseFrom(InputStream inputStream) throws IOException {
            return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Extra parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Extra parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Extra parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public enum IconPosition implements Internal.EnumLite {
        Prefix(0),
        Suffix(1),
        UNRECOGNIZED(-1);
        
        public static final int Prefix_VALUE = 0;
        public static final int Suffix_VALUE = 1;
        private static final Internal.EnumLiteMap<IconPosition> internalValueMap = new C14893a();
        private final int value;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.Url$IconPosition$a */
        /* loaded from: classes21.dex */
        static class C14893a implements Internal.EnumLiteMap<IconPosition> {
            C14893a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public IconPosition findValueByNumber(int i) {
                return IconPosition.forNumber(i);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.Url$IconPosition$b */
        /* loaded from: classes21.dex */
        private static final class C14894b implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new C14894b();

            private C14894b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return IconPosition.forNumber(i) != null;
            }
        }

        IconPosition(int i) {
            this.value = i;
        }

        public static IconPosition forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return Suffix;
            }
            return Prefix;
        }

        public static Internal.EnumLiteMap<IconPosition> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C14894b.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static IconPosition valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Url$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14895a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22048xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22048xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22048xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22048xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22048xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22048xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22048xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22048xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Url$b */
    /* loaded from: classes21.dex */
    public static final class C14896b extends GeneratedMessageLite.Builder<Url, C14896b> implements MessageLiteOrBuilder {
        /* synthetic */ C14896b(C14895a c14895a) {
            this();
        }

        public C14896b clearAppName() {
            copyOnWrite();
            ((Url) this.instance).clearAppName();
            return this;
        }

        public C14896b clearAppPackageName() {
            copyOnWrite();
            ((Url) this.instance).clearAppPackageName();
            return this;
        }

        public C14896b clearAppUrlSchema() {
            copyOnWrite();
            ((Url) this.instance).clearAppUrlSchema();
            return this;
        }

        public C14896b clearClickReport() {
            copyOnWrite();
            ((Url) this.instance).clearClickReport();
            return this;
        }

        public C14896b clearExposureReport() {
            copyOnWrite();
            ((Url) this.instance).clearExposureReport();
            return this;
        }

        public C14896b clearExtra() {
            copyOnWrite();
            ((Url) this.instance).clearExtra();
            return this;
        }

        public C14896b clearIconPosition() {
            copyOnWrite();
            ((Url) this.instance).clearIconPosition();
            return this;
        }

        public C14896b clearIsHalfScreen() {
            copyOnWrite();
            ((Url) this.instance).clearIsHalfScreen();
            return this;
        }

        public C14896b clearMatchOnce() {
            copyOnWrite();
            ((Url) this.instance).clearMatchOnce();
            return this;
        }

        public C14896b clearPcUrl() {
            copyOnWrite();
            ((Url) this.instance).clearPcUrl();
            return this;
        }

        public C14896b clearPrefixIcon() {
            copyOnWrite();
            ((Url) this.instance).clearPrefixIcon();
            return this;
        }

        public C14896b clearState() {
            copyOnWrite();
            ((Url) this.instance).clearState();
            return this;
        }

        public C14896b clearTitle() {
            copyOnWrite();
            ((Url) this.instance).clearTitle();
            return this;
        }

        public C14896b clearUnderline() {
            copyOnWrite();
            ((Url) this.instance).clearUnderline();
            return this;
        }

        public String getAppName() {
            return ((Url) this.instance).getAppName();
        }

        public ByteString getAppNameBytes() {
            return ((Url) this.instance).getAppNameBytes();
        }

        public String getAppPackageName() {
            return ((Url) this.instance).getAppPackageName();
        }

        public ByteString getAppPackageNameBytes() {
            return ((Url) this.instance).getAppPackageNameBytes();
        }

        public String getAppUrlSchema() {
            return ((Url) this.instance).getAppUrlSchema();
        }

        public ByteString getAppUrlSchemaBytes() {
            return ((Url) this.instance).getAppUrlSchemaBytes();
        }

        public String getClickReport() {
            return ((Url) this.instance).getClickReport();
        }

        public ByteString getClickReportBytes() {
            return ((Url) this.instance).getClickReportBytes();
        }

        public String getExposureReport() {
            return ((Url) this.instance).getExposureReport();
        }

        public ByteString getExposureReportBytes() {
            return ((Url) this.instance).getExposureReportBytes();
        }

        public Extra getExtra() {
            return ((Url) this.instance).getExtra();
        }

        public IconPosition getIconPosition() {
            return ((Url) this.instance).getIconPosition();
        }

        public int getIconPositionValue() {
            return ((Url) this.instance).getIconPositionValue();
        }

        public boolean getIsHalfScreen() {
            return ((Url) this.instance).getIsHalfScreen();
        }

        public boolean getMatchOnce() {
            return ((Url) this.instance).getMatchOnce();
        }

        public String getPcUrl() {
            return ((Url) this.instance).getPcUrl();
        }

        public ByteString getPcUrlBytes() {
            return ((Url) this.instance).getPcUrlBytes();
        }

        public String getPrefixIcon() {
            return ((Url) this.instance).getPrefixIcon();
        }

        public ByteString getPrefixIconBytes() {
            return ((Url) this.instance).getPrefixIconBytes();
        }

        public long getState() {
            return ((Url) this.instance).getState();
        }

        public String getTitle() {
            return ((Url) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Url) this.instance).getTitleBytes();
        }

        public boolean getUnderline() {
            return ((Url) this.instance).getUnderline();
        }

        public boolean hasExtra() {
            return ((Url) this.instance).hasExtra();
        }

        public C14896b mergeExtra(Extra extra) {
            copyOnWrite();
            ((Url) this.instance).mergeExtra(extra);
            return this;
        }

        public C14896b setAppName(String str) {
            copyOnWrite();
            ((Url) this.instance).setAppName(str);
            return this;
        }

        public C14896b setAppNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Url) this.instance).setAppNameBytes(byteString);
            return this;
        }

        public C14896b setAppPackageName(String str) {
            copyOnWrite();
            ((Url) this.instance).setAppPackageName(str);
            return this;
        }

        public C14896b setAppPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Url) this.instance).setAppPackageNameBytes(byteString);
            return this;
        }

        public C14896b setAppUrlSchema(String str) {
            copyOnWrite();
            ((Url) this.instance).setAppUrlSchema(str);
            return this;
        }

        public C14896b setAppUrlSchemaBytes(ByteString byteString) {
            copyOnWrite();
            ((Url) this.instance).setAppUrlSchemaBytes(byteString);
            return this;
        }

        public C14896b setClickReport(String str) {
            copyOnWrite();
            ((Url) this.instance).setClickReport(str);
            return this;
        }

        public C14896b setClickReportBytes(ByteString byteString) {
            copyOnWrite();
            ((Url) this.instance).setClickReportBytes(byteString);
            return this;
        }

        public C14896b setExposureReport(String str) {
            copyOnWrite();
            ((Url) this.instance).setExposureReport(str);
            return this;
        }

        public C14896b setExposureReportBytes(ByteString byteString) {
            copyOnWrite();
            ((Url) this.instance).setExposureReportBytes(byteString);
            return this;
        }

        public C14896b setExtra(Extra extra) {
            copyOnWrite();
            ((Url) this.instance).setExtra(extra);
            return this;
        }

        public C14896b setIconPosition(IconPosition iconPosition) {
            copyOnWrite();
            ((Url) this.instance).setIconPosition(iconPosition);
            return this;
        }

        public C14896b setIconPositionValue(int i) {
            copyOnWrite();
            ((Url) this.instance).setIconPositionValue(i);
            return this;
        }

        public C14896b setIsHalfScreen(boolean z) {
            copyOnWrite();
            ((Url) this.instance).setIsHalfScreen(z);
            return this;
        }

        public C14896b setMatchOnce(boolean z) {
            copyOnWrite();
            ((Url) this.instance).setMatchOnce(z);
            return this;
        }

        public C14896b setPcUrl(String str) {
            copyOnWrite();
            ((Url) this.instance).setPcUrl(str);
            return this;
        }

        public C14896b setPcUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Url) this.instance).setPcUrlBytes(byteString);
            return this;
        }

        public C14896b setPrefixIcon(String str) {
            copyOnWrite();
            ((Url) this.instance).setPrefixIcon(str);
            return this;
        }

        public C14896b setPrefixIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Url) this.instance).setPrefixIconBytes(byteString);
            return this;
        }

        public C14896b setState(long j) {
            copyOnWrite();
            ((Url) this.instance).setState(j);
            return this;
        }

        public C14896b setTitle(String str) {
            copyOnWrite();
            ((Url) this.instance).setTitle(str);
            return this;
        }

        public C14896b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Url) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C14896b setUnderline(boolean z) {
            copyOnWrite();
            ((Url) this.instance).setUnderline(z);
            return this;
        }

        private C14896b() {
            super(Url.DEFAULT_INSTANCE);
        }

        public C14896b setExtra(Extra.C14892a c14892a) {
            copyOnWrite();
            ((Url) this.instance).setExtra(c14892a.build());
            return this;
        }
    }

    static {
        Url url = new Url();
        DEFAULT_INSTANCE = url;
        GeneratedMessageLite.registerDefaultInstance(Url.class, url);
    }

    private Url() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppName() {
        this.appName_ = getDefaultInstance().getAppName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppPackageName() {
        this.appPackageName_ = getDefaultInstance().getAppPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppUrlSchema() {
        this.appUrlSchema_ = getDefaultInstance().getAppUrlSchema();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickReport() {
        this.clickReport_ = getDefaultInstance().getClickReport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExposureReport() {
        this.exposureReport_ = getDefaultInstance().getExposureReport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtra() {
        this.extra_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconPosition() {
        this.iconPosition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsHalfScreen() {
        this.isHalfScreen_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMatchOnce() {
        this.matchOnce_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPcUrl() {
        this.pcUrl_ = getDefaultInstance().getPcUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrefixIcon() {
        this.prefixIcon_ = getDefaultInstance().getPrefixIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnderline() {
        this.underline_ = false;
    }

    public static Url getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtra(Extra extra) {
        extra.getClass();
        Extra extra2 = this.extra_;
        if (extra2 != null && extra2 != Extra.getDefaultInstance()) {
            this.extra_ = Extra.newBuilder(this.extra_).mergeFrom((Extra) extra).buildPartial();
        } else {
            this.extra_ = extra;
        }
    }

    public static C14896b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Url parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Url) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Url parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Url) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Url> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setAppPackageName(String str) {
        str.getClass();
        this.appPackageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppPackageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appPackageName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppUrlSchema(String str) {
        str.getClass();
        this.appUrlSchema_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppUrlSchemaBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appUrlSchema_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickReport(String str) {
        str.getClass();
        this.clickReport_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickReportBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clickReport_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExposureReport(String str) {
        str.getClass();
        this.exposureReport_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExposureReportBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.exposureReport_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtra(Extra extra) {
        extra.getClass();
        this.extra_ = extra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconPosition(IconPosition iconPosition) {
        this.iconPosition_ = iconPosition.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconPositionValue(int i) {
        this.iconPosition_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsHalfScreen(boolean z) {
        this.isHalfScreen_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchOnce(boolean z) {
        this.matchOnce_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPcUrl(String str) {
        str.getClass();
        this.pcUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPcUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pcUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrefixIcon(String str) {
        str.getClass();
        this.prefixIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrefixIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.prefixIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(long j) {
        this.state_ = j;
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
    public void setUnderline(boolean z) {
        this.underline_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14895a.f22048xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Url();
            case 2:
                return new C14896b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0007\t\u0208\n\t\u000b\u0007\f\u0007\r\u0208\u000e\f", new Object[]{"title_", "state_", "prefixIcon_", "appUrlSchema_", "appName_", "appPackageName_", "clickReport_", "isHalfScreen_", "exposureReport_", "extra_", "underline_", "matchOnce_", "pcUrl_", "iconPosition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Url> parser = PARSER;
                if (parser == null) {
                    synchronized (Url.class) {
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

    public String getAppName() {
        return this.appName_;
    }

    public ByteString getAppNameBytes() {
        return ByteString.copyFromUtf8(this.appName_);
    }

    public String getAppPackageName() {
        return this.appPackageName_;
    }

    public ByteString getAppPackageNameBytes() {
        return ByteString.copyFromUtf8(this.appPackageName_);
    }

    public String getAppUrlSchema() {
        return this.appUrlSchema_;
    }

    public ByteString getAppUrlSchemaBytes() {
        return ByteString.copyFromUtf8(this.appUrlSchema_);
    }

    public String getClickReport() {
        return this.clickReport_;
    }

    public ByteString getClickReportBytes() {
        return ByteString.copyFromUtf8(this.clickReport_);
    }

    public String getExposureReport() {
        return this.exposureReport_;
    }

    public ByteString getExposureReportBytes() {
        return ByteString.copyFromUtf8(this.exposureReport_);
    }

    public Extra getExtra() {
        Extra extra = this.extra_;
        return extra == null ? Extra.getDefaultInstance() : extra;
    }

    public IconPosition getIconPosition() {
        IconPosition forNumber = IconPosition.forNumber(this.iconPosition_);
        return forNumber == null ? IconPosition.UNRECOGNIZED : forNumber;
    }

    public int getIconPositionValue() {
        return this.iconPosition_;
    }

    public boolean getIsHalfScreen() {
        return this.isHalfScreen_;
    }

    public boolean getMatchOnce() {
        return this.matchOnce_;
    }

    public String getPcUrl() {
        return this.pcUrl_;
    }

    public ByteString getPcUrlBytes() {
        return ByteString.copyFromUtf8(this.pcUrl_);
    }

    public String getPrefixIcon() {
        return this.prefixIcon_;
    }

    public ByteString getPrefixIconBytes() {
        return ByteString.copyFromUtf8(this.prefixIcon_);
    }

    public long getState() {
        return this.state_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public boolean getUnderline() {
        return this.underline_;
    }

    public boolean hasExtra() {
        return this.extra_ != null;
    }

    public static C14896b newBuilder(Url url) {
        return DEFAULT_INSTANCE.createBuilder(url);
    }

    public static Url parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Url) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Url parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Url) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Url parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Url) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Url parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Url) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Url parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Url) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Url parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Url) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Url parseFrom(InputStream inputStream) throws IOException {
        return (Url) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Url parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Url) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Url parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Url) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Url parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Url) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
