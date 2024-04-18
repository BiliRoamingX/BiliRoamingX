package com.bapis.bilibili.app.viewunite.pgcanymodel;

import com.bapis.bilibili.app.viewunite.common.BadgeInfo;
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
public final class PlayFloatLayerActivity extends GeneratedMessageLite<PlayFloatLayerActivity, PlayFloatLayerActivity.Builder> implements PlayFloatLayerActivityOrBuilder {
    public static final int AD_BADGE_TYPE_FIELD_NUMBER = 4;
    public static final int BADGE_FIELD_NUMBER = 8;
    private static final PlayFloatLayerActivity DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LINK_FIELD_NUMBER = 5;
    private static volatile Parser<PlayFloatLayerActivity> PARSER = null;
    public static final int PIC_ANIMA_URL_FIELD_NUMBER = 7;
    public static final int PIC_URL_FIELD_NUMBER = 6;
    public static final int SHOW_RATE_TIME_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int adBadgeType_;
    private BadgeInfo badge_;
    private int id_;
    private long showRateTime_;
    private int type_;
    private String title_ = "";
    private String link_ = "";
    private String picUrl_ = "";
    private String picAnimaUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivity$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70921 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17069xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17069xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17069xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17069xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17069xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17069xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17069xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17069xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayFloatLayerActivity, Builder> implements PlayFloatLayerActivityOrBuilder {
        /* synthetic */ Builder(C70921 c70921) {
            this();
        }

        public Builder clearAdBadgeType() {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).clearAdBadgeType();
            return this;
        }

