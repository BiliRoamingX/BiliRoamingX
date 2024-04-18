package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class EpisodeAdvertisementInfo extends GeneratedMessageLite<EpisodeAdvertisementInfo, EpisodeAdvertisementInfo.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int CID_FIELD_NUMBER = 7;
    private static final EpisodeAdvertisementInfo DEFAULT_INSTANCE;
    public static final int FOLLOW_FIELD_NUMBER = 9;
    public static final int FOLLOW_VIDEO_BNT_FLAG_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 3;
    public static final int NEXT_VIDEO_LINK_FIELD_NUMBER = 6;
    public static final int NEXT_VIDEO_TITLE_FIELD_NUMBER = 5;
    private static volatile Parser<EpisodeAdvertisementInfo> PARSER = null;
    public static final int SEASON_ID_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 2;
    private long aid_;
    private long cid_;
    private int followVideoBntFlag_;
    private int follow_;
    private int seasonId_;
    private String title_ = "";
    private String link_ = "";
    private String nextVideoTitle_ = "";
    private String nextVideoLink_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.EpisodeAdvertisementInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78451 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17567xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17567xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17567xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17567xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17567xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17567xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17567xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17567xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EpisodeAdvertisementInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78451 c78451) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).clearAid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).clearCid();
            return this;
        }

        public Builder clearFollow() {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).clearFollow();
            return this;
        }

        public Builder clearFollowVideoBntFlag() {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).clearFollowVideoBntFlag();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).clearLink();
            return this;
        }

        public Builder clearNextVideoLink() {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).clearNextVideoLink();
            return this;
        }

        public Builder clearNextVideoTitle() {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).clearNextVideoTitle();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).clearTitle();
            return this;
        }

        public long getAid() {
            return ((EpisodeAdvertisementInfo) this.instance).getAid();
        }

        public long getCid() {
            return ((EpisodeAdvertisementInfo) this.instance).getCid();
        }

        public int getFollow() {
            return ((EpisodeAdvertisementInfo) this.instance).getFollow();
        }

        public int getFollowVideoBntFlag() {
            return ((EpisodeAdvertisementInfo) this.instance).getFollowVideoBntFlag();
        }

        public String getLink() {
            return ((EpisodeAdvertisementInfo) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((EpisodeAdvertisementInfo) this.instance).getLinkBytes();
        }

        public String getNextVideoLink() {
            return ((EpisodeAdvertisementInfo) this.instance).getNextVideoLink();
        }

        public ByteString getNextVideoLinkBytes() {
            return ((EpisodeAdvertisementInfo) this.instance).getNextVideoLinkBytes();
        }

        public String getNextVideoTitle() {
            return ((EpisodeAdvertisementInfo) this.instance).getNextVideoTitle();
        }

        public ByteString getNextVideoTitleBytes() {
            return ((EpisodeAdvertisementInfo) this.instance).getNextVideoTitleBytes();
        }

        public int getSeasonId() {
            return ((EpisodeAdvertisementInfo) this.instance).getSeasonId();
        }

        public String getTitle() {
            return ((EpisodeAdvertisementInfo) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((EpisodeAdvertisementInfo) this.instance).getTitleBytes();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setAid(j);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setCid(j);
            return this;
        }

        public Builder setFollow(int i) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setFollow(i);
            return this;
        }

        public Builder setFollowVideoBntFlag(int i) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setFollowVideoBntFlag(i);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setNextVideoLink(String str) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setNextVideoLink(str);
            return this;
        }

        public Builder setNextVideoLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setNextVideoLinkBytes(byteString);
            return this;
        }

        public Builder setNextVideoTitle(String str) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setNextVideoTitle(str);
            return this;
        }

        public Builder setNextVideoTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setNextVideoTitleBytes(byteString);
            return this;
        }

        public Builder setSeasonId(int i) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setSeasonId(i);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((EpisodeAdvertisementInfo) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(EpisodeAdvertisementInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        EpisodeAdvertisementInfo episodeAdvertisementInfo = new EpisodeAdvertisementInfo();
        DEFAULT_INSTANCE = episodeAdvertisementInfo;
        GeneratedMessageLite.registerDefaultInstance(EpisodeAdvertisementInfo.class, episodeAdvertisementInfo);
    }

    private EpisodeAdvertisementInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollow() {
        this.follow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowVideoBntFlag() {
        this.followVideoBntFlag_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextVideoLink() {
        this.nextVideoLink_ = getDefaultInstance().getNextVideoLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextVideoTitle() {
        this.nextVideoTitle_ = getDefaultInstance().getNextVideoTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static EpisodeAdvertisementInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeAdvertisementInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EpisodeAdvertisementInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeAdvertisementInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EpisodeAdvertisementInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EpisodeAdvertisementInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollow(int i) {
        this.follow_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowVideoBntFlag(int i) {
        this.followVideoBntFlag_ = i;
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
    public void setNextVideoLink(String str) {
        str.getClass();
        this.nextVideoLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextVideoLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nextVideoLink_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextVideoTitle(String str) {
        str.getClass();
        this.nextVideoTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextVideoTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nextVideoTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(int i) {
        this.seasonId_ = i;
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
        switch (C78451.f17567xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EpisodeAdvertisementInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u0208\u0006\u0208\u0007\u0002\b\u0004\t\u0004", new Object[]{"aid_", "title_", "link_", "followVideoBntFlag_", "nextVideoTitle_", "nextVideoLink_", "cid_", "seasonId_", "follow_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EpisodeAdvertisementInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (EpisodeAdvertisementInfo.class) {
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

    public long getAid() {
        return this.aid_;
    }

    public long getCid() {
        return this.cid_;
    }

    public int getFollow() {
        return this.follow_;
    }

    public int getFollowVideoBntFlag() {
        return this.followVideoBntFlag_;
    }

    public String getLink() {
        return this.link_;
    }

    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    public String getNextVideoLink() {
        return this.nextVideoLink_;
    }

    public ByteString getNextVideoLinkBytes() {
        return ByteString.copyFromUtf8(this.nextVideoLink_);
    }

    public String getNextVideoTitle() {
        return this.nextVideoTitle_;
    }

    public ByteString getNextVideoTitleBytes() {
        return ByteString.copyFromUtf8(this.nextVideoTitle_);
    }

    public int getSeasonId() {
        return this.seasonId_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(EpisodeAdvertisementInfo episodeAdvertisementInfo) {
        return DEFAULT_INSTANCE.createBuilder(episodeAdvertisementInfo);
    }

    public static EpisodeAdvertisementInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpisodeAdvertisementInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EpisodeAdvertisementInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpisodeAdvertisementInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EpisodeAdvertisementInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EpisodeAdvertisementInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EpisodeAdvertisementInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpisodeAdvertisementInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EpisodeAdvertisementInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EpisodeAdvertisementInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeAdvertisementInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpisodeAdvertisementInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EpisodeAdvertisementInfo parseFrom(InputStream inputStream) throws IOException {
        return (EpisodeAdvertisementInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeAdvertisementInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpisodeAdvertisementInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EpisodeAdvertisementInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EpisodeAdvertisementInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EpisodeAdvertisementInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpisodeAdvertisementInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
