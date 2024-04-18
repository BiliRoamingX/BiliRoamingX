package com.bapis.bilibili.app.playurl.v1;

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
/* loaded from: classes13.dex */
public final class Shake extends GeneratedMessageLite<Shake, Shake.Builder> implements MessageLiteOrBuilder {
    private static final Shake DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 1;
    private static volatile Parser<Shake> PARSER;
    private String file_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.Shake$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C65171 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16547xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16547xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16547xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16547xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16547xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16547xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16547xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16547xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Shake, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C65171 c65171) {
            this();
        }

        public Builder clearFile() {
            copyOnWrite();
            ((Shake) this.instance).clearFile();
            return this;
        }

        public String getFile() {
            return ((Shake) this.instance).getFile();
        }

        public ByteString getFileBytes() {
            return ((Shake) this.instance).getFileBytes();
        }

        public Builder setFile(String str) {
            copyOnWrite();
            ((Shake) this.instance).setFile(str);
            return this;
        }

        public Builder setFileBytes(ByteString byteString) {
            copyOnWrite();
            ((Shake) this.instance).setFileBytes(byteString);
            return this;
        }

        private Builder() {
            super(Shake.DEFAULT_INSTANCE);
        }
    }

    static {
        Shake shake = new Shake();
        DEFAULT_INSTANCE = shake;
        GeneratedMessageLite.registerDefaultInstance(Shake.class, shake);
    }

    private Shake() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFile() {
        this.file_ = getDefaultInstance().getFile();
    }

    public static Shake getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Shake parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Shake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Shake parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Shake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Shake> parser() {
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65171.f16547xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Shake();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"file_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Shake> parser = PARSER;
                if (parser == null) {
                    synchronized (Shake.class) {
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

    public static Builder newBuilder(Shake shake) {
        return DEFAULT_INSTANCE.createBuilder(shake);
    }

    public static Shake parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Shake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Shake parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Shake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Shake parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Shake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Shake parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Shake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Shake parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Shake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Shake parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Shake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Shake parseFrom(InputStream inputStream) throws IOException {
        return (Shake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Shake parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Shake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Shake parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Shake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Shake parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Shake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
