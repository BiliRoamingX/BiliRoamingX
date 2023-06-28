package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
import com.bapis.bilibili.pagination.Pagination;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class ViewReq extends GeneratedMessageLite<ViewReq, ViewReq.Builder> implements MessageLiteOrBuilder {
    public static final int AD_EXTRA_FIELD_NUMBER = 5;
    public static final int AID_FIELD_NUMBER = 1;
    public static final int AUTOPLAY_FIELD_NUMBER = 13;
    public static final int BIZ_EXTRA_FIELD_NUMBER = 16;
    public static final int BVID_FIELD_NUMBER = 2;
    private static final ViewReq DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 17;
    public static final int FNVAL_FIELD_NUMBER = 8;
    public static final int FNVER_FIELD_NUMBER = 7;
    public static final int FORCE_HOST_FIELD_NUMBER = 9;
    public static final int FOURK_FIELD_NUMBER = 10;
    public static final int FROM_FIELD_NUMBER = 3;
    public static final int FROM_SPMID_FIELD_NUMBER = 12;
    public static final int IN_FEED_PLAY_FIELD_NUMBER = 20;
    public static final int PAGE_VERSION_FIELD_NUMBER = 15;
    public static final int PAGINATION_FIELD_NUMBER = 22;
    private static volatile Parser<ViewReq> PARSER = null;
    public static final int PLAYER_ARGS_FIELD_NUMBER = 14;
    public static final int PLAY_MODE_FIELD_NUMBER = 21;
    public static final int QN_FIELD_NUMBER = 6;
    public static final int REFRESH_FIELD_NUMBER = 23;
    public static final int REFRESH_NUM_FIELD_NUMBER = 24;
    public static final int RELATES_PAGE_FIELD_NUMBER = 18;
    public static final int SESSION_ID_FIELD_NUMBER = 19;
    public static final int SPMID_FIELD_NUMBER = 11;
    public static final int TRACKID_FIELD_NUMBER = 4;
    private long aid_;
    private int autoplay_;
    private long deviceType_;
    private int fnval_;
    private int fnver_;
    private int forceHost_;
    private int fourk_;
    private int inFeedPlay_;
    private Pagination pagination_;
    private PlayerArgs playerArgs_;
    private int qn_;
    private int refreshNum_;
    private int refresh_;
    private long relatesPage_;
    private String bvid_ = "";
    private String from_ = "";
    private String trackid_ = "";
    private String adExtra_ = "";
    private String spmid_ = "";
    private String fromSpmid_ = "";
    private String pageVersion_ = "";
    private String bizExtra_ = "";
    private String sessionId_ = "";
    private String playMode_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ViewReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C69051 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16858xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16858xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16858xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16858xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16858xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16858xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16858xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16858xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69051 c69051) {
            this();
        }

        public Builder clearAdExtra() {
            copyOnWrite();
            ((ViewReq) this.instance).clearAdExtra();
            return this;
        }

        public Builder clearAid() {
            copyOnWrite();
            ((ViewReq) this.instance).clearAid();
            return this;
        }

        public Builder clearAutoplay() {
            copyOnWrite();
            ((ViewReq) this.instance).clearAutoplay();
            return this;
        }

        public Builder clearBizExtra() {
            copyOnWrite();
            ((ViewReq) this.instance).clearBizExtra();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((ViewReq) this.instance).clearBvid();
            return this;
        }

        public Builder clearDeviceType() {
            copyOnWrite();
            ((ViewReq) this.instance).clearDeviceType();
            return this;
        }

        public Builder clearFnval() {
            copyOnWrite();
            ((ViewReq) this.instance).clearFnval();
            return this;
        }

        public Builder clearFnver() {
            copyOnWrite();
            ((ViewReq) this.instance).clearFnver();
            return this;
        }

        public Builder clearForceHost() {
            copyOnWrite();
            ((ViewReq) this.instance).clearForceHost();
            return this;
        }

        public Builder clearFourk() {
            copyOnWrite();
            ((ViewReq) this.instance).clearFourk();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((ViewReq) this.instance).clearFrom();
            return this;
        }

        public Builder clearFromSpmid() {
            copyOnWrite();
            ((ViewReq) this.instance).clearFromSpmid();
            return this;
        }

        public Builder clearInFeedPlay() {
            copyOnWrite();
            ((ViewReq) this.instance).clearInFeedPlay();
            return this;
        }

        public Builder clearPageVersion() {
            copyOnWrite();
            ((ViewReq) this.instance).clearPageVersion();
            return this;
        }

        public Builder clearPagination() {
            copyOnWrite();
            ((ViewReq) this.instance).clearPagination();
            return this;
        }

        public Builder clearPlayMode() {
            copyOnWrite();
            ((ViewReq) this.instance).clearPlayMode();
            return this;
        }

        public Builder clearPlayerArgs() {
            copyOnWrite();
            ((ViewReq) this.instance).clearPlayerArgs();
            return this;
        }

        public Builder clearQn() {
            copyOnWrite();
            ((ViewReq) this.instance).clearQn();
            return this;
        }

        public Builder clearRefresh() {
            copyOnWrite();
            ((ViewReq) this.instance).clearRefresh();
            return this;
        }

        public Builder clearRefreshNum() {
            copyOnWrite();
            ((ViewReq) this.instance).clearRefreshNum();
            return this;
        }

        public Builder clearRelatesPage() {
            copyOnWrite();
            ((ViewReq) this.instance).clearRelatesPage();
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((ViewReq) this.instance).clearSessionId();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((ViewReq) this.instance).clearSpmid();
            return this;
        }

        public Builder clearTrackid() {
            copyOnWrite();
            ((ViewReq) this.instance).clearTrackid();
            return this;
        }

        public String getAdExtra() {
            return ((ViewReq) this.instance).getAdExtra();
        }

        public ByteString getAdExtraBytes() {
            return ((ViewReq) this.instance).getAdExtraBytes();
        }

        public long getAid() {
            return ((ViewReq) this.instance).getAid();
        }

        public int getAutoplay() {
            return ((ViewReq) this.instance).getAutoplay();
        }

        public String getBizExtra() {
            return ((ViewReq) this.instance).getBizExtra();
        }

        public ByteString getBizExtraBytes() {
            return ((ViewReq) this.instance).getBizExtraBytes();
        }

        public String getBvid() {
            return ((ViewReq) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((ViewReq) this.instance).getBvidBytes();
        }

        public long getDeviceType() {
            return ((ViewReq) this.instance).getDeviceType();
        }

        public int getFnval() {
            return ((ViewReq) this.instance).getFnval();
        }

        public int getFnver() {
            return ((ViewReq) this.instance).getFnver();
        }

        public int getForceHost() {
            return ((ViewReq) this.instance).getForceHost();
        }

        public int getFourk() {
            return ((ViewReq) this.instance).getFourk();
        }

        public String getFrom() {
            return ((ViewReq) this.instance).getFrom();
        }

        public ByteString getFromBytes() {
            return ((ViewReq) this.instance).getFromBytes();
        }

        public String getFromSpmid() {
            return ((ViewReq) this.instance).getFromSpmid();
        }

        public ByteString getFromSpmidBytes() {
            return ((ViewReq) this.instance).getFromSpmidBytes();
        }

        public int getInFeedPlay() {
            return ((ViewReq) this.instance).getInFeedPlay();
        }

        public String getPageVersion() {
            return ((ViewReq) this.instance).getPageVersion();
        }

        public ByteString getPageVersionBytes() {
            return ((ViewReq) this.instance).getPageVersionBytes();
        }

        public Pagination getPagination() {
            return ((ViewReq) this.instance).getPagination();
        }

        public String getPlayMode() {
            return ((ViewReq) this.instance).getPlayMode();
        }

        public ByteString getPlayModeBytes() {
            return ((ViewReq) this.instance).getPlayModeBytes();
        }

        public PlayerArgs getPlayerArgs() {
            return ((ViewReq) this.instance).getPlayerArgs();
        }

        public int getQn() {
            return ((ViewReq) this.instance).getQn();
        }

        public int getRefresh() {
            return ((ViewReq) this.instance).getRefresh();
        }

        public int getRefreshNum() {
            return ((ViewReq) this.instance).getRefreshNum();
        }

        public long getRelatesPage() {
            return ((ViewReq) this.instance).getRelatesPage();
        }

        public String getSessionId() {
            return ((ViewReq) this.instance).getSessionId();
        }

        public ByteString getSessionIdBytes() {
            return ((ViewReq) this.instance).getSessionIdBytes();
        }

        public String getSpmid() {
            return ((ViewReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((ViewReq) this.instance).getSpmidBytes();
        }

        public String getTrackid() {
            return ((ViewReq) this.instance).getTrackid();
        }

        public ByteString getTrackidBytes() {
            return ((ViewReq) this.instance).getTrackidBytes();
        }

        public boolean hasPagination() {
            return ((ViewReq) this.instance).hasPagination();
        }

        public boolean hasPlayerArgs() {
            return ((ViewReq) this.instance).hasPlayerArgs();
        }

        public Builder mergePagination(Pagination pagination) {
            copyOnWrite();
            ((ViewReq) this.instance).mergePagination(pagination);
            return this;
        }

        public Builder mergePlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((ViewReq) this.instance).mergePlayerArgs(playerArgs);
            return this;
        }

        public Builder setAdExtra(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setAdExtra(str);
            return this;
        }

        public Builder setAdExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setAdExtraBytes(byteString);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((ViewReq) this.instance).setAid(j);
            return this;
        }

        public Builder setAutoplay(int i) {
            copyOnWrite();
            ((ViewReq) this.instance).setAutoplay(i);
            return this;
        }

        public Builder setBizExtra(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setBizExtra(str);
            return this;
        }

        public Builder setBizExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setBizExtraBytes(byteString);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setDeviceType(long j) {
            copyOnWrite();
            ((ViewReq) this.instance).setDeviceType(j);
            return this;
        }

        public Builder setFnval(int i) {
            copyOnWrite();
            ((ViewReq) this.instance).setFnval(i);
            return this;
        }

        public Builder setFnver(int i) {
            copyOnWrite();
            ((ViewReq) this.instance).setFnver(i);
            return this;
        }

        public Builder setForceHost(int i) {
            copyOnWrite();
            ((ViewReq) this.instance).setForceHost(i);
            return this;
        }

        public Builder setFourk(int i) {
            copyOnWrite();
            ((ViewReq) this.instance).setFourk(i);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setFromSpmid(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setFromSpmid(str);
            return this;
        }

        public Builder setFromSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setFromSpmidBytes(byteString);
            return this;
        }

        public Builder setInFeedPlay(int i) {
            copyOnWrite();
            ((ViewReq) this.instance).setInFeedPlay(i);
            return this;
        }

        public Builder setPageVersion(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setPageVersion(str);
            return this;
        }

        public Builder setPageVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setPageVersionBytes(byteString);
            return this;
        }

        public Builder setPagination(Pagination pagination) {
            copyOnWrite();
            ((ViewReq) this.instance).setPagination(pagination);
            return this;
        }

        public Builder setPlayMode(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setPlayMode(str);
            return this;
        }

        public Builder setPlayModeBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setPlayModeBytes(byteString);
            return this;
        }

        public Builder setPlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((ViewReq) this.instance).setPlayerArgs(playerArgs);
            return this;
        }

        public Builder setQn(int i) {
            copyOnWrite();
            ((ViewReq) this.instance).setQn(i);
            return this;
        }

        public Builder setRefresh(int i) {
            copyOnWrite();
            ((ViewReq) this.instance).setRefresh(i);
            return this;
        }

        public Builder setRefreshNum(int i) {
            copyOnWrite();
            ((ViewReq) this.instance).setRefreshNum(i);
            return this;
        }

        public Builder setRelatesPage(long j) {
            copyOnWrite();
            ((ViewReq) this.instance).setRelatesPage(j);
            return this;
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        public Builder setTrackid(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setTrackid(str);
            return this;
        }

        public Builder setTrackidBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setTrackidBytes(byteString);
            return this;
        }

        private Builder() {
            super(ViewReq.DEFAULT_INSTANCE);
        }

        public Builder setPagination(Pagination.Builder builder) {
            copyOnWrite();
            ((ViewReq) this.instance).setPagination(builder.build());
            return this;
        }

        public Builder setPlayerArgs(PlayerArgs.Builder builder) {
            copyOnWrite();
            ((ViewReq) this.instance).setPlayerArgs(builder.build());
            return this;
        }
    }

    static {
        ViewReq viewReq = new ViewReq();
        DEFAULT_INSTANCE = viewReq;
        GeneratedMessageLite.registerDefaultInstance(ViewReq.class, viewReq);
    }

    private ViewReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdExtra() {
        this.adExtra_ = getDefaultInstance().getAdExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoplay() {
        this.autoplay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizExtra() {
        this.bizExtra_ = getDefaultInstance().getBizExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceType() {
        this.deviceType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFnval() {
        this.fnval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFnver() {
        this.fnver_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForceHost() {
        this.forceHost_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFourk() {
        this.fourk_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSpmid() {
        this.fromSpmid_ = getDefaultInstance().getFromSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInFeedPlay() {
        this.inFeedPlay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageVersion() {
        this.pageVersion_ = getDefaultInstance().getPageVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPagination() {
        this.pagination_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayMode() {
        this.playMode_ = getDefaultInstance().getPlayMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerArgs() {
        this.playerArgs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQn() {
        this.qn_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRefresh() {
        this.refresh_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRefreshNum() {
        this.refreshNum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelatesPage() {
        this.relatesPage_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackid() {
        this.trackid_ = getDefaultInstance().getTrackid();
    }

    public static ViewReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePagination(Pagination pagination) {
        pagination.getClass();
        Pagination pagination2 = this.pagination_;
        if (pagination2 != null && pagination2 != Pagination.getDefaultInstance()) {
            this.pagination_ = Pagination.newBuilder(this.pagination_).mergeFrom(pagination).buildPartial();
        } else {
            this.pagination_ = pagination;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerArgs(PlayerArgs playerArgs) {
        playerArgs.getClass();
        PlayerArgs playerArgs2 = this.playerArgs_;
        if (playerArgs2 != null && playerArgs2 != PlayerArgs.getDefaultInstance()) {
            this.playerArgs_ = PlayerArgs.newBuilder(this.playerArgs_).mergeFrom(playerArgs).buildPartial();
        } else {
            this.playerArgs_ = playerArgs;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdExtra(String str) {
        str.getClass();
        this.adExtra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adExtra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoplay(int i) {
        this.autoplay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizExtra(String str) {
        str.getClass();
        this.bizExtra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bizExtra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvid(String str) {
        str.getClass();
        this.bvid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bvid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceType(long j) {
        this.deviceType_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFnval(int i) {
        this.fnval_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFnver(int i) {
        this.fnver_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceHost(int i) {
        this.forceHost_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFourk(int i) {
        this.fourk_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        str.getClass();
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.from_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSpmid(String str) {
        str.getClass();
        this.fromSpmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromSpmid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInFeedPlay(int i) {
        this.inFeedPlay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageVersion(String str) {
        str.getClass();
        this.pageVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pageVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPagination(Pagination pagination) {
        pagination.getClass();
        this.pagination_ = pagination;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayMode(String str) {
        str.getClass();
        this.playMode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayModeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.playMode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerArgs(PlayerArgs playerArgs) {
        playerArgs.getClass();
        this.playerArgs_ = playerArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQn(int i) {
        this.qn_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefresh(int i) {
        this.refresh_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshNum(int i) {
        this.refreshNum_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelatesPage(long j) {
        this.relatesPage_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmid(String str) {
        str.getClass();
        this.spmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.spmid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackid(String str) {
        str.getClass();
        this.trackid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackid_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69051.f16858xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0018\u0000\u0000\u0001\u0018\u0018\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0004\u0007\u0004\b\u0004\t\u0004\n\u0004\u000b\u0208\f\u0208\r\u0004\u000e\t\u000f\u0208\u0010\u0208\u0011\u0002\u0012\u0002\u0013\u0208\u0014\u0004\u0015\u0208\u0016\t\u0017\u0004\u0018\u0004", new Object[]{"aid_", "bvid_", "from_", "trackid_", "adExtra_", "qn_", "fnver_", "fnval_", "forceHost_", "fourk_", "spmid_", "fromSpmid_", "autoplay_", "playerArgs_", "pageVersion_", "bizExtra_", "deviceType_", "relatesPage_", "sessionId_", "inFeedPlay_", "playMode_", "pagination_", "refresh_", "refreshNum_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewReq.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public String getAdExtra() {
        return this.adExtra_;
    }

    public ByteString getAdExtraBytes() {
        return ByteString.copyFromUtf8(this.adExtra_);
    }

    public long getAid() {
        return this.aid_;
    }

    public int getAutoplay() {
        return this.autoplay_;
    }

    public String getBizExtra() {
        return this.bizExtra_;
    }

    public ByteString getBizExtraBytes() {
        return ByteString.copyFromUtf8(this.bizExtra_);
    }

    public String getBvid() {
        return this.bvid_;
    }

    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    public long getDeviceType() {
        return this.deviceType_;
    }

    public int getFnval() {
        return this.fnval_;
    }

    public int getFnver() {
        return this.fnver_;
    }

    public int getForceHost() {
        return this.forceHost_;
    }

    public int getFourk() {
        return this.fourk_;
    }

    public String getFrom() {
        return this.from_;
    }

    public ByteString getFromBytes() {
        return ByteString.copyFromUtf8(this.from_);
    }

    public String getFromSpmid() {
        return this.fromSpmid_;
    }

    public ByteString getFromSpmidBytes() {
        return ByteString.copyFromUtf8(this.fromSpmid_);
    }

    public int getInFeedPlay() {
        return this.inFeedPlay_;
    }

    public String getPageVersion() {
        return this.pageVersion_;
    }

    public ByteString getPageVersionBytes() {
        return ByteString.copyFromUtf8(this.pageVersion_);
    }

    public Pagination getPagination() {
        Pagination pagination = this.pagination_;
        return pagination == null ? Pagination.getDefaultInstance() : pagination;
    }

    public String getPlayMode() {
        return this.playMode_;
    }

    public ByteString getPlayModeBytes() {
        return ByteString.copyFromUtf8(this.playMode_);
    }

    public PlayerArgs getPlayerArgs() {
        PlayerArgs playerArgs = this.playerArgs_;
        return playerArgs == null ? PlayerArgs.getDefaultInstance() : playerArgs;
    }

    public int getQn() {
        return this.qn_;
    }

    public int getRefresh() {
        return this.refresh_;
    }

    public int getRefreshNum() {
        return this.refreshNum_;
    }

    public long getRelatesPage() {
        return this.relatesPage_;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public String getTrackid() {
        return this.trackid_;
    }

    public ByteString getTrackidBytes() {
        return ByteString.copyFromUtf8(this.trackid_);
    }

    public boolean hasPagination() {
        return this.pagination_ != null;
    }

    public boolean hasPlayerArgs() {
        return this.playerArgs_ != null;
    }

    public static Builder newBuilder(ViewReq viewReq) {
        return DEFAULT_INSTANCE.createBuilder(viewReq);
    }

    public static ViewReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ViewReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewReq parseFrom(InputStream inputStream) throws IOException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
