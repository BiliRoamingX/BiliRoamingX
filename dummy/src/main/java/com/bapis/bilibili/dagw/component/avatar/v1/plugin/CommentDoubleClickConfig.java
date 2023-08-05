package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

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
/* loaded from: classes17.dex */
public final class CommentDoubleClickConfig extends GeneratedMessageLite<CommentDoubleClickConfig, CommentDoubleClickConfig.Builder> implements MessageLiteOrBuilder {
    public static final int ANIMATION_SCALE_FIELD_NUMBER = 2;
    private static final CommentDoubleClickConfig DEFAULT_INSTANCE;
    public static final int INTERACTION_FIELD_NUMBER = 1;
    private static volatile Parser<CommentDoubleClickConfig> PARSER;
    private double animationScale_;
    private Interaction interaction_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.plugin.CommentDoubleClickConfig$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75401 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17382xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17382xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17382xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17382xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17382xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17382xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17382xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17382xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CommentDoubleClickConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75401 c75401) {
            this();
        }

        public Builder clearAnimationScale() {
            copyOnWrite();
            ((CommentDoubleClickConfig) this.instance).clearAnimationScale();
            return this;
        }

        public Builder clearInteraction() {
            copyOnWrite();
            ((CommentDoubleClickConfig) this.instance).clearInteraction();
            return this;
        }

        public double getAnimationScale() {
            return ((CommentDoubleClickConfig) this.instance).getAnimationScale();
        }

        public Interaction getInteraction() {
            return ((CommentDoubleClickConfig) this.instance).getInteraction();
        }

        public boolean hasInteraction() {
            return ((CommentDoubleClickConfig) this.instance).hasInteraction();
        }

        public Builder mergeInteraction(Interaction interaction) {
            copyOnWrite();
            ((CommentDoubleClickConfig) this.instance).mergeInteraction(interaction);
            return this;
        }

        public Builder setAnimationScale(double d) {
            copyOnWrite();
            ((CommentDoubleClickConfig) this.instance).setAnimationScale(d);
            return this;
        }

        public Builder setInteraction(Interaction interaction) {
            copyOnWrite();
            ((CommentDoubleClickConfig) this.instance).setInteraction(interaction);
            return this;
        }

        private Builder() {
            super(CommentDoubleClickConfig.DEFAULT_INSTANCE);
        }

        public Builder setInteraction(Interaction.Builder builder) {
            copyOnWrite();
            ((CommentDoubleClickConfig) this.instance).setInteraction(builder.build());
            return this;
        }
    }

    static {
        CommentDoubleClickConfig commentDoubleClickConfig = new CommentDoubleClickConfig();
        DEFAULT_INSTANCE = commentDoubleClickConfig;
        GeneratedMessageLite.registerDefaultInstance(CommentDoubleClickConfig.class, commentDoubleClickConfig);
    }

    private CommentDoubleClickConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnimationScale() {
        this.animationScale_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInteraction() {
        this.interaction_ = null;
    }

    public static CommentDoubleClickConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInteraction(Interaction interaction) {
        interaction.getClass();
        Interaction interaction2 = this.interaction_;
        if (interaction2 != null && interaction2 != Interaction.getDefaultInstance()) {
            this.interaction_ = Interaction.newBuilder(this.interaction_).mergeFrom((Interaction) interaction).buildPartial();
        } else {
            this.interaction_ = interaction;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CommentDoubleClickConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommentDoubleClickConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommentDoubleClickConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommentDoubleClickConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CommentDoubleClickConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationScale(double d) {
        this.animationScale_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInteraction(Interaction interaction) {
        interaction.getClass();
        this.interaction_ = interaction;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75401.f17382xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CommentDoubleClickConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0000", new Object[]{"interaction_", "animationScale_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CommentDoubleClickConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (CommentDoubleClickConfig.class) {
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

    public double getAnimationScale() {
        return this.animationScale_;
    }

    public Interaction getInteraction() {
        Interaction interaction = this.interaction_;
        return interaction == null ? Interaction.getDefaultInstance() : interaction;
    }

    public boolean hasInteraction() {
        return this.interaction_ != null;
    }

    public static Builder newBuilder(CommentDoubleClickConfig commentDoubleClickConfig) {
        return DEFAULT_INSTANCE.createBuilder(commentDoubleClickConfig);
    }

    public static CommentDoubleClickConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommentDoubleClickConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommentDoubleClickConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommentDoubleClickConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CommentDoubleClickConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CommentDoubleClickConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CommentDoubleClickConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommentDoubleClickConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CommentDoubleClickConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommentDoubleClickConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommentDoubleClickConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommentDoubleClickConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CommentDoubleClickConfig parseFrom(InputStream inputStream) throws IOException {
        return (CommentDoubleClickConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommentDoubleClickConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommentDoubleClickConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommentDoubleClickConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommentDoubleClickConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommentDoubleClickConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommentDoubleClickConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
