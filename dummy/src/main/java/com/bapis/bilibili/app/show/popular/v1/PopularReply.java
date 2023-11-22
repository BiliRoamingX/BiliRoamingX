package com.bapis.bilibili.app.show.popular.v1;

import com.bapis.bilibili.app.card.v1.Card;
import com.bapis.bilibili.app.card.v1.InterfaceC5925e;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class PopularReply extends GeneratedMessageLite<PopularReply, PopularReply.C8220b> implements InterfaceC8232d {
    public static final int CONFIG_FIELD_NUMBER = 2;
    private static final PopularReply DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile Parser<PopularReply> PARSER = null;
    public static final int VER_FIELD_NUMBER = 3;
    private Config config_;
    private Internal.ProtobufList<Card> items_ = GeneratedMessageLite.emptyProtobufList();
    private String ver_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.show.popular.v1.PopularReply$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8219a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16851xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16851xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16851xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16851xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16851xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16851xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16851xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16851xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.show.popular.v1.PopularReply$b */
    /* loaded from: classes13.dex */
    public static final class C8220b extends GeneratedMessageLite.Builder<PopularReply, C8220b> implements InterfaceC8232d {
        /* synthetic */ C8220b(C8219a c8219a) {
            this();
        }

        public C8220b addAllItems(Iterable<? extends Card> iterable) {
            copyOnWrite();
            ((PopularReply) this.instance).addAllItems(iterable);
            return this;
        }

        public C8220b addItems(Card card) {
            copyOnWrite();
            ((PopularReply) this.instance).addItems(card);
            return this;
        }

        public C8220b clearConfig() {
            copyOnWrite();
            ((PopularReply) this.instance).clearConfig();
            return this;
        }

        public C8220b clearItems() {
            copyOnWrite();
            ((PopularReply) this.instance).clearItems();
            return this;
        }

        public C8220b clearVer() {
            copyOnWrite();
            ((PopularReply) this.instance).clearVer();
            return this;
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
        public Config getConfig() {
            return ((PopularReply) this.instance).getConfig();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
        public Card getItems(int i) {
            return ((PopularReply) this.instance).getItems(i);
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
        public int getItemsCount() {
            return ((PopularReply) this.instance).getItemsCount();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
        public List<Card> getItemsList() {
            return Collections.unmodifiableList(((PopularReply) this.instance).getItemsList());
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
        public String getVer() {
            return ((PopularReply) this.instance).getVer();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
        public ByteString getVerBytes() {
            return ((PopularReply) this.instance).getVerBytes();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
        public boolean hasConfig() {
            return ((PopularReply) this.instance).hasConfig();
        }

        public C8220b mergeConfig(Config config) {
            copyOnWrite();
            ((PopularReply) this.instance).mergeConfig(config);
            return this;
        }

        public C8220b removeItems(int i) {
            copyOnWrite();
            ((PopularReply) this.instance).removeItems(i);
            return this;
        }

        public C8220b setConfig(Config config) {
            copyOnWrite();
            ((PopularReply) this.instance).setConfig(config);
            return this;
        }

        public C8220b setItems(int i, Card card) {
            copyOnWrite();
            ((PopularReply) this.instance).setItems(i, card);
            return this;
        }

        public C8220b setVer(String str) {
            copyOnWrite();
            ((PopularReply) this.instance).setVer(str);
            return this;
        }

        public C8220b setVerBytes(ByteString byteString) {
            copyOnWrite();
            ((PopularReply) this.instance).setVerBytes(byteString);
            return this;
        }

        private C8220b() {
            super(PopularReply.DEFAULT_INSTANCE);
        }

        public C8220b addItems(int i, Card card) {
            copyOnWrite();
            ((PopularReply) this.instance).addItems(i, card);
            return this;
        }

        public C8220b setConfig(Config.C8214b c8214b) {
            copyOnWrite();
            ((PopularReply) this.instance).setConfig(c8214b.build());
            return this;
        }

        public C8220b setItems(int i, Card.C5799b c5799b) {
            copyOnWrite();
            ((PopularReply) this.instance).setItems(i, c5799b.build());
            return this;
        }

        public C8220b addItems(Card.C5799b c5799b) {
            copyOnWrite();
            ((PopularReply) this.instance).addItems(c5799b.build());
            return this;
        }

        public C8220b addItems(int i, Card.C5799b c5799b) {
            copyOnWrite();
            ((PopularReply) this.instance).addItems(i, c5799b.build());
            return this;
        }
    }

    static {
        PopularReply popularReply = new PopularReply();
        DEFAULT_INSTANCE = popularReply;
        GeneratedMessageLite.registerDefaultInstance(PopularReply.class, popularReply);
    }

    private PopularReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends Card> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(Card card) {
        card.getClass();
        ensureItemsIsMutable();
        this.items_.add(card);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfig() {
        this.config_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVer() {
        this.ver_ = getDefaultInstance().getVer();
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<Card> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PopularReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfig(Config config) {
        config.getClass();
        Config config2 = this.config_;
        if (config2 != null && config2 != Config.getDefaultInstance()) {
            this.config_ = Config.newBuilder(this.config_).mergeFrom((Config) config).buildPartial();
        } else {
            this.config_ = config;
        }
    }

    public static C8220b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PopularReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PopularReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PopularReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PopularReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PopularReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i) {
        ensureItemsIsMutable();
        this.items_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfig(Config config) {
        config.getClass();
        this.config_ = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i, Card card) {
        card.getClass();
        ensureItemsIsMutable();
        this.items_.set(i, card);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVer(String str) {
        str.getClass();
        this.ver_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ver_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8219a.f16851xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PopularReply();
            case 2:
                return new C8220b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\u0208", new Object[]{"items_", Card.class, "config_", "ver_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PopularReply> parser = PARSER;
                if (parser == null) {
                    synchronized (PopularReply.class) {
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

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
    public Config getConfig() {
        Config config = this.config_;
        return config == null ? Config.getDefaultInstance() : config;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
    public Card getItems(int i) {
        return this.items_.get(i);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
    public int getItemsCount() {
        return this.items_.size();
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
    public List<Card> getItemsList() {
        return this.items_;
    }

    public InterfaceC5925e getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public List<? extends InterfaceC5925e> getItemsOrBuilderList() {
        return this.items_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
    public String getVer() {
        return this.ver_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
    public ByteString getVerBytes() {
        return ByteString.copyFromUtf8(this.ver_);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8232d
    public boolean hasConfig() {
        return this.config_ != null;
    }

    public static C8220b newBuilder(PopularReply popularReply) {
        return DEFAULT_INSTANCE.createBuilder(popularReply);
    }

    public static PopularReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopularReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PopularReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopularReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PopularReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PopularReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i, Card card) {
        card.getClass();
        ensureItemsIsMutable();
        this.items_.add(i, card);
    }

    public static PopularReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopularReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PopularReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PopularReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PopularReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopularReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PopularReply parseFrom(InputStream inputStream) throws IOException {
        return (PopularReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PopularReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopularReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PopularReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PopularReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PopularReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopularReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
