package com.bapis.bilibili.app.card.v1;

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
public final class PopularTopEntrance extends GeneratedMessageLite<PopularTopEntrance, PopularTopEntrance.C5849b> implements MessageLiteOrBuilder {
    public static final int BASE_FIELD_NUMBER = 1;
    private static final PopularTopEntrance DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile Parser<PopularTopEntrance> PARSER;
    private Base base_;
    private Internal.ProtobufList<EntranceItem> items_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.PopularTopEntrance$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5848a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15973xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15973xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15973xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15973xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15973xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15973xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15973xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15973xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.PopularTopEntrance$b */
    /* loaded from: classes13.dex */
    public static final class C5849b extends GeneratedMessageLite.Builder<PopularTopEntrance, C5849b> implements MessageLiteOrBuilder {
        /* synthetic */ C5849b(C5848a c5848a) {
            this();
        }

        public C5849b addAllItems(Iterable<? extends EntranceItem> iterable) {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).addAllItems(iterable);
            return this;
        }

        public C5849b addItems(EntranceItem entranceItem) {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).addItems(entranceItem);
            return this;
        }

        public C5849b clearBase() {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).clearBase();
            return this;
        }

        public C5849b clearItems() {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).clearItems();
            return this;
        }

        public Base getBase() {
            return ((PopularTopEntrance) this.instance).getBase();
        }

        public EntranceItem getItems(int i) {
            return ((PopularTopEntrance) this.instance).getItems(i);
        }

        public int getItemsCount() {
            return ((PopularTopEntrance) this.instance).getItemsCount();
        }

        public List<EntranceItem> getItemsList() {
            return Collections.unmodifiableList(((PopularTopEntrance) this.instance).getItemsList());
        }

        public boolean hasBase() {
            return ((PopularTopEntrance) this.instance).hasBase();
        }

        public C5849b mergeBase(Base base2) {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).mergeBase(base2);
            return this;
        }

        public C5849b removeItems(int i) {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).removeItems(i);
            return this;
        }

        public C5849b setBase(Base base2) {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).setBase(base2);
            return this;
        }

        public C5849b setItems(int i, EntranceItem entranceItem) {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).setItems(i, entranceItem);
            return this;
        }

        private C5849b() {
            super(PopularTopEntrance.DEFAULT_INSTANCE);
        }

        public C5849b addItems(int i, EntranceItem entranceItem) {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).addItems(i, entranceItem);
            return this;
        }

        public C5849b setBase(Base.C5793b c5793b) {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).setBase(c5793b.build());
            return this;
        }

        public C5849b setItems(int i, EntranceItem.C5809b c5809b) {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).setItems(i, c5809b.build());
            return this;
        }

        public C5849b addItems(EntranceItem.C5809b c5809b) {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).addItems(c5809b.build());
            return this;
        }

        public C5849b addItems(int i, EntranceItem.C5809b c5809b) {
            copyOnWrite();
            ((PopularTopEntrance) this.instance).addItems(i, c5809b.build());
            return this;
        }
    }

    static {
        PopularTopEntrance popularTopEntrance = new PopularTopEntrance();
        DEFAULT_INSTANCE = popularTopEntrance;
        GeneratedMessageLite.registerDefaultInstance(PopularTopEntrance.class, popularTopEntrance);
    }

    private PopularTopEntrance() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends EntranceItem> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(EntranceItem entranceItem) {
        entranceItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(entranceItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.base_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<EntranceItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PopularTopEntrance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBase(Base base2) {
        base2.getClass();
        Base base3 = this.base_;
        if (base3 != null && base3 != Base.getDefaultInstance()) {
            this.base_ = Base.newBuilder(this.base_).mergeFrom((Base) base2).buildPartial();
        } else {
            this.base_ = base2;
        }
    }

    public static C5849b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PopularTopEntrance parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PopularTopEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PopularTopEntrance parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PopularTopEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PopularTopEntrance> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i) {
        ensureItemsIsMutable();
        this.items_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBase(Base base2) {
        base2.getClass();
        this.base_ = base2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i, EntranceItem entranceItem) {
        entranceItem.getClass();
        ensureItemsIsMutable();
        this.items_.set(i, entranceItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5848a.f15973xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PopularTopEntrance();
            case 2:
                return new C5849b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"base_", "items_", EntranceItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PopularTopEntrance> parser = PARSER;
                if (parser == null) {
                    synchronized (PopularTopEntrance.class) {
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

    public Base getBase() {
        Base base2 = this.base_;
        return base2 == null ? Base.getDefaultInstance() : base2;
    }

    public EntranceItem getItems(int i) {
        return this.items_.get(i);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<EntranceItem> getItemsList() {
        return this.items_;
    }

    public InterfaceC5928h getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public List<? extends InterfaceC5928h> getItemsOrBuilderList() {
        return this.items_;
    }

    public boolean hasBase() {
        return this.base_ != null;
    }

    public static C5849b newBuilder(PopularTopEntrance popularTopEntrance) {
        return DEFAULT_INSTANCE.createBuilder(popularTopEntrance);
    }

    public static PopularTopEntrance parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopularTopEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PopularTopEntrance parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopularTopEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PopularTopEntrance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PopularTopEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i, EntranceItem entranceItem) {
        entranceItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(i, entranceItem);
    }

    public static PopularTopEntrance parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopularTopEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PopularTopEntrance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PopularTopEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PopularTopEntrance parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopularTopEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PopularTopEntrance parseFrom(InputStream inputStream) throws IOException {
        return (PopularTopEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PopularTopEntrance parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopularTopEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PopularTopEntrance parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PopularTopEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PopularTopEntrance parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopularTopEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
