package com.bapis.bilibili.app.distribution.setting.experimental;

import com.bapis.bilibili.app.distribution.Int32Value;
import com.bapis.bilibili.app.distribution.Int64Value;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class Exp extends GeneratedMessageLite<Exp, Exp.C8356b> implements InterfaceC8363a {
    public static final int BUCKET_FIELD_NUMBER = 2;
    private static final Exp DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Exp> PARSER;
    private Int32Value bucket_;
    private Int64Value id_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.experimental.Exp$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8355a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19934xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19934xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19934xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19934xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19934xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19934xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19934xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19934xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.experimental.Exp$b */
    /* loaded from: classes13.dex */
    public static final class C8356b extends GeneratedMessageLite.Builder<Exp, C8356b> implements InterfaceC8363a {
        /* synthetic */ C8356b(C8355a c8355a) {
            this();
        }

        public C8356b clearBucket() {
            copyOnWrite();
            ((Exp) this.instance).clearBucket();
            return this;
        }

        public C8356b clearId() {
            copyOnWrite();
            ((Exp) this.instance).clearId();
            return this;
        }

        @Override // com.bapis.bilibili.app.distribution.setting.experimental.InterfaceC8363a
        public Int32Value getBucket() {
            return ((Exp) this.instance).getBucket();
        }

        @Override // com.bapis.bilibili.app.distribution.setting.experimental.InterfaceC8363a
        public Int64Value getId() {
            return ((Exp) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.distribution.setting.experimental.InterfaceC8363a
        public boolean hasBucket() {
            return ((Exp) this.instance).hasBucket();
        }

        @Override // com.bapis.bilibili.app.distribution.setting.experimental.InterfaceC8363a
        public boolean hasId() {
            return ((Exp) this.instance).hasId();
        }

        public C8356b mergeBucket(Int32Value int32Value) {
            copyOnWrite();
            ((Exp) this.instance).mergeBucket(int32Value);
            return this;
        }

        public C8356b mergeId(Int64Value int64Value) {
            copyOnWrite();
            ((Exp) this.instance).mergeId(int64Value);
            return this;
        }

        public C8356b setBucket(Int32Value int32Value) {
            copyOnWrite();
            ((Exp) this.instance).setBucket(int32Value);
            return this;
        }

        public C8356b setId(Int64Value int64Value) {
            copyOnWrite();
            ((Exp) this.instance).setId(int64Value);
            return this;
        }

        private C8356b() {
            super(Exp.DEFAULT_INSTANCE);
        }

        public C8356b setBucket(Int32Value.C8320b c8320b) {
            copyOnWrite();
            ((Exp) this.instance).setBucket(c8320b.build());
            return this;
        }

        public C8356b setId(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((Exp) this.instance).setId(c8322b.build());
            return this;
        }
    }

    static {
        Exp exp = new Exp();
        DEFAULT_INSTANCE = exp;
        GeneratedMessageLite.registerDefaultInstance(Exp.class, exp);
    }

    private Exp() {
    }

    public void clearBucket() {
        this.bucket_ = null;
    }

    public void clearId() {
        this.id_ = null;
    }

    public static Exp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeBucket(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.bucket_;
        if (int32Value2 != null && int32Value2 != Int32Value.getDefaultInstance()) {
            this.bucket_ = Int32Value.newBuilder(this.bucket_).mergeFrom((Int32Value) int32Value).buildPartial();
        } else {
            this.bucket_ = int32Value;
        }
    }

    public void mergeId(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.id_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.id_ = Int64Value.newBuilder(this.id_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.id_ = int64Value;
        }
    }

    public static C8356b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Exp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Exp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Exp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Exp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setBucket(Int32Value int32Value) {
        int32Value.getClass();
        this.bucket_ = int32Value;
    }

    public void setId(Int64Value int64Value) {
        int64Value.getClass();
        this.id_ = int64Value;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8355a.f19934xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Exp();
            case 2:
                return new C8356b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"id_", "bucket_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Exp> parser = PARSER;
                if (parser == null) {
                    synchronized (Exp.class) {
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

    @Override // com.bapis.bilibili.app.distribution.setting.experimental.InterfaceC8363a
    public Int32Value getBucket() {
        Int32Value int32Value = this.bucket_;
        return int32Value == null ? Int32Value.getDefaultInstance() : int32Value;
    }

    @Override // com.bapis.bilibili.app.distribution.setting.experimental.InterfaceC8363a
    public Int64Value getId() {
        Int64Value int64Value = this.id_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    @Override // com.bapis.bilibili.app.distribution.setting.experimental.InterfaceC8363a
    public boolean hasBucket() {
        return this.bucket_ != null;
    }

    @Override // com.bapis.bilibili.app.distribution.setting.experimental.InterfaceC8363a
    public boolean hasId() {
        return this.id_ != null;
    }

    public static C8356b newBuilder(Exp exp) {
        return DEFAULT_INSTANCE.createBuilder(exp);
    }

    public static Exp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Exp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Exp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Exp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Exp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Exp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Exp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Exp parseFrom(InputStream inputStream) throws IOException {
        return (Exp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Exp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Exp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
