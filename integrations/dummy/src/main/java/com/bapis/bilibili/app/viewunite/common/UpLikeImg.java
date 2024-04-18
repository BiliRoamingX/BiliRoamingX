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
public final class UpLikeImg extends GeneratedMessageLite<UpLikeImg, UpLikeImg.Builder> implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 3;
    private static final UpLikeImg DEFAULT_INSTANCE;
    private static volatile Parser<UpLikeImg> PARSER = null;
    public static final int PRE_IMG_FIELD_NUMBER = 1;
    public static final int SUC_IMG_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 4;
    private long type_;
    private String preImg_ = "";
    private String sucImg_ = "";
    private String content_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.UpLikeImg$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70771 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17054xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17054xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17054xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17054xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17054xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17054xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17054xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17054xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UpLikeImg, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70771 c70771) {
            this();
        }

        public Builder clearContent() {
            copyOnWrite();
            ((UpLikeImg) this.instance).clearContent();
            return this;
        }

        public Builder clearPreImg() {
            copyOnWrite();
            ((UpLikeImg) this.instance).clearPreImg();
            return this;
        }

        public Builder clearSucImg() {
            copyOnWrite();
            ((UpLikeImg) this.instance).clearSucImg();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((UpLikeImg) this.instance).clearType();
            return this;
        }

        public String getContent() {
            return ((UpLikeImg) this.instance).getContent();
        }

        public ByteString getContentBytes() {
            return ((UpLikeImg) this.instance).getContentBytes();
        }

        public String getPreImg() {
            return ((UpLikeImg) this.instance).getPreImg();
        }

        public ByteString getPreImgBytes() {
            return ((UpLikeImg) this.instance).getPreImgBytes();
        }

        public String getSucImg() {
            return ((UpLikeImg) this.instance).getSucImg();
        }

        public ByteString getSucImgBytes() {
            return ((UpLikeImg) this.instance).getSucImgBytes();
        }

        public long getType() {
            return ((UpLikeImg) this.instance).getType();
        }

        public Builder setContent(String str) {
            copyOnWrite();
            ((UpLikeImg) this.instance).setContent(str);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((UpLikeImg) this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setPreImg(String str) {
            copyOnWrite();
            ((UpLikeImg) this.instance).setPreImg(str);
            return this;
        }

        public Builder setPreImgBytes(ByteString byteString) {
            copyOnWrite();
            ((UpLikeImg) this.instance).setPreImgBytes(byteString);
            return this;
        }

        public Builder setSucImg(String str) {
            copyOnWrite();
            ((UpLikeImg) this.instance).setSucImg(str);
            return this;
        }

        public Builder setSucImgBytes(ByteString byteString) {
            copyOnWrite();
            ((UpLikeImg) this.instance).setSucImgBytes(byteString);
            return this;
        }

        public Builder setType(long j) {
            copyOnWrite();
            ((UpLikeImg) this.instance).setType(j);
            return this;
        }

        private Builder() {
            super(UpLikeImg.DEFAULT_INSTANCE);
        }
    }

    static {
        UpLikeImg upLikeImg = new UpLikeImg();
        DEFAULT_INSTANCE = upLikeImg;
        GeneratedMessageLite.registerDefaultInstance(UpLikeImg.class, upLikeImg);
    }

    public UpLikeImg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreImg() {
        this.preImg_ = getDefaultInstance().getPreImg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSucImg() {
        this.sucImg_ = getDefaultInstance().getSucImg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0L;
    }

    public static UpLikeImg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UpLikeImg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UpLikeImg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpLikeImg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UpLikeImg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UpLikeImg> parser() {
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
    public void setPreImg(String str) {
        str.getClass();
        this.preImg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreImgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.preImg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSucImg(String str) {
        str.getClass();
        this.sucImg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSucImgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sucImg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(long j) {
        this.type_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70771.f17054xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UpLikeImg();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0002", new Object[]{"preImg_", "sucImg_", "content_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UpLikeImg> parser = PARSER;
                if (parser == null) {
                    synchronized (UpLikeImg.class) {
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

    public String getContent() {
        return this.content_;
    }

    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    public String getPreImg() {
        return this.preImg_;
    }

    public ByteString getPreImgBytes() {
        return ByteString.copyFromUtf8(this.preImg_);
    }

    public String getSucImg() {
        return this.sucImg_;
    }

    public ByteString getSucImgBytes() {
        return ByteString.copyFromUtf8(this.sucImg_);
    }

    public long getType() {
        return this.type_;
    }

    public static Builder newBuilder(UpLikeImg upLikeImg) {
        return DEFAULT_INSTANCE.createBuilder(upLikeImg);
    }

    public static UpLikeImg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpLikeImg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpLikeImg parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpLikeImg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UpLikeImg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UpLikeImg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UpLikeImg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpLikeImg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UpLikeImg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UpLikeImg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UpLikeImg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpLikeImg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UpLikeImg parseFrom(InputStream inputStream) throws IOException {
        return (UpLikeImg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpLikeImg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpLikeImg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpLikeImg parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UpLikeImg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UpLikeImg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpLikeImg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
