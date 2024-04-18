package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class OperationCardNew extends GeneratedMessageLite<OperationCardNew, OperationCardNew.Builder> implements OperationCardNewOrBuilder {
    public static final int BIZ_TYPE_FIELD_NUMBER = 8;
    public static final int CARD_TYPE_FIELD_NUMBER = 5;
    private static final OperationCardNew DEFAULT_INSTANCE;
    public static final int FOLLOW_FIELD_NUMBER = 9;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int GAME_FIELD_NUMBER = 12;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int JUMP_FIELD_NUMBER = 11;
    private static volatile Parser<OperationCardNew> PARSER = null;
    public static final int RESERVE_FIELD_NUMBER = 10;
    public static final int SKIP_FIELD_NUMBER = 7;
    public static final int STANDARD_FIELD_NUMBER = 6;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int TO_FIELD_NUMBER = 3;
    private int bizType_;
    private int cardType_;
    private int from_;
    private long id_;
    private Object param_;
    private Object render_;
    private boolean status_;
    private int to_;
    private int renderCase_ = 0;
    private int paramCase_ = 0;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.OperationCardNew$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68051 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16771xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16771xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16771xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16771xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16771xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16771xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16771xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16771xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OperationCardNew, Builder> implements OperationCardNewOrBuilder {
        /* synthetic */ Builder(C68051 c68051) {
            this();
        }

        public Builder clearBizType() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearBizType();
            return this;
        }

        public Builder clearCardType() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearCardType();
            return this;
        }

        public Builder clearFollow() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearFollow();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearFrom();
            return this;
        }

        public Builder clearGame() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearGame();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearId();
            return this;
        }

        public Builder clearJump() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearJump();
            return this;
        }

        public Builder clearParam() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearParam();
            return this;
        }

        public Builder clearRender() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearRender();
            return this;
        }

        public Builder clearReserve() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearReserve();
            return this;
        }

        public Builder clearSkip() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearSkip();
            return this;
        }

        public Builder clearStandard() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearStandard();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearStatus();
            return this;
        }

        public Builder clearTo() {
            copyOnWrite();
            ((OperationCardNew) this.instance).clearTo();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public BizType getBizType() {
            return ((OperationCardNew) this.instance).getBizType();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public int getBizTypeValue() {
            return ((OperationCardNew) this.instance).getBizTypeValue();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public OperationCardType getCardType() {
            return ((OperationCardNew) this.instance).getCardType();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public int getCardTypeValue() {
            return ((OperationCardNew) this.instance).getCardTypeValue();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public BizFollowVideoParam getFollow() {
            return ((OperationCardNew) this.instance).getFollow();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public int getFrom() {
            return ((OperationCardNew) this.instance).getFrom();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public BizReserveGameParam getGame() {
            return ((OperationCardNew) this.instance).getGame();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public long getId() {
            return ((OperationCardNew) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public BizJumpLinkParam getJump() {
            return ((OperationCardNew) this.instance).getJump();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public ParamCase getParamCase() {
            return ((OperationCardNew) this.instance).getParamCase();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public RenderCase getRenderCase() {
            return ((OperationCardNew) this.instance).getRenderCase();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public BizReserveActivityParam getReserve() {
            return ((OperationCardNew) this.instance).getReserve();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public OperationCard getSkip() {
            return ((OperationCardNew) this.instance).getSkip();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public StandardCard getStandard() {
            return ((OperationCardNew) this.instance).getStandard();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public boolean getStatus() {
            return ((OperationCardNew) this.instance).getStatus();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public int getTo() {
            return ((OperationCardNew) this.instance).getTo();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public boolean hasFollow() {
            return ((OperationCardNew) this.instance).hasFollow();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public boolean hasGame() {
            return ((OperationCardNew) this.instance).hasGame();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public boolean hasJump() {
            return ((OperationCardNew) this.instance).hasJump();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public boolean hasReserve() {
            return ((OperationCardNew) this.instance).hasReserve();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public boolean hasSkip() {
            return ((OperationCardNew) this.instance).hasSkip();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
        public boolean hasStandard() {
            return ((OperationCardNew) this.instance).hasStandard();
        }

        public Builder mergeFollow(BizFollowVideoParam bizFollowVideoParam) {
            copyOnWrite();
            ((OperationCardNew) this.instance).mergeFollow(bizFollowVideoParam);
            return this;
        }

        public Builder mergeGame(BizReserveGameParam bizReserveGameParam) {
            copyOnWrite();
            ((OperationCardNew) this.instance).mergeGame(bizReserveGameParam);
            return this;
        }

        public Builder mergeJump(BizJumpLinkParam bizJumpLinkParam) {
            copyOnWrite();
            ((OperationCardNew) this.instance).mergeJump(bizJumpLinkParam);
            return this;
        }

        public Builder mergeReserve(BizReserveActivityParam bizReserveActivityParam) {
            copyOnWrite();
            ((OperationCardNew) this.instance).mergeReserve(bizReserveActivityParam);
            return this;
        }

        public Builder mergeSkip(OperationCard operationCard) {
            copyOnWrite();
            ((OperationCardNew) this.instance).mergeSkip(operationCard);
            return this;
        }

        public Builder mergeStandard(StandardCard standardCard) {
            copyOnWrite();
            ((OperationCardNew) this.instance).mergeStandard(standardCard);
            return this;
        }

        public Builder setBizType(BizType bizType) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setBizType(bizType);
            return this;
        }

        public Builder setBizTypeValue(int i) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setBizTypeValue(i);
            return this;
        }

        public Builder setCardType(OperationCardType operationCardType) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setCardType(operationCardType);
            return this;
        }

        public Builder setCardTypeValue(int i) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setCardTypeValue(i);
            return this;
        }

        public Builder setFollow(BizFollowVideoParam bizFollowVideoParam) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setFollow(bizFollowVideoParam);
            return this;
        }

        public Builder setFrom(int i) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setFrom(i);
            return this;
        }

        public Builder setGame(BizReserveGameParam bizReserveGameParam) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setGame(bizReserveGameParam);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setId(j);
            return this;
        }

        public Builder setJump(BizJumpLinkParam bizJumpLinkParam) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setJump(bizJumpLinkParam);
            return this;
        }

        public Builder setReserve(BizReserveActivityParam bizReserveActivityParam) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setReserve(bizReserveActivityParam);
            return this;
        }

        public Builder setSkip(OperationCard operationCard) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setSkip(operationCard);
            return this;
        }

        public Builder setStandard(StandardCard standardCard) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setStandard(standardCard);
            return this;
        }

        public Builder setStatus(boolean z) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setStatus(z);
            return this;
        }

        public Builder setTo(int i) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setTo(i);
            return this;
        }

        private Builder() {
            super(OperationCardNew.DEFAULT_INSTANCE);
        }

        public Builder setFollow(BizFollowVideoParam.Builder builder) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setFollow(builder.build());
            return this;
        }

        public Builder setGame(BizReserveGameParam.Builder builder) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setGame(builder.build());
            return this;
        }

        public Builder setJump(BizJumpLinkParam.Builder builder) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setJump(builder.build());
            return this;
        }

        public Builder setReserve(BizReserveActivityParam.Builder builder) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setReserve(builder.build());
            return this;
        }

        public Builder setSkip(OperationCard.Builder builder) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setSkip(builder.build());
            return this;
        }

        public Builder setStandard(StandardCard.Builder builder) {
            copyOnWrite();
            ((OperationCardNew) this.instance).setStandard(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public enum ParamCase {
        FOLLOW(9),
        RESERVE(10),
        JUMP(11),
        GAME(12),
        PARAM_NOT_SET(0);
        
        private final int value;

        ParamCase(int i) {
            this.value = i;
        }

        public static ParamCase forNumber(int i) {
            if (i != 0) {
                switch (i) {
                    case 9:
                        return FOLLOW;
                    case 10:
                        return RESERVE;
                    case 11:
                        return JUMP;
                    case 12:
                        return GAME;
                    default:
                        return null;
                }
            }
            return PARAM_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ParamCase valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public enum RenderCase {
        STANDARD(6),
        SKIP(7),
        RENDER_NOT_SET(0);
        
        private final int value;

        RenderCase(int i) {
            this.value = i;
        }

        public static RenderCase forNumber(int i) {
            if (i != 0) {
                if (i != 6) {
                    if (i != 7) {
                        return null;
                    }
                    return SKIP;
                }
                return STANDARD;
            }
            return RENDER_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static RenderCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        OperationCardNew operationCardNew = new OperationCardNew();
        DEFAULT_INSTANCE = operationCardNew;
        GeneratedMessageLite.registerDefaultInstance(OperationCardNew.class, operationCardNew);
    }

    private OperationCardNew() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizType() {
        this.bizType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardType() {
        this.cardType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollow() {
        if (this.paramCase_ == 9) {
            this.paramCase_ = 0;
            this.param_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGame() {
        if (this.paramCase_ == 12) {
            this.paramCase_ = 0;
            this.param_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJump() {
        if (this.paramCase_ == 11) {
            this.paramCase_ = 0;
            this.param_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParam() {
        this.paramCase_ = 0;
        this.param_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRender() {
        this.renderCase_ = 0;
        this.render_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserve() {
        if (this.paramCase_ == 10) {
            this.paramCase_ = 0;
            this.param_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkip() {
        if (this.renderCase_ == 7) {
            this.renderCase_ = 0;
            this.render_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStandard() {
        if (this.renderCase_ == 6) {
            this.renderCase_ = 0;
            this.render_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTo() {
        this.to_ = 0;
    }

    public static OperationCardNew getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFollow(BizFollowVideoParam bizFollowVideoParam) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGame(BizReserveGameParam bizReserveGameParam) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJump(BizJumpLinkParam bizJumpLinkParam) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReserve(BizReserveActivityParam bizReserveActivityParam) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSkip(OperationCard operationCard) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStandard(StandardCard standardCard) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OperationCardNew parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OperationCardNew) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationCardNew parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OperationCardNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OperationCardNew> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizType(BizType bizType) {
        this.bizType_ = bizType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizTypeValue(int i) {
        this.bizType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardType(OperationCardType operationCardType) {
        this.cardType_ = operationCardType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardTypeValue(int i) {
        this.cardType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollow(BizFollowVideoParam bizFollowVideoParam) {
        bizFollowVideoParam.getClass();
        this.param_ = bizFollowVideoParam;
        this.paramCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(int i) {
        this.from_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGame(BizReserveGameParam bizReserveGameParam) {
        bizReserveGameParam.getClass();
        this.param_ = bizReserveGameParam;
        this.paramCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJump(BizJumpLinkParam bizJumpLinkParam) {
        bizJumpLinkParam.getClass();
        this.param_ = bizJumpLinkParam;
        this.paramCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserve(BizReserveActivityParam bizReserveActivityParam) {
        bizReserveActivityParam.getClass();
        this.param_ = bizReserveActivityParam;
        this.paramCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkip(OperationCard operationCard) {
        operationCard.getClass();
        this.render_ = operationCard;
        this.renderCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStandard(StandardCard standardCard) {
        standardCard.getClass();
        this.render_ = standardCard;
        this.renderCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(boolean z) {
        this.status_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTo(int i) {
        this.to_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68051.f16771xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OperationCardNew();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0002\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0007\u0005\f\u0006<\u0000\u0007<\u0000\b\f\t<\u0001\n<\u0001\u000b<\u0001\f<\u0001", new Object[]{"render_", "renderCase_", "param_", "paramCase_", "id_", "from_", "to_", "status_", "cardType_", StandardCard.class, OperationCard.class, "bizType_", BizFollowVideoParam.class, BizReserveActivityParam.class, BizJumpLinkParam.class, BizReserveGameParam.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OperationCardNew> parser = PARSER;
                if (parser == null) {
                    synchronized (OperationCardNew.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public BizType getBizType() {
        BizType forNumber = BizType.forNumber(this.bizType_);
        return forNumber == null ? BizType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public int getBizTypeValue() {
        return this.bizType_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public OperationCardType getCardType() {
        OperationCardType forNumber = OperationCardType.forNumber(this.cardType_);
        return forNumber == null ? OperationCardType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public int getCardTypeValue() {
        return this.cardType_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public BizFollowVideoParam getFollow() {
        if (this.paramCase_ == 9) {
            return (BizFollowVideoParam) this.param_;
        }
        return BizFollowVideoParam.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public int getFrom() {
        return this.from_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public BizReserveGameParam getGame() {
        if (this.paramCase_ == 12) {
            return (BizReserveGameParam) this.param_;
        }
        return BizReserveGameParam.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public BizJumpLinkParam getJump() {
        if (this.paramCase_ == 11) {
            return (BizJumpLinkParam) this.param_;
        }
        return BizJumpLinkParam.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public ParamCase getParamCase() {
        return ParamCase.forNumber(this.paramCase_);
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public RenderCase getRenderCase() {
        return RenderCase.forNumber(this.renderCase_);
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public BizReserveActivityParam getReserve() {
        if (this.paramCase_ == 10) {
            return (BizReserveActivityParam) this.param_;
        }
        return BizReserveActivityParam.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public OperationCard getSkip() {
        if (this.renderCase_ == 7) {
            return (OperationCard) this.render_;
        }
        return OperationCard.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public StandardCard getStandard() {
        if (this.renderCase_ == 6) {
            return (StandardCard) this.render_;
        }
        return StandardCard.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public boolean getStatus() {
        return this.status_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public int getTo() {
        return this.to_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public boolean hasFollow() {
        return this.paramCase_ == 9;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public boolean hasGame() {
        return this.paramCase_ == 12;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public boolean hasJump() {
        return this.paramCase_ == 11;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public boolean hasReserve() {
        return this.paramCase_ == 10;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public boolean hasSkip() {
        return this.renderCase_ == 7;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardNewOrBuilder
    public boolean hasStandard() {
        return this.renderCase_ == 6;
    }

    public static Builder newBuilder(OperationCardNew operationCardNew) {
        return DEFAULT_INSTANCE.createBuilder(operationCardNew);
    }

    public static OperationCardNew parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCardNew) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationCardNew parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCardNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OperationCardNew parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OperationCardNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OperationCardNew parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCardNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OperationCardNew parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OperationCardNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OperationCardNew parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCardNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OperationCardNew parseFrom(InputStream inputStream) throws IOException {
        return (OperationCardNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationCardNew parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCardNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationCardNew parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OperationCardNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OperationCardNew parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCardNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
