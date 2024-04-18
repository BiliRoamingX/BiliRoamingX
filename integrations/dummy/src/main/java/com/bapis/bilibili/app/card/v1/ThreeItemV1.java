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
public final class ThreeItemV1 extends GeneratedMessageLite<ThreeItemV1, ThreeItemV1.C5882b> implements MessageLiteOrBuilder {
    public static final int BASE_FIELD_NUMBER = 1;
    private static final ThreeItemV1 DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 5;
    public static final int MORE_TEXT_FIELD_NUMBER = 4;
    public static final int MORE_URI_FIELD_NUMBER = 3;
    private static volatile Parser<ThreeItemV1> PARSER = null;
    public static final int TITLE_ICON_FIELD_NUMBER = 2;
    private Base base_;
    private int titleIcon_;
    private String moreUri_ = "";
    private String moreText_ = "";
    private Internal.ProtobufList<ThreeItemV1Item> items_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreeItemV1$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5881a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15989xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15989xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15989xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreeItemV1$b */
    /* loaded from: classes13.dex */
    public static final class C5882b extends GeneratedMessageLite.Builder<ThreeItemV1, C5882b> implements MessageLiteOrBuilder {
        /* synthetic */ C5882b(C5881a c5881a) {
            this();
        }

        public C5882b addAllItems(Iterable<? extends ThreeItemV1Item> iterable) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).addAllItems(iterable);
            return this;
        }

        public C5882b addItems(ThreeItemV1Item threeItemV1Item) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).addItems(threeItemV1Item);
            return this;
        }

        public C5882b clearBase() {
            copyOnWrite();
            ((ThreeItemV1) this.instance).clearBase();
            return this;
        }

        public C5882b clearItems() {
            copyOnWrite();
            ((ThreeItemV1) this.instance).clearItems();
            return this;
        }

        public C5882b clearMoreText() {
            copyOnWrite();
            ((ThreeItemV1) this.instance).clearMoreText();
            return this;
        }

        public C5882b clearMoreUri() {
            copyOnWrite();
            ((ThreeItemV1) this.instance).clearMoreUri();
            return this;
        }

        public C5882b clearTitleIcon() {
            copyOnWrite();
            ((ThreeItemV1) this.instance).clearTitleIcon();
            return this;
        }

        public Base getBase() {
            return ((ThreeItemV1) this.instance).getBase();
        }

        public ThreeItemV1Item getItems(int i) {
            return ((ThreeItemV1) this.instance).getItems(i);
        }

        public int getItemsCount() {
            return ((ThreeItemV1) this.instance).getItemsCount();
        }

        public List<ThreeItemV1Item> getItemsList() {
            return Collections.unmodifiableList(((ThreeItemV1) this.instance).getItemsList());
        }

        public String getMoreText() {
            return ((ThreeItemV1) this.instance).getMoreText();
        }

        public ByteString getMoreTextBytes() {
            return ((ThreeItemV1) this.instance).getMoreTextBytes();
        }

        public String getMoreUri() {
            return ((ThreeItemV1) this.instance).getMoreUri();
        }

        public ByteString getMoreUriBytes() {
            return ((ThreeItemV1) this.instance).getMoreUriBytes();
        }

        public int getTitleIcon() {
            return ((ThreeItemV1) this.instance).getTitleIcon();
        }

        public boolean hasBase() {
            return ((ThreeItemV1) this.instance).hasBase();
        }

        public C5882b mergeBase(Base base2) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).mergeBase(base2);
            return this;
        }

        public C5882b removeItems(int i) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).removeItems(i);
            return this;
        }

        public C5882b setBase(Base base2) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).setBase(base2);
            return this;
        }

        public C5882b setItems(int i, ThreeItemV1Item threeItemV1Item) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).setItems(i, threeItemV1Item);
            return this;
        }

        public C5882b setMoreText(String str) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).setMoreText(str);
            return this;
        }

        public C5882b setMoreTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).setMoreTextBytes(byteString);
            return this;
        }

        public C5882b setMoreUri(String str) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).setMoreUri(str);
            return this;
        }

        public C5882b setMoreUriBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).setMoreUriBytes(byteString);
            return this;
        }

        public C5882b setTitleIcon(int i) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).setTitleIcon(i);
            return this;
        }

        private C5882b() {
            super(ThreeItemV1.DEFAULT_INSTANCE);
        }

        public C5882b addItems(int i, ThreeItemV1Item threeItemV1Item) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).addItems(i, threeItemV1Item);
            return this;
        }

        public C5882b setBase(Base.C5793b c5793b) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).setBase(c5793b.build());
            return this;
        }

        public C5882b setItems(int i, ThreeItemV1Item.C5884b c5884b) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).setItems(i, c5884b.build());
            return this;
        }

        public C5882b addItems(ThreeItemV1Item.C5884b c5884b) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).addItems(c5884b.build());
            return this;
        }

        public C5882b addItems(int i, ThreeItemV1Item.C5884b c5884b) {
            copyOnWrite();
            ((ThreeItemV1) this.instance).addItems(i, c5884b.build());
            return this;
        }
    }

    static {
        ThreeItemV1 threeItemV1 = new ThreeItemV1();
        DEFAULT_INSTANCE = threeItemV1;
        GeneratedMessageLite.registerDefaultInstance(ThreeItemV1.class, threeItemV1);
    }

    private ThreeItemV1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends ThreeItemV1Item> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(ThreeItemV1Item threeItemV1Item) {
        threeItemV1Item.getClass();
        ensureItemsIsMutable();
        this.items_.add(threeItemV1Item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.base_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoreText() {
        this.moreText_ = getDefaultInstance().getMoreText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoreUri() {
        this.moreUri_ = getDefaultInstance().getMoreUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitleIcon() {
        this.titleIcon_ = 0;
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<ThreeItemV1Item> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ThreeItemV1 getDefaultInstance() {
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

    public static C5882b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ThreeItemV1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ThreeItemV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreeItemV1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ThreeItemV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ThreeItemV1> parser() {
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
    public void setItems(int i, ThreeItemV1Item threeItemV1Item) {
        threeItemV1Item.getClass();
        ensureItemsIsMutable();
        this.items_.set(i, threeItemV1Item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreText(String str) {
        str.getClass();
        this.moreText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.moreText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreUri(String str) {
        str.getClass();
        this.moreUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.moreUri_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleIcon(int i) {
        this.titleIcon_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5881a.f15989xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ThreeItemV1();
            case 2:
                return new C5882b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\u0004\u0003\u0208\u0004\u0208\u0005\u001b", new Object[]{"base_", "titleIcon_", "moreUri_", "moreText_", "items_", ThreeItemV1Item.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ThreeItemV1> parser = PARSER;
                if (parser == null) {
                    synchronized (ThreeItemV1.class) {
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

    public ThreeItemV1Item getItems(int i) {
        return this.items_.get(i);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<ThreeItemV1Item> getItemsList() {
        return this.items_;
    }

    public InterfaceC5941u getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public List<? extends InterfaceC5941u> getItemsOrBuilderList() {
        return this.items_;
    }

    public String getMoreText() {
        return this.moreText_;
    }

    public ByteString getMoreTextBytes() {
        return ByteString.copyFromUtf8(this.moreText_);
    }

    public String getMoreUri() {
        return this.moreUri_;
    }

    public ByteString getMoreUriBytes() {
        return ByteString.copyFromUtf8(this.moreUri_);
    }

    public int getTitleIcon() {
        return this.titleIcon_;
    }

    public boolean hasBase() {
        return this.base_ != null;
    }

    public static C5882b newBuilder(ThreeItemV1 threeItemV1) {
        return DEFAULT_INSTANCE.createBuilder(threeItemV1);
    }

    public static ThreeItemV1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreeItemV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreeItemV1 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreeItemV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ThreeItemV1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ThreeItemV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i, ThreeItemV1Item threeItemV1Item) {
        threeItemV1Item.getClass();
        ensureItemsIsMutable();
        this.items_.add(i, threeItemV1Item);
    }

    public static ThreeItemV1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreeItemV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ThreeItemV1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ThreeItemV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ThreeItemV1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreeItemV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ThreeItemV1 parseFrom(InputStream inputStream) throws IOException {
        return (ThreeItemV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreeItemV1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreeItemV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreeItemV1 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ThreeItemV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ThreeItemV1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreeItemV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
