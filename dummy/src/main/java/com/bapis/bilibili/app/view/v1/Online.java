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
public final class Online extends GeneratedMessageLite<Online, Online.Builder> implements MessageLiteOrBuilder {
    private static final Online DEFAULT_INSTANCE;
    public static final int ONLINE_SHOW_FIELD_NUMBER = 1;
    private static volatile Parser<Online> PARSER = null;
    public static final int PLAYER_ONLINE_LOGO_FIELD_NUMBER = 2;
    private boolean onlineShow_;
    private String playerOnlineLogo_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Online$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68021 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16768xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16768xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16768xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16768xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16768xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16768xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16768xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16768xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Online, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68021 c68021) {
            this();
        }

        public Builder clearOnlineShow() {
            copyOnWrite();
            ((Online) this.instance).clearOnlineShow();
            return this;
        }

        public Builder clearPlayerOnlineLogo() {
            copyOnWrite();
            ((Online) this.instance).clearPlayerOnlineLogo();
            return this;
        }

        public boolean getOnlineShow() {
            return ((Online) this.instance).getOnlineShow();
        }

        public String getPlayerOnlineLogo() {
            return ((Online) this.instance).getPlayerOnlineLogo();
        }

        public ByteString getPlayerOnlineLogoBytes() {
            return ((Online) this.instance).getPlayerOnlineLogoBytes();
        }

        public Builder setOnlineShow(boolean z) {
            copyOnWrite();
            ((Online) this.instance).setOnlineShow(z);
            return this;
        }

        public Builder setPlayerOnlineLogo(String str) {
            copyOnWrite();
            ((Online) this.instance).setPlayerOnlineLogo(str);
            return this;
        }

        public Builder setPlayerOnlineLogoBytes(ByteString byteString) {
            copyOnWrite();
            ((Online) this.instance).setPlayerOnlineLogoBytes(byteString);
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

    private Online() {
    }

    public void clearOnlineShow() {
        this.onlineShow_ = false;
    }

    public void clearPlayerOnlineLogo() {
        this.playerOnlineLogo_ = getDefaultInstance().getPlayerOnlineLogo();
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

    public void setOnlineShow(boolean z) {
        this.onlineShow_ = z;
    }

    public void setPlayerOnlineLogo(String str) {
        str.getClass();
        this.playerOnlineLogo_ = str;
    }

    public void setPlayerOnlineLogoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.playerOnlineLogo_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68021.f16768xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Online();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0208", new Object[]{"onlineShow_", "playerOnlineLogo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Online> parser = PARSER;
                if (parser == null) {
                    synchronized (Online.class) {
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

    public boolean getOnlineShow() {
        return this.onlineShow_;
    }

    public String getPlayerOnlineLogo() {
        return this.playerOnlineLogo_;
    }

    public ByteString getPlayerOnlineLogoBytes() {
        return ByteString.copyFromUtf8(this.playerOnlineLogo_);
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
