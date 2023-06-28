package com.bapis.bilibili.app.archive.v1;

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
/* loaded from: classes12.dex */
public final class Arc extends GeneratedMessageLite<Arc, Arc.Builder> implements MessageLiteOrBuilder {
    public static final int ACCESS_FIELD_NUMBER = 12;
    public static final int AID_FIELD_NUMBER = 1;
    public static final int ATTRIBUTE_FIELD_NUMBER = 13;
    public static final int ATTRIBUTE_V2_FIELD_NUMBER = 30;
    public static final int AUTHOR_FIELD_NUMBER = 22;
    public static final int COPYRIGHT_FIELD_NUMBER = 5;
    public static final int CTIME_FIELD_NUMBER = 9;
    private static final Arc DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 10;
    public static final int DIMENSION_FIELD_NUMBER = 27;
    public static final int DURATION_FIELD_NUMBER = 16;
    public static final int DYNAMIC_FIELD_NUMBER = 25;
    public static final int FIRST_CID_FIELD_NUMBER = 26;
    public static final int FIRST_FRAME_FIELD_NUMBER = 42;
    public static final int FORWARD_FIELD_NUMBER = 20;
    public static final int MISSION_ID_FIELD_NUMBER = 17;
    public static final int ORDER_ID_FIELD_NUMBER = 18;
    private static volatile Parser<Arc> PARSER = null;
    public static final int PIC_FIELD_NUMBER = 6;
    public static final int PUBDATE_FIELD_NUMBER = 8;
    public static final int REDIRECT_URL_FIELD_NUMBER = 19;
    public static final int REPORT_RESULT_FIELD_NUMBER = 24;
    public static final int RIGHTS_FIELD_NUMBER = 21;
    public static final int SEASON_ID_FIELD_NUMBER = 29;
    public static final int SEASON_THEME_FIELD_NUMBER = 31;
    public static final int SHORT_LINK_V2_FIELD_NUMBER = 40;
    public static final int STAFF_INFO_FIELD_NUMBER = 28;
    public static final int STATE_FIELD_NUMBER = 11;
    public static final int STAT_FIELD_NUMBER = 23;
    public static final int TAGS_FIELD_NUMBER = 15;
    public static final int TAG_FIELD_NUMBER = 14;
    public static final int TITLE_FIELD_NUMBER = 7;
    public static final int TYPE_ID_FIELD_NUMBER = 3;
    public static final int TYPE_NAME_FIELD_NUMBER = 4;
    public static final int UP_FROM_V2_FIELD_NUMBER = 41;
    public static final int VIDEOS_FIELD_NUMBER = 2;
    private int access_;
    private long aid_;
    private long attributeV2_;
    private int attribute_;
    private Author author_;
    private int copyright_;
    private long ctime_;
    private Dimension dimension_;
    private long duration_;
    private long firstCid_;
    private long forward_;
    private long missionId_;
    private long orderId_;
    private long pubdate_;
    private Rights rights_;
    private long seasonId_;
    private SeasonTheme seasonTheme_;
    private Stat stat_;
    private int state_;
    private int typeId_;
    private int upFromV2_;
    private long videos_;
    private String typeName_ = "";
    private String pic_ = "";
    private String title_ = "";
    private String desc_ = "";
    private String tag_ = "";
    private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();
    private String redirectUrl_ = "";
    private String reportResult_ = "";
    private String dynamic_ = "";
    private Internal.ProtobufList<StaffInfo> staffInfo_ = GeneratedMessageLite.emptyProtobufList();
    private String shortLinkV2_ = "";
    private String firstFrame_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.archive.v1.Arc$1 */
    /* loaded from: classes12.dex */
    static /* synthetic */ class C55151 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15725xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15725xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15725xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15725xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15725xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15725xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15725xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15725xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes12.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Arc, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C55151 c55151) {
            this();
        }

        public Builder addAllStaffInfo(Iterable<? extends StaffInfo> iterable) {
            copyOnWrite();
            ((Arc) this.instance).addAllStaffInfo(iterable);
            return this;
        }

        public Builder addAllTags(Iterable<String> iterable) {
            copyOnWrite();
            ((Arc) this.instance).addAllTags(iterable);
            return this;
        }

        public Builder addStaffInfo(StaffInfo staffInfo) {
            copyOnWrite();
            ((Arc) this.instance).addStaffInfo(staffInfo);
            return this;
        }

        public Builder addTags(String str) {
            copyOnWrite();
            ((Arc) this.instance).addTags(str);
            return this;
        }

        public Builder addTagsBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).addTagsBytes(byteString);
            return this;
        }

        public Builder clearAccess() {
            copyOnWrite();
            ((Arc) this.instance).clearAccess();
            return this;
        }

        public Builder clearAid() {
            copyOnWrite();
            ((Arc) this.instance).clearAid();
            return this;
        }

        public Builder clearAttribute() {
            copyOnWrite();
            ((Arc) this.instance).clearAttribute();
            return this;
        }

        public Builder clearAttributeV2() {
            copyOnWrite();
            ((Arc) this.instance).clearAttributeV2();
            return this;
        }

        public Builder clearAuthor() {
            copyOnWrite();
            ((Arc) this.instance).clearAuthor();
            return this;
        }

        public Builder clearCopyright() {
            copyOnWrite();
            ((Arc) this.instance).clearCopyright();
            return this;
        }

        public Builder clearCtime() {
            copyOnWrite();
            ((Arc) this.instance).clearCtime();
            return this;
        }

        public Builder clearDesc() {
            copyOnWrite();
            ((Arc) this.instance).clearDesc();
            return this;
        }

        public Builder clearDimension() {
            copyOnWrite();
            ((Arc) this.instance).clearDimension();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((Arc) this.instance).clearDuration();
            return this;
        }

        public Builder clearDynamic() {
            copyOnWrite();
            ((Arc) this.instance).clearDynamic();
            return this;
        }

        public Builder clearFirstCid() {
            copyOnWrite();
            ((Arc) this.instance).clearFirstCid();
            return this;
        }

        public Builder clearFirstFrame() {
            copyOnWrite();
            ((Arc) this.instance).clearFirstFrame();
            return this;
        }

        public Builder clearForward() {
            copyOnWrite();
            ((Arc) this.instance).clearForward();
            return this;
        }

        public Builder clearMissionId() {
            copyOnWrite();
            ((Arc) this.instance).clearMissionId();
            return this;
        }

        public Builder clearOrderId() {
            copyOnWrite();
            ((Arc) this.instance).clearOrderId();
            return this;
        }

        public Builder clearPic() {
            copyOnWrite();
            ((Arc) this.instance).clearPic();
            return this;
        }

        public Builder clearPubdate() {
            copyOnWrite();
            ((Arc) this.instance).clearPubdate();
            return this;
        }

        public Builder clearRedirectUrl() {
            copyOnWrite();
            ((Arc) this.instance).clearRedirectUrl();
            return this;
        }

        public Builder clearReportResult() {
            copyOnWrite();
            ((Arc) this.instance).clearReportResult();
            return this;
        }

        public Builder clearRights() {
            copyOnWrite();
            ((Arc) this.instance).clearRights();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((Arc) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearSeasonTheme() {
            copyOnWrite();
            ((Arc) this.instance).clearSeasonTheme();
            return this;
        }

        public Builder clearShortLinkV2() {
            copyOnWrite();
            ((Arc) this.instance).clearShortLinkV2();
            return this;
        }

        public Builder clearStaffInfo() {
            copyOnWrite();
            ((Arc) this.instance).clearStaffInfo();
            return this;
        }

        public Builder clearStat() {
            copyOnWrite();
            ((Arc) this.instance).clearStat();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((Arc) this.instance).clearState();
            return this;
        }

        public Builder clearTag() {
            copyOnWrite();
            ((Arc) this.instance).clearTag();
            return this;
        }

        public Builder clearTags() {
            copyOnWrite();
            ((Arc) this.instance).clearTags();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Arc) this.instance).clearTitle();
            return this;
        }

        public Builder clearTypeId() {
            copyOnWrite();
            ((Arc) this.instance).clearTypeId();
            return this;
        }

        public Builder clearTypeName() {
            copyOnWrite();
            ((Arc) this.instance).clearTypeName();
            return this;
        }

        public Builder clearUpFromV2() {
            copyOnWrite();
            ((Arc) this.instance).clearUpFromV2();
            return this;
        }

        public Builder clearVideos() {
            copyOnWrite();
            ((Arc) this.instance).clearVideos();
            return this;
        }

        public int getAccess() {
            return ((Arc) this.instance).getAccess();
        }

        public long getAid() {
            return ((Arc) this.instance).getAid();
        }

        public int getAttribute() {
            return ((Arc) this.instance).getAttribute();
        }

        public long getAttributeV2() {
            return ((Arc) this.instance).getAttributeV2();
        }

        public Author getAuthor() {
            return ((Arc) this.instance).getAuthor();
        }

        public int getCopyright() {
            return ((Arc) this.instance).getCopyright();
        }

        public long getCtime() {
            return ((Arc) this.instance).getCtime();
        }

        public String getDesc() {
            return ((Arc) this.instance).getDesc();
        }

        public ByteString getDescBytes() {
            return ((Arc) this.instance).getDescBytes();
        }

        public Dimension getDimension() {
            return ((Arc) this.instance).getDimension();
        }

        public long getDuration() {
            return ((Arc) this.instance).getDuration();
        }

        public String getDynamic() {
            return ((Arc) this.instance).getDynamic();
        }

        public ByteString getDynamicBytes() {
            return ((Arc) this.instance).getDynamicBytes();
        }

        public long getFirstCid() {
            return ((Arc) this.instance).getFirstCid();
        }

        public String getFirstFrame() {
            return ((Arc) this.instance).getFirstFrame();
        }

        public ByteString getFirstFrameBytes() {
            return ((Arc) this.instance).getFirstFrameBytes();
        }

        public long getForward() {
            return ((Arc) this.instance).getForward();
        }

        public long getMissionId() {
            return ((Arc) this.instance).getMissionId();
        }

        public long getOrderId() {
            return ((Arc) this.instance).getOrderId();
        }

        public String getPic() {
            return ((Arc) this.instance).getPic();
        }

        public ByteString getPicBytes() {
            return ((Arc) this.instance).getPicBytes();
        }

        public long getPubdate() {
            return ((Arc) this.instance).getPubdate();
        }

        public String getRedirectUrl() {
            return ((Arc) this.instance).getRedirectUrl();
        }

        public ByteString getRedirectUrlBytes() {
            return ((Arc) this.instance).getRedirectUrlBytes();
        }

        public String getReportResult() {
            return ((Arc) this.instance).getReportResult();
        }

        public ByteString getReportResultBytes() {
            return ((Arc) this.instance).getReportResultBytes();
        }

        public Rights getRights() {
            return ((Arc) this.instance).getRights();
        }

        public long getSeasonId() {
            return ((Arc) this.instance).getSeasonId();
        }

        public SeasonTheme getSeasonTheme() {
            return ((Arc) this.instance).getSeasonTheme();
        }

        public String getShortLinkV2() {
            return ((Arc) this.instance).getShortLinkV2();
        }

        public ByteString getShortLinkV2Bytes() {
            return ((Arc) this.instance).getShortLinkV2Bytes();
        }

        public StaffInfo getStaffInfo(int i) {
            return ((Arc) this.instance).getStaffInfo(i);
        }

        public int getStaffInfoCount() {
            return ((Arc) this.instance).getStaffInfoCount();
        }

        public List<StaffInfo> getStaffInfoList() {
            return Collections.unmodifiableList(((Arc) this.instance).getStaffInfoList());
        }

        public Stat getStat() {
            return ((Arc) this.instance).getStat();
        }

        public int getState() {
            return ((Arc) this.instance).getState();
        }

        public String getTag() {
            return ((Arc) this.instance).getTag();
        }

        public ByteString getTagBytes() {
            return ((Arc) this.instance).getTagBytes();
        }

        public String getTags(int i) {
            return ((Arc) this.instance).getTags(i);
        }

        public ByteString getTagsBytes(int i) {
            return ((Arc) this.instance).getTagsBytes(i);
        }

        public int getTagsCount() {
            return ((Arc) this.instance).getTagsCount();
        }

        public List<String> getTagsList() {
            return Collections.unmodifiableList(((Arc) this.instance).getTagsList());
        }

        public String getTitle() {
            return ((Arc) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Arc) this.instance).getTitleBytes();
        }

        public int getTypeId() {
            return ((Arc) this.instance).getTypeId();
        }

        public String getTypeName() {
            return ((Arc) this.instance).getTypeName();
        }

        public ByteString getTypeNameBytes() {
            return ((Arc) this.instance).getTypeNameBytes();
        }

        public int getUpFromV2() {
            return ((Arc) this.instance).getUpFromV2();
        }

        public long getVideos() {
            return ((Arc) this.instance).getVideos();
        }

        public boolean hasAuthor() {
            return ((Arc) this.instance).hasAuthor();
        }

        public boolean hasDimension() {
            return ((Arc) this.instance).hasDimension();
        }

        public boolean hasRights() {
            return ((Arc) this.instance).hasRights();
        }

        public boolean hasSeasonTheme() {
            return ((Arc) this.instance).hasSeasonTheme();
        }

        public boolean hasStat() {
            return ((Arc) this.instance).hasStat();
        }

        public Builder mergeAuthor(Author author) {
            copyOnWrite();
            ((Arc) this.instance).mergeAuthor(author);
            return this;
        }

        public Builder mergeDimension(Dimension dimension) {
            copyOnWrite();
            ((Arc) this.instance).mergeDimension(dimension);
            return this;
        }

        public Builder mergeRights(Rights rights) {
            copyOnWrite();
            ((Arc) this.instance).mergeRights(rights);
            return this;
        }

        public Builder mergeSeasonTheme(SeasonTheme seasonTheme) {
            copyOnWrite();
            ((Arc) this.instance).mergeSeasonTheme(seasonTheme);
            return this;
        }

        public Builder mergeStat(Stat stat) {
            copyOnWrite();
            ((Arc) this.instance).mergeStat(stat);
            return this;
        }

        public Builder removeStaffInfo(int i) {
            copyOnWrite();
            ((Arc) this.instance).removeStaffInfo(i);
            return this;
        }

        public Builder setAccess(int i) {
            copyOnWrite();
            ((Arc) this.instance).setAccess(i);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((Arc) this.instance).setAid(j);
            return this;
        }

        public Builder setAttribute(int i) {
            copyOnWrite();
            ((Arc) this.instance).setAttribute(i);
            return this;
        }

        public Builder setAttributeV2(long j) {
            copyOnWrite();
            ((Arc) this.instance).setAttributeV2(j);
            return this;
        }

        public Builder setAuthor(Author author) {
            copyOnWrite();
            ((Arc) this.instance).setAuthor(author);
            return this;
        }

        public Builder setCopyright(int i) {
            copyOnWrite();
            ((Arc) this.instance).setCopyright(i);
            return this;
        }

        public Builder setCtime(long j) {
            copyOnWrite();
            ((Arc) this.instance).setCtime(j);
            return this;
        }

        public Builder setDesc(String str) {
            copyOnWrite();
            ((Arc) this.instance).setDesc(str);
            return this;
        }

        public Builder setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setDescBytes(byteString);
            return this;
        }

        public Builder setDimension(Dimension dimension) {
            copyOnWrite();
            ((Arc) this.instance).setDimension(dimension);
            return this;
        }

        public Builder setDuration(long j) {
            copyOnWrite();
            ((Arc) this.instance).setDuration(j);
            return this;
        }

        public Builder setDynamic(String str) {
            copyOnWrite();
            ((Arc) this.instance).setDynamic(str);
            return this;
        }

        public Builder setDynamicBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setDynamicBytes(byteString);
            return this;
        }

        public Builder setFirstCid(long j) {
            copyOnWrite();
            ((Arc) this.instance).setFirstCid(j);
            return this;
        }

        public Builder setFirstFrame(String str) {
            copyOnWrite();
            ((Arc) this.instance).setFirstFrame(str);
            return this;
        }

        public Builder setFirstFrameBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setFirstFrameBytes(byteString);
            return this;
        }

        public Builder setForward(long j) {
            copyOnWrite();
            ((Arc) this.instance).setForward(j);
            return this;
        }

        public Builder setMissionId(long j) {
            copyOnWrite();
            ((Arc) this.instance).setMissionId(j);
            return this;
        }

        public Builder setOrderId(long j) {
            copyOnWrite();
            ((Arc) this.instance).setOrderId(j);
            return this;
        }

        public Builder setPic(String str) {
            copyOnWrite();
            ((Arc) this.instance).setPic(str);
            return this;
        }

        public Builder setPicBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setPicBytes(byteString);
            return this;
        }

        public Builder setPubdate(long j) {
            copyOnWrite();
            ((Arc) this.instance).setPubdate(j);
            return this;
        }

        public Builder setRedirectUrl(String str) {
            copyOnWrite();
            ((Arc) this.instance).setRedirectUrl(str);
            return this;
        }

        public Builder setRedirectUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setRedirectUrlBytes(byteString);
            return this;
        }

        public Builder setReportResult(String str) {
            copyOnWrite();
            ((Arc) this.instance).setReportResult(str);
            return this;
        }

        public Builder setReportResultBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setReportResultBytes(byteString);
            return this;
        }

        public Builder setRights(Rights rights) {
            copyOnWrite();
            ((Arc) this.instance).setRights(rights);
            return this;
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((Arc) this.instance).setSeasonId(j);
            return this;
        }

        public Builder setSeasonTheme(SeasonTheme seasonTheme) {
            copyOnWrite();
            ((Arc) this.instance).setSeasonTheme(seasonTheme);
            return this;
        }

        public Builder setShortLinkV2(String str) {
            copyOnWrite();
            ((Arc) this.instance).setShortLinkV2(str);
            return this;
        }

        public Builder setShortLinkV2Bytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setShortLinkV2Bytes(byteString);
            return this;
        }

        public Builder setStaffInfo(int i, StaffInfo staffInfo) {
            copyOnWrite();
            ((Arc) this.instance).setStaffInfo(i, staffInfo);
            return this;
        }

        public Builder setStat(Stat stat) {
            copyOnWrite();
            ((Arc) this.instance).setStat(stat);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((Arc) this.instance).setState(i);
            return this;
        }

        public Builder setTag(String str) {
            copyOnWrite();
            ((Arc) this.instance).setTag(str);
            return this;
        }

        public Builder setTagBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setTagBytes(byteString);
            return this;
        }

        public Builder setTags(int i, String str) {
            copyOnWrite();
            ((Arc) this.instance).setTags(i, str);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Arc) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setTypeId(int i) {
            copyOnWrite();
            ((Arc) this.instance).setTypeId(i);
            return this;
        }

        public Builder setTypeName(String str) {
            copyOnWrite();
            ((Arc) this.instance).setTypeName(str);
            return this;
        }

        public Builder setTypeNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setTypeNameBytes(byteString);
            return this;
        }

        public Builder setUpFromV2(int i) {
            copyOnWrite();
            ((Arc) this.instance).setUpFromV2(i);
            return this;
        }

        public Builder setVideos(long j) {
            copyOnWrite();
            ((Arc) this.instance).setVideos(j);
            return this;
        }

        private Builder() {
            super(Arc.DEFAULT_INSTANCE);
        }

        public Builder addStaffInfo(int i, StaffInfo staffInfo) {
            copyOnWrite();
            ((Arc) this.instance).addStaffInfo(i, staffInfo);
            return this;
        }

        public Builder setAuthor(Author.Builder builder) {
            copyOnWrite();
            ((Arc) this.instance).setAuthor(builder.build());
            return this;
        }

        public Builder setDimension(Dimension.Builder builder) {
            copyOnWrite();
            ((Arc) this.instance).setDimension(builder.build());
            return this;
        }

        public Builder setRights(Rights.Builder builder) {
            copyOnWrite();
            ((Arc) this.instance).setRights(builder.build());
            return this;
        }

        public Builder setSeasonTheme(SeasonTheme.Builder builder) {
            copyOnWrite();
            ((Arc) this.instance).setSeasonTheme(builder.build());
            return this;
        }

        public Builder setStaffInfo(int i, StaffInfo.Builder builder) {
            copyOnWrite();
            ((Arc) this.instance).setStaffInfo(i, builder.build());
            return this;
        }

        public Builder setStat(Stat.Builder builder) {
            copyOnWrite();
            ((Arc) this.instance).setStat(builder.build());
            return this;
        }

        public Builder addStaffInfo(StaffInfo.Builder builder) {
            copyOnWrite();
            ((Arc) this.instance).addStaffInfo(builder.build());
            return this;
        }

        public Builder addStaffInfo(int i, StaffInfo.Builder builder) {
            copyOnWrite();
            ((Arc) this.instance).addStaffInfo(i, builder.build());
            return this;
        }
    }

    static {
        Arc arc = new Arc();
        DEFAULT_INSTANCE = arc;
        GeneratedMessageLite.registerDefaultInstance(Arc.class, arc);
    }

    private Arc() {
    }

    public void addAllStaffInfo(Iterable<? extends StaffInfo> iterable) {
        ensureStaffInfoIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.staffInfo_);
    }

    public void addAllTags(Iterable<String> iterable) {
        ensureTagsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.tags_);
    }

    public void addStaffInfo(StaffInfo staffInfo) {
        staffInfo.getClass();
        ensureStaffInfoIsMutable();
        this.staffInfo_.add(staffInfo);
    }

    public void addTags(String str) {
        str.getClass();
        ensureTagsIsMutable();
        this.tags_.add(str);
    }

    public void addTagsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureTagsIsMutable();
        this.tags_.add(byteString.toStringUtf8());
    }

    public void clearAccess() {
        this.access_ = 0;
    }

    public void clearAid() {
        this.aid_ = 0L;
    }

    public void clearAttribute() {
        this.attribute_ = 0;
    }

    public void clearAttributeV2() {
        this.attributeV2_ = 0L;
    }

    public void clearAuthor() {
        this.author_ = null;
    }

    public void clearCopyright() {
        this.copyright_ = 0;
    }

    public void clearCtime() {
        this.ctime_ = 0L;
    }

    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    public void clearDimension() {
        this.dimension_ = null;
    }

    public void clearDuration() {
        this.duration_ = 0L;
    }

    public void clearDynamic() {
        this.dynamic_ = getDefaultInstance().getDynamic();
    }

    public void clearFirstCid() {
        this.firstCid_ = 0L;
    }

    public void clearFirstFrame() {
        this.firstFrame_ = getDefaultInstance().getFirstFrame();
    }

    public void clearForward() {
        this.forward_ = 0L;
    }

    public void clearMissionId() {
        this.missionId_ = 0L;
    }

    public void clearOrderId() {
        this.orderId_ = 0L;
    }

    public void clearPic() {
        this.pic_ = getDefaultInstance().getPic();
    }

    public void clearPubdate() {
        this.pubdate_ = 0L;
    }

    public void clearRedirectUrl() {
        this.redirectUrl_ = getDefaultInstance().getRedirectUrl();
    }

    public void clearReportResult() {
        this.reportResult_ = getDefaultInstance().getReportResult();
    }

    public void clearRights() {
        this.rights_ = null;
    }

    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    public void clearSeasonTheme() {
        this.seasonTheme_ = null;
    }

    public void clearShortLinkV2() {
        this.shortLinkV2_ = getDefaultInstance().getShortLinkV2();
    }

    public void clearStaffInfo() {
        this.staffInfo_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearStat() {
        this.stat_ = null;
    }

    public void clearState() {
        this.state_ = 0;
    }

    public void clearTag() {
        this.tag_ = getDefaultInstance().getTag();
    }

    public void clearTags() {
        this.tags_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public void clearTypeId() {
        this.typeId_ = 0;
    }

    public void clearTypeName() {
        this.typeName_ = getDefaultInstance().getTypeName();
    }

    public void clearUpFromV2() {
        this.upFromV2_ = 0;
    }

    public void clearVideos() {
        this.videos_ = 0L;
    }

    private void ensureStaffInfoIsMutable() {
        Internal.ProtobufList<StaffInfo> protobufList = this.staffInfo_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.staffInfo_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTagsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.tags_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Arc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAuthor(Author author) {
    }

    public void mergeDimension(Dimension dimension) {
    }

    public void mergeRights(Rights rights) {
    }

    public void mergeSeasonTheme(SeasonTheme seasonTheme) {
    }

    public void mergeStat(Stat stat) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Arc parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Arc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Arc parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Arc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeStaffInfo(int i) {
        ensureStaffInfoIsMutable();
        this.staffInfo_.remove(i);
    }

    public void setAccess(int i) {
        this.access_ = i;
    }

    public void setAid(long j) {
        this.aid_ = j;
    }

    public void setAttribute(int i) {
        this.attribute_ = i;
    }

    public void setAttributeV2(long j) {
        this.attributeV2_ = j;
    }

    public void setAuthor(Author author) {
        author.getClass();
        this.author_ = author;
    }

    public void setCopyright(int i) {
        this.copyright_ = i;
    }

    public void setCtime(long j) {
        this.ctime_ = j;
    }

    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    public void setDimension(Dimension dimension) {
        dimension.getClass();
        this.dimension_ = dimension;
    }

    public void setDuration(long j) {
        this.duration_ = j;
    }

    public void setDynamic(String str) {
        str.getClass();
        this.dynamic_ = str;
    }

    public void setDynamicBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dynamic_ = byteString.toStringUtf8();
    }

    public void setFirstCid(long j) {
        this.firstCid_ = j;
    }

    public void setFirstFrame(String str) {
        str.getClass();
        this.firstFrame_ = str;
    }

    public void setFirstFrameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.firstFrame_ = byteString.toStringUtf8();
    }

    public void setForward(long j) {
        this.forward_ = j;
    }

    public void setMissionId(long j) {
        this.missionId_ = j;
    }

    public void setOrderId(long j) {
        this.orderId_ = j;
    }

    public void setPic(String str) {
        str.getClass();
        this.pic_ = str;
    }

    public void setPicBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pic_ = byteString.toStringUtf8();
    }

    public void setPubdate(long j) {
        this.pubdate_ = j;
    }

    public void setRedirectUrl(String str) {
        str.getClass();
        this.redirectUrl_ = str;
    }

    public void setRedirectUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.redirectUrl_ = byteString.toStringUtf8();
    }

    public void setReportResult(String str) {
        str.getClass();
        this.reportResult_ = str;
    }

    public void setReportResultBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reportResult_ = byteString.toStringUtf8();
    }

    public void setRights(Rights rights) {
        rights.getClass();
        this.rights_ = rights;
    }

    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    public void setSeasonTheme(SeasonTheme seasonTheme) {
        seasonTheme.getClass();
        this.seasonTheme_ = seasonTheme;
    }

    public void setShortLinkV2(String str) {
        str.getClass();
        this.shortLinkV2_ = str;
    }

    public void setShortLinkV2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shortLinkV2_ = byteString.toStringUtf8();
    }

    public void setStaffInfo(int i, StaffInfo staffInfo) {
        staffInfo.getClass();
        ensureStaffInfoIsMutable();
        this.staffInfo_.set(i, staffInfo);
    }

    public void setStat(Stat stat) {
        stat.getClass();
        this.stat_ = stat;
    }

    public void setState(int i) {
        this.state_ = i;
    }

    public void setTag(String str) {
        str.getClass();
        this.tag_ = str;
    }

    public void setTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tag_ = byteString.toStringUtf8();
    }

    public void setTags(int i, String str) {
        str.getClass();
        ensureTagsIsMutable();
        this.tags_.set(i, str);
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public void setTypeId(int i) {
        this.typeId_ = i;
    }

    public void setTypeName(String str) {
        str.getClass();
        this.typeName_ = str;
    }

    public void setTypeNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.typeName_ = byteString.toStringUtf8();
    }

    public void setUpFromV2(int i) {
        this.upFromV2_ = i;
    }

    public void setVideos(long j) {
        this.videos_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C55151.f15725xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Arc();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\"\u0000\u0000\u0001*\"\u0000\u0002\u0000\u0001\u0002\u0002\u0002\u0003\u0004\u0004\u0208\u0005\u0004\u0006\u0208\u0007\u0208\b\u0002\t\u0002\n\u0208\u000b\u0004\f\u0004\r\u0004\u000e\u0208\u000f\u021a\u0010\u0002\u0011\u0002\u0012\u0002\u0013\u0208\u0014\u0002\u0015\t\u0016\t\u0017\t\u0018\u0208\u0019\u0208\u001a\u0002\u001b\t\u001c\u001b\u001d\u0002\u001e\u0002\u001f\t(\u0208)\u0004*\u0208", new Object[]{"aid_", "videos_", "typeId_", "typeName_", "copyright_", "pic_", "title_", "pubdate_", "ctime_", "desc_", "state_", "access_", "attribute_", "tag_", "tags_", "duration_", "missionId_", "orderId_", "redirectUrl_", "forward_", "rights_", "author_", "stat_", "reportResult_", "dynamic_", "firstCid_", "dimension_", "staffInfo_", StaffInfo.class, "seasonId_", "attributeV2_", "seasonTheme_", "shortLinkV2_", "upFromV2_", "firstFrame_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Arc> parser = PARSER;
                if (parser == null) {
                    synchronized (Arc.class) {
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

    public int getAccess() {
        return this.access_;
    }

    public long getAid() {
        return this.aid_;
    }

    public int getAttribute() {
        return this.attribute_;
    }

    public long getAttributeV2() {
        return this.attributeV2_;
    }

    public Author getAuthor() {
        Author author = this.author_;
        return author == null ? Author.getDefaultInstance() : author;
    }

    public int getCopyright() {
        return this.copyright_;
    }

    public long getCtime() {
        return this.ctime_;
    }

    public String getDesc() {
        return this.desc_;
    }

    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    public Dimension getDimension() {
        Dimension dimension = this.dimension_;
        return dimension == null ? Dimension.getDefaultInstance() : dimension;
    }

    public long getDuration() {
        return this.duration_;
    }

    public String getDynamic() {
        return this.dynamic_;
    }

    public ByteString getDynamicBytes() {
        return ByteString.copyFromUtf8(this.dynamic_);
    }

    public long getFirstCid() {
        return this.firstCid_;
    }

    public String getFirstFrame() {
        return this.firstFrame_;
    }

    public ByteString getFirstFrameBytes() {
        return ByteString.copyFromUtf8(this.firstFrame_);
    }

    public long getForward() {
        return this.forward_;
    }

    public long getMissionId() {
        return this.missionId_;
    }

    public long getOrderId() {
        return this.orderId_;
    }

    public String getPic() {
        return this.pic_;
    }

    public ByteString getPicBytes() {
        return ByteString.copyFromUtf8(this.pic_);
    }

    public long getPubdate() {
        return this.pubdate_;
    }

    public String getRedirectUrl() {
        return this.redirectUrl_;
    }

    public ByteString getRedirectUrlBytes() {
        return ByteString.copyFromUtf8(this.redirectUrl_);
    }

    public String getReportResult() {
        return this.reportResult_;
    }

    public ByteString getReportResultBytes() {
        return ByteString.copyFromUtf8(this.reportResult_);
    }

    public Rights getRights() {
        Rights rights = this.rights_;
        return rights == null ? Rights.getDefaultInstance() : rights;
    }

    public long getSeasonId() {
        return this.seasonId_;
    }

    public SeasonTheme getSeasonTheme() {
        SeasonTheme seasonTheme = this.seasonTheme_;
        return seasonTheme == null ? SeasonTheme.getDefaultInstance() : seasonTheme;
    }

    public String getShortLinkV2() {
        return this.shortLinkV2_;
    }

    public ByteString getShortLinkV2Bytes() {
        return ByteString.copyFromUtf8(this.shortLinkV2_);
    }

    public StaffInfo getStaffInfo(int i) {
        return this.staffInfo_.get(i);
    }

    public int getStaffInfoCount() {
        return this.staffInfo_.size();
    }

    public List<StaffInfo> getStaffInfoList() {
        return this.staffInfo_;
    }

    public StaffInfoOrBuilder getStaffInfoOrBuilder(int i) {
        return this.staffInfo_.get(i);
    }

    public List<? extends StaffInfoOrBuilder> getStaffInfoOrBuilderList() {
        return this.staffInfo_;
    }

    public Stat getStat() {
        Stat stat = this.stat_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    public int getState() {
        return this.state_;
    }

    public String getTag() {
        return this.tag_;
    }

    public ByteString getTagBytes() {
        return ByteString.copyFromUtf8(this.tag_);
    }

    public String getTags(int i) {
        return this.tags_.get(i);
    }

    public ByteString getTagsBytes(int i) {
        return ByteString.copyFromUtf8(this.tags_.get(i));
    }

    public int getTagsCount() {
        return this.tags_.size();
    }

    public List<String> getTagsList() {
        return this.tags_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public int getTypeId() {
        return this.typeId_;
    }

    public String getTypeName() {
        return this.typeName_;
    }

    public ByteString getTypeNameBytes() {
        return ByteString.copyFromUtf8(this.typeName_);
    }

    public int getUpFromV2() {
        return this.upFromV2_;
    }

    public long getVideos() {
        return this.videos_;
    }

    public boolean hasAuthor() {
        return this.author_ != null;
    }

    public boolean hasDimension() {
        return this.dimension_ != null;
    }

    public boolean hasRights() {
        return this.rights_ != null;
    }

    public boolean hasSeasonTheme() {
        return this.seasonTheme_ != null;
    }

    public boolean hasStat() {
        return this.stat_ != null;
    }

    public static Builder newBuilder(Arc arc) {
        return DEFAULT_INSTANCE.createBuilder(arc);
    }

    public static Arc parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Arc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Arc parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Arc parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addStaffInfo(int i, StaffInfo staffInfo) {
        staffInfo.getClass();
        ensureStaffInfoIsMutable();
        this.staffInfo_.add(i, staffInfo);
    }

    public static Arc parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Arc parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Arc parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Arc parseFrom(InputStream inputStream) throws IOException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Arc parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Arc parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Arc parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
