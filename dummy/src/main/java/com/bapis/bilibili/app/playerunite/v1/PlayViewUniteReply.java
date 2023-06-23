package com.bapis.bilibili.app.playerunite.v1;

import com.bapis.bilibili.playershared.PlayArc;
import com.bapis.bilibili.playershared.PlayArcConf;
import com.bapis.bilibili.playershared.PlayDeviceConf;
import com.bapis.bilibili.playershared.VodInfo;
import com.google.protobuf.Any;
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
public final class PlayViewUniteReply extends GeneratedMessageLite<PlayViewUniteReply, PlayViewUniteReply.Builder> implements MessageLiteOrBuilder {
    private static final PlayViewUniteReply DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 4;
    public static final int HISTORY_FIELD_NUMBER = 8;
    private static volatile Parser<PlayViewUniteReply> PARSER = null;
    public static final int PLAY_ARC_CONF_FIELD_NUMBER = 2;
    public static final int PLAY_ARC_FIELD_NUMBER = 6;
    public static final int PLAY_DEVICE_CONF_FIELD_NUMBER = 3;
    public static final int QN_TRIAL_INFO_FIELD_NUMBER = 7;
    public static final int SUPPLEMENT_FIELD_NUMBER = 5;
    public static final int VOD_INFO_FIELD_NUMBER = 1;
    private PlayArcConf playArcConf_;
    private PlayArc playArc_;
    private PlayDeviceConf playDeviceConf_;
    private Any supplement_;
    private VodInfo vodInfo_;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayViewUniteReply, Builder> implements MessageLiteOrBuilder {

        public Builder clearPlayArc() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearPlayArc();
            return this;
        }

        public Builder clearPlayArcConf() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearPlayArcConf();
            return this;
        }

        public Builder clearPlayDeviceConf() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearPlayDeviceConf();
            return this;
        }

        public Builder clearSupplement() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearSupplement();
            return this;
        }

        public Builder clearVodInfo() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearVodInfo();
            return this;
        }

        public PlayArc getPlayArc() {
            return ((PlayViewUniteReply) this.instance).getPlayArc();
        }

        public PlayArcConf getPlayArcConf() {
            return ((PlayViewUniteReply) this.instance).getPlayArcConf();
        }

        public PlayDeviceConf getPlayDeviceConf() {
            return ((PlayViewUniteReply) this.instance).getPlayDeviceConf();
        }

        public Any getSupplement() {
            return ((PlayViewUniteReply) this.instance).getSupplement();
        }

        public VodInfo getVodInfo() {
            return ((PlayViewUniteReply) this.instance).getVodInfo();
        }

        public boolean hasPlayArc() {
            return ((PlayViewUniteReply) this.instance).hasPlayArc();
        }

        public boolean hasPlayArcConf() {
            return ((PlayViewUniteReply) this.instance).hasPlayArcConf();
        }

        public boolean hasPlayDeviceConf() {
            return ((PlayViewUniteReply) this.instance).hasPlayDeviceConf();
        }

        public boolean hasSupplement() {
            return ((PlayViewUniteReply) this.instance).hasSupplement();
        }

        public boolean hasVodInfo() {
            return ((PlayViewUniteReply) this.instance).hasVodInfo();
        }

        public Builder setPlayArc(PlayArc playArc) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setPlayArc(playArc);
            return this;
        }

        public Builder setPlayArcConf(PlayArcConf playArcConf) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setPlayArcConf(playArcConf);
            return this;
        }

        public Builder setPlayDeviceConf(PlayDeviceConf playDeviceConf) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setPlayDeviceConf(playDeviceConf);
            return this;
        }

        public Builder setSupplement(Any any) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setSupplement(any);
            return this;
        }

        public Builder setVodInfo(VodInfo vodInfo) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setVodInfo(vodInfo);
            return this;
        }

        private Builder() {
            super(PlayViewUniteReply.DEFAULT_INSTANCE);
        }
    }

    static {
        PlayViewUniteReply playViewUniteReply = new PlayViewUniteReply();
        DEFAULT_INSTANCE = playViewUniteReply;
        GeneratedMessageLite.registerDefaultInstance(PlayViewUniteReply.class, playViewUniteReply);
    }

    private PlayViewUniteReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayArc() {
        this.playArc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayArcConf() {
        this.playArcConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayDeviceConf() {
        this.playDeviceConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupplement() {
        this.supplement_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVodInfo() {
        this.vodInfo_ = null;
    }

    public static PlayViewUniteReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayViewUniteReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayViewUniteReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayViewUniteReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayArc(PlayArc playArc) {
        this.playArc_ = playArc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayArcConf(PlayArcConf playArcConf) {
        this.playArcConf_ = playArcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayDeviceConf(PlayDeviceConf playDeviceConf) {
        this.playDeviceConf_ = playDeviceConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupplement(Any any) {
        this.supplement_ = any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVodInfo(VodInfo vodInfo) {
        this.vodInfo_ = vodInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        return null;
    }

    public PlayArc getPlayArc() {
        throw new RuntimeException();
    }

    public PlayArcConf getPlayArcConf() {
        throw new RuntimeException();
    }

    public PlayDeviceConf getPlayDeviceConf() {
        throw new RuntimeException();
    }

    public Any getSupplement() {
        Any any = this.supplement_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public VodInfo getVodInfo() {
        throw new RuntimeException();
    }

    public boolean hasPlayArc() {
        return this.playArc_ != null;
    }

    public boolean hasPlayArcConf() {
        return this.playArcConf_ != null;
    }

    public boolean hasPlayDeviceConf() {
        return this.playDeviceConf_ != null;
    }

    public boolean hasSupplement() {
        return this.supplement_ != null;
    }

    public boolean hasVodInfo() {
        return this.vodInfo_ != null;
    }

    public static Builder newBuilder(PlayViewUniteReply playViewUniteReply) {
        return DEFAULT_INSTANCE.createBuilder(playViewUniteReply);
    }

    public static PlayViewUniteReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayViewUniteReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayViewUniteReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayViewUniteReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayViewUniteReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayViewUniteReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayViewUniteReply parseFrom(InputStream inputStream) throws IOException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayViewUniteReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayViewUniteReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayViewUniteReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
