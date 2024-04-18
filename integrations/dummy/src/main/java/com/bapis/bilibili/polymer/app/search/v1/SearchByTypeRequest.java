package com.bapis.bilibili.polymer.app.search.v1;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
import com.bapis.bilibili.pagination.Pagination;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes15.dex */
public final class SearchByTypeRequest extends GeneratedMessageLite<SearchByTypeRequest, SearchByTypeRequest.Builder> implements MessageLiteOrBuilder {
    public static final int CATEGORY_ID_FIELD_NUMBER = 4;
    public static final int CATEGORY_SORT_FIELD_NUMBER = 3;
    private static final SearchByTypeRequest DEFAULT_INSTANCE;
    public static final int KEYWORD_FIELD_NUMBER = 2;
    public static final int PAGINATION_FIELD_NUMBER = 7;
    private static volatile Parser<SearchByTypeRequest> PARSER = null;
    public static final int PLAYER_ARGS_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int USER_SORT_FIELD_NUMBER = 6;
    public static final int USER_TYPE_FIELD_NUMBER = 5;
    private long categoryId_;
    private int categorySort_;
    private String keyword_ = "";
    private Pagination pagination_;
    private com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs playerArgs_;
    private int type_;
    private int userSort_;
    private int userType_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.SearchByTypeRequest$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C80081 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17710xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17710xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17710xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17710xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17710xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17710xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17710xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17710xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SearchByTypeRequest, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C80081 c80081) {
            this();
        }

        public Builder clearCategoryId() {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).clearCategoryId();
            return this;
        }

        public Builder clearCategorySort() {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).clearCategorySort();
            return this;
        }

        public Builder clearKeyword() {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).clearKeyword();
            return this;
        }

        public Builder clearPagination() {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).clearPagination();
            return this;
        }

        public Builder clearPlayerArgs() {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).clearPlayerArgs();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).clearType();
            return this;
        }

        public Builder clearUserSort() {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).clearUserSort();
            return this;
        }

        public Builder clearUserType() {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).clearUserType();
            return this;
        }

        public long getCategoryId() {
            return ((SearchByTypeRequest) this.instance).getCategoryId();
        }

        public CategorySort getCategorySort() {
            return ((SearchByTypeRequest) this.instance).getCategorySort();
        }

        public int getCategorySortValue() {
            return ((SearchByTypeRequest) this.instance).getCategorySortValue();
        }

        public String getKeyword() {
            return ((SearchByTypeRequest) this.instance).getKeyword();
        }

        public ByteString getKeywordBytes() {
            return ((SearchByTypeRequest) this.instance).getKeywordBytes();
        }

        public Pagination getPagination() {
            return ((SearchByTypeRequest) this.instance).getPagination();
        }

        public com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs() {
            return ((SearchByTypeRequest) this.instance).getPlayerArgs();
        }

        public int getType() {
            return ((SearchByTypeRequest) this.instance).getType();
        }

        public UserSort getUserSort() {
            return ((SearchByTypeRequest) this.instance).getUserSort();
        }

        public int getUserSortValue() {
            return ((SearchByTypeRequest) this.instance).getUserSortValue();
        }

        public UserType getUserType() {
            return ((SearchByTypeRequest) this.instance).getUserType();
        }

        public int getUserTypeValue() {
            return ((SearchByTypeRequest) this.instance).getUserTypeValue();
        }

        public boolean hasPagination() {
            return ((SearchByTypeRequest) this.instance).hasPagination();
        }

        public boolean hasPlayerArgs() {
            return ((SearchByTypeRequest) this.instance).hasPlayerArgs();
        }

        public Builder mergePagination(Pagination pagination) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).mergePagination(pagination);
            return this;
        }

        public Builder mergePlayerArgs(com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs playerArgs) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).mergePlayerArgs(playerArgs);
            return this;
        }

        public Builder setCategoryId(long j) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setCategoryId(j);
            return this;
        }

        public Builder setCategorySort(CategorySort categorySort) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setCategorySort(categorySort);
            return this;
        }

        public Builder setCategorySortValue(int i) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setCategorySortValue(i);
            return this;
        }

        public Builder setKeyword(String str) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setKeyword(str);
            return this;
        }

        public Builder setKeywordBytes(ByteString byteString) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setKeywordBytes(byteString);
            return this;
        }

        public Builder setPagination(Pagination pagination) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setPagination(pagination);
            return this;
        }

        public Builder setPlayerArgs(com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs playerArgs) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setPlayerArgs(playerArgs);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setType(i);
            return this;
        }

        public Builder setUserSort(UserSort userSort) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setUserSort(userSort);
            return this;
        }

        public Builder setUserSortValue(int i) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setUserSortValue(i);
            return this;
        }

        public Builder setUserType(UserType userType) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setUserType(userType);
            return this;
        }

        public Builder setUserTypeValue(int i) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setUserTypeValue(i);
            return this;
        }

        private Builder() {
            super(SearchByTypeRequest.DEFAULT_INSTANCE);
        }

        public Builder setPagination(Pagination.Builder builder) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setPagination(builder.build());
            return this;
        }

        public Builder setPlayerArgs(PlayerArgs.Builder builder) {
            copyOnWrite();
            ((SearchByTypeRequest) this.instance).setPlayerArgs(builder.build());
            return this;
        }
    }

    static {
        SearchByTypeRequest searchByTypeRequest = new SearchByTypeRequest();
        DEFAULT_INSTANCE = searchByTypeRequest;
        GeneratedMessageLite.registerDefaultInstance(SearchByTypeRequest.class, searchByTypeRequest);
    }

    private SearchByTypeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryId() {
        this.categoryId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategorySort() {
        this.categorySort_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyword() {
        this.keyword_ = getDefaultInstance().getKeyword();
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
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserSort() {
        this.userSort_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserType() {
        this.userType_ = 0;
    }

    public static SearchByTypeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public static SearchByTypeRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SearchByTypeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchByTypeRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SearchByTypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SearchByTypeRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryId(long j) {
        this.categoryId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategorySort(CategorySort categorySort) {
        this.categorySort_ = categorySort.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategorySortValue(int i) {
        this.categorySort_ = i;
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
    public void setType(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSort(UserSort userSort) {
        this.userSort_ = userSort.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSortValue(int i) {
        this.userSort_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserType(UserType userType) {
        this.userType_ = userType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserTypeValue(int i) {
        this.userType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C80081.f17710xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SearchByTypeRequest();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\f\u0004\u0002\u0005\f\u0006\f\u0007\t\b\t", new Object[]{"type_", "keyword_", "categorySort_", "categoryId_", "userType_", "userSort_", "pagination_", "playerArgs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SearchByTypeRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (SearchByTypeRequest.class) {
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

    public long getCategoryId() {
        return this.categoryId_;
    }

    public CategorySort getCategorySort() {
        CategorySort forNumber = CategorySort.forNumber(this.categorySort_);
        return forNumber == null ? CategorySort.UNRECOGNIZED : forNumber;
    }

    public int getCategorySortValue() {
        return this.categorySort_;
    }

    public String getKeyword() {
        return this.keyword_;
    }

    public ByteString getKeywordBytes() {
        return ByteString.copyFromUtf8(this.keyword_);
    }

    public Pagination getPagination() {
        Pagination pagination = this.pagination_;
        return pagination == null ? Pagination.getDefaultInstance() : pagination;
    }

    public com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs getPlayerArgs() {
        com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs playerArgs = this.playerArgs_;
        return playerArgs == null ? com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs.getDefaultInstance() : playerArgs;
    }

    public int getType() {
        return this.type_;
    }

    public UserSort getUserSort() {
        UserSort forNumber = UserSort.forNumber(this.userSort_);
        return forNumber == null ? UserSort.UNRECOGNIZED : forNumber;
    }

    public int getUserSortValue() {
        return this.userSort_;
    }

    public UserType getUserType() {
        UserType forNumber = UserType.forNumber(this.userType_);
        return forNumber == null ? UserType.UNRECOGNIZED : forNumber;
    }

    public int getUserTypeValue() {
        return this.userType_;
    }

    public boolean hasPagination() {
        return this.pagination_ != null;
    }

    public boolean hasPlayerArgs() {
        return this.playerArgs_ != null;
    }

    public static Builder newBuilder(SearchByTypeRequest searchByTypeRequest) {
        return DEFAULT_INSTANCE.createBuilder(searchByTypeRequest);
    }

    public static SearchByTypeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchByTypeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchByTypeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchByTypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SearchByTypeRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SearchByTypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SearchByTypeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchByTypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SearchByTypeRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SearchByTypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SearchByTypeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchByTypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SearchByTypeRequest parseFrom(InputStream inputStream) throws IOException {
        return (SearchByTypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchByTypeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchByTypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchByTypeRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SearchByTypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SearchByTypeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchByTypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
