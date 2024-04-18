package com.bapis.bilibili.app.resource.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes15.dex */
public final class VersionListReq extends GeneratedMessageLite<VersionListReq, VersionListReq.Builder> implements VersionListReqOrBuilder {
    private static final VersionListReq DEFAULT_INSTANCE;
    private static volatile Parser<VersionListReq> PARSER = null;
    public static final int POOL_NAME_FIELD_NUMBER = 1;
    public static final int VERSIONS_FIELD_NUMBER = 2;
    private String poolName_ = "";
    private Internal.ProtobufList<VersionReq> versions_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.resource.v1.VersionListReq$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C65761 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16593xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16593xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16593xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16593xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16593xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16593xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16593xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16593xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<VersionListReq, Builder> implements VersionListReqOrBuilder {
        /* synthetic */ Builder(C65761 c65761) {
            this();
        }

        public Builder addAllVersions(Iterable<? extends VersionReq> iterable) {
            copyOnWrite();
            ((VersionListReq) this.instance).addAllVersions(iterable);
            return this;
        }

        public Builder addVersions(VersionReq versionReq) {
            copyOnWrite();
            ((VersionListReq) this.instance).addVersions(versionReq);
            return this;
        }

        public Builder clearPoolName() {
            copyOnWrite();
            ((VersionListReq) this.instance).clearPoolName();
            return this;
        }

        public Builder clearVersions() {
            copyOnWrite();
            ((VersionListReq) this.instance).clearVersions();
            return this;
        }

        @Override // com.bapis.bilibili.app.resource.v1.VersionListReqOrBuilder
        public String getPoolName() {
            return ((VersionListReq) this.instance).getPoolName();
        }

        @Override // com.bapis.bilibili.app.resource.v1.VersionListReqOrBuilder
        public ByteString getPoolNameBytes() {
            return ((VersionListReq) this.instance).getPoolNameBytes();
        }

        @Override // com.bapis.bilibili.app.resource.v1.VersionListReqOrBuilder
        public VersionReq getVersions(int i) {
            return ((VersionListReq) this.instance).getVersions(i);
        }

        @Override // com.bapis.bilibili.app.resource.v1.VersionListReqOrBuilder
        public int getVersionsCount() {
            return ((VersionListReq) this.instance).getVersionsCount();
        }

        @Override // com.bapis.bilibili.app.resource.v1.VersionListReqOrBuilder
        public List<VersionReq> getVersionsList() {
            return Collections.unmodifiableList(((VersionListReq) this.instance).getVersionsList());
        }

        public Builder removeVersions(int i) {
            copyOnWrite();
            ((VersionListReq) this.instance).removeVersions(i);
            return this;
        }

        public Builder setPoolName(String str) {
            copyOnWrite();
            ((VersionListReq) this.instance).setPoolName(str);
            return this;
        }

        public Builder setPoolNameBytes(ByteString byteString) {
            copyOnWrite();
            ((VersionListReq) this.instance).setPoolNameBytes(byteString);
            return this;
        }

        public Builder setVersions(int i, VersionReq versionReq) {
            copyOnWrite();
            ((VersionListReq) this.instance).setVersions(i, versionReq);
            return this;
        }

        private Builder() {
            super(VersionListReq.DEFAULT_INSTANCE);
        }

        public Builder addVersions(int i, VersionReq versionReq) {
            copyOnWrite();
            ((VersionListReq) this.instance).addVersions(i, versionReq);
            return this;
        }

        public Builder setVersions(int i, VersionReq.Builder builder) {
            copyOnWrite();
            ((VersionListReq) this.instance).setVersions(i, builder.build());
            return this;
        }

        public Builder addVersions(VersionReq.Builder builder) {
            copyOnWrite();
            ((VersionListReq) this.instance).addVersions(builder.build());
            return this;
        }

        public Builder addVersions(int i, VersionReq.Builder builder) {
            copyOnWrite();
            ((VersionListReq) this.instance).addVersions(i, builder.build());
            return this;
        }
    }

    static {
        VersionListReq versionListReq = new VersionListReq();
        DEFAULT_INSTANCE = versionListReq;
        GeneratedMessageLite.registerDefaultInstance(VersionListReq.class, versionListReq);
    }

    private VersionListReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVersions(Iterable<? extends VersionReq> iterable) {
        ensureVersionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.versions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVersions(VersionReq versionReq) {
        versionReq.getClass();
        ensureVersionsIsMutable();
        this.versions_.add(versionReq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoolName() {
        this.poolName_ = getDefaultInstance().getPoolName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersions() {
        this.versions_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureVersionsIsMutable() {
        Internal.ProtobufList<VersionReq> protobufList = this.versions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.versions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static VersionListReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VersionListReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VersionListReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VersionListReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VersionListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VersionListReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVersions(int i) {
        ensureVersionsIsMutable();
        this.versions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoolName(String str) {
        str.getClass();
        this.poolName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoolNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.poolName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersions(int i, VersionReq versionReq) {
        versionReq.getClass();
        ensureVersionsIsMutable();
        this.versions_.set(i, versionReq);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65761.f16593xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VersionListReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[]{"poolName_", "versions_", VersionReq.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VersionListReq> parser = PARSER;
                if (parser == null) {
                    synchronized (VersionListReq.class) {
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

    @Override // com.bapis.bilibili.app.resource.v1.VersionListReqOrBuilder
    public String getPoolName() {
        return this.poolName_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.VersionListReqOrBuilder
    public ByteString getPoolNameBytes() {
        return ByteString.copyFromUtf8(this.poolName_);
    }

    @Override // com.bapis.bilibili.app.resource.v1.VersionListReqOrBuilder
    public VersionReq getVersions(int i) {
        return this.versions_.get(i);
    }

    @Override // com.bapis.bilibili.app.resource.v1.VersionListReqOrBuilder
    public int getVersionsCount() {
        return this.versions_.size();
    }

    @Override // com.bapis.bilibili.app.resource.v1.VersionListReqOrBuilder
    public List<VersionReq> getVersionsList() {
        return this.versions_;
    }

    public VersionReqOrBuilder getVersionsOrBuilder(int i) {
        return this.versions_.get(i);
    }

    public List<? extends VersionReqOrBuilder> getVersionsOrBuilderList() {
        return this.versions_;
    }

    public static Builder newBuilder(VersionListReq versionListReq) {
        return DEFAULT_INSTANCE.createBuilder(versionListReq);
    }

    public static VersionListReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VersionListReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VersionListReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VersionListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VersionListReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VersionListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVersions(int i, VersionReq versionReq) {
        versionReq.getClass();
        ensureVersionsIsMutable();
        this.versions_.add(i, versionReq);
    }

    public static VersionListReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VersionListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VersionListReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VersionListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VersionListReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VersionListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VersionListReq parseFrom(InputStream inputStream) throws IOException {
        return (VersionListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VersionListReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VersionListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VersionListReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VersionListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VersionListReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VersionListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
