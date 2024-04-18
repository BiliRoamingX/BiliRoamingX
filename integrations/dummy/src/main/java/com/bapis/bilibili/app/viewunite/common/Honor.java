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
public final class Honor extends GeneratedMessageLite<Honor, Honor.Builder> implements MessageLiteOrBuilder {
    public static final int BG_COLOR_FIELD_NUMBER = 7;
    public static final int BG_COLOR_NIGHT_FIELD_NUMBER = 8;
    private static final Honor DEFAULT_INSTANCE;
    public static final int HONOR_JUMP_TYPE_FIELD_NUMBER = 12;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int ICON_NIGHT_FIELD_NUMBER = 2;
    private static volatile Parser<Honor> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 13;
    public static final int TEXT_COLOR_FIELD_NUMBER = 5;
    public static final int TEXT_COLOR_NIGHT_FIELD_NUMBER = 6;
    public static final int TEXT_EXTRA_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 11;
    public static final int URL_FIELD_NUMBER = 9;
    public static final int URL_TEXT_FIELD_NUMBER = 10;
    private int honorJumpType_;
    private int type_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String icon_ = "";
    private String iconNight_ = "";
    private String text_ = "";
    private String textExtra_ = "";
    private String textColor_ = "";
    private String textColorNight_ = "";
    private String bgColor_ = "";
    private String bgColorNight_ = "";
    private String url_ = "";
    private String urlText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Honor$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70001 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16986xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16986xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16986xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16986xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16986xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16986xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16986xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16986xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Honor, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70001 c70001) {
            this();
        }

        public Builder clearBgColor() {
            copyOnWrite();
            ((Honor) this.instance).clearBgColor();
            return this;
        }

        public Builder clearBgColorNight() {
            copyOnWrite();
            ((Honor) this.instance).clearBgColorNight();
            return this;
        }

        public Builder clearHonorJumpType() {
            copyOnWrite();
            ((Honor) this.instance).clearHonorJumpType();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((Honor) this.instance).clearIcon();
            return this;
        }

        public Builder clearIconNight() {
            copyOnWrite();
            ((Honor) this.instance).clearIconNight();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((Honor) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((Honor) this.instance).clearText();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((Honor) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTextColorNight() {
            copyOnWrite();
            ((Honor) this.instance).clearTextColorNight();
            return this;
        }

        public Builder clearTextExtra() {
            copyOnWrite();
            ((Honor) this.instance).clearTextExtra();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Honor) this.instance).clearType();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((Honor) this.instance).clearUrl();
            return this;
        }

        public Builder clearUrlText() {
            copyOnWrite();
            ((Honor) this.instance).clearUrlText();
            return this;
        }

        public boolean containsReport(String str) {
            str.getClass();
            return ((Honor) this.instance).getReportMap().containsKey(str);
        }

        public String getBgColor() {
            return ((Honor) this.instance).getBgColor();
        }

        public ByteString getBgColorBytes() {
            return ((Honor) this.instance).getBgColorBytes();
        }

        public String getBgColorNight() {
            return ((Honor) this.instance).getBgColorNight();
        }

        public ByteString getBgColorNightBytes() {
            return ((Honor) this.instance).getBgColorNightBytes();
        }

        public HonorJumpType getHonorJumpType() {
            return ((Honor) this.instance).getHonorJumpType();
        }

        public int getHonorJumpTypeValue() {
            return ((Honor) this.instance).getHonorJumpTypeValue();
        }

        public String getIcon() {
            return ((Honor) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((Honor) this.instance).getIconBytes();
        }

        public String getIconNight() {
            return ((Honor) this.instance).getIconNight();
        }

        public ByteString getIconNightBytes() {
            return ((Honor) this.instance).getIconNightBytes();
        }

        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        public int getReportCount() {
            return ((Honor) this.instance).getReportMap().size();
        }

        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((Honor) this.instance).getReportMap());
        }

        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((Honor) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((Honor) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getText() {
            return ((Honor) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((Honor) this.instance).getTextBytes();
        }

        public String getTextColor() {
            return ((Honor) this.instance).getTextColor();
        }

        public ByteString getTextColorBytes() {
            return ((Honor) this.instance).getTextColorBytes();
        }

        public String getTextColorNight() {
            return ((Honor) this.instance).getTextColorNight();
        }

        public ByteString getTextColorNightBytes() {
            return ((Honor) this.instance).getTextColorNightBytes();
        }

        public String getTextExtra() {
            return ((Honor) this.instance).getTextExtra();
        }

        public ByteString getTextExtraBytes() {
            return ((Honor) this.instance).getTextExtraBytes();
        }

        public HonorType getType() {
            return ((Honor) this.instance).getType();
        }

        public int getTypeValue() {
            return ((Honor) this.instance).getTypeValue();
        }

        public String getUrl() {
            return ((Honor) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((Honor) this.instance).getUrlBytes();
        }

        public String getUrlText() {
            return ((Honor) this.instance).getUrlText();
        }

        public ByteString getUrlTextBytes() {
            return ((Honor) this.instance).getUrlTextBytes();
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((Honor) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((Honor) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((Honor) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder setBgColor(String str) {
            copyOnWrite();
            ((Honor) this.instance).setBgColor(str);
            return this;
        }

        public Builder setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((Honor) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public Builder setBgColorNight(String str) {
            copyOnWrite();
            ((Honor) this.instance).setBgColorNight(str);
            return this;
        }

        public Builder setBgColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((Honor) this.instance).setBgColorNightBytes(byteString);
            return this;
        }

        public Builder setHonorJumpType(HonorJumpType honorJumpType) {
            copyOnWrite();
            ((Honor) this.instance).setHonorJumpType(honorJumpType);
            return this;
        }

        public Builder setHonorJumpTypeValue(int i) {
            copyOnWrite();
            ((Honor) this.instance).setHonorJumpTypeValue(i);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((Honor) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Honor) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setIconNight(String str) {
            copyOnWrite();
            ((Honor) this.instance).setIconNight(str);
            return this;
        }

        public Builder setIconNightBytes(ByteString byteString) {
            copyOnWrite();
            ((Honor) this.instance).setIconNightBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((Honor) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Honor) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((Honor) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((Honor) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTextColorNight(String str) {
            copyOnWrite();
            ((Honor) this.instance).setTextColorNight(str);
            return this;
        }

        public Builder setTextColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((Honor) this.instance).setTextColorNightBytes(byteString);
            return this;
        }

        public Builder setTextExtra(String str) {
            copyOnWrite();
            ((Honor) this.instance).setTextExtra(str);
            return this;
        }

        public Builder setTextExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((Honor) this.instance).setTextExtraBytes(byteString);
            return this;
        }

        public Builder setType(HonorType honorType) {
            copyOnWrite();
            ((Honor) this.instance).setType(honorType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((Honor) this.instance).setTypeValue(i);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((Honor) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Honor) this.instance).setUrlBytes(byteString);
            return this;
        }

        public Builder setUrlText(String str) {
            copyOnWrite();
            ((Honor) this.instance).setUrlText(str);
            return this;
        }

        public Builder setUrlTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Honor) this.instance).setUrlTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(Honor.DEFAULT_INSTANCE);
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
        Honor honor = new Honor();
        DEFAULT_INSTANCE = honor;
        GeneratedMessageLite.registerDefaultInstance(Honor.class, honor);
    }

    private Honor() {
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
    public void clearHonorJumpType() {
        this.honorJumpType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconNight() {
        this.iconNight_ = getDefaultInstance().getIconNight();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextExtra() {
        this.textExtra_ = getDefaultInstance().getTextExtra();
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
    public void clearUrlText() {
        this.urlText_ = getDefaultInstance().getUrlText();
    }

    public static Honor getDefaultInstance() {
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

    public static Honor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Honor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Honor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Honor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Honor> parser() {
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
    public void setHonorJumpType(HonorJumpType honorJumpType) {
        this.honorJumpType_ = honorJumpType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHonorJumpTypeValue(int i) {
        this.honorJumpType_ = i;
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
    public void setIconNight(String str) {
        str.getClass();
        this.iconNight_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconNight_ = byteString.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextExtra(String str) {
        str.getClass();
        this.textExtra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textExtra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(HonorType honorType) {
        this.type_ = honorType.getNumber();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlText(String str) {
        str.getClass();
        this.urlText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.urlText_ = byteString.toStringUtf8();
    }

    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70001.f16986xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Honor();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0208\u000b\f\f\f\r2", new Object[]{"icon_", "iconNight_", "text_", "textExtra_", "textColor_", "textColorNight_", "bgColor_", "bgColorNight_", "url_", "urlText_", "type_", "honorJumpType_", "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Honor> parser = PARSER;
                if (parser == null) {
                    synchronized (Honor.class) {
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

    public String getBgColor() {
        return this.bgColor_;
    }

    public ByteString getBgColorBytes() {
        return ByteString.copyFromUtf8(this.bgColor_);
    }

    public String getBgColorNight() {
        return this.bgColorNight_;
    }

    public ByteString getBgColorNightBytes() {
        return ByteString.copyFromUtf8(this.bgColorNight_);
    }

    public HonorJumpType getHonorJumpType() {
        HonorJumpType forNumber = HonorJumpType.forNumber(this.honorJumpType_);
        return forNumber == null ? HonorJumpType.UNRECOGNIZED : forNumber;
    }

    public int getHonorJumpTypeValue() {
        return this.honorJumpType_;
    }

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public String getIconNight() {
        return this.iconNight_;
    }

    public ByteString getIconNightBytes() {
        return ByteString.copyFromUtf8(this.iconNight_);
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

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public String getTextColor() {
        return this.textColor_;
    }

    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    public String getTextColorNight() {
        return this.textColorNight_;
    }

    public ByteString getTextColorNightBytes() {
        return ByteString.copyFromUtf8(this.textColorNight_);
    }

    public String getTextExtra() {
        return this.textExtra_;
    }

    public ByteString getTextExtraBytes() {
        return ByteString.copyFromUtf8(this.textExtra_);
    }

    public HonorType getType() {
        HonorType forNumber = HonorType.forNumber(this.type_);
        return forNumber == null ? HonorType.UNRECOGNIZED : forNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public String getUrlText() {
        return this.urlText_;
    }

    public ByteString getUrlTextBytes() {
        return ByteString.copyFromUtf8(this.urlText_);
    }

    public static Builder newBuilder(Honor honor) {
        return DEFAULT_INSTANCE.createBuilder(honor);
    }

    public static Honor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Honor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Honor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Honor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Honor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Honor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Honor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Honor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Honor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Honor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Honor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Honor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Honor parseFrom(InputStream inputStream) throws IOException {
        return (Honor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Honor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Honor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Honor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Honor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Honor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Honor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
