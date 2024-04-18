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
public final class TheatreHotTopic extends GeneratedMessageLite<TheatreHotTopic, TheatreHotTopic.Builder> implements MessageLiteOrBuilder {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 4;
    private static final TheatreHotTopic DEFAULT_INSTANCE;
    public static final int HOTTOPICSETID_FIELD_NUMBER = 7;
    public static final int HOTTOPICTITLE_FIELD_NUMBER = 8;
    public static final int HOT_TOPIC_ID_FIELD_NUMBER = 6;
    public static final int HOT_TOPIC_URL_FIELD_NUMBER = 9;
    public static final int IS_SUBSCRIBE_FIELD_NUMBER = 10;
    private static volatile Parser<TheatreHotTopic> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 11;
    public static final int THEATRE_ID_FIELD_NUMBER = 1;
    public static final int THEATRE_SET_ID_FIELD_NUMBER = 2;
    public static final int THEATRE_TITLE_FIELD_NUMBER = 3;
    public static final int THEATRE_URL_FIELD_NUMBER = 5;
    private long hotTopicId_;
    private long hotTopicSetId_;
    private int isSubscribe_;
    private long theatreId_;
    private long theatreSetId_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String theatreTitle_ = "";
    private String backgroundImageUrl_ = "";
    private String theatreUrl_ = "";
    private String hotTopicTitle_ = "";
    private String hotTopicUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.TheatreHotTopic$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70691 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17046xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17046xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17046xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17046xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17046xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17046xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17046xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17046xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TheatreHotTopic, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70691 c70691) {
            this();
        }

        public Builder clearBackgroundImageUrl() {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).clearBackgroundImageUrl();
            return this;
        }

        public Builder clearHotTopicId() {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).clearHotTopicId();
            return this;
        }

        public Builder clearHotTopicSetId() {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).clearHotTopicSetId();
            return this;
        }

        public Builder clearHotTopicTitle() {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).clearHotTopicTitle();
            return this;
        }

        public Builder clearHotTopicUrl() {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).clearHotTopicUrl();
            return this;
        }

        public Builder clearIsSubscribe() {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).clearIsSubscribe();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearTheatreId() {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).clearTheatreId();
            return this;
        }

        public Builder clearTheatreSetId() {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).clearTheatreSetId();
            return this;
        }

        public Builder clearTheatreTitle() {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).clearTheatreTitle();
            return this;
        }

        public Builder clearTheatreUrl() {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).clearTheatreUrl();
            return this;
        }

        public boolean containsReport(String str) {
            str.getClass();
            return ((TheatreHotTopic) this.instance).getReportMap().containsKey(str);
        }

        public String getBackgroundImageUrl() {
            return ((TheatreHotTopic) this.instance).getBackgroundImageUrl();
        }

        public ByteString getBackgroundImageUrlBytes() {
            return ((TheatreHotTopic) this.instance).getBackgroundImageUrlBytes();
        }

        public long getHotTopicId() {
            return ((TheatreHotTopic) this.instance).getHotTopicId();
        }

        public long getHotTopicSetId() {
            return ((TheatreHotTopic) this.instance).getHotTopicSetId();
        }

        public String getHotTopicTitle() {
            return ((TheatreHotTopic) this.instance).getHotTopicTitle();
        }

        public ByteString getHotTopicTitleBytes() {
            return ((TheatreHotTopic) this.instance).getHotTopicTitleBytes();
        }

        public String getHotTopicUrl() {
            return ((TheatreHotTopic) this.instance).getHotTopicUrl();
        }

        public ByteString getHotTopicUrlBytes() {
            return ((TheatreHotTopic) this.instance).getHotTopicUrlBytes();
        }

        public int getIsSubscribe() {
            return ((TheatreHotTopic) this.instance).getIsSubscribe();
        }

        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        public int getReportCount() {
            return ((TheatreHotTopic) this.instance).getReportMap().size();
        }

        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((TheatreHotTopic) this.instance).getReportMap());
        }

        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((TheatreHotTopic) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((TheatreHotTopic) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public long getTheatreId() {
            return ((TheatreHotTopic) this.instance).getTheatreId();
        }

        public long getTheatreSetId() {
            return ((TheatreHotTopic) this.instance).getTheatreSetId();
        }

        public String getTheatreTitle() {
            return ((TheatreHotTopic) this.instance).getTheatreTitle();
        }

        public ByteString getTheatreTitleBytes() {
            return ((TheatreHotTopic) this.instance).getTheatreTitleBytes();
        }

        public String getTheatreUrl() {
            return ((TheatreHotTopic) this.instance).getTheatreUrl();
        }

        public ByteString getTheatreUrlBytes() {
            return ((TheatreHotTopic) this.instance).getTheatreUrlBytes();
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((TheatreHotTopic) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((TheatreHotTopic) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder setBackgroundImageUrl(String str) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setBackgroundImageUrl(str);
            return this;
        }

        public Builder setBackgroundImageUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setBackgroundImageUrlBytes(byteString);
            return this;
        }

        public Builder setHotTopicId(long j) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setHotTopicId(j);
            return this;
        }

        public Builder setHotTopicSetId(long j) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setHotTopicSetId(j);
            return this;
        }

        public Builder setHotTopicTitle(String str) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setHotTopicTitle(str);
            return this;
        }

        public Builder setHotTopicTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setHotTopicTitleBytes(byteString);
            return this;
        }

        public Builder setHotTopicUrl(String str) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setHotTopicUrl(str);
            return this;
        }

        public Builder setHotTopicUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setHotTopicUrlBytes(byteString);
            return this;
        }

        public Builder setIsSubscribe(int i) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setIsSubscribe(i);
            return this;
        }

        public Builder setTheatreId(long j) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setTheatreId(j);
            return this;
        }

        public Builder setTheatreSetId(long j) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setTheatreSetId(j);
            return this;
        }

        public Builder setTheatreTitle(String str) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setTheatreTitle(str);
            return this;
        }

        public Builder setTheatreTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setTheatreTitleBytes(byteString);
            return this;
        }

        public Builder setTheatreUrl(String str) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setTheatreUrl(str);
            return this;
        }

        public Builder setTheatreUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((TheatreHotTopic) this.instance).setTheatreUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(TheatreHotTopic.DEFAULT_INSTANCE);
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
        TheatreHotTopic theatreHotTopic = new TheatreHotTopic();
        DEFAULT_INSTANCE = theatreHotTopic;
        GeneratedMessageLite.registerDefaultInstance(TheatreHotTopic.class, theatreHotTopic);
    }

    private TheatreHotTopic() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundImageUrl() {
        this.backgroundImageUrl_ = getDefaultInstance().getBackgroundImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHotTopicId() {
        this.hotTopicId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHotTopicSetId() {
        this.hotTopicSetId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHotTopicTitle() {
        this.hotTopicTitle_ = getDefaultInstance().getHotTopicTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHotTopicUrl() {
        this.hotTopicUrl_ = getDefaultInstance().getHotTopicUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSubscribe() {
        this.isSubscribe_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTheatreId() {
        this.theatreId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTheatreSetId() {
        this.theatreSetId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTheatreTitle() {
        this.theatreTitle_ = getDefaultInstance().getTheatreTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTheatreUrl() {
        this.theatreUrl_ = getDefaultInstance().getTheatreUrl();
    }

    public static TheatreHotTopic getDefaultInstance() {
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

    public static TheatreHotTopic parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TheatreHotTopic) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TheatreHotTopic parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TheatreHotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TheatreHotTopic> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundImageUrl(String str) {
        str.getClass();
        this.backgroundImageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundImageUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.backgroundImageUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHotTopicId(long j) {
        this.hotTopicId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHotTopicSetId(long j) {
        this.hotTopicSetId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHotTopicTitle(String str) {
        str.getClass();
        this.hotTopicTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHotTopicTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.hotTopicTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHotTopicUrl(String str) {
        str.getClass();
        this.hotTopicUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHotTopicUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.hotTopicUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSubscribe(int i) {
        this.isSubscribe_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTheatreId(long j) {
        this.theatreId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTheatreSetId(long j) {
        this.theatreSetId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTheatreTitle(String str) {
        str.getClass();
        this.theatreTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTheatreTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.theatreTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTheatreUrl(String str) {
        str.getClass();
        this.theatreUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTheatreUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.theatreUrl_ = byteString.toStringUtf8();
    }

    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70691.f17046xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TheatreHotTopic();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0002\u0007\u0002\b\u0208\t\u0208\n\u0004\u000b2", new Object[]{"theatreId_", "theatreSetId_", "theatreTitle_", "backgroundImageUrl_", "theatreUrl_", "hotTopicId_", "hotTopicSetId_", "hotTopicTitle_", "hotTopicUrl_", "isSubscribe_", "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TheatreHotTopic> parser = PARSER;
                if (parser == null) {
                    synchronized (TheatreHotTopic.class) {
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

    public String getBackgroundImageUrl() {
        return this.backgroundImageUrl_;
    }

    public ByteString getBackgroundImageUrlBytes() {
        return ByteString.copyFromUtf8(this.backgroundImageUrl_);
    }

    public long getHotTopicId() {
        return this.hotTopicId_;
    }

    public long getHotTopicSetId() {
        return this.hotTopicSetId_;
    }

    public String getHotTopicTitle() {
        return this.hotTopicTitle_;
    }

    public ByteString getHotTopicTitleBytes() {
        return ByteString.copyFromUtf8(this.hotTopicTitle_);
    }

    public String getHotTopicUrl() {
        return this.hotTopicUrl_;
    }

    public ByteString getHotTopicUrlBytes() {
        return ByteString.copyFromUtf8(this.hotTopicUrl_);
    }

    public int getIsSubscribe() {
        return this.isSubscribe_;
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

    public long getTheatreId() {
        return this.theatreId_;
    }

    public long getTheatreSetId() {
        return this.theatreSetId_;
    }

    public String getTheatreTitle() {
        return this.theatreTitle_;
    }

    public ByteString getTheatreTitleBytes() {
        return ByteString.copyFromUtf8(this.theatreTitle_);
    }

    public String getTheatreUrl() {
        return this.theatreUrl_;
    }

    public ByteString getTheatreUrlBytes() {
        return ByteString.copyFromUtf8(this.theatreUrl_);
    }

    public static Builder newBuilder(TheatreHotTopic theatreHotTopic) {
        return DEFAULT_INSTANCE.createBuilder(theatreHotTopic);
    }

    public static TheatreHotTopic parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TheatreHotTopic) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TheatreHotTopic parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TheatreHotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TheatreHotTopic parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TheatreHotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TheatreHotTopic parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TheatreHotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TheatreHotTopic parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TheatreHotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TheatreHotTopic parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TheatreHotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TheatreHotTopic parseFrom(InputStream inputStream) throws IOException {
        return (TheatreHotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TheatreHotTopic parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TheatreHotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TheatreHotTopic parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TheatreHotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TheatreHotTopic parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TheatreHotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
