package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes19.dex */
public final class PicParagraph extends GeneratedMessageLite<PicParagraph, PicParagraph.C5899b> implements MessageLiteOrBuilder {
    private static final PicParagraph DEFAULT_INSTANCE;
    private static volatile Parser<PicParagraph> PARSER = null;
    public static final int PICS_FIELD_NUMBER = 1;
    public static final int STYLE_FIELD_NUMBER = 2;
    private MdlDynDraw pics_;
    private int style_;

    /* compiled from: BL */
    /* loaded from: classes19.dex */
    public enum PicParagraphStyle implements Internal.EnumLite {
        INVALID(0),
        NINE_CELL(1),
        BIG_SCROLL(2),
        UNRECOGNIZED(-1);

        public static final int BIG_SCROLL_VALUE = 2;
        public static final int INVALID_VALUE = 0;
        public static final int NINE_CELL_VALUE = 1;
        private static final Internal.EnumLiteMap<PicParagraphStyle> internalValueMap = new C5896a();
        private final int value;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.dynamic.v2.PicParagraph$PicParagraphStyle$a */
        /* loaded from: classes19.dex */
        static class C5896a implements Internal.EnumLiteMap<PicParagraphStyle> {
            C5896a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public PicParagraphStyle findValueByNumber(int i2) {
                return PicParagraphStyle.forNumber(i2);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.dynamic.v2.PicParagraph$PicParagraphStyle$b */
        /* loaded from: classes19.dex */
        private static final class C5897b implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new C5897b();

            private C5897b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i2) {
                return PicParagraphStyle.forNumber(i2) != null;
            }
        }

        PicParagraphStyle(int i2) {
            this.value = i2;
        }

        public static PicParagraphStyle forNumber(int i2) {
            if (i2 == 0) {
                return INVALID;
            }
            if (i2 == 1) {
                return NINE_CELL;
            }
            if (i2 != 2) {
                return null;
            }
            return BIG_SCROLL;
        }

        public static Internal.EnumLiteMap<PicParagraphStyle> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C5897b.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static PicParagraphStyle valueOf(int i2) {
            return forNumber(i2);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.PicParagraph$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5898a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17442xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17442xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17442xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17442xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17442xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17442xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17442xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17442xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.PicParagraph$b */
    /* loaded from: classes19.dex */
    public static final class C5899b extends GeneratedMessageLite.Builder<PicParagraph, C5899b> implements MessageLiteOrBuilder {
        /* synthetic */ C5899b(C5898a c5898a) {
            this();
        }

        public C5899b clearPics() {
            copyOnWrite();
            ((PicParagraph) this.instance).clearPics();
            return this;
        }

        public C5899b clearStyle() {
            copyOnWrite();
            ((PicParagraph) this.instance).clearStyle();
            return this;
        }

        public MdlDynDraw getPics() {
            return ((PicParagraph) this.instance).getPics();
        }

        public PicParagraphStyle getStyle() {
            return ((PicParagraph) this.instance).getStyle();
        }

        public int getStyleValue() {
            return ((PicParagraph) this.instance).getStyleValue();
        }

        public boolean hasPics() {
            return ((PicParagraph) this.instance).hasPics();
        }

        public C5899b mergePics(MdlDynDraw mdlDynDraw) {
            copyOnWrite();
            ((PicParagraph) this.instance).mergePics(mdlDynDraw);
            return this;
        }

        public C5899b setPics(MdlDynDraw mdlDynDraw) {
            copyOnWrite();
            ((PicParagraph) this.instance).setPics(mdlDynDraw);
            return this;
        }

        public C5899b setStyle(PicParagraphStyle picParagraphStyle) {
            copyOnWrite();
            ((PicParagraph) this.instance).setStyle(picParagraphStyle);
            return this;
        }

        public C5899b setStyleValue(int i2) {
            copyOnWrite();
            ((PicParagraph) this.instance).setStyleValue(i2);
            return this;
        }

        private C5899b() {
            super(PicParagraph.DEFAULT_INSTANCE);
        }

        public C5899b setPics(MdlDynDraw.C5682b c5682b) {
            copyOnWrite();
            ((PicParagraph) this.instance).setPics(c5682b.build());
            return this;
        }
    }

    static {
        PicParagraph picParagraph = new PicParagraph();
        DEFAULT_INSTANCE = picParagraph;
        GeneratedMessageLite.registerDefaultInstance(PicParagraph.class, picParagraph);
    }

    private PicParagraph() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPics() {
        this.pics_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyle() {
        this.style_ = 0;
    }

    public static PicParagraph getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePics(MdlDynDraw mdlDynDraw) {
        mdlDynDraw.getClass();
        MdlDynDraw mdlDynDraw2 = this.pics_;
        if (mdlDynDraw2 != null && mdlDynDraw2 != MdlDynDraw.getDefaultInstance()) {
            this.pics_ = MdlDynDraw.newBuilder(this.pics_).mergeFrom((MdlDynDraw) mdlDynDraw).buildPartial();
        } else {
            this.pics_ = mdlDynDraw;
        }
    }

    public static C5899b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PicParagraph parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PicParagraph) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PicParagraph parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PicParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PicParagraph> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPics(MdlDynDraw mdlDynDraw) {
        mdlDynDraw.getClass();
        this.pics_ = mdlDynDraw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyle(PicParagraphStyle picParagraphStyle) {
        this.style_ = picParagraphStyle.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleValue(int i2) {
        this.style_ = i2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5898a c5898a = null;
        switch (C5898a.f17442xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PicParagraph();
            case 2:
                return new C5899b(c5898a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"pics_", "style_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PicParagraph> parser = PARSER;
                if (parser == null) {
                    synchronized (PicParagraph.class) {
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

    public MdlDynDraw getPics() {
        MdlDynDraw mdlDynDraw = this.pics_;
        return mdlDynDraw == null ? MdlDynDraw.getDefaultInstance() : mdlDynDraw;
    }

    public PicParagraphStyle getStyle() {
        PicParagraphStyle forNumber = PicParagraphStyle.forNumber(this.style_);
        return forNumber == null ? PicParagraphStyle.UNRECOGNIZED : forNumber;
    }

    public int getStyleValue() {
        return this.style_;
    }

    public boolean hasPics() {
        return this.pics_ != null;
    }

    public static C5899b newBuilder(PicParagraph picParagraph) {
        return DEFAULT_INSTANCE.createBuilder(picParagraph);
    }

    public static PicParagraph parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PicParagraph) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PicParagraph parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PicParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PicParagraph parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PicParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PicParagraph parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PicParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PicParagraph parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PicParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PicParagraph parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PicParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PicParagraph parseFrom(InputStream inputStream) throws IOException {
        return (PicParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PicParagraph parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PicParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PicParagraph parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PicParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PicParagraph parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PicParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
