package com.bapis.bilibili.metadata.device;

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
/* loaded from: classes5.dex */
public final class Device extends GeneratedMessageLite<Device, Device.Builder> implements MessageLiteOrBuilder {
    public static final int APP_ID_FIELD_NUMBER = 1;
    public static final int BRAND_FIELD_NUMBER = 8;
    public static final int BUILD_FIELD_NUMBER = 2;
    public static final int BUVID_FIELD_NUMBER = 3;
    public static final int CHANNEL_FIELD_NUMBER = 7;
    private static final Device DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 6;
    public static final int FP_FIELD_NUMBER = 14;
    public static final int FP_LOCAL_FIELD_NUMBER = 11;
    public static final int FP_REMOTE_FIELD_NUMBER = 12;
    public static final int FTS_FIELD_NUMBER = 15;
    public static final int MOBI_APP_FIELD_NUMBER = 4;
    public static final int MODEL_FIELD_NUMBER = 9;
    public static final int OSVER_FIELD_NUMBER = 10;
    private static volatile Parser<Device> PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 5;
    public static final int VERSION_NAME_FIELD_NUMBER = 13;
    private int appId_;
    private int build_;
    private long fts_;
    private String buvid_ = "";
    private String mobiApp_ = "";
    private String platform_ = "";
    private String device_ = "";
    private String channel_ = "";
    private String brand_ = "";
    private String model_ = "";
    private String osver_ = "";
    private String fpLocal_ = "";
    private String fpRemote_ = "";
    private String versionName_ = "";
    private String fp_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.metadata.device.Device$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes5.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Device, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearAppId() {
            copyOnWrite();
            ((Device) this.instance).clearAppId();
            return this;
        }

        public Builder clearBrand() {
            copyOnWrite();
            ((Device) this.instance).clearBrand();
            return this;
        }

        public Builder clearBuild() {
            copyOnWrite();
            ((Device) this.instance).clearBuild();
            return this;
        }

        public Builder clearBuvid() {
            copyOnWrite();
            ((Device) this.instance).clearBuvid();
            return this;
        }

        public Builder clearChannel() {
            copyOnWrite();
            ((Device) this.instance).clearChannel();
            return this;
        }

        public Builder clearDevice() {
            copyOnWrite();
            ((Device) this.instance).clearDevice();
            return this;
        }

        public Builder clearFp() {
            copyOnWrite();
            ((Device) this.instance).clearFp();
            return this;
        }

        public Builder clearFpLocal() {
            copyOnWrite();
            ((Device) this.instance).clearFpLocal();
            return this;
        }

        public Builder clearFpRemote() {
            copyOnWrite();
            ((Device) this.instance).clearFpRemote();
            return this;
        }

        public Builder clearFts() {
            copyOnWrite();
            ((Device) this.instance).clearFts();
            return this;
        }

        public Builder clearMobiApp() {
            copyOnWrite();
            ((Device) this.instance).clearMobiApp();
            return this;
        }

        public Builder clearModel() {
            copyOnWrite();
            ((Device) this.instance).clearModel();
            return this;
        }

        public Builder clearOsver() {
            copyOnWrite();
            ((Device) this.instance).clearOsver();
            return this;
        }

        public Builder clearPlatform() {
            copyOnWrite();
            ((Device) this.instance).clearPlatform();
            return this;
        }

        public Builder clearVersionName() {
            copyOnWrite();
            ((Device) this.instance).clearVersionName();
            return this;
        }

        public int getAppId() {
            return ((Device) this.instance).getAppId();
        }

        public String getBrand() {
            return ((Device) this.instance).getBrand();
        }

        public ByteString getBrandBytes() {
            return ((Device) this.instance).getBrandBytes();
        }

        public int getBuild() {
            return ((Device) this.instance).getBuild();
        }

        public String getBuvid() {
            return ((Device) this.instance).getBuvid();
        }

        public ByteString getBuvidBytes() {
            return ((Device) this.instance).getBuvidBytes();
        }

        public String getChannel() {
            return ((Device) this.instance).getChannel();
        }

        public ByteString getChannelBytes() {
            return ((Device) this.instance).getChannelBytes();
        }

        public String getDevice() {
            return ((Device) this.instance).getDevice();
        }

        public ByteString getDeviceBytes() {
            return ((Device) this.instance).getDeviceBytes();
        }

        public String getFp() {
            return ((Device) this.instance).getFp();
        }

        public ByteString getFpBytes() {
            return ((Device) this.instance).getFpBytes();
        }

        public String getFpLocal() {
            return ((Device) this.instance).getFpLocal();
        }

        public ByteString getFpLocalBytes() {
            return ((Device) this.instance).getFpLocalBytes();
        }

        public String getFpRemote() {
            return ((Device) this.instance).getFpRemote();
        }

        public ByteString getFpRemoteBytes() {
            return ((Device) this.instance).getFpRemoteBytes();
        }

