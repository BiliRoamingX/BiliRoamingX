package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes19.dex */
public final class MdlDynDraw extends GeneratedMessageLite<MdlDynDraw, MdlDynDraw.C5682b> implements g9 {
    private static final MdlDynDraw DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 3;
    public static final int IS_ARTICLE_COVER_FIELD_NUMBER = 6;
    public static final int IS_BIG_COVER_FIELD_NUMBER = 5;
    public static final int IS_DRAW_FIRST_FIELD_NUMBER = 4;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile Parser<MdlDynDraw> PARSER = null;
    public static final int URI_FIELD_NUMBER = 2;
    private long id_;
    private boolean isArticleCover_;
    private boolean isBigCover_;
    private boolean isDrawFirst_;
    private Internal.ProtobufList<MdlDynDrawItem> items_ = GeneratedMessageLite.emptyProtobufList();
    private String uri_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.MdlDynDraw$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5681a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17350xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17350xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17350xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17350xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17350xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17350xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17350xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17350xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.MdlDynDraw$b */
    /* loaded from: classes19.dex */
    public static final class C5682b extends GeneratedMessageLite.Builder<MdlDynDraw, C5682b> implements g9 {
        /* synthetic */ C5682b(C5681a c5681a) {
            this();
        }

        public C5682b addAllItems(Iterable<? extends MdlDynDrawItem> iterable) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).addAllItems(iterable);
            return this;
        }

        public C5682b addItems(MdlDynDrawItem mdlDynDrawItem) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).addItems(mdlDynDrawItem);
            return this;
        }

        public C5682b clearId() {
            copyOnWrite();
            ((MdlDynDraw) this.instance).clearId();
            return this;
        }

        public C5682b clearIsArticleCover() {
            copyOnWrite();
            ((MdlDynDraw) this.instance).clearIsArticleCover();
            return this;
        }

        public C5682b clearIsBigCover() {
            copyOnWrite();
            ((MdlDynDraw) this.instance).clearIsBigCover();
            return this;
        }

        public C5682b clearIsDrawFirst() {
            copyOnWrite();
            ((MdlDynDraw) this.instance).clearIsDrawFirst();
            return this;
        }

        public C5682b clearItems() {
            copyOnWrite();
            ((MdlDynDraw) this.instance).clearItems();
            return this;
        }

        public C5682b clearUri() {
            copyOnWrite();
            ((MdlDynDraw) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.g9
        public long getId() {
            return ((MdlDynDraw) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.g9
        public boolean getIsArticleCover() {
            return ((MdlDynDraw) this.instance).getIsArticleCover();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.g9
        public boolean getIsBigCover() {
            return ((MdlDynDraw) this.instance).getIsBigCover();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.g9
        public boolean getIsDrawFirst() {
            return ((MdlDynDraw) this.instance).getIsDrawFirst();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.g9
        public MdlDynDrawItem getItems(int i2) {
            return ((MdlDynDraw) this.instance).getItems(i2);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.g9
        public int getItemsCount() {
            return ((MdlDynDraw) this.instance).getItemsCount();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.g9
        public List<MdlDynDrawItem> getItemsList() {
            return Collections.unmodifiableList(((MdlDynDraw) this.instance).getItemsList());
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.g9
        public String getUri() {
            return ((MdlDynDraw) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.g9
        public ByteString getUriBytes() {
            return ((MdlDynDraw) this.instance).getUriBytes();
        }

        public C5682b removeItems(int i2) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).removeItems(i2);
            return this;
        }

        public C5682b setId(long j2) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).setId(j2);
            return this;
        }

        public C5682b setIsArticleCover(boolean z) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).setIsArticleCover(z);
            return this;
        }

        public C5682b setIsBigCover(boolean z) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).setIsBigCover(z);
            return this;
        }

        public C5682b setIsDrawFirst(boolean z) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).setIsDrawFirst(z);
            return this;
        }

        public C5682b setItems(int i2, MdlDynDrawItem mdlDynDrawItem) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).setItems(i2, mdlDynDrawItem);
            return this;
        }

        public C5682b setUri(String str) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).setUri(str);
            return this;
        }

        public C5682b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).setUriBytes(byteString);
            return this;
        }

        private C5682b() {
            super(MdlDynDraw.DEFAULT_INSTANCE);
        }

        public C5682b addItems(int i2, MdlDynDrawItem mdlDynDrawItem) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).addItems(i2, mdlDynDrawItem);
            return this;
        }

        public C5682b setItems(int i2, MdlDynDrawItem.C5684b c5684b) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).setItems(i2, c5684b.build());
            return this;
        }

        public C5682b addItems(MdlDynDrawItem.C5684b c5684b) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).addItems(c5684b.build());
            return this;
        }

        public C5682b addItems(int i2, MdlDynDrawItem.C5684b c5684b) {
            copyOnWrite();
            ((MdlDynDraw) this.instance).addItems(i2, c5684b.build());
            return this;
        }
    }

    static {
        MdlDynDraw mdlDynDraw = new MdlDynDraw();
        DEFAULT_INSTANCE = mdlDynDraw;
        GeneratedMessageLite.registerDefaultInstance(MdlDynDraw.class, mdlDynDraw);
    }

    private MdlDynDraw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends MdlDynDrawItem> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(MdlDynDrawItem mdlDynDrawItem) {
        mdlDynDrawItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(mdlDynDrawItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsArticleCover() {
        this.isArticleCover_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBigCover() {
        this.isBigCover_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsDrawFirst() {
        this.isDrawFirst_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<MdlDynDrawItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MdlDynDraw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5682b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MdlDynDraw parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MdlDynDraw) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MdlDynDraw parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MdlDynDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MdlDynDraw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i2) {
        ensureItemsIsMutable();
        this.items_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsArticleCover(boolean z) {
        this.isArticleCover_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBigCover(boolean z) {
        this.isBigCover_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDrawFirst(boolean z) {
        this.isDrawFirst_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i2, MdlDynDrawItem mdlDynDrawItem) {
        mdlDynDrawItem.getClass();
        ensureItemsIsMutable();
        this.items_.set(i2, mdlDynDrawItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5681a c5681a = null;
        switch (C5681a.f17350xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MdlDynDraw();
            case 2:
                return new C5682b(c5681a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002\u0208\u0003\u0002\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"items_", MdlDynDrawItem.class, "uri_", "id_", "isDrawFirst_", "isBigCover_", "isArticleCover_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MdlDynDraw> parser = PARSER;
                if (parser == null) {
                    synchronized (MdlDynDraw.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.g9
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.g9
    public boolean getIsArticleCover() {
        return this.isArticleCover_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.g9
    public boolean getIsBigCover() {
        return this.isBigCover_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.g9
    public boolean getIsDrawFirst() {
        return this.isDrawFirst_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.g9
    public MdlDynDrawItem getItems(int i2) {
        return this.items_.get(i2);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.g9
    public int getItemsCount() {
        return this.items_.size();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.g9
    public List<MdlDynDrawItem> getItemsList() {
        return this.items_;
    }

    public f9 getItemsOrBuilder(int i2) {
        return this.items_.get(i2);
    }

    public List<? extends f9> getItemsOrBuilderList() {
        return this.items_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.g9
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.g9
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static C5682b newBuilder(MdlDynDraw mdlDynDraw) {
        return DEFAULT_INSTANCE.createBuilder(mdlDynDraw);
    }

    public static MdlDynDraw parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MdlDynDraw) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MdlDynDraw parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MdlDynDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MdlDynDraw parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MdlDynDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i2, MdlDynDrawItem mdlDynDrawItem) {
        mdlDynDrawItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(i2, mdlDynDrawItem);
    }

    public static MdlDynDraw parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MdlDynDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MdlDynDraw parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MdlDynDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MdlDynDraw parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MdlDynDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MdlDynDraw parseFrom(InputStream inputStream) throws IOException {
        return (MdlDynDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MdlDynDraw parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MdlDynDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MdlDynDraw parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MdlDynDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MdlDynDraw parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MdlDynDraw) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
