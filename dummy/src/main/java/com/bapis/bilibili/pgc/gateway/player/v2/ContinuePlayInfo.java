package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class ContinuePlayInfo extends GeneratedMessageLite<ContinuePlayInfo, ContinuePlayInfo.Builder> implements MessageLiteOrBuilder {
    public static final int CONTINUE_PLAY_EP_ID_FIELD_NUMBER = 1;
    private static final ContinuePlayInfo DEFAULT_INSTANCE;
    private static volatile Parser<ContinuePlayInfo> PARSER;
    private long continuePlayEpId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.ContinuePlayInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78261 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17551xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17551xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17551xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17551xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17551xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17551xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17551xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17551xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ContinuePlayInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78261 c78261) {
            this();
        }

        public Builder clearContinuePlayEpId() {
            copyOnWrite();
            ((ContinuePlayInfo) this.instance).clearContinuePlayEpId();
            return this;
        }

        public long getContinuePlayEpId() {
            return ((ContinuePlayInfo) this.instance).getContinuePlayEpId();
        }

        public Builder setContinuePlayEpId(long j) {
            copyOnWrite();
            ((ContinuePlayInfo) this.instance).setContinuePlayEpId(j);
            return this;
        }

        private Builder() {
            super(ContinuePlayInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        ContinuePlayInfo continuePlayInfo = new ContinuePlayInfo();
        DEFAULT_INSTANCE = continuePlayInfo;
        GeneratedMessageLite.registerDefaultInstance(ContinuePlayInfo.class, continuePlayInfo);
    }

    private ContinuePlayInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContinuePlayEpId() {
        this.continuePlayEpId_ = 0L;
    }

    public static ContinuePlayInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ContinuePlayInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContinuePlayInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContinuePlayInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContinuePlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ContinuePlayInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContinuePlayEpId(long j) {
        this.continuePlayEpId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78261.f17551xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ContinuePlayInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"continuePlayEpId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ContinuePlayInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (ContinuePlayInfo.class) {
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

    public long getContinuePlayEpId() {
        return this.continuePlayEpId_;
    }

    public static Builder newBuilder(ContinuePlayInfo continuePlayInfo) {
        return DEFAULT_INSTANCE.createBuilder(continuePlayInfo);
    }

    public static ContinuePlayInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContinuePlayInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContinuePlayInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContinuePlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ContinuePlayInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContinuePlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ContinuePlayInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContinuePlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContinuePlayInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContinuePlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContinuePlayInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContinuePlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ContinuePlayInfo parseFrom(InputStream inputStream) throws IOException {
        return (ContinuePlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContinuePlayInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContinuePlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContinuePlayInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContinuePlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContinuePlayInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContinuePlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
