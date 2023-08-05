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
public final class Page extends GeneratedMessageLite<Page, Page.Builder> implements PageOrBuilder {
    public static final int CID_FIELD_NUMBER = 1;
    private static final Page DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 4;
    public static final int DIMENSION_FIELD_NUMBER = 5;
    public static final int DL_SUBTITLE_FIELD_NUMBER = 7;
    public static final int DL_TITLE_FIELD_NUMBER = 6;
    public static final int DURATION_FIELD_NUMBER = 3;
    private static volatile Parser<Page> PARSER = null;
    public static final int PART_FIELD_NUMBER = 2;
    private long cid_;
    private Dimension dimension_;
    private long duration_;
    private String part_ = "";
    private String desc_ = "";
    private String dlTitle_ = "";
    private String dlSubtitle_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Page$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70261 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17007xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17007xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17007xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17007xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17007xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17007xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17007xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17007xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Page, Builder> implements PageOrBuilder {
        /* synthetic */ Builder(C70261 c70261) {
            this();
        }

        public Builder clearCid() {
            copyOnWrite();
            ((Page) this.instance).clearCid();
            return this;
        }

        public Builder clearDesc() {
            copyOnWrite();
            ((Page) this.instance).clearDesc();
            return this;
        }

        public Builder clearDimension() {
            copyOnWrite();
            ((Page) this.instance).clearDimension();
            return this;
        }

        public Builder clearDlSubtitle() {
            copyOnWrite();
            ((Page) this.instance).clearDlSubtitle();
            return this;
        }

        public Builder clearDlTitle() {
            copyOnWrite();
            ((Page) this.instance).clearDlTitle();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((Page) this.instance).clearDuration();
            return this;
        }

        public Builder clearPart() {
            copyOnWrite();
            ((Page) this.instance).clearPart();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
        public long getCid() {
            return ((Page) this.instance).getCid();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
        public String getDesc() {
            return ((Page) this.instance).getDesc();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
        public ByteString getDescBytes() {
            return ((Page) this.instance).getDescBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
        public Dimension getDimension() {
            return ((Page) this.instance).getDimension();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
        public String getDlSubtitle() {
            return ((Page) this.instance).getDlSubtitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
        public ByteString getDlSubtitleBytes() {
            return ((Page) this.instance).getDlSubtitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
        public String getDlTitle() {
            return ((Page) this.instance).getDlTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
        public ByteString getDlTitleBytes() {
            return ((Page) this.instance).getDlTitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
        public long getDuration() {
            return ((Page) this.instance).getDuration();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
        public String getPart() {
            return ((Page) this.instance).getPart();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
        public ByteString getPartBytes() {
            return ((Page) this.instance).getPartBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
        public boolean hasDimension() {
            return ((Page) this.instance).hasDimension();
        }

        public Builder mergeDimension(Dimension dimension) {
            copyOnWrite();
            ((Page) this.instance).mergeDimension(dimension);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((Page) this.instance).setCid(j);
            return this;
        }

        public Builder setDesc(String str) {
            copyOnWrite();
            ((Page) this.instance).setDesc(str);
            return this;
        }

        public Builder setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((Page) this.instance).setDescBytes(byteString);
            return this;
        }

        public Builder setDimension(Dimension dimension) {
            copyOnWrite();
            ((Page) this.instance).setDimension(dimension);
            return this;
        }

        public Builder setDlSubtitle(String str) {
            copyOnWrite();
            ((Page) this.instance).setDlSubtitle(str);
            return this;
        }

        public Builder setDlSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Page) this.instance).setDlSubtitleBytes(byteString);
            return this;
        }

        public Builder setDlTitle(String str) {
            copyOnWrite();
            ((Page) this.instance).setDlTitle(str);
            return this;
        }

        public Builder setDlTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Page) this.instance).setDlTitleBytes(byteString);
            return this;
        }

        public Builder setDuration(long j) {
            copyOnWrite();
            ((Page) this.instance).setDuration(j);
            return this;
        }

        public Builder setPart(String str) {
            copyOnWrite();
            ((Page) this.instance).setPart(str);
            return this;
        }

        public Builder setPartBytes(ByteString byteString) {
            copyOnWrite();
            ((Page) this.instance).setPartBytes(byteString);
            return this;
        }

        private Builder() {
            super(Page.DEFAULT_INSTANCE);
        }

        public Builder setDimension(Dimension.Builder builder) {
            copyOnWrite();
            ((Page) this.instance).setDimension(builder.build());
            return this;
        }
    }

    static {
        Page page = new Page();
        DEFAULT_INSTANCE = page;
        GeneratedMessageLite.registerDefaultInstance(Page.class, page);
    }

    private Page() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDimension() {
        this.dimension_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDlSubtitle() {
        this.dlSubtitle_ = getDefaultInstance().getDlSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDlTitle() {
        this.dlTitle_ = getDefaultInstance().getDlTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPart() {
        this.part_ = getDefaultInstance().getPart();
    }

    public static Page getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDimension(Dimension dimension) {
        dimension.getClass();
        Dimension dimension2 = this.dimension_;
        if (dimension2 != null && dimension2 != Dimension.getDefaultInstance()) {
            this.dimension_ = Dimension.newBuilder(this.dimension_).mergeFrom((Dimension) dimension).buildPartial();
        } else {
            this.dimension_ = dimension;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Page parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Page) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Page parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Page> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
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
    public void setDimension(Dimension dimension) {
        dimension.getClass();
        this.dimension_ = dimension;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDlSubtitle(String str) {
        str.getClass();
        this.dlSubtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDlSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dlSubtitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDlTitle(String str) {
        str.getClass();
        this.dlTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDlTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dlTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j) {
        this.duration_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPart(String str) {
        str.getClass();
        this.part_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.part_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70261.f17007xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Page();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002\u0004\u0208\u0005\t\u0006\u0208\u0007\u0208", new Object[]{"cid_", "part_", "duration_", "desc_", "dimension_", "dlTitle_", "dlSubtitle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Page> parser = PARSER;
                if (parser == null) {
                    synchronized (Page.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
    public long getCid() {
        return this.cid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
    public String getDesc() {
        return this.desc_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
    public Dimension getDimension() {
        Dimension dimension = this.dimension_;
        return dimension == null ? Dimension.getDefaultInstance() : dimension;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
    public String getDlSubtitle() {
        return this.dlSubtitle_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
    public ByteString getDlSubtitleBytes() {
        return ByteString.copyFromUtf8(this.dlSubtitle_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
    public String getDlTitle() {
        return this.dlTitle_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
    public ByteString getDlTitleBytes() {
        return ByteString.copyFromUtf8(this.dlTitle_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
    public long getDuration() {
        return this.duration_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
    public String getPart() {
        return this.part_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
    public ByteString getPartBytes() {
        return ByteString.copyFromUtf8(this.part_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PageOrBuilder
    public boolean hasDimension() {
        return this.dimension_ != null;
    }

    public static Builder newBuilder(Page page) {
        return DEFAULT_INSTANCE.createBuilder(page);
    }

    public static Page parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Page) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Page parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Page parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Page parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Page parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Page parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Page parseFrom(InputStream inputStream) throws IOException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Page parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Page parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Page parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
