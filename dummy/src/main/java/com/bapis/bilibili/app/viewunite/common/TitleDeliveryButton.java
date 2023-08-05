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
public final class TitleDeliveryButton extends GeneratedMessageLite<TitleDeliveryButton, TitleDeliveryButton.Builder> implements MessageLiteOrBuilder {
    private static final TitleDeliveryButton DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int LINK_FIELD_NUMBER = 3;
    private static volatile Parser<TitleDeliveryButton> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String icon_ = "";
    private String title_ = "";
    private String link_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.TitleDeliveryButton$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70711 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17048xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17048xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17048xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17048xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17048xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17048xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17048xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17048xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TitleDeliveryButton, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70711 c70711) {
            this();
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).clearIcon();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).clearLink();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).clearTitle();
            return this;
        }

        public boolean containsReport(String str) {
            str.getClass();
            return ((TitleDeliveryButton) this.instance).getReportMap().containsKey(str);
        }

        public String getIcon() {
            return ((TitleDeliveryButton) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((TitleDeliveryButton) this.instance).getIconBytes();
        }

        public String getLink() {
            return ((TitleDeliveryButton) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((TitleDeliveryButton) this.instance).getLinkBytes();
        }

        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        public int getReportCount() {
            return ((TitleDeliveryButton) this.instance).getReportMap().size();
        }

        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((TitleDeliveryButton) this.instance).getReportMap());
        }

        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((TitleDeliveryButton) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((TitleDeliveryButton) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getTitle() {
            return ((TitleDeliveryButton) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((TitleDeliveryButton) this.instance).getTitleBytes();
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((TitleDeliveryButton) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(TitleDeliveryButton.DEFAULT_INSTANCE);
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
        TitleDeliveryButton titleDeliveryButton = new TitleDeliveryButton();
        DEFAULT_INSTANCE = titleDeliveryButton;
        GeneratedMessageLite.registerDefaultInstance(TitleDeliveryButton.class, titleDeliveryButton);
    }

    private TitleDeliveryButton() {
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
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static TitleDeliveryButton getDefaultInstance() {
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

    public static TitleDeliveryButton parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TitleDeliveryButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TitleDeliveryButton parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TitleDeliveryButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TitleDeliveryButton> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
        switch (C70711.f17048xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TitleDeliveryButton();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u00042", new Object[]{"icon_", "title_", "link_", "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TitleDeliveryButton> parser = PARSER;
                if (parser == null) {
                    synchronized (TitleDeliveryButton.class) {
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

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(TitleDeliveryButton titleDeliveryButton) {
        return DEFAULT_INSTANCE.createBuilder(titleDeliveryButton);
    }

    public static TitleDeliveryButton parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TitleDeliveryButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TitleDeliveryButton parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TitleDeliveryButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TitleDeliveryButton parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TitleDeliveryButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TitleDeliveryButton parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TitleDeliveryButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TitleDeliveryButton parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TitleDeliveryButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TitleDeliveryButton parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TitleDeliveryButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TitleDeliveryButton parseFrom(InputStream inputStream) throws IOException {
        return (TitleDeliveryButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TitleDeliveryButton parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TitleDeliveryButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TitleDeliveryButton parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TitleDeliveryButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TitleDeliveryButton parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TitleDeliveryButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
