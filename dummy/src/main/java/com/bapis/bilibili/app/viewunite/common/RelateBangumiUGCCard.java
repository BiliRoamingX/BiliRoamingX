package com.bapis.bilibili.app.viewunite.common;

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
public final class RelateBangumiUGCCard extends GeneratedMessageLite<RelateBangumiUGCCard, RelateBangumiUGCCard.Builder> implements MessageLiteOrBuilder {
    public static final int BADGE_FIELD_NUMBER = 1;
    private static final RelateBangumiUGCCard DEFAULT_INSTANCE;
    private static volatile Parser<RelateBangumiUGCCard> PARSER = null;
    public static final int RATING_FIELD_NUMBER = 3;
    public static final int STAT_FIELD_NUMBER = 2;
    private BadgeInfo badge_;
    private Rating rating_;
    private Stat stat_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelateBangumiUGCCard$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70381 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17019xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17019xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17019xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17019xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17019xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17019xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17019xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17019xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateBangumiUGCCard, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70381 c70381) {
            this();
        }

        public Builder clearBadge() {
            copyOnWrite();
            ((RelateBangumiUGCCard) this.instance).clearBadge();
            return this;
        }

        public Builder clearRating() {
            copyOnWrite();
            ((RelateBangumiUGCCard) this.instance).clearRating();
            return this;
        }

        public Builder clearStat() {
            copyOnWrite();
            ((RelateBangumiUGCCard) this.instance).clearStat();
            return this;
        }

        public BadgeInfo getBadge() {
            return ((RelateBangumiUGCCard) this.instance).getBadge();
        }

        public Rating getRating() {
            return ((RelateBangumiUGCCard) this.instance).getRating();
        }

        public Stat getStat() {
            return ((RelateBangumiUGCCard) this.instance).getStat();
        }

        public boolean hasBadge() {
            return ((RelateBangumiUGCCard) this.instance).hasBadge();
        }

        public boolean hasRating() {
            return ((RelateBangumiUGCCard) this.instance).hasRating();
        }

        public boolean hasStat() {
            return ((RelateBangumiUGCCard) this.instance).hasStat();
        }

        public Builder mergeBadge(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((RelateBangumiUGCCard) this.instance).mergeBadge(badgeInfo);
            return this;
        }

        public Builder mergeRating(Rating rating) {
            copyOnWrite();
            ((RelateBangumiUGCCard) this.instance).mergeRating(rating);
            return this;
        }

        public Builder mergeStat(Stat stat) {
            copyOnWrite();
            ((RelateBangumiUGCCard) this.instance).mergeStat(stat);
            return this;
        }

        public Builder setBadge(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((RelateBangumiUGCCard) this.instance).setBadge(badgeInfo);
            return this;
        }

        public Builder setRating(Rating rating) {
            copyOnWrite();
            ((RelateBangumiUGCCard) this.instance).setRating(rating);
            return this;
        }

        public Builder setStat(Stat stat) {
            copyOnWrite();
            ((RelateBangumiUGCCard) this.instance).setStat(stat);
            return this;
        }

        private Builder() {
            super(RelateBangumiUGCCard.DEFAULT_INSTANCE);
        }

        public Builder setBadge(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((RelateBangumiUGCCard) this.instance).setBadge(builder.build());
            return this;
        }

        public Builder setRating(Rating.Builder builder) {
            copyOnWrite();
            ((RelateBangumiUGCCard) this.instance).setRating(builder.build());
            return this;
        }

        public Builder setStat(Stat.Builder builder) {
            copyOnWrite();
            ((RelateBangumiUGCCard) this.instance).setStat(builder.build());
            return this;
        }
    }

    static {
        RelateBangumiUGCCard relateBangumiUGCCard = new RelateBangumiUGCCard();
        DEFAULT_INSTANCE = relateBangumiUGCCard;
        GeneratedMessageLite.registerDefaultInstance(RelateBangumiUGCCard.class, relateBangumiUGCCard);
    }

    private RelateBangumiUGCCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadge() {
        this.badge_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRating() {
        this.rating_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.stat_ = null;
    }

    public static RelateBangumiUGCCard getDefaultInstance() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRating(Rating rating) {
        rating.getClass();
        Rating rating2 = this.rating_;
        if (rating2 != null && rating2 != Rating.getDefaultInstance()) {
            this.rating_ = Rating.newBuilder(this.rating_).mergeFrom((Rating) rating).buildPartial();
        } else {
            this.rating_ = rating;
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

    public static RelateBangumiUGCCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateBangumiUGCCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateBangumiUGCCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateBangumiUGCCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateBangumiUGCCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.badge_ = badgeInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRating(Rating rating) {
        rating.getClass();
        this.rating_ = rating;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStat(Stat stat) {
        stat.getClass();
        this.stat_ = stat;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70381.f17019xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateBangumiUGCCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"badge_", "stat_", "rating_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateBangumiUGCCard> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateBangumiUGCCard.class) {
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

    public BadgeInfo getBadge() {
        BadgeInfo badgeInfo = this.badge_;
        return badgeInfo == null ? BadgeInfo.getDefaultInstance() : badgeInfo;
    }

    public Rating getRating() {
        Rating rating = this.rating_;
        return rating == null ? Rating.getDefaultInstance() : rating;
    }

    public Stat getStat() {
        Stat stat = this.stat_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    public boolean hasBadge() {
        return this.badge_ != null;
    }

    public boolean hasRating() {
        return this.rating_ != null;
    }

    public boolean hasStat() {
        return this.stat_ != null;
    }

    public static Builder newBuilder(RelateBangumiUGCCard relateBangumiUGCCard) {
        return DEFAULT_INSTANCE.createBuilder(relateBangumiUGCCard);
    }

    public static RelateBangumiUGCCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateBangumiUGCCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateBangumiUGCCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateBangumiUGCCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateBangumiUGCCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateBangumiUGCCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateBangumiUGCCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateBangumiUGCCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateBangumiUGCCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateBangumiUGCCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateBangumiUGCCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateBangumiUGCCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateBangumiUGCCard parseFrom(InputStream inputStream) throws IOException {
        return (RelateBangumiUGCCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateBangumiUGCCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateBangumiUGCCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateBangumiUGCCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateBangumiUGCCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateBangumiUGCCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateBangumiUGCCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
