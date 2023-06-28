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
public final class PremiereReserve extends GeneratedMessageLite<PremiereReserve, PremiereReserve.Builder> implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final PremiereReserve DEFAULT_INSTANCE;
    public static final int IS_FOLLOW_FIELD_NUMBER = 3;
    private static volatile Parser<PremiereReserve> PARSER = null;
    public static final int RESERVE_ID_FIELD_NUMBER = 1;
    private long count_;
    private boolean isFollow_;
    private long reserveId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PremiereReserve$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68261 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16788xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16788xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16788xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16788xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16788xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16788xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16788xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16788xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PremiereReserve, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68261 c68261) {
            this();
        }

        public Builder clearCount() {
            copyOnWrite();
            ((PremiereReserve) this.instance).clearCount();
            return this;
        }

        public Builder clearIsFollow() {
            copyOnWrite();
            ((PremiereReserve) this.instance).clearIsFollow();
            return this;
        }

        public Builder clearReserveId() {
            copyOnWrite();
            ((PremiereReserve) this.instance).clearReserveId();
            return this;
        }

        public long getCount() {
            return ((PremiereReserve) this.instance).getCount();
        }

        public boolean getIsFollow() {
            return ((PremiereReserve) this.instance).getIsFollow();
        }

        public long getReserveId() {
            return ((PremiereReserve) this.instance).getReserveId();
        }

        public Builder setCount(long j) {
            copyOnWrite();
            ((PremiereReserve) this.instance).setCount(j);
            return this;
        }

        public Builder setIsFollow(boolean z) {
            copyOnWrite();
            ((PremiereReserve) this.instance).setIsFollow(z);
            return this;
        }

        public Builder setReserveId(long j) {
            copyOnWrite();
            ((PremiereReserve) this.instance).setReserveId(j);
            return this;
        }

        private Builder() {
            super(PremiereReserve.DEFAULT_INSTANCE);
        }
    }

    static {
        PremiereReserve premiereReserve = new PremiereReserve();
        DEFAULT_INSTANCE = premiereReserve;
        GeneratedMessageLite.registerDefaultInstance(PremiereReserve.class, premiereReserve);
    }

    private PremiereReserve() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFollow() {
        this.isFollow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserveId() {
        this.reserveId_ = 0L;
    }

    public static PremiereReserve getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PremiereReserve parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PremiereReserve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiereReserve parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PremiereReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PremiereReserve> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(long j) {
        this.count_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFollow(boolean z) {
        this.isFollow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveId(long j) {
        this.reserveId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68261.f16788xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PremiereReserve();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0007", new Object[]{"reserveId_", "count_", "isFollow_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PremiereReserve> parser = PARSER;
                if (parser == null) {
                    synchronized (PremiereReserve.class) {
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

    public long getCount() {
        return this.count_;
    }

    public boolean getIsFollow() {
        return this.isFollow_;
    }

    public long getReserveId() {
        return this.reserveId_;
    }

    public static Builder newBuilder(PremiereReserve premiereReserve) {
        return DEFAULT_INSTANCE.createBuilder(premiereReserve);
    }

    public static PremiereReserve parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereReserve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PremiereReserve parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PremiereReserve parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PremiereReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PremiereReserve parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PremiereReserve parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PremiereReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PremiereReserve parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PremiereReserve parseFrom(InputStream inputStream) throws IOException {
        return (PremiereReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiereReserve parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PremiereReserve parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PremiereReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PremiereReserve parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
