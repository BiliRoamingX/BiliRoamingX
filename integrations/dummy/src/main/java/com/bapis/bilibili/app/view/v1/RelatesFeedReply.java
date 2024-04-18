package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.pagination.PaginationReply;
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
/* loaded from: classes13.dex */
public final class RelatesFeedReply extends GeneratedMessageLite<RelatesFeedReply, RelatesFeedReply.Builder> implements MessageLiteOrBuilder {
    private static final RelatesFeedReply DEFAULT_INSTANCE;
    public static final int HAS_NEXT_FIELD_NUMBER = 2;
    public static final int LIST_FIELD_NUMBER = 1;
    public static final int PAGINATION_FIELD_NUMBER = 3;
    private static volatile Parser<RelatesFeedReply> PARSER;
    private boolean hasNext_;
    private Internal.ProtobufList<Relate> list_ = GeneratedMessageLite.emptyProtobufList();
    private PaginationReply pagination_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.RelatesFeedReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68431 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16803xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16803xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16803xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16803xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16803xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16803xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16803xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16803xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelatesFeedReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68431 c68431) {
            this();
        }

        public Builder addAllList(Iterable<? extends Relate> iterable) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).addAllList(iterable);
            return this;
        }

        public Builder addList(Relate relate) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).addList(relate);
            return this;
        }

        public Builder clearHasNext() {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).clearHasNext();
            return this;
        }

        public Builder clearList() {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).clearList();
            return this;
        }

        public Builder clearPagination() {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).clearPagination();
            return this;
        }

        public boolean getHasNext() {
            return ((RelatesFeedReply) this.instance).getHasNext();
        }

        public Relate getList(int i) {
            return ((RelatesFeedReply) this.instance).getList(i);
        }

        public int getListCount() {
            return ((RelatesFeedReply) this.instance).getListCount();
        }

        public List<Relate> getListList() {
            return Collections.unmodifiableList(((RelatesFeedReply) this.instance).getListList());
        }

        public PaginationReply getPagination() {
            return ((RelatesFeedReply) this.instance).getPagination();
        }

        public boolean hasPagination() {
            return ((RelatesFeedReply) this.instance).hasPagination();
        }

        public Builder mergePagination(PaginationReply paginationReply) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).mergePagination(paginationReply);
            return this;
        }

        public Builder removeList(int i) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).removeList(i);
            return this;
        }

        public Builder setHasNext(boolean z) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).setHasNext(z);
            return this;
        }

        public Builder setList(int i, Relate relate) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).setList(i, relate);
            return this;
        }

        public Builder setPagination(PaginationReply paginationReply) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).setPagination(paginationReply);
            return this;
        }

        private Builder() {
            super(RelatesFeedReply.DEFAULT_INSTANCE);
        }

        public Builder addList(int i, Relate relate) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).addList(i, relate);
            return this;
        }

        public Builder setList(int i, Relate.Builder builder) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).setList(i, builder.build());
            return this;
        }

        public Builder setPagination(PaginationReply.Builder builder) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).setPagination(builder.build());
            return this;
        }

        public Builder addList(Relate.Builder builder) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).addList(builder.build());
            return this;
        }

        public Builder addList(int i, Relate.Builder builder) {
            copyOnWrite();
            ((RelatesFeedReply) this.instance).addList(i, builder.build());
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

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllList(Iterable<? extends Relate> iterable) {
        ensureListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.list_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addList(Relate relate) {
        relate.getClass();
        ensureListIsMutable();
        this.list_.add(relate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasNext() {
        this.hasNext_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearList() {
        this.list_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPagination() {
        this.pagination_ = null;
    }

    private void ensureListIsMutable() {
        Internal.ProtobufList<Relate> protobufList = this.list_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.list_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RelatesFeedReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePagination(PaginationReply paginationReply) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void removeList(int i) {
        ensureListIsMutable();
        this.list_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasNext(boolean z) {
        this.hasNext_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setList(int i, Relate relate) {
        relate.getClass();
        ensureListIsMutable();
        this.list_.set(i, relate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPagination(PaginationReply paginationReply) {
        paginationReply.getClass();
        this.pagination_ = paginationReply;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68431.f16803xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelatesFeedReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003\t", new Object[]{"list_", Relate.class, "hasNext_", "pagination_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelatesFeedReply> parser = PARSER;
                if (parser == null) {
                    synchronized (RelatesFeedReply.class) {
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

    public boolean getHasNext() {
        return this.hasNext_;
    }

    public Relate getList(int i) {
        return this.list_.get(i);
    }

    public int getListCount() {
        return this.list_.size();
    }

    public List<Relate> getListList() {
        return this.list_;
    }

    public RelateOrBuilder getListOrBuilder(int i) {
        return this.list_.get(i);
    }

    public List<? extends RelateOrBuilder> getListOrBuilderList() {
        return this.list_;
    }

    public PaginationReply getPagination() {
        PaginationReply paginationReply = this.pagination_;
        return paginationReply == null ? PaginationReply.getDefaultInstance() : paginationReply;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void addList(int i, Relate relate) {
        relate.getClass();
        ensureListIsMutable();
        this.list_.add(i, relate);
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
     * removeList
     */
    static void access$600(RelatesFeedReply feedReply, int index) {
    }
}
