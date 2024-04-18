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
public final class ReserveReply extends GeneratedMessageLite<ReserveReply, ReserveReply.Builder> implements MessageLiteOrBuilder {
    private static final ReserveReply DEFAULT_INSTANCE;
    private static volatile Parser<ReserveReply> PARSER = null;
    public static final int RESERVE_ID_FIELD_NUMBER = 1;
    private long reserveId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ReserveReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68471 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16807xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16807xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16807xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16807xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16807xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16807xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16807xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16807xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ReserveReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68471 c68471) {
            this();
        }

        public Builder clearReserveId() {
            copyOnWrite();
            ((ReserveReply) this.instance).clearReserveId();
            return this;
        }

        public long getReserveId() {
            return ((ReserveReply) this.instance).getReserveId();
        }

        public Builder setReserveId(long j) {
            copyOnWrite();
            ((ReserveReply) this.instance).setReserveId(j);
            return this;
        }

        private Builder() {
            super(ReserveReply.DEFAULT_INSTANCE);
        }
    }

    static {
        ReserveReply reserveReply = new ReserveReply();
        DEFAULT_INSTANCE = reserveReply;
        GeneratedMessageLite.registerDefaultInstance(ReserveReply.class, reserveReply);
    }

    private ReserveReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserveId() {
        this.reserveId_ = 0L;
    }

    public static ReserveReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ReserveReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReserveReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReserveReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ReserveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ReserveReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveId(long j) {
        this.reserveId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68471.f16807xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ReserveReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"reserveId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReserveReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ReserveReply.class) {
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

    public long getReserveId() {
        return this.reserveId_;
    }

    public static Builder newBuilder(ReserveReply reserveReply) {
        return DEFAULT_INSTANCE.createBuilder(reserveReply);
    }

    public static ReserveReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReserveReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReserveReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReserveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ReserveReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ReserveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ReserveReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReserveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ReserveReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ReserveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReserveReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReserveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ReserveReply parseFrom(InputStream inputStream) throws IOException {
        return (ReserveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReserveReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReserveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReserveReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ReserveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ReserveReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReserveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
