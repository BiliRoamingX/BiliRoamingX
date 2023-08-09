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
/* loaded from: classes14.dex */
public final class DmViewReply extends GeneratedMessageLite<DmViewReply, DmViewReply.Builder> implements MessageLiteOrBuilder {
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
    public static final int REPORT_FILTER_CONTENT_FIELD_NUMBER = 13;
    public static final int SEND_BOX_STYLE_FIELD_NUMBER = 7;
    public static final int SPECIAL_DMS_FIELD_NUMBER = 4;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
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

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmViewReply$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72251 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17066xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17066xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17066xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17066xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17066xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17066xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17066xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17066xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DmViewReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72251 c72251) {
            this();
        }

        public Builder addActivityMeta(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).addActivityMeta(str);
            return this;
        }

        public Builder addActivityMetaBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).addActivityMetaBytes(byteString);
            return this;
        }

        public Builder addAllActivityMeta(Iterable<String> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllActivityMeta(iterable);
            return this;
        }

        public Builder addAllDmMaskWall(Iterable<? extends DmMaskWall> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllDmMaskWall(iterable);
            return this;
        }

        public Builder addAllExpressions(Iterable<? extends Expressions> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllExpressions(iterable);
            return this;
        }

        public Builder addAllPostPanel(Iterable<? extends PostPanel> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllPostPanel(iterable);
            return this;
        }

        public Builder addAllPostPanel2(Iterable<? extends PostPanelV2> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllPostPanel2(iterable);
            return this;
        }

        public Builder addAllReportFilterContent(Iterable<String> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllReportFilterContent(iterable);
            return this;
        }

        public Builder addAllSpecialDms(Iterable<String> iterable) {
            copyOnWrite();
            ((DmViewReply) this.instance).addAllSpecialDms(iterable);
            return this;
        }

        public Builder addDmMaskWall(DmMaskWall dmMaskWall) {
            copyOnWrite();
            ((DmViewReply) this.instance).addDmMaskWall(dmMaskWall);
            return this;
        }

        public Builder addExpressions(Expressions expressions) {
            copyOnWrite();
            ((DmViewReply) this.instance).addExpressions(expressions);
            return this;
        }

        public Builder addPostPanel(PostPanel postPanel) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel(postPanel);
            return this;
        }

        public Builder addPostPanel2(PostPanelV2 postPanelV2) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel2(postPanelV2);
            return this;
        }

        public Builder addReportFilterContent(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).addReportFilterContent(str);
            return this;
        }

        public Builder addReportFilterContentBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).addReportFilterContentBytes(byteString);
            return this;
        }

        public Builder addSpecialDms(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).addSpecialDms(str);
            return this;
        }

        public Builder addSpecialDmsBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).addSpecialDmsBytes(byteString);
            return this;
        }

        public Builder clearActivityMeta() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearActivityMeta();
            return this;
        }

        public Builder clearAiFlag() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearAiFlag();
            return this;
        }

        public Builder clearAllow() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearAllow();
            return this;
        }

        public Builder clearBuzzwordConfig() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearBuzzwordConfig();
            return this;
        }

        public Builder clearCheckBox() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearCheckBox();
            return this;
        }

        public Builder clearCheckBoxShowMsg() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearCheckBoxShowMsg();
            return this;
        }

        public Builder clearClosed() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearClosed();
            return this;
        }

        public Builder clearCommand() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearCommand();
            return this;
        }

        public Builder clearDmHerd() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearDmHerd();
            return this;
        }

        public Builder clearDmMaskWall() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearDmMaskWall();
            return this;
        }

        public Builder clearExpoReport() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearExpoReport();
            return this;
        }

        public Builder clearExpressions() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearExpressions();
            return this;
        }

        public Builder clearInputPlaceholder() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearInputPlaceholder();
            return this;
        }

        public Builder clearKv() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearKv();
            return this;
        }

        public Builder clearMask() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearMask();
            return this;
        }

        public Builder clearPlayerConfig() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearPlayerConfig();
            return this;
        }

        public Builder clearPostPanel() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearPostPanel();
            return this;
        }

        public Builder clearPostPanel2() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearPostPanel2();
            return this;
        }

        public Builder clearReportFilterContent() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearReportFilterContent();
            return this;
        }

        public Builder clearSendBoxStyle() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearSendBoxStyle();
            return this;
        }

        public Builder clearSpecialDms() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearSpecialDms();
            return this;
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearTextPlaceholder() {
            copyOnWrite();
            ((DmViewReply) this.instance).clearTextPlaceholder();
            return this;
        }

        public String getActivityMeta(int i) {
            return ((DmViewReply) this.instance).getActivityMeta(i);
        }

        public ByteString getActivityMetaBytes(int i) {
            return ((DmViewReply) this.instance).getActivityMetaBytes(i);
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

        public DmMaskWall getDmMaskWall(int i) {
            return ((DmViewReply) this.instance).getDmMaskWall(i);
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

        public Expressions getExpressions(int i) {
            return ((DmViewReply) this.instance).getExpressions(i);
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

        public PostPanel getPostPanel(int i) {
            return ((DmViewReply) this.instance).getPostPanel(i);
        }

        public PostPanelV2 getPostPanel2(int i) {
            return ((DmViewReply) this.instance).getPostPanel2(i);
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

        public String getReportFilterContent(int i) {
            return ((DmViewReply) this.instance).getReportFilterContent(i);
        }

        public ByteString getReportFilterContentBytes(int i) {
            return ((DmViewReply) this.instance).getReportFilterContentBytes(i);
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

        public String getSpecialDms(int i) {
            return ((DmViewReply) this.instance).getSpecialDms(i);
        }

        public ByteString getSpecialDmsBytes(int i) {
            return ((DmViewReply) this.instance).getSpecialDmsBytes(i);
        }

        public int getSpecialDmsCount() {
            return ((DmViewReply) this.instance).getSpecialDmsCount();
        }

        public List<String> getSpecialDmsList() {
            return Collections.unmodifiableList(((DmViewReply) this.instance).getSpecialDmsList());
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

        public boolean hasSubtitle() {
            return ((DmViewReply) this.instance).hasSubtitle();
        }

        public Builder mergeAiFlag(DanmakuFlagConfig danmakuFlagConfig) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeAiFlag(danmakuFlagConfig);
            return this;
        }

        public Builder mergeBuzzwordConfig(BuzzwordConfig buzzwordConfig) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeBuzzwordConfig(buzzwordConfig);
            return this;
        }

        public Builder mergeCommand(Command command) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeCommand(command);
            return this;
        }

        public Builder mergeDmHerd(DmHerdView dmHerdView) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeDmHerd(dmHerdView);
            return this;
        }

        public Builder mergeExpoReport(ExpoReport expoReport) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeExpoReport(expoReport);
            return this;
        }

        public Builder mergeMask(VideoMask videoMask) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeMask(videoMask);
            return this;
        }

        public Builder mergePlayerConfig(DanmuPlayerViewConfig danmuPlayerViewConfig) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergePlayerConfig(danmuPlayerViewConfig);
            return this;
        }

        public Builder mergeSubtitle(VideoSubtitle videoSubtitle) {
            copyOnWrite();
            ((DmViewReply) this.instance).mergeSubtitle(videoSubtitle);
            return this;
        }

        public Builder removeDmMaskWall(int i) {
            copyOnWrite();
            ((DmViewReply) this.instance).removeDmMaskWall(i);
            return this;
        }

        public Builder removeExpressions(int i) {
            copyOnWrite();
            ((DmViewReply) this.instance).removeExpressions(i);
            return this;
        }

        public Builder removePostPanel(int i) {
            copyOnWrite();
            ((DmViewReply) this.instance).removePostPanel(i);
            return this;
        }

        public Builder removePostPanel2(int i) {
            copyOnWrite();
            ((DmViewReply) this.instance).removePostPanel2(i);
            return this;
        }

        public Builder setActivityMeta(int i, String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setActivityMeta(i, str);
            return this;
        }

        public Builder setAiFlag(DanmakuFlagConfig danmakuFlagConfig) {
            copyOnWrite();
            ((DmViewReply) this.instance).setAiFlag(danmakuFlagConfig);
            return this;
        }

        public Builder setAllow(boolean z) {
            copyOnWrite();
            ((DmViewReply) this.instance).setAllow(z);
            return this;
        }

        public Builder setBuzzwordConfig(BuzzwordConfig buzzwordConfig) {
            copyOnWrite();
            ((DmViewReply) this.instance).setBuzzwordConfig(buzzwordConfig);
            return this;
        }

        public Builder setCheckBox(boolean z) {
            copyOnWrite();
            ((DmViewReply) this.instance).setCheckBox(z);
            return this;
        }

        public Builder setCheckBoxShowMsg(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setCheckBoxShowMsg(str);
            return this;
        }

        public Builder setCheckBoxShowMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).setCheckBoxShowMsgBytes(byteString);
            return this;
        }

        public Builder setClosed(boolean z) {
            copyOnWrite();
            ((DmViewReply) this.instance).setClosed(z);
            return this;
        }

        public Builder setCommand(Command command) {
            copyOnWrite();
            ((DmViewReply) this.instance).setCommand(command);
            return this;
        }

        public Builder setDmHerd(DmHerdView dmHerdView) {
            copyOnWrite();
            ((DmViewReply) this.instance).setDmHerd(dmHerdView);
            return this;
        }

        public Builder setDmMaskWall(int i, DmMaskWall dmMaskWall) {
            copyOnWrite();
            ((DmViewReply) this.instance).setDmMaskWall(i, dmMaskWall);
            return this;
        }

        public Builder setExpoReport(ExpoReport expoReport) {
            copyOnWrite();
            ((DmViewReply) this.instance).setExpoReport(expoReport);
            return this;
        }

        public Builder setExpressions(int i, Expressions expressions) {
            copyOnWrite();
            ((DmViewReply) this.instance).setExpressions(i, expressions);
            return this;
        }

        public Builder setInputPlaceholder(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setInputPlaceholder(str);
            return this;
        }

        public Builder setInputPlaceholderBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).setInputPlaceholderBytes(byteString);
            return this;
        }

        public Builder setKv(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setKv(str);
            return this;
        }

        public Builder setKvBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).setKvBytes(byteString);
            return this;
        }

        public Builder setMask(VideoMask videoMask) {
            copyOnWrite();
            ((DmViewReply) this.instance).setMask(videoMask);
            return this;
        }

        public Builder setPlayerConfig(DanmuPlayerViewConfig danmuPlayerViewConfig) {
            copyOnWrite();
            ((DmViewReply) this.instance).setPlayerConfig(danmuPlayerViewConfig);
            return this;
        }

        public Builder setPostPanel(int i, PostPanel postPanel) {
            copyOnWrite();
            ((DmViewReply) this.instance).setPostPanel(i, postPanel);
            return this;
        }

        public Builder setPostPanel2(int i, PostPanelV2 postPanelV2) {
            copyOnWrite();
            ((DmViewReply) this.instance).setPostPanel2(i, postPanelV2);
            return this;
        }

        public Builder setReportFilterContent(int i, String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setReportFilterContent(i, str);
            return this;
        }

        public Builder setSendBoxStyle(int i) {
            copyOnWrite();
            ((DmViewReply) this.instance).setSendBoxStyle(i);
            return this;
        }

        public Builder setSpecialDms(int i, String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setSpecialDms(i, str);
            return this;
        }

        public Builder setSubtitle(VideoSubtitle videoSubtitle) {
            copyOnWrite();
            ((DmViewReply) this.instance).setSubtitle(videoSubtitle);
            return this;
        }

        public Builder setTextPlaceholder(String str) {
            copyOnWrite();
            ((DmViewReply) this.instance).setTextPlaceholder(str);
            return this;
        }

        public Builder setTextPlaceholderBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReply) this.instance).setTextPlaceholderBytes(byteString);
            return this;
        }

        private Builder() {
            super(DmViewReply.DEFAULT_INSTANCE);
        }

        public Builder addDmMaskWall(int i, DmMaskWall dmMaskWall) {
            copyOnWrite();
            ((DmViewReply) this.instance).addDmMaskWall(i, dmMaskWall);
            return this;
        }

        public Builder addExpressions(int i, Expressions expressions) {
            copyOnWrite();
            ((DmViewReply) this.instance).addExpressions(i, expressions);
            return this;
        }

        public Builder addPostPanel(int i, PostPanel postPanel) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel(i, postPanel);
            return this;
        }

        public Builder addPostPanel2(int i, PostPanelV2 postPanelV2) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel2(i, postPanelV2);
            return this;
        }

        public Builder setAiFlag(DanmakuFlagConfig.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).setAiFlag(builder.build());
            return this;
        }

        public Builder setBuzzwordConfig(BuzzwordConfig.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).setBuzzwordConfig(builder.build());
            return this;
        }

        public Builder setCommand(Command.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).setCommand(builder.build());
            return this;
        }

        public Builder setDmHerd(DmHerdView.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).setDmHerd(builder.build());
            return this;
        }

        public Builder setDmMaskWall(int i, DmMaskWall.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).setDmMaskWall(i, builder.build());
            return this;
        }

        public Builder setExpoReport(ExpoReport.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).setExpoReport(builder.build());
            return this;
        }

        public Builder setExpressions(int i, Expressions.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).setExpressions(i, builder.build());
            return this;
        }

        public Builder setMask(VideoMask.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).setMask(builder.build());
            return this;
        }

        public Builder setPlayerConfig(DanmuPlayerViewConfig.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).setPlayerConfig(builder.build());
            return this;
        }

        public Builder setPostPanel(int i, PostPanel.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).setPostPanel(i, builder.build());
            return this;
        }

        public Builder setPostPanel2(int i, PostPanelV2.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).setPostPanel2(i, builder.build());
            return this;
        }

        public Builder setSubtitle(VideoSubtitle.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).setSubtitle(builder.build());
            return this;
        }

        public Builder addDmMaskWall(DmMaskWall.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).addDmMaskWall(builder.build());
            return this;
        }

        public Builder addExpressions(Expressions.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).addExpressions(builder.build());
            return this;
        }

        public Builder addPostPanel(PostPanel.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel(builder.build());
            return this;
        }

        public Builder addPostPanel2(PostPanelV2.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel2(builder.build());
            return this;
        }

        public Builder addDmMaskWall(int i, DmMaskWall.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).addDmMaskWall(i, builder.build());
            return this;
        }

        public Builder addExpressions(int i, Expressions.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).addExpressions(i, builder.build());
            return this;
        }

        public Builder addPostPanel(int i, PostPanel.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel(i, builder.build());
            return this;
        }

        public Builder addPostPanel2(int i, PostPanelV2.Builder builder) {
            copyOnWrite();
            ((DmViewReply) this.instance).addPostPanel2(i, builder.build());
            return this;
        }
    }

    static {
        DmViewReply dmViewReply = new DmViewReply();
        DEFAULT_INSTANCE = dmViewReply;
        GeneratedMessageLite.registerDefaultInstance(DmViewReply.class, dmViewReply);
    }

    private DmViewReply() {
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

    public static DmViewReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAiFlag(DanmakuFlagConfig danmakuFlagConfig) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBuzzwordConfig(BuzzwordConfig buzzwordConfig) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCommand(Command command) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDmHerd(DmHerdView dmHerdView) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExpoReport(ExpoReport expoReport) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMask(VideoMask videoMask) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerConfig(DanmuPlayerViewConfig danmuPlayerViewConfig) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubtitle(VideoSubtitle videoSubtitle) {
    }

    public static Builder newBuilder() {
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
    public void removeDmMaskWall(int i) {
        ensureDmMaskWallIsMutable();
        this.dmMaskWall_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExpressions(int i) {
        ensureExpressionsIsMutable();
        this.expressions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePostPanel(int i) {
        ensurePostPanelIsMutable();
        this.postPanel_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePostPanel2(int i) {
        ensurePostPanel2IsMutable();
        this.postPanel2_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityMeta(int i, String str) {
        str.getClass();
        ensureActivityMetaIsMutable();
        this.activityMeta_.set(i, str);
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
    public void setDmMaskWall(int i, DmMaskWall dmMaskWall) {
        dmMaskWall.getClass();
        ensureDmMaskWallIsMutable();
        this.dmMaskWall_.set(i, dmMaskWall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpoReport(ExpoReport expoReport) {
        expoReport.getClass();
        this.expoReport_ = expoReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpressions(int i, Expressions expressions) {
        expressions.getClass();
        ensureExpressionsIsMutable();
        this.expressions_.set(i, expressions);
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
    public void setPostPanel(int i, PostPanel postPanel) {
        postPanel.getClass();
        ensurePostPanelIsMutable();
        this.postPanel_.set(i, postPanel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostPanel2(int i, PostPanelV2 postPanelV2) {
        postPanelV2.getClass();
        ensurePostPanel2IsMutable();
        this.postPanel2_.set(i, postPanelV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportFilterContent(int i, String str) {
        str.getClass();
        ensureReportFilterContentIsMutable();
        this.reportFilterContent_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendBoxStyle(int i) {
        this.sendBoxStyle_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpecialDms(int i, String str) {
        str.getClass();
        ensureSpecialDmsIsMutable();
        this.specialDms_.set(i, str);
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
        switch (C72251.f17066xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DmViewReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0000\u0001\u0017\u0017\u0000\u0007\u0000\u0001\u0007\u0002\t\u0003\t\u0004\u021a\u0005\t\u0006\t\u0007\u0004\b\u0007\t\u0007\n\u0208\u000b\u0208\f\u0208\r\u021a\u000e\t\u000f\t\u0010\u001b\u0011\u001b\u0012\u021a\u0013\u001b\u0014\u001b\u0015\t\u0016\t\u0017\u0208", new Object[]{"closed_", "mask_", "subtitle_", "specialDms_", "aiFlag_", "playerConfig_", "sendBoxStyle_", "allow_", "checkBox_", "checkBoxShowMsg_", "textPlaceholder_", "inputPlaceholder_", "reportFilterContent_", "expoReport_", "buzzwordConfig_", "expressions_", Expressions.class, "postPanel_", PostPanel.class, "activityMeta_", "postPanel2_", PostPanelV2.class, "dmMaskWall_", DmMaskWall.class, "dmHerd_", "command_", "kv_"});
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

    public String getActivityMeta(int i) {
        return this.activityMeta_.get(i);
    }

    public ByteString getActivityMetaBytes(int i) {
        return ByteString.copyFromUtf8(this.activityMeta_.get(i));
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

    public DmMaskWall getDmMaskWall(int i) {
        return this.dmMaskWall_.get(i);
    }

    public int getDmMaskWallCount() {
        return this.dmMaskWall_.size();
    }

    public List<DmMaskWall> getDmMaskWallList() {
        return this.dmMaskWall_;
    }

    public DmMaskWallOrBuilder getDmMaskWallOrBuilder(int i) {
        return this.dmMaskWall_.get(i);
    }

    public List<? extends DmMaskWallOrBuilder> getDmMaskWallOrBuilderList() {
        return this.dmMaskWall_;
    }

    public ExpoReport getExpoReport() {
        ExpoReport expoReport = this.expoReport_;
        return expoReport == null ? ExpoReport.getDefaultInstance() : expoReport;
    }

    public Expressions getExpressions(int i) {
        return this.expressions_.get(i);
    }

    public int getExpressionsCount() {
        return this.expressions_.size();
    }

    public List<Expressions> getExpressionsList() {
        return this.expressions_;
    }

    public ExpressionsOrBuilder getExpressionsOrBuilder(int i) {
        return this.expressions_.get(i);
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

    public PostPanel getPostPanel(int i) {
        return this.postPanel_.get(i);
    }

    public PostPanelV2 getPostPanel2(int i) {
        return this.postPanel2_.get(i);
    }

    public int getPostPanel2Count() {
        return this.postPanel2_.size();
    }

    public List<PostPanelV2> getPostPanel2List() {
        return this.postPanel2_;
    }

    public PostPanelV2OrBuilder getPostPanel2OrBuilder(int i) {
        return this.postPanel2_.get(i);
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

    public PostPanelOrBuilder getPostPanelOrBuilder(int i) {
        return this.postPanel_.get(i);
    }

    public List<? extends PostPanelOrBuilder> getPostPanelOrBuilderList() {
        return this.postPanel_;
    }

    public String getReportFilterContent(int i) {
        return this.reportFilterContent_.get(i);
    }

    public ByteString getReportFilterContentBytes(int i) {
        return ByteString.copyFromUtf8(this.reportFilterContent_.get(i));
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

    public String getSpecialDms(int i) {
        return this.specialDms_.get(i);
    }

    public ByteString getSpecialDmsBytes(int i) {
        return ByteString.copyFromUtf8(this.specialDms_.get(i));
    }

    public int getSpecialDmsCount() {
        return this.specialDms_.size();
    }

    public List<String> getSpecialDmsList() {
        return this.specialDms_;
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

    public boolean hasSubtitle() {
        return this.subtitle_ != null;
    }

    public static Builder newBuilder(DmViewReply dmViewReply) {
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
    public void addDmMaskWall(int i, DmMaskWall dmMaskWall) {
        dmMaskWall.getClass();
        ensureDmMaskWallIsMutable();
        this.dmMaskWall_.add(i, dmMaskWall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExpressions(int i, Expressions expressions) {
        expressions.getClass();
        ensureExpressionsIsMutable();
        this.expressions_.add(i, expressions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPostPanel(int i, PostPanel postPanel) {
        postPanel.getClass();
        ensurePostPanelIsMutable();
        this.postPanel_.add(i, postPanel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPostPanel2(int i, PostPanelV2 postPanelV2) {
        postPanelV2.getClass();
        ensurePostPanel2IsMutable();
        this.postPanel2_.add(i, postPanelV2);
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

    /**
     * clearActivityMeta
     */
    static void access$6100(DmViewReply reply) {
    }

    /**
     * clearCommand
     */
    static void access$8000(DmViewReply reply) {
    }

    /**
     * setClosed
     */
    static void access$100(DmViewReply reply, boolean closed) {
    }

    /**
     * setInputPlaceholder
     */
    static void access$3200(DmViewReply reply, String inputPlaceholder) {
    }
}
