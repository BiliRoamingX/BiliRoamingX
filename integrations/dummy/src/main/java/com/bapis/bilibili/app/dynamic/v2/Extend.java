package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes19.dex */
public final class Extend extends GeneratedMessageLite<Extend, Extend.C5476b> implements o1 {
    public static final int BUSINESS_ID_FIELD_NUMBER = 2;
    public static final int CARD_URL_FIELD_NUMBER = 15;
    private static final Extend DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 7;
    public static final int DESC_TEXT_OPUS_FIELD_NUMBER = 26;
    public static final int DYN_ID_STR_FIELD_NUMBER = 1;
    public static final int DYN_TYPE_FIELD_NUMBER = 13;
    public static final int FEATURE_GATE_FIELD_NUMBER = 22;
    public static final int HISTORY_REPORT_FIELD_NUMBER = 24;
    public static final int IS_FAST_SHARE_FIELD_NUMBER = 11;
    public static final int IS_IN_AUDIT_FIELD_NUMBER = 23;
    public static final int IS_PREVIEW_ONLY_FIELD_NUMBER = 27;
    public static final int ONLY_FANS_PROPERTY_FIELD_NUMBER = 21;
    public static final int OPUS_SUMMARY_FIELD_NUMBER = 20;
    public static final int ORIG_DESC_FIELD_NUMBER = 6;
    public static final int ORIG_DYN_ID_STR_FIELD_NUMBER = 3;
    public static final int ORIG_DYN_TYPE_FIELD_NUMBER = 8;
    public static final int ORIG_FACE_FIELD_NUMBER = 17;
    public static final int ORIG_IMG_URL_FIELD_NUMBER = 5;
    public static final int ORIG_NAME_FIELD_NUMBER = 4;
    private static volatile Parser<Extend> PARSER = null;
    public static final int REPLY_FIELD_NUMBER = 18;
    public static final int REPORT_METRIC_DATA_FIELD_NUMBER = 25;
    public static final int REPOST_EXTRA_INFO_FIELD_NUMBER = 28;
    public static final int R_TYPE_FIELD_NUMBER = 12;
    public static final int SHARE_SCENE_FIELD_NUMBER = 10;
    public static final int SHARE_TYPE_FIELD_NUMBER = 9;
    public static final int SOURCE_CONTENT_FIELD_NUMBER = 16;
    public static final int TRACK_ID_FIELD_NUMBER = 19;
    public static final int UID_FIELD_NUMBER = 14;
    private TextParagraph descTextOpus_;
    private long dynType_;
    private DynFeatureGate featureGate_;
    private boolean isFastShare_;
    private boolean isInAudit_;
    private boolean isPreviewOnly_;
    private OnlyFansProperty onlyFansProperty_;
    private ModuleOpusSummary opusSummary_;
    private int origDynType_;
    private int rType_;
    private ExtendReply reply_;
    private RepostExtraInfo repostExtraInfo_;
    private Any sourceContent_;
    private long uid_;
    private MapFieldLite<String, String> historyReport_ = MapFieldLite.emptyMapField();
    private String dynIdStr_ = "";
    private String businessId_ = "";
    private String origDynIdStr_ = "";
    private String origName_ = "";
    private String origImgUrl_ = "";
    private Internal.ProtobufList<Description> origDesc_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Description> desc_ = GeneratedMessageLite.emptyProtobufList();
    private String shareType_ = "";
    private String shareScene_ = "";
    private String cardUrl_ = "";
    private String origFace_ = "";
    private String trackId_ = "";
    private String reportMetricData_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.Extend$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5475a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17299xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17299xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17299xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17299xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17299xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17299xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17299xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17299xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.Extend$b */
    /* loaded from: classes19.dex */
    public static final class C5476b extends GeneratedMessageLite.Builder<Extend, C5476b> implements o1 {
        /* synthetic */ C5476b(C5475a c5475a) {
            this();
        }

        @Deprecated
        public C5476b addAllDesc(Iterable<? extends Description> iterable) {
            copyOnWrite();
            ((Extend) this.instance).addAllDesc(iterable);
            return this;
        }

        public C5476b addAllOrigDesc(Iterable<? extends Description> iterable) {
            copyOnWrite();
            ((Extend) this.instance).addAllOrigDesc(iterable);
            return this;
        }

        @Deprecated
        public C5476b addDesc(Description description) {
            copyOnWrite();
            ((Extend) this.instance).addDesc(description);
            return this;
        }

        public C5476b addOrigDesc(Description description) {
            copyOnWrite();
            ((Extend) this.instance).addOrigDesc(description);
            return this;
        }

        public C5476b clearBusinessId() {
            copyOnWrite();
            ((Extend) this.instance).clearBusinessId();
            return this;
        }

        public C5476b clearCardUrl() {
            copyOnWrite();
            ((Extend) this.instance).clearCardUrl();
            return this;
        }

        @Deprecated
        public C5476b clearDesc() {
            copyOnWrite();
            ((Extend) this.instance).clearDesc();
            return this;
        }

