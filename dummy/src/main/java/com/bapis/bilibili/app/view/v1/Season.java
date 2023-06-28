package com.bapis.bilibili.app.view.v1;

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
public final class Season extends GeneratedMessageLite<Season, Season.Builder> implements MessageLiteOrBuilder {
    public static final int ALLOW_DOWNLOAD_FIELD_NUMBER = 1;
    public static final int COVER_FIELD_NUMBER = 5;
    private static final Season DEFAULT_INSTANCE;
    public static final int IS_FINISH_FIELD_NUMBER = 6;
    public static final int IS_JUMP_FIELD_NUMBER = 3;
    public static final int NEWEST_EP_ID_FIELD_NUMBER = 7;
    public static final int NEWEST_EP_INDEX_FIELD_NUMBER = 8;
    public static final int OGV_PLAYURL_FIELD_NUMBER = 13;
    private static volatile Parser<Season> PARSER = null;
    public static final int PLAYER_FIELD_NUMBER = 12;
    public static final int SEASON_ID_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int TOTAL_COUNT_FIELD_NUMBER = 9;
    public static final int USER_SEASON_FIELD_NUMBER = 11;
    public static final int WEEKDAY_FIELD_NUMBER = 10;
    private int isFinish_;
    private int isJump_;
    private long newestEpId_;
    private SeasonPlayer player_;
    private long seasonId_;
    private long totalCount_;
    private UserSeason userSeason_;
    private int weekday_;
    private String allowDownload_ = "";
    private String title_ = "";
    private String cover_ = "";
    private String newestEpIndex_ = "";
    private String ogvPlayurl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Season$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68501 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16810xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16810xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16810xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16810xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16810xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16810xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16810xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16810xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Season, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68501 c68501) {
            this();
        }

        public Builder clearAllowDownload() {
            copyOnWrite();
            ((Season) this.instance).clearAllowDownload();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((Season) this.instance).clearCover();
            return this;
        }

        public Builder clearIsFinish() {
            copyOnWrite();
            ((Season) this.instance).clearIsFinish();
            return this;
        }

        public Builder clearIsJump() {
            copyOnWrite();
            ((Season) this.instance).clearIsJump();
            return this;
        }

        public Builder clearNewestEpId() {
            copyOnWrite();
            ((Season) this.instance).clearNewestEpId();
            return this;
        }

        public Builder clearNewestEpIndex() {
            copyOnWrite();
            ((Season) this.instance).clearNewestEpIndex();
            return this;
        }

        public Builder clearOgvPlayurl() {
            copyOnWrite();
            ((Season) this.instance).clearOgvPlayurl();
            return this;
        }

        public Builder clearPlayer() {
            copyOnWrite();
            ((Season) this.instance).clearPlayer();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((Season) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Season) this.instance).clearTitle();
            return this;
        }

        public Builder clearTotalCount() {
            copyOnWrite();
            ((Season) this.instance).clearTotalCount();
            return this;
        }

        public Builder clearUserSeason() {
            copyOnWrite();
            ((Season) this.instance).clearUserSeason();
            return this;
        }

        public Builder clearWeekday() {
            copyOnWrite();
            ((Season) this.instance).clearWeekday();
            return this;
        }

        public String getAllowDownload() {
            return ((Season) this.instance).getAllowDownload();
        }

        public ByteString getAllowDownloadBytes() {
            return ((Season) this.instance).getAllowDownloadBytes();
        }

        public String getCover() {
            return ((Season) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((Season) this.instance).getCoverBytes();
        }

        public int getIsFinish() {
            return ((Season) this.instance).getIsFinish();
        }

        public int getIsJump() {
            return ((Season) this.instance).getIsJump();
        }

        public long getNewestEpId() {
            return ((Season) this.instance).getNewestEpId();
        }

        public String getNewestEpIndex() {
            return ((Season) this.instance).getNewestEpIndex();
        }

        public ByteString getNewestEpIndexBytes() {
            return ((Season) this.instance).getNewestEpIndexBytes();
        }

        public String getOgvPlayurl() {
            return ((Season) this.instance).getOgvPlayurl();
        }

        public ByteString getOgvPlayurlBytes() {
            return ((Season) this.instance).getOgvPlayurlBytes();
        }

        public SeasonPlayer getPlayer() {
            return ((Season) this.instance).getPlayer();
        }

        public long getSeasonId() {
            return ((Season) this.instance).getSeasonId();
        }

        public String getTitle() {
            return ((Season) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Season) this.instance).getTitleBytes();
        }

        public long getTotalCount() {
            return ((Season) this.instance).getTotalCount();
        }

        public UserSeason getUserSeason() {
            return ((Season) this.instance).getUserSeason();
        }

        public int getWeekday() {
            return ((Season) this.instance).getWeekday();
        }

        public boolean hasPlayer() {
            return ((Season) this.instance).hasPlayer();
        }

        public boolean hasUserSeason() {
            return ((Season) this.instance).hasUserSeason();
        }

        public Builder mergePlayer(SeasonPlayer seasonPlayer) {
            copyOnWrite();
            ((Season) this.instance).mergePlayer(seasonPlayer);
            return this;
        }

        public Builder mergeUserSeason(UserSeason userSeason) {
            copyOnWrite();
            ((Season) this.instance).mergeUserSeason(userSeason);
            return this;
        }

        public Builder setAllowDownload(String str) {
            copyOnWrite();
            ((Season) this.instance).setAllowDownload(str);
            return this;
        }

        public Builder setAllowDownloadBytes(ByteString byteString) {
            copyOnWrite();
            ((Season) this.instance).setAllowDownloadBytes(byteString);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((Season) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((Season) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setIsFinish(int i) {
            copyOnWrite();
            ((Season) this.instance).setIsFinish(i);
            return this;
        }

        public Builder setIsJump(int i) {
            copyOnWrite();
            ((Season) this.instance).setIsJump(i);
            return this;
        }

        public Builder setNewestEpId(long j) {
            copyOnWrite();
            ((Season) this.instance).setNewestEpId(j);
            return this;
        }

        public Builder setNewestEpIndex(String str) {
            copyOnWrite();
            ((Season) this.instance).setNewestEpIndex(str);
            return this;
        }

        public Builder setNewestEpIndexBytes(ByteString byteString) {
            copyOnWrite();
            ((Season) this.instance).setNewestEpIndexBytes(byteString);
            return this;
        }

        public Builder setOgvPlayurl(String str) {
            copyOnWrite();
            ((Season) this.instance).setOgvPlayurl(str);
            return this;
        }

        public Builder setOgvPlayurlBytes(ByteString byteString) {
            copyOnWrite();
            ((Season) this.instance).setOgvPlayurlBytes(byteString);
            return this;
        }

        public Builder setPlayer(SeasonPlayer seasonPlayer) {
            copyOnWrite();
            ((Season) this.instance).setPlayer(seasonPlayer);
            return this;
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((Season) this.instance).setSeasonId(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Season) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Season) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setTotalCount(long j) {
            copyOnWrite();
            ((Season) this.instance).setTotalCount(j);
            return this;
        }

        public Builder setUserSeason(UserSeason userSeason) {
            copyOnWrite();
            ((Season) this.instance).setUserSeason(userSeason);
            return this;
        }

        public Builder setWeekday(int i) {
            copyOnWrite();
            ((Season) this.instance).setWeekday(i);
            return this;
        }

        private Builder() {
            super(Season.DEFAULT_INSTANCE);
        }

        public Builder setPlayer(SeasonPlayer.Builder builder) {
            copyOnWrite();
            ((Season) this.instance).setPlayer(builder.build());
            return this;
        }

        public Builder setUserSeason(UserSeason.Builder builder) {
            copyOnWrite();
            ((Season) this.instance).setUserSeason(builder.build());
            return this;
        }
    }

    static {
        Season season = new Season();
        DEFAULT_INSTANCE = season;
        GeneratedMessageLite.registerDefaultInstance(Season.class, season);
    }

    private Season() {
    }

    public void clearAllowDownload() {
        this.allowDownload_ = getDefaultInstance().getAllowDownload();
    }

    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    public void clearIsFinish() {
        this.isFinish_ = 0;
    }

    public void clearIsJump() {
        this.isJump_ = 0;
    }

    public void clearNewestEpId() {
        this.newestEpId_ = 0L;
    }

    public void clearNewestEpIndex() {
        this.newestEpIndex_ = getDefaultInstance().getNewestEpIndex();
    }

    public void clearOgvPlayurl() {
        this.ogvPlayurl_ = getDefaultInstance().getOgvPlayurl();
    }

    public void clearPlayer() {
        this.player_ = null;
    }

    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public void clearTotalCount() {
        this.totalCount_ = 0L;
    }

    public void clearUserSeason() {
        this.userSeason_ = null;
    }

    public void clearWeekday() {
        this.weekday_ = 0;
    }

    public static Season getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergePlayer(SeasonPlayer seasonPlayer) {
    }

    public void mergeUserSeason(UserSeason userSeason) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Season parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Season) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Season parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Season) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Season> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAllowDownload(String str) {
        str.getClass();
        this.allowDownload_ = str;
    }

    public void setAllowDownloadBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.allowDownload_ = byteString.toStringUtf8();
    }

    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    public void setIsFinish(int i) {
        this.isFinish_ = i;
    }

    public void setIsJump(int i) {
        this.isJump_ = i;
    }

    public void setNewestEpId(long j) {
        this.newestEpId_ = j;
    }

    public void setNewestEpIndex(String str) {
        str.getClass();
        this.newestEpIndex_ = str;
    }

    public void setNewestEpIndexBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.newestEpIndex_ = byteString.toStringUtf8();
    }

    public void setOgvPlayurl(String str) {
        str.getClass();
        this.ogvPlayurl_ = str;
    }

    public void setOgvPlayurlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ogvPlayurl_ = byteString.toStringUtf8();
    }

    public void setPlayer(SeasonPlayer seasonPlayer) {
        seasonPlayer.getClass();
        this.player_ = seasonPlayer;
    }

    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public void setTotalCount(long j) {
        this.totalCount_ = j;
    }

    public void setUserSeason(UserSeason userSeason) {
        userSeason.getClass();
        this.userSeason_ = userSeason;
    }

    public void setWeekday(int i) {
        this.weekday_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68501.f16810xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Season();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0004\u0004\u0208\u0005\u0208\u0006\u0004\u0007\u0002\b\u0208\t\u0002\n\u0004\u000b\t\f\t\r\u0208", new Object[]{"allowDownload_", "seasonId_", "isJump_", "title_", "cover_", "isFinish_", "newestEpId_", "newestEpIndex_", "totalCount_", "weekday_", "userSeason_", "player_", "ogvPlayurl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Season> parser = PARSER;
                if (parser == null) {
                    synchronized (Season.class) {
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

    public String getAllowDownload() {
        return this.allowDownload_;
    }

    public ByteString getAllowDownloadBytes() {
        return ByteString.copyFromUtf8(this.allowDownload_);
    }

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public int getIsFinish() {
        return this.isFinish_;
    }

    public int getIsJump() {
        return this.isJump_;
    }

    public long getNewestEpId() {
        return this.newestEpId_;
    }

    public String getNewestEpIndex() {
        return this.newestEpIndex_;
    }

    public ByteString getNewestEpIndexBytes() {
        return ByteString.copyFromUtf8(this.newestEpIndex_);
    }

    public String getOgvPlayurl() {
        return this.ogvPlayurl_;
    }

    public ByteString getOgvPlayurlBytes() {
        return ByteString.copyFromUtf8(this.ogvPlayurl_);
    }

    public SeasonPlayer getPlayer() {
        SeasonPlayer seasonPlayer = this.player_;
        return seasonPlayer == null ? SeasonPlayer.getDefaultInstance() : seasonPlayer;
    }

    public long getSeasonId() {
        return this.seasonId_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public long getTotalCount() {
        return this.totalCount_;
    }

    public UserSeason getUserSeason() {
        UserSeason userSeason = this.userSeason_;
        return userSeason == null ? UserSeason.getDefaultInstance() : userSeason;
    }

    public int getWeekday() {
        return this.weekday_;
    }

    public boolean hasPlayer() {
        return this.player_ != null;
    }

    public boolean hasUserSeason() {
        return this.userSeason_ != null;
    }

    public static Builder newBuilder(Season season) {
        return DEFAULT_INSTANCE.createBuilder(season);
    }

    public static Season parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Season) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Season parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Season) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Season parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Season) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Season parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Season) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Season parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Season) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Season parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Season) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Season parseFrom(InputStream inputStream) throws IOException {
        return (Season) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Season parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Season) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Season parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Season) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Season parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Season) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
