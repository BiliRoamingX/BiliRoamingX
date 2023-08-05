package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class SerialSeason extends GeneratedMessageLite<SerialSeason, SerialSeason.Builder> implements SerialSeasonOrBuilder {
    public static final int BADGE_FIELD_NUMBER = 6;
    public static final int BADGE_INFO_FIELD_NUMBER = 8;
    public static final int BADGE_TYPE_FIELD_NUMBER = 7;
    public static final int COVER_FIELD_NUMBER = 5;
    private static final SerialSeason DEFAULT_INSTANCE;
    public static final int IS_NEW_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 9;
    public static final int NEW_EP_FIELD_NUMBER = 11;
    private static volatile Parser<SerialSeason> PARSER = null;
    public static final int RESOURCE_FIELD_NUMBER = 10;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    public static final int SEASON_TITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private BadgeInfo badgeInfo_;
    private int badgeType_;
    private int isNew_;
    private NewEp newEp_;
    private int seasonId_;
    private String title_ = "";
    private String seasonTitle_ = "";
    private String cover_ = "";
    private String badge_ = "";
    private String link_ = "";
    private String resource_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.SerialSeason$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70581 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17036xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17036xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17036xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17036xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17036xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17036xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17036xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17036xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SerialSeason, Builder> implements SerialSeasonOrBuilder {
        /* synthetic */ Builder(C70581 c70581) {
            this();
        }

        public Builder clearBadge() {
            copyOnWrite();
            ((SerialSeason) this.instance).clearBadge();
            return this;
        }

        public Builder clearBadgeInfo() {
            copyOnWrite();
            ((SerialSeason) this.instance).clearBadgeInfo();
            return this;
        }

        public Builder clearBadgeType() {
            copyOnWrite();
            ((SerialSeason) this.instance).clearBadgeType();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((SerialSeason) this.instance).clearCover();
            return this;
        }

        public Builder clearIsNew() {
            copyOnWrite();
            ((SerialSeason) this.instance).clearIsNew();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((SerialSeason) this.instance).clearLink();
            return this;
        }

        public Builder clearNewEp() {
            copyOnWrite();
            ((SerialSeason) this.instance).clearNewEp();
            return this;
        }

        public Builder clearResource() {
            copyOnWrite();
            ((SerialSeason) this.instance).clearResource();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((SerialSeason) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearSeasonTitle() {
            copyOnWrite();
            ((SerialSeason) this.instance).clearSeasonTitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((SerialSeason) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public String getBadge() {
            return ((SerialSeason) this.instance).getBadge();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public ByteString getBadgeBytes() {
            return ((SerialSeason) this.instance).getBadgeBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public BadgeInfo getBadgeInfo() {
            return ((SerialSeason) this.instance).getBadgeInfo();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public int getBadgeType() {
            return ((SerialSeason) this.instance).getBadgeType();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public String getCover() {
            return ((SerialSeason) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public ByteString getCoverBytes() {
            return ((SerialSeason) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public int getIsNew() {
            return ((SerialSeason) this.instance).getIsNew();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public String getLink() {
            return ((SerialSeason) this.instance).getLink();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public ByteString getLinkBytes() {
            return ((SerialSeason) this.instance).getLinkBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public NewEp getNewEp() {
            return ((SerialSeason) this.instance).getNewEp();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public String getResource() {
            return ((SerialSeason) this.instance).getResource();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public ByteString getResourceBytes() {
            return ((SerialSeason) this.instance).getResourceBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public int getSeasonId() {
            return ((SerialSeason) this.instance).getSeasonId();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public String getSeasonTitle() {
            return ((SerialSeason) this.instance).getSeasonTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public ByteString getSeasonTitleBytes() {
            return ((SerialSeason) this.instance).getSeasonTitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public String getTitle() {
            return ((SerialSeason) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public ByteString getTitleBytes() {
            return ((SerialSeason) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public boolean hasBadgeInfo() {
            return ((SerialSeason) this.instance).hasBadgeInfo();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
        public boolean hasNewEp() {
            return ((SerialSeason) this.instance).hasNewEp();
        }

        public Builder mergeBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((SerialSeason) this.instance).mergeBadgeInfo(badgeInfo);
            return this;
        }

        public Builder mergeNewEp(NewEp newEp) {
            copyOnWrite();
            ((SerialSeason) this.instance).mergeNewEp(newEp);
            return this;
        }

        public Builder setBadge(String str) {
            copyOnWrite();
            ((SerialSeason) this.instance).setBadge(str);
            return this;
        }

        public Builder setBadgeBytes(ByteString byteString) {
            copyOnWrite();
            ((SerialSeason) this.instance).setBadgeBytes(byteString);
            return this;
        }

        public Builder setBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((SerialSeason) this.instance).setBadgeInfo(badgeInfo);
            return this;
        }

        public Builder setBadgeType(int i) {
            copyOnWrite();
            ((SerialSeason) this.instance).setBadgeType(i);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((SerialSeason) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((SerialSeason) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setIsNew(int i) {
            copyOnWrite();
            ((SerialSeason) this.instance).setIsNew(i);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((SerialSeason) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((SerialSeason) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setNewEp(NewEp newEp) {
            copyOnWrite();
            ((SerialSeason) this.instance).setNewEp(newEp);
            return this;
        }

        public Builder setResource(String str) {
            copyOnWrite();
            ((SerialSeason) this.instance).setResource(str);
            return this;
        }

        public Builder setResourceBytes(ByteString byteString) {
            copyOnWrite();
            ((SerialSeason) this.instance).setResourceBytes(byteString);
            return this;
        }

        public Builder setSeasonId(int i) {
            copyOnWrite();
            ((SerialSeason) this.instance).setSeasonId(i);
            return this;
        }

        public Builder setSeasonTitle(String str) {
            copyOnWrite();
            ((SerialSeason) this.instance).setSeasonTitle(str);
            return this;
        }

        public Builder setSeasonTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((SerialSeason) this.instance).setSeasonTitleBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((SerialSeason) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((SerialSeason) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(SerialSeason.DEFAULT_INSTANCE);
        }

        public Builder setBadgeInfo(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((SerialSeason) this.instance).setBadgeInfo(builder.build());
            return this;
        }

        public Builder setNewEp(NewEp.Builder builder) {
            copyOnWrite();
            ((SerialSeason) this.instance).setNewEp(builder.build());
            return this;
        }
    }

    static {
        SerialSeason serialSeason = new SerialSeason();
        DEFAULT_INSTANCE = serialSeason;
        GeneratedMessageLite.registerDefaultInstance(SerialSeason.class, serialSeason);
    }

    private SerialSeason() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadge() {
        this.badge_ = getDefaultInstance().getBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeInfo() {
        this.badgeInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeType() {
        this.badgeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNew() {
        this.isNew_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewEp() {
        this.newEp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = getDefaultInstance().getResource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonTitle() {
        this.seasonTitle_ = getDefaultInstance().getSeasonTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static SerialSeason getDefaultInstance() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNewEp(NewEp newEp) {
        newEp.getClass();
        NewEp newEp2 = this.newEp_;
        if (newEp2 != null && newEp2 != NewEp.getDefaultInstance()) {
            this.newEp_ = NewEp.newBuilder(this.newEp_).mergeFrom((NewEp) newEp).buildPartial();
        } else {
            this.newEp_ = newEp;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SerialSeason parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SerialSeason) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SerialSeason parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SerialSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SerialSeason> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(String str) {
        str.getClass();
        this.badge_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.badge_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeInfo(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.badgeInfo_ = badgeInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeType(int i) {
        this.badgeType_ = i;
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
    public void setIsNew(int i) {
        this.isNew_ = i;
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
    public void setNewEp(NewEp newEp) {
        newEp.getClass();
        this.newEp_ = newEp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(String str) {
        str.getClass();
        this.resource_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.resource_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(int i) {
        this.seasonId_ = i;
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
        switch (C70581.f17036xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SerialSeason();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u0208\u0006\u0208\u0007\u0004\b\t\t\u0208\n\u0208\u000b\t", new Object[]{"seasonId_", "title_", "seasonTitle_", "isNew_", "cover_", "badge_", "badgeType_", "badgeInfo_", "link_", "resource_", "newEp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SerialSeason> parser = PARSER;
                if (parser == null) {
                    synchronized (SerialSeason.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public String getBadge() {
        return this.badge_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public ByteString getBadgeBytes() {
        return ByteString.copyFromUtf8(this.badge_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public BadgeInfo getBadgeInfo() {
        BadgeInfo badgeInfo = this.badgeInfo_;
        return badgeInfo == null ? BadgeInfo.getDefaultInstance() : badgeInfo;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public int getBadgeType() {
        return this.badgeType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public int getIsNew() {
        return this.isNew_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public NewEp getNewEp() {
        NewEp newEp = this.newEp_;
        return newEp == null ? NewEp.getDefaultInstance() : newEp;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public String getResource() {
        return this.resource_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public ByteString getResourceBytes() {
        return ByteString.copyFromUtf8(this.resource_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public int getSeasonId() {
        return this.seasonId_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public String getSeasonTitle() {
        return this.seasonTitle_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public ByteString getSeasonTitleBytes() {
        return ByteString.copyFromUtf8(this.seasonTitle_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public boolean hasBadgeInfo() {
        return this.badgeInfo_ != null;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SerialSeasonOrBuilder
    public boolean hasNewEp() {
        return this.newEp_ != null;
    }

    public static Builder newBuilder(SerialSeason serialSeason) {
        return DEFAULT_INSTANCE.createBuilder(serialSeason);
    }

    public static SerialSeason parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SerialSeason) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SerialSeason parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SerialSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SerialSeason parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SerialSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SerialSeason parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SerialSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SerialSeason parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SerialSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SerialSeason parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SerialSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SerialSeason parseFrom(InputStream inputStream) throws IOException {
        return (SerialSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SerialSeason parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SerialSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SerialSeason parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SerialSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SerialSeason parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SerialSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
