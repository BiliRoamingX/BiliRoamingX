package com.bapis.bilibili.pgc.gateway.player.v2;

import com.bapis.bilibili.playershared.DrmTechType;
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
/* loaded from: classes14.dex */
public final class PlayViewBusinessInfo extends GeneratedMessageLite<PlayViewBusinessInfo, PlayViewBusinessInfo.Builder> implements MessageLiteOrBuilder {
    public static final int BP_FIELD_NUMBER = 2;
    public static final int CLIP_INFO_FIELD_NUMBER = 6;
    public static final int CONTINUE_PLAY_INFO_FIELD_NUMBER = 5;
    private static final PlayViewBusinessInfo DEFAULT_INSTANCE;
    public static final int DIMENSION_FIELD_NUMBER = 9;
    public static final int DRM_TECH_TYPE_FIELD_NUMBER = 12;
    public static final int EPISODE_ADVERTISEMENT_INFO_FIELD_NUMBER = 19;
    public static final int EPISODE_INFO_FIELD_NUMBER = 18;
    public static final int EP_PUBLICITY_VIDEO_LIST_FIELD_NUMBER = 21;
    public static final int EP_WHOLE_DURATION_FIELD_NUMBER = 8;
    public static final int EXP_MAP_FIELD_NUMBER = 11;
    public static final int INLINE_TYPE_FIELD_NUMBER = 7;
    public static final int IS_DRM_FIELD_NUMBER = 14;
    public static final int IS_LIVE_PRE_FIELD_NUMBER = 17;
    public static final int IS_PREVIEW_FIELD_NUMBER = 1;
    public static final int LIMIT_ACTION_TYPE_FIELD_NUMBER = 13;
    public static final int MARLIN_TOKEN_FIELD_NUMBER = 3;
    private static volatile Parser<PlayViewBusinessInfo> PARSER = null;
    public static final int PLAYBACK_SPEED_COLOR_FIELD_NUMBER = 4;
    public static final int QUALITY_EXT_MAP_FIELD_NUMBER = 10;
    public static final int RECORD_INFO_FIELD_NUMBER = 15;
    public static final int USER_STATUS_FIELD_NUMBER = 20;
    public static final int VIP_STATUS_FIELD_NUMBER = 16;
    private boolean bp_;
    private ContinuePlayInfo continuePlayInfo_;
    private Dimension dimension_;
    private int drmTechType_;
    private int epWholeDuration_;
    private EpisodeAdvertisementInfo episodeAdvertisementInfo_;
    private EpisodeInfo episodeInfo_;
    private int inlineType_;
    private boolean isDrm_;
    private boolean isLivePre_;
    private boolean isPreview_;
    private int limitActionType_;
    private RecordInfo recordInfo_;
    private UserStatus userStatus_;
    private int vipStatus_;
    private MapFieldLite<Integer, QualityExtInfo> qualityExtMap_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Integer> expMap_ = MapFieldLite.emptyMapField();
    private String marlinToken_ = "";
    private String playbackSpeedColor_ = "";
    private Internal.ProtobufList<ClipInfo> clipInfo_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<EpPublicityVideo> epPublicityVideoList_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.PlayViewBusinessInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78671 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17582xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17582xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17582xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17582xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17582xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17582xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17582xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17582xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayViewBusinessInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78671 c78671) {
            this();
        }

        public Builder addAllClipInfo(Iterable<? extends ClipInfo> iterable) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).addAllClipInfo(iterable);
            return this;
        }

        public Builder addAllEpPublicityVideoList(Iterable<? extends EpPublicityVideo> iterable) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).addAllEpPublicityVideoList(iterable);
            return this;
        }

        public Builder addClipInfo(ClipInfo clipInfo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).addClipInfo(clipInfo);
            return this;
        }

        public Builder addEpPublicityVideoList(EpPublicityVideo epPublicityVideo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).addEpPublicityVideoList(epPublicityVideo);
            return this;
        }

        public Builder clearBp() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearBp();
            return this;
        }

        public Builder clearClipInfo() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearClipInfo();
            return this;
        }

        public Builder clearContinuePlayInfo() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearContinuePlayInfo();
            return this;
        }

        public Builder clearDimension() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearDimension();
            return this;
        }

        public Builder clearDrmTechType() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearDrmTechType();
            return this;
        }

        public Builder clearEpPublicityVideoList() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearEpPublicityVideoList();
            return this;
        }

        public Builder clearEpWholeDuration() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearEpWholeDuration();
            return this;
        }

        public Builder clearEpisodeAdvertisementInfo() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearEpisodeAdvertisementInfo();
            return this;
        }

        public Builder clearEpisodeInfo() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearEpisodeInfo();
            return this;
        }

        public Builder clearExpMap() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).getMutableExpMapMap().clear();
            return this;
        }

        public Builder clearInlineType() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearInlineType();
            return this;
        }

        public Builder clearIsDrm() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearIsDrm();
            return this;
        }

        public Builder clearIsLivePre() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearIsLivePre();
            return this;
        }

        public Builder clearIsPreview() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearIsPreview();
            return this;
        }

        public Builder clearLimitActionType() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearLimitActionType();
            return this;
        }

        public Builder clearMarlinToken() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearMarlinToken();
            return this;
        }

        public Builder clearPlaybackSpeedColor() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearPlaybackSpeedColor();
            return this;
        }

        public Builder clearQualityExtMap() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).getMutableQualityExtMapMap().clear();
            return this;
        }

        public Builder clearRecordInfo() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearRecordInfo();
            return this;
        }

        public Builder clearUserStatus() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearUserStatus();
            return this;
        }

        public Builder clearVipStatus() {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).clearVipStatus();
            return this;
        }

        public boolean containsExpMap(String str) {
            str.getClass();
            return ((PlayViewBusinessInfo) this.instance).getExpMapMap().containsKey(str);
        }

        public boolean containsQualityExtMap(int i) {
            return ((PlayViewBusinessInfo) this.instance).getQualityExtMapMap().containsKey(Integer.valueOf(i));
        }

        public boolean getBp() {
            return ((PlayViewBusinessInfo) this.instance).getBp();
        }

        public ClipInfo getClipInfo(int i) {
            return ((PlayViewBusinessInfo) this.instance).getClipInfo(i);
        }

        public int getClipInfoCount() {
            return ((PlayViewBusinessInfo) this.instance).getClipInfoCount();
        }

        public List<ClipInfo> getClipInfoList() {
            return Collections.unmodifiableList(((PlayViewBusinessInfo) this.instance).getClipInfoList());
        }

        public ContinuePlayInfo getContinuePlayInfo() {
            return ((PlayViewBusinessInfo) this.instance).getContinuePlayInfo();
        }

        public Dimension getDimension() {
            return ((PlayViewBusinessInfo) this.instance).getDimension();
        }

        public DrmTechType getDrmTechType() {
            return ((PlayViewBusinessInfo) this.instance).getDrmTechType();
        }

        public int getDrmTechTypeValue() {
            return ((PlayViewBusinessInfo) this.instance).getDrmTechTypeValue();
        }

        public EpPublicityVideo getEpPublicityVideoList(int i) {
            return ((PlayViewBusinessInfo) this.instance).getEpPublicityVideoList(i);
        }

        public int getEpPublicityVideoListCount() {
            return ((PlayViewBusinessInfo) this.instance).getEpPublicityVideoListCount();
        }

        public List<EpPublicityVideo> getEpPublicityVideoListList() {
            return Collections.unmodifiableList(((PlayViewBusinessInfo) this.instance).getEpPublicityVideoListList());
        }

        public int getEpWholeDuration() {
            return ((PlayViewBusinessInfo) this.instance).getEpWholeDuration();
        }

        public EpisodeAdvertisementInfo getEpisodeAdvertisementInfo() {
            return ((PlayViewBusinessInfo) this.instance).getEpisodeAdvertisementInfo();
        }

        public EpisodeInfo getEpisodeInfo() {
            return ((PlayViewBusinessInfo) this.instance).getEpisodeInfo();
        }

        @Deprecated
        public Map<String, Integer> getExpMap() {
            return getExpMapMap();
        }

        public int getExpMapCount() {
            return ((PlayViewBusinessInfo) this.instance).getExpMapMap().size();
        }

        public Map<String, Integer> getExpMapMap() {
            return Collections.unmodifiableMap(((PlayViewBusinessInfo) this.instance).getExpMapMap());
        }

        public int getExpMapOrDefault(String str, int i) {
            str.getClass();
            Map<String, Integer> expMapMap = ((PlayViewBusinessInfo) this.instance).getExpMapMap();
            return expMapMap.containsKey(str) ? expMapMap.get(str).intValue() : i;
        }

        public int getExpMapOrThrow(String str) {
            str.getClass();
            Map<String, Integer> expMapMap = ((PlayViewBusinessInfo) this.instance).getExpMapMap();
            if (expMapMap.containsKey(str)) {
                return expMapMap.get(str).intValue();
            }
            throw new IllegalArgumentException();
        }

        public InlineType getInlineType() {
            return ((PlayViewBusinessInfo) this.instance).getInlineType();
        }

        public int getInlineTypeValue() {
            return ((PlayViewBusinessInfo) this.instance).getInlineTypeValue();
        }

        public boolean getIsDrm() {
            return ((PlayViewBusinessInfo) this.instance).getIsDrm();
        }

        public boolean getIsLivePre() {
            return ((PlayViewBusinessInfo) this.instance).getIsLivePre();
        }

        public boolean getIsPreview() {
            return ((PlayViewBusinessInfo) this.instance).getIsPreview();
        }

        public LimitActionType getLimitActionType() {
            return ((PlayViewBusinessInfo) this.instance).getLimitActionType();
        }

        public int getLimitActionTypeValue() {
            return ((PlayViewBusinessInfo) this.instance).getLimitActionTypeValue();
        }

        public String getMarlinToken() {
            return ((PlayViewBusinessInfo) this.instance).getMarlinToken();
        }

        public ByteString getMarlinTokenBytes() {
            return ((PlayViewBusinessInfo) this.instance).getMarlinTokenBytes();
        }

        public String getPlaybackSpeedColor() {
            return ((PlayViewBusinessInfo) this.instance).getPlaybackSpeedColor();
        }

        public ByteString getPlaybackSpeedColorBytes() {
            return ((PlayViewBusinessInfo) this.instance).getPlaybackSpeedColorBytes();
        }

        @Deprecated
        public Map<Integer, QualityExtInfo> getQualityExtMap() {
            return getQualityExtMapMap();
        }

        public int getQualityExtMapCount() {
            return ((PlayViewBusinessInfo) this.instance).getQualityExtMapMap().size();
        }

        public Map<Integer, QualityExtInfo> getQualityExtMapMap() {
            return Collections.unmodifiableMap(((PlayViewBusinessInfo) this.instance).getQualityExtMapMap());
        }

        public QualityExtInfo getQualityExtMapOrDefault(int i, QualityExtInfo qualityExtInfo) {
            Map<Integer, QualityExtInfo> qualityExtMapMap = ((PlayViewBusinessInfo) this.instance).getQualityExtMapMap();
            return qualityExtMapMap.containsKey(Integer.valueOf(i)) ? qualityExtMapMap.get(Integer.valueOf(i)) : qualityExtInfo;
        }

        public QualityExtInfo getQualityExtMapOrThrow(int i) {
            Map<Integer, QualityExtInfo> qualityExtMapMap = ((PlayViewBusinessInfo) this.instance).getQualityExtMapMap();
            if (qualityExtMapMap.containsKey(Integer.valueOf(i))) {
                return qualityExtMapMap.get(Integer.valueOf(i));
            }
            throw new IllegalArgumentException();
        }

        public RecordInfo getRecordInfo() {
            return ((PlayViewBusinessInfo) this.instance).getRecordInfo();
        }

        public UserStatus getUserStatus() {
            return ((PlayViewBusinessInfo) this.instance).getUserStatus();
        }

        public int getVipStatus() {
            return ((PlayViewBusinessInfo) this.instance).getVipStatus();
        }

        public boolean hasContinuePlayInfo() {
            return ((PlayViewBusinessInfo) this.instance).hasContinuePlayInfo();
        }

        public boolean hasDimension() {
            return ((PlayViewBusinessInfo) this.instance).hasDimension();
        }

        public boolean hasEpisodeAdvertisementInfo() {
            return ((PlayViewBusinessInfo) this.instance).hasEpisodeAdvertisementInfo();
        }

        public boolean hasEpisodeInfo() {
            return ((PlayViewBusinessInfo) this.instance).hasEpisodeInfo();
        }

        public boolean hasRecordInfo() {
            return ((PlayViewBusinessInfo) this.instance).hasRecordInfo();
        }

        public boolean hasUserStatus() {
            return ((PlayViewBusinessInfo) this.instance).hasUserStatus();
        }

        public Builder mergeContinuePlayInfo(ContinuePlayInfo continuePlayInfo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).mergeContinuePlayInfo(continuePlayInfo);
            return this;
        }

        public Builder mergeDimension(Dimension dimension) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).mergeDimension(dimension);
            return this;
        }

        public Builder mergeEpisodeAdvertisementInfo(EpisodeAdvertisementInfo episodeAdvertisementInfo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).mergeEpisodeAdvertisementInfo(episodeAdvertisementInfo);
            return this;
        }

        public Builder mergeEpisodeInfo(EpisodeInfo episodeInfo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).mergeEpisodeInfo(episodeInfo);
            return this;
        }

        public Builder mergeRecordInfo(RecordInfo recordInfo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).mergeRecordInfo(recordInfo);
            return this;
        }

        public Builder mergeUserStatus(UserStatus userStatus) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).mergeUserStatus(userStatus);
            return this;
        }

        public Builder putAllExpMap(Map<String, Integer> map) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).getMutableExpMapMap().putAll(map);
            return this;
        }

        public Builder putAllQualityExtMap(Map<Integer, QualityExtInfo> map) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).getMutableQualityExtMapMap().putAll(map);
            return this;
        }

        public Builder putExpMap(String str, int i) {
            str.getClass();
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).getMutableExpMapMap().put(str, Integer.valueOf(i));
            return this;
        }

        public Builder putQualityExtMap(int i, QualityExtInfo qualityExtInfo) {
            qualityExtInfo.getClass();
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).getMutableQualityExtMapMap().put(Integer.valueOf(i), qualityExtInfo);
            return this;
        }

        public Builder removeClipInfo(int i) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).removeClipInfo(i);
            return this;
        }

        public Builder removeEpPublicityVideoList(int i) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).removeEpPublicityVideoList(i);
            return this;
        }

        public Builder removeExpMap(String str) {
            str.getClass();
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).getMutableExpMapMap().remove(str);
            return this;
        }

        public Builder removeQualityExtMap(int i) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).getMutableQualityExtMapMap().remove(Integer.valueOf(i));
            return this;
        }

        public Builder setBp(boolean z) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setBp(z);
            return this;
        }

        public Builder setClipInfo(int i, ClipInfo clipInfo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setClipInfo(i, clipInfo);
            return this;
        }

        public Builder setContinuePlayInfo(ContinuePlayInfo continuePlayInfo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setContinuePlayInfo(continuePlayInfo);
            return this;
        }

        public Builder setDimension(Dimension dimension) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setDimension(dimension);
            return this;
        }

        public Builder setDrmTechType(DrmTechType drmTechType) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setDrmTechType(drmTechType);
            return this;
        }

        public Builder setDrmTechTypeValue(int i) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setDrmTechTypeValue(i);
            return this;
        }

        public Builder setEpPublicityVideoList(int i, EpPublicityVideo epPublicityVideo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setEpPublicityVideoList(i, epPublicityVideo);
            return this;
        }

        public Builder setEpWholeDuration(int i) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setEpWholeDuration(i);
            return this;
        }

        public Builder setEpisodeAdvertisementInfo(EpisodeAdvertisementInfo episodeAdvertisementInfo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setEpisodeAdvertisementInfo(episodeAdvertisementInfo);
            return this;
        }

        public Builder setEpisodeInfo(EpisodeInfo episodeInfo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setEpisodeInfo(episodeInfo);
            return this;
        }

        public Builder setInlineType(InlineType inlineType) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setInlineType(inlineType);
            return this;
        }

        public Builder setInlineTypeValue(int i) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setInlineTypeValue(i);
            return this;
        }

        public Builder setIsDrm(boolean z) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setIsDrm(z);
            return this;
        }

        public Builder setIsLivePre(boolean z) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setIsLivePre(z);
            return this;
        }

        public Builder setIsPreview(boolean z) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setIsPreview(z);
            return this;
        }

        public Builder setLimitActionType(LimitActionType limitActionType) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setLimitActionType(limitActionType);
            return this;
        }

        public Builder setLimitActionTypeValue(int i) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setLimitActionTypeValue(i);
            return this;
        }

        public Builder setMarlinToken(String str) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setMarlinToken(str);
            return this;
        }

        public Builder setMarlinTokenBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setMarlinTokenBytes(byteString);
            return this;
        }

        public Builder setPlaybackSpeedColor(String str) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setPlaybackSpeedColor(str);
            return this;
        }

        public Builder setPlaybackSpeedColorBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setPlaybackSpeedColorBytes(byteString);
            return this;
        }

        public Builder setRecordInfo(RecordInfo recordInfo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setRecordInfo(recordInfo);
            return this;
        }

        public Builder setUserStatus(UserStatus userStatus) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setUserStatus(userStatus);
            return this;
        }

        public Builder setVipStatus(int i) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setVipStatus(i);
            return this;
        }

        private Builder() {
            super(PlayViewBusinessInfo.DEFAULT_INSTANCE);
        }

        public Builder addClipInfo(int i, ClipInfo clipInfo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).addClipInfo(i, clipInfo);
            return this;
        }

        public Builder addEpPublicityVideoList(int i, EpPublicityVideo epPublicityVideo) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).addEpPublicityVideoList(i, epPublicityVideo);
            return this;
        }

        public Builder setClipInfo(int i, ClipInfo.Builder builder) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setClipInfo(i, builder.build());
            return this;
        }

        public Builder setContinuePlayInfo(ContinuePlayInfo.Builder builder) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setContinuePlayInfo(builder.build());
            return this;
        }

        public Builder setDimension(Dimension.Builder builder) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setDimension(builder.build());
            return this;
        }

        public Builder setEpPublicityVideoList(int i, EpPublicityVideo.Builder builder) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setEpPublicityVideoList(i, builder.build());
            return this;
        }

        public Builder setEpisodeAdvertisementInfo(EpisodeAdvertisementInfo.Builder builder) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setEpisodeAdvertisementInfo(builder.build());
            return this;
        }

        public Builder setEpisodeInfo(EpisodeInfo.Builder builder) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setEpisodeInfo(builder.build());
            return this;
        }

        public Builder setRecordInfo(RecordInfo.Builder builder) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setRecordInfo(builder.build());
            return this;
        }

        public Builder setUserStatus(UserStatus.Builder builder) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).setUserStatus(builder.build());
            return this;
        }

        public Builder addClipInfo(ClipInfo.Builder builder) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).addClipInfo(builder.build());
            return this;
        }

        public Builder addEpPublicityVideoList(EpPublicityVideo.Builder builder) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).addEpPublicityVideoList(builder.build());
            return this;
        }

        public Builder addClipInfo(int i, ClipInfo.Builder builder) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).addClipInfo(i, builder.build());
            return this;
        }

        public Builder addEpPublicityVideoList(int i, EpPublicityVideo.Builder builder) {
            copyOnWrite();
            ((PlayViewBusinessInfo) this.instance).addEpPublicityVideoList(i, builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class ExpMapDefaultEntryHolder {
        static final MapEntryLite<String, Integer> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT32, 0);

        private ExpMapDefaultEntryHolder() {
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class QualityExtMapDefaultEntryHolder {
        static final MapEntryLite<Integer, QualityExtInfo> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.INT32, 0, WireFormat.FieldType.MESSAGE, QualityExtInfo.getDefaultInstance());

        private QualityExtMapDefaultEntryHolder() {
        }
    }

    static {
        PlayViewBusinessInfo playViewBusinessInfo = new PlayViewBusinessInfo();
        DEFAULT_INSTANCE = playViewBusinessInfo;
        GeneratedMessageLite.registerDefaultInstance(PlayViewBusinessInfo.class, playViewBusinessInfo);
    }

    private PlayViewBusinessInfo() {
    }

    public void addAllClipInfo(Iterable<? extends ClipInfo> iterable) {
        ensureClipInfoIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.clipInfo_);
    }

    public void addAllEpPublicityVideoList(Iterable<? extends EpPublicityVideo> iterable) {
        ensureEpPublicityVideoListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.epPublicityVideoList_);
    }

    public void addClipInfo(ClipInfo clipInfo) {
        clipInfo.getClass();
        ensureClipInfoIsMutable();
        this.clipInfo_.add(clipInfo);
    }

    public void addEpPublicityVideoList(EpPublicityVideo epPublicityVideo) {
        epPublicityVideo.getClass();
        ensureEpPublicityVideoListIsMutable();
        this.epPublicityVideoList_.add(epPublicityVideo);
    }

    public void clearBp() {
        this.bp_ = false;
    }

    public void clearClipInfo() {
        this.clipInfo_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearContinuePlayInfo() {
        this.continuePlayInfo_ = null;
    }

    public void clearDimension() {
        this.dimension_ = null;
    }

    public void clearDrmTechType() {
        this.drmTechType_ = 0;
    }

    public void clearEpPublicityVideoList() {
        this.epPublicityVideoList_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearEpWholeDuration() {
        this.epWholeDuration_ = 0;
    }

    public void clearEpisodeAdvertisementInfo() {
        this.episodeAdvertisementInfo_ = null;
    }

    public void clearEpisodeInfo() {
        this.episodeInfo_ = null;
    }

    public void clearInlineType() {
        this.inlineType_ = 0;
    }

    public void clearIsDrm() {
        this.isDrm_ = false;
    }

    public void clearIsLivePre() {
        this.isLivePre_ = false;
    }

    public void clearIsPreview() {
        this.isPreview_ = false;
    }

    public void clearLimitActionType() {
        this.limitActionType_ = 0;
    }

    public void clearMarlinToken() {
        this.marlinToken_ = getDefaultInstance().getMarlinToken();
    }

    public void clearPlaybackSpeedColor() {
        this.playbackSpeedColor_ = getDefaultInstance().getPlaybackSpeedColor();
    }

    public void clearRecordInfo() {
        this.recordInfo_ = null;
    }

    public void clearUserStatus() {
        this.userStatus_ = null;
    }

    public void clearVipStatus() {
        this.vipStatus_ = 0;
    }

    private void ensureClipInfoIsMutable() {
        Internal.ProtobufList<ClipInfo> protobufList = this.clipInfo_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.clipInfo_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureEpPublicityVideoListIsMutable() {
        Internal.ProtobufList<EpPublicityVideo> protobufList = this.epPublicityVideoList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.epPublicityVideoList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PlayViewBusinessInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public Map<String, Integer> getMutableExpMapMap() {
        return internalGetMutableExpMap();
    }

    public Map<Integer, QualityExtInfo> getMutableQualityExtMapMap() {
        return internalGetMutableQualityExtMap();
    }

    private MapFieldLite<String, Integer> internalGetExpMap() {
        return this.expMap_;
    }

    private MapFieldLite<String, Integer> internalGetMutableExpMap() {
        if (!this.expMap_.isMutable()) {
            this.expMap_ = this.expMap_.mutableCopy();
        }
        return this.expMap_;
    }

    private MapFieldLite<Integer, QualityExtInfo> internalGetMutableQualityExtMap() {
        if (!this.qualityExtMap_.isMutable()) {
            this.qualityExtMap_ = this.qualityExtMap_.mutableCopy();
        }
        return this.qualityExtMap_;
    }

    private MapFieldLite<Integer, QualityExtInfo> internalGetQualityExtMap() {
        return this.qualityExtMap_;
    }

    public void mergeContinuePlayInfo(ContinuePlayInfo continuePlayInfo) {
    }

    public void mergeDimension(Dimension dimension) {
    }

    public void mergeEpisodeAdvertisementInfo(EpisodeAdvertisementInfo episodeAdvertisementInfo) {
    }

    public void mergeEpisodeInfo(EpisodeInfo episodeInfo) {
    }

    public void mergeRecordInfo(RecordInfo recordInfo) {
    }

    public void mergeUserStatus(UserStatus userStatus) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayViewBusinessInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayViewBusinessInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayViewBusinessInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayViewBusinessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayViewBusinessInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeClipInfo(int i) {
        ensureClipInfoIsMutable();
        this.clipInfo_.remove(i);
    }

    public void removeEpPublicityVideoList(int i) {
        ensureEpPublicityVideoListIsMutable();
        this.epPublicityVideoList_.remove(i);
    }

    public void setBp(boolean z) {
        this.bp_ = z;
    }

    public void setClipInfo(int i, ClipInfo clipInfo) {
        clipInfo.getClass();
        ensureClipInfoIsMutable();
        this.clipInfo_.set(i, clipInfo);
    }

    public void setContinuePlayInfo(ContinuePlayInfo continuePlayInfo) {
        continuePlayInfo.getClass();
        this.continuePlayInfo_ = continuePlayInfo;
    }

    public void setDimension(Dimension dimension) {
        dimension.getClass();
        this.dimension_ = dimension;
    }

    public void setDrmTechType(DrmTechType drmTechType) {
        this.drmTechType_ = drmTechType.getNumber();
    }

    public void setDrmTechTypeValue(int i) {
        this.drmTechType_ = i;
    }

    public void setEpPublicityVideoList(int i, EpPublicityVideo epPublicityVideo) {
        epPublicityVideo.getClass();
        ensureEpPublicityVideoListIsMutable();
        this.epPublicityVideoList_.set(i, epPublicityVideo);
    }

    public void setEpWholeDuration(int i) {
        this.epWholeDuration_ = i;
    }

    public void setEpisodeAdvertisementInfo(EpisodeAdvertisementInfo episodeAdvertisementInfo) {
        episodeAdvertisementInfo.getClass();
        this.episodeAdvertisementInfo_ = episodeAdvertisementInfo;
    }

    public void setEpisodeInfo(EpisodeInfo episodeInfo) {
        episodeInfo.getClass();
        this.episodeInfo_ = episodeInfo;
    }

    public void setInlineType(InlineType inlineType) {
        this.inlineType_ = inlineType.getNumber();
    }

    public void setInlineTypeValue(int i) {
        this.inlineType_ = i;
    }

    public void setIsDrm(boolean z) {
        this.isDrm_ = z;
    }

    public void setIsLivePre(boolean z) {
        this.isLivePre_ = z;
    }

    public void setIsPreview(boolean z) {
        this.isPreview_ = z;
    }

    public void setLimitActionType(LimitActionType limitActionType) {
        this.limitActionType_ = limitActionType.getNumber();
    }

    public void setLimitActionTypeValue(int i) {
        this.limitActionType_ = i;
    }

    public void setMarlinToken(String str) {
        str.getClass();
        this.marlinToken_ = str;
    }

    public void setMarlinTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.marlinToken_ = byteString.toStringUtf8();
    }

    public void setPlaybackSpeedColor(String str) {
        str.getClass();
        this.playbackSpeedColor_ = str;
    }

    public void setPlaybackSpeedColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.playbackSpeedColor_ = byteString.toStringUtf8();
    }

    public void setRecordInfo(RecordInfo recordInfo) {
        recordInfo.getClass();
        this.recordInfo_ = recordInfo;
    }

    public void setUserStatus(UserStatus userStatus) {
        userStatus.getClass();
        this.userStatus_ = userStatus;
    }

    public void setVipStatus(int i) {
        this.vipStatus_ = i;
    }

    public boolean containsExpMap(String str) {
        str.getClass();
        return internalGetExpMap().containsKey(str);
    }

    public boolean containsQualityExtMap(int i) {
        return internalGetQualityExtMap().containsKey(Integer.valueOf(i));
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78671.f17582xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayViewBusinessInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0000\u0000\u0001\u0015\u0015\u0002\u0002\u0000\u0001\u0007\u0002\u0007\u0003\u0208\u0004\u0208\u0005\t\u0006\u001b\u0007\f\b\u0004\t\t\n2\u000b2\f\f\r\f\u000e\u0007\u000f\t\u0010\u0004\u0011\u0007\u0012\t\u0013\t\u0014\t\u0015\u001b", new Object[]{"isPreview_", "bp_", "marlinToken_", "playbackSpeedColor_", "continuePlayInfo_", "clipInfo_", ClipInfo.class, "inlineType_", "epWholeDuration_", "dimension_", "qualityExtMap_", QualityExtMapDefaultEntryHolder.defaultEntry, "expMap_", ExpMapDefaultEntryHolder.defaultEntry, "drmTechType_", "limitActionType_", "isDrm_", "recordInfo_", "vipStatus_", "isLivePre_", "episodeInfo_", "episodeAdvertisementInfo_", "userStatus_", "epPublicityVideoList_", EpPublicityVideo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayViewBusinessInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayViewBusinessInfo.class) {
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

    public boolean getBp() {
        return this.bp_;
    }

    public ClipInfo getClipInfo(int i) {
        return this.clipInfo_.get(i);
    }

    public int getClipInfoCount() {
        return this.clipInfo_.size();
    }

    public List<ClipInfo> getClipInfoList() {
        return this.clipInfo_;
    }

    public ClipInfoOrBuilder getClipInfoOrBuilder(int i) {
        return this.clipInfo_.get(i);
    }

    public List<? extends ClipInfoOrBuilder> getClipInfoOrBuilderList() {
        return this.clipInfo_;
    }

    public ContinuePlayInfo getContinuePlayInfo() {
        ContinuePlayInfo continuePlayInfo = this.continuePlayInfo_;
        return continuePlayInfo == null ? ContinuePlayInfo.getDefaultInstance() : continuePlayInfo;
    }

    public Dimension getDimension() {
        Dimension dimension = this.dimension_;
        return dimension == null ? Dimension.getDefaultInstance() : dimension;
    }

    public DrmTechType getDrmTechType() {
        DrmTechType forNumber = DrmTechType.forNumber(this.drmTechType_);
        return forNumber == null ? DrmTechType.UNRECOGNIZED : forNumber;
    }

    public int getDrmTechTypeValue() {
        return this.drmTechType_;
    }

    public EpPublicityVideo getEpPublicityVideoList(int i) {
        return this.epPublicityVideoList_.get(i);
    }

    public int getEpPublicityVideoListCount() {
        return this.epPublicityVideoList_.size();
    }

    public List<EpPublicityVideo> getEpPublicityVideoListList() {
        return this.epPublicityVideoList_;
    }

    public EpPublicityVideoOrBuilder getEpPublicityVideoListOrBuilder(int i) {
        return this.epPublicityVideoList_.get(i);
    }

    public List<? extends EpPublicityVideoOrBuilder> getEpPublicityVideoListOrBuilderList() {
        return this.epPublicityVideoList_;
    }

    public int getEpWholeDuration() {
        return this.epWholeDuration_;
    }

    public EpisodeAdvertisementInfo getEpisodeAdvertisementInfo() {
        EpisodeAdvertisementInfo episodeAdvertisementInfo = this.episodeAdvertisementInfo_;
        return episodeAdvertisementInfo == null ? EpisodeAdvertisementInfo.getDefaultInstance() : episodeAdvertisementInfo;
    }

    public EpisodeInfo getEpisodeInfo() {
        EpisodeInfo episodeInfo = this.episodeInfo_;
        return episodeInfo == null ? EpisodeInfo.getDefaultInstance() : episodeInfo;
    }

    @Deprecated
    public Map<String, Integer> getExpMap() {
        return getExpMapMap();
    }

    public int getExpMapCount() {
        return internalGetExpMap().size();
    }

    public Map<String, Integer> getExpMapMap() {
        return Collections.unmodifiableMap(internalGetExpMap());
    }

    public int getExpMapOrDefault(String str, int i) {
        str.getClass();
        MapFieldLite<String, Integer> internalGetExpMap = internalGetExpMap();
        return internalGetExpMap.containsKey(str) ? internalGetExpMap.get(str).intValue() : i;
    }

    public int getExpMapOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Integer> internalGetExpMap = internalGetExpMap();
        if (internalGetExpMap.containsKey(str)) {
            return internalGetExpMap.get(str).intValue();
        }
        throw new IllegalArgumentException();
    }

    public InlineType getInlineType() {
        InlineType forNumber = InlineType.forNumber(this.inlineType_);
        return forNumber == null ? InlineType.UNRECOGNIZED : forNumber;
    }

    public int getInlineTypeValue() {
        return this.inlineType_;
    }

    public boolean getIsDrm() {
        return this.isDrm_;
    }

    public boolean getIsLivePre() {
        return this.isLivePre_;
    }

    public boolean getIsPreview() {
        return this.isPreview_;
    }

    public LimitActionType getLimitActionType() {
        LimitActionType forNumber = LimitActionType.forNumber(this.limitActionType_);
        return forNumber == null ? LimitActionType.UNRECOGNIZED : forNumber;
    }

    public int getLimitActionTypeValue() {
        return this.limitActionType_;
    }

    public String getMarlinToken() {
        return this.marlinToken_;
    }

    public ByteString getMarlinTokenBytes() {
        return ByteString.copyFromUtf8(this.marlinToken_);
    }

    public String getPlaybackSpeedColor() {
        return this.playbackSpeedColor_;
    }

    public ByteString getPlaybackSpeedColorBytes() {
        return ByteString.copyFromUtf8(this.playbackSpeedColor_);
    }

    @Deprecated
    public Map<Integer, QualityExtInfo> getQualityExtMap() {
        return getQualityExtMapMap();
    }

    public int getQualityExtMapCount() {
        return internalGetQualityExtMap().size();
    }

    public Map<Integer, QualityExtInfo> getQualityExtMapMap() {
        return Collections.unmodifiableMap(internalGetQualityExtMap());
    }

    public QualityExtInfo getQualityExtMapOrDefault(int i, QualityExtInfo qualityExtInfo) {
        MapFieldLite<Integer, QualityExtInfo> internalGetQualityExtMap = internalGetQualityExtMap();
        return internalGetQualityExtMap.containsKey(Integer.valueOf(i)) ? internalGetQualityExtMap.get(Integer.valueOf(i)) : qualityExtInfo;
    }

    public QualityExtInfo getQualityExtMapOrThrow(int i) {
        MapFieldLite<Integer, QualityExtInfo> internalGetQualityExtMap = internalGetQualityExtMap();
        if (internalGetQualityExtMap.containsKey(Integer.valueOf(i))) {
            return internalGetQualityExtMap.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    public RecordInfo getRecordInfo() {
        RecordInfo recordInfo = this.recordInfo_;
        return recordInfo == null ? RecordInfo.getDefaultInstance() : recordInfo;
    }

    public UserStatus getUserStatus() {
        UserStatus userStatus = this.userStatus_;
        return userStatus == null ? UserStatus.getDefaultInstance() : userStatus;
    }

    public int getVipStatus() {
        return this.vipStatus_;
    }

    public boolean hasContinuePlayInfo() {
        return this.continuePlayInfo_ != null;
    }

    public boolean hasDimension() {
        return this.dimension_ != null;
    }

    public boolean hasEpisodeAdvertisementInfo() {
        return this.episodeAdvertisementInfo_ != null;
    }

    public boolean hasEpisodeInfo() {
        return this.episodeInfo_ != null;
    }

    public boolean hasRecordInfo() {
        return this.recordInfo_ != null;
    }

    public boolean hasUserStatus() {
        return this.userStatus_ != null;
    }

    public static Builder newBuilder(PlayViewBusinessInfo playViewBusinessInfo) {
        return DEFAULT_INSTANCE.createBuilder(playViewBusinessInfo);
    }

    public static PlayViewBusinessInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewBusinessInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayViewBusinessInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewBusinessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayViewBusinessInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayViewBusinessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addClipInfo(int i, ClipInfo clipInfo) {
        clipInfo.getClass();
        ensureClipInfoIsMutable();
        this.clipInfo_.add(i, clipInfo);
    }

    public void addEpPublicityVideoList(int i, EpPublicityVideo epPublicityVideo) {
        epPublicityVideo.getClass();
        ensureEpPublicityVideoListIsMutable();
        this.epPublicityVideoList_.add(i, epPublicityVideo);
    }

    public static PlayViewBusinessInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewBusinessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayViewBusinessInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayViewBusinessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayViewBusinessInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewBusinessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayViewBusinessInfo parseFrom(InputStream inputStream) throws IOException {
        return (PlayViewBusinessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayViewBusinessInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewBusinessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayViewBusinessInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayViewBusinessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayViewBusinessInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewBusinessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
