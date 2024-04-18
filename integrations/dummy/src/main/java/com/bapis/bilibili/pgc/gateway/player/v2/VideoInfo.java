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
public final class VideoInfo extends GeneratedMessageLite<VideoInfo, VideoInfo.Builder> implements MessageLiteOrBuilder {
    public static final int DASH_AUDIO_FIELD_NUMBER = 6;
    private static final VideoInfo DEFAULT_INSTANCE;
    public static final int DOLBY_FIELD_NUMBER = 7;
    public static final int FORMAT_FIELD_NUMBER = 2;
    private static volatile Parser<VideoInfo> PARSER = null;
    public static final int QUALITY_FIELD_NUMBER = 1;
    public static final int STREAM_LIST_FIELD_NUMBER = 5;
    public static final int TIMELENGTH_FIELD_NUMBER = 3;
    public static final int VIDEO_CODECID_FIELD_NUMBER = 4;
    private DolbyItem dolby_;
    private int quality_;
    private long timelength_;
    private int videoCodecid_;
    private String format_ = "";
    private Internal.ProtobufList<Stream> streamList_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<DashItem> dashAudio_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.VideoInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78931 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17606xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17606xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17606xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17606xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17606xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17606xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17606xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17606xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<VideoInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78931 c78931) {
            this();
        }

        public Builder addAllDashAudio(Iterable<? extends DashItem> iterable) {
            copyOnWrite();
            ((VideoInfo) this.instance).addAllDashAudio(iterable);
            return this;
        }

        public Builder addAllStreamList(Iterable<? extends Stream> iterable) {
            copyOnWrite();
            ((VideoInfo) this.instance).addAllStreamList(iterable);
            return this;
        }

        public Builder addDashAudio(DashItem dashItem) {
            copyOnWrite();
            ((VideoInfo) this.instance).addDashAudio(dashItem);
            return this;
        }

        public Builder addStreamList(Stream stream) {
            copyOnWrite();
            ((VideoInfo) this.instance).addStreamList(stream);
            return this;
        }

        public Builder clearDashAudio() {
            copyOnWrite();
            ((VideoInfo) this.instance).clearDashAudio();
            return this;
        }

        public Builder clearDolby() {
            copyOnWrite();
            ((VideoInfo) this.instance).clearDolby();
            return this;
        }

        public Builder clearFormat() {
            copyOnWrite();
            ((VideoInfo) this.instance).clearFormat();
            return this;
        }

        public Builder clearQuality() {
            copyOnWrite();
            ((VideoInfo) this.instance).clearQuality();
            return this;
        }

        public Builder clearStreamList() {
            copyOnWrite();
            ((VideoInfo) this.instance).clearStreamList();
            return this;
        }

        public Builder clearTimelength() {
            copyOnWrite();
            ((VideoInfo) this.instance).clearTimelength();
            return this;
        }

        public Builder clearVideoCodecid() {
            copyOnWrite();
            ((VideoInfo) this.instance).clearVideoCodecid();
            return this;
        }

        public DashItem getDashAudio(int i) {
            return ((VideoInfo) this.instance).getDashAudio(i);
        }

        public int getDashAudioCount() {
            return ((VideoInfo) this.instance).getDashAudioCount();
        }

        public List<DashItem> getDashAudioList() {
            return Collections.unmodifiableList(((VideoInfo) this.instance).getDashAudioList());
        }

        public DolbyItem getDolby() {
            return ((VideoInfo) this.instance).getDolby();
        }

        public String getFormat() {
            return ((VideoInfo) this.instance).getFormat();
        }

        public ByteString getFormatBytes() {
            return ((VideoInfo) this.instance).getFormatBytes();
        }

        public int getQuality() {
            return ((VideoInfo) this.instance).getQuality();
        }

        public Stream getStreamList(int i) {
            return ((VideoInfo) this.instance).getStreamList(i);
        }

        public int getStreamListCount() {
            return ((VideoInfo) this.instance).getStreamListCount();
        }

        public List<Stream> getStreamListList() {
            return Collections.unmodifiableList(((VideoInfo) this.instance).getStreamListList());
        }

        public long getTimelength() {
            return ((VideoInfo) this.instance).getTimelength();
        }

        public int getVideoCodecid() {
            return ((VideoInfo) this.instance).getVideoCodecid();
        }

        public boolean hasDolby() {
            return ((VideoInfo) this.instance).hasDolby();
        }

        public Builder mergeDolby(DolbyItem dolbyItem) {
            copyOnWrite();
            ((VideoInfo) this.instance).mergeDolby(dolbyItem);
            return this;
        }

        public Builder removeDashAudio(int i) {
            copyOnWrite();
            ((VideoInfo) this.instance).removeDashAudio(i);
            return this;
        }

        public Builder removeStreamList(int i) {
            copyOnWrite();
            ((VideoInfo) this.instance).removeStreamList(i);
            return this;
        }

        public Builder setDashAudio(int i, DashItem dashItem) {
            copyOnWrite();
            ((VideoInfo) this.instance).setDashAudio(i, dashItem);
            return this;
        }

        public Builder setDolby(DolbyItem dolbyItem) {
            copyOnWrite();
            ((VideoInfo) this.instance).setDolby(dolbyItem);
            return this;
        }

        public Builder setFormat(String str) {
            copyOnWrite();
            ((VideoInfo) this.instance).setFormat(str);
            return this;
        }

        public Builder setFormatBytes(ByteString byteString) {
            copyOnWrite();
            ((VideoInfo) this.instance).setFormatBytes(byteString);
            return this;
        }

        public Builder setQuality(int i) {
            copyOnWrite();
            ((VideoInfo) this.instance).setQuality(i);
            return this;
        }

        public Builder setStreamList(int i, Stream stream) {
            copyOnWrite();
            ((VideoInfo) this.instance).setStreamList(i, stream);
            return this;
        }

        public Builder setTimelength(long j) {
            copyOnWrite();
            ((VideoInfo) this.instance).setTimelength(j);
            return this;
        }

        public Builder setVideoCodecid(int i) {
            copyOnWrite();
            ((VideoInfo) this.instance).setVideoCodecid(i);
            return this;
        }

        private Builder() {
            super(VideoInfo.DEFAULT_INSTANCE);
        }

        public Builder addDashAudio(int i, DashItem dashItem) {
            copyOnWrite();
            ((VideoInfo) this.instance).addDashAudio(i, dashItem);
            return this;
        }

        public Builder addStreamList(int i, Stream stream) {
            copyOnWrite();
            ((VideoInfo) this.instance).addStreamList(i, stream);
            return this;
        }

        public Builder setDashAudio(int i, DashItem.Builder builder) {
            copyOnWrite();
            ((VideoInfo) this.instance).setDashAudio(i, builder.build());
            return this;
        }

        public Builder setDolby(DolbyItem.Builder builder) {
            copyOnWrite();
            ((VideoInfo) this.instance).setDolby(builder.build());
            return this;
        }

        public Builder setStreamList(int i, Stream.Builder builder) {
            copyOnWrite();
            ((VideoInfo) this.instance).setStreamList(i, builder.build());
            return this;
        }

        public Builder addDashAudio(DashItem.Builder builder) {
            copyOnWrite();
            ((VideoInfo) this.instance).addDashAudio(builder.build());
            return this;
        }

        public Builder addStreamList(Stream.Builder builder) {
            copyOnWrite();
            ((VideoInfo) this.instance).addStreamList(builder.build());
            return this;
        }

        public Builder addDashAudio(int i, DashItem.Builder builder) {
            copyOnWrite();
            ((VideoInfo) this.instance).addDashAudio(i, builder.build());
            return this;
        }

        public Builder addStreamList(int i, Stream.Builder builder) {
            copyOnWrite();
            ((VideoInfo) this.instance).addStreamList(i, builder.build());
            return this;
        }
    }

    static {
        VideoInfo videoInfo = new VideoInfo();
        DEFAULT_INSTANCE = videoInfo;
        GeneratedMessageLite.registerDefaultInstance(VideoInfo.class, videoInfo);
    }

    public VideoInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDashAudio(Iterable<? extends DashItem> iterable) {
        ensureDashAudioIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.dashAudio_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStreamList(Iterable<? extends Stream> iterable) {
        ensureStreamListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.streamList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDashAudio(DashItem dashItem) {
        dashItem.getClass();
        ensureDashAudioIsMutable();
        this.dashAudio_.add(dashItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamList(Stream stream) {
        stream.getClass();
        ensureStreamListIsMutable();
        this.streamList_.add(stream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDashAudio() {
        this.dashAudio_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDolby() {
        this.dolby_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFormat() {
        this.format_ = getDefaultInstance().getFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuality() {
        this.quality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamList() {
        this.streamList_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimelength() {
        this.timelength_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoCodecid() {
        this.videoCodecid_ = 0;
    }

    private void ensureDashAudioIsMutable() {
        Internal.ProtobufList<DashItem> protobufList = this.dashAudio_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.dashAudio_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureStreamListIsMutable() {
        Internal.ProtobufList<Stream> protobufList = this.streamList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.streamList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static VideoInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDolby(DolbyItem dolbyItem) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VideoInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VideoInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDashAudio(int i) {
        ensureDashAudioIsMutable();
        this.dashAudio_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStreamList(int i) {
        ensureStreamListIsMutable();
        this.streamList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDashAudio(int i, DashItem dashItem) {
        dashItem.getClass();
        ensureDashAudioIsMutable();
        this.dashAudio_.set(i, dashItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDolby(DolbyItem dolbyItem) {
        dolbyItem.getClass();
        this.dolby_ = dolbyItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFormat(String str) {
        str.getClass();
        this.format_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFormatBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.format_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuality(int i) {
        this.quality_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamList(int i, Stream stream) {
        stream.getClass();
        ensureStreamListIsMutable();
        this.streamList_.set(i, stream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimelength(long j) {
        this.timelength_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoCodecid(int i) {
        this.videoCodecid_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78931.f17606xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u000b\u0002\u0208\u0003\u0003\u0004\u000b\u0005\u001b\u0006\u001b\u0007\t", new Object[]{"quality_", "format_", "timelength_", "videoCodecid_", "streamList_", Stream.class, "dashAudio_", DashItem.class, "dolby_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VideoInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (VideoInfo.class) {
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

    public DashItem getDashAudio(int i) {
        return this.dashAudio_.get(i);
    }

    public int getDashAudioCount() {
        return this.dashAudio_.size();
    }

    public List<DashItem> getDashAudioList() {
        return this.dashAudio_;
    }

    public DashItemOrBuilder getDashAudioOrBuilder(int i) {
        return this.dashAudio_.get(i);
    }

    public List<? extends DashItemOrBuilder> getDashAudioOrBuilderList() {
        return this.dashAudio_;
    }

    public DolbyItem getDolby() {
        DolbyItem dolbyItem = this.dolby_;
        return dolbyItem == null ? DolbyItem.getDefaultInstance() : dolbyItem;
    }

    public String getFormat() {
        return this.format_;
    }

    public ByteString getFormatBytes() {
        return ByteString.copyFromUtf8(this.format_);
    }

    public int getQuality() {
        return this.quality_;
    }

    public Stream getStreamList(int i) {
        return this.streamList_.get(i);
    }

    public int getStreamListCount() {
        return this.streamList_.size();
    }

    public List<Stream> getStreamListList() {
        return this.streamList_;
    }

    public StreamOrBuilder getStreamListOrBuilder(int i) {
        return this.streamList_.get(i);
    }

    public List<? extends StreamOrBuilder> getStreamListOrBuilderList() {
        return this.streamList_;
    }

    public long getTimelength() {
        return this.timelength_;
    }

    public int getVideoCodecid() {
        return this.videoCodecid_;
    }

    public boolean hasDolby() {
        return this.dolby_ != null;
    }

    public static Builder newBuilder(VideoInfo videoInfo) {
        return DEFAULT_INSTANCE.createBuilder(videoInfo);
    }

    public static VideoInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDashAudio(int i, DashItem dashItem) {
        dashItem.getClass();
        ensureDashAudioIsMutable();
        this.dashAudio_.add(i, dashItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamList(int i, Stream stream) {
        stream.getClass();
        ensureStreamListIsMutable();
        this.streamList_.add(i, stream);
    }

    public static VideoInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VideoInfo parseFrom(InputStream inputStream) throws IOException {
        return (VideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
