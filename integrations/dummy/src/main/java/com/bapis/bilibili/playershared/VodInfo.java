package com.bapis.bilibili.playershared;

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
public final class VodInfo extends GeneratedMessageLite<VodInfo, VodInfo.Builder> implements MessageLiteOrBuilder {
    public static final int DASH_AUDIO_FIELD_NUMBER = 6;
    private static final VodInfo DEFAULT_INSTANCE;
    public static final int DOLBY_FIELD_NUMBER = 7;
    public static final int FORMAT_FIELD_NUMBER = 2;
    public static final int LOSS_LESS_ITEM_FIELD_NUMBER = 9;
    private static volatile Parser<VodInfo> PARSER = null;
    public static final int QUALITY_FIELD_NUMBER = 1;
    public static final int STREAM_LIST_FIELD_NUMBER = 5;
    public static final int SUPPORT_PROJECT_FIELD_NUMBER = 10;
    public static final int TIMELENGTH_FIELD_NUMBER = 3;
    public static final int VIDEO_CODECID_FIELD_NUMBER = 4;
    public static final int VOLUME_FIELD_NUMBER = 8;
    private DolbyItem dolby_;
    private LossLessItem lossLessItem_;
    private int quality_;
    private boolean supportProject_;
    private long timelength_;
    private int videoCodecid_;
    private String format_ = "";
    private Internal.ProtobufList<Stream> streamList_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<DashItem> dashAudio_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<VodInfo, Builder> implements MessageLiteOrBuilder {
        protected Builder(VodInfo defaultInstance) {
            super(defaultInstance);
        }

        public Builder addAllDashAudio(Iterable<? extends DashItem> iterable) {
            copyOnWrite();
            ((VodInfo) this.instance).addAllDashAudio(iterable);
            return this;
        }

        public Builder addAllStreamList(Iterable<? extends Stream> iterable) {
            copyOnWrite();
            ((VodInfo) this.instance).addAllStreamList(iterable);
            return this;
        }

        public Builder addDashAudio(DashItem dashItem) {
            copyOnWrite();
            ((VodInfo) this.instance).addDashAudio(dashItem);
            return this;
        }

        public Builder addStreamList(Stream stream) {
            copyOnWrite();
            ((VodInfo) this.instance).addStreamList(stream);
            return this;
        }

        public Builder clearDashAudio() {
            copyOnWrite();
            ((VodInfo) this.instance).clearDashAudio();
            return this;
        }

        public Builder clearDolby() {
            copyOnWrite();
            ((VodInfo) this.instance).clearDolby();
            return this;
        }

        public Builder clearFormat() {
            copyOnWrite();
            ((VodInfo) this.instance).clearFormat();
            return this;
        }

        public Builder clearLossLessItem() {
            copyOnWrite();
            ((VodInfo) this.instance).clearLossLessItem();
            return this;
        }

        public Builder clearQuality() {
            copyOnWrite();
            ((VodInfo) this.instance).clearQuality();
            return this;
        }

        public Builder clearStreamList() {
            copyOnWrite();
            ((VodInfo) this.instance).clearStreamList();
            return this;
        }

        public Builder clearSupportProject() {
            copyOnWrite();
            ((VodInfo) this.instance).clearSupportProject();
            return this;
        }

        public Builder clearTimelength() {
            copyOnWrite();
            ((VodInfo) this.instance).clearTimelength();
            return this;
        }

        public Builder clearVideoCodecid() {
            copyOnWrite();
            ((VodInfo) this.instance).clearVideoCodecid();
            return this;
        }

        public DashItem getDashAudio(int i) {
            return ((VodInfo) this.instance).getDashAudio(i);
        }

        public int getDashAudioCount() {
            return ((VodInfo) this.instance).getDashAudioCount();
        }

        public List<DashItem> getDashAudioList() {
            return Collections.unmodifiableList(((VodInfo) this.instance).getDashAudioList());
        }

        public DolbyItem getDolby() {
            return ((VodInfo) this.instance).getDolby();
        }

        public String getFormat() {
            return ((VodInfo) this.instance).getFormat();
        }

        public ByteString getFormatBytes() {
            return ((VodInfo) this.instance).getFormatBytes();
        }

        public LossLessItem getLossLessItem() {
            return ((VodInfo) this.instance).getLossLessItem();
        }

        public int getQuality() {
            return ((VodInfo) this.instance).getQuality();
        }

        public Stream getStreamList(int i) {
            return ((VodInfo) this.instance).getStreamList(i);
        }

        public int getStreamListCount() {
            return ((VodInfo) this.instance).getStreamListCount();
        }

        public List<Stream> getStreamListList() {
            return Collections.unmodifiableList(((VodInfo) this.instance).getStreamListList());
        }

        public boolean getSupportProject() {
            return ((VodInfo) this.instance).getSupportProject();
        }

        public long getTimelength() {
            return ((VodInfo) this.instance).getTimelength();
        }

        public int getVideoCodecid() {
            return ((VodInfo) this.instance).getVideoCodecid();
        }

        public boolean hasDolby() {
            return ((VodInfo) this.instance).hasDolby();
        }

        public boolean hasLossLessItem() {
            return ((VodInfo) this.instance).hasLossLessItem();
        }

        public Builder mergeDolby(DolbyItem dolbyItem) {
            copyOnWrite();
            ((VodInfo) this.instance).mergeDolby(dolbyItem);
            return this;
        }

        public Builder mergeLossLessItem(LossLessItem lossLessItem) {
            copyOnWrite();
            ((VodInfo) this.instance).mergeLossLessItem(lossLessItem);
            return this;
        }

        public Builder removeDashAudio(int i) {
            copyOnWrite();
            ((VodInfo) this.instance).removeDashAudio(i);
            return this;
        }

        public Builder removeStreamList(int i) {
            copyOnWrite();
            ((VodInfo) this.instance).removeStreamList(i);
            return this;
        }

        public Builder setDashAudio(int i, DashItem dashItem) {
            copyOnWrite();
            ((VodInfo) this.instance).setDashAudio(i, dashItem);
            return this;
        }

        public Builder setDolby(DolbyItem dolbyItem) {
            copyOnWrite();
            ((VodInfo) this.instance).setDolby(dolbyItem);
            return this;
        }

        public Builder setFormat(String str) {
            copyOnWrite();
            ((VodInfo) this.instance).setFormat(str);
            return this;
        }

        public Builder setFormatBytes(ByteString byteString) {
            copyOnWrite();
            ((VodInfo) this.instance).setFormatBytes(byteString);
            return this;
        }

        public Builder setLossLessItem(LossLessItem lossLessItem) {
            copyOnWrite();
            ((VodInfo) this.instance).setLossLessItem(lossLessItem);
            return this;
        }

        public Builder setQuality(int i) {
            copyOnWrite();
            ((VodInfo) this.instance).setQuality(i);
            return this;
        }

        public Builder setStreamList(int i, Stream stream) {
            copyOnWrite();
            ((VodInfo) this.instance).setStreamList(i, stream);
            return this;
        }

        public Builder setSupportProject(boolean z) {
            copyOnWrite();
            ((VodInfo) this.instance).setSupportProject(z);
            return this;
        }

        public Builder setTimelength(long j) {
            copyOnWrite();
            ((VodInfo) this.instance).setTimelength(j);
            return this;
        }

        public Builder setVideoCodecid(int i) {
            copyOnWrite();
            ((VodInfo) this.instance).setVideoCodecid(i);
            return this;
        }

        private Builder() {
            super(VodInfo.DEFAULT_INSTANCE);
        }

        public Builder addDashAudio(int i, DashItem dashItem) {
            copyOnWrite();
            ((VodInfo) this.instance).addDashAudio(i, dashItem);
            return this;
        }

        public Builder addStreamList(int i, Stream stream) {
            copyOnWrite();
            ((VodInfo) this.instance).addStreamList(i, stream);
            return this;
        }

        public Builder setDashAudio(int i, DashItem.Builder builder) {
            copyOnWrite();
            ((VodInfo) this.instance).setDashAudio(i, builder.build());
            return this;
        }

        public Builder setDolby(DolbyItem.Builder builder) {
            copyOnWrite();
            ((VodInfo) this.instance).setDolby(builder.build());
            return this;
        }

        public Builder setLossLessItem(LossLessItem.Builder builder) {
            copyOnWrite();
            ((VodInfo) this.instance).setLossLessItem(builder.build());
            return this;
        }

        public Builder setStreamList(int i, Stream.Builder builder) {
            copyOnWrite();
            ((VodInfo) this.instance).setStreamList(i, builder.build());
            return this;
        }

        public Builder addDashAudio(DashItem.Builder builder) {
            copyOnWrite();
            ((VodInfo) this.instance).addDashAudio(builder.build());
            return this;
        }

        public Builder addStreamList(Stream.Builder builder) {
            copyOnWrite();
            ((VodInfo) this.instance).addStreamList(builder.build());
            return this;
        }

        public Builder addDashAudio(int i, DashItem.Builder builder) {
            copyOnWrite();
            ((VodInfo) this.instance).addDashAudio(i, builder.build());
            return this;
        }

        public Builder addStreamList(int i, Stream.Builder builder) {
            copyOnWrite();
            ((VodInfo) this.instance).addStreamList(i, builder.build());
            return this;
        }
    }

