package com.bapis.bilibili.app.viewunite.v1;

import com.bapis.bilibili.app.viewunite.common.Owner;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class ViewReply extends GeneratedMessageLite<ViewReply, ViewReply.Builder> implements MessageLiteOrBuilder {
    public static final int ARC_FIELD_NUMBER = 2;
    public static final int CM_FIELD_NUMBER = 7;
    private static final ViewReply DEFAULT_INSTANCE;
    public static final int ECODE_CONFIG_FIELD_NUMBER = 9;
    public static final int ECODE_FIELD_NUMBER = 8;
    public static final int OWNER_FIELD_NUMBER = 4;
    private static volatile Parser<ViewReply> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 10;
    public static final int REQ_USER_FIELD_NUMBER = 3;
    public static final int SUPPLEMENT_FIELD_NUMBER = 6;
    public static final int TAB_FIELD_NUMBER = 5;
    public static final int VIEW_BASE_FIELD_NUMBER = 1;
    private Arc arc_;
    private CM cm_;
    private ECodeConfig ecodeConfig_;
    private int ecode_;
    private Owner owner_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private ReqUser reqUser_;
    private Any supplement_;
    private Tab tab_;
    private ViewBase viewBase_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ViewReply$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71781 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17141xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17141xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17141xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17141xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17141xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17141xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17141xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17141xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71781 c71781) {
            this();
        }

        public Builder clearArc() {
            copyOnWrite();
            ((ViewReply) this.instance).clearArc();
            return this;
        }

        public Builder clearCm() {
            copyOnWrite();
            ((ViewReply) this.instance).clearCm();
            return this;
        }

        public Builder clearEcode() {
            copyOnWrite();
            ((ViewReply) this.instance).clearEcode();
            return this;
        }

        public Builder clearEcodeConfig() {
            copyOnWrite();
            ((ViewReply) this.instance).clearEcodeConfig();
            return this;
        }

        public Builder clearOwner() {
            copyOnWrite();
            ((ViewReply) this.instance).clearOwner();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((ViewReply) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearReqUser() {
            copyOnWrite();
            ((ViewReply) this.instance).clearReqUser();
            return this;
        }

        public Builder clearSupplement() {
            copyOnWrite();
            ((ViewReply) this.instance).clearSupplement();
            return this;
        }

        public Builder clearTab() {
            copyOnWrite();
            ((ViewReply) this.instance).clearTab();
            return this;
        }

        public Builder clearViewBase() {
            copyOnWrite();
            ((ViewReply) this.instance).clearViewBase();
            return this;
        }

        public boolean containsReport(String str) {
            str.getClass();
            return ((ViewReply) this.instance).getReportMap().containsKey(str);
        }

        public Arc getArc() {
            return ((ViewReply) this.instance).getArc();
        }

        public CM getCm() {
            return ((ViewReply) this.instance).getCm();
        }

        public ECode getEcode() {
            return ((ViewReply) this.instance).getEcode();
        }

        public ECodeConfig getEcodeConfig() {
            return ((ViewReply) this.instance).getEcodeConfig();
        }

        public int getEcodeValue() {
            return ((ViewReply) this.instance).getEcodeValue();
        }

        public Owner getOwner() {
            return ((ViewReply) this.instance).getOwner();
        }

        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        public int getReportCount() {
            return ((ViewReply) this.instance).getReportMap().size();
        }

        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((ViewReply) this.instance).getReportMap());
        }

        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((ViewReply) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((ViewReply) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public ReqUser getReqUser() {
            return ((ViewReply) this.instance).getReqUser();
        }

        public Any getSupplement() {
            return ((ViewReply) this.instance).getSupplement();
        }

        public Tab getTab() {
            return ((ViewReply) this.instance).getTab();
        }

        public ViewBase getViewBase() {
            return ((ViewReply) this.instance).getViewBase();
        }

        public boolean hasArc() {
            return ((ViewReply) this.instance).hasArc();
        }

        public boolean hasCm() {
            return ((ViewReply) this.instance).hasCm();
        }

        public boolean hasEcodeConfig() {
            return ((ViewReply) this.instance).hasEcodeConfig();
        }

        public boolean hasOwner() {
            return ((ViewReply) this.instance).hasOwner();
        }

        public boolean hasReqUser() {
            return ((ViewReply) this.instance).hasReqUser();
        }

        public boolean hasSupplement() {
            return ((ViewReply) this.instance).hasSupplement();
        }

        public boolean hasTab() {
            return ((ViewReply) this.instance).hasTab();
        }

        public boolean hasViewBase() {
            return ((ViewReply) this.instance).hasViewBase();
        }

        public Builder mergeArc(Arc arc) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeArc(arc);
            return this;
        }

        public Builder mergeCm(CM cm) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeCm(cm);
            return this;
        }

        public Builder mergeEcodeConfig(ECodeConfig eCodeConfig) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeEcodeConfig(eCodeConfig);
            return this;
        }

        public Builder mergeOwner(Owner owner) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeOwner(owner);
            return this;
        }

        public Builder mergeReqUser(ReqUser reqUser) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeReqUser(reqUser);
            return this;
        }

        public Builder mergeSupplement(Any any) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeSupplement(any);
            return this;
        }

        public Builder mergeTab(Tab tab) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeTab(tab);
            return this;
        }

        public Builder mergeViewBase(ViewBase viewBase) {
            copyOnWrite();
            ((ViewReply) this.instance).mergeViewBase(viewBase);
            return this;
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((ViewReply) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((ViewReply) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((ViewReply) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder setArc(Arc arc) {
            copyOnWrite();
            ((ViewReply) this.instance).setArc(arc);
            return this;
        }

        public Builder setCm(CM cm) {
            copyOnWrite();
            ((ViewReply) this.instance).setCm(cm);
            return this;
        }

        public Builder setEcode(ECode eCode) {
            copyOnWrite();
            ((ViewReply) this.instance).setEcode(eCode);
            return this;
        }

        public Builder setEcodeConfig(ECodeConfig eCodeConfig) {
            copyOnWrite();
            ((ViewReply) this.instance).setEcodeConfig(eCodeConfig);
            return this;
        }

        public Builder setEcodeValue(int i) {
            copyOnWrite();
            ((ViewReply) this.instance).setEcodeValue(i);
            return this;
        }

        public Builder setOwner(Owner owner) {
            copyOnWrite();
            ((ViewReply) this.instance).setOwner(owner);
            return this;
        }

        public Builder setReqUser(ReqUser reqUser) {
            copyOnWrite();
            ((ViewReply) this.instance).setReqUser(reqUser);
            return this;
        }

        public Builder setSupplement(Any any) {
            copyOnWrite();
            ((ViewReply) this.instance).setSupplement(any);
            return this;
        }

        public Builder setTab(Tab tab) {
            copyOnWrite();
            ((ViewReply) this.instance).setTab(tab);
            return this;
        }

        public Builder setViewBase(ViewBase viewBase) {
            copyOnWrite();
            ((ViewReply) this.instance).setViewBase(viewBase);
            return this;
        }

        private Builder() {
            super(ViewReply.DEFAULT_INSTANCE);
        }

        public Builder setArc(Arc.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setArc(builder.build());
            return this;
        }

        public Builder setCm(CM.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setCm(builder.build());
            return this;
        }

        public Builder setEcodeConfig(ECodeConfig.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setEcodeConfig(builder.build());
            return this;
        }

        public Builder setOwner(Owner.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setOwner(builder.build());
            return this;
        }

        public Builder setReqUser(ReqUser.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setReqUser(builder.build());
            return this;
        }

        public Builder setSupplement(Any.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setSupplement(builder.build());
            return this;
        }

        public Builder setTab(Tab.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setTab(builder.build());
            return this;
        }

        public Builder setViewBase(ViewBase.Builder builder) {
            copyOnWrite();
            ((ViewReply) this.instance).setViewBase(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class ReportDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private ReportDefaultEntryHolder() {
        }
    }

    static {
        ViewReply viewReply = new ViewReply();
        DEFAULT_INSTANCE = viewReply;
        GeneratedMessageLite.registerDefaultInstance(ViewReply.class, viewReply);
    }

    public ViewReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArc() {
        this.arc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCm() {
        this.cm_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEcode() {
        this.ecode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEcodeConfig() {
        this.ecodeConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwner() {
        this.owner_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqUser() {
        this.reqUser_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupplement() {
        this.supplement_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTab() {
        this.tab_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewBase() {
        this.viewBase_ = null;
    }

    public static ViewReply getDefaultInstance() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArc(Arc arc) {
        arc.getClass();
        Arc arc2 = this.arc_;
        if (arc2 != null && arc2 != Arc.getDefaultInstance()) {
            this.arc_ = Arc.newBuilder(this.arc_).mergeFrom((Arc) arc).buildPartial();
        } else {
            this.arc_ = arc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCm(CM cm) {
        cm.getClass();
        CM cm2 = this.cm_;
        if (cm2 != null && cm2 != CM.getDefaultInstance()) {
            this.cm_ = CM.newBuilder(this.cm_).mergeFrom((CM) cm).buildPartial();
        } else {
            this.cm_ = cm;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEcodeConfig(ECodeConfig eCodeConfig) {
        eCodeConfig.getClass();
        ECodeConfig eCodeConfig2 = this.ecodeConfig_;
        if (eCodeConfig2 != null && eCodeConfig2 != ECodeConfig.getDefaultInstance()) {
            this.ecodeConfig_ = ECodeConfig.newBuilder(this.ecodeConfig_).mergeFrom((ECodeConfig) eCodeConfig).buildPartial();
        } else {
            this.ecodeConfig_ = eCodeConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOwner(Owner owner) {
        owner.getClass();
        Owner owner2 = this.owner_;
        if (owner2 != null && owner2 != Owner.getDefaultInstance()) {
            this.owner_ = Owner.newBuilder(this.owner_).mergeFrom((Owner) owner).buildPartial();
        } else {
            this.owner_ = owner;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReqUser(ReqUser reqUser) {
        reqUser.getClass();
        ReqUser reqUser2 = this.reqUser_;
        if (reqUser2 != null && reqUser2 != ReqUser.getDefaultInstance()) {
            this.reqUser_ = ReqUser.newBuilder(this.reqUser_).mergeFrom((ReqUser) reqUser).buildPartial();
        } else {
            this.reqUser_ = reqUser;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSupplement(Any any) {
        any.getClass();
        Any any2 = this.supplement_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.supplement_ = Any.newBuilder(this.supplement_).mergeFrom((Any) any).buildPartial();
        } else {
            this.supplement_ = any;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTab(Tab tab) {
        tab.getClass();
        Tab tab2 = this.tab_;
        if (tab2 != null && tab2 != Tab.getDefaultInstance()) {
            this.tab_ = Tab.newBuilder(this.tab_).mergeFrom((Tab) tab).buildPartial();
        } else {
            this.tab_ = tab;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewBase(ViewBase viewBase) {
        viewBase.getClass();
        ViewBase viewBase2 = this.viewBase_;
        if (viewBase2 != null && viewBase2 != ViewBase.getDefaultInstance()) {
            this.viewBase_ = ViewBase.newBuilder(this.viewBase_).mergeFrom((ViewBase) viewBase).buildPartial();
        } else {
            this.viewBase_ = viewBase;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArc(Arc arc) {
        arc.getClass();
        this.arc_ = arc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCm(CM cm) {
        cm.getClass();
        this.cm_ = cm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcode(ECode eCode) {
        this.ecode_ = eCode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcodeConfig(ECodeConfig eCodeConfig) {
        eCodeConfig.getClass();
        this.ecodeConfig_ = eCodeConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcodeValue(int i) {
        this.ecode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwner(Owner owner) {
        owner.getClass();
        this.owner_ = owner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqUser(ReqUser reqUser) {
        reqUser.getClass();
        this.reqUser_ = reqUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupplement(Any any) {
        any.getClass();
        this.supplement_ = any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTab(Tab tab) {
        tab.getClass();
        this.tab_ = tab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewBase(ViewBase viewBase) {
        viewBase.getClass();
        this.viewBase_ = viewBase;
    }

    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71781.f17141xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0001\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\f\t\t\n2", new Object[]{"viewBase_", "arc_", "reqUser_", "owner_", "tab_", "supplement_", "cm_", "ecode_", "ecodeConfig_", "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewReply.class) {
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

    public Arc getArc() {
        Arc arc = this.arc_;
        return arc == null ? Arc.getDefaultInstance() : arc;
    }

    public CM getCm() {
        CM cm = this.cm_;
        return cm == null ? CM.getDefaultInstance() : cm;
    }

    public ECode getEcode() {
        ECode forNumber = ECode.forNumber(this.ecode_);
        return forNumber == null ? ECode.UNRECOGNIZED : forNumber;
    }

    public ECodeConfig getEcodeConfig() {
        ECodeConfig eCodeConfig = this.ecodeConfig_;
        return eCodeConfig == null ? ECodeConfig.getDefaultInstance() : eCodeConfig;
    }

    public int getEcodeValue() {
        return this.ecode_;
    }

    public Owner getOwner() {
        Owner owner = this.owner_;
        return owner == null ? Owner.getDefaultInstance() : owner;
    }

    @Deprecated
    public Map<String, String> getReport() {
        return getReportMap();
    }

    public int getReportCount() {
        return internalGetReport().size();
    }

    public Map<String, String> getReportMap() {
        return Collections.unmodifiableMap(internalGetReport());
    }

    public String getReportOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetReport = internalGetReport();
        return internalGetReport.containsKey(str) ? internalGetReport.get(str) : str2;
    }

    public String getReportOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetReport = internalGetReport();
        if (internalGetReport.containsKey(str)) {
            return internalGetReport.get(str);
        }
        throw new IllegalArgumentException();
    }

    public ReqUser getReqUser() {
        ReqUser reqUser = this.reqUser_;
        return reqUser == null ? ReqUser.getDefaultInstance() : reqUser;
    }

    public Any getSupplement() {
        Any any = this.supplement_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public Tab getTab() {
        Tab tab = this.tab_;
        return tab == null ? Tab.getDefaultInstance() : tab;
    }

    public ViewBase getViewBase() {
        ViewBase viewBase = this.viewBase_;
        return viewBase == null ? ViewBase.getDefaultInstance() : viewBase;
    }

    public boolean hasArc() {
        return this.arc_ != null;
    }

    public boolean hasCm() {
        return this.cm_ != null;
    }

    public boolean hasEcodeConfig() {
        return this.ecodeConfig_ != null;
    }

    public boolean hasOwner() {
        return this.owner_ != null;
    }

    public boolean hasReqUser() {
        return this.reqUser_ != null;
    }

    public boolean hasSupplement() {
        return this.supplement_ != null;
    }

    public boolean hasTab() {
        return this.tab_ != null;
    }

    public boolean hasViewBase() {
        return this.viewBase_ != null;
    }

    public static Builder newBuilder(ViewReply viewReply) {
        return DEFAULT_INSTANCE.createBuilder(viewReply);
    }

    public static ViewReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ViewReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewReply parseFrom(InputStream inputStream) throws IOException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * setSupplement
     */
    static void access$1600(ViewReply viewReply, Any supplement) {
    }

    /**
     * setArc
     */
    static void access$400(ViewReply viewReply, Arc arc) {
    }
}
