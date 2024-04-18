package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Any;
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
public final class RelateCard extends GeneratedMessageLite<RelateCard, RelateCard.Builder> implements RelateCardOrBuilder {
    public static final int AI_CARD_FIELD_NUMBER = 9;
    public static final int AV_FIELD_NUMBER = 2;
    public static final int BANGUMI_AV_FIELD_NUMBER = 8;
    public static final int BANGUMI_FIELD_NUMBER = 3;
    public static final int BANGUMI_UGC_FIELD_NUMBER = 13;
    public static final int BASIC_INFO_FIELD_NUMBER = 12;
    public static final int CM_FIELD_NUMBER = 6;
    public static final int CM_STOCK_FIELD_NUMBER = 11;
    private static final RelateCard DEFAULT_INSTANCE;
    public static final int GAME_FIELD_NUMBER = 5;
    public static final int LIVE_FIELD_NUMBER = 7;
    private static volatile Parser<RelateCard> PARSER = null;
    public static final int RELATE_CARD_TYPE_FIELD_NUMBER = 1;
    public static final int RESOURCE_FIELD_NUMBER = 4;
    public static final int SPECIAL_FIELD_NUMBER = 14;
    public static final int THREE_POINT_FIELD_NUMBER = 10;
    private CardBasicInfo basicInfo_;
    private int cardCase_ = 0;
    private Object card_;
    private Any cmStock_;
    private int relateCardType_;
    private RelateThreePoint threePoint_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelateCard$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70401 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17021xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17021xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17021xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17021xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17021xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17021xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17021xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17021xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateCard, Builder> implements RelateCardOrBuilder {
        /* synthetic */ Builder(C70401 c70401) {
            this();
        }

        public Builder clearAiCard() {
            copyOnWrite();
            ((RelateCard) this.instance).clearAiCard();
            return this;
        }

        public Builder clearAv() {
            copyOnWrite();
            ((RelateCard) this.instance).clearAv();
            return this;
        }

        public Builder clearBangumi() {
            copyOnWrite();
            ((RelateCard) this.instance).clearBangumi();
            return this;
        }

        public Builder clearBangumiAv() {
            copyOnWrite();
            ((RelateCard) this.instance).clearBangumiAv();
            return this;
        }

        public Builder clearBangumiUgc() {
            copyOnWrite();
            ((RelateCard) this.instance).clearBangumiUgc();
            return this;
        }

        public Builder clearBasicInfo() {
            copyOnWrite();
            ((RelateCard) this.instance).clearBasicInfo();
            return this;
        }

        public Builder clearCard() {
            copyOnWrite();
            ((RelateCard) this.instance).clearCard();
            return this;
        }

        public Builder clearCm() {
            copyOnWrite();
            ((RelateCard) this.instance).clearCm();
            return this;
        }

        public Builder clearCmStock() {
            copyOnWrite();
            ((RelateCard) this.instance).clearCmStock();
            return this;
        }

        public Builder clearGame() {
            copyOnWrite();
            ((RelateCard) this.instance).clearGame();
            return this;
        }

        public Builder clearLive() {
            copyOnWrite();
            ((RelateCard) this.instance).clearLive();
            return this;
        }

        public Builder clearRelateCardType() {
            copyOnWrite();
            ((RelateCard) this.instance).clearRelateCardType();
            return this;
        }

        public Builder clearResource() {
            copyOnWrite();
            ((RelateCard) this.instance).clearResource();
            return this;
        }

        public Builder clearSpecial() {
            copyOnWrite();
            ((RelateCard) this.instance).clearSpecial();
            return this;
        }

        public Builder clearThreePoint() {
            copyOnWrite();
            ((RelateCard) this.instance).clearThreePoint();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public RelatedAICard getAiCard() {
            return ((RelateCard) this.instance).getAiCard();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public RelateAVCard getAv() {
            return ((RelateCard) this.instance).getAv();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public RelateBangumiCard getBangumi() {
            return ((RelateCard) this.instance).getBangumi();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public RelateBangumiAvCard getBangumiAv() {
            return ((RelateCard) this.instance).getBangumiAv();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public RelateBangumiUGCCard getBangumiUgc() {
            return ((RelateCard) this.instance).getBangumiUgc();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public CardBasicInfo getBasicInfo() {
            return ((RelateCard) this.instance).getBasicInfo();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public CardCase getCardCase() {
            return ((RelateCard) this.instance).getCardCase();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public RelateCMCard getCm() {
            return ((RelateCard) this.instance).getCm();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public Any getCmStock() {
            return ((RelateCard) this.instance).getCmStock();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public RelateGameCard getGame() {
            return ((RelateCard) this.instance).getGame();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public RelateLiveCard getLive() {
            return ((RelateCard) this.instance).getLive();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public RelateCardType getRelateCardType() {
            return ((RelateCard) this.instance).getRelateCardType();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public int getRelateCardTypeValue() {
            return ((RelateCard) this.instance).getRelateCardTypeValue();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public RelateBangumiResourceCard getResource() {
            return ((RelateCard) this.instance).getResource();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public RelateSpecial getSpecial() {
            return ((RelateCard) this.instance).getSpecial();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public RelateThreePoint getThreePoint() {
            return ((RelateCard) this.instance).getThreePoint();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasAiCard() {
            return ((RelateCard) this.instance).hasAiCard();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasAv() {
            return ((RelateCard) this.instance).hasAv();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasBangumi() {
            return ((RelateCard) this.instance).hasBangumi();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasBangumiAv() {
            return ((RelateCard) this.instance).hasBangumiAv();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasBangumiUgc() {
            return ((RelateCard) this.instance).hasBangumiUgc();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasBasicInfo() {
            return ((RelateCard) this.instance).hasBasicInfo();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasCm() {
            return ((RelateCard) this.instance).hasCm();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasCmStock() {
            return ((RelateCard) this.instance).hasCmStock();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasGame() {
            return ((RelateCard) this.instance).hasGame();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasLive() {
            return ((RelateCard) this.instance).hasLive();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasResource() {
            return ((RelateCard) this.instance).hasResource();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasSpecial() {
            return ((RelateCard) this.instance).hasSpecial();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
        public boolean hasThreePoint() {
            return ((RelateCard) this.instance).hasThreePoint();
        }

        public Builder mergeAiCard(RelatedAICard relatedAICard) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeAiCard(relatedAICard);
            return this;
        }

        public Builder mergeAv(RelateAVCard relateAVCard) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeAv(relateAVCard);
            return this;
        }

        public Builder mergeBangumi(RelateBangumiCard relateBangumiCard) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeBangumi(relateBangumiCard);
            return this;
        }

        public Builder mergeBangumiAv(RelateBangumiAvCard relateBangumiAvCard) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeBangumiAv(relateBangumiAvCard);
            return this;
        }

        public Builder mergeBangumiUgc(RelateBangumiUGCCard relateBangumiUGCCard) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeBangumiUgc(relateBangumiUGCCard);
            return this;
        }

        public Builder mergeBasicInfo(CardBasicInfo cardBasicInfo) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeBasicInfo(cardBasicInfo);
            return this;
        }

        public Builder mergeCm(RelateCMCard relateCMCard) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeCm(relateCMCard);
            return this;
        }

        public Builder mergeCmStock(Any any) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeCmStock(any);
            return this;
        }

        public Builder mergeGame(RelateGameCard relateGameCard) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeGame(relateGameCard);
            return this;
        }

        public Builder mergeLive(RelateLiveCard relateLiveCard) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeLive(relateLiveCard);
            return this;
        }

        public Builder mergeResource(RelateBangumiResourceCard relateBangumiResourceCard) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeResource(relateBangumiResourceCard);
            return this;
        }

        public Builder mergeSpecial(RelateSpecial relateSpecial) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeSpecial(relateSpecial);
            return this;
        }

        public Builder mergeThreePoint(RelateThreePoint relateThreePoint) {
            copyOnWrite();
            ((RelateCard) this.instance).mergeThreePoint(relateThreePoint);
            return this;
        }

        public Builder setAiCard(RelatedAICard relatedAICard) {
            copyOnWrite();
            ((RelateCard) this.instance).setAiCard(relatedAICard);
            return this;
        }

        public Builder setAv(RelateAVCard relateAVCard) {
            copyOnWrite();
            ((RelateCard) this.instance).setAv(relateAVCard);
            return this;
        }

        public Builder setBangumi(RelateBangumiCard relateBangumiCard) {
            copyOnWrite();
            ((RelateCard) this.instance).setBangumi(relateBangumiCard);
            return this;
        }

        public Builder setBangumiAv(RelateBangumiAvCard relateBangumiAvCard) {
            copyOnWrite();
            ((RelateCard) this.instance).setBangumiAv(relateBangumiAvCard);
            return this;
        }

        public Builder setBangumiUgc(RelateBangumiUGCCard relateBangumiUGCCard) {
            copyOnWrite();
            ((RelateCard) this.instance).setBangumiUgc(relateBangumiUGCCard);
            return this;
        }

        public Builder setBasicInfo(CardBasicInfo cardBasicInfo) {
            copyOnWrite();
            ((RelateCard) this.instance).setBasicInfo(cardBasicInfo);
            return this;
        }

        public Builder setCm(RelateCMCard relateCMCard) {
            copyOnWrite();
            ((RelateCard) this.instance).setCm(relateCMCard);
            return this;
        }

        public Builder setCmStock(Any any) {
            copyOnWrite();
            ((RelateCard) this.instance).setCmStock(any);
            return this;
        }

        public Builder setGame(RelateGameCard relateGameCard) {
            copyOnWrite();
            ((RelateCard) this.instance).setGame(relateGameCard);
            return this;
        }

        public Builder setLive(RelateLiveCard relateLiveCard) {
            copyOnWrite();
            ((RelateCard) this.instance).setLive(relateLiveCard);
            return this;
        }

        public Builder setRelateCardType(RelateCardType relateCardType) {
            copyOnWrite();
            ((RelateCard) this.instance).setRelateCardType(relateCardType);
            return this;
        }

        public Builder setRelateCardTypeValue(int i) {
            copyOnWrite();
            ((RelateCard) this.instance).setRelateCardTypeValue(i);
            return this;
        }

        public Builder setResource(RelateBangumiResourceCard relateBangumiResourceCard) {
            copyOnWrite();
            ((RelateCard) this.instance).setResource(relateBangumiResourceCard);
            return this;
        }

        public Builder setSpecial(RelateSpecial relateSpecial) {
            copyOnWrite();
            ((RelateCard) this.instance).setSpecial(relateSpecial);
            return this;
        }

        public Builder setThreePoint(RelateThreePoint relateThreePoint) {
            copyOnWrite();
            ((RelateCard) this.instance).setThreePoint(relateThreePoint);
            return this;
        }

        private Builder() {
            super(RelateCard.DEFAULT_INSTANCE);
        }

        public Builder setAiCard(RelatedAICard.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setAiCard(builder.build());
            return this;
        }

        public Builder setAv(RelateAVCard.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setAv(builder.build());
            return this;
        }

        public Builder setBangumi(RelateBangumiCard.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setBangumi(builder.build());
            return this;
        }

        public Builder setBangumiAv(RelateBangumiAvCard.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setBangumiAv(builder.build());
            return this;
        }

        public Builder setBangumiUgc(RelateBangumiUGCCard.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setBangumiUgc(builder.build());
            return this;
        }

        public Builder setBasicInfo(CardBasicInfo.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setBasicInfo(builder.build());
            return this;
        }

        public Builder setCm(RelateCMCard.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setCm(builder.build());
            return this;
        }

        public Builder setCmStock(Any.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setCmStock(builder.build());
            return this;
        }

        public Builder setGame(RelateGameCard.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setGame(builder.build());
            return this;
        }

        public Builder setLive(RelateLiveCard.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setLive(builder.build());
            return this;
        }

        public Builder setResource(RelateBangumiResourceCard.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setResource(builder.build());
            return this;
        }

        public Builder setSpecial(RelateSpecial.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setSpecial(builder.build());
            return this;
        }

        public Builder setThreePoint(RelateThreePoint.Builder builder) {
            copyOnWrite();
            ((RelateCard) this.instance).setThreePoint(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum CardCase {
        AV(2),
        BANGUMI(3),
        RESOURCE(4),
        GAME(5),
        CM(6),
        LIVE(7),
        BANGUMI_AV(8),
        AI_CARD(9),
        BANGUMI_UGC(13),
        SPECIAL(14),
        CARD_NOT_SET(0);
        
        private final int value;

        CardCase(int i) {
            this.value = i;
        }

        public static CardCase forNumber(int i) {
            if (i != 0) {
                if (i != 13) {
                    if (i != 14) {
                        switch (i) {
                            case 2:
                                return AV;
                            case 3:
                                return BANGUMI;
                            case 4:
                                return RESOURCE;
                            case 5:
                                return GAME;
                            case 6:
                                return CM;
                            case 7:
                                return LIVE;
                            case 8:
                                return BANGUMI_AV;
                            case 9:
                                return AI_CARD;
                            default:
                                return null;
                        }
                    }
                    return SPECIAL;
                }
                return BANGUMI_UGC;
            }
            return CARD_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CardCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        RelateCard relateCard = new RelateCard();
        DEFAULT_INSTANCE = relateCard;
        GeneratedMessageLite.registerDefaultInstance(RelateCard.class, relateCard);
    }

    private RelateCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAiCard() {
        if (this.cardCase_ == 9) {
            this.cardCase_ = 0;
            this.card_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAv() {
        if (this.cardCase_ == 2) {
            this.cardCase_ = 0;
            this.card_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBangumi() {
        if (this.cardCase_ == 3) {
            this.cardCase_ = 0;
            this.card_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBangumiAv() {
        if (this.cardCase_ == 8) {
            this.cardCase_ = 0;
            this.card_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBangumiUgc() {
        if (this.cardCase_ == 13) {
            this.cardCase_ = 0;
            this.card_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBasicInfo() {
        this.basicInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCard() {
        this.cardCase_ = 0;
        this.card_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCm() {
        if (this.cardCase_ == 6) {
            this.cardCase_ = 0;
            this.card_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmStock() {
        this.cmStock_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGame() {
        if (this.cardCase_ == 5) {
            this.cardCase_ = 0;
            this.card_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLive() {
        if (this.cardCase_ == 7) {
            this.cardCase_ = 0;
            this.card_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelateCardType() {
        this.relateCardType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        if (this.cardCase_ == 4) {
            this.cardCase_ = 0;
            this.card_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpecial() {
        if (this.cardCase_ == 14) {
            this.cardCase_ = 0;
            this.card_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreePoint() {
        this.threePoint_ = null;
    }

    public static RelateCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAiCard(RelatedAICard relatedAICard) {
        relatedAICard.getClass();
        if (this.cardCase_ == 9 && this.card_ != RelatedAICard.getDefaultInstance()) {
            this.card_ = RelatedAICard.newBuilder((RelatedAICard) this.card_).mergeFrom((RelatedAICard) relatedAICard).buildPartial();
        } else {
            this.card_ = relatedAICard;
        }
        this.cardCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAv(RelateAVCard relateAVCard) {
        relateAVCard.getClass();
        if (this.cardCase_ == 2 && this.card_ != RelateAVCard.getDefaultInstance()) {
            this.card_ = RelateAVCard.newBuilder((RelateAVCard) this.card_).mergeFrom((RelateAVCard) relateAVCard).buildPartial();
        } else {
            this.card_ = relateAVCard;
        }
        this.cardCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBangumi(RelateBangumiCard relateBangumiCard) {
        relateBangumiCard.getClass();
        if (this.cardCase_ == 3 && this.card_ != RelateBangumiCard.getDefaultInstance()) {
            this.card_ = RelateBangumiCard.newBuilder((RelateBangumiCard) this.card_).mergeFrom((RelateBangumiCard) relateBangumiCard).buildPartial();
        } else {
            this.card_ = relateBangumiCard;
        }
        this.cardCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBangumiAv(RelateBangumiAvCard relateBangumiAvCard) {
        relateBangumiAvCard.getClass();
        if (this.cardCase_ == 8 && this.card_ != RelateBangumiAvCard.getDefaultInstance()) {
            this.card_ = RelateBangumiAvCard.newBuilder((RelateBangumiAvCard) this.card_).mergeFrom((RelateBangumiAvCard) relateBangumiAvCard).buildPartial();
        } else {
            this.card_ = relateBangumiAvCard;
        }
        this.cardCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBangumiUgc(RelateBangumiUGCCard relateBangumiUGCCard) {
        relateBangumiUGCCard.getClass();
        if (this.cardCase_ == 13 && this.card_ != RelateBangumiUGCCard.getDefaultInstance()) {
            this.card_ = RelateBangumiUGCCard.newBuilder((RelateBangumiUGCCard) this.card_).mergeFrom((RelateBangumiUGCCard) relateBangumiUGCCard).buildPartial();
        } else {
            this.card_ = relateBangumiUGCCard;
        }
        this.cardCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBasicInfo(CardBasicInfo cardBasicInfo) {
        cardBasicInfo.getClass();
        CardBasicInfo cardBasicInfo2 = this.basicInfo_;
        if (cardBasicInfo2 != null && cardBasicInfo2 != CardBasicInfo.getDefaultInstance()) {
            this.basicInfo_ = CardBasicInfo.newBuilder(this.basicInfo_).mergeFrom((CardBasicInfo) cardBasicInfo).buildPartial();
        } else {
            this.basicInfo_ = cardBasicInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCm(RelateCMCard relateCMCard) {
        relateCMCard.getClass();
        if (this.cardCase_ == 6 && this.card_ != RelateCMCard.getDefaultInstance()) {
            this.card_ = RelateCMCard.newBuilder((RelateCMCard) this.card_).mergeFrom((RelateCMCard) relateCMCard).buildPartial();
        } else {
            this.card_ = relateCMCard;
        }
        this.cardCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCmStock(Any any) {
        any.getClass();
        Any any2 = this.cmStock_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.cmStock_ = Any.newBuilder(this.cmStock_).mergeFrom((Any) any).buildPartial();
        } else {
            this.cmStock_ = any;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGame(RelateGameCard relateGameCard) {
        relateGameCard.getClass();
        if (this.cardCase_ == 5 && this.card_ != RelateGameCard.getDefaultInstance()) {
            this.card_ = RelateGameCard.newBuilder((RelateGameCard) this.card_).mergeFrom((RelateGameCard) relateGameCard).buildPartial();
        } else {
            this.card_ = relateGameCard;
        }
        this.cardCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLive(RelateLiveCard relateLiveCard) {
        relateLiveCard.getClass();
        if (this.cardCase_ == 7 && this.card_ != RelateLiveCard.getDefaultInstance()) {
            this.card_ = RelateLiveCard.newBuilder((RelateLiveCard) this.card_).mergeFrom((RelateLiveCard) relateLiveCard).buildPartial();
        } else {
            this.card_ = relateLiveCard;
        }
        this.cardCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResource(RelateBangumiResourceCard relateBangumiResourceCard) {
        relateBangumiResourceCard.getClass();
        if (this.cardCase_ == 4 && this.card_ != RelateBangumiResourceCard.getDefaultInstance()) {
            this.card_ = RelateBangumiResourceCard.newBuilder((RelateBangumiResourceCard) this.card_).mergeFrom((RelateBangumiResourceCard) relateBangumiResourceCard).buildPartial();
        } else {
            this.card_ = relateBangumiResourceCard;
        }
        this.cardCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpecial(RelateSpecial relateSpecial) {
        relateSpecial.getClass();
        if (this.cardCase_ == 14 && this.card_ != RelateSpecial.getDefaultInstance()) {
            this.card_ = RelateSpecial.newBuilder((RelateSpecial) this.card_).mergeFrom((RelateSpecial) relateSpecial).buildPartial();
        } else {
            this.card_ = relateSpecial;
        }
        this.cardCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeThreePoint(RelateThreePoint relateThreePoint) {
        relateThreePoint.getClass();
        RelateThreePoint relateThreePoint2 = this.threePoint_;
        if (relateThreePoint2 != null && relateThreePoint2 != RelateThreePoint.getDefaultInstance()) {
            this.threePoint_ = RelateThreePoint.newBuilder(this.threePoint_).mergeFrom((RelateThreePoint) relateThreePoint).buildPartial();
        } else {
            this.threePoint_ = relateThreePoint;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelateCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAiCard(RelatedAICard relatedAICard) {
        relatedAICard.getClass();
        this.card_ = relatedAICard;
        this.cardCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAv(RelateAVCard relateAVCard) {
        relateAVCard.getClass();
        this.card_ = relateAVCard;
        this.cardCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBangumi(RelateBangumiCard relateBangumiCard) {
        relateBangumiCard.getClass();
        this.card_ = relateBangumiCard;
        this.cardCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBangumiAv(RelateBangumiAvCard relateBangumiAvCard) {
        relateBangumiAvCard.getClass();
        this.card_ = relateBangumiAvCard;
        this.cardCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBangumiUgc(RelateBangumiUGCCard relateBangumiUGCCard) {
        relateBangumiUGCCard.getClass();
        this.card_ = relateBangumiUGCCard;
        this.cardCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBasicInfo(CardBasicInfo cardBasicInfo) {
        cardBasicInfo.getClass();
        this.basicInfo_ = cardBasicInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCm(RelateCMCard relateCMCard) {
        relateCMCard.getClass();
        this.card_ = relateCMCard;
        this.cardCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmStock(Any any) {
        any.getClass();
        this.cmStock_ = any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGame(RelateGameCard relateGameCard) {
        relateGameCard.getClass();
        this.card_ = relateGameCard;
        this.cardCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLive(RelateLiveCard relateLiveCard) {
        relateLiveCard.getClass();
        this.card_ = relateLiveCard;
        this.cardCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelateCardType(RelateCardType relateCardType) {
        this.relateCardType_ = relateCardType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelateCardTypeValue(int i) {
        this.relateCardType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(RelateBangumiResourceCard relateBangumiResourceCard) {
        relateBangumiResourceCard.getClass();
        this.card_ = relateBangumiResourceCard;
        this.cardCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpecial(RelateSpecial relateSpecial) {
        relateSpecial.getClass();
        this.card_ = relateSpecial;
        this.cardCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreePoint(RelateThreePoint relateThreePoint) {
        relateThreePoint.getClass();
        this.threePoint_ = relateThreePoint;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70401.f17021xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n\t\u000b\t\f\t\r<\u0000\u000e<\u0000", new Object[]{"card_", "cardCase_", "relateCardType_", RelateAVCard.class, RelateBangumiCard.class, RelateBangumiResourceCard.class, RelateGameCard.class, RelateCMCard.class, RelateLiveCard.class, RelateBangumiAvCard.class, RelatedAICard.class, "threePoint_", "cmStock_", "basicInfo_", RelateBangumiUGCCard.class, RelateSpecial.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateCard> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateCard.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public RelatedAICard getAiCard() {
        if (this.cardCase_ == 9) {
            return (RelatedAICard) this.card_;
        }
        return RelatedAICard.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public RelateAVCard getAv() {
        if (this.cardCase_ == 2) {
            return (RelateAVCard) this.card_;
        }
        return RelateAVCard.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public RelateBangumiCard getBangumi() {
        if (this.cardCase_ == 3) {
            return (RelateBangumiCard) this.card_;
        }
        return RelateBangumiCard.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public RelateBangumiAvCard getBangumiAv() {
        if (this.cardCase_ == 8) {
            return (RelateBangumiAvCard) this.card_;
        }
        return RelateBangumiAvCard.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public RelateBangumiUGCCard getBangumiUgc() {
        if (this.cardCase_ == 13) {
            return (RelateBangumiUGCCard) this.card_;
        }
        return RelateBangumiUGCCard.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public CardBasicInfo getBasicInfo() {
        CardBasicInfo cardBasicInfo = this.basicInfo_;
        return cardBasicInfo == null ? CardBasicInfo.getDefaultInstance() : cardBasicInfo;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public CardCase getCardCase() {
        return CardCase.forNumber(this.cardCase_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public RelateCMCard getCm() {
        if (this.cardCase_ == 6) {
            return (RelateCMCard) this.card_;
        }
        return RelateCMCard.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public Any getCmStock() {
        Any any = this.cmStock_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public RelateGameCard getGame() {
        if (this.cardCase_ == 5) {
            return (RelateGameCard) this.card_;
        }
        return RelateGameCard.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public RelateLiveCard getLive() {
        if (this.cardCase_ == 7) {
            return (RelateLiveCard) this.card_;
        }
        return RelateLiveCard.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public RelateCardType getRelateCardType() {
        RelateCardType forNumber = RelateCardType.forNumber(this.relateCardType_);
        return forNumber == null ? RelateCardType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public int getRelateCardTypeValue() {
        return this.relateCardType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public RelateBangumiResourceCard getResource() {
        if (this.cardCase_ == 4) {
            return (RelateBangumiResourceCard) this.card_;
        }
        return RelateBangumiResourceCard.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public RelateSpecial getSpecial() {
        if (this.cardCase_ == 14) {
            return (RelateSpecial) this.card_;
        }
        return RelateSpecial.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public RelateThreePoint getThreePoint() {
        RelateThreePoint relateThreePoint = this.threePoint_;
        return relateThreePoint == null ? RelateThreePoint.getDefaultInstance() : relateThreePoint;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasAiCard() {
        return this.cardCase_ == 9;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasAv() {
        return this.cardCase_ == 2;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasBangumi() {
        return this.cardCase_ == 3;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasBangumiAv() {
        return this.cardCase_ == 8;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasBangumiUgc() {
        return this.cardCase_ == 13;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasBasicInfo() {
        return this.basicInfo_ != null;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasCm() {
        return this.cardCase_ == 6;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasCmStock() {
        return this.cmStock_ != null;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasGame() {
        return this.cardCase_ == 5;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasLive() {
        return this.cardCase_ == 7;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasResource() {
        return this.cardCase_ == 4;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasSpecial() {
        return this.cardCase_ == 14;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder
    public boolean hasThreePoint() {
        return this.threePoint_ != null;
    }

    public static Builder newBuilder(RelateCard relateCard) {
        return DEFAULT_INSTANCE.createBuilder(relateCard);
    }

    public static RelateCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateCard parseFrom(InputStream inputStream) throws IOException {
        return (RelateCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
