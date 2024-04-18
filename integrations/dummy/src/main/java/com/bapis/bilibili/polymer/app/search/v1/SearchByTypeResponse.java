package com.bapis.bilibili.polymer.app.search.v1;

import com.bapis.bilibili.pagination.PaginationReply;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes15.dex */
public final class SearchByTypeResponse extends GeneratedMessageLite<SearchByTypeResponse, SearchByTypeResponse.Builder> implements MessageLiteOrBuilder {
    public static final int ANNOTATION_FIELD_NUMBER = 8;
    private static final SearchByTypeResponse DEFAULT_INSTANCE;
    public static final int EXP_STR_FIELD_NUMBER = 3;
    public static final int ITEMS_FIELD_NUMBER = 6;
    public static final int KEYWORD_FIELD_NUMBER = 4;
    public static final int PAGES_FIELD_NUMBER = 2;
    public static final int PAGINATION_FIELD_NUMBER = 7;
    private static volatile Parser<SearchByTypeResponse> PARSER = null;
    public static final int RESULT_IS_RECOMMEND_FIELD_NUMBER = 5;
    public static final int TRACKID_FIELD_NUMBER = 1;
    private int pages_;
    private PaginationReply pagination_;
    private int resultIsRecommend_;
    private MapFieldLite<String, String> annotation_ = MapFieldLite.emptyMapField();
    private String trackid_ = "";
    private String expStr_ = "";
    private String keyword_ = "";
    private Internal.ProtobufList<Item> items_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.SearchByTypeResponse$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C80091 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17711xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17711xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17711xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17711xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17711xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17711xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17711xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17711xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    private static final class AnnotationDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private AnnotationDefaultEntryHolder() {
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SearchByTypeResponse, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C80091 c80091) {
            this();
        }

