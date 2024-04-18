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
public final class RelatedAICard extends GeneratedMessageLite<RelatedAICard, RelatedAICard.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    private static final RelatedAICard DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int GOTO_TYPE_FIELD_NUMBER = 6;
    private static volatile Parser<RelatedAICard> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 5;
    public static final int STAT_FIELD_NUMBER = 4;
    public static final int UP_INFO_FIELD_NUMBER = 3;
    private long aid_;
    private long duration_;
    private Stat stat_;
    private Staff upInfo_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String gotoType_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelatedAICard$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70491 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17029xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17029xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17029xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17029xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17029xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17029xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17029xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17029xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelatedAICard, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70491 c70491) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((RelatedAICard) this.instance).clearAid();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((RelatedAICard) this.instance).clearDuration();
            return this;
        }

        public Builder clearGotoType() {
            copyOnWrite();
            ((RelatedAICard) this.instance).clearGotoType();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((RelatedAICard) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearStat() {
            copyOnWrite();
            ((RelatedAICard) this.instance).clearStat();
            return this;
        }

        public Builder clearUpInfo() {
            copyOnWrite();
            ((RelatedAICard) this.instance).clearUpInfo();
            return this;
        }

        public boolean containsReport(String str) {
            str.getClass();
            return ((RelatedAICard) this.instance).getReportMap().containsKey(str);
        }

        public long getAid() {
            return ((RelatedAICard) this.instance).getAid();
        }

        public long getDuration() {
            return ((RelatedAICard) this.instance).getDuration();
        }

        public String getGotoType() {
            return ((RelatedAICard) this.instance).getGotoType();
        }

        public ByteString getGotoTypeBytes() {
            return ((RelatedAICard) this.instance).getGotoTypeBytes();
        }

        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        public int getReportCount() {
            return ((RelatedAICard) this.instance).getReportMap().size();
        }

        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((RelatedAICard) this.instance).getReportMap());
        }

        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((RelatedAICard) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((RelatedAICard) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Stat getStat() {
            return ((RelatedAICard) this.instance).getStat();
        }

        public Staff getUpInfo() {
            return ((RelatedAICard) this.instance).getUpInfo();
        }

        public boolean hasStat() {
            return ((RelatedAICard) this.instance).hasStat();
        }

        public boolean hasUpInfo() {
            return ((RelatedAICard) this.instance).hasUpInfo();
        }

        public Builder mergeStat(Stat stat) {
            copyOnWrite();
            ((RelatedAICard) this.instance).mergeStat(stat);
            return this;
        }

        public Builder mergeUpInfo(Staff staff) {
            copyOnWrite();
            ((RelatedAICard) this.instance).mergeUpInfo(staff);
            return this;
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((RelatedAICard) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((RelatedAICard) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((RelatedAICard) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((RelatedAICard) this.instance).setAid(j);
            return this;
        }

        public Builder setDuration(long j) {
            copyOnWrite();
            ((RelatedAICard) this.instance).setDuration(j);
            return this;
        }

        public Builder setGotoType(String str) {
            copyOnWrite();
            ((RelatedAICard) this.instance).setGotoType(str);
            return this;
        }

        public Builder setGotoTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((RelatedAICard) this.instance).setGotoTypeBytes(byteString);
            return this;
        }

        public Builder setStat(Stat stat) {
            copyOnWrite();
            ((RelatedAICard) this.instance).setStat(stat);
            return this;
        }

        public Builder setUpInfo(Staff staff) {
            copyOnWrite();
            ((RelatedAICard) this.instance).setUpInfo(staff);
            return this;
        }

        private Builder() {
            super(RelatedAICard.DEFAULT_INSTANCE);
        }

        public Builder setStat(Stat.Builder builder) {
            copyOnWrite();
            ((RelatedAICard) this.instance).setStat(builder.build());
            return this;
        }

        public Builder setUpInfo(Staff.Builder builder) {
            copyOnWrite();
            ((RelatedAICard) this.instance).setUpInfo(builder.build());
            return this;
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
        RelatedAICard relatedAICard = new RelatedAICard();
        DEFAULT_INSTANCE = relatedAICard;
        GeneratedMessageLite.registerDefaultInstance(RelatedAICard.class, relatedAICard);
    }

    private RelatedAICard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGotoType() {
        this.gotoType_ = getDefaultInstance().getGotoType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.stat_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpInfo() {
        this.upInfo_ = null;
    }

    public static RelatedAICard getDefaultInstance() {
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
    public void mergeStat(Stat stat) {
        stat.getClass();
        Stat stat2 = this.stat_;
        if (stat2 != null && stat2 != Stat.getDefaultInstance()) {
            this.stat_ = Stat.newBuilder(this.stat_).mergeFrom((Stat) stat).buildPartial();
        } else {
            this.stat_ = stat;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpInfo(Staff staff) {
        staff.getClass();
        Staff staff2 = this.upInfo_;
        if (staff2 != null && staff2 != Staff.getDefaultInstance()) {
            this.upInfo_ = Staff.newBuilder(this.upInfo_).mergeFrom((Staff) staff).buildPartial();
        } else {
            this.upInfo_ = staff;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelatedAICard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelatedAICard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelatedAICard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelatedAICard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelatedAICard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j) {
        this.duration_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGotoType(String str) {
        str.getClass();
        this.gotoType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGotoTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.gotoType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStat(Stat stat) {
        stat.getClass();
        this.stat_ = stat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpInfo(Staff staff) {
        staff.getClass();
        this.upInfo_ = staff;
    }

    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70491.f17029xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelatedAICard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u0003\t\u0004\t\u00052\u0006\u0208", new Object[]{"aid_", "duration_", "upInfo_", "stat_", "report_", ReportDefaultEntryHolder.defaultEntry, "gotoType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelatedAICard> parser = PARSER;
                if (parser == null) {
                    synchronized (RelatedAICard.class) {
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

    public long getAid() {
        return this.aid_;
    }

    public long getDuration() {
        return this.duration_;
    }

    public String getGotoType() {
        return this.gotoType_;
    }

    public ByteString getGotoTypeBytes() {
        return ByteString.copyFromUtf8(this.gotoType_);
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

    public Stat getStat() {
        Stat stat = this.stat_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    public Staff getUpInfo() {
        Staff staff = this.upInfo_;
        return staff == null ? Staff.getDefaultInstance() : staff;
    }

    public boolean hasStat() {
        return this.stat_ != null;
    }

    public boolean hasUpInfo() {
        return this.upInfo_ != null;
    }

    public static Builder newBuilder(RelatedAICard relatedAICard) {
        return DEFAULT_INSTANCE.createBuilder(relatedAICard);
    }

    public static RelatedAICard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelatedAICard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelatedAICard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelatedAICard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelatedAICard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelatedAICard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelatedAICard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelatedAICard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelatedAICard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelatedAICard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelatedAICard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelatedAICard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelatedAICard parseFrom(InputStream inputStream) throws IOException {
        return (RelatedAICard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelatedAICard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelatedAICard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelatedAICard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelatedAICard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelatedAICard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelatedAICard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
