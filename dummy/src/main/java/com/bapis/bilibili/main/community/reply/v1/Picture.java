package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class Picture extends GeneratedMessageLite<Picture, Picture.C14790b> implements InterfaceC14916d {
    private static final Picture DEFAULT_INSTANCE;
    public static final int IMG_HEIGHT_FIELD_NUMBER = 3;
    public static final int IMG_SIZE_FIELD_NUMBER = 4;
    public static final int IMG_SRC_FIELD_NUMBER = 1;
    public static final int IMG_WIDTH_FIELD_NUMBER = 2;
    private static volatile Parser<Picture> PARSER = null;
    public static final int PLAY_GIF_THUMBNAIL_FIELD_NUMBER = 6;
    public static final int TOP_RIGHT_ICON_FIELD_NUMBER = 5;
    private double imgHeight_;
    private double imgSize_;
    private double imgWidth_;
    private boolean playGifThumbnail_;
    private String imgSrc_ = "";
    private String topRightIcon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Picture$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14789a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22011xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22011xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22011xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22011xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22011xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22011xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22011xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22011xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Picture$b */
    /* loaded from: classes21.dex */
    public static final class C14790b extends GeneratedMessageLite.Builder<Picture, C14790b> implements InterfaceC14916d {
        /* synthetic */ C14790b(C14789a c14789a) {
            this();
        }

        public C14790b clearImgHeight() {
            copyOnWrite();
            ((Picture) this.instance).clearImgHeight();
            return this;
        }

        public C14790b clearImgSize() {
            copyOnWrite();
            ((Picture) this.instance).clearImgSize();
            return this;
        }

        public C14790b clearImgSrc() {
            copyOnWrite();
            ((Picture) this.instance).clearImgSrc();
            return this;
        }

        public C14790b clearImgWidth() {
            copyOnWrite();
            ((Picture) this.instance).clearImgWidth();
            return this;
        }

        public C14790b clearPlayGifThumbnail() {
            copyOnWrite();
            ((Picture) this.instance).clearPlayGifThumbnail();
            return this;
        }

        public C14790b clearTopRightIcon() {
            copyOnWrite();
            ((Picture) this.instance).clearTopRightIcon();
            return this;
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
        public double getImgHeight() {
            return ((Picture) this.instance).getImgHeight();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
        public double getImgSize() {
            return ((Picture) this.instance).getImgSize();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
        public String getImgSrc() {
            return ((Picture) this.instance).getImgSrc();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
        public ByteString getImgSrcBytes() {
            return ((Picture) this.instance).getImgSrcBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
        public double getImgWidth() {
            return ((Picture) this.instance).getImgWidth();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
        public boolean getPlayGifThumbnail() {
            return ((Picture) this.instance).getPlayGifThumbnail();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
        public String getTopRightIcon() {
            return ((Picture) this.instance).getTopRightIcon();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
        public ByteString getTopRightIconBytes() {
            return ((Picture) this.instance).getTopRightIconBytes();
        }

        public C14790b setImgHeight(double d) {
            copyOnWrite();
            ((Picture) this.instance).setImgHeight(d);
            return this;
        }

        public C14790b setImgSize(double d) {
            copyOnWrite();
            ((Picture) this.instance).setImgSize(d);
            return this;
        }

        public C14790b setImgSrc(String str) {
            copyOnWrite();
            ((Picture) this.instance).setImgSrc(str);
            return this;
        }

        public C14790b setImgSrcBytes(ByteString byteString) {
            copyOnWrite();
            ((Picture) this.instance).setImgSrcBytes(byteString);
            return this;
        }

        public C14790b setImgWidth(double d) {
            copyOnWrite();
            ((Picture) this.instance).setImgWidth(d);
            return this;
        }

        public C14790b setPlayGifThumbnail(boolean z) {
            copyOnWrite();
            ((Picture) this.instance).setPlayGifThumbnail(z);
            return this;
        }

        public C14790b setTopRightIcon(String str) {
            copyOnWrite();
            ((Picture) this.instance).setTopRightIcon(str);
            return this;
        }

        public C14790b setTopRightIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Picture) this.instance).setTopRightIconBytes(byteString);
            return this;
        }

        private C14790b() {
            super(Picture.DEFAULT_INSTANCE);
        }
    }

    static {
        Picture picture = new Picture();
        DEFAULT_INSTANCE = picture;
        GeneratedMessageLite.registerDefaultInstance(Picture.class, picture);
    }

    private Picture() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImgHeight() {
        this.imgHeight_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImgSize() {
        this.imgSize_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImgSrc() {
        this.imgSrc_ = getDefaultInstance().getImgSrc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImgWidth() {
        this.imgWidth_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayGifThumbnail() {
        this.playGifThumbnail_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopRightIcon() {
        this.topRightIcon_ = getDefaultInstance().getTopRightIcon();
    }

    public static Picture getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14790b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Picture parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Picture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Picture parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Picture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Picture> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgHeight(double d) {
        this.imgHeight_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgSize(double d) {
        this.imgSize_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgSrc(String str) {
        str.getClass();
        this.imgSrc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgSrcBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imgSrc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgWidth(double d) {
        this.imgWidth_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayGifThumbnail(boolean z) {
        this.playGifThumbnail_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopRightIcon(String str) {
        str.getClass();
        this.topRightIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopRightIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.topRightIcon_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14789a.f22011xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Picture();
            case 2:
                return new C14790b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0000\u0003\u0000\u0004\u0000\u0005\u0208\u0006\u0007", new Object[]{"imgSrc_", "imgWidth_", "imgHeight_", "imgSize_", "topRightIcon_", "playGifThumbnail_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Picture> parser = PARSER;
                if (parser == null) {
                    synchronized (Picture.class) {
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

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
    public double getImgHeight() {
        return this.imgHeight_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
    public double getImgSize() {
        return this.imgSize_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
    public String getImgSrc() {
        return this.imgSrc_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
    public ByteString getImgSrcBytes() {
        return ByteString.copyFromUtf8(this.imgSrc_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
    public double getImgWidth() {
        return this.imgWidth_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
    public boolean getPlayGifThumbnail() {
        return this.playGifThumbnail_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
    public String getTopRightIcon() {
        return this.topRightIcon_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14916d
    public ByteString getTopRightIconBytes() {
        return ByteString.copyFromUtf8(this.topRightIcon_);
    }

    public static C14790b newBuilder(Picture picture) {
        return DEFAULT_INSTANCE.createBuilder(picture);
    }

    public static Picture parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Picture) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Picture parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Picture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Picture parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Picture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Picture parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Picture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Picture parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Picture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Picture parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Picture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Picture parseFrom(InputStream inputStream) throws IOException {
        return (Picture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Picture parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Picture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Picture parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Picture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Picture parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Picture) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
