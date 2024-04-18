package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class ESportsGradeCard extends GeneratedMessageLite<ESportsGradeCard, ESportsGradeCard.C14715b> implements MessageLiteOrBuilder {
    private static final ESportsGradeCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int IMAGE_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 4;
    private static volatile Parser<ESportsGradeCard> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String description_ = "";
    private String image_ = "";
    private String link_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.ESportsGradeCard$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14714a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21994xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21994xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21994xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21994xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21994xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21994xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21994xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21994xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.ESportsGradeCard$b */
    /* loaded from: classes21.dex */
    public static final class C14715b extends GeneratedMessageLite.Builder<ESportsGradeCard, C14715b> implements MessageLiteOrBuilder {
        /* synthetic */ C14715b(C14714a c14714a) {
            this();
        }

        public C14715b clearDescription() {
            copyOnWrite();
            ((ESportsGradeCard) this.instance).clearDescription();
            return this;
        }

        public C14715b clearImage() {
            copyOnWrite();
            ((ESportsGradeCard) this.instance).clearImage();
            return this;
        }

        public C14715b clearLink() {
            copyOnWrite();
            ((ESportsGradeCard) this.instance).clearLink();
            return this;
        }

        public C14715b clearTitle() {
            copyOnWrite();
            ((ESportsGradeCard) this.instance).clearTitle();
            return this;
        }

        public String getDescription() {
            return ((ESportsGradeCard) this.instance).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((ESportsGradeCard) this.instance).getDescriptionBytes();
        }

        public String getImage() {
            return ((ESportsGradeCard) this.instance).getImage();
        }

        public ByteString getImageBytes() {
            return ((ESportsGradeCard) this.instance).getImageBytes();
        }

        public String getLink() {
            return ((ESportsGradeCard) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((ESportsGradeCard) this.instance).getLinkBytes();
        }

        public String getTitle() {
            return ((ESportsGradeCard) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((ESportsGradeCard) this.instance).getTitleBytes();
        }

        public C14715b setDescription(String str) {
            copyOnWrite();
            ((ESportsGradeCard) this.instance).setDescription(str);
            return this;
        }

        public C14715b setDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((ESportsGradeCard) this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public C14715b setImage(String str) {
            copyOnWrite();
            ((ESportsGradeCard) this.instance).setImage(str);
            return this;
        }

        public C14715b setImageBytes(ByteString byteString) {
            copyOnWrite();
            ((ESportsGradeCard) this.instance).setImageBytes(byteString);
            return this;
        }

        public C14715b setLink(String str) {
            copyOnWrite();
            ((ESportsGradeCard) this.instance).setLink(str);
            return this;
        }

        public C14715b setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ESportsGradeCard) this.instance).setLinkBytes(byteString);
            return this;
        }

        public C14715b setTitle(String str) {
            copyOnWrite();
            ((ESportsGradeCard) this.instance).setTitle(str);
            return this;
        }

        public C14715b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ESportsGradeCard) this.instance).setTitleBytes(byteString);
            return this;
        }

        private C14715b() {
            super(ESportsGradeCard.DEFAULT_INSTANCE);
        }
    }

    static {
        ESportsGradeCard eSportsGradeCard = new ESportsGradeCard();
        DEFAULT_INSTANCE = eSportsGradeCard;
        GeneratedMessageLite.registerDefaultInstance(ESportsGradeCard.class, eSportsGradeCard);
    }

    private ESportsGradeCard() {
    }

    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    public void clearImage() {
        this.image_ = getDefaultInstance().getImage();
    }

    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static ESportsGradeCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14715b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ESportsGradeCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ESportsGradeCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ESportsGradeCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ESportsGradeCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ESportsGradeCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    public void setDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.toStringUtf8();
    }

    public void setImage(String str) {
        str.getClass();
        this.image_ = str;
    }

    public void setImageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.image_ = byteString.toStringUtf8();
    }

    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14714a.f21994xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ESportsGradeCard();
            case 2:
                return new C14715b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", new Object[]{"title_", "description_", "image_", "link_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ESportsGradeCard> parser = PARSER;
                if (parser == null) {
                    synchronized (ESportsGradeCard.class) {
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

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getImage() {
        return this.image_;
    }

    public ByteString getImageBytes() {
        return ByteString.copyFromUtf8(this.image_);
    }

    public String getLink() {
        return this.link_;
    }

    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static C14715b newBuilder(ESportsGradeCard eSportsGradeCard) {
        return DEFAULT_INSTANCE.createBuilder(eSportsGradeCard);
    }

    public static ESportsGradeCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ESportsGradeCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ESportsGradeCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ESportsGradeCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ESportsGradeCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ESportsGradeCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ESportsGradeCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ESportsGradeCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ESportsGradeCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ESportsGradeCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ESportsGradeCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ESportsGradeCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ESportsGradeCard parseFrom(InputStream inputStream) throws IOException {
        return (ESportsGradeCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ESportsGradeCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ESportsGradeCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ESportsGradeCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ESportsGradeCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ESportsGradeCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ESportsGradeCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
