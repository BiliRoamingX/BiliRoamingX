package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes14.dex */
public final class PlayAbilityExtConf extends GeneratedMessageLite<PlayAbilityExtConf, PlayAbilityExtConf.Builder> implements MessageLiteOrBuilder {
    public static final int ALLOW_CLOSE_SUBTITLE_FIELD_NUMBER = 1;
    public static final int CAST_TIPS_FIELD_NUMBER = 3;
    private static final PlayAbilityExtConf DEFAULT_INSTANCE;
    public static final int FREYA_CONFIG_FIELD_NUMBER = 2;
    private static volatile Parser<PlayAbilityExtConf> PARSER;
    private boolean allowCloseSubtitle_;
    private CastTips castTips_;
    private FreyaConfig freyaConfig_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.PlayAbilityExtConf$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78601 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17579xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17579xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17579xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17579xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17579xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17579xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17579xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17579xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayAbilityExtConf, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78601 c78601) {
            this();
        }

        public Builder clearAllowCloseSubtitle() {
            copyOnWrite();
            ((PlayAbilityExtConf) this.instance).clearAllowCloseSubtitle();
            return this;
        }

        public Builder clearCastTips() {
            copyOnWrite();
            ((PlayAbilityExtConf) this.instance).clearCastTips();
            return this;
        }

        public Builder clearFreyaConfig() {
            copyOnWrite();
            ((PlayAbilityExtConf) this.instance).clearFreyaConfig();
            return this;
        }

        public boolean getAllowCloseSubtitle() {
            return ((PlayAbilityExtConf) this.instance).getAllowCloseSubtitle();
        }

        public CastTips getCastTips() {
            return ((PlayAbilityExtConf) this.instance).getCastTips();
        }

        public FreyaConfig getFreyaConfig() {
            return ((PlayAbilityExtConf) this.instance).getFreyaConfig();
        }

        public boolean hasCastTips() {
            return ((PlayAbilityExtConf) this.instance).hasCastTips();
        }

        public boolean hasFreyaConfig() {
            return ((PlayAbilityExtConf) this.instance).hasFreyaConfig();
        }

        public Builder mergeCastTips(CastTips castTips) {
            copyOnWrite();
            ((PlayAbilityExtConf) this.instance).mergeCastTips(castTips);
            return this;
        }

        public Builder mergeFreyaConfig(FreyaConfig freyaConfig) {
            copyOnWrite();
            ((PlayAbilityExtConf) this.instance).mergeFreyaConfig(freyaConfig);
            return this;
        }

        public Builder setAllowCloseSubtitle(boolean z) {
            copyOnWrite();
            ((PlayAbilityExtConf) this.instance).setAllowCloseSubtitle(z);
            return this;
        }

        public Builder setCastTips(CastTips castTips) {
            copyOnWrite();
            ((PlayAbilityExtConf) this.instance).setCastTips(castTips);
            return this;
        }

        public Builder setFreyaConfig(FreyaConfig freyaConfig) {
            copyOnWrite();
            ((PlayAbilityExtConf) this.instance).setFreyaConfig(freyaConfig);
            return this;
        }

        private Builder() {
            super(PlayAbilityExtConf.DEFAULT_INSTANCE);
        }

        public Builder setCastTips(CastTips.Builder builder) {
            copyOnWrite();
            ((PlayAbilityExtConf) this.instance).setCastTips(builder.build());
            return this;
        }

        public Builder setFreyaConfig(FreyaConfig.Builder builder) {
            copyOnWrite();
            ((PlayAbilityExtConf) this.instance).setFreyaConfig(builder.build());
            return this;
        }
    }

    static {
        PlayAbilityExtConf playAbilityExtConf = new PlayAbilityExtConf();
        DEFAULT_INSTANCE = playAbilityExtConf;
        GeneratedMessageLite.registerDefaultInstance(PlayAbilityExtConf.class, playAbilityExtConf);
    }

    private PlayAbilityExtConf() {
    }

    public void clearAllowCloseSubtitle() {
        this.allowCloseSubtitle_ = false;
    }

    public void clearCastTips() {
        this.castTips_ = null;
    }

    public void clearFreyaConfig() {
        this.freyaConfig_ = null;
    }

    public static PlayAbilityExtConf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeCastTips(CastTips castTips) {
    }

    public void mergeFreyaConfig(FreyaConfig freyaConfig) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayAbilityExtConf parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayAbilityExtConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayAbilityExtConf parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayAbilityExtConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayAbilityExtConf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAllowCloseSubtitle(boolean z) {
        this.allowCloseSubtitle_ = z;
    }

    public void setCastTips(CastTips castTips) {
        castTips.getClass();
        this.castTips_ = castTips;
    }

    public void setFreyaConfig(FreyaConfig freyaConfig) {
        freyaConfig.getClass();
        this.freyaConfig_ = freyaConfig;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78601.f17579xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayAbilityExtConf();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\t\u0003\t", new Object[]{"allowCloseSubtitle_", "freyaConfig_", "castTips_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayAbilityExtConf> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayAbilityExtConf.class) {
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

    public boolean getAllowCloseSubtitle() {
        return this.allowCloseSubtitle_;
    }

    public CastTips getCastTips() {
        CastTips castTips = this.castTips_;
        return castTips == null ? CastTips.getDefaultInstance() : castTips;
    }

    public FreyaConfig getFreyaConfig() {
        FreyaConfig freyaConfig = this.freyaConfig_;
        return freyaConfig == null ? FreyaConfig.getDefaultInstance() : freyaConfig;
    }

    public boolean hasCastTips() {
        return this.castTips_ != null;
    }

    public boolean hasFreyaConfig() {
        return this.freyaConfig_ != null;
    }

    public static Builder newBuilder(PlayAbilityExtConf playAbilityExtConf) {
        return DEFAULT_INSTANCE.createBuilder(playAbilityExtConf);
    }

    public static PlayAbilityExtConf parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayAbilityExtConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayAbilityExtConf parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayAbilityExtConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayAbilityExtConf parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayAbilityExtConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayAbilityExtConf parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayAbilityExtConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayAbilityExtConf parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayAbilityExtConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayAbilityExtConf parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayAbilityExtConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayAbilityExtConf parseFrom(InputStream inputStream) throws IOException {
        return (PlayAbilityExtConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayAbilityExtConf parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayAbilityExtConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayAbilityExtConf parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayAbilityExtConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayAbilityExtConf parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayAbilityExtConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
