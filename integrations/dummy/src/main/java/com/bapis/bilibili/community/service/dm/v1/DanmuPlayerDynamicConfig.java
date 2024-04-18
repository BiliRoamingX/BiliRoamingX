package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes14.dex */
public final class DanmuPlayerDynamicConfig extends GeneratedMessageLite<DanmuPlayerDynamicConfig, DanmuPlayerDynamicConfig.Builder> implements DanmuPlayerDynamicConfigOrBuilder {
    private static final DanmuPlayerDynamicConfig DEFAULT_INSTANCE;
    private static volatile Parser<DanmuPlayerDynamicConfig> PARSER = null;
    public static final int PLAYER_DANMAKU_DOMAIN_FIELD_NUMBER = 14;
    public static final int PROGRESS_FIELD_NUMBER = 1;
    private float playerDanmakuDomain_;
    private int progress_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DanmuPlayerDynamicConfig$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72071 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17050xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17050xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17050xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17050xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17050xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17050xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17050xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17050xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DanmuPlayerDynamicConfig, Builder> implements DanmuPlayerDynamicConfigOrBuilder {
        /* synthetic */ Builder(C72071 c72071) {
            this();
        }

        public Builder clearPlayerDanmakuDomain() {
            copyOnWrite();
            ((DanmuPlayerDynamicConfig) this.instance).clearPlayerDanmakuDomain();
            return this;
        }

        public Builder clearProgress() {
            copyOnWrite();
            ((DanmuPlayerDynamicConfig) this.instance).clearProgress();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.DanmuPlayerDynamicConfigOrBuilder
        public float getPlayerDanmakuDomain() {
            return ((DanmuPlayerDynamicConfig) this.instance).getPlayerDanmakuDomain();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.DanmuPlayerDynamicConfigOrBuilder
        public int getProgress() {
            return ((DanmuPlayerDynamicConfig) this.instance).getProgress();
        }

        public Builder setPlayerDanmakuDomain(float f) {
            copyOnWrite();
            ((DanmuPlayerDynamicConfig) this.instance).setPlayerDanmakuDomain(f);
            return this;
        }

        public Builder setProgress(int i) {
            copyOnWrite();
            ((DanmuPlayerDynamicConfig) this.instance).setProgress(i);
            return this;
        }

        private Builder() {
            super(DanmuPlayerDynamicConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        DanmuPlayerDynamicConfig danmuPlayerDynamicConfig = new DanmuPlayerDynamicConfig();
        DEFAULT_INSTANCE = danmuPlayerDynamicConfig;
        GeneratedMessageLite.registerDefaultInstance(DanmuPlayerDynamicConfig.class, danmuPlayerDynamicConfig);
    }

    private DanmuPlayerDynamicConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuDomain() {
        this.playerDanmakuDomain_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProgress() {
        this.progress_ = 0;
    }

    public static DanmuPlayerDynamicConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DanmuPlayerDynamicConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DanmuPlayerDynamicConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmuPlayerDynamicConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DanmuPlayerDynamicConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DanmuPlayerDynamicConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuDomain(float f) {
        this.playerDanmakuDomain_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgress(int i) {
        this.progress_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72071.f17050xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DanmuPlayerDynamicConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u000e\u0002\u0000\u0000\u0000\u0001\u0004\u000e\u0001", new Object[]{"progress_", "playerDanmakuDomain_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DanmuPlayerDynamicConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (DanmuPlayerDynamicConfig.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.DanmuPlayerDynamicConfigOrBuilder
    public float getPlayerDanmakuDomain() {
        return this.playerDanmakuDomain_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.DanmuPlayerDynamicConfigOrBuilder
    public int getProgress() {
        return this.progress_;
    }

    public static Builder newBuilder(DanmuPlayerDynamicConfig danmuPlayerDynamicConfig) {
        return DEFAULT_INSTANCE.createBuilder(danmuPlayerDynamicConfig);
    }

    public static DanmuPlayerDynamicConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuPlayerDynamicConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmuPlayerDynamicConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuPlayerDynamicConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DanmuPlayerDynamicConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DanmuPlayerDynamicConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DanmuPlayerDynamicConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuPlayerDynamicConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DanmuPlayerDynamicConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DanmuPlayerDynamicConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DanmuPlayerDynamicConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuPlayerDynamicConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DanmuPlayerDynamicConfig parseFrom(InputStream inputStream) throws IOException {
        return (DanmuPlayerDynamicConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmuPlayerDynamicConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuPlayerDynamicConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmuPlayerDynamicConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DanmuPlayerDynamicConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DanmuPlayerDynamicConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuPlayerDynamicConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
