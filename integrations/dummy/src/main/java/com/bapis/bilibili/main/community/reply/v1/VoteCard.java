package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class VoteCard extends GeneratedMessageLite<VoteCard, VoteCard.C14911b> implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 3;
    private static final VoteCard DEFAULT_INSTANCE;
    public static final int MY_VOTE_OPTION_FIELD_NUMBER = 5;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile Parser<VoteCard> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int VOTE_ID_FIELD_NUMBER = 1;
    private long count_;
    private long myVoteOption_;
    private long voteId_;
    private String title_ = "";
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class Option extends GeneratedMessageLite<Option, Option.C14909a> implements InterfaceC14912c {
        public static final int COUNT_FIELD_NUMBER = 3;
        private static final Option DEFAULT_INSTANCE;
        public static final int DESC_FIELD_NUMBER = 2;
        public static final int IDX_FIELD_NUMBER = 1;
        private static volatile Parser<Option> PARSER;
        private long count_;
        private String desc_ = "";
        private long idx_;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.VoteCard$Option$a */
        /* loaded from: classes21.dex */
        public static final class C14909a extends GeneratedMessageLite.Builder<Option, C14909a> implements InterfaceC14912c {
            /* synthetic */ C14909a(C14910a c14910a) {
                this();
            }

            public C14909a clearCount() {
                copyOnWrite();
                ((Option) this.instance).clearCount();
                return this;
            }

            public C14909a clearDesc() {
                copyOnWrite();
                ((Option) this.instance).clearDesc();
                return this;
            }

            public C14909a clearIdx() {
                copyOnWrite();
                ((Option) this.instance).clearIdx();
                return this;
            }

            @Override // com.bapis.bilibili.main.community.reply.v1.VoteCard.InterfaceC14912c
            public long getCount() {
                return ((Option) this.instance).getCount();
            }

            @Override // com.bapis.bilibili.main.community.reply.v1.VoteCard.InterfaceC14912c
            public String getDesc() {
                return ((Option) this.instance).getDesc();
            }

            @Override // com.bapis.bilibili.main.community.reply.v1.VoteCard.InterfaceC14912c
            public ByteString getDescBytes() {
                return ((Option) this.instance).getDescBytes();
            }

            @Override // com.bapis.bilibili.main.community.reply.v1.VoteCard.InterfaceC14912c
            public long getIdx() {
                return ((Option) this.instance).getIdx();
            }

            public C14909a setCount(long j) {
                copyOnWrite();
                ((Option) this.instance).setCount(j);
                return this;
            }

            public C14909a setDesc(String str) {
                copyOnWrite();
                ((Option) this.instance).setDesc(str);
                return this;
            }

            public C14909a setDescBytes(ByteString byteString) {
                copyOnWrite();
                ((Option) this.instance).setDescBytes(byteString);
                return this;
            }

            public C14909a setIdx(long j) {
                copyOnWrite();
                ((Option) this.instance).setIdx(j);
                return this;
            }

            private C14909a() {
                super(Option.DEFAULT_INSTANCE);
            }
        }

        static {
            Option option = new Option();
            DEFAULT_INSTANCE = option;
            GeneratedMessageLite.registerDefaultInstance(Option.class, option);
        }

        private Option() {
        }

        public void clearCount() {
            this.count_ = 0L;
        }

        public void clearDesc() {
            this.desc_ = getDefaultInstance().getDesc();
        }

        public void clearIdx() {
            this.idx_ = 0L;
        }

        public static Option getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C14909a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Option parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Option) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Option parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Option> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setCount(long j) {
            this.count_ = j;
        }

        public void setDesc(String str) {
            str.getClass();
            this.desc_ = str;
        }

        public void setDescBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.desc_ = byteString.toStringUtf8();
        }

        public void setIdx(long j) {
            this.idx_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14910a.f22053xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Option();
                case 2:
                    return new C14909a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002", new Object[]{"idx_", "desc_", "count_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Option> parser = PARSER;
                    if (parser == null) {
                        synchronized (Option.class) {
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

        @Override // com.bapis.bilibili.main.community.reply.v1.VoteCard.InterfaceC14912c
        public long getCount() {
            return this.count_;
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.VoteCard.InterfaceC14912c
        public String getDesc() {
            return this.desc_;
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.VoteCard.InterfaceC14912c
        public ByteString getDescBytes() {
            return ByteString.copyFromUtf8(this.desc_);
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.VoteCard.InterfaceC14912c
        public long getIdx() {
            return this.idx_;
        }

        public static C14909a newBuilder(Option option) {
            return DEFAULT_INSTANCE.createBuilder(option);
        }

        public static Option parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Option) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Option parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Option parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Option parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Option parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Option parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Option parseFrom(InputStream inputStream) throws IOException {
            return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Option parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Option parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Option parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.VoteCard$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14910a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22053xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22053xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22053xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22053xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22053xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22053xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22053xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22053xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.VoteCard$b */
    /* loaded from: classes21.dex */
    public static final class C14911b extends GeneratedMessageLite.Builder<VoteCard, C14911b> implements MessageLiteOrBuilder {
        /* synthetic */ C14911b(C14910a c14910a) {
            this();
        }

        public C14911b addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            ((VoteCard) this.instance).addAllOptions(iterable);
            return this;
        }

        public C14911b addOptions(Option option) {
            copyOnWrite();
            ((VoteCard) this.instance).addOptions(option);
            return this;
        }

        public C14911b clearCount() {
            copyOnWrite();
            ((VoteCard) this.instance).clearCount();
            return this;
        }

        public C14911b clearMyVoteOption() {
            copyOnWrite();
            ((VoteCard) this.instance).clearMyVoteOption();
            return this;
        }

        public C14911b clearOptions() {
            copyOnWrite();
            ((VoteCard) this.instance).clearOptions();
            return this;
        }

        public C14911b clearTitle() {
            copyOnWrite();
            ((VoteCard) this.instance).clearTitle();
            return this;
        }

        public C14911b clearVoteId() {
            copyOnWrite();
            ((VoteCard) this.instance).clearVoteId();
            return this;
        }

        public long getCount() {
            return ((VoteCard) this.instance).getCount();
        }

        public long getMyVoteOption() {
            return ((VoteCard) this.instance).getMyVoteOption();
        }

        public Option getOptions(int i) {
            return ((VoteCard) this.instance).getOptions(i);
        }

        public int getOptionsCount() {
            return ((VoteCard) this.instance).getOptionsCount();
        }

        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((VoteCard) this.instance).getOptionsList());
        }

        public String getTitle() {
            return ((VoteCard) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((VoteCard) this.instance).getTitleBytes();
        }

        public long getVoteId() {
            return ((VoteCard) this.instance).getVoteId();
        }

        public C14911b removeOptions(int i) {
            copyOnWrite();
            ((VoteCard) this.instance).removeOptions(i);
            return this;
        }

        public C14911b setCount(long j) {
            copyOnWrite();
            ((VoteCard) this.instance).setCount(j);
            return this;
        }

        public C14911b setMyVoteOption(long j) {
            copyOnWrite();
            ((VoteCard) this.instance).setMyVoteOption(j);
            return this;
        }

        public C14911b setOptions(int i, Option option) {
            copyOnWrite();
            ((VoteCard) this.instance).setOptions(i, option);
            return this;
        }

        public C14911b setTitle(String str) {
            copyOnWrite();
            ((VoteCard) this.instance).setTitle(str);
            return this;
        }

        public C14911b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((VoteCard) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C14911b setVoteId(long j) {
            copyOnWrite();
            ((VoteCard) this.instance).setVoteId(j);
            return this;
        }

        private C14911b() {
            super(VoteCard.DEFAULT_INSTANCE);
        }

        public C14911b addOptions(int i, Option option) {
            copyOnWrite();
            ((VoteCard) this.instance).addOptions(i, option);
            return this;
        }

        public C14911b setOptions(int i, Option.C14909a c14909a) {
            copyOnWrite();
            ((VoteCard) this.instance).setOptions(i, c14909a.build());
            return this;
        }

        public C14911b addOptions(Option.C14909a c14909a) {
            copyOnWrite();
            ((VoteCard) this.instance).addOptions(c14909a.build());
            return this;
        }

        public C14911b addOptions(int i, Option.C14909a c14909a) {
            copyOnWrite();
            ((VoteCard) this.instance).addOptions(i, c14909a.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.VoteCard$c */
    /* loaded from: classes21.dex */
    public interface InterfaceC14912c extends MessageLiteOrBuilder {
        long getCount();

        String getDesc();

        ByteString getDescBytes();

        long getIdx();
    }

    static {
        VoteCard voteCard = new VoteCard();
        DEFAULT_INSTANCE = voteCard;
        GeneratedMessageLite.registerDefaultInstance(VoteCard.class, voteCard);
    }

    private VoteCard() {
    }

    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.options_);
    }

    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    public void clearCount() {
        this.count_ = 0L;
    }

    public void clearMyVoteOption() {
        this.myVoteOption_ = 0L;
    }

    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public void clearVoteId() {
        this.voteId_ = 0L;
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList<Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static VoteCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14911b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VoteCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VoteCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoteCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VoteCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VoteCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    public void setCount(long j) {
        this.count_ = j;
    }

    public void setMyVoteOption(long j) {
        this.myVoteOption_ = j;
    }

    public void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public void setVoteId(long j) {
        this.voteId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14910a.f22053xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VoteCard();
            case 2:
                return new C14911b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0002\u0002\u0208\u0003\u0002\u0004\u001b\u0005\u0002", new Object[]{"voteId_", "title_", "count_", "options_", Option.class, "myVoteOption_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VoteCard> parser = PARSER;
                if (parser == null) {
                    synchronized (VoteCard.class) {
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

    public long getCount() {
        return this.count_;
    }

    public long getMyVoteOption() {
        return this.myVoteOption_;
    }

    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List<Option> getOptionsList() {
        return this.options_;
    }

    public InterfaceC14912c getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    public List<? extends InterfaceC14912c> getOptionsOrBuilderList() {
        return this.options_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public long getVoteId() {
        return this.voteId_;
    }

    public static C14911b newBuilder(VoteCard voteCard) {
        return DEFAULT_INSTANCE.createBuilder(voteCard);
    }

    public static VoteCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VoteCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VoteCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VoteCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VoteCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VoteCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static VoteCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VoteCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VoteCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VoteCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VoteCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VoteCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VoteCard parseFrom(InputStream inputStream) throws IOException {
        return (VoteCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoteCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VoteCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VoteCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VoteCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VoteCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VoteCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
