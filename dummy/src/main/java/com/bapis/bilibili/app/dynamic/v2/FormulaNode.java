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
public final class FormulaNode extends GeneratedMessageLite<FormulaNode, FormulaNode.C5503b> implements v1 {
    private static final FormulaNode DEFAULT_INSTANCE;
    public static final int IMAGE_SPEC_FIELD_NUMBER = 2;
    public static final int IMG_URL_FIELD_NUMBER = 4;
    public static final int LATEX_CONTENT_FIELD_NUMBER = 1;
    private static volatile Parser<FormulaNode> PARSER;
    private ImgInlineCfg imageSpec_;
    private String imgUrl_ = "";
    private WordNode latexContent_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.FormulaNode$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5502a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17310xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17310xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17310xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17310xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17310xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17310xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17310xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17310xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.FormulaNode$b */
    /* loaded from: classes19.dex */
    public static final class C5503b extends GeneratedMessageLite.Builder<FormulaNode, C5503b> implements v1 {
        /* synthetic */ C5503b(C5502a c5502a) {
            this();
        }

        public C5503b clearImageSpec() {
            copyOnWrite();
            ((FormulaNode) this.instance).clearImageSpec();
            return this;
        }

        public C5503b clearImgUrl() {
            copyOnWrite();
            ((FormulaNode) this.instance).clearImgUrl();
            return this;
        }

        public C5503b clearLatexContent() {
            copyOnWrite();
            ((FormulaNode) this.instance).clearLatexContent();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.v1
        public ImgInlineCfg getImageSpec() {
            return ((FormulaNode) this.instance).getImageSpec();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.v1
        public String getImgUrl() {
            return ((FormulaNode) this.instance).getImgUrl();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.v1
        public ByteString getImgUrlBytes() {
            return ((FormulaNode) this.instance).getImgUrlBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.v1
        public WordNode getLatexContent() {
            return ((FormulaNode) this.instance).getLatexContent();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.v1
        public boolean hasImageSpec() {
            return ((FormulaNode) this.instance).hasImageSpec();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.v1
        public boolean hasLatexContent() {
            return ((FormulaNode) this.instance).hasLatexContent();
        }

        public C5503b mergeImageSpec(ImgInlineCfg imgInlineCfg) {
            copyOnWrite();
            ((FormulaNode) this.instance).mergeImageSpec(imgInlineCfg);
            return this;
        }

        public C5503b mergeLatexContent(WordNode wordNode) {
            copyOnWrite();
            ((FormulaNode) this.instance).mergeLatexContent(wordNode);
            return this;
        }

        public C5503b setImageSpec(ImgInlineCfg imgInlineCfg) {
            copyOnWrite();
            ((FormulaNode) this.instance).setImageSpec(imgInlineCfg);
            return this;
        }

        public C5503b setImgUrl(String str) {
            copyOnWrite();
            ((FormulaNode) this.instance).setImgUrl(str);
            return this;
        }

        public C5503b setImgUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((FormulaNode) this.instance).setImgUrlBytes(byteString);
            return this;
        }

        public C5503b setLatexContent(WordNode wordNode) {
            copyOnWrite();
            ((FormulaNode) this.instance).setLatexContent(wordNode);
            return this;
        }

        private C5503b() {
            super(FormulaNode.DEFAULT_INSTANCE);
        }

        public C5503b setImageSpec(ImgInlineCfg.C5531b c5531b) {
            copyOnWrite();
            ((FormulaNode) this.instance).setImageSpec(c5531b.build());
            return this;
        }

        public C5503b setLatexContent(WordNode.C6126b c6126b) {
            copyOnWrite();
            ((FormulaNode) this.instance).setLatexContent(c6126b.build());
            return this;
        }
    }

    static {
        FormulaNode formulaNode = new FormulaNode();
        DEFAULT_INSTANCE = formulaNode;
        GeneratedMessageLite.registerDefaultInstance(FormulaNode.class, formulaNode);
    }

    private FormulaNode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageSpec() {
        this.imageSpec_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImgUrl() {
        this.imgUrl_ = getDefaultInstance().getImgUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatexContent() {
        this.latexContent_ = null;
    }

    public static FormulaNode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImageSpec(ImgInlineCfg imgInlineCfg) {
        imgInlineCfg.getClass();
        ImgInlineCfg imgInlineCfg2 = this.imageSpec_;
        if (imgInlineCfg2 != null && imgInlineCfg2 != ImgInlineCfg.getDefaultInstance()) {
            this.imageSpec_ = ImgInlineCfg.newBuilder(this.imageSpec_).mergeFrom((ImgInlineCfg) imgInlineCfg).buildPartial();
        } else {
            this.imageSpec_ = imgInlineCfg;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLatexContent(WordNode wordNode) {
        wordNode.getClass();
        WordNode wordNode2 = this.latexContent_;
        if (wordNode2 != null && wordNode2 != WordNode.getDefaultInstance()) {
            this.latexContent_ = WordNode.newBuilder(this.latexContent_).mergeFrom((WordNode) wordNode).buildPartial();
        } else {
            this.latexContent_ = wordNode;
        }
    }

    public static C5503b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FormulaNode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FormulaNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FormulaNode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FormulaNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FormulaNode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageSpec(ImgInlineCfg imgInlineCfg) {
        imgInlineCfg.getClass();
        this.imageSpec_ = imgInlineCfg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgUrl(String str) {
        str.getClass();
        this.imgUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imgUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatexContent(WordNode wordNode) {
        wordNode.getClass();
        this.latexContent_ = wordNode;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5502a c5502a = null;
        switch (C5502a.f17310xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FormulaNode();
            case 2:
                return new C5503b(c5502a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0004\u0208", new Object[]{"latexContent_", "imageSpec_", "imgUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FormulaNode> parser = PARSER;
                if (parser == null) {
                    synchronized (FormulaNode.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.v1
    public ImgInlineCfg getImageSpec() {
        ImgInlineCfg imgInlineCfg = this.imageSpec_;
        return imgInlineCfg == null ? ImgInlineCfg.getDefaultInstance() : imgInlineCfg;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.v1
    public String getImgUrl() {
        return this.imgUrl_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.v1
    public ByteString getImgUrlBytes() {
        return ByteString.copyFromUtf8(this.imgUrl_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.v1
    public WordNode getLatexContent() {
        WordNode wordNode = this.latexContent_;
        return wordNode == null ? WordNode.getDefaultInstance() : wordNode;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.v1
    public boolean hasImageSpec() {
        return this.imageSpec_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.v1
    public boolean hasLatexContent() {
        return this.latexContent_ != null;
    }

    public static C5503b newBuilder(FormulaNode formulaNode) {
        return DEFAULT_INSTANCE.createBuilder(formulaNode);
    }

    public static FormulaNode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FormulaNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FormulaNode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FormulaNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FormulaNode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FormulaNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FormulaNode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FormulaNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FormulaNode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FormulaNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FormulaNode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FormulaNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FormulaNode parseFrom(InputStream inputStream) throws IOException {
        return (FormulaNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FormulaNode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FormulaNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FormulaNode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FormulaNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FormulaNode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FormulaNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
