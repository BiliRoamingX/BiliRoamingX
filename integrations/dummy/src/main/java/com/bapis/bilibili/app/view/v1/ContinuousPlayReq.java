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
public final class ContinuousPlayReq extends GeneratedMessageLite<ContinuousPlayReq, ContinuousPlayReq.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int AUTOPLAY_FIELD_NUMBER = 6;
    private static final ContinuousPlayReq DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 8;
    public static final int DISPLAY_ID_FIELD_NUMBER = 10;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int FROM_SPMID_FIELD_NUMBER = 5;
    private static volatile Parser<ContinuousPlayReq> PARSER = null;
    public static final int PLAYER_ARGS_FIELD_NUMBER = 7;
    public static final int SESSION_ID_FIELD_NUMBER = 9;
    public static final int SPMID_FIELD_NUMBER = 4;
    public static final int TRACKID_FIELD_NUMBER = 3;
    private long aid_;
    private int autoplay_;
    private long deviceType_;
    private long displayId_;
    private PlayerArgs playerArgs_;
    private String from_ = "";
    private String trackid_ = "";
    private String spmid_ = "";
    private String fromSpmid_ = "";
    private String sessionId_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ContinuousPlayReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67451 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16719xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16719xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16719xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16719xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16719xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16719xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16719xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16719xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ContinuousPlayReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67451 c67451) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).clearAid();
            return this;
        }

        public Builder clearAutoplay() {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).clearAutoplay();
            return this;
        }

        public Builder clearDeviceType() {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).clearDeviceType();
            return this;
        }

        public Builder clearDisplayId() {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).clearDisplayId();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).clearFrom();
            return this;
        }

        public Builder clearFromSpmid() {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).clearFromSpmid();
            return this;
        }

        public Builder clearPlayerArgs() {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).clearPlayerArgs();
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).clearSessionId();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).clearSpmid();
            return this;
        }

        public Builder clearTrackid() {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).clearTrackid();
            return this;
        }

        public long getAid() {
            return ((ContinuousPlayReq) this.instance).getAid();
        }

        public int getAutoplay() {
            return ((ContinuousPlayReq) this.instance).getAutoplay();
        }

        public long getDeviceType() {
            return ((ContinuousPlayReq) this.instance).getDeviceType();
        }

        public long getDisplayId() {
            return ((ContinuousPlayReq) this.instance).getDisplayId();
        }

        public String getFrom() {
            return ((ContinuousPlayReq) this.instance).getFrom();
        }

        public ByteString getFromBytes() {
            return ((ContinuousPlayReq) this.instance).getFromBytes();
        }

        public String getFromSpmid() {
            return ((ContinuousPlayReq) this.instance).getFromSpmid();
        }

        public ByteString getFromSpmidBytes() {
            return ((ContinuousPlayReq) this.instance).getFromSpmidBytes();
        }

        public PlayerArgs getPlayerArgs() {
            return ((ContinuousPlayReq) this.instance).getPlayerArgs();
        }

        public String getSessionId() {
            return ((ContinuousPlayReq) this.instance).getSessionId();
        }

        public ByteString getSessionIdBytes() {
            return ((ContinuousPlayReq) this.instance).getSessionIdBytes();
        }

        public String getSpmid() {
            return ((ContinuousPlayReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((ContinuousPlayReq) this.instance).getSpmidBytes();
        }

        public String getTrackid() {
            return ((ContinuousPlayReq) this.instance).getTrackid();
        }

        public ByteString getTrackidBytes() {
            return ((ContinuousPlayReq) this.instance).getTrackidBytes();
        }

        public boolean hasPlayerArgs() {
            return ((ContinuousPlayReq) this.instance).hasPlayerArgs();
        }

        public Builder mergePlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).mergePlayerArgs(playerArgs);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setAid(j);
            return this;
        }

        public Builder setAutoplay(int i) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setAutoplay(i);
            return this;
        }

        public Builder setDeviceType(long j) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setDeviceType(j);
            return this;
        }

        public Builder setDisplayId(long j) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setDisplayId(j);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setFromSpmid(String str) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setFromSpmid(str);
            return this;
        }

        public Builder setFromSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setFromSpmidBytes(byteString);
            return this;
        }

        public Builder setPlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setPlayerArgs(playerArgs);
            return this;
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        public Builder setTrackid(String str) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setTrackid(str);
            return this;
        }

        public Builder setTrackidBytes(ByteString byteString) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setTrackidBytes(byteString);
            return this;
        }

        private Builder() {
            super(ContinuousPlayReq.DEFAULT_INSTANCE);
        }

        public Builder setPlayerArgs(PlayerArgs.Builder builder) {
            copyOnWrite();
            ((ContinuousPlayReq) this.instance).setPlayerArgs(builder.build());
            return this;
        }
    }

    static {
        ContinuousPlayReq continuousPlayReq = new ContinuousPlayReq();
        DEFAULT_INSTANCE = continuousPlayReq;
        GeneratedMessageLite.registerDefaultInstance(ContinuousPlayReq.class, continuousPlayReq);
    }

    private ContinuousPlayReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoplay() {
        this.autoplay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceType() {
        this.deviceType_ = 0L;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackid() {
        this.trackid_ = getDefaultInstance().getTrackid();
    }

    public static ContinuousPlayReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerArgs(PlayerArgs playerArgs) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ContinuousPlayReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContinuousPlayReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContinuousPlayReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContinuousPlayReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ContinuousPlayReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoplay(int i) {
        this.autoplay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceType(long j) {
        this.deviceType_ = j;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackid(String str) {
        str.getClass();
        this.trackid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackid_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67451.f16719xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ContinuousPlayReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0004\u0007\t\b\u0002\t\u0208\n\u0002", new Object[]{"aid_", "from_", "trackid_", "spmid_", "fromSpmid_", "autoplay_", "playerArgs_", "deviceType_", "sessionId_", "displayId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ContinuousPlayReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ContinuousPlayReq.class) {
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

    public int getAutoplay() {
        return this.autoplay_;
    }

    public long getDeviceType() {
        return this.deviceType_;
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

    public String getTrackid() {
        return this.trackid_;
    }

    public ByteString getTrackidBytes() {
        return ByteString.copyFromUtf8(this.trackid_);
    }

    public boolean hasPlayerArgs() {
        return this.playerArgs_ != null;
    }

    public static Builder newBuilder(ContinuousPlayReq continuousPlayReq) {
        return DEFAULT_INSTANCE.createBuilder(continuousPlayReq);
    }

    public static ContinuousPlayReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContinuousPlayReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContinuousPlayReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContinuousPlayReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ContinuousPlayReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContinuousPlayReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ContinuousPlayReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContinuousPlayReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContinuousPlayReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContinuousPlayReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContinuousPlayReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContinuousPlayReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ContinuousPlayReq parseFrom(InputStream inputStream) throws IOException {
        return (ContinuousPlayReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContinuousPlayReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContinuousPlayReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContinuousPlayReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContinuousPlayReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContinuousPlayReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContinuousPlayReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
