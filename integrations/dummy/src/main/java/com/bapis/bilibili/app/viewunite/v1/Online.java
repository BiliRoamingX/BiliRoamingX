package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes17.dex */
public final class Online extends GeneratedMessageLite<Online, Online.Builder> implements MessageLiteOrBuilder {
    private static final Online DEFAULT_INSTANCE;
    public static final int ONLINE_SHOW_FIELD_NUMBER = 1;
    private static volatile Parser<Online> PARSER;
    private boolean onlineShow_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.Online$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71411 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17112xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17112xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17112xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17112xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17112xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17112xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17112xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17112xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Online, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71411 c71411) {
            this();
        }

        public Builder clearOnlineShow() {
            copyOnWrite();
            ((Online) this.instance).clearOnlineShow();
            return this;
        }

        public boolean getOnlineShow() {
            return ((Online) this.instance).getOnlineShow();
        }

        public Builder setOnlineShow(boolean z) {
            copyOnWrite();
            ((Online) this.instance).setOnlineShow(z);
            return this;
        }

        private Builder() {
            super(Online.DEFAULT_INSTANCE);
        }
    }

    static {
        Online online = new Online();
        DEFAULT_INSTANCE = online;
        GeneratedMessageLite.registerDefaultInstance(Online.class, online);
    }

    public Online() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnlineShow() {
        this.onlineShow_ = false;
    }

    public static Online getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Online parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Online) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Online parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Online) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Online> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnlineShow(boolean z) {
        this.onlineShow_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71411.f17112xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Online();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"onlineShow_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Online> parser = PARSER;
                if (parser == null) {
                    synchronized (Online.class) {
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

    public boolean getOnlineShow() {
        return this.onlineShow_;
    }

    public static Builder newBuilder(Online online) {
        return DEFAULT_INSTANCE.createBuilder(online);
    }

    public static Online parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Online) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Online parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Online) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Online parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Online) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Online parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Online) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Online parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Online) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Online parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Online) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Online parseFrom(InputStream inputStream) throws IOException {
        return (Online) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Online parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Online) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Online parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Online) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Online parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Online) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
