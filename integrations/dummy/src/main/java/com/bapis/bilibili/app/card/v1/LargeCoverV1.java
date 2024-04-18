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
public final class LargeCoverV1 extends GeneratedMessageLite<LargeCoverV1, LargeCoverV1.C5823b> implements InterfaceC5932l {
    public static final int AVATAR_FIELD_NUMBER = 3;
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int BOTTOM_RCMD_REASON_FIELD_NUMBER = 9;
    public static final int BOTTOM_RCMD_REASON_STYLE_FIELD_NUMBER = 14;
    public static final int CAN_PLAY_FIELD_NUMBER = 12;
    public static final int COVER_BADGE_2_FIELD_NUMBER = 18;
    public static final int COVER_BADGE_FIELD_NUMBER = 7;
    public static final int COVER_GIF_FIELD_NUMBER = 2;
    public static final int COVER_LEFT_TEXT_1_FIELD_NUMBER = 4;
    public static final int COVER_LEFT_TEXT_2_FIELD_NUMBER = 5;
    public static final int COVER_LEFT_TEXT_3_FIELD_NUMBER = 6;
    public static final int COVER_RIGHT_TEXT_FIELD_NUMBER = 21;
    private static final LargeCoverV1 DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 10;
    public static final int LEFT_COVER_BADGE_STYLE_FIELD_NUMBER = 16;
    public static final int LIKE_BUTTON_FIELD_NUMBER = 19;
    public static final int OFFICIAL_ICON_FIELD_NUMBER = 11;
    private static volatile Parser<LargeCoverV1> PARSER = null;
    public static final int RCMD_REASON_STYLE_V2_FIELD_NUMBER = 15;
    public static final int RIGHT_COVER_BADGE_STYLE_FIELD_NUMBER = 17;
    public static final int TITLE_SINGLE_LINE_FIELD_NUMBER = 20;
    public static final int TOP_RCMD_REASON_FIELD_NUMBER = 8;
    public static final int TOP_RCMD_REASON_STYLE_FIELD_NUMBER = 13;
    private Avatar avatar_;
    private Base base_;
    private ReasonStyle bottomRcmdReasonStyle_;
    private int canPlay_;
    private ReasonStyle leftCoverBadgeStyle_;
    private LikeButton likeButton_;
    private int officialIcon_;
    private ReasonStyle rcmdReasonStyleV2_;
    private ReasonStyle rightCoverBadgeStyle_;
    private int titleSingleLine_;
    private ReasonStyle topRcmdReasonStyle_;
    private String coverGif_ = "";
    private String coverLeftText1_ = "";
    private String coverLeftText2_ = "";
    private String coverLeftText3_ = "";
    private String coverBadge_ = "";
    private String topRcmdReason_ = "";
    private String bottomRcmdReason_ = "";
    private String desc_ = "";
    private String coverBadge2_ = "";
    private String coverRightText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.LargeCoverV1$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5822a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15960xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15960xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15960xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15960xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15960xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15960xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15960xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15960xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.LargeCoverV1$b */
    /* loaded from: classes13.dex */
    public static final class C5823b extends GeneratedMessageLite.Builder<LargeCoverV1, C5823b> implements InterfaceC5932l {
        /* synthetic */ C5823b(C5822a c5822a) {
            this();
        }

        public C5823b clearAvatar() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearAvatar();
            return this;
        }

