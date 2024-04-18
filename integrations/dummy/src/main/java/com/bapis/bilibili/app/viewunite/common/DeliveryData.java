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
public final class DeliveryData extends GeneratedMessageLite<DeliveryData, DeliveryData.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_FIELD_NUMBER = 4;
    public static final int AGG_EPS_FIELD_NUMBER = 7;
    public static final int CHARACTERS_FIELD_NUMBER = 5;
    private static final DeliveryData DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 8;
    public static final int MODULE_STYLE_FIELD_NUMBER = 2;
    public static final int MORE_FIELD_NUMBER = 3;
    private static volatile Parser<DeliveryData> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 9;
    public static final int THEATRE_HOT_TOPIC_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Object data_;
    private int id_;
    private Style moduleStyle_;
    private int dataCase_ = 0;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String title_ = "";
    private String more_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.DeliveryData$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69911 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16978xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16978xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16978xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16978xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16978xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16978xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16978xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16978xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DeliveryData, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69911 c69911) {
            this();
        }

        public Builder clearActivity() {
            copyOnWrite();
            ((DeliveryData) this.instance).clearActivity();
            return this;
        }

        public Builder clearAggEps() {
            copyOnWrite();
            ((DeliveryData) this.instance).clearAggEps();
            return this;
        }

        public Builder clearCharacters() {
            copyOnWrite();
            ((DeliveryData) this.instance).clearCharacters();
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((DeliveryData) this.instance).clearData();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((DeliveryData) this.instance).clearId();
            return this;
        }

        public Builder clearModuleStyle() {
            copyOnWrite();
            ((DeliveryData) this.instance).clearModuleStyle();
            return this;
        }

        public Builder clearMore() {
            copyOnWrite();
            ((DeliveryData) this.instance).clearMore();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((DeliveryData) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearTheatreHotTopic() {
            copyOnWrite();
            ((DeliveryData) this.instance).clearTheatreHotTopic();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((DeliveryData) this.instance).clearTitle();
            return this;
        }

        public boolean containsReport(String str) {
            str.getClass();
            return ((DeliveryData) this.instance).getReportMap().containsKey(str);
        }

        public Activity getActivity() {
            return ((DeliveryData) this.instance).getActivity();
        }

        public AggEps getAggEps() {
            return ((DeliveryData) this.instance).getAggEps();
        }

        public Characters getCharacters() {
            return ((DeliveryData) this.instance).getCharacters();
        }

        public DataCase getDataCase() {
            return ((DeliveryData) this.instance).getDataCase();
        }

        public int getId() {
            return ((DeliveryData) this.instance).getId();
        }

        public Style getModuleStyle() {
            return ((DeliveryData) this.instance).getModuleStyle();
        }

        public String getMore() {
            return ((DeliveryData) this.instance).getMore();
        }

        public ByteString getMoreBytes() {
            return ((DeliveryData) this.instance).getMoreBytes();
        }

        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        public int getReportCount() {
            return ((DeliveryData) this.instance).getReportMap().size();
        }

        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((DeliveryData) this.instance).getReportMap());
        }

        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((DeliveryData) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((DeliveryData) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public TheatreHotTopic getTheatreHotTopic() {
            return ((DeliveryData) this.instance).getTheatreHotTopic();
        }

        public String getTitle() {
            return ((DeliveryData) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((DeliveryData) this.instance).getTitleBytes();
        }

        public boolean hasActivity() {
            return ((DeliveryData) this.instance).hasActivity();
        }

        public boolean hasAggEps() {
            return ((DeliveryData) this.instance).hasAggEps();
        }

        public boolean hasCharacters() {
            return ((DeliveryData) this.instance).hasCharacters();
        }

        public boolean hasModuleStyle() {
            return ((DeliveryData) this.instance).hasModuleStyle();
        }

        public boolean hasTheatreHotTopic() {
            return ((DeliveryData) this.instance).hasTheatreHotTopic();
        }

        public Builder mergeActivity(Activity activity) {
            copyOnWrite();
            ((DeliveryData) this.instance).mergeActivity(activity);
            return this;
        }

        public Builder mergeAggEps(AggEps aggEps) {
            copyOnWrite();
            ((DeliveryData) this.instance).mergeAggEps(aggEps);
            return this;
        }

        public Builder mergeCharacters(Characters characters) {
            copyOnWrite();
            ((DeliveryData) this.instance).mergeCharacters(characters);
            return this;
        }

        public Builder mergeModuleStyle(Style style) {
            copyOnWrite();
            ((DeliveryData) this.instance).mergeModuleStyle(style);
            return this;
        }

        public Builder mergeTheatreHotTopic(TheatreHotTopic theatreHotTopic) {
            copyOnWrite();
            ((DeliveryData) this.instance).mergeTheatreHotTopic(theatreHotTopic);
            return this;
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((DeliveryData) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((DeliveryData) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((DeliveryData) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder setActivity(Activity activity) {
            copyOnWrite();
            ((DeliveryData) this.instance).setActivity(activity);
            return this;
        }

        public Builder setAggEps(AggEps aggEps) {
            copyOnWrite();
            ((DeliveryData) this.instance).setAggEps(aggEps);
            return this;
        }

        public Builder setCharacters(Characters characters) {
            copyOnWrite();
            ((DeliveryData) this.instance).setCharacters(characters);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((DeliveryData) this.instance).setId(i);
            return this;
        }

        public Builder setModuleStyle(Style style) {
            copyOnWrite();
            ((DeliveryData) this.instance).setModuleStyle(style);
            return this;
        }

        public Builder setMore(String str) {
            copyOnWrite();
            ((DeliveryData) this.instance).setMore(str);
            return this;
        }

        public Builder setMoreBytes(ByteString byteString) {
            copyOnWrite();
            ((DeliveryData) this.instance).setMoreBytes(byteString);
            return this;
        }

        public Builder setTheatreHotTopic(TheatreHotTopic theatreHotTopic) {
            copyOnWrite();
            ((DeliveryData) this.instance).setTheatreHotTopic(theatreHotTopic);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((DeliveryData) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((DeliveryData) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(DeliveryData.DEFAULT_INSTANCE);
        }

        public Builder setActivity(Activity.Builder builder) {
            copyOnWrite();
            ((DeliveryData) this.instance).setActivity(builder.build());
            return this;
        }

        public Builder setAggEps(AggEps.Builder builder) {
            copyOnWrite();
            ((DeliveryData) this.instance).setAggEps(builder.build());
            return this;
        }

        public Builder setCharacters(Characters.Builder builder) {
            copyOnWrite();
            ((DeliveryData) this.instance).setCharacters(builder.build());
            return this;
        }

        public Builder setModuleStyle(Style.Builder builder) {
            copyOnWrite();
            ((DeliveryData) this.instance).setModuleStyle(builder.build());
            return this;
        }

        public Builder setTheatreHotTopic(TheatreHotTopic.Builder builder) {
            copyOnWrite();
            ((DeliveryData) this.instance).setTheatreHotTopic(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum DataCase {
        ACTIVITY(4),
        CHARACTERS(5),
        THEATRE_HOT_TOPIC(6),
        AGG_EPS(7),
        DATA_NOT_SET(0);
        
        private final int value;

        DataCase(int i) {
            this.value = i;
        }

        public static DataCase forNumber(int i) {
            if (i != 0) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                return null;
                            }
                            return AGG_EPS;
                        }
                        return THEATRE_HOT_TOPIC;
                    }
                    return CHARACTERS;
                }
                return ACTIVITY;
            }
            return DATA_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DataCase valueOf(int i) {
            return forNumber(i);
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
        DeliveryData deliveryData = new DeliveryData();
        DEFAULT_INSTANCE = deliveryData;
        GeneratedMessageLite.registerDefaultInstance(DeliveryData.class, deliveryData);
    }

    private DeliveryData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivity() {
        if (this.dataCase_ == 4) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAggEps() {
        if (this.dataCase_ == 7) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCharacters() {
        if (this.dataCase_ == 5) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.dataCase_ = 0;
        this.data_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModuleStyle() {
        this.moduleStyle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMore() {
        this.more_ = getDefaultInstance().getMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTheatreHotTopic() {
        if (this.dataCase_ == 6) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static DeliveryData getDefaultInstance() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivity(Activity activity) {
        activity.getClass();
        if (this.dataCase_ == 4 && this.data_ != Activity.getDefaultInstance()) {
            this.data_ = Activity.newBuilder((Activity) this.data_).mergeFrom((Activity) activity).buildPartial();
        } else {
            this.data_ = activity;
        }
        this.dataCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAggEps(AggEps aggEps) {
        aggEps.getClass();
        if (this.dataCase_ == 7 && this.data_ != AggEps.getDefaultInstance()) {
            this.data_ = AggEps.newBuilder((AggEps) this.data_).mergeFrom((AggEps) aggEps).buildPartial();
        } else {
            this.data_ = aggEps;
        }
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCharacters(Characters characters) {
        characters.getClass();
        if (this.dataCase_ == 5 && this.data_ != Characters.getDefaultInstance()) {
            this.data_ = Characters.newBuilder((Characters) this.data_).mergeFrom((Characters) characters).buildPartial();
        } else {
            this.data_ = characters;
        }
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeModuleStyle(Style style) {
        style.getClass();
        Style style2 = this.moduleStyle_;
        if (style2 != null && style2 != Style.getDefaultInstance()) {
            this.moduleStyle_ = Style.newBuilder(this.moduleStyle_).mergeFrom((Style) style).buildPartial();
        } else {
            this.moduleStyle_ = style;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTheatreHotTopic(TheatreHotTopic theatreHotTopic) {
        theatreHotTopic.getClass();
        if (this.dataCase_ == 6 && this.data_ != TheatreHotTopic.getDefaultInstance()) {
            this.data_ = TheatreHotTopic.newBuilder((TheatreHotTopic) this.data_).mergeFrom((TheatreHotTopic) theatreHotTopic).buildPartial();
        } else {
            this.data_ = theatreHotTopic;
        }
        this.dataCase_ = 6;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DeliveryData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DeliveryData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeliveryData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DeliveryData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DeliveryData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivity(Activity activity) {
        activity.getClass();
        this.data_ = activity;
        this.dataCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggEps(AggEps aggEps) {
        aggEps.getClass();
        this.data_ = aggEps;
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCharacters(Characters characters) {
        characters.getClass();
        this.data_ = characters;
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModuleStyle(Style style) {
        style.getClass();
        this.moduleStyle_ = style;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMore(String str) {
        str.getClass();
        this.more_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.more_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTheatreHotTopic(TheatreHotTopic theatreHotTopic) {
        theatreHotTopic.getClass();
        this.data_ = theatreHotTopic;
        this.dataCase_ = 6;
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
        switch (C69911.f16978xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DeliveryData();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0001\u0208\u0002\t\u0003\u0208\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0004\t2", new Object[]{"data_", "dataCase_", "title_", "moduleStyle_", "more_", Activity.class, Characters.class, TheatreHotTopic.class, AggEps.class, "id_", "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DeliveryData> parser = PARSER;
                if (parser == null) {
                    synchronized (DeliveryData.class) {
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

    public Activity getActivity() {
        if (this.dataCase_ == 4) {
            return (Activity) this.data_;
        }
        return Activity.getDefaultInstance();
    }

    public AggEps getAggEps() {
        if (this.dataCase_ == 7) {
            return (AggEps) this.data_;
        }
        return AggEps.getDefaultInstance();
    }

    public Characters getCharacters() {
        if (this.dataCase_ == 5) {
            return (Characters) this.data_;
        }
        return Characters.getDefaultInstance();
    }

    public DataCase getDataCase() {
        return DataCase.forNumber(this.dataCase_);
    }

    public int getId() {
        return this.id_;
    }

    public Style getModuleStyle() {
        Style style = this.moduleStyle_;
        return style == null ? Style.getDefaultInstance() : style;
    }

    public String getMore() {
        return this.more_;
    }

    public ByteString getMoreBytes() {
        return ByteString.copyFromUtf8(this.more_);
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

    public TheatreHotTopic getTheatreHotTopic() {
        if (this.dataCase_ == 6) {
            return (TheatreHotTopic) this.data_;
        }
        return TheatreHotTopic.getDefaultInstance();
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public boolean hasActivity() {
        return this.dataCase_ == 4;
    }

    public boolean hasAggEps() {
        return this.dataCase_ == 7;
    }

    public boolean hasCharacters() {
        return this.dataCase_ == 5;
    }

    public boolean hasModuleStyle() {
        return this.moduleStyle_ != null;
    }

    public boolean hasTheatreHotTopic() {
        return this.dataCase_ == 6;
    }

    public static Builder newBuilder(DeliveryData deliveryData) {
        return DEFAULT_INSTANCE.createBuilder(deliveryData);
    }

    public static DeliveryData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeliveryData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DeliveryData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeliveryData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DeliveryData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DeliveryData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DeliveryData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeliveryData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DeliveryData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DeliveryData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeliveryData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeliveryData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DeliveryData parseFrom(InputStream inputStream) throws IOException {
        return (DeliveryData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeliveryData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeliveryData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DeliveryData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DeliveryData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DeliveryData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeliveryData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