        public C5476b clearDescTextOpus() {
            copyOnWrite();
            ((Extend) this.instance).clearDescTextOpus();
            return this;
        }

        public C5476b clearDynIdStr() {
            copyOnWrite();
            ((Extend) this.instance).clearDynIdStr();
            return this;
        }

        public C5476b clearDynType() {
            copyOnWrite();
            ((Extend) this.instance).clearDynType();
            return this;
        }

        public C5476b clearFeatureGate() {
            copyOnWrite();
            ((Extend) this.instance).clearFeatureGate();
            return this;
        }

        public C5476b clearHistoryReport() {
            copyOnWrite();
            ((Extend) this.instance).getMutableHistoryReportMap().clear();
            return this;
        }

        public C5476b clearIsFastShare() {
            copyOnWrite();
            ((Extend) this.instance).clearIsFastShare();
            return this;
        }

        public C5476b clearIsInAudit() {
            copyOnWrite();
            ((Extend) this.instance).clearIsInAudit();
            return this;
        }

        public C5476b clearIsPreviewOnly() {
            copyOnWrite();
            ((Extend) this.instance).clearIsPreviewOnly();
            return this;
        }

        public C5476b clearOnlyFansProperty() {
            copyOnWrite();
            ((Extend) this.instance).clearOnlyFansProperty();
            return this;
        }

        public C5476b clearOpusSummary() {
            copyOnWrite();
            ((Extend) this.instance).clearOpusSummary();
            return this;
        }

        public C5476b clearOrigDesc() {
            copyOnWrite();
            ((Extend) this.instance).clearOrigDesc();
            return this;
        }

        public C5476b clearOrigDynIdStr() {
            copyOnWrite();
            ((Extend) this.instance).clearOrigDynIdStr();
            return this;
        }

        public C5476b clearOrigDynType() {
            copyOnWrite();
            ((Extend) this.instance).clearOrigDynType();
            return this;
        }

        public C5476b clearOrigFace() {
            copyOnWrite();
            ((Extend) this.instance).clearOrigFace();
            return this;
        }

        public C5476b clearOrigImgUrl() {
            copyOnWrite();
            ((Extend) this.instance).clearOrigImgUrl();
            return this;
        }

        public C5476b clearOrigName() {
            copyOnWrite();
            ((Extend) this.instance).clearOrigName();
            return this;
        }

        public C5476b clearRType() {
            copyOnWrite();
            ((Extend) this.instance).clearRType();
            return this;
        }

        public C5476b clearReply() {
            copyOnWrite();
            ((Extend) this.instance).clearReply();
            return this;
        }

        public C5476b clearReportMetricData() {
            copyOnWrite();
            ((Extend) this.instance).clearReportMetricData();
            return this;
        }

        public C5476b clearRepostExtraInfo() {
            copyOnWrite();
            ((Extend) this.instance).clearRepostExtraInfo();
            return this;
        }

        public C5476b clearShareScene() {
            copyOnWrite();
            ((Extend) this.instance).clearShareScene();
            return this;
        }

        public C5476b clearShareType() {
            copyOnWrite();
            ((Extend) this.instance).clearShareType();
            return this;
        }

        public C5476b clearSourceContent() {
            copyOnWrite();
            ((Extend) this.instance).clearSourceContent();
            return this;
        }

        public C5476b clearTrackId() {
            copyOnWrite();
            ((Extend) this.instance).clearTrackId();
            return this;
        }

