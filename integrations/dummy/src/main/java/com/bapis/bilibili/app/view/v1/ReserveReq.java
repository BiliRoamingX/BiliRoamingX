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
public final class ReserveReq extends GeneratedMessageLite<ReserveReq, ReserveReq.Builder> implements MessageLiteOrBuilder {
    private static final ReserveReq DEFAULT_INSTANCE;
    private static volatile Parser<ReserveReq> PARSER = null;
    public static final int RESERVE_ACTION_FIELD_NUMBER = 2;
    public static final int RESERVE_ID_FIELD_NUMBER = 1;
    public static final int UP_ID_FIELD_NUMBER = 3;
    private long reserveAction_;
    private long reserveId_;
    private long upId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ReserveReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68481 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16808xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16808xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16808xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16808xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16808xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16808xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16808xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16808xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ReserveReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68481 c68481) {
            this();
        }

        public Builder clearReserveAction() {
            copyOnWrite();
            ((ReserveReq) this.instance).clearReserveAction();
            return this;
        }

        public Builder clearReserveId() {
            copyOnWrite();
            ((ReserveReq) this.instance).clearReserveId();
            return this;
        }

        public Builder clearUpId() {
            copyOnWrite();
            ((ReserveReq) this.instance).clearUpId();
            return this;
        }

        public long getReserveAction() {
            return ((ReserveReq) this.instance).getReserveAction();
        }

        public long getReserveId() {
            return ((ReserveReq) this.instance).getReserveId();
        }

        public long getUpId() {
            return ((ReserveReq) this.instance).getUpId();
        }

        public Builder setReserveAction(long j) {
            copyOnWrite();
            ((ReserveReq) this.instance).setReserveAction(j);
            return this;
        }

        public Builder setReserveId(long j) {
            copyOnWrite();
            ((ReserveReq) this.instance).setReserveId(j);
            return this;
        }

        public Builder setUpId(long j) {
            copyOnWrite();
            ((ReserveReq) this.instance).setUpId(j);
            return this;
        }

        private Builder() {
            super(ReserveReq.DEFAULT_INSTANCE);
        }
    }

    static {
        ReserveReq reserveReq = new ReserveReq();
        DEFAULT_INSTANCE = reserveReq;
        GeneratedMessageLite.registerDefaultInstance(ReserveReq.class, reserveReq);
    }

    private ReserveReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserveAction() {
        this.reserveAction_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserveId() {
        this.reserveId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpId() {
        this.upId_ = 0L;
    }

    public static ReserveReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ReserveReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReserveReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReserveReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ReserveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ReserveReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveAction(long j) {
        this.reserveAction_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveId(long j) {
        this.reserveId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpId(long j) {
        this.upId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68481.f16808xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ReserveReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002", new Object[]{"reserveId_", "reserveAction_", "upId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReserveReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ReserveReq.class) {
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

    public long getReserveAction() {
        return this.reserveAction_;
    }

    public long getReserveId() {
        return this.reserveId_;
    }

    public long getUpId() {
        return this.upId_;
    }

    public static Builder newBuilder(ReserveReq reserveReq) {
        return DEFAULT_INSTANCE.createBuilder(reserveReq);
    }

    public static ReserveReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReserveReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReserveReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReserveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ReserveReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ReserveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ReserveReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReserveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ReserveReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ReserveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReserveReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReserveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ReserveReq parseFrom(InputStream inputStream) throws IOException {
        return (ReserveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReserveReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReserveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReserveReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ReserveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ReserveReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReserveReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
