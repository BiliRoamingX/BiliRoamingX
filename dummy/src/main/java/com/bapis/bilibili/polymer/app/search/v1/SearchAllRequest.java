package com.bapis.bilibili.polymer.app.search.v1;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
import com.bapis.bilibili.pagination.Pagination;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
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
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes15.dex */
public final class SearchAllRequest extends GeneratedMessageLite<SearchAllRequest, SearchAllRequest.Builder> implements MessageLiteOrBuilder {
    public static final int AD_EXTRA_FIELD_NUMBER = 9;
    private static final SearchAllRequest DEFAULT_INSTANCE;
    public static final int DURATION_LIST_FIELD_NUMBER = 4;
    public static final int EXTRA_WORD_FIELD_NUMBER = 5;
    public static final int FROM_EXTRA_FIELD_NUMBER = 12;
    public static final int FROM_SOURCE_FIELD_NUMBER = 6;
    public static final int IS_ORG_QUERY_FIELD_NUMBER = 7;
    public static final int KEYWORD_FIELD_NUMBER = 1;
    public static final int LOCAL_TIME_FIELD_NUMBER = 8;
    public static final int ORDER_FIELD_NUMBER = 2;
    public static final int PAGINATION_FIELD_NUMBER = 10;
    private static volatile Parser<SearchAllRequest> PARSER = null;
    public static final int PLAYER_ARGS_FIELD_NUMBER = 11;
    public static final int TID_LIST_FIELD_NUMBER = 3;
    private int isOrgQuery_;
    private int localTime_;
    private int order_;
    private Pagination pagination_;
    private com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
    private MapFieldLite<String, String> fromExtra_ = MapFieldLite.emptyMapField();
    private String keyword_ = "";
    private String tidList_ = "";
    private String durationList_ = "";
    private String extraWord_ = "";
    private String fromSource_ = "";
    private String adExtra_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.SearchAllRequest$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C80021 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17704xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17704xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17704xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17704xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17704xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17704xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17704xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17704xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SearchAllRequest, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C80021 c80021) {
            this();
        }

        public Builder clearAdExtra() {
            copyOnWrite();
            ((SearchAllRequest) this.instance).clearAdExtra();
            return this;
        }

        public Builder clearDurationList() {
            copyOnWrite();
            ((SearchAllRequest) this.instance).clearDurationList();
            return this;
        }

        public Builder clearExtraWord() {
            copyOnWrite();
            ((SearchAllRequest) this.instance).clearExtraWord();
            return this;
        }

        public Builder clearFromExtra() {
            copyOnWrite();
            ((SearchAllRequest) this.instance).getMutableFromExtraMap().clear();
            return this;
        }

        public Builder clearFromSource() {
            copyOnWrite();
            ((SearchAllRequest) this.instance).clearFromSource();
            return this;
        }

        public Builder clearIsOrgQuery() {
            copyOnWrite();
            ((SearchAllRequest) this.instance).clearIsOrgQuery();
            return this;
        }

        public Builder clearKeyword() {
            copyOnWrite();
            ((SearchAllRequest) this.instance).clearKeyword();
            return this;
        }

        public Builder clearLocalTime() {
            copyOnWrite();
            ((SearchAllRequest) this.instance).clearLocalTime();
            return this;
        }

        public Builder clearOrder() {
            copyOnWrite();
            ((SearchAllRequest) this.instance).clearOrder();
            return this;
        }

        public Builder clearPagination() {
            copyOnWrite();
            ((SearchAllRequest) this.instance).clearPagination();
            return this;
        }

        public Builder clearPlayerArgs() {
            copyOnWrite();
            ((SearchAllRequest) this.instance).clearPlayerArgs();
            return this;
        }

        public Builder clearTidList() {
            copyOnWrite();
            ((SearchAllRequest) this.instance).clearTidList();
            return this;
        }

        public boolean containsFromExtra(String str) {
            str.getClass();
            return ((SearchAllRequest) this.instance).getFromExtraMap().containsKey(str);
        }

        public String getAdExtra() {
            return ((SearchAllRequest) this.instance).getAdExtra();
        }

        public ByteString getAdExtraBytes() {
            return ((SearchAllRequest) this.instance).getAdExtraBytes();
        }

        public String getDurationList() {
            return ((SearchAllRequest) this.instance).getDurationList();
        }

        public ByteString getDurationListBytes() {
            return ((SearchAllRequest) this.instance).getDurationListBytes();
        }

        public String getExtraWord() {
            return ((SearchAllRequest) this.instance).getExtraWord();
        }

        public ByteString getExtraWordBytes() {
            return ((SearchAllRequest) this.instance).getExtraWordBytes();
        }

        @Deprecated
        public Map<String, String> getFromExtra() {
            return getFromExtraMap();
        }

        public int getFromExtraCount() {
            return ((SearchAllRequest) this.instance).getFromExtraMap().size();
        }

        public Map<String, String> getFromExtraMap() {
            return Collections.unmodifiableMap(((SearchAllRequest) this.instance).getFromExtraMap());
        }

        public String getFromExtraOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> fromExtraMap = ((SearchAllRequest) this.instance).getFromExtraMap();
            return fromExtraMap.containsKey(str) ? fromExtraMap.get(str) : str2;
        }

        public String getFromExtraOrThrow(String str) {
            str.getClass();
            Map<String, String> fromExtraMap = ((SearchAllRequest) this.instance).getFromExtraMap();
            if (fromExtraMap.containsKey(str)) {
                return fromExtraMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getFromSource() {
            return ((SearchAllRequest) this.instance).getFromSource();
        }

        public ByteString getFromSourceBytes() {
            return ((SearchAllRequest) this.instance).getFromSourceBytes();
        }

        public int getIsOrgQuery() {
            return ((SearchAllRequest) this.instance).getIsOrgQuery();
        }

        public String getKeyword() {
            return ((SearchAllRequest) this.instance).getKeyword();
        }

        public ByteString getKeywordBytes() {
            return ((SearchAllRequest) this.instance).getKeywordBytes();
        }

        public int getLocalTime() {
            return ((SearchAllRequest) this.instance).getLocalTime();
        }

        public Sort getOrder() {
            return ((SearchAllRequest) this.instance).getOrder();
        }

        public int getOrderValue() {
            return ((SearchAllRequest) this.instance).getOrderValue();
        }

        public Pagination getPagination() {
            return ((SearchAllRequest) this.instance).getPagination();
        }

        public com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs() {
            return ((SearchAllRequest) this.instance).getPlayerArgs();
        }

        public String getTidList() {
            return ((SearchAllRequest) this.instance).getTidList();
        }

        public ByteString getTidListBytes() {
            return ((SearchAllRequest) this.instance).getTidListBytes();
        }

        public boolean hasPagination() {
            return ((SearchAllRequest) this.instance).hasPagination();
        }

        public boolean hasPlayerArgs() {
            return ((SearchAllRequest) this.instance).hasPlayerArgs();
        }

        public Builder mergePagination(Pagination pagination) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).mergePagination(pagination);
            return this;
        }

        public Builder mergePlayerArgs(com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs playerArgs) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).mergePlayerArgs(playerArgs);
            return this;
        }

        public Builder putAllFromExtra(Map<String, String> map) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).getMutableFromExtraMap().putAll(map);
            return this;
        }

        public Builder putFromExtra(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((SearchAllRequest) this.instance).getMutableFromExtraMap().put(str, str2);
            return this;
        }

        public Builder removeFromExtra(String str) {
            str.getClass();
            copyOnWrite();
            ((SearchAllRequest) this.instance).getMutableFromExtraMap().remove(str);
            return this;
        }

        public Builder setAdExtra(String str) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setAdExtra(str);
            return this;
        }

        public Builder setAdExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setAdExtraBytes(byteString);
            return this;
        }

        public Builder setDurationList(String str) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setDurationList(str);
            return this;
        }

        public Builder setDurationListBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setDurationListBytes(byteString);
            return this;
        }

        public Builder setExtraWord(String str) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setExtraWord(str);
            return this;
        }

        public Builder setExtraWordBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setExtraWordBytes(byteString);
            return this;
        }

        public Builder setFromSource(String str) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setFromSource(str);
            return this;
        }

        public Builder setFromSourceBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setFromSourceBytes(byteString);
            return this;
        }

        public Builder setIsOrgQuery(int i) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setIsOrgQuery(i);
            return this;
        }

        public Builder setKeyword(String str) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setKeyword(str);
            return this;
        }

        public Builder setKeywordBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setKeywordBytes(byteString);
            return this;
        }

        public Builder setLocalTime(int i) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setLocalTime(i);
            return this;
        }

        public Builder setOrder(Sort sort) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setOrder(sort);
            return this;
        }

        public Builder setOrderValue(int i) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setOrderValue(i);
            return this;
        }

        public Builder setPagination(Pagination pagination) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setPagination(pagination);
            return this;
        }

        public Builder setPlayerArgs(com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs playerArgs) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setPlayerArgs(playerArgs);
            return this;
        }

        public Builder setTidList(String str) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setTidList(str);
            return this;
        }

        public Builder setTidListBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setTidListBytes(byteString);
            return this;
        }

        private Builder() {
            super(SearchAllRequest.DEFAULT_INSTANCE);
        }

        public Builder setPagination(Pagination.Builder builder) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setPagination(builder.build());
            return this;
        }

        public Builder setPlayerArgs(PlayerArgs.Builder builder) {
            copyOnWrite();
            ((SearchAllRequest) this.instance).setPlayerArgs(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    private static final class FromExtraDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private FromExtraDefaultEntryHolder() {
        }
    }

    static {
        SearchAllRequest searchAllRequest = new SearchAllRequest();
        DEFAULT_INSTANCE = searchAllRequest;
        GeneratedMessageLite.registerDefaultInstance(SearchAllRequest.class, searchAllRequest);
    }

    private SearchAllRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdExtra() {
        this.adExtra_ = getDefaultInstance().getAdExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationList() {
        this.durationList_ = getDefaultInstance().getDurationList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtraWord() {
        this.extraWord_ = getDefaultInstance().getExtraWord();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSource() {
        this.fromSource_ = getDefaultInstance().getFromSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsOrgQuery() {
        this.isOrgQuery_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyword() {
        this.keyword_ = getDefaultInstance().getKeyword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalTime() {
        this.localTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrder() {
        this.order_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPagination() {
        this.pagination_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerArgs() {
        this.playerArgs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTidList() {
        this.tidList_ = getDefaultInstance().getTidList();
    }

    public static SearchAllRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableFromExtraMap() {
        return internalGetMutableFromExtra();
    }

    private MapFieldLite<String, String> internalGetFromExtra() {
        return this.fromExtra_;
    }

    private MapFieldLite<String, String> internalGetMutableFromExtra() {
        if (!this.fromExtra_.isMutable()) {
            this.fromExtra_ = this.fromExtra_.mutableCopy();
        }
        return this.fromExtra_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePagination(Pagination pagination) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerArgs(com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs playerArgs) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SearchAllRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SearchAllRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchAllRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SearchAllRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SearchAllRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdExtra(String str) {
        str.getClass();
        this.adExtra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adExtra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationList(String str) {
        str.getClass();
        this.durationList_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationListBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.durationList_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraWord(String str) {
        str.getClass();
        this.extraWord_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraWordBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraWord_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSource(String str) {
        str.getClass();
        this.fromSource_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSourceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromSource_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOrgQuery(int i) {
        this.isOrgQuery_ = i;
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
    public void setLocalTime(int i) {
        this.localTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrder(Sort sort) {
        this.order_ = sort.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderValue(int i) {
        this.order_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPagination(Pagination pagination) {
        pagination.getClass();
        this.pagination_ = pagination;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerArgs(com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs playerArgs) {
        playerArgs.getClass();
        this.playerArgs_ = playerArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTidList(String str) {
        str.getClass();
        this.tidList_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTidListBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tidList_ = byteString.toStringUtf8();
    }

    public boolean containsFromExtra(String str) {
        str.getClass();
        return internalGetFromExtra().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C80021.f17704xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SearchAllRequest();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0001\u0000\u0000\u0001\u0208\u0002\f\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0004\b\u0004\t\u0208\n\t\u000b\t\f2", new Object[]{"keyword_", "order_", "tidList_", "durationList_", "extraWord_", "fromSource_", "isOrgQuery_", "localTime_", "adExtra_", "pagination_", "playerArgs_", "fromExtra_", FromExtraDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SearchAllRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (SearchAllRequest.class) {
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

    public String getAdExtra() {
        return this.adExtra_;
    }

    public ByteString getAdExtraBytes() {
        return ByteString.copyFromUtf8(this.adExtra_);
    }

    public String getDurationList() {
        return this.durationList_;
    }

    public ByteString getDurationListBytes() {
        return ByteString.copyFromUtf8(this.durationList_);
    }

    public String getExtraWord() {
        return this.extraWord_;
    }

    public ByteString getExtraWordBytes() {
        return ByteString.copyFromUtf8(this.extraWord_);
    }

    @Deprecated
    public Map<String, String> getFromExtra() {
        return getFromExtraMap();
    }

    public int getFromExtraCount() {
        return internalGetFromExtra().size();
    }

    public Map<String, String> getFromExtraMap() {
        return Collections.unmodifiableMap(internalGetFromExtra());
    }

    public String getFromExtraOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetFromExtra = internalGetFromExtra();
        return internalGetFromExtra.containsKey(str) ? internalGetFromExtra.get(str) : str2;
    }

    public String getFromExtraOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetFromExtra = internalGetFromExtra();
        if (internalGetFromExtra.containsKey(str)) {
            return internalGetFromExtra.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getFromSource() {
        return this.fromSource_;
    }

    public ByteString getFromSourceBytes() {
        return ByteString.copyFromUtf8(this.fromSource_);
    }

    public int getIsOrgQuery() {
        return this.isOrgQuery_;
    }

    public String getKeyword() {
        return this.keyword_;
    }

    public ByteString getKeywordBytes() {
        return ByteString.copyFromUtf8(this.keyword_);
    }

    public int getLocalTime() {
        return this.localTime_;
    }

    public Sort getOrder() {
        Sort forNumber = Sort.forNumber(this.order_);
        return forNumber == null ? Sort.UNRECOGNIZED : forNumber;
    }

    public int getOrderValue() {
        return this.order_;
    }

    public Pagination getPagination() {
        Pagination pagination = this.pagination_;
        return pagination == null ? Pagination.getDefaultInstance() : pagination;
    }

    public com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs() {
        com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs playerArgs = this.playerArgs_;
        return playerArgs == null ? com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs;
    }

    public String getTidList() {
        return this.tidList_;
    }

    public ByteString getTidListBytes() {
        return ByteString.copyFromUtf8(this.tidList_);
    }

    public boolean hasPagination() {
        return this.pagination_ != null;
    }

    public boolean hasPlayerArgs() {
        return this.playerArgs_ != null;
    }

    public static Builder newBuilder(SearchAllRequest searchAllRequest) {
        return DEFAULT_INSTANCE.createBuilder(searchAllRequest);
    }

    public static SearchAllRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchAllRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchAllRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchAllRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SearchAllRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SearchAllRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SearchAllRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchAllRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SearchAllRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SearchAllRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SearchAllRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchAllRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SearchAllRequest parseFrom(InputStream inputStream) throws IOException {
        return (SearchAllRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchAllRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchAllRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchAllRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SearchAllRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SearchAllRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchAllRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
