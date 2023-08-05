package com.bapis.bilibili.dagw.component.avatar.common;

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

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class NativeDrawRes extends GeneratedMessageLite<NativeDrawRes, NativeDrawRes.Builder> implements MessageLiteOrBuilder {
    public static final int COLOR_CONFIG_FIELD_NUMBER = 3;
    private static final NativeDrawRes DEFAULT_INSTANCE;
    public static final int DRAW_TYPE_FIELD_NUMBER = 1;
    public static final int EDGE_WEIGHT_FIELD_NUMBER = 4;
    public static final int FILL_MODE_FIELD_NUMBER = 2;
    private static volatile Parser<NativeDrawRes> PARSER;
    private ColorConfig colorConfig_;
    private int drawType_;
    private double edgeWeight_;
    private int fillMode_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.common.NativeDrawRes$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75171 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17366xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17366xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17366xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17366xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17366xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17366xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17366xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17366xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<NativeDrawRes, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75171 c75171) {
            this();
        }

        public Builder clearColorConfig() {
            copyOnWrite();
            ((NativeDrawRes) this.instance).clearColorConfig();
            return this;
        }

        public Builder clearDrawType() {
            copyOnWrite();
            ((NativeDrawRes) this.instance).clearDrawType();
            return this;
        }

        public Builder clearEdgeWeight() {
            copyOnWrite();
            ((NativeDrawRes) this.instance).clearEdgeWeight();
            return this;
        }

        public Builder clearFillMode() {
            copyOnWrite();
            ((NativeDrawRes) this.instance).clearFillMode();
            return this;
        }

        public ColorConfig getColorConfig() {
            return ((NativeDrawRes) this.instance).getColorConfig();
        }

        public NativeDraw getDrawType() {
            return ((NativeDrawRes) this.instance).getDrawType();
        }

        public int getDrawTypeValue() {
            return ((NativeDrawRes) this.instance).getDrawTypeValue();
        }

        public double getEdgeWeight() {
            return ((NativeDrawRes) this.instance).getEdgeWeight();
        }

        public FillMode getFillMode() {
            return ((NativeDrawRes) this.instance).getFillMode();
        }

        public int getFillModeValue() {
            return ((NativeDrawRes) this.instance).getFillModeValue();
        }

        public boolean hasColorConfig() {
            return ((NativeDrawRes) this.instance).hasColorConfig();
        }

        public Builder mergeColorConfig(ColorConfig colorConfig) {
            copyOnWrite();
            ((NativeDrawRes) this.instance).mergeColorConfig(colorConfig);
            return this;
        }

        public Builder setColorConfig(ColorConfig colorConfig) {
            copyOnWrite();
            ((NativeDrawRes) this.instance).setColorConfig(colorConfig);
            return this;
        }

        public Builder setDrawType(NativeDraw nativeDraw) {
            copyOnWrite();
            ((NativeDrawRes) this.instance).setDrawType(nativeDraw);
            return this;
        }

        public Builder setDrawTypeValue(int i) {
            copyOnWrite();
            ((NativeDrawRes) this.instance).setDrawTypeValue(i);
            return this;
        }

        public Builder setEdgeWeight(double d) {
            copyOnWrite();
            ((NativeDrawRes) this.instance).setEdgeWeight(d);
            return this;
        }

        public Builder setFillMode(FillMode fillMode) {
            copyOnWrite();
            ((NativeDrawRes) this.instance).setFillMode(fillMode);
            return this;
        }

        public Builder setFillModeValue(int i) {
            copyOnWrite();
            ((NativeDrawRes) this.instance).setFillModeValue(i);
            return this;
        }

        private Builder() {
            super(NativeDrawRes.DEFAULT_INSTANCE);
        }

        public Builder setColorConfig(ColorConfig.Builder builder) {
            copyOnWrite();
            ((NativeDrawRes) this.instance).setColorConfig(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum FillMode implements Internal.EnumLite {
        FILL_MODE_INVALID(0),
        FILL_MODE_INTERNAL(1),
        FILL_MODE_EDGE(2),
        UNRECOGNIZED(-1);
        
        public static final int FILL_MODE_EDGE_VALUE = 2;
        public static final int FILL_MODE_INTERNAL_VALUE = 1;
        public static final int FILL_MODE_INVALID_VALUE = 0;
        private static final Internal.EnumLiteMap<FillMode> internalValueMap = new Internal.EnumLiteMap<FillMode>() { // from class: com.bapis.bilibili.dagw.component.avatar.common.NativeDrawRes.FillMode.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public FillMode findValueByNumber(int i) {
                return FillMode.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes17.dex */
        private static final class FillModeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new FillModeVerifier();

            private FillModeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return FillMode.forNumber(i) != null;
            }
        }

        FillMode(int i) {
            this.value = i;
        }

        public static FillMode forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return FILL_MODE_EDGE;
                }
                return FILL_MODE_INTERNAL;
            }
            return FILL_MODE_INVALID;
        }

        public static Internal.EnumLiteMap<FillMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return FillModeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static FillMode valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum NativeDraw implements Internal.EnumLite {
        DRAW_INVALID(0),
        DRAW_CIRCLE(1),
        DRAW_RECTANGLE(2),
        UNRECOGNIZED(-1);
        
        public static final int DRAW_CIRCLE_VALUE = 1;
        public static final int DRAW_INVALID_VALUE = 0;
        public static final int DRAW_RECTANGLE_VALUE = 2;
        private static final Internal.EnumLiteMap<NativeDraw> internalValueMap = new Internal.EnumLiteMap<NativeDraw>() { // from class: com.bapis.bilibili.dagw.component.avatar.common.NativeDrawRes.NativeDraw.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public NativeDraw findValueByNumber(int i) {
                return NativeDraw.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes17.dex */
        private static final class NativeDrawVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new NativeDrawVerifier();

            private NativeDrawVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return NativeDraw.forNumber(i) != null;
            }
        }

        NativeDraw(int i) {
            this.value = i;
        }

        public static NativeDraw forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return DRAW_RECTANGLE;
                }
                return DRAW_CIRCLE;
            }
            return DRAW_INVALID;
        }

        public static Internal.EnumLiteMap<NativeDraw> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return NativeDrawVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static NativeDraw valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        NativeDrawRes nativeDrawRes = new NativeDrawRes();
        DEFAULT_INSTANCE = nativeDrawRes;
        GeneratedMessageLite.registerDefaultInstance(NativeDrawRes.class, nativeDrawRes);
    }

    private NativeDrawRes() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColorConfig() {
        this.colorConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrawType() {
        this.drawType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdgeWeight() {
        this.edgeWeight_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFillMode() {
        this.fillMode_ = 0;
    }

    public static NativeDrawRes getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeColorConfig(ColorConfig colorConfig) {
        colorConfig.getClass();
        ColorConfig colorConfig2 = this.colorConfig_;
        if (colorConfig2 != null && colorConfig2 != ColorConfig.getDefaultInstance()) {
            this.colorConfig_ = ColorConfig.newBuilder(this.colorConfig_).mergeFrom((ColorConfig) colorConfig).buildPartial();
        } else {
            this.colorConfig_ = colorConfig;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NativeDrawRes parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NativeDrawRes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeDrawRes parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NativeDrawRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NativeDrawRes> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorConfig(ColorConfig colorConfig) {
        colorConfig.getClass();
        this.colorConfig_ = colorConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawType(NativeDraw nativeDraw) {
        this.drawType_ = nativeDraw.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawTypeValue(int i) {
        this.drawType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdgeWeight(double d) {
        this.edgeWeight_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFillMode(FillMode fillMode) {
        this.fillMode_ = fillMode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFillModeValue(int i) {
        this.fillMode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75171.f17366xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new NativeDrawRes();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\t\u0004\u0000", new Object[]{"drawType_", "fillMode_", "colorConfig_", "edgeWeight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NativeDrawRes> parser = PARSER;
                if (parser == null) {
                    synchronized (NativeDrawRes.class) {
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

    public ColorConfig getColorConfig() {
        ColorConfig colorConfig = this.colorConfig_;
        return colorConfig == null ? ColorConfig.getDefaultInstance() : colorConfig;
    }

    public NativeDraw getDrawType() {
        NativeDraw forNumber = NativeDraw.forNumber(this.drawType_);
        return forNumber == null ? NativeDraw.UNRECOGNIZED : forNumber;
    }

    public int getDrawTypeValue() {
        return this.drawType_;
    }

    public double getEdgeWeight() {
        return this.edgeWeight_;
    }

    public FillMode getFillMode() {
        FillMode forNumber = FillMode.forNumber(this.fillMode_);
        return forNumber == null ? FillMode.UNRECOGNIZED : forNumber;
    }

    public int getFillModeValue() {
        return this.fillMode_;
    }

    public boolean hasColorConfig() {
        return this.colorConfig_ != null;
    }

    public static Builder newBuilder(NativeDrawRes nativeDrawRes) {
        return DEFAULT_INSTANCE.createBuilder(nativeDrawRes);
    }

    public static NativeDrawRes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeDrawRes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeDrawRes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeDrawRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NativeDrawRes parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NativeDrawRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NativeDrawRes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeDrawRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NativeDrawRes parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NativeDrawRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeDrawRes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeDrawRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NativeDrawRes parseFrom(InputStream inputStream) throws IOException {
        return (NativeDrawRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeDrawRes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeDrawRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeDrawRes parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NativeDrawRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NativeDrawRes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeDrawRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
