package com.bapis.bilibili.app.view.v1;

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
public final class ClickPlayerCardReply extends GeneratedMessageLite<ClickPlayerCardReply, ClickPlayerCardReply.Builder> implements MessageLiteOrBuilder {
    private static final ClickPlayerCardReply DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private static volatile Parser<ClickPlayerCardReply> PARSER;
    private String message_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ClickPlayerCardReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67371 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16711xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16711xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16711xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16711xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16711xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16711xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16711xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16711xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ClickPlayerCardReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67371 c67371) {
            this();
        }

        public Builder clearMessage() {
            copyOnWrite();
            ((ClickPlayerCardReply) this.instance).clearMessage();
            return this;
        }

        public String getMessage() {
            return ((ClickPlayerCardReply) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((ClickPlayerCardReply) this.instance).getMessageBytes();
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((ClickPlayerCardReply) this.instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((ClickPlayerCardReply) this.instance).setMessageBytes(byteString);
            return this;
        }

        private Builder() {
            super(ClickPlayerCardReply.DEFAULT_INSTANCE);
        }
    }

    static {
        ClickPlayerCardReply clickPlayerCardReply = new ClickPlayerCardReply();
        DEFAULT_INSTANCE = clickPlayerCardReply;
        GeneratedMessageLite.registerDefaultInstance(ClickPlayerCardReply.class, clickPlayerCardReply);
    }

    private ClickPlayerCardReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    public static ClickPlayerCardReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClickPlayerCardReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ClickPlayerCardReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClickPlayerCardReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ClickPlayerCardReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ClickPlayerCardReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67371.f16711xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ClickPlayerCardReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"message_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ClickPlayerCardReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ClickPlayerCardReply.class) {
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

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    public static Builder newBuilder(ClickPlayerCardReply clickPlayerCardReply) {
        return DEFAULT_INSTANCE.createBuilder(clickPlayerCardReply);
    }

    public static ClickPlayerCardReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClickPlayerCardReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClickPlayerCardReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClickPlayerCardReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ClickPlayerCardReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ClickPlayerCardReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ClickPlayerCardReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClickPlayerCardReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ClickPlayerCardReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ClickPlayerCardReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClickPlayerCardReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClickPlayerCardReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ClickPlayerCardReply parseFrom(InputStream inputStream) throws IOException {
        return (ClickPlayerCardReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClickPlayerCardReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClickPlayerCardReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClickPlayerCardReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ClickPlayerCardReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClickPlayerCardReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClickPlayerCardReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
