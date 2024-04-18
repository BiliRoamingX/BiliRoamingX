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
public final class VolumeInfo extends GeneratedMessageLite<VolumeInfo, VolumeInfo.Builder> implements MessageLiteOrBuilder {
    private static final VolumeInfo DEFAULT_INSTANCE;
    public static final int MEASURED_I_FIELD_NUMBER = 1;
    public static final int MEASURED_LRA_FIELD_NUMBER = 2;
    public static final int MEASURED_THRESHOLD_FIELD_NUMBER = 4;
    public static final int MEASURED_TP_FIELD_NUMBER = 3;
    private static volatile Parser<VolumeInfo> PARSER = null;
    public static final int TARGET_I_FIELD_NUMBER = 6;
    public static final int TARGET_OFFSET_FIELD_NUMBER = 5;
    public static final int TARGET_TP_FIELD_NUMBER = 7;
    private double measuredI_;
    private double measuredLra_;
    private double measuredThreshold_;
    private double measuredTp_;
    private double targetI_;
    private double targetOffset_;
    private double targetTp_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.VolumeInfo$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C65251 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16554xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16554xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16554xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16554xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16554xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16554xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16554xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16554xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<VolumeInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C65251 c65251) {
            this();
        }

        public Builder clearMeasuredI() {
            copyOnWrite();
            ((VolumeInfo) this.instance).clearMeasuredI();
            return this;
        }

        public Builder clearMeasuredLra() {
            copyOnWrite();
            ((VolumeInfo) this.instance).clearMeasuredLra();
            return this;
        }

        public Builder clearMeasuredThreshold() {
            copyOnWrite();
            ((VolumeInfo) this.instance).clearMeasuredThreshold();
            return this;
        }

        public Builder clearMeasuredTp() {
            copyOnWrite();
            ((VolumeInfo) this.instance).clearMeasuredTp();
            return this;
        }

        public Builder clearTargetI() {
            copyOnWrite();
            ((VolumeInfo) this.instance).clearTargetI();
            return this;
        }

        public Builder clearTargetOffset() {
            copyOnWrite();
            ((VolumeInfo) this.instance).clearTargetOffset();
            return this;
        }

        public Builder clearTargetTp() {
            copyOnWrite();
            ((VolumeInfo) this.instance).clearTargetTp();
            return this;
        }

        public double getMeasuredI() {
            return ((VolumeInfo) this.instance).getMeasuredI();
        }

        public double getMeasuredLra() {
            return ((VolumeInfo) this.instance).getMeasuredLra();
        }

        public double getMeasuredThreshold() {
            return ((VolumeInfo) this.instance).getMeasuredThreshold();
        }

        public double getMeasuredTp() {
            return ((VolumeInfo) this.instance).getMeasuredTp();
        }

        public double getTargetI() {
            return ((VolumeInfo) this.instance).getTargetI();
        }

        public double getTargetOffset() {
            return ((VolumeInfo) this.instance).getTargetOffset();
        }

        public double getTargetTp() {
            return ((VolumeInfo) this.instance).getTargetTp();
        }

        public Builder setMeasuredI(double d) {
            copyOnWrite();
            ((VolumeInfo) this.instance).setMeasuredI(d);
            return this;
        }

        public Builder setMeasuredLra(double d) {
            copyOnWrite();
            ((VolumeInfo) this.instance).setMeasuredLra(d);
            return this;
        }

        public Builder setMeasuredThreshold(double d) {
            copyOnWrite();
            ((VolumeInfo) this.instance).setMeasuredThreshold(d);
            return this;
        }

        public Builder setMeasuredTp(double d) {
            copyOnWrite();
            ((VolumeInfo) this.instance).setMeasuredTp(d);
            return this;
        }

        public Builder setTargetI(double d) {
            copyOnWrite();
            ((VolumeInfo) this.instance).setTargetI(d);
            return this;
        }

        public Builder setTargetOffset(double d) {
            copyOnWrite();
            ((VolumeInfo) this.instance).setTargetOffset(d);
            return this;
        }

        public Builder setTargetTp(double d) {
            copyOnWrite();
            ((VolumeInfo) this.instance).setTargetTp(d);
            return this;
        }

        private Builder() {
            super(VolumeInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        VolumeInfo volumeInfo = new VolumeInfo();
        DEFAULT_INSTANCE = volumeInfo;
        GeneratedMessageLite.registerDefaultInstance(VolumeInfo.class, volumeInfo);
    }

    private VolumeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeasuredI() {
        this.measuredI_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeasuredLra() {
        this.measuredLra_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeasuredThreshold() {
        this.measuredThreshold_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeasuredTp() {
        this.measuredTp_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetI() {
        this.targetI_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetOffset() {
        this.targetOffset_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetTp() {
        this.targetTp_ = 0.0d;
    }

    public static VolumeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VolumeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VolumeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VolumeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VolumeInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeasuredI(double d) {
        this.measuredI_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeasuredLra(double d) {
        this.measuredLra_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeasuredThreshold(double d) {
        this.measuredThreshold_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeasuredTp(double d) {
        this.measuredTp_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetI(double d) {
        this.targetI_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetOffset(double d) {
        this.targetOffset_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetTp(double d) {
        this.targetTp_ = d;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65251.f16554xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VolumeInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000\u0005\u0000\u0006\u0000\u0007\u0000", new Object[]{"measuredI_", "measuredLra_", "measuredTp_", "measuredThreshold_", "targetOffset_", "targetI_", "targetTp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VolumeInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (VolumeInfo.class) {
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

    public double getMeasuredI() {
        return this.measuredI_;
    }

    public double getMeasuredLra() {
        return this.measuredLra_;
    }

    public double getMeasuredThreshold() {
        return this.measuredThreshold_;
    }

    public double getMeasuredTp() {
        return this.measuredTp_;
    }

    public double getTargetI() {
        return this.targetI_;
    }

    public double getTargetOffset() {
        return this.targetOffset_;
    }

    public double getTargetTp() {
        return this.targetTp_;
    }

    public static Builder newBuilder(VolumeInfo volumeInfo) {
        return DEFAULT_INSTANCE.createBuilder(volumeInfo);
    }

    public static VolumeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VolumeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VolumeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VolumeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VolumeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VolumeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VolumeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VolumeInfo parseFrom(InputStream inputStream) throws IOException {
        return (VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VolumeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VolumeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VolumeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
