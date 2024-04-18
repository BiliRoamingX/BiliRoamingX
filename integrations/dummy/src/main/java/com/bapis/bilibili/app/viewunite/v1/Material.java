package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes20.dex */
public final class Material extends GeneratedMessageLite<Material, Material.C12325b> implements InterfaceC12411c {
    public static final int BG_COLOR_FIELD_NUMBER = 7;
    public static final int BG_PIC_FIELD_NUMBER = 8;
    private static final Material DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int JUMP_TYPE_FIELD_NUMBER = 9;
    public static final int NEED_LOGIN_FIELD_NUMBER = 11;
    public static final int PAGE_TYPE_FIELD_NUMBER = 10;
    public static final int PARAM_FIELD_NUMBER = 5;
    private static volatile Parser<Material> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 12;
    public static final int STATIC_ICON_FIELD_NUMBER = 6;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int URL_FIELD_NUMBER = 3;
    private int jumpType_;
    private boolean needLogin_;
    private int pageType_;
    private int type_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String icon_ = "";
    private String text_ = "";
    private String url_ = "";
    private String param_ = "";
    private String staticIcon_ = "";
    private String bgColor_ = "";
    private String bgPic_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.Material$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12324a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21278xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21278xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21278xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21278xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21278xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21278xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21278xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21278xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.Material$b */
    /* loaded from: classes20.dex */
    public static final class C12325b extends GeneratedMessageLite.Builder<Material, C12325b> implements InterfaceC12411c {
        /* synthetic */ C12325b(C12324a c12324a) {
            this();
        }

        public C12325b clearBgColor() {
            copyOnWrite();
            ((Material) this.instance).clearBgColor();
            return this;
        }

        public C12325b clearBgPic() {
            copyOnWrite();
            ((Material) this.instance).clearBgPic();
            return this;
        }

        public C12325b clearIcon() {
            copyOnWrite();
            ((Material) this.instance).clearIcon();
            return this;
        }

        public C12325b clearJumpType() {
            copyOnWrite();
            ((Material) this.instance).clearJumpType();
            return this;
        }

        public C12325b clearNeedLogin() {
            copyOnWrite();
            ((Material) this.instance).clearNeedLogin();
            return this;
        }

        public C12325b clearPageType() {
            copyOnWrite();
            ((Material) this.instance).clearPageType();
            return this;
        }

        public C12325b clearParam() {
            copyOnWrite();
            ((Material) this.instance).clearParam();
            return this;
        }

        public C12325b clearReport() {
            copyOnWrite();
            ((Material) this.instance).getMutableReportMap().clear();
            return this;
        }

        public C12325b clearStaticIcon() {
            copyOnWrite();
            ((Material) this.instance).clearStaticIcon();
            return this;
        }

        public C12325b clearText() {
            copyOnWrite();
            ((Material) this.instance).clearText();
            return this;
        }

        public C12325b clearType() {
            copyOnWrite();
            ((Material) this.instance).clearType();
            return this;
        }

