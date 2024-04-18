package com.bapis.bilibili.dagw.component.avatar.v1;

import com.bapis.bilibili.dagw.component.avatar.v1.plugin.CommentDoubleClickConfig;
import com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroConfig;
import com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeConfig;
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
public final class LayerTagConfig extends GeneratedMessageLite<LayerTagConfig, LayerTagConfig.Builder> implements MessageLiteOrBuilder {
    public static final int COMMENT_DOUBLE_CLICK_CONFIG_FIELD_NUMBER = 4;
    public static final int CONFIG_TYPE_FIELD_NUMBER = 1;
    private static final LayerTagConfig DEFAULT_INSTANCE;
    public static final int GENERAL_CONFIG_FIELD_NUMBER = 2;
    public static final int GYRO_CONFIG_FIELD_NUMBER = 3;
    public static final int LIVE_ANIME_CONFIG_FIELD_NUMBER = 5;
    private static volatile Parser<LayerTagConfig> PARSER;
    private int configCase_ = 0;
    private int configType_;
    private Object config_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.LayerTagConfig$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75341 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17377xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17377xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17377xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17377xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17377xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17377xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17377xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17377xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LayerTagConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75341 c75341) {
            this();
        }

        public Builder clearCommentDoubleClickConfig() {
            copyOnWrite();
            ((LayerTagConfig) this.instance).clearCommentDoubleClickConfig();
            return this;
        }

        public Builder clearConfig() {
            copyOnWrite();
            ((LayerTagConfig) this.instance).clearConfig();
            return this;
        }

        public Builder clearConfigType() {
            copyOnWrite();
            ((LayerTagConfig) this.instance).clearConfigType();
            return this;
        }

        public Builder clearGeneralConfig() {
            copyOnWrite();
            ((LayerTagConfig) this.instance).clearGeneralConfig();
            return this;
        }

        public Builder clearGyroConfig() {
            copyOnWrite();
            ((LayerTagConfig) this.instance).clearGyroConfig();
            return this;
        }

        public Builder clearLiveAnimeConfig() {
            copyOnWrite();
            ((LayerTagConfig) this.instance).clearLiveAnimeConfig();
            return this;
        }

        public CommentDoubleClickConfig getCommentDoubleClickConfig() {
            return ((LayerTagConfig) this.instance).getCommentDoubleClickConfig();
        }

        public ConfigCase getConfigCase() {
            return ((LayerTagConfig) this.instance).getConfigCase();
        }

        public TagConfigType getConfigType() {
            return ((LayerTagConfig) this.instance).getConfigType();
        }

        public int getConfigTypeValue() {
            return ((LayerTagConfig) this.instance).getConfigTypeValue();
        }

        public GeneralConfig getGeneralConfig() {
            return ((LayerTagConfig) this.instance).getGeneralConfig();
        }

        public GyroConfig getGyroConfig() {
            return ((LayerTagConfig) this.instance).getGyroConfig();
        }

        public LiveAnimeConfig getLiveAnimeConfig() {
            return ((LayerTagConfig) this.instance).getLiveAnimeConfig();
        }

        public boolean hasCommentDoubleClickConfig() {
            return ((LayerTagConfig) this.instance).hasCommentDoubleClickConfig();
        }

        public boolean hasGeneralConfig() {
            return ((LayerTagConfig) this.instance).hasGeneralConfig();
        }

        public boolean hasGyroConfig() {
            return ((LayerTagConfig) this.instance).hasGyroConfig();
        }

        public boolean hasLiveAnimeConfig() {
            return ((LayerTagConfig) this.instance).hasLiveAnimeConfig();
        }

        public Builder mergeCommentDoubleClickConfig(CommentDoubleClickConfig commentDoubleClickConfig) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).mergeCommentDoubleClickConfig(commentDoubleClickConfig);
            return this;
        }

        public Builder mergeGeneralConfig(GeneralConfig generalConfig) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).mergeGeneralConfig(generalConfig);
            return this;
        }

        public Builder mergeGyroConfig(GyroConfig gyroConfig) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).mergeGyroConfig(gyroConfig);
            return this;
        }

        public Builder mergeLiveAnimeConfig(LiveAnimeConfig liveAnimeConfig) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).mergeLiveAnimeConfig(liveAnimeConfig);
            return this;
        }

        public Builder setCommentDoubleClickConfig(CommentDoubleClickConfig commentDoubleClickConfig) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).setCommentDoubleClickConfig(commentDoubleClickConfig);
            return this;
        }

        public Builder setConfigType(TagConfigType tagConfigType) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).setConfigType(tagConfigType);
            return this;
        }

        public Builder setConfigTypeValue(int i) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).setConfigTypeValue(i);
            return this;
        }

        public Builder setGeneralConfig(GeneralConfig generalConfig) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).setGeneralConfig(generalConfig);
            return this;
        }

        public Builder setGyroConfig(GyroConfig gyroConfig) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).setGyroConfig(gyroConfig);
            return this;
        }

        public Builder setLiveAnimeConfig(LiveAnimeConfig liveAnimeConfig) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).setLiveAnimeConfig(liveAnimeConfig);
            return this;
        }

        private Builder() {
            super(LayerTagConfig.DEFAULT_INSTANCE);
        }

        public Builder setCommentDoubleClickConfig(CommentDoubleClickConfig.Builder builder) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).setCommentDoubleClickConfig(builder.build());
            return this;
        }

        public Builder setGeneralConfig(GeneralConfig.Builder builder) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).setGeneralConfig(builder.build());
            return this;
        }

        public Builder setGyroConfig(GyroConfig.Builder builder) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).setGyroConfig(builder.build());
            return this;
        }

        public Builder setLiveAnimeConfig(LiveAnimeConfig.Builder builder) {
            copyOnWrite();
            ((LayerTagConfig) this.instance).setLiveAnimeConfig(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum ConfigCase {
        GENERAL_CONFIG(2),
        GYRO_CONFIG(3),
        COMMENT_DOUBLE_CLICK_CONFIG(4),
        LIVE_ANIME_CONFIG(5),
        CONFIG_NOT_SET(0);
        
        private final int value;

        ConfigCase(int i) {
            this.value = i;
        }

        public static ConfigCase forNumber(int i) {
            if (i != 0) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return LIVE_ANIME_CONFIG;
                        }
                        return COMMENT_DOUBLE_CLICK_CONFIG;
                    }
                    return GYRO_CONFIG;
                }
                return GENERAL_CONFIG;
            }
            return CONFIG_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ConfigCase valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum TagConfigType implements Internal.EnumLite {
        TAG_CFG_INVALID(0),
        TAG_CFG_GENERAL(1),
        TAG_CFG_GYRO(2),
        TAG_CFG_COMMENT_DOUBLE_CLICK(3),
        TAG_CFG_IN_LIVE(4),
        UNRECOGNIZED(-1);
        
        public static final int TAG_CFG_COMMENT_DOUBLE_CLICK_VALUE = 3;
        public static final int TAG_CFG_GENERAL_VALUE = 1;
        public static final int TAG_CFG_GYRO_VALUE = 2;
        public static final int TAG_CFG_INVALID_VALUE = 0;
        public static final int TAG_CFG_IN_LIVE_VALUE = 4;
        private static final Internal.EnumLiteMap<TagConfigType> internalValueMap = new Internal.EnumLiteMap<TagConfigType>() { // from class: com.bapis.bilibili.dagw.component.avatar.v1.LayerTagConfig.TagConfigType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TagConfigType findValueByNumber(int i) {
                return TagConfigType.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes17.dex */
        private static final class TagConfigTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new TagConfigTypeVerifier();

            private TagConfigTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return TagConfigType.forNumber(i) != null;
            }
        }

        TagConfigType(int i) {
            this.value = i;
        }

        public static TagConfigType forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return TAG_CFG_IN_LIVE;
                        }
                        return TAG_CFG_COMMENT_DOUBLE_CLICK;
                    }
                    return TAG_CFG_GYRO;
                }
                return TAG_CFG_GENERAL;
            }
            return TAG_CFG_INVALID;
        }

        public static Internal.EnumLiteMap<TagConfigType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return TagConfigTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static TagConfigType valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        LayerTagConfig layerTagConfig = new LayerTagConfig();
        DEFAULT_INSTANCE = layerTagConfig;
        GeneratedMessageLite.registerDefaultInstance(LayerTagConfig.class, layerTagConfig);
    }

    private LayerTagConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommentDoubleClickConfig() {
        if (this.configCase_ == 4) {
            this.configCase_ = 0;
            this.config_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfig() {
        this.configCase_ = 0;
        this.config_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigType() {
        this.configType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeneralConfig() {
        if (this.configCase_ == 2) {
            this.configCase_ = 0;
            this.config_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGyroConfig() {
        if (this.configCase_ == 3) {
            this.configCase_ = 0;
            this.config_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLiveAnimeConfig() {
        if (this.configCase_ == 5) {
            this.configCase_ = 0;
            this.config_ = null;
        }
    }

    public static LayerTagConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCommentDoubleClickConfig(CommentDoubleClickConfig commentDoubleClickConfig) {
        commentDoubleClickConfig.getClass();
        if (this.configCase_ == 4 && this.config_ != CommentDoubleClickConfig.getDefaultInstance()) {
            this.config_ = CommentDoubleClickConfig.newBuilder((CommentDoubleClickConfig) this.config_).mergeFrom((CommentDoubleClickConfig) commentDoubleClickConfig).buildPartial();
        } else {
            this.config_ = commentDoubleClickConfig;
        }
        this.configCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeneralConfig(GeneralConfig generalConfig) {
        generalConfig.getClass();
        if (this.configCase_ == 2 && this.config_ != GeneralConfig.getDefaultInstance()) {
            this.config_ = GeneralConfig.newBuilder((GeneralConfig) this.config_).mergeFrom((GeneralConfig) generalConfig).buildPartial();
        } else {
            this.config_ = generalConfig;
        }
        this.configCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGyroConfig(GyroConfig gyroConfig) {
        gyroConfig.getClass();
        if (this.configCase_ == 3 && this.config_ != GyroConfig.getDefaultInstance()) {
            this.config_ = GyroConfig.newBuilder((GyroConfig) this.config_).mergeFrom((GyroConfig) gyroConfig).buildPartial();
        } else {
            this.config_ = gyroConfig;
        }
        this.configCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLiveAnimeConfig(LiveAnimeConfig liveAnimeConfig) {
        liveAnimeConfig.getClass();
        if (this.configCase_ == 5 && this.config_ != LiveAnimeConfig.getDefaultInstance()) {
            this.config_ = LiveAnimeConfig.newBuilder((LiveAnimeConfig) this.config_).mergeFrom((LiveAnimeConfig) liveAnimeConfig).buildPartial();
        } else {
            this.config_ = liveAnimeConfig;
        }
        this.configCase_ = 5;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LayerTagConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LayerTagConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LayerTagConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LayerTagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LayerTagConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommentDoubleClickConfig(CommentDoubleClickConfig commentDoubleClickConfig) {
        commentDoubleClickConfig.getClass();
        this.config_ = commentDoubleClickConfig;
        this.configCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigType(TagConfigType tagConfigType) {
        this.configType_ = tagConfigType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigTypeValue(int i) {
        this.configType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeneralConfig(GeneralConfig generalConfig) {
        generalConfig.getClass();
        this.config_ = generalConfig;
        this.configCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGyroConfig(GyroConfig gyroConfig) {
        gyroConfig.getClass();
        this.config_ = gyroConfig;
        this.configCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLiveAnimeConfig(LiveAnimeConfig liveAnimeConfig) {
        liveAnimeConfig.getClass();
        this.config_ = liveAnimeConfig;
        this.configCase_ = 5;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75341.f17377xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LayerTagConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"config_", "configCase_", "configType_", GeneralConfig.class, GyroConfig.class, CommentDoubleClickConfig.class, LiveAnimeConfig.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LayerTagConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (LayerTagConfig.class) {
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

    public CommentDoubleClickConfig getCommentDoubleClickConfig() {
        if (this.configCase_ == 4) {
            return (CommentDoubleClickConfig) this.config_;
        }
        return CommentDoubleClickConfig.getDefaultInstance();
    }

    public ConfigCase getConfigCase() {
        return ConfigCase.forNumber(this.configCase_);
    }

    public TagConfigType getConfigType() {
        TagConfigType forNumber = TagConfigType.forNumber(this.configType_);
        return forNumber == null ? TagConfigType.UNRECOGNIZED : forNumber;
    }

    public int getConfigTypeValue() {
        return this.configType_;
    }

    public GeneralConfig getGeneralConfig() {
        if (this.configCase_ == 2) {
            return (GeneralConfig) this.config_;
        }
        return GeneralConfig.getDefaultInstance();
    }

    public GyroConfig getGyroConfig() {
        if (this.configCase_ == 3) {
            return (GyroConfig) this.config_;
        }
        return GyroConfig.getDefaultInstance();
    }

    public LiveAnimeConfig getLiveAnimeConfig() {
        if (this.configCase_ == 5) {
            return (LiveAnimeConfig) this.config_;
        }
        return LiveAnimeConfig.getDefaultInstance();
    }

    public boolean hasCommentDoubleClickConfig() {
        return this.configCase_ == 4;
    }

    public boolean hasGeneralConfig() {
        return this.configCase_ == 2;
    }

    public boolean hasGyroConfig() {
        return this.configCase_ == 3;
    }

    public boolean hasLiveAnimeConfig() {
        return this.configCase_ == 5;
    }

    public static Builder newBuilder(LayerTagConfig layerTagConfig) {
        return DEFAULT_INSTANCE.createBuilder(layerTagConfig);
    }

    public static LayerTagConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LayerTagConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LayerTagConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LayerTagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LayerTagConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LayerTagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LayerTagConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LayerTagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LayerTagConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LayerTagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LayerTagConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LayerTagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LayerTagConfig parseFrom(InputStream inputStream) throws IOException {
        return (LayerTagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LayerTagConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LayerTagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LayerTagConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LayerTagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LayerTagConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LayerTagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