        public C5476b clearUid() {
            copyOnWrite();
            ((Extend) this.instance).clearUid();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public boolean containsHistoryReport(String str) {
            str.getClass();
            return ((Extend) this.instance).getHistoryReportMap().containsKey(str);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getBusinessId() {
            return ((Extend) this.instance).getBusinessId();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ByteString getBusinessIdBytes() {
            return ((Extend) this.instance).getBusinessIdBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getCardUrl() {
            return ((Extend) this.instance).getCardUrl();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ByteString getCardUrlBytes() {
            return ((Extend) this.instance).getCardUrlBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        @Deprecated
        public Description getDesc(int i2) {
            return ((Extend) this.instance).getDesc(i2);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        @Deprecated
        public int getDescCount() {
            return ((Extend) this.instance).getDescCount();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        @Deprecated
        public List<Description> getDescList() {
            return Collections.unmodifiableList(((Extend) this.instance).getDescList());
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public TextParagraph getDescTextOpus() {
            return ((Extend) this.instance).getDescTextOpus();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getDynIdStr() {
            return ((Extend) this.instance).getDynIdStr();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ByteString getDynIdStrBytes() {
            return ((Extend) this.instance).getDynIdStrBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public long getDynType() {
            return ((Extend) this.instance).getDynType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public DynFeatureGate getFeatureGate() {
            return ((Extend) this.instance).getFeatureGate();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        @Deprecated
        public Map<String, String> getHistoryReport() {
            return getHistoryReportMap();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public int getHistoryReportCount() {
            return ((Extend) this.instance).getHistoryReportMap().size();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public Map<String, String> getHistoryReportMap() {
            return Collections.unmodifiableMap(((Extend) this.instance).getHistoryReportMap());
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getHistoryReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> historyReportMap = ((Extend) this.instance).getHistoryReportMap();
            return historyReportMap.containsKey(str) ? historyReportMap.get(str) : str2;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getHistoryReportOrThrow(String str) {
            str.getClass();
            Map<String, String> historyReportMap = ((Extend) this.instance).getHistoryReportMap();
            if (historyReportMap.containsKey(str)) {
                return historyReportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public boolean getIsFastShare() {
            return ((Extend) this.instance).getIsFastShare();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public boolean getIsInAudit() {
            return ((Extend) this.instance).getIsInAudit();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public boolean getIsPreviewOnly() {
            return ((Extend) this.instance).getIsPreviewOnly();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public OnlyFansProperty getOnlyFansProperty() {
            return ((Extend) this.instance).getOnlyFansProperty();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ModuleOpusSummary getOpusSummary() {
            return ((Extend) this.instance).getOpusSummary();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public Description getOrigDesc(int i2) {
            return ((Extend) this.instance).getOrigDesc(i2);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public int getOrigDescCount() {
            return ((Extend) this.instance).getOrigDescCount();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public List<Description> getOrigDescList() {
            return Collections.unmodifiableList(((Extend) this.instance).getOrigDescList());
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getOrigDynIdStr() {
            return ((Extend) this.instance).getOrigDynIdStr();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ByteString getOrigDynIdStrBytes() {
            return ((Extend) this.instance).getOrigDynIdStrBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public DynamicType getOrigDynType() {
            return ((Extend) this.instance).getOrigDynType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public int getOrigDynTypeValue() {
            return ((Extend) this.instance).getOrigDynTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getOrigFace() {
            return ((Extend) this.instance).getOrigFace();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ByteString getOrigFaceBytes() {
            return ((Extend) this.instance).getOrigFaceBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getOrigImgUrl() {
            return ((Extend) this.instance).getOrigImgUrl();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ByteString getOrigImgUrlBytes() {
            return ((Extend) this.instance).getOrigImgUrlBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getOrigName() {
            return ((Extend) this.instance).getOrigName();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ByteString getOrigNameBytes() {
            return ((Extend) this.instance).getOrigNameBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public int getRType() {
            return ((Extend) this.instance).getRType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ExtendReply getReply() {
            return ((Extend) this.instance).getReply();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getReportMetricData() {
            return ((Extend) this.instance).getReportMetricData();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ByteString getReportMetricDataBytes() {
            return ((Extend) this.instance).getReportMetricDataBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public RepostExtraInfo getRepostExtraInfo() {
            return ((Extend) this.instance).getRepostExtraInfo();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getShareScene() {
            return ((Extend) this.instance).getShareScene();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ByteString getShareSceneBytes() {
            return ((Extend) this.instance).getShareSceneBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getShareType() {
            return ((Extend) this.instance).getShareType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ByteString getShareTypeBytes() {
            return ((Extend) this.instance).getShareTypeBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public Any getSourceContent() {
            return ((Extend) this.instance).getSourceContent();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public String getTrackId() {
            return ((Extend) this.instance).getTrackId();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public ByteString getTrackIdBytes() {
            return ((Extend) this.instance).getTrackIdBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public long getUid() {
            return ((Extend) this.instance).getUid();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public boolean hasDescTextOpus() {
            return ((Extend) this.instance).hasDescTextOpus();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public boolean hasFeatureGate() {
            return ((Extend) this.instance).hasFeatureGate();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public boolean hasOnlyFansProperty() {
            return ((Extend) this.instance).hasOnlyFansProperty();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public boolean hasOpusSummary() {
            return ((Extend) this.instance).hasOpusSummary();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public boolean hasReply() {
            return ((Extend) this.instance).hasReply();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public boolean hasRepostExtraInfo() {
            return ((Extend) this.instance).hasRepostExtraInfo();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o1
        public boolean hasSourceContent() {
            return ((Extend) this.instance).hasSourceContent();
        }

        public C5476b mergeDescTextOpus(TextParagraph textParagraph) {
            copyOnWrite();
            ((Extend) this.instance).mergeDescTextOpus(textParagraph);
            return this;
        }

        public C5476b mergeFeatureGate(DynFeatureGate dynFeatureGate) {
            copyOnWrite();
            ((Extend) this.instance).mergeFeatureGate(dynFeatureGate);
            return this;
        }

        public C5476b mergeOnlyFansProperty(OnlyFansProperty onlyFansProperty) {
            return this;
        }

        public C5476b mergeOpusSummary(ModuleOpusSummary moduleOpusSummary) {
            copyOnWrite();
            ((Extend) this.instance).mergeOpusSummary(moduleOpusSummary);
            return this;
        }

        public C5476b mergeReply(ExtendReply extendReply) {
            copyOnWrite();
            ((Extend) this.instance).mergeReply(extendReply);
            return this;
        }

        public C5476b mergeRepostExtraInfo(RepostExtraInfo repostExtraInfo) {
            copyOnWrite();
            ((Extend) this.instance).mergeRepostExtraInfo(repostExtraInfo);
            return this;
        }

        public C5476b mergeSourceContent(Any any) {
            copyOnWrite();
            ((Extend) this.instance).mergeSourceContent(any);
            return this;
        }

        public C5476b putAllHistoryReport(Map<String, String> map) {
            copyOnWrite();
            ((Extend) this.instance).getMutableHistoryReportMap().putAll(map);
            return this;
        }

        public C5476b putHistoryReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((Extend) this.instance).getMutableHistoryReportMap().put(str, str2);
            return this;
        }

        @Deprecated
        public C5476b removeDesc(int i2) {
            copyOnWrite();
            ((Extend) this.instance).removeDesc(i2);
            return this;
        }

        public C5476b removeHistoryReport(String str) {
            str.getClass();
            copyOnWrite();
            ((Extend) this.instance).getMutableHistoryReportMap().remove(str);
            return this;
        }

        public C5476b removeOrigDesc(int i2) {
            copyOnWrite();
            ((Extend) this.instance).removeOrigDesc(i2);
            return this;
        }

        public C5476b setBusinessId(String str) {
            copyOnWrite();
            ((Extend) this.instance).setBusinessId(str);
            return this;
        }

        public C5476b setBusinessIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Extend) this.instance).setBusinessIdBytes(byteString);
            return this;
        }

        public C5476b setCardUrl(String str) {
            copyOnWrite();
            ((Extend) this.instance).setCardUrl(str);
            return this;
        }

        public C5476b setCardUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Extend) this.instance).setCardUrlBytes(byteString);
            return this;
        }

        @Deprecated
        public C5476b setDesc(int i2, Description description) {
            copyOnWrite();
            ((Extend) this.instance).setDesc(i2, description);
            return this;
        }

        public C5476b setDescTextOpus(TextParagraph textParagraph) {
            copyOnWrite();
            ((Extend) this.instance).setDescTextOpus(textParagraph);
            return this;
        }

        public C5476b setDynIdStr(String str) {
            copyOnWrite();
            ((Extend) this.instance).setDynIdStr(str);
            return this;
        }

        public C5476b setDynIdStrBytes(ByteString byteString) {
            copyOnWrite();
            ((Extend) this.instance).setDynIdStrBytes(byteString);
            return this;
        }

        public C5476b setDynType(long j2) {
            copyOnWrite();
            ((Extend) this.instance).setDynType(j2);
            return this;
        }

        public C5476b setFeatureGate(DynFeatureGate dynFeatureGate) {
            copyOnWrite();
            ((Extend) this.instance).setFeatureGate(dynFeatureGate);
            return this;
        }

        public C5476b setIsFastShare(boolean z) {
            copyOnWrite();
            ((Extend) this.instance).setIsFastShare(z);
            return this;
        }

        public C5476b setIsInAudit(boolean z) {
            copyOnWrite();
            ((Extend) this.instance).setIsInAudit(z);
            return this;
        }

        public C5476b setIsPreviewOnly(boolean z) {
            copyOnWrite();
            ((Extend) this.instance).setIsPreviewOnly(z);
            return this;
        }

        public C5476b setOnlyFansProperty(OnlyFansProperty onlyFansProperty) {
            copyOnWrite();
            ((Extend) this.instance).setOnlyFansProperty(onlyFansProperty);
            return this;
        }

        public C5476b setOpusSummary(ModuleOpusSummary moduleOpusSummary) {
            copyOnWrite();
            ((Extend) this.instance).setOpusSummary(moduleOpusSummary);
            return this;
        }

        public C5476b setOrigDesc(int i2, Description description) {
            copyOnWrite();
            ((Extend) this.instance).setOrigDesc(i2, description);
            return this;
        }

        public C5476b setOrigDynIdStr(String str) {
            copyOnWrite();
            ((Extend) this.instance).setOrigDynIdStr(str);
            return this;
        }

        public C5476b setOrigDynIdStrBytes(ByteString byteString) {
            copyOnWrite();
            ((Extend) this.instance).setOrigDynIdStrBytes(byteString);
            return this;
        }

        public C5476b setOrigDynType(DynamicType dynamicType) {
            copyOnWrite();
            ((Extend) this.instance).setOrigDynType(dynamicType);
            return this;
        }

        public C5476b setOrigDynTypeValue(int i2) {
            copyOnWrite();
            ((Extend) this.instance).setOrigDynTypeValue(i2);
            return this;
        }

        public C5476b setOrigFace(String str) {
            copyOnWrite();
            ((Extend) this.instance).setOrigFace(str);
            return this;
        }

        public C5476b setOrigFaceBytes(ByteString byteString) {
            copyOnWrite();
            ((Extend) this.instance).setOrigFaceBytes(byteString);
            return this;
        }

        public C5476b setOrigImgUrl(String str) {
            copyOnWrite();
            ((Extend) this.instance).setOrigImgUrl(str);
            return this;
        }

        public C5476b setOrigImgUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Extend) this.instance).setOrigImgUrlBytes(byteString);
            return this;
        }

        public C5476b setOrigName(String str) {
            copyOnWrite();
            ((Extend) this.instance).setOrigName(str);
            return this;
        }

        public C5476b setOrigNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Extend) this.instance).setOrigNameBytes(byteString);
            return this;
        }

        public C5476b setRType(int i2) {
            copyOnWrite();
            ((Extend) this.instance).setRType(i2);
            return this;
        }

        public C5476b setReply(ExtendReply extendReply) {
            copyOnWrite();
            ((Extend) this.instance).setReply(extendReply);
            return this;
        }

        public C5476b setReportMetricData(String str) {
            copyOnWrite();
            ((Extend) this.instance).setReportMetricData(str);
            return this;
        }

        public C5476b setReportMetricDataBytes(ByteString byteString) {
            copyOnWrite();
            ((Extend) this.instance).setReportMetricDataBytes(byteString);
            return this;
        }

        public C5476b setRepostExtraInfo(RepostExtraInfo repostExtraInfo) {
            copyOnWrite();
            ((Extend) this.instance).setRepostExtraInfo(repostExtraInfo);
            return this;
        }

        public C5476b setShareScene(String str) {
            copyOnWrite();
            ((Extend) this.instance).setShareScene(str);
            return this;
        }

        public C5476b setShareSceneBytes(ByteString byteString) {
            copyOnWrite();
            ((Extend) this.instance).setShareSceneBytes(byteString);
            return this;
        }

        public C5476b setShareType(String str) {
            copyOnWrite();
            ((Extend) this.instance).setShareType(str);
            return this;
        }

        public C5476b setShareTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Extend) this.instance).setShareTypeBytes(byteString);
            return this;
        }

        public C5476b setSourceContent(Any any) {
            copyOnWrite();
            ((Extend) this.instance).setSourceContent(any);
            return this;
        }

        public C5476b setTrackId(String str) {
            copyOnWrite();
            ((Extend) this.instance).setTrackId(str);
            return this;
        }

        public C5476b setTrackIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Extend) this.instance).setTrackIdBytes(byteString);
            return this;
        }

        public C5476b setUid(long j2) {
            copyOnWrite();
            ((Extend) this.instance).setUid(j2);
            return this;
        }

        private C5476b() {
            super(Extend.DEFAULT_INSTANCE);
        }

        @Deprecated
        public C5476b addDesc(int i2, Description description) {
            copyOnWrite();
            ((Extend) this.instance).addDesc(i2, description);
            return this;
        }

        public C5476b addOrigDesc(int i2, Description description) {
            copyOnWrite();
            ((Extend) this.instance).addOrigDesc(i2, description);
            return this;
        }

        public C5476b setDescTextOpus(TextParagraph.C6003b c6003b) {
            copyOnWrite();
            ((Extend) this.instance).setDescTextOpus(c6003b.build());
            return this;
        }

        public C5476b setFeatureGate(DynFeatureGate.C5366b c5366b) {
            copyOnWrite();
            ((Extend) this.instance).setFeatureGate(c5366b.build());
            return this;
        }

        public C5476b setOpusSummary(ModuleOpusSummary.C5785b c5785b) {
            copyOnWrite();
            ((Extend) this.instance).setOpusSummary(c5785b.build());
            return this;
        }

        public C5476b setReply(ExtendReply.C5479b c5479b) {
            copyOnWrite();
            ((Extend) this.instance).setReply(c5479b.build());
            return this;
        }

        public C5476b setRepostExtraInfo(RepostExtraInfo.C5937b c5937b) {
            copyOnWrite();
            ((Extend) this.instance).setRepostExtraInfo(c5937b.build());
            return this;
        }

        public C5476b setSourceContent(Any.Builder builder) {
            copyOnWrite();
            ((Extend) this.instance).setSourceContent(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.Extend$c */
    /* loaded from: classes19.dex */
    private static final class C5477c {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private C5477c() {
        }
    }

    static {
        Extend extend = new Extend();
        DEFAULT_INSTANCE = extend;
        GeneratedMessageLite.registerDefaultInstance(Extend.class, extend);
    }

    private Extend() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDesc(Iterable<? extends Description> iterable) {
        ensureDescIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.desc_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOrigDesc(Iterable<? extends Description> iterable) {
        ensureOrigDescIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.origDesc_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDesc(Description description) {
        description.getClass();
        ensureDescIsMutable();
        this.desc_.add(description);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOrigDesc(Description description) {
        description.getClass();
        ensureOrigDescIsMutable();
        this.origDesc_.add(description);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBusinessId() {
        this.businessId_ = getDefaultInstance().getBusinessId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardUrl() {
        this.cardUrl_ = getDefaultInstance().getCardUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescTextOpus() {
        this.descTextOpus_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDynIdStr() {
        this.dynIdStr_ = getDefaultInstance().getDynIdStr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDynType() {
        this.dynType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureGate() {
        this.featureGate_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFastShare() {
        this.isFastShare_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInAudit() {
        this.isInAudit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPreviewOnly() {
        this.isPreviewOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnlyFansProperty() {
        this.onlyFansProperty_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpusSummary() {
        this.opusSummary_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigDesc() {
        this.origDesc_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigDynIdStr() {
        this.origDynIdStr_ = getDefaultInstance().getOrigDynIdStr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigDynType() {
        this.origDynType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigFace() {
        this.origFace_ = getDefaultInstance().getOrigFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigImgUrl() {
        this.origImgUrl_ = getDefaultInstance().getOrigImgUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigName() {
        this.origName_ = getDefaultInstance().getOrigName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRType() {
        this.rType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReply() {
        this.reply_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportMetricData() {
        this.reportMetricData_ = getDefaultInstance().getReportMetricData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRepostExtraInfo() {
        this.repostExtraInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareScene() {
        this.shareScene_ = getDefaultInstance().getShareScene();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareType() {
        this.shareType_ = getDefaultInstance().getShareType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContent() {
        this.sourceContent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.uid_ = 0L;
    }

    private void ensureDescIsMutable() {
        Internal.ProtobufList<Description> protobufList = this.desc_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.desc_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureOrigDescIsMutable() {
        Internal.ProtobufList<Description> protobufList = this.origDesc_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.origDesc_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Extend getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableHistoryReportMap() {
        return internalGetMutableHistoryReport();
    }

    private MapFieldLite<String, String> internalGetHistoryReport() {
        return this.historyReport_;
    }

    private MapFieldLite<String, String> internalGetMutableHistoryReport() {
        if (!this.historyReport_.isMutable()) {
            this.historyReport_ = this.historyReport_.mutableCopy();
        }
        return this.historyReport_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDescTextOpus(TextParagraph textParagraph) {
        textParagraph.getClass();
        TextParagraph textParagraph2 = this.descTextOpus_;
        if (textParagraph2 != null && textParagraph2 != TextParagraph.getDefaultInstance()) {
            this.descTextOpus_ = TextParagraph.newBuilder(this.descTextOpus_).mergeFrom((TextParagraph) textParagraph).buildPartial();
        } else {
            this.descTextOpus_ = textParagraph;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureGate(DynFeatureGate dynFeatureGate) {
        dynFeatureGate.getClass();
        DynFeatureGate dynFeatureGate2 = this.featureGate_;
        if (dynFeatureGate2 != null && dynFeatureGate2 != DynFeatureGate.getDefaultInstance()) {
            this.featureGate_ = DynFeatureGate.newBuilder(this.featureGate_).mergeFrom((DynFeatureGate) dynFeatureGate).buildPartial();
        } else {
            this.featureGate_ = dynFeatureGate;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOpusSummary(ModuleOpusSummary moduleOpusSummary) {
        moduleOpusSummary.getClass();
        ModuleOpusSummary moduleOpusSummary2 = this.opusSummary_;
        if (moduleOpusSummary2 != null && moduleOpusSummary2 != ModuleOpusSummary.getDefaultInstance()) {
            this.opusSummary_ = ModuleOpusSummary.newBuilder(this.opusSummary_).mergeFrom((ModuleOpusSummary) moduleOpusSummary).buildPartial();
        } else {
            this.opusSummary_ = moduleOpusSummary;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReply(ExtendReply extendReply) {
        extendReply.getClass();
        ExtendReply extendReply2 = this.reply_;
        if (extendReply2 != null && extendReply2 != ExtendReply.getDefaultInstance()) {
            this.reply_ = ExtendReply.newBuilder(this.reply_).mergeFrom((ExtendReply) extendReply).buildPartial();
        } else {
            this.reply_ = extendReply;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRepostExtraInfo(RepostExtraInfo repostExtraInfo) {
        repostExtraInfo.getClass();
        RepostExtraInfo repostExtraInfo2 = this.repostExtraInfo_;
        if (repostExtraInfo2 != null && repostExtraInfo2 != RepostExtraInfo.getDefaultInstance()) {
            this.repostExtraInfo_ = RepostExtraInfo.newBuilder(this.repostExtraInfo_).mergeFrom((RepostExtraInfo) repostExtraInfo).buildPartial();
        } else {
            this.repostExtraInfo_ = repostExtraInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContent(Any any) {
        any.getClass();
        Any any2 = this.sourceContent_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.sourceContent_ = Any.newBuilder(this.sourceContent_).mergeFrom((Any) any).buildPartial();
        } else {
            this.sourceContent_ = any;
        }
    }

    public static C5476b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Extend parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Extend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Extend parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Extend> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDesc(int i2) {
        ensureDescIsMutable();
        this.desc_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOrigDesc(int i2) {
        ensureOrigDescIsMutable();
        this.origDesc_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessId(String str) {
        str.getClass();
        this.businessId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.businessId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardUrl(String str) {
        str.getClass();
        this.cardUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cardUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(int i2, Description description) {
        description.getClass();
        ensureDescIsMutable();
        this.desc_.set(i2, description);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescTextOpus(TextParagraph textParagraph) {
        textParagraph.getClass();
        this.descTextOpus_ = textParagraph;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDynIdStr(String str) {
        str.getClass();
        this.dynIdStr_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDynIdStrBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dynIdStr_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDynType(long j2) {
        this.dynType_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureGate(DynFeatureGate dynFeatureGate) {
        dynFeatureGate.getClass();
        this.featureGate_ = dynFeatureGate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFastShare(boolean z) {
        this.isFastShare_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInAudit(boolean z) {
        this.isInAudit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPreviewOnly(boolean z) {
        this.isPreviewOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnlyFansProperty(OnlyFansProperty onlyFansProperty) {
        onlyFansProperty.getClass();
        this.onlyFansProperty_ = onlyFansProperty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpusSummary(ModuleOpusSummary moduleOpusSummary) {
        moduleOpusSummary.getClass();
        this.opusSummary_ = moduleOpusSummary;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigDesc(int i2, Description description) {
        description.getClass();
        ensureOrigDescIsMutable();
        this.origDesc_.set(i2, description);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigDynIdStr(String str) {
        str.getClass();
        this.origDynIdStr_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigDynIdStrBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.origDynIdStr_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigDynType(DynamicType dynamicType) {
        this.origDynType_ = dynamicType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigDynTypeValue(int i2) {
        this.origDynType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigFace(String str) {
        str.getClass();
        this.origFace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigFaceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.origFace_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigImgUrl(String str) {
        str.getClass();
        this.origImgUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigImgUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.origImgUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigName(String str) {
        str.getClass();
        this.origName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.origName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRType(int i2) {
        this.rType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReply(ExtendReply extendReply) {
        extendReply.getClass();
        this.reply_ = extendReply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportMetricData(String str) {
        str.getClass();
        this.reportMetricData_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportMetricDataBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reportMetricData_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRepostExtraInfo(RepostExtraInfo repostExtraInfo) {
        repostExtraInfo.getClass();
        this.repostExtraInfo_ = repostExtraInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareScene(String str) {
        str.getClass();
        this.shareScene_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareSceneBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shareScene_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareType(String str) {
        str.getClass();
        this.shareType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shareType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContent(Any any) {
        any.getClass();
        this.sourceContent_ = any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackId(String str) {
        str.getClass();
        this.trackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(long j2) {
        this.uid_ = j2;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public boolean containsHistoryReport(String str) {
        str.getClass();
        return internalGetHistoryReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5475a c5475a = null;
        switch (C5475a.f17299xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Extend();
            case 2:
                return new C5476b(c5475a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001c\u0000\u0000\u0001\u001c\u001c\u0001\u0002\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u001b\u0007\u001b\b\f\t\u0208\n\u0208\u000b\u0007\f\u0004\r\u0002\u000e\u0002\u000f\u0208\u0010\t\u0011\u0208\u0012\t\u0013\u0208\u0014\t\u0015\t\u0016\t\u0017\u0007\u00182\u0019\u0208\u001a\t\u001b\u0007\u001c\t", new Object[]{"dynIdStr_", "businessId_", "origDynIdStr_", "origName_", "origImgUrl_", "origDesc_", Description.class, "desc_", Description.class, "origDynType_", "shareType_", "shareScene_", "isFastShare_", "rType_", "dynType_", "uid_", "cardUrl_", "sourceContent_", "origFace_", "reply_", "trackId_", "opusSummary_", "onlyFansProperty_", "featureGate_", "isInAudit_", "historyReport_", C5477c.defaultEntry, "reportMetricData_", "descTextOpus_", "isPreviewOnly_", "repostExtraInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Extend> parser = PARSER;
                if (parser == null) {
                    synchronized (Extend.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getBusinessId() {
        return this.businessId_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ByteString getBusinessIdBytes() {
        return ByteString.copyFromUtf8(this.businessId_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getCardUrl() {
        return this.cardUrl_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ByteString getCardUrlBytes() {
        return ByteString.copyFromUtf8(this.cardUrl_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    @Deprecated
    public Description getDesc(int i2) {
        return this.desc_.get(i2);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    @Deprecated
    public int getDescCount() {
        return this.desc_.size();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    @Deprecated
    public List<Description> getDescList() {
        return this.desc_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public TextParagraph getDescTextOpus() {
        TextParagraph textParagraph = this.descTextOpus_;
        return textParagraph == null ? TextParagraph.getDefaultInstance() : textParagraph;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getDynIdStr() {
        return this.dynIdStr_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ByteString getDynIdStrBytes() {
        return ByteString.copyFromUtf8(this.dynIdStr_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public long getDynType() {
        return this.dynType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public DynFeatureGate getFeatureGate() {
        DynFeatureGate dynFeatureGate = this.featureGate_;
        return dynFeatureGate == null ? DynFeatureGate.getDefaultInstance() : dynFeatureGate;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    @Deprecated
    public Map<String, String> getHistoryReport() {
        return getHistoryReportMap();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public int getHistoryReportCount() {
        return internalGetHistoryReport().size();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public Map<String, String> getHistoryReportMap() {
        return Collections.unmodifiableMap(internalGetHistoryReport());
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getHistoryReportOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetHistoryReport = internalGetHistoryReport();
        return internalGetHistoryReport.containsKey(str) ? internalGetHistoryReport.get(str) : str2;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getHistoryReportOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetHistoryReport = internalGetHistoryReport();
        if (internalGetHistoryReport.containsKey(str)) {
            return internalGetHistoryReport.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public boolean getIsFastShare() {
        return this.isFastShare_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public boolean getIsInAudit() {
        return this.isInAudit_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public boolean getIsPreviewOnly() {
        return this.isPreviewOnly_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public OnlyFansProperty getOnlyFansProperty() {
        return this.onlyFansProperty_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ModuleOpusSummary getOpusSummary() {
        ModuleOpusSummary moduleOpusSummary = this.opusSummary_;
        return moduleOpusSummary == null ? ModuleOpusSummary.getDefaultInstance() : moduleOpusSummary;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public Description getOrigDesc(int i2) {
        return this.origDesc_.get(i2);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public int getOrigDescCount() {
        return this.origDesc_.size();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public List<Description> getOrigDescList() {
        return this.origDesc_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getOrigDynIdStr() {
        return this.origDynIdStr_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ByteString getOrigDynIdStrBytes() {
        return ByteString.copyFromUtf8(this.origDynIdStr_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public DynamicType getOrigDynType() {
        DynamicType forNumber = DynamicType.forNumber(this.origDynType_);
        return forNumber == null ? DynamicType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public int getOrigDynTypeValue() {
        return this.origDynType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getOrigFace() {
        return this.origFace_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ByteString getOrigFaceBytes() {
        return ByteString.copyFromUtf8(this.origFace_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getOrigImgUrl() {
        return this.origImgUrl_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ByteString getOrigImgUrlBytes() {
        return ByteString.copyFromUtf8(this.origImgUrl_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getOrigName() {
        return this.origName_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ByteString getOrigNameBytes() {
        return ByteString.copyFromUtf8(this.origName_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public int getRType() {
        return this.rType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ExtendReply getReply() {
        ExtendReply extendReply = this.reply_;
        return extendReply == null ? ExtendReply.getDefaultInstance() : extendReply;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getReportMetricData() {
        return this.reportMetricData_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ByteString getReportMetricDataBytes() {
        return ByteString.copyFromUtf8(this.reportMetricData_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public RepostExtraInfo getRepostExtraInfo() {
        RepostExtraInfo repostExtraInfo = this.repostExtraInfo_;
        return repostExtraInfo == null ? RepostExtraInfo.getDefaultInstance() : repostExtraInfo;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getShareScene() {
        return this.shareScene_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ByteString getShareSceneBytes() {
        return ByteString.copyFromUtf8(this.shareScene_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getShareType() {
        return this.shareType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ByteString getShareTypeBytes() {
        return ByteString.copyFromUtf8(this.shareType_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public Any getSourceContent() {
        Any any = this.sourceContent_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public String getTrackId() {
        return this.trackId_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public ByteString getTrackIdBytes() {
        return ByteString.copyFromUtf8(this.trackId_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public long getUid() {
        return this.uid_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public boolean hasDescTextOpus() {
        return this.descTextOpus_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public boolean hasFeatureGate() {
        return this.featureGate_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public boolean hasOnlyFansProperty() {
        return this.onlyFansProperty_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public boolean hasOpusSummary() {
        return this.opusSummary_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public boolean hasReply() {
        return this.reply_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public boolean hasRepostExtraInfo() {
        return this.repostExtraInfo_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o1
    public boolean hasSourceContent() {
        return this.sourceContent_ != null;
    }

    public static C5476b newBuilder(Extend extend) {
        return DEFAULT_INSTANCE.createBuilder(extend);
    }

    public static Extend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Extend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Extend parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Extend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDesc(int i2, Description description) {
        description.getClass();
        ensureDescIsMutable();
        this.desc_.add(i2, description);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOrigDesc(int i2, Description description) {
        description.getClass();
        ensureOrigDescIsMutable();
        this.origDesc_.add(i2, description);
    }

    public static Extend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Extend parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Extend parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Extend parseFrom(InputStream inputStream) throws IOException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Extend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Extend parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Extend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
