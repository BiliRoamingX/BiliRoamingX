package com.bapis.bilibili.app.view.v1;

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
public final class TFInfoReply extends GeneratedMessageLite<TFInfoReply, TFInfoReply.Builder> implements MessageLiteOrBuilder {
    private static final TFInfoReply DEFAULT_INSTANCE;
    private static volatile Parser<TFInfoReply> PARSER = null;
    public static final int TF_PANEL_CUSTOMIZED_FIELD_NUMBER = 3;
    public static final int TF_TOAST_FIELD_NUMBER = 2;
    public static final int TIPS_ID_FIELD_NUMBER = 1;
    private TFPanelCustomized tfPanelCustomized_;
    private TFToast tfToast_;
    private long tipsId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.TFInfoReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68681 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16827xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16827xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16827xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16827xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16827xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16827xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16827xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16827xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TFInfoReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68681 c68681) {
            this();
        }

        public Builder clearTfPanelCustomized() {
            copyOnWrite();
            ((TFInfoReply) this.instance).clearTfPanelCustomized();
            return this;
        }

        public Builder clearTfToast() {
            copyOnWrite();
            ((TFInfoReply) this.instance).clearTfToast();
            return this;
        }

        public Builder clearTipsId() {
            copyOnWrite();
            ((TFInfoReply) this.instance).clearTipsId();
            return this;
        }

        public TFPanelCustomized getTfPanelCustomized() {
            return ((TFInfoReply) this.instance).getTfPanelCustomized();
        }

        public TFToast getTfToast() {
            return ((TFInfoReply) this.instance).getTfToast();
        }

        public long getTipsId() {
            return ((TFInfoReply) this.instance).getTipsId();
        }

        public boolean hasTfPanelCustomized() {
            return ((TFInfoReply) this.instance).hasTfPanelCustomized();
        }

        public boolean hasTfToast() {
            return ((TFInfoReply) this.instance).hasTfToast();
        }

        public Builder mergeTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
            copyOnWrite();
            ((TFInfoReply) this.instance).mergeTfPanelCustomized(tFPanelCustomized);
            return this;
        }

        public Builder mergeTfToast(TFToast tFToast) {
            copyOnWrite();
            ((TFInfoReply) this.instance).mergeTfToast(tFToast);
            return this;
        }

        public Builder setTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
            copyOnWrite();
            ((TFInfoReply) this.instance).setTfPanelCustomized(tFPanelCustomized);
            return this;
        }

        public Builder setTfToast(TFToast tFToast) {
            copyOnWrite();
            ((TFInfoReply) this.instance).setTfToast(tFToast);
            return this;
        }

        public Builder setTipsId(long j) {
            copyOnWrite();
            ((TFInfoReply) this.instance).setTipsId(j);
            return this;
        }

        private Builder() {
            super(TFInfoReply.DEFAULT_INSTANCE);
        }

        public Builder setTfPanelCustomized(TFPanelCustomized.Builder builder) {
            copyOnWrite();
            ((TFInfoReply) this.instance).setTfPanelCustomized(builder.build());
            return this;
        }

        public Builder setTfToast(TFToast.Builder builder) {
            copyOnWrite();
            ((TFInfoReply) this.instance).setTfToast(builder.build());
            return this;
        }
    }

    static {
        TFInfoReply tFInfoReply = new TFInfoReply();
        DEFAULT_INSTANCE = tFInfoReply;
        GeneratedMessageLite.registerDefaultInstance(TFInfoReply.class, tFInfoReply);
    }

    private TFInfoReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTfPanelCustomized() {
        this.tfPanelCustomized_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTfToast() {
        this.tfToast_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTipsId() {
        this.tipsId_ = 0L;
    }

    public static TFInfoReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTfToast(TFToast tFToast) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TFInfoReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TFInfoReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TFInfoReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TFInfoReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TFInfoReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTfPanelCustomized(TFPanelCustomized tFPanelCustomized) {
        tFPanelCustomized.getClass();
        this.tfPanelCustomized_ = tFPanelCustomized;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTfToast(TFToast tFToast) {
        tFToast.getClass();
        this.tfToast_ = tFToast;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTipsId(long j) {
        this.tipsId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68681.f16827xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TFInfoReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\t\u0003\t", new Object[]{"tipsId_", "tfToast_", "tfPanelCustomized_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TFInfoReply> parser = PARSER;
                if (parser == null) {
                    synchronized (TFInfoReply.class) {
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

    public TFPanelCustomized getTfPanelCustomized() {
        TFPanelCustomized tFPanelCustomized = this.tfPanelCustomized_;
        return tFPanelCustomized == null ? TFPanelCustomized.getDefaultInstance() : tFPanelCustomized;
    }

    public TFToast getTfToast() {
        TFToast tFToast = this.tfToast_;
        return tFToast == null ? TFToast.getDefaultInstance() : tFToast;
    }

    public long getTipsId() {
        return this.tipsId_;
    }

    public boolean hasTfPanelCustomized() {
        return this.tfPanelCustomized_ != null;
    }

    public boolean hasTfToast() {
        return this.tfToast_ != null;
    }

    public static Builder newBuilder(TFInfoReply tFInfoReply) {
        return DEFAULT_INSTANCE.createBuilder(tFInfoReply);
    }

    public static TFInfoReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TFInfoReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TFInfoReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TFInfoReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TFInfoReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TFInfoReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TFInfoReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TFInfoReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TFInfoReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TFInfoReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TFInfoReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TFInfoReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TFInfoReply parseFrom(InputStream inputStream) throws IOException {
        return (TFInfoReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TFInfoReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TFInfoReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TFInfoReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TFInfoReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TFInfoReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TFInfoReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
