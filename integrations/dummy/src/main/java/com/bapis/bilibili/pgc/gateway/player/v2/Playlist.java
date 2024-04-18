package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes14.dex */
public final class Playlist extends GeneratedMessageLite<Playlist, Playlist.Builder> implements PlaylistOrBuilder {
    public static final int BADGE_INFO_FIELD_NUMBER = 5;
    public static final int COVER_FIELD_NUMBER = 3;
    private static final Playlist DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 4;
    private static volatile Parser<Playlist> PARSER = null;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    private BadgeInfo badgeInfo_;
    private long seasonId_;
    private String title_ = "";
    private String cover_ = "";
    private String link_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.Playlist$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78701 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17585xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17585xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17585xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17585xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17585xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17585xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17585xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17585xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Playlist, Builder> implements PlaylistOrBuilder {
        /* synthetic */ Builder(C78701 c78701) {
            this();
        }

        public Builder clearBadgeInfo() {
            copyOnWrite();
            ((Playlist) this.instance).clearBadgeInfo();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((Playlist) this.instance).clearCover();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((Playlist) this.instance).clearLink();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((Playlist) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Playlist) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
        public BadgeInfo getBadgeInfo() {
            return ((Playlist) this.instance).getBadgeInfo();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
        public String getCover() {
            return ((Playlist) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
        public ByteString getCoverBytes() {
            return ((Playlist) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
        public String getLink() {
            return ((Playlist) this.instance).getLink();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
        public ByteString getLinkBytes() {
            return ((Playlist) this.instance).getLinkBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
        public long getSeasonId() {
            return ((Playlist) this.instance).getSeasonId();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
        public String getTitle() {
            return ((Playlist) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
        public ByteString getTitleBytes() {
            return ((Playlist) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
        public boolean hasBadgeInfo() {
            return ((Playlist) this.instance).hasBadgeInfo();
        }

        public Builder mergeBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((Playlist) this.instance).mergeBadgeInfo(badgeInfo);
            return this;
        }

        public Builder setBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((Playlist) this.instance).setBadgeInfo(badgeInfo);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((Playlist) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((Playlist) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((Playlist) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((Playlist) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((Playlist) this.instance).setSeasonId(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Playlist) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Playlist) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(Playlist.DEFAULT_INSTANCE);
        }

        public Builder setBadgeInfo(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((Playlist) this.instance).setBadgeInfo(builder.build());
            return this;
        }
    }

    static {
        Playlist playlist = new Playlist();
        DEFAULT_INSTANCE = playlist;
        GeneratedMessageLite.registerDefaultInstance(Playlist.class, playlist);
    }

    private Playlist() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeInfo() {
        this.badgeInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static Playlist getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBadgeInfo(BadgeInfo badgeInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Playlist parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Playlist) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Playlist parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Playlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Playlist> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeInfo(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.badgeInfo_ = badgeInfo;
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
    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(long j) {
        this.seasonId_ = j;
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
        switch (C78701.f17585xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Playlist();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\t", new Object[]{"seasonId_", "title_", "cover_", "link_", "badgeInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Playlist> parser = PARSER;
                if (parser == null) {
                    synchronized (Playlist.class) {
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

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
    public BadgeInfo getBadgeInfo() {
        BadgeInfo badgeInfo = this.badgeInfo_;
        return badgeInfo == null ? BadgeInfo.getDefaultInstance() : badgeInfo;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
    public long getSeasonId() {
        return this.seasonId_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.PlaylistOrBuilder
    public boolean hasBadgeInfo() {
        return this.badgeInfo_ != null;
    }

    public static Builder newBuilder(Playlist playlist) {
        return DEFAULT_INSTANCE.createBuilder(playlist);
    }

    public static Playlist parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Playlist) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Playlist parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Playlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Playlist parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Playlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Playlist parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Playlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Playlist parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Playlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Playlist parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Playlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Playlist parseFrom(InputStream inputStream) throws IOException {
        return (Playlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Playlist parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Playlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Playlist parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Playlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Playlist parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Playlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
