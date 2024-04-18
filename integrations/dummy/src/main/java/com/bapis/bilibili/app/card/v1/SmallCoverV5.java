package com.bapis.bilibili.app.card.v1;

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
/* loaded from: classes13.dex */
public final class SmallCoverV5 extends GeneratedMessageLite<SmallCoverV5, SmallCoverV5.C5872b> implements InterfaceC5940t {
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int CORNER_MARK_STYLE_FIELD_NUMBER = 9;
    public static final int COVER_GIF_FIELD_NUMBER = 2;
    public static final int COVER_RIGHT_TEXT_1_FIELD_NUMBER = 4;
    public static final int COVER_RIGHT_TEXT_CONTENT_DESCRIPTION_FIELD_NUMBER = 13;
    private static final SmallCoverV5 DEFAULT_INSTANCE;
    public static final int HOTWORD_ENTRANCE_FIELD_NUMBER = 8;
    public static final int LEFT_CORNER_MARK_STYLE_FIELD_NUMBER = 12;
    private static volatile Parser<SmallCoverV5> PARSER = null;
    public static final int RCMD_REASON_STYLE_FIELD_NUMBER = 7;
    public static final int RIGHT_DESC_1_CONTENT_DESCRIPTION_FIELD_NUMBER = 14;
    public static final int RIGHT_DESC_1_FIELD_NUMBER = 5;
    public static final int RIGHT_DESC_2_FIELD_NUMBER = 6;
    public static final int RIGHT_ICON_1_FIELD_NUMBER = 10;
    public static final int RIGHT_ICON_2_FIELD_NUMBER = 11;
    public static final int UP_FIELD_NUMBER = 3;
    private Base base_;
    private ReasonStyle cornerMarkStyle_;
    private HotwordEntrance hotwordEntrance_;
    private ReasonStyle leftCornerMarkStyle_;
    private ReasonStyle rcmdReasonStyle_;
    private int rightIcon1_;
    private int rightIcon2_;
    private Up up_;
    private String coverGif_ = "";
    private String coverRightText1_ = "";
    private String rightDesc1_ = "";
    private String rightDesc2_ = "";
    private String coverRightTextContentDescription_ = "";
    private String rightDesc1ContentDescription_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.SmallCoverV5$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5871a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15984xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15984xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15984xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.SmallCoverV5$b */
    /* loaded from: classes13.dex */
    public static final class C5872b extends GeneratedMessageLite.Builder<SmallCoverV5, C5872b> implements InterfaceC5940t {
        /* synthetic */ C5872b(C5871a c5871a) {
            this();
        }

        public C5872b clearBase() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearBase();
            return this;
        }

