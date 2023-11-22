package com.bapis.bilibili.app.card.v1;

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
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class Base extends GeneratedMessageLite<Base, Base.C5793b> implements InterfaceC5923c {
    public static final int AD_INFO_FIELD_NUMBER = 12;
    public static final int ARGS_FIELD_NUMBER = 9;
    public static final int CARD_GOTO_FIELD_NUMBER = 2;
    public static final int CARD_TYPE_FIELD_NUMBER = 1;
    public static final int COVER_FIELD_NUMBER = 5;
    private static final Base DEFAULT_INSTANCE;
    public static final int DESC_BUTTON_FIELD_NUMBER = 17;
    public static final int FROM_TYPE_FIELD_NUMBER = 14;
    public static final int GOTO_FIELD_NUMBER = 3;
    public static final int IDX_FIELD_NUMBER = 11;
    public static final int MASK_FIELD_NUMBER = 13;
    public static final int PARAM_FIELD_NUMBER = 4;
    private static volatile Parser<Base> PARSER = null;
    public static final int PLAYER_ARGS_FIELD_NUMBER = 10;
    public static final int THREE_POINT_FIELD_NUMBER = 8;
    public static final int THREE_POINT_V2_FIELD_NUMBER = 15;
    public static final int THREE_POINT_V3_FIELD_NUMBER = 16;
    public static final int THREE_POINT_V4_FIELD_NUMBER = 18;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int UP_ARGS_FIELD_NUMBER = 19;
    public static final int URI_FIELD_NUMBER = 7;
    private AdInfo adInfo_;
    private Args args_;
    private Button descButton_;
    private long idx_;
    private Mask mask_;
    private PlayerArgs playerArgs_;
    private ThreePointV4 threePointV4_;
    private ThreePoint threePoint_;
    private UpArgs upArgs_;
    private String cardType_ = "";
    private String cardGoto_ = "";
    private String goto_ = "";
    private String param_ = "";
    private String cover_ = "";
    private String title_ = "";
    private String uri_ = "";
    private String fromType_ = "";
    private Internal.ProtobufList<ThreePointV2> threePointV2_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ThreePointV3> threePointV3_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Base$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5792a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15945xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15945xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15945xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Base$b */
    /* loaded from: classes13.dex */
    public static final class C5793b extends GeneratedMessageLite.Builder<Base, C5793b> implements InterfaceC5923c {
        /* synthetic */ C5793b(C5792a c5792a) {
            this();
        }

        public C5793b addAllThreePointV2(Iterable<? extends ThreePointV2> iterable) {
            copyOnWrite();
            ((Base) this.instance).addAllThreePointV2(iterable);
            return this;
        }

        public C5793b addAllThreePointV3(Iterable<? extends ThreePointV3> iterable) {
            copyOnWrite();
            ((Base) this.instance).addAllThreePointV3(iterable);
            return this;
        }

        public C5793b addThreePointV2(ThreePointV2 threePointV2) {
            copyOnWrite();
            ((Base) this.instance).addThreePointV2(threePointV2);
            return this;
        }

        public C5793b addThreePointV3(ThreePointV3 threePointV3) {
            copyOnWrite();
            ((Base) this.instance).addThreePointV3(threePointV3);
            return this;
        }

        public C5793b clearAdInfo() {
            copyOnWrite();
            ((Base) this.instance).clearAdInfo();
            return this;
        }

        public C5793b clearArgs() {
            copyOnWrite();
            ((Base) this.instance).clearArgs();
            return this;
        }

        public C5793b clearCardGoto() {
            copyOnWrite();
            ((Base) this.instance).clearCardGoto();
            return this;
        }

        public C5793b clearCardType() {
            copyOnWrite();
            ((Base) this.instance).clearCardType();
            return this;
        }

        public C5793b clearCover() {
            copyOnWrite();
            ((Base) this.instance).clearCover();
            return this;
        }

        public C5793b clearDescButton() {
            copyOnWrite();
            ((Base) this.instance).clearDescButton();
            return this;
        }

        public C5793b clearFromType() {
            copyOnWrite();
            ((Base) this.instance).clearFromType();
            return this;
        }

        public C5793b clearGoto() {
            copyOnWrite();
            ((Base) this.instance).clearGoto();
            return this;
        }

        public C5793b clearIdx() {
            copyOnWrite();
            ((Base) this.instance).clearIdx();
            return this;
        }

        public C5793b clearMask() {
            copyOnWrite();
            ((Base) this.instance).clearMask();
            return this;
        }

        public C5793b clearParam() {
            copyOnWrite();
            ((Base) this.instance).clearParam();
            return this;
        }

        public C5793b clearPlayerArgs() {
            copyOnWrite();
            ((Base) this.instance).clearPlayerArgs();
            return this;
        }

        public C5793b clearThreePoint() {
            copyOnWrite();
            ((Base) this.instance).clearThreePoint();
            return this;
        }

        public C5793b clearThreePointV2() {
            copyOnWrite();
            ((Base) this.instance).clearThreePointV2();
            return this;
        }

        public C5793b clearThreePointV3() {
            copyOnWrite();
            ((Base) this.instance).clearThreePointV3();
            return this;
        }

        public C5793b clearThreePointV4() {
            copyOnWrite();
            ((Base) this.instance).clearThreePointV4();
            return this;
        }

        public C5793b clearTitle() {
            copyOnWrite();
            ((Base) this.instance).clearTitle();
            return this;
        }

        public C5793b clearUpArgs() {
            copyOnWrite();
            ((Base) this.instance).clearUpArgs();
            return this;
        }

        public C5793b clearUri() {
            copyOnWrite();
            ((Base) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public AdInfo getAdInfo() {
            return ((Base) this.instance).getAdInfo();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public Args getArgs() {
            return ((Base) this.instance).getArgs();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public String getCardGoto() {
            return ((Base) this.instance).getCardGoto();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public ByteString getCardGotoBytes() {
            return ((Base) this.instance).getCardGotoBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public String getCardType() {
            return ((Base) this.instance).getCardType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public ByteString getCardTypeBytes() {
            return ((Base) this.instance).getCardTypeBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public String getCover() {
            return ((Base) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public ByteString getCoverBytes() {
            return ((Base) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public Button getDescButton() {
            return ((Base) this.instance).getDescButton();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public String getFromType() {
            return ((Base) this.instance).getFromType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public ByteString getFromTypeBytes() {
            return ((Base) this.instance).getFromTypeBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public String getGoto() {
            return ((Base) this.instance).getGoto();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public ByteString getGotoBytes() {
            return ((Base) this.instance).getGotoBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public long getIdx() {
            return ((Base) this.instance).getIdx();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public Mask getMask() {
            return ((Base) this.instance).getMask();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public String getParam() {
            return ((Base) this.instance).getParam();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public ByteString getParamBytes() {
            return ((Base) this.instance).getParamBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public PlayerArgs getPlayerArgs() {
            return ((Base) this.instance).getPlayerArgs();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public ThreePoint getThreePoint() {
            return ((Base) this.instance).getThreePoint();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public ThreePointV2 getThreePointV2(int i) {
            return ((Base) this.instance).getThreePointV2(i);
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public int getThreePointV2Count() {
            return ((Base) this.instance).getThreePointV2Count();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public List<ThreePointV2> getThreePointV2List() {
            return Collections.unmodifiableList(((Base) this.instance).getThreePointV2List());
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public ThreePointV3 getThreePointV3(int i) {
            return ((Base) this.instance).getThreePointV3(i);
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public int getThreePointV3Count() {
            return ((Base) this.instance).getThreePointV3Count();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public List<ThreePointV3> getThreePointV3List() {
            return Collections.unmodifiableList(((Base) this.instance).getThreePointV3List());
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public ThreePointV4 getThreePointV4() {
            return ((Base) this.instance).getThreePointV4();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public String getTitle() {
            return ((Base) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public ByteString getTitleBytes() {
            return ((Base) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public UpArgs getUpArgs() {
            return ((Base) this.instance).getUpArgs();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public String getUri() {
            return ((Base) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public ByteString getUriBytes() {
            return ((Base) this.instance).getUriBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public boolean hasAdInfo() {
            return ((Base) this.instance).hasAdInfo();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public boolean hasArgs() {
            return ((Base) this.instance).hasArgs();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public boolean hasDescButton() {
            return ((Base) this.instance).hasDescButton();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public boolean hasMask() {
            return ((Base) this.instance).hasMask();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public boolean hasPlayerArgs() {
            return ((Base) this.instance).hasPlayerArgs();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public boolean hasThreePoint() {
            return ((Base) this.instance).hasThreePoint();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public boolean hasThreePointV4() {
            return ((Base) this.instance).hasThreePointV4();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
        public boolean hasUpArgs() {
            return ((Base) this.instance).hasUpArgs();
        }

        public C5793b mergeAdInfo(AdInfo adInfo) {
            copyOnWrite();
            ((Base) this.instance).mergeAdInfo(adInfo);
            return this;
        }

        public C5793b mergeArgs(Args args) {
            copyOnWrite();
            ((Base) this.instance).mergeArgs(args);
            return this;
        }

        public C5793b mergeDescButton(Button button) {
            copyOnWrite();
            ((Base) this.instance).mergeDescButton(button);
            return this;
        }

        public C5793b mergeMask(Mask mask) {
            copyOnWrite();
            ((Base) this.instance).mergeMask(mask);
            return this;
        }

        public C5793b mergePlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((Base) this.instance).mergePlayerArgs(playerArgs);
            return this;
        }

        public C5793b mergeThreePoint(ThreePoint threePoint) {
            copyOnWrite();
            ((Base) this.instance).mergeThreePoint(threePoint);
            return this;
        }

        public C5793b mergeThreePointV4(ThreePointV4 threePointV4) {
            copyOnWrite();
            ((Base) this.instance).mergeThreePointV4(threePointV4);
            return this;
        }

        public C5793b mergeUpArgs(UpArgs upArgs) {
            copyOnWrite();
            ((Base) this.instance).mergeUpArgs(upArgs);
            return this;
        }

        public C5793b removeThreePointV2(int i) {
            copyOnWrite();
            ((Base) this.instance).removeThreePointV2(i);
            return this;
        }

        public C5793b removeThreePointV3(int i) {
            copyOnWrite();
            ((Base) this.instance).removeThreePointV3(i);
            return this;
        }

        public C5793b setAdInfo(AdInfo adInfo) {
            copyOnWrite();
            ((Base) this.instance).setAdInfo(adInfo);
            return this;
        }

        public C5793b setArgs(Args args) {
            copyOnWrite();
            ((Base) this.instance).setArgs(args);
            return this;
        }

        public C5793b setCardGoto(String str) {
            copyOnWrite();
            ((Base) this.instance).setCardGoto(str);
            return this;
        }

        public C5793b setCardGotoBytes(ByteString byteString) {
            copyOnWrite();
            ((Base) this.instance).setCardGotoBytes(byteString);
            return this;
        }

        public C5793b setCardType(String str) {
            copyOnWrite();
            ((Base) this.instance).setCardType(str);
            return this;
        }

        public C5793b setCardTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Base) this.instance).setCardTypeBytes(byteString);
            return this;
        }

        public C5793b setCover(String str) {
            copyOnWrite();
            ((Base) this.instance).setCover(str);
            return this;
        }

        public C5793b setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((Base) this.instance).setCoverBytes(byteString);
            return this;
        }

        public C5793b setDescButton(Button button) {
            copyOnWrite();
            ((Base) this.instance).setDescButton(button);
            return this;
        }

        public C5793b setFromType(String str) {
            copyOnWrite();
            ((Base) this.instance).setFromType(str);
            return this;
        }

        public C5793b setFromTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Base) this.instance).setFromTypeBytes(byteString);
            return this;
        }

        public C5793b setGoto(String str) {
            copyOnWrite();
            ((Base) this.instance).setGoto(str);
            return this;
        }

        public C5793b setGotoBytes(ByteString byteString) {
            copyOnWrite();
            ((Base) this.instance).setGotoBytes(byteString);
            return this;
        }

        public C5793b setIdx(long j) {
            copyOnWrite();
            ((Base) this.instance).setIdx(j);
            return this;
        }

        public C5793b setMask(Mask mask) {
            copyOnWrite();
            ((Base) this.instance).setMask(mask);
            return this;
        }

        public C5793b setParam(String str) {
            copyOnWrite();
            ((Base) this.instance).setParam(str);
            return this;
        }

        public C5793b setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((Base) this.instance).setParamBytes(byteString);
            return this;
        }

        public C5793b setPlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((Base) this.instance).setPlayerArgs(playerArgs);
            return this;
        }

        public C5793b setThreePoint(ThreePoint threePoint) {
            copyOnWrite();
            ((Base) this.instance).setThreePoint(threePoint);
            return this;
        }

        public C5793b setThreePointV2(int i, ThreePointV2 threePointV2) {
            copyOnWrite();
            ((Base) this.instance).setThreePointV2(i, threePointV2);
            return this;
        }

        public C5793b setThreePointV3(int i, ThreePointV3 threePointV3) {
            copyOnWrite();
            ((Base) this.instance).setThreePointV3(i, threePointV3);
            return this;
        }

        public C5793b setThreePointV4(ThreePointV4 threePointV4) {
            copyOnWrite();
            ((Base) this.instance).setThreePointV4(threePointV4);
            return this;
        }

        public C5793b setTitle(String str) {
            copyOnWrite();
            ((Base) this.instance).setTitle(str);
            return this;
        }

        public C5793b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Base) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C5793b setUpArgs(UpArgs upArgs) {
            copyOnWrite();
            ((Base) this.instance).setUpArgs(upArgs);
            return this;
        }

        public C5793b setUri(String str) {
            copyOnWrite();
            ((Base) this.instance).setUri(str);
            return this;
        }

        public C5793b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Base) this.instance).setUriBytes(byteString);
            return this;
        }

        private C5793b() {
            super(Base.DEFAULT_INSTANCE);
        }

        public C5793b addThreePointV2(int i, ThreePointV2 threePointV2) {
            copyOnWrite();
            ((Base) this.instance).addThreePointV2(i, threePointV2);
            return this;
        }

        public C5793b addThreePointV3(int i, ThreePointV3 threePointV3) {
            copyOnWrite();
            ((Base) this.instance).addThreePointV3(i, threePointV3);
            return this;
        }

        public C5793b setAdInfo(AdInfo.C5787b c5787b) {
            copyOnWrite();
            ((Base) this.instance).setAdInfo(c5787b.build());
            return this;
        }

        public C5793b setArgs(Args.C5789b c5789b) {
            copyOnWrite();
            ((Base) this.instance).setArgs(c5789b.build());
            return this;
        }

        public C5793b setDescButton(Button.C5797b c5797b) {
            copyOnWrite();
            ((Base) this.instance).setDescButton(c5797b.build());
            return this;
        }

        public C5793b setMask(Mask.C5833b c5833b) {
            copyOnWrite();
            ((Base) this.instance).setMask(c5833b.build());
            return this;
        }

        public C5793b setPlayerArgs(PlayerArgs.C5847b c5847b) {
            copyOnWrite();
            ((Base) this.instance).setPlayerArgs(c5847b.build());
            return this;
        }

        public C5793b setThreePoint(ThreePoint.C5894b c5894b) {
            copyOnWrite();
            ((Base) this.instance).setThreePoint(c5894b.build());
            return this;
        }

        public C5793b setThreePointV2(int i, ThreePointV2.C5896b c5896b) {
            copyOnWrite();
            ((Base) this.instance).setThreePointV2(i, c5896b.build());
            return this;
        }

        public C5793b setThreePointV3(int i, ThreePointV3.C5898b c5898b) {
            copyOnWrite();
            ((Base) this.instance).setThreePointV3(i, c5898b.build());
            return this;
        }

        public C5793b setThreePointV4(ThreePointV4.C5900b c5900b) {
            copyOnWrite();
            ((Base) this.instance).setThreePointV4(c5900b.build());
            return this;
        }

        public C5793b setUpArgs(UpArgs.C5916b c5916b) {
            copyOnWrite();
            ((Base) this.instance).setUpArgs(c5916b.build());
            return this;
        }

        public C5793b addThreePointV2(ThreePointV2.C5896b c5896b) {
            copyOnWrite();
            ((Base) this.instance).addThreePointV2(c5896b.build());
            return this;
        }

        public C5793b addThreePointV3(ThreePointV3.C5898b c5898b) {
            copyOnWrite();
            ((Base) this.instance).addThreePointV3(c5898b.build());
            return this;
        }

        public C5793b addThreePointV2(int i, ThreePointV2.C5896b c5896b) {
            copyOnWrite();
            ((Base) this.instance).addThreePointV2(i, c5896b.build());
            return this;
        }

        public C5793b addThreePointV3(int i, ThreePointV3.C5898b c5898b) {
            copyOnWrite();
            ((Base) this.instance).addThreePointV3(i, c5898b.build());
            return this;
        }
    }

    static {
        Base base2 = new Base();
        DEFAULT_INSTANCE = base2;
        GeneratedMessageLite.registerDefaultInstance(Base.class, base2);
    }

    private Base() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllThreePointV2(Iterable<? extends ThreePointV2> iterable) {
        ensureThreePointV2IsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.threePointV2_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllThreePointV3(Iterable<? extends ThreePointV3> iterable) {
        ensureThreePointV3IsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.threePointV3_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addThreePointV2(ThreePointV2 threePointV2) {
        threePointV2.getClass();
        ensureThreePointV2IsMutable();
        this.threePointV2_.add(threePointV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addThreePointV3(ThreePointV3 threePointV3) {
        threePointV3.getClass();
        ensureThreePointV3IsMutable();
        this.threePointV3_.add(threePointV3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdInfo() {
        this.adInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArgs() {
        this.args_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardGoto() {
        this.cardGoto_ = getDefaultInstance().getCardGoto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardType() {
        this.cardType_ = getDefaultInstance().getCardType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescButton() {
        this.descButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromType() {
        this.fromType_ = getDefaultInstance().getFromType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoto() {
        this.goto_ = getDefaultInstance().getGoto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdx() {
        this.idx_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMask() {
        this.mask_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerArgs() {
        this.playerArgs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreePoint() {
        this.threePoint_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreePointV2() {
        this.threePointV2_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreePointV3() {
        this.threePointV3_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreePointV4() {
        this.threePointV4_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpArgs() {
        this.upArgs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    private void ensureThreePointV2IsMutable() {
        Internal.ProtobufList<ThreePointV2> protobufList = this.threePointV2_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.threePointV2_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureThreePointV3IsMutable() {
        Internal.ProtobufList<ThreePointV3> protobufList = this.threePointV3_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.threePointV3_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Base getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdInfo(AdInfo adInfo) {
        adInfo.getClass();
        AdInfo adInfo2 = this.adInfo_;
        if (adInfo2 != null && adInfo2 != AdInfo.getDefaultInstance()) {
            this.adInfo_ = AdInfo.newBuilder(this.adInfo_).mergeFrom((AdInfo) adInfo).buildPartial();
        } else {
            this.adInfo_ = adInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArgs(Args args) {
        args.getClass();
        Args args2 = this.args_;
        if (args2 != null && args2 != Args.getDefaultInstance()) {
            this.args_ = Args.newBuilder(this.args_).mergeFrom((Args) args).buildPartial();
        } else {
            this.args_ = args;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDescButton(Button button) {
        button.getClass();
        Button button2 = this.descButton_;
        if (button2 != null && button2 != Button.getDefaultInstance()) {
            this.descButton_ = Button.newBuilder(this.descButton_).mergeFrom((Button) button).buildPartial();
        } else {
            this.descButton_ = button;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMask(Mask mask) {
        mask.getClass();
        Mask mask2 = this.mask_;
        if (mask2 != null && mask2 != Mask.getDefaultInstance()) {
            this.mask_ = Mask.newBuilder(this.mask_).mergeFrom((Mask) mask).buildPartial();
        } else {
            this.mask_ = mask;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerArgs(PlayerArgs playerArgs) {
        playerArgs.getClass();
        PlayerArgs playerArgs2 = this.playerArgs_;
        if (playerArgs2 != null && playerArgs2 != PlayerArgs.getDefaultInstance()) {
            this.playerArgs_ = PlayerArgs.newBuilder(this.playerArgs_).mergeFrom((PlayerArgs) playerArgs).buildPartial();
        } else {
            this.playerArgs_ = playerArgs;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeThreePoint(ThreePoint threePoint) {
        threePoint.getClass();
        ThreePoint threePoint2 = this.threePoint_;
        if (threePoint2 != null && threePoint2 != ThreePoint.getDefaultInstance()) {
            this.threePoint_ = ThreePoint.newBuilder(this.threePoint_).mergeFrom((ThreePoint) threePoint).buildPartial();
        } else {
            this.threePoint_ = threePoint;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeThreePointV4(ThreePointV4 threePointV4) {
        threePointV4.getClass();
        ThreePointV4 threePointV42 = this.threePointV4_;
        if (threePointV42 != null && threePointV42 != ThreePointV4.getDefaultInstance()) {
            this.threePointV4_ = ThreePointV4.newBuilder(this.threePointV4_).mergeFrom((ThreePointV4) threePointV4).buildPartial();
        } else {
            this.threePointV4_ = threePointV4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpArgs(UpArgs upArgs) {
        upArgs.getClass();
        UpArgs upArgs2 = this.upArgs_;
        if (upArgs2 != null && upArgs2 != UpArgs.getDefaultInstance()) {
            this.upArgs_ = UpArgs.newBuilder(this.upArgs_).mergeFrom((UpArgs) upArgs).buildPartial();
        } else {
            this.upArgs_ = upArgs;
        }
    }

    public static C5793b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Base parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Base) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Base parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Base) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Base> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeThreePointV2(int i) {
        ensureThreePointV2IsMutable();
        this.threePointV2_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeThreePointV3(int i) {
        ensureThreePointV3IsMutable();
        this.threePointV3_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdInfo(AdInfo adInfo) {
        adInfo.getClass();
        this.adInfo_ = adInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArgs(Args args) {
        args.getClass();
        this.args_ = args;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardGoto(String str) {
        str.getClass();
        this.cardGoto_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardGotoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cardGoto_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardType(String str) {
        str.getClass();
        this.cardType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cardType_ = byteString.toStringUtf8();
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
    public void setDescButton(Button button) {
        button.getClass();
        this.descButton_ = button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromType(String str) {
        str.getClass();
        this.fromType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromType_ = byteString.toStringUtf8();
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
    public void setIdx(long j) {
        this.idx_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMask(Mask mask) {
        mask.getClass();
        this.mask_ = mask;
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
    public void setPlayerArgs(PlayerArgs playerArgs) {
        playerArgs.getClass();
        this.playerArgs_ = playerArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreePoint(ThreePoint threePoint) {
        threePoint.getClass();
        this.threePoint_ = threePoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreePointV2(int i, ThreePointV2 threePointV2) {
        threePointV2.getClass();
        ensureThreePointV2IsMutable();
        this.threePointV2_.set(i, threePointV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreePointV3(int i, ThreePointV3 threePointV3) {
        threePointV3.getClass();
        ensureThreePointV3IsMutable();
        this.threePointV3_.set(i, threePointV3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreePointV4(ThreePointV4 threePointV4) {
        threePointV4.getClass();
        this.threePointV4_ = threePointV4;
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
    public void setUpArgs(UpArgs upArgs) {
        upArgs.getClass();
        this.upArgs_ = upArgs;
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
        switch (C5792a.f15945xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Base();
            case 2:
                return new C5793b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0000\u0001\u0013\u0013\u0000\u0002\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\t\t\t\n\t\u000b\u0002\f\t\r\t\u000e\u0208\u000f\u001b\u0010\u001b\u0011\t\u0012\t\u0013\t", new Object[]{"cardType_", "cardGoto_", "goto_", "param_", "cover_", "title_", "uri_", "threePoint_", "args_", "playerArgs_", "idx_", "adInfo_", "mask_", "fromType_", "threePointV2_", ThreePointV2.class, "threePointV3_", ThreePointV3.class, "descButton_", "threePointV4_", "upArgs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Base> parser = PARSER;
                if (parser == null) {
                    synchronized (Base.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public AdInfo getAdInfo() {
        AdInfo adInfo = this.adInfo_;
        return adInfo == null ? AdInfo.getDefaultInstance() : adInfo;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public Args getArgs() {
        Args args = this.args_;
        return args == null ? Args.getDefaultInstance() : args;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public String getCardGoto() {
        return this.cardGoto_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public ByteString getCardGotoBytes() {
        return ByteString.copyFromUtf8(this.cardGoto_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public String getCardType() {
        return this.cardType_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public ByteString getCardTypeBytes() {
        return ByteString.copyFromUtf8(this.cardType_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public Button getDescButton() {
        Button button = this.descButton_;
        return button == null ? Button.getDefaultInstance() : button;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public String getFromType() {
        return this.fromType_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public ByteString getFromTypeBytes() {
        return ByteString.copyFromUtf8(this.fromType_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public String getGoto() {
        return this.goto_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public ByteString getGotoBytes() {
        return ByteString.copyFromUtf8(this.goto_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public long getIdx() {
        return this.idx_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public Mask getMask() {
        Mask mask = this.mask_;
        return mask == null ? Mask.getDefaultInstance() : mask;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public String getParam() {
        return this.param_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public PlayerArgs getPlayerArgs() {
        PlayerArgs playerArgs = this.playerArgs_;
        return playerArgs == null ? PlayerArgs.getDefaultInstance() : playerArgs;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public ThreePoint getThreePoint() {
        ThreePoint threePoint = this.threePoint_;
        return threePoint == null ? ThreePoint.getDefaultInstance() : threePoint;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public ThreePointV2 getThreePointV2(int i) {
        return this.threePointV2_.get(i);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public int getThreePointV2Count() {
        return this.threePointV2_.size();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public List<ThreePointV2> getThreePointV2List() {
        return this.threePointV2_;
    }

    public InterfaceC5943w getThreePointV2OrBuilder(int i) {
        return this.threePointV2_.get(i);
    }

    public List<? extends InterfaceC5943w> getThreePointV2OrBuilderList() {
        return this.threePointV2_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public ThreePointV3 getThreePointV3(int i) {
        return this.threePointV3_.get(i);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public int getThreePointV3Count() {
        return this.threePointV3_.size();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public List<ThreePointV3> getThreePointV3List() {
        return this.threePointV3_;
    }

    public InterfaceC5944x getThreePointV3OrBuilder(int i) {
        return this.threePointV3_.get(i);
    }

    public List<? extends InterfaceC5944x> getThreePointV3OrBuilderList() {
        return this.threePointV3_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public ThreePointV4 getThreePointV4() {
        ThreePointV4 threePointV4 = this.threePointV4_;
        return threePointV4 == null ? ThreePointV4.getDefaultInstance() : threePointV4;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public UpArgs getUpArgs() {
        UpArgs upArgs = this.upArgs_;
        return upArgs == null ? UpArgs.getDefaultInstance() : upArgs;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public boolean hasAdInfo() {
        return this.adInfo_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public boolean hasArgs() {
        return this.args_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public boolean hasDescButton() {
        return this.descButton_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public boolean hasMask() {
        return this.mask_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public boolean hasPlayerArgs() {
        return this.playerArgs_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public boolean hasThreePoint() {
        return this.threePoint_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public boolean hasThreePointV4() {
        return this.threePointV4_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5923c
    public boolean hasUpArgs() {
        return this.upArgs_ != null;
    }

    public static C5793b newBuilder(Base base2) {
        return DEFAULT_INSTANCE.createBuilder(base2);
    }

    public static Base parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Base) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Base parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Base) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Base parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Base) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addThreePointV2(int i, ThreePointV2 threePointV2) {
        threePointV2.getClass();
        ensureThreePointV2IsMutable();
        this.threePointV2_.add(i, threePointV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addThreePointV3(int i, ThreePointV3 threePointV3) {
        threePointV3.getClass();
        ensureThreePointV3IsMutable();
        this.threePointV3_.add(i, threePointV3);
    }

    public static Base parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Base) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Base parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Base) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Base parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Base) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Base parseFrom(InputStream inputStream) throws IOException {
        return (Base) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Base parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Base) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Base parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Base) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Base parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Base) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
