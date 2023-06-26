package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes14.dex */
public final class VideoMask extends GeneratedMessageLite<VideoMask, VideoMask.Builder> implements MessageLiteOrBuilder {
    public static final int CID_FIELD_NUMBER = 1;
    private static final VideoMask DEFAULT_INSTANCE;
    public static final int FPS_FIELD_NUMBER = 3;
    public static final int MASK_URL_FIELD_NUMBER = 5;
    private static volatile Parser<VideoMask> PARSER = null;
    public static final int PLAT_FIELD_NUMBER = 2;
    public static final int TIME_FIELD_NUMBER = 4;
    private long cid_;
    private int fps_;
    private String maskUrl_ = "";
    private int plat_;
    private long time_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.VideoMask$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72721 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17105xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17105xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17105xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17105xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17105xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17105xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17105xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17105xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<VideoMask, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72721 c72721) {
            this();
        }

        public Builder clearCid() {
            copyOnWrite();
            ((VideoMask) this.instance).clearCid();
            return this;
        }

        public Builder clearFps() {
            copyOnWrite();
            ((VideoMask) this.instance).clearFps();
            return this;
        }

        public Builder clearMaskUrl() {
            copyOnWrite();
            ((VideoMask) this.instance).clearMaskUrl();
            return this;
        }

        public Builder clearPlat() {
            copyOnWrite();
            ((VideoMask) this.instance).clearPlat();
            return this;
        }

        public Builder clearTime() {
            copyOnWrite();
            ((VideoMask) this.instance).clearTime();
            return this;
        }

        public long getCid() {
            return ((VideoMask) this.instance).getCid();
        }

        public int getFps() {
            return ((VideoMask) this.instance).getFps();
        }

        public String getMaskUrl() {
            return ((VideoMask) this.instance).getMaskUrl();
        }

        public ByteString getMaskUrlBytes() {
            return ((VideoMask) this.instance).getMaskUrlBytes();
        }

        public int getPlat() {
            return ((VideoMask) this.instance).getPlat();
        }

        public long getTime() {
            return ((VideoMask) this.instance).getTime();
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((VideoMask) this.instance).setCid(j);
            return this;
        }

        public Builder setFps(int i) {
            copyOnWrite();
            ((VideoMask) this.instance).setFps(i);
            return this;
        }

        public Builder setMaskUrl(String str) {
            copyOnWrite();
            ((VideoMask) this.instance).setMaskUrl(str);
            return this;
        }

        public Builder setMaskUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((VideoMask) this.instance).setMaskUrlBytes(byteString);
            return this;
        }

        public Builder setPlat(int i) {
            copyOnWrite();
            ((VideoMask) this.instance).setPlat(i);
            return this;
        }

        public Builder setTime(long j) {
            copyOnWrite();
            ((VideoMask) this.instance).setTime(j);
            return this;
        }

        private Builder() {
            super(VideoMask.DEFAULT_INSTANCE);
        }
    }

    static {
        VideoMask videoMask = new VideoMask();
        DEFAULT_INSTANCE = videoMask;
        GeneratedMessageLite.registerDefaultInstance(VideoMask.class, videoMask);
    }

    private VideoMask() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFps() {
        this.fps_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaskUrl() {
        this.maskUrl_ = getDefaultInstance().getMaskUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlat() {
        this.plat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0L;
    }

    public static VideoMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VideoMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoMask parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VideoMask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFps(int i) {
        this.fps_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaskUrl(String str) {
        str.getClass();
        this.maskUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaskUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.maskUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlat(int i) {
        this.plat_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j) {
        this.time_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72721.f17105xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoMask();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0002\u0005\u0208", new Object[]{"cid_", "plat_", "fps_", "time_", "maskUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VideoMask> parser = PARSER;
                if (parser == null) {
                    synchronized (VideoMask.class) {
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

    public long getCid() {
        return this.cid_;
    }

    public int getFps() {
        return this.fps_;
    }

    public String getMaskUrl() {
        return this.maskUrl_;
    }

    public ByteString getMaskUrlBytes() {
        return ByteString.copyFromUtf8(this.maskUrl_);
    }

    public int getPlat() {
        return this.plat_;
    }

    public long getTime() {
        return this.time_;
    }

    public static Builder newBuilder(VideoMask videoMask) {
        return DEFAULT_INSTANCE.createBuilder(videoMask);
    }

    public static VideoMask parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoMask parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoMask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VideoMask parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoMask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoMask parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VideoMask parseFrom(InputStream inputStream) throws IOException {
        return (VideoMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoMask parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoMask parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoMask parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
