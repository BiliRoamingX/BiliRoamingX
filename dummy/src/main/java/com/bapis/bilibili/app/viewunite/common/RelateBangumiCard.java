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
public final class RelateBangumiCard extends GeneratedMessageLite<RelateBangumiCard, RelateBangumiCard.Builder> implements MessageLiteOrBuilder {
    public static final int BADGE_INFO_FIELD_NUMBER = 7;
    private static final RelateBangumiCard DEFAULT_INSTANCE;
    public static final int GOTO_TYPE_FIELD_NUMBER = 8;
    public static final int NEW_EP_FIELD_NUMBER = 3;
    private static volatile Parser<RelateBangumiCard> PARSER = null;
    public static final int RATING_FIELD_NUMBER = 5;
    public static final int RCMD_REASON_FIELD_NUMBER = 6;
    public static final int REPORT_FIELD_NUMBER = 9;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    public static final int SEASON_TYPE_FIELD_NUMBER = 2;
    public static final int STAT_FIELD_NUMBER = 4;
    private BadgeInfo badgeInfo_;
    private NewEp newEp_;
    private Rating rating_;
    private int seasonId_;
    private int seasonType_;
    private Stat stat_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String rcmdReason_ = "";
    private String gotoType_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelateBangumiCard$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70361 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17017xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17017xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17017xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17017xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17017xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17017xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17017xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17017xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateBangumiCard, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70361 c70361) {
            this();
        }

        public Builder clearBadgeInfo() {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).clearBadgeInfo();
            return this;
        }

        public Builder clearGotoType() {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).clearGotoType();
            return this;
        }

        public Builder clearNewEp() {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).clearNewEp();
            return this;
        }

        public Builder clearRating() {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).clearRating();
            return this;
        }

        public Builder clearRcmdReason() {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).clearRcmdReason();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearSeasonType() {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).clearSeasonType();
            return this;
        }

        public Builder clearStat() {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).clearStat();
            return this;
        }

        public boolean containsReport(String str) {
            str.getClass();
            return ((RelateBangumiCard) this.instance).getReportMap().containsKey(str);
        }

        public BadgeInfo getBadgeInfo() {
            return ((RelateBangumiCard) this.instance).getBadgeInfo();
        }

        public String getGotoType() {
            return ((RelateBangumiCard) this.instance).getGotoType();
        }

        public ByteString getGotoTypeBytes() {
            return ((RelateBangumiCard) this.instance).getGotoTypeBytes();
        }

        public NewEp getNewEp() {
            return ((RelateBangumiCard) this.instance).getNewEp();
        }

        public Rating getRating() {
            return ((RelateBangumiCard) this.instance).getRating();
        }

        public String getRcmdReason() {
            return ((RelateBangumiCard) this.instance).getRcmdReason();
        }

        public ByteString getRcmdReasonBytes() {
            return ((RelateBangumiCard) this.instance).getRcmdReasonBytes();
        }

        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        public int getReportCount() {
            return ((RelateBangumiCard) this.instance).getReportMap().size();
        }

        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((RelateBangumiCard) this.instance).getReportMap());
        }

        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((RelateBangumiCard) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((RelateBangumiCard) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public int getSeasonId() {
            return ((RelateBangumiCard) this.instance).getSeasonId();
        }

        public int getSeasonType() {
            return ((RelateBangumiCard) this.instance).getSeasonType();
        }

        public Stat getStat() {
            return ((RelateBangumiCard) this.instance).getStat();
        }

        public boolean hasBadgeInfo() {
            return ((RelateBangumiCard) this.instance).hasBadgeInfo();
        }

        public boolean hasNewEp() {
            return ((RelateBangumiCard) this.instance).hasNewEp();
        }

        public boolean hasRating() {
            return ((RelateBangumiCard) this.instance).hasRating();
        }

        public boolean hasStat() {
            return ((RelateBangumiCard) this.instance).hasStat();
        }

        public Builder mergeBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).mergeBadgeInfo(badgeInfo);
            return this;
        }

        public Builder mergeNewEp(NewEp newEp) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).mergeNewEp(newEp);
            return this;
        }

        public Builder mergeRating(Rating rating) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).mergeRating(rating);
            return this;
        }

        public Builder mergeStat(Stat stat) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).mergeStat(stat);
            return this;
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((RelateBangumiCard) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((RelateBangumiCard) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder setBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setBadgeInfo(badgeInfo);
            return this;
        }

        public Builder setGotoType(String str) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setGotoType(str);
            return this;
        }

        public Builder setGotoTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setGotoTypeBytes(byteString);
            return this;
        }

        public Builder setNewEp(NewEp newEp) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setNewEp(newEp);
            return this;
        }

        public Builder setRating(Rating rating) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setRating(rating);
            return this;
        }

        public Builder setRcmdReason(String str) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setRcmdReason(str);
            return this;
        }

        public Builder setRcmdReasonBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setRcmdReasonBytes(byteString);
            return this;
        }

        public Builder setSeasonId(int i) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setSeasonId(i);
            return this;
        }

        public Builder setSeasonType(int i) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setSeasonType(i);
            return this;
        }

        public Builder setStat(Stat stat) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setStat(stat);
            return this;
        }

        private Builder() {
            super(RelateBangumiCard.DEFAULT_INSTANCE);
        }

        public Builder setBadgeInfo(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setBadgeInfo(builder.build());
            return this;
        }

        public Builder setNewEp(NewEp.Builder builder) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setNewEp(builder.build());
            return this;
        }

        public Builder setRating(Rating.Builder builder) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setRating(builder.build());
            return this;
        }

        public Builder setStat(Stat.Builder builder) {
            copyOnWrite();
            ((RelateBangumiCard) this.instance).setStat(builder.build());
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
        RelateBangumiCard relateBangumiCard = new RelateBangumiCard();
        DEFAULT_INSTANCE = relateBangumiCard;
        GeneratedMessageLite.registerDefaultInstance(RelateBangumiCard.class, relateBangumiCard);
    }

    private RelateBangumiCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeInfo() {
        this.badgeInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGotoType() {
        this.gotoType_ = getDefaultInstance().getGotoType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewEp() {
        this.newEp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRating() {
        this.rating_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRcmdReason() {
        this.rcmdReason_ = getDefaultInstance().getRcmdReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonType() {
        this.seasonType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.stat_ = null;
    }

    public static RelateBangumiCard getDefaultInstance() {
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
    public void mergeBadgeInfo(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        BadgeInfo badgeInfo2 = this.badgeInfo_;
        if (badgeInfo2 != null && badgeInfo2 != BadgeInfo.getDefaultInstance()) {
            this.badgeInfo_ = BadgeInfo.newBuilder(this.badgeInfo_).mergeFrom((BadgeInfo) badgeInfo).buildPartial();
        } else {
            this.badgeInfo_ = badgeInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNewEp(NewEp newEp) {
        newEp.getClass();
        NewEp newEp2 = this.newEp_;
        if (newEp2 != null && newEp2 != NewEp.getDefaultInstance()) {
            this.newEp_ = NewEp.newBuilder(this.newEp_).mergeFrom((NewEp) newEp).buildPartial();
        } else {
            this.newEp_ = newEp;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRating(Rating rating) {
        rating.getClass();
        Rating rating2 = this.rating_;
        if (rating2 != null && rating2 != Rating.getDefaultInstance()) {
            this.rating_ = Rating.newBuilder(this.rating_).mergeFrom((Rating) rating).buildPartial();
        } else {
            this.rating_ = rating;
        }
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

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelateBangumiCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateBangumiCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateBangumiCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateBangumiCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeInfo(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.badgeInfo_ = badgeInfo;
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
    public void setNewEp(NewEp newEp) {
        newEp.getClass();
        this.newEp_ = newEp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRating(Rating rating) {
        rating.getClass();
        this.rating_ = rating;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRcmdReason(String str) {
        str.getClass();
        this.rcmdReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRcmdReasonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rcmdReason_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(int i) {
        this.seasonId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonType(int i) {
        this.seasonType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStat(Stat stat) {
        stat.getClass();
        this.stat_ = stat;
    }

    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70361.f17017xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateBangumiCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0001\u0000\u0000\u0001\u0004\u0002\u0004\u0003\t\u0004\t\u0005\t\u0006\u0208\u0007\t\b\u0208\t2", new Object[]{"seasonId_", "seasonType_", "newEp_", "stat_", "rating_", "rcmdReason_", "badgeInfo_", "gotoType_", "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateBangumiCard> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateBangumiCard.class) {
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

    public BadgeInfo getBadgeInfo() {
        BadgeInfo badgeInfo = this.badgeInfo_;
        return badgeInfo == null ? BadgeInfo.getDefaultInstance() : badgeInfo;
    }

    public String getGotoType() {
        return this.gotoType_;
    }

    public ByteString getGotoTypeBytes() {
        return ByteString.copyFromUtf8(this.gotoType_);
    }

    public NewEp getNewEp() {
        NewEp newEp = this.newEp_;
        return newEp == null ? NewEp.getDefaultInstance() : newEp;
    }

    public Rating getRating() {
        Rating rating = this.rating_;
        return rating == null ? Rating.getDefaultInstance() : rating;
    }

    public String getRcmdReason() {
        return this.rcmdReason_;
    }

    public ByteString getRcmdReasonBytes() {
        return ByteString.copyFromUtf8(this.rcmdReason_);
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

    public int getSeasonId() {
        return this.seasonId_;
    }

    public int getSeasonType() {
        return this.seasonType_;
    }

    public Stat getStat() {
        Stat stat = this.stat_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    public boolean hasBadgeInfo() {
        return this.badgeInfo_ != null;
    }

    public boolean hasNewEp() {
        return this.newEp_ != null;
    }

    public boolean hasRating() {
        return this.rating_ != null;
    }

    public boolean hasStat() {
        return this.stat_ != null;
    }

    public static Builder newBuilder(RelateBangumiCard relateBangumiCard) {
        return DEFAULT_INSTANCE.createBuilder(relateBangumiCard);
    }

    public static RelateBangumiCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateBangumiCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateBangumiCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateBangumiCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateBangumiCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateBangumiCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateBangumiCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateBangumiCard parseFrom(InputStream inputStream) throws IOException {
        return (RelateBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateBangumiCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateBangumiCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateBangumiCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateBangumiCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
