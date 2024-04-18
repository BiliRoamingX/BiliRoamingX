package com.bapis.bilibili.dagw.component.avatar.v1;

import com.bapis.bilibili.dagw.component.avatar.common.MaskProperty;
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
public final class LayerGroup extends GeneratedMessageLite<LayerGroup, LayerGroup.Builder> implements LayerGroupOrBuilder {
    private static final LayerGroup DEFAULT_INSTANCE;
    public static final int GROUP_ID_FIELD_NUMBER = 1;
    public static final int GROUP_MASK_FIELD_NUMBER = 3;
    public static final int IS_CRITICAL_GROUP_FIELD_NUMBER = 4;
    public static final int LAYERS_FIELD_NUMBER = 2;
    private static volatile Parser<LayerGroup> PARSER;
    private MaskProperty groupMask_;
    private boolean isCriticalGroup_;
    private String groupId_ = "";
    private Internal.ProtobufList<Layer> layers_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.LayerGroup$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75331 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17376xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17376xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17376xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17376xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17376xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17376xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17376xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17376xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LayerGroup, Builder> implements LayerGroupOrBuilder {
        /* synthetic */ Builder(C75331 c75331) {
            this();
        }

        public Builder addAllLayers(Iterable<? extends Layer> iterable) {
            copyOnWrite();
            ((LayerGroup) this.instance).addAllLayers(iterable);
            return this;
        }

        public Builder addLayers(Layer layer) {
            copyOnWrite();
            ((LayerGroup) this.instance).addLayers(layer);
            return this;
        }

        public Builder clearGroupId() {
            copyOnWrite();
            ((LayerGroup) this.instance).clearGroupId();
            return this;
        }

        public Builder clearGroupMask() {
            copyOnWrite();
            ((LayerGroup) this.instance).clearGroupMask();
            return this;
        }

        public Builder clearIsCriticalGroup() {
            copyOnWrite();
            ((LayerGroup) this.instance).clearIsCriticalGroup();
            return this;
        }

        public Builder clearLayers() {
            copyOnWrite();
            ((LayerGroup) this.instance).clearLayers();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
        public String getGroupId() {
            return ((LayerGroup) this.instance).getGroupId();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
        public ByteString getGroupIdBytes() {
            return ((LayerGroup) this.instance).getGroupIdBytes();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
        public MaskProperty getGroupMask() {
            return ((LayerGroup) this.instance).getGroupMask();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
        public boolean getIsCriticalGroup() {
            return ((LayerGroup) this.instance).getIsCriticalGroup();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
        public Layer getLayers(int i) {
            return ((LayerGroup) this.instance).getLayers(i);
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
        public int getLayersCount() {
            return ((LayerGroup) this.instance).getLayersCount();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
        public List<Layer> getLayersList() {
            return Collections.unmodifiableList(((LayerGroup) this.instance).getLayersList());
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
        public boolean hasGroupMask() {
            return ((LayerGroup) this.instance).hasGroupMask();
        }

        public Builder mergeGroupMask(MaskProperty maskProperty) {
            copyOnWrite();
            ((LayerGroup) this.instance).mergeGroupMask(maskProperty);
            return this;
        }

        public Builder removeLayers(int i) {
            copyOnWrite();
            ((LayerGroup) this.instance).removeLayers(i);
            return this;
        }

        public Builder setGroupId(String str) {
            copyOnWrite();
            ((LayerGroup) this.instance).setGroupId(str);
            return this;
        }

        public Builder setGroupIdBytes(ByteString byteString) {
            copyOnWrite();
            ((LayerGroup) this.instance).setGroupIdBytes(byteString);
            return this;
        }

        public Builder setGroupMask(MaskProperty maskProperty) {
            copyOnWrite();
            ((LayerGroup) this.instance).setGroupMask(maskProperty);
            return this;
        }

        public Builder setIsCriticalGroup(boolean z) {
            copyOnWrite();
            ((LayerGroup) this.instance).setIsCriticalGroup(z);
            return this;
        }

        public Builder setLayers(int i, Layer layer) {
            copyOnWrite();
            ((LayerGroup) this.instance).setLayers(i, layer);
            return this;
        }

        private Builder() {
            super(LayerGroup.DEFAULT_INSTANCE);
        }

        public Builder addLayers(int i, Layer layer) {
            copyOnWrite();
            ((LayerGroup) this.instance).addLayers(i, layer);
            return this;
        }

        public Builder setGroupMask(MaskProperty.Builder builder) {
            copyOnWrite();
            ((LayerGroup) this.instance).setGroupMask(builder.build());
            return this;
        }

        public Builder setLayers(int i, Layer.Builder builder) {
            copyOnWrite();
            ((LayerGroup) this.instance).setLayers(i, builder.build());
            return this;
        }

        public Builder addLayers(Layer.Builder builder) {
            copyOnWrite();
            ((LayerGroup) this.instance).addLayers(builder.build());
            return this;
        }

        public Builder addLayers(int i, Layer.Builder builder) {
            copyOnWrite();
            ((LayerGroup) this.instance).addLayers(i, builder.build());
            return this;
        }
    }

    static {
        LayerGroup layerGroup = new LayerGroup();
        DEFAULT_INSTANCE = layerGroup;
        GeneratedMessageLite.registerDefaultInstance(LayerGroup.class, layerGroup);
    }

    private LayerGroup() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLayers(Iterable<? extends Layer> iterable) {
        ensureLayersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.layers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(Layer layer) {
        layer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(layer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupId() {
        this.groupId_ = getDefaultInstance().getGroupId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupMask() {
        this.groupMask_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCriticalGroup() {
        this.isCriticalGroup_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayers() {
        this.layers_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLayersIsMutable() {
        Internal.ProtobufList<Layer> protobufList = this.layers_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.layers_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static LayerGroup getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGroupMask(MaskProperty maskProperty) {
        maskProperty.getClass();
        MaskProperty maskProperty2 = this.groupMask_;
        if (maskProperty2 != null && maskProperty2 != MaskProperty.getDefaultInstance()) {
            this.groupMask_ = MaskProperty.newBuilder(this.groupMask_).mergeFrom((MaskProperty) maskProperty).buildPartial();
        } else {
            this.groupMask_ = maskProperty;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LayerGroup parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LayerGroup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LayerGroup parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LayerGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LayerGroup> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLayers(int i) {
        ensureLayersIsMutable();
        this.layers_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupId(String str) {
        str.getClass();
        this.groupId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.groupId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupMask(MaskProperty maskProperty) {
        maskProperty.getClass();
        this.groupMask_ = maskProperty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCriticalGroup(boolean z) {
        this.isCriticalGroup_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayers(int i, Layer layer) {
        layer.getClass();
        ensureLayersIsMutable();
        this.layers_.set(i, layer);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75331.f17376xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LayerGroup();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\u001b\u0003\t\u0004\u0007", new Object[]{"groupId_", "layers_", Layer.class, "groupMask_", "isCriticalGroup_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LayerGroup> parser = PARSER;
                if (parser == null) {
                    synchronized (LayerGroup.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
    public String getGroupId() {
        return this.groupId_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
    public ByteString getGroupIdBytes() {
        return ByteString.copyFromUtf8(this.groupId_);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
    public MaskProperty getGroupMask() {
        MaskProperty maskProperty = this.groupMask_;
        return maskProperty == null ? MaskProperty.getDefaultInstance() : maskProperty;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
    public boolean getIsCriticalGroup() {
        return this.isCriticalGroup_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
    public Layer getLayers(int i) {
        return this.layers_.get(i);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
    public int getLayersCount() {
        return this.layers_.size();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
    public List<Layer> getLayersList() {
        return this.layers_;
    }

    public LayerOrBuilder getLayersOrBuilder(int i) {
        return this.layers_.get(i);
    }

    public List<? extends LayerOrBuilder> getLayersOrBuilderList() {
        return this.layers_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerGroupOrBuilder
    public boolean hasGroupMask() {
        return this.groupMask_ != null;
    }

    public static Builder newBuilder(LayerGroup layerGroup) {
        return DEFAULT_INSTANCE.createBuilder(layerGroup);
    }

    public static LayerGroup parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LayerGroup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LayerGroup parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LayerGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LayerGroup parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LayerGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(int i, Layer layer) {
        layer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i, layer);
    }

    public static LayerGroup parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LayerGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LayerGroup parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LayerGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LayerGroup parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LayerGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LayerGroup parseFrom(InputStream inputStream) throws IOException {
        return (LayerGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LayerGroup parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LayerGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LayerGroup parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LayerGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LayerGroup parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LayerGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
