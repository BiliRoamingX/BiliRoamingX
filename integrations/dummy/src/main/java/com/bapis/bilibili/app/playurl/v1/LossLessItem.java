package com.bapis.bilibili.app.playurl.v1;

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
    /* renamed from: com.bapis.bilibili.app.playurl.v1.LossLessItem$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C64921 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16528xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16528xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16528xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16528xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16528xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16528xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16528xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16528xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LossLessItem, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C64921 c64921) {
            this();
        }

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
        switch (C64921.f16528xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LossLessItem();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\t\u0003\u0007", new Object[]{"isLosslessAudio_", "audio_", "needVip_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LossLessItem> parser = PARSER;
                if (parser == null) {
                    synchronized (LossLessItem.class) {
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
