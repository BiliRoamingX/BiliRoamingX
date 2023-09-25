package com.bapis.bilibili.app.archive.middleware.v1;

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
/* loaded from: classes12.dex */
public final class PlayerArgs extends GeneratedMessageLite<PlayerArgs, PlayerArgs.Builder> implements MessageLiteOrBuilder {
    private static final PlayerArgs DEFAULT_INSTANCE;
    public static final int FNVAL_FIELD_NUMBER = 3;
    public static final int FNVER_FIELD_NUMBER = 2;
    public static final int FORCE_HOST_FIELD_NUMBER = 4;
    private static volatile Parser<PlayerArgs> PARSER = null;
    public static final int QN_FIELD_NUMBER = 1;
    public static final int VOICE_BALANCE_FIELD_NUMBER = 5;
    private long fnval_;
    private long fnver_;
    private long forceHost_;
    private long qn_;
    private long voiceBalance_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs$1 */
    /* loaded from: classes12.dex */
    static /* synthetic */ class C55141 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15724xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15724xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15724xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15724xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15724xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15724xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15724xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15724xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes12.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayerArgs, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C55141 c55141) {
            this();
        }

        public Builder clearFnval() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearFnval();
            return this;
        }

        public Builder clearFnver() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearFnver();
            return this;
        }

        public Builder clearForceHost() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearForceHost();
            return this;
        }

        public Builder clearQn() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearQn();
            return this;
        }

        public Builder clearVoiceBalance() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearVoiceBalance();
            return this;
        }

        public long getFnval() {
            return ((PlayerArgs) this.instance).getFnval();
        }

        public long getFnver() {
            return ((PlayerArgs) this.instance).getFnver();
        }

        public long getForceHost() {
            return ((PlayerArgs) this.instance).getForceHost();
        }

        public long getQn() {
            return ((PlayerArgs) this.instance).getQn();
        }

        public long getVoiceBalance() {
            return ((PlayerArgs) this.instance).getVoiceBalance();
        }

        public Builder setFnval(long j) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setFnval(j);
            return this;
        }

        public Builder setFnver(long j) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setFnver(j);
            return this;
        }

        public Builder setForceHost(long j) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setForceHost(j);
            return this;
        }

        public Builder setQn(long j) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setQn(j);
            return this;
        }

        public Builder setVoiceBalance(long j) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setVoiceBalance(j);
            return this;
        }

        private Builder() {
            super(PlayerArgs.DEFAULT_INSTANCE);
        }
    }

    static {
        PlayerArgs playerArgs = new PlayerArgs();
        DEFAULT_INSTANCE = playerArgs;
        GeneratedMessageLite.registerDefaultInstance(PlayerArgs.class, playerArgs);
    }

    public PlayerArgs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFnval() {
        this.fnval_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFnver() {
        this.fnver_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForceHost() {
        this.forceHost_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQn() {
        this.qn_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceBalance() {
        this.voiceBalance_ = 0L;
    }

    public static PlayerArgs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayerArgs parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayerArgs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerArgs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayerArgs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFnval(long j) {
        this.fnval_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFnver(long j) {
        this.fnver_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceHost(long j) {
        this.forceHost_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQn(long j) {
        this.qn_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceBalance(long j) {
        this.voiceBalance_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C55141.f15724xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayerArgs();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002", new Object[]{"qn_", "fnver_", "fnval_", "forceHost_", "voiceBalance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayerArgs> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayerArgs.class) {
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

    public long getFnval() {
        return this.fnval_;
    }

    public long getFnver() {
        return this.fnver_;
    }

    public long getForceHost() {
        return this.forceHost_;
    }

    public long getQn() {
        return this.qn_;
    }

    public long getVoiceBalance() {
        return this.voiceBalance_;
    }

    public static Builder newBuilder(PlayerArgs playerArgs) {
        return DEFAULT_INSTANCE.createBuilder(playerArgs);
    }

    public static PlayerArgs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerArgs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerArgs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayerArgs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayerArgs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayerArgs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayerArgs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayerArgs parseFrom(InputStream inputStream) throws IOException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerArgs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerArgs parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayerArgs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
