package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
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
public final class PlayerRelatesReq extends GeneratedMessageLite<PlayerRelatesReq, PlayerRelatesReq.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int BVID_FIELD_NUMBER = 2;
    private static final PlayerRelatesReq DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 3;
    public static final int FROM_SPMID_FIELD_NUMBER = 5;
    public static final int FROM_TRACK_ID_FIELD_NUMBER = 8;
    private static volatile Parser<PlayerRelatesReq> PARSER = null;
    public static final int PLAYER_ARGS_FIELD_NUMBER = 6;
    public static final int SESSION_ID_FIELD_NUMBER = 7;
    public static final int SPMID_FIELD_NUMBER = 4;
    private long aid_;
    private PlayerArgs playerArgs_;
    private String bvid_ = "";
    private String from_ = "";
    private String spmid_ = "";
    private String fromSpmid_ = "";
    private String sessionId_ = "";
    private String fromTrackId_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PlayerRelatesReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68201 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16782xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16782xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16782xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16782xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16782xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16782xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16782xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16782xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayerRelatesReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68201 c68201) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).clearAid();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).clearBvid();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).clearFrom();
            return this;
        }

        public Builder clearFromSpmid() {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).clearFromSpmid();
            return this;
        }

        public Builder clearFromTrackId() {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).clearFromTrackId();
            return this;
        }

        public Builder clearPlayerArgs() {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).clearPlayerArgs();
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).clearSessionId();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).clearSpmid();
            return this;
        }

        public long getAid() {
            return ((PlayerRelatesReq) this.instance).getAid();
        }

        public String getBvid() {
            return ((PlayerRelatesReq) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((PlayerRelatesReq) this.instance).getBvidBytes();
        }

        public String getFrom() {
            return ((PlayerRelatesReq) this.instance).getFrom();
        }

        public ByteString getFromBytes() {
            return ((PlayerRelatesReq) this.instance).getFromBytes();
        }

        public String getFromSpmid() {
            return ((PlayerRelatesReq) this.instance).getFromSpmid();
        }

        public ByteString getFromSpmidBytes() {
            return ((PlayerRelatesReq) this.instance).getFromSpmidBytes();
        }

        public String getFromTrackId() {
            return ((PlayerRelatesReq) this.instance).getFromTrackId();
        }

        public ByteString getFromTrackIdBytes() {
            return ((PlayerRelatesReq) this.instance).getFromTrackIdBytes();
        }

        public PlayerArgs getPlayerArgs() {
            return ((PlayerRelatesReq) this.instance).getPlayerArgs();
        }

        public String getSessionId() {
            return ((PlayerRelatesReq) this.instance).getSessionId();
        }

        public ByteString getSessionIdBytes() {
            return ((PlayerRelatesReq) this.instance).getSessionIdBytes();
        }

        public String getSpmid() {
            return ((PlayerRelatesReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((PlayerRelatesReq) this.instance).getSpmidBytes();
        }

        public boolean hasPlayerArgs() {
            return ((PlayerRelatesReq) this.instance).hasPlayerArgs();
        }

        public Builder mergePlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).mergePlayerArgs(playerArgs);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setAid(j);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setFromSpmid(String str) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setFromSpmid(str);
            return this;
        }

        public Builder setFromSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setFromSpmidBytes(byteString);
            return this;
        }

        public Builder setFromTrackId(String str) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setFromTrackId(str);
            return this;
        }

        public Builder setFromTrackIdBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setFromTrackIdBytes(byteString);
            return this;
        }

        public Builder setPlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setPlayerArgs(playerArgs);
            return this;
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        private Builder() {
            super(PlayerRelatesReq.DEFAULT_INSTANCE);
        }

        public Builder setPlayerArgs(PlayerArgs.Builder builder) {
            copyOnWrite();
            ((PlayerRelatesReq) this.instance).setPlayerArgs(builder.build());
            return this;
        }
    }

    static {
        PlayerRelatesReq playerRelatesReq = new PlayerRelatesReq();
        DEFAULT_INSTANCE = playerRelatesReq;
        GeneratedMessageLite.registerDefaultInstance(PlayerRelatesReq.class, playerRelatesReq);
    }

    private PlayerRelatesReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSpmid() {
        this.fromSpmid_ = getDefaultInstance().getFromSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromTrackId() {
        this.fromTrackId_ = getDefaultInstance().getFromTrackId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerArgs() {
        this.playerArgs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    public static PlayerRelatesReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerArgs(PlayerArgs playerArgs) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayerRelatesReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayerRelatesReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerRelatesReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayerRelatesReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayerRelatesReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvid(String str) {
        str.getClass();
        this.bvid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bvid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        str.getClass();
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.from_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSpmid(String str) {
        str.getClass();
        this.fromSpmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromSpmid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromTrackId(String str) {
        str.getClass();
        this.fromTrackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromTrackIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromTrackId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerArgs(PlayerArgs playerArgs) {
        playerArgs.getClass();
        this.playerArgs_ = playerArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmid(String str) {
        str.getClass();
        this.spmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.spmid_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68201.f16782xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayerRelatesReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\t\u0007\u0208\b\u0208", new Object[]{"aid_", "bvid_", "from_", "spmid_", "fromSpmid_", "playerArgs_", "sessionId_", "fromTrackId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayerRelatesReq> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayerRelatesReq.class) {
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

    public long getAid() {
        return this.aid_;
    }

    public String getBvid() {
        return this.bvid_;
    }

    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    public String getFrom() {
        return this.from_;
    }

    public ByteString getFromBytes() {
        return ByteString.copyFromUtf8(this.from_);
    }

    public String getFromSpmid() {
        return this.fromSpmid_;
    }

    public ByteString getFromSpmidBytes() {
        return ByteString.copyFromUtf8(this.fromSpmid_);
    }

    public String getFromTrackId() {
        return this.fromTrackId_;
    }

    public ByteString getFromTrackIdBytes() {
        return ByteString.copyFromUtf8(this.fromTrackId_);
    }

    public PlayerArgs getPlayerArgs() {
        PlayerArgs playerArgs = this.playerArgs_;
        return playerArgs == null ? PlayerArgs.getDefaultInstance() : playerArgs;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public boolean hasPlayerArgs() {
        return this.playerArgs_ != null;
    }

    public static Builder newBuilder(PlayerRelatesReq playerRelatesReq) {
        return DEFAULT_INSTANCE.createBuilder(playerRelatesReq);
    }

    public static PlayerRelatesReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerRelatesReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerRelatesReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerRelatesReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayerRelatesReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayerRelatesReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayerRelatesReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerRelatesReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayerRelatesReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayerRelatesReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayerRelatesReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerRelatesReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayerRelatesReq parseFrom(InputStream inputStream) throws IOException {
        return (PlayerRelatesReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerRelatesReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerRelatesReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerRelatesReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayerRelatesReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayerRelatesReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerRelatesReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
