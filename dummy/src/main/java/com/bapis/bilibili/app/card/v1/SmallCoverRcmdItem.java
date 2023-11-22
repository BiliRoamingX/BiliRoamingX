package com.bapis.bilibili.app.card.v1;

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
public final class SmallCoverRcmdItem extends GeneratedMessageLite<SmallCoverRcmdItem, SmallCoverRcmdItem.C5864b> implements MessageLiteOrBuilder {
    public static final int COVER_FIELD_NUMBER = 2;
    public static final int COVER_GIF_FIELD_NUMBER = 9;
    public static final int COVER_RIGHT_TEXT_1_FIELD_NUMBER = 6;
    public static final int COVER_RIGHT_TEXT_CONTENT_DESCRIPTION_FIELD_NUMBER = 12;
    private static final SmallCoverRcmdItem DEFAULT_INSTANCE;
    public static final int GOTO_FIELD_NUMBER = 5;
    public static final int PARAM_FIELD_NUMBER = 4;
    private static volatile Parser<SmallCoverRcmdItem> PARSER = null;
    public static final int RIGHT_DESC_1_CONTENT_DESCRIPTION_FIELD_NUMBER = 13;
    public static final int RIGHT_DESC_1_FIELD_NUMBER = 7;
    public static final int RIGHT_DESC_2_FIELD_NUMBER = 8;
    public static final int RIGHT_ICON_1_FIELD_NUMBER = 10;
    public static final int RIGHT_ICON_2_FIELD_NUMBER = 11;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 3;
    private int rightIcon1_;
    private int rightIcon2_;
    private String title_ = "";
    private String cover_ = "";
    private String uri_ = "";
    private String param_ = "";
    private String goto_ = "";
    private String coverRightText1_ = "";
    private String rightDesc1_ = "";
    private String rightDesc2_ = "";
    private String coverGif_ = "";
    private String coverRightTextContentDescription_ = "";
    private String rightDesc1ContentDescription_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.SmallCoverRcmdItem$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5863a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15980xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15980xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15980xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15980xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15980xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15980xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15980xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15980xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.SmallCoverRcmdItem$b */
    /* loaded from: classes13.dex */
    public static final class C5864b extends GeneratedMessageLite.Builder<SmallCoverRcmdItem, C5864b> implements MessageLiteOrBuilder {
        /* synthetic */ C5864b(C5863a c5863a) {
            this();
        }

        public C5864b clearCover() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearCover();
            return this;
        }

