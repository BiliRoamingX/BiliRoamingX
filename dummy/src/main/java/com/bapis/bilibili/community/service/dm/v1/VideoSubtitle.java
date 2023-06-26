package com.bapis.bilibili.community.service.dm.v1;

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
public final class VideoSubtitle extends GeneratedMessageLite<VideoSubtitle, VideoSubtitle.Builder> implements MessageLiteOrBuilder {
    private static final VideoSubtitle DEFAULT_INSTANCE;
    public static final int LAN_DOC_FIELD_NUMBER = 2;
    public static final int LAN_FIELD_NUMBER = 1;
    private static volatile Parser<VideoSubtitle> PARSER = null;
    public static final int SUBTITLES_FIELD_NUMBER = 3;
    private String lan_ = "";
    private String lanDoc_ = "";
    private Internal.ProtobufList<SubtitleItem> subtitles_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.VideoSubtitle$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72731 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17106xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17106xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17106xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17106xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17106xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17106xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17106xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17106xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<VideoSubtitle, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72731 c72731) {
            this();
        }

        public Builder addAllSubtitles(Iterable<? extends SubtitleItem> iterable) {
            copyOnWrite();
            ((VideoSubtitle) this.instance).addAllSubtitles(iterable);
            return this;
        }

        public Builder addSubtitles(SubtitleItem subtitleItem) {
            copyOnWrite();
            ((VideoSubtitle) this.instance).addSubtitles(subtitleItem);
            return this;
        }

        public Builder clearLan() {
            copyOnWrite();
            ((VideoSubtitle) this.instance).clearLan();
            return this;
        }

        public Builder clearLanDoc() {
            copyOnWrite();
            ((VideoSubtitle) this.instance).clearLanDoc();
            return this;
        }

        public Builder clearSubtitles() {
            copyOnWrite();
            ((VideoSubtitle) this.instance).clearSubtitles();
            return this;
        }

        public String getLan() {
            return ((VideoSubtitle) this.instance).getLan();
        }

        public ByteString getLanBytes() {
            return ((VideoSubtitle) this.instance).getLanBytes();
        }

        public String getLanDoc() {
            return ((VideoSubtitle) this.instance).getLanDoc();
        }

        public ByteString getLanDocBytes() {
            return ((VideoSubtitle) this.instance).getLanDocBytes();
        }

        public SubtitleItem getSubtitles(int i) {
            return ((VideoSubtitle) this.instance).getSubtitles(i);
        }

        public int getSubtitlesCount() {
            return ((VideoSubtitle) this.instance).getSubtitlesCount();
        }

        public List<SubtitleItem> getSubtitlesList() {
            return Collections.unmodifiableList(((VideoSubtitle) this.instance).getSubtitlesList());
        }

        public Builder removeSubtitles(int i) {
            copyOnWrite();
            ((VideoSubtitle) this.instance).removeSubtitles(i);
            return this;
        }

        public Builder setLan(String str) {
            copyOnWrite();
            ((VideoSubtitle) this.instance).setLan(str);
            return this;
        }

        public Builder setLanBytes(ByteString byteString) {
            copyOnWrite();
            ((VideoSubtitle) this.instance).setLanBytes(byteString);
            return this;
        }

        public Builder setLanDoc(String str) {
            copyOnWrite();
            ((VideoSubtitle) this.instance).setLanDoc(str);
            return this;
        }

        public Builder setLanDocBytes(ByteString byteString) {
            copyOnWrite();
            ((VideoSubtitle) this.instance).setLanDocBytes(byteString);
            return this;
        }

        public Builder setSubtitles(int i, SubtitleItem subtitleItem) {
            copyOnWrite();
            ((VideoSubtitle) this.instance).setSubtitles(i, subtitleItem);
            return this;
        }

        private Builder() {
            super(VideoSubtitle.DEFAULT_INSTANCE);
        }

        public Builder addSubtitles(int i, SubtitleItem subtitleItem) {
            copyOnWrite();
            ((VideoSubtitle) this.instance).addSubtitles(i, subtitleItem);
            return this;
        }

        public Builder setSubtitles(int i, SubtitleItem.Builder builder) {
            copyOnWrite();
            ((VideoSubtitle) this.instance).setSubtitles(i, builder.build());
            return this;
        }

        public Builder addSubtitles(SubtitleItem.Builder builder) {
            copyOnWrite();
            ((VideoSubtitle) this.instance).addSubtitles(builder.build());
            return this;
        }

        public Builder addSubtitles(int i, SubtitleItem.Builder builder) {
            copyOnWrite();
            ((VideoSubtitle) this.instance).addSubtitles(i, builder.build());
            return this;
        }
    }

    static {
        VideoSubtitle videoSubtitle = new VideoSubtitle();
        DEFAULT_INSTANCE = videoSubtitle;
        GeneratedMessageLite.registerDefaultInstance(VideoSubtitle.class, videoSubtitle);
    }

    private VideoSubtitle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubtitles(Iterable<? extends SubtitleItem> iterable) {
        ensureSubtitlesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.subtitles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtitles(SubtitleItem subtitleItem) {
        subtitleItem.getClass();
        ensureSubtitlesIsMutable();
        this.subtitles_.add(subtitleItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLan() {
        this.lan_ = getDefaultInstance().getLan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanDoc() {
        this.lanDoc_ = getDefaultInstance().getLanDoc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitles() {
        this.subtitles_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSubtitlesIsMutable() {
        Internal.ProtobufList<SubtitleItem> protobufList = this.subtitles_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.subtitles_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static VideoSubtitle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VideoSubtitle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoSubtitle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoSubtitle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VideoSubtitle> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubtitles(int i) {
        ensureSubtitlesIsMutable();
        this.subtitles_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLan(String str) {
        str.getClass();
        this.lan_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lan_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanDoc(String str) {
        str.getClass();
        this.lanDoc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanDocBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lanDoc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitles(int i, SubtitleItem subtitleItem) {
        subtitleItem.getClass();
        ensureSubtitlesIsMutable();
        this.subtitles_.set(i, subtitleItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72731.f17106xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoSubtitle();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u001b", new Object[]{"lan_", "lanDoc_", "subtitles_", SubtitleItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VideoSubtitle> parser = PARSER;
                if (parser == null) {
                    synchronized (VideoSubtitle.class) {
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

    public String getLan() {
        return this.lan_;
    }

    public ByteString getLanBytes() {
        return ByteString.copyFromUtf8(this.lan_);
    }

    public String getLanDoc() {
        return this.lanDoc_;
    }

    public ByteString getLanDocBytes() {
        return ByteString.copyFromUtf8(this.lanDoc_);
    }

    public SubtitleItem getSubtitles(int i) {
        return this.subtitles_.get(i);
    }

    public int getSubtitlesCount() {
        return this.subtitles_.size();
    }

    public List<SubtitleItem> getSubtitlesList() {
        return this.subtitles_;
    }

    public SubtitleItemOrBuilder getSubtitlesOrBuilder(int i) {
        return this.subtitles_.get(i);
    }

    public List<? extends SubtitleItemOrBuilder> getSubtitlesOrBuilderList() {
        return this.subtitles_;
    }

    public static Builder newBuilder(VideoSubtitle videoSubtitle) {
        return DEFAULT_INSTANCE.createBuilder(videoSubtitle);
    }

    public static VideoSubtitle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoSubtitle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoSubtitle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoSubtitle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtitles(int i, SubtitleItem subtitleItem) {
        subtitleItem.getClass();
        ensureSubtitlesIsMutable();
        this.subtitles_.add(i, subtitleItem);
    }

    public static VideoSubtitle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoSubtitle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoSubtitle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VideoSubtitle parseFrom(InputStream inputStream) throws IOException {
        return (VideoSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoSubtitle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoSubtitle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoSubtitle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * addAllSubtitles
     */
    static void access$1000(VideoSubtitle videoSubtitle, Iterable<? extends SubtitleItem> items) {
    }
}
