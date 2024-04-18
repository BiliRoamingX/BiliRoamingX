package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class Relates extends GeneratedMessageLite<Relates, Relates.Builder> implements MessageLiteOrBuilder {
    public static final int CARDS_FIELD_NUMBER = 1;
    public static final int CONFIG_FIELD_NUMBER = 2;
    private static final Relates DEFAULT_INSTANCE;
    private static volatile Parser<Relates> PARSER;
    private Internal.ProtobufList<RelateCard> cards_ = GeneratedMessageLite.emptyProtobufList();
    private RelateConfig config_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Relates$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70501 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17030xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17030xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17030xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17030xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17030xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17030xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17030xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17030xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Relates, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70501 c70501) {
            this();
        }

        public Builder addAllCards(Iterable<? extends RelateCard> iterable) {
            copyOnWrite();
            ((Relates) this.instance).addAllCards(iterable);
            return this;
        }

        public Builder addCards(RelateCard relateCard) {
            copyOnWrite();
            ((Relates) this.instance).addCards(relateCard);
            return this;
        }

        public Builder clearCards() {
            copyOnWrite();
            ((Relates) this.instance).clearCards();
            return this;
        }

        public Builder clearConfig() {
            copyOnWrite();
            ((Relates) this.instance).clearConfig();
            return this;
        }

        public RelateCard getCards(int i) {
            return ((Relates) this.instance).getCards(i);
        }

        public int getCardsCount() {
            return ((Relates) this.instance).getCardsCount();
        }

        public List<RelateCard> getCardsList() {
            return Collections.unmodifiableList(((Relates) this.instance).getCardsList());
        }

        public RelateConfig getConfig() {
            return ((Relates) this.instance).getConfig();
        }

        public boolean hasConfig() {
            return ((Relates) this.instance).hasConfig();
        }

        public Builder mergeConfig(RelateConfig relateConfig) {
            copyOnWrite();
            ((Relates) this.instance).mergeConfig(relateConfig);
            return this;
        }

        public Builder removeCards(int i) {
            copyOnWrite();
            ((Relates) this.instance).removeCards(i);
            return this;
        }

        public Builder setCards(int i, RelateCard relateCard) {
            copyOnWrite();
            ((Relates) this.instance).setCards(i, relateCard);
            return this;
        }

        public Builder setConfig(RelateConfig relateConfig) {
            copyOnWrite();
            ((Relates) this.instance).setConfig(relateConfig);
            return this;
        }

        private Builder() {
            super(Relates.DEFAULT_INSTANCE);
        }

        public Builder addCards(int i, RelateCard relateCard) {
            copyOnWrite();
            ((Relates) this.instance).addCards(i, relateCard);
            return this;
        }

        public Builder setCards(int i, RelateCard.Builder builder) {
            copyOnWrite();
            ((Relates) this.instance).setCards(i, builder.build());
            return this;
        }

        public Builder setConfig(RelateConfig.Builder builder) {
            copyOnWrite();
            ((Relates) this.instance).setConfig(builder.build());
            return this;
        }

        public Builder addCards(RelateCard.Builder builder) {
            copyOnWrite();
            ((Relates) this.instance).addCards(builder.build());
            return this;
        }

        public Builder addCards(int i, RelateCard.Builder builder) {
            copyOnWrite();
            ((Relates) this.instance).addCards(i, builder.build());
            return this;
        }
    }

    static {
        Relates relates = new Relates();
        DEFAULT_INSTANCE = relates;
        GeneratedMessageLite.registerDefaultInstance(Relates.class, relates);
    }

    private Relates() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCards(Iterable<? extends RelateCard> iterable) {
        ensureCardsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.cards_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCards(RelateCard relateCard) {
        relateCard.getClass();
        ensureCardsIsMutable();
        this.cards_.add(relateCard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCards() {
        this.cards_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfig() {
        this.config_ = null;
    }

    private void ensureCardsIsMutable() {
        Internal.ProtobufList<RelateCard> protobufList = this.cards_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.cards_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Relates getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfig(RelateConfig relateConfig) {
        relateConfig.getClass();
        RelateConfig relateConfig2 = this.config_;
        if (relateConfig2 != null && relateConfig2 != RelateConfig.getDefaultInstance()) {
            this.config_ = RelateConfig.newBuilder(this.config_).mergeFrom((RelateConfig) relateConfig).buildPartial();
        } else {
            this.config_ = relateConfig;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Relates parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Relates) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Relates parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Relates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Relates> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCards(int i) {
        ensureCardsIsMutable();
        this.cards_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCards(int i, RelateCard relateCard) {
        relateCard.getClass();
        ensureCardsIsMutable();
        this.cards_.set(i, relateCard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfig(RelateConfig relateConfig) {
        relateConfig.getClass();
        this.config_ = relateConfig;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70501.f17030xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Relates();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"cards_", RelateCard.class, "config_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Relates> parser = PARSER;
                if (parser == null) {
                    synchronized (Relates.class) {
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

    public RelateCard getCards(int i) {
        return this.cards_.get(i);
    }

    public int getCardsCount() {
        return this.cards_.size();
    }

    public List<RelateCard> getCardsList() {
        return this.cards_;
    }

    public RelateCardOrBuilder getCardsOrBuilder(int i) {
        return this.cards_.get(i);
    }

    public List<? extends RelateCardOrBuilder> getCardsOrBuilderList() {
        return this.cards_;
    }

    public RelateConfig getConfig() {
        RelateConfig relateConfig = this.config_;
        return relateConfig == null ? RelateConfig.getDefaultInstance() : relateConfig;
    }

    public boolean hasConfig() {
        return this.config_ != null;
    }

    public static Builder newBuilder(Relates relates) {
        return DEFAULT_INSTANCE.createBuilder(relates);
    }

    public static Relates parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Relates) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Relates parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Relates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Relates parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Relates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCards(int i, RelateCard relateCard) {
        relateCard.getClass();
        ensureCardsIsMutable();
        this.cards_.add(i, relateCard);
    }

    public static Relates parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Relates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Relates parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Relates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Relates parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Relates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Relates parseFrom(InputStream inputStream) throws IOException {
        return (Relates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Relates parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Relates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Relates parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Relates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Relates parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Relates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * removeCards
     */
    static void access$600(Relates relates, int index) {
    }
}
