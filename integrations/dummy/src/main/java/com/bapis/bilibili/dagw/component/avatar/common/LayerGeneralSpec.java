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
public final class LayerGeneralSpec extends GeneratedMessageLite<LayerGeneralSpec, LayerGeneralSpec.Builder> implements LayerGeneralSpecOrBuilder {
    private static final LayerGeneralSpec DEFAULT_INSTANCE;
    private static volatile Parser<LayerGeneralSpec> PARSER = null;
    public static final int POS_SPEC_FIELD_NUMBER = 1;
    public static final int RENDER_SPEC_FIELD_NUMBER = 3;
    public static final int SIZE_SPEC_FIELD_NUMBER = 2;
    private PositionSpec posSpec_;
    private BasicRenderSpec renderSpec_;
    private SizeSpec sizeSpec_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpec$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75151 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17364xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17364xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17364xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17364xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17364xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17364xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17364xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17364xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LayerGeneralSpec, Builder> implements LayerGeneralSpecOrBuilder {
        /* synthetic */ Builder(C75151 c75151) {
            this();
        }

        public Builder clearPosSpec() {
            copyOnWrite();
            ((LayerGeneralSpec) this.instance).clearPosSpec();
            return this;
        }

        public Builder clearRenderSpec() {
            copyOnWrite();
            ((LayerGeneralSpec) this.instance).clearRenderSpec();
            return this;
        }

        public Builder clearSizeSpec() {
            copyOnWrite();
            ((LayerGeneralSpec) this.instance).clearSizeSpec();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpecOrBuilder
        public PositionSpec getPosSpec() {
            return ((LayerGeneralSpec) this.instance).getPosSpec();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpecOrBuilder
        public BasicRenderSpec getRenderSpec() {
            return ((LayerGeneralSpec) this.instance).getRenderSpec();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpecOrBuilder
        public SizeSpec getSizeSpec() {
            return ((LayerGeneralSpec) this.instance).getSizeSpec();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpecOrBuilder
        public boolean hasPosSpec() {
            return ((LayerGeneralSpec) this.instance).hasPosSpec();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpecOrBuilder
        public boolean hasRenderSpec() {
            return ((LayerGeneralSpec) this.instance).hasRenderSpec();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpecOrBuilder
        public boolean hasSizeSpec() {
            return ((LayerGeneralSpec) this.instance).hasSizeSpec();
        }

        public Builder mergePosSpec(PositionSpec positionSpec) {
            copyOnWrite();
            ((LayerGeneralSpec) this.instance).mergePosSpec(positionSpec);
            return this;
        }

        public Builder mergeRenderSpec(BasicRenderSpec basicRenderSpec) {
            copyOnWrite();
            ((LayerGeneralSpec) this.instance).mergeRenderSpec(basicRenderSpec);
            return this;
        }

        public Builder mergeSizeSpec(SizeSpec sizeSpec) {
            copyOnWrite();
            ((LayerGeneralSpec) this.instance).mergeSizeSpec(sizeSpec);
            return this;
        }

        public Builder setPosSpec(PositionSpec positionSpec) {
            copyOnWrite();
            ((LayerGeneralSpec) this.instance).setPosSpec(positionSpec);
            return this;
        }

        public Builder setRenderSpec(BasicRenderSpec basicRenderSpec) {
            copyOnWrite();
            ((LayerGeneralSpec) this.instance).setRenderSpec(basicRenderSpec);
            return this;
        }

        public Builder setSizeSpec(SizeSpec sizeSpec) {
            copyOnWrite();
            ((LayerGeneralSpec) this.instance).setSizeSpec(sizeSpec);
            return this;
        }

        private Builder() {
            super(LayerGeneralSpec.DEFAULT_INSTANCE);
        }

        public Builder setPosSpec(PositionSpec.Builder builder) {
            copyOnWrite();
            ((LayerGeneralSpec) this.instance).setPosSpec(builder.build());
            return this;
        }

        public Builder setRenderSpec(BasicRenderSpec.Builder builder) {
            copyOnWrite();
            ((LayerGeneralSpec) this.instance).setRenderSpec(builder.build());
            return this;
        }

        public Builder setSizeSpec(SizeSpec.Builder builder) {
            copyOnWrite();
            ((LayerGeneralSpec) this.instance).setSizeSpec(builder.build());
            return this;
        }
    }

    static {
        LayerGeneralSpec layerGeneralSpec = new LayerGeneralSpec();
        DEFAULT_INSTANCE = layerGeneralSpec;
        GeneratedMessageLite.registerDefaultInstance(LayerGeneralSpec.class, layerGeneralSpec);
    }

    private LayerGeneralSpec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosSpec() {
        this.posSpec_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenderSpec() {
        this.renderSpec_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSizeSpec() {
        this.sizeSpec_ = null;
    }

    public static LayerGeneralSpec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosSpec(PositionSpec positionSpec) {
        positionSpec.getClass();
        PositionSpec positionSpec2 = this.posSpec_;
        if (positionSpec2 != null && positionSpec2 != PositionSpec.getDefaultInstance()) {
            this.posSpec_ = PositionSpec.newBuilder(this.posSpec_).mergeFrom((PositionSpec) positionSpec).buildPartial();
        } else {
            this.posSpec_ = positionSpec;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRenderSpec(BasicRenderSpec basicRenderSpec) {
        basicRenderSpec.getClass();
        BasicRenderSpec basicRenderSpec2 = this.renderSpec_;
        if (basicRenderSpec2 != null && basicRenderSpec2 != BasicRenderSpec.getDefaultInstance()) {
            this.renderSpec_ = BasicRenderSpec.newBuilder(this.renderSpec_).mergeFrom((BasicRenderSpec) basicRenderSpec).buildPartial();
        } else {
            this.renderSpec_ = basicRenderSpec;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSizeSpec(SizeSpec sizeSpec) {
        sizeSpec.getClass();
        SizeSpec sizeSpec2 = this.sizeSpec_;
        if (sizeSpec2 != null && sizeSpec2 != SizeSpec.getDefaultInstance()) {
            this.sizeSpec_ = SizeSpec.newBuilder(this.sizeSpec_).mergeFrom((SizeSpec) sizeSpec).buildPartial();
        } else {
            this.sizeSpec_ = sizeSpec;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LayerGeneralSpec parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LayerGeneralSpec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LayerGeneralSpec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LayerGeneralSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LayerGeneralSpec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosSpec(PositionSpec positionSpec) {
        positionSpec.getClass();
        this.posSpec_ = positionSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderSpec(BasicRenderSpec basicRenderSpec) {
        basicRenderSpec.getClass();
        this.renderSpec_ = basicRenderSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSizeSpec(SizeSpec sizeSpec) {
        sizeSpec.getClass();
        this.sizeSpec_ = sizeSpec;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75151.f17364xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LayerGeneralSpec();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"posSpec_", "sizeSpec_", "renderSpec_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LayerGeneralSpec> parser = PARSER;
                if (parser == null) {
                    synchronized (LayerGeneralSpec.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpecOrBuilder
    public PositionSpec getPosSpec() {
        PositionSpec positionSpec = this.posSpec_;
        return positionSpec == null ? PositionSpec.getDefaultInstance() : positionSpec;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpecOrBuilder
    public BasicRenderSpec getRenderSpec() {
        BasicRenderSpec basicRenderSpec = this.renderSpec_;
        return basicRenderSpec == null ? BasicRenderSpec.getDefaultInstance() : basicRenderSpec;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpecOrBuilder
    public SizeSpec getSizeSpec() {
        SizeSpec sizeSpec = this.sizeSpec_;
        return sizeSpec == null ? SizeSpec.getDefaultInstance() : sizeSpec;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpecOrBuilder
    public boolean hasPosSpec() {
        return this.posSpec_ != null;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpecOrBuilder
    public boolean hasRenderSpec() {
        return this.renderSpec_ != null;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpecOrBuilder
    public boolean hasSizeSpec() {
        return this.sizeSpec_ != null;
    }

    public static Builder newBuilder(LayerGeneralSpec layerGeneralSpec) {
        return DEFAULT_INSTANCE.createBuilder(layerGeneralSpec);
    }

    public static LayerGeneralSpec parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LayerGeneralSpec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LayerGeneralSpec parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LayerGeneralSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LayerGeneralSpec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LayerGeneralSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LayerGeneralSpec parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LayerGeneralSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LayerGeneralSpec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LayerGeneralSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LayerGeneralSpec parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LayerGeneralSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LayerGeneralSpec parseFrom(InputStream inputStream) throws IOException {
        return (LayerGeneralSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LayerGeneralSpec parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LayerGeneralSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LayerGeneralSpec parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LayerGeneralSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LayerGeneralSpec parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LayerGeneralSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
