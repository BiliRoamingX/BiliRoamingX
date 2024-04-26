package com.bapis.bilibili.app.distribution.setting.play;

import com.bapis.bilibili.app.distribution.BoolValue;
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
public final class MidPlayConfig extends GeneratedMessageLite<MidPlayConfig, MidPlayConfig.b> implements com.bapis.bilibili.app.distribution.setting.play.b {
    private static final MidPlayConfig DEFAULT_INSTANCE;
    public static final int DYNAMIC_TO_PLAYLIST_FIELD_NUMBER = 1;
    private static volatile Parser<MidPlayConfig> PARSER;
    private BoolValue dynamicToPlaylist_;

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
    public static final class b extends GeneratedMessageLite.Builder<MidPlayConfig, b> implements com.bapis.bilibili.app.distribution.setting.play.b {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b clearDynamicToPlaylist() {
            copyOnWrite();
            ((MidPlayConfig) this.instance).clearDynamicToPlaylist();
            return this;
        }

        @Override // com.bapis.bilibili.app.distribution.setting.play.b
        public BoolValue getDynamicToPlaylist() {
            return ((MidPlayConfig) this.instance).getDynamicToPlaylist();
        }

        @Override // com.bapis.bilibili.app.distribution.setting.play.b
        public boolean hasDynamicToPlaylist() {
            return ((MidPlayConfig) this.instance).hasDynamicToPlaylist();
        }

        public b mergeDynamicToPlaylist(BoolValue boolValue) {
            copyOnWrite();
            ((MidPlayConfig) this.instance).mergeDynamicToPlaylist(boolValue);
            return this;
        }

        public b setDynamicToPlaylist(BoolValue boolValue) {
            copyOnWrite();
            ((MidPlayConfig) this.instance).setDynamicToPlaylist(boolValue);
            return this;
        }

        private b() {
            super(MidPlayConfig.DEFAULT_INSTANCE);
        }

        public b setDynamicToPlaylist(BoolValue.C8307b bVar) {
            copyOnWrite();
            ((MidPlayConfig) this.instance).setDynamicToPlaylist(bVar.build());
            return this;
        }
    }

    static {
        MidPlayConfig midPlayConfig = new MidPlayConfig();
        DEFAULT_INSTANCE = midPlayConfig;
        GeneratedMessageLite.registerDefaultInstance(MidPlayConfig.class, midPlayConfig);
    }

    private MidPlayConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDynamicToPlaylist() {
        this.dynamicToPlaylist_ = null;
    }

    public static MidPlayConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDynamicToPlaylist(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.dynamicToPlaylist_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.dynamicToPlaylist_ = BoolValue.newBuilder(this.dynamicToPlaylist_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.dynamicToPlaylist_ = boolValue;
        }
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MidPlayConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MidPlayConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MidPlayConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MidPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MidPlayConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDynamicToPlaylist(BoolValue boolValue) {
        boolValue.getClass();
        this.dynamicToPlaylist_ = boolValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new MidPlayConfig();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"dynamicToPlaylist_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MidPlayConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (MidPlayConfig.class) {
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

    @Override // com.bapis.bilibili.app.distribution.setting.play.b
    public BoolValue getDynamicToPlaylist() {
        BoolValue boolValue = this.dynamicToPlaylist_;
        if (boolValue == null) {
            return BoolValue.getDefaultInstance();
        }
        return boolValue;
    }

    @Override // com.bapis.bilibili.app.distribution.setting.play.b
    public boolean hasDynamicToPlaylist() {
        if (this.dynamicToPlaylist_ != null) {
            return true;
        }
        return false;
    }

    public static b newBuilder(MidPlayConfig midPlayConfig) {
        return DEFAULT_INSTANCE.createBuilder(midPlayConfig);
    }

    public static MidPlayConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MidPlayConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MidPlayConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MidPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MidPlayConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MidPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MidPlayConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MidPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MidPlayConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MidPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MidPlayConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MidPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MidPlayConfig parseFrom(InputStream inputStream) throws IOException {
        return (MidPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MidPlayConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MidPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MidPlayConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MidPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MidPlayConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MidPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