        public Builder addAllItems(Iterable<? extends Item> iterable) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).addAllItems(iterable);
            return this;
        }

        public Builder addItems(Item item) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).addItems(item);
            return this;
        }

        public Builder clearAnnotation() {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).getMutableAnnotationMap().clear();
            return this;
        }

        public Builder clearExpStr() {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).clearExpStr();
            return this;
        }

        public Builder clearItems() {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).clearItems();
            return this;
        }

        public Builder clearKeyword() {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).clearKeyword();
            return this;
        }

        public Builder clearPages() {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).clearPages();
            return this;
        }

        public Builder clearPagination() {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).clearPagination();
            return this;
        }

        public Builder clearResultIsRecommend() {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).clearResultIsRecommend();
            return this;
        }

        public Builder clearTrackid() {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).clearTrackid();
            return this;
        }

        public boolean containsAnnotation(String str) {
            str.getClass();
            return ((SearchByTypeResponse) this.instance).getAnnotationMap().containsKey(str);
        }

        @Deprecated
        public Map<String, String> getAnnotation() {
            return getAnnotationMap();
        }

        public int getAnnotationCount() {
            return ((SearchByTypeResponse) this.instance).getAnnotationMap().size();
        }

        public Map<String, String> getAnnotationMap() {
            return Collections.unmodifiableMap(((SearchByTypeResponse) this.instance).getAnnotationMap());
        }

        public String getAnnotationOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> annotationMap = ((SearchByTypeResponse) this.instance).getAnnotationMap();
            return annotationMap.containsKey(str) ? annotationMap.get(str) : str2;
        }

        public String getAnnotationOrThrow(String str) {
            str.getClass();
            Map<String, String> annotationMap = ((SearchByTypeResponse) this.instance).getAnnotationMap();
            if (annotationMap.containsKey(str)) {
                return annotationMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getExpStr() {
            return ((SearchByTypeResponse) this.instance).getExpStr();
        }

        public ByteString getExpStrBytes() {
            return ((SearchByTypeResponse) this.instance).getExpStrBytes();
        }

        public Item getItems(int i) {
            return ((SearchByTypeResponse) this.instance).getItems(i);
        }

        public int getItemsCount() {
            return ((SearchByTypeResponse) this.instance).getItemsCount();
        }

        public List<Item> getItemsList() {
            return Collections.unmodifiableList(((SearchByTypeResponse) this.instance).getItemsList());
        }

        public String getKeyword() {
            return ((SearchByTypeResponse) this.instance).getKeyword();
        }

        public ByteString getKeywordBytes() {
            return ((SearchByTypeResponse) this.instance).getKeywordBytes();
        }

        public int getPages() {
            return ((SearchByTypeResponse) this.instance).getPages();
        }

        public PaginationReply getPagination() {
            return ((SearchByTypeResponse) this.instance).getPagination();
        }

        public int getResultIsRecommend() {
            return ((SearchByTypeResponse) this.instance).getResultIsRecommend();
        }

        public String getTrackid() {
            return ((SearchByTypeResponse) this.instance).getTrackid();
        }

        public ByteString getTrackidBytes() {
            return ((SearchByTypeResponse) this.instance).getTrackidBytes();
        }

        public boolean hasPagination() {
            return ((SearchByTypeResponse) this.instance).hasPagination();
        }

        public Builder mergePagination(PaginationReply paginationReply) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).mergePagination(paginationReply);
            return this;
        }

        public Builder putAllAnnotation(Map<String, String> map) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).getMutableAnnotationMap().putAll(map);
            return this;
        }

        public Builder putAnnotation(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).getMutableAnnotationMap().put(str, str2);
            return this;
        }

        public Builder removeAnnotation(String str) {
            str.getClass();
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).getMutableAnnotationMap().remove(str);
            return this;
        }

        public Builder removeItems(int i) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).removeItems(i);
            return this;
        }

        public Builder setExpStr(String str) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).setExpStr(str);
            return this;
        }

        public Builder setExpStrBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).setExpStrBytes(byteString);
            return this;
        }

        public Builder setItems(int i, Item item) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).setItems(i, item);
            return this;
        }

        public Builder setKeyword(String str) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).setKeyword(str);
            return this;
        }

        public Builder setKeywordBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).setKeywordBytes(byteString);
            return this;
        }

        public Builder setPages(int i) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).setPages(i);
            return this;
        }

        public Builder setPagination(PaginationReply paginationReply) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).setPagination(paginationReply);
            return this;
        }

        public Builder setResultIsRecommend(int i) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).setResultIsRecommend(i);
            return this;
        }

        public Builder setTrackid(String str) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).setTrackid(str);
            return this;
        }

        public Builder setTrackidBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).setTrackidBytes(byteString);
            return this;
        }

        private Builder() {
            super(SearchByTypeResponse.DEFAULT_INSTANCE);
        }

        public Builder addItems(int i, Item item) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).addItems(i, item);
            return this;
        }

        public Builder setItems(int i, Item.Builder builder) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).setItems(i, builder.build());
            return this;
        }

        public Builder setPagination(PaginationReply.Builder builder) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).setPagination(builder.build());
            return this;
        }

        public Builder addItems(Item.Builder builder) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).addItems(builder.build());
            return this;
        }

        public Builder addItems(int i, Item.Builder builder) {
            copyOnWrite();
            ((SearchByTypeResponse) this.instance).addItems(i, builder.build());
            return this;
        }
    }

    static {
        SearchByTypeResponse searchByTypeResponse = new SearchByTypeResponse();
        DEFAULT_INSTANCE = searchByTypeResponse;
        GeneratedMessageLite.registerDefaultInstance(SearchByTypeResponse.class, searchByTypeResponse);
    }

    public SearchByTypeResponse() {
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
    public void clearExpStr() {
        this.expStr_ = getDefaultInstance().getExpStr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyword() {
        this.keyword_ = getDefaultInstance().getKeyword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPages() {
        this.pages_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPagination() {
        this.pagination_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultIsRecommend() {
        this.resultIsRecommend_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackid() {
        this.trackid_ = getDefaultInstance().getTrackid();
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<Item> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static SearchByTypeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableAnnotationMap() {
        return internalGetMutableAnnotation();
    }

    private MapFieldLite<String, String> internalGetAnnotation() {
        return this.annotation_;
    }

    private MapFieldLite<String, String> internalGetMutableAnnotation() {
        if (!this.annotation_.isMutable()) {
            this.annotation_ = this.annotation_.mutableCopy();
        }
        return this.annotation_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePagination(PaginationReply paginationReply) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SearchByTypeResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SearchByTypeResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchByTypeResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SearchByTypeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SearchByTypeResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i) {
        ensureItemsIsMutable();
        this.items_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpStr(String str) {
        str.getClass();
        this.expStr_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpStrBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.expStr_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i, Item item) {
        item.getClass();
        ensureItemsIsMutable();
        this.items_.set(i, item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyword(String str) {
        str.getClass();
        this.keyword_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeywordBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.keyword_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPages(int i) {
        this.pages_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPagination(PaginationReply paginationReply) {
        paginationReply.getClass();
        this.pagination_ = paginationReply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultIsRecommend(int i) {
        this.resultIsRecommend_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackid(String str) {
        str.getClass();
        this.trackid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackid_ = byteString.toStringUtf8();
    }

    public boolean containsAnnotation(String str) {
        str.getClass();
        return internalGetAnnotation().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C80091.f17711xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SearchByTypeResponse();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0001\u0001\u0000\u0001\u0208\u0002\u0004\u0003\u0208\u0004\u0208\u0005\u0004\u0006\u001b\u0007\t\b2", new Object[]{"trackid_", "pages_", "expStr_", "keyword_", "resultIsRecommend_", "items_", Item.class, "pagination_", "annotation_", AnnotationDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SearchByTypeResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (SearchByTypeResponse.class) {
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

    @Deprecated
    public Map<String, String> getAnnotation() {
        return getAnnotationMap();
    }

    public int getAnnotationCount() {
        return internalGetAnnotation().size();
    }

    public Map<String, String> getAnnotationMap() {
        return Collections.unmodifiableMap(internalGetAnnotation());
    }

    public String getAnnotationOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetAnnotation = internalGetAnnotation();
        return internalGetAnnotation.containsKey(str) ? internalGetAnnotation.get(str) : str2;
    }

    public String getAnnotationOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetAnnotation = internalGetAnnotation();
        if (internalGetAnnotation.containsKey(str)) {
            return internalGetAnnotation.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getExpStr() {
        return this.expStr_;
    }

    public ByteString getExpStrBytes() {
        return ByteString.copyFromUtf8(this.expStr_);
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

    public ItemOrBuilder getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public List<? extends ItemOrBuilder> getItemsOrBuilderList() {
        return this.items_;
    }

    public String getKeyword() {
        return this.keyword_;
    }

    public ByteString getKeywordBytes() {
        return ByteString.copyFromUtf8(this.keyword_);
    }

    public int getPages() {
        return this.pages_;
    }

    public PaginationReply getPagination() {
        PaginationReply paginationReply = this.pagination_;
        return paginationReply == null ? PaginationReply.getDefaultInstance() : paginationReply;
    }

    public int getResultIsRecommend() {
        return this.resultIsRecommend_;
    }

    public String getTrackid() {
        return this.trackid_;
    }

    public ByteString getTrackidBytes() {
        return ByteString.copyFromUtf8(this.trackid_);
    }

    public boolean hasPagination() {
        return this.pagination_ != null;
    }

    public static Builder newBuilder(SearchByTypeResponse searchByTypeResponse) {
        return DEFAULT_INSTANCE.createBuilder(searchByTypeResponse);
    }

    public static SearchByTypeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchByTypeResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchByTypeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchByTypeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SearchByTypeResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SearchByTypeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i, Item item) {
        item.getClass();
        ensureItemsIsMutable();
        this.items_.add(i, item);
    }

    public static SearchByTypeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchByTypeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SearchByTypeResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SearchByTypeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SearchByTypeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchByTypeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SearchByTypeResponse parseFrom(InputStream inputStream) throws IOException {
        return (SearchByTypeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchByTypeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchByTypeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchByTypeResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SearchByTypeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SearchByTypeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchByTypeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
