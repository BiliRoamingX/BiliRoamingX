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
public final class CardParagraph extends GeneratedMessageLite<CardParagraph, CardParagraph.C5291b> implements o0 {
    public static final int ADDITIONAL_CARD_FIELD_NUMBER = 1;
    public static final int BIZ_ID_FIELD_NUMBER = 3;
    public static final int BIZ_TYPE_FIELD_NUMBER = 2;
    private static final CardParagraph DEFAULT_INSTANCE;
    private static volatile Parser<CardParagraph> PARSER;
    private ModuleAdditional additionalCard_;
    private String bizId_ = "";
    private int bizType_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.CardParagraph$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5290a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17221xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17221xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17221xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17221xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17221xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17221xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17221xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17221xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.CardParagraph$b */
    /* loaded from: classes19.dex */
    public static final class C5291b extends GeneratedMessageLite.Builder<CardParagraph, C5291b> implements o0 {
        /* synthetic */ C5291b(C5290a c5290a) {
            this();
        }

        public C5291b clearAdditionalCard() {
            copyOnWrite();
            ((CardParagraph) this.instance).clearAdditionalCard();
            return this;
        }

        public C5291b clearBizId() {
            copyOnWrite();
            ((CardParagraph) this.instance).clearBizId();
            return this;
        }

        public C5291b clearBizType() {
            copyOnWrite();
            ((CardParagraph) this.instance).clearBizType();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o0
        public ModuleAdditional getAdditionalCard() {
            return ((CardParagraph) this.instance).getAdditionalCard();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o0
        public String getBizId() {
            return ((CardParagraph) this.instance).getBizId();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o0
        public ByteString getBizIdBytes() {
            return ((CardParagraph) this.instance).getBizIdBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o0
        public LinkNodeType getBizType() {
            return ((CardParagraph) this.instance).getBizType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o0
        public int getBizTypeValue() {
            return ((CardParagraph) this.instance).getBizTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.o0
        public boolean hasAdditionalCard() {
            return ((CardParagraph) this.instance).hasAdditionalCard();
        }

        public C5291b mergeAdditionalCard(ModuleAdditional moduleAdditional) {
            copyOnWrite();
            ((CardParagraph) this.instance).mergeAdditionalCard(moduleAdditional);
            return this;
        }

        public C5291b setAdditionalCard(ModuleAdditional moduleAdditional) {
            copyOnWrite();
            ((CardParagraph) this.instance).setAdditionalCard(moduleAdditional);
            return this;
        }

        public C5291b setBizId(String str) {
            copyOnWrite();
            ((CardParagraph) this.instance).setBizId(str);
            return this;
        }

        public C5291b setBizIdBytes(ByteString byteString) {
            copyOnWrite();
            ((CardParagraph) this.instance).setBizIdBytes(byteString);
            return this;
        }

        public C5291b setBizType(LinkNodeType linkNodeType) {
            copyOnWrite();
            ((CardParagraph) this.instance).setBizType(linkNodeType);
            return this;
        }

        public C5291b setBizTypeValue(int i2) {
            copyOnWrite();
            ((CardParagraph) this.instance).setBizTypeValue(i2);
            return this;
        }

        private C5291b() {
            super(CardParagraph.DEFAULT_INSTANCE);
        }
    }

    static {
        CardParagraph cardParagraph = new CardParagraph();
        DEFAULT_INSTANCE = cardParagraph;
        GeneratedMessageLite.registerDefaultInstance(CardParagraph.class, cardParagraph);
    }

    private CardParagraph() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalCard() {
        this.additionalCard_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizId() {
        this.bizId_ = getDefaultInstance().getBizId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizType() {
        this.bizType_ = 0;
    }

    public static CardParagraph getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdditionalCard(ModuleAdditional moduleAdditional) {
    }

    public static C5291b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardParagraph parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardParagraph) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardParagraph parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardParagraph> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalCard(ModuleAdditional moduleAdditional) {
        moduleAdditional.getClass();
        this.additionalCard_ = moduleAdditional;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizId(String str) {
        str.getClass();
        this.bizId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bizId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizType(LinkNodeType linkNodeType) {
        this.bizType_ = linkNodeType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizTypeValue(int i2) {
        this.bizType_ = i2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5290a c5290a = null;
        switch (C5290a.f17221xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CardParagraph();
            case 2:
                return new C5291b(c5290a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u0208", new Object[]{"additionalCard_", "bizType_", "bizId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardParagraph> parser = PARSER;
                if (parser == null) {
                    synchronized (CardParagraph.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.o0
    public ModuleAdditional getAdditionalCard() {
        return this.additionalCard_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o0
    public String getBizId() {
        return this.bizId_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o0
    public ByteString getBizIdBytes() {
        return ByteString.copyFromUtf8(this.bizId_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o0
    public LinkNodeType getBizType() {
        LinkNodeType forNumber = LinkNodeType.forNumber(this.bizType_);
        return forNumber == null ? LinkNodeType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o0
    public int getBizTypeValue() {
        return this.bizType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.o0
    public boolean hasAdditionalCard() {
        return this.additionalCard_ != null;
    }

    public static C5291b newBuilder(CardParagraph cardParagraph) {
        return DEFAULT_INSTANCE.createBuilder(cardParagraph);
    }

    public static CardParagraph parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardParagraph) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardParagraph parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardParagraph parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardParagraph parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardParagraph parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardParagraph parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardParagraph parseFrom(InputStream inputStream) throws IOException {
        return (CardParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardParagraph parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardParagraph parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardParagraph parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
