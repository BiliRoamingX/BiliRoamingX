package com.bapis.bilibili.dagw.component.avatar.v1;

import com.bapis.bilibili.dagw.component.avatar.common.MaskProperty;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class LayerConfig extends GeneratedMessageLite<LayerConfig, LayerConfig.Builder> implements LayerConfigOrBuilder {
    public static final int ALLOW_OVER_PAINT_FIELD_NUMBER = 3;
    private static final LayerConfig DEFAULT_INSTANCE;
    public static final int IS_CRITICAL_FIELD_NUMBER = 2;
    public static final int LAYER_MASK_FIELD_NUMBER = 4;
    private static volatile Parser<LayerConfig> PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 1;
    private boolean allowOverPaint_;
    private boolean isCritical_;
    private MaskProperty layerMask_;
    private MapFieldLite<String, LayerTagConfig> tags_ = MapFieldLite.emptyMapField();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.LayerConfig$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75321 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17375xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17375xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17375xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17375xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17375xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17375xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17375xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17375xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LayerConfig, Builder> implements LayerConfigOrBuilder {
        /* synthetic */ Builder(C75321 c75321) {
            this();
        }

        public Builder clearAllowOverPaint() {
            copyOnWrite();
            ((LayerConfig) this.instance).clearAllowOverPaint();
            return this;
        }

        public Builder clearIsCritical() {
            copyOnWrite();
            ((LayerConfig) this.instance).clearIsCritical();
            return this;
        }

        public Builder clearLayerMask() {
            copyOnWrite();
            ((LayerConfig) this.instance).clearLayerMask();
            return this;
        }

        public Builder clearTags() {
            copyOnWrite();
            ((LayerConfig) this.instance).getMutableTagsMap().clear();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
        public boolean containsTags(String str) {
            str.getClass();
            return ((LayerConfig) this.instance).getTagsMap().containsKey(str);
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
        public boolean getAllowOverPaint() {
            return ((LayerConfig) this.instance).getAllowOverPaint();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
        public boolean getIsCritical() {
            return ((LayerConfig) this.instance).getIsCritical();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
        public MaskProperty getLayerMask() {
            return ((LayerConfig) this.instance).getLayerMask();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
        @Deprecated
        public Map<String, LayerTagConfig> getTags() {
            return getTagsMap();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
        public int getTagsCount() {
            return ((LayerConfig) this.instance).getTagsMap().size();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
        public Map<String, LayerTagConfig> getTagsMap() {
            return Collections.unmodifiableMap(((LayerConfig) this.instance).getTagsMap());
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
        public LayerTagConfig getTagsOrDefault(String str, LayerTagConfig layerTagConfig) {
            str.getClass();
            Map<String, LayerTagConfig> tagsMap = ((LayerConfig) this.instance).getTagsMap();
            return tagsMap.containsKey(str) ? tagsMap.get(str) : layerTagConfig;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
        public LayerTagConfig getTagsOrThrow(String str) {
            str.getClass();
            Map<String, LayerTagConfig> tagsMap = ((LayerConfig) this.instance).getTagsMap();
            if (tagsMap.containsKey(str)) {
                return tagsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
        public boolean hasLayerMask() {
            return ((LayerConfig) this.instance).hasLayerMask();
        }

        public Builder mergeLayerMask(MaskProperty maskProperty) {
            copyOnWrite();
            ((LayerConfig) this.instance).mergeLayerMask(maskProperty);
            return this;
        }

        public Builder putAllTags(Map<String, LayerTagConfig> map) {
            copyOnWrite();
            ((LayerConfig) this.instance).getMutableTagsMap().putAll(map);
            return this;
        }

        public Builder putTags(String str, LayerTagConfig layerTagConfig) {
            str.getClass();
            layerTagConfig.getClass();
            copyOnWrite();
            ((LayerConfig) this.instance).getMutableTagsMap().put(str, layerTagConfig);
            return this;
        }

        public Builder removeTags(String str) {
            str.getClass();
            copyOnWrite();
            ((LayerConfig) this.instance).getMutableTagsMap().remove(str);
            return this;
        }

        public Builder setAllowOverPaint(boolean z) {
            copyOnWrite();
            ((LayerConfig) this.instance).setAllowOverPaint(z);
            return this;
        }

        public Builder setIsCritical(boolean z) {
            copyOnWrite();
            ((LayerConfig) this.instance).setIsCritical(z);
            return this;
        }

        public Builder setLayerMask(MaskProperty maskProperty) {
            copyOnWrite();
            ((LayerConfig) this.instance).setLayerMask(maskProperty);
            return this;
        }

        private Builder() {
            super(LayerConfig.DEFAULT_INSTANCE);
        }

        public Builder setLayerMask(MaskProperty.Builder builder) {
            copyOnWrite();
            ((LayerConfig) this.instance).setLayerMask(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class TagsDefaultEntryHolder {
        static final MapEntryLite<String, LayerTagConfig> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, LayerTagConfig.getDefaultInstance());

        private TagsDefaultEntryHolder() {
        }
    }

    static {
        LayerConfig layerConfig = new LayerConfig();
        DEFAULT_INSTANCE = layerConfig;
        GeneratedMessageLite.registerDefaultInstance(LayerConfig.class, layerConfig);
    }

    private LayerConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowOverPaint() {
        this.allowOverPaint_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCritical() {
        this.isCritical_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayerMask() {
        this.layerMask_ = null;
    }

    public static LayerConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, LayerTagConfig> getMutableTagsMap() {
        return internalGetMutableTags();
    }

    private MapFieldLite<String, LayerTagConfig> internalGetMutableTags() {
        if (!this.tags_.isMutable()) {
            this.tags_ = this.tags_.mutableCopy();
        }
        return this.tags_;
    }

    private MapFieldLite<String, LayerTagConfig> internalGetTags() {
        return this.tags_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLayerMask(MaskProperty maskProperty) {
        maskProperty.getClass();
        MaskProperty maskProperty2 = this.layerMask_;
        if (maskProperty2 != null && maskProperty2 != MaskProperty.getDefaultInstance()) {
            this.layerMask_ = MaskProperty.newBuilder(this.layerMask_).mergeFrom((MaskProperty) maskProperty).buildPartial();
        } else {
            this.layerMask_ = maskProperty;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LayerConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LayerConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LayerConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LayerConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowOverPaint(boolean z) {
        this.allowOverPaint_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCritical(boolean z) {
        this.isCritical_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayerMask(MaskProperty maskProperty) {
        maskProperty.getClass();
        this.layerMask_ = maskProperty;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
    public boolean containsTags(String str) {
        str.getClass();
        return internalGetTags().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75321.f17375xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LayerConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u00012\u0002\u0007\u0003\u0007\u0004\t", new Object[]{"tags_", TagsDefaultEntryHolder.defaultEntry, "isCritical_", "allowOverPaint_", "layerMask_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LayerConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (LayerConfig.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
    public boolean getAllowOverPaint() {
        return this.allowOverPaint_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
    public boolean getIsCritical() {
        return this.isCritical_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
    public MaskProperty getLayerMask() {
        MaskProperty maskProperty = this.layerMask_;
        return maskProperty == null ? MaskProperty.getDefaultInstance() : maskProperty;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
    @Deprecated
    public Map<String, LayerTagConfig> getTags() {
        return getTagsMap();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
    public int getTagsCount() {
        return internalGetTags().size();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
    public Map<String, LayerTagConfig> getTagsMap() {
        return Collections.unmodifiableMap(internalGetTags());
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
    public LayerTagConfig getTagsOrDefault(String str, LayerTagConfig layerTagConfig) {
        str.getClass();
        MapFieldLite<String, LayerTagConfig> internalGetTags = internalGetTags();
        return internalGetTags.containsKey(str) ? internalGetTags.get(str) : layerTagConfig;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
    public LayerTagConfig getTagsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, LayerTagConfig> internalGetTags = internalGetTags();
        if (internalGetTags.containsKey(str)) {
            return internalGetTags.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.LayerConfigOrBuilder
    public boolean hasLayerMask() {
        return this.layerMask_ != null;
    }

    public static Builder newBuilder(LayerConfig layerConfig) {
        return DEFAULT_INSTANCE.createBuilder(layerConfig);
    }

    public static LayerConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LayerConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LayerConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LayerConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LayerConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LayerConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LayerConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LayerConfig parseFrom(InputStream inputStream) throws IOException {
        return (LayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LayerConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LayerConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LayerConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
