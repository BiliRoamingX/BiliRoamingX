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
public final class FeedViewReq extends GeneratedMessageLite<FeedViewReq, FeedViewReq.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int BVID_FIELD_NUMBER = 2;
    private static final FeedViewReq DEFAULT_INSTANCE;
    public static final int DISPLAY_ID_FIELD_NUMBER = 7;
    public static final int FROM_FIELD_NUMBER = 3;
    public static final int FROM_SPMID_FIELD_NUMBER = 5;
    public static final int FROM_TRACK_ID_FIELD_NUMBER = 10;
    public static final int PAGE_VERSION_FIELD_NUMBER = 9;
    private static volatile Parser<FeedViewReq> PARSER = null;
    public static final int PLAYER_ARGS_FIELD_NUMBER = 6;
    public static final int SESSION_ID_FIELD_NUMBER = 8;
    public static final int SPMID_FIELD_NUMBER = 4;
    private long aid_;
    private long displayId_;
    private PlayerArgs playerArgs_;
    private String bvid_ = "";
    private String from_ = "";
    private String spmid_ = "";
    private String fromSpmid_ = "";
    private String sessionId_ = "";
    private String pageVersion_ = "";
    private String fromTrackId_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.FeedViewReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67671 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16738xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16738xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16738xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16738xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16738xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16738xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16738xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16738xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<FeedViewReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67671 c67671) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((FeedViewReq) this.instance).clearAid();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((FeedViewReq) this.instance).clearBvid();
            return this;
        }

        public Builder clearDisplayId() {
            copyOnWrite();
            ((FeedViewReq) this.instance).clearDisplayId();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((FeedViewReq) this.instance).clearFrom();
            return this;
        }

        public Builder clearFromSpmid() {
            copyOnWrite();
            ((FeedViewReq) this.instance).clearFromSpmid();
            return this;
        }

        public Builder clearFromTrackId() {
            copyOnWrite();
            ((FeedViewReq) this.instance).clearFromTrackId();
            return this;
        }

        public Builder clearPageVersion() {
            copyOnWrite();
            ((FeedViewReq) this.instance).clearPageVersion();
            return this;
        }

        public Builder clearPlayerArgs() {
            copyOnWrite();
            ((FeedViewReq) this.instance).clearPlayerArgs();
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((FeedViewReq) this.instance).clearSessionId();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((FeedViewReq) this.instance).clearSpmid();
            return this;
        }

        public long getAid() {
            return ((FeedViewReq) this.instance).getAid();
        }

        public String getBvid() {
            return ((FeedViewReq) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((FeedViewReq) this.instance).getBvidBytes();
        }

        public long getDisplayId() {
            return ((FeedViewReq) this.instance).getDisplayId();
        }

        public String getFrom() {
            return ((FeedViewReq) this.instance).getFrom();
        }

        public ByteString getFromBytes() {
            return ((FeedViewReq) this.instance).getFromBytes();
        }

        public String getFromSpmid() {
            return ((FeedViewReq) this.instance).getFromSpmid();
        }

        public ByteString getFromSpmidBytes() {
            return ((FeedViewReq) this.instance).getFromSpmidBytes();
        }

        public String getFromTrackId() {
            return ((FeedViewReq) this.instance).getFromTrackId();
        }

        public ByteString getFromTrackIdBytes() {
            return ((FeedViewReq) this.instance).getFromTrackIdBytes();
        }

        public String getPageVersion() {
            return ((FeedViewReq) this.instance).getPageVersion();
        }

        public ByteString getPageVersionBytes() {
            return ((FeedViewReq) this.instance).getPageVersionBytes();
        }

        public PlayerArgs getPlayerArgs() {
            return ((FeedViewReq) this.instance).getPlayerArgs();
        }

        public String getSessionId() {
            return ((FeedViewReq) this.instance).getSessionId();
        }

        public ByteString getSessionIdBytes() {
            return ((FeedViewReq) this.instance).getSessionIdBytes();
        }

        public String getSpmid() {
            return ((FeedViewReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((FeedViewReq) this.instance).getSpmidBytes();
        }

        public boolean hasPlayerArgs() {
            return ((FeedViewReq) this.instance).hasPlayerArgs();
        }

        public Builder mergePlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((FeedViewReq) this.instance).mergePlayerArgs(playerArgs);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setAid(j);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setDisplayId(long j) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setDisplayId(j);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setFromSpmid(String str) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setFromSpmid(str);
            return this;
        }

        public Builder setFromSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setFromSpmidBytes(byteString);
            return this;
        }

        public Builder setFromTrackId(String str) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setFromTrackId(str);
            return this;
        }

        public Builder setFromTrackIdBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setFromTrackIdBytes(byteString);
            return this;
        }

        public Builder setPageVersion(String str) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setPageVersion(str);
            return this;
        }

        public Builder setPageVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setPageVersionBytes(byteString);
            return this;
        }

        public Builder setPlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setPlayerArgs(playerArgs);
            return this;
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        private Builder() {
            super(FeedViewReq.DEFAULT_INSTANCE);
        }

        public Builder setPlayerArgs(PlayerArgs.Builder builder) {
            copyOnWrite();
            ((FeedViewReq) this.instance).setPlayerArgs(builder.build());
            return this;
        }
    }

    static {
        FeedViewReq feedViewReq = new FeedViewReq();
        DEFAULT_INSTANCE = feedViewReq;
        GeneratedMessageLite.registerDefaultInstance(FeedViewReq.class, feedViewReq);
    }

    private FeedViewReq() {
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
    public void clearDisplayId() {
        this.displayId_ = 0L;
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
    public void clearPageVersion() {
        this.pageVersion_ = getDefaultInstance().getPageVersion();
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

    public static FeedViewReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerArgs(PlayerArgs playerArgs) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FeedViewReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FeedViewReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedViewReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FeedViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FeedViewReq> parser() {
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
    public void setDisplayId(long j) {
        this.displayId_ = j;
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
    public void setPageVersion(String str) {
        str.getClass();
        this.pageVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pageVersion_ = byteString.toStringUtf8();
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
        switch (C67671.f16738xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FeedViewReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\t\u0007\u0002\b\u0208\t\u0208\n\u0208", new Object[]{"aid_", "bvid_", "from_", "spmid_", "fromSpmid_", "playerArgs_", "displayId_", "sessionId_", "pageVersion_", "fromTrackId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FeedViewReq> parser = PARSER;
                if (parser == null) {
                    synchronized (FeedViewReq.class) {
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

    public long getDisplayId() {
        return this.displayId_;
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

    public String getPageVersion() {
        return this.pageVersion_;
    }

    public ByteString getPageVersionBytes() {
        return ByteString.copyFromUtf8(this.pageVersion_);
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

    public static Builder newBuilder(FeedViewReq feedViewReq) {
        return DEFAULT_INSTANCE.createBuilder(feedViewReq);
    }

    public static FeedViewReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeedViewReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FeedViewReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeedViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FeedViewReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FeedViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FeedViewReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeedViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FeedViewReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FeedViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FeedViewReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeedViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FeedViewReq parseFrom(InputStream inputStream) throws IOException {
        return (FeedViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedViewReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeedViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FeedViewReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FeedViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FeedViewReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeedViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
