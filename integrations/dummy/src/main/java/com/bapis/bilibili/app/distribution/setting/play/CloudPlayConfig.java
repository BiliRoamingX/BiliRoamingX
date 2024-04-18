package com.bapis.bilibili.app.distribution.setting.play;

import com.bapis.bilibili.app.distribution.BoolValue;
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
public final class CloudPlayConfig extends GeneratedMessageLite<CloudPlayConfig, CloudPlayConfig.C8385b> implements MessageLiteOrBuilder {
    private static final CloudPlayConfig DEFAULT_INSTANCE;
    public static final int ENABLEBACKGROUND_FIELD_NUMBER = 4;
    public static final int ENABLEDOLBY_FIELD_NUMBER = 2;
    public static final int ENABLELOSSLESS_FIELD_NUMBER = 5;
    public static final int ENABLEPANORAMA_FIELD_NUMBER = 1;
    public static final int ENABLESHAKE_FIELD_NUMBER = 3;
    private static volatile Parser<CloudPlayConfig> PARSER;
    private BoolValue enableBackground_;
    private BoolValue enableDolby_;
    private BoolValue enableLossLess_;
    private BoolValue enablePanorama_;
    private BoolValue enableShake_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.play.CloudPlayConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8384a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19946xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19946xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19946xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19946xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19946xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19946xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19946xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19946xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.play.CloudPlayConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8385b extends GeneratedMessageLite.Builder<CloudPlayConfig, C8385b> implements MessageLiteOrBuilder {
        /* synthetic */ C8385b(C8384a c8384a) {
            this();
        }

        public C8385b clearEnableBackground() {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).clearEnableBackground();
            return this;
        }

