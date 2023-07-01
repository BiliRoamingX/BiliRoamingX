package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class Toast extends GeneratedMessageLite<Toast, Toast.Builder> implements MessageLiteOrBuilder {
    public static final int BUTTON_FIELD_NUMBER = 2;
    private static final Toast DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 4;
    public static final int ORDER_REPORT_PARAMS_FIELD_NUMBER = 7;
    private static volatile Parser<Toast> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 6;
    public static final int SHOW_STYLE_TYPE_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TOAST_TEXT_FIELD_NUMBER = 5;
    private ButtonInfo button_;
    private Report report_;
    private int showStyleType_;
    private TextInfo toastText_;
    private MapFieldLite<String, String> orderReportParams_ = MapFieldLite.emptyMapField();
    private String text_ = "";
    private String icon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.Toast$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78911 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17604xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17604xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17604xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17604xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17604xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17604xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17604xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17604xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Toast, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78911 c78911) {
            this();
        }

        public Builder clearButton() {
            copyOnWrite();
            ((Toast) this.instance).clearButton();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((Toast) this.instance).clearIcon();
            return this;
        }

        public Builder clearOrderReportParams() {
            copyOnWrite();
            ((Toast) this.instance).getMutableOrderReportParamsMap().clear();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((Toast) this.instance).clearReport();
            return this;
        }

        public Builder clearShowStyleType() {
            copyOnWrite();
            ((Toast) this.instance).clearShowStyleType();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((Toast) this.instance).clearText();
            return this;
        }

        public Builder clearToastText() {
            copyOnWrite();
            ((Toast) this.instance).clearToastText();
            return this;
        }

        public boolean containsOrderReportParams(String str) {
            str.getClass();
            return ((Toast) this.instance).getOrderReportParamsMap().containsKey(str);
        }

        public ButtonInfo getButton() {
            return ((Toast) this.instance).getButton();
        }

        public String getIcon() {
            return ((Toast) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((Toast) this.instance).getIconBytes();
        }

        @Deprecated
        public Map<String, String> getOrderReportParams() {
            return getOrderReportParamsMap();
        }

        public int getOrderReportParamsCount() {
            return ((Toast) this.instance).getOrderReportParamsMap().size();
        }

        public Map<String, String> getOrderReportParamsMap() {
            return Collections.unmodifiableMap(((Toast) this.instance).getOrderReportParamsMap());
        }

        public String getOrderReportParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> orderReportParamsMap = ((Toast) this.instance).getOrderReportParamsMap();
            return orderReportParamsMap.containsKey(str) ? orderReportParamsMap.get(str) : str2;
        }

        public String getOrderReportParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> orderReportParamsMap = ((Toast) this.instance).getOrderReportParamsMap();
            if (orderReportParamsMap.containsKey(str)) {
                return orderReportParamsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Report getReport() {
            return ((Toast) this.instance).getReport();
        }

        public int getShowStyleType() {
            return ((Toast) this.instance).getShowStyleType();
        }

        public String getText() {
            return ((Toast) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((Toast) this.instance).getTextBytes();
        }

        public TextInfo getToastText() {
            return ((Toast) this.instance).getToastText();
        }

        public boolean hasButton() {
            return ((Toast) this.instance).hasButton();
        }

        public boolean hasReport() {
            return ((Toast) this.instance).hasReport();
        }

        public boolean hasToastText() {
            return ((Toast) this.instance).hasToastText();
        }

        public Builder mergeButton(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((Toast) this.instance).mergeButton(buttonInfo);
            return this;
        }

        public Builder mergeReport(Report report) {
            copyOnWrite();
            ((Toast) this.instance).mergeReport(report);
            return this;
        }

        public Builder mergeToastText(TextInfo textInfo) {
            copyOnWrite();
            ((Toast) this.instance).mergeToastText(textInfo);
            return this;
        }

        public Builder putAllOrderReportParams(Map<String, String> map) {
            copyOnWrite();
            ((Toast) this.instance).getMutableOrderReportParamsMap().putAll(map);
            return this;
        }

        public Builder putOrderReportParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((Toast) this.instance).getMutableOrderReportParamsMap().put(str, str2);
            return this;
        }

        public Builder removeOrderReportParams(String str) {
            str.getClass();
            copyOnWrite();
            ((Toast) this.instance).getMutableOrderReportParamsMap().remove(str);
            return this;
        }

        public Builder setButton(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((Toast) this.instance).setButton(buttonInfo);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((Toast) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Toast) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setReport(Report report) {
            copyOnWrite();
            ((Toast) this.instance).setReport(report);
            return this;
        }

        public Builder setShowStyleType(int i) {
            copyOnWrite();
            ((Toast) this.instance).setShowStyleType(i);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((Toast) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Toast) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setToastText(TextInfo textInfo) {
            copyOnWrite();
            ((Toast) this.instance).setToastText(textInfo);
            return this;
        }

        private Builder() {
            super(Toast.DEFAULT_INSTANCE);
        }

        public Builder setButton(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((Toast) this.instance).setButton(builder.build());
            return this;
        }

        public Builder setReport(Report.Builder builder) {
            copyOnWrite();
            ((Toast) this.instance).setReport(builder.build());
            return this;
        }

        public Builder setToastText(TextInfo.Builder builder) {
            copyOnWrite();
            ((Toast) this.instance).setToastText(builder.build());
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
        Toast toast = new Toast();
        DEFAULT_INSTANCE = toast;
        GeneratedMessageLite.registerDefaultInstance(Toast.class, toast);
    }

    private Toast() {
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
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToastText() {
        this.toastText_ = null;
    }

    public static Toast getDefaultInstance() {
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
            this.button_ = ButtonInfo.newBuilder(this.button_).mergeFrom(buttonInfo).buildPartial();
        } else {
            this.button_ = buttonInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReport(Report report) {
        report.getClass();
        Report report2 = this.report_;
        if (report2 != null && report2 != Report.getDefaultInstance()) {
            this.report_ = Report.newBuilder(this.report_).mergeFrom(report).buildPartial();
        } else {
            this.report_ = report;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToastText(TextInfo textInfo) {
        textInfo.getClass();
        TextInfo textInfo2 = this.toastText_;
        if (textInfo2 != null && textInfo2 != TextInfo.getDefaultInstance()) {
            this.toastText_ = TextInfo.newBuilder(this.toastText_).mergeFrom(textInfo).buildPartial();
        } else {
            this.toastText_ = textInfo;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Toast parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Toast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Toast parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Toast> parser() {
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
    public void setShowStyleType(int i) {
        this.showStyleType_ = i;
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
    public void setToastText(TextInfo textInfo) {
        textInfo.getClass();
        this.toastText_ = textInfo;
    }

    public boolean containsOrderReportParams(String str) {
        str.getClass();
        return internalGetOrderReportParams().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78911.f17604xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Toast();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0208\u0002\t\u0003\u0004\u0004\u0208\u0005\t\u0006\t\u00072", new Object[]{"text_", "button_", "showStyleType_", "icon_", "toastText_", "report_", "orderReportParams_", OrderReportParamsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Toast> parser = PARSER;
                if (parser == null) {
                    synchronized (Toast.class) {
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

    public ButtonInfo getButton() {
        ButtonInfo buttonInfo = this.button_;
        return buttonInfo == null ? ButtonInfo.getDefaultInstance() : buttonInfo;
    }

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
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

    public int getShowStyleType() {
        return this.showStyleType_;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public TextInfo getToastText() {
        TextInfo textInfo = this.toastText_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    public boolean hasButton() {
        return this.button_ != null;
    }

    public boolean hasReport() {
        return this.report_ != null;
    }

    public boolean hasToastText() {
        return this.toastText_ != null;
    }

    public static Builder newBuilder(Toast toast) {
        return DEFAULT_INSTANCE.createBuilder(toast);
    }

    public static Toast parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Toast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Toast parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Toast parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Toast parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Toast parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Toast parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Toast parseFrom(InputStream inputStream) throws IOException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Toast parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Toast parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Toast parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Toast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
