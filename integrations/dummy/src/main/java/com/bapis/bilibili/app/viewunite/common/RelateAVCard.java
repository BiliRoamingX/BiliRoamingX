package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class RelateAVCard extends GeneratedMessageLite<RelateAVCard, RelateAVCard.Builder> implements MessageLiteOrBuilder {
    public static final int CID_FIELD_NUMBER = 2;
    private static final RelateAVCard DEFAULT_INSTANCE;
    public static final int DIMENSION_FIELD_NUMBER = 3;
    public static final int DURATION_FIELD_NUMBER = 1;
    public static final int JUMP_URL_FIELD_NUMBER = 5;
    private static volatile Parser<RelateAVCard> PARSER = null;
    public static final int RCMD_REASON_FIELD_NUMBER = 7;
    public static final int SHOW_UP_NAME_FIELD_NUMBER = 6;
    public static final int STAT_FIELD_NUMBER = 4;
    private long cid_;
    private Dimension dimension_;
    private long duration_;
    private String jumpUrl_ = "";
    private BadgeInfo rcmdReason_;
    private boolean showUpName_;
    private Stat stat_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelateAVCard$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70341 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17015xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17015xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17015xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17015xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17015xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17015xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17015xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17015xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateAVCard, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70341 c70341) {
            this();
        }

        public Builder clearCid() {
            copyOnWrite();
            ((RelateAVCard) this.instance).clearCid();
            return this;
        }

        public Builder clearDimension() {
            copyOnWrite();
            ((RelateAVCard) this.instance).clearDimension();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((RelateAVCard) this.instance).clearDuration();
            return this;
        }

        public Builder clearJumpUrl() {
            copyOnWrite();
            ((RelateAVCard) this.instance).clearJumpUrl();
            return this;
        }

        public Builder clearRcmdReason() {
            copyOnWrite();
            ((RelateAVCard) this.instance).clearRcmdReason();
            return this;
        }

        public Builder clearShowUpName() {
            copyOnWrite();
            ((RelateAVCard) this.instance).clearShowUpName();
            return this;
        }

        public Builder clearStat() {
            copyOnWrite();
            ((RelateAVCard) this.instance).clearStat();
            return this;
        }

        public long getCid() {
            return ((RelateAVCard) this.instance).getCid();
        }

        public Dimension getDimension() {
            return ((RelateAVCard) this.instance).getDimension();
        }

        public long getDuration() {
            return ((RelateAVCard) this.instance).getDuration();
        }

        public String getJumpUrl() {
            return ((RelateAVCard) this.instance).getJumpUrl();
        }

        public ByteString getJumpUrlBytes() {
            return ((RelateAVCard) this.instance).getJumpUrlBytes();
        }

        public BadgeInfo getRcmdReason() {
            return ((RelateAVCard) this.instance).getRcmdReason();
        }

        public boolean getShowUpName() {
            return ((RelateAVCard) this.instance).getShowUpName();
        }

        public Stat getStat() {
            return ((RelateAVCard) this.instance).getStat();
        }

        public boolean hasDimension() {
            return ((RelateAVCard) this.instance).hasDimension();
        }

        public boolean hasRcmdReason() {
            return ((RelateAVCard) this.instance).hasRcmdReason();
        }

        public boolean hasStat() {
            return ((RelateAVCard) this.instance).hasStat();
        }

        public Builder mergeDimension(Dimension dimension) {
            copyOnWrite();
            ((RelateAVCard) this.instance).mergeDimension(dimension);
            return this;
        }

        public Builder mergeRcmdReason(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((RelateAVCard) this.instance).mergeRcmdReason(badgeInfo);
            return this;
        }

        public Builder mergeStat(Stat stat) {
            copyOnWrite();
            ((RelateAVCard) this.instance).mergeStat(stat);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((RelateAVCard) this.instance).setCid(j);
            return this;
        }

        public Builder setDimension(Dimension dimension) {
            copyOnWrite();
            ((RelateAVCard) this.instance).setDimension(dimension);
            return this;
        }

        public Builder setDuration(long j) {
            copyOnWrite();
            ((RelateAVCard) this.instance).setDuration(j);
            return this;
        }

        public Builder setJumpUrl(String str) {
            copyOnWrite();
            ((RelateAVCard) this.instance).setJumpUrl(str);
            return this;
        }

        public Builder setJumpUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateAVCard) this.instance).setJumpUrlBytes(byteString);
            return this;
        }

        public Builder setRcmdReason(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((RelateAVCard) this.instance).setRcmdReason(badgeInfo);
            return this;
        }

        public Builder setShowUpName(boolean z) {
            copyOnWrite();
            ((RelateAVCard) this.instance).setShowUpName(z);
            return this;
        }

        public Builder setStat(Stat stat) {
            copyOnWrite();
            ((RelateAVCard) this.instance).setStat(stat);
            return this;
        }

        private Builder() {
            super(RelateAVCard.DEFAULT_INSTANCE);
        }

        public Builder setDimension(Dimension.Builder builder) {
            copyOnWrite();
            ((RelateAVCard) this.instance).setDimension(builder.build());
            return this;
        }

        public Builder setRcmdReason(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((RelateAVCard) this.instance).setRcmdReason(builder.build());
            return this;
        }

        public Builder setStat(Stat.Builder builder) {
            copyOnWrite();
            ((RelateAVCard) this.instance).setStat(builder.build());
            return this;
        }
    }

    static {
        RelateAVCard relateAVCard = new RelateAVCard();
        DEFAULT_INSTANCE = relateAVCard;
        GeneratedMessageLite.registerDefaultInstance(RelateAVCard.class, relateAVCard);
    }

    private RelateAVCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDimension() {
        this.dimension_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpUrl() {
        this.jumpUrl_ = getDefaultInstance().getJumpUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRcmdReason() {
        this.rcmdReason_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowUpName() {
        this.showUpName_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.stat_ = null;
    }

    public static RelateAVCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDimension(Dimension dimension) {
        dimension.getClass();
        Dimension dimension2 = this.dimension_;
        if (dimension2 != null && dimension2 != Dimension.getDefaultInstance()) {
            this.dimension_ = Dimension.newBuilder(this.dimension_).mergeFrom((Dimension) dimension).buildPartial();
        } else {
            this.dimension_ = dimension;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRcmdReason(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        BadgeInfo badgeInfo2 = this.rcmdReason_;
        if (badgeInfo2 != null && badgeInfo2 != BadgeInfo.getDefaultInstance()) {
            this.rcmdReason_ = BadgeInfo.newBuilder(this.rcmdReason_).mergeFrom((BadgeInfo) badgeInfo).buildPartial();
        } else {
            this.rcmdReason_ = badgeInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStat(Stat stat) {
        stat.getClass();
        Stat stat2 = this.stat_;
        if (stat2 != null && stat2 != Stat.getDefaultInstance()) {
            this.stat_ = Stat.newBuilder(this.stat_).mergeFrom((Stat) stat).buildPartial();
        } else {
            this.stat_ = stat;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelateAVCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateAVCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateAVCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateAVCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateAVCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDimension(Dimension dimension) {
        dimension.getClass();
        this.dimension_ = dimension;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j) {
        this.duration_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpUrl(String str) {
        str.getClass();
        this.jumpUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRcmdReason(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.rcmdReason_ = badgeInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowUpName(boolean z) {
        this.showUpName_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStat(Stat stat) {
        stat.getClass();
        this.stat_ = stat;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70341.f17015xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateAVCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\t\u0004\t\u0005\u0208\u0006\u0007\u0007\t", new Object[]{"duration_", "cid_", "dimension_", "stat_", "jumpUrl_", "showUpName_", "rcmdReason_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateAVCard> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateAVCard.class) {
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

    public long getCid() {
        return this.cid_;
    }

    public Dimension getDimension() {
        Dimension dimension = this.dimension_;
        return dimension == null ? Dimension.getDefaultInstance() : dimension;
    }

    public long getDuration() {
        return this.duration_;
    }

    public String getJumpUrl() {
        return this.jumpUrl_;
    }

    public ByteString getJumpUrlBytes() {
        return ByteString.copyFromUtf8(this.jumpUrl_);
    }

    public BadgeInfo getRcmdReason() {
        BadgeInfo badgeInfo = this.rcmdReason_;
        return badgeInfo == null ? BadgeInfo.getDefaultInstance() : badgeInfo;
    }

    public boolean getShowUpName() {
        return this.showUpName_;
    }

    public Stat getStat() {
        Stat stat = this.stat_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    public boolean hasDimension() {
        return this.dimension_ != null;
    }

    public boolean hasRcmdReason() {
        return this.rcmdReason_ != null;
    }

    public boolean hasStat() {
        return this.stat_ != null;
    }

    public static Builder newBuilder(RelateAVCard relateAVCard) {
        return DEFAULT_INSTANCE.createBuilder(relateAVCard);
    }

    public static RelateAVCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateAVCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateAVCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateAVCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateAVCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateAVCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateAVCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateAVCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateAVCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateAVCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateAVCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateAVCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateAVCard parseFrom(InputStream inputStream) throws IOException {
        return (RelateAVCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateAVCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateAVCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateAVCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateAVCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateAVCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateAVCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
