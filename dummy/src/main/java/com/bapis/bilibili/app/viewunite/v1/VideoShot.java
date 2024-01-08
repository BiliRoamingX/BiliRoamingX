package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes20.dex */
public final class VideoShot extends GeneratedMessageLite<VideoShot, VideoShot.C12394b> implements MessageLiteOrBuilder {
    private static final VideoShot DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 6;
    public static final int IMG_X_LEN_FIELD_NUMBER = 2;
    public static final int IMG_X_SIZE_FIELD_NUMBER = 4;
    public static final int IMG_Y_LEN_FIELD_NUMBER = 3;
    public static final int IMG_Y_SIZE_FIELD_NUMBER = 5;
    private static volatile Parser<VideoShot> PARSER = null;
    public static final int PV_DATA_FIELD_NUMBER = 1;
    private int imgXLen_;
    private int imgXSize_;
    private int imgYLen_;
    private int imgYSize_;
    private String pvData_ = "";
    private Internal.ProtobufList<String> image_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.VideoShot$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12393a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21305xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21305xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21305xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21305xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21305xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21305xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21305xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21305xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.VideoShot$b */
    /* loaded from: classes20.dex */
    public static final class C12394b extends GeneratedMessageLite.Builder<VideoShot, C12394b> implements MessageLiteOrBuilder {
        /* synthetic */ C12394b(C12393a c12393a) {
            this();
        }

        public C12394b addAllImage(Iterable<String> iterable) {
            copyOnWrite();
            ((VideoShot) this.instance).addAllImage(iterable);
            return this;
        }

        public C12394b addImage(String str) {
            copyOnWrite();
            ((VideoShot) this.instance).addImage(str);
            return this;
        }

        public C12394b addImageBytes(ByteString byteString) {
            copyOnWrite();
            ((VideoShot) this.instance).addImageBytes(byteString);
            return this;
        }

        public C12394b clearImage() {
            copyOnWrite();
            ((VideoShot) this.instance).clearImage();
            return this;
        }

        public C12394b clearImgXLen() {
            copyOnWrite();
            ((VideoShot) this.instance).clearImgXLen();
            return this;
        }

        public C12394b clearImgXSize() {
            copyOnWrite();
            ((VideoShot) this.instance).clearImgXSize();
            return this;
        }

        public C12394b clearImgYLen() {
            copyOnWrite();
            ((VideoShot) this.instance).clearImgYLen();
            return this;
        }

        public C12394b clearImgYSize() {
            copyOnWrite();
            ((VideoShot) this.instance).clearImgYSize();
            return this;
        }

        public C12394b clearPvData() {
            copyOnWrite();
            ((VideoShot) this.instance).clearPvData();
            return this;
        }

        public String getImage(int i) {
            return ((VideoShot) this.instance).getImage(i);
        }

        public ByteString getImageBytes(int i) {
            return ((VideoShot) this.instance).getImageBytes(i);
        }

        public int getImageCount() {
            return ((VideoShot) this.instance).getImageCount();
        }

        public List<String> getImageList() {
            return Collections.unmodifiableList(((VideoShot) this.instance).getImageList());
        }

        public int getImgXLen() {
            return ((VideoShot) this.instance).getImgXLen();
        }

        public int getImgXSize() {
            return ((VideoShot) this.instance).getImgXSize();
        }

        public int getImgYLen() {
            return ((VideoShot) this.instance).getImgYLen();
        }

        public int getImgYSize() {
            return ((VideoShot) this.instance).getImgYSize();
        }

        public String getPvData() {
            return ((VideoShot) this.instance).getPvData();
        }

        public ByteString getPvDataBytes() {
            return ((VideoShot) this.instance).getPvDataBytes();
        }

        public C12394b setImage(int i, String str) {
            copyOnWrite();
            ((VideoShot) this.instance).setImage(i, str);
            return this;
        }

        public C12394b setImgXLen(int i) {
            copyOnWrite();
            ((VideoShot) this.instance).setImgXLen(i);
            return this;
        }

        public C12394b setImgXSize(int i) {
            copyOnWrite();
            ((VideoShot) this.instance).setImgXSize(i);
            return this;
        }

        public C12394b setImgYLen(int i) {
            copyOnWrite();
            ((VideoShot) this.instance).setImgYLen(i);
            return this;
        }

        public C12394b setImgYSize(int i) {
            copyOnWrite();
            ((VideoShot) this.instance).setImgYSize(i);
            return this;
        }

        public C12394b setPvData(String str) {
            copyOnWrite();
            ((VideoShot) this.instance).setPvData(str);
            return this;
        }

        public C12394b setPvDataBytes(ByteString byteString) {
            copyOnWrite();
            ((VideoShot) this.instance).setPvDataBytes(byteString);
            return this;
        }

        private C12394b() {
            super(VideoShot.DEFAULT_INSTANCE);
        }
    }

    static {
        VideoShot videoShot = new VideoShot();
        DEFAULT_INSTANCE = videoShot;
        GeneratedMessageLite.registerDefaultInstance(VideoShot.class, videoShot);
    }

    private VideoShot() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImage(Iterable<String> iterable) {
        ensureImageIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.image_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImage(String str) {
        str.getClass();
        ensureImageIsMutable();
        this.image_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureImageIsMutable();
        this.image_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImage() {
        this.image_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImgXLen() {
        this.imgXLen_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImgXSize() {
        this.imgXSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImgYLen() {
        this.imgYLen_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImgYSize() {
        this.imgYSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPvData() {
        this.pvData_ = getDefaultInstance().getPvData();
    }

    private void ensureImageIsMutable() {
        Internal.ProtobufList<String> protobufList = this.image_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.image_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static VideoShot getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12394b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VideoShot parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoShot) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoShot parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoShot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VideoShot> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImage(int i, String str) {
        str.getClass();
        ensureImageIsMutable();
        this.image_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgXLen(int i) {
        this.imgXLen_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgXSize(int i) {
        this.imgXSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgYLen(int i) {
        this.imgYLen_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgYSize(int i) {
        this.imgYSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPvData(String str) {
        str.getClass();
        this.pvData_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPvDataBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pvData_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12393a.f21305xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoShot();
            case 2:
                return new C12394b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0208\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u021a", new Object[]{"pvData_", "imgXLen_", "imgYLen_", "imgXSize_", "imgYSize_", "image_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VideoShot> parser = PARSER;
                if (parser == null) {
                    synchronized (VideoShot.class) {
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

    public String getImage(int i) {
        return this.image_.get(i);
    }

    public ByteString getImageBytes(int i) {
        return ByteString.copyFromUtf8(this.image_.get(i));
    }

    public int getImageCount() {
        return this.image_.size();
    }

    public List<String> getImageList() {
        return this.image_;
    }

    public int getImgXLen() {
        return this.imgXLen_;
    }

    public int getImgXSize() {
        return this.imgXSize_;
    }

    public int getImgYLen() {
        return this.imgYLen_;
    }

    public int getImgYSize() {
        return this.imgYSize_;
    }

    public String getPvData() {
        return this.pvData_;
    }

    public ByteString getPvDataBytes() {
        return ByteString.copyFromUtf8(this.pvData_);
    }

    public static C12394b newBuilder(VideoShot videoShot) {
        return DEFAULT_INSTANCE.createBuilder(videoShot);
    }

    public static VideoShot parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoShot) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoShot parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoShot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoShot parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoShot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VideoShot parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoShot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoShot parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoShot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoShot parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoShot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VideoShot parseFrom(InputStream inputStream) throws IOException {
        return (VideoShot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoShot parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoShot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoShot parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoShot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoShot parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoShot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
