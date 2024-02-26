package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes19.dex */
public final class WordNode extends GeneratedMessageLite<WordNode, WordNode.C6126b> implements ed {
    public static final int COLOR_FIELD_NUMBER = 3;
    private static final WordNode DEFAULT_INSTANCE;
    public static final int FONT_SIZE_FIELD_NUMBER = 2;
    private static volatile Parser<WordNode> PARSER = null;
    public static final int STYLE_FIELD_NUMBER = 4;
    public static final int UNDERLINE_STYLE_FIELD_NUMBER = 5;
    public static final int WORDS_FIELD_NUMBER = 1;
    private Colors color_;
    private double fontSize_;
    private WordNodeStyle style_;
    private UnderlineStyle underlineStyle_;
    private String words_ = "";

    /* compiled from: BL */
    /* loaded from: classes19.dex */
    public static final class UnderlineStyle extends GeneratedMessageLite<UnderlineStyle, UnderlineStyle.C6123a> implements InterfaceC6127c {
        private static final UnderlineStyle DEFAULT_INSTANCE;
        private static volatile Parser<UnderlineStyle> PARSER = null;
        public static final int UNDERLINE_COLOR_FIELD_NUMBER = 2;
        public static final int UNDERLINE_WIDTH_FIELD_NUMBER = 1;
        private Colors underlineColor_;
        private double underlineWidth_;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.dynamic.v2.WordNode$UnderlineStyle$a */
        /* loaded from: classes19.dex */
        public static final class C6123a extends GeneratedMessageLite.Builder<UnderlineStyle, C6123a> implements InterfaceC6127c {
            /* synthetic */ C6123a(C6125a c6125a) {
                this();
            }

            public C6123a clearUnderlineColor() {
                copyOnWrite();
                ((UnderlineStyle) this.instance).clearUnderlineColor();
                return this;
            }

