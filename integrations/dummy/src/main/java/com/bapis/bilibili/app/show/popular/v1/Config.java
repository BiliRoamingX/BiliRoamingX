package com.bapis.bilibili.app.show.popular.v1;

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
public final class Config extends GeneratedMessageLite<Config, Config.C8214b> implements InterfaceC8223a {
    public static final int BOTTOM_TEXT_COVER_FIELD_NUMBER = 3;
    public static final int BOTTOM_TEXT_FIELD_NUMBER = 2;
    public static final int BOTTOM_TEXT_URL_FIELD_NUMBER = 4;
    private static final Config DEFAULT_INSTANCE;
    public static final int HEAD_IMAGE_FIELD_NUMBER = 6;
    public static final int HIT_FIELD_NUMBER = 8;
    public static final int ITEM_TITLE_FIELD_NUMBER = 1;
    public static final int PAGE_ITEMS_FIELD_NUMBER = 7;
    private static volatile Parser<Config> PARSER = null;
    public static final int TOAST_FIELD_NUMBER = 9;
    public static final int TOP_ITEMS_FIELD_NUMBER = 5;
    private long hit_;
    private String itemTitle_ = "";
    private String bottomText_ = "";
    private String bottomTextCover_ = "";
    private String bottomTextUrl_ = "";
    private Internal.ProtobufList<EntranceShow> topItems_ = GeneratedMessageLite.emptyProtobufList();
    private String headImage_ = "";
    private Internal.ProtobufList<EntranceShow> pageItems_ = GeneratedMessageLite.emptyProtobufList();
    private String toast_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.show.popular.v1.Config$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8213a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16848xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16848xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16848xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16848xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16848xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16848xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16848xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16848xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.show.popular.v1.Config$b */
    /* loaded from: classes13.dex */
    public static final class C8214b extends GeneratedMessageLite.Builder<Config, C8214b> implements InterfaceC8223a {
        /* synthetic */ C8214b(C8213a c8213a) {
            this();
        }

        public C8214b addAllPageItems(Iterable<? extends EntranceShow> iterable) {
            copyOnWrite();
            ((Config) this.instance).addAllPageItems(iterable);
            return this;
        }

        public C8214b addAllTopItems(Iterable<? extends EntranceShow> iterable) {
            copyOnWrite();
            ((Config) this.instance).addAllTopItems(iterable);
            return this;
        }

        public C8214b addPageItems(EntranceShow entranceShow) {
            copyOnWrite();
            ((Config) this.instance).addPageItems(entranceShow);
            return this;
        }

        public C8214b addTopItems(EntranceShow entranceShow) {
            copyOnWrite();
            ((Config) this.instance).addTopItems(entranceShow);
            return this;
        }

        public C8214b clearBottomText() {
            copyOnWrite();
            ((Config) this.instance).clearBottomText();
            return this;
        }

        public C8214b clearBottomTextCover() {
            copyOnWrite();
            ((Config) this.instance).clearBottomTextCover();
            return this;
        }

        public C8214b clearBottomTextUrl() {
            copyOnWrite();
            ((Config) this.instance).clearBottomTextUrl();
            return this;
        }

        public C8214b clearHeadImage() {
            copyOnWrite();
            ((Config) this.instance).clearHeadImage();
            return this;
        }

        public C8214b clearHit() {
            copyOnWrite();
            ((Config) this.instance).clearHit();
            return this;
        }

        public C8214b clearItemTitle() {
            copyOnWrite();
            ((Config) this.instance).clearItemTitle();
            return this;
        }

        public C8214b clearPageItems() {
            copyOnWrite();
            ((Config) this.instance).clearPageItems();
            return this;
        }

        public C8214b clearToast() {
            copyOnWrite();
            ((Config) this.instance).clearToast();
            return this;
        }

