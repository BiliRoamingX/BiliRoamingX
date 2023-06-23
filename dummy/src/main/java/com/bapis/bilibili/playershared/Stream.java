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
/* loaded from: classes14.dex */
public final class Stream extends GeneratedMessageLite<Stream, Stream.Builder> implements StreamOrBuilder {
    public static final int DASH_VIDEO_FIELD_NUMBER = 2;
    private static final Stream DEFAULT_INSTANCE;
    private static volatile Parser<Stream> PARSER = null;
    public static final int SEGMENT_VIDEO_FIELD_NUMBER = 3;
    public static final int STREAM_INFO_FIELD_NUMBER = 1;
    private int contentCase_ = 0;
    private Object content_;
    private StreamInfo streamInfo_;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Stream, Builder> implements StreamOrBuilder {
        public Builder clearContent() {
            copyOnWrite();
            ((Stream) this.instance).clearContent();
            return this;
        }

        public Builder clearDashVideo() {
            copyOnWrite();
            ((Stream) this.instance).clearDashVideo();
            return this;
        }

        public Builder clearStreamInfo() {
            copyOnWrite();
            ((Stream) this.instance).clearStreamInfo();
            return this;
        }

        @Override // com.bapis.bilibili.playershared.StreamOrBuilder
        public ContentCase getContentCase() {
            return ((Stream) this.instance).getContentCase();
        }

        @Override // com.bapis.bilibili.playershared.StreamOrBuilder
        public DashVideo getDashVideo() {
            return ((Stream) this.instance).getDashVideo();
        }

        @Override // com.bapis.bilibili.playershared.StreamOrBuilder
        public StreamInfo getStreamInfo() {
            return ((Stream) this.instance).getStreamInfo();
        }

        @Override // com.bapis.bilibili.playershared.StreamOrBuilder
        public boolean hasDashVideo() {
            return ((Stream) this.instance).hasDashVideo();
        }

        @Override // com.bapis.bilibili.playershared.StreamOrBuilder
        public boolean hasStreamInfo() {
            return ((Stream) this.instance).hasStreamInfo();
        }

        public Builder mergeDashVideo(DashVideo dashVideo) {
            copyOnWrite();
            ((Stream) this.instance).mergeDashVideo(dashVideo);
            return this;
        }

        public Builder mergeStreamInfo(StreamInfo streamInfo) {
            copyOnWrite();
            ((Stream) this.instance).mergeStreamInfo(streamInfo);
            return this;
        }

        public Builder setDashVideo(DashVideo dashVideo) {
            copyOnWrite();
            ((Stream) this.instance).setDashVideo(dashVideo);
            return this;
        }

        public Builder setStreamInfo(StreamInfo streamInfo) {
            copyOnWrite();
            ((Stream) this.instance).setStreamInfo(streamInfo);
            return this;
        }

        private Builder() {
            super(Stream.DEFAULT_INSTANCE);
        }

        public Builder setDashVideo(DashVideo.Builder builder) {
            copyOnWrite();
            ((Stream) this.instance).setDashVideo(builder.build());
            return this;
        }

        public Builder setStreamInfo(StreamInfo.Builder builder) {
            copyOnWrite();
            ((Stream) this.instance).setStreamInfo(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public enum ContentCase {
        DASH_VIDEO(2),
        SEGMENT_VIDEO(3),
        CONTENT_NOT_SET(0);

        private final int value;

        ContentCase(int i) {
            this.value = i;
        }

        public static ContentCase forNumber(int i) {
            if (i != 0) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SEGMENT_VIDEO;
                }
                return DASH_VIDEO;
            }
            return CONTENT_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ContentCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Stream stream = new Stream();
        DEFAULT_INSTANCE = stream;
        GeneratedMessageLite.registerDefaultInstance(Stream.class, stream);
    }

    private Stream() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.contentCase_ = 0;
        this.content_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDashVideo() {
        if (this.contentCase_ == 2) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamInfo() {
        this.streamInfo_ = null;
    }

    public static Stream getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDashVideo(DashVideo dashVideo) {
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStreamInfo(StreamInfo streamInfo) {
        throw new RuntimeException();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Stream parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Stream) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Stream parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Stream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Stream> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDashVideo(DashVideo dashVideo) {
        dashVideo.getClass();
        this.content_ = dashVideo;
        this.contentCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamInfo(StreamInfo streamInfo) {
        streamInfo.getClass();
        this.streamInfo_ = streamInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        return null;
    }

    @Override // com.bapis.bilibili.playershared.StreamOrBuilder
    public ContentCase getContentCase() {
        return ContentCase.forNumber(this.contentCase_);
    }

    @Override // com.bapis.bilibili.playershared.StreamOrBuilder
    public DashVideo getDashVideo() {
        if (this.contentCase_ == 2) {
            return (DashVideo) this.content_;
        }
        return DashVideo.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.playershared.StreamOrBuilder
    public StreamInfo getStreamInfo() {
        StreamInfo streamInfo = this.streamInfo_;
        return streamInfo == null ? StreamInfo.getDefaultInstance() : streamInfo;
    }

    @Override // com.bapis.bilibili.playershared.StreamOrBuilder
    public boolean hasDashVideo() {
        return this.contentCase_ == 2;
    }

    @Override // com.bapis.bilibili.playershared.StreamOrBuilder
    public boolean hasStreamInfo() {
        return this.streamInfo_ != null;
    }

    public static Builder newBuilder(Stream stream) {
        return DEFAULT_INSTANCE.createBuilder(stream);
    }

    public static Stream parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Stream) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Stream parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Stream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Stream parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Stream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Stream parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Stream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Stream parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Stream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Stream parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Stream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Stream parseFrom(InputStream inputStream) throws IOException {
        return (Stream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Stream parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Stream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Stream parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Stream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Stream parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Stream) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
