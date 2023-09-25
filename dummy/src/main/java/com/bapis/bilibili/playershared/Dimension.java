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
/* loaded from: classes18.dex */
public final class Dimension extends GeneratedMessageLite<Dimension, Dimension.Builder> implements MessageLiteOrBuilder {
    private static final Dimension DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private static volatile Parser<Dimension> PARSER = null;
    public static final int ROTATE_FIELD_NUMBER = 3;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private long height_;
    private long rotate_;
    private long width_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.Dimension$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81921 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17928xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17928xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17928xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17928xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17928xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17928xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17928xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17928xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Dimension, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81921 c81921) {
            this();
        }

        public Builder clearHeight() {
            copyOnWrite();
            ((Dimension) this.instance).clearHeight();
            return this;
        }

        public Builder clearRotate() {
            copyOnWrite();
            ((Dimension) this.instance).clearRotate();
            return this;
        }

        public Builder clearWidth() {
            copyOnWrite();
            ((Dimension) this.instance).clearWidth();
            return this;
        }

        public long getHeight() {
            return ((Dimension) this.instance).getHeight();
        }

        public long getRotate() {
            return ((Dimension) this.instance).getRotate();
        }

        public long getWidth() {
            return ((Dimension) this.instance).getWidth();
        }

        public Builder setHeight(long j) {
            copyOnWrite();
            ((Dimension) this.instance).setHeight(j);
            return this;
        }

        public Builder setRotate(long j) {
            copyOnWrite();
            ((Dimension) this.instance).setRotate(j);
            return this;
        }

        public Builder setWidth(long j) {
            copyOnWrite();
            ((Dimension) this.instance).setWidth(j);
            return this;
        }

        private Builder() {
            super(Dimension.DEFAULT_INSTANCE);
        }
    }

    static {
        Dimension dimension = new Dimension();
        DEFAULT_INSTANCE = dimension;
        GeneratedMessageLite.registerDefaultInstance(Dimension.class, dimension);
    }

    public Dimension() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRotate() {
        this.rotate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0L;
    }

    public static Dimension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Dimension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Dimension) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Dimension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Dimension) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Dimension> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(long j) {
        this.height_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRotate(long j) {
        this.rotate_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(long j) {
        this.width_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81921.f17928xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Dimension();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002", new Object[]{"width_", "height_", "rotate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Dimension> parser = PARSER;
                if (parser == null) {
                    synchronized (Dimension.class) {
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

    public long getHeight() {
        return this.height_;
    }

    public long getRotate() {
        return this.rotate_;
    }

    public long getWidth() {
        return this.width_;
    }

    public static Builder newBuilder(Dimension dimension) {
        return DEFAULT_INSTANCE.createBuilder(dimension);
    }

    public static Dimension parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Dimension) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Dimension parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Dimension) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Dimension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Dimension) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Dimension parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Dimension) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Dimension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Dimension) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Dimension parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Dimension) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Dimension parseFrom(InputStream inputStream) throws IOException {
        return (Dimension) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Dimension parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Dimension) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Dimension parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Dimension) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Dimension parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Dimension) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
