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
public final class ListReq extends GeneratedMessageLite<ListReq, ListReq.Builder> implements MessageLiteOrBuilder {
    public static final int ARCH_FIELD_NUMBER = 7;
    private static final ListReq DEFAULT_INSTANCE;
    public static final int ENV_FIELD_NUMBER = 4;
    public static final int LIST_VERSION_FIELD_NUMBER = 8;
    public static final int LITE_FIELD_NUMBER = 9;
    public static final int MODULE_NAME_FIELD_NUMBER = 2;
    private static volatile Parser<ListReq> PARSER = null;
    public static final int POOL_NAME_FIELD_NUMBER = 1;
    public static final int SCALE_FIELD_NUMBER = 6;
    public static final int SYS_VER_FIELD_NUMBER = 5;
    public static final int VERSION_LIST_FIELD_NUMBER = 3;
    private int arch_;
    private int env_;
    private long listVersion_;
    private int lite_;
    private int scale_;
    private int sysVer_;
    private String poolName_ = "";
    private String moduleName_ = "";
    private Internal.ProtobufList<VersionListReq> versionList_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.resource.v1.ListReq$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C65691 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16589xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16589xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16589xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16589xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16589xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16589xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16589xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16589xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ListReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C65691 c65691) {
            this();
        }

        public Builder addAllVersionList(Iterable<? extends VersionListReq> iterable) {
            copyOnWrite();
            ((ListReq) this.instance).addAllVersionList(iterable);
            return this;
        }

        public Builder addVersionList(VersionListReq versionListReq) {
            copyOnWrite();
            ((ListReq) this.instance).addVersionList(versionListReq);
            return this;
        }

        public Builder clearArch() {
            copyOnWrite();
            ((ListReq) this.instance).clearArch();
            return this;
        }

        public Builder clearEnv() {
            copyOnWrite();
            ((ListReq) this.instance).clearEnv();
            return this;
        }

        public Builder clearListVersion() {
            copyOnWrite();
            ((ListReq) this.instance).clearListVersion();
            return this;
        }

        public Builder clearLite() {
            copyOnWrite();
            ((ListReq) this.instance).clearLite();
            return this;
        }

        public Builder clearModuleName() {
            copyOnWrite();
            ((ListReq) this.instance).clearModuleName();
            return this;
        }

        public Builder clearPoolName() {
            copyOnWrite();
            ((ListReq) this.instance).clearPoolName();
            return this;
        }

        public Builder clearScale() {
            copyOnWrite();
            ((ListReq) this.instance).clearScale();
            return this;
        }

        public Builder clearSysVer() {
            copyOnWrite();
            ((ListReq) this.instance).clearSysVer();
            return this;
        }

        public Builder clearVersionList() {
            copyOnWrite();
            ((ListReq) this.instance).clearVersionList();
            return this;
        }

        public int getArch() {
            return ((ListReq) this.instance).getArch();
        }

        public EnvType getEnv() {
            return ((ListReq) this.instance).getEnv();
        }

        public int getEnvValue() {
            return ((ListReq) this.instance).getEnvValue();
        }

        public long getListVersion() {
            return ((ListReq) this.instance).getListVersion();
        }

        public int getLite() {
            return ((ListReq) this.instance).getLite();
        }

        public String getModuleName() {
            return ((ListReq) this.instance).getModuleName();
        }

        public ByteString getModuleNameBytes() {
            return ((ListReq) this.instance).getModuleNameBytes();
        }

        public String getPoolName() {
            return ((ListReq) this.instance).getPoolName();
        }

        public ByteString getPoolNameBytes() {
            return ((ListReq) this.instance).getPoolNameBytes();
        }

        public int getScale() {
            return ((ListReq) this.instance).getScale();
        }

        public int getSysVer() {
            return ((ListReq) this.instance).getSysVer();
        }

        public VersionListReq getVersionList(int i) {
            return ((ListReq) this.instance).getVersionList(i);
        }

        public int getVersionListCount() {
            return ((ListReq) this.instance).getVersionListCount();
        }

        public List<VersionListReq> getVersionListList() {
            return Collections.unmodifiableList(((ListReq) this.instance).getVersionListList());
        }

        public Builder removeVersionList(int i) {
            copyOnWrite();
            ((ListReq) this.instance).removeVersionList(i);
            return this;
        }

        public Builder setArch(int i) {
            copyOnWrite();
            ((ListReq) this.instance).setArch(i);
            return this;
        }

        public Builder setEnv(EnvType envType) {
            copyOnWrite();
            ((ListReq) this.instance).setEnv(envType);
            return this;
        }

        public Builder setEnvValue(int i) {
            copyOnWrite();
            ((ListReq) this.instance).setEnvValue(i);
            return this;
        }

        public Builder setListVersion(long j) {
            copyOnWrite();
            ((ListReq) this.instance).setListVersion(j);
            return this;
        }

        public Builder setLite(int i) {
            copyOnWrite();
            ((ListReq) this.instance).setLite(i);
            return this;
        }

        public Builder setModuleName(String str) {
            copyOnWrite();
            ((ListReq) this.instance).setModuleName(str);
            return this;
        }

        public Builder setModuleNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ListReq) this.instance).setModuleNameBytes(byteString);
            return this;
        }

        public Builder setPoolName(String str) {
            copyOnWrite();
            ((ListReq) this.instance).setPoolName(str);
            return this;
        }

        public Builder setPoolNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ListReq) this.instance).setPoolNameBytes(byteString);
            return this;
        }

        public Builder setScale(int i) {
            copyOnWrite();
            ((ListReq) this.instance).setScale(i);
            return this;
        }

        public Builder setSysVer(int i) {
            copyOnWrite();
            ((ListReq) this.instance).setSysVer(i);
            return this;
        }

        public Builder setVersionList(int i, VersionListReq versionListReq) {
            copyOnWrite();
            ((ListReq) this.instance).setVersionList(i, versionListReq);
            return this;
        }

        private Builder() {
            super(ListReq.DEFAULT_INSTANCE);
        }

        public Builder addVersionList(int i, VersionListReq versionListReq) {
            copyOnWrite();
            ((ListReq) this.instance).addVersionList(i, versionListReq);
            return this;
        }

        public Builder setVersionList(int i, VersionListReq.Builder builder) {
            copyOnWrite();
            ((ListReq) this.instance).setVersionList(i, builder.build());
            return this;
        }

        public Builder addVersionList(VersionListReq.Builder builder) {
            copyOnWrite();
            ((ListReq) this.instance).addVersionList(builder.build());
            return this;
        }

        public Builder addVersionList(int i, VersionListReq.Builder builder) {
            copyOnWrite();
            ((ListReq) this.instance).addVersionList(i, builder.build());
            return this;
        }
    }

    static {
        ListReq listReq = new ListReq();
        DEFAULT_INSTANCE = listReq;
        GeneratedMessageLite.registerDefaultInstance(ListReq.class, listReq);
    }

    private ListReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVersionList(Iterable<? extends VersionListReq> iterable) {
        ensureVersionListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.versionList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVersionList(VersionListReq versionListReq) {
        versionListReq.getClass();
        ensureVersionListIsMutable();
        this.versionList_.add(versionListReq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArch() {
        this.arch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnv() {
        this.env_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListVersion() {
        this.listVersion_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLite() {
        this.lite_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModuleName() {
        this.moduleName_ = getDefaultInstance().getModuleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoolName() {
        this.poolName_ = getDefaultInstance().getPoolName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScale() {
        this.scale_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSysVer() {
        this.sysVer_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionList() {
        this.versionList_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureVersionListIsMutable() {
        Internal.ProtobufList<VersionListReq> protobufList = this.versionList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.versionList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ListReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ListReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ListReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVersionList(int i) {
        ensureVersionListIsMutable();
        this.versionList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArch(int i) {
        this.arch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnv(EnvType envType) {
        this.env_ = envType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvValue(int i) {
        this.env_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListVersion(long j) {
        this.listVersion_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLite(int i) {
        this.lite_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModuleName(String str) {
        str.getClass();
        this.moduleName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModuleNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.moduleName_ = byteString.toStringUtf8();
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
    public void setScale(int i) {
        this.scale_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSysVer(int i) {
        this.sysVer_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionList(int i, VersionListReq versionListReq) {
        versionListReq.getClass();
        ensureVersionListIsMutable();
        this.versionList_.set(i, versionListReq);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65691.f16589xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ListReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u001b\u0004\f\u0005\u0004\u0006\u0004\u0007\u0004\b\u0002\t\u0004", new Object[]{"poolName_", "moduleName_", "versionList_", VersionListReq.class, "env_", "sysVer_", "scale_", "arch_", "listVersion_", "lite_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ListReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ListReq.class) {
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

    public int getArch() {
        return this.arch_;
    }

    public EnvType getEnv() {
        EnvType forNumber = EnvType.forNumber(this.env_);
        return forNumber == null ? EnvType.UNRECOGNIZED : forNumber;
    }

    public int getEnvValue() {
        return this.env_;
    }

    public long getListVersion() {
        return this.listVersion_;
    }

    public int getLite() {
        return this.lite_;
    }

    public String getModuleName() {
        return this.moduleName_;
    }

    public ByteString getModuleNameBytes() {
        return ByteString.copyFromUtf8(this.moduleName_);
    }

    public String getPoolName() {
        return this.poolName_;
    }

    public ByteString getPoolNameBytes() {
        return ByteString.copyFromUtf8(this.poolName_);
    }

    public int getScale() {
        return this.scale_;
    }

    public int getSysVer() {
        return this.sysVer_;
    }

    public VersionListReq getVersionList(int i) {
        return this.versionList_.get(i);
    }

    public int getVersionListCount() {
        return this.versionList_.size();
    }

    public List<VersionListReq> getVersionListList() {
        return this.versionList_;
    }

    public VersionListReqOrBuilder getVersionListOrBuilder(int i) {
        return this.versionList_.get(i);
    }

    public List<? extends VersionListReqOrBuilder> getVersionListOrBuilderList() {
        return this.versionList_;
    }

    public static Builder newBuilder(ListReq listReq) {
        return DEFAULT_INSTANCE.createBuilder(listReq);
    }

    public static ListReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ListReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVersionList(int i, VersionListReq versionListReq) {
        versionListReq.getClass();
        ensureVersionListIsMutable();
        this.versionList_.add(i, versionListReq);
    }

    public static ListReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ListReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ListReq parseFrom(InputStream inputStream) throws IOException {
        return (ListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
