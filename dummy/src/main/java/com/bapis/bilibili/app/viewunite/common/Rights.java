package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
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
    public static final int ALLOW_DEMAND_FIELD_NUMBER = 6;
    public static final int ALLOW_DM_FIELD_NUMBER = 5;
    public static final int ALLOW_DOWNLOAD_FIELD_NUMBER = 1;
    public static final int ALLOW_REVIEW_FIELD_NUMBER = 2;
    public static final int AREA_LIMIT_FIELD_NUMBER = 7;
    public static final int CAN_WATCH_FIELD_NUMBER = 3;
    private static final Rights DEFAULT_INSTANCE;
    private static volatile Parser<Rights> PARSER = null;
    public static final int RESOURCE_FIELD_NUMBER = 4;
    private int allowDemand_;
    private int allowDm_;
    private int allowDownload_;
    private int allowReview_;
    private int areaLimit_;
    private int canWatch_;
    private String resource_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Rights$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70531 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17032xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17032xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17032xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17032xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17032xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17032xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17032xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17032xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Rights, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70531 c70531) {
            this();
        }

        public Builder clearAllowDemand() {
            copyOnWrite();
            ((Rights) this.instance).clearAllowDemand();
            return this;
        }

        public Builder clearAllowDm() {
            copyOnWrite();
            ((Rights) this.instance).clearAllowDm();
            return this;
        }

        public Builder clearAllowDownload() {
            copyOnWrite();
            ((Rights) this.instance).clearAllowDownload();
            return this;
        }

        public Builder clearAllowReview() {
            copyOnWrite();
            ((Rights) this.instance).clearAllowReview();
            return this;
        }

        public Builder clearAreaLimit() {
            copyOnWrite();
            ((Rights) this.instance).clearAreaLimit();
            return this;
        }

        public Builder clearCanWatch() {
            copyOnWrite();
            ((Rights) this.instance).clearCanWatch();
            return this;
        }

        public Builder clearResource() {
            copyOnWrite();
            ((Rights) this.instance).clearResource();
            return this;
        }

        public int getAllowDemand() {
            return ((Rights) this.instance).getAllowDemand();
        }

        public int getAllowDm() {
            return ((Rights) this.instance).getAllowDm();
        }

        public int getAllowDownload() {
            return ((Rights) this.instance).getAllowDownload();
        }

        public int getAllowReview() {
            return ((Rights) this.instance).getAllowReview();
        }

        public int getAreaLimit() {
            return ((Rights) this.instance).getAreaLimit();
        }

        public int getCanWatch() {
            return ((Rights) this.instance).getCanWatch();
        }

        public String getResource() {
            return ((Rights) this.instance).getResource();
        }

        public ByteString getResourceBytes() {
            return ((Rights) this.instance).getResourceBytes();
        }

        public Builder setAllowDemand(int i) {
            copyOnWrite();
            ((Rights) this.instance).setAllowDemand(i);
            return this;
        }

        public Builder setAllowDm(int i) {
            copyOnWrite();
            ((Rights) this.instance).setAllowDm(i);
            return this;
        }

        public Builder setAllowDownload(int i) {
            copyOnWrite();
            ((Rights) this.instance).setAllowDownload(i);
            return this;
        }

        public Builder setAllowReview(int i) {
            copyOnWrite();
            ((Rights) this.instance).setAllowReview(i);
            return this;
        }

        public Builder setAreaLimit(int i) {
            copyOnWrite();
            ((Rights) this.instance).setAreaLimit(i);
            return this;
        }

        public Builder setCanWatch(int i) {
            copyOnWrite();
            ((Rights) this.instance).setCanWatch(i);
            return this;
        }

        public Builder setResource(String str) {
            copyOnWrite();
            ((Rights) this.instance).setResource(str);
            return this;
        }

        public Builder setResourceBytes(ByteString byteString) {
            copyOnWrite();
            ((Rights) this.instance).setResourceBytes(byteString);
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
    public void clearAllowDemand() {
        this.allowDemand_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowDm() {
        this.allowDm_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowDownload() {
        this.allowDownload_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowReview() {
        this.allowReview_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAreaLimit() {
        this.areaLimit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanWatch() {
        this.canWatch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = getDefaultInstance().getResource();
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
    public void setAllowDemand(int i) {
        this.allowDemand_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowDm(int i) {
        this.allowDm_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowDownload(int i) {
        this.allowDownload_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowReview(int i) {
        this.allowReview_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAreaLimit(int i) {
        this.areaLimit_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanWatch(int i) {
        this.canWatch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(String str) {
        str.getClass();
        this.resource_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.resource_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70531.f17032xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Rights();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0208\u0005\u0004\u0006\u0004\u0007\u0004", new Object[]{"allowDownload_", "allowReview_", "canWatch_", "resource_", "allowDm_", "allowDemand_", "areaLimit_"});
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

    public int getAllowDemand() {
        return this.allowDemand_;
    }

    public int getAllowDm() {
        return this.allowDm_;
    }

    public int getAllowDownload() {
        return this.allowDownload_;
    }

    public int getAllowReview() {
        return this.allowReview_;
    }

    public int getAreaLimit() {
        return this.areaLimit_;
    }

    public int getCanWatch() {
        return this.canWatch_;
    }

    public String getResource() {
        return this.resource_;
    }

    public ByteString getResourceBytes() {
        return ByteString.copyFromUtf8(this.resource_);
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
