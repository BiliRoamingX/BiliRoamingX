package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class VideoPoint extends GeneratedMessageLite<VideoPoint, VideoPoint.Builder> implements VideoPointOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 4;
    public static final int COVER_FIELD_NUMBER = 5;
    private static final VideoPoint DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LOGO_URL_FIELD_NUMBER = 6;
    private static volatile Parser<VideoPoint> PARSER = null;
    public static final int TO_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private long from_;
    private long to_;
    private int type_;
    private String content_ = "";
    private String cover_ = "";
    private String logoUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.VideoPoint$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68921 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16849xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16849xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16849xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16849xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16849xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16849xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16849xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16849xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<VideoPoint, Builder> implements VideoPointOrBuilder {
        /* synthetic */ Builder(C68921 c68921) {
            this();
        }

        public Builder clearContent() {
            copyOnWrite();
            ((VideoPoint) this.instance).clearContent();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((VideoPoint) this.instance).clearCover();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((VideoPoint) this.instance).clearFrom();
            return this;
        }

        public Builder clearLogoUrl() {
            copyOnWrite();
            ((VideoPoint) this.instance).clearLogoUrl();
            return this;
        }

        public Builder clearTo() {
            copyOnWrite();
            ((VideoPoint) this.instance).clearTo();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((VideoPoint) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
        public String getContent() {
            return ((VideoPoint) this.instance).getContent();
        }

        @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
        public ByteString getContentBytes() {
            return ((VideoPoint) this.instance).getContentBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
        public String getCover() {
            return ((VideoPoint) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
        public ByteString getCoverBytes() {
            return ((VideoPoint) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
        public long getFrom() {
            return ((VideoPoint) this.instance).getFrom();
        }

        @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
        public String getLogoUrl() {
            return ((VideoPoint) this.instance).getLogoUrl();
        }

        @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
        public ByteString getLogoUrlBytes() {
            return ((VideoPoint) this.instance).getLogoUrlBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
        public long getTo() {
            return ((VideoPoint) this.instance).getTo();
        }

        @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
        public int getType() {
            return ((VideoPoint) this.instance).getType();
        }

        public Builder setContent(String str) {
            copyOnWrite();
            ((VideoPoint) this.instance).setContent(str);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((VideoPoint) this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((VideoPoint) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((VideoPoint) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setFrom(long j) {
            copyOnWrite();
            ((VideoPoint) this.instance).setFrom(j);
            return this;
        }

        public Builder setLogoUrl(String str) {
            copyOnWrite();
            ((VideoPoint) this.instance).setLogoUrl(str);
            return this;
        }

        public Builder setLogoUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((VideoPoint) this.instance).setLogoUrlBytes(byteString);
            return this;
        }

        public Builder setTo(long j) {
            copyOnWrite();
            ((VideoPoint) this.instance).setTo(j);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((VideoPoint) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(VideoPoint.DEFAULT_INSTANCE);
        }
    }

    static {
        VideoPoint videoPoint = new VideoPoint();
        DEFAULT_INSTANCE = videoPoint;
        GeneratedMessageLite.registerDefaultInstance(VideoPoint.class, videoPoint);
    }

    private VideoPoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogoUrl() {
        this.logoUrl_ = getDefaultInstance().getLogoUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTo() {
        this.to_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static VideoPoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VideoPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoPoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VideoPoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
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
    public void setFrom(long j) {
        this.from_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoUrl(String str) {
        str.getClass();
        this.logoUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.logoUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTo(long j) {
        this.to_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68921.f16849xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoPoint();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002\u0004\u0208\u0005\u0208\u0006\u0208", new Object[]{"type_", "from_", "to_", "content_", "cover_", "logoUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VideoPoint> parser = PARSER;
                if (parser == null) {
                    synchronized (VideoPoint.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
    public String getContent() {
        return this.content_;
    }

    @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
    public long getFrom() {
        return this.from_;
    }

    @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
    public String getLogoUrl() {
        return this.logoUrl_;
    }

    @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
    public ByteString getLogoUrlBytes() {
        return ByteString.copyFromUtf8(this.logoUrl_);
    }

    @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
    public long getTo() {
        return this.to_;
    }

    @Override // com.bapis.bilibili.app.view.v1.VideoPointOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(VideoPoint videoPoint) {
        return DEFAULT_INSTANCE.createBuilder(videoPoint);
    }

    public static VideoPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VideoPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VideoPoint parseFrom(InputStream inputStream) throws IOException {
        return (VideoPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoPoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
