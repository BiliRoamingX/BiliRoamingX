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
public final class PlayArc extends GeneratedMessageLite<PlayArc, PlayArc.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 2;
    public static final int ARC_TYPE_FIELD_NUMBER = 5;
    public static final int CID_FIELD_NUMBER = 3;
    private static final PlayArc DEFAULT_INSTANCE;
    public static final int DRM_TECH_TYPE_FIELD_NUMBER = 4;
    public static final int INTERACTION_FIELD_NUMBER = 6;
    private static volatile Parser<PlayArc> PARSER = null;
    public static final int VIDEO_TYPE_FIELD_NUMBER = 1;
    private long aid_;
    private int arcType_;
    private long cid_;
    private int drmTechType_;
    private int videoType_;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayArc, Builder> implements MessageLiteOrBuilder {
        protected Builder(PlayArc defaultInstance) {
            super(defaultInstance);
        }

        public Builder clearAid() {
            copyOnWrite();
            ((PlayArc) this.instance).clearAid();
            return this;
        }

        public Builder clearArcType() {
            copyOnWrite();
            ((PlayArc) this.instance).clearArcType();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((PlayArc) this.instance).clearCid();
            return this;
        }

        public Builder clearDrmTechType() {
            copyOnWrite();
            ((PlayArc) this.instance).clearDrmTechType();
            return this;
        }

        public Builder clearVideoType() {
            copyOnWrite();
            ((PlayArc) this.instance).clearVideoType();
            return this;
        }

        public long getAid() {
            return ((PlayArc) this.instance).getAid();
        }

        public ArcType getArcType() {
            return ((PlayArc) this.instance).getArcType();
        }

        public int getArcTypeValue() {
            return ((PlayArc) this.instance).getArcTypeValue();
        }

        public long getCid() {
            return ((PlayArc) this.instance).getCid();
        }

        public DrmTechType getDrmTechType() {
            return ((PlayArc) this.instance).getDrmTechType();
        }

        public int getDrmTechTypeValue() {
            return ((PlayArc) this.instance).getDrmTechTypeValue();
        }

        public VideoType getVideoType() {
            return ((PlayArc) this.instance).getVideoType();
        }

        public int getVideoTypeValue() {
            return ((PlayArc) this.instance).getVideoTypeValue();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((PlayArc) this.instance).setAid(j);
            return this;
        }

        public Builder setArcType(ArcType arcType) {
            copyOnWrite();
            ((PlayArc) this.instance).setArcType(arcType);
            return this;
        }

        public Builder setArcTypeValue(int i) {
            copyOnWrite();
            ((PlayArc) this.instance).setArcTypeValue(i);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((PlayArc) this.instance).setCid(j);
            return this;
        }

        public Builder setDrmTechType(DrmTechType drmTechType) {
            copyOnWrite();
            ((PlayArc) this.instance).setDrmTechType(drmTechType);
            return this;
        }

        public Builder setDrmTechTypeValue(int i) {
            copyOnWrite();
            ((PlayArc) this.instance).setDrmTechTypeValue(i);
            return this;
        }

        public Builder setVideoType(VideoType videoType) {
            copyOnWrite();
            ((PlayArc) this.instance).setVideoType(videoType);
            return this;
        }

        public Builder setVideoTypeValue(int i) {
            copyOnWrite();
            ((PlayArc) this.instance).setVideoTypeValue(i);
            return this;
        }

        private Builder() {
            super(PlayArc.DEFAULT_INSTANCE);
        }
    }

    static {
        PlayArc playArc = new PlayArc();
        DEFAULT_INSTANCE = playArc;
        GeneratedMessageLite.registerDefaultInstance(PlayArc.class, playArc);
    }

    private PlayArc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArcType() {
        this.arcType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrmTechType() {
        this.drmTechType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoType() {
        this.videoType_ = 0;
    }

    public static PlayArc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayArc parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayArc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayArc parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayArc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArcType(ArcType arcType) {
        this.arcType_ = arcType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArcTypeValue(int i) {
        this.arcType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrmTechType(DrmTechType drmTechType) {
        this.drmTechType_ = drmTechType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrmTechTypeValue(int i) {
        this.drmTechType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoType(VideoType videoType) {
        this.videoType_ = videoType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoTypeValue(int i) {
        this.videoType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        return null;
    }

    public long getAid() {
        return this.aid_;
    }

    public ArcType getArcType() {
        ArcType forNumber = ArcType.forNumber(this.arcType_);
        return forNumber == null ? ArcType.UNRECOGNIZED : forNumber;
    }

    public int getArcTypeValue() {
        return this.arcType_;
    }

    public long getCid() {
        return this.cid_;
    }

    public DrmTechType getDrmTechType() {
        DrmTechType forNumber = DrmTechType.forNumber(this.drmTechType_);
        return forNumber == null ? DrmTechType.UNRECOGNIZED : forNumber;
    }

    public int getDrmTechTypeValue() {
        return this.drmTechType_;
    }

    public VideoType getVideoType() {
        VideoType forNumber = VideoType.forNumber(this.videoType_);
        return forNumber == null ? VideoType.UNRECOGNIZED : forNumber;
    }

    public int getVideoTypeValue() {
        return this.videoType_;
    }

    public static Builder newBuilder(PlayArc playArc) {
        return DEFAULT_INSTANCE.createBuilder(playArc);
    }

    public static PlayArc parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayArc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayArc parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayArc parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayArc parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayArc parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayArc parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayArc parseFrom(InputStream inputStream) throws IOException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayArc parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayArc parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayArc parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
