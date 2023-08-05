package com.bapis.bilibili.dagw.component.avatar.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class BasicLayerResource extends GeneratedMessageLite<BasicLayerResource, BasicLayerResource.Builder> implements BasicLayerResourceOrBuilder {
    private static final BasicLayerResource DEFAULT_INSTANCE;
    private static volatile Parser<BasicLayerResource> PARSER = null;
    public static final int RES_ANIMATION_FIELD_NUMBER = 3;
    public static final int RES_IMAGE_FIELD_NUMBER = 2;
    public static final int RES_NATIVE_DRAW_FIELD_NUMBER = 4;
    public static final int RES_TYPE_FIELD_NUMBER = 1;
    private int payloadCase_ = 0;
    private Object payload_;
    private int resType_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResource$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75281 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17372xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17372xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17372xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17372xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17372xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17372xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17372xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17372xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BasicLayerResource, Builder> implements BasicLayerResourceOrBuilder {
        /* synthetic */ Builder(C75281 c75281) {
            this();
        }

        public Builder clearPayload() {
            copyOnWrite();
            ((BasicLayerResource) this.instance).clearPayload();
            return this;
        }

        public Builder clearResAnimation() {
            copyOnWrite();
            ((BasicLayerResource) this.instance).clearResAnimation();
            return this;
        }

        public Builder clearResImage() {
            copyOnWrite();
            ((BasicLayerResource) this.instance).clearResImage();
            return this;
        }

        public Builder clearResNativeDraw() {
            copyOnWrite();
            ((BasicLayerResource) this.instance).clearResNativeDraw();
            return this;
        }

        public Builder clearResType() {
            copyOnWrite();
            ((BasicLayerResource) this.instance).clearResType();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
        public PayloadCase getPayloadCase() {
            return ((BasicLayerResource) this.instance).getPayloadCase();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
        public ResAnimation getResAnimation() {
            return ((BasicLayerResource) this.instance).getResAnimation();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
        public ResImage getResImage() {
            return ((BasicLayerResource) this.instance).getResImage();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
        public ResNativeDraw getResNativeDraw() {
            return ((BasicLayerResource) this.instance).getResNativeDraw();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
        public ResType getResType() {
            return ((BasicLayerResource) this.instance).getResType();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
        public int getResTypeValue() {
            return ((BasicLayerResource) this.instance).getResTypeValue();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
        public boolean hasResAnimation() {
            return ((BasicLayerResource) this.instance).hasResAnimation();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
        public boolean hasResImage() {
            return ((BasicLayerResource) this.instance).hasResImage();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
        public boolean hasResNativeDraw() {
            return ((BasicLayerResource) this.instance).hasResNativeDraw();
        }

        public Builder mergeResAnimation(ResAnimation resAnimation) {
            copyOnWrite();
            ((BasicLayerResource) this.instance).mergeResAnimation(resAnimation);
            return this;
        }

        public Builder mergeResImage(ResImage resImage) {
            copyOnWrite();
            ((BasicLayerResource) this.instance).mergeResImage(resImage);
            return this;
        }

        public Builder mergeResNativeDraw(ResNativeDraw resNativeDraw) {
            copyOnWrite();
            ((BasicLayerResource) this.instance).mergeResNativeDraw(resNativeDraw);
            return this;
        }

        public Builder setResAnimation(ResAnimation resAnimation) {
            copyOnWrite();
            ((BasicLayerResource) this.instance).setResAnimation(resAnimation);
            return this;
        }

        public Builder setResImage(ResImage resImage) {
            copyOnWrite();
            ((BasicLayerResource) this.instance).setResImage(resImage);
            return this;
        }

        public Builder setResNativeDraw(ResNativeDraw resNativeDraw) {
            copyOnWrite();
            ((BasicLayerResource) this.instance).setResNativeDraw(resNativeDraw);
            return this;
        }

        public Builder setResType(ResType resType) {
            copyOnWrite();
            ((BasicLayerResource) this.instance).setResType(resType);
            return this;
        }

        public Builder setResTypeValue(int i) {
            copyOnWrite();
            ((BasicLayerResource) this.instance).setResTypeValue(i);
            return this;
        }

        private Builder() {
            super(BasicLayerResource.DEFAULT_INSTANCE);
        }

        public Builder setResAnimation(ResAnimation.Builder builder) {
            copyOnWrite();
            ((BasicLayerResource) this.instance).setResAnimation(builder.build());
            return this;
        }

        public Builder setResImage(ResImage.Builder builder) {
            copyOnWrite();
            ((BasicLayerResource) this.instance).setResImage(builder.build());
            return this;
        }

        public Builder setResNativeDraw(ResNativeDraw.Builder builder) {
            copyOnWrite();
            ((BasicLayerResource) this.instance).setResNativeDraw(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum PayloadCase {
        RES_IMAGE(2),
        RES_ANIMATION(3),
        RES_NATIVE_DRAW(4),
        PAYLOAD_NOT_SET(0);
        
        private final int value;

        PayloadCase(int i) {
            this.value = i;
        }

        public static PayloadCase forNumber(int i) {
            if (i != 0) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return RES_NATIVE_DRAW;
                    }
                    return RES_ANIMATION;
                }
                return RES_IMAGE;
            }
            return PAYLOAD_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum ResType implements Internal.EnumLite {
        RES_TYPE_INVALID(0),
        RES_TYPE_PLUGIN(1),
        RES_TYPE_EMPTY(2),
        RES_TYPE_IMAGE(3),
        RES_TYPE_ANIMATION(4),
        RES_TYPE_NATIVE_DRAW(5),
        UNRECOGNIZED(-1);
        
        public static final int RES_TYPE_ANIMATION_VALUE = 4;
        public static final int RES_TYPE_EMPTY_VALUE = 2;
        public static final int RES_TYPE_IMAGE_VALUE = 3;
        public static final int RES_TYPE_INVALID_VALUE = 0;
        public static final int RES_TYPE_NATIVE_DRAW_VALUE = 5;
        public static final int RES_TYPE_PLUGIN_VALUE = 1;
        private static final Internal.EnumLiteMap<ResType> internalValueMap = new Internal.EnumLiteMap<ResType>() { // from class: com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResource.ResType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ResType findValueByNumber(int i) {
                return ResType.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes17.dex */
        private static final class ResTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ResTypeVerifier();

            private ResTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ResType.forNumber(i) != null;
            }
        }

        ResType(int i) {
            this.value = i;
        }

        public static ResType forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return RES_TYPE_NATIVE_DRAW;
                            }
                            return RES_TYPE_ANIMATION;
                        }
                        return RES_TYPE_IMAGE;
                    }
                    return RES_TYPE_EMPTY;
                }
                return RES_TYPE_PLUGIN;
            }
            return RES_TYPE_INVALID;
        }

        public static Internal.EnumLiteMap<ResType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ResTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ResType valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        BasicLayerResource basicLayerResource = new BasicLayerResource();
        DEFAULT_INSTANCE = basicLayerResource;
        GeneratedMessageLite.registerDefaultInstance(BasicLayerResource.class, basicLayerResource);
    }

    private BasicLayerResource() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payloadCase_ = 0;
        this.payload_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResAnimation() {
        if (this.payloadCase_ == 3) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResImage() {
        if (this.payloadCase_ == 2) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResNativeDraw() {
        if (this.payloadCase_ == 4) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResType() {
        this.resType_ = 0;
    }

    public static BasicLayerResource getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResAnimation(ResAnimation resAnimation) {
        resAnimation.getClass();
        if (this.payloadCase_ == 3 && this.payload_ != ResAnimation.getDefaultInstance()) {
            this.payload_ = ResAnimation.newBuilder((ResAnimation) this.payload_).mergeFrom((ResAnimation) resAnimation).buildPartial();
        } else {
            this.payload_ = resAnimation;
        }
        this.payloadCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResImage(ResImage resImage) {
        resImage.getClass();
        if (this.payloadCase_ == 2 && this.payload_ != ResImage.getDefaultInstance()) {
            this.payload_ = ResImage.newBuilder((ResImage) this.payload_).mergeFrom((ResImage) resImage).buildPartial();
        } else {
            this.payload_ = resImage;
        }
        this.payloadCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResNativeDraw(ResNativeDraw resNativeDraw) {
        resNativeDraw.getClass();
        if (this.payloadCase_ == 4 && this.payload_ != ResNativeDraw.getDefaultInstance()) {
            this.payload_ = ResNativeDraw.newBuilder((ResNativeDraw) this.payload_).mergeFrom((ResNativeDraw) resNativeDraw).buildPartial();
        } else {
            this.payload_ = resNativeDraw;
        }
        this.payloadCase_ = 4;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BasicLayerResource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BasicLayerResource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BasicLayerResource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BasicLayerResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BasicLayerResource> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResAnimation(ResAnimation resAnimation) {
        resAnimation.getClass();
        this.payload_ = resAnimation;
        this.payloadCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResImage(ResImage resImage) {
        resImage.getClass();
        this.payload_ = resImage;
        this.payloadCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResNativeDraw(ResNativeDraw resNativeDraw) {
        resNativeDraw.getClass();
        this.payload_ = resNativeDraw;
        this.payloadCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResType(ResType resType) {
        this.resType_ = resType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResTypeValue(int i) {
        this.resType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75281.f17372xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BasicLayerResource();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"payload_", "payloadCase_", "resType_", ResImage.class, ResAnimation.class, ResNativeDraw.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BasicLayerResource> parser = PARSER;
                if (parser == null) {
                    synchronized (BasicLayerResource.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
    public ResAnimation getResAnimation() {
        if (this.payloadCase_ == 3) {
            return (ResAnimation) this.payload_;
        }
        return ResAnimation.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
    public ResImage getResImage() {
        if (this.payloadCase_ == 2) {
            return (ResImage) this.payload_;
        }
        return ResImage.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
    public ResNativeDraw getResNativeDraw() {
        if (this.payloadCase_ == 4) {
            return (ResNativeDraw) this.payload_;
        }
        return ResNativeDraw.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
    public ResType getResType() {
        ResType forNumber = ResType.forNumber(this.resType_);
        return forNumber == null ? ResType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
    public int getResTypeValue() {
        return this.resType_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
    public boolean hasResAnimation() {
        return this.payloadCase_ == 3;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
    public boolean hasResImage() {
        return this.payloadCase_ == 2;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.BasicLayerResourceOrBuilder
    public boolean hasResNativeDraw() {
        return this.payloadCase_ == 4;
    }

    public static Builder newBuilder(BasicLayerResource basicLayerResource) {
        return DEFAULT_INSTANCE.createBuilder(basicLayerResource);
    }

    public static BasicLayerResource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BasicLayerResource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BasicLayerResource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BasicLayerResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BasicLayerResource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BasicLayerResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BasicLayerResource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BasicLayerResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BasicLayerResource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BasicLayerResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BasicLayerResource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BasicLayerResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BasicLayerResource parseFrom(InputStream inputStream) throws IOException {
        return (BasicLayerResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BasicLayerResource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BasicLayerResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BasicLayerResource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BasicLayerResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BasicLayerResource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BasicLayerResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
