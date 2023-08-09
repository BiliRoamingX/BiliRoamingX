package com.bapis.bilibili.playershared;

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
/* loaded from: classes18.dex */
public final class ComprehensiveToast extends GeneratedMessageLite<ComprehensiveToast, ComprehensiveToast.Builder> implements ComprehensiveToastOrBuilder {
    public static final int BUTTON_FIELD_NUMBER = 2;
    private static final ComprehensiveToast DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 4;
    public static final int ORDER_REPORT_PARAMS_FIELD_NUMBER = 7;
    private static volatile Parser<ComprehensiveToast> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 6;
    public static final int SHOW_STYLE_TYPE_FIELD_NUMBER = 3;
    public static final int TOAST_TEXT_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 1;
    private ButtonInfo button_;
    private Report report_;
    private int showStyleType_;
    private TextInfo toastText_;
    private int type_;
    private MapFieldLite<String, String> orderReportParams_ = MapFieldLite.emptyMapField();
    private String icon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.ComprehensiveToast$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81641 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17891xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17891xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17891xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17891xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17891xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17891xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17891xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17891xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ComprehensiveToast, Builder> implements ComprehensiveToastOrBuilder {
        /* synthetic */ Builder(C81641 c81641) {
            this();
        }

        public Builder clearButton() {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).clearButton();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).clearIcon();
            return this;
        }

        public Builder clearOrderReportParams() {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).getMutableOrderReportParamsMap().clear();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).clearReport();
            return this;
        }

        public Builder clearShowStyleType() {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).clearShowStyleType();
            return this;
        }

        public Builder clearToastText() {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).clearToastText();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public boolean containsOrderReportParams(String str) {
            str.getClass();
            return ((ComprehensiveToast) this.instance).getOrderReportParamsMap().containsKey(str);
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public ButtonInfo getButton() {
            return ((ComprehensiveToast) this.instance).getButton();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public String getIcon() {
            return ((ComprehensiveToast) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public ByteString getIconBytes() {
            return ((ComprehensiveToast) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        @Deprecated
        public Map<String, String> getOrderReportParams() {
            return getOrderReportParamsMap();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public int getOrderReportParamsCount() {
            return ((ComprehensiveToast) this.instance).getOrderReportParamsMap().size();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public Map<String, String> getOrderReportParamsMap() {
            return Collections.unmodifiableMap(((ComprehensiveToast) this.instance).getOrderReportParamsMap());
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public String getOrderReportParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> orderReportParamsMap = ((ComprehensiveToast) this.instance).getOrderReportParamsMap();
            return orderReportParamsMap.containsKey(str) ? orderReportParamsMap.get(str) : str2;
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public String getOrderReportParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> orderReportParamsMap = ((ComprehensiveToast) this.instance).getOrderReportParamsMap();
            if (orderReportParamsMap.containsKey(str)) {
                return orderReportParamsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public Report getReport() {
            return ((ComprehensiveToast) this.instance).getReport();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public ShowStyleType getShowStyleType() {
            return ((ComprehensiveToast) this.instance).getShowStyleType();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public int getShowStyleTypeValue() {
            return ((ComprehensiveToast) this.instance).getShowStyleTypeValue();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public TextInfo getToastText() {
            return ((ComprehensiveToast) this.instance).getToastText();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public ToastType getType() {
            return ((ComprehensiveToast) this.instance).getType();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public int getTypeValue() {
            return ((ComprehensiveToast) this.instance).getTypeValue();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public boolean hasButton() {
            return ((ComprehensiveToast) this.instance).hasButton();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public boolean hasReport() {
            return ((ComprehensiveToast) this.instance).hasReport();
        }

        @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
        public boolean hasToastText() {
            return ((ComprehensiveToast) this.instance).hasToastText();
        }

        public Builder mergeButton(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).mergeButton(buttonInfo);
            return this;
        }

        public Builder mergeReport(Report report) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).mergeReport(report);
            return this;
        }

        public Builder mergeToastText(TextInfo textInfo) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).mergeToastText(textInfo);
            return this;
        }

        public Builder putAllOrderReportParams(Map<String, String> map) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).getMutableOrderReportParamsMap().putAll(map);
            return this;
        }

        public Builder putOrderReportParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((ComprehensiveToast) this.instance).getMutableOrderReportParamsMap().put(str, str2);
            return this;
        }

        public Builder removeOrderReportParams(String str) {
            str.getClass();
            copyOnWrite();
            ((ComprehensiveToast) this.instance).getMutableOrderReportParamsMap().remove(str);
            return this;
        }

        public Builder setButton(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).setButton(buttonInfo);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setReport(Report report) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).setReport(report);
            return this;
        }

        public Builder setShowStyleType(ShowStyleType showStyleType) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).setShowStyleType(showStyleType);
            return this;
        }

        public Builder setShowStyleTypeValue(int i) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).setShowStyleTypeValue(i);
            return this;
        }

        public Builder setToastText(TextInfo textInfo) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).setToastText(textInfo);
            return this;
        }

        public Builder setType(ToastType toastType) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).setType(toastType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).setTypeValue(i);
            return this;
        }

        private Builder() {
            super(ComprehensiveToast.DEFAULT_INSTANCE);
        }

        public Builder setButton(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).setButton(builder.build());
            return this;
        }

        public Builder setReport(Report.Builder builder) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).setReport(builder.build());
            return this;
        }

        public Builder setToastText(TextInfo.Builder builder) {
            copyOnWrite();
            ((ComprehensiveToast) this.instance).setToastText(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
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
        ComprehensiveToast comprehensiveToast = new ComprehensiveToast();
        DEFAULT_INSTANCE = comprehensiveToast;
        GeneratedMessageLite.registerDefaultInstance(ComprehensiveToast.class, comprehensiveToast);
    }

    private ComprehensiveToast() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReport() {
        this.report_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowStyleType() {
        this.showStyleType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToastText() {
        this.toastText_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static ComprehensiveToast getDefaultInstance() {
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
    public void mergeButton(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ButtonInfo buttonInfo2 = this.button_;
        if (buttonInfo2 != null && buttonInfo2 != ButtonInfo.getDefaultInstance()) {
            this.button_ = ButtonInfo.newBuilder(this.button_).mergeFrom((ButtonInfo) buttonInfo).buildPartial();
        } else {
            this.button_ = buttonInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReport(Report report) {
        report.getClass();
        Report report2 = this.report_;
        if (report2 != null && report2 != Report.getDefaultInstance()) {
            this.report_ = Report.newBuilder(this.report_).mergeFrom((Report) report).buildPartial();
        } else {
            this.report_ = report;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToastText(TextInfo textInfo) {
        textInfo.getClass();
        TextInfo textInfo2 = this.toastText_;
        if (textInfo2 != null && textInfo2 != TextInfo.getDefaultInstance()) {
            this.toastText_ = TextInfo.newBuilder(this.toastText_).mergeFrom((TextInfo) textInfo).buildPartial();
        } else {
            this.toastText_ = textInfo;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ComprehensiveToast parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ComprehensiveToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ComprehensiveToast parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ComprehensiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ComprehensiveToast> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        this.button_ = buttonInfo;
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
    public void setReport(Report report) {
        report.getClass();
        this.report_ = report;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowStyleType(ShowStyleType showStyleType) {
        this.showStyleType_ = showStyleType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowStyleTypeValue(int i) {
        this.showStyleType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastText(TextInfo textInfo) {
        textInfo.getClass();
        this.toastText_ = textInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ToastType toastType) {
        this.type_ = toastType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public boolean containsOrderReportParams(String str) {
        str.getClass();
        return internalGetOrderReportParams().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81641.f17891xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ComprehensiveToast();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\f\u0002\t\u0003\f\u0004\u0208\u0005\t\u0006\t\u00072", new Object[]{"type_", "button_", "showStyleType_", "icon_", "toastText_", "report_", "orderReportParams_", OrderReportParamsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ComprehensiveToast> parser = PARSER;
                if (parser == null) {
                    synchronized (ComprehensiveToast.class) {
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

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public ButtonInfo getButton() {
        ButtonInfo buttonInfo = this.button_;
        return buttonInfo == null ? ButtonInfo.getDefaultInstance() : buttonInfo;
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    @Deprecated
    public Map<String, String> getOrderReportParams() {
        return getOrderReportParamsMap();
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public int getOrderReportParamsCount() {
        return internalGetOrderReportParams().size();
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public Map<String, String> getOrderReportParamsMap() {
        return Collections.unmodifiableMap(internalGetOrderReportParams());
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public String getOrderReportParamsOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetOrderReportParams = internalGetOrderReportParams();
        return internalGetOrderReportParams.containsKey(str) ? internalGetOrderReportParams.get(str) : str2;
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public String getOrderReportParamsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetOrderReportParams = internalGetOrderReportParams();
        if (internalGetOrderReportParams.containsKey(str)) {
            return internalGetOrderReportParams.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public Report getReport() {
        Report report = this.report_;
        return report == null ? Report.getDefaultInstance() : report;
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public ShowStyleType getShowStyleType() {
        ShowStyleType forNumber = ShowStyleType.forNumber(this.showStyleType_);
        return forNumber == null ? ShowStyleType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public int getShowStyleTypeValue() {
        return this.showStyleType_;
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public TextInfo getToastText() {
        TextInfo textInfo = this.toastText_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public ToastType getType() {
        ToastType forNumber = ToastType.forNumber(this.type_);
        return forNumber == null ? ToastType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public boolean hasButton() {
        return this.button_ != null;
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public boolean hasReport() {
        return this.report_ != null;
    }

    @Override // com.bapis.bilibili.playershared.ComprehensiveToastOrBuilder
    public boolean hasToastText() {
        return this.toastText_ != null;
    }

    public static Builder newBuilder(ComprehensiveToast comprehensiveToast) {
        return DEFAULT_INSTANCE.createBuilder(comprehensiveToast);
    }

    public static ComprehensiveToast parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ComprehensiveToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ComprehensiveToast parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ComprehensiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ComprehensiveToast parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ComprehensiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ComprehensiveToast parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ComprehensiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ComprehensiveToast parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ComprehensiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ComprehensiveToast parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ComprehensiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ComprehensiveToast parseFrom(InputStream inputStream) throws IOException {
        return (ComprehensiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ComprehensiveToast parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ComprehensiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ComprehensiveToast parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ComprehensiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ComprehensiveToast parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ComprehensiveToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
