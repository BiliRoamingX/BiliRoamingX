package com.bapis.bilibili.app.distribution.setting.pegasus;

import com.bapis.bilibili.app.distribution.Int64Value;
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
/* loaded from: classes13.dex */
public final class PegasusDeviceWithoutFplocalConfig extends GeneratedMessageLite<PegasusDeviceWithoutFplocalConfig, PegasusDeviceWithoutFplocalConfig.b> implements e {
    public static final int AUTO_REFRESH_STATE_FIELD_NUMBER = 1;
    private static final PegasusDeviceWithoutFplocalConfig DEFAULT_INSTANCE;
    private static volatile Parser<PegasusDeviceWithoutFplocalConfig> PARSER;
    private Int64Value autoRefreshState_;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    static /* synthetic */ class a {
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
    /* loaded from: classes13.dex */
    public static final class b extends GeneratedMessageLite.Builder<PegasusDeviceWithoutFplocalConfig, b> implements e {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b clearAutoRefreshState() {
            copyOnWrite();
            ((PegasusDeviceWithoutFplocalConfig) this.instance).clearAutoRefreshState();
            return this;
        }

        @Override // com.bapis.bilibili.app.distribution.setting.pegasus.e
        public Int64Value getAutoRefreshState() {
            return ((PegasusDeviceWithoutFplocalConfig) this.instance).getAutoRefreshState();
        }

        @Override // com.bapis.bilibili.app.distribution.setting.pegasus.e
        public boolean hasAutoRefreshState() {
            return ((PegasusDeviceWithoutFplocalConfig) this.instance).hasAutoRefreshState();
        }

        public b mergeAutoRefreshState(Int64Value int64Value) {
            copyOnWrite();
            ((PegasusDeviceWithoutFplocalConfig) this.instance).mergeAutoRefreshState(int64Value);
            return this;
        }

        public b setAutoRefreshState(Int64Value int64Value) {
            copyOnWrite();
            ((PegasusDeviceWithoutFplocalConfig) this.instance).setAutoRefreshState(int64Value);
            return this;
        }

        private b() {
            super(PegasusDeviceWithoutFplocalConfig.DEFAULT_INSTANCE);
        }

        public b setAutoRefreshState(Int64Value.C8322b bVar) {
            copyOnWrite();
            ((PegasusDeviceWithoutFplocalConfig) this.instance).setAutoRefreshState(bVar.build());
            return this;
        }
    }

    static {
        PegasusDeviceWithoutFplocalConfig pegasusDeviceWithoutFplocalConfig = new PegasusDeviceWithoutFplocalConfig();
        DEFAULT_INSTANCE = pegasusDeviceWithoutFplocalConfig;
        GeneratedMessageLite.registerDefaultInstance(PegasusDeviceWithoutFplocalConfig.class, pegasusDeviceWithoutFplocalConfig);
    }

    private PegasusDeviceWithoutFplocalConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoRefreshState() {
        this.autoRefreshState_ = null;
    }

    public static PegasusDeviceWithoutFplocalConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAutoRefreshState(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.autoRefreshState_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.autoRefreshState_ = Int64Value.newBuilder(this.autoRefreshState_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.autoRefreshState_ = int64Value;
        }
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PegasusDeviceWithoutFplocalConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PegasusDeviceWithoutFplocalConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PegasusDeviceWithoutFplocalConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PegasusDeviceWithoutFplocalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PegasusDeviceWithoutFplocalConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoRefreshState(Int64Value int64Value) {
        int64Value.getClass();
        this.autoRefreshState_ = int64Value;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new PegasusDeviceWithoutFplocalConfig();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"autoRefreshState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PegasusDeviceWithoutFplocalConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (PegasusDeviceWithoutFplocalConfig.class) {
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

    @Override // com.bapis.bilibili.app.distribution.setting.pegasus.e
    public Int64Value getAutoRefreshState() {
        Int64Value int64Value = this.autoRefreshState_;
        if (int64Value == null) {
            return Int64Value.getDefaultInstance();
        }
        return int64Value;
    }

    @Override // com.bapis.bilibili.app.distribution.setting.pegasus.e
    public boolean hasAutoRefreshState() {
        if (this.autoRefreshState_ != null) {
            return true;
        }
        return false;
    }

    public static b newBuilder(PegasusDeviceWithoutFplocalConfig pegasusDeviceWithoutFplocalConfig) {
        return DEFAULT_INSTANCE.createBuilder(pegasusDeviceWithoutFplocalConfig);
    }

    public static PegasusDeviceWithoutFplocalConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PegasusDeviceWithoutFplocalConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PegasusDeviceWithoutFplocalConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PegasusDeviceWithoutFplocalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PegasusDeviceWithoutFplocalConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PegasusDeviceWithoutFplocalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PegasusDeviceWithoutFplocalConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PegasusDeviceWithoutFplocalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PegasusDeviceWithoutFplocalConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PegasusDeviceWithoutFplocalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PegasusDeviceWithoutFplocalConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PegasusDeviceWithoutFplocalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PegasusDeviceWithoutFplocalConfig parseFrom(InputStream inputStream) throws IOException {
        return (PegasusDeviceWithoutFplocalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PegasusDeviceWithoutFplocalConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PegasusDeviceWithoutFplocalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PegasusDeviceWithoutFplocalConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PegasusDeviceWithoutFplocalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PegasusDeviceWithoutFplocalConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PegasusDeviceWithoutFplocalConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
