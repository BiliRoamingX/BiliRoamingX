package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.AbstractMessageLite;
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
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class DynamicHot extends GeneratedMessageLite<DynamicHot, DynamicHot.C5807b> implements MessageLiteOrBuilder {
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int COVERS_FIELD_NUMBER = 7;
    public static final int COVER_RIGHT_TEXT_FIELD_NUMBER = 8;
    private static final DynamicHot DEFAULT_INSTANCE;
    public static final int DESC1_FIELD_NUMBER = 3;
    public static final int DESC2_FIELD_NUMBER = 4;
    public static final int MORE_TEXT_FIELD_NUMBER = 6;
    public static final int MORE_URI_FIELD_NUMBER = 5;
    private static volatile Parser<DynamicHot> PARSER = null;
    public static final int TOP_LEFT_TITLE_FIELD_NUMBER = 2;
    public static final int TOP_RCMD_REASON_STYLE_FIELD_NUMBER = 9;
    private Base base_;
    private ReasonStyle topRcmdReasonStyle_;
    private String topLeftTitle_ = "";
    private String desc1_ = "";
    private String desc2_ = "";
    private String moreUri_ = "";
    private String moreText_ = "";
    private Internal.ProtobufList<String> covers_ = GeneratedMessageLite.emptyProtobufList();
    private String coverRightText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.DynamicHot$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5806a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15952xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15952xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15952xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.DynamicHot$b */
    /* loaded from: classes13.dex */
    public static final class C5807b extends GeneratedMessageLite.Builder<DynamicHot, C5807b> implements MessageLiteOrBuilder {
        /* synthetic */ C5807b(C5806a c5806a) {
            this();
        }

        public C5807b addAllCovers(Iterable<String> iterable) {
            copyOnWrite();
            ((DynamicHot) this.instance).addAllCovers(iterable);
            return this;
        }

        public C5807b addCovers(String str) {
            copyOnWrite();
            ((DynamicHot) this.instance).addCovers(str);
            return this;
        }

        public C5807b addCoversBytes(ByteString byteString) {
            copyOnWrite();
            ((DynamicHot) this.instance).addCoversBytes(byteString);
            return this;
        }

        public C5807b clearBase() {
            copyOnWrite();
            ((DynamicHot) this.instance).clearBase();
            return this;
        }

        public C5807b clearCoverRightText() {
            copyOnWrite();
            ((DynamicHot) this.instance).clearCoverRightText();
            return this;
        }

        public C5807b clearCovers() {
            copyOnWrite();
            ((DynamicHot) this.instance).clearCovers();
            return this;
        }

        public C5807b clearDesc1() {
            copyOnWrite();
            ((DynamicHot) this.instance).clearDesc1();
            return this;
        }

        public C5807b clearDesc2() {
            copyOnWrite();
            ((DynamicHot) this.instance).clearDesc2();
            return this;
        }

        public C5807b clearMoreText() {
            copyOnWrite();
            ((DynamicHot) this.instance).clearMoreText();
            return this;
        }

        public C5807b clearMoreUri() {
            copyOnWrite();
            ((DynamicHot) this.instance).clearMoreUri();
            return this;
        }

        public C5807b clearTopLeftTitle() {
            copyOnWrite();
            ((DynamicHot) this.instance).clearTopLeftTitle();
            return this;
        }

        public C5807b clearTopRcmdReasonStyle() {
            copyOnWrite();
            ((DynamicHot) this.instance).clearTopRcmdReasonStyle();
            return this;
        }

        public Base getBase() {
            return ((DynamicHot) this.instance).getBase();
        }

        public String getCoverRightText() {
            return ((DynamicHot) this.instance).getCoverRightText();
        }

        public ByteString getCoverRightTextBytes() {
            return ((DynamicHot) this.instance).getCoverRightTextBytes();
        }

        public String getCovers(int i) {
            return ((DynamicHot) this.instance).getCovers(i);
        }

        public ByteString getCoversBytes(int i) {
            return ((DynamicHot) this.instance).getCoversBytes(i);
        }

        public int getCoversCount() {
            return ((DynamicHot) this.instance).getCoversCount();
        }

        public List<String> getCoversList() {
            return Collections.unmodifiableList(((DynamicHot) this.instance).getCoversList());
        }

        public String getDesc1() {
            return ((DynamicHot) this.instance).getDesc1();
        }

        public ByteString getDesc1Bytes() {
            return ((DynamicHot) this.instance).getDesc1Bytes();
        }

        public String getDesc2() {
            return ((DynamicHot) this.instance).getDesc2();
        }

        public ByteString getDesc2Bytes() {
            return ((DynamicHot) this.instance).getDesc2Bytes();
        }

        public String getMoreText() {
            return ((DynamicHot) this.instance).getMoreText();
        }

        public ByteString getMoreTextBytes() {
            return ((DynamicHot) this.instance).getMoreTextBytes();
        }

        public String getMoreUri() {
            return ((DynamicHot) this.instance).getMoreUri();
        }

        public ByteString getMoreUriBytes() {
            return ((DynamicHot) this.instance).getMoreUriBytes();
        }

        public String getTopLeftTitle() {
            return ((DynamicHot) this.instance).getTopLeftTitle();
        }

        public ByteString getTopLeftTitleBytes() {
            return ((DynamicHot) this.instance).getTopLeftTitleBytes();
        }

        public ReasonStyle getTopRcmdReasonStyle() {
            return ((DynamicHot) this.instance).getTopRcmdReasonStyle();
        }

        public boolean hasBase() {
            return ((DynamicHot) this.instance).hasBase();
        }

        public boolean hasTopRcmdReasonStyle() {
            return ((DynamicHot) this.instance).hasTopRcmdReasonStyle();
        }

        public C5807b mergeBase(Base base2) {
            copyOnWrite();
            ((DynamicHot) this.instance).mergeBase(base2);
            return this;
        }

        public C5807b mergeTopRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((DynamicHot) this.instance).mergeTopRcmdReasonStyle(reasonStyle);
            return this;
        }

        public C5807b setBase(Base base2) {
            copyOnWrite();
            ((DynamicHot) this.instance).setBase(base2);
            return this;
        }

        public C5807b setCoverRightText(String str) {
            copyOnWrite();
            ((DynamicHot) this.instance).setCoverRightText(str);
            return this;
        }

        public C5807b setCoverRightTextBytes(ByteString byteString) {
            copyOnWrite();
            ((DynamicHot) this.instance).setCoverRightTextBytes(byteString);
            return this;
        }

        public C5807b setCovers(int i, String str) {
            copyOnWrite();
            ((DynamicHot) this.instance).setCovers(i, str);
            return this;
        }

        public C5807b setDesc1(String str) {
            copyOnWrite();
            ((DynamicHot) this.instance).setDesc1(str);
            return this;
        }

        public C5807b setDesc1Bytes(ByteString byteString) {
            copyOnWrite();
            ((DynamicHot) this.instance).setDesc1Bytes(byteString);
            return this;
        }

        public C5807b setDesc2(String str) {
            copyOnWrite();
            ((DynamicHot) this.instance).setDesc2(str);
            return this;
        }

        public C5807b setDesc2Bytes(ByteString byteString) {
            copyOnWrite();
            ((DynamicHot) this.instance).setDesc2Bytes(byteString);
            return this;
        }

        public C5807b setMoreText(String str) {
            copyOnWrite();
            ((DynamicHot) this.instance).setMoreText(str);
            return this;
        }

        public C5807b setMoreTextBytes(ByteString byteString) {
            copyOnWrite();
            ((DynamicHot) this.instance).setMoreTextBytes(byteString);
            return this;
        }

        public C5807b setMoreUri(String str) {
            copyOnWrite();
            ((DynamicHot) this.instance).setMoreUri(str);
            return this;
        }

        public C5807b setMoreUriBytes(ByteString byteString) {
            copyOnWrite();
            ((DynamicHot) this.instance).setMoreUriBytes(byteString);
            return this;
        }

        public C5807b setTopLeftTitle(String str) {
            copyOnWrite();
            ((DynamicHot) this.instance).setTopLeftTitle(str);
            return this;
        }

        public C5807b setTopLeftTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((DynamicHot) this.instance).setTopLeftTitleBytes(byteString);
            return this;
        }

        public C5807b setTopRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((DynamicHot) this.instance).setTopRcmdReasonStyle(reasonStyle);
            return this;
        }

        private C5807b() {
            super(DynamicHot.DEFAULT_INSTANCE);
        }

        public C5807b setBase(Base.C5793b c5793b) {
            copyOnWrite();
            ((DynamicHot) this.instance).setBase(c5793b.build());
            return this;
        }

        public C5807b setTopRcmdReasonStyle(ReasonStyle.C5853b c5853b) {
            copyOnWrite();
            ((DynamicHot) this.instance).setTopRcmdReasonStyle(c5853b.build());
            return this;
        }
    }

    static {
        DynamicHot dynamicHot = new DynamicHot();
        DEFAULT_INSTANCE = dynamicHot;
        GeneratedMessageLite.registerDefaultInstance(DynamicHot.class, dynamicHot);
    }

    private DynamicHot() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCovers(Iterable<String> iterable) {
        ensureCoversIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.covers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCovers(String str) {
        str.getClass();
        ensureCoversIsMutable();
        this.covers_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCoversBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureCoversIsMutable();
        this.covers_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.base_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverRightText() {
        this.coverRightText_ = getDefaultInstance().getCoverRightText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc1() {
        this.desc1_ = getDefaultInstance().getDesc1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc2() {
        this.desc2_ = getDefaultInstance().getDesc2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoreText() {
        this.moreText_ = getDefaultInstance().getMoreText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoreUri() {
        this.moreUri_ = getDefaultInstance().getMoreUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopLeftTitle() {
        this.topLeftTitle_ = getDefaultInstance().getTopLeftTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopRcmdReasonStyle() {
        this.topRcmdReasonStyle_ = null;
    }

    private void ensureCoversIsMutable() {
        Internal.ProtobufList<String> protobufList = this.covers_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.covers_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DynamicHot getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBase(Base base2) {
        base2.getClass();
        Base base3 = this.base_;
        if (base3 != null && base3 != Base.getDefaultInstance()) {
            this.base_ = Base.newBuilder(this.base_).mergeFrom((Base) base2).buildPartial();
        } else {
            this.base_ = base2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTopRcmdReasonStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ReasonStyle reasonStyle2 = this.topRcmdReasonStyle_;
        if (reasonStyle2 != null && reasonStyle2 != ReasonStyle.getDefaultInstance()) {
            this.topRcmdReasonStyle_ = ReasonStyle.newBuilder(this.topRcmdReasonStyle_).mergeFrom((ReasonStyle) reasonStyle).buildPartial();
        } else {
            this.topRcmdReasonStyle_ = reasonStyle;
        }
    }

    public static C5807b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DynamicHot parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DynamicHot) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynamicHot parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DynamicHot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DynamicHot> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBase(Base base2) {
        base2.getClass();
        this.base_ = base2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverRightText(String str) {
        str.getClass();
        this.coverRightText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverRightTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverRightText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(int i, String str) {
        str.getClass();
        ensureCoversIsMutable();
        this.covers_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc1(String str) {
        str.getClass();
        this.desc1_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc1Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc1_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc2(String str) {
        str.getClass();
        this.desc2_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc2_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreText(String str) {
        str.getClass();
        this.moreText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.moreText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreUri(String str) {
        str.getClass();
        this.moreUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.moreUri_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopLeftTitle(String str) {
        str.getClass();
        this.topLeftTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopLeftTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.topLeftTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopRcmdReasonStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.topRcmdReasonStyle_ = reasonStyle;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5806a.f15952xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DynamicHot();
            case 2:
                return new C5807b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001\t\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u021a\b\u0208\t\t", new Object[]{"base_", "topLeftTitle_", "desc1_", "desc2_", "moreUri_", "moreText_", "covers_", "coverRightText_", "topRcmdReasonStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DynamicHot> parser = PARSER;
                if (parser == null) {
                    synchronized (DynamicHot.class) {
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

    public Base getBase() {
        Base base2 = this.base_;
        return base2 == null ? Base.getDefaultInstance() : base2;
    }

    public String getCoverRightText() {
        return this.coverRightText_;
    }

    public ByteString getCoverRightTextBytes() {
        return ByteString.copyFromUtf8(this.coverRightText_);
    }

    public String getCovers(int i) {
        return this.covers_.get(i);
    }

    public ByteString getCoversBytes(int i) {
        return ByteString.copyFromUtf8(this.covers_.get(i));
    }

    public int getCoversCount() {
        return this.covers_.size();
    }

    public List<String> getCoversList() {
        return this.covers_;
    }

    public String getDesc1() {
        return this.desc1_;
    }

    public ByteString getDesc1Bytes() {
        return ByteString.copyFromUtf8(this.desc1_);
    }

    public String getDesc2() {
        return this.desc2_;
    }

    public ByteString getDesc2Bytes() {
        return ByteString.copyFromUtf8(this.desc2_);
    }

    public String getMoreText() {
        return this.moreText_;
    }

    public ByteString getMoreTextBytes() {
        return ByteString.copyFromUtf8(this.moreText_);
    }

    public String getMoreUri() {
        return this.moreUri_;
    }

    public ByteString getMoreUriBytes() {
        return ByteString.copyFromUtf8(this.moreUri_);
    }

    public String getTopLeftTitle() {
        return this.topLeftTitle_;
    }

    public ByteString getTopLeftTitleBytes() {
        return ByteString.copyFromUtf8(this.topLeftTitle_);
    }

    public ReasonStyle getTopRcmdReasonStyle() {
        ReasonStyle reasonStyle = this.topRcmdReasonStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    public boolean hasBase() {
        return this.base_ != null;
    }

    public boolean hasTopRcmdReasonStyle() {
        return this.topRcmdReasonStyle_ != null;
    }

    public static C5807b newBuilder(DynamicHot dynamicHot) {
        return DEFAULT_INSTANCE.createBuilder(dynamicHot);
    }

    public static DynamicHot parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicHot) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynamicHot parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicHot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DynamicHot parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DynamicHot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DynamicHot parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicHot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DynamicHot parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DynamicHot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DynamicHot parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicHot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DynamicHot parseFrom(InputStream inputStream) throws IOException {
        return (DynamicHot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynamicHot parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicHot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynamicHot parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DynamicHot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DynamicHot parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicHot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
