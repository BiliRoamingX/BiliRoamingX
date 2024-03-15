package com.bapis.bilibili.metadata;

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
public final class Metadata extends GeneratedMessageLite<Metadata, Metadata.Builder> implements MessageLiteOrBuilder {
    public static final int ACCESS_KEY_FIELD_NUMBER = 1;
    public static final int BUILD_FIELD_NUMBER = 4;
    public static final int BUVID_FIELD_NUMBER = 6;
    public static final int CHANNEL_FIELD_NUMBER = 5;
    private static final Metadata DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 3;
    public static final int MOBI_APP_FIELD_NUMBER = 2;
    private static volatile Parser<Metadata> PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 7;
    private int build_;
    private String accessKey_ = "";
    private String mobiApp_ = "";
    private String device_ = "";
    private String channel_ = "";
    private String buvid_ = "";
    private String platform_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.metadata.Metadata$1  reason: invalid class name */
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
    public static final class Builder extends GeneratedMessageLite.Builder<Metadata, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearAccessKey() {
            copyOnWrite();
            ((Metadata) this.instance).clearAccessKey();
            return this;
        }

        public Builder clearBuild() {
            copyOnWrite();
            ((Metadata) this.instance).clearBuild();
            return this;
        }

        public Builder clearBuvid() {
            copyOnWrite();
            ((Metadata) this.instance).clearBuvid();
            return this;
        }

        public Builder clearChannel() {
            copyOnWrite();
            ((Metadata) this.instance).clearChannel();
            return this;
        }

        public Builder clearDevice() {
            copyOnWrite();
            ((Metadata) this.instance).clearDevice();
            return this;
        }

        public Builder clearMobiApp() {
            copyOnWrite();
            ((Metadata) this.instance).clearMobiApp();
            return this;
        }

        public Builder clearPlatform() {
            copyOnWrite();
            ((Metadata) this.instance).clearPlatform();
            return this;
        }

        public String getAccessKey() {
            return ((Metadata) this.instance).getAccessKey();
        }

        public ByteString getAccessKeyBytes() {
            return ((Metadata) this.instance).getAccessKeyBytes();
        }

        public int getBuild() {
            return ((Metadata) this.instance).getBuild();
        }

        public String getBuvid() {
            return ((Metadata) this.instance).getBuvid();
        }

        public ByteString getBuvidBytes() {
            return ((Metadata) this.instance).getBuvidBytes();
        }

        public String getChannel() {
            return ((Metadata) this.instance).getChannel();
        }

        public ByteString getChannelBytes() {
            return ((Metadata) this.instance).getChannelBytes();
        }

        public String getDevice() {
            return ((Metadata) this.instance).getDevice();
        }

        public ByteString getDeviceBytes() {
            return ((Metadata) this.instance).getDeviceBytes();
        }

        public String getMobiApp() {
            return ((Metadata) this.instance).getMobiApp();
        }

        public ByteString getMobiAppBytes() {
            return ((Metadata) this.instance).getMobiAppBytes();
        }

        public String getPlatform() {
            return ((Metadata) this.instance).getPlatform();
        }

        public ByteString getPlatformBytes() {
            return ((Metadata) this.instance).getPlatformBytes();
        }

        public Builder setAccessKey(String str) {
            copyOnWrite();
            ((Metadata) this.instance).setAccessKey(str);
            return this;
        }

        public Builder setAccessKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((Metadata) this.instance).setAccessKeyBytes(byteString);
            return this;
        }

        public Builder setBuild(int i14) {
            copyOnWrite();
            ((Metadata) this.instance).setBuild(i14);
            return this;
        }

        public Builder setBuvid(String str) {
            copyOnWrite();
            ((Metadata) this.instance).setBuvid(str);
            return this;
        }

        public Builder setBuvidBytes(ByteString byteString) {
            copyOnWrite();
            ((Metadata) this.instance).setBuvidBytes(byteString);
            return this;
        }

        public Builder setChannel(String str) {
            copyOnWrite();
            ((Metadata) this.instance).setChannel(str);
            return this;
        }

        public Builder setChannelBytes(ByteString byteString) {
            copyOnWrite();
            ((Metadata) this.instance).setChannelBytes(byteString);
            return this;
        }

        public Builder setDevice(String str) {
            copyOnWrite();
            ((Metadata) this.instance).setDevice(str);
            return this;
        }

        public Builder setDeviceBytes(ByteString byteString) {
            copyOnWrite();
            ((Metadata) this.instance).setDeviceBytes(byteString);
            return this;
        }

        public Builder setMobiApp(String str) {
            copyOnWrite();
            ((Metadata) this.instance).setMobiApp(str);
            return this;
        }

        public Builder setMobiAppBytes(ByteString byteString) {
            copyOnWrite();
            ((Metadata) this.instance).setMobiAppBytes(byteString);
            return this;
        }

        public Builder setPlatform(String str) {
            copyOnWrite();
            ((Metadata) this.instance).setPlatform(str);
            return this;
        }

        public Builder setPlatformBytes(ByteString byteString) {
            copyOnWrite();
            ((Metadata) this.instance).setPlatformBytes(byteString);
            return this;
        }

        private Builder() {
            super(Metadata.DEFAULT_INSTANCE);
        }
    }

    static {
        Metadata metadata = new Metadata();
        DEFAULT_INSTANCE = metadata;
        GeneratedMessageLite.registerDefaultInstance(Metadata.class, metadata);
    }

    public Metadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessKey() {
        this.accessKey_ = getDefaultInstance().getAccessKey();
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
    public void clearMobiApp() {
        this.mobiApp_ = getDefaultInstance().getMobiApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatform() {
        this.platform_ = getDefaultInstance().getPlatform();
    }

    public static Metadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Metadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Metadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Metadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessKey(String str) {
        str.getClass();
        this.accessKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.accessKey_ = byteString.toStringUtf8();
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Metadata();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u0208\u0006\u0208\u0007\u0208", new Object[]{"accessKey_", "mobiApp_", "device_", "build_", "channel_", "buvid_", "platform_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Metadata> parser = PARSER;
                if (parser == null) {
                    synchronized (Metadata.class) {
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

    public String getAccessKey() {
        return this.accessKey_;
    }

    public ByteString getAccessKeyBytes() {
        return ByteString.copyFromUtf8(this.accessKey_);
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

    public static Builder newBuilder(Metadata metadata) {
        return DEFAULT_INSTANCE.createBuilder(metadata);
    }

    public static Metadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Metadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Metadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Metadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Metadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Metadata parseFrom(InputStream inputStream) throws IOException {
        return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Metadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