            public C6123a clearUnderlineWidth() {
                copyOnWrite();
                ((UnderlineStyle) this.instance).clearUnderlineWidth();
                return this;
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6127c
            public Colors getUnderlineColor() {
                return ((UnderlineStyle) this.instance).getUnderlineColor();
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6127c
            public double getUnderlineWidth() {
                return ((UnderlineStyle) this.instance).getUnderlineWidth();
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6127c
            public boolean hasUnderlineColor() {
                return ((UnderlineStyle) this.instance).hasUnderlineColor();
            }

            public C6123a mergeUnderlineColor(Colors colors) {
                copyOnWrite();
                ((UnderlineStyle) this.instance).mergeUnderlineColor(colors);
                return this;
            }

            public C6123a setUnderlineColor(Colors colors) {
                copyOnWrite();
                ((UnderlineStyle) this.instance).setUnderlineColor(colors);
                return this;
            }

            public C6123a setUnderlineWidth(double d2) {
                copyOnWrite();
                ((UnderlineStyle) this.instance).setUnderlineWidth(d2);
                return this;
            }

            private C6123a() {
                super(UnderlineStyle.DEFAULT_INSTANCE);
            }

            public C6123a setUnderlineColor(Colors.C5307b c5307b) {
                copyOnWrite();
                ((UnderlineStyle) this.instance).setUnderlineColor(c5307b.build());
                return this;
            }
        }

        static {
            UnderlineStyle underlineStyle = new UnderlineStyle();
            DEFAULT_INSTANCE = underlineStyle;
            GeneratedMessageLite.registerDefaultInstance(UnderlineStyle.class, underlineStyle);
        }

        private UnderlineStyle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnderlineColor() {
            this.underlineColor_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnderlineWidth() {
            this.underlineWidth_ = 0.0d;
        }

        public static UnderlineStyle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUnderlineColor(Colors colors) {
            colors.getClass();
            Colors colors2 = this.underlineColor_;
            if (colors2 != null && colors2 != Colors.getDefaultInstance()) {
                this.underlineColor_ = Colors.newBuilder(this.underlineColor_).mergeFrom((Colors) colors).buildPartial();
            } else {
                this.underlineColor_ = colors;
            }
        }

        public static C6123a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UnderlineStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UnderlineStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnderlineStyle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UnderlineStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UnderlineStyle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnderlineColor(Colors colors) {
            colors.getClass();
            this.underlineColor_ = colors;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnderlineWidth(double d2) {
            this.underlineWidth_ = d2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C6125a c6125a = null;
            switch (C6125a.f17532xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UnderlineStyle();
                case 2:
                    return new C6123a(c6125a);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\t", new Object[]{"underlineWidth_", "underlineColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UnderlineStyle> parser = PARSER;
                    if (parser == null) {
                        synchronized (UnderlineStyle.class) {
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

        @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6127c
        public Colors getUnderlineColor() {
            Colors colors = this.underlineColor_;
            return colors == null ? Colors.getDefaultInstance() : colors;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6127c
        public double getUnderlineWidth() {
            return this.underlineWidth_;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6127c
        public boolean hasUnderlineColor() {
            return this.underlineColor_ != null;
        }

        public static C6123a newBuilder(UnderlineStyle underlineStyle) {
            return DEFAULT_INSTANCE.createBuilder(underlineStyle);
        }

        public static UnderlineStyle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UnderlineStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UnderlineStyle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UnderlineStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UnderlineStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UnderlineStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UnderlineStyle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UnderlineStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UnderlineStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UnderlineStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UnderlineStyle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UnderlineStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UnderlineStyle parseFrom(InputStream inputStream) throws IOException {
            return (UnderlineStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnderlineStyle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UnderlineStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UnderlineStyle parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UnderlineStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UnderlineStyle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UnderlineStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes19.dex */
    public static final class WordNodeStyle extends GeneratedMessageLite<WordNodeStyle, WordNodeStyle.C6124a> implements InterfaceC6128d {
        public static final int BOLD_FIELD_NUMBER = 1;
        private static final WordNodeStyle DEFAULT_INSTANCE;
        public static final int ITALIC_FIELD_NUMBER = 2;
        private static volatile Parser<WordNodeStyle> PARSER = null;
        public static final int STRIKETHROUGH_FIELD_NUMBER = 3;
        public static final int UNDERLINE_FIELD_NUMBER = 4;
        private boolean bold_;
        private boolean italic_;
        private boolean strikethrough_;
        private boolean underline_;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.dynamic.v2.WordNode$WordNodeStyle$a */
        /* loaded from: classes19.dex */
        public static final class C6124a extends GeneratedMessageLite.Builder<WordNodeStyle, C6124a> implements InterfaceC6128d {
            /* synthetic */ C6124a(C6125a c6125a) {
                this();
            }

            public C6124a clearBold() {
                copyOnWrite();
                ((WordNodeStyle) this.instance).clearBold();
                return this;
            }

            public C6124a clearItalic() {
                copyOnWrite();
                ((WordNodeStyle) this.instance).clearItalic();
                return this;
            }

            public C6124a clearStrikethrough() {
                copyOnWrite();
                ((WordNodeStyle) this.instance).clearStrikethrough();
                return this;
            }

            public C6124a clearUnderline() {
                copyOnWrite();
                ((WordNodeStyle) this.instance).clearUnderline();
                return this;
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6128d
            public boolean getBold() {
                return ((WordNodeStyle) this.instance).getBold();
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6128d
            public boolean getItalic() {
                return ((WordNodeStyle) this.instance).getItalic();
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6128d
            public boolean getStrikethrough() {
                return ((WordNodeStyle) this.instance).getStrikethrough();
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6128d
            public boolean getUnderline() {
                return ((WordNodeStyle) this.instance).getUnderline();
            }

            public C6124a setBold(boolean z) {
                copyOnWrite();
                ((WordNodeStyle) this.instance).setBold(z);
                return this;
            }

            public C6124a setItalic(boolean z) {
                copyOnWrite();
                ((WordNodeStyle) this.instance).setItalic(z);
                return this;
            }

            public C6124a setStrikethrough(boolean z) {
                copyOnWrite();
                ((WordNodeStyle) this.instance).setStrikethrough(z);
                return this;
            }

            public C6124a setUnderline(boolean z) {
                copyOnWrite();
                ((WordNodeStyle) this.instance).setUnderline(z);
                return this;
            }

            private C6124a() {
                super(WordNodeStyle.DEFAULT_INSTANCE);
            }
        }

        static {
            WordNodeStyle wordNodeStyle = new WordNodeStyle();
            DEFAULT_INSTANCE = wordNodeStyle;
            GeneratedMessageLite.registerDefaultInstance(WordNodeStyle.class, wordNodeStyle);
        }

        private WordNodeStyle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBold() {
            this.bold_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItalic() {
            this.italic_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStrikethrough() {
            this.strikethrough_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnderline() {
            this.underline_ = false;
        }

        public static WordNodeStyle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6124a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WordNodeStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WordNodeStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WordNodeStyle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WordNodeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WordNodeStyle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBold(boolean z) {
            this.bold_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItalic(boolean z) {
            this.italic_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStrikethrough(boolean z) {
            this.strikethrough_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnderline(boolean z) {
            this.underline_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C6125a c6125a = null;
            switch (C6125a.f17532xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new WordNodeStyle();
                case 2:
                    return new C6124a(c6125a);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"bold_", "italic_", "strikethrough_", "underline_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WordNodeStyle> parser = PARSER;
                    if (parser == null) {
                        synchronized (WordNodeStyle.class) {
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

        @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6128d
        public boolean getBold() {
            return this.bold_;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6128d
        public boolean getItalic() {
            return this.italic_;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6128d
        public boolean getStrikethrough() {
            return this.strikethrough_;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.WordNode.InterfaceC6128d
        public boolean getUnderline() {
            return this.underline_;
        }

        public static C6124a newBuilder(WordNodeStyle wordNodeStyle) {
            return DEFAULT_INSTANCE.createBuilder(wordNodeStyle);
        }

        public static WordNodeStyle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WordNodeStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WordNodeStyle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WordNodeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WordNodeStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WordNodeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WordNodeStyle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WordNodeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WordNodeStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WordNodeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WordNodeStyle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WordNodeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WordNodeStyle parseFrom(InputStream inputStream) throws IOException {
            return (WordNodeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WordNodeStyle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WordNodeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WordNodeStyle parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (WordNodeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WordNodeStyle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WordNodeStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.WordNode$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C6125a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17532xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17532xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17532xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17532xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17532xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17532xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17532xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17532xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.WordNode$b */
    /* loaded from: classes19.dex */
    public static final class C6126b extends GeneratedMessageLite.Builder<WordNode, C6126b> implements ed {
        /* synthetic */ C6126b(C6125a c6125a) {
            this();
        }

        public C6126b clearColor() {
            copyOnWrite();
            ((WordNode) this.instance).clearColor();
            return this;
        }

        public C6126b clearFontSize() {
            copyOnWrite();
            ((WordNode) this.instance).clearFontSize();
            return this;
        }

        public C6126b clearStyle() {
            copyOnWrite();
            ((WordNode) this.instance).clearStyle();
            return this;
        }

        public C6126b clearUnderlineStyle() {
            copyOnWrite();
            ((WordNode) this.instance).clearUnderlineStyle();
            return this;
        }

        public C6126b clearWords() {
            copyOnWrite();
            ((WordNode) this.instance).clearWords();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ed
        public Colors getColor() {
            return ((WordNode) this.instance).getColor();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ed
        public double getFontSize() {
            return ((WordNode) this.instance).getFontSize();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ed
        public WordNodeStyle getStyle() {
            return ((WordNode) this.instance).getStyle();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ed
        public UnderlineStyle getUnderlineStyle() {
            return ((WordNode) this.instance).getUnderlineStyle();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ed
        public String getWords() {
            return ((WordNode) this.instance).getWords();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ed
        public ByteString getWordsBytes() {
            return ((WordNode) this.instance).getWordsBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ed
        public boolean hasColor() {
            return ((WordNode) this.instance).hasColor();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ed
        public boolean hasStyle() {
            return ((WordNode) this.instance).hasStyle();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ed
        public boolean hasUnderlineStyle() {
            return ((WordNode) this.instance).hasUnderlineStyle();
        }

        public C6126b mergeColor(Colors colors) {
            copyOnWrite();
            ((WordNode) this.instance).mergeColor(colors);
            return this;
        }

        public C6126b mergeStyle(WordNodeStyle wordNodeStyle) {
            copyOnWrite();
            ((WordNode) this.instance).mergeStyle(wordNodeStyle);
            return this;
        }

        public C6126b mergeUnderlineStyle(UnderlineStyle underlineStyle) {
            copyOnWrite();
            ((WordNode) this.instance).mergeUnderlineStyle(underlineStyle);
            return this;
        }

        public C6126b setColor(Colors colors) {
            copyOnWrite();
            ((WordNode) this.instance).setColor(colors);
            return this;
        }

        public C6126b setFontSize(double d2) {
            copyOnWrite();
            ((WordNode) this.instance).setFontSize(d2);
            return this;
        }

        public C6126b setStyle(WordNodeStyle wordNodeStyle) {
            copyOnWrite();
            ((WordNode) this.instance).setStyle(wordNodeStyle);
            return this;
        }

        public C6126b setUnderlineStyle(UnderlineStyle underlineStyle) {
            copyOnWrite();
            ((WordNode) this.instance).setUnderlineStyle(underlineStyle);
            return this;
        }

        public C6126b setWords(String str) {
            copyOnWrite();
            ((WordNode) this.instance).setWords(str);
            return this;
        }

        public C6126b setWordsBytes(ByteString byteString) {
            copyOnWrite();
            ((WordNode) this.instance).setWordsBytes(byteString);
            return this;
        }

        private C6126b() {
            super(WordNode.DEFAULT_INSTANCE);
        }

        public C6126b setColor(Colors.C5307b c5307b) {
            copyOnWrite();
            ((WordNode) this.instance).setColor(c5307b.build());
            return this;
        }

        public C6126b setStyle(WordNodeStyle.C6124a c6124a) {
            copyOnWrite();
            ((WordNode) this.instance).setStyle(c6124a.build());
            return this;
        }

        public C6126b setUnderlineStyle(UnderlineStyle.C6123a c6123a) {
            copyOnWrite();
            ((WordNode) this.instance).setUnderlineStyle(c6123a.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.WordNode$c */
    /* loaded from: classes19.dex */
    public interface InterfaceC6127c extends MessageLiteOrBuilder {
        Colors getUnderlineColor();

        double getUnderlineWidth();

        boolean hasUnderlineColor();
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.WordNode$d */
    /* loaded from: classes19.dex */
    public interface InterfaceC6128d extends MessageLiteOrBuilder {
        boolean getBold();

        boolean getItalic();

        boolean getStrikethrough();

        boolean getUnderline();
    }

    static {
        WordNode wordNode = new WordNode();
        DEFAULT_INSTANCE = wordNode;
        GeneratedMessageLite.registerDefaultInstance(WordNode.class, wordNode);
    }

    private WordNode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.color_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFontSize() {
        this.fontSize_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyle() {
        this.style_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnderlineStyle() {
        this.underlineStyle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWords() {
        this.words_ = getDefaultInstance().getWords();
    }

    public static WordNode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeColor(Colors colors) {
        colors.getClass();
        Colors colors2 = this.color_;
        if (colors2 != null && colors2 != Colors.getDefaultInstance()) {
            this.color_ = Colors.newBuilder(this.color_).mergeFrom((Colors) colors).buildPartial();
        } else {
            this.color_ = colors;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStyle(WordNodeStyle wordNodeStyle) {
        wordNodeStyle.getClass();
        WordNodeStyle wordNodeStyle2 = this.style_;
        if (wordNodeStyle2 != null && wordNodeStyle2 != WordNodeStyle.getDefaultInstance()) {
            this.style_ = WordNodeStyle.newBuilder(this.style_).mergeFrom((WordNodeStyle) wordNodeStyle).buildPartial();
        } else {
            this.style_ = wordNodeStyle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnderlineStyle(UnderlineStyle underlineStyle) {
        underlineStyle.getClass();
        UnderlineStyle underlineStyle2 = this.underlineStyle_;
        if (underlineStyle2 != null && underlineStyle2 != UnderlineStyle.getDefaultInstance()) {
            this.underlineStyle_ = UnderlineStyle.newBuilder(this.underlineStyle_).mergeFrom((UnderlineStyle) underlineStyle).buildPartial();
        } else {
            this.underlineStyle_ = underlineStyle;
        }
    }

    public static C6126b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WordNode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WordNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WordNode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WordNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WordNode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(Colors colors) {
        colors.getClass();
        this.color_ = colors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontSize(double d2) {
        this.fontSize_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyle(WordNodeStyle wordNodeStyle) {
        wordNodeStyle.getClass();
        this.style_ = wordNodeStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnderlineStyle(UnderlineStyle underlineStyle) {
        underlineStyle.getClass();
        this.underlineStyle_ = underlineStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWords(String str) {
        str.getClass();
        this.words_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWordsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.words_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C6125a c6125a = null;
        switch (C6125a.f17532xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new WordNode();
            case 2:
                return new C6126b(c6125a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0000\u0003\t\u0004\t\u0005\t", new Object[]{"words_", "fontSize_", "color_", "style_", "underlineStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WordNode> parser = PARSER;
                if (parser == null) {
                    synchronized (WordNode.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.ed
    public Colors getColor() {
        Colors colors = this.color_;
        return colors == null ? Colors.getDefaultInstance() : colors;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ed
    public double getFontSize() {
        return this.fontSize_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ed
    public WordNodeStyle getStyle() {
        WordNodeStyle wordNodeStyle = this.style_;
        return wordNodeStyle == null ? WordNodeStyle.getDefaultInstance() : wordNodeStyle;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ed
    public UnderlineStyle getUnderlineStyle() {
        UnderlineStyle underlineStyle = this.underlineStyle_;
        return underlineStyle == null ? UnderlineStyle.getDefaultInstance() : underlineStyle;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ed
    public String getWords() {
        return this.words_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ed
    public ByteString getWordsBytes() {
        return ByteString.copyFromUtf8(this.words_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ed
    public boolean hasColor() {
        return this.color_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ed
    public boolean hasStyle() {
        return this.style_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ed
    public boolean hasUnderlineStyle() {
        return this.underlineStyle_ != null;
    }

    public static C6126b newBuilder(WordNode wordNode) {
        return DEFAULT_INSTANCE.createBuilder(wordNode);
    }

    public static WordNode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WordNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WordNode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WordNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WordNode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WordNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WordNode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WordNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WordNode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WordNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WordNode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WordNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WordNode parseFrom(InputStream inputStream) throws IOException {
        return (WordNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WordNode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WordNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WordNode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WordNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WordNode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WordNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
