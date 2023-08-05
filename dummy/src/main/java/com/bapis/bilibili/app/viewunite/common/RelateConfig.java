package com.bapis.bilibili.app.viewunite.common;

import com.bapis.bilibili.pagination.Pagination;
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
public final class RelateConfig extends GeneratedMessageLite<RelateConfig, RelateConfig.Builder> implements MessageLiteOrBuilder {
    public static final int CAN_LOAD_MORE_FIELD_NUMBER = 4;
    private static final RelateConfig DEFAULT_INSTANCE;
    public static final int PAGINATION_FIELD_NUMBER = 3;
    private static volatile Parser<RelateConfig> PARSER = null;
    public static final int VALID_SHOW_M_FIELD_NUMBER = 1;
    public static final int VALID_SHOW_N_FIELD_NUMBER = 2;
    private boolean canLoadMore_;
    private Pagination pagination_;
    private long validShowM_;
    private long validShowN_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelateConfig$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70421 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17022xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17022xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17022xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17022xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17022xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17022xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17022xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17022xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70421 c70421) {
            this();
        }

        public Builder clearCanLoadMore() {
            copyOnWrite();
            ((RelateConfig) this.instance).clearCanLoadMore();
            return this;
        }

        public Builder clearPagination() {
            copyOnWrite();
            ((RelateConfig) this.instance).clearPagination();
            return this;
        }

        public Builder clearValidShowM() {
            copyOnWrite();
            ((RelateConfig) this.instance).clearValidShowM();
            return this;
        }

        public Builder clearValidShowN() {
            copyOnWrite();
            ((RelateConfig) this.instance).clearValidShowN();
            return this;
        }

        public boolean getCanLoadMore() {
            return ((RelateConfig) this.instance).getCanLoadMore();
        }

        public Pagination getPagination() {
            return ((RelateConfig) this.instance).getPagination();
        }

        public long getValidShowM() {
            return ((RelateConfig) this.instance).getValidShowM();
        }

        public long getValidShowN() {
            return ((RelateConfig) this.instance).getValidShowN();
        }

        public boolean hasPagination() {
            return ((RelateConfig) this.instance).hasPagination();
        }

        public Builder mergePagination(Pagination pagination) {
            copyOnWrite();
            ((RelateConfig) this.instance).mergePagination(pagination);
            return this;
        }

        public Builder setCanLoadMore(boolean z) {
            copyOnWrite();
            ((RelateConfig) this.instance).setCanLoadMore(z);
            return this;
        }

        public Builder setPagination(Pagination pagination) {
            copyOnWrite();
            ((RelateConfig) this.instance).setPagination(pagination);
            return this;
        }

        public Builder setValidShowM(long j) {
            copyOnWrite();
            ((RelateConfig) this.instance).setValidShowM(j);
            return this;
        }

        public Builder setValidShowN(long j) {
            copyOnWrite();
            ((RelateConfig) this.instance).setValidShowN(j);
            return this;
        }

        private Builder() {
            super(RelateConfig.DEFAULT_INSTANCE);
        }

        public Builder setPagination(Pagination.Builder builder) {
            copyOnWrite();
            ((RelateConfig) this.instance).setPagination(builder.build());
            return this;
        }
    }

    static {
        RelateConfig relateConfig = new RelateConfig();
        DEFAULT_INSTANCE = relateConfig;
        GeneratedMessageLite.registerDefaultInstance(RelateConfig.class, relateConfig);
    }

    private RelateConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanLoadMore() {
        this.canLoadMore_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPagination() {
        this.pagination_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidShowM() {
        this.validShowM_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidShowN() {
        this.validShowN_ = 0L;
    }

    public static RelateConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePagination(Pagination pagination) {
        pagination.getClass();
        Pagination pagination2 = this.pagination_;
        if (pagination2 != null && pagination2 != Pagination.getDefaultInstance()) {
            this.pagination_ = Pagination.newBuilder(this.pagination_).mergeFrom((Pagination) pagination).buildPartial();
        } else {
            this.pagination_ = pagination;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelateConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanLoadMore(boolean z) {
        this.canLoadMore_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPagination(Pagination pagination) {
        pagination.getClass();
        this.pagination_ = pagination;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidShowM(long j) {
        this.validShowM_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidShowN(long j) {
        this.validShowN_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70421.f17022xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\t\u0004\u0007", new Object[]{"validShowM_", "validShowN_", "pagination_", "canLoadMore_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateConfig.class) {
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

    public boolean getCanLoadMore() {
        return this.canLoadMore_;
    }

    public Pagination getPagination() {
        Pagination pagination = this.pagination_;
        return pagination == null ? Pagination.getDefaultInstance() : pagination;
    }

    public long getValidShowM() {
        return this.validShowM_;
    }

    public long getValidShowN() {
        return this.validShowN_;
    }

    public boolean hasPagination() {
        return this.pagination_ != null;
    }

    public static Builder newBuilder(RelateConfig relateConfig) {
        return DEFAULT_INSTANCE.createBuilder(relateConfig);
    }

    public static RelateConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateConfig parseFrom(InputStream inputStream) throws IOException {
        return (RelateConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
