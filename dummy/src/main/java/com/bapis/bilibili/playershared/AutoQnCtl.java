package com.bapis.bilibili.playershared;

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
/* loaded from: classes22.dex */
public final class AutoQnCtl extends GeneratedMessageLite<AutoQnCtl, AutoQnCtl.C11577b> implements MessageLiteOrBuilder {
    private static final AutoQnCtl DEFAULT_INSTANCE;
    public static final int LOGIN_FULL_FIELD_NUMBER = 3;
    public static final int LOGIN_HALF_FIELD_NUMBER = 1;
    public static final int NOLOGIN_FULL_FIELD_NUMBER = 4;
    public static final int NOLOGIN_HALF_FIELD_NUMBER = 2;
    private static volatile Parser<AutoQnCtl> PARSER;
    private long loginFull_;
    private long loginHalf_;
    private long nologinFull_;
    private long nologinHalf_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.AutoQnCtl$a */
    /* loaded from: classes22.dex */
    static /* synthetic */ class C11576a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19481xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19481xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19481xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19481xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19481xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19481xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19481xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19481xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.AutoQnCtl$b */
    /* loaded from: classes22.dex */
    public static final class C11577b extends GeneratedMessageLite.Builder<AutoQnCtl, C11577b> implements MessageLiteOrBuilder {
        /* synthetic */ C11577b(C11576a c11576a) {
            this();
        }

        public C11577b clearLoginFull() {
            copyOnWrite();
            ((AutoQnCtl) this.instance).clearLoginFull();
            return this;
        }

        public C11577b clearLoginHalf() {
            copyOnWrite();
            ((AutoQnCtl) this.instance).clearLoginHalf();
            return this;
        }

        public C11577b clearNologinFull() {
            copyOnWrite();
            ((AutoQnCtl) this.instance).clearNologinFull();
            return this;
        }

        public C11577b clearNologinHalf() {
            copyOnWrite();
            ((AutoQnCtl) this.instance).clearNologinHalf();
            return this;
        }

        public long getLoginFull() {
            return ((AutoQnCtl) this.instance).getLoginFull();
        }

        public long getLoginHalf() {
            return ((AutoQnCtl) this.instance).getLoginHalf();
        }

        public long getNologinFull() {
            return ((AutoQnCtl) this.instance).getNologinFull();
        }

        public long getNologinHalf() {
            return ((AutoQnCtl) this.instance).getNologinHalf();
        }

        public C11577b setLoginFull(long j2) {
            copyOnWrite();
            ((AutoQnCtl) this.instance).setLoginFull(j2);
            return this;
        }

        public C11577b setLoginHalf(long j2) {
            copyOnWrite();
            ((AutoQnCtl) this.instance).setLoginHalf(j2);
            return this;
        }

        public C11577b setNologinFull(long j2) {
            copyOnWrite();
            ((AutoQnCtl) this.instance).setNologinFull(j2);
            return this;
        }

        public C11577b setNologinHalf(long j2) {
            copyOnWrite();
            ((AutoQnCtl) this.instance).setNologinHalf(j2);
            return this;
        }

        private C11577b() {
            super(AutoQnCtl.DEFAULT_INSTANCE);
        }
    }

    static {
        AutoQnCtl autoQnCtl = new AutoQnCtl();
        DEFAULT_INSTANCE = autoQnCtl;
        GeneratedMessageLite.registerDefaultInstance(AutoQnCtl.class, autoQnCtl);
    }

    private AutoQnCtl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoginFull() {
        this.loginFull_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoginHalf() {
        this.loginHalf_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNologinFull() {
        this.nologinFull_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNologinHalf() {
        this.nologinHalf_ = 0L;
    }

    public static AutoQnCtl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11577b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AutoQnCtl parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AutoQnCtl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AutoQnCtl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AutoQnCtl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AutoQnCtl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoginFull(long j2) {
        this.loginFull_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoginHalf(long j2) {
        this.loginHalf_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNologinFull(long j2) {
        this.nologinFull_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNologinHalf(long j2) {
        this.nologinHalf_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C11576a c11576a = null;
        switch (C11576a.f19481xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AutoQnCtl();
            case 2:
                return new C11577b(c11576a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002", new Object[]{"loginHalf_", "nologinHalf_", "loginFull_", "nologinFull_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AutoQnCtl> parser = PARSER;
                if (parser == null) {
                    synchronized (AutoQnCtl.class) {
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

    public long getLoginFull() {
        return this.loginFull_;
    }

    public long getLoginHalf() {
        return this.loginHalf_;
    }

    public long getNologinFull() {
        return this.nologinFull_;
    }

    public long getNologinHalf() {
        return this.nologinHalf_;
    }

    public static C11577b newBuilder(AutoQnCtl autoQnCtl) {
        return DEFAULT_INSTANCE.createBuilder(autoQnCtl);
    }

    public static AutoQnCtl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AutoQnCtl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AutoQnCtl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AutoQnCtl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AutoQnCtl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AutoQnCtl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AutoQnCtl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AutoQnCtl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AutoQnCtl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AutoQnCtl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AutoQnCtl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AutoQnCtl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AutoQnCtl parseFrom(InputStream inputStream) throws IOException {
        return (AutoQnCtl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AutoQnCtl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AutoQnCtl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AutoQnCtl parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AutoQnCtl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AutoQnCtl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AutoQnCtl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
