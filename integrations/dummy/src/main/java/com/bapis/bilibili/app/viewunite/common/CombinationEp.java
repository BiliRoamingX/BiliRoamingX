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
public final class CombinationEp extends GeneratedMessageLite<CombinationEp, CombinationEp.Builder> implements MessageLiteOrBuilder {
    public static final int CAN_ORD_DESC_FIELD_NUMBER = 4;
    private static final CombinationEp DEFAULT_INSTANCE;
    public static final int EPISODES_FIELD_NUMBER = 7;
    public static final int EPISODE_IDS_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MODULE_STYLE_FIELD_NUMBER = 9;
    public static final int MORE_FIELD_NUMBER = 5;
    private static volatile Parser<CombinationEp> PARSER = null;
    public static final int SECTION_DATA_FIELD_NUMBER = 11;
    public static final int SECTION_ID_FIELD_NUMBER = 2;
    public static final int SERIAL_SEASON_FIELD_NUMBER = 10;
    public static final int SPLIT_TEXT_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int canOrdDesc_;
    private int id_;
    private Style moduleStyle_;
    private SectionData sectionData_;
    private int sectionId_;
    private int episodeIdsMemoizedSerializedSize = -1;
    private String title_ = "";
    private String more_ = "";
    private Internal.IntList episodeIds_ = GeneratedMessageLite.emptyIntList();
    private Internal.ProtobufList<ViewEpisode> episodes_ = GeneratedMessageLite.emptyProtobufList();
    private String splitText_ = "";
    private Internal.ProtobufList<SerialSeason> serialSeason_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.CombinationEp$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69891 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16976xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16976xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16976xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16976xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16976xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16976xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16976xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16976xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CombinationEp, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69891 c69891) {
            this();
        }

        public Builder addAllEpisodeIds(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((CombinationEp) this.instance).addAllEpisodeIds(iterable);
            return this;
        }

        public Builder addAllEpisodes(Iterable<? extends ViewEpisode> iterable) {
            copyOnWrite();
            ((CombinationEp) this.instance).addAllEpisodes(iterable);
            return this;
        }

        public Builder addAllSerialSeason(Iterable<? extends SerialSeason> iterable) {
            copyOnWrite();
            ((CombinationEp) this.instance).addAllSerialSeason(iterable);
            return this;
        }

        public Builder addEpisodeIds(int i) {
            copyOnWrite();
            ((CombinationEp) this.instance).addEpisodeIds(i);
            return this;
        }

        public Builder addEpisodes(ViewEpisode viewEpisode) {
            copyOnWrite();
            ((CombinationEp) this.instance).addEpisodes(viewEpisode);
            return this;
        }

        public Builder addSerialSeason(SerialSeason serialSeason) {
            copyOnWrite();
            ((CombinationEp) this.instance).addSerialSeason(serialSeason);
            return this;
        }

        public Builder clearCanOrdDesc() {
            copyOnWrite();
            ((CombinationEp) this.instance).clearCanOrdDesc();
            return this;
        }

        public Builder clearEpisodeIds() {
            copyOnWrite();
            ((CombinationEp) this.instance).clearEpisodeIds();
            return this;
        }

        public Builder clearEpisodes() {
            copyOnWrite();
            ((CombinationEp) this.instance).clearEpisodes();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((CombinationEp) this.instance).clearId();
            return this;
        }

        public Builder clearModuleStyle() {
            copyOnWrite();
            ((CombinationEp) this.instance).clearModuleStyle();
            return this;
        }

        public Builder clearMore() {
            copyOnWrite();
            ((CombinationEp) this.instance).clearMore();
            return this;
        }

        public Builder clearSectionData() {
            copyOnWrite();
            ((CombinationEp) this.instance).clearSectionData();
            return this;
        }

        public Builder clearSectionId() {
            copyOnWrite();
            ((CombinationEp) this.instance).clearSectionId();
            return this;
        }

        public Builder clearSerialSeason() {
            copyOnWrite();
            ((CombinationEp) this.instance).clearSerialSeason();
            return this;
        }

        public Builder clearSplitText() {
            copyOnWrite();
            ((CombinationEp) this.instance).clearSplitText();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((CombinationEp) this.instance).clearTitle();
            return this;
        }

        public int getCanOrdDesc() {
            return ((CombinationEp) this.instance).getCanOrdDesc();
        }

        public int getEpisodeIds(int i) {
            return ((CombinationEp) this.instance).getEpisodeIds(i);
        }

        public int getEpisodeIdsCount() {
            return ((CombinationEp) this.instance).getEpisodeIdsCount();
        }

        public List<Integer> getEpisodeIdsList() {
            return Collections.unmodifiableList(((CombinationEp) this.instance).getEpisodeIdsList());
        }

        public ViewEpisode getEpisodes(int i) {
            return ((CombinationEp) this.instance).getEpisodes(i);
        }

        public int getEpisodesCount() {
            return ((CombinationEp) this.instance).getEpisodesCount();
        }

        public List<ViewEpisode> getEpisodesList() {
            return Collections.unmodifiableList(((CombinationEp) this.instance).getEpisodesList());
        }

        public int getId() {
            return ((CombinationEp) this.instance).getId();
        }

        public Style getModuleStyle() {
            return ((CombinationEp) this.instance).getModuleStyle();
        }

        public String getMore() {
            return ((CombinationEp) this.instance).getMore();
        }

        public ByteString getMoreBytes() {
            return ((CombinationEp) this.instance).getMoreBytes();
        }

        public SectionData getSectionData() {
            return ((CombinationEp) this.instance).getSectionData();
        }

        public int getSectionId() {
            return ((CombinationEp) this.instance).getSectionId();
        }

        public SerialSeason getSerialSeason(int i) {
            return ((CombinationEp) this.instance).getSerialSeason(i);
        }

        public int getSerialSeasonCount() {
            return ((CombinationEp) this.instance).getSerialSeasonCount();
        }

        public List<SerialSeason> getSerialSeasonList() {
            return Collections.unmodifiableList(((CombinationEp) this.instance).getSerialSeasonList());
        }

        public String getSplitText() {
            return ((CombinationEp) this.instance).getSplitText();
        }

        public ByteString getSplitTextBytes() {
            return ((CombinationEp) this.instance).getSplitTextBytes();
        }

        public String getTitle() {
            return ((CombinationEp) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((CombinationEp) this.instance).getTitleBytes();
        }

        public boolean hasModuleStyle() {
            return ((CombinationEp) this.instance).hasModuleStyle();
        }

        public boolean hasSectionData() {
            return ((CombinationEp) this.instance).hasSectionData();
        }

        public Builder mergeModuleStyle(Style style) {
            copyOnWrite();
            ((CombinationEp) this.instance).mergeModuleStyle(style);
            return this;
        }

        public Builder mergeSectionData(SectionData sectionData) {
            copyOnWrite();
            ((CombinationEp) this.instance).mergeSectionData(sectionData);
            return this;
        }

        public Builder removeEpisodes(int i) {
            copyOnWrite();
            ((CombinationEp) this.instance).removeEpisodes(i);
            return this;
        }

        public Builder removeSerialSeason(int i) {
            copyOnWrite();
            ((CombinationEp) this.instance).removeSerialSeason(i);
            return this;
        }

        public Builder setCanOrdDesc(int i) {
            copyOnWrite();
            ((CombinationEp) this.instance).setCanOrdDesc(i);
            return this;
        }

        public Builder setEpisodeIds(int i, int i2) {
            copyOnWrite();
            ((CombinationEp) this.instance).setEpisodeIds(i, i2);
            return this;
        }

        public Builder setEpisodes(int i, ViewEpisode viewEpisode) {
            copyOnWrite();
            ((CombinationEp) this.instance).setEpisodes(i, viewEpisode);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((CombinationEp) this.instance).setId(i);
            return this;
        }

        public Builder setModuleStyle(Style style) {
            copyOnWrite();
            ((CombinationEp) this.instance).setModuleStyle(style);
            return this;
        }

        public Builder setMore(String str) {
            copyOnWrite();
            ((CombinationEp) this.instance).setMore(str);
            return this;
        }

        public Builder setMoreBytes(ByteString byteString) {
            copyOnWrite();
            ((CombinationEp) this.instance).setMoreBytes(byteString);
            return this;
        }

        public Builder setSectionData(SectionData sectionData) {
            copyOnWrite();
            ((CombinationEp) this.instance).setSectionData(sectionData);
            return this;
        }

        public Builder setSectionId(int i) {
            copyOnWrite();
            ((CombinationEp) this.instance).setSectionId(i);
            return this;
        }

        public Builder setSerialSeason(int i, SerialSeason serialSeason) {
            copyOnWrite();
            ((CombinationEp) this.instance).setSerialSeason(i, serialSeason);
            return this;
        }

        public Builder setSplitText(String str) {
            copyOnWrite();
            ((CombinationEp) this.instance).setSplitText(str);
            return this;
        }

        public Builder setSplitTextBytes(ByteString byteString) {
            copyOnWrite();
            ((CombinationEp) this.instance).setSplitTextBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((CombinationEp) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((CombinationEp) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(CombinationEp.DEFAULT_INSTANCE);
        }

        public Builder addEpisodes(int i, ViewEpisode viewEpisode) {
            copyOnWrite();
            ((CombinationEp) this.instance).addEpisodes(i, viewEpisode);
            return this;
        }

        public Builder addSerialSeason(int i, SerialSeason serialSeason) {
            copyOnWrite();
            ((CombinationEp) this.instance).addSerialSeason(i, serialSeason);
            return this;
        }

        public Builder setEpisodes(int i, ViewEpisode.Builder builder) {
            copyOnWrite();
            ((CombinationEp) this.instance).setEpisodes(i, builder.build());
            return this;
        }

        public Builder setModuleStyle(Style.Builder builder) {
            copyOnWrite();
            ((CombinationEp) this.instance).setModuleStyle(builder.build());
            return this;
        }

        public Builder setSectionData(SectionData.Builder builder) {
            copyOnWrite();
            ((CombinationEp) this.instance).setSectionData(builder.build());
            return this;
        }

        public Builder setSerialSeason(int i, SerialSeason.Builder builder) {
            copyOnWrite();
            ((CombinationEp) this.instance).setSerialSeason(i, builder.build());
            return this;
        }

        public Builder addEpisodes(ViewEpisode.Builder builder) {
            copyOnWrite();
            ((CombinationEp) this.instance).addEpisodes(builder.build());
            return this;
        }

        public Builder addSerialSeason(SerialSeason.Builder builder) {
            copyOnWrite();
            ((CombinationEp) this.instance).addSerialSeason(builder.build());
            return this;
        }

        public Builder addEpisodes(int i, ViewEpisode.Builder builder) {
            copyOnWrite();
            ((CombinationEp) this.instance).addEpisodes(i, builder.build());
            return this;
        }

        public Builder addSerialSeason(int i, SerialSeason.Builder builder) {
            copyOnWrite();
            ((CombinationEp) this.instance).addSerialSeason(i, builder.build());
            return this;
        }
    }

    static {
        CombinationEp combinationEp = new CombinationEp();
        DEFAULT_INSTANCE = combinationEp;
        GeneratedMessageLite.registerDefaultInstance(CombinationEp.class, combinationEp);
    }

    private CombinationEp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEpisodeIds(Iterable<? extends Integer> iterable) {
        ensureEpisodeIdsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.episodeIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEpisodes(Iterable<? extends ViewEpisode> iterable) {
        ensureEpisodesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.episodes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSerialSeason(Iterable<? extends SerialSeason> iterable) {
        ensureSerialSeasonIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.serialSeason_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodeIds(int i) {
        ensureEpisodeIdsIsMutable();
        this.episodeIds_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodes(ViewEpisode viewEpisode) {
        viewEpisode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(viewEpisode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSerialSeason(SerialSeason serialSeason) {
        serialSeason.getClass();
        ensureSerialSeasonIsMutable();
        this.serialSeason_.add(serialSeason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanOrdDesc() {
        this.canOrdDesc_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpisodeIds() {
        this.episodeIds_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpisodes() {
        this.episodes_ = GeneratedMessageLite.emptyProtobufList();
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
    public void clearSectionData() {
        this.sectionData_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSectionId() {
        this.sectionId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSerialSeason() {
        this.serialSeason_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSplitText() {
        this.splitText_ = getDefaultInstance().getSplitText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureEpisodeIdsIsMutable() {
        Internal.IntList intList = this.episodeIds_;
        if (intList.isModifiable()) {
            return;
        }
        this.episodeIds_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureEpisodesIsMutable() {
        Internal.ProtobufList<ViewEpisode> protobufList = this.episodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.episodes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSerialSeasonIsMutable() {
        Internal.ProtobufList<SerialSeason> protobufList = this.serialSeason_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.serialSeason_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CombinationEp getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
    public void mergeSectionData(SectionData sectionData) {
        sectionData.getClass();
        SectionData sectionData2 = this.sectionData_;
        if (sectionData2 != null && sectionData2 != SectionData.getDefaultInstance()) {
            this.sectionData_ = SectionData.newBuilder(this.sectionData_).mergeFrom((SectionData) sectionData).buildPartial();
        } else {
            this.sectionData_ = sectionData;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CombinationEp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CombinationEp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CombinationEp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CombinationEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CombinationEp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEpisodes(int i) {
        ensureEpisodesIsMutable();
        this.episodes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSerialSeason(int i) {
        ensureSerialSeasonIsMutable();
        this.serialSeason_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanOrdDesc(int i) {
        this.canOrdDesc_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpisodeIds(int i, int i2) {
        ensureEpisodeIdsIsMutable();
        this.episodeIds_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpisodes(int i, ViewEpisode viewEpisode) {
        viewEpisode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.set(i, viewEpisode);
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
    public void setSectionData(SectionData sectionData) {
        sectionData.getClass();
        this.sectionData_ = sectionData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSectionId(int i) {
        this.sectionId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSerialSeason(int i, SerialSeason serialSeason) {
        serialSeason.getClass();
        ensureSerialSeasonIsMutable();
        this.serialSeason_.set(i, serialSeason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSplitText(String str) {
        str.getClass();
        this.splitText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSplitTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.splitText_ = byteString.toStringUtf8();
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69891.f16976xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CombinationEp();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0003\u0000\u0001\u0004\u0002\u0004\u0003\u0208\u0004\u0004\u0005\u0208\u0006'\u0007\u001b\b\u0208\t\t\n\u001b\u000b\t", new Object[]{"id_", "sectionId_", "title_", "canOrdDesc_", "more_", "episodeIds_", "episodes_", ViewEpisode.class, "splitText_", "moduleStyle_", "serialSeason_", SerialSeason.class, "sectionData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CombinationEp> parser = PARSER;
                if (parser == null) {
                    synchronized (CombinationEp.class) {
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

    public int getCanOrdDesc() {
        return this.canOrdDesc_;
    }

    public int getEpisodeIds(int i) {
        return this.episodeIds_.getInt(i);
    }

    public int getEpisodeIdsCount() {
        return this.episodeIds_.size();
    }

    public List<Integer> getEpisodeIdsList() {
        return this.episodeIds_;
    }

    public ViewEpisode getEpisodes(int i) {
        return this.episodes_.get(i);
    }

    public int getEpisodesCount() {
        return this.episodes_.size();
    }

    public List<ViewEpisode> getEpisodesList() {
        return this.episodes_;
    }

    public ViewEpisodeOrBuilder getEpisodesOrBuilder(int i) {
        return this.episodes_.get(i);
    }

    public List<? extends ViewEpisodeOrBuilder> getEpisodesOrBuilderList() {
        return this.episodes_;
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

    public SectionData getSectionData() {
        SectionData sectionData = this.sectionData_;
        return sectionData == null ? SectionData.getDefaultInstance() : sectionData;
    }

    public int getSectionId() {
        return this.sectionId_;
    }

    public SerialSeason getSerialSeason(int i) {
        return this.serialSeason_.get(i);
    }

    public int getSerialSeasonCount() {
        return this.serialSeason_.size();
    }

    public List<SerialSeason> getSerialSeasonList() {
        return this.serialSeason_;
    }

    public SerialSeasonOrBuilder getSerialSeasonOrBuilder(int i) {
        return this.serialSeason_.get(i);
    }

    public List<? extends SerialSeasonOrBuilder> getSerialSeasonOrBuilderList() {
        return this.serialSeason_;
    }

    public String getSplitText() {
        return this.splitText_;
    }

    public ByteString getSplitTextBytes() {
        return ByteString.copyFromUtf8(this.splitText_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public boolean hasModuleStyle() {
        return this.moduleStyle_ != null;
    }

    public boolean hasSectionData() {
        return this.sectionData_ != null;
    }

    public static Builder newBuilder(CombinationEp combinationEp) {
        return DEFAULT_INSTANCE.createBuilder(combinationEp);
    }

    public static CombinationEp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CombinationEp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CombinationEp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CombinationEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CombinationEp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CombinationEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodes(int i, ViewEpisode viewEpisode) {
        viewEpisode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(i, viewEpisode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSerialSeason(int i, SerialSeason serialSeason) {
        serialSeason.getClass();
        ensureSerialSeasonIsMutable();
        this.serialSeason_.add(i, serialSeason);
    }

    public static CombinationEp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CombinationEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CombinationEp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CombinationEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CombinationEp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CombinationEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CombinationEp parseFrom(InputStream inputStream) throws IOException {
        return (CombinationEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CombinationEp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CombinationEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CombinationEp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CombinationEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CombinationEp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CombinationEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
