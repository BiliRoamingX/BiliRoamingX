package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class ButtonInfo extends GeneratedMessageLite<ButtonInfo, ButtonInfo.Builder> implements ButtonInfoOrBuilder {
    public static final int ACTION_TYPE_FIELD_NUMBER = 7;
    public static final int BADGE_INFO_FIELD_NUMBER = 8;
    public static final int BG_COLOR_FIELD_NUMBER = 4;
    public static final int BG_COLOR_NIGHT_FIELD_NUMBER = 5;
    public static final int BG_GRADIENT_COLOR_FIELD_NUMBER = 14;
    private static final ButtonInfo DEFAULT_INSTANCE;
    public static final int JUMP_TYPE_FIELD_NUMBER = 18;
    public static final int LEFT_STRIKETHROUGH_TEXT_FIELD_NUMBER = 10;
    public static final int LINK_FIELD_NUMBER = 6;
    public static final int ORDER_REPORT_PARAMS_FIELD_NUMBER = 15;
    private static volatile Parser<ButtonInfo> PARSER = null;
    public static final int PC_LINK_FIELD_NUMBER = 17;
    public static final int REPORT_FIELD_NUMBER = 9;
    public static final int SIMPLE_BG_COLOR_FIELD_NUMBER = 12;
    public static final int SIMPLE_BG_COLOR_NIGHT_FIELD_NUMBER = 13;
    public static final int SIMPLE_TEXT_INFO_FIELD_NUMBER = 11;
    public static final int TASK_PARAM_FIELD_NUMBER = 16;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_COLOR_NIGHT_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private BadgeInfo badgeInfo_;
    private GradientColor bgGradientColor_;
    private long jumpType_;
    private Report report_;
    private TextInfo simpleTextInfo_;
    private TaskParam taskParam_;
    private MapFieldLite<String, String> orderReportParams_ = MapFieldLite.emptyMapField();
    private String text_ = "";
    private String textColor_ = "";
    private String textColorNight_ = "";
    private String bgColor_ = "";
    private String bgColorNight_ = "";
    private String link_ = "";
    private String actionType_ = "";
    private String leftStrikethroughText_ = "";
    private String simpleBgColor_ = "";
    private String simpleBgColorNight_ = "";
    private String pcLink_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78211 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17548xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17548xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17548xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17548xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17548xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17548xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17548xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17548xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ButtonInfo, Builder> implements ButtonInfoOrBuilder {
        /* synthetic */ Builder(C78211 c78211) {
            this();
        }

        public Builder clearActionType() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearActionType();
            return this;
        }

        public Builder clearBadgeInfo() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearBadgeInfo();
            return this;
        }

        public Builder clearBgColor() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearBgColor();
            return this;
        }

        public Builder clearBgColorNight() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearBgColorNight();
            return this;
        }

        public Builder clearBgGradientColor() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearBgGradientColor();
            return this;
        }

        public Builder clearJumpType() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearJumpType();
            return this;
        }

        public Builder clearLeftStrikethroughText() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearLeftStrikethroughText();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearLink();
            return this;
        }

        public Builder clearOrderReportParams() {
            copyOnWrite();
            ((ButtonInfo) this.instance).getMutableOrderReportParamsMap().clear();
            return this;
        }

        public Builder clearPcLink() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearPcLink();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearReport();
            return this;
        }

        public Builder clearSimpleBgColor() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearSimpleBgColor();
            return this;
        }

        public Builder clearSimpleBgColorNight() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearSimpleBgColorNight();
            return this;
        }

        public Builder clearSimpleTextInfo() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearSimpleTextInfo();
            return this;
        }

        public Builder clearTaskParam() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearTaskParam();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearText();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTextColorNight() {
            copyOnWrite();
            ((ButtonInfo) this.instance).clearTextColorNight();
            return this;
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public boolean containsOrderReportParams(String str) {
            str.getClass();
            return ((ButtonInfo) this.instance).getOrderReportParamsMap().containsKey(str);
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getActionType() {
            return ((ButtonInfo) this.instance).getActionType();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public ByteString getActionTypeBytes() {
            return ((ButtonInfo) this.instance).getActionTypeBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public BadgeInfo getBadgeInfo() {
            return ((ButtonInfo) this.instance).getBadgeInfo();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getBgColor() {
            return ((ButtonInfo) this.instance).getBgColor();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public ByteString getBgColorBytes() {
            return ((ButtonInfo) this.instance).getBgColorBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getBgColorNight() {
            return ((ButtonInfo) this.instance).getBgColorNight();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public ByteString getBgColorNightBytes() {
            return ((ButtonInfo) this.instance).getBgColorNightBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public GradientColor getBgGradientColor() {
            return ((ButtonInfo) this.instance).getBgGradientColor();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public long getJumpType() {
            return ((ButtonInfo) this.instance).getJumpType();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getLeftStrikethroughText() {
            return ((ButtonInfo) this.instance).getLeftStrikethroughText();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public ByteString getLeftStrikethroughTextBytes() {
            return ((ButtonInfo) this.instance).getLeftStrikethroughTextBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getLink() {
            return ((ButtonInfo) this.instance).getLink();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public ByteString getLinkBytes() {
            return ((ButtonInfo) this.instance).getLinkBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        @Deprecated
        public Map<String, String> getOrderReportParams() {
            return getOrderReportParamsMap();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public int getOrderReportParamsCount() {
            return ((ButtonInfo) this.instance).getOrderReportParamsMap().size();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public Map<String, String> getOrderReportParamsMap() {
            return Collections.unmodifiableMap(((ButtonInfo) this.instance).getOrderReportParamsMap());
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getOrderReportParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> orderReportParamsMap = ((ButtonInfo) this.instance).getOrderReportParamsMap();
            return orderReportParamsMap.containsKey(str) ? orderReportParamsMap.get(str) : str2;
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getOrderReportParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> orderReportParamsMap = ((ButtonInfo) this.instance).getOrderReportParamsMap();
            if (orderReportParamsMap.containsKey(str)) {
                return orderReportParamsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getPcLink() {
            return ((ButtonInfo) this.instance).getPcLink();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public ByteString getPcLinkBytes() {
            return ((ButtonInfo) this.instance).getPcLinkBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public Report getReport() {
            return ((ButtonInfo) this.instance).getReport();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getSimpleBgColor() {
            return ((ButtonInfo) this.instance).getSimpleBgColor();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public ByteString getSimpleBgColorBytes() {
            return ((ButtonInfo) this.instance).getSimpleBgColorBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getSimpleBgColorNight() {
            return ((ButtonInfo) this.instance).getSimpleBgColorNight();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public ByteString getSimpleBgColorNightBytes() {
            return ((ButtonInfo) this.instance).getSimpleBgColorNightBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public TextInfo getSimpleTextInfo() {
            return ((ButtonInfo) this.instance).getSimpleTextInfo();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public TaskParam getTaskParam() {
            return ((ButtonInfo) this.instance).getTaskParam();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getText() {
            return ((ButtonInfo) this.instance).getText();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public ByteString getTextBytes() {
            return ((ButtonInfo) this.instance).getTextBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getTextColor() {
            return ((ButtonInfo) this.instance).getTextColor();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public ByteString getTextColorBytes() {
            return ((ButtonInfo) this.instance).getTextColorBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public String getTextColorNight() {
            return ((ButtonInfo) this.instance).getTextColorNight();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public ByteString getTextColorNightBytes() {
            return ((ButtonInfo) this.instance).getTextColorNightBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public boolean hasBadgeInfo() {
            return ((ButtonInfo) this.instance).hasBadgeInfo();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public boolean hasBgGradientColor() {
            return ((ButtonInfo) this.instance).hasBgGradientColor();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public boolean hasReport() {
            return ((ButtonInfo) this.instance).hasReport();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public boolean hasSimpleTextInfo() {
            return ((ButtonInfo) this.instance).hasSimpleTextInfo();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
        public boolean hasTaskParam() {
            return ((ButtonInfo) this.instance).hasTaskParam();
        }

        public Builder mergeBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((ButtonInfo) this.instance).mergeBadgeInfo(badgeInfo);
            return this;
        }

        public Builder mergeBgGradientColor(GradientColor gradientColor) {
            copyOnWrite();
            ((ButtonInfo) this.instance).mergeBgGradientColor(gradientColor);
            return this;
        }

        public Builder mergeReport(Report report) {
            copyOnWrite();
            ((ButtonInfo) this.instance).mergeReport(report);
            return this;
        }

        public Builder mergeSimpleTextInfo(TextInfo textInfo) {
            copyOnWrite();
            ((ButtonInfo) this.instance).mergeSimpleTextInfo(textInfo);
            return this;
        }

        public Builder mergeTaskParam(TaskParam taskParam) {
            copyOnWrite();
            ((ButtonInfo) this.instance).mergeTaskParam(taskParam);
            return this;
        }

        public Builder putAllOrderReportParams(Map<String, String> map) {
            copyOnWrite();
            ((ButtonInfo) this.instance).getMutableOrderReportParamsMap().putAll(map);
            return this;
        }

        public Builder putOrderReportParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((ButtonInfo) this.instance).getMutableOrderReportParamsMap().put(str, str2);
            return this;
        }

        public Builder removeOrderReportParams(String str) {
            str.getClass();
            copyOnWrite();
            ((ButtonInfo) this.instance).getMutableOrderReportParamsMap().remove(str);
            return this;
        }

        public Builder setActionType(String str) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setActionType(str);
            return this;
        }

        public Builder setActionTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setActionTypeBytes(byteString);
            return this;
        }

        public Builder setBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setBadgeInfo(badgeInfo);
            return this;
        }

        public Builder setBgColor(String str) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setBgColor(str);
            return this;
        }

        public Builder setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public Builder setBgColorNight(String str) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setBgColorNight(str);
            return this;
        }

        public Builder setBgColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setBgColorNightBytes(byteString);
            return this;
        }

        public Builder setBgGradientColor(GradientColor gradientColor) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setBgGradientColor(gradientColor);
            return this;
        }

        public Builder setJumpType(long j) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setJumpType(j);
            return this;
        }

        public Builder setLeftStrikethroughText(String str) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setLeftStrikethroughText(str);
            return this;
        }

        public Builder setLeftStrikethroughTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setLeftStrikethroughTextBytes(byteString);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setPcLink(String str) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setPcLink(str);
            return this;
        }

        public Builder setPcLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setPcLinkBytes(byteString);
            return this;
        }

        public Builder setReport(Report report) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setReport(report);
            return this;
        }

        public Builder setSimpleBgColor(String str) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setSimpleBgColor(str);
            return this;
        }

        public Builder setSimpleBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setSimpleBgColorBytes(byteString);
            return this;
        }

        public Builder setSimpleBgColorNight(String str) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setSimpleBgColorNight(str);
            return this;
        }

        public Builder setSimpleBgColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setSimpleBgColorNightBytes(byteString);
            return this;
        }

        public Builder setSimpleTextInfo(TextInfo textInfo) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setSimpleTextInfo(textInfo);
            return this;
        }

        public Builder setTaskParam(TaskParam taskParam) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setTaskParam(taskParam);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTextColorNight(String str) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setTextColorNight(str);
            return this;
        }

        public Builder setTextColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setTextColorNightBytes(byteString);
            return this;
        }

        private Builder() {
            super(ButtonInfo.DEFAULT_INSTANCE);
        }

        public Builder setBadgeInfo(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setBadgeInfo(builder.build());
            return this;
        }

        public Builder setBgGradientColor(GradientColor.Builder builder) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setBgGradientColor(builder.build());
            return this;
        }

        public Builder setReport(Report.Builder builder) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setReport(builder.build());
            return this;
        }

        public Builder setSimpleTextInfo(TextInfo.Builder builder) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setSimpleTextInfo(builder.build());
            return this;
        }

        public Builder setTaskParam(TaskParam.Builder builder) {
            copyOnWrite();
            ((ButtonInfo) this.instance).setTaskParam(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class OrderReportParamsDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private OrderReportParamsDefaultEntryHolder() {
        }
    }

    static {
        ButtonInfo buttonInfo = new ButtonInfo();
        DEFAULT_INSTANCE = buttonInfo;
        GeneratedMessageLite.registerDefaultInstance(ButtonInfo.class, buttonInfo);
    }

    private ButtonInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionType() {
        this.actionType_ = getDefaultInstance().getActionType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeInfo() {
        this.badgeInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgColor() {
        this.bgColor_ = getDefaultInstance().getBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgColorNight() {
        this.bgColorNight_ = getDefaultInstance().getBgColorNight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgGradientColor() {
        this.bgGradientColor_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpType() {
        this.jumpType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeftStrikethroughText() {
        this.leftStrikethroughText_ = getDefaultInstance().getLeftStrikethroughText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPcLink() {
        this.pcLink_ = getDefaultInstance().getPcLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReport() {
        this.report_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSimpleBgColor() {
        this.simpleBgColor_ = getDefaultInstance().getSimpleBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSimpleBgColorNight() {
        this.simpleBgColorNight_ = getDefaultInstance().getSimpleBgColorNight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSimpleTextInfo() {
        this.simpleTextInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTaskParam() {
        this.taskParam_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextColor() {
        this.textColor_ = getDefaultInstance().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextColorNight() {
        this.textColorNight_ = getDefaultInstance().getTextColorNight();
    }

    public static ButtonInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableOrderReportParamsMap() {
        return internalGetMutableOrderReportParams();
    }

    private MapFieldLite<String, String> internalGetMutableOrderReportParams() {
        if (!this.orderReportParams_.isMutable()) {
            this.orderReportParams_ = this.orderReportParams_.mutableCopy();
        }
        return this.orderReportParams_;
    }

    private MapFieldLite<String, String> internalGetOrderReportParams() {
        return this.orderReportParams_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBadgeInfo(BadgeInfo badgeInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBgGradientColor(GradientColor gradientColor) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReport(Report report) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSimpleTextInfo(TextInfo textInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTaskParam(TaskParam taskParam) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ButtonInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ButtonInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ButtonInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ButtonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ButtonInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionType(String str) {
        str.getClass();
        this.actionType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.actionType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeInfo(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.badgeInfo_ = badgeInfo;
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
    public void setBgColorNight(String str) {
        str.getClass();
        this.bgColorNight_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgColorNight_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgGradientColor(GradientColor gradientColor) {
        gradientColor.getClass();
        this.bgGradientColor_ = gradientColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpType(long j) {
        this.jumpType_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeftStrikethroughText(String str) {
        str.getClass();
        this.leftStrikethroughText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeftStrikethroughTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.leftStrikethroughText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPcLink(String str) {
        str.getClass();
        this.pcLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPcLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pcLink_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReport(Report report) {
        report.getClass();
        this.report_ = report;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSimpleBgColor(String str) {
        str.getClass();
        this.simpleBgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSimpleBgColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.simpleBgColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSimpleBgColorNight(String str) {
        str.getClass();
        this.simpleBgColorNight_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSimpleBgColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.simpleBgColorNight_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSimpleTextInfo(TextInfo textInfo) {
        textInfo.getClass();
        this.simpleTextInfo_ = textInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaskParam(TaskParam taskParam) {
        taskParam.getClass();
        this.taskParam_ = taskParam;
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
    public void setTextColor(String str) {
        str.getClass();
        this.textColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColorNight(String str) {
        str.getClass();
        this.textColorNight_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColorNight_ = byteString.toStringUtf8();
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public boolean containsOrderReportParams(String str) {
        str.getClass();
        return internalGetOrderReportParams().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78211.f17548xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ButtonInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\t\t\t\n\u0208\u000b\t\f\u0208\r\u0208\u000e\t\u000f2\u0010\t\u0011\u0208\u0012\u0002", new Object[]{"text_", "textColor_", "textColorNight_", "bgColor_", "bgColorNight_", "link_", "actionType_", "badgeInfo_", "report_", "leftStrikethroughText_", "simpleTextInfo_", "simpleBgColor_", "simpleBgColorNight_", "bgGradientColor_", "orderReportParams_", OrderReportParamsDefaultEntryHolder.defaultEntry, "taskParam_", "pcLink_", "jumpType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ButtonInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (ButtonInfo.class) {
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

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getActionType() {
        return this.actionType_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public ByteString getActionTypeBytes() {
        return ByteString.copyFromUtf8(this.actionType_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public BadgeInfo getBadgeInfo() {
        BadgeInfo badgeInfo = this.badgeInfo_;
        return badgeInfo == null ? BadgeInfo.getDefaultInstance() : badgeInfo;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getBgColor() {
        return this.bgColor_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public ByteString getBgColorBytes() {
        return ByteString.copyFromUtf8(this.bgColor_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getBgColorNight() {
        return this.bgColorNight_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public ByteString getBgColorNightBytes() {
        return ByteString.copyFromUtf8(this.bgColorNight_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public GradientColor getBgGradientColor() {
        GradientColor gradientColor = this.bgGradientColor_;
        return gradientColor == null ? GradientColor.getDefaultInstance() : gradientColor;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public long getJumpType() {
        return this.jumpType_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getLeftStrikethroughText() {
        return this.leftStrikethroughText_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public ByteString getLeftStrikethroughTextBytes() {
        return ByteString.copyFromUtf8(this.leftStrikethroughText_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    @Deprecated
    public Map<String, String> getOrderReportParams() {
        return getOrderReportParamsMap();
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public int getOrderReportParamsCount() {
        return internalGetOrderReportParams().size();
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public Map<String, String> getOrderReportParamsMap() {
        return Collections.unmodifiableMap(internalGetOrderReportParams());
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getOrderReportParamsOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetOrderReportParams = internalGetOrderReportParams();
        return internalGetOrderReportParams.containsKey(str) ? internalGetOrderReportParams.get(str) : str2;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getOrderReportParamsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetOrderReportParams = internalGetOrderReportParams();
        if (internalGetOrderReportParams.containsKey(str)) {
            return internalGetOrderReportParams.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getPcLink() {
        return this.pcLink_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public ByteString getPcLinkBytes() {
        return ByteString.copyFromUtf8(this.pcLink_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public Report getReport() {
        Report report = this.report_;
        return report == null ? Report.getDefaultInstance() : report;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getSimpleBgColor() {
        return this.simpleBgColor_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public ByteString getSimpleBgColorBytes() {
        return ByteString.copyFromUtf8(this.simpleBgColor_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getSimpleBgColorNight() {
        return this.simpleBgColorNight_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public ByteString getSimpleBgColorNightBytes() {
        return ByteString.copyFromUtf8(this.simpleBgColorNight_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public TextInfo getSimpleTextInfo() {
        TextInfo textInfo = this.simpleTextInfo_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public TaskParam getTaskParam() {
        TaskParam taskParam = this.taskParam_;
        return taskParam == null ? TaskParam.getDefaultInstance() : taskParam;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getTextColor() {
        return this.textColor_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public String getTextColorNight() {
        return this.textColorNight_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public ByteString getTextColorNightBytes() {
        return ByteString.copyFromUtf8(this.textColorNight_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public boolean hasBadgeInfo() {
        return this.badgeInfo_ != null;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public boolean hasBgGradientColor() {
        return this.bgGradientColor_ != null;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public boolean hasReport() {
        return this.report_ != null;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public boolean hasSimpleTextInfo() {
        return this.simpleTextInfo_ != null;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfoOrBuilder
    public boolean hasTaskParam() {
        return this.taskParam_ != null;
    }

    public static Builder newBuilder(ButtonInfo buttonInfo) {
        return DEFAULT_INSTANCE.createBuilder(buttonInfo);
    }

    public static ButtonInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ButtonInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ButtonInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ButtonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ButtonInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ButtonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ButtonInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ButtonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ButtonInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ButtonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ButtonInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ButtonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ButtonInfo parseFrom(InputStream inputStream) throws IOException {
        return (ButtonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ButtonInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ButtonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ButtonInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ButtonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ButtonInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ButtonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
