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
public final class OperationCardV2Content extends GeneratedMessageLite<OperationCardV2Content, OperationCardV2Content.Builder> implements MessageLiteOrBuilder {
    public static final int BUTTON_SELECTED_TITLE_FIELD_NUMBER = 5;
    public static final int BUTTON_TITLE_FIELD_NUMBER = 4;
    private static final OperationCardV2Content DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 3;
    private static volatile Parser<OperationCardV2Content> PARSER = null;
    public static final int SHOW_SELECTED_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private boolean showSelected_;
    private String title_ = "";
    private String subtitle_ = "";
    private String icon_ = "";
    private String buttonTitle_ = "";
    private String buttonSelectedTitle_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.OperationCardV2Content$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68081 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16773xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16773xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16773xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16773xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16773xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16773xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16773xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16773xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OperationCardV2Content, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68081 c68081) {
            this();
        }

        public Builder clearButtonSelectedTitle() {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).clearButtonSelectedTitle();
            return this;
        }

        public Builder clearButtonTitle() {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).clearButtonTitle();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).clearIcon();
            return this;
        }

        public Builder clearShowSelected() {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).clearShowSelected();
            return this;
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).clearTitle();
            return this;
        }

        public String getButtonSelectedTitle() {
            return ((OperationCardV2Content) this.instance).getButtonSelectedTitle();
        }

        public ByteString getButtonSelectedTitleBytes() {
            return ((OperationCardV2Content) this.instance).getButtonSelectedTitleBytes();
        }

        public String getButtonTitle() {
            return ((OperationCardV2Content) this.instance).getButtonTitle();
        }

        public ByteString getButtonTitleBytes() {
            return ((OperationCardV2Content) this.instance).getButtonTitleBytes();
        }

        public String getIcon() {
            return ((OperationCardV2Content) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((OperationCardV2Content) this.instance).getIconBytes();
        }

        public boolean getShowSelected() {
            return ((OperationCardV2Content) this.instance).getShowSelected();
        }

        public String getSubtitle() {
            return ((OperationCardV2Content) this.instance).getSubtitle();
        }

        public ByteString getSubtitleBytes() {
            return ((OperationCardV2Content) this.instance).getSubtitleBytes();
        }

        public String getTitle() {
            return ((OperationCardV2Content) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((OperationCardV2Content) this.instance).getTitleBytes();
        }

        public Builder setButtonSelectedTitle(String str) {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).setButtonSelectedTitle(str);
            return this;
        }

        public Builder setButtonSelectedTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).setButtonSelectedTitleBytes(byteString);
            return this;
        }

        public Builder setButtonTitle(String str) {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).setButtonTitle(str);
            return this;
        }

        public Builder setButtonTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).setButtonTitleBytes(byteString);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setShowSelected(boolean z) {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).setShowSelected(z);
            return this;
        }

        public Builder setSubtitle(String str) {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).setSubtitle(str);
            return this;
        }

        public Builder setSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).setSubtitleBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCardV2Content) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(OperationCardV2Content.DEFAULT_INSTANCE);
        }
    }

    static {
        OperationCardV2Content operationCardV2Content = new OperationCardV2Content();
        DEFAULT_INSTANCE = operationCardV2Content;
        GeneratedMessageLite.registerDefaultInstance(OperationCardV2Content.class, operationCardV2Content);
    }

    private OperationCardV2Content() {
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
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowSelected() {
        this.showSelected_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static OperationCardV2Content getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OperationCardV2Content parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OperationCardV2Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationCardV2Content parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OperationCardV2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OperationCardV2Content> parser() {
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
    public void setShowSelected(boolean z) {
        this.showSelected_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        str.getClass();
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subtitle_ = byteString.toStringUtf8();
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
        switch (C68081.f16773xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OperationCardV2Content();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0007", new Object[]{"title_", "subtitle_", "icon_", "buttonTitle_", "buttonSelectedTitle_", "showSelected_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OperationCardV2Content> parser = PARSER;
                if (parser == null) {
                    synchronized (OperationCardV2Content.class) {
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

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public boolean getShowSelected() {
        return this.showSelected_;
    }

    public String getSubtitle() {
        return this.subtitle_;
    }

    public ByteString getSubtitleBytes() {
        return ByteString.copyFromUtf8(this.subtitle_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(OperationCardV2Content operationCardV2Content) {
        return DEFAULT_INSTANCE.createBuilder(operationCardV2Content);
    }

    public static OperationCardV2Content parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCardV2Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationCardV2Content parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCardV2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OperationCardV2Content parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OperationCardV2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OperationCardV2Content parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCardV2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OperationCardV2Content parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OperationCardV2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OperationCardV2Content parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCardV2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OperationCardV2Content parseFrom(InputStream inputStream) throws IOException {
        return (OperationCardV2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationCardV2Content parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCardV2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationCardV2Content parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OperationCardV2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OperationCardV2Content parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCardV2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