        public long getFts() {
            return ((Device) this.instance).getFts();
        }

        public String getMobiApp() {
            return ((Device) this.instance).getMobiApp();
        }

        public ByteString getMobiAppBytes() {
            return ((Device) this.instance).getMobiAppBytes();
        }

        public String getModel() {
            return ((Device) this.instance).getModel();
        }

        public ByteString getModelBytes() {
            return ((Device) this.instance).getModelBytes();
        }

        public String getOsver() {
            return ((Device) this.instance).getOsver();
        }

        public ByteString getOsverBytes() {
            return ((Device) this.instance).getOsverBytes();
        }

        public String getPlatform() {
            return ((Device) this.instance).getPlatform();
        }

        public ByteString getPlatformBytes() {
            return ((Device) this.instance).getPlatformBytes();
        }

        public String getVersionName() {
            return ((Device) this.instance).getVersionName();
        }

        public ByteString getVersionNameBytes() {
            return ((Device) this.instance).getVersionNameBytes();
        }

        public Builder setAppId(int i14) {
            copyOnWrite();
            ((Device) this.instance).setAppId(i14);
            return this;
        }

        public Builder setBrand(String str) {
            copyOnWrite();
            ((Device) this.instance).setBrand(str);
            return this;
        }

        public Builder setBrandBytes(ByteString byteString) {
            copyOnWrite();
            ((Device) this.instance).setBrandBytes(byteString);
            return this;
        }

        public Builder setBuild(int i14) {
            copyOnWrite();
            ((Device) this.instance).setBuild(i14);
            return this;
        }

        public Builder setBuvid(String str) {
            copyOnWrite();
            ((Device) this.instance).setBuvid(str);
            return this;
        }

        public Builder setBuvidBytes(ByteString byteString) {
            copyOnWrite();
            ((Device) this.instance).setBuvidBytes(byteString);
            return this;
        }

        public Builder setChannel(String str) {
            copyOnWrite();
            ((Device) this.instance).setChannel(str);
            return this;
        }

        public Builder setChannelBytes(ByteString byteString) {
            copyOnWrite();
            ((Device) this.instance).setChannelBytes(byteString);
            return this;
        }

        public Builder setDevice(String str) {
            copyOnWrite();
            ((Device) this.instance).setDevice(str);
            return this;
        }

        public Builder setDeviceBytes(ByteString byteString) {
            copyOnWrite();
            ((Device) this.instance).setDeviceBytes(byteString);
            return this;
        }

        public Builder setFp(String str) {
            copyOnWrite();
            ((Device) this.instance).setFp(str);
            return this;
        }

        public Builder setFpBytes(ByteString byteString) {
            copyOnWrite();
            ((Device) this.instance).setFpBytes(byteString);
            return this;
        }

        public Builder setFpLocal(String str) {
            copyOnWrite();
            ((Device) this.instance).setFpLocal(str);
            return this;
        }

        public Builder setFpLocalBytes(ByteString byteString) {
            copyOnWrite();
            ((Device) this.instance).setFpLocalBytes(byteString);
            return this;
        }

        public Builder setFpRemote(String str) {
            copyOnWrite();
            ((Device) this.instance).setFpRemote(str);
            return this;
        }

        public Builder setFpRemoteBytes(ByteString byteString) {
            copyOnWrite();
            ((Device) this.instance).setFpRemoteBytes(byteString);
            return this;
        }

        public Builder setFts(long j14) {
            copyOnWrite();
            ((Device) this.instance).setFts(j14);
            return this;
        }

        public Builder setMobiApp(String str) {
            copyOnWrite();
            ((Device) this.instance).setMobiApp(str);
            return this;
        }

        public Builder setMobiAppBytes(ByteString byteString) {
            copyOnWrite();
            ((Device) this.instance).setMobiAppBytes(byteString);
            return this;
        }

        public Builder setModel(String str) {
            copyOnWrite();
            ((Device) this.instance).setModel(str);
            return this;
        }

        public Builder setModelBytes(ByteString byteString) {
            copyOnWrite();
            ((Device) this.instance).setModelBytes(byteString);
            return this;
        }

        public Builder setOsver(String str) {
            copyOnWrite();
            ((Device) this.instance).setOsver(str);
            return this;
        }

        public Builder setOsverBytes(ByteString byteString) {
            copyOnWrite();
            ((Device) this.instance).setOsverBytes(byteString);
            return this;
        }

        public Builder setPlatform(String str) {
            copyOnWrite();
            ((Device) this.instance).setPlatform(str);
            return this;
        }

        public Builder setPlatformBytes(ByteString byteString) {
            copyOnWrite();
            ((Device) this.instance).setPlatformBytes(byteString);
            return this;
        }

        public Builder setVersionName(String str) {
            copyOnWrite();
            ((Device) this.instance).setVersionName(str);
            return this;
        }

