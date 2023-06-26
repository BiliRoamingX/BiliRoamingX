package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.AbstractMessageLite;
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
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes14.dex */
public final class DanmuPlayerViewConfig extends GeneratedMessageLite<DanmuPlayerViewConfig, DanmuPlayerViewConfig.Builder> implements MessageLiteOrBuilder {
    public static final int DANMUKU_DEFAULT_PLAYER_CONFIG_FIELD_NUMBER = 1;
    public static final int DANMUKU_PLAYER_CONFIG_FIELD_NUMBER = 2;
    public static final int DANMUKU_PLAYER_CONFIG_PANEL_FIELD_NUMBER = 4;
    public static final int DANMUKU_PLAYER_DYNAMIC_CONFIG_FIELD_NUMBER = 3;
    private static final DanmuPlayerViewConfig DEFAULT_INSTANCE;
    private static volatile Parser<DanmuPlayerViewConfig> PARSER;
    private DanmuDefaultPlayerConfig danmukuDefaultPlayerConfig_;
    private DanmuPlayerConfigPanel danmukuPlayerConfigPanel_;
    private DanmuPlayerConfig danmukuPlayerConfig_;
    private Internal.ProtobufList<DanmuPlayerDynamicConfig> danmukuPlayerDynamicConfig_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DanmuPlayerViewConfig$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72081 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17051xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17051xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17051xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17051xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17051xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17051xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17051xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17051xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DanmuPlayerViewConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72081 c72081) {
            this();
        }

        public Builder addAllDanmukuPlayerDynamicConfig(Iterable<? extends DanmuPlayerDynamicConfig> iterable) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).addAllDanmukuPlayerDynamicConfig(iterable);
            return this;
        }

        public Builder addDanmukuPlayerDynamicConfig(DanmuPlayerDynamicConfig danmuPlayerDynamicConfig) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).addDanmukuPlayerDynamicConfig(danmuPlayerDynamicConfig);
            return this;
        }

        public Builder clearDanmukuDefaultPlayerConfig() {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).clearDanmukuDefaultPlayerConfig();
            return this;
        }

        public Builder clearDanmukuPlayerConfig() {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).clearDanmukuPlayerConfig();
            return this;
        }

        public Builder clearDanmukuPlayerConfigPanel() {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).clearDanmukuPlayerConfigPanel();
            return this;
        }

        public Builder clearDanmukuPlayerDynamicConfig() {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).clearDanmukuPlayerDynamicConfig();
            return this;
        }

        public DanmuDefaultPlayerConfig getDanmukuDefaultPlayerConfig() {
            return ((DanmuPlayerViewConfig) this.instance).getDanmukuDefaultPlayerConfig();
        }

        public DanmuPlayerConfig getDanmukuPlayerConfig() {
            return ((DanmuPlayerViewConfig) this.instance).getDanmukuPlayerConfig();
        }

        public DanmuPlayerConfigPanel getDanmukuPlayerConfigPanel() {
            return ((DanmuPlayerViewConfig) this.instance).getDanmukuPlayerConfigPanel();
        }

        public DanmuPlayerDynamicConfig getDanmukuPlayerDynamicConfig(int i) {
            return ((DanmuPlayerViewConfig) this.instance).getDanmukuPlayerDynamicConfig(i);
        }

        public int getDanmukuPlayerDynamicConfigCount() {
            return ((DanmuPlayerViewConfig) this.instance).getDanmukuPlayerDynamicConfigCount();
        }

        public List<DanmuPlayerDynamicConfig> getDanmukuPlayerDynamicConfigList() {
            return Collections.unmodifiableList(((DanmuPlayerViewConfig) this.instance).getDanmukuPlayerDynamicConfigList());
        }

        public boolean hasDanmukuDefaultPlayerConfig() {
            return ((DanmuPlayerViewConfig) this.instance).hasDanmukuDefaultPlayerConfig();
        }

        public boolean hasDanmukuPlayerConfig() {
            return ((DanmuPlayerViewConfig) this.instance).hasDanmukuPlayerConfig();
        }

        public boolean hasDanmukuPlayerConfigPanel() {
            return ((DanmuPlayerViewConfig) this.instance).hasDanmukuPlayerConfigPanel();
        }

        public Builder mergeDanmukuDefaultPlayerConfig(DanmuDefaultPlayerConfig danmuDefaultPlayerConfig) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).mergeDanmukuDefaultPlayerConfig(danmuDefaultPlayerConfig);
            return this;
        }

        public Builder mergeDanmukuPlayerConfig(DanmuPlayerConfig danmuPlayerConfig) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).mergeDanmukuPlayerConfig(danmuPlayerConfig);
            return this;
        }

        public Builder mergeDanmukuPlayerConfigPanel(DanmuPlayerConfigPanel danmuPlayerConfigPanel) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).mergeDanmukuPlayerConfigPanel(danmuPlayerConfigPanel);
            return this;
        }

        public Builder removeDanmukuPlayerDynamicConfig(int i) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).removeDanmukuPlayerDynamicConfig(i);
            return this;
        }

        public Builder setDanmukuDefaultPlayerConfig(DanmuDefaultPlayerConfig danmuDefaultPlayerConfig) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).setDanmukuDefaultPlayerConfig(danmuDefaultPlayerConfig);
            return this;
        }

        public Builder setDanmukuPlayerConfig(DanmuPlayerConfig danmuPlayerConfig) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).setDanmukuPlayerConfig(danmuPlayerConfig);
            return this;
        }

        public Builder setDanmukuPlayerConfigPanel(DanmuPlayerConfigPanel danmuPlayerConfigPanel) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).setDanmukuPlayerConfigPanel(danmuPlayerConfigPanel);
            return this;
        }

        public Builder setDanmukuPlayerDynamicConfig(int i, DanmuPlayerDynamicConfig danmuPlayerDynamicConfig) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).setDanmukuPlayerDynamicConfig(i, danmuPlayerDynamicConfig);
            return this;
        }

        private Builder() {
            super(DanmuPlayerViewConfig.DEFAULT_INSTANCE);
        }

        public Builder addDanmukuPlayerDynamicConfig(int i, DanmuPlayerDynamicConfig danmuPlayerDynamicConfig) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).addDanmukuPlayerDynamicConfig(i, danmuPlayerDynamicConfig);
            return this;
        }

        public Builder setDanmukuDefaultPlayerConfig(DanmuDefaultPlayerConfig.Builder builder) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).setDanmukuDefaultPlayerConfig(builder.build());
            return this;
        }

        public Builder setDanmukuPlayerConfig(DanmuPlayerConfig.Builder builder) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).setDanmukuPlayerConfig(builder.build());
            return this;
        }

        public Builder setDanmukuPlayerConfigPanel(DanmuPlayerConfigPanel.Builder builder) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).setDanmukuPlayerConfigPanel(builder.build());
            return this;
        }

        public Builder setDanmukuPlayerDynamicConfig(int i, DanmuPlayerDynamicConfig.Builder builder) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).setDanmukuPlayerDynamicConfig(i, builder.build());
            return this;
        }

        public Builder addDanmukuPlayerDynamicConfig(DanmuPlayerDynamicConfig.Builder builder) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).addDanmukuPlayerDynamicConfig(builder.build());
            return this;
        }

        public Builder addDanmukuPlayerDynamicConfig(int i, DanmuPlayerDynamicConfig.Builder builder) {
            copyOnWrite();
            ((DanmuPlayerViewConfig) this.instance).addDanmukuPlayerDynamicConfig(i, builder.build());
            return this;
        }
    }

    static {
        DanmuPlayerViewConfig danmuPlayerViewConfig = new DanmuPlayerViewConfig();
        DEFAULT_INSTANCE = danmuPlayerViewConfig;
        GeneratedMessageLite.registerDefaultInstance(DanmuPlayerViewConfig.class, danmuPlayerViewConfig);
    }

    private DanmuPlayerViewConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDanmukuPlayerDynamicConfig(Iterable<? extends DanmuPlayerDynamicConfig> iterable) {
        ensureDanmukuPlayerDynamicConfigIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.danmukuPlayerDynamicConfig_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDanmukuPlayerDynamicConfig(DanmuPlayerDynamicConfig danmuPlayerDynamicConfig) {
        danmuPlayerDynamicConfig.getClass();
        ensureDanmukuPlayerDynamicConfigIsMutable();
        this.danmukuPlayerDynamicConfig_.add(danmuPlayerDynamicConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDanmukuDefaultPlayerConfig() {
        this.danmukuDefaultPlayerConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDanmukuPlayerConfig() {
        this.danmukuPlayerConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDanmukuPlayerConfigPanel() {
        this.danmukuPlayerConfigPanel_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDanmukuPlayerDynamicConfig() {
        this.danmukuPlayerDynamicConfig_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureDanmukuPlayerDynamicConfigIsMutable() {
        Internal.ProtobufList<DanmuPlayerDynamicConfig> protobufList = this.danmukuPlayerDynamicConfig_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.danmukuPlayerDynamicConfig_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DanmuPlayerViewConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDanmukuDefaultPlayerConfig(DanmuDefaultPlayerConfig danmuDefaultPlayerConfig) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDanmukuPlayerConfig(DanmuPlayerConfig danmuPlayerConfig) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDanmukuPlayerConfigPanel(DanmuPlayerConfigPanel danmuPlayerConfigPanel) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DanmuPlayerViewConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DanmuPlayerViewConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmuPlayerViewConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DanmuPlayerViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DanmuPlayerViewConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDanmukuPlayerDynamicConfig(int i) {
        ensureDanmukuPlayerDynamicConfigIsMutable();
        this.danmukuPlayerDynamicConfig_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDanmukuDefaultPlayerConfig(DanmuDefaultPlayerConfig danmuDefaultPlayerConfig) {
        danmuDefaultPlayerConfig.getClass();
        this.danmukuDefaultPlayerConfig_ = danmuDefaultPlayerConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDanmukuPlayerConfig(DanmuPlayerConfig danmuPlayerConfig) {
        danmuPlayerConfig.getClass();
        this.danmukuPlayerConfig_ = danmuPlayerConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDanmukuPlayerConfigPanel(DanmuPlayerConfigPanel danmuPlayerConfigPanel) {
        danmuPlayerConfigPanel.getClass();
        this.danmukuPlayerConfigPanel_ = danmuPlayerConfigPanel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDanmukuPlayerDynamicConfig(int i, DanmuPlayerDynamicConfig danmuPlayerDynamicConfig) {
        danmuPlayerDynamicConfig.getClass();
        ensureDanmukuPlayerDynamicConfigIsMutable();
        this.danmukuPlayerDynamicConfig_.set(i, danmuPlayerDynamicConfig);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72081.f17051xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DanmuPlayerViewConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u001b\u0004\t", new Object[]{"danmukuDefaultPlayerConfig_", "danmukuPlayerConfig_", "danmukuPlayerDynamicConfig_", DanmuPlayerDynamicConfig.class, "danmukuPlayerConfigPanel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DanmuPlayerViewConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (DanmuPlayerViewConfig.class) {
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

    public DanmuDefaultPlayerConfig getDanmukuDefaultPlayerConfig() {
        DanmuDefaultPlayerConfig danmuDefaultPlayerConfig = this.danmukuDefaultPlayerConfig_;
        return danmuDefaultPlayerConfig == null ? DanmuDefaultPlayerConfig.getDefaultInstance() : danmuDefaultPlayerConfig;
    }

    public DanmuPlayerConfig getDanmukuPlayerConfig() {
        DanmuPlayerConfig danmuPlayerConfig = this.danmukuPlayerConfig_;
        return danmuPlayerConfig == null ? DanmuPlayerConfig.getDefaultInstance() : danmuPlayerConfig;
    }

    public DanmuPlayerConfigPanel getDanmukuPlayerConfigPanel() {
        DanmuPlayerConfigPanel danmuPlayerConfigPanel = this.danmukuPlayerConfigPanel_;
        return danmuPlayerConfigPanel == null ? DanmuPlayerConfigPanel.getDefaultInstance() : danmuPlayerConfigPanel;
    }

    public DanmuPlayerDynamicConfig getDanmukuPlayerDynamicConfig(int i) {
        return this.danmukuPlayerDynamicConfig_.get(i);
    }

    public int getDanmukuPlayerDynamicConfigCount() {
        return this.danmukuPlayerDynamicConfig_.size();
    }

    public List<DanmuPlayerDynamicConfig> getDanmukuPlayerDynamicConfigList() {
        return this.danmukuPlayerDynamicConfig_;
    }

    public DanmuPlayerDynamicConfigOrBuilder getDanmukuPlayerDynamicConfigOrBuilder(int i) {
        return this.danmukuPlayerDynamicConfig_.get(i);
    }

    public List<? extends DanmuPlayerDynamicConfigOrBuilder> getDanmukuPlayerDynamicConfigOrBuilderList() {
        return this.danmukuPlayerDynamicConfig_;
    }

    public boolean hasDanmukuDefaultPlayerConfig() {
        return this.danmukuDefaultPlayerConfig_ != null;
    }

    public boolean hasDanmukuPlayerConfig() {
        return this.danmukuPlayerConfig_ != null;
    }

    public boolean hasDanmukuPlayerConfigPanel() {
        return this.danmukuPlayerConfigPanel_ != null;
    }

    public static Builder newBuilder(DanmuPlayerViewConfig danmuPlayerViewConfig) {
        return DEFAULT_INSTANCE.createBuilder(danmuPlayerViewConfig);
    }

    public static DanmuPlayerViewConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuPlayerViewConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmuPlayerViewConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuPlayerViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DanmuPlayerViewConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DanmuPlayerViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDanmukuPlayerDynamicConfig(int i, DanmuPlayerDynamicConfig danmuPlayerDynamicConfig) {
        danmuPlayerDynamicConfig.getClass();
        ensureDanmukuPlayerDynamicConfigIsMutable();
        this.danmukuPlayerDynamicConfig_.add(i, danmuPlayerDynamicConfig);
    }

    public static DanmuPlayerViewConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuPlayerViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DanmuPlayerViewConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DanmuPlayerViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DanmuPlayerViewConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuPlayerViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DanmuPlayerViewConfig parseFrom(InputStream inputStream) throws IOException {
        return (DanmuPlayerViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmuPlayerViewConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuPlayerViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmuPlayerViewConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DanmuPlayerViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DanmuPlayerViewConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuPlayerViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
