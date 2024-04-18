package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes19.dex */
public final class CodeParagraph extends GeneratedMessageLite<CodeParagraph, CodeParagraph.C5303b> implements s0 {
    public static final int BAR_ICON_FIELD_NUMBER = 4;
    public static final int BAR_NOTICE_FIELD_NUMBER = 5;
    public static final int BTN_TEXT_FIELD_NUMBER = 6;
    public static final int CODE_CONTENT_FIELD_NUMBER = 2;
    public static final int CODE_LANG_FIELD_NUMBER = 1;
    private static final CodeParagraph DEFAULT_INSTANCE;
    private static volatile Parser<CodeParagraph> PARSER = null;
    public static final int POPUP_LINK_FIELD_NUMBER = 3;
    private String codeLang_ = "";
    private String codeContent_ = "";
    private String popupLink_ = "";
    private String barIcon_ = "";
    private String barNotice_ = "";
    private String btnText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.CodeParagraph$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5302a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17227xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17227xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17227xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17227xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17227xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17227xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17227xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17227xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.CodeParagraph$b */
    /* loaded from: classes19.dex */
    public static final class C5303b extends GeneratedMessageLite.Builder<CodeParagraph, C5303b> implements s0 {
        /* synthetic */ C5303b(C5302a c5302a) {
            this();
        }

        public C5303b clearBarIcon() {
            copyOnWrite();
            ((CodeParagraph) this.instance).clearBarIcon();
            return this;
        }

        public C5303b clearBarNotice() {
            copyOnWrite();
            ((CodeParagraph) this.instance).clearBarNotice();
            return this;
        }

        public C5303b clearBtnText() {
            copyOnWrite();
            ((CodeParagraph) this.instance).clearBtnText();
            return this;
        }

        public C5303b clearCodeContent() {
            copyOnWrite();
            ((CodeParagraph) this.instance).clearCodeContent();
            return this;
        }

        public C5303b clearCodeLang() {
            copyOnWrite();
            ((CodeParagraph) this.instance).clearCodeLang();
            return this;
        }

