package com.bapis.bilibili.app.resource.v1;

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
/* loaded from: classes15.dex */
public final class ListReply extends GeneratedMessageLite<ListReply, ListReply.Builder> implements MessageLiteOrBuilder {
    private static final ListReply DEFAULT_INSTANCE;
    public static final int ENV_FIELD_NUMBER = 1;
    public static final int HOST_FIELD_NUMBER = 4;
    public static final int LIST_VERSION_FIELD_NUMBER = 3;
    private static volatile Parser<ListReply> PARSER = null;
    public static final int POOLS_FIELD_NUMBER = 2;
    private Host host_;
    private long listVersion_;
    private String env_ = "";
    private Internal.ProtobufList<PoolReply> pools_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.resource.v1.ListReply$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C65681 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16588xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16588xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16588xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16588xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16588xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16588xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16588xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16588xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ListReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C65681 c65681) {
            this();
        }

        public Builder addAllPools(Iterable<? extends PoolReply> iterable) {
            copyOnWrite();
            ((ListReply) this.instance).addAllPools(iterable);
            return this;
        }

        public Builder addPools(PoolReply poolReply) {
            copyOnWrite();
            ((ListReply) this.instance).addPools(poolReply);
            return this;
        }

        public Builder clearEnv() {
            copyOnWrite();
            ((ListReply) this.instance).clearEnv();
            return this;
        }

        public Builder clearHost() {
            copyOnWrite();
            ((ListReply) this.instance).clearHost();
            return this;
        }

        public Builder clearListVersion() {
            copyOnWrite();
            ((ListReply) this.instance).clearListVersion();
            return this;
        }

        public Builder clearPools() {
            copyOnWrite();
            ((ListReply) this.instance).clearPools();
            return this;
        }

        public String getEnv() {
            return ((ListReply) this.instance).getEnv();
        }

        public ByteString getEnvBytes() {
            return ((ListReply) this.instance).getEnvBytes();
        }

        public Host getHost() {
            return ((ListReply) this.instance).getHost();
        }

        public long getListVersion() {
            return ((ListReply) this.instance).getListVersion();
        }

        public PoolReply getPools(int i) {
            return ((ListReply) this.instance).getPools(i);
        }

        public int getPoolsCount() {
            return ((ListReply) this.instance).getPoolsCount();
        }

        public List<PoolReply> getPoolsList() {
            return Collections.unmodifiableList(((ListReply) this.instance).getPoolsList());
        }

        public boolean hasHost() {
            return ((ListReply) this.instance).hasHost();
        }

        public Builder mergeHost(Host host2) {
            copyOnWrite();
            ((ListReply) this.instance).mergeHost(host2);
            return this;
        }

        public Builder removePools(int i) {
            copyOnWrite();
            ((ListReply) this.instance).removePools(i);
            return this;
        }

        public Builder setEnv(String str) {
            copyOnWrite();
            ((ListReply) this.instance).setEnv(str);
            return this;
        }

        public Builder setEnvBytes(ByteString byteString) {
            copyOnWrite();
            ((ListReply) this.instance).setEnvBytes(byteString);
            return this;
        }

        public Builder setHost(Host host2) {
            copyOnWrite();
            ((ListReply) this.instance).setHost(host2);
            return this;
        }

        public Builder setListVersion(long j) {
            copyOnWrite();
            ((ListReply) this.instance).setListVersion(j);
            return this;
        }

        public Builder setPools(int i, PoolReply poolReply) {
            copyOnWrite();
            ((ListReply) this.instance).setPools(i, poolReply);
            return this;
        }

        private Builder() {
            super(ListReply.DEFAULT_INSTANCE);
        }

        public Builder addPools(int i, PoolReply poolReply) {
            copyOnWrite();
            ((ListReply) this.instance).addPools(i, poolReply);
            return this;
        }

        public Builder setHost(Host.Builder builder) {
            copyOnWrite();
            ((ListReply) this.instance).setHost(builder.build());
            return this;
        }

        public Builder setPools(int i, PoolReply.Builder builder) {
            copyOnWrite();
            ((ListReply) this.instance).setPools(i, builder.build());
            return this;
        }

        public Builder addPools(PoolReply.Builder builder) {
            copyOnWrite();
            ((ListReply) this.instance).addPools(builder.build());
            return this;
        }

        public Builder addPools(int i, PoolReply.Builder builder) {
            copyOnWrite();
            ((ListReply) this.instance).addPools(i, builder.build());
            return this;
        }
    }

    static {
        ListReply listReply = new ListReply();
        DEFAULT_INSTANCE = listReply;
        GeneratedMessageLite.registerDefaultInstance(ListReply.class, listReply);
    }

    private ListReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPools(Iterable<? extends PoolReply> iterable) {
        ensurePoolsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.pools_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPools(PoolReply poolReply) {
        poolReply.getClass();
        ensurePoolsIsMutable();
        this.pools_.add(poolReply);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnv() {
        this.env_ = getDefaultInstance().getEnv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHost() {
        this.host_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListVersion() {
        this.listVersion_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPools() {
        this.pools_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePoolsIsMutable() {
        Internal.ProtobufList<PoolReply> protobufList = this.pools_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.pools_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ListReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHost(Host host2) {
        host2.getClass();
        Host host3 = this.host_;
        if (host3 != null && host3 != Host.getDefaultInstance()) {
            this.host_ = Host.newBuilder(this.host_).mergeFrom(host2).buildPartial();
        } else {
            this.host_ = host2;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ListReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ListReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePools(int i) {
        ensurePoolsIsMutable();
        this.pools_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnv(String str) {
        str.getClass();
        this.env_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.env_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHost(Host host2) {
        host2.getClass();
        this.host_ = host2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListVersion(long j) {
        this.listVersion_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPools(int i, PoolReply poolReply) {
        poolReply.getClass();
        ensurePoolsIsMutable();
        this.pools_.set(i, poolReply);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65681.f16588xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ListReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\u001b\u0003\u0002\u0004\t", new Object[]{"env_", "pools_", PoolReply.class, "listVersion_", "host_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ListReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ListReply.class) {
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

    public String getEnv() {
        return this.env_;
    }

    public ByteString getEnvBytes() {
        return ByteString.copyFromUtf8(this.env_);
    }

    public Host getHost() {
        Host host2 = this.host_;
        return host2 == null ? Host.getDefaultInstance() : host2;
    }

    public long getListVersion() {
        return this.listVersion_;
    }

    public PoolReply getPools(int i) {
        return this.pools_.get(i);
    }

    public int getPoolsCount() {
        return this.pools_.size();
    }

    public List<PoolReply> getPoolsList() {
        return this.pools_;
    }

    public PoolReplyOrBuilder getPoolsOrBuilder(int i) {
        return this.pools_.get(i);
    }

    public List<? extends PoolReplyOrBuilder> getPoolsOrBuilderList() {
        return this.pools_;
    }

    public boolean hasHost() {
        return this.host_ != null;
    }

    public static Builder newBuilder(ListReply listReply) {
        return DEFAULT_INSTANCE.createBuilder(listReply);
    }

    public static ListReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ListReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPools(int i, PoolReply poolReply) {
        poolReply.getClass();
        ensurePoolsIsMutable();
        this.pools_.add(i, poolReply);
    }

    public static ListReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ListReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ListReply parseFrom(InputStream inputStream) throws IOException {
        return (ListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * clearPools
     */
    static void access$800(ListReply reply) {
    }
}
