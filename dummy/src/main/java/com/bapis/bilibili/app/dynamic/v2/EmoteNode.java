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
public final class EmoteNode extends GeneratedMessageLite<EmoteNode, EmoteNode.C5458b> implements l1 {
    private static final EmoteNode DEFAULT_INSTANCE;
    public static final int EMOTE_URL_FIELD_NUMBER = 2;
    public static final int EMOTE_WIDTH_FIELD_NUMBER = 3;
    public static final int INLINE_IMG_CFG_FIELD_NUMBER = 5;
    public static final int IS_INLINE_IMG_FIELD_NUMBER = 4;
    private static volatile Parser<EmoteNode> PARSER = null;
    public static final int RAW_TEXT_FIELD_NUMBER = 1;
    private String emoteUrl_ = "";
    private EmoteSize emoteWidth_;
    private ImgInlineCfg inlineImgCfg_;
    private boolean isInlineImg_;
    private WordNode rawText_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.EmoteNode$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5457a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17291xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17291xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17291xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17291xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17291xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17291xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17291xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17291xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.EmoteNode$b */
    /* loaded from: classes19.dex */
    public static final class C5458b extends GeneratedMessageLite.Builder<EmoteNode, C5458b> implements l1 {
        /* synthetic */ C5458b(C5457a c5457a) {
            this();
        }

        public C5458b clearEmoteUrl() {
            copyOnWrite();
            ((EmoteNode) this.instance).clearEmoteUrl();
            return this;
        }

        public C5458b clearEmoteWidth() {
            copyOnWrite();
            ((EmoteNode) this.instance).clearEmoteWidth();
            return this;
        }

        public C5458b clearInlineImgCfg() {
            copyOnWrite();
            ((EmoteNode) this.instance).clearInlineImgCfg();
            return this;
        }

        public C5458b clearIsInlineImg() {
            copyOnWrite();
            ((EmoteNode) this.instance).clearIsInlineImg();
            return this;
        }

