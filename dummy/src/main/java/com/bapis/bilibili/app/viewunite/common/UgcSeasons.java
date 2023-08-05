package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class UgcSeasons extends GeneratedMessageLite<UgcSeasons, UgcSeasons.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_FIELD_NUMBER = 10;
    public static final int COVER_FIELD_NUMBER = 3;
    private static final UgcSeasons DEFAULT_INSTANCE;
    public static final int EP_COUNT_FIELD_NUMBER = 8;
    public static final int HEAD_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<UgcSeasons> PARSER = null;
    public static final int SEASON_ABILITY_FIELD_NUMBER = 11;
    public static final int SEASON_TITLE_FIELD_NUMBER = 12;
    public static final int SEASON_TYPE_FIELD_NUMBER = 9;
    public static final int SECTION_FIELD_NUMBER = 5;
    public static final int SUPERNATANT_TITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int UNION_TITLE_FIELD_NUMBER = 6;
    private UgcSeasonActivity activity_;
    private long epCount_;
    private SeasonHead head_;
    private long id_;
    private int seasonType_;
    private String title_ = "";
    private String cover_ = "";
    private String supernatantTitle_ = "";
    private Internal.ProtobufList<UgcSection> section_ = GeneratedMessageLite.emptyProtobufList();
    private String unionTitle_ = "";
    private Internal.ProtobufList<String> seasonAbility_ = GeneratedMessageLite.emptyProtobufList();
    private String seasonTitle_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.UgcSeasons$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70751 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17052xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17052xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17052xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17052xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17052xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17052xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17052xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17052xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UgcSeasons, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70751 c70751) {
            this();
        }

        public Builder addAllSeasonAbility(Iterable<String> iterable) {
            copyOnWrite();
            ((UgcSeasons) this.instance).addAllSeasonAbility(iterable);
            return this;
        }

        public Builder addAllSection(Iterable<? extends UgcSection> iterable) {
            copyOnWrite();
            ((UgcSeasons) this.instance).addAllSection(iterable);
            return this;
        }

        public Builder addSeasonAbility(String str) {
            copyOnWrite();
            ((UgcSeasons) this.instance).addSeasonAbility(str);
            return this;
        }

        public Builder addSeasonAbilityBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeasons) this.instance).addSeasonAbilityBytes(byteString);
            return this;
        }

        public Builder addSection(UgcSection ugcSection) {
            copyOnWrite();
            ((UgcSeasons) this.instance).addSection(ugcSection);
            return this;
        }

        public Builder clearActivity() {
            copyOnWrite();
            ((UgcSeasons) this.instance).clearActivity();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((UgcSeasons) this.instance).clearCover();
            return this;
        }

        public Builder clearEpCount() {
            copyOnWrite();
            ((UgcSeasons) this.instance).clearEpCount();
            return this;
        }

        public Builder clearHead() {
            copyOnWrite();
            ((UgcSeasons) this.instance).clearHead();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((UgcSeasons) this.instance).clearId();
            return this;
        }

        public Builder clearSeasonAbility() {
            copyOnWrite();
            ((UgcSeasons) this.instance).clearSeasonAbility();
            return this;
        }

        public Builder clearSeasonTitle() {
            copyOnWrite();
            ((UgcSeasons) this.instance).clearSeasonTitle();
            return this;
        }

        public Builder clearSeasonType() {
            copyOnWrite();
            ((UgcSeasons) this.instance).clearSeasonType();
            return this;
        }

        public Builder clearSection() {
            copyOnWrite();
            ((UgcSeasons) this.instance).clearSection();
            return this;
        }

        public Builder clearSupernatantTitle() {
            copyOnWrite();
            ((UgcSeasons) this.instance).clearSupernatantTitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((UgcSeasons) this.instance).clearTitle();
            return this;
        }

        public Builder clearUnionTitle() {
            copyOnWrite();
            ((UgcSeasons) this.instance).clearUnionTitle();
            return this;
        }

        public UgcSeasonActivity getActivity() {
            return ((UgcSeasons) this.instance).getActivity();
        }

        public String getCover() {
            return ((UgcSeasons) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((UgcSeasons) this.instance).getCoverBytes();
        }

        public long getEpCount() {
            return ((UgcSeasons) this.instance).getEpCount();
        }

        public SeasonHead getHead() {
            return ((UgcSeasons) this.instance).getHead();
        }

        public long getId() {
            return ((UgcSeasons) this.instance).getId();
        }

        public String getSeasonAbility(int i) {
            return ((UgcSeasons) this.instance).getSeasonAbility(i);
        }

        public ByteString getSeasonAbilityBytes(int i) {
            return ((UgcSeasons) this.instance).getSeasonAbilityBytes(i);
        }

        public int getSeasonAbilityCount() {
            return ((UgcSeasons) this.instance).getSeasonAbilityCount();
        }

        public List<String> getSeasonAbilityList() {
            return Collections.unmodifiableList(((UgcSeasons) this.instance).getSeasonAbilityList());
        }

        public String getSeasonTitle() {
            return ((UgcSeasons) this.instance).getSeasonTitle();
        }

        public ByteString getSeasonTitleBytes() {
            return ((UgcSeasons) this.instance).getSeasonTitleBytes();
        }

        public SeasonType getSeasonType() {
            return ((UgcSeasons) this.instance).getSeasonType();
        }

        public int getSeasonTypeValue() {
            return ((UgcSeasons) this.instance).getSeasonTypeValue();
        }

        public UgcSection getSection(int i) {
            return ((UgcSeasons) this.instance).getSection(i);
        }

        public int getSectionCount() {
            return ((UgcSeasons) this.instance).getSectionCount();
        }

        public List<UgcSection> getSectionList() {
            return Collections.unmodifiableList(((UgcSeasons) this.instance).getSectionList());
        }

        public String getSupernatantTitle() {
            return ((UgcSeasons) this.instance).getSupernatantTitle();
        }

        public ByteString getSupernatantTitleBytes() {
            return ((UgcSeasons) this.instance).getSupernatantTitleBytes();
        }

        public String getTitle() {
            return ((UgcSeasons) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((UgcSeasons) this.instance).getTitleBytes();
        }

        public String getUnionTitle() {
            return ((UgcSeasons) this.instance).getUnionTitle();
        }

        public ByteString getUnionTitleBytes() {
            return ((UgcSeasons) this.instance).getUnionTitleBytes();
        }

        public boolean hasActivity() {
            return ((UgcSeasons) this.instance).hasActivity();
        }

        public boolean hasHead() {
            return ((UgcSeasons) this.instance).hasHead();
        }

        public Builder mergeActivity(UgcSeasonActivity ugcSeasonActivity) {
            copyOnWrite();
            ((UgcSeasons) this.instance).mergeActivity(ugcSeasonActivity);
            return this;
        }

        public Builder mergeHead(SeasonHead seasonHead) {
            copyOnWrite();
            ((UgcSeasons) this.instance).mergeHead(seasonHead);
            return this;
        }

        public Builder removeSection(int i) {
            copyOnWrite();
            ((UgcSeasons) this.instance).removeSection(i);
            return this;
        }

        public Builder setActivity(UgcSeasonActivity ugcSeasonActivity) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setActivity(ugcSeasonActivity);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setEpCount(long j) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setEpCount(j);
            return this;
        }

        public Builder setHead(SeasonHead seasonHead) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setHead(seasonHead);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setId(j);
            return this;
        }

        public Builder setSeasonAbility(int i, String str) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setSeasonAbility(i, str);
            return this;
        }

        public Builder setSeasonTitle(String str) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setSeasonTitle(str);
            return this;
        }

        public Builder setSeasonTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setSeasonTitleBytes(byteString);
            return this;
        }

        public Builder setSeasonType(SeasonType seasonType) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setSeasonType(seasonType);
            return this;
        }

        public Builder setSeasonTypeValue(int i) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setSeasonTypeValue(i);
            return this;
        }

        public Builder setSection(int i, UgcSection ugcSection) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setSection(i, ugcSection);
            return this;
        }

        public Builder setSupernatantTitle(String str) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setSupernatantTitle(str);
            return this;
        }

        public Builder setSupernatantTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setSupernatantTitleBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setUnionTitle(String str) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setUnionTitle(str);
            return this;
        }

        public Builder setUnionTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setUnionTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(UgcSeasons.DEFAULT_INSTANCE);
        }

        public Builder addSection(int i, UgcSection ugcSection) {
            copyOnWrite();
            ((UgcSeasons) this.instance).addSection(i, ugcSection);
            return this;
        }

        public Builder setActivity(UgcSeasonActivity.Builder builder) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setActivity(builder.build());
            return this;
        }

        public Builder setHead(SeasonHead.Builder builder) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setHead(builder.build());
            return this;
        }

        public Builder setSection(int i, UgcSection.Builder builder) {
            copyOnWrite();
            ((UgcSeasons) this.instance).setSection(i, builder.build());
            return this;
        }

        public Builder addSection(UgcSection.Builder builder) {
            copyOnWrite();
            ((UgcSeasons) this.instance).addSection(builder.build());
            return this;
        }

        public Builder addSection(int i, UgcSection.Builder builder) {
            copyOnWrite();
            ((UgcSeasons) this.instance).addSection(i, builder.build());
            return this;
        }
    }

    static {
        UgcSeasons ugcSeasons = new UgcSeasons();
        DEFAULT_INSTANCE = ugcSeasons;
        GeneratedMessageLite.registerDefaultInstance(UgcSeasons.class, ugcSeasons);
    }

    private UgcSeasons() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSeasonAbility(Iterable<String> iterable) {
        ensureSeasonAbilityIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.seasonAbility_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSection(Iterable<? extends UgcSection> iterable) {
        ensureSectionIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.section_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSeasonAbility(String str) {
        str.getClass();
        ensureSeasonAbilityIsMutable();
        this.seasonAbility_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSeasonAbilityBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureSeasonAbilityIsMutable();
        this.seasonAbility_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSection(UgcSection ugcSection) {
        ugcSection.getClass();
        ensureSectionIsMutable();
        this.section_.add(ugcSection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivity() {
        this.activity_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpCount() {
        this.epCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHead() {
        this.head_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonAbility() {
        this.seasonAbility_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonTitle() {
        this.seasonTitle_ = getDefaultInstance().getSeasonTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonType() {
        this.seasonType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSection() {
        this.section_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupernatantTitle() {
        this.supernatantTitle_ = getDefaultInstance().getSupernatantTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnionTitle() {
        this.unionTitle_ = getDefaultInstance().getUnionTitle();
    }

    private void ensureSeasonAbilityIsMutable() {
        Internal.ProtobufList<String> protobufList = this.seasonAbility_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.seasonAbility_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSectionIsMutable() {
        Internal.ProtobufList<UgcSection> protobufList = this.section_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.section_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static UgcSeasons getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivity(UgcSeasonActivity ugcSeasonActivity) {
        ugcSeasonActivity.getClass();
        UgcSeasonActivity ugcSeasonActivity2 = this.activity_;
        if (ugcSeasonActivity2 != null && ugcSeasonActivity2 != UgcSeasonActivity.getDefaultInstance()) {
            this.activity_ = UgcSeasonActivity.newBuilder(this.activity_).mergeFrom((UgcSeasonActivity) ugcSeasonActivity).buildPartial();
        } else {
            this.activity_ = ugcSeasonActivity;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHead(SeasonHead seasonHead) {
        seasonHead.getClass();
        SeasonHead seasonHead2 = this.head_;
        if (seasonHead2 != null && seasonHead2 != SeasonHead.getDefaultInstance()) {
            this.head_ = SeasonHead.newBuilder(this.head_).mergeFrom((SeasonHead) seasonHead).buildPartial();
        } else {
            this.head_ = seasonHead;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UgcSeasons parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UgcSeasons) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSeasons parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UgcSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UgcSeasons> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSection(int i) {
        ensureSectionIsMutable();
        this.section_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivity(UgcSeasonActivity ugcSeasonActivity) {
        ugcSeasonActivity.getClass();
        this.activity_ = ugcSeasonActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpCount(long j) {
        this.epCount_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHead(SeasonHead seasonHead) {
        seasonHead.getClass();
        this.head_ = seasonHead;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonAbility(int i, String str) {
        str.getClass();
        ensureSeasonAbilityIsMutable();
        this.seasonAbility_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonTitle(String str) {
        str.getClass();
        this.seasonTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.seasonTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonType(SeasonType seasonType) {
        this.seasonType_ = seasonType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonTypeValue(int i) {
        this.seasonType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSection(int i, UgcSection ugcSection) {
        ugcSection.getClass();
        ensureSectionIsMutable();
        this.section_.set(i, ugcSection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupernatantTitle(String str) {
        str.getClass();
        this.supernatantTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupernatantTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.supernatantTitle_ = byteString.toStringUtf8();
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
    public void setUnionTitle(String str) {
        str.getClass();
        this.unionTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnionTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.unionTitle_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70751.f17052xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UgcSeasons();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0002\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u001b\u0006\u0208\u0007\t\b\u0002\t\f\n\t\u000b\u021a\f\u0208", new Object[]{"id_", "title_", "cover_", "supernatantTitle_", "section_", UgcSection.class, "unionTitle_", "head_", "epCount_", "seasonType_", "activity_", "seasonAbility_", "seasonTitle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UgcSeasons> parser = PARSER;
                if (parser == null) {
                    synchronized (UgcSeasons.class) {
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

    public UgcSeasonActivity getActivity() {
        UgcSeasonActivity ugcSeasonActivity = this.activity_;
        return ugcSeasonActivity == null ? UgcSeasonActivity.getDefaultInstance() : ugcSeasonActivity;
    }

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public long getEpCount() {
        return this.epCount_;
    }

    public SeasonHead getHead() {
        SeasonHead seasonHead = this.head_;
        return seasonHead == null ? SeasonHead.getDefaultInstance() : seasonHead;
    }

    public long getId() {
        return this.id_;
    }

    public String getSeasonAbility(int i) {
        return this.seasonAbility_.get(i);
    }

    public ByteString getSeasonAbilityBytes(int i) {
        return ByteString.copyFromUtf8(this.seasonAbility_.get(i));
    }

    public int getSeasonAbilityCount() {
        return this.seasonAbility_.size();
    }

    public List<String> getSeasonAbilityList() {
        return this.seasonAbility_;
    }

    public String getSeasonTitle() {
        return this.seasonTitle_;
    }

    public ByteString getSeasonTitleBytes() {
        return ByteString.copyFromUtf8(this.seasonTitle_);
    }

    public SeasonType getSeasonType() {
        SeasonType forNumber = SeasonType.forNumber(this.seasonType_);
        return forNumber == null ? SeasonType.UNRECOGNIZED : forNumber;
    }

    public int getSeasonTypeValue() {
        return this.seasonType_;
    }

    public UgcSection getSection(int i) {
        return this.section_.get(i);
    }

    public int getSectionCount() {
        return this.section_.size();
    }

    public List<UgcSection> getSectionList() {
        return this.section_;
    }

    public UgcSectionOrBuilder getSectionOrBuilder(int i) {
        return this.section_.get(i);
    }

    public List<? extends UgcSectionOrBuilder> getSectionOrBuilderList() {
        return this.section_;
    }

    public String getSupernatantTitle() {
        return this.supernatantTitle_;
    }

    public ByteString getSupernatantTitleBytes() {
        return ByteString.copyFromUtf8(this.supernatantTitle_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getUnionTitle() {
        return this.unionTitle_;
    }

    public ByteString getUnionTitleBytes() {
        return ByteString.copyFromUtf8(this.unionTitle_);
    }

    public boolean hasActivity() {
        return this.activity_ != null;
    }

    public boolean hasHead() {
        return this.head_ != null;
    }

    public static Builder newBuilder(UgcSeasons ugcSeasons) {
        return DEFAULT_INSTANCE.createBuilder(ugcSeasons);
    }

    public static UgcSeasons parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasons) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSeasons parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UgcSeasons parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UgcSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSection(int i, UgcSection ugcSection) {
        ugcSection.getClass();
        ensureSectionIsMutable();
        this.section_.add(i, ugcSection);
    }

    public static UgcSeasons parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UgcSeasons parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UgcSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UgcSeasons parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UgcSeasons parseFrom(InputStream inputStream) throws IOException {
        return (UgcSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSeasons parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSeasons parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UgcSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UgcSeasons parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
