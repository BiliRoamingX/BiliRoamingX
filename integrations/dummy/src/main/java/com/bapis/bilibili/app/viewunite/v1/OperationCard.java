package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class OperationCard extends GeneratedMessageLite<OperationCard, OperationCard.C12334b> implements InterfaceC12412d {
    public static final int BIZ_TYPE_FIELD_NUMBER = 5;
    public static final int CONTENT_FIELD_NUMBER = 6;
    private static final OperationCard DEFAULT_INSTANCE;
    public static final int FOLLOW_FIELD_NUMBER = 7;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int GAME_FIELD_NUMBER = 10;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int JUMP_FIELD_NUMBER = 9;
    private static volatile Parser<OperationCard> PARSER = null;
    public static final int RESERVE_FIELD_NUMBER = 8;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int TO_FIELD_NUMBER = 3;
    private int bizType_;
    private OperationCardContent content_;
    private int from_;
    private long id_;
    private int paramCase_ = 0;
    private Object param_;
    private boolean status_;
    private int to_;

    /* compiled from: BL */
    /* loaded from: classes20.dex */
    public enum ParamCase {
        FOLLOW(7),
        RESERVE(8),
        JUMP(9),
        GAME(10),
        PARAM_NOT_SET(0);
        
        private final int value;

        ParamCase(int i) {
            this.value = i;
        }

        public static ParamCase forNumber(int i) {
            if (i != 0) {
                switch (i) {
                    case 7:
                        return FOLLOW;
                    case 8:
                        return RESERVE;
                    case 9:
                        return JUMP;
                    case 10:
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
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.OperationCard$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12333a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21280xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21280xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21280xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21280xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21280xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21280xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21280xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21280xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.OperationCard$b */
    /* loaded from: classes20.dex */
    public static final class C12334b extends GeneratedMessageLite.Builder<OperationCard, C12334b> implements InterfaceC12412d {
        /* synthetic */ C12334b(C12333a c12333a) {
            this();
        }

        public C12334b clearBizType() {
            copyOnWrite();
            ((OperationCard) this.instance).clearBizType();
            return this;
        }

        public C12334b clearContent() {
            copyOnWrite();
            ((OperationCard) this.instance).clearContent();
            return this;
        }

        public C12334b clearFollow() {
            copyOnWrite();
            ((OperationCard) this.instance).clearFollow();
            return this;
        }

        public C12334b clearFrom() {
            copyOnWrite();
            ((OperationCard) this.instance).clearFrom();
            return this;
        }

        public C12334b clearGame() {
            copyOnWrite();
            ((OperationCard) this.instance).clearGame();
            return this;
        }

        public C12334b clearId() {
            copyOnWrite();
            ((OperationCard) this.instance).clearId();
            return this;
        }

        public C12334b clearJump() {
            copyOnWrite();
            ((OperationCard) this.instance).clearJump();
            return this;
        }

        public C12334b clearParam() {
            copyOnWrite();
            ((OperationCard) this.instance).clearParam();
            return this;
        }

        public C12334b clearReserve() {
            copyOnWrite();
            ((OperationCard) this.instance).clearReserve();
            return this;
        }

        public C12334b clearStatus() {
            copyOnWrite();
            ((OperationCard) this.instance).clearStatus();
            return this;
        }

        public C12334b clearTo() {
            copyOnWrite();
            ((OperationCard) this.instance).clearTo();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public BizType getBizType() {
            return ((OperationCard) this.instance).getBizType();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public int getBizTypeValue() {
            return ((OperationCard) this.instance).getBizTypeValue();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public OperationCardContent getContent() {
            return ((OperationCard) this.instance).getContent();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public BizFollowVideoParam getFollow() {
            return ((OperationCard) this.instance).getFollow();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public int getFrom() {
            return ((OperationCard) this.instance).getFrom();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public BizReserveGameParam getGame() {
            return ((OperationCard) this.instance).getGame();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public long getId() {
            return ((OperationCard) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public BizJumpLinkParam getJump() {
            return ((OperationCard) this.instance).getJump();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public ParamCase getParamCase() {
            return ((OperationCard) this.instance).getParamCase();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public BizReserveActivityParam getReserve() {
            return ((OperationCard) this.instance).getReserve();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public boolean getStatus() {
            return ((OperationCard) this.instance).getStatus();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public int getTo() {
            return ((OperationCard) this.instance).getTo();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public boolean hasContent() {
            return ((OperationCard) this.instance).hasContent();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public boolean hasFollow() {
            return ((OperationCard) this.instance).hasFollow();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public boolean hasGame() {
            return ((OperationCard) this.instance).hasGame();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public boolean hasJump() {
            return ((OperationCard) this.instance).hasJump();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
        public boolean hasReserve() {
            return ((OperationCard) this.instance).hasReserve();
        }

        public C12334b mergeContent(OperationCardContent operationCardContent) {
            copyOnWrite();
            ((OperationCard) this.instance).mergeContent(operationCardContent);
            return this;
        }

        public C12334b mergeFollow(BizFollowVideoParam bizFollowVideoParam) {
            copyOnWrite();
            ((OperationCard) this.instance).mergeFollow(bizFollowVideoParam);
            return this;
        }

        public C12334b mergeGame(BizReserveGameParam bizReserveGameParam) {
            copyOnWrite();
            ((OperationCard) this.instance).mergeGame(bizReserveGameParam);
            return this;
        }

        public C12334b mergeJump(BizJumpLinkParam bizJumpLinkParam) {
            copyOnWrite();
            ((OperationCard) this.instance).mergeJump(bizJumpLinkParam);
            return this;
        }

        public C12334b mergeReserve(BizReserveActivityParam bizReserveActivityParam) {
            copyOnWrite();
            ((OperationCard) this.instance).mergeReserve(bizReserveActivityParam);
            return this;
        }

        public C12334b setBizType(BizType bizType) {
            copyOnWrite();
            ((OperationCard) this.instance).setBizType(bizType);
            return this;
        }

        public C12334b setBizTypeValue(int i) {
            copyOnWrite();
            ((OperationCard) this.instance).setBizTypeValue(i);
            return this;
        }

        public C12334b setContent(OperationCardContent operationCardContent) {
            copyOnWrite();
            ((OperationCard) this.instance).setContent(operationCardContent);
            return this;
        }

        public C12334b setFollow(BizFollowVideoParam bizFollowVideoParam) {
            copyOnWrite();
            ((OperationCard) this.instance).setFollow(bizFollowVideoParam);
            return this;
        }

        public C12334b setFrom(int i) {
            copyOnWrite();
            ((OperationCard) this.instance).setFrom(i);
            return this;
        }

        public C12334b setGame(BizReserveGameParam bizReserveGameParam) {
            copyOnWrite();
            ((OperationCard) this.instance).setGame(bizReserveGameParam);
            return this;
        }

        public C12334b setId(long j) {
            copyOnWrite();
            ((OperationCard) this.instance).setId(j);
            return this;
        }

        public C12334b setJump(BizJumpLinkParam bizJumpLinkParam) {
            copyOnWrite();
            ((OperationCard) this.instance).setJump(bizJumpLinkParam);
            return this;
        }

        public C12334b setReserve(BizReserveActivityParam bizReserveActivityParam) {
            copyOnWrite();
            ((OperationCard) this.instance).setReserve(bizReserveActivityParam);
            return this;
        }

        public C12334b setStatus(boolean z) {
            copyOnWrite();
            ((OperationCard) this.instance).setStatus(z);
            return this;
        }

        public C12334b setTo(int i) {
            copyOnWrite();
            ((OperationCard) this.instance).setTo(i);
            return this;
        }

        private C12334b() {
            super(OperationCard.DEFAULT_INSTANCE);
        }

        public C12334b setContent(OperationCardContent.C12336b c12336b) {
            copyOnWrite();
            ((OperationCard) this.instance).setContent(c12336b.build());
            return this;
        }

        public C12334b setFollow(BizFollowVideoParam.C12274b c12274b) {
            copyOnWrite();
            ((OperationCard) this.instance).setFollow(c12274b.build());
            return this;
        }

        public C12334b setGame(BizReserveGameParam.C12280b c12280b) {
            copyOnWrite();
            ((OperationCard) this.instance).setGame(c12280b.build());
            return this;
        }

        public C12334b setJump(BizJumpLinkParam.C12276b c12276b) {
            copyOnWrite();
            ((OperationCard) this.instance).setJump(c12276b.build());
            return this;
        }

        public C12334b setReserve(BizReserveActivityParam.C12278b c12278b) {
            copyOnWrite();
            ((OperationCard) this.instance).setReserve(c12278b.build());
            return this;
        }
    }

    static {
        OperationCard operationCard = new OperationCard();
        DEFAULT_INSTANCE = operationCard;
        GeneratedMessageLite.registerDefaultInstance(OperationCard.class, operationCard);
    }

    private OperationCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizType() {
        this.bizType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollow() {
        if (this.paramCase_ == 7) {
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
        if (this.paramCase_ == 10) {
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
        if (this.paramCase_ == 9) {
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
    public void clearReserve() {
        if (this.paramCase_ == 8) {
            this.paramCase_ = 0;
            this.param_ = null;
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

    public static OperationCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContent(OperationCardContent operationCardContent) {
        operationCardContent.getClass();
        OperationCardContent operationCardContent2 = this.content_;
        if (operationCardContent2 != null && operationCardContent2 != OperationCardContent.getDefaultInstance()) {
            this.content_ = OperationCardContent.newBuilder(this.content_).mergeFrom((OperationCardContent) operationCardContent).buildPartial();
        } else {
            this.content_ = operationCardContent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFollow(BizFollowVideoParam bizFollowVideoParam) {
        bizFollowVideoParam.getClass();
        if (this.paramCase_ == 7 && this.param_ != BizFollowVideoParam.getDefaultInstance()) {
            this.param_ = BizFollowVideoParam.newBuilder((BizFollowVideoParam) this.param_).mergeFrom((BizFollowVideoParam) bizFollowVideoParam).buildPartial();
        } else {
            this.param_ = bizFollowVideoParam;
        }
        this.paramCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGame(BizReserveGameParam bizReserveGameParam) {
        bizReserveGameParam.getClass();
        if (this.paramCase_ == 10 && this.param_ != BizReserveGameParam.getDefaultInstance()) {
            this.param_ = BizReserveGameParam.newBuilder((BizReserveGameParam) this.param_).mergeFrom((BizReserveGameParam) bizReserveGameParam).buildPartial();
        } else {
            this.param_ = bizReserveGameParam;
        }
        this.paramCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJump(BizJumpLinkParam bizJumpLinkParam) {
        bizJumpLinkParam.getClass();
        if (this.paramCase_ == 9 && this.param_ != BizJumpLinkParam.getDefaultInstance()) {
            this.param_ = BizJumpLinkParam.newBuilder((BizJumpLinkParam) this.param_).mergeFrom((BizJumpLinkParam) bizJumpLinkParam).buildPartial();
        } else {
            this.param_ = bizJumpLinkParam;
        }
        this.paramCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReserve(BizReserveActivityParam bizReserveActivityParam) {
        bizReserveActivityParam.getClass();
        if (this.paramCase_ == 8 && this.param_ != BizReserveActivityParam.getDefaultInstance()) {
            this.param_ = BizReserveActivityParam.newBuilder((BizReserveActivityParam) this.param_).mergeFrom((BizReserveActivityParam) bizReserveActivityParam).buildPartial();
        } else {
            this.param_ = bizReserveActivityParam;
        }
        this.paramCase_ = 8;
    }

    public static C12334b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OperationCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OperationCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OperationCard> parser() {
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
    public void setContent(OperationCardContent operationCardContent) {
        operationCardContent.getClass();
        this.content_ = operationCardContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollow(BizFollowVideoParam bizFollowVideoParam) {
        bizFollowVideoParam.getClass();
        this.param_ = bizFollowVideoParam;
        this.paramCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(int i) {
        this.from_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGame(BizReserveGameParam bizReserveGameParam) {
        bizReserveGameParam.getClass();
        this.param_ = bizReserveGameParam;
        this.paramCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJump(BizJumpLinkParam bizJumpLinkParam) {
        bizJumpLinkParam.getClass();
        this.param_ = bizJumpLinkParam;
        this.paramCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserve(BizReserveActivityParam bizReserveActivityParam) {
        bizReserveActivityParam.getClass();
        this.param_ = bizReserveActivityParam;
        this.paramCase_ = 8;
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12333a.f21280xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OperationCard();
            case 2:
                return new C12334b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0007\u0005\f\u0006\t\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"param_", "paramCase_", "id_", "from_", "to_", "status_", "bizType_", "content_", BizFollowVideoParam.class, BizReserveActivityParam.class, BizJumpLinkParam.class, BizReserveGameParam.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OperationCard> parser = PARSER;
                if (parser == null) {
                    synchronized (OperationCard.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public BizType getBizType() {
        BizType forNumber = BizType.forNumber(this.bizType_);
        return forNumber == null ? BizType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public int getBizTypeValue() {
        return this.bizType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public OperationCardContent getContent() {
        OperationCardContent operationCardContent = this.content_;
        return operationCardContent == null ? OperationCardContent.getDefaultInstance() : operationCardContent;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public BizFollowVideoParam getFollow() {
        if (this.paramCase_ == 7) {
            return (BizFollowVideoParam) this.param_;
        }
        return BizFollowVideoParam.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public int getFrom() {
        return this.from_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public BizReserveGameParam getGame() {
        if (this.paramCase_ == 10) {
            return (BizReserveGameParam) this.param_;
        }
        return BizReserveGameParam.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public BizJumpLinkParam getJump() {
        if (this.paramCase_ == 9) {
            return (BizJumpLinkParam) this.param_;
        }
        return BizJumpLinkParam.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public ParamCase getParamCase() {
        return ParamCase.forNumber(this.paramCase_);
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public BizReserveActivityParam getReserve() {
        if (this.paramCase_ == 8) {
            return (BizReserveActivityParam) this.param_;
        }
        return BizReserveActivityParam.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public boolean getStatus() {
        return this.status_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public int getTo() {
        return this.to_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public boolean hasContent() {
        return this.content_ != null;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public boolean hasFollow() {
        return this.paramCase_ == 7;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public boolean hasGame() {
        return this.paramCase_ == 10;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public boolean hasJump() {
        return this.paramCase_ == 9;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12412d
    public boolean hasReserve() {
        return this.paramCase_ == 8;
    }

    public static C12334b newBuilder(OperationCard operationCard) {
        return DEFAULT_INSTANCE.createBuilder(operationCard);
    }

    public static OperationCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OperationCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OperationCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OperationCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OperationCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OperationCard parseFrom(InputStream inputStream) throws IOException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OperationCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
