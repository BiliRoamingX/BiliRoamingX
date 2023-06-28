package com.bapis.bilibili.app.view.v1;

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
public final class UgcSeason extends GeneratedMessageLite<UgcSeason, UgcSeason.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_FIELD_NUMBER = 21;
    public static final int COVER_FIELD_NUMBER = 3;
    private static final UgcSeason DEFAULT_INSTANCE;
    public static final int DESC_RIGHT_FIELD_NUMBER = 12;
    public static final int EP_COUNT_FIELD_NUMBER = 13;
    public static final int EP_NUM_FIELD_NUMBER = 16;
    public static final int GOODS_INFO_FIELD_NUMBER = 18;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INTRO_FIELD_NUMBER = 4;
    public static final int LABEL_BG_COLOR_FIELD_NUMBER = 9;
    public static final int LABEL_BG_NIGHT_COLOR_FIELD_NUMBER = 11;
    public static final int LABEL_TEXT_COLOR_FIELD_NUMBER = 8;
    public static final int LABEL_TEXT_FIELD_NUMBER = 7;
    public static final int LABEL_TEXT_NEW_FIELD_NUMBER = 20;
    public static final int LABEL_TEXT_NIGHT_COLOR_FIELD_NUMBER = 10;
    private static volatile Parser<UgcSeason> PARSER = null;
    public static final int PAY_BUTTON_FIELD_NUMBER = 19;
    public static final int SEASON_ABILITY_FIELD_NUMBER = 22;
    public static final int SEASON_PAY_FIELD_NUMBER = 17;
    public static final int SEASON_TYPE_FIELD_NUMBER = 14;
    public static final int SECTIONS_FIELD_NUMBER = 5;
    public static final int SHOW_CONTINUAL_BUTTON_FIELD_NUMBER = 15;
    public static final int STAT_FIELD_NUMBER = 6;
    public static final int STAT_V2_FIELD_NUMBER = 23;
    public static final int TITLE_FIELD_NUMBER = 2;
    private UgcSeasonActivity activity_;
    private long epCount_;
    private long epNum_;
    private GoodsInfo goodsInfo_;
    private long id_;
    private ButtonStyle payButton_;
    private boolean seasonPay_;
    private int seasonType_;
    private boolean showContinualButton_;
    private UgcSeasonStatV2 statV2_;
    private UgcSeasonStat stat_;
    private String title_ = "";
    private String cover_ = "";
    private String intro_ = "";
    private Internal.ProtobufList<Section> sections_ = GeneratedMessageLite.emptyProtobufList();
    private String labelText_ = "";
    private String labelTextColor_ = "";
    private String labelBgColor_ = "";
    private String labelTextNightColor_ = "";
    private String labelBgNightColor_ = "";
    private String descRight_ = "";
    private String labelTextNew_ = "";
    private Internal.ProtobufList<String> seasonAbility_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.UgcSeason$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68781 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16835xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16835xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16835xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16835xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16835xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16835xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16835xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16835xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UgcSeason, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68781 c68781) {
            this();
        }

        public Builder addAllSeasonAbility(Iterable<String> iterable) {
            copyOnWrite();
            ((UgcSeason) this.instance).addAllSeasonAbility(iterable);
            return this;
        }

        public Builder addAllSections(Iterable<? extends Section> iterable) {
            copyOnWrite();
            ((UgcSeason) this.instance).addAllSections(iterable);
            return this;
        }

        public Builder addSeasonAbility(String str) {
            copyOnWrite();
            ((UgcSeason) this.instance).addSeasonAbility(str);
            return this;
        }

        public Builder addSeasonAbilityBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeason) this.instance).addSeasonAbilityBytes(byteString);
            return this;
        }

        public Builder addSections(Section section) {
            copyOnWrite();
            ((UgcSeason) this.instance).addSections(section);
            return this;
        }

        public Builder clearActivity() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearActivity();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearCover();
            return this;
        }

        public Builder clearDescRight() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearDescRight();
            return this;
        }

        public Builder clearEpCount() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearEpCount();
            return this;
        }

        public Builder clearEpNum() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearEpNum();
            return this;
        }

        public Builder clearGoodsInfo() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearGoodsInfo();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearId();
            return this;
        }

        public Builder clearIntro() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearIntro();
            return this;
        }

        public Builder clearLabelBgColor() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearLabelBgColor();
            return this;
        }

        public Builder clearLabelBgNightColor() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearLabelBgNightColor();
            return this;
        }

        public Builder clearLabelText() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearLabelText();
            return this;
        }

        public Builder clearLabelTextColor() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearLabelTextColor();
            return this;
        }

        public Builder clearLabelTextNew() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearLabelTextNew();
            return this;
        }

        public Builder clearLabelTextNightColor() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearLabelTextNightColor();
            return this;
        }

        public Builder clearPayButton() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearPayButton();
            return this;
        }

        public Builder clearSeasonAbility() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearSeasonAbility();
            return this;
        }

        public Builder clearSeasonPay() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearSeasonPay();
            return this;
        }

        public Builder clearSeasonType() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearSeasonType();
            return this;
        }

        public Builder clearSections() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearSections();
            return this;
        }

        public Builder clearShowContinualButton() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearShowContinualButton();
            return this;
        }

        public Builder clearStat() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearStat();
            return this;
        }

        public Builder clearStatV2() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearStatV2();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((UgcSeason) this.instance).clearTitle();
            return this;
        }

        public UgcSeasonActivity getActivity() {
            return ((UgcSeason) this.instance).getActivity();
        }

        public String getCover() {
            return ((UgcSeason) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((UgcSeason) this.instance).getCoverBytes();
        }

        public String getDescRight() {
            return ((UgcSeason) this.instance).getDescRight();
        }

        public ByteString getDescRightBytes() {
            return ((UgcSeason) this.instance).getDescRightBytes();
        }

        public long getEpCount() {
            return ((UgcSeason) this.instance).getEpCount();
        }

        public long getEpNum() {
            return ((UgcSeason) this.instance).getEpNum();
        }

        public GoodsInfo getGoodsInfo() {
            return ((UgcSeason) this.instance).getGoodsInfo();
        }

        public long getId() {
            return ((UgcSeason) this.instance).getId();
        }

        public String getIntro() {
            return ((UgcSeason) this.instance).getIntro();
        }

        public ByteString getIntroBytes() {
            return ((UgcSeason) this.instance).getIntroBytes();
        }

        public String getLabelBgColor() {
            return ((UgcSeason) this.instance).getLabelBgColor();
        }

        public ByteString getLabelBgColorBytes() {
            return ((UgcSeason) this.instance).getLabelBgColorBytes();
        }

        public String getLabelBgNightColor() {
            return ((UgcSeason) this.instance).getLabelBgNightColor();
        }

        public ByteString getLabelBgNightColorBytes() {
            return ((UgcSeason) this.instance).getLabelBgNightColorBytes();
        }

        public String getLabelText() {
            return ((UgcSeason) this.instance).getLabelText();
        }

        public ByteString getLabelTextBytes() {
            return ((UgcSeason) this.instance).getLabelTextBytes();
        }

        public String getLabelTextColor() {
            return ((UgcSeason) this.instance).getLabelTextColor();
        }

        public ByteString getLabelTextColorBytes() {
            return ((UgcSeason) this.instance).getLabelTextColorBytes();
        }

        public String getLabelTextNew() {
            return ((UgcSeason) this.instance).getLabelTextNew();
        }

        public ByteString getLabelTextNewBytes() {
            return ((UgcSeason) this.instance).getLabelTextNewBytes();
        }

        public String getLabelTextNightColor() {
            return ((UgcSeason) this.instance).getLabelTextNightColor();
        }

        public ByteString getLabelTextNightColorBytes() {
            return ((UgcSeason) this.instance).getLabelTextNightColorBytes();
        }

        public ButtonStyle getPayButton() {
            return ((UgcSeason) this.instance).getPayButton();
        }

        public String getSeasonAbility(int i) {
            return ((UgcSeason) this.instance).getSeasonAbility(i);
        }

        public ByteString getSeasonAbilityBytes(int i) {
            return ((UgcSeason) this.instance).getSeasonAbilityBytes(i);
        }

        public int getSeasonAbilityCount() {
            return ((UgcSeason) this.instance).getSeasonAbilityCount();
        }

        public List<String> getSeasonAbilityList() {
            return Collections.unmodifiableList(((UgcSeason) this.instance).getSeasonAbilityList());
        }

        public boolean getSeasonPay() {
            return ((UgcSeason) this.instance).getSeasonPay();
        }

        public SeasonType getSeasonType() {
            return ((UgcSeason) this.instance).getSeasonType();
        }

        public int getSeasonTypeValue() {
            return ((UgcSeason) this.instance).getSeasonTypeValue();
        }

        public Section getSections(int i) {
            return ((UgcSeason) this.instance).getSections(i);
        }

        public int getSectionsCount() {
            return ((UgcSeason) this.instance).getSectionsCount();
        }

        public List<Section> getSectionsList() {
            return Collections.unmodifiableList(((UgcSeason) this.instance).getSectionsList());
        }

        public boolean getShowContinualButton() {
            return ((UgcSeason) this.instance).getShowContinualButton();
        }

        public UgcSeasonStat getStat() {
            return ((UgcSeason) this.instance).getStat();
        }

        public UgcSeasonStatV2 getStatV2() {
            return ((UgcSeason) this.instance).getStatV2();
        }

        public String getTitle() {
            return ((UgcSeason) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((UgcSeason) this.instance).getTitleBytes();
        }

        public boolean hasActivity() {
            return ((UgcSeason) this.instance).hasActivity();
        }

        public boolean hasGoodsInfo() {
            return ((UgcSeason) this.instance).hasGoodsInfo();
        }

        public boolean hasPayButton() {
            return ((UgcSeason) this.instance).hasPayButton();
        }

        public boolean hasStat() {
            return ((UgcSeason) this.instance).hasStat();
        }

        public boolean hasStatV2() {
            return ((UgcSeason) this.instance).hasStatV2();
        }

        public Builder mergeActivity(UgcSeasonActivity ugcSeasonActivity) {
            copyOnWrite();
            ((UgcSeason) this.instance).mergeActivity(ugcSeasonActivity);
            return this;
        }

        public Builder mergeGoodsInfo(GoodsInfo goodsInfo) {
            copyOnWrite();
            ((UgcSeason) this.instance).mergeGoodsInfo(goodsInfo);
            return this;
        }

        public Builder mergePayButton(ButtonStyle buttonStyle) {
            copyOnWrite();
            ((UgcSeason) this.instance).mergePayButton(buttonStyle);
            return this;
        }

        public Builder mergeStat(UgcSeasonStat ugcSeasonStat) {
            copyOnWrite();
            ((UgcSeason) this.instance).mergeStat(ugcSeasonStat);
            return this;
        }

        public Builder mergeStatV2(UgcSeasonStatV2 ugcSeasonStatV2) {
            copyOnWrite();
            ((UgcSeason) this.instance).mergeStatV2(ugcSeasonStatV2);
            return this;
        }

        public Builder removeSections(int i) {
            copyOnWrite();
            ((UgcSeason) this.instance).removeSections(i);
            return this;
        }

        public Builder setActivity(UgcSeasonActivity ugcSeasonActivity) {
            copyOnWrite();
            ((UgcSeason) this.instance).setActivity(ugcSeasonActivity);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((UgcSeason) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeason) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setDescRight(String str) {
            copyOnWrite();
            ((UgcSeason) this.instance).setDescRight(str);
            return this;
        }

        public Builder setDescRightBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeason) this.instance).setDescRightBytes(byteString);
            return this;
        }

        public Builder setEpCount(long j) {
            copyOnWrite();
            ((UgcSeason) this.instance).setEpCount(j);
            return this;
        }

        public Builder setEpNum(long j) {
            copyOnWrite();
            ((UgcSeason) this.instance).setEpNum(j);
            return this;
        }

        public Builder setGoodsInfo(GoodsInfo goodsInfo) {
            copyOnWrite();
            ((UgcSeason) this.instance).setGoodsInfo(goodsInfo);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((UgcSeason) this.instance).setId(j);
            return this;
        }

        public Builder setIntro(String str) {
            copyOnWrite();
            ((UgcSeason) this.instance).setIntro(str);
            return this;
        }

        public Builder setIntroBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeason) this.instance).setIntroBytes(byteString);
            return this;
        }

        public Builder setLabelBgColor(String str) {
            copyOnWrite();
            ((UgcSeason) this.instance).setLabelBgColor(str);
            return this;
        }

        public Builder setLabelBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeason) this.instance).setLabelBgColorBytes(byteString);
            return this;
        }

        public Builder setLabelBgNightColor(String str) {
            copyOnWrite();
            ((UgcSeason) this.instance).setLabelBgNightColor(str);
            return this;
        }

        public Builder setLabelBgNightColorBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeason) this.instance).setLabelBgNightColorBytes(byteString);
            return this;
        }

        public Builder setLabelText(String str) {
            copyOnWrite();
            ((UgcSeason) this.instance).setLabelText(str);
            return this;
        }

        public Builder setLabelTextBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeason) this.instance).setLabelTextBytes(byteString);
            return this;
        }

        public Builder setLabelTextColor(String str) {
            copyOnWrite();
            ((UgcSeason) this.instance).setLabelTextColor(str);
            return this;
        }

        public Builder setLabelTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeason) this.instance).setLabelTextColorBytes(byteString);
            return this;
        }

        public Builder setLabelTextNew(String str) {
            copyOnWrite();
            ((UgcSeason) this.instance).setLabelTextNew(str);
            return this;
        }

        public Builder setLabelTextNewBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeason) this.instance).setLabelTextNewBytes(byteString);
            return this;
        }

        public Builder setLabelTextNightColor(String str) {
            copyOnWrite();
            ((UgcSeason) this.instance).setLabelTextNightColor(str);
            return this;
        }

        public Builder setLabelTextNightColorBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeason) this.instance).setLabelTextNightColorBytes(byteString);
            return this;
        }

        public Builder setPayButton(ButtonStyle buttonStyle) {
            copyOnWrite();
            ((UgcSeason) this.instance).setPayButton(buttonStyle);
            return this;
        }

        public Builder setSeasonAbility(int i, String str) {
            copyOnWrite();
            ((UgcSeason) this.instance).setSeasonAbility(i, str);
            return this;
        }

        public Builder setSeasonPay(boolean z) {
            copyOnWrite();
            ((UgcSeason) this.instance).setSeasonPay(z);
            return this;
        }

        public Builder setSeasonType(SeasonType seasonType) {
            copyOnWrite();
            ((UgcSeason) this.instance).setSeasonType(seasonType);
            return this;
        }

        public Builder setSeasonTypeValue(int i) {
            copyOnWrite();
            ((UgcSeason) this.instance).setSeasonTypeValue(i);
            return this;
        }

        public Builder setSections(int i, Section section) {
            copyOnWrite();
            ((UgcSeason) this.instance).setSections(i, section);
            return this;
        }

        public Builder setShowContinualButton(boolean z) {
            copyOnWrite();
            ((UgcSeason) this.instance).setShowContinualButton(z);
            return this;
        }

        public Builder setStat(UgcSeasonStat ugcSeasonStat) {
            copyOnWrite();
            ((UgcSeason) this.instance).setStat(ugcSeasonStat);
            return this;
        }

        public Builder setStatV2(UgcSeasonStatV2 ugcSeasonStatV2) {
            copyOnWrite();
            ((UgcSeason) this.instance).setStatV2(ugcSeasonStatV2);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((UgcSeason) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeason) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(UgcSeason.DEFAULT_INSTANCE);
        }

        public Builder addSections(int i, Section section) {
            copyOnWrite();
            ((UgcSeason) this.instance).addSections(i, section);
            return this;
        }

        public Builder setActivity(UgcSeasonActivity.Builder builder) {
            copyOnWrite();
            ((UgcSeason) this.instance).setActivity(builder.build());
            return this;
        }

        public Builder setGoodsInfo(GoodsInfo.Builder builder) {
            copyOnWrite();
            ((UgcSeason) this.instance).setGoodsInfo(builder.build());
            return this;
        }

        public Builder setPayButton(ButtonStyle.Builder builder) {
            copyOnWrite();
            ((UgcSeason) this.instance).setPayButton(builder.build());
            return this;
        }

        public Builder setSections(int i, Section.Builder builder) {
            copyOnWrite();
            ((UgcSeason) this.instance).setSections(i, builder.build());
            return this;
        }

        public Builder setStat(UgcSeasonStat.Builder builder) {
            copyOnWrite();
            ((UgcSeason) this.instance).setStat(builder.build());
            return this;
        }

        public Builder setStatV2(UgcSeasonStatV2.Builder builder) {
            copyOnWrite();
            ((UgcSeason) this.instance).setStatV2(builder.build());
            return this;
        }

        public Builder addSections(Section.Builder builder) {
            copyOnWrite();
            ((UgcSeason) this.instance).addSections(builder.build());
            return this;
        }

        public Builder addSections(int i, Section.Builder builder) {
            copyOnWrite();
            ((UgcSeason) this.instance).addSections(i, builder.build());
            return this;
        }
    }

    static {
        UgcSeason ugcSeason = new UgcSeason();
        DEFAULT_INSTANCE = ugcSeason;
        GeneratedMessageLite.registerDefaultInstance(UgcSeason.class, ugcSeason);
    }

    private UgcSeason() {
    }

    public void addAllSeasonAbility(Iterable<String> iterable) {
        ensureSeasonAbilityIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.seasonAbility_);
    }

    public void addAllSections(Iterable<? extends Section> iterable) {
        ensureSectionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.sections_);
    }

    public void addSeasonAbility(String str) {
        str.getClass();
        ensureSeasonAbilityIsMutable();
        this.seasonAbility_.add(str);
    }

    public void addSeasonAbilityBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureSeasonAbilityIsMutable();
        this.seasonAbility_.add(byteString.toStringUtf8());
    }

    public void addSections(Section section) {
        section.getClass();
        ensureSectionsIsMutable();
        this.sections_.add(section);
    }

    public void clearActivity() {
        this.activity_ = null;
    }

    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    public void clearDescRight() {
        this.descRight_ = getDefaultInstance().getDescRight();
    }

    public void clearEpCount() {
        this.epCount_ = 0L;
    }

    public void clearEpNum() {
        this.epNum_ = 0L;
    }

    public void clearGoodsInfo() {
        this.goodsInfo_ = null;
    }

    public void clearId() {
        this.id_ = 0L;
    }

    public void clearIntro() {
        this.intro_ = getDefaultInstance().getIntro();
    }

    public void clearLabelBgColor() {
        this.labelBgColor_ = getDefaultInstance().getLabelBgColor();
    }

    public void clearLabelBgNightColor() {
        this.labelBgNightColor_ = getDefaultInstance().getLabelBgNightColor();
    }

    public void clearLabelText() {
        this.labelText_ = getDefaultInstance().getLabelText();
    }

    public void clearLabelTextColor() {
        this.labelTextColor_ = getDefaultInstance().getLabelTextColor();
    }

    public void clearLabelTextNew() {
        this.labelTextNew_ = getDefaultInstance().getLabelTextNew();
    }

    public void clearLabelTextNightColor() {
        this.labelTextNightColor_ = getDefaultInstance().getLabelTextNightColor();
    }

    public void clearPayButton() {
        this.payButton_ = null;
    }

    public void clearSeasonAbility() {
        this.seasonAbility_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearSeasonPay() {
        this.seasonPay_ = false;
    }

    public void clearSeasonType() {
        this.seasonType_ = 0;
    }

    public void clearSections() {
        this.sections_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearShowContinualButton() {
        this.showContinualButton_ = false;
    }

    public void clearStat() {
        this.stat_ = null;
    }

    public void clearStatV2() {
        this.statV2_ = null;
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureSeasonAbilityIsMutable() {
        Internal.ProtobufList<String> protobufList = this.seasonAbility_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.seasonAbility_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSectionsIsMutable() {
        Internal.ProtobufList<Section> protobufList = this.sections_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.sections_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static UgcSeason getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeActivity(UgcSeasonActivity ugcSeasonActivity) {
    }

    public void mergeGoodsInfo(GoodsInfo goodsInfo) {
    }

    public void mergePayButton(ButtonStyle buttonStyle) {
    }

    public void mergeStat(UgcSeasonStat ugcSeasonStat) {
    }

    public void mergeStatV2(UgcSeasonStatV2 ugcSeasonStatV2) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UgcSeason parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UgcSeason) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSeason parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UgcSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UgcSeason> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeSections(int i) {
        ensureSectionsIsMutable();
        this.sections_.remove(i);
    }

    public void setActivity(UgcSeasonActivity ugcSeasonActivity) {
        ugcSeasonActivity.getClass();
        this.activity_ = ugcSeasonActivity;
    }

    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    public void setDescRight(String str) {
        str.getClass();
        this.descRight_ = str;
    }

    public void setDescRightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.descRight_ = byteString.toStringUtf8();
    }

    public void setEpCount(long j) {
        this.epCount_ = j;
    }

    public void setEpNum(long j) {
        this.epNum_ = j;
    }

    public void setGoodsInfo(GoodsInfo goodsInfo) {
        goodsInfo.getClass();
        this.goodsInfo_ = goodsInfo;
    }

    public void setId(long j) {
        this.id_ = j;
    }

    public void setIntro(String str) {
        str.getClass();
        this.intro_ = str;
    }

    public void setIntroBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.intro_ = byteString.toStringUtf8();
    }

    public void setLabelBgColor(String str) {
        str.getClass();
        this.labelBgColor_ = str;
    }

    public void setLabelBgColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.labelBgColor_ = byteString.toStringUtf8();
    }

    public void setLabelBgNightColor(String str) {
        str.getClass();
        this.labelBgNightColor_ = str;
    }

    public void setLabelBgNightColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.labelBgNightColor_ = byteString.toStringUtf8();
    }

    public void setLabelText(String str) {
        str.getClass();
        this.labelText_ = str;
    }

    public void setLabelTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.labelText_ = byteString.toStringUtf8();
    }

    public void setLabelTextColor(String str) {
        str.getClass();
        this.labelTextColor_ = str;
    }

    public void setLabelTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.labelTextColor_ = byteString.toStringUtf8();
    }

    public void setLabelTextNew(String str) {
        str.getClass();
        this.labelTextNew_ = str;
    }

    public void setLabelTextNewBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.labelTextNew_ = byteString.toStringUtf8();
    }

    public void setLabelTextNightColor(String str) {
        str.getClass();
        this.labelTextNightColor_ = str;
    }

    public void setLabelTextNightColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.labelTextNightColor_ = byteString.toStringUtf8();
    }

    public void setPayButton(ButtonStyle buttonStyle) {
        buttonStyle.getClass();
        this.payButton_ = buttonStyle;
    }

    public void setSeasonAbility(int i, String str) {
        str.getClass();
        ensureSeasonAbilityIsMutable();
        this.seasonAbility_.set(i, str);
    }

    public void setSeasonPay(boolean z) {
        this.seasonPay_ = z;
    }

    public void setSeasonType(SeasonType seasonType) {
        this.seasonType_ = seasonType.getNumber();
    }

    public void setSeasonTypeValue(int i) {
        this.seasonType_ = i;
    }

    public void setSections(int i, Section section) {
        section.getClass();
        ensureSectionsIsMutable();
        this.sections_.set(i, section);
    }

    public void setShowContinualButton(boolean z) {
        this.showContinualButton_ = z;
    }

    public void setStat(UgcSeasonStat ugcSeasonStat) {
        ugcSeasonStat.getClass();
        this.stat_ = ugcSeasonStat;
    }

    public void setStatV2(UgcSeasonStatV2 ugcSeasonStatV2) {
        ugcSeasonStatV2.getClass();
        this.statV2_ = ugcSeasonStatV2;
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
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68781.f16835xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UgcSeason();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0000\u0001\u0017\u0017\u0000\u0002\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u001b\u0006\t\u0007\u0208\b\u0208\t\u0208\n\u0208\u000b\u0208\f\u0208\r\u0002\u000e\f\u000f\u0007\u0010\u0002\u0011\u0007\u0012\t\u0013\t\u0014\u0208\u0015\t\u0016\u021a\u0017\t", new Object[]{"id_", "title_", "cover_", "intro_", "sections_", Section.class, "stat_", "labelText_", "labelTextColor_", "labelBgColor_", "labelTextNightColor_", "labelBgNightColor_", "descRight_", "epCount_", "seasonType_", "showContinualButton_", "epNum_", "seasonPay_", "goodsInfo_", "payButton_", "labelTextNew_", "activity_", "seasonAbility_", "statV2_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UgcSeason> parser = PARSER;
                if (parser == null) {
                    synchronized (UgcSeason.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public UgcSeasonActivity getActivity() {
        UgcSeasonActivity ugcSeasonActivity = this.activity_;
        return ugcSeasonActivity == null ? UgcSeasonActivity.getDefaultInstance() : ugcSeasonActivity;
    }

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public String getDescRight() {
        return this.descRight_;
    }

    public ByteString getDescRightBytes() {
        return ByteString.copyFromUtf8(this.descRight_);
    }

    public long getEpCount() {
        return this.epCount_;
    }

    public long getEpNum() {
        return this.epNum_;
    }

    public GoodsInfo getGoodsInfo() {
        GoodsInfo goodsInfo = this.goodsInfo_;
        return goodsInfo == null ? GoodsInfo.getDefaultInstance() : goodsInfo;
    }

    public long getId() {
        return this.id_;
    }

    public String getIntro() {
        return this.intro_;
    }

    public ByteString getIntroBytes() {
        return ByteString.copyFromUtf8(this.intro_);
    }

    public String getLabelBgColor() {
        return this.labelBgColor_;
    }

    public ByteString getLabelBgColorBytes() {
        return ByteString.copyFromUtf8(this.labelBgColor_);
    }

    public String getLabelBgNightColor() {
        return this.labelBgNightColor_;
    }

    public ByteString getLabelBgNightColorBytes() {
        return ByteString.copyFromUtf8(this.labelBgNightColor_);
    }

    public String getLabelText() {
        return this.labelText_;
    }

    public ByteString getLabelTextBytes() {
        return ByteString.copyFromUtf8(this.labelText_);
    }

    public String getLabelTextColor() {
        return this.labelTextColor_;
    }

    public ByteString getLabelTextColorBytes() {
        return ByteString.copyFromUtf8(this.labelTextColor_);
    }

    public String getLabelTextNew() {
        return this.labelTextNew_;
    }

    public ByteString getLabelTextNewBytes() {
        return ByteString.copyFromUtf8(this.labelTextNew_);
    }

    public String getLabelTextNightColor() {
        return this.labelTextNightColor_;
    }

    public ByteString getLabelTextNightColorBytes() {
        return ByteString.copyFromUtf8(this.labelTextNightColor_);
    }

    public ButtonStyle getPayButton() {
        ButtonStyle buttonStyle = this.payButton_;
        return buttonStyle == null ? ButtonStyle.getDefaultInstance() : buttonStyle;
    }

    public String getSeasonAbility(int i) {
        return this.seasonAbility_.get(i);
    }

    public ByteString getSeasonAbilityBytes(int i) {
        return ByteString.copyFromUtf8(this.seasonAbility_.get(i));
    }

    public int getSeasonAbilityCount() {
        return this.seasonAbility_.size();
    }

    public List<String> getSeasonAbilityList() {
        return this.seasonAbility_;
    }

    public boolean getSeasonPay() {
        return this.seasonPay_;
    }

    public SeasonType getSeasonType() {
        SeasonType forNumber = SeasonType.forNumber(this.seasonType_);
        return forNumber == null ? SeasonType.UNRECOGNIZED : forNumber;
    }

    public int getSeasonTypeValue() {
        return this.seasonType_;
    }

    public Section getSections(int i) {
        return this.sections_.get(i);
    }

    public int getSectionsCount() {
        return this.sections_.size();
    }

    public List<Section> getSectionsList() {
        return this.sections_;
    }

    public SectionOrBuilder getSectionsOrBuilder(int i) {
        return this.sections_.get(i);
    }

    public List<? extends SectionOrBuilder> getSectionsOrBuilderList() {
        return this.sections_;
    }

    public boolean getShowContinualButton() {
        return this.showContinualButton_;
    }

    public UgcSeasonStat getStat() {
        UgcSeasonStat ugcSeasonStat = this.stat_;
        return ugcSeasonStat == null ? UgcSeasonStat.getDefaultInstance() : ugcSeasonStat;
    }

    public UgcSeasonStatV2 getStatV2() {
        UgcSeasonStatV2 ugcSeasonStatV2 = this.statV2_;
        return ugcSeasonStatV2 == null ? UgcSeasonStatV2.getDefaultInstance() : ugcSeasonStatV2;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public boolean hasActivity() {
        return this.activity_ != null;
    }

    public boolean hasGoodsInfo() {
        return this.goodsInfo_ != null;
    }

    public boolean hasPayButton() {
        return this.payButton_ != null;
    }

    public boolean hasStat() {
        return this.stat_ != null;
    }

    public boolean hasStatV2() {
        return this.statV2_ != null;
    }

    public static Builder newBuilder(UgcSeason ugcSeason) {
        return DEFAULT_INSTANCE.createBuilder(ugcSeason);
    }

    public static UgcSeason parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeason) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSeason parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UgcSeason parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UgcSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addSections(int i, Section section) {
        section.getClass();
        ensureSectionsIsMutable();
        this.sections_.add(i, section);
    }

    public static UgcSeason parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UgcSeason parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UgcSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UgcSeason parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UgcSeason parseFrom(InputStream inputStream) throws IOException {
        return (UgcSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSeason parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSeason parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UgcSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UgcSeason parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
