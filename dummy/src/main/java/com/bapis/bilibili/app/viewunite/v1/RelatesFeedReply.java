package com.bapis.bilibili.app.viewunite.v1;

import com.bapis.bilibili.app.viewunite.common.RelateCard;
import com.bapis.bilibili.app.viewunite.common.RelateCardOrBuilder;
import com.bapis.bilibili.pagination.Pagination;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class RelatesFeedReply extends GeneratedMessageLite<RelatesFeedReply, RelatesFeedReply.Builder> implements MessageLiteOrBuilder {
    private static final RelatesFeedReply DEFAULT_INSTANCE;
    public static final int PAGINATION_FIELD_NUMBER = 2;
    private static volatile Parser<RelatesFeedReply> PARSER = null;
    public static final int RELATES_FIELD_NUMBER = 1;
    private Pagination pagination_;
    private Internal.ProtobufList<RelateCard> relates_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.RelatesFeedReply$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71521 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17120xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17120xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17120xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17120xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17120xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17120xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17120xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17120xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelatesFeedReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71521 c71521) {
            this();
        }

        public Builder addAllRelates(Iterable<? extends RelateCard> iterable) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).addAllRelates(iterable);
            return this;
        }

        public Builder addRelates(RelateCard relateCard) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).addRelates(relateCard);
            return this;
        }

        public Builder clearPagination() {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).clearPagination();
            return this;
        }

        public Builder clearRelates() {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).clearRelates();
            return this;
        }

        public Pagination getPagination() {
            return ((RelatesFeedReply) this.instance).getPagination();
        }

        public RelateCard getRelates(int i) {
            return ((RelatesFeedReply) this.instance).getRelates(i);
        }

        public int getRelatesCount() {
            return ((RelatesFeedReply) this.instance).getRelatesCount();
        }

        public List<RelateCard> getRelatesList() {
            return Collections.unmodifiableList(((RelatesFeedReply) this.instance).getRelatesList());
        }

        public boolean hasPagination() {
            return ((RelatesFeedReply) this.instance).hasPagination();
        }

        public Builder mergePagination(Pagination pagination) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).mergePagination(pagination);
            return this;
        }

        public Builder removeRelates(int i) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).removeRelates(i);
            return this;
        }

        public Builder setPagination(Pagination pagination) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).setPagination(pagination);
            return this;
        }

        public Builder setRelates(int i, RelateCard relateCard) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).setRelates(i, relateCard);
            return this;
        }

        private Builder() {
            super(RelatesFeedReply.DEFAULT_INSTANCE);
        }

        public Builder addRelates(int i, RelateCard relateCard) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).addRelates(i, relateCard);
            return this;
        }

        public Builder setPagination(Pagination.Builder builder) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).setPagination(builder.build());
            return this;
        }

        public Builder setRelates(int i, RelateCard.Builder builder) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).setRelates(i, builder.build());
            return this;
        }

        public Builder addRelates(RelateCard.Builder builder) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).addRelates(builder.build());
            return this;
        }

        public Builder addRelates(int i, RelateCard.Builder builder) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).addRelates(i, builder.build());
            return this;
        }
    }

    static {
        RelatesFeedReply relatesFeedReply = new RelatesFeedReply();
        DEFAULT_INSTANCE = relatesFeedReply;
        GeneratedMessageLite.registerDefaultInstance(RelatesFeedReply.class, relatesFeedReply);
    }

    private RelatesFeedReply() {
    }

    public void addAllRelates(Iterable<? extends RelateCard> iterable) {
        ensureRelatesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.relates_);
    }

    public void addRelates(RelateCard relateCard) {
        relateCard.getClass();
        ensureRelatesIsMutable();
        this.relates_.add(relateCard);
    }

    public void clearPagination() {
        this.pagination_ = null;
    }

    public void clearRelates() {
        this.relates_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRelatesIsMutable() {
        Internal.ProtobufList<RelateCard> protobufList = this.relates_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.relates_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RelatesFeedReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

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

    public static RelatesFeedReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelatesFeedReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelatesFeedReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelatesFeedReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelatesFeedReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeRelates(int i) {
        ensureRelatesIsMutable();
        this.relates_.remove(i);
    }

    public void setPagination(Pagination pagination) {
        pagination.getClass();
        this.pagination_ = pagination;
    }

    public void setRelates(int i, RelateCard relateCard) {
        relateCard.getClass();
        ensureRelatesIsMutable();
        this.relates_.set(i, relateCard);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71521.f17120xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelatesFeedReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"relates_", RelateCard.class, "pagination_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelatesFeedReply> parser = PARSER;
                if (parser == null) {
                    synchronized (RelatesFeedReply.class) {
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

    public Pagination getPagination() {
        Pagination pagination = this.pagination_;
        return pagination == null ? Pagination.getDefaultInstance() : pagination;
    }

    public RelateCard getRelates(int i) {
        return this.relates_.get(i);
    }

    public int getRelatesCount() {
        return this.relates_.size();
    }

    public List<RelateCard> getRelatesList() {
        return this.relates_;
    }

    public RelateCardOrBuilder getRelatesOrBuilder(int i) {
        return this.relates_.get(i);
    }

    public List<? extends RelateCardOrBuilder> getRelatesOrBuilderList() {
        return this.relates_;
    }

    public boolean hasPagination() {
        return this.pagination_ != null;
    }

    public static Builder newBuilder(RelatesFeedReply relatesFeedReply) {
        return DEFAULT_INSTANCE.createBuilder(relatesFeedReply);
    }

    public static RelatesFeedReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelatesFeedReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelatesFeedReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelatesFeedReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelatesFeedReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelatesFeedReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addRelates(int i, RelateCard relateCard) {
        relateCard.getClass();
        ensureRelatesIsMutable();
        this.relates_.add(i, relateCard);
    }

    public static RelatesFeedReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelatesFeedReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelatesFeedReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelatesFeedReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelatesFeedReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelatesFeedReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelatesFeedReply parseFrom(InputStream inputStream) throws IOException {
        return (RelatesFeedReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelatesFeedReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelatesFeedReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelatesFeedReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelatesFeedReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelatesFeedReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelatesFeedReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * removeRelates
     */
    static void access$600(RelatesFeedReply reply, int index) {
    }
}
