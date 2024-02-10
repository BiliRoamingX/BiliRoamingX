package com.bapis.bilibili.main.community.reply.v2;

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
/* loaded from: classes21.dex */
public final class PlayerParams extends GeneratedMessageLite<PlayerParams, PlayerParams.C10693b> implements MessageLiteOrBuilder {
    private static final PlayerParams DEFAULT_INSTANCE;
    public static final int DISABLE_FILTER_TAG_FIELD_NUMBER = 2;
    public static final int IS_STORY_FIELD_NUMBER = 1;
    private static volatile Parser<PlayerParams> PARSER;
    private boolean disableFilterTag_;
    private boolean isStory_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v2.PlayerParams$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C10692a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19164xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19164xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19164xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19164xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19164xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19164xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19164xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19164xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v2.PlayerParams$b */
    /* loaded from: classes21.dex */
    public static final class C10693b extends GeneratedMessageLite.Builder<PlayerParams, C10693b> implements MessageLiteOrBuilder {
        /* synthetic */ C10693b(C10692a c10692a) {
            this();
        }

        public C10693b clearDisableFilterTag() {
            copyOnWrite();
            ((PlayerParams) this.instance).clearDisableFilterTag();
            return this;
        }

        public C10693b clearIsStory() {
            copyOnWrite();
            ((PlayerParams) this.instance).clearIsStory();
            return this;
        }

        public boolean getDisableFilterTag() {
            return ((PlayerParams) this.instance).getDisableFilterTag();
        }

        public boolean getIsStory() {
            return ((PlayerParams) this.instance).getIsStory();
        }

        public C10693b setDisableFilterTag(boolean z) {
            copyOnWrite();
            ((PlayerParams) this.instance).setDisableFilterTag(z);
            return this;
        }

        public C10693b setIsStory(boolean z) {
            copyOnWrite();
            ((PlayerParams) this.instance).setIsStory(z);
            return this;
        }

        private C10693b() {
            super(PlayerParams.DEFAULT_INSTANCE);
        }
    }

    static {
        PlayerParams playerParams = new PlayerParams();
        DEFAULT_INSTANCE = playerParams;
        GeneratedMessageLite.registerDefaultInstance(PlayerParams.class, playerParams);
    }

    private PlayerParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableFilterTag() {
        this.disableFilterTag_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsStory() {
        this.isStory_ = false;
    }

    public static PlayerParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10693b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayerParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayerParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayerParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayerParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableFilterTag(boolean z) {
        this.disableFilterTag_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsStory(boolean z) {
        this.isStory_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C10692a c10692a = null;
        switch (C10692a.f19164xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayerParams();
            case 2:
                return new C10693b(c10692a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"isStory_", "disableFilterTag_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayerParams> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayerParams.class) {
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

    public boolean getDisableFilterTag() {
        return this.disableFilterTag_;
    }

    public boolean getIsStory() {
        return this.isStory_;
    }

    public static C10693b newBuilder(PlayerParams playerParams) {
        return DEFAULT_INSTANCE.createBuilder(playerParams);
    }

    public static PlayerParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayerParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayerParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayerParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayerParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayerParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayerParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayerParams parseFrom(InputStream inputStream) throws IOException {
        return (PlayerParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayerParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayerParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
