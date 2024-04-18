package com.bapis.bilibili.dagw.component.avatar.common;

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
public final class MaskProperty extends GeneratedMessageLite<MaskProperty, MaskProperty.Builder> implements MaskPropertyOrBuilder {
    private static final MaskProperty DEFAULT_INSTANCE;
    public static final int GENERAL_SPEC_FIELD_NUMBER = 1;
    public static final int MASK_SRC_FIELD_NUMBER = 2;
    private static volatile Parser<MaskProperty> PARSER;
    private LayerGeneralSpec generalSpec_;
    private ResourceSource maskSrc_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.common.MaskProperty$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75161 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17365xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17365xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17365xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17365xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17365xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17365xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17365xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17365xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<MaskProperty, Builder> implements MaskPropertyOrBuilder {
        /* synthetic */ Builder(C75161 c75161) {
            this();
        }

        public Builder clearGeneralSpec() {
            copyOnWrite();
            ((MaskProperty) this.instance).clearGeneralSpec();
            return this;
        }

        public Builder clearMaskSrc() {
            copyOnWrite();
            ((MaskProperty) this.instance).clearMaskSrc();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder
        public LayerGeneralSpec getGeneralSpec() {
            return ((MaskProperty) this.instance).getGeneralSpec();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder
        public ResourceSource getMaskSrc() {
            return ((MaskProperty) this.instance).getMaskSrc();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder
        public boolean hasGeneralSpec() {
            return ((MaskProperty) this.instance).hasGeneralSpec();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder
        public boolean hasMaskSrc() {
            return ((MaskProperty) this.instance).hasMaskSrc();
        }

        public Builder mergeGeneralSpec(LayerGeneralSpec layerGeneralSpec) {
            copyOnWrite();
            ((MaskProperty) this.instance).mergeGeneralSpec(layerGeneralSpec);
            return this;
        }

        public Builder mergeMaskSrc(ResourceSource resourceSource) {
            copyOnWrite();
            ((MaskProperty) this.instance).mergeMaskSrc(resourceSource);
            return this;
        }

        public Builder setGeneralSpec(LayerGeneralSpec layerGeneralSpec) {
            copyOnWrite();
            ((MaskProperty) this.instance).setGeneralSpec(layerGeneralSpec);
            return this;
        }

        public Builder setMaskSrc(ResourceSource resourceSource) {
            copyOnWrite();
            ((MaskProperty) this.instance).setMaskSrc(resourceSource);
            return this;
        }

        private Builder() {
            super(MaskProperty.DEFAULT_INSTANCE);
        }

        public Builder setGeneralSpec(LayerGeneralSpec.Builder builder) {
            copyOnWrite();
            ((MaskProperty) this.instance).setGeneralSpec(builder.build());
            return this;
        }

        public Builder setMaskSrc(ResourceSource.Builder builder) {
            copyOnWrite();
            ((MaskProperty) this.instance).setMaskSrc(builder.build());
            return this;
        }
    }

    static {
        MaskProperty maskProperty = new MaskProperty();
        DEFAULT_INSTANCE = maskProperty;
        GeneratedMessageLite.registerDefaultInstance(MaskProperty.class, maskProperty);
    }

    private MaskProperty() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeneralSpec() {
        this.generalSpec_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaskSrc() {
        this.maskSrc_ = null;
    }

    public static MaskProperty getDefaultInstance() {
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
    public void mergeMaskSrc(ResourceSource resourceSource) {
        resourceSource.getClass();
        ResourceSource resourceSource2 = this.maskSrc_;
        if (resourceSource2 != null && resourceSource2 != ResourceSource.getDefaultInstance()) {
            this.maskSrc_ = ResourceSource.newBuilder(this.maskSrc_).mergeFrom((ResourceSource) resourceSource).buildPartial();
        } else {
            this.maskSrc_ = resourceSource;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MaskProperty parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MaskProperty) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaskProperty parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MaskProperty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MaskProperty> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeneralSpec(LayerGeneralSpec layerGeneralSpec) {
        layerGeneralSpec.getClass();
        this.generalSpec_ = layerGeneralSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaskSrc(ResourceSource resourceSource) {
        resourceSource.getClass();
        this.maskSrc_ = resourceSource;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75161.f17365xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MaskProperty();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"generalSpec_", "maskSrc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MaskProperty> parser = PARSER;
                if (parser == null) {
                    synchronized (MaskProperty.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder
    public LayerGeneralSpec getGeneralSpec() {
        LayerGeneralSpec layerGeneralSpec = this.generalSpec_;
        return layerGeneralSpec == null ? LayerGeneralSpec.getDefaultInstance() : layerGeneralSpec;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder
    public ResourceSource getMaskSrc() {
        ResourceSource resourceSource = this.maskSrc_;
        return resourceSource == null ? ResourceSource.getDefaultInstance() : resourceSource;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder
    public boolean hasGeneralSpec() {
        return this.generalSpec_ != null;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.MaskPropertyOrBuilder
    public boolean hasMaskSrc() {
        return this.maskSrc_ != null;
    }

    public static Builder newBuilder(MaskProperty maskProperty) {
        return DEFAULT_INSTANCE.createBuilder(maskProperty);
    }

    public static MaskProperty parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaskProperty) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MaskProperty parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MaskProperty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MaskProperty parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MaskProperty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MaskProperty parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MaskProperty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MaskProperty parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MaskProperty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MaskProperty parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MaskProperty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MaskProperty parseFrom(InputStream inputStream) throws IOException {
        return (MaskProperty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaskProperty parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaskProperty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MaskProperty parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MaskProperty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MaskProperty parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaskProperty) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
