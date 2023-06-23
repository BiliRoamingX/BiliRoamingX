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
public final class LossLessItem extends GeneratedMessageLite<LossLessItem, LossLessItem.Builder> implements MessageLiteOrBuilder {
    public static final int AUDIO_FIELD_NUMBER = 2;
    private static final LossLessItem DEFAULT_INSTANCE;
    public static final int IS_LOSSLESS_AUDIO_FIELD_NUMBER = 1;
    public static final int NEED_VIP_FIELD_NUMBER = 3;
    private static volatile Parser<LossLessItem> PARSER;
    private DashItem audio_;
    private boolean isLosslessAudio_;
    private boolean needVip_;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LossLessItem, Builder> implements MessageLiteOrBuilder {

        public Builder clearAudio() {
            copyOnWrite();
            ((LossLessItem) this.instance).clearAudio();
            return this;
        }

        public Builder clearIsLosslessAudio() {
            copyOnWrite();
            ((LossLessItem) this.instance).clearIsLosslessAudio();
            return this;
        }

        public Builder clearNeedVip() {
            copyOnWrite();
            ((LossLessItem) this.instance).clearNeedVip();
            return this;
        }

        public DashItem getAudio() {
            return ((LossLessItem) this.instance).getAudio();
        }

        public boolean getIsLosslessAudio() {
            return ((LossLessItem) this.instance).getIsLosslessAudio();
        }

        public boolean getNeedVip() {
            return ((LossLessItem) this.instance).getNeedVip();
        }

        public boolean hasAudio() {
            return ((LossLessItem) this.instance).hasAudio();
        }

        public Builder mergeAudio(DashItem dashItem) {
            copyOnWrite();
            ((LossLessItem) this.instance).mergeAudio(dashItem);
            return this;
        }

        public Builder setAudio(DashItem dashItem) {
            copyOnWrite();
            ((LossLessItem) this.instance).setAudio(dashItem);
            return this;
        }

        public Builder setIsLosslessAudio(boolean z) {
            copyOnWrite();
            ((LossLessItem) this.instance).setIsLosslessAudio(z);
            return this;
        }

        public Builder setNeedVip(boolean z) {
            copyOnWrite();
            ((LossLessItem) this.instance).setNeedVip(z);
            return this;
        }

        private Builder() {
            super(LossLessItem.DEFAULT_INSTANCE);
        }

        public Builder setAudio(DashItem.Builder builder) {
            copyOnWrite();
            ((LossLessItem) this.instance).setAudio(builder.build());
            return this;
        }
    }

    static {
        LossLessItem lossLessItem = new LossLessItem();
        DEFAULT_INSTANCE = lossLessItem;
        GeneratedMessageLite.registerDefaultInstance(LossLessItem.class, lossLessItem);
    }

    private LossLessItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudio() {
        this.audio_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLosslessAudio() {
        this.isLosslessAudio_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNeedVip() {
        this.needVip_ = false;
    }

    public static LossLessItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudio(DashItem dashItem) {
        throw new RuntimeException();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LossLessItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LossLessItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LossLessItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LossLessItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LossLessItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudio(DashItem dashItem) {
        dashItem.getClass();
        this.audio_ = dashItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLosslessAudio(boolean z) {
        this.isLosslessAudio_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNeedVip(boolean z) {
        this.needVip_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        return null;
    }

    public DashItem getAudio() {
        DashItem dashItem = this.audio_;
        return dashItem == null ? DashItem.getDefaultInstance() : dashItem;
    }

    public boolean getIsLosslessAudio() {
        return this.isLosslessAudio_;
    }

    public boolean getNeedVip() {
        return this.needVip_;
    }

    public boolean hasAudio() {
        return this.audio_ != null;
    }

    public static Builder newBuilder(LossLessItem lossLessItem) {
        return DEFAULT_INSTANCE.createBuilder(lossLessItem);
    }

    public static LossLessItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LossLessItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LossLessItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LossLessItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LossLessItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LossLessItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LossLessItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LossLessItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LossLessItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LossLessItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LossLessItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LossLessItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LossLessItem parseFrom(InputStream inputStream) throws IOException {
        return (LossLessItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LossLessItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LossLessItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LossLessItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LossLessItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LossLessItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LossLessItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
