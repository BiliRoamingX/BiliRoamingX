package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes19.dex */
public final class TextNode extends GeneratedMessageLite<TextNode, TextNode.C6001b> implements ic {
    private static final TextNode DEFAULT_INSTANCE;
    public static final int EMOTE_FIELD_NUMBER = 4;
    public static final int FORMULA_FIELD_NUMBER = 6;
    public static final int LINK_FIELD_NUMBER = 5;
    public static final int NODE_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<TextNode> PARSER = null;
    public static final int RAW_TEXT_FIELD_NUMBER = 2;
    public static final int WORD_FIELD_NUMBER = 3;
    private int nodeType_;
    private Object text_;
    private int textCase_ = 0;
    private String rawText_ = "";

    /* compiled from: BL */
    /* loaded from: classes19.dex */
    public enum TextCase {
        WORD(3),
        EMOTE(4),
        LINK(5),
        FORMULA(6),
        TEXT_NOT_SET(0);

        private final int value;

        TextCase(int i2) {
            this.value = i2;
        }

        public static TextCase forNumber(int i2) {
            if (i2 == 0) {
                return TEXT_NOT_SET;
            }
            if (i2 == 3) {
                return WORD;
            }
            if (i2 == 4) {
                return EMOTE;
            }
            if (i2 == 5) {
                return LINK;
            }
            if (i2 != 6) {
                return null;
            }
            return FORMULA;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TextCase valueOf(int i2) {
            return forNumber(i2);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes19.dex */
    public enum TextNodeType implements Internal.EnumLite {
        INVALID(0),
        WORDS(1),
        EMOTE(2),
        AT(3),
        BIZ_LINK(4),
        FORMULA(5),
        UNRECOGNIZED(-1);

        public static final int AT_VALUE = 3;
        public static final int BIZ_LINK_VALUE = 4;
        public static final int EMOTE_VALUE = 2;
        public static final int FORMULA_VALUE = 5;
        public static final int INVALID_VALUE = 0;
        public static final int WORDS_VALUE = 1;
        private static final Internal.EnumLiteMap<TextNodeType> internalValueMap = new C5998a();
        private final int value;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.dynamic.v2.TextNode$TextNodeType$a */
        /* loaded from: classes19.dex */
        static class C5998a implements Internal.EnumLiteMap<TextNodeType> {
            C5998a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TextNodeType findValueByNumber(int i2) {
                return TextNodeType.forNumber(i2);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.dynamic.v2.TextNode$TextNodeType$b */
        /* loaded from: classes19.dex */
        private static final class C5999b implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new C5999b();

            private C5999b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i2) {
                return TextNodeType.forNumber(i2) != null;
            }
        }

        TextNodeType(int i2) {
            this.value = i2;
        }

        public static TextNodeType forNumber(int i2) {
            if (i2 == 0) {
                return INVALID;
            }
            if (i2 == 1) {
                return WORDS;
            }
            if (i2 == 2) {
                return EMOTE;
            }
            if (i2 == 3) {
                return AT;
            }
            if (i2 == 4) {
                return BIZ_LINK;
            }
            if (i2 != 5) {
                return null;
            }
            return FORMULA;
        }

        public static Internal.EnumLiteMap<TextNodeType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C5999b.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static TextNodeType valueOf(int i2) {
            return forNumber(i2);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.TextNode$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C6000a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17481xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17481xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17481xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17481xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17481xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17481xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17481xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17481xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.TextNode$b */
    /* loaded from: classes19.dex */
    public static final class C6001b extends GeneratedMessageLite.Builder<TextNode, C6001b> implements ic {
        /* synthetic */ C6001b(C6000a c6000a) {
            this();
        }

        public C6001b clearEmote() {
            copyOnWrite();
            ((TextNode) this.instance).clearEmote();
            return this;
        }

        public C6001b clearFormula() {
            copyOnWrite();
            ((TextNode) this.instance).clearFormula();
            return this;
        }

        public C6001b clearLink() {
            copyOnWrite();
            ((TextNode) this.instance).clearLink();
            return this;
        }

        public C6001b clearNodeType() {
            copyOnWrite();
            ((TextNode) this.instance).clearNodeType();
            return this;
        }

        public C6001b clearRawText() {
            copyOnWrite();
            ((TextNode) this.instance).clearRawText();
            return this;
        }

        public C6001b clearText() {
            copyOnWrite();
            ((TextNode) this.instance).clearText();
            return this;
        }

        public C6001b clearWord() {
            copyOnWrite();
            ((TextNode) this.instance).clearWord();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public EmoteNode getEmote() {
            return ((TextNode) this.instance).getEmote();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public FormulaNode getFormula() {
            return ((TextNode) this.instance).getFormula();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public LinkNode getLink() {
            return ((TextNode) this.instance).getLink();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public TextNodeType getNodeType() {
            return ((TextNode) this.instance).getNodeType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public int getNodeTypeValue() {
            return ((TextNode) this.instance).getNodeTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public String getRawText() {
            return ((TextNode) this.instance).getRawText();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public ByteString getRawTextBytes() {
            return ((TextNode) this.instance).getRawTextBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public TextCase getTextCase() {
            return ((TextNode) this.instance).getTextCase();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public WordNode getWord() {
            return ((TextNode) this.instance).getWord();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public boolean hasEmote() {
            return ((TextNode) this.instance).hasEmote();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public boolean hasFormula() {
            return ((TextNode) this.instance).hasFormula();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public boolean hasLink() {
            return ((TextNode) this.instance).hasLink();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ic
        public boolean hasWord() {
            return ((TextNode) this.instance).hasWord();
        }

        public C6001b mergeEmote(EmoteNode emoteNode) {
            copyOnWrite();
            ((TextNode) this.instance).mergeEmote(emoteNode);
            return this;
        }

        public C6001b mergeFormula(FormulaNode formulaNode) {
            copyOnWrite();
            ((TextNode) this.instance).mergeFormula(formulaNode);
            return this;
        }

        public C6001b mergeLink(LinkNode linkNode) {
            copyOnWrite();
            ((TextNode) this.instance).mergeLink(linkNode);
            return this;
        }

        public C6001b mergeWord(WordNode wordNode) {
            copyOnWrite();
            ((TextNode) this.instance).mergeWord(wordNode);
            return this;
        }

        public C6001b setEmote(EmoteNode emoteNode) {
            copyOnWrite();
            ((TextNode) this.instance).setEmote(emoteNode);
            return this;
        }

        public C6001b setFormula(FormulaNode formulaNode) {
            copyOnWrite();
            ((TextNode) this.instance).setFormula(formulaNode);
            return this;
        }

        public C6001b setLink(LinkNode linkNode) {
            copyOnWrite();
            ((TextNode) this.instance).setLink(linkNode);
            return this;
        }

        public C6001b setNodeType(TextNodeType textNodeType) {
            copyOnWrite();
            ((TextNode) this.instance).setNodeType(textNodeType);
            return this;
        }

        public C6001b setNodeTypeValue(int i2) {
            copyOnWrite();
            ((TextNode) this.instance).setNodeTypeValue(i2);
            return this;
        }

        public C6001b setRawText(String str) {
            copyOnWrite();
            ((TextNode) this.instance).setRawText(str);
            return this;
        }

        public C6001b setRawTextBytes(ByteString byteString) {
            copyOnWrite();
            ((TextNode) this.instance).setRawTextBytes(byteString);
            return this;
        }

        public C6001b setWord(WordNode wordNode) {
            copyOnWrite();
            ((TextNode) this.instance).setWord(wordNode);
            return this;
        }

        private C6001b() {
            super(TextNode.DEFAULT_INSTANCE);
        }

        public C6001b setEmote(EmoteNode.C5458b c5458b) {
            copyOnWrite();
            ((TextNode) this.instance).setEmote(c5458b.build());
            return this;
        }

        public C6001b setFormula(FormulaNode.C5503b c5503b) {
            copyOnWrite();
            ((TextNode) this.instance).setFormula(c5503b.build());
            return this;
        }

        public C6001b setLink(LinkNode.C5642b c5642b) {
            copyOnWrite();
            ((TextNode) this.instance).setLink(c5642b.build());
            return this;
        }

        public C6001b setWord(WordNode.C6126b c6126b) {
            copyOnWrite();
            ((TextNode) this.instance).setWord(c6126b.build());
            return this;
        }
    }

    static {
        TextNode textNode = new TextNode();
        DEFAULT_INSTANCE = textNode;
        GeneratedMessageLite.registerDefaultInstance(TextNode.class, textNode);
    }

    private TextNode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmote() {
        if (this.textCase_ == 4) {
            this.textCase_ = 0;
            this.text_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFormula() {
        if (this.textCase_ == 6) {
            this.textCase_ = 0;
            this.text_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        if (this.textCase_ == 5) {
            this.textCase_ = 0;
            this.text_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeType() {
        this.nodeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawText() {
        this.rawText_ = getDefaultInstance().getRawText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.textCase_ = 0;
        this.text_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWord() {
        if (this.textCase_ == 3) {
            this.textCase_ = 0;
            this.text_ = null;
        }
    }

    public static TextNode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmote(EmoteNode emoteNode) {
        emoteNode.getClass();
        if (this.textCase_ == 4 && this.text_ != EmoteNode.getDefaultInstance()) {
            this.text_ = EmoteNode.newBuilder((EmoteNode) this.text_).mergeFrom((EmoteNode) emoteNode).buildPartial();
        } else {
            this.text_ = emoteNode;
        }
        this.textCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFormula(FormulaNode formulaNode) {
        formulaNode.getClass();
        if (this.textCase_ == 6 && this.text_ != FormulaNode.getDefaultInstance()) {
            this.text_ = FormulaNode.newBuilder((FormulaNode) this.text_).mergeFrom((FormulaNode) formulaNode).buildPartial();
        } else {
            this.text_ = formulaNode;
        }
        this.textCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLink(LinkNode linkNode) {
        linkNode.getClass();
        if (this.textCase_ == 5 && this.text_ != LinkNode.getDefaultInstance()) {
            this.text_ = LinkNode.newBuilder((LinkNode) this.text_).mergeFrom((LinkNode) linkNode).buildPartial();
        } else {
            this.text_ = linkNode;
        }
        this.textCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWord(WordNode wordNode) {
        wordNode.getClass();
        if (this.textCase_ == 3 && this.text_ != WordNode.getDefaultInstance()) {
            this.text_ = WordNode.newBuilder((WordNode) this.text_).mergeFrom((WordNode) wordNode).buildPartial();
        } else {
            this.text_ = wordNode;
        }
        this.textCase_ = 3;
    }

    public static C6001b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TextNode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TextNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextNode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TextNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TextNode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmote(EmoteNode emoteNode) {
        emoteNode.getClass();
        this.text_ = emoteNode;
        this.textCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFormula(FormulaNode formulaNode) {
        formulaNode.getClass();
        this.text_ = formulaNode;
        this.textCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(LinkNode linkNode) {
        linkNode.getClass();
        this.text_ = linkNode;
        this.textCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeType(TextNodeType textNodeType) {
        this.nodeType_ = textNodeType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeTypeValue(int i2) {
        this.nodeType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawText(String str) {
        str.getClass();
        this.rawText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rawText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWord(WordNode wordNode) {
        wordNode.getClass();
        this.text_ = wordNode;
        this.textCase_ = 3;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C6000a c6000a = null;
        switch (C6000a.f17481xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TextNode();
            case 2:
                return new C6001b(c6000a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"text_", "textCase_", "nodeType_", "rawText_", WordNode.class, EmoteNode.class, LinkNode.class, FormulaNode.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TextNode> parser = PARSER;
                if (parser == null) {
                    synchronized (TextNode.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public EmoteNode getEmote() {
        if (this.textCase_ == 4) {
            return (EmoteNode) this.text_;
        }
        return EmoteNode.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public FormulaNode getFormula() {
        if (this.textCase_ == 6) {
            return (FormulaNode) this.text_;
        }
        return FormulaNode.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public LinkNode getLink() {
        if (this.textCase_ == 5) {
            return (LinkNode) this.text_;
        }
        return LinkNode.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public TextNodeType getNodeType() {
        TextNodeType forNumber = TextNodeType.forNumber(this.nodeType_);
        return forNumber == null ? TextNodeType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public int getNodeTypeValue() {
        return this.nodeType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public String getRawText() {
        return this.rawText_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public ByteString getRawTextBytes() {
        return ByteString.copyFromUtf8(this.rawText_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public TextCase getTextCase() {
        return TextCase.forNumber(this.textCase_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public WordNode getWord() {
        if (this.textCase_ == 3) {
            return (WordNode) this.text_;
        }
        return WordNode.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public boolean hasEmote() {
        return this.textCase_ == 4;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public boolean hasFormula() {
        return this.textCase_ == 6;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public boolean hasLink() {
        return this.textCase_ == 5;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ic
    public boolean hasWord() {
        return this.textCase_ == 3;
    }

    public static C6001b newBuilder(TextNode textNode) {
        return DEFAULT_INSTANCE.createBuilder(textNode);
    }

    public static TextNode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextNode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TextNode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TextNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TextNode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TextNode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TextNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TextNode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TextNode parseFrom(InputStream inputStream) throws IOException {
        return (TextNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextNode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextNode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TextNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TextNode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
