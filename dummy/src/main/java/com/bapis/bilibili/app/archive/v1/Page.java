package com.bapis.bilibili.app.archive.v1;

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
/* loaded from: classes12.dex */
public final class Page extends GeneratedMessageLite<Page, Page.Builder> implements MessageLiteOrBuilder {
    public static final int CID_FIELD_NUMBER = 1;
    private static final Page DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 7;
    public static final int DIMENSION_FIELD_NUMBER = 9;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FIRST_FRAME_FIELD_NUMBER = 10;
    public static final int FROM_FIELD_NUMBER = 3;
    public static final int PAGE_FIELD_NUMBER = 2;
    private static volatile Parser<Page> PARSER = null;
    public static final int PART_FIELD_NUMBER = 4;
    public static final int VID_FIELD_NUMBER = 6;
    public static final int WEBLINK_FIELD_NUMBER = 8;
    private long cid_;
    private Dimension dimension_;
    private long duration_;
    private int page_;
    private String from_ = "";
    private String part_ = "";
    private String vid_ = "";
    private String desc_ = "";
    private String webLink_ = "";
    private String firstFrame_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.archive.v1.Page$1 */
    /* loaded from: classes12.dex */
    static /* synthetic */ class C55181 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15728xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15728xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15728xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15728xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15728xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15728xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15728xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15728xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes12.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Page, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C55181 c55181) {
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

        public Builder clearDuration() {
            copyOnWrite();
            ((Page) this.instance).clearDuration();
            return this;
        }

        public Builder clearFirstFrame() {
            copyOnWrite();
            ((Page) this.instance).clearFirstFrame();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((Page) this.instance).clearFrom();
            return this;
        }

        public Builder clearPage() {
            copyOnWrite();
            ((Page) this.instance).clearPage();
            return this;
        }

        public Builder clearPart() {
            copyOnWrite();
            ((Page) this.instance).clearPart();
            return this;
        }

        public Builder clearVid() {
            copyOnWrite();
            ((Page) this.instance).clearVid();
            return this;
        }

        public Builder clearWebLink() {
            copyOnWrite();
            ((Page) this.instance).clearWebLink();
            return this;
        }

        public long getCid() {
            return ((Page) this.instance).getCid();
        }

        public String getDesc() {
            return ((Page) this.instance).getDesc();
        }

        public ByteString getDescBytes() {
            return ((Page) this.instance).getDescBytes();
        }

        public Dimension getDimension() {
            return ((Page) this.instance).getDimension();
        }

        public long getDuration() {
            return ((Page) this.instance).getDuration();
        }

        public String getFirstFrame() {
            return ((Page) this.instance).getFirstFrame();
        }

        public ByteString getFirstFrameBytes() {
            return ((Page) this.instance).getFirstFrameBytes();
        }

        public String getFrom() {
            return ((Page) this.instance).getFrom();
        }

        public ByteString getFromBytes() {
            return ((Page) this.instance).getFromBytes();
        }

        public int getPage() {
            return ((Page) this.instance).getPage();
        }

        public String getPart() {
            return ((Page) this.instance).getPart();
        }

        public ByteString getPartBytes() {
            return ((Page) this.instance).getPartBytes();
        }

        public String getVid() {
            return ((Page) this.instance).getVid();
        }

        public ByteString getVidBytes() {
            return ((Page) this.instance).getVidBytes();
        }

        public String getWebLink() {
            return ((Page) this.instance).getWebLink();
        }

        public ByteString getWebLinkBytes() {
            return ((Page) this.instance).getWebLinkBytes();
        }

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

        public Builder setDuration(long j) {
            copyOnWrite();
            ((Page) this.instance).setDuration(j);
            return this;
        }

        public Builder setFirstFrame(String str) {
            copyOnWrite();
            ((Page) this.instance).setFirstFrame(str);
            return this;
        }

        public Builder setFirstFrameBytes(ByteString byteString) {
            copyOnWrite();
            ((Page) this.instance).setFirstFrameBytes(byteString);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((Page) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((Page) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setPage(int i) {
            copyOnWrite();
            ((Page) this.instance).setPage(i);
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

        public Builder setVid(String str) {
            copyOnWrite();
            ((Page) this.instance).setVid(str);
            return this;
        }

        public Builder setVidBytes(ByteString byteString) {
            copyOnWrite();
            ((Page) this.instance).setVidBytes(byteString);
            return this;
        }

        public Builder setWebLink(String str) {
            copyOnWrite();
            ((Page) this.instance).setWebLink(str);
            return this;
        }

        public Builder setWebLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((Page) this.instance).setWebLinkBytes(byteString);
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

    public void clearCid() {
        this.cid_ = 0L;
    }

    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    public void clearDimension() {
        this.dimension_ = null;
    }

    public void clearDuration() {
        this.duration_ = 0L;
    }

    public void clearFirstFrame() {
        this.firstFrame_ = getDefaultInstance().getFirstFrame();
    }

    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    public void clearPage() {
        this.page_ = 0;
    }

    public void clearPart() {
        this.part_ = getDefaultInstance().getPart();
    }

    public void clearVid() {
        this.vid_ = getDefaultInstance().getVid();
    }

    public void clearWebLink() {
        this.webLink_ = getDefaultInstance().getWebLink();
    }

    public static Page getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeDimension(Dimension dimension) {
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

    public void setCid(long j) {
        this.cid_ = j;
    }

    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    public void setDimension(Dimension dimension) {
        dimension.getClass();
        this.dimension_ = dimension;
    }

    public void setDuration(long j) {
        this.duration_ = j;
    }

    public void setFirstFrame(String str) {
        str.getClass();
        this.firstFrame_ = str;
    }

    public void setFirstFrameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.firstFrame_ = byteString.toStringUtf8();
    }

    public void setFrom(String str) {
        str.getClass();
        this.from_ = str;
    }

    public void setFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.from_ = byteString.toStringUtf8();
    }

    public void setPage(int i) {
        this.page_ = i;
    }

    public void setPart(String str) {
        str.getClass();
        this.part_ = str;
    }

    public void setPartBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.part_ = byteString.toStringUtf8();
    }

    public void setVid(String str) {
        str.getClass();
        this.vid_ = str;
    }

    public void setVidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vid_ = byteString.toStringUtf8();
    }

    public void setWebLink(String str) {
        str.getClass();
        this.webLink_ = str;
    }

    public void setWebLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webLink_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C55181.f15728xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Page();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0208\u0004\u0208\u0005\u0002\u0006\u0208\u0007\u0208\b\u0208\t\t\n\u0208", new Object[]{"cid_", "page_", "from_", "part_", "duration_", "vid_", "desc_", "webLink_", "dimension_", "firstFrame_"});
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

    public long getCid() {
        return this.cid_;
    }

    public String getDesc() {
        return this.desc_;
    }

    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    public Dimension getDimension() {
        Dimension dimension = this.dimension_;
        return dimension == null ? Dimension.getDefaultInstance() : dimension;
    }

    public long getDuration() {
        return this.duration_;
    }

    public String getFirstFrame() {
        return this.firstFrame_;
    }

    public ByteString getFirstFrameBytes() {
        return ByteString.copyFromUtf8(this.firstFrame_);
    }

    public String getFrom() {
        return this.from_;
    }

    public ByteString getFromBytes() {
        return ByteString.copyFromUtf8(this.from_);
    }

    public int getPage() {
        return this.page_;
    }

    public String getPart() {
        return this.part_;
    }

    public ByteString getPartBytes() {
        return ByteString.copyFromUtf8(this.part_);
    }

    public String getVid() {
        return this.vid_;
    }

    public ByteString getVidBytes() {
        return ByteString.copyFromUtf8(this.vid_);
    }

    public String getWebLink() {
        return this.webLink_;
    }

    public ByteString getWebLinkBytes() {
        return ByteString.copyFromUtf8(this.webLink_);
    }

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
