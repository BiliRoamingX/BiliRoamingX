package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class PlayerAnimation extends GeneratedMessageLite<PlayerAnimation, PlayerAnimation.Builder> implements MessageLiteOrBuilder {
    private static final PlayerAnimation DEFAULT_INSTANCE;
    private static volatile Parser<PlayerAnimation> PARSER = null;
    public static final int PLAYER_ICON_FIELD_NUMBER = 1;
    public static final int PLAYER_TRIPLE_ICON_FIELD_NUMBER = 2;
    private String playerIcon_ = "";
    private String playerTripleIcon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.PlayerAnimation$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70281 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17009xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17009xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17009xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17009xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17009xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17009xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17009xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17009xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayerAnimation, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70281 c70281) {
            this();
        }

        public Builder clearPlayerIcon() {
            copyOnWrite();
            ((PlayerAnimation) this.instance).clearPlayerIcon();
            return this;
        }

        public Builder clearPlayerTripleIcon() {
            copyOnWrite();
            ((PlayerAnimation) this.instance).clearPlayerTripleIcon();
            return this;
        }

        public String getPlayerIcon() {
            return ((PlayerAnimation) this.instance).getPlayerIcon();
        }

        public ByteString getPlayerIconBytes() {
            return ((PlayerAnimation) this.instance).getPlayerIconBytes();
        }

        public String getPlayerTripleIcon() {
            return ((PlayerAnimation) this.instance).getPlayerTripleIcon();
        }

        public ByteString getPlayerTripleIconBytes() {
            return ((PlayerAnimation) this.instance).getPlayerTripleIconBytes();
        }

        public Builder setPlayerIcon(String str) {
            copyOnWrite();
            ((PlayerAnimation) this.instance).setPlayerIcon(str);
            return this;
        }

        public Builder setPlayerIconBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerAnimation) this.instance).setPlayerIconBytes(byteString);
            return this;
        }

        public Builder setPlayerTripleIcon(String str) {
            copyOnWrite();
            ((PlayerAnimation) this.instance).setPlayerTripleIcon(str);
            return this;
        }

        public Builder setPlayerTripleIconBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerAnimation) this.instance).setPlayerTripleIconBytes(byteString);
            return this;
        }

        private Builder() {
            super(PlayerAnimation.DEFAULT_INSTANCE);
        }
    }

    static {
        PlayerAnimation playerAnimation = new PlayerAnimation();
        DEFAULT_INSTANCE = playerAnimation;
        GeneratedMessageLite.registerDefaultInstance(PlayerAnimation.class, playerAnimation);
    }

    public PlayerAnimation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerIcon() {
        this.playerIcon_ = getDefaultInstance().getPlayerIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerTripleIcon() {
        this.playerTripleIcon_ = getDefaultInstance().getPlayerTripleIcon();
    }

    public static PlayerAnimation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayerAnimation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayerAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerAnimation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayerAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayerAnimation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerIcon(String str) {
        str.getClass();
        this.playerIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.playerIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerTripleIcon(String str) {
        str.getClass();
        this.playerTripleIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerTripleIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.playerTripleIcon_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70281.f17009xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayerAnimation();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"playerIcon_", "playerTripleIcon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayerAnimation> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayerAnimation.class) {
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

    public String getPlayerIcon() {
        return this.playerIcon_;
    }

    public ByteString getPlayerIconBytes() {
        return ByteString.copyFromUtf8(this.playerIcon_);
    }

    public String getPlayerTripleIcon() {
        return this.playerTripleIcon_;
    }

    public ByteString getPlayerTripleIconBytes() {
        return ByteString.copyFromUtf8(this.playerTripleIcon_);
    }

    public static Builder newBuilder(PlayerAnimation playerAnimation) {
        return DEFAULT_INSTANCE.createBuilder(playerAnimation);
    }

    public static PlayerAnimation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerAnimation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayerAnimation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayerAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayerAnimation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayerAnimation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayerAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayerAnimation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayerAnimation parseFrom(InputStream inputStream) throws IOException {
        return (PlayerAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerAnimation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerAnimation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayerAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayerAnimation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
