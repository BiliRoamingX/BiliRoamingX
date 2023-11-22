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
public final class HotTopic extends GeneratedMessageLite<HotTopic, HotTopic.C5815b> implements MessageLiteOrBuilder {
    public static final int BASE_FIELD_NUMBER = 1;
    private static final HotTopic DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 2;
    public static final int ITEMS_FIELD_NUMBER = 3;
    private static volatile Parser<HotTopic> PARSER;
    private Base base_;
    private String desc_ = "";
    private Internal.ProtobufList<HotTopicItem> items_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.HotTopic$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5814a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15956xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15956xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15956xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15956xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15956xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15956xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15956xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15956xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.HotTopic$b */
    /* loaded from: classes13.dex */
    public static final class C5815b extends GeneratedMessageLite.Builder<HotTopic, C5815b> implements MessageLiteOrBuilder {
        /* synthetic */ C5815b(C5814a c5814a) {
            this();
        }

        public C5815b addAllItems(Iterable<? extends HotTopicItem> iterable) {
            copyOnWrite();
            ((HotTopic) this.instance).addAllItems(iterable);
            return this;
        }

        public C5815b addItems(HotTopicItem hotTopicItem) {
            copyOnWrite();
            ((HotTopic) this.instance).addItems(hotTopicItem);
            return this;
        }

        public C5815b clearBase() {
            copyOnWrite();
            ((HotTopic) this.instance).clearBase();
            return this;
        }

        public C5815b clearDesc() {
            copyOnWrite();
            ((HotTopic) this.instance).clearDesc();
            return this;
        }

        public C5815b clearItems() {
            copyOnWrite();
            ((HotTopic) this.instance).clearItems();
            return this;
        }

        public Base getBase() {
            return ((HotTopic) this.instance).getBase();
        }

        public String getDesc() {
            return ((HotTopic) this.instance).getDesc();
        }

        public ByteString getDescBytes() {
            return ((HotTopic) this.instance).getDescBytes();
        }

        public HotTopicItem getItems(int i) {
            return ((HotTopic) this.instance).getItems(i);
        }

        public int getItemsCount() {
            return ((HotTopic) this.instance).getItemsCount();
        }

        public List<HotTopicItem> getItemsList() {
            return Collections.unmodifiableList(((HotTopic) this.instance).getItemsList());
        }

        public boolean hasBase() {
            return ((HotTopic) this.instance).hasBase();
        }

        public C5815b mergeBase(Base base2) {
            copyOnWrite();
            ((HotTopic) this.instance).mergeBase(base2);
            return this;
        }

        public C5815b removeItems(int i) {
            copyOnWrite();
            ((HotTopic) this.instance).removeItems(i);
            return this;
        }

        public C5815b setBase(Base base2) {
            copyOnWrite();
            ((HotTopic) this.instance).setBase(base2);
            return this;
        }

        public C5815b setDesc(String str) {
            copyOnWrite();
            ((HotTopic) this.instance).setDesc(str);
            return this;
        }

        public C5815b setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((HotTopic) this.instance).setDescBytes(byteString);
            return this;
        }

        public C5815b setItems(int i, HotTopicItem hotTopicItem) {
            copyOnWrite();
            ((HotTopic) this.instance).setItems(i, hotTopicItem);
            return this;
        }

        private C5815b() {
            super(HotTopic.DEFAULT_INSTANCE);
        }

        public C5815b addItems(int i, HotTopicItem hotTopicItem) {
            copyOnWrite();
            ((HotTopic) this.instance).addItems(i, hotTopicItem);
            return this;
        }

        public C5815b setBase(Base.C5793b c5793b) {
            copyOnWrite();
            ((HotTopic) this.instance).setBase(c5793b.build());
            return this;
        }

        public C5815b setItems(int i, HotTopicItem.C5817b c5817b) {
            copyOnWrite();
            ((HotTopic) this.instance).setItems(i, c5817b.build());
            return this;
        }

        public C5815b addItems(HotTopicItem.C5817b c5817b) {
            copyOnWrite();
            ((HotTopic) this.instance).addItems(c5817b.build());
            return this;
        }

        public C5815b addItems(int i, HotTopicItem.C5817b c5817b) {
            copyOnWrite();
            ((HotTopic) this.instance).addItems(i, c5817b.build());
            return this;
        }
    }

    static {
        HotTopic hotTopic = new HotTopic();
        DEFAULT_INSTANCE = hotTopic;
        GeneratedMessageLite.registerDefaultInstance(HotTopic.class, hotTopic);
    }

    private HotTopic() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends HotTopicItem> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(HotTopicItem hotTopicItem) {
        hotTopicItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(hotTopicItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.base_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<HotTopicItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static HotTopic getDefaultInstance() {
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

    public static C5815b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HotTopic parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HotTopic) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HotTopic parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HotTopic> parser() {
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
    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i, HotTopicItem hotTopicItem) {
        hotTopicItem.getClass();
        ensureItemsIsMutable();
        this.items_.set(i, hotTopicItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5814a.f15956xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new HotTopic();
            case 2:
                return new C5815b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u0208\u0003\u001b", new Object[]{"base_", "desc_", "items_", HotTopicItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HotTopic> parser = PARSER;
                if (parser == null) {
                    synchronized (HotTopic.class) {
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

    public String getDesc() {
        return this.desc_;
    }

    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    public HotTopicItem getItems(int i) {
        return this.items_.get(i);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<HotTopicItem> getItemsList() {
        return this.items_;
    }

    public InterfaceC5931k getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public List<? extends InterfaceC5931k> getItemsOrBuilderList() {
        return this.items_;
    }

    public boolean hasBase() {
        return this.base_ != null;
    }

    public static C5815b newBuilder(HotTopic hotTopic) {
        return DEFAULT_INSTANCE.createBuilder(hotTopic);
    }

    public static HotTopic parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HotTopic) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HotTopic parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HotTopic parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i, HotTopicItem hotTopicItem) {
        hotTopicItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(i, hotTopicItem);
    }

    public static HotTopic parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HotTopic parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HotTopic parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HotTopic parseFrom(InputStream inputStream) throws IOException {
        return (HotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HotTopic parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HotTopic parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HotTopic parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HotTopic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
