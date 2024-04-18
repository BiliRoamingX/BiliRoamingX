package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class Attention extends GeneratedMessageLite<Attention, Attention.Builder> implements AttentionOrBuilder {
    private static final Attention DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 2;
    private static volatile Parser<Attention> PARSER = null;
    public static final int POS_X_FIELD_NUMBER = 3;
    public static final int POS_Y_FIELD_NUMBER = 4;
    public static final int START_TIME_FIELD_NUMBER = 1;
    private int endTime_;
    private double posX_;
    private double posY_;
    private int startTime_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Attention$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67141 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16690xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16690xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16690xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16690xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16690xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16690xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16690xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16690xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Attention, Builder> implements AttentionOrBuilder {
        /* synthetic */ Builder(C67141 c67141) {
            this();
        }

        public Builder clearEndTime() {
            copyOnWrite();
            ((Attention) this.instance).clearEndTime();
            return this;
        }

        public Builder clearPosX() {
            copyOnWrite();
            ((Attention) this.instance).clearPosX();
            return this;
        }

        public Builder clearPosY() {
            copyOnWrite();
            ((Attention) this.instance).clearPosY();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((Attention) this.instance).clearStartTime();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.AttentionOrBuilder
        public int getEndTime() {
            return ((Attention) this.instance).getEndTime();
        }

        @Override // com.bapis.bilibili.app.view.v1.AttentionOrBuilder
        public double getPosX() {
            return ((Attention) this.instance).getPosX();
        }

        @Override // com.bapis.bilibili.app.view.v1.AttentionOrBuilder
        public double getPosY() {
            return ((Attention) this.instance).getPosY();
        }

        @Override // com.bapis.bilibili.app.view.v1.AttentionOrBuilder
        public int getStartTime() {
            return ((Attention) this.instance).getStartTime();
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((Attention) this.instance).setEndTime(i);
            return this;
        }

        public Builder setPosX(double d) {
            copyOnWrite();
            ((Attention) this.instance).setPosX(d);
            return this;
        }

        public Builder setPosY(double d) {
            copyOnWrite();
            ((Attention) this.instance).setPosY(d);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((Attention) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(Attention.DEFAULT_INSTANCE);
        }
    }

    static {
        Attention attention = new Attention();
        DEFAULT_INSTANCE = attention;
        GeneratedMessageLite.registerDefaultInstance(Attention.class, attention);
    }

    private Attention() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosX() {
        this.posX_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosY() {
        this.posY_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static Attention getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Attention parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Attention) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Attention parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Attention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Attention> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosX(double d) {
        this.posX_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosY(double d) {
        this.posY_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67141.f16690xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Attention();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0000\u0004\u0000", new Object[]{"startTime_", "endTime_", "posX_", "posY_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Attention> parser = PARSER;
                if (parser == null) {
                    synchronized (Attention.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.AttentionOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.bapis.bilibili.app.view.v1.AttentionOrBuilder
    public double getPosX() {
        return this.posX_;
    }

    @Override // com.bapis.bilibili.app.view.v1.AttentionOrBuilder
    public double getPosY() {
        return this.posY_;
    }

    @Override // com.bapis.bilibili.app.view.v1.AttentionOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(Attention attention) {
        return DEFAULT_INSTANCE.createBuilder(attention);
    }

    public static Attention parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Attention) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Attention parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Attention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Attention parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Attention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Attention parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Attention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Attention parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Attention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Attention parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Attention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Attention parseFrom(InputStream inputStream) throws IOException {
        return (Attention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Attention parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Attention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Attention parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Attention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Attention parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Attention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
