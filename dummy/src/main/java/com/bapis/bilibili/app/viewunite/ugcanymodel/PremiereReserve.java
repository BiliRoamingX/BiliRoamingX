package com.bapis.bilibili.app.viewunite.ugcanymodel;

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
public final class PremiereReserve extends GeneratedMessageLite<PremiereReserve, PremiereReserve.b> implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final PremiereReserve DEFAULT_INSTANCE;
    public static final int IS_FOLLOW_FIELD_NUMBER = 3;
    private static volatile Parser<PremiereReserve> PARSER = null;
    public static final int RESERVE_ID_FIELD_NUMBER = 1;
    private long count_;
    private boolean isFollow_;
    private long reserveId_;

    /* compiled from: BL */
    /* loaded from: classes21.dex */
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
    /* loaded from: classes21.dex */
    public static final class b extends GeneratedMessageLite.Builder<PremiereReserve, b> implements MessageLiteOrBuilder {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b clearCount() {
            copyOnWrite();
            ((PremiereReserve) this.instance).clearCount();
            return this;
        }

        public b clearIsFollow() {
            copyOnWrite();
            ((PremiereReserve) this.instance).clearIsFollow();
            return this;
        }

        public b clearReserveId() {
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

        public b setCount(long j2) {
            copyOnWrite();
            ((PremiereReserve) this.instance).setCount(j2);
            return this;
        }

        public b setIsFollow(boolean z) {
            copyOnWrite();
            ((PremiereReserve) this.instance).setIsFollow(z);
            return this;
        }

        public b setReserveId(long j2) {
            copyOnWrite();
            ((PremiereReserve) this.instance).setReserveId(j2);
            return this;
        }

        private b() {
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

    public static b newBuilder() {
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
    public void setCount(long j2) {
        this.count_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFollow(boolean z) {
        this.isFollow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveId(long j2) {
        this.reserveId_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new PremiereReserve();
            case 2:
                return new b(aVar);
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

    public long getCount() {
        return this.count_;
    }

    public boolean getIsFollow() {
        return this.isFollow_;
    }

    public long getReserveId() {
        return this.reserveId_;
    }

    public static b newBuilder(PremiereReserve premiereReserve) {
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
