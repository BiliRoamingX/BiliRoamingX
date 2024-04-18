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
import com.google.protobuf.MessageLiteOrBuilder;
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
public final class SectionData extends GeneratedMessageLite<SectionData, SectionData.Builder> implements MessageLiteOrBuilder {
    public static final int CAN_ORD_DESC_FIELD_NUMBER = 4;
    private static final SectionData DEFAULT_INSTANCE;
    public static final int EPISODES_FIELD_NUMBER = 7;
    public static final int EPISODE_IDS_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MODULE_STYLE_FIELD_NUMBER = 9;
    public static final int MORE_BOTTOM_DESC_FIELD_NUMBER = 10;
    public static final int MORE_FIELD_NUMBER = 5;
    public static final int MORE_LEFT_FIELD_NUMBER = 12;
    private static volatile Parser<SectionData> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 14;
    public static final int SEASONS_FIELD_NUMBER = 11;
    public static final int SECTION_ID_FIELD_NUMBER = 2;
    public static final int SPLIT_TEXT_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 13;
    private int canOrdDesc_;
    private int id_;
    private Style moduleStyle_;
    private Button moreLeft_;
    private int sectionId_;
    private int type_;
    private int episodeIdsMemoizedSerializedSize = -1;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String title_ = "";
    private String more_ = "";
    private Internal.IntList episodeIds_ = GeneratedMessageLite.emptyIntList();
    private Internal.ProtobufList<ViewEpisode> episodes_ = GeneratedMessageLite.emptyProtobufList();
    private String splitText_ = "";
    private String moreBottomDesc_ = "";
    private Internal.ProtobufList<SerialSeason> seasons_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.SectionData$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70571 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17035xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17035xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17035xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17035xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17035xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17035xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17035xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17035xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SectionData, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70571 c70571) {
            this();
        }

        public Builder addAllEpisodeIds(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((SectionData) this.instance).addAllEpisodeIds(iterable);
            return this;
        }

        public Builder addAllEpisodes(Iterable<? extends ViewEpisode> iterable) {
            copyOnWrite();
            ((SectionData) this.instance).addAllEpisodes(iterable);
            return this;
        }

        public Builder addAllSeasons(Iterable<? extends SerialSeason> iterable) {
            copyOnWrite();
            ((SectionData) this.instance).addAllSeasons(iterable);
            return this;
        }

        public Builder addEpisodeIds(int i) {
            copyOnWrite();
            ((SectionData) this.instance).addEpisodeIds(i);
            return this;
        }

        public Builder addEpisodes(ViewEpisode viewEpisode) {
            copyOnWrite();
            ((SectionData) this.instance).addEpisodes(viewEpisode);
            return this;
        }

        public Builder addSeasons(SerialSeason serialSeason) {
            copyOnWrite();
            ((SectionData) this.instance).addSeasons(serialSeason);
            return this;
        }

        public Builder clearCanOrdDesc() {
            copyOnWrite();
            ((SectionData) this.instance).clearCanOrdDesc();
            return this;
        }

        public Builder clearEpisodeIds() {
            copyOnWrite();
            ((SectionData) this.instance).clearEpisodeIds();
            return this;
        }

        public Builder clearEpisodes() {
            copyOnWrite();
            ((SectionData) this.instance).clearEpisodes();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((SectionData) this.instance).clearId();
            return this;
        }

        public Builder clearModuleStyle() {
            copyOnWrite();
            ((SectionData) this.instance).clearModuleStyle();
            return this;
        }

        public Builder clearMore() {
            copyOnWrite();
            ((SectionData) this.instance).clearMore();
            return this;
        }

        public Builder clearMoreBottomDesc() {
            copyOnWrite();
            ((SectionData) this.instance).clearMoreBottomDesc();
            return this;
        }

        public Builder clearMoreLeft() {
            copyOnWrite();
            ((SectionData) this.instance).clearMoreLeft();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((SectionData) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearSeasons() {
            copyOnWrite();
            ((SectionData) this.instance).clearSeasons();
            return this;
        }

        public Builder clearSectionId() {
            copyOnWrite();
            ((SectionData) this.instance).clearSectionId();
            return this;
        }

        public Builder clearSplitText() {
            copyOnWrite();
            ((SectionData) this.instance).clearSplitText();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((SectionData) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((SectionData) this.instance).clearType();
            return this;
        }

        public boolean containsReport(String str) {
            str.getClass();
            return ((SectionData) this.instance).getReportMap().containsKey(str);
        }

        public int getCanOrdDesc() {
            return ((SectionData) this.instance).getCanOrdDesc();
        }

        public int getEpisodeIds(int i) {
            return ((SectionData) this.instance).getEpisodeIds(i);
        }

        public int getEpisodeIdsCount() {
            return ((SectionData) this.instance).getEpisodeIdsCount();
        }

        public List<Integer> getEpisodeIdsList() {
            return Collections.unmodifiableList(((SectionData) this.instance).getEpisodeIdsList());
        }

        public ViewEpisode getEpisodes(int i) {
            return ((SectionData) this.instance).getEpisodes(i);
        }

        public int getEpisodesCount() {
            return ((SectionData) this.instance).getEpisodesCount();
        }

        public List<ViewEpisode> getEpisodesList() {
            return Collections.unmodifiableList(((SectionData) this.instance).getEpisodesList());
        }

        public int getId() {
            return ((SectionData) this.instance).getId();
        }

        public Style getModuleStyle() {
            return ((SectionData) this.instance).getModuleStyle();
        }

        public String getMore() {
            return ((SectionData) this.instance).getMore();
        }

        public String getMoreBottomDesc() {
            return ((SectionData) this.instance).getMoreBottomDesc();
        }

        public ByteString getMoreBottomDescBytes() {
            return ((SectionData) this.instance).getMoreBottomDescBytes();
        }

        public ByteString getMoreBytes() {
            return ((SectionData) this.instance).getMoreBytes();
        }

        public Button getMoreLeft() {
            return ((SectionData) this.instance).getMoreLeft();
        }

        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        public int getReportCount() {
            return ((SectionData) this.instance).getReportMap().size();
        }

        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((SectionData) this.instance).getReportMap());
        }

        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((SectionData) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((SectionData) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public SerialSeason getSeasons(int i) {
            return ((SectionData) this.instance).getSeasons(i);
        }

        public int getSeasonsCount() {
            return ((SectionData) this.instance).getSeasonsCount();
        }

        public List<SerialSeason> getSeasonsList() {
            return Collections.unmodifiableList(((SectionData) this.instance).getSeasonsList());
        }

        public int getSectionId() {
            return ((SectionData) this.instance).getSectionId();
        }

        public String getSplitText() {
            return ((SectionData) this.instance).getSplitText();
        }

        public ByteString getSplitTextBytes() {
            return ((SectionData) this.instance).getSplitTextBytes();
        }

        public String getTitle() {
            return ((SectionData) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((SectionData) this.instance).getTitleBytes();
        }

        public int getType() {
            return ((SectionData) this.instance).getType();
        }

        public boolean hasModuleStyle() {
            return ((SectionData) this.instance).hasModuleStyle();
        }

        public boolean hasMoreLeft() {
            return ((SectionData) this.instance).hasMoreLeft();
        }

        public Builder mergeModuleStyle(Style style) {
            copyOnWrite();
            ((SectionData) this.instance).mergeModuleStyle(style);
            return this;
        }

        public Builder mergeMoreLeft(Button button) {
            copyOnWrite();
            ((SectionData) this.instance).mergeMoreLeft(button);
            return this;
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((SectionData) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((SectionData) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeEpisodes(int i) {
            copyOnWrite();
            ((SectionData) this.instance).removeEpisodes(i);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((SectionData) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder removeSeasons(int i) {
            copyOnWrite();
            ((SectionData) this.instance).removeSeasons(i);
            return this;
        }

        public Builder setCanOrdDesc(int i) {
            copyOnWrite();
            ((SectionData) this.instance).setCanOrdDesc(i);
            return this;
        }

        public Builder setEpisodeIds(int i, int i2) {
            copyOnWrite();
            ((SectionData) this.instance).setEpisodeIds(i, i2);
            return this;
        }

        public Builder setEpisodes(int i, ViewEpisode viewEpisode) {
            copyOnWrite();
            ((SectionData) this.instance).setEpisodes(i, viewEpisode);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((SectionData) this.instance).setId(i);
            return this;
        }

        public Builder setModuleStyle(Style style) {
            copyOnWrite();
            ((SectionData) this.instance).setModuleStyle(style);
            return this;
        }

        public Builder setMore(String str) {
            copyOnWrite();
            ((SectionData) this.instance).setMore(str);
            return this;
        }

        public Builder setMoreBottomDesc(String str) {
            copyOnWrite();
            ((SectionData) this.instance).setMoreBottomDesc(str);
            return this;
        }

        public Builder setMoreBottomDescBytes(ByteString byteString) {
            copyOnWrite();
            ((SectionData) this.instance).setMoreBottomDescBytes(byteString);
            return this;
        }

        public Builder setMoreBytes(ByteString byteString) {
            copyOnWrite();
            ((SectionData) this.instance).setMoreBytes(byteString);
            return this;
        }

        public Builder setMoreLeft(Button button) {
            copyOnWrite();
            ((SectionData) this.instance).setMoreLeft(button);
            return this;
        }

        public Builder setSeasons(int i, SerialSeason serialSeason) {
            copyOnWrite();
            ((SectionData) this.instance).setSeasons(i, serialSeason);
            return this;
        }

        public Builder setSectionId(int i) {
            copyOnWrite();
            ((SectionData) this.instance).setSectionId(i);
            return this;
        }

        public Builder setSplitText(String str) {
            copyOnWrite();
            ((SectionData) this.instance).setSplitText(str);
            return this;
        }

        public Builder setSplitTextBytes(ByteString byteString) {
            copyOnWrite();
            ((SectionData) this.instance).setSplitTextBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((SectionData) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((SectionData) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((SectionData) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(SectionData.DEFAULT_INSTANCE);
        }

        public Builder addEpisodes(int i, ViewEpisode viewEpisode) {
            copyOnWrite();
            ((SectionData) this.instance).addEpisodes(i, viewEpisode);
            return this;
        }

        public Builder addSeasons(int i, SerialSeason serialSeason) {
            copyOnWrite();
            ((SectionData) this.instance).addSeasons(i, serialSeason);
            return this;
        }

        public Builder setEpisodes(int i, ViewEpisode.Builder builder) {
            copyOnWrite();
            ((SectionData) this.instance).setEpisodes(i, builder.build());
            return this;
        }

        public Builder setModuleStyle(Style.Builder builder) {
            copyOnWrite();
            ((SectionData) this.instance).setModuleStyle(builder.build());
            return this;
        }

        public Builder setMoreLeft(Button.Builder builder) {
            copyOnWrite();
            ((SectionData) this.instance).setMoreLeft(builder.build());
            return this;
        }

        public Builder setSeasons(int i, SerialSeason.Builder builder) {
            copyOnWrite();
            ((SectionData) this.instance).setSeasons(i, builder.build());
            return this;
        }

        public Builder addEpisodes(ViewEpisode.Builder builder) {
            copyOnWrite();
            ((SectionData) this.instance).addEpisodes(builder.build());
            return this;
        }

        public Builder addSeasons(SerialSeason.Builder builder) {
            copyOnWrite();
            ((SectionData) this.instance).addSeasons(builder.build());
            return this;
        }

        public Builder addEpisodes(int i, ViewEpisode.Builder builder) {
            copyOnWrite();
            ((SectionData) this.instance).addEpisodes(i, builder.build());
            return this;
        }

        public Builder addSeasons(int i, SerialSeason.Builder builder) {
            copyOnWrite();
            ((SectionData) this.instance).addSeasons(i, builder.build());
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
        SectionData sectionData = new SectionData();
        DEFAULT_INSTANCE = sectionData;
        GeneratedMessageLite.registerDefaultInstance(SectionData.class, sectionData);
    }

    public SectionData() {
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
    public void addAllSeasons(Iterable<? extends SerialSeason> iterable) {
        ensureSeasonsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.seasons_);
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
    public void addSeasons(SerialSeason serialSeason) {
        serialSeason.getClass();
        ensureSeasonsIsMutable();
        this.seasons_.add(serialSeason);
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
    public void clearMoreBottomDesc() {
        this.moreBottomDesc_ = getDefaultInstance().getMoreBottomDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoreLeft() {
        this.moreLeft_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasons() {
        this.seasons_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSectionId() {
        this.sectionId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSplitText() {
        this.splitText_ = getDefaultInstance().getSplitText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
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

    private void ensureSeasonsIsMutable() {
        Internal.ProtobufList<SerialSeason> protobufList = this.seasons_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.seasons_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static SectionData getDefaultInstance() {
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
    public void mergeMoreLeft(Button button) {
        button.getClass();
        Button button2 = this.moreLeft_;
        if (button2 != null && button2 != Button.getDefaultInstance()) {
            this.moreLeft_ = Button.newBuilder(this.moreLeft_).mergeFrom((Button) button).buildPartial();
        } else {
            this.moreLeft_ = button;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SectionData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SectionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SectionData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SectionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SectionData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEpisodes(int i) {
        ensureEpisodesIsMutable();
        this.episodes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSeasons(int i) {
        ensureSeasonsIsMutable();
        this.seasons_.remove(i);
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
    public void setMoreBottomDesc(String str) {
        str.getClass();
        this.moreBottomDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreBottomDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.moreBottomDesc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.more_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreLeft(Button button) {
        button.getClass();
        this.moreLeft_ = button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasons(int i, SerialSeason serialSeason) {
        serialSeason.getClass();
        ensureSeasonsIsMutable();
        this.seasons_.set(i, serialSeason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSectionId(int i) {
        this.sectionId_ = i;
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
        switch (C70571.f17035xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SectionData();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0001\u0003\u0000\u0001\u0004\u0002\u0004\u0003\u0208\u0004\u0004\u0005\u0208\u0006'\u0007\u001b\b\u0208\t\t\n\u0208\u000b\u001b\f\t\r\u0004\u000e2", new Object[]{"id_", "sectionId_", "title_", "canOrdDesc_", "more_", "episodeIds_", "episodes_", ViewEpisode.class, "splitText_", "moduleStyle_", "moreBottomDesc_", "seasons_", SerialSeason.class, "moreLeft_", "type_", "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SectionData> parser = PARSER;
                if (parser == null) {
                    synchronized (SectionData.class) {
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

    public String getMoreBottomDesc() {
        return this.moreBottomDesc_;
    }

    public ByteString getMoreBottomDescBytes() {
        return ByteString.copyFromUtf8(this.moreBottomDesc_);
    }

    public ByteString getMoreBytes() {
        return ByteString.copyFromUtf8(this.more_);
    }

    public Button getMoreLeft() {
        Button button = this.moreLeft_;
        return button == null ? Button.getDefaultInstance() : button;
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

    public SerialSeason getSeasons(int i) {
        return this.seasons_.get(i);
    }

    public int getSeasonsCount() {
        return this.seasons_.size();
    }

    public List<SerialSeason> getSeasonsList() {
        return this.seasons_;
    }

    public SerialSeasonOrBuilder getSeasonsOrBuilder(int i) {
        return this.seasons_.get(i);
    }

    public List<? extends SerialSeasonOrBuilder> getSeasonsOrBuilderList() {
        return this.seasons_;
    }

    public int getSectionId() {
        return this.sectionId_;
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

    public int getType() {
        return this.type_;
    }

    public boolean hasModuleStyle() {
        return this.moduleStyle_ != null;
    }

    public boolean hasMoreLeft() {
        return this.moreLeft_ != null;
    }

    public static Builder newBuilder(SectionData sectionData) {
        return DEFAULT_INSTANCE.createBuilder(sectionData);
    }

    public static SectionData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SectionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SectionData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SectionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SectionData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SectionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodes(int i, ViewEpisode viewEpisode) {
        viewEpisode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(i, viewEpisode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSeasons(int i, SerialSeason serialSeason) {
        serialSeason.getClass();
        ensureSeasonsIsMutable();
        this.seasons_.add(i, serialSeason);
    }

    public static SectionData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SectionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SectionData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SectionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SectionData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SectionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SectionData parseFrom(InputStream inputStream) throws IOException {
        return (SectionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SectionData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SectionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SectionData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SectionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SectionData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SectionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
