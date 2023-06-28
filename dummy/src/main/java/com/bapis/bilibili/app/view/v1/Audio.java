package com.bapis.bilibili.app.view.v1;

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
public final class Audio extends GeneratedMessageLite<Audio, Audio.Builder> implements MessageLiteOrBuilder {
    public static final int COVER_URL_FIELD_NUMBER = 2;
    private static final Audio DEFAULT_INSTANCE;
    public static final int ENTRANCE_FIELD_NUMBER = 7;
    private static volatile Parser<Audio> PARSER = null;
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
    /* renamed from: com.bapis.bilibili.app.view.v1.Audio$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67151 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16691xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16691xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16691xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16691xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16691xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16691xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16691xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16691xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Audio, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67151 c67151) {
            this();
        }

        public Builder clearCoverUrl() {
            copyOnWrite();
            ((Audio) this.instance).clearCoverUrl();
            return this;
        }

        public Builder clearEntrance() {
            copyOnWrite();
            ((Audio) this.instance).clearEntrance();
            return this;
        }

        public Builder clearPlayCount() {
            copyOnWrite();
            ((Audio) this.instance).clearPlayCount();
            return this;
        }

        public Builder clearReplyCount() {
            copyOnWrite();
            ((Audio) this.instance).clearReplyCount();
            return this;
        }

        public Builder clearSongAttr() {
            copyOnWrite();
            ((Audio) this.instance).clearSongAttr();
            return this;
        }

        public Builder clearSongId() {
            copyOnWrite();
            ((Audio) this.instance).clearSongId();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Audio) this.instance).clearTitle();
            return this;
        }

        public Builder clearUpperId() {
            copyOnWrite();
            ((Audio) this.instance).clearUpperId();
            return this;
        }

        public String getCoverUrl() {
            return ((Audio) this.instance).getCoverUrl();
        }

        public ByteString getCoverUrlBytes() {
            return ((Audio) this.instance).getCoverUrlBytes();
        }

        public String getEntrance() {
            return ((Audio) this.instance).getEntrance();
        }

        public ByteString getEntranceBytes() {
            return ((Audio) this.instance).getEntranceBytes();
        }

        public long getPlayCount() {
            return ((Audio) this.instance).getPlayCount();
        }

        public long getReplyCount() {
            return ((Audio) this.instance).getReplyCount();
        }

        public long getSongAttr() {
            return ((Audio) this.instance).getSongAttr();
        }

        public long getSongId() {
            return ((Audio) this.instance).getSongId();
        }

        public String getTitle() {
            return ((Audio) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Audio) this.instance).getTitleBytes();
        }

        public long getUpperId() {
            return ((Audio) this.instance).getUpperId();
        }

        public Builder setCoverUrl(String str) {
            copyOnWrite();
            ((Audio) this.instance).setCoverUrl(str);
            return this;
        }

        public Builder setCoverUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Audio) this.instance).setCoverUrlBytes(byteString);
            return this;
        }

        public Builder setEntrance(String str) {
            copyOnWrite();
            ((Audio) this.instance).setEntrance(str);
            return this;
        }

        public Builder setEntranceBytes(ByteString byteString) {
            copyOnWrite();
            ((Audio) this.instance).setEntranceBytes(byteString);
            return this;
        }

        public Builder setPlayCount(long j) {
            copyOnWrite();
            ((Audio) this.instance).setPlayCount(j);
            return this;
        }

        public Builder setReplyCount(long j) {
            copyOnWrite();
            ((Audio) this.instance).setReplyCount(j);
            return this;
        }

        public Builder setSongAttr(long j) {
            copyOnWrite();
            ((Audio) this.instance).setSongAttr(j);
            return this;
        }

        public Builder setSongId(long j) {
            copyOnWrite();
            ((Audio) this.instance).setSongId(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Audio) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Audio) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setUpperId(long j) {
            copyOnWrite();
            ((Audio) this.instance).setUpperId(j);
            return this;
        }

        private Builder() {
            super(Audio.DEFAULT_INSTANCE);
        }
    }

    static {
        Audio audio = new Audio();
        DEFAULT_INSTANCE = audio;
        GeneratedMessageLite.registerDefaultInstance(Audio.class, audio);
    }

    private Audio() {
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

    public static Audio getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Audio parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Audio) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Audio parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Audio> parser() {
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
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67151.f16691xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Audio();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0208\b\u0002", new Object[]{"title_", "coverUrl_", "songId_", "playCount_", "replyCount_", "upperId_", "entrance_", "songAttr_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Audio> parser = PARSER;
                if (parser == null) {
                    synchronized (Audio.class) {
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

    public static Builder newBuilder(Audio audio) {
        return DEFAULT_INSTANCE.createBuilder(audio);
    }

    public static Audio parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Audio) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Audio parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Audio parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Audio parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Audio parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Audio parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Audio parseFrom(InputStream inputStream) throws IOException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Audio parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Audio parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Audio parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
