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
public final class AudioInfo extends GeneratedMessageLite<AudioInfo, AudioInfo.Builder> implements MessageLiteOrBuilder {
    public static final int COVER_URL_FIELD_NUMBER = 2;
    private static final AudioInfo DEFAULT_INSTANCE;
    public static final int ENTRANCE_FIELD_NUMBER = 7;
    private static volatile Parser<AudioInfo> PARSER = null;
    public static final int PLAY_COUNT_FIELD_NUMBER = 4;
    public static final int REPLY_COUNT_FIELD_NUMBER = 5;
    public static final int SONG_ATTR_FIELD_NUMBER = 8;
    public static final int SONG_ID_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int UPPER_ID_FIELD_NUMBER = 6;
    private long playCount_;
    private long replyCount_;
    private long songAttr_;
    private long songId_;
    private long upperId_;
    private String title_ = "";
    private String coverUrl_ = "";
    private String entrance_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.AudioInfo$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69771 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16964xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16964xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16964xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16964xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16964xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16964xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16964xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16964xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AudioInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69771 c69771) {
            this();
        }

        public Builder clearCoverUrl() {
            copyOnWrite();
            ((AudioInfo) this.instance).clearCoverUrl();
            return this;
        }

        public Builder clearEntrance() {
            copyOnWrite();
            ((AudioInfo) this.instance).clearEntrance();
            return this;
        }

        public Builder clearPlayCount() {
            copyOnWrite();
            ((AudioInfo) this.instance).clearPlayCount();
            return this;
        }

        public Builder clearReplyCount() {
            copyOnWrite();
            ((AudioInfo) this.instance).clearReplyCount();
            return this;
        }

        public Builder clearSongAttr() {
            copyOnWrite();
            ((AudioInfo) this.instance).clearSongAttr();
            return this;
        }

        public Builder clearSongId() {
            copyOnWrite();
            ((AudioInfo) this.instance).clearSongId();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((AudioInfo) this.instance).clearTitle();
            return this;
        }

        public Builder clearUpperId() {
            copyOnWrite();
            ((AudioInfo) this.instance).clearUpperId();
            return this;
        }

        public String getCoverUrl() {
            return ((AudioInfo) this.instance).getCoverUrl();
        }

        public ByteString getCoverUrlBytes() {
            return ((AudioInfo) this.instance).getCoverUrlBytes();
        }

        public String getEntrance() {
            return ((AudioInfo) this.instance).getEntrance();
        }

        public ByteString getEntranceBytes() {
            return ((AudioInfo) this.instance).getEntranceBytes();
        }

        public long getPlayCount() {
            return ((AudioInfo) this.instance).getPlayCount();
        }

        public long getReplyCount() {
            return ((AudioInfo) this.instance).getReplyCount();
        }

        public long getSongAttr() {
            return ((AudioInfo) this.instance).getSongAttr();
        }

        public long getSongId() {
            return ((AudioInfo) this.instance).getSongId();
        }

        public String getTitle() {
            return ((AudioInfo) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((AudioInfo) this.instance).getTitleBytes();
        }

        public long getUpperId() {
            return ((AudioInfo) this.instance).getUpperId();
        }

        public Builder setCoverUrl(String str) {
            copyOnWrite();
            ((AudioInfo) this.instance).setCoverUrl(str);
            return this;
        }

        public Builder setCoverUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((AudioInfo) this.instance).setCoverUrlBytes(byteString);
            return this;
        }

        public Builder setEntrance(String str) {
            copyOnWrite();
            ((AudioInfo) this.instance).setEntrance(str);
            return this;
        }

        public Builder setEntranceBytes(ByteString byteString) {
            copyOnWrite();
            ((AudioInfo) this.instance).setEntranceBytes(byteString);
            return this;
        }

        public Builder setPlayCount(long j) {
            copyOnWrite();
            ((AudioInfo) this.instance).setPlayCount(j);
            return this;
        }

        public Builder setReplyCount(long j) {
            copyOnWrite();
            ((AudioInfo) this.instance).setReplyCount(j);
            return this;
        }

        public Builder setSongAttr(long j) {
            copyOnWrite();
            ((AudioInfo) this.instance).setSongAttr(j);
            return this;
        }

        public Builder setSongId(long j) {
            copyOnWrite();
            ((AudioInfo) this.instance).setSongId(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((AudioInfo) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((AudioInfo) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setUpperId(long j) {
            copyOnWrite();
            ((AudioInfo) this.instance).setUpperId(j);
            return this;
        }

        private Builder() {
            super(AudioInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        AudioInfo audioInfo = new AudioInfo();
        DEFAULT_INSTANCE = audioInfo;
        GeneratedMessageLite.registerDefaultInstance(AudioInfo.class, audioInfo);
    }

    private AudioInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverUrl() {
        this.coverUrl_ = getDefaultInstance().getCoverUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntrance() {
        this.entrance_ = getDefaultInstance().getEntrance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayCount() {
        this.playCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplyCount() {
        this.replyCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSongAttr() {
        this.songAttr_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSongId() {
        this.songId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpperId() {
        this.upperId_ = 0L;
    }

    public static AudioInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AudioInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AudioInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AudioInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverUrl(String str) {
        str.getClass();
        this.coverUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntrance(String str) {
        str.getClass();
        this.entrance_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntranceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.entrance_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayCount(long j) {
        this.playCount_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplyCount(long j) {
        this.replyCount_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSongAttr(long j) {
        this.songAttr_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSongId(long j) {
        this.songId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpperId(long j) {
        this.upperId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69771.f16964xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AudioInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0208\b\u0002", new Object[]{"title_", "coverUrl_", "songId_", "playCount_", "replyCount_", "upperId_", "entrance_", "songAttr_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AudioInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (AudioInfo.class) {
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

    public String getCoverUrl() {
        return this.coverUrl_;
    }

    public ByteString getCoverUrlBytes() {
        return ByteString.copyFromUtf8(this.coverUrl_);
    }

    public String getEntrance() {
        return this.entrance_;
    }

    public ByteString getEntranceBytes() {
        return ByteString.copyFromUtf8(this.entrance_);
    }

    public long getPlayCount() {
        return this.playCount_;
    }

    public long getReplyCount() {
        return this.replyCount_;
    }

    public long getSongAttr() {
        return this.songAttr_;
    }

    public long getSongId() {
        return this.songId_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public long getUpperId() {
        return this.upperId_;
    }

    public static Builder newBuilder(AudioInfo audioInfo) {
        return DEFAULT_INSTANCE.createBuilder(audioInfo);
    }

    public static AudioInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AudioInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AudioInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AudioInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AudioInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AudioInfo parseFrom(InputStream inputStream) throws IOException {
        return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AudioInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