        public C5872b clearCornerMarkStyle() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearCornerMarkStyle();
            return this;
        }

        public C5872b clearCoverGif() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearCoverGif();
            return this;
        }

        public C5872b clearCoverRightText1() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearCoverRightText1();
            return this;
        }

        public C5872b clearCoverRightTextContentDescription() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearCoverRightTextContentDescription();
            return this;
        }

        public C5872b clearHotwordEntrance() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearHotwordEntrance();
            return this;
        }

        public C5872b clearLeftCornerMarkStyle() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearLeftCornerMarkStyle();
            return this;
        }

        public C5872b clearRcmdReasonStyle() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearRcmdReasonStyle();
            return this;
        }

        public C5872b clearRightDesc1() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearRightDesc1();
            return this;
        }

        public C5872b clearRightDesc1ContentDescription() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearRightDesc1ContentDescription();
            return this;
        }

        public C5872b clearRightDesc2() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearRightDesc2();
            return this;
        }

        public C5872b clearRightIcon1() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearRightIcon1();
            return this;
        }

        public C5872b clearRightIcon2() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearRightIcon2();
            return this;
        }

        public C5872b clearUp() {
            copyOnWrite();
            ((SmallCoverV5) this.instance).clearUp();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public Base getBase() {
            return ((SmallCoverV5) this.instance).getBase();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public ReasonStyle getCornerMarkStyle() {
            return ((SmallCoverV5) this.instance).getCornerMarkStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public String getCoverGif() {
            return ((SmallCoverV5) this.instance).getCoverGif();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public ByteString getCoverGifBytes() {
            return ((SmallCoverV5) this.instance).getCoverGifBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public String getCoverRightText1() {
            return ((SmallCoverV5) this.instance).getCoverRightText1();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public ByteString getCoverRightText1Bytes() {
            return ((SmallCoverV5) this.instance).getCoverRightText1Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public String getCoverRightTextContentDescription() {
            return ((SmallCoverV5) this.instance).getCoverRightTextContentDescription();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public ByteString getCoverRightTextContentDescriptionBytes() {
            return ((SmallCoverV5) this.instance).getCoverRightTextContentDescriptionBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public HotwordEntrance getHotwordEntrance() {
            return ((SmallCoverV5) this.instance).getHotwordEntrance();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public ReasonStyle getLeftCornerMarkStyle() {
            return ((SmallCoverV5) this.instance).getLeftCornerMarkStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public ReasonStyle getRcmdReasonStyle() {
            return ((SmallCoverV5) this.instance).getRcmdReasonStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public String getRightDesc1() {
            return ((SmallCoverV5) this.instance).getRightDesc1();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public ByteString getRightDesc1Bytes() {
            return ((SmallCoverV5) this.instance).getRightDesc1Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public String getRightDesc1ContentDescription() {
            return ((SmallCoverV5) this.instance).getRightDesc1ContentDescription();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public ByteString getRightDesc1ContentDescriptionBytes() {
            return ((SmallCoverV5) this.instance).getRightDesc1ContentDescriptionBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public String getRightDesc2() {
            return ((SmallCoverV5) this.instance).getRightDesc2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public ByteString getRightDesc2Bytes() {
            return ((SmallCoverV5) this.instance).getRightDesc2Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public int getRightIcon1() {
            return ((SmallCoverV5) this.instance).getRightIcon1();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public int getRightIcon2() {
            return ((SmallCoverV5) this.instance).getRightIcon2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public Up getUp() {
            return ((SmallCoverV5) this.instance).getUp();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public boolean hasBase() {
            return ((SmallCoverV5) this.instance).hasBase();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public boolean hasCornerMarkStyle() {
            return ((SmallCoverV5) this.instance).hasCornerMarkStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public boolean hasHotwordEntrance() {
            return ((SmallCoverV5) this.instance).hasHotwordEntrance();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public boolean hasLeftCornerMarkStyle() {
            return ((SmallCoverV5) this.instance).hasLeftCornerMarkStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public boolean hasRcmdReasonStyle() {
            return ((SmallCoverV5) this.instance).hasRcmdReasonStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
        public boolean hasUp() {
            return ((SmallCoverV5) this.instance).hasUp();
        }

        public C5872b mergeBase(Base base2) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).mergeBase(base2);
            return this;
        }

        public C5872b mergeCornerMarkStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).mergeCornerMarkStyle(reasonStyle);
            return this;
        }

        public C5872b mergeHotwordEntrance(HotwordEntrance hotwordEntrance) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).mergeHotwordEntrance(hotwordEntrance);
            return this;
        }

        public C5872b mergeLeftCornerMarkStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).mergeLeftCornerMarkStyle(reasonStyle);
            return this;
        }

        public C5872b mergeRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).mergeRcmdReasonStyle(reasonStyle);
            return this;
        }

        public C5872b mergeUp(Up up) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).mergeUp(up);
            return this;
        }

        public C5872b setBase(Base base2) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setBase(base2);
            return this;
        }

        public C5872b setCornerMarkStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setCornerMarkStyle(reasonStyle);
            return this;
        }

        public C5872b setCoverGif(String str) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setCoverGif(str);
            return this;
        }

        public C5872b setCoverGifBytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setCoverGifBytes(byteString);
            return this;
        }

        public C5872b setCoverRightText1(String str) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setCoverRightText1(str);
            return this;
        }

        public C5872b setCoverRightText1Bytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setCoverRightText1Bytes(byteString);
            return this;
        }

        public C5872b setCoverRightTextContentDescription(String str) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setCoverRightTextContentDescription(str);
            return this;
        }

        public C5872b setCoverRightTextContentDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setCoverRightTextContentDescriptionBytes(byteString);
            return this;
        }

        public C5872b setHotwordEntrance(HotwordEntrance hotwordEntrance) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setHotwordEntrance(hotwordEntrance);
            return this;
        }

        public C5872b setLeftCornerMarkStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setLeftCornerMarkStyle(reasonStyle);
            return this;
        }

        public C5872b setRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setRcmdReasonStyle(reasonStyle);
            return this;
        }

        public C5872b setRightDesc1(String str) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setRightDesc1(str);
            return this;
        }

        public C5872b setRightDesc1Bytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setRightDesc1Bytes(byteString);
            return this;
        }

        public C5872b setRightDesc1ContentDescription(String str) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setRightDesc1ContentDescription(str);
            return this;
        }

        public C5872b setRightDesc1ContentDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setRightDesc1ContentDescriptionBytes(byteString);
            return this;
        }

        public C5872b setRightDesc2(String str) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setRightDesc2(str);
            return this;
        }

        public C5872b setRightDesc2Bytes(ByteString byteString) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setRightDesc2Bytes(byteString);
            return this;
        }

        public C5872b setRightIcon1(int i) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setRightIcon1(i);
            return this;
        }

        public C5872b setRightIcon2(int i) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setRightIcon2(i);
            return this;
        }

        public C5872b setUp(Up up) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setUp(up);
            return this;
        }

        private C5872b() {
            super(SmallCoverV5.DEFAULT_INSTANCE);
        }

        public C5872b setBase(Base.C5793b c5793b) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setBase(c5793b.build());
            return this;
        }

        public C5872b setCornerMarkStyle(ReasonStyle.C5853b c5853b) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setCornerMarkStyle(c5853b.build());
            return this;
        }

        public C5872b setHotwordEntrance(HotwordEntrance.C5819b c5819b) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setHotwordEntrance(c5819b.build());
            return this;
        }

        public C5872b setLeftCornerMarkStyle(ReasonStyle.C5853b c5853b) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setLeftCornerMarkStyle(c5853b.build());
            return this;
        }

        public C5872b setRcmdReasonStyle(ReasonStyle.C5853b c5853b) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setRcmdReasonStyle(c5853b.build());
            return this;
        }

        public C5872b setUp(Up.C5914b c5914b) {
            copyOnWrite();
            ((SmallCoverV5) this.instance).setUp(c5914b.build());
            return this;
        }
    }

    static {
        SmallCoverV5 smallCoverV5 = new SmallCoverV5();
        DEFAULT_INSTANCE = smallCoverV5;
        GeneratedMessageLite.registerDefaultInstance(SmallCoverV5.class, smallCoverV5);
    }

    private SmallCoverV5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.base_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCornerMarkStyle() {
        this.cornerMarkStyle_ = null;
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
    public void clearHotwordEntrance() {
        this.hotwordEntrance_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeftCornerMarkStyle() {
        this.leftCornerMarkStyle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRcmdReasonStyle() {
        this.rcmdReasonStyle_ = null;
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
    public void clearUp() {
        this.up_ = null;
    }

    public static SmallCoverV5 getDefaultInstance() {
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
    public void mergeCornerMarkStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ReasonStyle reasonStyle2 = this.cornerMarkStyle_;
        if (reasonStyle2 != null && reasonStyle2 != ReasonStyle.getDefaultInstance()) {
            this.cornerMarkStyle_ = ReasonStyle.newBuilder(this.cornerMarkStyle_).mergeFrom((ReasonStyle) reasonStyle).buildPartial();
        } else {
            this.cornerMarkStyle_ = reasonStyle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHotwordEntrance(HotwordEntrance hotwordEntrance) {
        hotwordEntrance.getClass();
        HotwordEntrance hotwordEntrance2 = this.hotwordEntrance_;
        if (hotwordEntrance2 != null && hotwordEntrance2 != HotwordEntrance.getDefaultInstance()) {
            this.hotwordEntrance_ = HotwordEntrance.newBuilder(this.hotwordEntrance_).mergeFrom((HotwordEntrance) hotwordEntrance).buildPartial();
        } else {
            this.hotwordEntrance_ = hotwordEntrance;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLeftCornerMarkStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ReasonStyle reasonStyle2 = this.leftCornerMarkStyle_;
        if (reasonStyle2 != null && reasonStyle2 != ReasonStyle.getDefaultInstance()) {
            this.leftCornerMarkStyle_ = ReasonStyle.newBuilder(this.leftCornerMarkStyle_).mergeFrom((ReasonStyle) reasonStyle).buildPartial();
        } else {
            this.leftCornerMarkStyle_ = reasonStyle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRcmdReasonStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ReasonStyle reasonStyle2 = this.rcmdReasonStyle_;
        if (reasonStyle2 != null && reasonStyle2 != ReasonStyle.getDefaultInstance()) {
            this.rcmdReasonStyle_ = ReasonStyle.newBuilder(this.rcmdReasonStyle_).mergeFrom((ReasonStyle) reasonStyle).buildPartial();
        } else {
            this.rcmdReasonStyle_ = reasonStyle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUp(Up up) {
        up.getClass();
        Up up2 = this.up_;
        if (up2 != null && up2 != Up.getDefaultInstance()) {
            this.up_ = Up.newBuilder(this.up_).mergeFrom((Up) up).buildPartial();
        } else {
            this.up_ = up;
        }
    }

    public static C5872b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SmallCoverV5 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SmallCoverV5) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SmallCoverV5 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SmallCoverV5) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SmallCoverV5> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBase(Base base2) {
        base2.getClass();
        this.base_ = base2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCornerMarkStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.cornerMarkStyle_ = reasonStyle;
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
    public void setHotwordEntrance(HotwordEntrance hotwordEntrance) {
        hotwordEntrance.getClass();
        this.hotwordEntrance_ = hotwordEntrance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeftCornerMarkStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.leftCornerMarkStyle_ = reasonStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRcmdReasonStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.rcmdReasonStyle_ = reasonStyle;
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
    public void setUp(Up up) {
        up.getClass();
        this.up_ = up;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5871a.f15984xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SmallCoverV5();
            case 2:
                return new C5872b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\t\u0004\u0208\u0005\u0208\u0006\u0208\u0007\t\b\t\t\t\n\u0004\u000b\u0004\f\t\r\u0208\u000e\u0208", new Object[]{"base_", "coverGif_", "up_", "coverRightText1_", "rightDesc1_", "rightDesc2_", "rcmdReasonStyle_", "hotwordEntrance_", "cornerMarkStyle_", "rightIcon1_", "rightIcon2_", "leftCornerMarkStyle_", "coverRightTextContentDescription_", "rightDesc1ContentDescription_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SmallCoverV5> parser = PARSER;
                if (parser == null) {
                    synchronized (SmallCoverV5.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public Base getBase() {
        Base base2 = this.base_;
        return base2 == null ? Base.getDefaultInstance() : base2;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public ReasonStyle getCornerMarkStyle() {
        ReasonStyle reasonStyle = this.cornerMarkStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public String getCoverGif() {
        return this.coverGif_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public ByteString getCoverGifBytes() {
        return ByteString.copyFromUtf8(this.coverGif_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public String getCoverRightText1() {
        return this.coverRightText1_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public ByteString getCoverRightText1Bytes() {
        return ByteString.copyFromUtf8(this.coverRightText1_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public String getCoverRightTextContentDescription() {
        return this.coverRightTextContentDescription_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public ByteString getCoverRightTextContentDescriptionBytes() {
        return ByteString.copyFromUtf8(this.coverRightTextContentDescription_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public HotwordEntrance getHotwordEntrance() {
        HotwordEntrance hotwordEntrance = this.hotwordEntrance_;
        return hotwordEntrance == null ? HotwordEntrance.getDefaultInstance() : hotwordEntrance;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public ReasonStyle getLeftCornerMarkStyle() {
        ReasonStyle reasonStyle = this.leftCornerMarkStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public ReasonStyle getRcmdReasonStyle() {
        ReasonStyle reasonStyle = this.rcmdReasonStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public String getRightDesc1() {
        return this.rightDesc1_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public ByteString getRightDesc1Bytes() {
        return ByteString.copyFromUtf8(this.rightDesc1_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public String getRightDesc1ContentDescription() {
        return this.rightDesc1ContentDescription_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public ByteString getRightDesc1ContentDescriptionBytes() {
        return ByteString.copyFromUtf8(this.rightDesc1ContentDescription_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public String getRightDesc2() {
        return this.rightDesc2_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public ByteString getRightDesc2Bytes() {
        return ByteString.copyFromUtf8(this.rightDesc2_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public int getRightIcon1() {
        return this.rightIcon1_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public int getRightIcon2() {
        return this.rightIcon2_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public Up getUp() {
        Up up = this.up_;
        return up == null ? Up.getDefaultInstance() : up;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public boolean hasBase() {
        return this.base_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public boolean hasCornerMarkStyle() {
        return this.cornerMarkStyle_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public boolean hasHotwordEntrance() {
        return this.hotwordEntrance_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public boolean hasLeftCornerMarkStyle() {
        return this.leftCornerMarkStyle_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public boolean hasRcmdReasonStyle() {
        return this.rcmdReasonStyle_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5940t
    public boolean hasUp() {
        return this.up_ != null;
    }

    public static C5872b newBuilder(SmallCoverV5 smallCoverV5) {
        return DEFAULT_INSTANCE.createBuilder(smallCoverV5);
    }

    public static SmallCoverV5 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SmallCoverV5) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SmallCoverV5 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SmallCoverV5) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SmallCoverV5 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SmallCoverV5) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SmallCoverV5 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SmallCoverV5) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SmallCoverV5 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SmallCoverV5) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SmallCoverV5 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SmallCoverV5) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SmallCoverV5 parseFrom(InputStream inputStream) throws IOException {
        return (SmallCoverV5) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SmallCoverV5 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SmallCoverV5) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SmallCoverV5 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SmallCoverV5) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SmallCoverV5 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SmallCoverV5) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
