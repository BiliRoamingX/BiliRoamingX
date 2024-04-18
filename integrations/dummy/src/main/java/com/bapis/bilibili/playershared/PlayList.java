package com.bapis.bilibili.playershared;

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
/* loaded from: classes18.dex */
public final class PlayList extends GeneratedMessageLite<PlayList, PlayList.Builder> implements PlayListOrBuilder {
    public static final int BADGE_INFO_FIELD_NUMBER = 5;
    public static final int COVER_FIELD_NUMBER = 3;
    private static final PlayList DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 4;
    private static volatile Parser<PlayList> PARSER = null;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    private BadgeInfo badgeInfo_;
    private long seasonId_;
    private String title_ = "";
    private String cover_ = "";
    private String link_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.PlayList$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81931 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17912xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17912xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17912xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17912xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17912xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17912xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17912xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17912xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayList, Builder> implements PlayListOrBuilder {
        /* synthetic */ Builder(C81931 c81931) {
            this();
        }

        public Builder clearBadgeInfo() {
            copyOnWrite();
            ((PlayList) this.instance).clearBadgeInfo();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((PlayList) this.instance).clearCover();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((PlayList) this.instance).clearLink();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((PlayList) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((PlayList) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
        public BadgeInfo getBadgeInfo() {
            return ((PlayList) this.instance).getBadgeInfo();
        }

        @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
        public String getCover() {
            return ((PlayList) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
        public ByteString getCoverBytes() {
            return ((PlayList) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
        public String getLink() {
            return ((PlayList) this.instance).getLink();
        }

        @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
        public ByteString getLinkBytes() {
            return ((PlayList) this.instance).getLinkBytes();
        }

        @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
        public long getSeasonId() {
            return ((PlayList) this.instance).getSeasonId();
        }

        @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
        public String getTitle() {
            return ((PlayList) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
        public ByteString getTitleBytes() {
            return ((PlayList) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
        public boolean hasBadgeInfo() {
            return ((PlayList) this.instance).hasBadgeInfo();
        }

        public Builder mergeBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((PlayList) this.instance).mergeBadgeInfo(badgeInfo);
            return this;
        }

        public Builder setBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((PlayList) this.instance).setBadgeInfo(badgeInfo);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((PlayList) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayList) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((PlayList) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayList) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((PlayList) this.instance).setSeasonId(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((PlayList) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayList) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(PlayList.DEFAULT_INSTANCE);
        }

        public Builder setBadgeInfo(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((PlayList) this.instance).setBadgeInfo(builder.build());
            return this;
        }
    }

    static {
        PlayList playList = new PlayList();
        DEFAULT_INSTANCE = playList;
        GeneratedMessageLite.registerDefaultInstance(PlayList.class, playList);
    }

    private PlayList() {
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

    public static PlayList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBadgeInfo(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        BadgeInfo badgeInfo2 = this.badgeInfo_;
        if (badgeInfo2 != null && badgeInfo2 != BadgeInfo.getDefaultInstance()) {
            this.badgeInfo_ = BadgeInfo.newBuilder(this.badgeInfo_).mergeFrom((BadgeInfo) badgeInfo).buildPartial();
        } else {
            this.badgeInfo_ = badgeInfo;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayList> parser() {
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
        switch (C81931.f17912xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayList();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\t", new Object[]{"seasonId_", "title_", "cover_", "link_", "badgeInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayList> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayList.class) {
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

    @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
    public BadgeInfo getBadgeInfo() {
        BadgeInfo badgeInfo = this.badgeInfo_;
        return badgeInfo == null ? BadgeInfo.getDefaultInstance() : badgeInfo;
    }

    @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
    public long getSeasonId() {
        return this.seasonId_;
    }

    @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.playershared.PlayListOrBuilder
    public boolean hasBadgeInfo() {
        return this.badgeInfo_ != null;
    }

    public static Builder newBuilder(PlayList playList) {
        return DEFAULT_INSTANCE.createBuilder(playList);
    }

    public static PlayList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayList parseFrom(InputStream inputStream) throws IOException {
        return (PlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayList parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
