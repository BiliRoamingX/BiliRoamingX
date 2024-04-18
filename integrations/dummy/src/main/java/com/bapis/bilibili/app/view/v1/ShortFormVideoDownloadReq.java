package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class ShortFormVideoDownloadReq extends GeneratedMessageLite<ShortFormVideoDownloadReq, ShortFormVideoDownloadReq.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int BUILD_FIELD_NUMBER = 6;
    public static final int BUVID_FIELD_NUMBER = 4;
    public static final int CID_FIELD_NUMBER = 2;
    private static final ShortFormVideoDownloadReq DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 7;
    public static final int MID_FIELD_NUMBER = 3;
    public static final int MOBI_APP_FIELD_NUMBER = 5;
    private static volatile Parser<ShortFormVideoDownloadReq> PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 8;
    public static final int RESTRICTION_FIELD_NUMBER = 10;
    public static final int SPMID_FIELD_NUMBER = 9;
    public static final int TF_ISP_FIELD_NUMBER = 11;
    private long aid_;
    private long build_;
    private long cid_;
    private long mid_;
    private Restriction restriction_;
    private String buvid_ = "";
    private String mobiApp_ = "";
    private String device_ = "";
    private String platform_ = "";
    private String spmid_ = "";
    private String tfIsp_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ShortFormVideoDownloadReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68621 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16821xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16821xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16821xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16821xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16821xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16821xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16821xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16821xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ShortFormVideoDownloadReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68621 c68621) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).clearAid();
            return this;
        }

        public Builder clearBuild() {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).clearBuild();
            return this;
        }

        public Builder clearBuvid() {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).clearBuvid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).clearCid();
            return this;
        }

        public Builder clearDevice() {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).clearDevice();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).clearMid();
            return this;
        }

        public Builder clearMobiApp() {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).clearMobiApp();
            return this;
        }

        public Builder clearPlatform() {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).clearPlatform();
            return this;
        }

        public Builder clearRestriction() {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).clearRestriction();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).clearSpmid();
            return this;
        }

        public Builder clearTfIsp() {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).clearTfIsp();
            return this;
        }

        public long getAid() {
            return ((ShortFormVideoDownloadReq) this.instance).getAid();
        }

        public long getBuild() {
            return ((ShortFormVideoDownloadReq) this.instance).getBuild();
        }

        public String getBuvid() {
            return ((ShortFormVideoDownloadReq) this.instance).getBuvid();
        }

        public ByteString getBuvidBytes() {
            return ((ShortFormVideoDownloadReq) this.instance).getBuvidBytes();
        }

        public long getCid() {
            return ((ShortFormVideoDownloadReq) this.instance).getCid();
        }

        public String getDevice() {
            return ((ShortFormVideoDownloadReq) this.instance).getDevice();
        }

        public ByteString getDeviceBytes() {
            return ((ShortFormVideoDownloadReq) this.instance).getDeviceBytes();
        }

        public long getMid() {
            return ((ShortFormVideoDownloadReq) this.instance).getMid();
        }

        public String getMobiApp() {
            return ((ShortFormVideoDownloadReq) this.instance).getMobiApp();
        }

        public ByteString getMobiAppBytes() {
            return ((ShortFormVideoDownloadReq) this.instance).getMobiAppBytes();
        }

        public String getPlatform() {
            return ((ShortFormVideoDownloadReq) this.instance).getPlatform();
        }

        public ByteString getPlatformBytes() {
            return ((ShortFormVideoDownloadReq) this.instance).getPlatformBytes();
        }

        public Restriction getRestriction() {
            return ((ShortFormVideoDownloadReq) this.instance).getRestriction();
        }

        public String getSpmid() {
            return ((ShortFormVideoDownloadReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((ShortFormVideoDownloadReq) this.instance).getSpmidBytes();
        }

        public String getTfIsp() {
            return ((ShortFormVideoDownloadReq) this.instance).getTfIsp();
        }

        public ByteString getTfIspBytes() {
            return ((ShortFormVideoDownloadReq) this.instance).getTfIspBytes();
        }

        public boolean hasRestriction() {
            return ((ShortFormVideoDownloadReq) this.instance).hasRestriction();
        }

        public Builder mergeRestriction(Restriction restriction) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).mergeRestriction(restriction);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setAid(j);
            return this;
        }

        public Builder setBuild(long j) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setBuild(j);
            return this;
        }

        public Builder setBuvid(String str) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setBuvid(str);
            return this;
        }

        public Builder setBuvidBytes(ByteString byteString) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setBuvidBytes(byteString);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setCid(j);
            return this;
        }

        public Builder setDevice(String str) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setDevice(str);
            return this;
        }

        public Builder setDeviceBytes(ByteString byteString) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setDeviceBytes(byteString);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setMid(j);
            return this;
        }

        public Builder setMobiApp(String str) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setMobiApp(str);
            return this;
        }

        public Builder setMobiAppBytes(ByteString byteString) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setMobiAppBytes(byteString);
            return this;
        }

        public Builder setPlatform(String str) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setPlatform(str);
            return this;
        }

        public Builder setPlatformBytes(ByteString byteString) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setPlatformBytes(byteString);
            return this;
        }

        public Builder setRestriction(Restriction restriction) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setRestriction(restriction);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        public Builder setTfIsp(String str) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setTfIsp(str);
            return this;
        }

        public Builder setTfIspBytes(ByteString byteString) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setTfIspBytes(byteString);
            return this;
        }

        private Builder() {
            super(ShortFormVideoDownloadReq.DEFAULT_INSTANCE);
        }

        public Builder setRestriction(Restriction.Builder builder) {
            copyOnWrite();
            ((ShortFormVideoDownloadReq) this.instance).setRestriction(builder.build());
            return this;
        }
    }

    static {
        ShortFormVideoDownloadReq shortFormVideoDownloadReq = new ShortFormVideoDownloadReq();
        DEFAULT_INSTANCE = shortFormVideoDownloadReq;
        GeneratedMessageLite.registerDefaultInstance(ShortFormVideoDownloadReq.class, shortFormVideoDownloadReq);
    }

    private ShortFormVideoDownloadReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuild() {
        this.build_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuvid() {
        this.buvid_ = getDefaultInstance().getBuvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevice() {
        this.device_ = getDefaultInstance().getDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobiApp() {
        this.mobiApp_ = getDefaultInstance().getMobiApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatform() {
        this.platform_ = getDefaultInstance().getPlatform();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestriction() {
        this.restriction_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTfIsp() {
        this.tfIsp_ = getDefaultInstance().getTfIsp();
    }

    public static ShortFormVideoDownloadReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRestriction(Restriction restriction) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ShortFormVideoDownloadReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ShortFormVideoDownloadReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShortFormVideoDownloadReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ShortFormVideoDownloadReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ShortFormVideoDownloadReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuild(long j) {
        this.build_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuvid(String str) {
        str.getClass();
        this.buvid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuvidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buvid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevice(String str) {
        str.getClass();
        this.device_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.device_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(long j) {
        this.mid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobiApp(String str) {
        str.getClass();
        this.mobiApp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobiAppBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mobiApp_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatform(String str) {
        str.getClass();
        this.platform_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.platform_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestriction(Restriction restriction) {
        restriction.getClass();
        this.restriction_ = restriction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmid(String str) {
        str.getClass();
        this.spmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.spmid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTfIsp(String str) {
        str.getClass();
        this.tfIsp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTfIspBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tfIsp_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68621.f16821xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ShortFormVideoDownloadReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0208\u0005\u0208\u0006\u0002\u0007\u0208\b\u0208\t\u0208\n\t\u000b\u0208", new Object[]{"aid_", "cid_", "mid_", "buvid_", "mobiApp_", "build_", "device_", "platform_", "spmid_", "restriction_", "tfIsp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ShortFormVideoDownloadReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ShortFormVideoDownloadReq.class) {
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

    public long getAid() {
        return this.aid_;
    }

    public long getBuild() {
        return this.build_;
    }

    public String getBuvid() {
        return this.buvid_;
    }

    public ByteString getBuvidBytes() {
        return ByteString.copyFromUtf8(this.buvid_);
    }

    public long getCid() {
        return this.cid_;
    }

    public String getDevice() {
        return this.device_;
    }

    public ByteString getDeviceBytes() {
        return ByteString.copyFromUtf8(this.device_);
    }

    public long getMid() {
        return this.mid_;
    }

    public String getMobiApp() {
        return this.mobiApp_;
    }

    public ByteString getMobiAppBytes() {
        return ByteString.copyFromUtf8(this.mobiApp_);
    }

    public String getPlatform() {
        return this.platform_;
    }

    public ByteString getPlatformBytes() {
        return ByteString.copyFromUtf8(this.platform_);
    }

    public Restriction getRestriction() {
        Restriction restriction = this.restriction_;
        return restriction == null ? Restriction.getDefaultInstance() : restriction;
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public String getTfIsp() {
        return this.tfIsp_;
    }

    public ByteString getTfIspBytes() {
        return ByteString.copyFromUtf8(this.tfIsp_);
    }

    public boolean hasRestriction() {
        return this.restriction_ != null;
    }

    public static Builder newBuilder(ShortFormVideoDownloadReq shortFormVideoDownloadReq) {
        return DEFAULT_INSTANCE.createBuilder(shortFormVideoDownloadReq);
    }

    public static ShortFormVideoDownloadReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShortFormVideoDownloadReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ShortFormVideoDownloadReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ShortFormVideoDownloadReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ShortFormVideoDownloadReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ShortFormVideoDownloadReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ShortFormVideoDownloadReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ShortFormVideoDownloadReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ShortFormVideoDownloadReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ShortFormVideoDownloadReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShortFormVideoDownloadReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ShortFormVideoDownloadReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ShortFormVideoDownloadReq parseFrom(InputStream inputStream) throws IOException {
        return (ShortFormVideoDownloadReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShortFormVideoDownloadReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShortFormVideoDownloadReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ShortFormVideoDownloadReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ShortFormVideoDownloadReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ShortFormVideoDownloadReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShortFormVideoDownloadReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
