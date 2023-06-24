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
public final class SearchAllResponse extends GeneratedMessageLite<SearchAllResponse, SearchAllResponse.Builder> implements MessageLiteOrBuilder {
    public static final int ANNOTATION_FIELD_NUMBER = 13;
    public static final int APP_DISPLAY_OPTION_FIELD_NUMBER = 12;
    private static final SearchAllResponse DEFAULT_INSTANCE;
    public static final int EASTER_EGG_FIELD_NUMBER = 5;
    public static final int EXP_STR_FIELD_NUMBER = 6;
    public static final int EXTRA_WORD_LIST_FIELD_NUMBER = 7;
    public static final int ITEM_FIELD_NUMBER = 4;
    public static final int KEYWORD_FIELD_NUMBER = 1;
    public static final int NAV_FIELD_NUMBER = 3;
    public static final int NEW_SEARCH_EXP_NUM_FIELD_NUMBER = 10;
    public static final int ORG_EXTRA_WORD_FIELD_NUMBER = 8;
    public static final int PAGINATION_FIELD_NUMBER = 11;
    private static volatile Parser<SearchAllResponse> PARSER = null;
    public static final int SELECT_BAR_TYPE_FIELD_NUMBER = 9;
    public static final int TRACKID_FIELD_NUMBER = 2;
    private DisplayOption appDisplayOption_;
    private EasterEgg easterEgg_;
    private long newSearchExpNum_;
    private PaginationReply pagination_;
    private long selectBarType_;
    private MapFieldLite<String, String> annotation_ = MapFieldLite.emptyMapField();
    private String keyword_ = "";
    private String trackid_ = "";
    private Internal.ProtobufList<Nav> nav_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Item> item_ = GeneratedMessageLite.emptyProtobufList();
    private String expStr_ = "";
    private Internal.ProtobufList<String> extraWordList_ = GeneratedMessageLite.emptyProtobufList();
    private String orgExtraWord_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.SearchAllResponse$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C80031 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17705xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17705xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17705xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17705xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17705xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17705xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17705xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17705xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
    public static final class Builder extends GeneratedMessageLite.Builder<SearchAllResponse, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C80031 c80031) {
            this();
        }

        public Builder addAllExtraWordList(Iterable<String> iterable) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addAllExtraWordList(iterable);
            return this;
        }

        public Builder addAllItem(Iterable<? extends Item> iterable) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addAllItem(iterable);
            return this;
        }

        public Builder addAllNav(Iterable<? extends Nav> iterable) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addAllNav(iterable);
            return this;
        }

        public Builder addExtraWordList(String str) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addExtraWordList(str);
            return this;
        }

        public Builder addExtraWordListBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addExtraWordListBytes(byteString);
            return this;
        }

        public Builder addItem(Item item) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addItem(item);
            return this;
        }

        public Builder addNav(Nav nav) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addNav(nav);
            return this;
        }

        public Builder clearAnnotation() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).getMutableAnnotationMap().clear();
            return this;
        }

        public Builder clearAppDisplayOption() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).clearAppDisplayOption();
            return this;
        }

        public Builder clearEasterEgg() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).clearEasterEgg();
            return this;
        }

        public Builder clearExpStr() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).clearExpStr();
            return this;
        }

        public Builder clearExtraWordList() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).clearExtraWordList();
            return this;
        }

        public Builder clearItem() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).clearItem();
            return this;
        }

        public Builder clearKeyword() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).clearKeyword();
            return this;
        }

        public Builder clearNav() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).clearNav();
            return this;
        }

        public Builder clearNewSearchExpNum() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).clearNewSearchExpNum();
            return this;
        }

        public Builder clearOrgExtraWord() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).clearOrgExtraWord();
            return this;
        }

        public Builder clearPagination() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).clearPagination();
            return this;
        }

        public Builder clearSelectBarType() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).clearSelectBarType();
            return this;
        }

        public Builder clearTrackid() {
            copyOnWrite();
            ((SearchAllResponse) this.instance).clearTrackid();
            return this;
        }

        public boolean containsAnnotation(String str) {
            str.getClass();
            return ((SearchAllResponse) this.instance).getAnnotationMap().containsKey(str);
        }

        @Deprecated
        public Map<String, String> getAnnotation() {
            return getAnnotationMap();
        }

        public int getAnnotationCount() {
            return ((SearchAllResponse) this.instance).getAnnotationMap().size();
        }

        public Map<String, String> getAnnotationMap() {
            return Collections.unmodifiableMap(((SearchAllResponse) this.instance).getAnnotationMap());
        }

        public String getAnnotationOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> annotationMap = ((SearchAllResponse) this.instance).getAnnotationMap();
            return annotationMap.containsKey(str) ? annotationMap.get(str) : str2;
        }

        public String getAnnotationOrThrow(String str) {
            str.getClass();
            Map<String, String> annotationMap = ((SearchAllResponse) this.instance).getAnnotationMap();
            if (annotationMap.containsKey(str)) {
                return annotationMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public DisplayOption getAppDisplayOption() {
            return ((SearchAllResponse) this.instance).getAppDisplayOption();
        }

        public EasterEgg getEasterEgg() {
            return ((SearchAllResponse) this.instance).getEasterEgg();
        }

        public String getExpStr() {
            return ((SearchAllResponse) this.instance).getExpStr();
        }

        public ByteString getExpStrBytes() {
            return ((SearchAllResponse) this.instance).getExpStrBytes();
        }

        public String getExtraWordList(int i) {
            return ((SearchAllResponse) this.instance).getExtraWordList(i);
        }

        public ByteString getExtraWordListBytes(int i) {
            return ((SearchAllResponse) this.instance).getExtraWordListBytes(i);
        }

        public int getExtraWordListCount() {
            return ((SearchAllResponse) this.instance).getExtraWordListCount();
        }

        public List<String> getExtraWordListList() {
            return Collections.unmodifiableList(((SearchAllResponse) this.instance).getExtraWordListList());
        }

        public Item getItem(int i) {
            return ((SearchAllResponse) this.instance).getItem(i);
        }

        public int getItemCount() {
            return ((SearchAllResponse) this.instance).getItemCount();
        }

        public List<Item> getItemList() {
            return Collections.unmodifiableList(((SearchAllResponse) this.instance).getItemList());
        }

        public String getKeyword() {
            return ((SearchAllResponse) this.instance).getKeyword();
        }

        public ByteString getKeywordBytes() {
            return ((SearchAllResponse) this.instance).getKeywordBytes();
        }

        public Nav getNav(int i) {
            return ((SearchAllResponse) this.instance).getNav(i);
        }

        public int getNavCount() {
            return ((SearchAllResponse) this.instance).getNavCount();
        }

        public List<Nav> getNavList() {
            return Collections.unmodifiableList(((SearchAllResponse) this.instance).getNavList());
        }

        public long getNewSearchExpNum() {
            return ((SearchAllResponse) this.instance).getNewSearchExpNum();
        }

        public String getOrgExtraWord() {
            return ((SearchAllResponse) this.instance).getOrgExtraWord();
        }

        public ByteString getOrgExtraWordBytes() {
            return ((SearchAllResponse) this.instance).getOrgExtraWordBytes();
        }

        public PaginationReply getPagination() {
            return ((SearchAllResponse) this.instance).getPagination();
        }

        public long getSelectBarType() {
            return ((SearchAllResponse) this.instance).getSelectBarType();
        }

        public String getTrackid() {
            return ((SearchAllResponse) this.instance).getTrackid();
        }

        public ByteString getTrackidBytes() {
            return ((SearchAllResponse) this.instance).getTrackidBytes();
        }

        public boolean hasAppDisplayOption() {
            return ((SearchAllResponse) this.instance).hasAppDisplayOption();
        }

        public boolean hasEasterEgg() {
            return ((SearchAllResponse) this.instance).hasEasterEgg();
        }

        public boolean hasPagination() {
            return ((SearchAllResponse) this.instance).hasPagination();
        }

        public Builder mergeAppDisplayOption(DisplayOption displayOption) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).mergeAppDisplayOption(displayOption);
            return this;
        }

        public Builder mergeEasterEgg(EasterEgg easterEgg) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).mergeEasterEgg(easterEgg);
            return this;
        }

        public Builder mergePagination(PaginationReply paginationReply) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).mergePagination(paginationReply);
            return this;
        }

        public Builder putAllAnnotation(Map<String, String> map) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).getMutableAnnotationMap().putAll(map);
            return this;
        }

        public Builder putAnnotation(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((SearchAllResponse) this.instance).getMutableAnnotationMap().put(str, str2);
            return this;
        }

        public Builder removeAnnotation(String str) {
            str.getClass();
            copyOnWrite();
            ((SearchAllResponse) this.instance).getMutableAnnotationMap().remove(str);
            return this;
        }

        public Builder removeItem(int i) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).removeItem(i);
            return this;
        }

        public Builder removeNav(int i) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).removeNav(i);
            return this;
        }

        public Builder setAppDisplayOption(DisplayOption displayOption) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setAppDisplayOption(displayOption);
            return this;
        }

        public Builder setEasterEgg(EasterEgg easterEgg) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setEasterEgg(easterEgg);
            return this;
        }

        public Builder setExpStr(String str) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setExpStr(str);
            return this;
        }

        public Builder setExpStrBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setExpStrBytes(byteString);
            return this;
        }

        public Builder setExtraWordList(int i, String str) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setExtraWordList(i, str);
            return this;
        }

        public Builder setItem(int i, Item item) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setItem(i, item);
            return this;
        }

        public Builder setKeyword(String str) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setKeyword(str);
            return this;
        }

        public Builder setKeywordBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setKeywordBytes(byteString);
            return this;
        }

        public Builder setNav(int i, Nav nav) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setNav(i, nav);
            return this;
        }

        public Builder setNewSearchExpNum(long j) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setNewSearchExpNum(j);
            return this;
        }

        public Builder setOrgExtraWord(String str) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setOrgExtraWord(str);
            return this;
        }

        public Builder setOrgExtraWordBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setOrgExtraWordBytes(byteString);
            return this;
        }

        public Builder setPagination(PaginationReply paginationReply) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setPagination(paginationReply);
            return this;
        }

        public Builder setSelectBarType(long j) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setSelectBarType(j);
            return this;
        }

        public Builder setTrackid(String str) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setTrackid(str);
            return this;
        }

        public Builder setTrackidBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setTrackidBytes(byteString);
            return this;
        }

        private Builder() {
            super(SearchAllResponse.DEFAULT_INSTANCE);
        }

        public Builder addItem(int i, Item item) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addItem(i, item);
            return this;
        }

        public Builder addNav(int i, Nav nav) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addNav(i, nav);
            return this;
        }

        public Builder setAppDisplayOption(DisplayOption.Builder builder) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setAppDisplayOption(builder.build());
            return this;
        }

        public Builder setEasterEgg(EasterEgg.Builder builder) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setEasterEgg(builder.build());
            return this;
        }

        public Builder setItem(int i, Item.Builder builder) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setItem(i, builder.build());
            return this;
        }

        public Builder setNav(int i, Nav.Builder builder) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setNav(i, builder.build());
            return this;
        }

        public Builder setPagination(PaginationReply.Builder builder) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).setPagination(builder.build());
            return this;
        }

        public Builder addItem(Item.Builder builder) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addItem(builder.build());
            return this;
        }

        public Builder addNav(Nav.Builder builder) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addNav(builder.build());
            return this;
        }

        public Builder addItem(int i, Item.Builder builder) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addItem(i, builder.build());
            return this;
        }

        public Builder addNav(int i, Nav.Builder builder) {
            copyOnWrite();
            ((SearchAllResponse) this.instance).addNav(i, builder.build());
            return this;
        }
    }

    static {
        SearchAllResponse searchAllResponse = new SearchAllResponse();
        DEFAULT_INSTANCE = searchAllResponse;
        GeneratedMessageLite.registerDefaultInstance(SearchAllResponse.class, searchAllResponse);
    }

    private SearchAllResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtraWordList(Iterable<String> iterable) {
        ensureExtraWordListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.extraWordList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItem(Iterable<? extends Item> iterable) {
        ensureItemIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.item_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNav(Iterable<? extends Nav> iterable) {
        ensureNavIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.nav_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtraWordList(String str) {
        str.getClass();
        ensureExtraWordListIsMutable();
        this.extraWordList_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtraWordListBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureExtraWordListIsMutable();
        this.extraWordList_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItem(Item item) {
        item.getClass();
        ensureItemIsMutable();
        this.item_.add(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNav(Nav nav) {
        nav.getClass();
        ensureNavIsMutable();
        this.nav_.add(nav);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppDisplayOption() {
        this.appDisplayOption_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEasterEgg() {
        this.easterEgg_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpStr() {
        this.expStr_ = getDefaultInstance().getExpStr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtraWordList() {
        this.extraWordList_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItem() {
        this.item_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyword() {
        this.keyword_ = getDefaultInstance().getKeyword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNav() {
        this.nav_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewSearchExpNum() {
        this.newSearchExpNum_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrgExtraWord() {
        this.orgExtraWord_ = getDefaultInstance().getOrgExtraWord();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPagination() {
        this.pagination_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectBarType() {
        this.selectBarType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackid() {
        this.trackid_ = getDefaultInstance().getTrackid();
    }

    private void ensureExtraWordListIsMutable() {
        Internal.ProtobufList<String> protobufList = this.extraWordList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.extraWordList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureItemIsMutable() {
        Internal.ProtobufList<Item> protobufList = this.item_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.item_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureNavIsMutable() {
        Internal.ProtobufList<Nav> protobufList = this.nav_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.nav_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static SearchAllResponse getDefaultInstance() {
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
    public void mergeAppDisplayOption(DisplayOption displayOption) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEasterEgg(EasterEgg easterEgg) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePagination(PaginationReply paginationReply) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SearchAllResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SearchAllResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchAllResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SearchAllResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SearchAllResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItem(int i) {
        ensureItemIsMutable();
        this.item_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNav(int i) {
        ensureNavIsMutable();
        this.nav_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppDisplayOption(DisplayOption displayOption) {
        displayOption.getClass();
        this.appDisplayOption_ = displayOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEasterEgg(EasterEgg easterEgg) {
        easterEgg.getClass();
        this.easterEgg_ = easterEgg;
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
    public void setExtraWordList(int i, String str) {
        str.getClass();
        ensureExtraWordListIsMutable();
        this.extraWordList_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItem(int i, Item item) {
        item.getClass();
        ensureItemIsMutable();
        this.item_.set(i, item);
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
    public void setNav(int i, Nav nav) {
        nav.getClass();
        ensureNavIsMutable();
        this.nav_.set(i, nav);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewSearchExpNum(long j) {
        this.newSearchExpNum_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrgExtraWord(String str) {
        str.getClass();
        this.orgExtraWord_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrgExtraWordBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.orgExtraWord_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPagination(PaginationReply paginationReply) {
        paginationReply.getClass();
        this.pagination_ = paginationReply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectBarType(long j) {
        this.selectBarType_ = j;
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
        switch (C80031.f17705xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SearchAllResponse();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0001\u0003\u0000\u0001\u0208\u0002\u0208\u0003\u001b\u0004\u001b\u0005\t\u0006\u0208\u0007\u021a\b\u0208\t\u0002\n\u0002\u000b\t\f\t\r2", new Object[]{"keyword_", "trackid_", "nav_", Nav.class, "item_", Item.class, "easterEgg_", "expStr_", "extraWordList_", "orgExtraWord_", "selectBarType_", "newSearchExpNum_", "pagination_", "appDisplayOption_", "annotation_", AnnotationDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SearchAllResponse> parser = PARSER;
                if (parser == null) {
                    synchronized (SearchAllResponse.class) {
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

    public DisplayOption getAppDisplayOption() {
        DisplayOption displayOption = this.appDisplayOption_;
        return displayOption == null ? DisplayOption.getDefaultInstance() : displayOption;
    }

    public EasterEgg getEasterEgg() {
        EasterEgg easterEgg = this.easterEgg_;
        return easterEgg == null ? EasterEgg.getDefaultInstance() : easterEgg;
    }

    public String getExpStr() {
        return this.expStr_;
    }

    public ByteString getExpStrBytes() {
        return ByteString.copyFromUtf8(this.expStr_);
    }

    public String getExtraWordList(int i) {
        return this.extraWordList_.get(i);
    }

    public ByteString getExtraWordListBytes(int i) {
        return ByteString.copyFromUtf8(this.extraWordList_.get(i));
    }

    public int getExtraWordListCount() {
        return this.extraWordList_.size();
    }

    public List<String> getExtraWordListList() {
        return this.extraWordList_;
    }

    public Item getItem(int i) {
        return this.item_.get(i);
    }

    public int getItemCount() {
        return this.item_.size();
    }

    public List<Item> getItemList() {
        return this.item_;
    }

    public ItemOrBuilder getItemOrBuilder(int i) {
        return this.item_.get(i);
    }

    public List<? extends ItemOrBuilder> getItemOrBuilderList() {
        return this.item_;
    }

    public String getKeyword() {
        return this.keyword_;
    }

    public ByteString getKeywordBytes() {
        return ByteString.copyFromUtf8(this.keyword_);
    }

    public Nav getNav(int i) {
        return this.nav_.get(i);
    }

    public int getNavCount() {
        return this.nav_.size();
    }

    public List<Nav> getNavList() {
        return this.nav_;
    }

    public NavOrBuilder getNavOrBuilder(int i) {
        return this.nav_.get(i);
    }

    public List<? extends NavOrBuilder> getNavOrBuilderList() {
        return this.nav_;
    }

    public long getNewSearchExpNum() {
        return this.newSearchExpNum_;
    }

    public String getOrgExtraWord() {
        return this.orgExtraWord_;
    }

    public ByteString getOrgExtraWordBytes() {
        return ByteString.copyFromUtf8(this.orgExtraWord_);
    }

    public PaginationReply getPagination() {
        PaginationReply paginationReply = this.pagination_;
        return paginationReply == null ? PaginationReply.getDefaultInstance() : paginationReply;
    }

    public long getSelectBarType() {
        return this.selectBarType_;
    }

    public String getTrackid() {
        return this.trackid_;
    }

    public ByteString getTrackidBytes() {
        return ByteString.copyFromUtf8(this.trackid_);
    }

    public boolean hasAppDisplayOption() {
        return this.appDisplayOption_ != null;
    }

    public boolean hasEasterEgg() {
        return this.easterEgg_ != null;
    }

    public boolean hasPagination() {
        return this.pagination_ != null;
    }

    public static Builder newBuilder(SearchAllResponse searchAllResponse) {
        return DEFAULT_INSTANCE.createBuilder(searchAllResponse);
    }

    public static SearchAllResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchAllResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchAllResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchAllResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SearchAllResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SearchAllResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItem(int i, Item item) {
        item.getClass();
        ensureItemIsMutable();
        this.item_.add(i, item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNav(int i, Nav nav) {
        nav.getClass();
        ensureNavIsMutable();
        this.nav_.add(i, nav);
    }

    public static SearchAllResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchAllResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SearchAllResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SearchAllResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SearchAllResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchAllResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SearchAllResponse parseFrom(InputStream inputStream) throws IOException {
        return (SearchAllResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchAllResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchAllResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchAllResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SearchAllResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SearchAllResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchAllResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * addNav
     */
    static void access$900(SearchAllResponse response, int index, Nav nav) {
    }

    /**
     * removeItem
     */
    static void access$1800(SearchAllResponse response, int index) {
    }
}