        public Builder clearBadge() {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).clearBadge();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).clearId();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).clearLink();
            return this;
        }

        public Builder clearPicAnimaUrl() {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).clearPicAnimaUrl();
            return this;
        }

        public Builder clearPicUrl() {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).clearPicUrl();
            return this;
        }

        public Builder clearShowRateTime() {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).clearShowRateTime();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public int getAdBadgeType() {
            return ((PlayFloatLayerActivity) this.instance).getAdBadgeType();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public BadgeInfo getBadge() {
            return ((PlayFloatLayerActivity) this.instance).getBadge();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public int getId() {
            return ((PlayFloatLayerActivity) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public String getLink() {
            return ((PlayFloatLayerActivity) this.instance).getLink();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public ByteString getLinkBytes() {
            return ((PlayFloatLayerActivity) this.instance).getLinkBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public String getPicAnimaUrl() {
            return ((PlayFloatLayerActivity) this.instance).getPicAnimaUrl();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public ByteString getPicAnimaUrlBytes() {
            return ((PlayFloatLayerActivity) this.instance).getPicAnimaUrlBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public String getPicUrl() {
            return ((PlayFloatLayerActivity) this.instance).getPicUrl();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public ByteString getPicUrlBytes() {
            return ((PlayFloatLayerActivity) this.instance).getPicUrlBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public long getShowRateTime() {
            return ((PlayFloatLayerActivity) this.instance).getShowRateTime();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public String getTitle() {
            return ((PlayFloatLayerActivity) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public ByteString getTitleBytes() {
            return ((PlayFloatLayerActivity) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public int getType() {
            return ((PlayFloatLayerActivity) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
        public boolean hasBadge() {
            return ((PlayFloatLayerActivity) this.instance).hasBadge();
        }

        public Builder mergeBadge(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).mergeBadge(badgeInfo);
            return this;
        }

        public Builder setAdBadgeType(int i) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setAdBadgeType(i);
            return this;
        }

        public Builder setBadge(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setBadge(badgeInfo);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setId(i);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setPicAnimaUrl(String str) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setPicAnimaUrl(str);
            return this;
        }

        public Builder setPicAnimaUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setPicAnimaUrlBytes(byteString);
            return this;
        }

        public Builder setPicUrl(String str) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setPicUrl(str);
            return this;
        }

        public Builder setPicUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setPicUrlBytes(byteString);
            return this;
        }

        public Builder setShowRateTime(long j) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setShowRateTime(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(PlayFloatLayerActivity.DEFAULT_INSTANCE);
        }

        public Builder setBadge(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((PlayFloatLayerActivity) this.instance).setBadge(builder.build());
            return this;
        }
    }

    static {
        PlayFloatLayerActivity playFloatLayerActivity = new PlayFloatLayerActivity();
        DEFAULT_INSTANCE = playFloatLayerActivity;
        GeneratedMessageLite.registerDefaultInstance(PlayFloatLayerActivity.class, playFloatLayerActivity);
    }

    private PlayFloatLayerActivity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdBadgeType() {
        this.adBadgeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadge() {
        this.badge_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPicAnimaUrl() {
        this.picAnimaUrl_ = getDefaultInstance().getPicAnimaUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPicUrl() {
        this.picUrl_ = getDefaultInstance().getPicUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowRateTime() {
        this.showRateTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static PlayFloatLayerActivity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBadge(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        BadgeInfo badgeInfo2 = this.badge_;
        if (badgeInfo2 != null && badgeInfo2 != BadgeInfo.getDefaultInstance()) {
            this.badge_ = BadgeInfo.newBuilder(this.badge_).mergeFrom((BadgeInfo) badgeInfo).buildPartial();
        } else {
            this.badge_ = badgeInfo;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayFloatLayerActivity parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayFloatLayerActivity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayFloatLayerActivity parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayFloatLayerActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayFloatLayerActivity> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdBadgeType(int i) {
        this.adBadgeType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.badge_ = badgeInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
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
    public void setPicAnimaUrl(String str) {
        str.getClass();
        this.picAnimaUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicAnimaUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.picAnimaUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicUrl(String str) {
        str.getClass();
        this.picUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.picUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowRateTime(long j) {
        this.showRateTime_ = j;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70921.f17069xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayFloatLayerActivity();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0004\u0004\u0004\u0005\u0208\u0006\u0208\u0007\u0208\b\t\t\u0002", new Object[]{"id_", "title_", "type_", "adBadgeType_", "link_", "picUrl_", "picAnimaUrl_", "badge_", "showRateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayFloatLayerActivity> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayFloatLayerActivity.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public int getAdBadgeType() {
        return this.adBadgeType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public BadgeInfo getBadge() {
        BadgeInfo badgeInfo = this.badge_;
        return badgeInfo == null ? BadgeInfo.getDefaultInstance() : badgeInfo;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public String getPicAnimaUrl() {
        return this.picAnimaUrl_;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public ByteString getPicAnimaUrlBytes() {
        return ByteString.copyFromUtf8(this.picAnimaUrl_);
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public String getPicUrl() {
        return this.picUrl_;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public ByteString getPicUrlBytes() {
        return ByteString.copyFromUtf8(this.picUrl_);
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public long getShowRateTime() {
        return this.showRateTime_;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public int getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.PlayFloatLayerActivityOrBuilder
    public boolean hasBadge() {
        return this.badge_ != null;
    }

    public static Builder newBuilder(PlayFloatLayerActivity playFloatLayerActivity) {
        return DEFAULT_INSTANCE.createBuilder(playFloatLayerActivity);
    }

    public static PlayFloatLayerActivity parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayFloatLayerActivity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayFloatLayerActivity parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayFloatLayerActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayFloatLayerActivity parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayFloatLayerActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayFloatLayerActivity parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayFloatLayerActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayFloatLayerActivity parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayFloatLayerActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayFloatLayerActivity parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayFloatLayerActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayFloatLayerActivity parseFrom(InputStream inputStream) throws IOException {
        return (PlayFloatLayerActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayFloatLayerActivity parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayFloatLayerActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayFloatLayerActivity parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayFloatLayerActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayFloatLayerActivity parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayFloatLayerActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
