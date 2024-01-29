package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes20.dex */
public final class DmViewReply extends GeneratedMessageLite<DmViewReply, DmViewReply.C9025b> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_META_FIELD_NUMBER = 18;
    public static final int AI_FLAG_FIELD_NUMBER = 5;
    public static final int ALLOW_FIELD_NUMBER = 8;
    public static final int BUZZWORD_CONFIG_FIELD_NUMBER = 15;
    public static final int CHECK_BOX_FIELD_NUMBER = 9;
    public static final int CHECK_BOX_SHOW_MSG_FIELD_NUMBER = 10;
    public static final int CLOSED_FIELD_NUMBER = 1;
    public static final int COMMAND_FIELD_NUMBER = 22;
    private static final DmViewReply DEFAULT_INSTANCE;
    public static final int DM_HERD_FIELD_NUMBER = 21;
    public static final int DM_MASK_WALL_FIELD_NUMBER = 20;
    public static final int EXPO_REPORT_FIELD_NUMBER = 14;
    public static final int EXPRESSIONS_FIELD_NUMBER = 16;
    public static final int INPUT_PLACEHOLDER_FIELD_NUMBER = 12;
    public static final int KV_FIELD_NUMBER = 23;
    public static final int MASK_FIELD_NUMBER = 2;
    private static volatile Parser<DmViewReply> PARSER = null;
    public static final int PLAYER_CONFIG_FIELD_NUMBER = 6;
    public static final int POST_PANEL_2_FIELD_NUMBER = 19;
    public static final int POST_PANEL_FIELD_NUMBER = 17;
    public static final int QOE_FIELD_NUMBER = 25;
    public static final int REPORT_FILTER_CONTENT_FIELD_NUMBER = 13;
    public static final int SEND_BOX_STYLE_FIELD_NUMBER = 7;
    public static final int SPECIAL_DMS_FIELD_NUMBER = 4;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int SUB_VIEWS_FIELD_NUMBER = 24;
    public static final int TEXT_PLACEHOLDER_FIELD_NUMBER = 11;
    private DanmakuFlagConfig aiFlag_;
    private boolean allow_;
    private BuzzwordConfig buzzwordConfig_;
    private boolean checkBox_;
    private boolean closed_;
    private Command command_;
    private DmHerdView dmHerd_;
    private ExpoReport expoReport_;
    private VideoMask mask_;
    private DanmuPlayerViewConfig playerConfig_;
    private QoeInfo qoe_;
    private int sendBoxStyle_;
    private VideoSubtitle subtitle_;
    private Internal.ProtobufList<String> specialDms_ = GeneratedMessageLite.emptyProtobufList();
    private String checkBoxShowMsg_ = "";
    private String textPlaceholder_ = "";
    private String inputPlaceholder_ = "";
    private Internal.ProtobufList<String> reportFilterContent_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Expressions> expressions_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<PostPanel> postPanel_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> activityMeta_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<PostPanelV2> postPanel2_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<DmMaskWall> dmMaskWall_ = GeneratedMessageLite.emptyProtobufList();
    private String kv_ = "";
    private Internal.ProtobufList<DmSubView> subViews_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmViewReply$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C9024a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f18608xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f18608xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18608xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18608xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18608xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18608xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18608xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18608xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmViewReply$b */
    /* loaded from: classes20.dex */
    public static final class C9025b extends GeneratedMessageLite.Builder<DmViewReply, C9025b> implements MessageLiteOrBuilder {
        /* synthetic */ C9025b(C9024a c9024a) {
            this();
        }

        public C9025b addActivityMeta(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).addActivityMeta(str);
            return this;
        }

        public C9025b addActivityMetaBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).addActivityMetaBytes(byteString);
            return this;
        }

        public C9025b addAllActivityMeta(Iterable<String> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllActivityMeta(iterable);
            return this;
        }

        public C9025b addAllDmMaskWall(Iterable<? extends DmMaskWall> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllDmMaskWall(iterable);
            return this;
        }

        public C9025b addAllExpressions(Iterable<? extends Expressions> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllExpressions(iterable);
            return this;
        }

        public C9025b addAllPostPanel(Iterable<? extends PostPanel> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllPostPanel(iterable);
            return this;
        }

        public C9025b addAllPostPanel2(Iterable<? extends PostPanelV2> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllPostPanel2(iterable);
            return this;
        }

        public C9025b addAllReportFilterContent(Iterable<String> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllReportFilterContent(iterable);
            return this;
        }

        public C9025b addAllSpecialDms(Iterable<String> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllSpecialDms(iterable);
            return this;
        }

        public C9025b addAllSubViews(Iterable<? extends DmSubView> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllSubViews(iterable);
            return this;
        }

        public C9025b addDmMaskWall(DmMaskWall dmMaskWall) {
            copyOnWrite();
            ((DmViewReply) this.instance).addDmMaskWall(dmMaskWall);
            return this;
        }

        public C9025b addExpressions(Expressions expressions) {
            copyOnWrite();
            ((DmViewReply) this.instance).addExpressions(expressions);
            return this;
        }

        public C9025b addPostPanel(PostPanel postPanel) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel(postPanel);
            return this;
        }

        public C9025b addPostPanel2(PostPanelV2 postPanelV2) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel2(postPanelV2);
            return this;
        }

        public C9025b addReportFilterContent(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).addReportFilterContent(str);
            return this;
        }

        public C9025b addReportFilterContentBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).addReportFilterContentBytes(byteString);
            return this;
        }

        public C9025b addSpecialDms(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).addSpecialDms(str);
            return this;
        }

        public C9025b addSpecialDmsBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).addSpecialDmsBytes(byteString);
            return this;
        }

        public C9025b addSubViews(DmSubView dmSubView) {
            copyOnWrite();
            ((DmViewReply) this.instance).addSubViews(dmSubView);
            return this;
        }

        public C9025b clearActivityMeta() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearActivityMeta();
            return this;
        }

        public C9025b clearAiFlag() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearAiFlag();
            return this;
        }

        public C9025b clearAllow() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearAllow();
            return this;
        }

        public C9025b clearBuzzwordConfig() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearBuzzwordConfig();
            return this;
        }

        public C9025b clearCheckBox() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearCheckBox();
            return this;
        }

        public C9025b clearCheckBoxShowMsg() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearCheckBoxShowMsg();
            return this;
        }

        public C9025b clearClosed() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearClosed();
            return this;
        }

        public C9025b clearCommand() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearCommand();
            return this;
        }

        public C9025b clearDmHerd() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearDmHerd();
            return this;
        }

        public C9025b clearDmMaskWall() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearDmMaskWall();
            return this;
        }

        public C9025b clearExpoReport() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearExpoReport();
            return this;
        }

        public C9025b clearExpressions() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearExpressions();
            return this;
        }

        public C9025b clearInputPlaceholder() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearInputPlaceholder();
            return this;
        }

        public C9025b clearKv() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearKv();
            return this;
        }

        public C9025b clearMask() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearMask();
            return this;
        }

        public C9025b clearPlayerConfig() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearPlayerConfig();
            return this;
        }

        public C9025b clearPostPanel() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearPostPanel();
            return this;
        }

        public C9025b clearPostPanel2() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearPostPanel2();
            return this;
        }

        public C9025b clearQoe() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearQoe();
            return this;
        }

        public C9025b clearReportFilterContent() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearReportFilterContent();
            return this;
        }

        public C9025b clearSendBoxStyle() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearSendBoxStyle();
            return this;
        }

        public C9025b clearSpecialDms() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearSpecialDms();
            return this;
        }

        public C9025b clearSubViews() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearSubViews();
            return this;
        }

        public C9025b clearSubtitle() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearSubtitle();
            return this;
        }

        public C9025b clearTextPlaceholder() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearTextPlaceholder();
            return this;
        }

        public String getActivityMeta(int i2) {
            return ((DmViewReply) this.instance).getActivityMeta(i2);
        }

        public ByteString getActivityMetaBytes(int i2) {
            return ((DmViewReply) this.instance).getActivityMetaBytes(i2);
        }

        public int getActivityMetaCount() {
            return ((DmViewReply) this.instance).getActivityMetaCount();
        }

        public List<String> getActivityMetaList() {
            return Collections.unmodifiableList(((DmViewReply) this.instance).getActivityMetaList());
        }

        public DanmakuFlagConfig getAiFlag() {
            return ((DmViewReply) this.instance).getAiFlag();
        }

        public boolean getAllow() {
            return ((DmViewReply) this.instance).getAllow();
        }

        public BuzzwordConfig getBuzzwordConfig() {
            return ((DmViewReply) this.instance).getBuzzwordConfig();
        }

        public boolean getCheckBox() {
            return ((DmViewReply) this.instance).getCheckBox();
        }

        public String getCheckBoxShowMsg() {
            return ((DmViewReply) this.instance).getCheckBoxShowMsg();
        }

        public ByteString getCheckBoxShowMsgBytes() {
            return ((DmViewReply) this.instance).getCheckBoxShowMsgBytes();
        }

        public boolean getClosed() {
            return ((DmViewReply) this.instance).getClosed();
        }

        public Command getCommand() {
            return ((DmViewReply) this.instance).getCommand();
        }

        public DmHerdView getDmHerd() {
            return ((DmViewReply) this.instance).getDmHerd();
        }

        public DmMaskWall getDmMaskWall(int i2) {
            return ((DmViewReply) this.instance).getDmMaskWall(i2);
        }

        public int getDmMaskWallCount() {
            return ((DmViewReply) this.instance).getDmMaskWallCount();
        }

        public List<DmMaskWall> getDmMaskWallList() {
            return Collections.unmodifiableList(((DmViewReply) this.instance).getDmMaskWallList());
        }

        public ExpoReport getExpoReport() {
            return ((DmViewReply) this.instance).getExpoReport();
        }

        public Expressions getExpressions(int i2) {
            return ((DmViewReply) this.instance).getExpressions(i2);
        }

        public int getExpressionsCount() {
            return ((DmViewReply) this.instance).getExpressionsCount();
        }

        public List<Expressions> getExpressionsList() {
            return Collections.unmodifiableList(((DmViewReply) this.instance).getExpressionsList());
        }

        public String getInputPlaceholder() {
            return ((DmViewReply) this.instance).getInputPlaceholder();
        }

        public ByteString getInputPlaceholderBytes() {
            return ((DmViewReply) this.instance).getInputPlaceholderBytes();
        }

        public String getKv() {
            return ((DmViewReply) this.instance).getKv();
        }

        public ByteString getKvBytes() {
            return ((DmViewReply) this.instance).getKvBytes();
        }

        public VideoMask getMask() {
            return ((DmViewReply) this.instance).getMask();
        }

        public DanmuPlayerViewConfig getPlayerConfig() {
            return ((DmViewReply) this.instance).getPlayerConfig();
        }

        public PostPanel getPostPanel(int i2) {
            return ((DmViewReply) this.instance).getPostPanel(i2);
        }

        public PostPanelV2 getPostPanel2(int i2) {
            return ((DmViewReply) this.instance).getPostPanel2(i2);
        }

        public int getPostPanel2Count() {
            return ((DmViewReply) this.instance).getPostPanel2Count();
        }

        public List<PostPanelV2> getPostPanel2List() {
            return Collections.unmodifiableList(((DmViewReply) this.instance).getPostPanel2List());
        }

        public int getPostPanelCount() {
            return ((DmViewReply) this.instance).getPostPanelCount();
        }

        public List<PostPanel> getPostPanelList() {
            return Collections.unmodifiableList(((DmViewReply) this.instance).getPostPanelList());
        }

        public QoeInfo getQoe() {
            return ((DmViewReply) this.instance).getQoe();
        }

        public String getReportFilterContent(int i2) {
            return ((DmViewReply) this.instance).getReportFilterContent(i2);
        }

        public ByteString getReportFilterContentBytes(int i2) {
            return ((DmViewReply) this.instance).getReportFilterContentBytes(i2);
        }

        public int getReportFilterContentCount() {
            return ((DmViewReply) this.instance).getReportFilterContentCount();
        }

        public List<String> getReportFilterContentList() {
            return Collections.unmodifiableList(((DmViewReply) this.instance).getReportFilterContentList());
        }

        public int getSendBoxStyle() {
            return ((DmViewReply) this.instance).getSendBoxStyle();
        }

        public String getSpecialDms(int i2) {
            return ((DmViewReply) this.instance).getSpecialDms(i2);
        }

        public ByteString getSpecialDmsBytes(int i2) {
            return ((DmViewReply) this.instance).getSpecialDmsBytes(i2);
        }

        public int getSpecialDmsCount() {
            return ((DmViewReply) this.instance).getSpecialDmsCount();
        }

        public List<String> getSpecialDmsList() {
            return Collections.unmodifiableList(((DmViewReply) this.instance).getSpecialDmsList());
        }

        public DmSubView getSubViews(int i2) {
            return ((DmViewReply) this.instance).getSubViews(i2);
        }

        public int getSubViewsCount() {
            return ((DmViewReply) this.instance).getSubViewsCount();
        }

        public List<DmSubView> getSubViewsList() {
            return Collections.unmodifiableList(((DmViewReply) this.instance).getSubViewsList());
        }

        public VideoSubtitle getSubtitle() {
            return ((DmViewReply) this.instance).getSubtitle();
        }

        public String getTextPlaceholder() {
            return ((DmViewReply) this.instance).getTextPlaceholder();
        }

        public ByteString getTextPlaceholderBytes() {
            return ((DmViewReply) this.instance).getTextPlaceholderBytes();
        }

        public boolean hasAiFlag() {
            return ((DmViewReply) this.instance).hasAiFlag();
        }

        public boolean hasBuzzwordConfig() {
            return ((DmViewReply) this.instance).hasBuzzwordConfig();
        }

        public boolean hasCommand() {
            return ((DmViewReply) this.instance).hasCommand();
        }

        public boolean hasDmHerd() {
            return ((DmViewReply) this.instance).hasDmHerd();
        }

        public boolean hasExpoReport() {
            return ((DmViewReply) this.instance).hasExpoReport();
        }

        public boolean hasMask() {
            return ((DmViewReply) this.instance).hasMask();
        }

        public boolean hasPlayerConfig() {
            return ((DmViewReply) this.instance).hasPlayerConfig();
        }

        public boolean hasQoe() {
            return ((DmViewReply) this.instance).hasQoe();
        }

        public boolean hasSubtitle() {
            return ((DmViewReply) this.instance).hasSubtitle();
        }

        public C9025b mergeAiFlag(DanmakuFlagConfig danmakuFlagConfig) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeAiFlag(danmakuFlagConfig);
            return this;
        }

        public C9025b mergeBuzzwordConfig(BuzzwordConfig buzzwordConfig) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeBuzzwordConfig(buzzwordConfig);
            return this;
        }

        public C9025b mergeCommand(Command command) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeCommand(command);
            return this;
        }

        public C9025b mergeDmHerd(DmHerdView dmHerdView) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeDmHerd(dmHerdView);
            return this;
        }

        public C9025b mergeExpoReport(ExpoReport expoReport) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeExpoReport(expoReport);
            return this;
        }

        public C9025b mergeMask(VideoMask videoMask) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeMask(videoMask);
            return this;
        }

        public C9025b mergePlayerConfig(DanmuPlayerViewConfig danmuPlayerViewConfig) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergePlayerConfig(danmuPlayerViewConfig);
            return this;
        }

        public C9025b mergeQoe(QoeInfo qoeInfo) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeQoe(qoeInfo);
            return this;
        }

        public C9025b mergeSubtitle(VideoSubtitle videoSubtitle) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeSubtitle(videoSubtitle);
            return this;
        }

        public C9025b removeDmMaskWall(int i2) {
            copyOnWrite();
            ((DmViewReply) this.instance).removeDmMaskWall(i2);
            return this;
        }

        public C9025b removeExpressions(int i2) {
            copyOnWrite();
            ((DmViewReply) this.instance).removeExpressions(i2);
            return this;
        }

        public C9025b removePostPanel(int i2) {
            copyOnWrite();
            ((DmViewReply) this.instance).removePostPanel(i2);
            return this;
        }

        public C9025b removePostPanel2(int i2) {
            copyOnWrite();
            ((DmViewReply) this.instance).removePostPanel2(i2);
            return this;
        }

        public C9025b removeSubViews(int i2) {
            copyOnWrite();
            ((DmViewReply) this.instance).removeSubViews(i2);
            return this;
        }

        public C9025b setActivityMeta(int i2, String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setActivityMeta(i2, str);
            return this;
        }

        public C9025b setAiFlag(DanmakuFlagConfig danmakuFlagConfig) {
            copyOnWrite();
            ((DmViewReply) this.instance).setAiFlag(danmakuFlagConfig);
            return this;
        }

        public C9025b setAllow(boolean z) {
            copyOnWrite();
            ((DmViewReply) this.instance).setAllow(z);
            return this;
        }

        public C9025b setBuzzwordConfig(BuzzwordConfig buzzwordConfig) {
            copyOnWrite();
            ((DmViewReply) this.instance).setBuzzwordConfig(buzzwordConfig);
            return this;
        }

        public C9025b setCheckBox(boolean z) {
            copyOnWrite();
            ((DmViewReply) this.instance).setCheckBox(z);
            return this;
        }

        public C9025b setCheckBoxShowMsg(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setCheckBoxShowMsg(str);
            return this;
        }

        public C9025b setCheckBoxShowMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).setCheckBoxShowMsgBytes(byteString);
            return this;
        }

        public C9025b setClosed(boolean z) {
            copyOnWrite();
            ((DmViewReply) this.instance).setClosed(z);
            return this;
        }

        public C9025b setCommand(Command command) {
            copyOnWrite();
            ((DmViewReply) this.instance).setCommand(command);
            return this;
        }

        public C9025b setDmHerd(DmHerdView dmHerdView) {
            copyOnWrite();
            ((DmViewReply) this.instance).setDmHerd(dmHerdView);
            return this;
        }

        public C9025b setDmMaskWall(int i2, DmMaskWall dmMaskWall) {
            copyOnWrite();
            ((DmViewReply) this.instance).setDmMaskWall(i2, dmMaskWall);
            return this;
        }

        public C9025b setExpoReport(ExpoReport expoReport) {
            copyOnWrite();
            ((DmViewReply) this.instance).setExpoReport(expoReport);
            return this;
        }

        public C9025b setExpressions(int i2, Expressions expressions) {
            copyOnWrite();
            ((DmViewReply) this.instance).setExpressions(i2, expressions);
            return this;
        }

        public C9025b setInputPlaceholder(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setInputPlaceholder(str);
            return this;
        }

        public C9025b setInputPlaceholderBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).setInputPlaceholderBytes(byteString);
            return this;
        }

        public C9025b setKv(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setKv(str);
            return this;
        }

        public C9025b setKvBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).setKvBytes(byteString);
            return this;
        }

        public C9025b setMask(VideoMask videoMask) {
            copyOnWrite();
            ((DmViewReply) this.instance).setMask(videoMask);
            return this;
        }

        public C9025b setPlayerConfig(DanmuPlayerViewConfig danmuPlayerViewConfig) {
            copyOnWrite();
            ((DmViewReply) this.instance).setPlayerConfig(danmuPlayerViewConfig);
            return this;
        }

        public C9025b setPostPanel(int i2, PostPanel postPanel) {
            copyOnWrite();
            ((DmViewReply) this.instance).setPostPanel(i2, postPanel);
            return this;
        }

        public C9025b setPostPanel2(int i2, PostPanelV2 postPanelV2) {
            copyOnWrite();
            ((DmViewReply) this.instance).setPostPanel2(i2, postPanelV2);
            return this;
        }

        public C9025b setQoe(QoeInfo qoeInfo) {
            copyOnWrite();
            ((DmViewReply) this.instance).setQoe(qoeInfo);
            return this;
        }

        public C9025b setReportFilterContent(int i2, String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setReportFilterContent(i2, str);
            return this;
        }

        public C9025b setSendBoxStyle(int i2) {
            copyOnWrite();
            ((DmViewReply) this.instance).setSendBoxStyle(i2);
            return this;
        }

        public C9025b setSpecialDms(int i2, String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setSpecialDms(i2, str);
            return this;
        }

        public C9025b setSubViews(int i2, DmSubView dmSubView) {
            copyOnWrite();
            ((DmViewReply) this.instance).setSubViews(i2, dmSubView);
            return this;
        }

        public C9025b setSubtitle(VideoSubtitle videoSubtitle) {
            copyOnWrite();
            ((DmViewReply) this.instance).setSubtitle(videoSubtitle);
            return this;
        }

        public C9025b setTextPlaceholder(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setTextPlaceholder(str);
            return this;
        }

        public C9025b setTextPlaceholderBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).setTextPlaceholderBytes(byteString);
            return this;
        }

        private C9025b() {
            super(DmViewReply.DEFAULT_INSTANCE);
        }

        public C9025b addDmMaskWall(int i2, DmMaskWall dmMaskWall) {
            copyOnWrite();
            ((DmViewReply) this.instance).addDmMaskWall(i2, dmMaskWall);
            return this;
        }

        public C9025b addExpressions(int i2, Expressions expressions) {
            copyOnWrite();
            ((DmViewReply) this.instance).addExpressions(i2, expressions);
            return this;
        }

        public C9025b addPostPanel(int i2, PostPanel postPanel) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel(i2, postPanel);
            return this;
        }

        public C9025b addPostPanel2(int i2, PostPanelV2 postPanelV2) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel2(i2, postPanelV2);
            return this;
        }

        public C9025b addSubViews(int i2, DmSubView dmSubView) {
            copyOnWrite();
            ((DmViewReply) this.instance).addSubViews(i2, dmSubView);
            return this;
        }

        public C9025b setAiFlag(DanmakuFlagConfig.Builder c8976b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setAiFlag(c8976b.build());
            return this;
        }

        public C9025b setBuzzwordConfig(BuzzwordConfig.Builder c8952b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setBuzzwordConfig(c8952b.build());
            return this;
        }

        public C9025b setCommand(Command.Builder c8966b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setCommand(c8966b.build());
            return this;
        }

        public C9025b setDmHerd(DmHerdView.Builder c9001b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setDmHerd(c9001b.build());
            return this;
        }

        public C9025b setDmMaskWall(int i2, DmMaskWall.Builder c9003b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setDmMaskWall(i2, c9003b.build());
            return this;
        }

        public C9025b setExpoReport(ExpoReport.Builder c9031b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setExpoReport(c9031b.build());
            return this;
        }

        public C9025b setExpressions(int i2, Expressions.Builder c9037b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setExpressions(i2, c9037b.build());
            return this;
        }

        public C9025b setMask(VideoMask.Builder c9121b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setMask(c9121b.build());
            return this;
        }

        public C9025b setPlayerConfig(DanmuPlayerViewConfig.Builder c8988b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setPlayerConfig(c8988b.build());
            return this;
        }

        public C9025b setPostPanel(int i2, PostPanel.Builder c9085b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setPostPanel(i2, c9085b.build());
            return this;
        }

        public C9025b setPostPanel2(int i2, PostPanelV2.Builder c9089b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setPostPanel2(i2, c9089b.build());
            return this;
        }

        public C9025b setQoe(QoeInfo.C9093b c9093b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setQoe(c9093b.build());
            return this;
        }

        public C9025b setSubViews(int i2, DmSubView.C9023b c9023b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setSubViews(i2, c9023b.build());
            return this;
        }

        public C9025b setSubtitle(VideoSubtitle.Builder c9123b) {
            copyOnWrite();
            ((DmViewReply) this.instance).setSubtitle(c9123b.build());
            return this;
        }

        public C9025b addDmMaskWall(DmMaskWall.Builder c9003b) {
            copyOnWrite();
            ((DmViewReply) this.instance).addDmMaskWall(c9003b.build());
            return this;
        }

        public C9025b addExpressions(Expressions.Builder c9037b) {
            copyOnWrite();
            ((DmViewReply) this.instance).addExpressions(c9037b.build());
            return this;
        }

        public C9025b addPostPanel(PostPanel.Builder c9085b) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel(c9085b.build());
            return this;
        }

        public C9025b addPostPanel2(PostPanelV2.Builder c9089b) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel2(c9089b.build());
            return this;
        }

        public C9025b addSubViews(DmSubView.C9023b c9023b) {
            copyOnWrite();
            ((DmViewReply) this.instance).addSubViews(c9023b.build());
            return this;
        }

        public C9025b addDmMaskWall(int i2, DmMaskWall.Builder c9003b) {
            copyOnWrite();
            ((DmViewReply) this.instance).addDmMaskWall(i2, c9003b.build());
            return this;
        }

        public C9025b addExpressions(int i2, Expressions.Builder c9037b) {
            copyOnWrite();
            ((DmViewReply) this.instance).addExpressions(i2, c9037b.build());
            return this;
        }

        public C9025b addPostPanel(int i2, PostPanel.Builder c9085b) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel(i2, c9085b.build());
            return this;
        }

        public C9025b addPostPanel2(int i2, PostPanelV2.Builder c9089b) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel2(i2, c9089b.build());
            return this;
        }

        public C9025b addSubViews(int i2, DmSubView.C9023b c9023b) {
            copyOnWrite();
            ((DmViewReply) this.instance).addSubViews(i2, c9023b.build());
            return this;
        }
    }

    static {
        DmViewReply dmViewReply = new DmViewReply();
        DEFAULT_INSTANCE = dmViewReply;
        GeneratedMessageLite.registerDefaultInstance(DmViewReply.class, dmViewReply);
    }

    public DmViewReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActivityMeta(String str) {
        str.getClass();
        ensureActivityMetaIsMutable();
        this.activityMeta_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActivityMetaBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureActivityMetaIsMutable();
        this.activityMeta_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllActivityMeta(Iterable<String> iterable) {
        ensureActivityMetaIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.activityMeta_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDmMaskWall(Iterable<? extends DmMaskWall> iterable) {
        ensureDmMaskWallIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.dmMaskWall_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExpressions(Iterable<? extends Expressions> iterable) {
        ensureExpressionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.expressions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPostPanel(Iterable<? extends PostPanel> iterable) {
        ensurePostPanelIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.postPanel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPostPanel2(Iterable<? extends PostPanelV2> iterable) {
        ensurePostPanel2IsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.postPanel2_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReportFilterContent(Iterable<String> iterable) {
        ensureReportFilterContentIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.reportFilterContent_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpecialDms(Iterable<String> iterable) {
        ensureSpecialDmsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.specialDms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubViews(Iterable<? extends DmSubView> iterable) {
        ensureSubViewsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.subViews_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDmMaskWall(DmMaskWall dmMaskWall) {
        dmMaskWall.getClass();
        ensureDmMaskWallIsMutable();
        this.dmMaskWall_.add(dmMaskWall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExpressions(Expressions expressions) {
        expressions.getClass();
        ensureExpressionsIsMutable();
        this.expressions_.add(expressions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPostPanel(PostPanel postPanel) {
        postPanel.getClass();
        ensurePostPanelIsMutable();
        this.postPanel_.add(postPanel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPostPanel2(PostPanelV2 postPanelV2) {
        postPanelV2.getClass();
        ensurePostPanel2IsMutable();
        this.postPanel2_.add(postPanelV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReportFilterContent(String str) {
        str.getClass();
        ensureReportFilterContentIsMutable();
        this.reportFilterContent_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReportFilterContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureReportFilterContentIsMutable();
        this.reportFilterContent_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpecialDms(String str) {
        str.getClass();
        ensureSpecialDmsIsMutable();
        this.specialDms_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpecialDmsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureSpecialDmsIsMutable();
        this.specialDms_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubViews(DmSubView dmSubView) {
        dmSubView.getClass();
        ensureSubViewsIsMutable();
        this.subViews_.add(dmSubView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityMeta() {
        this.activityMeta_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAiFlag() {
        this.aiFlag_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllow() {
        this.allow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuzzwordConfig() {
        this.buzzwordConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCheckBox() {
        this.checkBox_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCheckBoxShowMsg() {
        this.checkBoxShowMsg_ = getDefaultInstance().getCheckBoxShowMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosed() {
        this.closed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommand() {
        this.command_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDmHerd() {
        this.dmHerd_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDmMaskWall() {
        this.dmMaskWall_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpoReport() {
        this.expoReport_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpressions() {
        this.expressions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInputPlaceholder() {
        this.inputPlaceholder_ = getDefaultInstance().getInputPlaceholder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKv() {
        this.kv_ = getDefaultInstance().getKv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMask() {
        this.mask_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerConfig() {
        this.playerConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPostPanel() {
        this.postPanel_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPostPanel2() {
        this.postPanel2_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQoe() {
        this.qoe_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportFilterContent() {
        this.reportFilterContent_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSendBoxStyle() {
        this.sendBoxStyle_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpecialDms() {
        this.specialDms_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubViews() {
        this.subViews_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextPlaceholder() {
        this.textPlaceholder_ = getDefaultInstance().getTextPlaceholder();
    }

    private void ensureActivityMetaIsMutable() {
        Internal.ProtobufList<String> protobufList = this.activityMeta_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.activityMeta_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureDmMaskWallIsMutable() {
        Internal.ProtobufList<DmMaskWall> protobufList = this.dmMaskWall_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.dmMaskWall_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureExpressionsIsMutable() {
        Internal.ProtobufList<Expressions> protobufList = this.expressions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.expressions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePostPanel2IsMutable() {
        Internal.ProtobufList<PostPanelV2> protobufList = this.postPanel2_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.postPanel2_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePostPanelIsMutable() {
        Internal.ProtobufList<PostPanel> protobufList = this.postPanel_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.postPanel_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureReportFilterContentIsMutable() {
        Internal.ProtobufList<String> protobufList = this.reportFilterContent_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.reportFilterContent_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSpecialDmsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.specialDms_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.specialDms_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSubViewsIsMutable() {
        Internal.ProtobufList<DmSubView> protobufList = this.subViews_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.subViews_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DmViewReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAiFlag(DanmakuFlagConfig danmakuFlagConfig) {
        danmakuFlagConfig.getClass();
        DanmakuFlagConfig danmakuFlagConfig2 = this.aiFlag_;
        if (danmakuFlagConfig2 != null && danmakuFlagConfig2 != DanmakuFlagConfig.getDefaultInstance()) {
            this.aiFlag_ = DanmakuFlagConfig.newBuilder(this.aiFlag_).mergeFrom((DanmakuFlagConfig) danmakuFlagConfig).buildPartial();
        } else {
            this.aiFlag_ = danmakuFlagConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBuzzwordConfig(BuzzwordConfig buzzwordConfig) {
        buzzwordConfig.getClass();
        BuzzwordConfig buzzwordConfig2 = this.buzzwordConfig_;
        if (buzzwordConfig2 != null && buzzwordConfig2 != BuzzwordConfig.getDefaultInstance()) {
            this.buzzwordConfig_ = BuzzwordConfig.newBuilder(this.buzzwordConfig_).mergeFrom((BuzzwordConfig) buzzwordConfig).buildPartial();
        } else {
            this.buzzwordConfig_ = buzzwordConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCommand(Command command) {
        command.getClass();
        Command command2 = this.command_;
        if (command2 != null && command2 != Command.getDefaultInstance()) {
            this.command_ = Command.newBuilder(this.command_).mergeFrom((Command) command).buildPartial();
        } else {
            this.command_ = command;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDmHerd(DmHerdView dmHerdView) {
        dmHerdView.getClass();
        DmHerdView dmHerdView2 = this.dmHerd_;
        if (dmHerdView2 != null && dmHerdView2 != DmHerdView.getDefaultInstance()) {
            this.dmHerd_ = DmHerdView.newBuilder(this.dmHerd_).mergeFrom((DmHerdView) dmHerdView).buildPartial();
        } else {
            this.dmHerd_ = dmHerdView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExpoReport(ExpoReport expoReport) {
        expoReport.getClass();
        ExpoReport expoReport2 = this.expoReport_;
        if (expoReport2 != null && expoReport2 != ExpoReport.getDefaultInstance()) {
            this.expoReport_ = ExpoReport.newBuilder(this.expoReport_).mergeFrom((ExpoReport) expoReport).buildPartial();
        } else {
            this.expoReport_ = expoReport;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMask(VideoMask videoMask) {
        videoMask.getClass();
        VideoMask videoMask2 = this.mask_;
        if (videoMask2 != null && videoMask2 != VideoMask.getDefaultInstance()) {
            this.mask_ = VideoMask.newBuilder(this.mask_).mergeFrom((VideoMask) videoMask).buildPartial();
        } else {
            this.mask_ = videoMask;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerConfig(DanmuPlayerViewConfig danmuPlayerViewConfig) {
        danmuPlayerViewConfig.getClass();
        DanmuPlayerViewConfig danmuPlayerViewConfig2 = this.playerConfig_;
        if (danmuPlayerViewConfig2 != null && danmuPlayerViewConfig2 != DanmuPlayerViewConfig.getDefaultInstance()) {
            this.playerConfig_ = DanmuPlayerViewConfig.newBuilder(this.playerConfig_).mergeFrom((DanmuPlayerViewConfig) danmuPlayerViewConfig).buildPartial();
        } else {
            this.playerConfig_ = danmuPlayerViewConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQoe(QoeInfo qoeInfo) {
        qoeInfo.getClass();
        QoeInfo qoeInfo2 = this.qoe_;
        if (qoeInfo2 != null && qoeInfo2 != QoeInfo.getDefaultInstance()) {
            this.qoe_ = QoeInfo.newBuilder(this.qoe_).mergeFrom((QoeInfo) qoeInfo).buildPartial();
        } else {
            this.qoe_ = qoeInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubtitle(VideoSubtitle videoSubtitle) {
        videoSubtitle.getClass();
        VideoSubtitle videoSubtitle2 = this.subtitle_;
        if (videoSubtitle2 != null && videoSubtitle2 != VideoSubtitle.getDefaultInstance()) {
            this.subtitle_ = VideoSubtitle.newBuilder(this.subtitle_).mergeFrom((VideoSubtitle) videoSubtitle).buildPartial();
        } else {
            this.subtitle_ = videoSubtitle;
        }
    }

    public static C9025b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DmViewReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DmViewReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmViewReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DmViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DmViewReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDmMaskWall(int i2) {
        ensureDmMaskWallIsMutable();
        this.dmMaskWall_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExpressions(int i2) {
        ensureExpressionsIsMutable();
        this.expressions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePostPanel(int i2) {
        ensurePostPanelIsMutable();
        this.postPanel_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePostPanel2(int i2) {
        ensurePostPanel2IsMutable();
        this.postPanel2_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubViews(int i2) {
        ensureSubViewsIsMutable();
        this.subViews_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityMeta(int i2, String str) {
        str.getClass();
        ensureActivityMetaIsMutable();
        this.activityMeta_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAiFlag(DanmakuFlagConfig danmakuFlagConfig) {
        danmakuFlagConfig.getClass();
        this.aiFlag_ = danmakuFlagConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllow(boolean z) {
        this.allow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuzzwordConfig(BuzzwordConfig buzzwordConfig) {
        buzzwordConfig.getClass();
        this.buzzwordConfig_ = buzzwordConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckBox(boolean z) {
        this.checkBox_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckBoxShowMsg(String str) {
        str.getClass();
        this.checkBoxShowMsg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckBoxShowMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.checkBoxShowMsg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosed(boolean z) {
        this.closed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommand(Command command) {
        command.getClass();
        this.command_ = command;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDmHerd(DmHerdView dmHerdView) {
        dmHerdView.getClass();
        this.dmHerd_ = dmHerdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDmMaskWall(int i2, DmMaskWall dmMaskWall) {
        dmMaskWall.getClass();
        ensureDmMaskWallIsMutable();
        this.dmMaskWall_.set(i2, dmMaskWall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpoReport(ExpoReport expoReport) {
        expoReport.getClass();
        this.expoReport_ = expoReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpressions(int i2, Expressions expressions) {
        expressions.getClass();
        ensureExpressionsIsMutable();
        this.expressions_.set(i2, expressions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputPlaceholder(String str) {
        str.getClass();
        this.inputPlaceholder_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputPlaceholderBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.inputPlaceholder_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKv(String str) {
        str.getClass();
        this.kv_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKvBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.kv_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMask(VideoMask videoMask) {
        videoMask.getClass();
        this.mask_ = videoMask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerConfig(DanmuPlayerViewConfig danmuPlayerViewConfig) {
        danmuPlayerViewConfig.getClass();
        this.playerConfig_ = danmuPlayerViewConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostPanel(int i2, PostPanel postPanel) {
        postPanel.getClass();
        ensurePostPanelIsMutable();
        this.postPanel_.set(i2, postPanel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostPanel2(int i2, PostPanelV2 postPanelV2) {
        postPanelV2.getClass();
        ensurePostPanel2IsMutable();
        this.postPanel2_.set(i2, postPanelV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQoe(QoeInfo qoeInfo) {
        qoeInfo.getClass();
        this.qoe_ = qoeInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportFilterContent(int i2, String str) {
        str.getClass();
        ensureReportFilterContentIsMutable();
        this.reportFilterContent_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendBoxStyle(int i2) {
        this.sendBoxStyle_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpecialDms(int i2, String str) {
        str.getClass();
        ensureSpecialDmsIsMutable();
        this.specialDms_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubViews(int i2, DmSubView dmSubView) {
        dmSubView.getClass();
        ensureSubViewsIsMutable();
        this.subViews_.set(i2, dmSubView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(VideoSubtitle videoSubtitle) {
        videoSubtitle.getClass();
        this.subtitle_ = videoSubtitle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextPlaceholder(String str) {
        str.getClass();
        this.textPlaceholder_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextPlaceholderBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textPlaceholder_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C9024a c9024a = null;
        switch (C9024a.f18608xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DmViewReply();
            case 2:
                return new C9025b(c9024a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0000\u0001\u0019\u0019\u0000\b\u0000\u0001\u0007\u0002\t\u0003\t\u0004\u021a\u0005\t\u0006\t\u0007\u0004\b\u0007\t\u0007\n\u0208\u000b\u0208\f\u0208\r\u021a\u000e\t\u000f\t\u0010\u001b\u0011\u001b\u0012\u021a\u0013\u001b\u0014\u001b\u0015\t\u0016\t\u0017\u0208\u0018\u001b\u0019\t", new Object[]{"closed_", "mask_", "subtitle_", "specialDms_", "aiFlag_", "playerConfig_", "sendBoxStyle_", "allow_", "checkBox_", "checkBoxShowMsg_", "textPlaceholder_", "inputPlaceholder_", "reportFilterContent_", "expoReport_", "buzzwordConfig_", "expressions_", Expressions.class, "postPanel_", PostPanel.class, "activityMeta_", "postPanel2_", PostPanelV2.class, "dmMaskWall_", DmMaskWall.class, "dmHerd_", "command_", "kv_", "subViews_", DmSubView.class, "qoe_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DmViewReply> parser = PARSER;
                if (parser == null) {
                    synchronized (DmViewReply.class) {
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

    public String getActivityMeta(int i2) {
        return this.activityMeta_.get(i2);
    }

    public ByteString getActivityMetaBytes(int i2) {
        return ByteString.copyFromUtf8(this.activityMeta_.get(i2));
    }

    public int getActivityMetaCount() {
        return this.activityMeta_.size();
    }

    public List<String> getActivityMetaList() {
        return this.activityMeta_;
    }

    public DanmakuFlagConfig getAiFlag() {
        DanmakuFlagConfig danmakuFlagConfig = this.aiFlag_;
        return danmakuFlagConfig == null ? DanmakuFlagConfig.getDefaultInstance() : danmakuFlagConfig;
    }

    public boolean getAllow() {
        return this.allow_;
    }

    public BuzzwordConfig getBuzzwordConfig() {
        BuzzwordConfig buzzwordConfig = this.buzzwordConfig_;
        return buzzwordConfig == null ? BuzzwordConfig.getDefaultInstance() : buzzwordConfig;
    }

    public boolean getCheckBox() {
        return this.checkBox_;
    }

    public String getCheckBoxShowMsg() {
        return this.checkBoxShowMsg_;
    }

    public ByteString getCheckBoxShowMsgBytes() {
        return ByteString.copyFromUtf8(this.checkBoxShowMsg_);
    }

    public boolean getClosed() {
        return this.closed_;
    }

    public Command getCommand() {
        Command command = this.command_;
        return command == null ? Command.getDefaultInstance() : command;
    }

    public DmHerdView getDmHerd() {
        DmHerdView dmHerdView = this.dmHerd_;
        return dmHerdView == null ? DmHerdView.getDefaultInstance() : dmHerdView;
    }

    public DmMaskWall getDmMaskWall(int i2) {
        return this.dmMaskWall_.get(i2);
    }

    public int getDmMaskWallCount() {
        return this.dmMaskWall_.size();
    }

    public List<DmMaskWall> getDmMaskWallList() {
        return this.dmMaskWall_;
    }

    public DmMaskWallOrBuilder getDmMaskWallOrBuilder(int i2) {
        return this.dmMaskWall_.get(i2);
    }

    public List<? extends DmMaskWallOrBuilder> getDmMaskWallOrBuilderList() {
        return this.dmMaskWall_;
    }

    public ExpoReport getExpoReport() {
        ExpoReport expoReport = this.expoReport_;
        return expoReport == null ? ExpoReport.getDefaultInstance() : expoReport;
    }

    public Expressions getExpressions(int i2) {
        return this.expressions_.get(i2);
    }

    public int getExpressionsCount() {
        return this.expressions_.size();
    }

    public List<Expressions> getExpressionsList() {
        return this.expressions_;
    }

    public ExpressionsOrBuilder getExpressionsOrBuilder(int i2) {
        return this.expressions_.get(i2);
    }

    public List<? extends ExpressionsOrBuilder> getExpressionsOrBuilderList() {
        return this.expressions_;
    }

    public String getInputPlaceholder() {
        return this.inputPlaceholder_;
    }

    public ByteString getInputPlaceholderBytes() {
        return ByteString.copyFromUtf8(this.inputPlaceholder_);
    }

    public String getKv() {
        return this.kv_;
    }

    public ByteString getKvBytes() {
        return ByteString.copyFromUtf8(this.kv_);
    }

    public VideoMask getMask() {
        VideoMask videoMask = this.mask_;
        return videoMask == null ? VideoMask.getDefaultInstance() : videoMask;
    }

    public DanmuPlayerViewConfig getPlayerConfig() {
        DanmuPlayerViewConfig danmuPlayerViewConfig = this.playerConfig_;
        return danmuPlayerViewConfig == null ? DanmuPlayerViewConfig.getDefaultInstance() : danmuPlayerViewConfig;
    }

    public PostPanel getPostPanel(int i2) {
        return this.postPanel_.get(i2);
    }

    public PostPanelV2 getPostPanel2(int i2) {
        return this.postPanel2_.get(i2);
    }

    public int getPostPanel2Count() {
        return this.postPanel2_.size();
    }

    public List<PostPanelV2> getPostPanel2List() {
        return this.postPanel2_;
    }

    public PostPanelV2OrBuilder getPostPanel2OrBuilder(int i2) {
        return this.postPanel2_.get(i2);
    }

    public List<? extends PostPanelV2OrBuilder> getPostPanel2OrBuilderList() {
        return this.postPanel2_;
    }

    public int getPostPanelCount() {
        return this.postPanel_.size();
    }

    public List<PostPanel> getPostPanelList() {
        return this.postPanel_;
    }

    public PostPanelOrBuilder getPostPanelOrBuilder(int i2) {
        return this.postPanel_.get(i2);
    }

    public List<? extends PostPanelOrBuilder> getPostPanelOrBuilderList() {
        return this.postPanel_;
    }

    public QoeInfo getQoe() {
        QoeInfo qoeInfo = this.qoe_;
        return qoeInfo == null ? QoeInfo.getDefaultInstance() : qoeInfo;
    }

    public String getReportFilterContent(int i2) {
        return this.reportFilterContent_.get(i2);
    }

    public ByteString getReportFilterContentBytes(int i2) {
        return ByteString.copyFromUtf8(this.reportFilterContent_.get(i2));
    }

    public int getReportFilterContentCount() {
        return this.reportFilterContent_.size();
    }

    public List<String> getReportFilterContentList() {
        return this.reportFilterContent_;
    }

    public int getSendBoxStyle() {
        return this.sendBoxStyle_;
    }

    public String getSpecialDms(int i2) {
        return this.specialDms_.get(i2);
    }

    public ByteString getSpecialDmsBytes(int i2) {
        return ByteString.copyFromUtf8(this.specialDms_.get(i2));
    }

    public int getSpecialDmsCount() {
        return this.specialDms_.size();
    }

    public List<String> getSpecialDmsList() {
        return this.specialDms_;
    }

    public DmSubView getSubViews(int i2) {
        return this.subViews_.get(i2);
    }

    public int getSubViewsCount() {
        return this.subViews_.size();
    }

    public List<DmSubView> getSubViewsList() {
        return this.subViews_;
    }

    public InterfaceC9135j getSubViewsOrBuilder(int i2) {
        return this.subViews_.get(i2);
    }

    public List<? extends InterfaceC9135j> getSubViewsOrBuilderList() {
        return this.subViews_;
    }

    public VideoSubtitle getSubtitle() {
        VideoSubtitle videoSubtitle = this.subtitle_;
        return videoSubtitle == null ? VideoSubtitle.getDefaultInstance() : videoSubtitle;
    }

    public String getTextPlaceholder() {
        return this.textPlaceholder_;
    }

    public ByteString getTextPlaceholderBytes() {
        return ByteString.copyFromUtf8(this.textPlaceholder_);
    }

    public boolean hasAiFlag() {
        return this.aiFlag_ != null;
    }

    public boolean hasBuzzwordConfig() {
        return this.buzzwordConfig_ != null;
    }

    public boolean hasCommand() {
        return this.command_ != null;
    }

    public boolean hasDmHerd() {
        return this.dmHerd_ != null;
    }

    public boolean hasExpoReport() {
        return this.expoReport_ != null;
    }

    public boolean hasMask() {
        return this.mask_ != null;
    }

    public boolean hasPlayerConfig() {
        return this.playerConfig_ != null;
    }

    public boolean hasQoe() {
        return this.qoe_ != null;
    }

    public boolean hasSubtitle() {
        return this.subtitle_ != null;
    }

    public static C9025b newBuilder(DmViewReply dmViewReply) {
        return DEFAULT_INSTANCE.createBuilder(dmViewReply);
    }

    public static DmViewReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmViewReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmViewReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DmViewReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DmViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDmMaskWall(int i2, DmMaskWall dmMaskWall) {
        dmMaskWall.getClass();
        ensureDmMaskWallIsMutable();
        this.dmMaskWall_.add(i2, dmMaskWall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExpressions(int i2, Expressions expressions) {
        expressions.getClass();
        ensureExpressionsIsMutable();
        this.expressions_.add(i2, expressions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPostPanel(int i2, PostPanel postPanel) {
        postPanel.getClass();
        ensurePostPanelIsMutable();
        this.postPanel_.add(i2, postPanel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPostPanel2(int i2, PostPanelV2 postPanelV2) {
        postPanelV2.getClass();
        ensurePostPanel2IsMutable();
        this.postPanel2_.add(i2, postPanelV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubViews(int i2, DmSubView dmSubView) {
        dmSubView.getClass();
        ensureSubViewsIsMutable();
        this.subViews_.add(i2, dmSubView);
    }

    public static DmViewReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DmViewReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DmViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DmViewReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DmViewReply parseFrom(InputStream inputStream) throws IOException {
        return (DmViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmViewReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmViewReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DmViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DmViewReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