        public C8385b clearEnableDolby() {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).clearEnableDolby();
            return this;
        }

        public C8385b clearEnableLossLess() {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).clearEnableLossLess();
            return this;
        }

        public C8385b clearEnablePanorama() {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).clearEnablePanorama();
            return this;
        }

        public C8385b clearEnableShake() {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).clearEnableShake();
            return this;
        }

        public BoolValue getEnableBackground() {
            return ((CloudPlayConfig) this.instance).getEnableBackground();
        }

        public BoolValue getEnableDolby() {
            return ((CloudPlayConfig) this.instance).getEnableDolby();
        }

        public BoolValue getEnableLossLess() {
            return ((CloudPlayConfig) this.instance).getEnableLossLess();
        }

        public BoolValue getEnablePanorama() {
            return ((CloudPlayConfig) this.instance).getEnablePanorama();
        }

        public BoolValue getEnableShake() {
            return ((CloudPlayConfig) this.instance).getEnableShake();
        }

        public boolean hasEnableBackground() {
            return ((CloudPlayConfig) this.instance).hasEnableBackground();
        }

        public boolean hasEnableDolby() {
            return ((CloudPlayConfig) this.instance).hasEnableDolby();
        }

        public boolean hasEnableLossLess() {
            return ((CloudPlayConfig) this.instance).hasEnableLossLess();
        }

        public boolean hasEnablePanorama() {
            return ((CloudPlayConfig) this.instance).hasEnablePanorama();
        }

        public boolean hasEnableShake() {
            return ((CloudPlayConfig) this.instance).hasEnableShake();
        }

        public C8385b mergeEnableBackground(BoolValue boolValue) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).mergeEnableBackground(boolValue);
            return this;
        }

        public C8385b mergeEnableDolby(BoolValue boolValue) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).mergeEnableDolby(boolValue);
            return this;
        }

        public C8385b mergeEnableLossLess(BoolValue boolValue) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).mergeEnableLossLess(boolValue);
            return this;
        }

        public C8385b mergeEnablePanorama(BoolValue boolValue) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).mergeEnablePanorama(boolValue);
            return this;
        }

        public C8385b mergeEnableShake(BoolValue boolValue) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).mergeEnableShake(boolValue);
            return this;
        }

        public C8385b setEnableBackground(BoolValue boolValue) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).setEnableBackground(boolValue);
            return this;
        }

        public C8385b setEnableDolby(BoolValue boolValue) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).setEnableDolby(boolValue);
            return this;
        }

        public C8385b setEnableLossLess(BoolValue boolValue) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).setEnableLossLess(boolValue);
            return this;
        }

        public C8385b setEnablePanorama(BoolValue boolValue) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).setEnablePanorama(boolValue);
            return this;
        }

        public C8385b setEnableShake(BoolValue boolValue) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).setEnableShake(boolValue);
            return this;
        }

        private C8385b() {
            super(CloudPlayConfig.DEFAULT_INSTANCE);
        }

        public C8385b setEnableBackground(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).setEnableBackground(c8307b.build());
            return this;
        }

        public C8385b setEnableDolby(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).setEnableDolby(c8307b.build());
            return this;
        }

        public C8385b setEnableLossLess(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).setEnableLossLess(c8307b.build());
            return this;
        }

        public C8385b setEnablePanorama(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).setEnablePanorama(c8307b.build());
            return this;
        }

        public C8385b setEnableShake(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((CloudPlayConfig) this.instance).setEnableShake(c8307b.build());
            return this;
        }
    }

    static {
        CloudPlayConfig cloudPlayConfig = new CloudPlayConfig();
        DEFAULT_INSTANCE = cloudPlayConfig;
        GeneratedMessageLite.registerDefaultInstance(CloudPlayConfig.class, cloudPlayConfig);
    }

    private CloudPlayConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableBackground() {
        this.enableBackground_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableDolby() {
        this.enableDolby_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableLossLess() {
        this.enableLossLess_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnablePanorama() {
        this.enablePanorama_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableShake() {
        this.enableShake_ = null;
    }

    public static CloudPlayConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnableBackground(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableBackground_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableBackground_ = BoolValue.newBuilder(this.enableBackground_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableBackground_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnableDolby(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableDolby_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableDolby_ = BoolValue.newBuilder(this.enableDolby_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableDolby_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnableLossLess(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableLossLess_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableLossLess_ = BoolValue.newBuilder(this.enableLossLess_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableLossLess_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnablePanorama(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enablePanorama_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enablePanorama_ = BoolValue.newBuilder(this.enablePanorama_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enablePanorama_ = boolValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnableShake(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableShake_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableShake_ = BoolValue.newBuilder(this.enableShake_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableShake_ = boolValue;
        }
    }

    public static C8385b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CloudPlayConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CloudPlayConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CloudPlayConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CloudPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CloudPlayConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableBackground(BoolValue boolValue) {
        boolValue.getClass();
        this.enableBackground_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableDolby(BoolValue boolValue) {
        boolValue.getClass();
        this.enableDolby_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableLossLess(BoolValue boolValue) {
        boolValue.getClass();
        this.enableLossLess_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnablePanorama(BoolValue boolValue) {
        boolValue.getClass();
        this.enablePanorama_ = boolValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableShake(BoolValue boolValue) {
        boolValue.getClass();
        this.enableShake_ = boolValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8384a.f19946xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CloudPlayConfig();
            case 2:
                return new C8385b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t", new Object[]{"enablePanorama_", "enableDolby_", "enableShake_", "enableBackground_", "enableLossLess_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CloudPlayConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (CloudPlayConfig.class) {
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

    public BoolValue getEnableBackground() {
        BoolValue boolValue = this.enableBackground_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getEnableDolby() {
        BoolValue boolValue = this.enableDolby_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getEnableLossLess() {
        BoolValue boolValue = this.enableLossLess_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getEnablePanorama() {
        BoolValue boolValue = this.enablePanorama_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public BoolValue getEnableShake() {
        BoolValue boolValue = this.enableShake_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public boolean hasEnableBackground() {
        return this.enableBackground_ != null;
    }

    public boolean hasEnableDolby() {
        return this.enableDolby_ != null;
    }

    public boolean hasEnableLossLess() {
        return this.enableLossLess_ != null;
    }

    public boolean hasEnablePanorama() {
        return this.enablePanorama_ != null;
    }

    public boolean hasEnableShake() {
        return this.enableShake_ != null;
    }

    public static C8385b newBuilder(CloudPlayConfig cloudPlayConfig) {
        return DEFAULT_INSTANCE.createBuilder(cloudPlayConfig);
    }

    public static CloudPlayConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CloudPlayConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CloudPlayConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CloudPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CloudPlayConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CloudPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CloudPlayConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CloudPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CloudPlayConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CloudPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CloudPlayConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CloudPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CloudPlayConfig parseFrom(InputStream inputStream) throws IOException {
        return (CloudPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CloudPlayConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CloudPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CloudPlayConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CloudPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CloudPlayConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CloudPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
