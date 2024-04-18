package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class BizReserveGameParam extends GeneratedMessageLite<BizReserveGameParam, BizReserveGameParam.C12280b> implements MessageLiteOrBuilder {
    private static final BizReserveGameParam DEFAULT_INSTANCE;
    public static final int GAME_ID_FIELD_NUMBER = 1;
    private static volatile Parser<BizReserveGameParam> PARSER;
    private long gameId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.BizReserveGameParam$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12279a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21259xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21259xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21259xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21259xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21259xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21259xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21259xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21259xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.BizReserveGameParam$b */
    /* loaded from: classes20.dex */
    public static final class C12280b extends GeneratedMessageLite.Builder<BizReserveGameParam, C12280b> implements MessageLiteOrBuilder {
        /* synthetic */ C12280b(C12279a c12279a) {
            this();
        }

        public C12280b clearGameId() {
            copyOnWrite();
            ((BizReserveGameParam) this.instance).clearGameId();
            return this;
        }

        public long getGameId() {
            return ((BizReserveGameParam) this.instance).getGameId();
        }

        public C12280b setGameId(long j) {
            copyOnWrite();
            ((BizReserveGameParam) this.instance).setGameId(j);
            return this;
        }

        private C12280b() {
            super(BizReserveGameParam.DEFAULT_INSTANCE);
        }
    }

    static {
        BizReserveGameParam bizReserveGameParam = new BizReserveGameParam();
        DEFAULT_INSTANCE = bizReserveGameParam;
        GeneratedMessageLite.registerDefaultInstance(BizReserveGameParam.class, bizReserveGameParam);
    }

    private BizReserveGameParam() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.gameId_ = 0L;
    }

    public static BizReserveGameParam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12280b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BizReserveGameParam parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BizReserveGameParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizReserveGameParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BizReserveGameParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BizReserveGameParam> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(long j) {
        this.gameId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12279a.f21259xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BizReserveGameParam();
            case 2:
                return new C12280b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"gameId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BizReserveGameParam> parser = PARSER;
                if (parser == null) {
                    synchronized (BizReserveGameParam.class) {
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

    public long getGameId() {
        return this.gameId_;
    }

    public static C12280b newBuilder(BizReserveGameParam bizReserveGameParam) {
        return DEFAULT_INSTANCE.createBuilder(bizReserveGameParam);
    }

    public static BizReserveGameParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizReserveGameParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizReserveGameParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizReserveGameParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BizReserveGameParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BizReserveGameParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BizReserveGameParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizReserveGameParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BizReserveGameParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BizReserveGameParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BizReserveGameParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizReserveGameParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BizReserveGameParam parseFrom(InputStream inputStream) throws IOException {
        return (BizReserveGameParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizReserveGameParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizReserveGameParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizReserveGameParam parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BizReserveGameParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BizReserveGameParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizReserveGameParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
