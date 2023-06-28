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
public final class OperationCardV2 extends GeneratedMessageLite<OperationCardV2, OperationCardV2.Builder> implements OperationCardV2OrBuilder {
    public static final int BIZ_TYPE_FIELD_NUMBER = 5;
    public static final int CONTENT_FIELD_NUMBER = 6;
    private static final OperationCardV2 DEFAULT_INSTANCE;
    public static final int FOLLOW_FIELD_NUMBER = 7;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int GAME_FIELD_NUMBER = 10;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int JUMP_FIELD_NUMBER = 9;
    private static volatile Parser<OperationCardV2> PARSER = null;
    public static final int RESERVE_FIELD_NUMBER = 8;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int TO_FIELD_NUMBER = 3;
    private int bizType_;
    private OperationCardV2Content content_;
    private int from_;
    private long id_;
    private int paramCase_ = 0;
    private Object param_;
    private boolean status_;
    private int to_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.OperationCardV2$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68071 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16772xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16772xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16772xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16772xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16772xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16772xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16772xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16772xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OperationCardV2, Builder> implements OperationCardV2OrBuilder {
        /* synthetic */ Builder(C68071 c68071) {
            this();
        }

        public Builder clearBizType() {
            copyOnWrite();
            ((OperationCardV2) this.instance).clearBizType();
            return this;
        }

        public Builder clearContent() {
            copyOnWrite();
            ((OperationCardV2) this.instance).clearContent();
            return this;
        }

        public Builder clearFollow() {
            copyOnWrite();
            ((OperationCardV2) this.instance).clearFollow();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((OperationCardV2) this.instance).clearFrom();
            return this;
        }

        public Builder clearGame() {
            copyOnWrite();
            ((OperationCardV2) this.instance).clearGame();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((OperationCardV2) this.instance).clearId();
            return this;
        }

        public Builder clearJump() {
            copyOnWrite();
            ((OperationCardV2) this.instance).clearJump();
            return this;
        }

        public Builder clearParam() {
            copyOnWrite();
            ((OperationCardV2) this.instance).clearParam();
            return this;
        }

        public Builder clearReserve() {
            copyOnWrite();
            ((OperationCardV2) this.instance).clearReserve();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((OperationCardV2) this.instance).clearStatus();
            return this;
        }

        public Builder clearTo() {
            copyOnWrite();
            ((OperationCardV2) this.instance).clearTo();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public BizType getBizType() {
            return ((OperationCardV2) this.instance).getBizType();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public int getBizTypeValue() {
            return ((OperationCardV2) this.instance).getBizTypeValue();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public OperationCardV2Content getContent() {
            return ((OperationCardV2) this.instance).getContent();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public BizFollowVideoParam getFollow() {
            return ((OperationCardV2) this.instance).getFollow();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public int getFrom() {
            return ((OperationCardV2) this.instance).getFrom();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public BizReserveGameParam getGame() {
            return ((OperationCardV2) this.instance).getGame();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public long getId() {
            return ((OperationCardV2) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public BizJumpLinkParam getJump() {
            return ((OperationCardV2) this.instance).getJump();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public ParamCase getParamCase() {
            return ((OperationCardV2) this.instance).getParamCase();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public BizReserveActivityParam getReserve() {
            return ((OperationCardV2) this.instance).getReserve();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public boolean getStatus() {
            return ((OperationCardV2) this.instance).getStatus();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public int getTo() {
            return ((OperationCardV2) this.instance).getTo();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public boolean hasContent() {
            return ((OperationCardV2) this.instance).hasContent();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public boolean hasFollow() {
            return ((OperationCardV2) this.instance).hasFollow();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public boolean hasGame() {
            return ((OperationCardV2) this.instance).hasGame();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public boolean hasJump() {
            return ((OperationCardV2) this.instance).hasJump();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
        public boolean hasReserve() {
            return ((OperationCardV2) this.instance).hasReserve();
        }

        public Builder mergeContent(OperationCardV2Content operationCardV2Content) {
            copyOnWrite();
            ((OperationCardV2) this.instance).mergeContent(operationCardV2Content);
            return this;
        }

        public Builder mergeFollow(BizFollowVideoParam bizFollowVideoParam) {
            copyOnWrite();
            ((OperationCardV2) this.instance).mergeFollow(bizFollowVideoParam);
            return this;
        }

        public Builder mergeGame(BizReserveGameParam bizReserveGameParam) {
            copyOnWrite();
            ((OperationCardV2) this.instance).mergeGame(bizReserveGameParam);
            return this;
        }

        public Builder mergeJump(BizJumpLinkParam bizJumpLinkParam) {
            copyOnWrite();
            ((OperationCardV2) this.instance).mergeJump(bizJumpLinkParam);
            return this;
        }

        public Builder mergeReserve(BizReserveActivityParam bizReserveActivityParam) {
            copyOnWrite();
            ((OperationCardV2) this.instance).mergeReserve(bizReserveActivityParam);
            return this;
        }

        public Builder setBizType(BizType bizType) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setBizType(bizType);
            return this;
        }

        public Builder setBizTypeValue(int i) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setBizTypeValue(i);
            return this;
        }

        public Builder setContent(OperationCardV2Content operationCardV2Content) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setContent(operationCardV2Content);
            return this;
        }

        public Builder setFollow(BizFollowVideoParam bizFollowVideoParam) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setFollow(bizFollowVideoParam);
            return this;
        }

        public Builder setFrom(int i) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setFrom(i);
            return this;
        }

        public Builder setGame(BizReserveGameParam bizReserveGameParam) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setGame(bizReserveGameParam);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setId(j);
            return this;
        }

        public Builder setJump(BizJumpLinkParam bizJumpLinkParam) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setJump(bizJumpLinkParam);
            return this;
        }

        public Builder setReserve(BizReserveActivityParam bizReserveActivityParam) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setReserve(bizReserveActivityParam);
            return this;
        }

        public Builder setStatus(boolean z) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setStatus(z);
            return this;
        }

        public Builder setTo(int i) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setTo(i);
            return this;
        }

        private Builder() {
            super(OperationCardV2.DEFAULT_INSTANCE);
        }

        public Builder setContent(OperationCardV2Content.Builder builder) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setContent(builder.build());
            return this;
        }

        public Builder setFollow(BizFollowVideoParam.Builder builder) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setFollow(builder.build());
            return this;
        }

        public Builder setGame(BizReserveGameParam.Builder builder) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setGame(builder.build());
            return this;
        }

        public Builder setJump(BizJumpLinkParam.Builder builder) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setJump(builder.build());
            return this;
        }

        public Builder setReserve(BizReserveActivityParam.Builder builder) {
            copyOnWrite();
            ((OperationCardV2) this.instance).setReserve(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
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

    static {
        OperationCardV2 operationCardV2 = new OperationCardV2();
        DEFAULT_INSTANCE = operationCardV2;
        GeneratedMessageLite.registerDefaultInstance(OperationCardV2.class, operationCardV2);
    }

    private OperationCardV2() {
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

    public static OperationCardV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContent(OperationCardV2Content operationCardV2Content) {
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

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OperationCardV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OperationCardV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationCardV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OperationCardV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OperationCardV2> parser() {
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
    public void setContent(OperationCardV2Content operationCardV2Content) {
        operationCardV2Content.getClass();
        this.content_ = operationCardV2Content;
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
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68071.f16772xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OperationCardV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0007\u0005\f\u0006\t\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"param_", "paramCase_", "id_", "from_", "to_", "status_", "bizType_", "content_", BizFollowVideoParam.class, BizReserveActivityParam.class, BizJumpLinkParam.class, BizReserveGameParam.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OperationCardV2> parser = PARSER;
                if (parser == null) {
                    synchronized (OperationCardV2.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public BizType getBizType() {
        BizType forNumber = BizType.forNumber(this.bizType_);
        return forNumber == null ? BizType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public int getBizTypeValue() {
        return this.bizType_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public OperationCardV2Content getContent() {
        OperationCardV2Content operationCardV2Content = this.content_;
        return operationCardV2Content == null ? OperationCardV2Content.getDefaultInstance() : operationCardV2Content;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public BizFollowVideoParam getFollow() {
        if (this.paramCase_ == 7) {
            return (BizFollowVideoParam) this.param_;
        }
        return BizFollowVideoParam.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public int getFrom() {
        return this.from_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public BizReserveGameParam getGame() {
        if (this.paramCase_ == 10) {
            return (BizReserveGameParam) this.param_;
        }
        return BizReserveGameParam.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public BizJumpLinkParam getJump() {
        if (this.paramCase_ == 9) {
            return (BizJumpLinkParam) this.param_;
        }
        return BizJumpLinkParam.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public ParamCase getParamCase() {
        return ParamCase.forNumber(this.paramCase_);
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public BizReserveActivityParam getReserve() {
        if (this.paramCase_ == 8) {
            return (BizReserveActivityParam) this.param_;
        }
        return BizReserveActivityParam.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public boolean getStatus() {
        return this.status_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public int getTo() {
        return this.to_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public boolean hasContent() {
        return this.content_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public boolean hasFollow() {
        return this.paramCase_ == 7;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public boolean hasGame() {
        return this.paramCase_ == 10;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public boolean hasJump() {
        return this.paramCase_ == 9;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardV2OrBuilder
    public boolean hasReserve() {
        return this.paramCase_ == 8;
    }

    public static Builder newBuilder(OperationCardV2 operationCardV2) {
        return DEFAULT_INSTANCE.createBuilder(operationCardV2);
    }

    public static OperationCardV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCardV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationCardV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCardV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OperationCardV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OperationCardV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OperationCardV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCardV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OperationCardV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OperationCardV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OperationCardV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCardV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OperationCardV2 parseFrom(InputStream inputStream) throws IOException {
        return (OperationCardV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationCardV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCardV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationCardV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OperationCardV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OperationCardV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCardV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
