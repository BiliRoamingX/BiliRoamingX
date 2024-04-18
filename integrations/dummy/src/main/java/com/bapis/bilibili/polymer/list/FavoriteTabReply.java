package com.bapis.bilibili.polymer.list;

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
/* loaded from: classes23.dex */
public final class FavoriteTabReply extends GeneratedMessageLite<FavoriteTabReply, FavoriteTabReply.C13204b> implements MessageLiteOrBuilder {
    private static final FavoriteTabReply DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile Parser<FavoriteTabReply> PARSER;
    private Internal.ProtobufList<FavoriteTabItem> items_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.list.FavoriteTabReply$a */
    /* loaded from: classes23.dex */
    static /* synthetic */ class C13203a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22234xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22234xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22234xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22234xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22234xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22234xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22234xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22234xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.list.FavoriteTabReply$b */
    /* loaded from: classes23.dex */
    public static final class C13204b extends GeneratedMessageLite.Builder<FavoriteTabReply, C13204b> implements MessageLiteOrBuilder {
        /* synthetic */ C13204b(C13203a c13203a) {
            this();
        }

        public C13204b addAllItems(Iterable<? extends FavoriteTabItem> iterable) {
            copyOnWrite();
            ((FavoriteTabReply) this.instance).addAllItems(iterable);
            return this;
        }

        public C13204b addItems(FavoriteTabItem favoriteTabItem) {
            copyOnWrite();
            ((FavoriteTabReply) this.instance).addItems(favoriteTabItem);
            return this;
        }

        public C13204b clearItems() {
            copyOnWrite();
            ((FavoriteTabReply) this.instance).clearItems();
            return this;
        }

        public FavoriteTabItem getItems(int i14) {
            return ((FavoriteTabReply) this.instance).getItems(i14);
        }

        public int getItemsCount() {
            return ((FavoriteTabReply) this.instance).getItemsCount();
        }

        public List<FavoriteTabItem> getItemsList() {
            return Collections.unmodifiableList(((FavoriteTabReply) this.instance).getItemsList());
        }

        public C13204b removeItems(int i14) {
            copyOnWrite();
            ((FavoriteTabReply) this.instance).removeItems(i14);
            return this;
        }

        public C13204b setItems(int i14, FavoriteTabItem favoriteTabItem) {
            copyOnWrite();
            ((FavoriteTabReply) this.instance).setItems(i14, favoriteTabItem);
            return this;
        }

        private C13204b() {
            super(FavoriteTabReply.DEFAULT_INSTANCE);
        }

        public C13204b addItems(int i14, FavoriteTabItem favoriteTabItem) {
            copyOnWrite();
            ((FavoriteTabReply) this.instance).addItems(i14, favoriteTabItem);
            return this;
        }

        public C13204b setItems(int i14, FavoriteTabItem.C13202b c13202b) {
            copyOnWrite();
            ((FavoriteTabReply) this.instance).setItems(i14, c13202b.build());
            return this;
        }

        public C13204b addItems(FavoriteTabItem.C13202b c13202b) {
            copyOnWrite();
            ((FavoriteTabReply) this.instance).addItems(c13202b.build());
            return this;
        }

        public C13204b addItems(int i14, FavoriteTabItem.C13202b c13202b) {
            copyOnWrite();
            ((FavoriteTabReply) this.instance).addItems(i14, c13202b.build());
            return this;
        }
    }

    static {
        FavoriteTabReply favoriteTabReply = new FavoriteTabReply();
        DEFAULT_INSTANCE = favoriteTabReply;
        GeneratedMessageLite.registerDefaultInstance(FavoriteTabReply.class, favoriteTabReply);
    }

    private FavoriteTabReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends FavoriteTabItem> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(FavoriteTabItem favoriteTabItem) {
        favoriteTabItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(favoriteTabItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<FavoriteTabItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FavoriteTabReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13204b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FavoriteTabReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FavoriteTabReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FavoriteTabReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FavoriteTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FavoriteTabReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i14) {
        ensureItemsIsMutable();
        this.items_.remove(i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i14, FavoriteTabItem favoriteTabItem) {
        favoriteTabItem.getClass();
        ensureItemsIsMutable();
        this.items_.set(i14, favoriteTabItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C13203a c13203a = null;
        switch (C13203a.f22234xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FavoriteTabReply();
            case 2:
                return new C13204b(c13203a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", FavoriteTabItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FavoriteTabReply> parser = PARSER;
                if (parser == null) {
                    synchronized (FavoriteTabReply.class) {
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

    public FavoriteTabItem getItems(int i14) {
        return this.items_.get(i14);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<FavoriteTabItem> getItemsList() {
        return this.items_;
    }

    public InterfaceC13207a getItemsOrBuilder(int i14) {
        return this.items_.get(i14);
    }

    public List<? extends InterfaceC13207a> getItemsOrBuilderList() {
        return this.items_;
    }

    public static C13204b newBuilder(FavoriteTabReply favoriteTabReply) {
        return DEFAULT_INSTANCE.createBuilder(favoriteTabReply);
    }

    public static FavoriteTabReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FavoriteTabReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FavoriteTabReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FavoriteTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FavoriteTabReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FavoriteTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i14, FavoriteTabItem favoriteTabItem) {
        favoriteTabItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(i14, favoriteTabItem);
    }

    public static FavoriteTabReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FavoriteTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FavoriteTabReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FavoriteTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FavoriteTabReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FavoriteTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FavoriteTabReply parseFrom(InputStream inputStream) throws IOException {
        return (FavoriteTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FavoriteTabReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FavoriteTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FavoriteTabReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FavoriteTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FavoriteTabReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FavoriteTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