        public C12325b clearUrl() {
            copyOnWrite();
            ((Material) this.instance).clearUrl();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public boolean containsReport(String str) {
            str.getClass();
            return ((Material) this.instance).getReportMap().containsKey(str);
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public String getBgColor() {
            return ((Material) this.instance).getBgColor();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public ByteString getBgColorBytes() {
            return ((Material) this.instance).getBgColorBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public String getBgPic() {
            return ((Material) this.instance).getBgPic();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public ByteString getBgPicBytes() {
            return ((Material) this.instance).getBgPicBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public String getIcon() {
            return ((Material) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public ByteString getIconBytes() {
            return ((Material) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public int getJumpType() {
            return ((Material) this.instance).getJumpType();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public boolean getNeedLogin() {
            return ((Material) this.instance).getNeedLogin();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public PageType getPageType() {
            return ((Material) this.instance).getPageType();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public int getPageTypeValue() {
            return ((Material) this.instance).getPageTypeValue();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public String getParam() {
            return ((Material) this.instance).getParam();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public ByteString getParamBytes() {
            return ((Material) this.instance).getParamBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public int getReportCount() {
            return ((Material) this.instance).getReportMap().size();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((Material) this.instance).getReportMap());
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((Material) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((Material) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public String getStaticIcon() {
            return ((Material) this.instance).getStaticIcon();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public ByteString getStaticIconBytes() {
            return ((Material) this.instance).getStaticIconBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public String getText() {
            return ((Material) this.instance).getText();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public ByteString getTextBytes() {
            return ((Material) this.instance).getTextBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public MaterialBizType getType() {
            return ((Material) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public int getTypeValue() {
            return ((Material) this.instance).getTypeValue();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public String getUrl() {
            return ((Material) this.instance).getUrl();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
        public ByteString getUrlBytes() {
            return ((Material) this.instance).getUrlBytes();
        }

        public C12325b putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((Material) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public C12325b putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((Material) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public C12325b removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((Material) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public C12325b setBgColor(String str) {
            copyOnWrite();
            ((Material) this.instance).setBgColor(str);
            return this;
        }

        public C12325b setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((Material) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public C12325b setBgPic(String str) {
            copyOnWrite();
            ((Material) this.instance).setBgPic(str);
            return this;
        }

        public C12325b setBgPicBytes(ByteString byteString) {
            copyOnWrite();
            ((Material) this.instance).setBgPicBytes(byteString);
            return this;
        }

        public C12325b setIcon(String str) {
            copyOnWrite();
            ((Material) this.instance).setIcon(str);
            return this;
        }

        public C12325b setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Material) this.instance).setIconBytes(byteString);
            return this;
        }

        public C12325b setJumpType(int i) {
            copyOnWrite();
            ((Material) this.instance).setJumpType(i);
            return this;
        }

        public C12325b setNeedLogin(boolean z) {
            copyOnWrite();
            ((Material) this.instance).setNeedLogin(z);
            return this;
        }

        public C12325b setPageType(PageType pageType) {
            copyOnWrite();
            ((Material) this.instance).setPageType(pageType);
            return this;
        }

        public C12325b setPageTypeValue(int i) {
            copyOnWrite();
            ((Material) this.instance).setPageTypeValue(i);
            return this;
        }

        public C12325b setParam(String str) {
            copyOnWrite();
            ((Material) this.instance).setParam(str);
            return this;
        }

        public C12325b setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((Material) this.instance).setParamBytes(byteString);
            return this;
        }

        public C12325b setStaticIcon(String str) {
            copyOnWrite();
            ((Material) this.instance).setStaticIcon(str);
            return this;
        }

        public C12325b setStaticIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Material) this.instance).setStaticIconBytes(byteString);
            return this;
        }

        public C12325b setText(String str) {
            copyOnWrite();
            ((Material) this.instance).setText(str);
            return this;
        }

        public C12325b setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Material) this.instance).setTextBytes(byteString);
            return this;
        }

        public C12325b setType(MaterialBizType materialBizType) {
            copyOnWrite();
            ((Material) this.instance).setType(materialBizType);
            return this;
        }

        public C12325b setTypeValue(int i) {
            copyOnWrite();
            ((Material) this.instance).setTypeValue(i);
            return this;
        }

        public C12325b setUrl(String str) {
            copyOnWrite();
            ((Material) this.instance).setUrl(str);
            return this;
        }

        public C12325b setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Material) this.instance).setUrlBytes(byteString);
            return this;
        }

        private C12325b() {
            super(Material.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.Material$c */
    /* loaded from: classes20.dex */
    private static final class C12326c {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private C12326c() {
        }
    }

    static {
        Material material = new Material();
        DEFAULT_INSTANCE = material;
        GeneratedMessageLite.registerDefaultInstance(Material.class, material);
    }

    private Material() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgColor() {
        this.bgColor_ = getDefaultInstance().getBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgPic() {
        this.bgPic_ = getDefaultInstance().getBgPic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpType() {
        this.jumpType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNeedLogin() {
        this.needLogin_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageType() {
        this.pageType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStaticIcon() {
        this.staticIcon_ = getDefaultInstance().getStaticIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static Material getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableReportMap() {
        return internalGetMutableReport();
    }

    private MapFieldLite<String, String> internalGetMutableReport() {
        if (!this.report_.isMutable()) {
            this.report_ = this.report_.mutableCopy();
        }
        return this.report_;
    }

    private MapFieldLite<String, String> internalGetReport() {
        return this.report_;
    }

    public static C12325b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Material parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Material) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Material parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Material) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Material> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgColor(String str) {
        str.getClass();
        this.bgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgPic(String str) {
        str.getClass();
        this.bgPic_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgPicBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgPic_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpType(int i) {
        this.jumpType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNeedLogin(boolean z) {
        this.needLogin_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageType(PageType pageType) {
        this.pageType_ = pageType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageTypeValue(int i) {
        this.pageType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParam(String str) {
        str.getClass();
        this.param_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParamBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.param_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaticIcon(String str) {
        str.getClass();
        this.staticIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaticIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.staticIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(MaterialBizType materialBizType) {
        this.type_ = materialBizType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12324a.f21278xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Material();
            case 2:
                return new C12325b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\f\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0004\n\f\u000b\u0007\f2", new Object[]{"icon_", "text_", "url_", "type_", "param_", "staticIcon_", "bgColor_", "bgPic_", "jumpType_", "pageType_", "needLogin_", "report_", C12326c.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Material> parser = PARSER;
                if (parser == null) {
                    synchronized (Material.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public String getBgColor() {
        return this.bgColor_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public ByteString getBgColorBytes() {
        return ByteString.copyFromUtf8(this.bgColor_);
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public String getBgPic() {
        return this.bgPic_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public ByteString getBgPicBytes() {
        return ByteString.copyFromUtf8(this.bgPic_);
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public int getJumpType() {
        return this.jumpType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public boolean getNeedLogin() {
        return this.needLogin_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public PageType getPageType() {
        PageType forNumber = PageType.forNumber(this.pageType_);
        return forNumber == null ? PageType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public int getPageTypeValue() {
        return this.pageType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public String getParam() {
        return this.param_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    @Deprecated
    public Map<String, String> getReport() {
        return getReportMap();
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public int getReportCount() {
        return internalGetReport().size();
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public Map<String, String> getReportMap() {
        return Collections.unmodifiableMap(internalGetReport());
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public String getReportOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetReport = internalGetReport();
        return internalGetReport.containsKey(str) ? internalGetReport.get(str) : str2;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public String getReportOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetReport = internalGetReport();
        if (internalGetReport.containsKey(str)) {
            return internalGetReport.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public String getStaticIcon() {
        return this.staticIcon_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public ByteString getStaticIconBytes() {
        return ByteString.copyFromUtf8(this.staticIcon_);
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public String getText() {
        return this.text_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public MaterialBizType getType() {
        MaterialBizType forNumber = MaterialBizType.forNumber(this.type_);
        return forNumber == null ? MaterialBizType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12411c
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static C12325b newBuilder(Material material) {
        return DEFAULT_INSTANCE.createBuilder(material);
    }

    public static Material parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Material) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Material parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Material) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Material parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Material) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Material parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Material) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Material parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Material) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Material parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Material) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Material parseFrom(InputStream inputStream) throws IOException {
        return (Material) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Material parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Material) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Material parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Material) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Material parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Material) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
