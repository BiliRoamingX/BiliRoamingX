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
public final class ActivityTab extends GeneratedMessageLite<ActivityTab, ActivityTab.Builder> implements MessageLiteOrBuilder {
    public static final int ACT_EXT_FIELD_NUMBER = 12;
    public static final int BIZ_KEY_FIELD_NUMBER = 10;
    private static final ActivityTab DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 11;
    public static final int H5_LINK_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LINK_FIELD_NUMBER = 8;
    public static final int LINK_TYPE_FIELD_NUMBER = 9;
    private static volatile Parser<ActivityTab> PARSER = null;
    public static final int PICURL_FIELD_NUMBER = 5;
    public static final int PICURL_SELECTED_FIELD_NUMBER = 6;
    public static final int REPORT_FIELD_NUMBER = 13;
    public static final int SHOW_NAME_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 3;
    private long bizKey_;
    private int id_;
    private int linkType_;
    private int type_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String title_ = "";
    private String showName_ = "";
    private String picurl_ = "";
    private String picurlSelected_ = "";
    private String h5Link_ = "";
    private String link_ = "";
    private String desc_ = "";
    private String actExt_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.ActivityTab$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69711 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16959xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16959xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16959xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16959xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16959xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16959xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16959xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16959xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ActivityTab, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69711 c69711) {
            this();
        }

        public Builder clearActExt() {
            copyOnWrite();
            ((ActivityTab) this.instance).clearActExt();
            return this;
        }

        public Builder clearBizKey() {
            copyOnWrite();
            ((ActivityTab) this.instance).clearBizKey();
            return this;
        }

        public Builder clearDesc() {
            copyOnWrite();
            ((ActivityTab) this.instance).clearDesc();
            return this;
        }

        public Builder clearH5Link() {
            copyOnWrite();
            ((ActivityTab) this.instance).clearH5Link();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((ActivityTab) this.instance).clearId();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((ActivityTab) this.instance).clearLink();
            return this;
        }

        public Builder clearLinkType() {
            copyOnWrite();
            ((ActivityTab) this.instance).clearLinkType();
            return this;
        }

        public Builder clearPicurl() {
            copyOnWrite();
            ((ActivityTab) this.instance).clearPicurl();
            return this;
        }

        public Builder clearPicurlSelected() {
            copyOnWrite();
            ((ActivityTab) this.instance).clearPicurlSelected();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((ActivityTab) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearShowName() {
            copyOnWrite();
            ((ActivityTab) this.instance).clearShowName();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((ActivityTab) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((ActivityTab) this.instance).clearType();
            return this;
        }

        public boolean containsReport(String str) {
            str.getClass();
            return ((ActivityTab) this.instance).getReportMap().containsKey(str);
        }

        public String getActExt() {
            return ((ActivityTab) this.instance).getActExt();
        }

        public ByteString getActExtBytes() {
            return ((ActivityTab) this.instance).getActExtBytes();
        }

        public long getBizKey() {
            return ((ActivityTab) this.instance).getBizKey();
        }

        public String getDesc() {
            return ((ActivityTab) this.instance).getDesc();
        }

        public ByteString getDescBytes() {
            return ((ActivityTab) this.instance).getDescBytes();
        }

        public String getH5Link() {
            return ((ActivityTab) this.instance).getH5Link();
        }

        public ByteString getH5LinkBytes() {
            return ((ActivityTab) this.instance).getH5LinkBytes();
        }

        public int getId() {
            return ((ActivityTab) this.instance).getId();
        }

        public String getLink() {
            return ((ActivityTab) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((ActivityTab) this.instance).getLinkBytes();
        }

        public int getLinkType() {
            return ((ActivityTab) this.instance).getLinkType();
        }

        public String getPicurl() {
            return ((ActivityTab) this.instance).getPicurl();
        }

        public ByteString getPicurlBytes() {
            return ((ActivityTab) this.instance).getPicurlBytes();
        }

        public String getPicurlSelected() {
            return ((ActivityTab) this.instance).getPicurlSelected();
        }

        public ByteString getPicurlSelectedBytes() {
            return ((ActivityTab) this.instance).getPicurlSelectedBytes();
        }

        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        public int getReportCount() {
            return ((ActivityTab) this.instance).getReportMap().size();
        }

        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((ActivityTab) this.instance).getReportMap());
        }

        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((ActivityTab) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((ActivityTab) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getShowName() {
            return ((ActivityTab) this.instance).getShowName();
        }

        public ByteString getShowNameBytes() {
            return ((ActivityTab) this.instance).getShowNameBytes();
        }

        public String getTitle() {
            return ((ActivityTab) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((ActivityTab) this.instance).getTitleBytes();
        }

        public int getType() {
            return ((ActivityTab) this.instance).getType();
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((ActivityTab) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((ActivityTab) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((ActivityTab) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder setActExt(String str) {
            copyOnWrite();
            ((ActivityTab) this.instance).setActExt(str);
            return this;
        }

        public Builder setActExtBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityTab) this.instance).setActExtBytes(byteString);
            return this;
        }

        public Builder setBizKey(long j) {
            copyOnWrite();
            ((ActivityTab) this.instance).setBizKey(j);
            return this;
        }

        public Builder setDesc(String str) {
            copyOnWrite();
            ((ActivityTab) this.instance).setDesc(str);
            return this;
        }

        public Builder setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityTab) this.instance).setDescBytes(byteString);
            return this;
        }

        public Builder setH5Link(String str) {
            copyOnWrite();
            ((ActivityTab) this.instance).setH5Link(str);
            return this;
        }

        public Builder setH5LinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityTab) this.instance).setH5LinkBytes(byteString);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((ActivityTab) this.instance).setId(i);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((ActivityTab) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityTab) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setLinkType(int i) {
            copyOnWrite();
            ((ActivityTab) this.instance).setLinkType(i);
            return this;
        }

        public Builder setPicurl(String str) {
            copyOnWrite();
            ((ActivityTab) this.instance).setPicurl(str);
            return this;
        }

        public Builder setPicurlBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityTab) this.instance).setPicurlBytes(byteString);
            return this;
        }

        public Builder setPicurlSelected(String str) {
            copyOnWrite();
            ((ActivityTab) this.instance).setPicurlSelected(str);
            return this;
        }

        public Builder setPicurlSelectedBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityTab) this.instance).setPicurlSelectedBytes(byteString);
            return this;
        }

        public Builder setShowName(String str) {
            copyOnWrite();
            ((ActivityTab) this.instance).setShowName(str);
            return this;
        }

        public Builder setShowNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityTab) this.instance).setShowNameBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((ActivityTab) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityTab) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((ActivityTab) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(ActivityTab.DEFAULT_INSTANCE);
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
        ActivityTab activityTab = new ActivityTab();
        DEFAULT_INSTANCE = activityTab;
        GeneratedMessageLite.registerDefaultInstance(ActivityTab.class, activityTab);
    }

    private ActivityTab() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActExt() {
        this.actExt_ = getDefaultInstance().getActExt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizKey() {
        this.bizKey_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearH5Link() {
        this.h5Link_ = getDefaultInstance().getH5Link();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkType() {
        this.linkType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPicurl() {
        this.picurl_ = getDefaultInstance().getPicurl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPicurlSelected() {
        this.picurlSelected_ = getDefaultInstance().getPicurlSelected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowName() {
        this.showName_ = getDefaultInstance().getShowName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static ActivityTab getDefaultInstance() {
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

    public static ActivityTab parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ActivityTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityTab parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ActivityTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ActivityTab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActExt(String str) {
        str.getClass();
        this.actExt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActExtBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.actExt_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizKey(long j) {
        this.bizKey_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setH5Link(String str) {
        str.getClass();
        this.h5Link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setH5LinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.h5Link_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
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
    public void setLinkType(int i) {
        this.linkType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicurl(String str) {
        str.getClass();
        this.picurl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicurlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.picurl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicurlSelected(String str) {
        str.getClass();
        this.picurlSelected_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicurlSelectedBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.picurlSelected_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowName(String str) {
        str.getClass();
        this.showName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.showName_ = byteString.toStringUtf8();
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

    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69711.f16959xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ActivityTab();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0001\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0004\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0004\n\u0002\u000b\u0208\f\u0208\r2", new Object[]{"id_", "title_", "type_", "showName_", "picurl_", "picurlSelected_", "h5Link_", "link_", "linkType_", "bizKey_", "desc_", "actExt_", "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ActivityTab> parser = PARSER;
                if (parser == null) {
                    synchronized (ActivityTab.class) {
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

    public String getActExt() {
        return this.actExt_;
    }

    public ByteString getActExtBytes() {
        return ByteString.copyFromUtf8(this.actExt_);
    }

    public long getBizKey() {
        return this.bizKey_;
    }

    public String getDesc() {
        return this.desc_;
    }

    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    public String getH5Link() {
        return this.h5Link_;
    }

    public ByteString getH5LinkBytes() {
        return ByteString.copyFromUtf8(this.h5Link_);
    }

    public int getId() {
        return this.id_;
    }

    public String getLink() {
        return this.link_;
    }

    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    public int getLinkType() {
        return this.linkType_;
    }

    public String getPicurl() {
        return this.picurl_;
    }

    public ByteString getPicurlBytes() {
        return ByteString.copyFromUtf8(this.picurl_);
    }

    public String getPicurlSelected() {
        return this.picurlSelected_;
    }

    public ByteString getPicurlSelectedBytes() {
        return ByteString.copyFromUtf8(this.picurlSelected_);
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

    public String getShowName() {
        return this.showName_;
    }

    public ByteString getShowNameBytes() {
        return ByteString.copyFromUtf8(this.showName_);
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

    public static Builder newBuilder(ActivityTab activityTab) {
        return DEFAULT_INSTANCE.createBuilder(activityTab);
    }

    public static ActivityTab parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivityTab parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ActivityTab parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ActivityTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ActivityTab parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ActivityTab parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ActivityTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ActivityTab parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ActivityTab parseFrom(InputStream inputStream) throws IOException {
        return (ActivityTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityTab parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivityTab parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ActivityTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ActivityTab parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