        public C5303b clearPopupLink() {
            copyOnWrite();
            ((CodeParagraph) this.instance).clearPopupLink();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.s0
        public String getBarIcon() {
            return ((CodeParagraph) this.instance).getBarIcon();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.s0
        public ByteString getBarIconBytes() {
            return ((CodeParagraph) this.instance).getBarIconBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.s0
        public String getBarNotice() {
            return ((CodeParagraph) this.instance).getBarNotice();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.s0
        public ByteString getBarNoticeBytes() {
            return ((CodeParagraph) this.instance).getBarNoticeBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.s0
        public String getBtnText() {
            return ((CodeParagraph) this.instance).getBtnText();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.s0
        public ByteString getBtnTextBytes() {
            return ((CodeParagraph) this.instance).getBtnTextBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.s0
        public String getCodeContent() {
            return ((CodeParagraph) this.instance).getCodeContent();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.s0
        public ByteString getCodeContentBytes() {
            return ((CodeParagraph) this.instance).getCodeContentBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.s0
        public String getCodeLang() {
            return ((CodeParagraph) this.instance).getCodeLang();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.s0
        public ByteString getCodeLangBytes() {
            return ((CodeParagraph) this.instance).getCodeLangBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.s0
        public String getPopupLink() {
            return ((CodeParagraph) this.instance).getPopupLink();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.s0
        public ByteString getPopupLinkBytes() {
            return ((CodeParagraph) this.instance).getPopupLinkBytes();
        }

        public C5303b setBarIcon(String str) {
            copyOnWrite();
            ((CodeParagraph) this.instance).setBarIcon(str);
            return this;
        }

        public C5303b setBarIconBytes(ByteString byteString) {
            copyOnWrite();
            ((CodeParagraph) this.instance).setBarIconBytes(byteString);
            return this;
        }

        public C5303b setBarNotice(String str) {
            copyOnWrite();
            ((CodeParagraph) this.instance).setBarNotice(str);
            return this;
        }

        public C5303b setBarNoticeBytes(ByteString byteString) {
            copyOnWrite();
            ((CodeParagraph) this.instance).setBarNoticeBytes(byteString);
            return this;
        }

        public C5303b setBtnText(String str) {
            copyOnWrite();
            ((CodeParagraph) this.instance).setBtnText(str);
            return this;
        }

        public C5303b setBtnTextBytes(ByteString byteString) {
            copyOnWrite();
            ((CodeParagraph) this.instance).setBtnTextBytes(byteString);
            return this;
        }

        public C5303b setCodeContent(String str) {
            copyOnWrite();
            ((CodeParagraph) this.instance).setCodeContent(str);
            return this;
        }

        public C5303b setCodeContentBytes(ByteString byteString) {
            copyOnWrite();
            ((CodeParagraph) this.instance).setCodeContentBytes(byteString);
            return this;
        }

        public C5303b setCodeLang(String str) {
            copyOnWrite();
            ((CodeParagraph) this.instance).setCodeLang(str);
            return this;
        }

        public C5303b setCodeLangBytes(ByteString byteString) {
            copyOnWrite();
            ((CodeParagraph) this.instance).setCodeLangBytes(byteString);
            return this;
        }

        public C5303b setPopupLink(String str) {
            copyOnWrite();
            ((CodeParagraph) this.instance).setPopupLink(str);
            return this;
        }

        public C5303b setPopupLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((CodeParagraph) this.instance).setPopupLinkBytes(byteString);
            return this;
        }

        private C5303b() {
            super(CodeParagraph.DEFAULT_INSTANCE);
        }
    }

    static {
        CodeParagraph codeParagraph = new CodeParagraph();
        DEFAULT_INSTANCE = codeParagraph;
        GeneratedMessageLite.registerDefaultInstance(CodeParagraph.class, codeParagraph);
    }

    private CodeParagraph() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBarIcon() {
        this.barIcon_ = getDefaultInstance().getBarIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBarNotice() {
        this.barNotice_ = getDefaultInstance().getBarNotice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBtnText() {
        this.btnText_ = getDefaultInstance().getBtnText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodeContent() {
        this.codeContent_ = getDefaultInstance().getCodeContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodeLang() {
        this.codeLang_ = getDefaultInstance().getCodeLang();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopupLink() {
        this.popupLink_ = getDefaultInstance().getPopupLink();
    }

    public static CodeParagraph getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5303b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CodeParagraph parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CodeParagraph) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CodeParagraph parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CodeParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CodeParagraph> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBarIcon(String str) {
        str.getClass();
        this.barIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBarIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.barIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBarNotice(String str) {
        str.getClass();
        this.barNotice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBarNoticeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.barNotice_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtnText(String str) {
        str.getClass();
        this.btnText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtnTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.btnText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeContent(String str) {
        str.getClass();
        this.codeContent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.codeContent_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeLang(String str) {
        str.getClass();
        this.codeLang_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeLangBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.codeLang_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupLink(String str) {
        str.getClass();
        this.popupLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.popupLink_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5302a c5302a = null;
        switch (C5302a.f17227xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CodeParagraph();
            case 2:
                return new C5303b(c5302a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208", new Object[]{"codeLang_", "codeContent_", "popupLink_", "barIcon_", "barNotice_", "btnText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CodeParagraph> parser = PARSER;
                if (parser == null) {
                    synchronized (CodeParagraph.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.s0
    public String getBarIcon() {
        return this.barIcon_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.s0
    public ByteString getBarIconBytes() {
        return ByteString.copyFromUtf8(this.barIcon_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.s0
    public String getBarNotice() {
        return this.barNotice_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.s0
    public ByteString getBarNoticeBytes() {
        return ByteString.copyFromUtf8(this.barNotice_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.s0
    public String getBtnText() {
        return this.btnText_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.s0
    public ByteString getBtnTextBytes() {
        return ByteString.copyFromUtf8(this.btnText_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.s0
    public String getCodeContent() {
        return this.codeContent_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.s0
    public ByteString getCodeContentBytes() {
        return ByteString.copyFromUtf8(this.codeContent_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.s0
    public String getCodeLang() {
        return this.codeLang_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.s0
    public ByteString getCodeLangBytes() {
        return ByteString.copyFromUtf8(this.codeLang_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.s0
    public String getPopupLink() {
        return this.popupLink_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.s0
    public ByteString getPopupLinkBytes() {
        return ByteString.copyFromUtf8(this.popupLink_);
    }

    public static C5303b newBuilder(CodeParagraph codeParagraph) {
        return DEFAULT_INSTANCE.createBuilder(codeParagraph);
    }

    public static CodeParagraph parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CodeParagraph) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CodeParagraph parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CodeParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CodeParagraph parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CodeParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CodeParagraph parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CodeParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CodeParagraph parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CodeParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CodeParagraph parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CodeParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CodeParagraph parseFrom(InputStream inputStream) throws IOException {
        return (CodeParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CodeParagraph parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CodeParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CodeParagraph parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CodeParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CodeParagraph parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CodeParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
