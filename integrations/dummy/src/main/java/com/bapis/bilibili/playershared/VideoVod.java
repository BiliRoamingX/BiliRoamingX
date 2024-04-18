package com.bapis.bilibili.playershared;

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
/* loaded from: classes14.dex */
public final class VideoVod extends GeneratedMessageLite<VideoVod, VideoVod.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int CID_FIELD_NUMBER = 2;
    private static final VideoVod DEFAULT_INSTANCE;
    public static final int DOWNLOAD_FIELD_NUMBER = 6;
    public static final int FNVAL_FIELD_NUMBER = 5;
    public static final int FNVER_FIELD_NUMBER = 4;
    public static final int FORCE_HOST_FIELD_NUMBER = 7;
    public static final int FOURK_FIELD_NUMBER = 8;
    private static volatile Parser<VideoVod> PARSER = null;
    public static final int PREFER_CODEC_TYPE_FIELD_NUMBER = 9;
    public static final int QN_FIELD_NUMBER = 3;
    public static final int VOICE_BALANCE_FIELD_NUMBER = 10;
    private long aid_;
    private long cid_;
    private int download_;
    private int fnval_;
    private int fnver_;
    private int forceHost_;
    private boolean fourk_;
    private int preferCodecType_;
    private long qn_;
    private long voiceBalance_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.VideoVod$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C79331 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17636xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17636xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17636xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17636xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17636xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17636xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17636xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17636xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<VideoVod, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C79331 c79331) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((VideoVod) this.instance).clearAid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((VideoVod) this.instance).clearCid();
            return this;
        }

        public Builder clearDownload() {
            copyOnWrite();
            ((VideoVod) this.instance).clearDownload();
            return this;
        }

        public Builder clearFnval() {
            copyOnWrite();
            ((VideoVod) this.instance).clearFnval();
            return this;
        }

        public Builder clearFnver() {
            copyOnWrite();
            ((VideoVod) this.instance).clearFnver();
            return this;
        }

        public Builder clearForceHost() {
            copyOnWrite();
            ((VideoVod) this.instance).clearForceHost();
            return this;
        }

        public Builder clearFourk() {
            copyOnWrite();
            ((VideoVod) this.instance).clearFourk();
            return this;
        }

        public Builder clearPreferCodecType() {
            copyOnWrite();
            ((VideoVod) this.instance).clearPreferCodecType();
            return this;
        }

        public Builder clearQn() {
            copyOnWrite();
            ((VideoVod) this.instance).clearQn();
            return this;
        }

        public Builder clearVoiceBalance() {
            copyOnWrite();
            ((VideoVod) this.instance).clearVoiceBalance();
            return this;
        }

        public long getAid() {
            return ((VideoVod) this.instance).getAid();
        }

        public long getCid() {
            return ((VideoVod) this.instance).getCid();
        }

        public int getDownload() {
            return ((VideoVod) this.instance).getDownload();
        }

        public int getFnval() {
            return ((VideoVod) this.instance).getFnval();
        }

        public int getFnver() {
            return ((VideoVod) this.instance).getFnver();
        }

        public int getForceHost() {
            return ((VideoVod) this.instance).getForceHost();
        }

        public boolean getFourk() {
            return ((VideoVod) this.instance).getFourk();
        }

        public CodeType getPreferCodecType() {
            return ((VideoVod) this.instance).getPreferCodecType();
        }

        public int getPreferCodecTypeValue() {
            return ((VideoVod) this.instance).getPreferCodecTypeValue();
        }

        public long getQn() {
            return ((VideoVod) this.instance).getQn();
        }

        public long getVoiceBalance() {
            return ((VideoVod) this.instance).getVoiceBalance();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((VideoVod) this.instance).setAid(j);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((VideoVod) this.instance).setCid(j);
            return this;
        }

        public Builder setDownload(int i) {
            copyOnWrite();
            ((VideoVod) this.instance).setDownload(i);
            return this;
        }

        public Builder setFnval(int i) {
            copyOnWrite();
            ((VideoVod) this.instance).setFnval(i);
            return this;
        }

        public Builder setFnver(int i) {
            copyOnWrite();
            ((VideoVod) this.instance).setFnver(i);
            return this;
        }

        public Builder setForceHost(int i) {
            copyOnWrite();
            ((VideoVod) this.instance).setForceHost(i);
            return this;
        }

        public Builder setFourk(boolean z) {
            copyOnWrite();
            ((VideoVod) this.instance).setFourk(z);
            return this;
        }

        public Builder setPreferCodecType(CodeType codeType) {
            copyOnWrite();
            ((VideoVod) this.instance).setPreferCodecType(codeType);
            return this;
        }

        public Builder setPreferCodecTypeValue(int i) {
            copyOnWrite();
            ((VideoVod) this.instance).setPreferCodecTypeValue(i);
            return this;
        }

        public Builder setQn(long j) {
            copyOnWrite();
            ((VideoVod) this.instance).setQn(j);
            return this;
        }

        public Builder setVoiceBalance(long j) {
            copyOnWrite();
            ((VideoVod) this.instance).setVoiceBalance(j);
            return this;
        }

        private Builder() {
            super(VideoVod.DEFAULT_INSTANCE);
        }
    }

    static {
        VideoVod videoVod = new VideoVod();
        DEFAULT_INSTANCE = videoVod;
        GeneratedMessageLite.registerDefaultInstance(VideoVod.class, videoVod);
    }

    private VideoVod() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownload() {
        this.download_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFnval() {
        this.fnval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFnver() {
        this.fnver_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForceHost() {
        this.forceHost_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFourk() {
        this.fourk_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreferCodecType() {
        this.preferCodecType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQn() {
        this.qn_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceBalance() {
        this.voiceBalance_ = 0L;
    }

    public static VideoVod getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VideoVod parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoVod) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoVod parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoVod) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VideoVod> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownload(int i) {
        this.download_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFnval(int i) {
        this.fnval_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFnver(int i) {
        this.fnver_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceHost(int i) {
        this.forceHost_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFourk(boolean z) {
        this.fourk_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferCodecType(CodeType codeType) {
        this.preferCodecType_ = codeType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferCodecTypeValue(int i) {
        this.preferCodecType_ = i;
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
        switch (C79331.f17636xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoVod();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0004\u0005\u0004\u0006\u000b\u0007\u0004\b\u0007\t\f\n\u0002", new Object[]{"aid_", "cid_", "qn_", "fnver_", "fnval_", "download_", "forceHost_", "fourk_", "preferCodecType_", "voiceBalance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VideoVod> parser = PARSER;
                if (parser == null) {
                    synchronized (VideoVod.class) {
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

    public long getAid() {
        return this.aid_;
    }

    public long getCid() {
        return this.cid_;
    }

    public int getDownload() {
        return this.download_;
    }

    public int getFnval() {
        return this.fnval_;
    }

    public int getFnver() {
        return this.fnver_;
    }

    public int getForceHost() {
        return this.forceHost_;
    }

    public boolean getFourk() {
        return this.fourk_;
    }

    public CodeType getPreferCodecType() {
        CodeType forNumber = CodeType.forNumber(this.preferCodecType_);
        return forNumber == null ? CodeType.UNRECOGNIZED : forNumber;
    }

    public int getPreferCodecTypeValue() {
        return this.preferCodecType_;
    }

    public long getQn() {
        return this.qn_;
    }

    public long getVoiceBalance() {
        return this.voiceBalance_;
    }

    public static Builder newBuilder(VideoVod videoVod) {
        return DEFAULT_INSTANCE.createBuilder(videoVod);
    }

    public static VideoVod parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoVod) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoVod parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoVod) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoVod parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoVod) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VideoVod parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoVod) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoVod parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoVod) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoVod parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoVod) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VideoVod parseFrom(InputStream inputStream) throws IOException {
        return (VideoVod) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoVod parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoVod) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoVod parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoVod) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoVod parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoVod) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * setQn(long)
     */
    static void access$500(VideoVod videoVod, long qn) {
    }

    /**
     * setFnval(int)
     */
    static void access$900(VideoVod videoVod, int fnval) {
    }

    /**
     * setDownload(int)
     */
    static void access$1100(VideoVod videoVod, int download) {
    }

    /**
     * setFourk(boolean)
     */
    static void access$1500(VideoVod videoVod, boolean fourk) {
    }
}
