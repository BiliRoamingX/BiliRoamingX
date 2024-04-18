package com.bapis.bilibili.app.view.v1;

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
public final class PremiereArchiveReq extends GeneratedMessageLite<PremiereArchiveReq, PremiereArchiveReq.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    private static final PremiereArchiveReq DEFAULT_INSTANCE;
    private static volatile Parser<PremiereArchiveReq> PARSER;
    private long aid_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PremiereArchiveReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68251 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16787xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16787xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16787xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16787xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16787xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16787xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16787xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16787xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PremiereArchiveReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68251 c68251) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((PremiereArchiveReq) this.instance).clearAid();
            return this;
        }

        public long getAid() {
            return ((PremiereArchiveReq) this.instance).getAid();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((PremiereArchiveReq) this.instance).setAid(j);
            return this;
        }

        private Builder() {
            super(PremiereArchiveReq.DEFAULT_INSTANCE);
        }
    }

    static {
        PremiereArchiveReq premiereArchiveReq = new PremiereArchiveReq();
        DEFAULT_INSTANCE = premiereArchiveReq;
        GeneratedMessageLite.registerDefaultInstance(PremiereArchiveReq.class, premiereArchiveReq);
    }

    private PremiereArchiveReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    public static PremiereArchiveReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PremiereArchiveReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PremiereArchiveReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiereArchiveReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PremiereArchiveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PremiereArchiveReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68251.f16787xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PremiereArchiveReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"aid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PremiereArchiveReq> parser = PARSER;
                if (parser == null) {
                    synchronized (PremiereArchiveReq.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public long getAid() {
        return this.aid_;
    }

    public static Builder newBuilder(PremiereArchiveReq premiereArchiveReq) {
        return DEFAULT_INSTANCE.createBuilder(premiereArchiveReq);
    }

    public static PremiereArchiveReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereArchiveReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PremiereArchiveReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereArchiveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PremiereArchiveReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PremiereArchiveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PremiereArchiveReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereArchiveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PremiereArchiveReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PremiereArchiveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PremiereArchiveReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereArchiveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PremiereArchiveReq parseFrom(InputStream inputStream) throws IOException {
        return (PremiereArchiveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiereArchiveReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereArchiveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PremiereArchiveReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PremiereArchiveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PremiereArchiveReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereArchiveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
