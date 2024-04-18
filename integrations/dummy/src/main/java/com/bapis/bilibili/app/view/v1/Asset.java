package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class Asset extends GeneratedMessageLite<Asset, Asset.Builder> implements MessageLiteOrBuilder {
    private static final Asset DEFAULT_INSTANCE;
    public static final int MSG_FIELD_NUMBER = 3;
    public static final int PAID_FIELD_NUMBER = 1;
    private static volatile Parser<Asset> PARSER = null;
    public static final int PREVIEW_MSG_FIELD_NUMBER = 4;
    public static final int PRICE_FIELD_NUMBER = 2;
    private AssetMsg msg_;
    private int paid_;
    private AssetMsg previewMsg_;
    private long price_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Asset$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67121 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16688xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16688xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16688xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16688xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16688xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16688xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16688xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16688xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Asset, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67121 c67121) {
            this();
        }

        public Builder clearMsg() {
            copyOnWrite();
            ((Asset) this.instance).clearMsg();
            return this;
        }

        public Builder clearPaid() {
            copyOnWrite();
            ((Asset) this.instance).clearPaid();
            return this;
        }

        public Builder clearPreviewMsg() {
            copyOnWrite();
            ((Asset) this.instance).clearPreviewMsg();
            return this;
        }

        public Builder clearPrice() {
            copyOnWrite();
            ((Asset) this.instance).clearPrice();
            return this;
        }

        public AssetMsg getMsg() {
            return ((Asset) this.instance).getMsg();
        }

        public int getPaid() {
            return ((Asset) this.instance).getPaid();
        }

        public AssetMsg getPreviewMsg() {
            return ((Asset) this.instance).getPreviewMsg();
        }

        public long getPrice() {
            return ((Asset) this.instance).getPrice();
        }

        public boolean hasMsg() {
            return ((Asset) this.instance).hasMsg();
        }

        public boolean hasPreviewMsg() {
            return ((Asset) this.instance).hasPreviewMsg();
        }

        public Builder mergeMsg(AssetMsg assetMsg) {
            copyOnWrite();
            ((Asset) this.instance).mergeMsg(assetMsg);
            return this;
        }

        public Builder mergePreviewMsg(AssetMsg assetMsg) {
            copyOnWrite();
            ((Asset) this.instance).mergePreviewMsg(assetMsg);
            return this;
        }

        public Builder setMsg(AssetMsg assetMsg) {
            copyOnWrite();
            ((Asset) this.instance).setMsg(assetMsg);
            return this;
        }

        public Builder setPaid(int i) {
            copyOnWrite();
            ((Asset) this.instance).setPaid(i);
            return this;
        }

        public Builder setPreviewMsg(AssetMsg assetMsg) {
            copyOnWrite();
            ((Asset) this.instance).setPreviewMsg(assetMsg);
            return this;
        }

        public Builder setPrice(long j) {
            copyOnWrite();
            ((Asset) this.instance).setPrice(j);
            return this;
        }

        private Builder() {
            super(Asset.DEFAULT_INSTANCE);
        }

        public Builder setMsg(AssetMsg.Builder builder) {
            copyOnWrite();
            ((Asset) this.instance).setMsg(builder.build());
            return this;
        }

        public Builder setPreviewMsg(AssetMsg.Builder builder) {
            copyOnWrite();
            ((Asset) this.instance).setPreviewMsg(builder.build());
            return this;
        }
    }

    static {
        Asset asset = new Asset();
        DEFAULT_INSTANCE = asset;
        GeneratedMessageLite.registerDefaultInstance(Asset.class, asset);
    }

    private Asset() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsg() {
        this.msg_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaid() {
        this.paid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewMsg() {
        this.previewMsg_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = 0L;
    }

    public static Asset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMsg(AssetMsg assetMsg) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePreviewMsg(AssetMsg assetMsg) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Asset parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Asset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Asset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Asset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsg(AssetMsg assetMsg) {
        assetMsg.getClass();
        this.msg_ = assetMsg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaid(int i) {
        this.paid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewMsg(AssetMsg assetMsg) {
        assetMsg.getClass();
        this.previewMsg_ = assetMsg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(long j) {
        this.price_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67121.f16688xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Asset();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\t\u0004\t", new Object[]{"paid_", "price_", "msg_", "previewMsg_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Asset> parser = PARSER;
                if (parser == null) {
                    synchronized (Asset.class) {
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

    public AssetMsg getMsg() {
        AssetMsg assetMsg = this.msg_;
        return assetMsg == null ? AssetMsg.getDefaultInstance() : assetMsg;
    }

    public int getPaid() {
        return this.paid_;
    }

    public AssetMsg getPreviewMsg() {
        AssetMsg assetMsg = this.previewMsg_;
        return assetMsg == null ? AssetMsg.getDefaultInstance() : assetMsg;
    }

    public long getPrice() {
        return this.price_;
    }

    public boolean hasMsg() {
        return this.msg_ != null;
    }

    public boolean hasPreviewMsg() {
        return this.previewMsg_ != null;
    }

    public static Builder newBuilder(Asset asset) {
        return DEFAULT_INSTANCE.createBuilder(asset);
    }

    public static Asset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Asset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Asset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Asset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Asset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Asset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Asset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Asset parseFrom(InputStream inputStream) throws IOException {
        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Asset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Asset parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Asset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
