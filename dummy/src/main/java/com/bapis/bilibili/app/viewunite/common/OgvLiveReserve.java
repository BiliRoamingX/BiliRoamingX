package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
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
public final class OgvLiveReserve extends GeneratedMessageLite<OgvLiveReserve, OgvLiveReserve.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVE_TYPE_FIELD_NUMBER = 16;
    public static final int BG_COLOR_FIELD_NUMBER = 8;
    public static final int BT_BG_COLOR_FIELD_NUMBER = 12;
    public static final int BT_FRAME_COLOR_FIELD_NUMBER = 13;
    public static final int BT_TEXT_COLOR_FIELD_NUMBER = 18;
    public static final int CLICK_BUTTON_FIELD_NUMBER = 5;
    private static final OgvLiveReserve DEFAULT_INSTANCE;
    public static final int FOLLOW_VIDEO_IS_RESERVE_LIVE_FIELD_NUMBER = 7;
    public static final int ICON_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 6;
    public static final int NIGHT_BG_COLOR_FIELD_NUMBER = 9;
    public static final int NIGHT_BT_BG_COLOR_FIELD_NUMBER = 14;
    public static final int NIGHT_BT_FRAME_COLOR_FIELD_NUMBER = 15;
    public static final int NIGHT_BT_TEXT_COLOR_FIELD_NUMBER = 19;
    public static final int NIGHT_ICON_FIELD_NUMBER = 4;
    public static final int NIGHT_TEXT_COLOR_FIELD_NUMBER = 11;
    private static volatile Parser<OgvLiveReserve> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 20;
    public static final int RESERVE_ID_FIELD_NUMBER = 1;
    public static final int RESERVE_STATUS_FIELD_NUMBER = 17;
    public static final int TEXT_COLOR_FIELD_NUMBER = 10;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int activeType_;
    private int followVideoIsReserveLive_;
    private long reserveId_;
    private int reserveStatus_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String title_ = "";
    private String icon_ = "";
    private String nightIcon_ = "";
    private String clickButton_ = "";
    private String link_ = "";
    private String bgColor_ = "";
    private String nightBgColor_ = "";
    private String textColor_ = "";
    private String nightTextColor_ = "";
    private String btBgColor_ = "";
    private String btFrameColor_ = "";
    private String nightBtBgColor_ = "";
    private String nightBtFrameColor_ = "";
    private String btTextColor_ = "";
    private String nightBtTextColor_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.OgvLiveReserve$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70221 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17003xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17003xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17003xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17003xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17003xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17003xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17003xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17003xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OgvLiveReserve, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70221 c70221) {
            this();
        }

        public Builder clearActiveType() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearActiveType();
            return this;
        }

        public Builder clearBgColor() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearBgColor();
            return this;
        }

        public Builder clearBtBgColor() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearBtBgColor();
            return this;
        }

        public Builder clearBtFrameColor() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearBtFrameColor();
            return this;
        }

        public Builder clearBtTextColor() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearBtTextColor();
            return this;
        }

        public Builder clearClickButton() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearClickButton();
            return this;
        }

        public Builder clearFollowVideoIsReserveLive() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearFollowVideoIsReserveLive();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearIcon();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearLink();
            return this;
        }

        public Builder clearNightBgColor() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearNightBgColor();
            return this;
        }

        public Builder clearNightBtBgColor() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearNightBtBgColor();
            return this;
        }

        public Builder clearNightBtFrameColor() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearNightBtFrameColor();
            return this;
        }

        public Builder clearNightBtTextColor() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearNightBtTextColor();
            return this;
        }

        public Builder clearNightIcon() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearNightIcon();
            return this;
        }

        public Builder clearNightTextColor() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearNightTextColor();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearReserveId() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearReserveId();
            return this;
        }

        public Builder clearReserveStatus() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearReserveStatus();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).clearTitle();
            return this;
        }

        public boolean containsReport(String str) {
            str.getClass();
            return ((OgvLiveReserve) this.instance).getReportMap().containsKey(str);
        }

        public int getActiveType() {
            return ((OgvLiveReserve) this.instance).getActiveType();
        }

        public String getBgColor() {
            return ((OgvLiveReserve) this.instance).getBgColor();
        }

        public ByteString getBgColorBytes() {
            return ((OgvLiveReserve) this.instance).getBgColorBytes();
        }

        public String getBtBgColor() {
            return ((OgvLiveReserve) this.instance).getBtBgColor();
        }

        public ByteString getBtBgColorBytes() {
            return ((OgvLiveReserve) this.instance).getBtBgColorBytes();
        }

        public String getBtFrameColor() {
            return ((OgvLiveReserve) this.instance).getBtFrameColor();
        }

        public ByteString getBtFrameColorBytes() {
            return ((OgvLiveReserve) this.instance).getBtFrameColorBytes();
        }

        public String getBtTextColor() {
            return ((OgvLiveReserve) this.instance).getBtTextColor();
        }

        public ByteString getBtTextColorBytes() {
            return ((OgvLiveReserve) this.instance).getBtTextColorBytes();
        }

        public String getClickButton() {
            return ((OgvLiveReserve) this.instance).getClickButton();
        }

        public ByteString getClickButtonBytes() {
            return ((OgvLiveReserve) this.instance).getClickButtonBytes();
        }

        public int getFollowVideoIsReserveLive() {
            return ((OgvLiveReserve) this.instance).getFollowVideoIsReserveLive();
        }

        public String getIcon() {
            return ((OgvLiveReserve) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((OgvLiveReserve) this.instance).getIconBytes();
        }

        public String getLink() {
            return ((OgvLiveReserve) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((OgvLiveReserve) this.instance).getLinkBytes();
        }

        public String getNightBgColor() {
            return ((OgvLiveReserve) this.instance).getNightBgColor();
        }

        public ByteString getNightBgColorBytes() {
            return ((OgvLiveReserve) this.instance).getNightBgColorBytes();
        }

        public String getNightBtBgColor() {
            return ((OgvLiveReserve) this.instance).getNightBtBgColor();
        }

        public ByteString getNightBtBgColorBytes() {
            return ((OgvLiveReserve) this.instance).getNightBtBgColorBytes();
        }

        public String getNightBtFrameColor() {
            return ((OgvLiveReserve) this.instance).getNightBtFrameColor();
        }

        public ByteString getNightBtFrameColorBytes() {
            return ((OgvLiveReserve) this.instance).getNightBtFrameColorBytes();
        }

        public String getNightBtTextColor() {
            return ((OgvLiveReserve) this.instance).getNightBtTextColor();
        }

        public ByteString getNightBtTextColorBytes() {
            return ((OgvLiveReserve) this.instance).getNightBtTextColorBytes();
        }

        public String getNightIcon() {
            return ((OgvLiveReserve) this.instance).getNightIcon();
        }

        public ByteString getNightIconBytes() {
            return ((OgvLiveReserve) this.instance).getNightIconBytes();
        }

        public String getNightTextColor() {
            return ((OgvLiveReserve) this.instance).getNightTextColor();
        }

        public ByteString getNightTextColorBytes() {
            return ((OgvLiveReserve) this.instance).getNightTextColorBytes();
        }

        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        public int getReportCount() {
            return ((OgvLiveReserve) this.instance).getReportMap().size();
        }

        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((OgvLiveReserve) this.instance).getReportMap());
        }

        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((OgvLiveReserve) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((OgvLiveReserve) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public long getReserveId() {
            return ((OgvLiveReserve) this.instance).getReserveId();
        }

        public int getReserveStatus() {
            return ((OgvLiveReserve) this.instance).getReserveStatus();
        }

        public String getTextColor() {
            return ((OgvLiveReserve) this.instance).getTextColor();
        }

        public ByteString getTextColorBytes() {
            return ((OgvLiveReserve) this.instance).getTextColorBytes();
        }

        public String getTitle() {
            return ((OgvLiveReserve) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((OgvLiveReserve) this.instance).getTitleBytes();
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((OgvLiveReserve) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((OgvLiveReserve) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder setActiveType(int i) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setActiveType(i);
            return this;
        }

        public Builder setBgColor(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setBgColor(str);
            return this;
        }

        public Builder setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public Builder setBtBgColor(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setBtBgColor(str);
            return this;
        }

        public Builder setBtBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setBtBgColorBytes(byteString);
            return this;
        }

        public Builder setBtFrameColor(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setBtFrameColor(str);
            return this;
        }

        public Builder setBtFrameColorBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setBtFrameColorBytes(byteString);
            return this;
        }

        public Builder setBtTextColor(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setBtTextColor(str);
            return this;
        }

        public Builder setBtTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setBtTextColorBytes(byteString);
            return this;
        }

        public Builder setClickButton(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setClickButton(str);
            return this;
        }

        public Builder setClickButtonBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setClickButtonBytes(byteString);
            return this;
        }

        public Builder setFollowVideoIsReserveLive(int i) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setFollowVideoIsReserveLive(i);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setNightBgColor(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setNightBgColor(str);
            return this;
        }

        public Builder setNightBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setNightBgColorBytes(byteString);
            return this;
        }

        public Builder setNightBtBgColor(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setNightBtBgColor(str);
            return this;
        }

        public Builder setNightBtBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setNightBtBgColorBytes(byteString);
            return this;
        }

        public Builder setNightBtFrameColor(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setNightBtFrameColor(str);
            return this;
        }

        public Builder setNightBtFrameColorBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setNightBtFrameColorBytes(byteString);
            return this;
        }

        public Builder setNightBtTextColor(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setNightBtTextColor(str);
            return this;
        }

        public Builder setNightBtTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setNightBtTextColorBytes(byteString);
            return this;
        }

        public Builder setNightIcon(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setNightIcon(str);
            return this;
        }

        public Builder setNightIconBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setNightIconBytes(byteString);
            return this;
        }

        public Builder setNightTextColor(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setNightTextColor(str);
            return this;
        }

        public Builder setNightTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setNightTextColorBytes(byteString);
            return this;
        }

        public Builder setReserveId(long j) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setReserveId(j);
            return this;
        }

        public Builder setReserveStatus(int i) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setReserveStatus(i);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvLiveReserve) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(OgvLiveReserve.DEFAULT_INSTANCE);
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
        OgvLiveReserve ogvLiveReserve = new OgvLiveReserve();
        DEFAULT_INSTANCE = ogvLiveReserve;
        GeneratedMessageLite.registerDefaultInstance(OgvLiveReserve.class, ogvLiveReserve);
    }

    private OgvLiveReserve() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActiveType() {
        this.activeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgColor() {
        this.bgColor_ = getDefaultInstance().getBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBtBgColor() {
        this.btBgColor_ = getDefaultInstance().getBtBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBtFrameColor() {
        this.btFrameColor_ = getDefaultInstance().getBtFrameColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBtTextColor() {
        this.btTextColor_ = getDefaultInstance().getBtTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickButton() {
        this.clickButton_ = getDefaultInstance().getClickButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowVideoIsReserveLive() {
        this.followVideoIsReserveLive_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNightBgColor() {
        this.nightBgColor_ = getDefaultInstance().getNightBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNightBtBgColor() {
        this.nightBtBgColor_ = getDefaultInstance().getNightBtBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNightBtFrameColor() {
        this.nightBtFrameColor_ = getDefaultInstance().getNightBtFrameColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNightBtTextColor() {
        this.nightBtTextColor_ = getDefaultInstance().getNightBtTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNightIcon() {
        this.nightIcon_ = getDefaultInstance().getNightIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNightTextColor() {
        this.nightTextColor_ = getDefaultInstance().getNightTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserveId() {
        this.reserveId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserveStatus() {
        this.reserveStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextColor() {
        this.textColor_ = getDefaultInstance().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static OgvLiveReserve getDefaultInstance() {
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

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OgvLiveReserve parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OgvLiveReserve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OgvLiveReserve parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OgvLiveReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OgvLiveReserve> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveType(int i) {
        this.activeType_ = i;
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
    public void setBtBgColor(String str) {
        str.getClass();
        this.btBgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtBgColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.btBgColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtFrameColor(String str) {
        str.getClass();
        this.btFrameColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtFrameColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.btFrameColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtTextColor(String str) {
        str.getClass();
        this.btTextColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.btTextColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickButton(String str) {
        str.getClass();
        this.clickButton_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickButtonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clickButton_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowVideoIsReserveLive(int i) {
        this.followVideoIsReserveLive_ = i;
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
    public void setNightBgColor(String str) {
        str.getClass();
        this.nightBgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightBgColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nightBgColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightBtBgColor(String str) {
        str.getClass();
        this.nightBtBgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightBtBgColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nightBtBgColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightBtFrameColor(String str) {
        str.getClass();
        this.nightBtFrameColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightBtFrameColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nightBtFrameColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightBtTextColor(String str) {
        str.getClass();
        this.nightBtTextColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightBtTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nightBtTextColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightIcon(String str) {
        str.getClass();
        this.nightIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nightIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightTextColor(String str) {
        str.getClass();
        this.nightTextColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nightTextColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveId(long j) {
        this.reserveId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveStatus(int i) {
        this.reserveStatus_ = i;
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
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70221.f17003xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OgvLiveReserve();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0000\u0001\u0014\u0014\u0001\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0004\b\u0208\t\u0208\n\u0208\u000b\u0208\f\u0208\r\u0208\u000e\u0208\u000f\u0208\u0010\u0004\u0011\u0004\u0012\u0208\u0013\u0208\u00142", new Object[]{"reserveId_", "title_", "icon_", "nightIcon_", "clickButton_", "link_", "followVideoIsReserveLive_", "bgColor_", "nightBgColor_", "textColor_", "nightTextColor_", "btBgColor_", "btFrameColor_", "nightBtBgColor_", "nightBtFrameColor_", "activeType_", "reserveStatus_", "btTextColor_", "nightBtTextColor_", "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OgvLiveReserve> parser = PARSER;
                if (parser == null) {
                    synchronized (OgvLiveReserve.class) {
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

    public int getActiveType() {
        return this.activeType_;
    }

    public String getBgColor() {
        return this.bgColor_;
    }

    public ByteString getBgColorBytes() {
        return ByteString.copyFromUtf8(this.bgColor_);
    }

    public String getBtBgColor() {
        return this.btBgColor_;
    }

    public ByteString getBtBgColorBytes() {
        return ByteString.copyFromUtf8(this.btBgColor_);
    }

    public String getBtFrameColor() {
        return this.btFrameColor_;
    }

    public ByteString getBtFrameColorBytes() {
        return ByteString.copyFromUtf8(this.btFrameColor_);
    }

    public String getBtTextColor() {
        return this.btTextColor_;
    }

    public ByteString getBtTextColorBytes() {
        return ByteString.copyFromUtf8(this.btTextColor_);
    }

    public String getClickButton() {
        return this.clickButton_;
    }

    public ByteString getClickButtonBytes() {
        return ByteString.copyFromUtf8(this.clickButton_);
    }

    public int getFollowVideoIsReserveLive() {
        return this.followVideoIsReserveLive_;
    }

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public String getLink() {
        return this.link_;
    }

    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    public String getNightBgColor() {
        return this.nightBgColor_;
    }

    public ByteString getNightBgColorBytes() {
        return ByteString.copyFromUtf8(this.nightBgColor_);
    }

    public String getNightBtBgColor() {
        return this.nightBtBgColor_;
    }

    public ByteString getNightBtBgColorBytes() {
        return ByteString.copyFromUtf8(this.nightBtBgColor_);
    }

    public String getNightBtFrameColor() {
        return this.nightBtFrameColor_;
    }

    public ByteString getNightBtFrameColorBytes() {
        return ByteString.copyFromUtf8(this.nightBtFrameColor_);
    }

    public String getNightBtTextColor() {
        return this.nightBtTextColor_;
    }

    public ByteString getNightBtTextColorBytes() {
        return ByteString.copyFromUtf8(this.nightBtTextColor_);
    }

    public String getNightIcon() {
        return this.nightIcon_;
    }

    public ByteString getNightIconBytes() {
        return ByteString.copyFromUtf8(this.nightIcon_);
    }

    public String getNightTextColor() {
        return this.nightTextColor_;
    }

    public ByteString getNightTextColorBytes() {
        return ByteString.copyFromUtf8(this.nightTextColor_);
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

    public long getReserveId() {
        return this.reserveId_;
    }

    public int getReserveStatus() {
        return this.reserveStatus_;
    }

    public String getTextColor() {
        return this.textColor_;
    }

    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(OgvLiveReserve ogvLiveReserve) {
        return DEFAULT_INSTANCE.createBuilder(ogvLiveReserve);
    }

    public static OgvLiveReserve parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvLiveReserve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OgvLiveReserve parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvLiveReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OgvLiveReserve parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OgvLiveReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OgvLiveReserve parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvLiveReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OgvLiveReserve parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OgvLiveReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OgvLiveReserve parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvLiveReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OgvLiveReserve parseFrom(InputStream inputStream) throws IOException {
        return (OgvLiveReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OgvLiveReserve parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvLiveReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OgvLiveReserve parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OgvLiveReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OgvLiveReserve parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvLiveReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
