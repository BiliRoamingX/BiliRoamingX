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
public final class EpisodeInfo extends GeneratedMessageLite<EpisodeInfo, EpisodeInfo.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 3;
    public static final int CID_FIELD_NUMBER = 2;
    public static final int COVER_FIELD_NUMBER = 6;
    private static final EpisodeInfo DEFAULT_INSTANCE;
    public static final int EP_ID_FIELD_NUMBER = 1;
    public static final int EP_STATUS_FIELD_NUMBER = 4;
    public static final int INTERACTION_FIELD_NUMBER = 8;
    public static final int LONG_TITLE_FIELD_NUMBER = 9;
    private static volatile Parser<EpisodeInfo> PARSER = null;
    public static final int SEASON_INFO_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 7;
    private long aid_;
    private long cid_;
    private int epId_;
    private int epStatus_;
    private Interaction interaction_;
    private SeasonInfo seasonInfo_;
    private String cover_ = "";
    private String title_ = "";
    private String longTitle_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.EpisodeInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78461 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17568xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17568xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17568xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17568xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17568xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17568xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17568xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17568xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EpisodeInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78461 c78461) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((EpisodeInfo) this.instance).clearAid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((EpisodeInfo) this.instance).clearCid();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((EpisodeInfo) this.instance).clearCover();
            return this;
        }

        public Builder clearEpId() {
            copyOnWrite();
            ((EpisodeInfo) this.instance).clearEpId();
            return this;
        }

        public Builder clearEpStatus() {
            copyOnWrite();
            ((EpisodeInfo) this.instance).clearEpStatus();
            return this;
        }

        public Builder clearInteraction() {
            copyOnWrite();
            ((EpisodeInfo) this.instance).clearInteraction();
            return this;
        }

        public Builder clearLongTitle() {
            copyOnWrite();
            ((EpisodeInfo) this.instance).clearLongTitle();
            return this;
        }

        public Builder clearSeasonInfo() {
            copyOnWrite();
            ((EpisodeInfo) this.instance).clearSeasonInfo();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((EpisodeInfo) this.instance).clearTitle();
            return this;
        }

        public long getAid() {
            return ((EpisodeInfo) this.instance).getAid();
        }

        public long getCid() {
            return ((EpisodeInfo) this.instance).getCid();
        }

        public String getCover() {
            return ((EpisodeInfo) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((EpisodeInfo) this.instance).getCoverBytes();
        }

        public int getEpId() {
            return ((EpisodeInfo) this.instance).getEpId();
        }

        public int getEpStatus() {
            return ((EpisodeInfo) this.instance).getEpStatus();
        }

        public Interaction getInteraction() {
            return ((EpisodeInfo) this.instance).getInteraction();
        }

        public String getLongTitle() {
            return ((EpisodeInfo) this.instance).getLongTitle();
        }

        public ByteString getLongTitleBytes() {
            return ((EpisodeInfo) this.instance).getLongTitleBytes();
        }

        public SeasonInfo getSeasonInfo() {
            return ((EpisodeInfo) this.instance).getSeasonInfo();
        }

        public String getTitle() {
            return ((EpisodeInfo) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((EpisodeInfo) this.instance).getTitleBytes();
        }

        public boolean hasInteraction() {
            return ((EpisodeInfo) this.instance).hasInteraction();
        }

        public boolean hasSeasonInfo() {
            return ((EpisodeInfo) this.instance).hasSeasonInfo();
        }

        public Builder mergeInteraction(Interaction interaction) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).mergeInteraction(interaction);
            return this;
        }

        public Builder mergeSeasonInfo(SeasonInfo seasonInfo) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).mergeSeasonInfo(seasonInfo);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setAid(j);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setCid(j);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setEpId(int i) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setEpId(i);
            return this;
        }

        public Builder setEpStatus(int i) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setEpStatus(i);
            return this;
        }

        public Builder setInteraction(Interaction interaction) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setInteraction(interaction);
            return this;
        }

        public Builder setLongTitle(String str) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setLongTitle(str);
            return this;
        }

        public Builder setLongTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setLongTitleBytes(byteString);
            return this;
        }

        public Builder setSeasonInfo(SeasonInfo seasonInfo) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setSeasonInfo(seasonInfo);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(EpisodeInfo.DEFAULT_INSTANCE);
        }

        public Builder setInteraction(Interaction.Builder builder) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setInteraction(builder.build());
            return this;
        }

        public Builder setSeasonInfo(SeasonInfo.Builder builder) {
            copyOnWrite();
            ((EpisodeInfo) this.instance).setSeasonInfo(builder.build());
            return this;
        }
    }

    static {
        EpisodeInfo episodeInfo = new EpisodeInfo();
        DEFAULT_INSTANCE = episodeInfo;
        GeneratedMessageLite.registerDefaultInstance(EpisodeInfo.class, episodeInfo);
    }

    public EpisodeInfo() {
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
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpId() {
        this.epId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpStatus() {
        this.epStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInteraction() {
        this.interaction_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongTitle() {
        this.longTitle_ = getDefaultInstance().getLongTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonInfo() {
        this.seasonInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static EpisodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInteraction(Interaction interaction) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSeasonInfo(SeasonInfo seasonInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EpisodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EpisodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EpisodeInfo> parser() {
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
    public void setEpId(int i) {
        this.epId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpStatus(int i) {
        this.epStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInteraction(Interaction interaction) {
        interaction.getClass();
        this.interaction_ = interaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongTitle(String str) {
        str.getClass();
        this.longTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.longTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonInfo(SeasonInfo seasonInfo) {
        seasonInfo.getClass();
        this.seasonInfo_ = seasonInfo;
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
        switch (C78461.f17568xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EpisodeInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002\u0004\u0004\u0005\t\u0006\u0208\u0007\u0208\b\t\t\u0208", new Object[]{"epId_", "cid_", "aid_", "epStatus_", "seasonInfo_", "cover_", "title_", "interaction_", "longTitle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EpisodeInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (EpisodeInfo.class) {
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

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public int getEpId() {
        return this.epId_;
    }

    public int getEpStatus() {
        return this.epStatus_;
    }

    public Interaction getInteraction() {
        Interaction interaction = this.interaction_;
        return interaction == null ? Interaction.getDefaultInstance() : interaction;
    }

    public String getLongTitle() {
        return this.longTitle_;
    }

    public ByteString getLongTitleBytes() {
        return ByteString.copyFromUtf8(this.longTitle_);
    }

    public SeasonInfo getSeasonInfo() {
        SeasonInfo seasonInfo = this.seasonInfo_;
        return seasonInfo == null ? SeasonInfo.getDefaultInstance() : seasonInfo;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public boolean hasInteraction() {
        return this.interaction_ != null;
    }

    public boolean hasSeasonInfo() {
        return this.seasonInfo_ != null;
    }

    public static Builder newBuilder(EpisodeInfo episodeInfo) {
        return DEFAULT_INSTANCE.createBuilder(episodeInfo);
    }

    public static EpisodeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpisodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EpisodeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpisodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EpisodeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EpisodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EpisodeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpisodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EpisodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EpisodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpisodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EpisodeInfo parseFrom(InputStream inputStream) throws IOException {
        return (EpisodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpisodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EpisodeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EpisodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EpisodeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpisodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
