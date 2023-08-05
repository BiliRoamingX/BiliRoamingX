package com.bapis.bilibili.dagw.component.avatar.v1;

import com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpec;
import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes17.dex */
public final class Layer extends GeneratedMessageLite<Layer, Layer.Builder> implements LayerOrBuilder {
    private static final Layer DEFAULT_INSTANCE;
    public static final int GENERAL_SPEC_FIELD_NUMBER = 3;
    public static final int LAYER_CONFIG_FIELD_NUMBER = 4;
    public static final int LAYER_ID_FIELD_NUMBER = 1;
    private static volatile Parser<Layer> PARSER = null;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int VISIBLE_FIELD_NUMBER = 2;
    private LayerGeneralSpec generalSpec_;
    private LayerConfig layerConfig_;
    private String layerId_ = "";
    private BasicLayerResource resource_;
    private boolean visible_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.Layer$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75311 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17374xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17374xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17374xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17374xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17374xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17374xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17374xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17374xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Layer, Builder> implements LayerOrBuilder {
        /* synthetic */ Builder(C75311 c75311) {
            this();
        }

        public Builder clearGeneralSpec() {
            copyOnWrite();
            ((Layer) this.instance).clearGeneralSpec();
            return this;
        }

        public Builder clearLayerConfig() {
            copyOnWrite();
            ((Layer) this.instance).clearLayerConfig();
            return this;
        }

        public Builder clearLayerId() {
            copyOnWrite();
            ((Layer) this.instance).clearLayerId();
            return this;
        }

        public Builder clearResource() {
            copyOnWrite();
            ((Layer) this.instance).clearResource();
            return this;
        }

        public Builder clearVisible() {
            copyOnWrite();
            ((Layer) this.instance).clearVisible();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
        public LayerGeneralSpec getGeneralSpec() {
            return ((Layer) this.instance).getGeneralSpec();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
        public LayerConfig getLayerConfig() {
            return ((Layer) this.instance).getLayerConfig();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
        public String getLayerId() {
            return ((Layer) this.instance).getLayerId();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
        public ByteString getLayerIdBytes() {
            return ((Layer) this.instance).getLayerIdBytes();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
        public BasicLayerResource getResource() {
            return ((Layer) this.instance).getResource();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
        public boolean getVisible() {
            return ((Layer) this.instance).getVisible();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
        public boolean hasGeneralSpec() {
            return ((Layer) this.instance).hasGeneralSpec();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
        public boolean hasLayerConfig() {
            return ((Layer) this.instance).hasLayerConfig();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
        public boolean hasResource() {
            return ((Layer) this.instance).hasResource();
        }

        public Builder mergeGeneralSpec(LayerGeneralSpec layerGeneralSpec) {
            copyOnWrite();
            ((Layer) this.instance).mergeGeneralSpec(layerGeneralSpec);
            return this;
        }

        public Builder mergeLayerConfig(LayerConfig layerConfig) {
            copyOnWrite();
            ((Layer) this.instance).mergeLayerConfig(layerConfig);
            return this;
        }

        public Builder mergeResource(BasicLayerResource basicLayerResource) {
            copyOnWrite();
            ((Layer) this.instance).mergeResource(basicLayerResource);
            return this;
        }

        public Builder setGeneralSpec(LayerGeneralSpec layerGeneralSpec) {
            copyOnWrite();
            ((Layer) this.instance).setGeneralSpec(layerGeneralSpec);
            return this;
        }

        public Builder setLayerConfig(LayerConfig layerConfig) {
            copyOnWrite();
            ((Layer) this.instance).setLayerConfig(layerConfig);
            return this;
        }

        public Builder setLayerId(String str) {
            copyOnWrite();
            ((Layer) this.instance).setLayerId(str);
            return this;
        }

        public Builder setLayerIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Layer) this.instance).setLayerIdBytes(byteString);
            return this;
        }

        public Builder setResource(BasicLayerResource basicLayerResource) {
            copyOnWrite();
            ((Layer) this.instance).setResource(basicLayerResource);
            return this;
        }

        public Builder setVisible(boolean z) {
            copyOnWrite();
            ((Layer) this.instance).setVisible(z);
            return this;
        }

        private Builder() {
            super(Layer.DEFAULT_INSTANCE);
        }

        public Builder setGeneralSpec(LayerGeneralSpec.Builder builder) {
            copyOnWrite();
            ((Layer) this.instance).setGeneralSpec(builder.build());
            return this;
        }

        public Builder setLayerConfig(LayerConfig.Builder builder) {
            copyOnWrite();
            ((Layer) this.instance).setLayerConfig(builder.build());
            return this;
        }

        public Builder setResource(BasicLayerResource.Builder builder) {
            copyOnWrite();
            ((Layer) this.instance).setResource(builder.build());
            return this;
        }
    }

    static {
        Layer layer = new Layer();
        DEFAULT_INSTANCE = layer;
        GeneratedMessageLite.registerDefaultInstance(Layer.class, layer);
    }

    private Layer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeneralSpec() {
        this.generalSpec_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayerConfig() {
        this.layerConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayerId() {
        this.layerId_ = getDefaultInstance().getLayerId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisible() {
        this.visible_ = false;
    }

    public static Layer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeneralSpec(LayerGeneralSpec layerGeneralSpec) {
        layerGeneralSpec.getClass();
        LayerGeneralSpec layerGeneralSpec2 = this.generalSpec_;
        if (layerGeneralSpec2 != null && layerGeneralSpec2 != LayerGeneralSpec.getDefaultInstance()) {
            this.generalSpec_ = LayerGeneralSpec.newBuilder(this.generalSpec_).mergeFrom((LayerGeneralSpec) layerGeneralSpec).buildPartial();
        } else {
            this.generalSpec_ = layerGeneralSpec;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLayerConfig(LayerConfig layerConfig) {
        layerConfig.getClass();
        LayerConfig layerConfig2 = this.layerConfig_;
        if (layerConfig2 != null && layerConfig2 != LayerConfig.getDefaultInstance()) {
            this.layerConfig_ = LayerConfig.newBuilder(this.layerConfig_).mergeFrom((LayerConfig) layerConfig).buildPartial();
        } else {
            this.layerConfig_ = layerConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResource(BasicLayerResource basicLayerResource) {
        basicLayerResource.getClass();
        BasicLayerResource basicLayerResource2 = this.resource_;
        if (basicLayerResource2 != null && basicLayerResource2 != BasicLayerResource.getDefaultInstance()) {
            this.resource_ = BasicLayerResource.newBuilder(this.resource_).mergeFrom((BasicLayerResource) basicLayerResource).buildPartial();
        } else {
            this.resource_ = basicLayerResource;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Layer parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Layer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Layer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Layer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Layer> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeneralSpec(LayerGeneralSpec layerGeneralSpec) {
        layerGeneralSpec.getClass();
        this.generalSpec_ = layerGeneralSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayerConfig(LayerConfig layerConfig) {
        layerConfig.getClass();
        this.layerConfig_ = layerConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayerId(String str) {
        str.getClass();
        this.layerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayerIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.layerId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(BasicLayerResource basicLayerResource) {
        basicLayerResource.getClass();
        this.resource_ = basicLayerResource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisible(boolean z) {
        this.visible_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75311.f17374xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Layer();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0007\u0003\t\u0004\t\u0005\t", new Object[]{"layerId_", "visible_", "generalSpec_", "layerConfig_", "resource_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Layer> parser = PARSER;
                if (parser == null) {
                    synchronized (Layer.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
    public LayerGeneralSpec getGeneralSpec() {
        LayerGeneralSpec layerGeneralSpec = this.generalSpec_;
        return layerGeneralSpec == null ? LayerGeneralSpec.getDefaultInstance() : layerGeneralSpec;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
    public LayerConfig getLayerConfig() {
        LayerConfig layerConfig = this.layerConfig_;
        return layerConfig == null ? LayerConfig.getDefaultInstance() : layerConfig;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
    public String getLayerId() {
        return this.layerId_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
    public ByteString getLayerIdBytes() {
        return ByteString.copyFromUtf8(this.layerId_);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
    public BasicLayerResource getResource() {
        BasicLayerResource basicLayerResource = this.resource_;
        return basicLayerResource == null ? BasicLayerResource.getDefaultInstance() : basicLayerResource;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
    public boolean getVisible() {
        return this.visible_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
    public boolean hasGeneralSpec() {
        return this.generalSpec_ != null;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
    public boolean hasLayerConfig() {
        return this.layerConfig_ != null;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerOrBuilder
    public boolean hasResource() {
        return this.resource_ != null;
    }

    public static Builder newBuilder(Layer layer) {
        return DEFAULT_INSTANCE.createBuilder(layer);
    }

    public static Layer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Layer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Layer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Layer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Layer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Layer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Layer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Layer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Layer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Layer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Layer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Layer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Layer parseFrom(InputStream inputStream) throws IOException {
        return (Layer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Layer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Layer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Layer parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Layer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Layer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Layer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
