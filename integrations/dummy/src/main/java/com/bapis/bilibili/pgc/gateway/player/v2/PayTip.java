package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
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
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes14.dex */
public final class PayTip extends GeneratedMessageLite<PayTip, PayTip.Builder> implements MessageLiteOrBuilder {
    public static final int ANGLE_STYLE_FIELD_NUMBER = 17;
    public static final int BG_DAY_COLOR_FIELD_NUMBER = 7;
    public static final int BG_LINE_COLOR_FIELD_NUMBER = 9;
    public static final int BG_NIGHT_COLOR_FIELD_NUMBER = 8;
    public static final int BG_NIGHT_LINE_COLOR_FIELD_NUMBER = 10;
    public static final int BUTTON_FIELD_NUMBER = 14;
    private static final PayTip DEFAULT_INSTANCE;
    public static final int GIANT_SCREEN_IMG_FIELD_NUMBER = 20;
    public static final int ICON_FIELD_NUMBER = 3;
    public static final int IMG_FIELD_NUMBER = 6;
    public static final int ORDER_REPORT_PARAMS_FIELD_NUMBER = 19;
    private static volatile Parser<PayTip> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 16;
    public static final int REPORT_TYPE_FIELD_NUMBER = 18;
    public static final int SHOW_TYPE_FIELD_NUMBER = 5;
    public static final int TEXT_COLOR_FIELD_NUMBER = 11;
    public static final int TEXT_NIGHT_COLOR_FIELD_NUMBER = 12;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int URL_FIELD_NUMBER = 2;
    public static final int URL_OPEN_TYPE_FIELD_NUMBER = 15;
    public static final int VIEW_START_TIME_FIELD_NUMBER = 13;
    private int angleStyle_;
    private int reportType_;
    private Report report_;
    private int showType_;
    private int type_;
    private int urlOpenType_;
    private long viewStartTime_;
    private MapFieldLite<String, String> orderReportParams_ = MapFieldLite.emptyMapField();
    private String title_ = "";
    private String url_ = "";
    private String icon_ = "";
    private String img_ = "";
    private String bgDayColor_ = "";
    private String bgNightColor_ = "";
    private String bgLineColor_ = "";
    private String bgNightLineColor_ = "";
    private String textColor_ = "";
    private String textNightColor_ = "";
    private Internal.ProtobufList<ButtonInfo> button_ = GeneratedMessageLite.emptyProtobufList();
    private String giantScreenImg_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.PayTip$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78581 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17577xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17577xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17577xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17577xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17577xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17577xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17577xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17577xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PayTip, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78581 c78581) {
            this();
        }

        public Builder addAllButton(Iterable<? extends ButtonInfo> iterable) {
            copyOnWrite();
            ((PayTip) this.instance).addAllButton(iterable);
            return this;
        }

        public Builder addButton(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((PayTip) this.instance).addButton(buttonInfo);
            return this;
        }

        public Builder clearAngleStyle() {
            copyOnWrite();
            ((PayTip) this.instance).clearAngleStyle();
            return this;
        }

        public Builder clearBgDayColor() {
            copyOnWrite();
            ((PayTip) this.instance).clearBgDayColor();
            return this;
        }

        public Builder clearBgLineColor() {
            copyOnWrite();
            ((PayTip) this.instance).clearBgLineColor();
            return this;
        }

        public Builder clearBgNightColor() {
            copyOnWrite();
            ((PayTip) this.instance).clearBgNightColor();
            return this;
        }

        public Builder clearBgNightLineColor() {
            copyOnWrite();
            ((PayTip) this.instance).clearBgNightLineColor();
            return this;
        }

        public Builder clearButton() {
            copyOnWrite();
            ((PayTip) this.instance).clearButton();
            return this;
        }

        public Builder clearGiantScreenImg() {
            copyOnWrite();
            ((PayTip) this.instance).clearGiantScreenImg();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((PayTip) this.instance).clearIcon();
            return this;
        }

        public Builder clearImg() {
            copyOnWrite();
            ((PayTip) this.instance).clearImg();
            return this;
        }

        public Builder clearOrderReportParams() {
            copyOnWrite();
            ((PayTip) this.instance).getMutableOrderReportParamsMap().clear();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((PayTip) this.instance).clearReport();
            return this;
        }

        public Builder clearReportType() {
            copyOnWrite();
            ((PayTip) this.instance).clearReportType();
            return this;
        }

        public Builder clearShowType() {
            copyOnWrite();
            ((PayTip) this.instance).clearShowType();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((PayTip) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTextNightColor() {
            copyOnWrite();
            ((PayTip) this.instance).clearTextNightColor();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((PayTip) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((PayTip) this.instance).clearType();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((PayTip) this.instance).clearUrl();
            return this;
        }

        public Builder clearUrlOpenType() {
            copyOnWrite();
            ((PayTip) this.instance).clearUrlOpenType();
            return this;
        }

        public Builder clearViewStartTime() {
            copyOnWrite();
            ((PayTip) this.instance).clearViewStartTime();
            return this;
        }

        public boolean containsOrderReportParams(String str) {
            str.getClass();
            return ((PayTip) this.instance).getOrderReportParamsMap().containsKey(str);
        }

        public int getAngleStyle() {
            return ((PayTip) this.instance).getAngleStyle();
        }

        public String getBgDayColor() {
            return ((PayTip) this.instance).getBgDayColor();
        }

        public ByteString getBgDayColorBytes() {
            return ((PayTip) this.instance).getBgDayColorBytes();
        }

        public String getBgLineColor() {
            return ((PayTip) this.instance).getBgLineColor();
        }

        public ByteString getBgLineColorBytes() {
            return ((PayTip) this.instance).getBgLineColorBytes();
        }

        public String getBgNightColor() {
            return ((PayTip) this.instance).getBgNightColor();
        }

        public ByteString getBgNightColorBytes() {
            return ((PayTip) this.instance).getBgNightColorBytes();
        }

        public String getBgNightLineColor() {
            return ((PayTip) this.instance).getBgNightLineColor();
        }

        public ByteString getBgNightLineColorBytes() {
            return ((PayTip) this.instance).getBgNightLineColorBytes();
        }

        public ButtonInfo getButton(int i) {
            return ((PayTip) this.instance).getButton(i);
        }

        public int getButtonCount() {
            return ((PayTip) this.instance).getButtonCount();
        }

        public List<ButtonInfo> getButtonList() {
            return Collections.unmodifiableList(((PayTip) this.instance).getButtonList());
        }

        public String getGiantScreenImg() {
            return ((PayTip) this.instance).getGiantScreenImg();
        }

        public ByteString getGiantScreenImgBytes() {
            return ((PayTip) this.instance).getGiantScreenImgBytes();
        }

        public String getIcon() {
            return ((PayTip) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((PayTip) this.instance).getIconBytes();
        }

        public String getImg() {
            return ((PayTip) this.instance).getImg();
        }

        public ByteString getImgBytes() {
            return ((PayTip) this.instance).getImgBytes();
        }

        @Deprecated
        public Map<String, String> getOrderReportParams() {
            return getOrderReportParamsMap();
        }

        public int getOrderReportParamsCount() {
            return ((PayTip) this.instance).getOrderReportParamsMap().size();
        }

        public Map<String, String> getOrderReportParamsMap() {
            return Collections.unmodifiableMap(((PayTip) this.instance).getOrderReportParamsMap());
        }

        public String getOrderReportParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> orderReportParamsMap = ((PayTip) this.instance).getOrderReportParamsMap();
            return orderReportParamsMap.containsKey(str) ? orderReportParamsMap.get(str) : str2;
        }

        public String getOrderReportParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> orderReportParamsMap = ((PayTip) this.instance).getOrderReportParamsMap();
            if (orderReportParamsMap.containsKey(str)) {
                return orderReportParamsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Report getReport() {
            return ((PayTip) this.instance).getReport();
        }

        public int getReportType() {
            return ((PayTip) this.instance).getReportType();
        }

        public int getShowType() {
            return ((PayTip) this.instance).getShowType();
        }

        public String getTextColor() {
            return ((PayTip) this.instance).getTextColor();
        }

        public ByteString getTextColorBytes() {
            return ((PayTip) this.instance).getTextColorBytes();
        }

        public String getTextNightColor() {
            return ((PayTip) this.instance).getTextNightColor();
        }

        public ByteString getTextNightColorBytes() {
            return ((PayTip) this.instance).getTextNightColorBytes();
        }

        public String getTitle() {
            return ((PayTip) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((PayTip) this.instance).getTitleBytes();
        }

        public int getType() {
            return ((PayTip) this.instance).getType();
        }

        public String getUrl() {
            return ((PayTip) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((PayTip) this.instance).getUrlBytes();
        }

        public int getUrlOpenType() {
            return ((PayTip) this.instance).getUrlOpenType();
        }

        public long getViewStartTime() {
            return ((PayTip) this.instance).getViewStartTime();
        }

        public boolean hasReport() {
            return ((PayTip) this.instance).hasReport();
        }

        public Builder mergeReport(Report report) {
            copyOnWrite();
            ((PayTip) this.instance).mergeReport(report);
            return this;
        }

        public Builder putAllOrderReportParams(Map<String, String> map) {
            copyOnWrite();
            ((PayTip) this.instance).getMutableOrderReportParamsMap().putAll(map);
            return this;
        }

        public Builder putOrderReportParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((PayTip) this.instance).getMutableOrderReportParamsMap().put(str, str2);
            return this;
        }

        public Builder removeButton(int i) {
            copyOnWrite();
            ((PayTip) this.instance).removeButton(i);
            return this;
        }

        public Builder removeOrderReportParams(String str) {
            str.getClass();
            copyOnWrite();
            ((PayTip) this.instance).getMutableOrderReportParamsMap().remove(str);
            return this;
        }

        public Builder setAngleStyle(int i) {
            copyOnWrite();
            ((PayTip) this.instance).setAngleStyle(i);
            return this;
        }

        public Builder setBgDayColor(String str) {
            copyOnWrite();
            ((PayTip) this.instance).setBgDayColor(str);
            return this;
        }

        public Builder setBgDayColorBytes(ByteString byteString) {
            copyOnWrite();
            ((PayTip) this.instance).setBgDayColorBytes(byteString);
            return this;
        }

        public Builder setBgLineColor(String str) {
            copyOnWrite();
            ((PayTip) this.instance).setBgLineColor(str);
            return this;
        }

        public Builder setBgLineColorBytes(ByteString byteString) {
            copyOnWrite();
            ((PayTip) this.instance).setBgLineColorBytes(byteString);
            return this;
        }

        public Builder setBgNightColor(String str) {
            copyOnWrite();
            ((PayTip) this.instance).setBgNightColor(str);
            return this;
        }

        public Builder setBgNightColorBytes(ByteString byteString) {
            copyOnWrite();
            ((PayTip) this.instance).setBgNightColorBytes(byteString);
            return this;
        }

        public Builder setBgNightLineColor(String str) {
            copyOnWrite();
            ((PayTip) this.instance).setBgNightLineColor(str);
            return this;
        }

        public Builder setBgNightLineColorBytes(ByteString byteString) {
            copyOnWrite();
            ((PayTip) this.instance).setBgNightLineColorBytes(byteString);
            return this;
        }

        public Builder setButton(int i, ButtonInfo buttonInfo) {
            copyOnWrite();
            ((PayTip) this.instance).setButton(i, buttonInfo);
            return this;
        }

        public Builder setGiantScreenImg(String str) {
            copyOnWrite();
            ((PayTip) this.instance).setGiantScreenImg(str);
            return this;
        }

        public Builder setGiantScreenImgBytes(ByteString byteString) {
            copyOnWrite();
            ((PayTip) this.instance).setGiantScreenImgBytes(byteString);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((PayTip) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((PayTip) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setImg(String str) {
            copyOnWrite();
            ((PayTip) this.instance).setImg(str);
            return this;
        }

        public Builder setImgBytes(ByteString byteString) {
            copyOnWrite();
            ((PayTip) this.instance).setImgBytes(byteString);
            return this;
        }

        public Builder setReport(Report report) {
            copyOnWrite();
            ((PayTip) this.instance).setReport(report);
            return this;
        }

        public Builder setReportType(int i) {
            copyOnWrite();
            ((PayTip) this.instance).setReportType(i);
            return this;
        }

        public Builder setShowType(int i) {
            copyOnWrite();
            ((PayTip) this.instance).setShowType(i);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((PayTip) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((PayTip) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTextNightColor(String str) {
            copyOnWrite();
            ((PayTip) this.instance).setTextNightColor(str);
            return this;
        }

        public Builder setTextNightColorBytes(ByteString byteString) {
            copyOnWrite();
            ((PayTip) this.instance).setTextNightColorBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((PayTip) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((PayTip) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((PayTip) this.instance).setType(i);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((PayTip) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((PayTip) this.instance).setUrlBytes(byteString);
            return this;
        }

        public Builder setUrlOpenType(int i) {
            copyOnWrite();
            ((PayTip) this.instance).setUrlOpenType(i);
            return this;
        }

        public Builder setViewStartTime(long j) {
            copyOnWrite();
            ((PayTip) this.instance).setViewStartTime(j);
            return this;
        }

        private Builder() {
            super(PayTip.DEFAULT_INSTANCE);
        }

        public Builder addButton(int i, ButtonInfo buttonInfo) {
            copyOnWrite();
            ((PayTip) this.instance).addButton(i, buttonInfo);
            return this;
        }

        public Builder setButton(int i, ButtonInfo.Builder builder) {
            copyOnWrite();
            ((PayTip) this.instance).setButton(i, builder.build());
            return this;
        }

        public Builder setReport(Report.Builder builder) {
            copyOnWrite();
            ((PayTip) this.instance).setReport(builder.build());
            return this;
        }

        public Builder addButton(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((PayTip) this.instance).addButton(builder.build());
            return this;
        }

        public Builder addButton(int i, ButtonInfo.Builder builder) {
            copyOnWrite();
            ((PayTip) this.instance).addButton(i, builder.build());
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
        PayTip payTip = new PayTip();
        DEFAULT_INSTANCE = payTip;
        GeneratedMessageLite.registerDefaultInstance(PayTip.class, payTip);
    }

    private PayTip() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllButton(Iterable<? extends ButtonInfo> iterable) {
        ensureButtonIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.button_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addButton(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.add(buttonInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAngleStyle() {
        this.angleStyle_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgDayColor() {
        this.bgDayColor_ = getDefaultInstance().getBgDayColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgLineColor() {
        this.bgLineColor_ = getDefaultInstance().getBgLineColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgNightColor() {
        this.bgNightColor_ = getDefaultInstance().getBgNightColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgNightLineColor() {
        this.bgNightLineColor_ = getDefaultInstance().getBgNightLineColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGiantScreenImg() {
        this.giantScreenImg_ = getDefaultInstance().getGiantScreenImg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImg() {
        this.img_ = getDefaultInstance().getImg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReport() {
        this.report_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportType() {
        this.reportType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowType() {
        this.showType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextColor() {
        this.textColor_ = getDefaultInstance().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextNightColor() {
        this.textNightColor_ = getDefaultInstance().getTextNightColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrlOpenType() {
        this.urlOpenType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewStartTime() {
        this.viewStartTime_ = 0L;
    }

    private void ensureButtonIsMutable() {
        Internal.ProtobufList<ButtonInfo> protobufList = this.button_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.button_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PayTip getDefaultInstance() {
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
    public void mergeReport(Report report) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PayTip parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PayTip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PayTip parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PayTip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PayTip> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeButton(int i) {
        ensureButtonIsMutable();
        this.button_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAngleStyle(int i) {
        this.angleStyle_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgDayColor(String str) {
        str.getClass();
        this.bgDayColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgDayColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgDayColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgLineColor(String str) {
        str.getClass();
        this.bgLineColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgLineColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgLineColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgNightColor(String str) {
        str.getClass();
        this.bgNightColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgNightColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgNightColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgNightLineColor(String str) {
        str.getClass();
        this.bgNightLineColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgNightLineColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgNightLineColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(int i, ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.set(i, buttonInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGiantScreenImg(String str) {
        str.getClass();
        this.giantScreenImg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGiantScreenImgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.giantScreenImg_ = byteString.toStringUtf8();
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
    public void setImg(String str) {
        str.getClass();
        this.img_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.img_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReport(Report report) {
        report.getClass();
        this.report_ = report;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportType(int i) {
        this.reportType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowType(int i) {
        this.showType_ = i;
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
    public void setTextNightColor(String str) {
        str.getClass();
        this.textNightColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextNightColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textNightColor_ = byteString.toStringUtf8();
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
    public void setType(int i) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlOpenType(int i) {
        this.urlOpenType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewStartTime(long j) {
        this.viewStartTime_ = j;
    }

    public boolean containsOrderReportParams(String str) {
        str.getClass();
        return internalGetOrderReportParams().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78581.f17577xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PayTip();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0000\u0001\u0014\u0014\u0001\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u0004\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0208\u000b\u0208\f\u0208\r\u0002\u000e\u001b\u000f\u0004\u0010\t\u0011\u0004\u0012\u0004\u00132\u0014\u0208", new Object[]{"title_", "url_", "icon_", "type_", "showType_", "img_", "bgDayColor_", "bgNightColor_", "bgLineColor_", "bgNightLineColor_", "textColor_", "textNightColor_", "viewStartTime_", "button_", ButtonInfo.class, "urlOpenType_", "report_", "angleStyle_", "reportType_", "orderReportParams_", OrderReportParamsDefaultEntryHolder.defaultEntry, "giantScreenImg_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PayTip> parser = PARSER;
                if (parser == null) {
                    synchronized (PayTip.class) {
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

    public int getAngleStyle() {
        return this.angleStyle_;
    }

    public String getBgDayColor() {
        return this.bgDayColor_;
    }

    public ByteString getBgDayColorBytes() {
        return ByteString.copyFromUtf8(this.bgDayColor_);
    }

    public String getBgLineColor() {
        return this.bgLineColor_;
    }

    public ByteString getBgLineColorBytes() {
        return ByteString.copyFromUtf8(this.bgLineColor_);
    }

    public String getBgNightColor() {
        return this.bgNightColor_;
    }

    public ByteString getBgNightColorBytes() {
        return ByteString.copyFromUtf8(this.bgNightColor_);
    }

    public String getBgNightLineColor() {
        return this.bgNightLineColor_;
    }

    public ByteString getBgNightLineColorBytes() {
        return ByteString.copyFromUtf8(this.bgNightLineColor_);
    }

    public ButtonInfo getButton(int i) {
        return this.button_.get(i);
    }

    public int getButtonCount() {
        return this.button_.size();
    }

    public List<ButtonInfo> getButtonList() {
        return this.button_;
    }

    public ButtonInfoOrBuilder getButtonOrBuilder(int i) {
        return this.button_.get(i);
    }

    public List<? extends ButtonInfoOrBuilder> getButtonOrBuilderList() {
        return this.button_;
    }

    public String getGiantScreenImg() {
        return this.giantScreenImg_;
    }

    public ByteString getGiantScreenImgBytes() {
        return ByteString.copyFromUtf8(this.giantScreenImg_);
    }

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public String getImg() {
        return this.img_;
    }

    public ByteString getImgBytes() {
        return ByteString.copyFromUtf8(this.img_);
    }

    @Deprecated
    public Map<String, String> getOrderReportParams() {
        return getOrderReportParamsMap();
    }

    public int getOrderReportParamsCount() {
        return internalGetOrderReportParams().size();
    }

    public Map<String, String> getOrderReportParamsMap() {
        return Collections.unmodifiableMap(internalGetOrderReportParams());
    }

    public String getOrderReportParamsOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetOrderReportParams = internalGetOrderReportParams();
        return internalGetOrderReportParams.containsKey(str) ? internalGetOrderReportParams.get(str) : str2;
    }

    public String getOrderReportParamsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetOrderReportParams = internalGetOrderReportParams();
        if (internalGetOrderReportParams.containsKey(str)) {
            return internalGetOrderReportParams.get(str);
        }
        throw new IllegalArgumentException();
    }

    public Report getReport() {
        Report report = this.report_;
        return report == null ? Report.getDefaultInstance() : report;
    }

    public int getReportType() {
        return this.reportType_;
    }

    public int getShowType() {
        return this.showType_;
    }

    public String getTextColor() {
        return this.textColor_;
    }

    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    public String getTextNightColor() {
        return this.textNightColor_;
    }

    public ByteString getTextNightColorBytes() {
        return ByteString.copyFromUtf8(this.textNightColor_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public int getType() {
        return this.type_;
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public int getUrlOpenType() {
        return this.urlOpenType_;
    }

    public long getViewStartTime() {
        return this.viewStartTime_;
    }

    public boolean hasReport() {
        return this.report_ != null;
    }

    public static Builder newBuilder(PayTip payTip) {
        return DEFAULT_INSTANCE.createBuilder(payTip);
    }

    public static PayTip parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PayTip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PayTip parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PayTip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PayTip parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PayTip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addButton(int i, ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.add(i, buttonInfo);
    }

    public static PayTip parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PayTip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PayTip parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PayTip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PayTip parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PayTip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PayTip parseFrom(InputStream inputStream) throws IOException {
        return (PayTip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PayTip parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PayTip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PayTip parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PayTip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PayTip parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PayTip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
