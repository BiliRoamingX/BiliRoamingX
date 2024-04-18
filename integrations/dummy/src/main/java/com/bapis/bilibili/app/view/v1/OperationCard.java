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
public final class OperationCard extends GeneratedMessageLite<OperationCard, OperationCard.Builder> implements OperationCardOrBuilder {
    public static final int BUTTON_TEXT_FIELD_NUMBER = 5;
    public static final int CONTENT_FIELD_NUMBER = 7;
    private static final OperationCard DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 2;
    public static final int ICON_FIELD_NUMBER = 3;
    private static volatile Parser<OperationCard> PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int URL_FIELD_NUMBER = 6;
    private int endTime_;
    private int startTime_;
    private String icon_ = "";
    private String title_ = "";
    private String buttonText_ = "";
    private String url_ = "";
    private String content_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.OperationCard$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68041 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16770xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16770xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16770xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16770xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16770xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16770xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16770xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16770xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OperationCard, Builder> implements OperationCardOrBuilder {
        /* synthetic */ Builder(C68041 c68041) {
            this();
        }

        public Builder clearButtonText() {
            copyOnWrite();
            ((OperationCard) this.instance).clearButtonText();
            return this;
        }

        public Builder clearContent() {
            copyOnWrite();
            ((OperationCard) this.instance).clearContent();
            return this;
        }

        public Builder clearEndTime() {
            copyOnWrite();
            ((OperationCard) this.instance).clearEndTime();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((OperationCard) this.instance).clearIcon();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((OperationCard) this.instance).clearStartTime();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((OperationCard) this.instance).clearTitle();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((OperationCard) this.instance).clearUrl();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
        public String getButtonText() {
            return ((OperationCard) this.instance).getButtonText();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
        public ByteString getButtonTextBytes() {
            return ((OperationCard) this.instance).getButtonTextBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
        public String getContent() {
            return ((OperationCard) this.instance).getContent();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
        public ByteString getContentBytes() {
            return ((OperationCard) this.instance).getContentBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
        public int getEndTime() {
            return ((OperationCard) this.instance).getEndTime();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
        public String getIcon() {
            return ((OperationCard) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
        public ByteString getIconBytes() {
            return ((OperationCard) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
        public int getStartTime() {
            return ((OperationCard) this.instance).getStartTime();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
        public String getTitle() {
            return ((OperationCard) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
        public ByteString getTitleBytes() {
            return ((OperationCard) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
        public String getUrl() {
            return ((OperationCard) this.instance).getUrl();
        }

        @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
        public ByteString getUrlBytes() {
            return ((OperationCard) this.instance).getUrlBytes();
        }

        public Builder setButtonText(String str) {
            copyOnWrite();
            ((OperationCard) this.instance).setButtonText(str);
            return this;
        }

        public Builder setButtonTextBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCard) this.instance).setButtonTextBytes(byteString);
            return this;
        }

        public Builder setContent(String str) {
            copyOnWrite();
            ((OperationCard) this.instance).setContent(str);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCard) this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((OperationCard) this.instance).setEndTime(i);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((OperationCard) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCard) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((OperationCard) this.instance).setStartTime(i);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((OperationCard) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCard) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((OperationCard) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCard) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(OperationCard.DEFAULT_INSTANCE);
        }
    }

    static {
        OperationCard operationCard = new OperationCard();
        DEFAULT_INSTANCE = operationCard;
        GeneratedMessageLite.registerDefaultInstance(OperationCard.class, operationCard);
    }

    private OperationCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonText() {
        this.buttonText_ = getDefaultInstance().getButtonText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static OperationCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OperationCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OperationCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OperationCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonText(String str) {
        str.getClass();
        this.buttonText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buttonText_ = byteString.toStringUtf8();
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
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68041.f16770xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OperationCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208", new Object[]{"startTime_", "endTime_", "icon_", "title_", "buttonText_", "url_", "content_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OperationCard> parser = PARSER;
                if (parser == null) {
                    synchronized (OperationCard.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
    public String getButtonText() {
        return this.buttonText_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
    public ByteString getButtonTextBytes() {
        return ByteString.copyFromUtf8(this.buttonText_);
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
    public String getContent() {
        return this.content_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bapis.bilibili.app.view.v1.OperationCardOrBuilder
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(OperationCard operationCard) {
        return DEFAULT_INSTANCE.createBuilder(operationCard);
    }

    public static OperationCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OperationCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OperationCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OperationCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OperationCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OperationCard parseFrom(InputStream inputStream) throws IOException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OperationCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