        public Builder setVersionNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Device) this.instance).setVersionNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(Device.DEFAULT_INSTANCE);
        }
    }

    static {
        Device device = new Device();
        DEFAULT_INSTANCE = device;
        GeneratedMessageLite.registerDefaultInstance(Device.class, device);
    }

    public Device() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppId() {
        this.appId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrand() {
        this.brand_ = getDefaultInstance().getBrand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuild() {
        this.build_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuvid() {
        this.buvid_ = getDefaultInstance().getBuvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChannel() {
        this.channel_ = getDefaultInstance().getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevice() {
        this.device_ = getDefaultInstance().getDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFp() {
        this.fp_ = getDefaultInstance().getFp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFpLocal() {
        this.fpLocal_ = getDefaultInstance().getFpLocal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFpRemote() {
        this.fpRemote_ = getDefaultInstance().getFpRemote();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFts() {
        this.fts_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobiApp() {
        this.mobiApp_ = getDefaultInstance().getMobiApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsver() {
        this.osver_ = getDefaultInstance().getOsver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatform() {
        this.platform_ = getDefaultInstance().getPlatform();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionName() {
        this.versionName_ = getDefaultInstance().getVersionName();
    }

    public static Device getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Device) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Device> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppId(int i14) {
        this.appId_ = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrand(String str) {
        str.getClass();
        this.brand_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.brand_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuild(int i14) {
        this.build_ = i14;
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
    public void setChannel(String str) {
        str.getClass();
        this.channel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.channel_ = byteString.toStringUtf8();
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
    public void setFp(String str) {
        str.getClass();
        this.fp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFpBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fp_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFpLocal(String str) {
        str.getClass();
        this.fpLocal_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFpLocalBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fpLocal_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFpRemote(String str) {
        str.getClass();
        this.fpRemote_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFpRemoteBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fpRemote_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFts(long j14) {
        this.fts_ = j14;
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
    public void setModel(String str) {
        str.getClass();
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.model_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsver(String str) {
        str.getClass();
        this.osver_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.osver_ = byteString.toStringUtf8();
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
    public void setVersionName(String str) {
        str.getClass();
        this.versionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.versionName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Device();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0208\u000b\u0208\f\u0208\r\u0208\u000e\u0208\u000f\u0002", new Object[]{"appId_", "build_", "buvid_", "mobiApp_", "platform_", "device_", "channel_", "brand_", "model_", "osver_", "fpLocal_", "fpRemote_", "versionName_", "fp_", "fts_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Device> parser = PARSER;
                if (parser == null) {
                    synchronized (Device.class) {
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

    public int getAppId() {
        return this.appId_;
    }

    public String getBrand() {
        return this.brand_;
    }

    public ByteString getBrandBytes() {
        return ByteString.copyFromUtf8(this.brand_);
    }

    public int getBuild() {
        return this.build_;
    }

    public String getBuvid() {
        return this.buvid_;
    }

    public ByteString getBuvidBytes() {
        return ByteString.copyFromUtf8(this.buvid_);
    }

    public String getChannel() {
        return this.channel_;
    }

    public ByteString getChannelBytes() {
        return ByteString.copyFromUtf8(this.channel_);
    }

    public String getDevice() {
        return this.device_;
    }

    public ByteString getDeviceBytes() {
        return ByteString.copyFromUtf8(this.device_);
    }

    public String getFp() {
        return this.fp_;
    }

    public ByteString getFpBytes() {
        return ByteString.copyFromUtf8(this.fp_);
    }

    public String getFpLocal() {
        return this.fpLocal_;
    }

    public ByteString getFpLocalBytes() {
        return ByteString.copyFromUtf8(this.fpLocal_);
    }

    public String getFpRemote() {
        return this.fpRemote_;
    }

    public ByteString getFpRemoteBytes() {
        return ByteString.copyFromUtf8(this.fpRemote_);
    }

    public long getFts() {
        return this.fts_;
    }

    public String getMobiApp() {
        return this.mobiApp_;
    }

    public ByteString getMobiAppBytes() {
        return ByteString.copyFromUtf8(this.mobiApp_);
    }

    public String getModel() {
        return this.model_;
    }

    public ByteString getModelBytes() {
        return ByteString.copyFromUtf8(this.model_);
    }

    public String getOsver() {
        return this.osver_;
    }

    public ByteString getOsverBytes() {
        return ByteString.copyFromUtf8(this.osver_);
    }

    public String getPlatform() {
        return this.platform_;
    }

    public ByteString getPlatformBytes() {
        return ByteString.copyFromUtf8(this.platform_);
    }

    public String getVersionName() {
        return this.versionName_;
    }

    public ByteString getVersionNameBytes() {
        return ByteString.copyFromUtf8(this.versionName_);
    }

    public static Builder newBuilder(Device device) {
        return DEFAULT_INSTANCE.createBuilder(device);
    }

    public static Device parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Device) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Device parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Device parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Device parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Device parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Device parseFrom(InputStream inputStream) throws IOException {
        return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Device parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Device parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Device parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