        public C5458b clearRawText() {
            copyOnWrite();
            ((EmoteNode) this.instance).clearRawText();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.l1
        public String getEmoteUrl() {
            return ((EmoteNode) this.instance).getEmoteUrl();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.l1
        public ByteString getEmoteUrlBytes() {
            return ((EmoteNode) this.instance).getEmoteUrlBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.l1
        public EmoteSize getEmoteWidth() {
            return ((EmoteNode) this.instance).getEmoteWidth();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.l1
        public ImgInlineCfg getInlineImgCfg() {
            return ((EmoteNode) this.instance).getInlineImgCfg();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.l1
        public boolean getIsInlineImg() {
            return ((EmoteNode) this.instance).getIsInlineImg();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.l1
        public WordNode getRawText() {
            return ((EmoteNode) this.instance).getRawText();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.l1
        public boolean hasEmoteWidth() {
            return ((EmoteNode) this.instance).hasEmoteWidth();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.l1
        public boolean hasInlineImgCfg() {
            return ((EmoteNode) this.instance).hasInlineImgCfg();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.l1
        public boolean hasRawText() {
            return ((EmoteNode) this.instance).hasRawText();
        }

        public C5458b mergeEmoteWidth(EmoteSize emoteSize) {
            copyOnWrite();
            ((EmoteNode) this.instance).mergeEmoteWidth(emoteSize);
            return this;
        }

        public C5458b mergeInlineImgCfg(ImgInlineCfg imgInlineCfg) {
            copyOnWrite();
            ((EmoteNode) this.instance).mergeInlineImgCfg(imgInlineCfg);
            return this;
        }

        public C5458b mergeRawText(WordNode wordNode) {
            copyOnWrite();
            ((EmoteNode) this.instance).mergeRawText(wordNode);
            return this;
        }

        public C5458b setEmoteUrl(String str) {
            copyOnWrite();
            ((EmoteNode) this.instance).setEmoteUrl(str);
            return this;
        }

        public C5458b setEmoteUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((EmoteNode) this.instance).setEmoteUrlBytes(byteString);
            return this;
        }

        public C5458b setEmoteWidth(EmoteSize emoteSize) {
            copyOnWrite();
            ((EmoteNode) this.instance).setEmoteWidth(emoteSize);
            return this;
        }

        public C5458b setInlineImgCfg(ImgInlineCfg imgInlineCfg) {
            copyOnWrite();
            ((EmoteNode) this.instance).setInlineImgCfg(imgInlineCfg);
            return this;
        }

        public C5458b setIsInlineImg(boolean z) {
            copyOnWrite();
            ((EmoteNode) this.instance).setIsInlineImg(z);
            return this;
        }

        public C5458b setRawText(WordNode wordNode) {
            copyOnWrite();
            ((EmoteNode) this.instance).setRawText(wordNode);
            return this;
        }

        private C5458b() {
            super(EmoteNode.DEFAULT_INSTANCE);
        }

        public C5458b setEmoteWidth(EmoteSize.C5460b c5460b) {
            copyOnWrite();
            ((EmoteNode) this.instance).setEmoteWidth(c5460b.build());
            return this;
        }

        public C5458b setInlineImgCfg(ImgInlineCfg.C5531b c5531b) {
            copyOnWrite();
            ((EmoteNode) this.instance).setInlineImgCfg(c5531b.build());
            return this;
        }

        public C5458b setRawText(WordNode.C6126b c6126b) {
            copyOnWrite();
            ((EmoteNode) this.instance).setRawText(c6126b.build());
            return this;
        }
    }

    static {
        EmoteNode emoteNode = new EmoteNode();
        DEFAULT_INSTANCE = emoteNode;
        GeneratedMessageLite.registerDefaultInstance(EmoteNode.class, emoteNode);
    }

    private EmoteNode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmoteUrl() {
        this.emoteUrl_ = getDefaultInstance().getEmoteUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmoteWidth() {
        this.emoteWidth_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInlineImgCfg() {
        this.inlineImgCfg_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInlineImg() {
        this.isInlineImg_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawText() {
        this.rawText_ = null;
    }

    public static EmoteNode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmoteWidth(EmoteSize emoteSize) {
        emoteSize.getClass();
        EmoteSize emoteSize2 = this.emoteWidth_;
        if (emoteSize2 != null && emoteSize2 != EmoteSize.getDefaultInstance()) {
            this.emoteWidth_ = EmoteSize.newBuilder(this.emoteWidth_).mergeFrom((EmoteSize) emoteSize).buildPartial();
        } else {
            this.emoteWidth_ = emoteSize;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInlineImgCfg(ImgInlineCfg imgInlineCfg) {
        imgInlineCfg.getClass();
        ImgInlineCfg imgInlineCfg2 = this.inlineImgCfg_;
        if (imgInlineCfg2 != null && imgInlineCfg2 != ImgInlineCfg.getDefaultInstance()) {
            this.inlineImgCfg_ = ImgInlineCfg.newBuilder(this.inlineImgCfg_).mergeFrom((ImgInlineCfg) imgInlineCfg).buildPartial();
        } else {
            this.inlineImgCfg_ = imgInlineCfg;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRawText(WordNode wordNode) {
        wordNode.getClass();
        WordNode wordNode2 = this.rawText_;
        if (wordNode2 != null && wordNode2 != WordNode.getDefaultInstance()) {
            this.rawText_ = WordNode.newBuilder(this.rawText_).mergeFrom((WordNode) wordNode).buildPartial();
        } else {
            this.rawText_ = wordNode;
        }
    }

    public static C5458b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EmoteNode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EmoteNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmoteNode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EmoteNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EmoteNode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmoteUrl(String str) {
        str.getClass();
        this.emoteUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmoteUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.emoteUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmoteWidth(EmoteSize emoteSize) {
        emoteSize.getClass();
        this.emoteWidth_ = emoteSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInlineImgCfg(ImgInlineCfg imgInlineCfg) {
        imgInlineCfg.getClass();
        this.inlineImgCfg_ = imgInlineCfg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInlineImg(boolean z) {
        this.isInlineImg_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawText(WordNode wordNode) {
        wordNode.getClass();
        this.rawText_ = wordNode;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5457a c5457a = null;
        switch (C5457a.f17291xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EmoteNode();
            case 2:
                return new C5458b(c5457a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\t\u0004\u0007\u0005\t", new Object[]{"rawText_", "emoteUrl_", "emoteWidth_", "isInlineImg_", "inlineImgCfg_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EmoteNode> parser = PARSER;
                if (parser == null) {
                    synchronized (EmoteNode.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.l1
    public String getEmoteUrl() {
        return this.emoteUrl_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.l1
    public ByteString getEmoteUrlBytes() {
        return ByteString.copyFromUtf8(this.emoteUrl_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.l1
    public EmoteSize getEmoteWidth() {
        EmoteSize emoteSize = this.emoteWidth_;
        return emoteSize == null ? EmoteSize.getDefaultInstance() : emoteSize;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.l1
    public ImgInlineCfg getInlineImgCfg() {
        ImgInlineCfg imgInlineCfg = this.inlineImgCfg_;
        return imgInlineCfg == null ? ImgInlineCfg.getDefaultInstance() : imgInlineCfg;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.l1
    public boolean getIsInlineImg() {
        return this.isInlineImg_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.l1
    public WordNode getRawText() {
        WordNode wordNode = this.rawText_;
        return wordNode == null ? WordNode.getDefaultInstance() : wordNode;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.l1
    public boolean hasEmoteWidth() {
        return this.emoteWidth_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.l1
    public boolean hasInlineImgCfg() {
        return this.inlineImgCfg_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.l1
    public boolean hasRawText() {
        return this.rawText_ != null;
    }

    public static C5458b newBuilder(EmoteNode emoteNode) {
        return DEFAULT_INSTANCE.createBuilder(emoteNode);
    }

    public static EmoteNode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmoteNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmoteNode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmoteNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EmoteNode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EmoteNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EmoteNode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmoteNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EmoteNode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EmoteNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EmoteNode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmoteNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EmoteNode parseFrom(InputStream inputStream) throws IOException {
        return (EmoteNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmoteNode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmoteNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmoteNode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EmoteNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EmoteNode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmoteNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
