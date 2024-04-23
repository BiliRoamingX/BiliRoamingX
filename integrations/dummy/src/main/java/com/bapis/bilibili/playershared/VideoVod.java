package com.bapis.bilibili.playershared;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes23.dex */
public final class VideoVod extends GeneratedMessageLite<VideoVod, VideoVod.b> implements e1 {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int CID_FIELD_NUMBER = 2;
    private static final VideoVod DEFAULT_INSTANCE;
    public static final int DOWNLOAD_FIELD_NUMBER = 6;
    public static final int FNVAL_FIELD_NUMBER = 5;
    public static final int FNVER_FIELD_NUMBER = 4;
    public static final int FORCE_HOST_FIELD_NUMBER = 7;
    public static final int FOURK_FIELD_NUMBER = 8;
    public static final int IS_NEED_TRIAL_FIELD_NUMBER = 11;
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
    private boolean isNeedTrial_;
    private int preferCodecType_;
    private long qn_;
    private long voiceBalance_;

    /* compiled from: BL */
    /* loaded from: classes23.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes23.dex */
    public static final class b extends GeneratedMessageLite.Builder<VideoVod, b> implements e1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b clearAid() {
            copyOnWrite();
            ((VideoVod) this.instance).clearAid();
            return this;
        }

        public b clearCid() {
            copyOnWrite();
            ((VideoVod) this.instance).clearCid();
            return this;
        }

        public b clearDownload() {
            copyOnWrite();
            ((VideoVod) this.instance).clearDownload();
            return this;
        }

        public b clearFnval() {
            copyOnWrite();
            ((VideoVod) this.instance).clearFnval();
            return this;
        }

        public b clearFnver() {
            copyOnWrite();
            ((VideoVod) this.instance).clearFnver();
            return this;
        }

        public b clearForceHost() {
            copyOnWrite();
            ((VideoVod) this.instance).clearForceHost();
            return this;
        }

        public b clearFourk() {
            copyOnWrite();
            ((VideoVod) this.instance).clearFourk();
            return this;
        }

        public b clearIsNeedTrial() {
            copyOnWrite();
            ((VideoVod) this.instance).clearIsNeedTrial();
            return this;
        }

        public b clearPreferCodecType() {
            copyOnWrite();
            ((VideoVod) this.instance).clearPreferCodecType();
            return this;
        }

        public b clearQn() {
            copyOnWrite();
            ((VideoVod) this.instance).clearQn();
            return this;
        }

        public b clearVoiceBalance() {
            copyOnWrite();
            ((VideoVod) this.instance).clearVoiceBalance();
            return this;
        }

        @Override // com.bapis.bilibili.playershared.e1
        public long getAid() {
            return ((VideoVod) this.instance).getAid();
        }

        @Override // com.bapis.bilibili.playershared.e1
        public long getCid() {
            return ((VideoVod) this.instance).getCid();
        }

        @Override // com.bapis.bilibili.playershared.e1
        public int getDownload() {
            return ((VideoVod) this.instance).getDownload();
        }

        @Override // com.bapis.bilibili.playershared.e1
        public int getFnval() {
            return ((VideoVod) this.instance).getFnval();
        }

        @Override // com.bapis.bilibili.playershared.e1
        public int getFnver() {
            return ((VideoVod) this.instance).getFnver();
        }

        @Override // com.bapis.bilibili.playershared.e1
        public int getForceHost() {
            return ((VideoVod) this.instance).getForceHost();
        }

        @Override // com.bapis.bilibili.playershared.e1
        public boolean getFourk() {
            return ((VideoVod) this.instance).getFourk();
        }

        @Override // com.bapis.bilibili.playershared.e1
        public boolean getIsNeedTrial() {
            return ((VideoVod) this.instance).getIsNeedTrial();
        }

        @Override // com.bapis.bilibili.playershared.e1
        public CodeType getPreferCodecType() {
            return ((VideoVod) this.instance).getPreferCodecType();
        }

        @Override // com.bapis.bilibili.playershared.e1
        public int getPreferCodecTypeValue() {
            return ((VideoVod) this.instance).getPreferCodecTypeValue();
        }

        @Override // com.bapis.bilibili.playershared.e1
        public long getQn() {
            return ((VideoVod) this.instance).getQn();
        }

        @Override // com.bapis.bilibili.playershared.e1
        public long getVoiceBalance() {
            return ((VideoVod) this.instance).getVoiceBalance();
        }

        public b setAid(long j14) {
            copyOnWrite();
            ((VideoVod) this.instance).setAid(j14);
            return this;
        }

