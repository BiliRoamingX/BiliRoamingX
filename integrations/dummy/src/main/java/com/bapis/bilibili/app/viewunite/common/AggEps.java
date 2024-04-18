package com.bapis.bilibili.app.viewunite.common;

import com.bapis.bilibili.app.viewunite.common.AggEpCard;
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
public final class AggEps extends GeneratedMessageLite<AggEps, AggEps.Builder> implements MessageLiteOrBuilder {
    public static final int AGG_EP_CARDS_FIELD_NUMBER = 1;
    private static final AggEps DEFAULT_INSTANCE;
    private static volatile Parser<AggEps> PARSER = null;
    public static final int PLACE_INDEX_FIELD_NUMBER = 2;
    private Internal.ProtobufList<AggEpCard> aggEpCards_ = GeneratedMessageLite.emptyProtobufList();
    private int placeIndex_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.AggEps$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69731 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16961xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16961xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16961xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16961xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16961xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16961xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16961xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16961xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AggEps, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69731 c69731) {
            this();
        }

        public Builder addAggEpCards(AggEpCard aggEpCard) {
            copyOnWrite();
            ((AggEps) this.instance).addAggEpCards(aggEpCard);
            return this;
        }

        public Builder addAllAggEpCards(Iterable<? extends AggEpCard> iterable) {
            copyOnWrite();
            ((AggEps) this.instance).addAllAggEpCards(iterable);
            return this;
        }

        public Builder clearAggEpCards() {
            copyOnWrite();
            ((AggEps) this.instance).clearAggEpCards();
            return this;
        }

        public Builder clearPlaceIndex() {
            copyOnWrite();
            ((AggEps) this.instance).clearPlaceIndex();
            return this;
        }

        public AggEpCard getAggEpCards(int i) {
            return ((AggEps) this.instance).getAggEpCards(i);
        }

        public int getAggEpCardsCount() {
            return ((AggEps) this.instance).getAggEpCardsCount();
        }

        public List<AggEpCard> getAggEpCardsList() {
            return Collections.unmodifiableList(((AggEps) this.instance).getAggEpCardsList());
        }

        public int getPlaceIndex() {
            return ((AggEps) this.instance).getPlaceIndex();
        }

        public Builder removeAggEpCards(int i) {
            copyOnWrite();
            ((AggEps) this.instance).removeAggEpCards(i);
            return this;
        }

        public Builder setAggEpCards(int i, AggEpCard aggEpCard) {
            copyOnWrite();
            ((AggEps) this.instance).setAggEpCards(i, aggEpCard);
            return this;
        }

        public Builder setPlaceIndex(int i) {
            copyOnWrite();
            ((AggEps) this.instance).setPlaceIndex(i);
            return this;
        }

        private Builder() {
            super(AggEps.DEFAULT_INSTANCE);
        }

        public Builder addAggEpCards(int i, AggEpCard aggEpCard) {
            copyOnWrite();
            ((AggEps) this.instance).addAggEpCards(i, aggEpCard);
            return this;
        }

        public Builder setAggEpCards(int i, AggEpCard.Builder builder) {
            copyOnWrite();
            ((AggEps) this.instance).setAggEpCards(i, builder.build());
            return this;
        }

        public Builder addAggEpCards(AggEpCard.Builder builder) {
            copyOnWrite();
            ((AggEps) this.instance).addAggEpCards(builder.build());
            return this;
        }

        public Builder addAggEpCards(int i, AggEpCard.Builder builder) {
            copyOnWrite();
            ((AggEps) this.instance).addAggEpCards(i, builder.build());
            return this;
        }
    }

    static {
        AggEps aggEps = new AggEps();
        DEFAULT_INSTANCE = aggEps;
        GeneratedMessageLite.registerDefaultInstance(AggEps.class, aggEps);
    }

    private AggEps() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAggEpCards(AggEpCard aggEpCard) {
        aggEpCard.getClass();
        ensureAggEpCardsIsMutable();
        this.aggEpCards_.add(aggEpCard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAggEpCards(Iterable<? extends AggEpCard> iterable) {
        ensureAggEpCardsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.aggEpCards_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAggEpCards() {
        this.aggEpCards_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaceIndex() {
        this.placeIndex_ = 0;
    }

    private void ensureAggEpCardsIsMutable() {
        Internal.ProtobufList<AggEpCard> protobufList = this.aggEpCards_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.aggEpCards_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static AggEps getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AggEps parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AggEps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AggEps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AggEps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AggEps> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAggEpCards(int i) {
        ensureAggEpCardsIsMutable();
        this.aggEpCards_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggEpCards(int i, AggEpCard aggEpCard) {
        aggEpCard.getClass();
        ensureAggEpCardsIsMutable();
        this.aggEpCards_.set(i, aggEpCard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceIndex(int i) {
        this.placeIndex_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69731.f16961xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AggEps();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"aggEpCards_", AggEpCard.class, "placeIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AggEps> parser = PARSER;
                if (parser == null) {
                    synchronized (AggEps.class) {
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

    public AggEpCard getAggEpCards(int i) {
        return this.aggEpCards_.get(i);
    }

    public int getAggEpCardsCount() {
        return this.aggEpCards_.size();
    }

    public List<AggEpCard> getAggEpCardsList() {
        return this.aggEpCards_;
    }

    public AggEpCardOrBuilder getAggEpCardsOrBuilder(int i) {
        return this.aggEpCards_.get(i);
    }

    public List<? extends AggEpCardOrBuilder> getAggEpCardsOrBuilderList() {
        return this.aggEpCards_;
    }

    public int getPlaceIndex() {
        return this.placeIndex_;
    }

    public static Builder newBuilder(AggEps aggEps) {
        return DEFAULT_INSTANCE.createBuilder(aggEps);
    }

    public static AggEps parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AggEps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AggEps parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AggEps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AggEps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AggEps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAggEpCards(int i, AggEpCard aggEpCard) {
        aggEpCard.getClass();
        ensureAggEpCardsIsMutable();
        this.aggEpCards_.add(i, aggEpCard);
    }

    public static AggEps parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AggEps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AggEps parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AggEps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AggEps parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AggEps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AggEps parseFrom(InputStream inputStream) throws IOException {
        return (AggEps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AggEps parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AggEps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AggEps parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AggEps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AggEps parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AggEps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
