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
public final class StandardCard extends GeneratedMessageLite<StandardCard, StandardCard.Builder> implements MessageLiteOrBuilder {
    public static final int BUTTON_SELECTED_TITLE_FIELD_NUMBER = 3;
    public static final int BUTTON_TITLE_FIELD_NUMBER = 2;
    private static final StandardCard DEFAULT_INSTANCE;
    private static volatile Parser<StandardCard> PARSER = null;
    public static final int SHOW_SELECTED_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    private boolean showSelected_;
    private String title_ = "";
    private String buttonTitle_ = "";
    private String buttonSelectedTitle_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.StandardCard$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16825xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16825xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16825xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16825xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16825xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16825xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16825xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16825xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<StandardCard, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68661 c68661) {
            this();
        }

        public Builder clearButtonSelectedTitle() {
            copyOnWrite();
            ((StandardCard) this.instance).clearButtonSelectedTitle();
            return this;
        }

        public Builder clearButtonTitle() {
            copyOnWrite();
            ((StandardCard) this.instance).clearButtonTitle();
            return this;
        }

        public Builder clearShowSelected() {
            copyOnWrite();
            ((StandardCard) this.instance).clearShowSelected();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((StandardCard) this.instance).clearTitle();
            return this;
        }

        public String getButtonSelectedTitle() {
            return ((StandardCard) this.instance).getButtonSelectedTitle();
        }

        public ByteString getButtonSelectedTitleBytes() {
            return ((StandardCard) this.instance).getButtonSelectedTitleBytes();
        }

        public String getButtonTitle() {
            return ((StandardCard) this.instance).getButtonTitle();
        }

        public ByteString getButtonTitleBytes() {
            return ((StandardCard) this.instance).getButtonTitleBytes();
        }

        public boolean getShowSelected() {
            return ((StandardCard) this.instance).getShowSelected();
        }

        public String getTitle() {
            return ((StandardCard) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((StandardCard) this.instance).getTitleBytes();
        }

        public Builder setButtonSelectedTitle(String str) {
            copyOnWrite();
            ((StandardCard) this.instance).setButtonSelectedTitle(str);
            return this;
        }

        public Builder setButtonSelectedTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((StandardCard) this.instance).setButtonSelectedTitleBytes(byteString);
            return this;
        }

        public Builder setButtonTitle(String str) {
            copyOnWrite();
            ((StandardCard) this.instance).setButtonTitle(str);
            return this;
        }

        public Builder setButtonTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((StandardCard) this.instance).setButtonTitleBytes(byteString);
            return this;
        }

        public Builder setShowSelected(boolean z) {
            copyOnWrite();
            ((StandardCard) this.instance).setShowSelected(z);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((StandardCard) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((StandardCard) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(StandardCard.DEFAULT_INSTANCE);
        }
    }

    static {
        StandardCard standardCard = new StandardCard();
        DEFAULT_INSTANCE = standardCard;
        GeneratedMessageLite.registerDefaultInstance(StandardCard.class, standardCard);
    }

    private StandardCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonSelectedTitle() {
        this.buttonSelectedTitle_ = getDefaultInstance().getButtonSelectedTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonTitle() {
        this.buttonTitle_ = getDefaultInstance().getButtonTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowSelected() {
        this.showSelected_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static StandardCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static StandardCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StandardCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StandardCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StandardCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<StandardCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonSelectedTitle(String str) {
        str.getClass();
        this.buttonSelectedTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonSelectedTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buttonSelectedTitle_ = byteString.toStringUtf8();
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
    public void setShowSelected(boolean z) {
        this.showSelected_ = z;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68661.f16825xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new StandardCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0007", new Object[]{"title_", "buttonTitle_", "buttonSelectedTitle_", "showSelected_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<StandardCard> parser = PARSER;
                if (parser == null) {
                    synchronized (StandardCard.class) {
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

    public String getButtonSelectedTitle() {
        return this.buttonSelectedTitle_;
    }

    public ByteString getButtonSelectedTitleBytes() {
        return ByteString.copyFromUtf8(this.buttonSelectedTitle_);
    }

    public String getButtonTitle() {
        return this.buttonTitle_;
    }

    public ByteString getButtonTitleBytes() {
        return ByteString.copyFromUtf8(this.buttonTitle_);
    }

    public boolean getShowSelected() {
        return this.showSelected_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(StandardCard standardCard) {
        return DEFAULT_INSTANCE.createBuilder(standardCard);
    }

    public static StandardCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StandardCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StandardCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StandardCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static StandardCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StandardCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static StandardCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StandardCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static StandardCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StandardCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StandardCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StandardCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static StandardCard parseFrom(InputStream inputStream) throws IOException {
        return (StandardCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StandardCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StandardCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StandardCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StandardCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StandardCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StandardCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