        public C5864b clearCoverGif() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearCoverGif();
            return this;
        }

        public C5864b clearCoverRightText1() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearCoverRightText1();
            return this;
        }

        public C5864b clearCoverRightTextContentDescription() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearCoverRightTextContentDescription();
            return this;
        }

        public C5864b clearGoto() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearGoto();
            return this;
        }

        public C5864b clearParam() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearParam();
            return this;
        }

        public C5864b clearRightDesc1() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearRightDesc1();
            return this;
        }

        public C5864b clearRightDesc1ContentDescription() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearRightDesc1ContentDescription();
            return this;
        }

        public C5864b clearRightDesc2() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearRightDesc2();
            return this;
        }

        public C5864b clearRightIcon1() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearRightIcon1();
            return this;
        }

        public C5864b clearRightIcon2() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearRightIcon2();
            return this;
        }

        public C5864b clearTitle() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearTitle();
            return this;
        }

        public C5864b clearUri() {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).clearUri();
            return this;
        }

        public String getCover() {
            return ((SmallCoverRcmdItem) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((SmallCoverRcmdItem) this.instance).getCoverBytes();
        }

        public String getCoverGif() {
            return ((SmallCoverRcmdItem) this.instance).getCoverGif();
        }

        public ByteString getCoverGifBytes() {
            return ((SmallCoverRcmdItem) this.instance).getCoverGifBytes();
        }

        public String getCoverRightText1() {
            return ((SmallCoverRcmdItem) this.instance).getCoverRightText1();
        }

        public ByteString getCoverRightText1Bytes() {
            return ((SmallCoverRcmdItem) this.instance).getCoverRightText1Bytes();
        }

        public String getCoverRightTextContentDescription() {
            return ((SmallCoverRcmdItem) this.instance).getCoverRightTextContentDescription();
        }

        public ByteString getCoverRightTextContentDescriptionBytes() {
            return ((SmallCoverRcmdItem) this.instance).getCoverRightTextContentDescriptionBytes();
        }

        public String getGoto() {
            return ((SmallCoverRcmdItem) this.instance).getGoto();
        }

        public ByteString getGotoBytes() {
            return ((SmallCoverRcmdItem) this.instance).getGotoBytes();
        }

        public String getParam() {
            return ((SmallCoverRcmdItem) this.instance).getParam();
        }

        public ByteString getParamBytes() {
            return ((SmallCoverRcmdItem) this.instance).getParamBytes();
        }

        public String getRightDesc1() {
            return ((SmallCoverRcmdItem) this.instance).getRightDesc1();
        }

        public ByteString getRightDesc1Bytes() {
            return ((SmallCoverRcmdItem) this.instance).getRightDesc1Bytes();
        }

        public String getRightDesc1ContentDescription() {
            return ((SmallCoverRcmdItem) this.instance).getRightDesc1ContentDescription();
        }

        public ByteString getRightDesc1ContentDescriptionBytes() {
            return ((SmallCoverRcmdItem) this.instance).getRightDesc1ContentDescriptionBytes();
        }

        public String getRightDesc2() {
            return ((SmallCoverRcmdItem) this.instance).getRightDesc2();
        }

        public ByteString getRightDesc2Bytes() {
            return ((SmallCoverRcmdItem) this.instance).getRightDesc2Bytes();
        }

        public int getRightIcon1() {
            return ((SmallCoverRcmdItem) this.instance).getRightIcon1();
        }

        public int getRightIcon2() {
            return ((SmallCoverRcmdItem) this.instance).getRightIcon2();
        }

        public String getTitle() {
            return ((SmallCoverRcmdItem) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((SmallCoverRcmdItem) this.instance).getTitleBytes();
        }

        public String getUri() {
            return ((SmallCoverRcmdItem) this.instance).getUri();
        }

        public ByteString getUriBytes() {
            return ((SmallCoverRcmdItem) this.instance).getUriBytes();
        }

        public C5864b setCover(String str) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setCover(str);
            return this;
        }

        public C5864b setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setCoverBytes(byteString);
            return this;
        }

        public C5864b setCoverGif(String str) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setCoverGif(str);
            return this;
        }

        public C5864b setCoverGifBytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setCoverGifBytes(byteString);
            return this;
        }

        public C5864b setCoverRightText1(String str) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setCoverRightText1(str);
            return this;
        }

        public C5864b setCoverRightText1Bytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setCoverRightText1Bytes(byteString);
            return this;
        }

        public C5864b setCoverRightTextContentDescription(String str) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setCoverRightTextContentDescription(str);
            return this;
        }

        public C5864b setCoverRightTextContentDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setCoverRightTextContentDescriptionBytes(byteString);
            return this;
        }

        public C5864b setGoto(String str) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setGoto(str);
            return this;
        }

        public C5864b setGotoBytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setGotoBytes(byteString);
            return this;
        }

        public C5864b setParam(String str) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setParam(str);
            return this;
        }

        public C5864b setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setParamBytes(byteString);
            return this;
        }

        public C5864b setRightDesc1(String str) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setRightDesc1(str);
            return this;
        }

        public C5864b setRightDesc1Bytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setRightDesc1Bytes(byteString);
            return this;
        }

        public C5864b setRightDesc1ContentDescription(String str) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setRightDesc1ContentDescription(str);
            return this;
        }

        public C5864b setRightDesc1ContentDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setRightDesc1ContentDescriptionBytes(byteString);
            return this;
        }

        public C5864b setRightDesc2(String str) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setRightDesc2(str);
            return this;
        }

        public C5864b setRightDesc2Bytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setRightDesc2Bytes(byteString);
            return this;
        }

        public C5864b setRightIcon1(int i) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setRightIcon1(i);
            return this;
        }

        public C5864b setRightIcon2(int i) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setRightIcon2(i);
            return this;
        }

        public C5864b setTitle(String str) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setTitle(str);
            return this;
        }

        public C5864b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C5864b setUri(String str) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setUri(str);
            return this;
        }

        public C5864b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverRcmdItem) this.instance).setUriBytes(byteString);
            return this;
        }

        private C5864b() {
            super(SmallCoverRcmdItem.DEFAULT_INSTANCE);
        }
    }

    static {
        SmallCoverRcmdItem smallCoverRcmdItem = new SmallCoverRcmdItem();
        DEFAULT_INSTANCE = smallCoverRcmdItem;
        GeneratedMessageLite.registerDefaultInstance(SmallCoverRcmdItem.class, smallCoverRcmdItem);
    }

    private SmallCoverRcmdItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverGif() {
        this.coverGif_ = getDefaultInstance().getCoverGif();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverRightText1() {
        this.coverRightText1_ = getDefaultInstance().getCoverRightText1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverRightTextContentDescription() {
        this.coverRightTextContentDescription_ = getDefaultInstance().getCoverRightTextContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoto() {
        this.goto_ = getDefaultInstance().getGoto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightDesc1() {
        this.rightDesc1_ = getDefaultInstance().getRightDesc1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightDesc1ContentDescription() {
        this.rightDesc1ContentDescription_ = getDefaultInstance().getRightDesc1ContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightDesc2() {
        this.rightDesc2_ = getDefaultInstance().getRightDesc2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightIcon1() {
        this.rightIcon1_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightIcon2() {
        this.rightIcon2_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static SmallCoverRcmdItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5864b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SmallCoverRcmdItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SmallCoverRcmdItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SmallCoverRcmdItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SmallCoverRcmdItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SmallCoverRcmdItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverGif(String str) {
        str.getClass();
        this.coverGif_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverGifBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverGif_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverRightText1(String str) {
        str.getClass();
        this.coverRightText1_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverRightText1Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverRightText1_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverRightTextContentDescription(String str) {
        str.getClass();
        this.coverRightTextContentDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverRightTextContentDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverRightTextContentDescription_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoto(String str) {
        str.getClass();
        this.goto_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGotoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.goto_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParam(String str) {
        str.getClass();
        this.param_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParamBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.param_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightDesc1(String str) {
        str.getClass();
        this.rightDesc1_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightDesc1Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rightDesc1_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightDesc1ContentDescription(String str) {
        str.getClass();
        this.rightDesc1ContentDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightDesc1ContentDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rightDesc1ContentDescription_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightDesc2(String str) {
        str.getClass();
        this.rightDesc2_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightDesc2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rightDesc2_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightIcon1(int i) {
        this.rightIcon1_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightIcon2(int i) {
        this.rightIcon2_ = i;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5863a.f15980xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SmallCoverRcmdItem();
            case 2:
                return new C5864b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0004\u000b\u0004\f\u0208\r\u0208", new Object[]{"title_", "cover_", "uri_", "param_", "goto_", "coverRightText1_", "rightDesc1_", "rightDesc2_", "coverGif_", "rightIcon1_", "rightIcon2_", "coverRightTextContentDescription_", "rightDesc1ContentDescription_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SmallCoverRcmdItem> parser = PARSER;
                if (parser == null) {
                    synchronized (SmallCoverRcmdItem.class) {
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

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public String getCoverGif() {
        return this.coverGif_;
    }

    public ByteString getCoverGifBytes() {
        return ByteString.copyFromUtf8(this.coverGif_);
    }

    public String getCoverRightText1() {
        return this.coverRightText1_;
    }

    public ByteString getCoverRightText1Bytes() {
        return ByteString.copyFromUtf8(this.coverRightText1_);
    }

    public String getCoverRightTextContentDescription() {
        return this.coverRightTextContentDescription_;
    }

    public ByteString getCoverRightTextContentDescriptionBytes() {
        return ByteString.copyFromUtf8(this.coverRightTextContentDescription_);
    }

    public String getGoto() {
        return this.goto_;
    }

    public ByteString getGotoBytes() {
        return ByteString.copyFromUtf8(this.goto_);
    }

    public String getParam() {
        return this.param_;
    }

    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    public String getRightDesc1() {
        return this.rightDesc1_;
    }

    public ByteString getRightDesc1Bytes() {
        return ByteString.copyFromUtf8(this.rightDesc1_);
    }

    public String getRightDesc1ContentDescription() {
        return this.rightDesc1ContentDescription_;
    }

    public ByteString getRightDesc1ContentDescriptionBytes() {
        return ByteString.copyFromUtf8(this.rightDesc1ContentDescription_);
    }

    public String getRightDesc2() {
        return this.rightDesc2_;
    }

    public ByteString getRightDesc2Bytes() {
        return ByteString.copyFromUtf8(this.rightDesc2_);
    }

    public int getRightIcon1() {
        return this.rightIcon1_;
    }

    public int getRightIcon2() {
        return this.rightIcon2_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getUri() {
        return this.uri_;
    }

    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static C5864b newBuilder(SmallCoverRcmdItem smallCoverRcmdItem) {
        return DEFAULT_INSTANCE.createBuilder(smallCoverRcmdItem);
    }

    public static SmallCoverRcmdItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SmallCoverRcmdItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SmallCoverRcmdItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SmallCoverRcmdItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SmallCoverRcmdItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SmallCoverRcmdItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SmallCoverRcmdItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SmallCoverRcmdItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SmallCoverRcmdItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SmallCoverRcmdItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SmallCoverRcmdItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SmallCoverRcmdItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SmallCoverRcmdItem parseFrom(InputStream inputStream) throws IOException {
        return (SmallCoverRcmdItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SmallCoverRcmdItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SmallCoverRcmdItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SmallCoverRcmdItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SmallCoverRcmdItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SmallCoverRcmdItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SmallCoverRcmdItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
