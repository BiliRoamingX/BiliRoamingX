package com.bapis.bilibili.dagw.component.avatar.v1;

import com.bapis.bilibili.dagw.component.avatar.common.SizeSpec;
import com.google.protobuf.AbstractMessageLite;
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
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class AvatarItem extends GeneratedMessageLite<AvatarItem, AvatarItem.Builder> implements com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder {
    public static final int CONTAINER_SIZE_FIELD_NUMBER = 1;
    private static final AvatarItem DEFAULT_INSTANCE;
    public static final int FALLBACK_LAYERS_FIELD_NUMBER = 3;
    public static final int LAYERS_FIELD_NUMBER = 2;
    public static final int MID_FIELD_NUMBER = 4;
    private static volatile Parser<AvatarItem> PARSER;
    private SizeSpec containerSize_;
    private LayerGroup fallbackLayers_;
    private Internal.ProtobufList<LayerGroup> layers_ = GeneratedMessageLite.emptyProtobufList();
    private long mid_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.AvatarItem$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75271 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17371xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17371xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17371xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17371xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17371xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17371xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17371xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17371xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AvatarItem, Builder> implements com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder {
        /* synthetic */ Builder(C75271 c75271) {
            this();
        }

        public Builder addAllLayers(Iterable<? extends LayerGroup> iterable) {
            copyOnWrite();
            ((AvatarItem) this.instance).addAllLayers(iterable);
            return this;
        }

        public Builder addLayers(LayerGroup layerGroup) {
            copyOnWrite();
            ((AvatarItem) this.instance).addLayers(layerGroup);
            return this;
        }

        public Builder clearContainerSize() {
            copyOnWrite();
            ((AvatarItem) this.instance).clearContainerSize();
            return this;
        }

        public Builder clearFallbackLayers() {
            copyOnWrite();
            ((AvatarItem) this.instance).clearFallbackLayers();
            return this;
        }

        public Builder clearLayers() {
            copyOnWrite();
            ((AvatarItem) this.instance).clearLayers();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((AvatarItem) this.instance).clearMid();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
        public SizeSpec getContainerSize() {
            return ((AvatarItem) this.instance).getContainerSize();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
        public LayerGroup getFallbackLayers() {
            return ((AvatarItem) this.instance).getFallbackLayers();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
        public LayerGroup getLayers(int i) {
            return ((AvatarItem) this.instance).getLayers(i);
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
        public int getLayersCount() {
            return ((AvatarItem) this.instance).getLayersCount();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
        public List<LayerGroup> getLayersList() {
            return Collections.unmodifiableList(((AvatarItem) this.instance).getLayersList());
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
        public long getMid() {
            return ((AvatarItem) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
        public boolean hasContainerSize() {
            return ((AvatarItem) this.instance).hasContainerSize();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
        public boolean hasFallbackLayers() {
            return ((AvatarItem) this.instance).hasFallbackLayers();
        }

        public Builder mergeContainerSize(SizeSpec sizeSpec) {
            copyOnWrite();
            ((AvatarItem) this.instance).mergeContainerSize(sizeSpec);
            return this;
        }

        public Builder mergeFallbackLayers(LayerGroup layerGroup) {
            copyOnWrite();
            ((AvatarItem) this.instance).mergeFallbackLayers(layerGroup);
            return this;
        }

        public Builder removeLayers(int i) {
            copyOnWrite();
            ((AvatarItem) this.instance).removeLayers(i);
            return this;
        }

        public Builder setContainerSize(SizeSpec sizeSpec) {
            copyOnWrite();
            ((AvatarItem) this.instance).setContainerSize(sizeSpec);
            return this;
        }

        public Builder setFallbackLayers(LayerGroup layerGroup) {
            copyOnWrite();
            ((AvatarItem) this.instance).setFallbackLayers(layerGroup);
            return this;
        }

        public Builder setLayers(int i, LayerGroup layerGroup) {
            copyOnWrite();
            ((AvatarItem) this.instance).setLayers(i, layerGroup);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((AvatarItem) this.instance).setMid(j);
            return this;
        }

        private Builder() {
            super(AvatarItem.DEFAULT_INSTANCE);
        }

        public Builder addLayers(int i, LayerGroup layerGroup) {
            copyOnWrite();
            ((AvatarItem) this.instance).addLayers(i, layerGroup);
            return this;
        }

        public Builder setContainerSize(SizeSpec.Builder builder) {
            copyOnWrite();
            ((AvatarItem) this.instance).setContainerSize(builder.build());
            return this;
        }

        public Builder setFallbackLayers(LayerGroup.Builder builder) {
            copyOnWrite();
            ((AvatarItem) this.instance).setFallbackLayers(builder.build());
            return this;
        }

        public Builder setLayers(int i, LayerGroup.Builder builder) {
            copyOnWrite();
            ((AvatarItem) this.instance).setLayers(i, builder.build());
            return this;
        }

        public Builder addLayers(LayerGroup.Builder builder) {
            copyOnWrite();
            ((AvatarItem) this.instance).addLayers(builder.build());
            return this;
        }

        public Builder addLayers(int i, LayerGroup.Builder builder) {
            copyOnWrite();
            ((AvatarItem) this.instance).addLayers(i, builder.build());
            return this;
        }
    }

    static {
        AvatarItem avatarItem = new AvatarItem();
        DEFAULT_INSTANCE = avatarItem;
        GeneratedMessageLite.registerDefaultInstance(AvatarItem.class, avatarItem);
    }

    private AvatarItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLayers(Iterable<? extends LayerGroup> iterable) {
        ensureLayersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.layers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(LayerGroup layerGroup) {
        layerGroup.getClass();
        ensureLayersIsMutable();
        this.layers_.add(layerGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContainerSize() {
        this.containerSize_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFallbackLayers() {
        this.fallbackLayers_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayers() {
        this.layers_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = 0L;
    }

    private void ensureLayersIsMutable() {
        Internal.ProtobufList<LayerGroup> protobufList = this.layers_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.layers_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static AvatarItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContainerSize(SizeSpec sizeSpec) {
        sizeSpec.getClass();
        SizeSpec sizeSpec2 = this.containerSize_;
        if (sizeSpec2 != null && sizeSpec2 != SizeSpec.getDefaultInstance()) {
            this.containerSize_ = SizeSpec.newBuilder(this.containerSize_).mergeFrom((SizeSpec) sizeSpec).buildPartial();
        } else {
            this.containerSize_ = sizeSpec;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFallbackLayers(LayerGroup layerGroup) {
        layerGroup.getClass();
        LayerGroup layerGroup2 = this.fallbackLayers_;
        if (layerGroup2 != null && layerGroup2 != LayerGroup.getDefaultInstance()) {
            this.fallbackLayers_ = LayerGroup.newBuilder(this.fallbackLayers_).mergeFrom((LayerGroup) layerGroup).buildPartial();
        } else {
            this.fallbackLayers_ = layerGroup;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AvatarItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AvatarItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AvatarItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AvatarItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AvatarItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLayers(int i) {
        ensureLayersIsMutable();
        this.layers_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContainerSize(SizeSpec sizeSpec) {
        sizeSpec.getClass();
        this.containerSize_ = sizeSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFallbackLayers(LayerGroup layerGroup) {
        layerGroup.getClass();
        this.fallbackLayers_ = layerGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayers(int i, LayerGroup layerGroup) {
        layerGroup.getClass();
        ensureLayersIsMutable();
        this.layers_.set(i, layerGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(long j) {
        this.mid_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75271.f17371xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AvatarItem();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u0002", new Object[]{"containerSize_", "layers_", LayerGroup.class, "fallbackLayers_", "mid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AvatarItem> parser = PARSER;
                if (parser == null) {
                    synchronized (AvatarItem.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
    public SizeSpec getContainerSize() {
        SizeSpec sizeSpec = this.containerSize_;
        return sizeSpec == null ? SizeSpec.getDefaultInstance() : sizeSpec;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
    public LayerGroup getFallbackLayers() {
        LayerGroup layerGroup = this.fallbackLayers_;
        return layerGroup == null ? LayerGroup.getDefaultInstance() : layerGroup;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
    public LayerGroup getLayers(int i) {
        return this.layers_.get(i);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
    public int getLayersCount() {
        return this.layers_.size();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
    public List<LayerGroup> getLayersList() {
        return this.layers_;
    }

    public LayerGroupOrBuilder getLayersOrBuilder(int i) {
        return this.layers_.get(i);
    }

    public List<? extends LayerGroupOrBuilder> getLayersOrBuilderList() {
        return this.layers_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
    public boolean hasContainerSize() {
        return this.containerSize_ != null;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.AvatarItemOrBuilder
    public boolean hasFallbackLayers() {
        return this.fallbackLayers_ != null;
    }

    public static Builder newBuilder(AvatarItem avatarItem) {
        return DEFAULT_INSTANCE.createBuilder(avatarItem);
    }

    public static AvatarItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AvatarItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AvatarItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AvatarItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AvatarItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AvatarItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(int i, LayerGroup layerGroup) {
        layerGroup.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i, layerGroup);
    }

    public static AvatarItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AvatarItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AvatarItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AvatarItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AvatarItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AvatarItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AvatarItem parseFrom(InputStream inputStream) throws IOException {
        return (AvatarItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AvatarItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AvatarItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AvatarItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AvatarItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AvatarItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AvatarItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
