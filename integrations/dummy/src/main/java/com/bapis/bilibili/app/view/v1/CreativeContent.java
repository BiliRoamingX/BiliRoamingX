package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class CreativeContent extends GeneratedMessageLite<CreativeContent, CreativeContent.Builder> implements MessageLiteOrBuilder {
    public static final int BUTTON_TITLE_FIELD_NUMBER = 3;
    public static final int CLICK_URL_FIELD_NUMBER = 11;
    private static final CreativeContent DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int IMAGE_MD5_FIELD_NUMBER = 7;
    public static final int IMAGE_URL_FIELD_NUMBER = 6;
    public static final int LOG_MD5_FIELD_NUMBER = 9;
    public static final int LOG_URL_FIELD_NUMBER = 8;
    private static volatile Parser<CreativeContent> PARSER = null;
    public static final int SHOW_URL_FIELD_NUMBER = 12;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 10;
    public static final int USERNAME_FIELD_NUMBER = 5;
    public static final int VIDEO_ID_FIELD_NUMBER = 4;
    private long videoId_;
    private String title_ = "";
    private String description_ = "";
    private String buttonTitle_ = "";
    private String username_ = "";
    private String imageUrl_ = "";
    private String imageMd5_ = "";
    private String logUrl_ = "";
    private String logMd5_ = "";
    private String url_ = "";
    private String clickUrl_ = "";
    private String showUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.CreativeContent$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67501 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16724xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16724xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16724xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16724xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16724xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16724xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16724xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16724xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CreativeContent, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67501 c67501) {
            this();
        }

        public Builder clearButtonTitle() {
            copyOnWrite();
            ((CreativeContent) this.instance).clearButtonTitle();
            return this;
        }

        public Builder clearClickUrl() {
            copyOnWrite();
            ((CreativeContent) this.instance).clearClickUrl();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((CreativeContent) this.instance).clearDescription();
            return this;
        }

        public Builder clearImageMd5() {
            copyOnWrite();
            ((CreativeContent) this.instance).clearImageMd5();
            return this;
        }

        public Builder clearImageUrl() {
            copyOnWrite();
            ((CreativeContent) this.instance).clearImageUrl();
            return this;
        }

        public Builder clearLogMd5() {
            copyOnWrite();
            ((CreativeContent) this.instance).clearLogMd5();
            return this;
        }

        public Builder clearLogUrl() {
            copyOnWrite();
            ((CreativeContent) this.instance).clearLogUrl();
            return this;
        }

        public Builder clearShowUrl() {
            copyOnWrite();
            ((CreativeContent) this.instance).clearShowUrl();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((CreativeContent) this.instance).clearTitle();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((CreativeContent) this.instance).clearUrl();
            return this;
        }

        public Builder clearUsername() {
            copyOnWrite();
            ((CreativeContent) this.instance).clearUsername();
            return this;
        }

        public Builder clearVideoId() {
            copyOnWrite();
            ((CreativeContent) this.instance).clearVideoId();
            return this;
        }

        public String getButtonTitle() {
            return ((CreativeContent) this.instance).getButtonTitle();
        }

        public ByteString getButtonTitleBytes() {
            return ((CreativeContent) this.instance).getButtonTitleBytes();
        }

        public String getClickUrl() {
            return ((CreativeContent) this.instance).getClickUrl();
        }

        public ByteString getClickUrlBytes() {
            return ((CreativeContent) this.instance).getClickUrlBytes();
        }

        public String getDescription() {
            return ((CreativeContent) this.instance).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((CreativeContent) this.instance).getDescriptionBytes();
        }

        public String getImageMd5() {
            return ((CreativeContent) this.instance).getImageMd5();
        }

        public ByteString getImageMd5Bytes() {
            return ((CreativeContent) this.instance).getImageMd5Bytes();
        }

        public String getImageUrl() {
            return ((CreativeContent) this.instance).getImageUrl();
        }

        public ByteString getImageUrlBytes() {
            return ((CreativeContent) this.instance).getImageUrlBytes();
        }

        public String getLogMd5() {
            return ((CreativeContent) this.instance).getLogMd5();
        }

        public ByteString getLogMd5Bytes() {
            return ((CreativeContent) this.instance).getLogMd5Bytes();
        }

        public String getLogUrl() {
            return ((CreativeContent) this.instance).getLogUrl();
        }

        public ByteString getLogUrlBytes() {
            return ((CreativeContent) this.instance).getLogUrlBytes();
        }

        public String getShowUrl() {
            return ((CreativeContent) this.instance).getShowUrl();
        }

        public ByteString getShowUrlBytes() {
            return ((CreativeContent) this.instance).getShowUrlBytes();
        }

        public String getTitle() {
            return ((CreativeContent) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((CreativeContent) this.instance).getTitleBytes();
        }

        public String getUrl() {
            return ((CreativeContent) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((CreativeContent) this.instance).getUrlBytes();
        }

        public String getUsername() {
            return ((CreativeContent) this.instance).getUsername();
        }

        public ByteString getUsernameBytes() {
            return ((CreativeContent) this.instance).getUsernameBytes();
        }

        public long getVideoId() {
            return ((CreativeContent) this.instance).getVideoId();
        }

        public Builder setButtonTitle(String str) {
            copyOnWrite();
            ((CreativeContent) this.instance).setButtonTitle(str);
            return this;
        }

        public Builder setButtonTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((CreativeContent) this.instance).setButtonTitleBytes(byteString);
            return this;
        }

        public Builder setClickUrl(String str) {
            copyOnWrite();
            ((CreativeContent) this.instance).setClickUrl(str);
            return this;
        }

        public Builder setClickUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((CreativeContent) this.instance).setClickUrlBytes(byteString);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((CreativeContent) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((CreativeContent) this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setImageMd5(String str) {
            copyOnWrite();
            ((CreativeContent) this.instance).setImageMd5(str);
            return this;
        }

        public Builder setImageMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((CreativeContent) this.instance).setImageMd5Bytes(byteString);
            return this;
        }

        public Builder setImageUrl(String str) {
            copyOnWrite();
            ((CreativeContent) this.instance).setImageUrl(str);
            return this;
        }

        public Builder setImageUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((CreativeContent) this.instance).setImageUrlBytes(byteString);
            return this;
        }

        public Builder setLogMd5(String str) {
            copyOnWrite();
            ((CreativeContent) this.instance).setLogMd5(str);
            return this;
        }

        public Builder setLogMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((CreativeContent) this.instance).setLogMd5Bytes(byteString);
            return this;
        }

        public Builder setLogUrl(String str) {
            copyOnWrite();
            ((CreativeContent) this.instance).setLogUrl(str);
            return this;
        }

        public Builder setLogUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((CreativeContent) this.instance).setLogUrlBytes(byteString);
            return this;
        }

        public Builder setShowUrl(String str) {
            copyOnWrite();
            ((CreativeContent) this.instance).setShowUrl(str);
            return this;
        }

        public Builder setShowUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((CreativeContent) this.instance).setShowUrlBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((CreativeContent) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((CreativeContent) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((CreativeContent) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((CreativeContent) this.instance).setUrlBytes(byteString);
            return this;
        }

        public Builder setUsername(String str) {
            copyOnWrite();
            ((CreativeContent) this.instance).setUsername(str);
            return this;
        }

        public Builder setUsernameBytes(ByteString byteString) {
            copyOnWrite();
            ((CreativeContent) this.instance).setUsernameBytes(byteString);
            return this;
        }

        public Builder setVideoId(long j) {
            copyOnWrite();
            ((CreativeContent) this.instance).setVideoId(j);
            return this;
        }

        private Builder() {
            super(CreativeContent.DEFAULT_INSTANCE);
        }
    }

    static {
        CreativeContent creativeContent = new CreativeContent();
        DEFAULT_INSTANCE = creativeContent;
        GeneratedMessageLite.registerDefaultInstance(CreativeContent.class, creativeContent);
    }

    private CreativeContent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonTitle() {
        this.buttonTitle_ = getDefaultInstance().getButtonTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickUrl() {
        this.clickUrl_ = getDefaultInstance().getClickUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageMd5() {
        this.imageMd5_ = getDefaultInstance().getImageMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogMd5() {
        this.logMd5_ = getDefaultInstance().getLogMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogUrl() {
        this.logUrl_ = getDefaultInstance().getLogUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowUrl() {
        this.showUrl_ = getDefaultInstance().getShowUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.username_ = getDefaultInstance().getUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoId() {
        this.videoId_ = 0L;
    }

    public static CreativeContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CreativeContent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreativeContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreativeContent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CreativeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CreativeContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonTitle(String str) {
        str.getClass();
        this.buttonTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buttonTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickUrl(String str) {
        str.getClass();
        this.clickUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clickUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageMd5(String str) {
        str.getClass();
        this.imageMd5_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageMd5Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imageMd5_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        str.getClass();
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imageUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogMd5(String str) {
        str.getClass();
        this.logMd5_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogMd5Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.logMd5_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogUrl(String str) {
        str.getClass();
        this.logUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.logUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowUrl(String str) {
        str.getClass();
        this.showUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.showUrl_ = byteString.toStringUtf8();
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
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        str.getClass();
        this.username_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.username_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoId(long j) {
        this.videoId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67501.f16724xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CreativeContent();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0208\u000b\u0208\f\u0208", new Object[]{"title_", "description_", "buttonTitle_", "videoId_", "username_", "imageUrl_", "imageMd5_", "logUrl_", "logMd5_", "url_", "clickUrl_", "showUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CreativeContent> parser = PARSER;
                if (parser == null) {
                    synchronized (CreativeContent.class) {
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

    public String getButtonTitle() {
        return this.buttonTitle_;
    }

    public ByteString getButtonTitleBytes() {
        return ByteString.copyFromUtf8(this.buttonTitle_);
    }

    public String getClickUrl() {
        return this.clickUrl_;
    }

    public ByteString getClickUrlBytes() {
        return ByteString.copyFromUtf8(this.clickUrl_);
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getImageMd5() {
        return this.imageMd5_;
    }

    public ByteString getImageMd5Bytes() {
        return ByteString.copyFromUtf8(this.imageMd5_);
    }

    public String getImageUrl() {
        return this.imageUrl_;
    }

    public ByteString getImageUrlBytes() {
        return ByteString.copyFromUtf8(this.imageUrl_);
    }

    public String getLogMd5() {
        return this.logMd5_;
    }

    public ByteString getLogMd5Bytes() {
        return ByteString.copyFromUtf8(this.logMd5_);
    }

    public String getLogUrl() {
        return this.logUrl_;
    }

    public ByteString getLogUrlBytes() {
        return ByteString.copyFromUtf8(this.logUrl_);
    }

    public String getShowUrl() {
        return this.showUrl_;
    }

    public ByteString getShowUrlBytes() {
        return ByteString.copyFromUtf8(this.showUrl_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public String getUsername() {
        return this.username_;
    }

    public ByteString getUsernameBytes() {
        return ByteString.copyFromUtf8(this.username_);
    }

    public long getVideoId() {
        return this.videoId_;
    }

    public static Builder newBuilder(CreativeContent creativeContent) {
        return DEFAULT_INSTANCE.createBuilder(creativeContent);
    }

    public static CreativeContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CreativeContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreativeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CreativeContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CreativeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CreativeContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreativeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CreativeContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CreativeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreativeContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreativeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CreativeContent parseFrom(InputStream inputStream) throws IOException {
        return (CreativeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreativeContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CreativeContent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CreativeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CreativeContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
