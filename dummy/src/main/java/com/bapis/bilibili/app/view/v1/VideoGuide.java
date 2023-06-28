package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class VideoGuide extends GeneratedMessageLite<VideoGuide, VideoGuide.Builder> implements MessageLiteOrBuilder {
    public static final int ATTENTION_FIELD_NUMBER = 1;
    public static final int CARDS_SECOND_FIELD_NUMBER = 6;
    public static final int COMMANDDMS_FIELD_NUMBER = 2;
    public static final int CONTRACT_CARD_FIELD_NUMBER = 5;
    private static final VideoGuide DEFAULT_INSTANCE;
    public static final int OPERATION_CARD_FIELD_NUMBER = 3;
    public static final int OPERATION_CARD_NEW_FIELD_NUMBER = 4;
    private static volatile Parser<VideoGuide> PARSER;
    private ContractCard contractCard_;
    private Internal.ProtobufList<Attention> attention_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<CommandDm> commandDms_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<OperationCard> operationCard_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<OperationCardNew> operationCardNew_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<OperationCardV2> cardsSecond_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.VideoGuide$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68911 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16848xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16848xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16848xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16848xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16848xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16848xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16848xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16848xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<VideoGuide, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68911 c68911) {
            this();
        }

        public Builder addAllAttention(Iterable<? extends Attention> iterable) {
            copyOnWrite();
            ((VideoGuide) this.instance).addAllAttention(iterable);
            return this;
        }

        public Builder addAllCardsSecond(Iterable<? extends OperationCardV2> iterable) {
            copyOnWrite();
            ((VideoGuide) this.instance).addAllCardsSecond(iterable);
            return this;
        }

        public Builder addAllCommandDms(Iterable<? extends CommandDm> iterable) {
            copyOnWrite();
            ((VideoGuide) this.instance).addAllCommandDms(iterable);
            return this;
        }

        public Builder addAllOperationCard(Iterable<? extends OperationCard> iterable) {
            copyOnWrite();
            ((VideoGuide) this.instance).addAllOperationCard(iterable);
            return this;
        }

        public Builder addAllOperationCardNew(Iterable<? extends OperationCardNew> iterable) {
            copyOnWrite();
            ((VideoGuide) this.instance).addAllOperationCardNew(iterable);
            return this;
        }

        public Builder addAttention(Attention attention) {
            copyOnWrite();
            ((VideoGuide) this.instance).addAttention(attention);
            return this;
        }

        public Builder addCardsSecond(OperationCardV2 operationCardV2) {
            copyOnWrite();
            ((VideoGuide) this.instance).addCardsSecond(operationCardV2);
            return this;
        }

        public Builder addCommandDms(CommandDm commandDm) {
            copyOnWrite();
            ((VideoGuide) this.instance).addCommandDms(commandDm);
            return this;
        }

        public Builder addOperationCard(OperationCard operationCard) {
            copyOnWrite();
            ((VideoGuide) this.instance).addOperationCard(operationCard);
            return this;
        }

        public Builder addOperationCardNew(OperationCardNew operationCardNew) {
            copyOnWrite();
            ((VideoGuide) this.instance).addOperationCardNew(operationCardNew);
            return this;
        }

        public Builder clearAttention() {
            copyOnWrite();
            ((VideoGuide) this.instance).clearAttention();
            return this;
        }

        public Builder clearCardsSecond() {
            copyOnWrite();
            ((VideoGuide) this.instance).clearCardsSecond();
            return this;
        }

        public Builder clearCommandDms() {
            copyOnWrite();
            ((VideoGuide) this.instance).clearCommandDms();
            return this;
        }

        public Builder clearContractCard() {
            copyOnWrite();
            ((VideoGuide) this.instance).clearContractCard();
            return this;
        }

        public Builder clearOperationCard() {
            copyOnWrite();
            ((VideoGuide) this.instance).clearOperationCard();
            return this;
        }

        public Builder clearOperationCardNew() {
            copyOnWrite();
            ((VideoGuide) this.instance).clearOperationCardNew();
            return this;
        }

        public Attention getAttention(int i) {
            return ((VideoGuide) this.instance).getAttention(i);
        }

        public int getAttentionCount() {
            return ((VideoGuide) this.instance).getAttentionCount();
        }

        public List<Attention> getAttentionList() {
            return Collections.unmodifiableList(((VideoGuide) this.instance).getAttentionList());
        }

        public OperationCardV2 getCardsSecond(int i) {
            return ((VideoGuide) this.instance).getCardsSecond(i);
        }

        public int getCardsSecondCount() {
            return ((VideoGuide) this.instance).getCardsSecondCount();
        }

        public List<OperationCardV2> getCardsSecondList() {
            return Collections.unmodifiableList(((VideoGuide) this.instance).getCardsSecondList());
        }

        public CommandDm getCommandDms(int i) {
            return ((VideoGuide) this.instance).getCommandDms(i);
        }

        public int getCommandDmsCount() {
            return ((VideoGuide) this.instance).getCommandDmsCount();
        }

        public List<CommandDm> getCommandDmsList() {
            return Collections.unmodifiableList(((VideoGuide) this.instance).getCommandDmsList());
        }

        public ContractCard getContractCard() {
            return ((VideoGuide) this.instance).getContractCard();
        }

        public OperationCard getOperationCard(int i) {
            return ((VideoGuide) this.instance).getOperationCard(i);
        }

        public int getOperationCardCount() {
            return ((VideoGuide) this.instance).getOperationCardCount();
        }

        public List<OperationCard> getOperationCardList() {
            return Collections.unmodifiableList(((VideoGuide) this.instance).getOperationCardList());
        }

        public OperationCardNew getOperationCardNew(int i) {
            return ((VideoGuide) this.instance).getOperationCardNew(i);
        }

        public int getOperationCardNewCount() {
            return ((VideoGuide) this.instance).getOperationCardNewCount();
        }

        public List<OperationCardNew> getOperationCardNewList() {
            return Collections.unmodifiableList(((VideoGuide) this.instance).getOperationCardNewList());
        }

        public boolean hasContractCard() {
            return ((VideoGuide) this.instance).hasContractCard();
        }

        public Builder mergeContractCard(ContractCard contractCard) {
            copyOnWrite();
            ((VideoGuide) this.instance).mergeContractCard(contractCard);
            return this;
        }

        public Builder removeAttention(int i) {
            copyOnWrite();
            ((VideoGuide) this.instance).removeAttention(i);
            return this;
        }

        public Builder removeCardsSecond(int i) {
            copyOnWrite();
            ((VideoGuide) this.instance).removeCardsSecond(i);
            return this;
        }

        public Builder removeCommandDms(int i) {
            copyOnWrite();
            ((VideoGuide) this.instance).removeCommandDms(i);
            return this;
        }

        public Builder removeOperationCard(int i) {
            copyOnWrite();
            ((VideoGuide) this.instance).removeOperationCard(i);
            return this;
        }

        public Builder removeOperationCardNew(int i) {
            copyOnWrite();
            ((VideoGuide) this.instance).removeOperationCardNew(i);
            return this;
        }

        public Builder setAttention(int i, Attention attention) {
            copyOnWrite();
            ((VideoGuide) this.instance).setAttention(i, attention);
            return this;
        }

        public Builder setCardsSecond(int i, OperationCardV2 operationCardV2) {
            copyOnWrite();
            ((VideoGuide) this.instance).setCardsSecond(i, operationCardV2);
            return this;
        }

        public Builder setCommandDms(int i, CommandDm commandDm) {
            copyOnWrite();
            ((VideoGuide) this.instance).setCommandDms(i, commandDm);
            return this;
        }

        public Builder setContractCard(ContractCard contractCard) {
            copyOnWrite();
            ((VideoGuide) this.instance).setContractCard(contractCard);
            return this;
        }

        public Builder setOperationCard(int i, OperationCard operationCard) {
            copyOnWrite();
            ((VideoGuide) this.instance).setOperationCard(i, operationCard);
            return this;
        }

        public Builder setOperationCardNew(int i, OperationCardNew operationCardNew) {
            copyOnWrite();
            ((VideoGuide) this.instance).setOperationCardNew(i, operationCardNew);
            return this;
        }

        private Builder() {
            super(VideoGuide.DEFAULT_INSTANCE);
        }

        public Builder addAttention(int i, Attention attention) {
            copyOnWrite();
            ((VideoGuide) this.instance).addAttention(i, attention);
            return this;
        }

        public Builder addCardsSecond(int i, OperationCardV2 operationCardV2) {
            copyOnWrite();
            ((VideoGuide) this.instance).addCardsSecond(i, operationCardV2);
            return this;
        }

        public Builder addCommandDms(int i, CommandDm commandDm) {
            copyOnWrite();
            ((VideoGuide) this.instance).addCommandDms(i, commandDm);
            return this;
        }

        public Builder addOperationCard(int i, OperationCard operationCard) {
            copyOnWrite();
            ((VideoGuide) this.instance).addOperationCard(i, operationCard);
            return this;
        }

        public Builder addOperationCardNew(int i, OperationCardNew operationCardNew) {
            copyOnWrite();
            ((VideoGuide) this.instance).addOperationCardNew(i, operationCardNew);
            return this;
        }

        public Builder setAttention(int i, Attention.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).setAttention(i, builder.build());
            return this;
        }

        public Builder setCardsSecond(int i, OperationCardV2.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).setCardsSecond(i, builder.build());
            return this;
        }

        public Builder setCommandDms(int i, CommandDm.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).setCommandDms(i, builder.build());
            return this;
        }

        public Builder setContractCard(ContractCard.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).setContractCard(builder.build());
            return this;
        }

        public Builder setOperationCard(int i, OperationCard.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).setOperationCard(i, builder.build());
            return this;
        }

        public Builder setOperationCardNew(int i, OperationCardNew.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).setOperationCardNew(i, builder.build());
            return this;
        }

        public Builder addAttention(Attention.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).addAttention(builder.build());
            return this;
        }

        public Builder addCardsSecond(OperationCardV2.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).addCardsSecond(builder.build());
            return this;
        }

        public Builder addCommandDms(CommandDm.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).addCommandDms(builder.build());
            return this;
        }

        public Builder addOperationCard(OperationCard.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).addOperationCard(builder.build());
            return this;
        }

        public Builder addOperationCardNew(OperationCardNew.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).addOperationCardNew(builder.build());
            return this;
        }

        public Builder addAttention(int i, Attention.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).addAttention(i, builder.build());
            return this;
        }

        public Builder addCardsSecond(int i, OperationCardV2.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).addCardsSecond(i, builder.build());
            return this;
        }

        public Builder addCommandDms(int i, CommandDm.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).addCommandDms(i, builder.build());
            return this;
        }

        public Builder addOperationCard(int i, OperationCard.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).addOperationCard(i, builder.build());
            return this;
        }

        public Builder addOperationCardNew(int i, OperationCardNew.Builder builder) {
            copyOnWrite();
            ((VideoGuide) this.instance).addOperationCardNew(i, builder.build());
            return this;
        }
    }

    static {
        VideoGuide videoGuide = new VideoGuide();
        DEFAULT_INSTANCE = videoGuide;
        GeneratedMessageLite.registerDefaultInstance(VideoGuide.class, videoGuide);
    }

    private VideoGuide() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttention(Iterable<? extends Attention> iterable) {
        ensureAttentionIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.attention_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCardsSecond(Iterable<? extends OperationCardV2> iterable) {
        ensureCardsSecondIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.cardsSecond_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCommandDms(Iterable<? extends CommandDm> iterable) {
        ensureCommandDmsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.commandDms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOperationCard(Iterable<? extends OperationCard> iterable) {
        ensureOperationCardIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.operationCard_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOperationCardNew(Iterable<? extends OperationCardNew> iterable) {
        ensureOperationCardNewIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.operationCardNew_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttention(Attention attention) {
        attention.getClass();
        ensureAttentionIsMutable();
        this.attention_.add(attention);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCardsSecond(OperationCardV2 operationCardV2) {
        operationCardV2.getClass();
        ensureCardsSecondIsMutable();
        this.cardsSecond_.add(operationCardV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommandDms(CommandDm commandDm) {
        commandDm.getClass();
        ensureCommandDmsIsMutable();
        this.commandDms_.add(commandDm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOperationCard(OperationCard operationCard) {
        operationCard.getClass();
        ensureOperationCardIsMutable();
        this.operationCard_.add(operationCard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOperationCardNew(OperationCardNew operationCardNew) {
        operationCardNew.getClass();
        ensureOperationCardNewIsMutable();
        this.operationCardNew_.add(operationCardNew);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttention() {
        this.attention_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardsSecond() {
        this.cardsSecond_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommandDms() {
        this.commandDms_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContractCard() {
        this.contractCard_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperationCard() {
        this.operationCard_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperationCardNew() {
        this.operationCardNew_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAttentionIsMutable() {
        Internal.ProtobufList<Attention> protobufList = this.attention_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.attention_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureCardsSecondIsMutable() {
        Internal.ProtobufList<OperationCardV2> protobufList = this.cardsSecond_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.cardsSecond_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureCommandDmsIsMutable() {
        Internal.ProtobufList<CommandDm> protobufList = this.commandDms_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.commandDms_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureOperationCardIsMutable() {
        Internal.ProtobufList<OperationCard> protobufList = this.operationCard_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.operationCard_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureOperationCardNewIsMutable() {
        Internal.ProtobufList<OperationCardNew> protobufList = this.operationCardNew_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.operationCardNew_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static VideoGuide getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContractCard(ContractCard contractCard) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VideoGuide parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoGuide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoGuide parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VideoGuide> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttention(int i) {
        ensureAttentionIsMutable();
        this.attention_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCardsSecond(int i) {
        ensureCardsSecondIsMutable();
        this.cardsSecond_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCommandDms(int i) {
        ensureCommandDmsIsMutable();
        this.commandDms_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOperationCard(int i) {
        ensureOperationCardIsMutable();
        this.operationCard_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOperationCardNew(int i) {
        ensureOperationCardNewIsMutable();
        this.operationCardNew_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttention(int i, Attention attention) {
        attention.getClass();
        ensureAttentionIsMutable();
        this.attention_.set(i, attention);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardsSecond(int i, OperationCardV2 operationCardV2) {
        operationCardV2.getClass();
        ensureCardsSecondIsMutable();
        this.cardsSecond_.set(i, operationCardV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommandDms(int i, CommandDm commandDm) {
        commandDm.getClass();
        ensureCommandDmsIsMutable();
        this.commandDms_.set(i, commandDm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContractCard(ContractCard contractCard) {
        contractCard.getClass();
        this.contractCard_ = contractCard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperationCard(int i, OperationCard operationCard) {
        operationCard.getClass();
        ensureOperationCardIsMutable();
        this.operationCard_.set(i, operationCard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperationCardNew(int i, OperationCardNew operationCardNew) {
        operationCardNew.getClass();
        ensureOperationCardNewIsMutable();
        this.operationCardNew_.set(i, operationCardNew);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68911.f16848xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoGuide();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\t\u0006\u001b", new Object[]{"attention_", Attention.class, "commandDms_", CommandDm.class, "operationCard_", OperationCard.class, "operationCardNew_", OperationCardNew.class, "contractCard_", "cardsSecond_", OperationCardV2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VideoGuide> parser = PARSER;
                if (parser == null) {
                    synchronized (VideoGuide.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public Attention getAttention(int i) {
        return this.attention_.get(i);
    }

    public int getAttentionCount() {
        return this.attention_.size();
    }

    public List<Attention> getAttentionList() {
        return this.attention_;
    }

    public AttentionOrBuilder getAttentionOrBuilder(int i) {
        return this.attention_.get(i);
    }

    public List<? extends AttentionOrBuilder> getAttentionOrBuilderList() {
        return this.attention_;
    }

    public OperationCardV2 getCardsSecond(int i) {
        return this.cardsSecond_.get(i);
    }

    public int getCardsSecondCount() {
        return this.cardsSecond_.size();
    }

    public List<OperationCardV2> getCardsSecondList() {
        return this.cardsSecond_;
    }

    public OperationCardV2OrBuilder getCardsSecondOrBuilder(int i) {
        return this.cardsSecond_.get(i);
    }

    public List<? extends OperationCardV2OrBuilder> getCardsSecondOrBuilderList() {
        return this.cardsSecond_;
    }

    public CommandDm getCommandDms(int i) {
        return this.commandDms_.get(i);
    }

    public int getCommandDmsCount() {
        return this.commandDms_.size();
    }

    public List<CommandDm> getCommandDmsList() {
        return this.commandDms_;
    }

    public CommandDmOrBuilder getCommandDmsOrBuilder(int i) {
        return this.commandDms_.get(i);
    }

    public List<? extends CommandDmOrBuilder> getCommandDmsOrBuilderList() {
        return this.commandDms_;
    }

    public ContractCard getContractCard() {
        ContractCard contractCard = this.contractCard_;
        return contractCard == null ? ContractCard.getDefaultInstance() : contractCard;
    }

    public OperationCard getOperationCard(int i) {
        return this.operationCard_.get(i);
    }

    public int getOperationCardCount() {
        return this.operationCard_.size();
    }

    public List<OperationCard> getOperationCardList() {
        return this.operationCard_;
    }

    public OperationCardNew getOperationCardNew(int i) {
        return this.operationCardNew_.get(i);
    }

    public int getOperationCardNewCount() {
        return this.operationCardNew_.size();
    }

    public List<OperationCardNew> getOperationCardNewList() {
        return this.operationCardNew_;
    }

    public OperationCardNewOrBuilder getOperationCardNewOrBuilder(int i) {
        return this.operationCardNew_.get(i);
    }

    public List<? extends OperationCardNewOrBuilder> getOperationCardNewOrBuilderList() {
        return this.operationCardNew_;
    }

    public OperationCardOrBuilder getOperationCardOrBuilder(int i) {
        return this.operationCard_.get(i);
    }

    public List<? extends OperationCardOrBuilder> getOperationCardOrBuilderList() {
        return this.operationCard_;
    }

    public boolean hasContractCard() {
        return this.contractCard_ != null;
    }

    public static Builder newBuilder(VideoGuide videoGuide) {
        return DEFAULT_INSTANCE.createBuilder(videoGuide);
    }

    public static VideoGuide parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoGuide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoGuide parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoGuide parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttention(int i, Attention attention) {
        attention.getClass();
        ensureAttentionIsMutable();
        this.attention_.add(i, attention);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCardsSecond(int i, OperationCardV2 operationCardV2) {
        operationCardV2.getClass();
        ensureCardsSecondIsMutable();
        this.cardsSecond_.add(i, operationCardV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommandDms(int i, CommandDm commandDm) {
        commandDm.getClass();
        ensureCommandDmsIsMutable();
        this.commandDms_.add(i, commandDm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOperationCard(int i, OperationCard operationCard) {
        operationCard.getClass();
        ensureOperationCardIsMutable();
        this.operationCard_.add(i, operationCard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOperationCardNew(int i, OperationCardNew operationCardNew) {
        operationCardNew.getClass();
        ensureOperationCardNewIsMutable();
        this.operationCardNew_.add(i, operationCardNew);
    }

    public static VideoGuide parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoGuide parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoGuide parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VideoGuide parseFrom(InputStream inputStream) throws IOException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoGuide parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoGuide parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoGuide parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
