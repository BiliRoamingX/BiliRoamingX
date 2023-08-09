package com.bapis.bilibili.playershared;

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
/* loaded from: classes18.dex */
public final class DeviceConf extends GeneratedMessageLite<DeviceConf, DeviceConf.Builder> implements MessageLiteOrBuilder {
    public static final int CONF_VALUE_FIELD_NUMBER = 1;
    private static final DeviceConf DEFAULT_INSTANCE;
    private static volatile Parser<DeviceConf> PARSER;
    private ConfValue confValue_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.DeviceConf$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81691 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17895xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17895xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17895xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17895xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17895xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17895xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17895xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17895xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DeviceConf, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81691 c81691) {
            this();
        }

        public Builder clearConfValue() {
            copyOnWrite();
            ((DeviceConf) this.instance).clearConfValue();
            return this;
        }

        public ConfValue getConfValue() {
            return ((DeviceConf) this.instance).getConfValue();
        }

        public boolean hasConfValue() {
            return ((DeviceConf) this.instance).hasConfValue();
        }

        public Builder mergeConfValue(ConfValue confValue) {
            copyOnWrite();
            ((DeviceConf) this.instance).mergeConfValue(confValue);
            return this;
        }

        public Builder setConfValue(ConfValue confValue) {
            copyOnWrite();
            ((DeviceConf) this.instance).setConfValue(confValue);
            return this;
        }

        private Builder() {
            super(DeviceConf.DEFAULT_INSTANCE);
        }

        public Builder setConfValue(ConfValue.Builder builder) {
            copyOnWrite();
            ((DeviceConf) this.instance).setConfValue(builder.build());
            return this;
        }
    }

    static {
        DeviceConf deviceConf = new DeviceConf();
        DEFAULT_INSTANCE = deviceConf;
        GeneratedMessageLite.registerDefaultInstance(DeviceConf.class, deviceConf);
    }

    private DeviceConf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfValue() {
        this.confValue_ = null;
    }

    public static DeviceConf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfValue(ConfValue confValue) {
        confValue.getClass();
        ConfValue confValue2 = this.confValue_;
        if (confValue2 != null && confValue2 != ConfValue.getDefaultInstance()) {
            this.confValue_ = ConfValue.newBuilder(this.confValue_).mergeFrom((ConfValue) confValue).buildPartial();
        } else {
            this.confValue_ = confValue;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DeviceConf parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DeviceConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeviceConf parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DeviceConf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfValue(ConfValue confValue) {
        confValue.getClass();
        this.confValue_ = confValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81691.f17895xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DeviceConf();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"confValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DeviceConf> parser = PARSER;
                if (parser == null) {
                    synchronized (DeviceConf.class) {
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

    public ConfValue getConfValue() {
        ConfValue confValue = this.confValue_;
        return confValue == null ? ConfValue.getDefaultInstance() : confValue;
    }

    public boolean hasConfValue() {
        return this.confValue_ != null;
    }

    public static Builder newBuilder(DeviceConf deviceConf) {
        return DEFAULT_INSTANCE.createBuilder(deviceConf);
    }

    public static DeviceConf parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeviceConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DeviceConf parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DeviceConf parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DeviceConf parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DeviceConf parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeviceConf parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DeviceConf parseFrom(InputStream inputStream) throws IOException {
        return (DeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeviceConf parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DeviceConf parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DeviceConf parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
