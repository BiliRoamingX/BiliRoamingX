package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes14.dex */
public final class DashVideo extends GeneratedMessageLite<DashVideo, DashVideo.Builder> implements MessageLiteOrBuilder {
    public static final int AUDIO_ID_FIELD_NUMBER = 7;
    public static final int BACKUP_URL_FIELD_NUMBER = 2;
    public static final int BANDWIDTH_FIELD_NUMBER = 3;
    public static final int BASE_URL_FIELD_NUMBER = 1;
    public static final int CODECID_FIELD_NUMBER = 4;
    private static final DashVideo DEFAULT_INSTANCE;
    public static final int FRAME_RATE_FIELD_NUMBER = 9;
    public static final int HEIGHT_FIELD_NUMBER = 11;
    public static final int MD5_FIELD_NUMBER = 5;
    public static final int NO_REXCODE_FIELD_NUMBER = 8;
    private static volatile Parser<DashVideo> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 6;
    public static final int WIDEVINE_PSSH_FIELD_NUMBER = 12;
    public static final int WIDTH_FIELD_NUMBER = 10;
    private int audioId_;
    private int bandwidth_;
    private int codecid_;
    private int height_;
    private boolean noRexcode_;
    private long size_;
    private int width_;
    private String baseUrl_ = "";
    private Internal.ProtobufList<String> backupUrl_ = GeneratedMessageLite.emptyProtobufList();
    private String md5_ = "";
    private String frameRate_ = "";
    private String widevinePssh_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.DashVideo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78321 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17557xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17557xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17557xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17557xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17557xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17557xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17557xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17557xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DashVideo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78321 c78321) {
            this();
        }

        public Builder addAllBackupUrl(Iterable<String> iterable) {
            copyOnWrite();
            ((DashVideo) this.instance).addAllBackupUrl(iterable);
            return this;
        }

        public Builder addBackupUrl(String str) {
            copyOnWrite();
            ((DashVideo) this.instance).addBackupUrl(str);
            return this;
        }

        public Builder addBackupUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((DashVideo) this.instance).addBackupUrlBytes(byteString);
            return this;
        }

        public Builder clearAudioId() {
            copyOnWrite();
            ((DashVideo) this.instance).clearAudioId();
            return this;
        }

        public Builder clearBackupUrl() {
            copyOnWrite();
            ((DashVideo) this.instance).clearBackupUrl();
            return this;
        }

        public Builder clearBandwidth() {
            copyOnWrite();
            ((DashVideo) this.instance).clearBandwidth();
            return this;
        }

        public Builder clearBaseUrl() {
            copyOnWrite();
            ((DashVideo) this.instance).clearBaseUrl();
            return this;
        }

        public Builder clearCodecid() {
            copyOnWrite();
            ((DashVideo) this.instance).clearCodecid();
            return this;
        }

        public Builder clearFrameRate() {
            copyOnWrite();
            ((DashVideo) this.instance).clearFrameRate();
            return this;
        }

        public Builder clearHeight() {
            copyOnWrite();
            ((DashVideo) this.instance).clearHeight();
            return this;
        }

        public Builder clearMd5() {
            copyOnWrite();
            ((DashVideo) this.instance).clearMd5();
            return this;
        }

        public Builder clearNoRexcode() {
            copyOnWrite();
            ((DashVideo) this.instance).clearNoRexcode();
            return this;
        }

        public Builder clearSize() {
            copyOnWrite();
            ((DashVideo) this.instance).clearSize();
            return this;
        }

        public Builder clearWidevinePssh() {
            copyOnWrite();
            ((DashVideo) this.instance).clearWidevinePssh();
            return this;
        }

        public Builder clearWidth() {
            copyOnWrite();
            ((DashVideo) this.instance).clearWidth();
            return this;
        }

        public int getAudioId() {
            return ((DashVideo) this.instance).getAudioId();
        }

        public String getBackupUrl(int i) {
            return ((DashVideo) this.instance).getBackupUrl(i);
        }

        public ByteString getBackupUrlBytes(int i) {
            return ((DashVideo) this.instance).getBackupUrlBytes(i);
        }

        public int getBackupUrlCount() {
            return ((DashVideo) this.instance).getBackupUrlCount();
        }

        public List<String> getBackupUrlList() {
            return Collections.unmodifiableList(((DashVideo) this.instance).getBackupUrlList());
        }

        public int getBandwidth() {
            return ((DashVideo) this.instance).getBandwidth();
        }

        public String getBaseUrl() {
            return ((DashVideo) this.instance).getBaseUrl();
        }

        public ByteString getBaseUrlBytes() {
            return ((DashVideo) this.instance).getBaseUrlBytes();
        }

        public int getCodecid() {
            return ((DashVideo) this.instance).getCodecid();
        }

        public String getFrameRate() {
            return ((DashVideo) this.instance).getFrameRate();
        }

        public ByteString getFrameRateBytes() {
            return ((DashVideo) this.instance).getFrameRateBytes();
        }

        public int getHeight() {
            return ((DashVideo) this.instance).getHeight();
        }

        public String getMd5() {
            return ((DashVideo) this.instance).getMd5();
        }

        public ByteString getMd5Bytes() {
            return ((DashVideo) this.instance).getMd5Bytes();
        }

        public boolean getNoRexcode() {
            return ((DashVideo) this.instance).getNoRexcode();
        }

        public long getSize() {
            return ((DashVideo) this.instance).getSize();
        }

        public String getWidevinePssh() {
            return ((DashVideo) this.instance).getWidevinePssh();
        }

        public ByteString getWidevinePsshBytes() {
            return ((DashVideo) this.instance).getWidevinePsshBytes();
        }

        public int getWidth() {
            return ((DashVideo) this.instance).getWidth();
        }

        public Builder setAudioId(int i) {
            copyOnWrite();
            ((DashVideo) this.instance).setAudioId(i);
            return this;
        }

        public Builder setBackupUrl(int i, String str) {
            copyOnWrite();
            ((DashVideo) this.instance).setBackupUrl(i, str);
            return this;
        }

        public Builder setBandwidth(int i) {
            copyOnWrite();
            ((DashVideo) this.instance).setBandwidth(i);
            return this;
        }

        public Builder setBaseUrl(String str) {
            copyOnWrite();
            ((DashVideo) this.instance).setBaseUrl(str);
            return this;
        }

        public Builder setBaseUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((DashVideo) this.instance).setBaseUrlBytes(byteString);
            return this;
        }

        public Builder setCodecid(int i) {
            copyOnWrite();
            ((DashVideo) this.instance).setCodecid(i);
            return this;
        }

        public Builder setFrameRate(String str) {
            copyOnWrite();
            ((DashVideo) this.instance).setFrameRate(str);
            return this;
        }

        public Builder setFrameRateBytes(ByteString byteString) {
            copyOnWrite();
            ((DashVideo) this.instance).setFrameRateBytes(byteString);
            return this;
        }

        public Builder setHeight(int i) {
            copyOnWrite();
            ((DashVideo) this.instance).setHeight(i);
            return this;
        }

        public Builder setMd5(String str) {
            copyOnWrite();
            ((DashVideo) this.instance).setMd5(str);
            return this;
        }

        public Builder setMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((DashVideo) this.instance).setMd5Bytes(byteString);
            return this;
        }

        public Builder setNoRexcode(boolean z) {
            copyOnWrite();
            ((DashVideo) this.instance).setNoRexcode(z);
            return this;
        }

        public Builder setSize(long j) {
            copyOnWrite();
            ((DashVideo) this.instance).setSize(j);
            return this;
        }

        public Builder setWidevinePssh(String str) {
            copyOnWrite();
            ((DashVideo) this.instance).setWidevinePssh(str);
            return this;
        }

        public Builder setWidevinePsshBytes(ByteString byteString) {
            copyOnWrite();
            ((DashVideo) this.instance).setWidevinePsshBytes(byteString);
            return this;
        }

        public Builder setWidth(int i) {
            copyOnWrite();
            ((DashVideo) this.instance).setWidth(i);
            return this;
        }

        private Builder() {
            super(DashVideo.DEFAULT_INSTANCE);
        }
    }

    static {
        DashVideo dashVideo = new DashVideo();
        DEFAULT_INSTANCE = dashVideo;
        GeneratedMessageLite.registerDefaultInstance(DashVideo.class, dashVideo);
    }

    public DashVideo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBackupUrl(Iterable<String> iterable) {
        ensureBackupUrlIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.backupUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBackupUrl(String str) {
        str.getClass();
        ensureBackupUrlIsMutable();
        this.backupUrl_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBackupUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureBackupUrlIsMutable();
        this.backupUrl_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioId() {
        this.audioId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackupUrl() {
        this.backupUrl_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBandwidth() {
        this.bandwidth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseUrl() {
        this.baseUrl_ = getDefaultInstance().getBaseUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodecid() {
        this.codecid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrameRate() {
        this.frameRate_ = getDefaultInstance().getFrameRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMd5() {
        this.md5_ = getDefaultInstance().getMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoRexcode() {
        this.noRexcode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidevinePssh() {
        this.widevinePssh_ = getDefaultInstance().getWidevinePssh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    private void ensureBackupUrlIsMutable() {
        Internal.ProtobufList<String> protobufList = this.backupUrl_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.backupUrl_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DashVideo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DashVideo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DashVideo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DashVideo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DashVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DashVideo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioId(int i) {
        this.audioId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackupUrl(int i, String str) {
        str.getClass();
        ensureBackupUrlIsMutable();
        this.backupUrl_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBandwidth(int i) {
        this.bandwidth_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseUrl(String str) {
        str.getClass();
        this.baseUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.baseUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodecid(int i) {
        this.codecid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameRate(String str) {
        str.getClass();
        this.frameRate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameRateBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.frameRate_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i) {
        this.height_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMd5(String str) {
        str.getClass();
        this.md5_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMd5Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.md5_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoRexcode(boolean z) {
        this.noRexcode_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(long j) {
        this.size_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidevinePssh(String str) {
        str.getClass();
        this.widevinePssh_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidevinePsshBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.widevinePssh_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i) {
        this.width_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78321.f17557xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DashVideo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\u0208\u0002\u021a\u0003\u000b\u0004\u000b\u0005\u0208\u0006\u0003\u0007\u000b\b\u0007\t\u0208\n\u000b\u000b\u000b\f\u0208", new Object[]{"baseUrl_", "backupUrl_", "bandwidth_", "codecid_", "md5_", "size_", "audioId_", "noRexcode_", "frameRate_", "width_", "height_", "widevinePssh_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DashVideo> parser = PARSER;
                if (parser == null) {
                    synchronized (DashVideo.class) {
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

    public int getAudioId() {
        return this.audioId_;
    }

    public String getBackupUrl(int i) {
        return this.backupUrl_.get(i);
    }

    public ByteString getBackupUrlBytes(int i) {
        return ByteString.copyFromUtf8(this.backupUrl_.get(i));
    }

    public int getBackupUrlCount() {
        return this.backupUrl_.size();
    }

    public List<String> getBackupUrlList() {
        return this.backupUrl_;
    }

    public int getBandwidth() {
        return this.bandwidth_;
    }

    public String getBaseUrl() {
        return this.baseUrl_;
    }

    public ByteString getBaseUrlBytes() {
        return ByteString.copyFromUtf8(this.baseUrl_);
    }

    public int getCodecid() {
        return this.codecid_;
    }

    public String getFrameRate() {
        return this.frameRate_;
    }

    public ByteString getFrameRateBytes() {
        return ByteString.copyFromUtf8(this.frameRate_);
    }

    public int getHeight() {
        return this.height_;
    }

    public String getMd5() {
        return this.md5_;
    }

    public ByteString getMd5Bytes() {
        return ByteString.copyFromUtf8(this.md5_);
    }

    public boolean getNoRexcode() {
        return this.noRexcode_;
    }

    public long getSize() {
        return this.size_;
    }

    public String getWidevinePssh() {
        return this.widevinePssh_;
    }

    public ByteString getWidevinePsshBytes() {
        return ByteString.copyFromUtf8(this.widevinePssh_);
    }

    public int getWidth() {
        return this.width_;
    }

    public static Builder newBuilder(DashVideo dashVideo) {
        return DEFAULT_INSTANCE.createBuilder(dashVideo);
    }

    public static DashVideo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DashVideo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DashVideo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DashVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DashVideo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DashVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DashVideo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DashVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DashVideo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DashVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DashVideo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DashVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DashVideo parseFrom(InputStream inputStream) throws IOException {
        return (DashVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DashVideo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DashVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DashVideo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DashVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DashVideo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DashVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