    static {
        VodInfo vodInfo = new VodInfo();
        DEFAULT_INSTANCE = vodInfo;
        GeneratedMessageLite.registerDefaultInstance(VodInfo.class, vodInfo);
    }

    private VodInfo() {
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
    public void clearLossLessItem() {
        this.lossLessItem_ = null;
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
    public void clearSupportProject() {
        this.supportProject_ = false;
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

    public static VodInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDolby(DolbyItem dolbyItem) {
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLossLessItem(LossLessItem lossLessItem) {
        throw new RuntimeException();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VodInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VodInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VodInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VodInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VodInfo> parser() {
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
    public void setLossLessItem(LossLessItem lossLessItem) {
        lossLessItem.getClass();
        this.lossLessItem_ = lossLessItem;
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
    public void setSupportProject(boolean z) {
        this.supportProject_ = z;
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
        return null;
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

    public LossLessItem getLossLessItem() {
        LossLessItem lossLessItem = this.lossLessItem_;
        return lossLessItem == null ? LossLessItem.getDefaultInstance() : lossLessItem;
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

    public boolean getSupportProject() {
        return this.supportProject_;
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

    public boolean hasLossLessItem() {
        return this.lossLessItem_ != null;
    }

    public static Builder newBuilder(VodInfo vodInfo) {
        return DEFAULT_INSTANCE.createBuilder(vodInfo);
    }

    public static VodInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VodInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VodInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VodInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VodInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VodInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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

    public static VodInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VodInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VodInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VodInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VodInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VodInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VodInfo parseFrom(InputStream inputStream) throws IOException {
        return (VodInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VodInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VodInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VodInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VodInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VodInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VodInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
