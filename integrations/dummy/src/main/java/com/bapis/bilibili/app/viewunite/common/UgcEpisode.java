package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class UgcEpisode extends GeneratedMessageLite<UgcEpisode, UgcEpisode.Builder> implements UgcEpisodeOrBuilder {
    public static final int AID_FIELD_NUMBER = 2;
    public static final int CID_FIELD_NUMBER = 3;
    public static final int COVER_FIELD_NUMBER = 5;
    public static final int COVER_RIGHT_TEXT_FIELD_NUMBER = 6;
    public static final int DANMAKU_FIELD_NUMBER = 9;
    private static final UgcEpisode DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int PAGE_FIELD_NUMBER = 7;
    private static volatile Parser<UgcEpisode> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int VT_FIELD_NUMBER = 8;
    private long aid_;
    private long cid_;
    private StatInfo danmaku_;
    private long id_;
    private Page page_;
    private StatInfo vt_;
    private String title_ = "";
    private String cover_ = "";
    private String coverRightText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.UgcEpisode$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70721 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17049xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17049xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17049xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17049xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17049xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17049xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17049xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17049xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UgcEpisode, Builder> implements UgcEpisodeOrBuilder {
        /* synthetic */ Builder(C70721 c70721) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((UgcEpisode) this.instance).clearAid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((UgcEpisode) this.instance).clearCid();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((UgcEpisode) this.instance).clearCover();
            return this;
        }

        public Builder clearCoverRightText() {
            copyOnWrite();
            ((UgcEpisode) this.instance).clearCoverRightText();
            return this;
        }

        public Builder clearDanmaku() {
            copyOnWrite();
            ((UgcEpisode) this.instance).clearDanmaku();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((UgcEpisode) this.instance).clearId();
            return this;
        }

        public Builder clearPage() {
            copyOnWrite();
            ((UgcEpisode) this.instance).clearPage();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((UgcEpisode) this.instance).clearTitle();
            return this;
        }

        public Builder clearVt() {
            copyOnWrite();
            ((UgcEpisode) this.instance).clearVt();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public long getAid() {
            return ((UgcEpisode) this.instance).getAid();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public long getCid() {
            return ((UgcEpisode) this.instance).getCid();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public String getCover() {
            return ((UgcEpisode) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public ByteString getCoverBytes() {
            return ((UgcEpisode) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public String getCoverRightText() {
            return ((UgcEpisode) this.instance).getCoverRightText();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public ByteString getCoverRightTextBytes() {
            return ((UgcEpisode) this.instance).getCoverRightTextBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public StatInfo getDanmaku() {
            return ((UgcEpisode) this.instance).getDanmaku();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public long getId() {
            return ((UgcEpisode) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public Page getPage() {
            return ((UgcEpisode) this.instance).getPage();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public String getTitle() {
            return ((UgcEpisode) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public ByteString getTitleBytes() {
            return ((UgcEpisode) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public StatInfo getVt() {
            return ((UgcEpisode) this.instance).getVt();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public boolean hasDanmaku() {
            return ((UgcEpisode) this.instance).hasDanmaku();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public boolean hasPage() {
            return ((UgcEpisode) this.instance).hasPage();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
        public boolean hasVt() {
            return ((UgcEpisode) this.instance).hasVt();
        }

        public Builder mergeDanmaku(StatInfo statInfo) {
            copyOnWrite();
            ((UgcEpisode) this.instance).mergeDanmaku(statInfo);
            return this;
        }

        public Builder mergePage(Page page) {
            copyOnWrite();
            ((UgcEpisode) this.instance).mergePage(page);
            return this;
        }

        public Builder mergeVt(StatInfo statInfo) {
            copyOnWrite();
            ((UgcEpisode) this.instance).mergeVt(statInfo);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setAid(j);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setCid(j);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setCoverRightText(String str) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setCoverRightText(str);
            return this;
        }

        public Builder setCoverRightTextBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setCoverRightTextBytes(byteString);
            return this;
        }

        public Builder setDanmaku(StatInfo statInfo) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setDanmaku(statInfo);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setId(j);
            return this;
        }

        public Builder setPage(Page page) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setPage(page);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setVt(StatInfo statInfo) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setVt(statInfo);
            return this;
        }

        private Builder() {
            super(UgcEpisode.DEFAULT_INSTANCE);
        }

        public Builder setDanmaku(StatInfo.Builder builder) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setDanmaku(builder.build());
            return this;
        }

        public Builder setPage(Page.Builder builder) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setPage(builder.build());
            return this;
        }

        public Builder setVt(StatInfo.Builder builder) {
            copyOnWrite();
            ((UgcEpisode) this.instance).setVt(builder.build());
            return this;
        }
    }

    static {
        UgcEpisode ugcEpisode = new UgcEpisode();
        DEFAULT_INSTANCE = ugcEpisode;
        GeneratedMessageLite.registerDefaultInstance(UgcEpisode.class, ugcEpisode);
    }

    private UgcEpisode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverRightText() {
        this.coverRightText_ = getDefaultInstance().getCoverRightText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDanmaku() {
        this.danmaku_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPage() {
        this.page_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVt() {
        this.vt_ = null;
    }

    public static UgcEpisode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDanmaku(StatInfo statInfo) {
        statInfo.getClass();
        StatInfo statInfo2 = this.danmaku_;
        if (statInfo2 != null && statInfo2 != StatInfo.getDefaultInstance()) {
            this.danmaku_ = StatInfo.newBuilder(this.danmaku_).mergeFrom((StatInfo) statInfo).buildPartial();
        } else {
            this.danmaku_ = statInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePage(Page page) {
        page.getClass();
        Page page2 = this.page_;
        if (page2 != null && page2 != Page.getDefaultInstance()) {
            this.page_ = Page.newBuilder(this.page_).mergeFrom((Page) page).buildPartial();
        } else {
            this.page_ = page;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVt(StatInfo statInfo) {
        statInfo.getClass();
        StatInfo statInfo2 = this.vt_;
        if (statInfo2 != null && statInfo2 != StatInfo.getDefaultInstance()) {
            this.vt_ = StatInfo.newBuilder(this.vt_).mergeFrom((StatInfo) statInfo).buildPartial();
        } else {
            this.vt_ = statInfo;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UgcEpisode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UgcEpisode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcEpisode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UgcEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UgcEpisode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
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
    public void setCoverRightText(String str) {
        str.getClass();
        this.coverRightText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverRightTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverRightText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDanmaku(StatInfo statInfo) {
        statInfo.getClass();
        this.danmaku_ = statInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPage(Page page) {
        page.getClass();
        this.page_ = page;
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
    public void setVt(StatInfo statInfo) {
        statInfo.getClass();
        this.vt_ = statInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70721.f17049xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UgcEpisode();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0208\u0005\u0208\u0006\u0208\u0007\t\b\t\t\t", new Object[]{"id_", "aid_", "cid_", "title_", "cover_", "coverRightText_", "page_", "vt_", "danmaku_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UgcEpisode> parser = PARSER;
                if (parser == null) {
                    synchronized (UgcEpisode.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public long getAid() {
        return this.aid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public long getCid() {
        return this.cid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public String getCoverRightText() {
        return this.coverRightText_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public ByteString getCoverRightTextBytes() {
        return ByteString.copyFromUtf8(this.coverRightText_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public StatInfo getDanmaku() {
        StatInfo statInfo = this.danmaku_;
        return statInfo == null ? StatInfo.getDefaultInstance() : statInfo;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public Page getPage() {
        Page page = this.page_;
        return page == null ? Page.getDefaultInstance() : page;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public StatInfo getVt() {
        StatInfo statInfo = this.vt_;
        return statInfo == null ? StatInfo.getDefaultInstance() : statInfo;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public boolean hasDanmaku() {
        return this.danmaku_ != null;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public boolean hasPage() {
        return this.page_ != null;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcEpisodeOrBuilder
    public boolean hasVt() {
        return this.vt_ != null;
    }

    public static Builder newBuilder(UgcEpisode ugcEpisode) {
        return DEFAULT_INSTANCE.createBuilder(ugcEpisode);
    }

    public static UgcEpisode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcEpisode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcEpisode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UgcEpisode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UgcEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UgcEpisode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UgcEpisode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UgcEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UgcEpisode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UgcEpisode parseFrom(InputStream inputStream) throws IOException {
        return (UgcEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcEpisode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcEpisode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UgcEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UgcEpisode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcEpisode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
