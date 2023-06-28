package com.bapis.bilibili.app.view.v1;

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
public final class Config extends GeneratedMessageLite<Config, Config.Builder> implements MessageLiteOrBuilder {
    public static final int ABTEST_SMALL_WINDOW_FIELD_NUMBER = 8;
    public static final int ARC_LANDSCAPE_STORY_FIELD_NUMBER = 22;
    public static final int ARC_PLAY_STORY_FIELD_NUMBER = 19;
    public static final int AUTO_SWINDOW_FIELD_NUMBER = 6;
    private static final Config DEFAULT_INSTANCE;
    public static final int DM_TREASURE_BOX_CONTROL_FIELD_NUMBER = 27;
    public static final int END_PAGE_FULL_FIELD_NUMBER = 5;
    public static final int END_PAGE_HALF_FIELD_NUMBER = 4;
    public static final int IS_ABSOLUTE_TIME_FIELD_NUMBER = 10;
    public static final int LANDSCAPE_ICON_FIELD_NUMBER = 23;
    public static final int LANDSCAPE_STORY_FIELD_NUMBER = 21;
    public static final int LISTENER_CONF_FIELD_NUMBER = 13;
    public static final int LOCAL_PLAY_FIELD_NUMBER = 17;
    public static final int NEW_SWINDOW_FIELD_NUMBER = 11;
    private static volatile Parser<Config> PARSER = null;
    public static final int PLAY_STORY_FIELD_NUMBER = 18;
    public static final int POPUP_INFO_FIELD_NUMBER = 7;
    public static final int REC_THREE_POINT_STYLE_FIELD_NUMBER = 9;
    public static final int RELATES_BISERIAL_FIELD_NUMBER = 12;
    public static final int RELATES_FEED_POPUP_FIELD_NUMBER = 15;
    public static final int RELATES_FEED_STYLE_FIELD_NUMBER = 14;
    public static final int RELATES_HAS_NEXT_FIELD_NUMBER = 16;
    public static final int RELATES_STYLE_FIELD_NUMBER = 2;
    public static final int RELATES_TITLE_FIELD_NUMBER = 1;
    public static final int RELATE_GIF_EXP_FIELD_NUMBER = 3;
    public static final int SHOW_LISTEN_BUTTON_FIELD_NUMBER = 24;
    public static final int STORY_ICON_FIELD_NUMBER = 20;
    public static final int VALID_SHOW_M_FIELD_NUMBER = 25;
    public static final int VALID_SHOW_N_FIELD_NUMBER = 26;
    private boolean arcLandscapeStory_;
    private boolean arcPlayStory_;
    private boolean autoSwindow_;
    private boolean dmTreasureBoxControl_;
    private int endPageFull_;
    private int endPageHalf_;
    private boolean isAbsoluteTime_;
    private boolean landscapeStory_;
    private ListenerConfig listenerConf_;
    private int localPlay_;
    private boolean newSwindow_;
    private boolean playStory_;
    private boolean popupInfo_;
    private int recThreePointStyle_;
    private int relateGifExp_;
    private boolean relatesBiserial_;
    private boolean relatesFeedPopup_;
    private boolean relatesHasNext_;
    private int relatesStyle_;
    private boolean showListenButton_;
    private long validShowM_;
    private long validShowN_;
    private String relatesTitle_ = "";
    private String abtestSmallWindow_ = "";
    private String relatesFeedStyle_ = "";
    private String storyIcon_ = "";
    private String landscapeIcon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Config$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67431 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16717xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16717xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16717xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16717xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16717xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16717xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16717xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16717xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Config, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67431 c67431) {
            this();
        }

        public Builder clearAbtestSmallWindow() {
            copyOnWrite();
            ((Config) this.instance).clearAbtestSmallWindow();
            return this;
        }

        public Builder clearArcLandscapeStory() {
            copyOnWrite();
            ((Config) this.instance).clearArcLandscapeStory();
            return this;
        }

        public Builder clearArcPlayStory() {
            copyOnWrite();
            ((Config) this.instance).clearArcPlayStory();
            return this;
        }

        public Builder clearAutoSwindow() {
            copyOnWrite();
            ((Config) this.instance).clearAutoSwindow();
            return this;
        }

        public Builder clearDmTreasureBoxControl() {
            copyOnWrite();
            ((Config) this.instance).clearDmTreasureBoxControl();
            return this;
        }

        public Builder clearEndPageFull() {
            copyOnWrite();
            ((Config) this.instance).clearEndPageFull();
            return this;
        }

        public Builder clearEndPageHalf() {
            copyOnWrite();
            ((Config) this.instance).clearEndPageHalf();
            return this;
        }

        public Builder clearIsAbsoluteTime() {
            copyOnWrite();
            ((Config) this.instance).clearIsAbsoluteTime();
            return this;
        }

        public Builder clearLandscapeIcon() {
            copyOnWrite();
            ((Config) this.instance).clearLandscapeIcon();
            return this;
        }

        public Builder clearLandscapeStory() {
            copyOnWrite();
            ((Config) this.instance).clearLandscapeStory();
            return this;
        }

        public Builder clearListenerConf() {
            copyOnWrite();
            ((Config) this.instance).clearListenerConf();
            return this;
        }

        public Builder clearLocalPlay() {
            copyOnWrite();
            ((Config) this.instance).clearLocalPlay();
            return this;
        }

        public Builder clearNewSwindow() {
            copyOnWrite();
            ((Config) this.instance).clearNewSwindow();
            return this;
        }

        public Builder clearPlayStory() {
            copyOnWrite();
            ((Config) this.instance).clearPlayStory();
            return this;
        }

        public Builder clearPopupInfo() {
            copyOnWrite();
            ((Config) this.instance).clearPopupInfo();
            return this;
        }

        public Builder clearRecThreePointStyle() {
            copyOnWrite();
            ((Config) this.instance).clearRecThreePointStyle();
            return this;
        }

        public Builder clearRelateGifExp() {
            copyOnWrite();
            ((Config) this.instance).clearRelateGifExp();
            return this;
        }

        public Builder clearRelatesBiserial() {
            copyOnWrite();
            ((Config) this.instance).clearRelatesBiserial();
            return this;
        }

        public Builder clearRelatesFeedPopup() {
            copyOnWrite();
            ((Config) this.instance).clearRelatesFeedPopup();
            return this;
        }

        public Builder clearRelatesFeedStyle() {
            copyOnWrite();
            ((Config) this.instance).clearRelatesFeedStyle();
            return this;
        }

        public Builder clearRelatesHasNext() {
            copyOnWrite();
            ((Config) this.instance).clearRelatesHasNext();
            return this;
        }

        public Builder clearRelatesStyle() {
            copyOnWrite();
            ((Config) this.instance).clearRelatesStyle();
            return this;
        }

        public Builder clearRelatesTitle() {
            copyOnWrite();
            ((Config) this.instance).clearRelatesTitle();
            return this;
        }

        public Builder clearShowListenButton() {
            copyOnWrite();
            ((Config) this.instance).clearShowListenButton();
            return this;
        }

        public Builder clearStoryIcon() {
            copyOnWrite();
            ((Config) this.instance).clearStoryIcon();
            return this;
        }

        public Builder clearValidShowM() {
            copyOnWrite();
            ((Config) this.instance).clearValidShowM();
            return this;
        }

        public Builder clearValidShowN() {
            copyOnWrite();
            ((Config) this.instance).clearValidShowN();
            return this;
        }

        public String getAbtestSmallWindow() {
            return ((Config) this.instance).getAbtestSmallWindow();
        }

        public ByteString getAbtestSmallWindowBytes() {
            return ((Config) this.instance).getAbtestSmallWindowBytes();
        }

        public boolean getArcLandscapeStory() {
            return ((Config) this.instance).getArcLandscapeStory();
        }

        public boolean getArcPlayStory() {
            return ((Config) this.instance).getArcPlayStory();
        }

        public boolean getAutoSwindow() {
            return ((Config) this.instance).getAutoSwindow();
        }

        public boolean getDmTreasureBoxControl() {
            return ((Config) this.instance).getDmTreasureBoxControl();
        }

        public int getEndPageFull() {
            return ((Config) this.instance).getEndPageFull();
        }

        public int getEndPageHalf() {
            return ((Config) this.instance).getEndPageHalf();
        }

        public boolean getIsAbsoluteTime() {
            return ((Config) this.instance).getIsAbsoluteTime();
        }

        public String getLandscapeIcon() {
            return ((Config) this.instance).getLandscapeIcon();
        }

        public ByteString getLandscapeIconBytes() {
            return ((Config) this.instance).getLandscapeIconBytes();
        }

        public boolean getLandscapeStory() {
            return ((Config) this.instance).getLandscapeStory();
        }

        public ListenerConfig getListenerConf() {
            return ((Config) this.instance).getListenerConf();
        }

        public int getLocalPlay() {
            return ((Config) this.instance).getLocalPlay();
        }

        public boolean getNewSwindow() {
            return ((Config) this.instance).getNewSwindow();
        }

        public boolean getPlayStory() {
            return ((Config) this.instance).getPlayStory();
        }

        public boolean getPopupInfo() {
            return ((Config) this.instance).getPopupInfo();
        }

        public int getRecThreePointStyle() {
            return ((Config) this.instance).getRecThreePointStyle();
        }

        public int getRelateGifExp() {
            return ((Config) this.instance).getRelateGifExp();
        }

        public boolean getRelatesBiserial() {
            return ((Config) this.instance).getRelatesBiserial();
        }

        public boolean getRelatesFeedPopup() {
            return ((Config) this.instance).getRelatesFeedPopup();
        }

        public String getRelatesFeedStyle() {
            return ((Config) this.instance).getRelatesFeedStyle();
        }

        public ByteString getRelatesFeedStyleBytes() {
            return ((Config) this.instance).getRelatesFeedStyleBytes();
        }

        public boolean getRelatesHasNext() {
            return ((Config) this.instance).getRelatesHasNext();
        }

        public int getRelatesStyle() {
            return ((Config) this.instance).getRelatesStyle();
        }

        public String getRelatesTitle() {
            return ((Config) this.instance).getRelatesTitle();
        }

        public ByteString getRelatesTitleBytes() {
            return ((Config) this.instance).getRelatesTitleBytes();
        }

        public boolean getShowListenButton() {
            return ((Config) this.instance).getShowListenButton();
        }

        public String getStoryIcon() {
            return ((Config) this.instance).getStoryIcon();
        }

        public ByteString getStoryIconBytes() {
            return ((Config) this.instance).getStoryIconBytes();
        }

        public long getValidShowM() {
            return ((Config) this.instance).getValidShowM();
        }

        public long getValidShowN() {
            return ((Config) this.instance).getValidShowN();
        }

        public boolean hasListenerConf() {
            return ((Config) this.instance).hasListenerConf();
        }

        public Builder mergeListenerConf(ListenerConfig listenerConfig) {
            copyOnWrite();
            ((Config) this.instance).mergeListenerConf(listenerConfig);
            return this;
        }

        public Builder setAbtestSmallWindow(String str) {
            copyOnWrite();
            ((Config) this.instance).setAbtestSmallWindow(str);
            return this;
        }

        public Builder setAbtestSmallWindowBytes(ByteString byteString) {
            copyOnWrite();
            ((Config) this.instance).setAbtestSmallWindowBytes(byteString);
            return this;
        }

        public Builder setArcLandscapeStory(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setArcLandscapeStory(z);
            return this;
        }

        public Builder setArcPlayStory(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setArcPlayStory(z);
            return this;
        }

        public Builder setAutoSwindow(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setAutoSwindow(z);
            return this;
        }

        public Builder setDmTreasureBoxControl(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setDmTreasureBoxControl(z);
            return this;
        }

        public Builder setEndPageFull(int i) {
            copyOnWrite();
            ((Config) this.instance).setEndPageFull(i);
            return this;
        }

        public Builder setEndPageHalf(int i) {
            copyOnWrite();
            ((Config) this.instance).setEndPageHalf(i);
            return this;
        }

        public Builder setIsAbsoluteTime(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setIsAbsoluteTime(z);
            return this;
        }

        public Builder setLandscapeIcon(String str) {
            copyOnWrite();
            ((Config) this.instance).setLandscapeIcon(str);
            return this;
        }

        public Builder setLandscapeIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Config) this.instance).setLandscapeIconBytes(byteString);
            return this;
        }

        public Builder setLandscapeStory(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setLandscapeStory(z);
            return this;
        }

        public Builder setListenerConf(ListenerConfig listenerConfig) {
            copyOnWrite();
            ((Config) this.instance).setListenerConf(listenerConfig);
            return this;
        }

        public Builder setLocalPlay(int i) {
            copyOnWrite();
            ((Config) this.instance).setLocalPlay(i);
            return this;
        }

        public Builder setNewSwindow(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setNewSwindow(z);
            return this;
        }

        public Builder setPlayStory(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setPlayStory(z);
            return this;
        }

        public Builder setPopupInfo(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setPopupInfo(z);
            return this;
        }

        public Builder setRecThreePointStyle(int i) {
            copyOnWrite();
            ((Config) this.instance).setRecThreePointStyle(i);
            return this;
        }

        public Builder setRelateGifExp(int i) {
            copyOnWrite();
            ((Config) this.instance).setRelateGifExp(i);
            return this;
        }

        public Builder setRelatesBiserial(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setRelatesBiserial(z);
            return this;
        }

        public Builder setRelatesFeedPopup(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setRelatesFeedPopup(z);
            return this;
        }

        public Builder setRelatesFeedStyle(String str) {
            copyOnWrite();
            ((Config) this.instance).setRelatesFeedStyle(str);
            return this;
        }

        public Builder setRelatesFeedStyleBytes(ByteString byteString) {
            copyOnWrite();
            ((Config) this.instance).setRelatesFeedStyleBytes(byteString);
            return this;
        }

        public Builder setRelatesHasNext(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setRelatesHasNext(z);
            return this;
        }

        public Builder setRelatesStyle(int i) {
            copyOnWrite();
            ((Config) this.instance).setRelatesStyle(i);
            return this;
        }

        public Builder setRelatesTitle(String str) {
            copyOnWrite();
            ((Config) this.instance).setRelatesTitle(str);
            return this;
        }

        public Builder setRelatesTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Config) this.instance).setRelatesTitleBytes(byteString);
            return this;
        }

        public Builder setShowListenButton(boolean z) {
            copyOnWrite();
            ((Config) this.instance).setShowListenButton(z);
            return this;
        }

        public Builder setStoryIcon(String str) {
            copyOnWrite();
            ((Config) this.instance).setStoryIcon(str);
            return this;
        }

        public Builder setStoryIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Config) this.instance).setStoryIconBytes(byteString);
            return this;
        }

        public Builder setValidShowM(long j) {
            copyOnWrite();
            ((Config) this.instance).setValidShowM(j);
            return this;
        }

        public Builder setValidShowN(long j) {
            copyOnWrite();
            ((Config) this.instance).setValidShowN(j);
            return this;
        }

        private Builder() {
            super(Config.DEFAULT_INSTANCE);
        }

        public Builder setListenerConf(ListenerConfig.Builder builder) {
            copyOnWrite();
            ((Config) this.instance).setListenerConf(builder.build());
            return this;
        }
    }

    static {
        Config config = new Config();
        DEFAULT_INSTANCE = config;
        GeneratedMessageLite.registerDefaultInstance(Config.class, config);
    }

    private Config() {
    }

    public void clearAbtestSmallWindow() {
        this.abtestSmallWindow_ = getDefaultInstance().getAbtestSmallWindow();
    }

    public void clearArcLandscapeStory() {
        this.arcLandscapeStory_ = false;
    }

    public void clearArcPlayStory() {
        this.arcPlayStory_ = false;
    }

    public void clearAutoSwindow() {
        this.autoSwindow_ = false;
    }

    public void clearDmTreasureBoxControl() {
        this.dmTreasureBoxControl_ = false;
    }

    public void clearEndPageFull() {
        this.endPageFull_ = 0;
    }

    public void clearEndPageHalf() {
        this.endPageHalf_ = 0;
    }

    public void clearIsAbsoluteTime() {
        this.isAbsoluteTime_ = false;
    }

    public void clearLandscapeIcon() {
        this.landscapeIcon_ = getDefaultInstance().getLandscapeIcon();
    }

    public void clearLandscapeStory() {
        this.landscapeStory_ = false;
    }

    public void clearListenerConf() {
        this.listenerConf_ = null;
    }

    public void clearLocalPlay() {
        this.localPlay_ = 0;
    }

    public void clearNewSwindow() {
        this.newSwindow_ = false;
    }

    public void clearPlayStory() {
        this.playStory_ = false;
    }

    public void clearPopupInfo() {
        this.popupInfo_ = false;
    }

    public void clearRecThreePointStyle() {
        this.recThreePointStyle_ = 0;
    }

    public void clearRelateGifExp() {
        this.relateGifExp_ = 0;
    }

    public void clearRelatesBiserial() {
        this.relatesBiserial_ = false;
    }

    public void clearRelatesFeedPopup() {
        this.relatesFeedPopup_ = false;
    }

    public void clearRelatesFeedStyle() {
        this.relatesFeedStyle_ = getDefaultInstance().getRelatesFeedStyle();
    }

    public void clearRelatesHasNext() {
        this.relatesHasNext_ = false;
    }

    public void clearRelatesStyle() {
        this.relatesStyle_ = 0;
    }

    public void clearRelatesTitle() {
        this.relatesTitle_ = getDefaultInstance().getRelatesTitle();
    }

    public void clearShowListenButton() {
        this.showListenButton_ = false;
    }

    public void clearStoryIcon() {
        this.storyIcon_ = getDefaultInstance().getStoryIcon();
    }

    public void clearValidShowM() {
        this.validShowM_ = 0L;
    }

    public void clearValidShowN() {
        this.validShowN_ = 0L;
    }

    public static Config getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeListenerConf(ListenerConfig listenerConfig) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Config parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Config) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Config parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Config> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAbtestSmallWindow(String str) {
        str.getClass();
        this.abtestSmallWindow_ = str;
    }

    public void setAbtestSmallWindowBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.abtestSmallWindow_ = byteString.toStringUtf8();
    }

    public void setArcLandscapeStory(boolean z) {
        this.arcLandscapeStory_ = z;
    }

    public void setArcPlayStory(boolean z) {
        this.arcPlayStory_ = z;
    }

    public void setAutoSwindow(boolean z) {
        this.autoSwindow_ = z;
    }

    public void setDmTreasureBoxControl(boolean z) {
        this.dmTreasureBoxControl_ = z;
    }

    public void setEndPageFull(int i) {
        this.endPageFull_ = i;
    }

    public void setEndPageHalf(int i) {
        this.endPageHalf_ = i;
    }

    public void setIsAbsoluteTime(boolean z) {
        this.isAbsoluteTime_ = z;
    }

    public void setLandscapeIcon(String str) {
        str.getClass();
        this.landscapeIcon_ = str;
    }

    public void setLandscapeIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.landscapeIcon_ = byteString.toStringUtf8();
    }

    public void setLandscapeStory(boolean z) {
        this.landscapeStory_ = z;
    }

    public void setListenerConf(ListenerConfig listenerConfig) {
        listenerConfig.getClass();
        this.listenerConf_ = listenerConfig;
    }

    public void setLocalPlay(int i) {
        this.localPlay_ = i;
    }

    public void setNewSwindow(boolean z) {
        this.newSwindow_ = z;
    }

    public void setPlayStory(boolean z) {
        this.playStory_ = z;
    }

    public void setPopupInfo(boolean z) {
        this.popupInfo_ = z;
    }

    public void setRecThreePointStyle(int i) {
        this.recThreePointStyle_ = i;
    }

    public void setRelateGifExp(int i) {
        this.relateGifExp_ = i;
    }

    public void setRelatesBiserial(boolean z) {
        this.relatesBiserial_ = z;
    }

    public void setRelatesFeedPopup(boolean z) {
        this.relatesFeedPopup_ = z;
    }

    public void setRelatesFeedStyle(String str) {
        str.getClass();
        this.relatesFeedStyle_ = str;
    }

    public void setRelatesFeedStyleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.relatesFeedStyle_ = byteString.toStringUtf8();
    }

    public void setRelatesHasNext(boolean z) {
        this.relatesHasNext_ = z;
    }

    public void setRelatesStyle(int i) {
        this.relatesStyle_ = i;
    }

    public void setRelatesTitle(String str) {
        str.getClass();
        this.relatesTitle_ = str;
    }

    public void setRelatesTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.relatesTitle_ = byteString.toStringUtf8();
    }

    public void setShowListenButton(boolean z) {
        this.showListenButton_ = z;
    }

    public void setStoryIcon(String str) {
        str.getClass();
        this.storyIcon_ = str;
    }

    public void setStoryIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.storyIcon_ = byteString.toStringUtf8();
    }

    public void setValidShowM(long j) {
        this.validShowM_ = j;
    }

    public void setValidShowN(long j) {
        this.validShowN_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67431.f16717xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Config();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001b\u0000\u0000\u0001\u001b\u001b\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0007\u0007\u0007\b\u0208\t\u0004\n\u0007\u000b\u0007\f\u0007\r\t\u000e\u0208\u000f\u0007\u0010\u0007\u0011\u0004\u0012\u0007\u0013\u0007\u0014\u0208\u0015\u0007\u0016\u0007\u0017\u0208\u0018\u0007\u0019\u0002\u001a\u0002\u001b\u0007", new Object[]{"relatesTitle_", "relatesStyle_", "relateGifExp_", "endPageHalf_", "endPageFull_", "autoSwindow_", "popupInfo_", "abtestSmallWindow_", "recThreePointStyle_", "isAbsoluteTime_", "newSwindow_", "relatesBiserial_", "listenerConf_", "relatesFeedStyle_", "relatesFeedPopup_", "relatesHasNext_", "localPlay_", "playStory_", "arcPlayStory_", "storyIcon_", "landscapeStory_", "arcLandscapeStory_", "landscapeIcon_", "showListenButton_", "validShowM_", "validShowN_", "dmTreasureBoxControl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Config> parser = PARSER;
                if (parser == null) {
                    synchronized (Config.class) {
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

    public String getAbtestSmallWindow() {
        return this.abtestSmallWindow_;
    }

    public ByteString getAbtestSmallWindowBytes() {
        return ByteString.copyFromUtf8(this.abtestSmallWindow_);
    }

    public boolean getArcLandscapeStory() {
        return this.arcLandscapeStory_;
    }

    public boolean getArcPlayStory() {
        return this.arcPlayStory_;
    }

    public boolean getAutoSwindow() {
        return this.autoSwindow_;
    }

    public boolean getDmTreasureBoxControl() {
        return this.dmTreasureBoxControl_;
    }

    public int getEndPageFull() {
        return this.endPageFull_;
    }

    public int getEndPageHalf() {
        return this.endPageHalf_;
    }

    public boolean getIsAbsoluteTime() {
        return this.isAbsoluteTime_;
    }

    public String getLandscapeIcon() {
        return this.landscapeIcon_;
    }

    public ByteString getLandscapeIconBytes() {
        return ByteString.copyFromUtf8(this.landscapeIcon_);
    }

    public boolean getLandscapeStory() {
        return this.landscapeStory_;
    }

    public ListenerConfig getListenerConf() {
        ListenerConfig listenerConfig = this.listenerConf_;
        return listenerConfig == null ? ListenerConfig.getDefaultInstance() : listenerConfig;
    }

    public int getLocalPlay() {
        return this.localPlay_;
    }

    public boolean getNewSwindow() {
        return this.newSwindow_;
    }

    public boolean getPlayStory() {
        return this.playStory_;
    }

    public boolean getPopupInfo() {
        return this.popupInfo_;
    }

    public int getRecThreePointStyle() {
        return this.recThreePointStyle_;
    }

    public int getRelateGifExp() {
        return this.relateGifExp_;
    }

    public boolean getRelatesBiserial() {
        return this.relatesBiserial_;
    }

    public boolean getRelatesFeedPopup() {
        return this.relatesFeedPopup_;
    }

    public String getRelatesFeedStyle() {
        return this.relatesFeedStyle_;
    }

    public ByteString getRelatesFeedStyleBytes() {
        return ByteString.copyFromUtf8(this.relatesFeedStyle_);
    }

    public boolean getRelatesHasNext() {
        return this.relatesHasNext_;
    }

    public int getRelatesStyle() {
        return this.relatesStyle_;
    }

    public String getRelatesTitle() {
        return this.relatesTitle_;
    }

    public ByteString getRelatesTitleBytes() {
        return ByteString.copyFromUtf8(this.relatesTitle_);
    }

    public boolean getShowListenButton() {
        return this.showListenButton_;
    }

    public String getStoryIcon() {
        return this.storyIcon_;
    }

    public ByteString getStoryIconBytes() {
        return ByteString.copyFromUtf8(this.storyIcon_);
    }

    public long getValidShowM() {
        return this.validShowM_;
    }

    public long getValidShowN() {
        return this.validShowN_;
    }

    public boolean hasListenerConf() {
        return this.listenerConf_ != null;
    }

    public static Builder newBuilder(Config config) {
        return DEFAULT_INSTANCE.createBuilder(config);
    }

    public static Config parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Config) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Config parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Config parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Config parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Config parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Config parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Config parseFrom(InputStream inputStream) throws IOException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Config parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Config parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Config parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * setShowListenButton
     */
    static void access$5300(Config config, boolean show) {
    }
}
