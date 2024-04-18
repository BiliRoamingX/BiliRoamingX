package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class CardBasicInfo extends GeneratedMessageLite<CardBasicInfo, CardBasicInfo.Builder> implements MessageLiteOrBuilder {
    public static final int AUTHOR_FIELD_NUMBER = 11;
    public static final int COVER_FIELD_NUMBER = 3;
    public static final int COVER_GIF_FIELD_NUMBER = 10;
    private static final CardBasicInfo DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 2;
    public static final int FROM_FIELD_NUMBER = 13;
    public static final int FROM_SOURCE_ID_FIELD_NUMBER = 8;
    public static final int FROM_SOURCE_TYPE_FIELD_NUMBER = 7;
    public static final int FROM_SPMID_SUFFIX_FIELD_NUMBER = 14;
    public static final int ID_FIELD_NUMBER = 12;
    public static final int MATERIAL_ID_FIELD_NUMBER = 9;
    private static volatile Parser<CardBasicInfo> PARSER = null;
    public static final int REPORT_FLOW_DATA_FIELD_NUMBER = 15;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TRACK_ID_FIELD_NUMBER = 5;
    public static final int UNIQUE_ID_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 4;
    private Owner author_;
    private long fromSourceType_;
    private long id_;
    private long materialId_;
    private String title_ = "";
    private String desc_ = "";
    private String cover_ = "";
    private String uri_ = "";
    private String trackId_ = "";
    private String uniqueId_ = "";
    private String fromSourceId_ = "";
    private String coverGif_ = "";
    private String from_ = "";
    private String fromSpmidSuffix_ = "";
    private String reportFlowData_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.CardBasicInfo$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69831 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16970xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16970xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16970xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16970xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16970xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16970xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16970xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16970xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CardBasicInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69831 c69831) {
            this();
        }

        public Builder clearAuthor() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearAuthor();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearCover();
            return this;
        }

        public Builder clearCoverGif() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearCoverGif();
            return this;
        }

        public Builder clearDesc() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearDesc();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearFrom();
            return this;
        }

        public Builder clearFromSourceId() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearFromSourceId();
            return this;
        }

        public Builder clearFromSourceType() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearFromSourceType();
            return this;
        }

        public Builder clearFromSpmidSuffix() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearFromSpmidSuffix();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearId();
            return this;
        }

        public Builder clearMaterialId() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearMaterialId();
            return this;
        }

        public Builder clearReportFlowData() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearReportFlowData();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearTitle();
            return this;
        }

        public Builder clearTrackId() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearTrackId();
            return this;
        }

        public Builder clearUniqueId() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearUniqueId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((CardBasicInfo) this.instance).clearUri();
            return this;
        }

        public Owner getAuthor() {
            return ((CardBasicInfo) this.instance).getAuthor();
        }

        public String getCover() {
            return ((CardBasicInfo) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((CardBasicInfo) this.instance).getCoverBytes();
        }

        public String getCoverGif() {
            return ((CardBasicInfo) this.instance).getCoverGif();
        }

        public ByteString getCoverGifBytes() {
            return ((CardBasicInfo) this.instance).getCoverGifBytes();
        }

        public String getDesc() {
            return ((CardBasicInfo) this.instance).getDesc();
        }

        public ByteString getDescBytes() {
            return ((CardBasicInfo) this.instance).getDescBytes();
        }

        public String getFrom() {
            return ((CardBasicInfo) this.instance).getFrom();
        }

        public ByteString getFromBytes() {
            return ((CardBasicInfo) this.instance).getFromBytes();
        }

        public String getFromSourceId() {
            return ((CardBasicInfo) this.instance).getFromSourceId();
        }

        public ByteString getFromSourceIdBytes() {
            return ((CardBasicInfo) this.instance).getFromSourceIdBytes();
        }

        public long getFromSourceType() {
            return ((CardBasicInfo) this.instance).getFromSourceType();
        }

        public String getFromSpmidSuffix() {
            return ((CardBasicInfo) this.instance).getFromSpmidSuffix();
        }

        public ByteString getFromSpmidSuffixBytes() {
            return ((CardBasicInfo) this.instance).getFromSpmidSuffixBytes();
        }

        public long getId() {
            return ((CardBasicInfo) this.instance).getId();
        }

        public long getMaterialId() {
            return ((CardBasicInfo) this.instance).getMaterialId();
        }

        public String getReportFlowData() {
            return ((CardBasicInfo) this.instance).getReportFlowData();
        }

        public ByteString getReportFlowDataBytes() {
            return ((CardBasicInfo) this.instance).getReportFlowDataBytes();
        }

        public String getTitle() {
            return ((CardBasicInfo) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((CardBasicInfo) this.instance).getTitleBytes();
        }

        public String getTrackId() {
            return ((CardBasicInfo) this.instance).getTrackId();
        }

        public ByteString getTrackIdBytes() {
            return ((CardBasicInfo) this.instance).getTrackIdBytes();
        }

        public String getUniqueId() {
            return ((CardBasicInfo) this.instance).getUniqueId();
        }

        public ByteString getUniqueIdBytes() {
            return ((CardBasicInfo) this.instance).getUniqueIdBytes();
        }

        public String getUri() {
            return ((CardBasicInfo) this.instance).getUri();
        }

        public ByteString getUriBytes() {
            return ((CardBasicInfo) this.instance).getUriBytes();
        }

        public boolean hasAuthor() {
            return ((CardBasicInfo) this.instance).hasAuthor();
        }

        public Builder mergeAuthor(Owner owner) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).mergeAuthor(owner);
            return this;
        }

        public Builder setAuthor(Owner owner) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setAuthor(owner);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setCoverGif(String str) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setCoverGif(str);
            return this;
        }

        public Builder setCoverGifBytes(ByteString byteString) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setCoverGifBytes(byteString);
            return this;
        }

        public Builder setDesc(String str) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setDesc(str);
            return this;
        }

        public Builder setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setDescBytes(byteString);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setFromSourceId(String str) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setFromSourceId(str);
            return this;
        }

        public Builder setFromSourceIdBytes(ByteString byteString) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setFromSourceIdBytes(byteString);
            return this;
        }

        public Builder setFromSourceType(long j) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setFromSourceType(j);
            return this;
        }

        public Builder setFromSpmidSuffix(String str) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setFromSpmidSuffix(str);
            return this;
        }

        public Builder setFromSpmidSuffixBytes(ByteString byteString) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setFromSpmidSuffixBytes(byteString);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setId(j);
            return this;
        }

        public Builder setMaterialId(long j) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setMaterialId(j);
            return this;
        }

        public Builder setReportFlowData(String str) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setReportFlowData(str);
            return this;
        }

        public Builder setReportFlowDataBytes(ByteString byteString) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setReportFlowDataBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setTrackId(String str) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setTrackId(str);
            return this;
        }

        public Builder setTrackIdBytes(ByteString byteString) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setTrackIdBytes(byteString);
            return this;
        }

        public Builder setUniqueId(String str) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setUniqueId(str);
            return this;
        }

        public Builder setUniqueIdBytes(ByteString byteString) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setUniqueIdBytes(byteString);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(CardBasicInfo.DEFAULT_INSTANCE);
        }

        public Builder setAuthor(Owner.Builder builder) {
            copyOnWrite();
            ((CardBasicInfo) this.instance).setAuthor(builder.build());
            return this;
        }
    }

    static {
        CardBasicInfo cardBasicInfo = new CardBasicInfo();
        DEFAULT_INSTANCE = cardBasicInfo;
        GeneratedMessageLite.registerDefaultInstance(CardBasicInfo.class, cardBasicInfo);
    }

    private CardBasicInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthor() {
        this.author_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverGif() {
        this.coverGif_ = getDefaultInstance().getCoverGif();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSourceId() {
        this.fromSourceId_ = getDefaultInstance().getFromSourceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSourceType() {
        this.fromSourceType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSpmidSuffix() {
        this.fromSpmidSuffix_ = getDefaultInstance().getFromSpmidSuffix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterialId() {
        this.materialId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportFlowData() {
        this.reportFlowData_ = getDefaultInstance().getReportFlowData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUniqueId() {
        this.uniqueId_ = getDefaultInstance().getUniqueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static CardBasicInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthor(Owner owner) {
        owner.getClass();
        Owner owner2 = this.author_;
        if (owner2 != null && owner2 != Owner.getDefaultInstance()) {
            this.author_ = Owner.newBuilder(this.author_).mergeFrom((Owner) owner).buildPartial();
        } else {
            this.author_ = owner;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardBasicInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardBasicInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardBasicInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardBasicInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthor(Owner owner) {
        owner.getClass();
        this.author_ = owner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverGif(String str) {
        str.getClass();
        this.coverGif_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverGifBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverGif_ = byteString.toStringUtf8();
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
    public void setFrom(String str) {
        str.getClass();
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.from_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSourceId(String str) {
        str.getClass();
        this.fromSourceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSourceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromSourceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSourceType(long j) {
        this.fromSourceType_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSpmidSuffix(String str) {
        str.getClass();
        this.fromSpmidSuffix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSpmidSuffixBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromSpmidSuffix_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterialId(long j) {
        this.materialId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportFlowData(String str) {
        str.getClass();
        this.reportFlowData_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportFlowDataBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reportFlowData_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackId(String str) {
        str.getClass();
        this.trackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUniqueId(String str) {
        str.getClass();
        this.uniqueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUniqueIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uniqueId_ = byteString.toStringUtf8();
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
        switch (C69831.f16970xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CardBasicInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0002\b\u0208\t\u0002\n\u0208\u000b\t\f\u0002\r\u0208\u000e\u0208\u000f\u0208", new Object[]{"title_", "desc_", "cover_", "uri_", "trackId_", "uniqueId_", "fromSourceType_", "fromSourceId_", "materialId_", "coverGif_", "author_", "id_", "from_", "fromSpmidSuffix_", "reportFlowData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardBasicInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (CardBasicInfo.class) {
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

    public Owner getAuthor() {
        Owner owner = this.author_;
        return owner == null ? Owner.getDefaultInstance() : owner;
    }

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public String getCoverGif() {
        return this.coverGif_;
    }

    public ByteString getCoverGifBytes() {
        return ByteString.copyFromUtf8(this.coverGif_);
    }

    public String getDesc() {
        return this.desc_;
    }

    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    public String getFrom() {
        return this.from_;
    }

    public ByteString getFromBytes() {
        return ByteString.copyFromUtf8(this.from_);
    }

    public String getFromSourceId() {
        return this.fromSourceId_;
    }

    public ByteString getFromSourceIdBytes() {
        return ByteString.copyFromUtf8(this.fromSourceId_);
    }

    public long getFromSourceType() {
        return this.fromSourceType_;
    }

    public String getFromSpmidSuffix() {
        return this.fromSpmidSuffix_;
    }

    public ByteString getFromSpmidSuffixBytes() {
        return ByteString.copyFromUtf8(this.fromSpmidSuffix_);
    }

    public long getId() {
        return this.id_;
    }

    public long getMaterialId() {
        return this.materialId_;
    }

    public String getReportFlowData() {
        return this.reportFlowData_;
    }

    public ByteString getReportFlowDataBytes() {
        return ByteString.copyFromUtf8(this.reportFlowData_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getTrackId() {
        return this.trackId_;
    }

    public ByteString getTrackIdBytes() {
        return ByteString.copyFromUtf8(this.trackId_);
    }

    public String getUniqueId() {
        return this.uniqueId_;
    }

    public ByteString getUniqueIdBytes() {
        return ByteString.copyFromUtf8(this.uniqueId_);
    }

    public String getUri() {
        return this.uri_;
    }

    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public boolean hasAuthor() {
        return this.author_ != null;
    }

    public static Builder newBuilder(CardBasicInfo cardBasicInfo) {
        return DEFAULT_INSTANCE.createBuilder(cardBasicInfo);
    }

    public static CardBasicInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardBasicInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardBasicInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardBasicInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardBasicInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardBasicInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardBasicInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardBasicInfo parseFrom(InputStream inputStream) throws IOException {
        return (CardBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardBasicInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardBasicInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardBasicInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