        public b setCid(long j14) {
            copyOnWrite();
            ((VideoVod) this.instance).setCid(j14);
            return this;
        }

        public b setDownload(int i14) {
            copyOnWrite();
            ((VideoVod) this.instance).setDownload(i14);
            return this;
        }

        public b setFnval(int i14) {
            copyOnWrite();
            ((VideoVod) this.instance).setFnval(i14);
            return this;
        }

        public b setFnver(int i14) {
            copyOnWrite();
            ((VideoVod) this.instance).setFnver(i14);
            return this;
        }

        public b setForceHost(int i14) {
            copyOnWrite();
            ((VideoVod) this.instance).setForceHost(i14);
            return this;
        }

        public b setFourk(boolean z14) {
            copyOnWrite();
            ((VideoVod) this.instance).setFourk(z14);
            return this;
        }

        public b setIsNeedTrial(boolean z14) {
            copyOnWrite();
            ((VideoVod) this.instance).setIsNeedTrial(z14);
            return this;
        }

        public b setPreferCodecType(CodeType codeType) {
            copyOnWrite();
            ((VideoVod) this.instance).setPreferCodecType(codeType);
            return this;
        }

        public b setPreferCodecTypeValue(int i14) {
            copyOnWrite();
            ((VideoVod) this.instance).setPreferCodecTypeValue(i14);
            return this;
        }

        public b setQn(long j14) {
            copyOnWrite();
            ((VideoVod) this.instance).setQn(j14);
            return this;
        }

        public b setVoiceBalance(long j14) {
            copyOnWrite();
            ((VideoVod) this.instance).setVoiceBalance(j14);
            return this;
        }

        private b() {
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
    public void clearIsNeedTrial() {
        this.isNeedTrial_ = false;
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

    public static b newBuilder() {
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
    public void setAid(long j14) {
        this.aid_ = j14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j14) {
        this.cid_ = j14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownload(int i14) {
        this.download_ = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFnval(int i14) {
        this.fnval_ = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFnver(int i14) {
        this.fnver_ = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceHost(int i14) {
        this.forceHost_ = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFourk(boolean z14) {
        this.fourk_ = z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNeedTrial(boolean z14) {
        this.isNeedTrial_ = z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferCodecType(CodeType codeType) {
        this.preferCodecType_ = codeType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferCodecTypeValue(int i14) {
        this.preferCodecType_ = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQn(long j14) {
        this.qn_ = j14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceBalance(long j14) {
        this.voiceBalance_ = j14;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoVod();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0004\u0005\u0004\u0006\u000b\u0007\u0004\b\u0007\t\f\n\u0002\u000b\u0007", new Object[]{"aid_", "cid_", "qn_", "fnver_", "fnval_", "download_", "forceHost_", "fourk_", "preferCodecType_", "voiceBalance_", "isNeedTrial_"});
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

    @Override // com.bapis.bilibili.playershared.e1
    public long getAid() {
        return this.aid_;
    }

    @Override // com.bapis.bilibili.playershared.e1
    public long getCid() {
        return this.cid_;
    }

    @Override // com.bapis.bilibili.playershared.e1
    public int getDownload() {
        return this.download_;
    }

    @Override // com.bapis.bilibili.playershared.e1
    public int getFnval() {
        return this.fnval_;
    }

    @Override // com.bapis.bilibili.playershared.e1
    public int getFnver() {
        return this.fnver_;
    }

    @Override // com.bapis.bilibili.playershared.e1
    public int getForceHost() {
        return this.forceHost_;
    }

    @Override // com.bapis.bilibili.playershared.e1
    public boolean getFourk() {
        return this.fourk_;
    }

    @Override // com.bapis.bilibili.playershared.e1
    public boolean getIsNeedTrial() {
        return this.isNeedTrial_;
    }

    @Override // com.bapis.bilibili.playershared.e1
    public CodeType getPreferCodecType() {
        CodeType forNumber = CodeType.forNumber(this.preferCodecType_);
        if (forNumber == null) {
            return CodeType.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.bapis.bilibili.playershared.e1
    public int getPreferCodecTypeValue() {
        return this.preferCodecType_;
    }

    @Override // com.bapis.bilibili.playershared.e1
    public long getQn() {
        return this.qn_;
    }

    @Override // com.bapis.bilibili.playershared.e1
    public long getVoiceBalance() {
        return this.voiceBalance_;
    }

    public static b newBuilder(VideoVod videoVod) {
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
}
