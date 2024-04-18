package com.bapis.bilibili.app.interfaces.v1;

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
/* loaded from: classes19.dex */
public final class Policy extends GeneratedMessageLite<Policy, Policy.C6308b> implements MessageLiteOrBuilder {
    private static final Policy DEFAULT_INSTANCE;
    public static final int INTERVAL_FIELD_NUMBER = 1;
    private static volatile Parser<Policy> PARSER = null;
    public static final int USE_LOCAL_TIME_FIELD_NUMBER = 2;
    private long interval_;
    private boolean useLocalTime_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.interfaces.v1.Policy$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C6307a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17580xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17580xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17580xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17580xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17580xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17580xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17580xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17580xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.interfaces.v1.Policy$b */
    /* loaded from: classes19.dex */
    public static final class C6308b extends GeneratedMessageLite.Builder<Policy, C6308b> implements MessageLiteOrBuilder {
        /* synthetic */ C6308b(C6307a c6307a) {
            this();
        }

        public C6308b clearInterval() {
            copyOnWrite();
            ((Policy) this.instance).clearInterval();
            return this;
        }

        public C6308b clearUseLocalTime() {
            copyOnWrite();
            ((Policy) this.instance).clearUseLocalTime();
            return this;
        }

        public long getInterval() {
            return ((Policy) this.instance).getInterval();
        }

        public boolean getUseLocalTime() {
            return ((Policy) this.instance).getUseLocalTime();
        }

        public C6308b setInterval(long j2) {
            copyOnWrite();
            ((Policy) this.instance).setInterval(j2);
            return this;
        }

        public C6308b setUseLocalTime(boolean z) {
            copyOnWrite();
            ((Policy) this.instance).setUseLocalTime(z);
            return this;
        }

        private C6308b() {
            super(Policy.DEFAULT_INSTANCE);
        }
    }

    static {
        Policy policy = new Policy();
        DEFAULT_INSTANCE = policy;
        GeneratedMessageLite.registerDefaultInstance(Policy.class, policy);
    }

    public Policy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInterval() {
        this.interval_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseLocalTime() {
        this.useLocalTime_ = false;
    }

    public static Policy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6308b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Policy parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Policy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Policy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Policy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Policy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInterval(long j2) {
        this.interval_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseLocalTime(boolean z) {
        this.useLocalTime_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C6307a c6307a = null;
        switch (C6307a.f17580xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Policy();
            case 2:
                return new C6308b(c6307a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0007", new Object[]{"interval_", "useLocalTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Policy> parser = PARSER;
                if (parser == null) {
                    synchronized (Policy.class) {
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

    public long getInterval() {
        return this.interval_;
    }

    public boolean getUseLocalTime() {
        return this.useLocalTime_;
    }

    public static C6308b newBuilder(Policy policy) {
        return DEFAULT_INSTANCE.createBuilder(policy);
    }

    public static Policy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Policy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Policy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Policy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Policy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Policy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Policy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Policy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Policy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Policy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Policy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Policy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Policy parseFrom(InputStream inputStream) throws IOException {
        return (Policy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Policy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Policy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Policy parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Policy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Policy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Policy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
