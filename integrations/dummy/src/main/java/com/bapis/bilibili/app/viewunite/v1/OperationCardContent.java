package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class OperationCardContent extends GeneratedMessageLite<OperationCardContent, OperationCardContent.C12336b> implements MessageLiteOrBuilder {
    public static final int BUTTON_SELECTED_TITLE_FIELD_NUMBER = 5;
    public static final int BUTTON_TITLE_FIELD_NUMBER = 4;
    private static final OperationCardContent DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 3;
    private static volatile Parser<OperationCardContent> PARSER = null;
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
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.OperationCardContent$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12335a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21281xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21281xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21281xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21281xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21281xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21281xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21281xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21281xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.OperationCardContent$b */
    /* loaded from: classes20.dex */
    public static final class C12336b extends GeneratedMessageLite.Builder<OperationCardContent, C12336b> implements MessageLiteOrBuilder {
        /* synthetic */ C12336b(C12335a c12335a) {
            this();
        }

        public C12336b clearButtonSelectedTitle() {
            copyOnWrite();
            ((OperationCardContent) this.instance).clearButtonSelectedTitle();
            return this;
        }

        public C12336b clearButtonTitle() {
            copyOnWrite();
            ((OperationCardContent) this.instance).clearButtonTitle();
            return this;
        }

        public C12336b clearIcon() {
            copyOnWrite();
            ((OperationCardContent) this.instance).clearIcon();
            return this;
        }

        public C12336b clearShowSelected() {
            copyOnWrite();
            ((OperationCardContent) this.instance).clearShowSelected();
            return this;
        }

        public C12336b clearSubtitle() {
            copyOnWrite();
            ((OperationCardContent) this.instance).clearSubtitle();
            return this;
        }

        public C12336b clearTitle() {
            copyOnWrite();
            ((OperationCardContent) this.instance).clearTitle();
            return this;
        }

        public String getButtonSelectedTitle() {
            return ((OperationCardContent) this.instance).getButtonSelectedTitle();
        }

        public ByteString getButtonSelectedTitleBytes() {
            return ((OperationCardContent) this.instance).getButtonSelectedTitleBytes();
        }

        public String getButtonTitle() {
            return ((OperationCardContent) this.instance).getButtonTitle();
        }

        public ByteString getButtonTitleBytes() {
            return ((OperationCardContent) this.instance).getButtonTitleBytes();
        }

        public String getIcon() {
            return ((OperationCardContent) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((OperationCardContent) this.instance).getIconBytes();
        }

        public boolean getShowSelected() {
            return ((OperationCardContent) this.instance).getShowSelected();
        }

        public String getSubtitle() {
            return ((OperationCardContent) this.instance).getSubtitle();
        }

        public ByteString getSubtitleBytes() {
            return ((OperationCardContent) this.instance).getSubtitleBytes();
        }

        public String getTitle() {
            return ((OperationCardContent) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((OperationCardContent) this.instance).getTitleBytes();
        }

        public C12336b setButtonSelectedTitle(String str) {
            copyOnWrite();
            ((OperationCardContent) this.instance).setButtonSelectedTitle(str);
            return this;
        }

        public C12336b setButtonSelectedTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCardContent) this.instance).setButtonSelectedTitleBytes(byteString);
            return this;
        }

        public C12336b setButtonTitle(String str) {
            copyOnWrite();
            ((OperationCardContent) this.instance).setButtonTitle(str);
            return this;
        }

        public C12336b setButtonTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCardContent) this.instance).setButtonTitleBytes(byteString);
            return this;
        }

        public C12336b setIcon(String str) {
            copyOnWrite();
            ((OperationCardContent) this.instance).setIcon(str);
            return this;
        }

        public C12336b setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCardContent) this.instance).setIconBytes(byteString);
            return this;
        }

        public C12336b setShowSelected(boolean z) {
            copyOnWrite();
            ((OperationCardContent) this.instance).setShowSelected(z);
            return this;
        }

        public C12336b setSubtitle(String str) {
            copyOnWrite();
            ((OperationCardContent) this.instance).setSubtitle(str);
            return this;
        }

        public C12336b setSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCardContent) this.instance).setSubtitleBytes(byteString);
            return this;
        }

        public C12336b setTitle(String str) {
            copyOnWrite();
            ((OperationCardContent) this.instance).setTitle(str);
            return this;
        }

        public C12336b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationCardContent) this.instance).setTitleBytes(byteString);
            return this;
        }

        private C12336b() {
            super(OperationCardContent.DEFAULT_INSTANCE);
        }
    }

    static {
        OperationCardContent operationCardContent = new OperationCardContent();
        DEFAULT_INSTANCE = operationCardContent;
        GeneratedMessageLite.registerDefaultInstance(OperationCardContent.class, operationCardContent);
    }

    private OperationCardContent() {
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

    public static OperationCardContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12336b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OperationCardContent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OperationCardContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationCardContent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OperationCardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OperationCardContent> parser() {
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12335a.f21281xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OperationCardContent();
            case 2:
                return new C12336b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0007", new Object[]{"title_", "subtitle_", "icon_", "buttonTitle_", "buttonSelectedTitle_", "showSelected_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OperationCardContent> parser = PARSER;
                if (parser == null) {
                    synchronized (OperationCardContent.class) {
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

    public static C12336b newBuilder(OperationCardContent operationCardContent) {
        return DEFAULT_INSTANCE.createBuilder(operationCardContent);
    }

    public static OperationCardContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCardContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationCardContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OperationCardContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OperationCardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OperationCardContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OperationCardContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OperationCardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OperationCardContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationCardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OperationCardContent parseFrom(InputStream inputStream) throws IOException {
        return (OperationCardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationCardContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationCardContent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OperationCardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OperationCardContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationCardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
