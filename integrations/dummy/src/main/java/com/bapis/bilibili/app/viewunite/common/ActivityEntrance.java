package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class ActivityEntrance extends GeneratedMessageLite<ActivityEntrance, ActivityEntrance.Builder> implements ActivityEntranceOrBuilder {
    public static final int ACTIVITY_COVER_FIELD_NUMBER = 1;
    public static final int ACTIVITY_LINK_FIELD_NUMBER = 5;
    public static final int ACTIVITY_SUBTITLE_FIELD_NUMBER = 4;
    public static final int ACTIVITY_TITLE_FIELD_NUMBER = 2;
    public static final int ACTIVITY_TYPE_FIELD_NUMBER = 6;
    private static final ActivityEntrance DEFAULT_INSTANCE;
    private static volatile Parser<ActivityEntrance> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 10;
    public static final int RESERVE_ID_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 8;
    public static final int UPPER_LIST_FIELD_NUMBER = 9;
    public static final int WORD_TAG_FIELD_NUMBER = 3;
    private int activityType_;
    private int reserveId_;
    private int status_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String activityCover_ = "";
    private String activityTitle_ = "";
    private String wordTag_ = "";
    private String activitySubtitle_ = "";
    private String activityLink_ = "";
    private Internal.ProtobufList<User> upperList_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.ActivityEntrance$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69671 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16955xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16955xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16955xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16955xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16955xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16955xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16955xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16955xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ActivityEntrance, Builder> implements ActivityEntranceOrBuilder {
        /* synthetic */ Builder(C69671 c69671) {
            this();
        }

        public Builder addAllUpperList(Iterable<? extends User> iterable) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).addAllUpperList(iterable);
            return this;
        }

        public Builder addUpperList(User user) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).addUpperList(user);
            return this;
        }

        public Builder clearActivityCover() {
            copyOnWrite();
            ((ActivityEntrance) this.instance).clearActivityCover();
            return this;
        }

        public Builder clearActivityLink() {
            copyOnWrite();
            ((ActivityEntrance) this.instance).clearActivityLink();
            return this;
        }

        public Builder clearActivitySubtitle() {
            copyOnWrite();
            ((ActivityEntrance) this.instance).clearActivitySubtitle();
            return this;
        }

        public Builder clearActivityTitle() {
            copyOnWrite();
            ((ActivityEntrance) this.instance).clearActivityTitle();
            return this;
        }

        public Builder clearActivityType() {
            copyOnWrite();
            ((ActivityEntrance) this.instance).clearActivityType();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((ActivityEntrance) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearReserveId() {
            copyOnWrite();
            ((ActivityEntrance) this.instance).clearReserveId();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((ActivityEntrance) this.instance).clearStatus();
            return this;
        }

        public Builder clearUpperList() {
            copyOnWrite();
            ((ActivityEntrance) this.instance).clearUpperList();
            return this;
        }

        public Builder clearWordTag() {
            copyOnWrite();
            ((ActivityEntrance) this.instance).clearWordTag();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public boolean containsReport(String str) {
            str.getClass();
            return ((ActivityEntrance) this.instance).getReportMap().containsKey(str);
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public String getActivityCover() {
            return ((ActivityEntrance) this.instance).getActivityCover();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public ByteString getActivityCoverBytes() {
            return ((ActivityEntrance) this.instance).getActivityCoverBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public String getActivityLink() {
            return ((ActivityEntrance) this.instance).getActivityLink();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public ByteString getActivityLinkBytes() {
            return ((ActivityEntrance) this.instance).getActivityLinkBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public String getActivitySubtitle() {
            return ((ActivityEntrance) this.instance).getActivitySubtitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public ByteString getActivitySubtitleBytes() {
            return ((ActivityEntrance) this.instance).getActivitySubtitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public String getActivityTitle() {
            return ((ActivityEntrance) this.instance).getActivityTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public ByteString getActivityTitleBytes() {
            return ((ActivityEntrance) this.instance).getActivityTitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public int getActivityType() {
            return ((ActivityEntrance) this.instance).getActivityType();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public int getReportCount() {
            return ((ActivityEntrance) this.instance).getReportMap().size();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((ActivityEntrance) this.instance).getReportMap());
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((ActivityEntrance) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((ActivityEntrance) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public int getReserveId() {
            return ((ActivityEntrance) this.instance).getReserveId();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public int getStatus() {
            return ((ActivityEntrance) this.instance).getStatus();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public User getUpperList(int i) {
            return ((ActivityEntrance) this.instance).getUpperList(i);
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public int getUpperListCount() {
            return ((ActivityEntrance) this.instance).getUpperListCount();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public List<User> getUpperListList() {
            return Collections.unmodifiableList(((ActivityEntrance) this.instance).getUpperListList());
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public String getWordTag() {
            return ((ActivityEntrance) this.instance).getWordTag();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
        public ByteString getWordTagBytes() {
            return ((ActivityEntrance) this.instance).getWordTagBytes();
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((ActivityEntrance) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((ActivityEntrance) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder removeUpperList(int i) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).removeUpperList(i);
            return this;
        }

        public Builder setActivityCover(String str) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setActivityCover(str);
            return this;
        }

        public Builder setActivityCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setActivityCoverBytes(byteString);
            return this;
        }

        public Builder setActivityLink(String str) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setActivityLink(str);
            return this;
        }

        public Builder setActivityLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setActivityLinkBytes(byteString);
            return this;
        }

        public Builder setActivitySubtitle(String str) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setActivitySubtitle(str);
            return this;
        }

        public Builder setActivitySubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setActivitySubtitleBytes(byteString);
            return this;
        }

        public Builder setActivityTitle(String str) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setActivityTitle(str);
            return this;
        }

        public Builder setActivityTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setActivityTitleBytes(byteString);
            return this;
        }

        public Builder setActivityType(int i) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setActivityType(i);
            return this;
        }

        public Builder setReserveId(int i) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setReserveId(i);
            return this;
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setStatus(i);
            return this;
        }

        public Builder setUpperList(int i, User user) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setUpperList(i, user);
            return this;
        }

        public Builder setWordTag(String str) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setWordTag(str);
            return this;
        }

        public Builder setWordTagBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setWordTagBytes(byteString);
            return this;
        }

        private Builder() {
            super(ActivityEntrance.DEFAULT_INSTANCE);
        }

        public Builder addUpperList(int i, User user) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).addUpperList(i, user);
            return this;
        }

        public Builder setUpperList(int i, User.Builder builder) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).setUpperList(i, builder.build());
            return this;
        }

        public Builder addUpperList(User.Builder builder) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).addUpperList(builder.build());
            return this;
        }

        public Builder addUpperList(int i, User.Builder builder) {
            copyOnWrite();
            ((ActivityEntrance) this.instance).addUpperList(i, builder.build());
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
        ActivityEntrance activityEntrance = new ActivityEntrance();
        DEFAULT_INSTANCE = activityEntrance;
        GeneratedMessageLite.registerDefaultInstance(ActivityEntrance.class, activityEntrance);
    }

    private ActivityEntrance() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUpperList(Iterable<? extends User> iterable) {
        ensureUpperListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.upperList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpperList(User user) {
        user.getClass();
        ensureUpperListIsMutable();
        this.upperList_.add(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityCover() {
        this.activityCover_ = getDefaultInstance().getActivityCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityLink() {
        this.activityLink_ = getDefaultInstance().getActivityLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivitySubtitle() {
        this.activitySubtitle_ = getDefaultInstance().getActivitySubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityTitle() {
        this.activityTitle_ = getDefaultInstance().getActivityTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityType() {
        this.activityType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserveId() {
        this.reserveId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpperList() {
        this.upperList_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWordTag() {
        this.wordTag_ = getDefaultInstance().getWordTag();
    }

    private void ensureUpperListIsMutable() {
        Internal.ProtobufList<User> protobufList = this.upperList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.upperList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ActivityEntrance getDefaultInstance() {
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

    public static ActivityEntrance parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ActivityEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityEntrance parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ActivityEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ActivityEntrance> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUpperList(int i) {
        ensureUpperListIsMutable();
        this.upperList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityCover(String str) {
        str.getClass();
        this.activityCover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.activityCover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityLink(String str) {
        str.getClass();
        this.activityLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.activityLink_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivitySubtitle(String str) {
        str.getClass();
        this.activitySubtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivitySubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.activitySubtitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityTitle(String str) {
        str.getClass();
        this.activityTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.activityTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityType(int i) {
        this.activityType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveId(int i) {
        this.reserveId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpperList(int i, User user) {
        user.getClass();
        ensureUpperListIsMutable();
        this.upperList_.set(i, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWordTag(String str) {
        str.getClass();
        this.wordTag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWordTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wordTag_ = byteString.toStringUtf8();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69671.f16955xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ActivityEntrance();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0001\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0004\u0007\u0004\b\u0004\t\u001b\n2", new Object[]{"activityCover_", "activityTitle_", "wordTag_", "activitySubtitle_", "activityLink_", "activityType_", "reserveId_", "status_", "upperList_", User.class, "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ActivityEntrance> parser = PARSER;
                if (parser == null) {
                    synchronized (ActivityEntrance.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public String getActivityCover() {
        return this.activityCover_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public ByteString getActivityCoverBytes() {
        return ByteString.copyFromUtf8(this.activityCover_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public String getActivityLink() {
        return this.activityLink_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public ByteString getActivityLinkBytes() {
        return ByteString.copyFromUtf8(this.activityLink_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public String getActivitySubtitle() {
        return this.activitySubtitle_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public ByteString getActivitySubtitleBytes() {
        return ByteString.copyFromUtf8(this.activitySubtitle_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public String getActivityTitle() {
        return this.activityTitle_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public ByteString getActivityTitleBytes() {
        return ByteString.copyFromUtf8(this.activityTitle_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public int getActivityType() {
        return this.activityType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    @Deprecated
    public Map<String, String> getReport() {
        return getReportMap();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public int getReportCount() {
        return internalGetReport().size();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public Map<String, String> getReportMap() {
        return Collections.unmodifiableMap(internalGetReport());
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public String getReportOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetReport = internalGetReport();
        return internalGetReport.containsKey(str) ? internalGetReport.get(str) : str2;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public String getReportOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetReport = internalGetReport();
        if (internalGetReport.containsKey(str)) {
            return internalGetReport.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public int getReserveId() {
        return this.reserveId_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public int getStatus() {
        return this.status_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public User getUpperList(int i) {
        return this.upperList_.get(i);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public int getUpperListCount() {
        return this.upperList_.size();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public List<User> getUpperListList() {
        return this.upperList_;
    }

    public UserOrBuilder getUpperListOrBuilder(int i) {
        return this.upperList_.get(i);
    }

    public List<? extends UserOrBuilder> getUpperListOrBuilderList() {
        return this.upperList_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public String getWordTag() {
        return this.wordTag_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ActivityEntranceOrBuilder
    public ByteString getWordTagBytes() {
        return ByteString.copyFromUtf8(this.wordTag_);
    }

    public static Builder newBuilder(ActivityEntrance activityEntrance) {
        return DEFAULT_INSTANCE.createBuilder(activityEntrance);
    }

    public static ActivityEntrance parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivityEntrance parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ActivityEntrance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ActivityEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpperList(int i, User user) {
        user.getClass();
        ensureUpperListIsMutable();
        this.upperList_.add(i, user);
    }

    public static ActivityEntrance parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ActivityEntrance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ActivityEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ActivityEntrance parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ActivityEntrance parseFrom(InputStream inputStream) throws IOException {
        return (ActivityEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityEntrance parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivityEntrance parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ActivityEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ActivityEntrance parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