        public C5823b clearBase() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearBase();
            return this;
        }

        public C5823b clearBottomRcmdReason() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearBottomRcmdReason();
            return this;
        }

        public C5823b clearBottomRcmdReasonStyle() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearBottomRcmdReasonStyle();
            return this;
        }

        public C5823b clearCanPlay() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearCanPlay();
            return this;
        }

        public C5823b clearCoverBadge() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearCoverBadge();
            return this;
        }

        public C5823b clearCoverBadge2() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearCoverBadge2();
            return this;
        }

        public C5823b clearCoverGif() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearCoverGif();
            return this;
        }

        public C5823b clearCoverLeftText1() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearCoverLeftText1();
            return this;
        }

        public C5823b clearCoverLeftText2() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearCoverLeftText2();
            return this;
        }

        public C5823b clearCoverLeftText3() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearCoverLeftText3();
            return this;
        }

        public C5823b clearCoverRightText() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearCoverRightText();
            return this;
        }

        public C5823b clearDesc() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearDesc();
            return this;
        }

        public C5823b clearLeftCoverBadgeStyle() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearLeftCoverBadgeStyle();
            return this;
        }

        public C5823b clearLikeButton() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearLikeButton();
            return this;
        }

        public C5823b clearOfficialIcon() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearOfficialIcon();
            return this;
        }

        public C5823b clearRcmdReasonStyleV2() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearRcmdReasonStyleV2();
            return this;
        }

        public C5823b clearRightCoverBadgeStyle() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearRightCoverBadgeStyle();
            return this;
        }

        public C5823b clearTitleSingleLine() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearTitleSingleLine();
            return this;
        }

        public C5823b clearTopRcmdReason() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearTopRcmdReason();
            return this;
        }

        public C5823b clearTopRcmdReasonStyle() {
            copyOnWrite();
            ((LargeCoverV1) this.instance).clearTopRcmdReasonStyle();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public Avatar getAvatar() {
            return ((LargeCoverV1) this.instance).getAvatar();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public Base getBase() {
            return ((LargeCoverV1) this.instance).getBase();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public String getBottomRcmdReason() {
            return ((LargeCoverV1) this.instance).getBottomRcmdReason();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ByteString getBottomRcmdReasonBytes() {
            return ((LargeCoverV1) this.instance).getBottomRcmdReasonBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ReasonStyle getBottomRcmdReasonStyle() {
            return ((LargeCoverV1) this.instance).getBottomRcmdReasonStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public int getCanPlay() {
            return ((LargeCoverV1) this.instance).getCanPlay();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public String getCoverBadge() {
            return ((LargeCoverV1) this.instance).getCoverBadge();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public String getCoverBadge2() {
            return ((LargeCoverV1) this.instance).getCoverBadge2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ByteString getCoverBadge2Bytes() {
            return ((LargeCoverV1) this.instance).getCoverBadge2Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ByteString getCoverBadgeBytes() {
            return ((LargeCoverV1) this.instance).getCoverBadgeBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public String getCoverGif() {
            return ((LargeCoverV1) this.instance).getCoverGif();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ByteString getCoverGifBytes() {
            return ((LargeCoverV1) this.instance).getCoverGifBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public String getCoverLeftText1() {
            return ((LargeCoverV1) this.instance).getCoverLeftText1();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ByteString getCoverLeftText1Bytes() {
            return ((LargeCoverV1) this.instance).getCoverLeftText1Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public String getCoverLeftText2() {
            return ((LargeCoverV1) this.instance).getCoverLeftText2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ByteString getCoverLeftText2Bytes() {
            return ((LargeCoverV1) this.instance).getCoverLeftText2Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public String getCoverLeftText3() {
            return ((LargeCoverV1) this.instance).getCoverLeftText3();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ByteString getCoverLeftText3Bytes() {
            return ((LargeCoverV1) this.instance).getCoverLeftText3Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public String getCoverRightText() {
            return ((LargeCoverV1) this.instance).getCoverRightText();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ByteString getCoverRightTextBytes() {
            return ((LargeCoverV1) this.instance).getCoverRightTextBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public String getDesc() {
            return ((LargeCoverV1) this.instance).getDesc();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ByteString getDescBytes() {
            return ((LargeCoverV1) this.instance).getDescBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ReasonStyle getLeftCoverBadgeStyle() {
            return ((LargeCoverV1) this.instance).getLeftCoverBadgeStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public LikeButton getLikeButton() {
            return ((LargeCoverV1) this.instance).getLikeButton();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public int getOfficialIcon() {
            return ((LargeCoverV1) this.instance).getOfficialIcon();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ReasonStyle getRcmdReasonStyleV2() {
            return ((LargeCoverV1) this.instance).getRcmdReasonStyleV2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ReasonStyle getRightCoverBadgeStyle() {
            return ((LargeCoverV1) this.instance).getRightCoverBadgeStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public int getTitleSingleLine() {
            return ((LargeCoverV1) this.instance).getTitleSingleLine();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public String getTopRcmdReason() {
            return ((LargeCoverV1) this.instance).getTopRcmdReason();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ByteString getTopRcmdReasonBytes() {
            return ((LargeCoverV1) this.instance).getTopRcmdReasonBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public ReasonStyle getTopRcmdReasonStyle() {
            return ((LargeCoverV1) this.instance).getTopRcmdReasonStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public boolean hasAvatar() {
            return ((LargeCoverV1) this.instance).hasAvatar();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public boolean hasBase() {
            return ((LargeCoverV1) this.instance).hasBase();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public boolean hasBottomRcmdReasonStyle() {
            return ((LargeCoverV1) this.instance).hasBottomRcmdReasonStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public boolean hasLeftCoverBadgeStyle() {
            return ((LargeCoverV1) this.instance).hasLeftCoverBadgeStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public boolean hasLikeButton() {
            return ((LargeCoverV1) this.instance).hasLikeButton();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public boolean hasRcmdReasonStyleV2() {
            return ((LargeCoverV1) this.instance).hasRcmdReasonStyleV2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public boolean hasRightCoverBadgeStyle() {
            return ((LargeCoverV1) this.instance).hasRightCoverBadgeStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
        public boolean hasTopRcmdReasonStyle() {
            return ((LargeCoverV1) this.instance).hasTopRcmdReasonStyle();
        }

        public C5823b mergeAvatar(Avatar avatar) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).mergeAvatar(avatar);
            return this;
        }

        public C5823b mergeBase(Base base2) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).mergeBase(base2);
            return this;
        }

        public C5823b mergeBottomRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).mergeBottomRcmdReasonStyle(reasonStyle);
            return this;
        }

        public C5823b mergeLeftCoverBadgeStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).mergeLeftCoverBadgeStyle(reasonStyle);
            return this;
        }

        public C5823b mergeLikeButton(LikeButton likeButton) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).mergeLikeButton(likeButton);
            return this;
        }

        public C5823b mergeRcmdReasonStyleV2(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).mergeRcmdReasonStyleV2(reasonStyle);
            return this;
        }

        public C5823b mergeRightCoverBadgeStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).mergeRightCoverBadgeStyle(reasonStyle);
            return this;
        }

        public C5823b mergeTopRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).mergeTopRcmdReasonStyle(reasonStyle);
            return this;
        }

        public C5823b setAvatar(Avatar avatar) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setAvatar(avatar);
            return this;
        }

        public C5823b setBase(Base base2) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setBase(base2);
            return this;
        }

        public C5823b setBottomRcmdReason(String str) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setBottomRcmdReason(str);
            return this;
        }

        public C5823b setBottomRcmdReasonBytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setBottomRcmdReasonBytes(byteString);
            return this;
        }

        public C5823b setBottomRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setBottomRcmdReasonStyle(reasonStyle);
            return this;
        }

        public C5823b setCanPlay(int i) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCanPlay(i);
            return this;
        }

        public C5823b setCoverBadge(String str) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverBadge(str);
            return this;
        }

        public C5823b setCoverBadge2(String str) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverBadge2(str);
            return this;
        }

        public C5823b setCoverBadge2Bytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverBadge2Bytes(byteString);
            return this;
        }

        public C5823b setCoverBadgeBytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverBadgeBytes(byteString);
            return this;
        }

        public C5823b setCoverGif(String str) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverGif(str);
            return this;
        }

        public C5823b setCoverGifBytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverGifBytes(byteString);
            return this;
        }

        public C5823b setCoverLeftText1(String str) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverLeftText1(str);
            return this;
        }

        public C5823b setCoverLeftText1Bytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverLeftText1Bytes(byteString);
            return this;
        }

        public C5823b setCoverLeftText2(String str) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverLeftText2(str);
            return this;
        }

        public C5823b setCoverLeftText2Bytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverLeftText2Bytes(byteString);
            return this;
        }

        public C5823b setCoverLeftText3(String str) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverLeftText3(str);
            return this;
        }

        public C5823b setCoverLeftText3Bytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverLeftText3Bytes(byteString);
            return this;
        }

        public C5823b setCoverRightText(String str) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverRightText(str);
            return this;
        }

        public C5823b setCoverRightTextBytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setCoverRightTextBytes(byteString);
            return this;
        }

        public C5823b setDesc(String str) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setDesc(str);
            return this;
        }

        public C5823b setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setDescBytes(byteString);
            return this;
        }

        public C5823b setLeftCoverBadgeStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setLeftCoverBadgeStyle(reasonStyle);
            return this;
        }

        public C5823b setLikeButton(LikeButton likeButton) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setLikeButton(likeButton);
            return this;
        }

        public C5823b setOfficialIcon(int i) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setOfficialIcon(i);
            return this;
        }

        public C5823b setRcmdReasonStyleV2(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setRcmdReasonStyleV2(reasonStyle);
            return this;
        }

        public C5823b setRightCoverBadgeStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setRightCoverBadgeStyle(reasonStyle);
            return this;
        }

        public C5823b setTitleSingleLine(int i) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setTitleSingleLine(i);
            return this;
        }

        public C5823b setTopRcmdReason(String str) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setTopRcmdReason(str);
            return this;
        }

        public C5823b setTopRcmdReasonBytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setTopRcmdReasonBytes(byteString);
            return this;
        }

        public C5823b setTopRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setTopRcmdReasonStyle(reasonStyle);
            return this;
        }

        private C5823b() {
            super(LargeCoverV1.DEFAULT_INSTANCE);
        }

        public C5823b setAvatar(Avatar.C5791b c5791b) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setAvatar(c5791b.build());
            return this;
        }

        public C5823b setBase(Base.C5793b c5793b) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setBase(c5793b.build());
            return this;
        }

        public C5823b setBottomRcmdReasonStyle(ReasonStyle.C5853b c5853b) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setBottomRcmdReasonStyle(c5853b.build());
            return this;
        }

        public C5823b setLeftCoverBadgeStyle(ReasonStyle.C5853b c5853b) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setLeftCoverBadgeStyle(c5853b.build());
            return this;
        }

        public C5823b setLikeButton(LikeButton.C5831b c5831b) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setLikeButton(c5831b.build());
            return this;
        }

        public C5823b setRcmdReasonStyleV2(ReasonStyle.C5853b c5853b) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setRcmdReasonStyleV2(c5853b.build());
            return this;
        }

        public C5823b setRightCoverBadgeStyle(ReasonStyle.C5853b c5853b) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setRightCoverBadgeStyle(c5853b.build());
            return this;
        }

        public C5823b setTopRcmdReasonStyle(ReasonStyle.C5853b c5853b) {
            copyOnWrite();
            ((LargeCoverV1) this.instance).setTopRcmdReasonStyle(c5853b.build());
            return this;
        }
    }

    static {
        LargeCoverV1 largeCoverV1 = new LargeCoverV1();
        DEFAULT_INSTANCE = largeCoverV1;
        GeneratedMessageLite.registerDefaultInstance(LargeCoverV1.class, largeCoverV1);
    }

    private LargeCoverV1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatar() {
        this.avatar_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.base_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomRcmdReason() {
        this.bottomRcmdReason_ = getDefaultInstance().getBottomRcmdReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomRcmdReasonStyle() {
        this.bottomRcmdReasonStyle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanPlay() {
        this.canPlay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverBadge() {
        this.coverBadge_ = getDefaultInstance().getCoverBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverBadge2() {
        this.coverBadge2_ = getDefaultInstance().getCoverBadge2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverGif() {
        this.coverGif_ = getDefaultInstance().getCoverGif();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverLeftText1() {
        this.coverLeftText1_ = getDefaultInstance().getCoverLeftText1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverLeftText2() {
        this.coverLeftText2_ = getDefaultInstance().getCoverLeftText2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverLeftText3() {
        this.coverLeftText3_ = getDefaultInstance().getCoverLeftText3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverRightText() {
        this.coverRightText_ = getDefaultInstance().getCoverRightText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeftCoverBadgeStyle() {
        this.leftCoverBadgeStyle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikeButton() {
        this.likeButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOfficialIcon() {
        this.officialIcon_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRcmdReasonStyleV2() {
        this.rcmdReasonStyleV2_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightCoverBadgeStyle() {
        this.rightCoverBadgeStyle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitleSingleLine() {
        this.titleSingleLine_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopRcmdReason() {
        this.topRcmdReason_ = getDefaultInstance().getTopRcmdReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopRcmdReasonStyle() {
        this.topRcmdReasonStyle_ = null;
    }

    public static LargeCoverV1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvatar(Avatar avatar) {
        avatar.getClass();
        Avatar avatar2 = this.avatar_;
        if (avatar2 != null && avatar2 != Avatar.getDefaultInstance()) {
            this.avatar_ = Avatar.newBuilder(this.avatar_).mergeFrom((Avatar) avatar).buildPartial();
        } else {
            this.avatar_ = avatar;
        }
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
    public void mergeBottomRcmdReasonStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ReasonStyle reasonStyle2 = this.bottomRcmdReasonStyle_;
        if (reasonStyle2 != null && reasonStyle2 != ReasonStyle.getDefaultInstance()) {
            this.bottomRcmdReasonStyle_ = ReasonStyle.newBuilder(this.bottomRcmdReasonStyle_).mergeFrom((ReasonStyle) reasonStyle).buildPartial();
        } else {
            this.bottomRcmdReasonStyle_ = reasonStyle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLeftCoverBadgeStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ReasonStyle reasonStyle2 = this.leftCoverBadgeStyle_;
        if (reasonStyle2 != null && reasonStyle2 != ReasonStyle.getDefaultInstance()) {
            this.leftCoverBadgeStyle_ = ReasonStyle.newBuilder(this.leftCoverBadgeStyle_).mergeFrom((ReasonStyle) reasonStyle).buildPartial();
        } else {
            this.leftCoverBadgeStyle_ = reasonStyle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLikeButton(LikeButton likeButton) {
        likeButton.getClass();
        LikeButton likeButton2 = this.likeButton_;
        if (likeButton2 != null && likeButton2 != LikeButton.getDefaultInstance()) {
            this.likeButton_ = LikeButton.newBuilder(this.likeButton_).mergeFrom((LikeButton) likeButton).buildPartial();
        } else {
            this.likeButton_ = likeButton;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRcmdReasonStyleV2(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ReasonStyle reasonStyle2 = this.rcmdReasonStyleV2_;
        if (reasonStyle2 != null && reasonStyle2 != ReasonStyle.getDefaultInstance()) {
            this.rcmdReasonStyleV2_ = ReasonStyle.newBuilder(this.rcmdReasonStyleV2_).mergeFrom((ReasonStyle) reasonStyle).buildPartial();
        } else {
            this.rcmdReasonStyleV2_ = reasonStyle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRightCoverBadgeStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ReasonStyle reasonStyle2 = this.rightCoverBadgeStyle_;
        if (reasonStyle2 != null && reasonStyle2 != ReasonStyle.getDefaultInstance()) {
            this.rightCoverBadgeStyle_ = ReasonStyle.newBuilder(this.rightCoverBadgeStyle_).mergeFrom((ReasonStyle) reasonStyle).buildPartial();
        } else {
            this.rightCoverBadgeStyle_ = reasonStyle;
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

    public static C5823b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LargeCoverV1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LargeCoverV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LargeCoverV1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LargeCoverV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LargeCoverV1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatar(Avatar avatar) {
        avatar.getClass();
        this.avatar_ = avatar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBase(Base base2) {
        base2.getClass();
        this.base_ = base2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomRcmdReason(String str) {
        str.getClass();
        this.bottomRcmdReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomRcmdReasonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bottomRcmdReason_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomRcmdReasonStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.bottomRcmdReasonStyle_ = reasonStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanPlay(int i) {
        this.canPlay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBadge(String str) {
        str.getClass();
        this.coverBadge_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBadge2(String str) {
        str.getClass();
        this.coverBadge2_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBadge2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverBadge2_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBadgeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverBadge_ = byteString.toStringUtf8();
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
    public void setCoverLeftText1(String str) {
        str.getClass();
        this.coverLeftText1_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText1Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverLeftText1_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText2(String str) {
        str.getClass();
        this.coverLeftText2_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverLeftText2_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText3(String str) {
        str.getClass();
        this.coverLeftText3_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText3Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverLeftText3_ = byteString.toStringUtf8();
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
    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeftCoverBadgeStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.leftCoverBadgeStyle_ = reasonStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeButton(LikeButton likeButton) {
        likeButton.getClass();
        this.likeButton_ = likeButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfficialIcon(int i) {
        this.officialIcon_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRcmdReasonStyleV2(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.rcmdReasonStyleV2_ = reasonStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightCoverBadgeStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.rightCoverBadgeStyle_ = reasonStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleSingleLine(int i) {
        this.titleSingleLine_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopRcmdReason(String str) {
        str.getClass();
        this.topRcmdReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopRcmdReasonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.topRcmdReason_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopRcmdReasonStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.topRcmdReasonStyle_ = reasonStyle;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5822a.f15960xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LargeCoverV1();
            case 2:
                return new C5823b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0000\u0000\u0001\u0015\u0015\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\t\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0208\u000b\u0004\f\u0004\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\u0208\u0013\t\u0014\u0004\u0015\u0208", new Object[]{"base_", "coverGif_", "avatar_", "coverLeftText1_", "coverLeftText2_", "coverLeftText3_", "coverBadge_", "topRcmdReason_", "bottomRcmdReason_", "desc_", "officialIcon_", "canPlay_", "topRcmdReasonStyle_", "bottomRcmdReasonStyle_", "rcmdReasonStyleV2_", "leftCoverBadgeStyle_", "rightCoverBadgeStyle_", "coverBadge2_", "likeButton_", "titleSingleLine_", "coverRightText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LargeCoverV1> parser = PARSER;
                if (parser == null) {
                    synchronized (LargeCoverV1.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public Avatar getAvatar() {
        Avatar avatar = this.avatar_;
        return avatar == null ? Avatar.getDefaultInstance() : avatar;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public Base getBase() {
        Base base2 = this.base_;
        return base2 == null ? Base.getDefaultInstance() : base2;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public String getBottomRcmdReason() {
        return this.bottomRcmdReason_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ByteString getBottomRcmdReasonBytes() {
        return ByteString.copyFromUtf8(this.bottomRcmdReason_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ReasonStyle getBottomRcmdReasonStyle() {
        ReasonStyle reasonStyle = this.bottomRcmdReasonStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public int getCanPlay() {
        return this.canPlay_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public String getCoverBadge() {
        return this.coverBadge_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public String getCoverBadge2() {
        return this.coverBadge2_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ByteString getCoverBadge2Bytes() {
        return ByteString.copyFromUtf8(this.coverBadge2_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ByteString getCoverBadgeBytes() {
        return ByteString.copyFromUtf8(this.coverBadge_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public String getCoverGif() {
        return this.coverGif_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ByteString getCoverGifBytes() {
        return ByteString.copyFromUtf8(this.coverGif_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public String getCoverLeftText1() {
        return this.coverLeftText1_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ByteString getCoverLeftText1Bytes() {
        return ByteString.copyFromUtf8(this.coverLeftText1_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public String getCoverLeftText2() {
        return this.coverLeftText2_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ByteString getCoverLeftText2Bytes() {
        return ByteString.copyFromUtf8(this.coverLeftText2_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public String getCoverLeftText3() {
        return this.coverLeftText3_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ByteString getCoverLeftText3Bytes() {
        return ByteString.copyFromUtf8(this.coverLeftText3_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public String getCoverRightText() {
        return this.coverRightText_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ByteString getCoverRightTextBytes() {
        return ByteString.copyFromUtf8(this.coverRightText_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public String getDesc() {
        return this.desc_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ReasonStyle getLeftCoverBadgeStyle() {
        ReasonStyle reasonStyle = this.leftCoverBadgeStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public LikeButton getLikeButton() {
        LikeButton likeButton = this.likeButton_;
        return likeButton == null ? LikeButton.getDefaultInstance() : likeButton;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public int getOfficialIcon() {
        return this.officialIcon_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ReasonStyle getRcmdReasonStyleV2() {
        ReasonStyle reasonStyle = this.rcmdReasonStyleV2_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ReasonStyle getRightCoverBadgeStyle() {
        ReasonStyle reasonStyle = this.rightCoverBadgeStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public int getTitleSingleLine() {
        return this.titleSingleLine_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public String getTopRcmdReason() {
        return this.topRcmdReason_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ByteString getTopRcmdReasonBytes() {
        return ByteString.copyFromUtf8(this.topRcmdReason_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public ReasonStyle getTopRcmdReasonStyle() {
        ReasonStyle reasonStyle = this.topRcmdReasonStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public boolean hasAvatar() {
        return this.avatar_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public boolean hasBase() {
        return this.base_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public boolean hasBottomRcmdReasonStyle() {
        return this.bottomRcmdReasonStyle_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public boolean hasLeftCoverBadgeStyle() {
        return this.leftCoverBadgeStyle_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public boolean hasLikeButton() {
        return this.likeButton_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public boolean hasRcmdReasonStyleV2() {
        return this.rcmdReasonStyleV2_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public boolean hasRightCoverBadgeStyle() {
        return this.rightCoverBadgeStyle_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5932l
    public boolean hasTopRcmdReasonStyle() {
        return this.topRcmdReasonStyle_ != null;
    }

    public static C5823b newBuilder(LargeCoverV1 largeCoverV1) {
        return DEFAULT_INSTANCE.createBuilder(largeCoverV1);
    }

    public static LargeCoverV1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LargeCoverV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LargeCoverV1 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LargeCoverV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LargeCoverV1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LargeCoverV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LargeCoverV1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LargeCoverV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LargeCoverV1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LargeCoverV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LargeCoverV1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LargeCoverV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LargeCoverV1 parseFrom(InputStream inputStream) throws IOException {
        return (LargeCoverV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LargeCoverV1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LargeCoverV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LargeCoverV1 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LargeCoverV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LargeCoverV1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LargeCoverV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
