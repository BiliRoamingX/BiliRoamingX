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
public final class RelatesFeedReq extends GeneratedMessageLite<RelatesFeedReq, RelatesFeedReq.Builder> implements MessageLiteOrBuilder {
    public static final int AD_EXTRA_FIELD_NUMBER = 13;
    public static final int AID_FIELD_NUMBER = 1;
    public static final int AUTOPLAY_FIELD_NUMBER = 9;
    public static final int BIZ_EXTRA_FIELD_NUMBER = 11;
    public static final int BVID_FIELD_NUMBER = 2;
    private static final RelatesFeedReq DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 12;
    public static final int FROM_FIELD_NUMBER = 3;
    public static final int FROM_SPMID_FIELD_NUMBER = 5;
    public static final int FROM_TRACK_ID_FIELD_NUMBER = 10;
    public static final int PAGINATION_FIELD_NUMBER = 14;
    private static volatile Parser<RelatesFeedReq> PARSER = null;
    public static final int PLAYER_ARGS_FIELD_NUMBER = 6;
    public static final int REFRESH_NUM_FIELD_NUMBER = 15;
    public static final int RELATES_PAGE_FIELD_NUMBER = 7;
    public static final int SESSION_ID_FIELD_NUMBER = 8;
    public static final int SPMID_FIELD_NUMBER = 4;
    private long aid_;
    private int autoplay_;
    private long deviceType_;
    private Pagination pagination_;
    private PlayerArgs playerArgs_;
    private int refreshNum_;
    private long relatesPage_;
    private String bvid_ = "";
    private String from_ = "";
    private String spmid_ = "";
    private String fromSpmid_ = "";
    private String sessionId_ = "";
    private String fromTrackId_ = "";
    private String bizExtra_ = "";
    private String adExtra_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.RelatesFeedReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68441 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16804xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16804xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16804xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16804xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16804xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16804xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16804xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16804xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelatesFeedReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68441 c68441) {
            this();
        }

        public Builder clearAdExtra() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearAdExtra();
            return this;
        }

        public Builder clearAid() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearAid();
            return this;
        }

        public Builder clearAutoplay() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearAutoplay();
            return this;
        }

        public Builder clearBizExtra() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearBizExtra();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearBvid();
            return this;
        }

        public Builder clearDeviceType() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearDeviceType();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearFrom();
            return this;
        }

        public Builder clearFromSpmid() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearFromSpmid();
            return this;
        }

        public Builder clearFromTrackId() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearFromTrackId();
            return this;
        }

        public Builder clearPagination() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearPagination();
            return this;
        }

        public Builder clearPlayerArgs() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearPlayerArgs();
            return this;
        }

        public Builder clearRefreshNum() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearRefreshNum();
            return this;
        }

        public Builder clearRelatesPage() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearRelatesPage();
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearSessionId();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).clearSpmid();
            return this;
        }

        public String getAdExtra() {
            return ((RelatesFeedReq) this.instance).getAdExtra();
        }

        public ByteString getAdExtraBytes() {
            return ((RelatesFeedReq) this.instance).getAdExtraBytes();
        }

        public long getAid() {
            return ((RelatesFeedReq) this.instance).getAid();
        }

        public int getAutoplay() {
            return ((RelatesFeedReq) this.instance).getAutoplay();
        }

        public String getBizExtra() {
            return ((RelatesFeedReq) this.instance).getBizExtra();
        }

        public ByteString getBizExtraBytes() {
            return ((RelatesFeedReq) this.instance).getBizExtraBytes();
        }

        public String getBvid() {
            return ((RelatesFeedReq) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((RelatesFeedReq) this.instance).getBvidBytes();
        }

        public long getDeviceType() {
            return ((RelatesFeedReq) this.instance).getDeviceType();
        }

        public String getFrom() {
            return ((RelatesFeedReq) this.instance).getFrom();
        }

        public ByteString getFromBytes() {
            return ((RelatesFeedReq) this.instance).getFromBytes();
        }

        public String getFromSpmid() {
            return ((RelatesFeedReq) this.instance).getFromSpmid();
        }

        public ByteString getFromSpmidBytes() {
            return ((RelatesFeedReq) this.instance).getFromSpmidBytes();
        }

        public String getFromTrackId() {
            return ((RelatesFeedReq) this.instance).getFromTrackId();
        }

        public ByteString getFromTrackIdBytes() {
            return ((RelatesFeedReq) this.instance).getFromTrackIdBytes();
        }

        public Pagination getPagination() {
            return ((RelatesFeedReq) this.instance).getPagination();
        }

        public PlayerArgs getPlayerArgs() {
            return ((RelatesFeedReq) this.instance).getPlayerArgs();
        }

        public int getRefreshNum() {
            return ((RelatesFeedReq) this.instance).getRefreshNum();
        }

        public long getRelatesPage() {
            return ((RelatesFeedReq) this.instance).getRelatesPage();
        }

        public String getSessionId() {
            return ((RelatesFeedReq) this.instance).getSessionId();
        }

        public ByteString getSessionIdBytes() {
            return ((RelatesFeedReq) this.instance).getSessionIdBytes();
        }

        public String getSpmid() {
            return ((RelatesFeedReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((RelatesFeedReq) this.instance).getSpmidBytes();
        }

        public boolean hasPagination() {
            return ((RelatesFeedReq) this.instance).hasPagination();
        }

        public boolean hasPlayerArgs() {
            return ((RelatesFeedReq) this.instance).hasPlayerArgs();
        }

        public Builder mergePagination(Pagination pagination) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).mergePagination(pagination);
            return this;
        }

        public Builder mergePlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).mergePlayerArgs(playerArgs);
            return this;
        }

        public Builder setAdExtra(String str) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setAdExtra(str);
            return this;
        }

        public Builder setAdExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setAdExtraBytes(byteString);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setAid(j);
            return this;
        }

        public Builder setAutoplay(int i) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setAutoplay(i);
            return this;
        }

        public Builder setBizExtra(String str) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setBizExtra(str);
            return this;
        }

        public Builder setBizExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setBizExtraBytes(byteString);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setDeviceType(long j) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setDeviceType(j);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setFromSpmid(String str) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setFromSpmid(str);
            return this;
        }

        public Builder setFromSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setFromSpmidBytes(byteString);
            return this;
        }

        public Builder setFromTrackId(String str) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setFromTrackId(str);
            return this;
        }

        public Builder setFromTrackIdBytes(ByteString byteString) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setFromTrackIdBytes(byteString);
            return this;
        }

        public Builder setPagination(Pagination pagination) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setPagination(pagination);
            return this;
        }

        public Builder setPlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setPlayerArgs(playerArgs);
            return this;
        }

        public Builder setRefreshNum(int i) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setRefreshNum(i);
            return this;
        }

        public Builder setRelatesPage(long j) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setRelatesPage(j);
            return this;
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        private Builder() {
            super(RelatesFeedReq.DEFAULT_INSTANCE);
        }

        public Builder setPagination(Pagination.Builder builder) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setPagination(builder.build());
            return this;
        }

        public Builder setPlayerArgs(PlayerArgs.Builder builder) {
            copyOnWrite();
            ((RelatesFeedReq) this.instance).setPlayerArgs(builder.build());
            return this;
        }
    }

    static {
        RelatesFeedReq relatesFeedReq = new RelatesFeedReq();
        DEFAULT_INSTANCE = relatesFeedReq;
        GeneratedMessageLite.registerDefaultInstance(RelatesFeedReq.class, relatesFeedReq);
    }

    private RelatesFeedReq() {
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
    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSpmid() {
        this.fromSpmid_ = getDefaultInstance().getFromSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromTrackId() {
        this.fromTrackId_ = getDefaultInstance().getFromTrackId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPagination() {
        this.pagination_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerArgs() {
        this.playerArgs_ = null;
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

    public static RelatesFeedReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePagination(Pagination pagination) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerArgs(PlayerArgs playerArgs) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelatesFeedReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelatesFeedReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelatesFeedReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelatesFeedReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelatesFeedReq> parser() {
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
    public void setFromTrackId(String str) {
        str.getClass();
        this.fromTrackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromTrackIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromTrackId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPagination(Pagination pagination) {
        pagination.getClass();
        this.pagination_ = pagination;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerArgs(PlayerArgs playerArgs) {
        playerArgs.getClass();
        this.playerArgs_ = playerArgs;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68441.f16804xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelatesFeedReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\t\u0007\u0002\b\u0208\t\u0004\n\u0208\u000b\u0208\f\u0002\r\u0208\u000e\t\u000f\u0004", new Object[]{"aid_", "bvid_", "from_", "spmid_", "fromSpmid_", "playerArgs_", "relatesPage_", "sessionId_", "autoplay_", "fromTrackId_", "bizExtra_", "deviceType_", "adExtra_", "pagination_", "refreshNum_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelatesFeedReq> parser = PARSER;
                if (parser == null) {
                    synchronized (RelatesFeedReq.class) {
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

    public String getFromTrackId() {
        return this.fromTrackId_;
    }

    public ByteString getFromTrackIdBytes() {
        return ByteString.copyFromUtf8(this.fromTrackId_);
    }

    public Pagination getPagination() {
        Pagination pagination = this.pagination_;
        return pagination == null ? Pagination.getDefaultInstance() : pagination;
    }

    public PlayerArgs getPlayerArgs() {
        PlayerArgs playerArgs = this.playerArgs_;
        return playerArgs == null ? PlayerArgs.getDefaultInstance() : playerArgs;
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

    public boolean hasPagination() {
        return this.pagination_ != null;
    }

    public boolean hasPlayerArgs() {
        return this.playerArgs_ != null;
    }

    public static Builder newBuilder(RelatesFeedReq relatesFeedReq) {
        return DEFAULT_INSTANCE.createBuilder(relatesFeedReq);
    }

    public static RelatesFeedReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelatesFeedReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelatesFeedReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelatesFeedReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelatesFeedReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelatesFeedReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelatesFeedReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelatesFeedReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelatesFeedReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelatesFeedReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelatesFeedReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelatesFeedReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelatesFeedReq parseFrom(InputStream inputStream) throws IOException {
        return (RelatesFeedReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelatesFeedReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelatesFeedReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelatesFeedReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelatesFeedReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelatesFeedReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelatesFeedReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
