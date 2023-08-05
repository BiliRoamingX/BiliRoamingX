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
public final class RelateGameCard extends GeneratedMessageLite<RelateGameCard, RelateGameCard.Builder> implements MessageLiteOrBuilder {
    public static final int BADGE_FIELD_NUMBER = 12;
    private static final RelateGameCard DEFAULT_INSTANCE;
    public static final int GAME_RCMD_REASON_FIELD_NUMBER = 10;
    public static final int NOTICE_FIELD_NUMBER = 8;
    public static final int PACK_INFO_FIELD_NUMBER = 7;
    private static volatile Parser<RelateGameCard> PARSER = null;
    public static final int POWER_ICON_STYLE_FIELD_NUMBER = 9;
    public static final int RANK_INFO_FIELD_NUMBER = 6;
    public static final int RATING_FIELD_NUMBER = 4;
    public static final int RESERVE_FIELD_NUMBER = 3;
    public static final int RESERVE_STATUS_FIELD_NUMBER = 1;
    public static final int RESERVE_STATUS_TEXT_FIELD_NUMBER = 2;
    public static final int TAG_NAME_FIELD_NUMBER = 5;
    public static final int WIKI_INFO_FIELD_NUMBER = 11;
    private BadgeInfo badge_;
    private Button notice_;
    private Button packInfo_;
    private PowerIconStyle powerIconStyle_;
    private RankInfo rankInfo_;
    private float rating_;
    private long reserveStatus_;
    private WikiInfo wikiInfo_;
    private String reserveStatusText_ = "";
    private String reserve_ = "";
    private String tagName_ = "";
    private String gameRcmdReason_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelateGameCard$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70441 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17024xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17024xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17024xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17024xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17024xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17024xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17024xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17024xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateGameCard, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70441 c70441) {
            this();
        }

        public Builder clearBadge() {
            copyOnWrite();
            ((RelateGameCard) this.instance).clearBadge();
            return this;
        }

        public Builder clearGameRcmdReason() {
            copyOnWrite();
            ((RelateGameCard) this.instance).clearGameRcmdReason();
            return this;
        }

        public Builder clearNotice() {
            copyOnWrite();
            ((RelateGameCard) this.instance).clearNotice();
            return this;
        }

        public Builder clearPackInfo() {
            copyOnWrite();
            ((RelateGameCard) this.instance).clearPackInfo();
            return this;
        }

        public Builder clearPowerIconStyle() {
            copyOnWrite();
            ((RelateGameCard) this.instance).clearPowerIconStyle();
            return this;
        }

        public Builder clearRankInfo() {
            copyOnWrite();
            ((RelateGameCard) this.instance).clearRankInfo();
            return this;
        }

        public Builder clearRating() {
            copyOnWrite();
            ((RelateGameCard) this.instance).clearRating();
            return this;
        }

        public Builder clearReserve() {
            copyOnWrite();
            ((RelateGameCard) this.instance).clearReserve();
            return this;
        }

        public Builder clearReserveStatus() {
            copyOnWrite();
            ((RelateGameCard) this.instance).clearReserveStatus();
            return this;
        }

        public Builder clearReserveStatusText() {
            copyOnWrite();
            ((RelateGameCard) this.instance).clearReserveStatusText();
            return this;
        }

        public Builder clearTagName() {
            copyOnWrite();
            ((RelateGameCard) this.instance).clearTagName();
            return this;
        }

        public Builder clearWikiInfo() {
            copyOnWrite();
            ((RelateGameCard) this.instance).clearWikiInfo();
            return this;
        }

        public BadgeInfo getBadge() {
            return ((RelateGameCard) this.instance).getBadge();
        }

        public String getGameRcmdReason() {
            return ((RelateGameCard) this.instance).getGameRcmdReason();
        }

        public ByteString getGameRcmdReasonBytes() {
            return ((RelateGameCard) this.instance).getGameRcmdReasonBytes();
        }

        public Button getNotice() {
            return ((RelateGameCard) this.instance).getNotice();
        }

        public Button getPackInfo() {
            return ((RelateGameCard) this.instance).getPackInfo();
        }

        public PowerIconStyle getPowerIconStyle() {
            return ((RelateGameCard) this.instance).getPowerIconStyle();
        }

        public RankInfo getRankInfo() {
            return ((RelateGameCard) this.instance).getRankInfo();
        }

        public float getRating() {
            return ((RelateGameCard) this.instance).getRating();
        }

        public String getReserve() {
            return ((RelateGameCard) this.instance).getReserve();
        }

        public ByteString getReserveBytes() {
            return ((RelateGameCard) this.instance).getReserveBytes();
        }

        public long getReserveStatus() {
            return ((RelateGameCard) this.instance).getReserveStatus();
        }

        public String getReserveStatusText() {
            return ((RelateGameCard) this.instance).getReserveStatusText();
        }

        public ByteString getReserveStatusTextBytes() {
            return ((RelateGameCard) this.instance).getReserveStatusTextBytes();
        }

        public String getTagName() {
            return ((RelateGameCard) this.instance).getTagName();
        }

        public ByteString getTagNameBytes() {
            return ((RelateGameCard) this.instance).getTagNameBytes();
        }

        public WikiInfo getWikiInfo() {
            return ((RelateGameCard) this.instance).getWikiInfo();
        }

        public boolean hasBadge() {
            return ((RelateGameCard) this.instance).hasBadge();
        }

        public boolean hasNotice() {
            return ((RelateGameCard) this.instance).hasNotice();
        }

        public boolean hasPackInfo() {
            return ((RelateGameCard) this.instance).hasPackInfo();
        }

        public boolean hasPowerIconStyle() {
            return ((RelateGameCard) this.instance).hasPowerIconStyle();
        }

        public boolean hasRankInfo() {
            return ((RelateGameCard) this.instance).hasRankInfo();
        }

        public boolean hasWikiInfo() {
            return ((RelateGameCard) this.instance).hasWikiInfo();
        }

        public Builder mergeBadge(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((RelateGameCard) this.instance).mergeBadge(badgeInfo);
            return this;
        }

        public Builder mergeNotice(Button button) {
            copyOnWrite();
            ((RelateGameCard) this.instance).mergeNotice(button);
            return this;
        }

        public Builder mergePackInfo(Button button) {
            copyOnWrite();
            ((RelateGameCard) this.instance).mergePackInfo(button);
            return this;
        }

        public Builder mergePowerIconStyle(PowerIconStyle powerIconStyle) {
            copyOnWrite();
            ((RelateGameCard) this.instance).mergePowerIconStyle(powerIconStyle);
            return this;
        }

        public Builder mergeRankInfo(RankInfo rankInfo) {
            copyOnWrite();
            ((RelateGameCard) this.instance).mergeRankInfo(rankInfo);
            return this;
        }

        public Builder mergeWikiInfo(WikiInfo wikiInfo) {
            copyOnWrite();
            ((RelateGameCard) this.instance).mergeWikiInfo(wikiInfo);
            return this;
        }

        public Builder setBadge(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setBadge(badgeInfo);
            return this;
        }

        public Builder setGameRcmdReason(String str) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setGameRcmdReason(str);
            return this;
        }

        public Builder setGameRcmdReasonBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setGameRcmdReasonBytes(byteString);
            return this;
        }

        public Builder setNotice(Button button) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setNotice(button);
            return this;
        }

        public Builder setPackInfo(Button button) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setPackInfo(button);
            return this;
        }

        public Builder setPowerIconStyle(PowerIconStyle powerIconStyle) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setPowerIconStyle(powerIconStyle);
            return this;
        }

        public Builder setRankInfo(RankInfo rankInfo) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setRankInfo(rankInfo);
            return this;
        }

        public Builder setRating(float f) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setRating(f);
            return this;
        }

        public Builder setReserve(String str) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setReserve(str);
            return this;
        }

        public Builder setReserveBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setReserveBytes(byteString);
            return this;
        }

        public Builder setReserveStatus(long j) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setReserveStatus(j);
            return this;
        }

        public Builder setReserveStatusText(String str) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setReserveStatusText(str);
            return this;
        }

        public Builder setReserveStatusTextBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setReserveStatusTextBytes(byteString);
            return this;
        }

        public Builder setTagName(String str) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setTagName(str);
            return this;
        }

        public Builder setTagNameBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setTagNameBytes(byteString);
            return this;
        }

        public Builder setWikiInfo(WikiInfo wikiInfo) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setWikiInfo(wikiInfo);
            return this;
        }

        private Builder() {
            super(RelateGameCard.DEFAULT_INSTANCE);
        }

        public Builder setBadge(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setBadge(builder.build());
            return this;
        }

        public Builder setNotice(Button.Builder builder) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setNotice(builder.build());
            return this;
        }

        public Builder setPackInfo(Button.Builder builder) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setPackInfo(builder.build());
            return this;
        }

        public Builder setPowerIconStyle(PowerIconStyle.Builder builder) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setPowerIconStyle(builder.build());
            return this;
        }

        public Builder setRankInfo(RankInfo.Builder builder) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setRankInfo(builder.build());
            return this;
        }

        public Builder setWikiInfo(WikiInfo.Builder builder) {
            copyOnWrite();
            ((RelateGameCard) this.instance).setWikiInfo(builder.build());
            return this;
        }
    }

    static {
        RelateGameCard relateGameCard = new RelateGameCard();
        DEFAULT_INSTANCE = relateGameCard;
        GeneratedMessageLite.registerDefaultInstance(RelateGameCard.class, relateGameCard);
    }

    private RelateGameCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadge() {
        this.badge_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameRcmdReason() {
        this.gameRcmdReason_ = getDefaultInstance().getGameRcmdReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotice() {
        this.notice_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackInfo() {
        this.packInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPowerIconStyle() {
        this.powerIconStyle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRankInfo() {
        this.rankInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRating() {
        this.rating_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserve() {
        this.reserve_ = getDefaultInstance().getReserve();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserveStatus() {
        this.reserveStatus_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserveStatusText() {
        this.reserveStatusText_ = getDefaultInstance().getReserveStatusText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTagName() {
        this.tagName_ = getDefaultInstance().getTagName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWikiInfo() {
        this.wikiInfo_ = null;
    }

    public static RelateGameCard getDefaultInstance() {
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
    public void mergeNotice(Button button) {
        button.getClass();
        Button button2 = this.notice_;
        if (button2 != null && button2 != Button.getDefaultInstance()) {
            this.notice_ = Button.newBuilder(this.notice_).mergeFrom((Button) button).buildPartial();
        } else {
            this.notice_ = button;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePackInfo(Button button) {
        button.getClass();
        Button button2 = this.packInfo_;
        if (button2 != null && button2 != Button.getDefaultInstance()) {
            this.packInfo_ = Button.newBuilder(this.packInfo_).mergeFrom((Button) button).buildPartial();
        } else {
            this.packInfo_ = button;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePowerIconStyle(PowerIconStyle powerIconStyle) {
        powerIconStyle.getClass();
        PowerIconStyle powerIconStyle2 = this.powerIconStyle_;
        if (powerIconStyle2 != null && powerIconStyle2 != PowerIconStyle.getDefaultInstance()) {
            this.powerIconStyle_ = PowerIconStyle.newBuilder(this.powerIconStyle_).mergeFrom((PowerIconStyle) powerIconStyle).buildPartial();
        } else {
            this.powerIconStyle_ = powerIconStyle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRankInfo(RankInfo rankInfo) {
        rankInfo.getClass();
        RankInfo rankInfo2 = this.rankInfo_;
        if (rankInfo2 != null && rankInfo2 != RankInfo.getDefaultInstance()) {
            this.rankInfo_ = RankInfo.newBuilder(this.rankInfo_).mergeFrom((RankInfo) rankInfo).buildPartial();
        } else {
            this.rankInfo_ = rankInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWikiInfo(WikiInfo wikiInfo) {
        wikiInfo.getClass();
        WikiInfo wikiInfo2 = this.wikiInfo_;
        if (wikiInfo2 != null && wikiInfo2 != WikiInfo.getDefaultInstance()) {
            this.wikiInfo_ = WikiInfo.newBuilder(this.wikiInfo_).mergeFrom((WikiInfo) wikiInfo).buildPartial();
        } else {
            this.wikiInfo_ = wikiInfo;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelateGameCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateGameCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateGameCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateGameCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateGameCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.badge_ = badgeInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameRcmdReason(String str) {
        str.getClass();
        this.gameRcmdReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameRcmdReasonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.gameRcmdReason_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotice(Button button) {
        button.getClass();
        this.notice_ = button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackInfo(Button button) {
        button.getClass();
        this.packInfo_ = button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPowerIconStyle(PowerIconStyle powerIconStyle) {
        powerIconStyle.getClass();
        this.powerIconStyle_ = powerIconStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRankInfo(RankInfo rankInfo) {
        rankInfo.getClass();
        this.rankInfo_ = rankInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRating(float f) {
        this.rating_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserve(String str) {
        str.getClass();
        this.reserve_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reserve_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveStatus(long j) {
        this.reserveStatus_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveStatusText(String str) {
        str.getClass();
        this.reserveStatusText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveStatusTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reserveStatusText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagName(String str) {
        str.getClass();
        this.tagName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tagName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWikiInfo(WikiInfo wikiInfo) {
        wikiInfo.getClass();
        this.wikiInfo_ = wikiInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70441.f17024xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateGameCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0001\u0005\u0208\u0006\t\u0007\t\b\t\t\t\n\u0208\u000b\t\f\t", new Object[]{"reserveStatus_", "reserveStatusText_", "reserve_", "rating_", "tagName_", "rankInfo_", "packInfo_", "notice_", "powerIconStyle_", "gameRcmdReason_", "wikiInfo_", "badge_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateGameCard> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateGameCard.class) {
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

    public String getGameRcmdReason() {
        return this.gameRcmdReason_;
    }

    public ByteString getGameRcmdReasonBytes() {
        return ByteString.copyFromUtf8(this.gameRcmdReason_);
    }

    public Button getNotice() {
        Button button = this.notice_;
        return button == null ? Button.getDefaultInstance() : button;
    }

    public Button getPackInfo() {
        Button button = this.packInfo_;
        return button == null ? Button.getDefaultInstance() : button;
    }

    public PowerIconStyle getPowerIconStyle() {
        PowerIconStyle powerIconStyle = this.powerIconStyle_;
        return powerIconStyle == null ? PowerIconStyle.getDefaultInstance() : powerIconStyle;
    }

    public RankInfo getRankInfo() {
        RankInfo rankInfo = this.rankInfo_;
        return rankInfo == null ? RankInfo.getDefaultInstance() : rankInfo;
    }

    public float getRating() {
        return this.rating_;
    }

    public String getReserve() {
        return this.reserve_;
    }

    public ByteString getReserveBytes() {
        return ByteString.copyFromUtf8(this.reserve_);
    }

    public long getReserveStatus() {
        return this.reserveStatus_;
    }

    public String getReserveStatusText() {
        return this.reserveStatusText_;
    }

    public ByteString getReserveStatusTextBytes() {
        return ByteString.copyFromUtf8(this.reserveStatusText_);
    }

    public String getTagName() {
        return this.tagName_;
    }

    public ByteString getTagNameBytes() {
        return ByteString.copyFromUtf8(this.tagName_);
    }

    public WikiInfo getWikiInfo() {
        WikiInfo wikiInfo = this.wikiInfo_;
        return wikiInfo == null ? WikiInfo.getDefaultInstance() : wikiInfo;
    }

    public boolean hasBadge() {
        return this.badge_ != null;
    }

    public boolean hasNotice() {
        return this.notice_ != null;
    }

    public boolean hasPackInfo() {
        return this.packInfo_ != null;
    }

    public boolean hasPowerIconStyle() {
        return this.powerIconStyle_ != null;
    }

    public boolean hasRankInfo() {
        return this.rankInfo_ != null;
    }

    public boolean hasWikiInfo() {
        return this.wikiInfo_ != null;
    }

    public static Builder newBuilder(RelateGameCard relateGameCard) {
        return DEFAULT_INSTANCE.createBuilder(relateGameCard);
    }

    public static RelateGameCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateGameCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateGameCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateGameCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateGameCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateGameCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateGameCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateGameCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateGameCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateGameCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateGameCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateGameCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateGameCard parseFrom(InputStream inputStream) throws IOException {
        return (RelateGameCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateGameCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateGameCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateGameCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateGameCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateGameCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateGameCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
