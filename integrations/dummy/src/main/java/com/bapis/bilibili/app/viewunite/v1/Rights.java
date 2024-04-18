package com.bapis.bilibili.app.viewunite.v1;

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
public final class Rights extends GeneratedMessageLite<Rights, Rights.Builder> implements MessageLiteOrBuilder {
    private static final Rights DEFAULT_INSTANCE;
    public static final int DOWNLOAD_FIELD_NUMBER = 3;
    public static final int NO_REPRINT_FIELD_NUMBER = 2;
    public static final int ONLY_VIP_DOWNLOAD_FIELD_NUMBER = 1;
    private static volatile Parser<Rights> PARSER;
    private boolean download_;
    private boolean noReprint_;
    private boolean onlyVipDownload_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.Rights$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71571 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17125xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17125xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17125xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17125xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17125xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17125xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17125xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17125xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Rights, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71571 c71571) {
            this();
        }

        public Builder clearDownload() {
            copyOnWrite();
            ((Rights) this.instance).clearDownload();
            return this;
        }

        public Builder clearNoReprint() {
            copyOnWrite();
            ((Rights) this.instance).clearNoReprint();
            return this;
        }

        public Builder clearOnlyVipDownload() {
            copyOnWrite();
            ((Rights) this.instance).clearOnlyVipDownload();
            return this;
        }

        public boolean getDownload() {
            return ((Rights) this.instance).getDownload();
        }

        public boolean getNoReprint() {
            return ((Rights) this.instance).getNoReprint();
        }

        public boolean getOnlyVipDownload() {
            return ((Rights) this.instance).getOnlyVipDownload();
        }

        public Builder setDownload(boolean z) {
            copyOnWrite();
            ((Rights) this.instance).setDownload(z);
            return this;
        }

        public Builder setNoReprint(boolean z) {
            copyOnWrite();
            ((Rights) this.instance).setNoReprint(z);
            return this;
        }

        public Builder setOnlyVipDownload(boolean z) {
            copyOnWrite();
            ((Rights) this.instance).setOnlyVipDownload(z);
            return this;
        }

        private Builder() {
            super(Rights.DEFAULT_INSTANCE);
        }
    }

    static {
        Rights rights = new Rights();
        DEFAULT_INSTANCE = rights;
        GeneratedMessageLite.registerDefaultInstance(Rights.class, rights);
    }

    private Rights() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownload() {
        this.download_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoReprint() {
        this.noReprint_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnlyVipDownload() {
        this.onlyVipDownload_ = false;
    }

    public static Rights getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Rights parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Rights) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Rights parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Rights> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownload(boolean z) {
        this.download_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoReprint(boolean z) {
        this.noReprint_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnlyVipDownload(boolean z) {
        this.onlyVipDownload_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71571.f17125xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Rights();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"onlyVipDownload_", "noReprint_", "download_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Rights> parser = PARSER;
                if (parser == null) {
                    synchronized (Rights.class) {
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

    public boolean getDownload() {
        return this.download_;
    }

    public boolean getNoReprint() {
        return this.noReprint_;
    }

    public boolean getOnlyVipDownload() {
        return this.onlyVipDownload_;
    }

    public static Builder newBuilder(Rights rights) {
        return DEFAULT_INSTANCE.createBuilder(rights);
    }

    public static Rights parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rights) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Rights parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Rights parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Rights parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Rights parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Rights parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Rights parseFrom(InputStream inputStream) throws IOException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Rights parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Rights parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Rights parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