        public C8214b clearTopItems() {
            copyOnWrite();
            ((Config) this.instance).clearTopItems();
            return this;
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public String getBottomText() {
            return ((Config) this.instance).getBottomText();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public ByteString getBottomTextBytes() {
            return ((Config) this.instance).getBottomTextBytes();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public String getBottomTextCover() {
            return ((Config) this.instance).getBottomTextCover();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public ByteString getBottomTextCoverBytes() {
            return ((Config) this.instance).getBottomTextCoverBytes();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public String getBottomTextUrl() {
            return ((Config) this.instance).getBottomTextUrl();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public ByteString getBottomTextUrlBytes() {
            return ((Config) this.instance).getBottomTextUrlBytes();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public String getHeadImage() {
            return ((Config) this.instance).getHeadImage();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public ByteString getHeadImageBytes() {
            return ((Config) this.instance).getHeadImageBytes();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public long getHit() {
            return ((Config) this.instance).getHit();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public String getItemTitle() {
            return ((Config) this.instance).getItemTitle();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public ByteString getItemTitleBytes() {
            return ((Config) this.instance).getItemTitleBytes();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public EntranceShow getPageItems(int i) {
            return ((Config) this.instance).getPageItems(i);
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public int getPageItemsCount() {
            return ((Config) this.instance).getPageItemsCount();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public List<EntranceShow> getPageItemsList() {
            return Collections.unmodifiableList(((Config) this.instance).getPageItemsList());
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public String getToast() {
            return ((Config) this.instance).getToast();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public ByteString getToastBytes() {
            return ((Config) this.instance).getToastBytes();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public EntranceShow getTopItems(int i) {
            return ((Config) this.instance).getTopItems(i);
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public int getTopItemsCount() {
            return ((Config) this.instance).getTopItemsCount();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
        public List<EntranceShow> getTopItemsList() {
            return Collections.unmodifiableList(((Config) this.instance).getTopItemsList());
        }

        public C8214b removePageItems(int i) {
            copyOnWrite();
            ((Config) this.instance).removePageItems(i);
            return this;
        }

        public C8214b removeTopItems(int i) {
            copyOnWrite();
            ((Config) this.instance).removeTopItems(i);
            return this;
        }

        public C8214b setBottomText(String str) {
            copyOnWrite();
            ((Config) this.instance).setBottomText(str);
            return this;
        }

        public C8214b setBottomTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Config) this.instance).setBottomTextBytes(byteString);
            return this;
        }

        public C8214b setBottomTextCover(String str) {
            copyOnWrite();
            ((Config) this.instance).setBottomTextCover(str);
            return this;
        }

        public C8214b setBottomTextCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((Config) this.instance).setBottomTextCoverBytes(byteString);
            return this;
        }

        public C8214b setBottomTextUrl(String str) {
            copyOnWrite();
            ((Config) this.instance).setBottomTextUrl(str);
            return this;
        }

        public C8214b setBottomTextUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Config) this.instance).setBottomTextUrlBytes(byteString);
            return this;
        }

        public C8214b setHeadImage(String str) {
            copyOnWrite();
            ((Config) this.instance).setHeadImage(str);
            return this;
        }

        public C8214b setHeadImageBytes(ByteString byteString) {
            copyOnWrite();
            ((Config) this.instance).setHeadImageBytes(byteString);
            return this;
        }

        public C8214b setHit(long j) {
            copyOnWrite();
            ((Config) this.instance).setHit(j);
            return this;
        }

        public C8214b setItemTitle(String str) {
            copyOnWrite();
            ((Config) this.instance).setItemTitle(str);
            return this;
        }

        public C8214b setItemTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Config) this.instance).setItemTitleBytes(byteString);
            return this;
        }

        public C8214b setPageItems(int i, EntranceShow entranceShow) {
            copyOnWrite();
            ((Config) this.instance).setPageItems(i, entranceShow);
            return this;
        }

        public C8214b setToast(String str) {
            copyOnWrite();
            ((Config) this.instance).setToast(str);
            return this;
        }

        public C8214b setToastBytes(ByteString byteString) {
            copyOnWrite();
            ((Config) this.instance).setToastBytes(byteString);
            return this;
        }

        public C8214b setTopItems(int i, EntranceShow entranceShow) {
            copyOnWrite();
            ((Config) this.instance).setTopItems(i, entranceShow);
            return this;
        }

        private C8214b() {
            super(Config.DEFAULT_INSTANCE);
        }

        public C8214b addPageItems(int i, EntranceShow entranceShow) {
            copyOnWrite();
            ((Config) this.instance).addPageItems(i, entranceShow);
            return this;
        }

        public C8214b addTopItems(int i, EntranceShow entranceShow) {
            copyOnWrite();
            ((Config) this.instance).addTopItems(i, entranceShow);
            return this;
        }

        public C8214b setPageItems(int i, EntranceShow.C8216b c8216b) {
            copyOnWrite();
            ((Config) this.instance).setPageItems(i, c8216b.build());
            return this;
        }

        public C8214b setTopItems(int i, EntranceShow.C8216b c8216b) {
            copyOnWrite();
            ((Config) this.instance).setTopItems(i, c8216b.build());
            return this;
        }

        public C8214b addPageItems(EntranceShow.C8216b c8216b) {
            copyOnWrite();
            ((Config) this.instance).addPageItems(c8216b.build());
            return this;
        }

        public C8214b addTopItems(EntranceShow.C8216b c8216b) {
            copyOnWrite();
            ((Config) this.instance).addTopItems(c8216b.build());
            return this;
        }

        public C8214b addPageItems(int i, EntranceShow.C8216b c8216b) {
            copyOnWrite();
            ((Config) this.instance).addPageItems(i, c8216b.build());
            return this;
        }

        public C8214b addTopItems(int i, EntranceShow.C8216b c8216b) {
            copyOnWrite();
            ((Config) this.instance).addTopItems(i, c8216b.build());
            return this;
        }
    }

    static {
        Config config = new Config();
        DEFAULT_INSTANCE = config;
        GeneratedMessageLite.registerDefaultInstance(Config.class, config);
    }

    private Config() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPageItems(Iterable<? extends EntranceShow> iterable) {
        ensurePageItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.pageItems_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTopItems(Iterable<? extends EntranceShow> iterable) {
        ensureTopItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.topItems_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPageItems(EntranceShow entranceShow) {
        entranceShow.getClass();
        ensurePageItemsIsMutable();
        this.pageItems_.add(entranceShow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTopItems(EntranceShow entranceShow) {
        entranceShow.getClass();
        ensureTopItemsIsMutable();
        this.topItems_.add(entranceShow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomText() {
        this.bottomText_ = getDefaultInstance().getBottomText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomTextCover() {
        this.bottomTextCover_ = getDefaultInstance().getBottomTextCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomTextUrl() {
        this.bottomTextUrl_ = getDefaultInstance().getBottomTextUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeadImage() {
        this.headImage_ = getDefaultInstance().getHeadImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHit() {
        this.hit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemTitle() {
        this.itemTitle_ = getDefaultInstance().getItemTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageItems() {
        this.pageItems_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToast() {
        this.toast_ = getDefaultInstance().getToast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopItems() {
        this.topItems_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePageItemsIsMutable() {
        Internal.ProtobufList<EntranceShow> protobufList = this.pageItems_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.pageItems_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTopItemsIsMutable() {
        Internal.ProtobufList<EntranceShow> protobufList = this.topItems_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.topItems_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Config getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8214b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Config parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Config) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Config parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Config> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePageItems(int i) {
        ensurePageItemsIsMutable();
        this.pageItems_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTopItems(int i) {
        ensureTopItemsIsMutable();
        this.topItems_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomText(String str) {
        str.getClass();
        this.bottomText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bottomText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomTextCover(String str) {
        str.getClass();
        this.bottomTextCover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomTextCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bottomTextCover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomTextUrl(String str) {
        str.getClass();
        this.bottomTextUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomTextUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bottomTextUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadImage(String str) {
        str.getClass();
        this.headImage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadImageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.headImage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHit(long j) {
        this.hit_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemTitle(String str) {
        str.getClass();
        this.itemTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.itemTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageItems(int i, EntranceShow entranceShow) {
        entranceShow.getClass();
        ensurePageItemsIsMutable();
        this.pageItems_.set(i, entranceShow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToast(String str) {
        str.getClass();
        this.toast_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.toast_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopItems(int i, EntranceShow entranceShow) {
        entranceShow.getClass();
        ensureTopItemsIsMutable();
        this.topItems_.set(i, entranceShow);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8213a.f16848xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Config();
            case 2:
                return new C8214b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0002\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u001b\u0006\u0208\u0007\u001b\b\u0002\t\u0208", new Object[]{"itemTitle_", "bottomText_", "bottomTextCover_", "bottomTextUrl_", "topItems_", EntranceShow.class, "headImage_", "pageItems_", EntranceShow.class, "hit_", "toast_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Config> parser = PARSER;
                if (parser == null) {
                    synchronized (Config.class) {
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

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public String getBottomText() {
        return this.bottomText_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public ByteString getBottomTextBytes() {
        return ByteString.copyFromUtf8(this.bottomText_);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public String getBottomTextCover() {
        return this.bottomTextCover_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public ByteString getBottomTextCoverBytes() {
        return ByteString.copyFromUtf8(this.bottomTextCover_);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public String getBottomTextUrl() {
        return this.bottomTextUrl_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public ByteString getBottomTextUrlBytes() {
        return ByteString.copyFromUtf8(this.bottomTextUrl_);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public String getHeadImage() {
        return this.headImage_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public ByteString getHeadImageBytes() {
        return ByteString.copyFromUtf8(this.headImage_);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public long getHit() {
        return this.hit_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public String getItemTitle() {
        return this.itemTitle_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public ByteString getItemTitleBytes() {
        return ByteString.copyFromUtf8(this.itemTitle_);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public EntranceShow getPageItems(int i) {
        return this.pageItems_.get(i);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public int getPageItemsCount() {
        return this.pageItems_.size();
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public List<EntranceShow> getPageItemsList() {
        return this.pageItems_;
    }

    public InterfaceC8224b getPageItemsOrBuilder(int i) {
        return this.pageItems_.get(i);
    }

    public List<? extends InterfaceC8224b> getPageItemsOrBuilderList() {
        return this.pageItems_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public String getToast() {
        return this.toast_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public ByteString getToastBytes() {
        return ByteString.copyFromUtf8(this.toast_);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public EntranceShow getTopItems(int i) {
        return this.topItems_.get(i);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public int getTopItemsCount() {
        return this.topItems_.size();
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8223a
    public List<EntranceShow> getTopItemsList() {
        return this.topItems_;
    }

    public InterfaceC8224b getTopItemsOrBuilder(int i) {
        return this.topItems_.get(i);
    }

    public List<? extends InterfaceC8224b> getTopItemsOrBuilderList() {
        return this.topItems_;
    }

    public static C8214b newBuilder(Config config) {
        return DEFAULT_INSTANCE.createBuilder(config);
    }

    public static Config parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Config) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Config parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Config parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPageItems(int i, EntranceShow entranceShow) {
        entranceShow.getClass();
        ensurePageItemsIsMutable();
        this.pageItems_.add(i, entranceShow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTopItems(int i, EntranceShow entranceShow) {
        entranceShow.getClass();
        ensureTopItemsIsMutable();
        this.topItems_.add(i, entranceShow);
    }

    public static Config parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Config parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Config parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Config parseFrom(InputStream inputStream) throws IOException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Config parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Config parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Config parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
