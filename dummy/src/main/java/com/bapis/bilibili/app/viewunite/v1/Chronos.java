package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.AbstractMessageLite;
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
public final class Chronos extends GeneratedMessageLite<Chronos, Chronos.C12290b> implements MessageLiteOrBuilder {
    private static final Chronos DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 2;
    public static final int MD5_FIELD_NUMBER = 1;
    private static volatile Parser<Chronos> PARSER = null;
    public static final int SIGN_FIELD_NUMBER = 3;
    private String md5_ = "";
    private String file_ = "";
    private String sign_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.Chronos$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12289a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21263xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21263xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21263xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21263xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21263xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21263xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21263xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21263xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.Chronos$b */
    /* loaded from: classes20.dex */
    public static final class C12290b extends GeneratedMessageLite.Builder<Chronos, C12290b> implements MessageLiteOrBuilder {
        /* synthetic */ C12290b(C12289a c12289a) {
            this();
        }

        public C12290b clearFile() {
            copyOnWrite();
            ((Chronos) this.instance).clearFile();
            return this;
        }

        public C12290b clearMd5() {
            copyOnWrite();
            ((Chronos) this.instance).clearMd5();
            return this;
        }

        public C12290b clearSign() {
            copyOnWrite();
            ((Chronos) this.instance).clearSign();
            return this;
        }

        public String getFile() {
            return ((Chronos) this.instance).getFile();
        }

        public ByteString getFileBytes() {
            return ((Chronos) this.instance).getFileBytes();
        }

        public String getMd5() {
            return ((Chronos) this.instance).getMd5();
        }

        public ByteString getMd5Bytes() {
            return ((Chronos) this.instance).getMd5Bytes();
        }

        public String getSign() {
            return ((Chronos) this.instance).getSign();
        }

        public ByteString getSignBytes() {
            return ((Chronos) this.instance).getSignBytes();
        }

        public C12290b setFile(String str) {
            copyOnWrite();
            ((Chronos) this.instance).setFile(str);
            return this;
        }

        public C12290b setFileBytes(ByteString byteString) {
            copyOnWrite();
            ((Chronos) this.instance).setFileBytes(byteString);
            return this;
        }

        public C12290b setMd5(String str) {
            copyOnWrite();
            ((Chronos) this.instance).setMd5(str);
            return this;
        }

        public C12290b setMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((Chronos) this.instance).setMd5Bytes(byteString);
            return this;
        }

        public C12290b setSign(String str) {
            copyOnWrite();
            ((Chronos) this.instance).setSign(str);
            return this;
        }

        public C12290b setSignBytes(ByteString byteString) {
            copyOnWrite();
            ((Chronos) this.instance).setSignBytes(byteString);
            return this;
        }

        private C12290b() {
            super(Chronos.DEFAULT_INSTANCE);
        }
    }

    static {
        Chronos chronos = new Chronos();
        DEFAULT_INSTANCE = chronos;
        GeneratedMessageLite.registerDefaultInstance(Chronos.class, chronos);
    }

    private Chronos() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFile() {
        this.file_ = getDefaultInstance().getFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMd5() {
        this.md5_ = getDefaultInstance().getMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSign() {
        this.sign_ = getDefaultInstance().getSign();
    }

    public static Chronos getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12290b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Chronos parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Chronos) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Chronos parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Chronos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Chronos> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFile(String str) {
        str.getClass();
        this.file_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.file_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMd5(String str) {
        str.getClass();
        this.md5_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMd5Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.md5_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSign(String str) {
        str.getClass();
        this.sign_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sign_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12289a.f21263xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Chronos();
            case 2:
                return new C12290b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"md5_", "file_", "sign_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Chronos> parser = PARSER;
                if (parser == null) {
                    synchronized (Chronos.class) {
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

    public String getFile() {
        return this.file_;
    }

    public ByteString getFileBytes() {
        return ByteString.copyFromUtf8(this.file_);
    }

    public String getMd5() {
        return this.md5_;
    }

    public ByteString getMd5Bytes() {
        return ByteString.copyFromUtf8(this.md5_);
    }

    public String getSign() {
        return this.sign_;
    }

    public ByteString getSignBytes() {
        return ByteString.copyFromUtf8(this.sign_);
    }

    public static C12290b newBuilder(Chronos chronos) {
        return DEFAULT_INSTANCE.createBuilder(chronos);
    }

    public static Chronos parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Chronos) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Chronos parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Chronos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Chronos parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Chronos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Chronos parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Chronos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Chronos parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Chronos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Chronos parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Chronos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Chronos parseFrom(InputStream inputStream) throws IOException {
        return (Chronos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Chronos parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Chronos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Chronos parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Chronos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Chronos parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Chronos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
