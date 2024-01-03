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
public final class LikeInfo extends GeneratedMessageLite<LikeInfo, LikeInfo.C14735b> implements MessageLiteOrBuilder {
    private static final LikeInfo DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile Parser<LikeInfo> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private Internal.ProtobufList<Item> items_ = GeneratedMessageLite.emptyProtobufList();
    private String title_ = "";

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class Item extends GeneratedMessageLite<Item, Item.C14733a> implements InterfaceC14736c {
        private static final Item DEFAULT_INSTANCE;
        public static final int MEMBER_FIELD_NUMBER = 1;
        private static volatile Parser<Item> PARSER;
        private Member member_;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.LikeInfo$Item$a */
        /* loaded from: classes21.dex */
        public static final class C14733a extends GeneratedMessageLite.Builder<Item, C14733a> implements InterfaceC14736c {
            /* synthetic */ C14733a(C14734a c14734a) {
                this();
            }

            public C14733a clearMember() {
                copyOnWrite();
                ((Item) this.instance).clearMember();
                return this;
            }

            @Override // com.bapis.bilibili.main.community.reply.v1.LikeInfo.InterfaceC14736c
            public Member getMember() {
                return ((Item) this.instance).getMember();
            }

            @Override // com.bapis.bilibili.main.community.reply.v1.LikeInfo.InterfaceC14736c
            public boolean hasMember() {
                return ((Item) this.instance).hasMember();
            }

            public C14733a mergeMember(Member member) {
                copyOnWrite();
                ((Item) this.instance).mergeMember(member);
                return this;
            }

            public C14733a setMember(Member member) {
                copyOnWrite();
                ((Item) this.instance).setMember(member);
                return this;
            }

            private C14733a() {
                super(Item.DEFAULT_INSTANCE);
            }

            public C14733a setMember(Member.C14751b c14751b) {
                copyOnWrite();
                ((Item) this.instance).setMember(c14751b.build());
                return this;
            }
        }

        static {
            Item item = new Item();
            DEFAULT_INSTANCE = item;
            GeneratedMessageLite.registerDefaultInstance(Item.class, item);
        }

        private Item() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMember() {
            this.member_ = null;
        }

        public static Item getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMember(Member member) {
            member.getClass();
            Member member2 = this.member_;
            if (member2 != null && member2 != Member.getDefaultInstance()) {
                this.member_ = Member.newBuilder(this.member_).mergeFrom((Member) member).buildPartial();
            } else {
                this.member_ = member;
            }
        }

        public static C14733a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Item parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Item) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Item parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Item> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMember(Member member) {
            member.getClass();
            this.member_ = member;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14734a.f22000xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Item();
                case 2:
                    return new C14733a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"member_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Item> parser = PARSER;
                    if (parser == null) {
                        synchronized (Item.class) {
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

        @Override // com.bapis.bilibili.main.community.reply.v1.LikeInfo.InterfaceC14736c
        public Member getMember() {
            Member member = this.member_;
            return member == null ? Member.getDefaultInstance() : member;
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.LikeInfo.InterfaceC14736c
        public boolean hasMember() {
            return this.member_ != null;
        }

        public static C14733a newBuilder(Item item) {
            return DEFAULT_INSTANCE.createBuilder(item);
        }

        public static Item parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Item) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Item parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Item parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Item parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Item parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Item parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Item parseFrom(InputStream inputStream) throws IOException {
            return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Item parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Item parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Item parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.LikeInfo$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14734a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22000xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22000xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22000xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22000xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22000xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22000xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22000xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22000xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.LikeInfo$b */
    /* loaded from: classes21.dex */
    public static final class C14735b extends GeneratedMessageLite.Builder<LikeInfo, C14735b> implements MessageLiteOrBuilder {
        /* synthetic */ C14735b(C14734a c14734a) {
            this();
        }

        public C14735b addAllItems(Iterable<? extends Item> iterable) {
            copyOnWrite();
            ((LikeInfo) this.instance).addAllItems(iterable);
            return this;
        }

        public C14735b addItems(Item item) {
            copyOnWrite();
            ((LikeInfo) this.instance).addItems(item);
            return this;
        }

        public C14735b clearItems() {
            copyOnWrite();
            ((LikeInfo) this.instance).clearItems();
            return this;
        }

        public C14735b clearTitle() {
            copyOnWrite();
            ((LikeInfo) this.instance).clearTitle();
            return this;
        }

        public Item getItems(int i) {
            return ((LikeInfo) this.instance).getItems(i);
        }

        public int getItemsCount() {
            return ((LikeInfo) this.instance).getItemsCount();
        }

        public List<Item> getItemsList() {
            return Collections.unmodifiableList(((LikeInfo) this.instance).getItemsList());
        }

        public String getTitle() {
            return ((LikeInfo) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((LikeInfo) this.instance).getTitleBytes();
        }

        public C14735b removeItems(int i) {
            copyOnWrite();
            ((LikeInfo) this.instance).removeItems(i);
            return this;
        }

        public C14735b setItems(int i, Item item) {
            copyOnWrite();
            ((LikeInfo) this.instance).setItems(i, item);
            return this;
        }

        public C14735b setTitle(String str) {
            copyOnWrite();
            ((LikeInfo) this.instance).setTitle(str);
            return this;
        }

        public C14735b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeInfo) this.instance).setTitleBytes(byteString);
            return this;
        }

        private C14735b() {
            super(LikeInfo.DEFAULT_INSTANCE);
        }

        public C14735b addItems(int i, Item item) {
            copyOnWrite();
            ((LikeInfo) this.instance).addItems(i, item);
            return this;
        }

        public C14735b setItems(int i, Item.C14733a c14733a) {
            copyOnWrite();
            ((LikeInfo) this.instance).setItems(i, c14733a.build());
            return this;
        }

        public C14735b addItems(Item.C14733a c14733a) {
            copyOnWrite();
            ((LikeInfo) this.instance).addItems(c14733a.build());
            return this;
        }

        public C14735b addItems(int i, Item.C14733a c14733a) {
            copyOnWrite();
            ((LikeInfo) this.instance).addItems(i, c14733a.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.LikeInfo$c */
    /* loaded from: classes21.dex */
    public interface InterfaceC14736c extends MessageLiteOrBuilder {
        Member getMember();

        boolean hasMember();
    }

    static {
        LikeInfo likeInfo = new LikeInfo();
        DEFAULT_INSTANCE = likeInfo;
        GeneratedMessageLite.registerDefaultInstance(LikeInfo.class, likeInfo);
    }

    private LikeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends Item> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(Item item) {
        item.getClass();
        ensureItemsIsMutable();
        this.items_.add(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<Item> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static LikeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14735b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LikeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LikeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LikeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LikeInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i) {
        ensureItemsIsMutable();
        this.items_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i, Item item) {
        item.getClass();
        ensureItemsIsMutable();
        this.items_.set(i, item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14734a.f22000xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LikeInfo();
            case 2:
                return new C14735b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0208", new Object[]{"items_", Item.class, "title_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LikeInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (LikeInfo.class) {
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

    public Item getItems(int i) {
        return this.items_.get(i);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<Item> getItemsList() {
        return this.items_;
    }

    public InterfaceC14736c getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public List<? extends InterfaceC14736c> getItemsOrBuilderList() {
        return this.items_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static C14735b newBuilder(LikeInfo likeInfo) {
        return DEFAULT_INSTANCE.createBuilder(likeInfo);
    }

    public static LikeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LikeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LikeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i, Item item) {
        item.getClass();
        ensureItemsIsMutable();
        this.items_.add(i, item);
    }

    public static LikeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LikeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LikeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LikeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LikeInfo parseFrom(InputStream inputStream) throws IOException {
        return (LikeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LikeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LikeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
