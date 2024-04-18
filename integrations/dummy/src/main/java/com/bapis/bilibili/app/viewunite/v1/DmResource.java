package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class DmResource extends GeneratedMessageLite<DmResource, DmResource.C12304b> implements MessageLiteOrBuilder {
    public static final int ATTENTION_FIELD_NUMBER = 2;
    public static final int CARDS_FIELD_NUMBER = 3;
    public static final int COMMANDDMS_FIELD_NUMBER = 1;
    private static final DmResource DEFAULT_INSTANCE;
    private static volatile Parser<DmResource> PARSER;
    private AttentionCard attention_;
    private Internal.ProtobufList<CommandDm> commandDms_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<OperationCard> cards_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.DmResource$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12303a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21270xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21270xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21270xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21270xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21270xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21270xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21270xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21270xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.DmResource$b */
    /* loaded from: classes20.dex */
    public static final class C12304b extends GeneratedMessageLite.Builder<DmResource, C12304b> implements MessageLiteOrBuilder {
        /* synthetic */ C12304b(C12303a c12303a) {
            this();
        }

        public C12304b addAllCards(Iterable<? extends OperationCard> iterable) {
            copyOnWrite();
            ((DmResource) this.instance).addAllCards(iterable);
            return this;
        }

        public C12304b addAllCommandDms(Iterable<? extends CommandDm> iterable) {
            copyOnWrite();
            ((DmResource) this.instance).addAllCommandDms(iterable);
            return this;
        }

        public C12304b addCards(OperationCard operationCard) {
            copyOnWrite();
            ((DmResource) this.instance).addCards(operationCard);
            return this;
        }

        public C12304b addCommandDms(CommandDm commandDm) {
            copyOnWrite();
            ((DmResource) this.instance).addCommandDms(commandDm);
            return this;
        }

        public C12304b clearAttention() {
            copyOnWrite();
            ((DmResource) this.instance).clearAttention();
            return this;
        }

        public C12304b clearCards() {
            copyOnWrite();
            ((DmResource) this.instance).clearCards();
            return this;
        }

        public C12304b clearCommandDms() {
            copyOnWrite();
            ((DmResource) this.instance).clearCommandDms();
            return this;
        }

        public AttentionCard getAttention() {
            return ((DmResource) this.instance).getAttention();
        }

        public OperationCard getCards(int i) {
            return ((DmResource) this.instance).getCards(i);
        }

        public int getCardsCount() {
            return ((DmResource) this.instance).getCardsCount();
        }

        public List<OperationCard> getCardsList() {
            return Collections.unmodifiableList(((DmResource) this.instance).getCardsList());
        }

        public CommandDm getCommandDms(int i) {
            return ((DmResource) this.instance).getCommandDms(i);
        }

        public int getCommandDmsCount() {
            return ((DmResource) this.instance).getCommandDmsCount();
        }

        public List<CommandDm> getCommandDmsList() {
            return Collections.unmodifiableList(((DmResource) this.instance).getCommandDmsList());
        }

        public boolean hasAttention() {
            return ((DmResource) this.instance).hasAttention();
        }

        public C12304b mergeAttention(AttentionCard attentionCard) {
            copyOnWrite();
            ((DmResource) this.instance).mergeAttention(attentionCard);
            return this;
        }

        public C12304b removeCards(int i) {
            copyOnWrite();
            ((DmResource) this.instance).removeCards(i);
            return this;
        }

        public C12304b removeCommandDms(int i) {
            copyOnWrite();
            ((DmResource) this.instance).removeCommandDms(i);
            return this;
        }

        public C12304b setAttention(AttentionCard attentionCard) {
            copyOnWrite();
            ((DmResource) this.instance).setAttention(attentionCard);
            return this;
        }

        public C12304b setCards(int i, OperationCard operationCard) {
            copyOnWrite();
            ((DmResource) this.instance).setCards(i, operationCard);
            return this;
        }

        public C12304b setCommandDms(int i, CommandDm commandDm) {
            copyOnWrite();
            ((DmResource) this.instance).setCommandDms(i, commandDm);
            return this;
        }

        private C12304b() {
            super(DmResource.DEFAULT_INSTANCE);
        }

        public C12304b addCards(int i, OperationCard operationCard) {
            copyOnWrite();
            ((DmResource) this.instance).addCards(i, operationCard);
            return this;
        }

        public C12304b addCommandDms(int i, CommandDm commandDm) {
            copyOnWrite();
            ((DmResource) this.instance).addCommandDms(i, commandDm);
            return this;
        }

        public C12304b setAttention(AttentionCard.C12270b c12270b) {
            copyOnWrite();
            ((DmResource) this.instance).setAttention(c12270b.build());
            return this;
        }

        public C12304b setCards(int i, OperationCard.C12334b c12334b) {
            copyOnWrite();
            ((DmResource) this.instance).setCards(i, c12334b.build());
            return this;
        }

        public C12304b setCommandDms(int i, CommandDm.C12294b c12294b) {
            copyOnWrite();
            ((DmResource) this.instance).setCommandDms(i, c12294b.build());
            return this;
        }

        public C12304b addCards(OperationCard.C12334b c12334b) {
            copyOnWrite();
            ((DmResource) this.instance).addCards(c12334b.build());
            return this;
        }

        public C12304b addCommandDms(CommandDm.C12294b c12294b) {
            copyOnWrite();
            ((DmResource) this.instance).addCommandDms(c12294b.build());
            return this;
        }

        public C12304b addCards(int i, OperationCard.C12334b c12334b) {
            copyOnWrite();
            ((DmResource) this.instance).addCards(i, c12334b.build());
            return this;
        }

        public C12304b addCommandDms(int i, CommandDm.C12294b c12294b) {
            copyOnWrite();
            ((DmResource) this.instance).addCommandDms(i, c12294b.build());
            return this;
        }
    }

    static {
        DmResource dmResource = new DmResource();
        DEFAULT_INSTANCE = dmResource;
        GeneratedMessageLite.registerDefaultInstance(DmResource.class, dmResource);
    }

    private DmResource() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCards(Iterable<? extends OperationCard> iterable) {
        ensureCardsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.cards_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCommandDms(Iterable<? extends CommandDm> iterable) {
        ensureCommandDmsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.commandDms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCards(OperationCard operationCard) {
        operationCard.getClass();
        ensureCardsIsMutable();
        this.cards_.add(operationCard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommandDms(CommandDm commandDm) {
        commandDm.getClass();
        ensureCommandDmsIsMutable();
        this.commandDms_.add(commandDm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttention() {
        this.attention_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCards() {
        this.cards_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommandDms() {
        this.commandDms_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureCardsIsMutable() {
        Internal.ProtobufList<OperationCard> protobufList = this.cards_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.cards_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureCommandDmsIsMutable() {
        Internal.ProtobufList<CommandDm> protobufList = this.commandDms_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.commandDms_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DmResource getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAttention(AttentionCard attentionCard) {
        attentionCard.getClass();
        AttentionCard attentionCard2 = this.attention_;
        if (attentionCard2 != null && attentionCard2 != AttentionCard.getDefaultInstance()) {
            this.attention_ = AttentionCard.newBuilder(this.attention_).mergeFrom((AttentionCard) attentionCard).buildPartial();
        } else {
            this.attention_ = attentionCard;
        }
    }

    public static C12304b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DmResource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DmResource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmResource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DmResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DmResource> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCards(int i) {
        ensureCardsIsMutable();
        this.cards_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCommandDms(int i) {
        ensureCommandDmsIsMutable();
        this.commandDms_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttention(AttentionCard attentionCard) {
        attentionCard.getClass();
        this.attention_ = attentionCard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCards(int i, OperationCard operationCard) {
        operationCard.getClass();
        ensureCardsIsMutable();
        this.cards_.set(i, operationCard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommandDms(int i, CommandDm commandDm) {
        commandDm.getClass();
        ensureCommandDmsIsMutable();
        this.commandDms_.set(i, commandDm);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12303a.f21270xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DmResource();
            case 2:
                return new C12304b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\t\u0003\u001b", new Object[]{"commandDms_", CommandDm.class, "attention_", "cards_", OperationCard.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DmResource> parser = PARSER;
                if (parser == null) {
                    synchronized (DmResource.class) {
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

    public AttentionCard getAttention() {
        AttentionCard attentionCard = this.attention_;
        return attentionCard == null ? AttentionCard.getDefaultInstance() : attentionCard;
    }

    public OperationCard getCards(int i) {
        return this.cards_.get(i);
    }

    public int getCardsCount() {
        return this.cards_.size();
    }

    public List<OperationCard> getCardsList() {
        return this.cards_;
    }

    public InterfaceC12412d getCardsOrBuilder(int i) {
        return this.cards_.get(i);
    }

    public List<? extends InterfaceC12412d> getCardsOrBuilderList() {
        return this.cards_;
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

    public InterfaceC12409a getCommandDmsOrBuilder(int i) {
        return this.commandDms_.get(i);
    }

    public List<? extends InterfaceC12409a> getCommandDmsOrBuilderList() {
        return this.commandDms_;
    }

    public boolean hasAttention() {
        return this.attention_ != null;
    }

    public static C12304b newBuilder(DmResource dmResource) {
        return DEFAULT_INSTANCE.createBuilder(dmResource);
    }

    public static DmResource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmResource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmResource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DmResource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DmResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCards(int i, OperationCard operationCard) {
        operationCard.getClass();
        ensureCardsIsMutable();
        this.cards_.add(i, operationCard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommandDms(int i, CommandDm commandDm) {
        commandDm.getClass();
        ensureCommandDmsIsMutable();
        this.commandDms_.add(i, commandDm);
    }

    public static DmResource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DmResource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DmResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DmResource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DmResource parseFrom(InputStream inputStream) throws IOException {
        return (DmResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmResource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmResource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DmResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DmResource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
