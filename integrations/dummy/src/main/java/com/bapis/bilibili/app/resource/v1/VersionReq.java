package com.bapis.bilibili.app.resource.v1;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes15.dex */
public final class VersionReq extends GeneratedMessageLite<VersionReq, VersionReq.Builder> implements VersionReqOrBuilder {
    private static final VersionReq DEFAULT_INSTANCE;
    public static final int MODULE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<VersionReq> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String moduleName_ = "";
    private long version_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.resource.v1.VersionReq$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C65771 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16594xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16594xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16594xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16594xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16594xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16594xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16594xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16594xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<VersionReq, Builder> implements VersionReqOrBuilder {
        /* synthetic */ Builder(C65771 c65771) {
            this();
        }

        public Builder clearModuleName() {
            copyOnWrite();
            ((VersionReq) this.instance).clearModuleName();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((VersionReq) this.instance).clearVersion();
            return this;
        }

        @Override // com.bapis.bilibili.app.resource.v1.VersionReqOrBuilder
        public String getModuleName() {
            return ((VersionReq) this.instance).getModuleName();
        }

        @Override // com.bapis.bilibili.app.resource.v1.VersionReqOrBuilder
        public ByteString getModuleNameBytes() {
            return ((VersionReq) this.instance).getModuleNameBytes();
        }

        @Override // com.bapis.bilibili.app.resource.v1.VersionReqOrBuilder
        public long getVersion() {
            return ((VersionReq) this.instance).getVersion();
        }

        public Builder setModuleName(String str) {
            copyOnWrite();
            ((VersionReq) this.instance).setModuleName(str);
            return this;
        }

        public Builder setModuleNameBytes(ByteString byteString) {
            copyOnWrite();
            ((VersionReq) this.instance).setModuleNameBytes(byteString);
            return this;
        }

        public Builder setVersion(long j) {
            copyOnWrite();
            ((VersionReq) this.instance).setVersion(j);
            return this;
        }

        private Builder() {
            super(VersionReq.DEFAULT_INSTANCE);
        }
    }

    static {
        VersionReq versionReq = new VersionReq();
        DEFAULT_INSTANCE = versionReq;
        GeneratedMessageLite.registerDefaultInstance(VersionReq.class, versionReq);
    }

    private VersionReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModuleName() {
        this.moduleName_ = getDefaultInstance().getModuleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0L;
    }

    public static VersionReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VersionReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VersionReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VersionReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VersionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VersionReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setVersion(long j) {
        this.version_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65771.f16594xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VersionReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0002", new Object[]{"moduleName_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VersionReq> parser = PARSER;
                if (parser == null) {
                    synchronized (VersionReq.class) {
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

    @Override // com.bapis.bilibili.app.resource.v1.VersionReqOrBuilder
    public String getModuleName() {
        return this.moduleName_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.VersionReqOrBuilder
    public ByteString getModuleNameBytes() {
        return ByteString.copyFromUtf8(this.moduleName_);
    }

    @Override // com.bapis.bilibili.app.resource.v1.VersionReqOrBuilder
    public long getVersion() {
        return this.version_;
    }

    public static Builder newBuilder(VersionReq versionReq) {
        return DEFAULT_INSTANCE.createBuilder(versionReq);
    }

    public static VersionReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VersionReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VersionReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VersionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VersionReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VersionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VersionReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VersionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VersionReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VersionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VersionReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VersionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VersionReq parseFrom(InputStream inputStream) throws IOException {
        return (VersionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VersionReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VersionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VersionReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VersionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VersionReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VersionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
