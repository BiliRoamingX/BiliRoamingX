package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

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
public final class LiveAnimeConfig extends GeneratedMessageLite<LiveAnimeConfig, LiveAnimeConfig.Builder> implements LiveAnimeConfigOrBuilder {
    public static final int BORDER_CONFIG_FIELD_NUMBER = 4;
    public static final int CONFIG_FIELD_NUMBER = 2;
    private static final LiveAnimeConfig DEFAULT_INSTANCE;
    public static final int IS_LIVE_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 3;
    private static volatile Parser<LiveAnimeConfig> PARSER;
    private LiveTextConfig config_;
    private boolean isLive_;
    private Internal.ProtobufList<LiveAnimeItem> items_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<BorderConfig> borderConfig_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75451 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17387xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17387xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17387xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17387xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17387xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17387xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17387xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17387xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LiveAnimeConfig, Builder> implements LiveAnimeConfigOrBuilder {
        /* synthetic */ Builder(C75451 c75451) {
            this();
        }

        public Builder addAllBorderConfig(Iterable<? extends BorderConfig> iterable) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).addAllBorderConfig(iterable);
            return this;
        }

        public Builder addAllItems(Iterable<? extends LiveAnimeItem> iterable) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).addAllItems(iterable);
            return this;
        }

        public Builder addBorderConfig(BorderConfig borderConfig) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).addBorderConfig(borderConfig);
            return this;
        }

        public Builder addItems(LiveAnimeItem liveAnimeItem) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).addItems(liveAnimeItem);
            return this;
        }

        public Builder clearBorderConfig() {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).clearBorderConfig();
            return this;
        }

        public Builder clearConfig() {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).clearConfig();
            return this;
        }

        public Builder clearIsLive() {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).clearIsLive();
            return this;
        }

        public Builder clearItems() {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).clearItems();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
        public BorderConfig getBorderConfig(int i) {
            return ((LiveAnimeConfig) this.instance).getBorderConfig(i);
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
        public int getBorderConfigCount() {
            return ((LiveAnimeConfig) this.instance).getBorderConfigCount();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
        public List<BorderConfig> getBorderConfigList() {
            return Collections.unmodifiableList(((LiveAnimeConfig) this.instance).getBorderConfigList());
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
        public LiveTextConfig getConfig() {
            return ((LiveAnimeConfig) this.instance).getConfig();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
        public boolean getIsLive() {
            return ((LiveAnimeConfig) this.instance).getIsLive();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
        public LiveAnimeItem getItems(int i) {
            return ((LiveAnimeConfig) this.instance).getItems(i);
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
        public int getItemsCount() {
            return ((LiveAnimeConfig) this.instance).getItemsCount();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
        public List<LiveAnimeItem> getItemsList() {
            return Collections.unmodifiableList(((LiveAnimeConfig) this.instance).getItemsList());
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
        public boolean hasConfig() {
            return ((LiveAnimeConfig) this.instance).hasConfig();
        }

        public Builder mergeConfig(LiveTextConfig liveTextConfig) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).mergeConfig(liveTextConfig);
            return this;
        }

        public Builder removeBorderConfig(int i) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).removeBorderConfig(i);
            return this;
        }

        public Builder removeItems(int i) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).removeItems(i);
            return this;
        }

        public Builder setBorderConfig(int i, BorderConfig borderConfig) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).setBorderConfig(i, borderConfig);
            return this;
        }

        public Builder setConfig(LiveTextConfig liveTextConfig) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).setConfig(liveTextConfig);
            return this;
        }

        public Builder setIsLive(boolean z) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).setIsLive(z);
            return this;
        }

        public Builder setItems(int i, LiveAnimeItem liveAnimeItem) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).setItems(i, liveAnimeItem);
            return this;
        }

        private Builder() {
            super(LiveAnimeConfig.DEFAULT_INSTANCE);
        }

        public Builder addBorderConfig(int i, BorderConfig borderConfig) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).addBorderConfig(i, borderConfig);
            return this;
        }

        public Builder addItems(int i, LiveAnimeItem liveAnimeItem) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).addItems(i, liveAnimeItem);
            return this;
        }

        public Builder setBorderConfig(int i, BorderConfig.Builder builder) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).setBorderConfig(i, builder.build());
            return this;
        }

        public Builder setConfig(LiveTextConfig.Builder builder) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).setConfig(builder.build());
            return this;
        }

        public Builder setItems(int i, LiveAnimeItem.Builder builder) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).setItems(i, builder.build());
            return this;
        }

        public Builder addBorderConfig(BorderConfig.Builder builder) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).addBorderConfig(builder.build());
            return this;
        }

        public Builder addItems(LiveAnimeItem.Builder builder) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).addItems(builder.build());
            return this;
        }

        public Builder addBorderConfig(int i, BorderConfig.Builder builder) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).addBorderConfig(i, builder.build());
            return this;
        }

        public Builder addItems(int i, LiveAnimeItem.Builder builder) {
            copyOnWrite();
            ((LiveAnimeConfig) this.instance).addItems(i, builder.build());
            return this;
        }
    }

    static {
        LiveAnimeConfig liveAnimeConfig = new LiveAnimeConfig();
        DEFAULT_INSTANCE = liveAnimeConfig;
        GeneratedMessageLite.registerDefaultInstance(LiveAnimeConfig.class, liveAnimeConfig);
    }

    private LiveAnimeConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBorderConfig(Iterable<? extends BorderConfig> iterable) {
        ensureBorderConfigIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.borderConfig_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends LiveAnimeItem> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBorderConfig(BorderConfig borderConfig) {
        borderConfig.getClass();
        ensureBorderConfigIsMutable();
        this.borderConfig_.add(borderConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(LiveAnimeItem liveAnimeItem) {
        liveAnimeItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(liveAnimeItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorderConfig() {
        this.borderConfig_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfig() {
        this.config_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLive() {
        this.isLive_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureBorderConfigIsMutable() {
        Internal.ProtobufList<BorderConfig> protobufList = this.borderConfig_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.borderConfig_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<LiveAnimeItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static LiveAnimeConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfig(LiveTextConfig liveTextConfig) {
        liveTextConfig.getClass();
        LiveTextConfig liveTextConfig2 = this.config_;
        if (liveTextConfig2 != null && liveTextConfig2 != LiveTextConfig.getDefaultInstance()) {
            this.config_ = LiveTextConfig.newBuilder(this.config_).mergeFrom((LiveTextConfig) liveTextConfig).buildPartial();
        } else {
            this.config_ = liveTextConfig;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LiveAnimeConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LiveAnimeConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LiveAnimeConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LiveAnimeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LiveAnimeConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBorderConfig(int i) {
        ensureBorderConfigIsMutable();
        this.borderConfig_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i) {
        ensureItemsIsMutable();
        this.items_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderConfig(int i, BorderConfig borderConfig) {
        borderConfig.getClass();
        ensureBorderConfigIsMutable();
        this.borderConfig_.set(i, borderConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfig(LiveTextConfig liveTextConfig) {
        liveTextConfig.getClass();
        this.config_ = liveTextConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLive(boolean z) {
        this.isLive_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i, LiveAnimeItem liveAnimeItem) {
        liveAnimeItem.getClass();
        ensureItemsIsMutable();
        this.items_.set(i, liveAnimeItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75451.f17387xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LiveAnimeConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0007\u0002\t\u0003\u001b\u0004\u001b", new Object[]{"isLive_", "config_", "items_", LiveAnimeItem.class, "borderConfig_", BorderConfig.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LiveAnimeConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (LiveAnimeConfig.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
    public BorderConfig getBorderConfig(int i) {
        return this.borderConfig_.get(i);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
    public int getBorderConfigCount() {
        return this.borderConfig_.size();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
    public List<BorderConfig> getBorderConfigList() {
        return this.borderConfig_;
    }

    public BorderConfigOrBuilder getBorderConfigOrBuilder(int i) {
        return this.borderConfig_.get(i);
    }

    public List<? extends BorderConfigOrBuilder> getBorderConfigOrBuilderList() {
        return this.borderConfig_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
    public LiveTextConfig getConfig() {
        LiveTextConfig liveTextConfig = this.config_;
        return liveTextConfig == null ? LiveTextConfig.getDefaultInstance() : liveTextConfig;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
    public boolean getIsLive() {
        return this.isLive_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
    public LiveAnimeItem getItems(int i) {
        return this.items_.get(i);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
    public int getItemsCount() {
        return this.items_.size();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
    public List<LiveAnimeItem> getItemsList() {
        return this.items_;
    }

    public LiveAnimeItemOrBuilder getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public List<? extends LiveAnimeItemOrBuilder> getItemsOrBuilderList() {
        return this.items_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfigOrBuilder
    public boolean hasConfig() {
        return this.config_ != null;
    }

    public static Builder newBuilder(LiveAnimeConfig liveAnimeConfig) {
        return DEFAULT_INSTANCE.createBuilder(liveAnimeConfig);
    }

    public static LiveAnimeConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveAnimeConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LiveAnimeConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveAnimeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LiveAnimeConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LiveAnimeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBorderConfig(int i, BorderConfig borderConfig) {
        borderConfig.getClass();
        ensureBorderConfigIsMutable();
        this.borderConfig_.add(i, borderConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i, LiveAnimeItem liveAnimeItem) {
        liveAnimeItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(i, liveAnimeItem);
    }

    public static LiveAnimeConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveAnimeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LiveAnimeConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LiveAnimeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LiveAnimeConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveAnimeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LiveAnimeConfig parseFrom(InputStream inputStream) throws IOException {
        return (LiveAnimeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LiveAnimeConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveAnimeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LiveAnimeConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LiveAnimeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LiveAnimeConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveAnimeConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
