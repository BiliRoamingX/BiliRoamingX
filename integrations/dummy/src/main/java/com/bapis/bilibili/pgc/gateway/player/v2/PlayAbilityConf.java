package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class PlayAbilityConf extends GeneratedMessageLite<PlayAbilityConf, PlayAbilityConf.Builder> implements MessageLiteOrBuilder {
    public static final int BACKGROUND_PLAY_DISABLE_FIELD_NUMBER = 1;
    public static final int CAST_DISABLE_FIELD_NUMBER = 3;
    public static final int COIN_DISABLE_FIELD_NUMBER = 12;
    public static final int COLOR_OPTIMIZE_DISABLE_FIELD_NUMBER = 32;
    private static final PlayAbilityConf DEFAULT_INSTANCE;
    public static final int DEFINITION_DISABLE_FIELD_NUMBER = 19;
    public static final int DISLIKE_DISABLE_FIELD_NUMBER = 11;
    public static final int DOLBY_DISABLE_FIELD_NUMBER = 28;
    public static final int DUBBING_DISABLE_FIELD_NUMBER = 33;
    public static final int EDIT_DM_DISABLE_FIELD_NUMBER = 22;
    public static final int ELEC_DISABLE_FIELD_NUMBER = 13;
    public static final int FEEDBACK_DISABLE_FIELD_NUMBER = 4;
    public static final int FLIP_DISABLE_FIELD_NUMBER = 2;
    public static final int FREYA_ENTER_DISABLE_FIELD_NUMBER = 27;
    public static final int FREYA_FULL_DISABLE_FIELD_NUMBER = 29;
    public static final int INNER_DM_DISABLE_FIELD_NUMBER = 26;
    public static final int LIKE_DISABLE_FIELD_NUMBER = 10;
    public static final int LOCK_SCREEN_DISABLE_FIELD_NUMBER = 16;
    public static final int NEXT_DISABLE_FIELD_NUMBER = 21;
    public static final int OUTER_DM_DISABLE_FIELD_NUMBER = 25;
    private static volatile Parser<PlayAbilityConf> PARSER = null;
    public static final int PLAYBACK_MODE_DISABLE_FIELD_NUMBER = 8;
    public static final int PLAYBACK_RATE_DISABLE_FIELD_NUMBER = 6;
    public static final int PLAYBACK_SPEED_DISABLE_FIELD_NUMBER = 18;
    public static final int RECOMMEND_DISABLE_FIELD_NUMBER = 17;
    public static final int RECORD_SCREEN_DISABLE_FIELD_NUMBER = 31;
    public static final int SCALE_MODE_DISABLE_FIELD_NUMBER = 9;
    public static final int SCREEN_SHOT_DISABLE_FIELD_NUMBER = 15;
    public static final int SELECTIONS_DISABLE_FIELD_NUMBER = 20;
    public static final int SHAKE_DISABLE_FIELD_NUMBER = 24;
    public static final int SHARE_DISABLE_FIELD_NUMBER = 14;
    public static final int SKIP_OPED_SWITCH_DISABLE_FIELD_NUMBER = 30;
    public static final int SMALL_WINDOW_DISABLE_FIELD_NUMBER = 23;
    public static final int SUBTITLE_DISABLE_FIELD_NUMBER = 5;
    public static final int TIME_UP_DISABLE_FIELD_NUMBER = 7;
    private boolean backgroundPlayDisable_;
    private boolean castDisable_;
    private boolean coinDisable_;
    private boolean colorOptimizeDisable_;
    private boolean definitionDisable_;
    private boolean dislikeDisable_;
    private boolean dolbyDisable_;
    private boolean dubbingDisable_;
    private boolean editDmDisable_;
    private boolean elecDisable_;
    private boolean feedbackDisable_;
    private boolean flipDisable_;
    private boolean freyaEnterDisable_;
    private boolean freyaFullDisable_;
    private boolean innerDmDisable_;
    private boolean likeDisable_;
    private boolean lockScreenDisable_;
    private boolean nextDisable_;
    private boolean outerDmDisable_;
    private boolean playbackModeDisable_;
    private boolean playbackRateDisable_;
    private boolean playbackSpeedDisable_;
    private boolean recommendDisable_;
    private boolean recordScreenDisable_;
    private boolean scaleModeDisable_;
    private boolean screenShotDisable_;
    private boolean selectionsDisable_;
    private boolean shakeDisable_;
    private boolean shareDisable_;
    private boolean skipOpedSwitchDisable_;
    private boolean smallWindowDisable_;
    private boolean subtitleDisable_;
    private boolean timeUpDisable_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.PlayAbilityConf$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78591 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17578xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17578xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17578xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17578xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17578xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17578xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17578xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17578xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayAbilityConf, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78591 c78591) {
            this();
        }

        public Builder clearBackgroundPlayDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearBackgroundPlayDisable();
            return this;
        }

        public Builder clearCastDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearCastDisable();
            return this;
        }

        public Builder clearCoinDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearCoinDisable();
            return this;
        }

        public Builder clearColorOptimizeDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearColorOptimizeDisable();
            return this;
        }

        public Builder clearDefinitionDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearDefinitionDisable();
            return this;
        }

        public Builder clearDislikeDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearDislikeDisable();
            return this;
        }

        public Builder clearDolbyDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearDolbyDisable();
            return this;
        }

        public Builder clearDubbingDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearDubbingDisable();
            return this;
        }

        public Builder clearEditDmDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearEditDmDisable();
            return this;
        }

        public Builder clearElecDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearElecDisable();
            return this;
        }

        public Builder clearFeedbackDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearFeedbackDisable();
            return this;
        }

        public Builder clearFlipDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearFlipDisable();
            return this;
        }

        public Builder clearFreyaEnterDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearFreyaEnterDisable();
            return this;
        }

        public Builder clearFreyaFullDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearFreyaFullDisable();
            return this;
        }

        public Builder clearInnerDmDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearInnerDmDisable();
            return this;
        }

        public Builder clearLikeDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearLikeDisable();
            return this;
        }

        public Builder clearLockScreenDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearLockScreenDisable();
            return this;
        }

        public Builder clearNextDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearNextDisable();
            return this;
        }

        public Builder clearOuterDmDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearOuterDmDisable();
            return this;
        }

        public Builder clearPlaybackModeDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearPlaybackModeDisable();
            return this;
        }

        public Builder clearPlaybackRateDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearPlaybackRateDisable();
            return this;
        }

        public Builder clearPlaybackSpeedDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearPlaybackSpeedDisable();
            return this;
        }

        public Builder clearRecommendDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearRecommendDisable();
            return this;
        }

        public Builder clearRecordScreenDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearRecordScreenDisable();
            return this;
        }

        public Builder clearScaleModeDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearScaleModeDisable();
            return this;
        }

        public Builder clearScreenShotDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearScreenShotDisable();
            return this;
        }

        public Builder clearSelectionsDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearSelectionsDisable();
            return this;
        }

        public Builder clearShakeDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearShakeDisable();
            return this;
        }

        public Builder clearShareDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearShareDisable();
            return this;
        }

        public Builder clearSkipOpedSwitchDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearSkipOpedSwitchDisable();
            return this;
        }

        public Builder clearSmallWindowDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearSmallWindowDisable();
            return this;
        }

        public Builder clearSubtitleDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearSubtitleDisable();
            return this;
        }

        public Builder clearTimeUpDisable() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearTimeUpDisable();
            return this;
        }

        public boolean getBackgroundPlayDisable() {
            return ((PlayAbilityConf) this.instance).getBackgroundPlayDisable();
        }

        public boolean getCastDisable() {
            return ((PlayAbilityConf) this.instance).getCastDisable();
        }

        public boolean getCoinDisable() {
            return ((PlayAbilityConf) this.instance).getCoinDisable();
        }

        public boolean getColorOptimizeDisable() {
            return ((PlayAbilityConf) this.instance).getColorOptimizeDisable();
        }

        public boolean getDefinitionDisable() {
            return ((PlayAbilityConf) this.instance).getDefinitionDisable();
        }

        public boolean getDislikeDisable() {
            return ((PlayAbilityConf) this.instance).getDislikeDisable();
        }

        public boolean getDolbyDisable() {
            return ((PlayAbilityConf) this.instance).getDolbyDisable();
        }

        public boolean getDubbingDisable() {
            return ((PlayAbilityConf) this.instance).getDubbingDisable();
        }

        public boolean getEditDmDisable() {
            return ((PlayAbilityConf) this.instance).getEditDmDisable();
        }

        public boolean getElecDisable() {
            return ((PlayAbilityConf) this.instance).getElecDisable();
        }

        public boolean getFeedbackDisable() {
            return ((PlayAbilityConf) this.instance).getFeedbackDisable();
        }

        public boolean getFlipDisable() {
            return ((PlayAbilityConf) this.instance).getFlipDisable();
        }

        public boolean getFreyaEnterDisable() {
            return ((PlayAbilityConf) this.instance).getFreyaEnterDisable();
        }

        public boolean getFreyaFullDisable() {
            return ((PlayAbilityConf) this.instance).getFreyaFullDisable();
        }

        public boolean getInnerDmDisable() {
            return ((PlayAbilityConf) this.instance).getInnerDmDisable();
        }

        public boolean getLikeDisable() {
            return ((PlayAbilityConf) this.instance).getLikeDisable();
        }

        public boolean getLockScreenDisable() {
            return ((PlayAbilityConf) this.instance).getLockScreenDisable();
        }

        public boolean getNextDisable() {
            return ((PlayAbilityConf) this.instance).getNextDisable();
        }

        public boolean getOuterDmDisable() {
            return ((PlayAbilityConf) this.instance).getOuterDmDisable();
        }

        public boolean getPlaybackModeDisable() {
            return ((PlayAbilityConf) this.instance).getPlaybackModeDisable();
        }

        public boolean getPlaybackRateDisable() {
            return ((PlayAbilityConf) this.instance).getPlaybackRateDisable();
        }

        public boolean getPlaybackSpeedDisable() {
            return ((PlayAbilityConf) this.instance).getPlaybackSpeedDisable();
        }

        public boolean getRecommendDisable() {
            return ((PlayAbilityConf) this.instance).getRecommendDisable();
        }

        public boolean getRecordScreenDisable() {
            return ((PlayAbilityConf) this.instance).getRecordScreenDisable();
        }

        public boolean getScaleModeDisable() {
            return ((PlayAbilityConf) this.instance).getScaleModeDisable();
        }

        public boolean getScreenShotDisable() {
            return ((PlayAbilityConf) this.instance).getScreenShotDisable();
        }

        public boolean getSelectionsDisable() {
            return ((PlayAbilityConf) this.instance).getSelectionsDisable();
        }

        public boolean getShakeDisable() {
            return ((PlayAbilityConf) this.instance).getShakeDisable();
        }

        public boolean getShareDisable() {
            return ((PlayAbilityConf) this.instance).getShareDisable();
        }

        public boolean getSkipOpedSwitchDisable() {
            return ((PlayAbilityConf) this.instance).getSkipOpedSwitchDisable();
        }

        public boolean getSmallWindowDisable() {
            return ((PlayAbilityConf) this.instance).getSmallWindowDisable();
        }

        public boolean getSubtitleDisable() {
            return ((PlayAbilityConf) this.instance).getSubtitleDisable();
        }

        public boolean getTimeUpDisable() {
            return ((PlayAbilityConf) this.instance).getTimeUpDisable();
        }

        public Builder setBackgroundPlayDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setBackgroundPlayDisable(z);
            return this;
        }

        public Builder setCastDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setCastDisable(z);
            return this;
        }

        public Builder setCoinDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setCoinDisable(z);
            return this;
        }

        public Builder setColorOptimizeDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setColorOptimizeDisable(z);
            return this;
        }

        public Builder setDefinitionDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setDefinitionDisable(z);
            return this;
        }

        public Builder setDislikeDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setDislikeDisable(z);
            return this;
        }

        public Builder setDolbyDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setDolbyDisable(z);
            return this;
        }

        public Builder setDubbingDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setDubbingDisable(z);
            return this;
        }

        public Builder setEditDmDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setEditDmDisable(z);
            return this;
        }

        public Builder setElecDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setElecDisable(z);
            return this;
        }

        public Builder setFeedbackDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setFeedbackDisable(z);
            return this;
        }

        public Builder setFlipDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setFlipDisable(z);
            return this;
        }

        public Builder setFreyaEnterDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setFreyaEnterDisable(z);
            return this;
        }

        public Builder setFreyaFullDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setFreyaFullDisable(z);
            return this;
        }

        public Builder setInnerDmDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setInnerDmDisable(z);
            return this;
        }

        public Builder setLikeDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setLikeDisable(z);
            return this;
        }

        public Builder setLockScreenDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setLockScreenDisable(z);
            return this;
        }

        public Builder setNextDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setNextDisable(z);
            return this;
        }

        public Builder setOuterDmDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setOuterDmDisable(z);
            return this;
        }

        public Builder setPlaybackModeDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setPlaybackModeDisable(z);
            return this;
        }

        public Builder setPlaybackRateDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setPlaybackRateDisable(z);
            return this;
        }

        public Builder setPlaybackSpeedDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setPlaybackSpeedDisable(z);
            return this;
        }

        public Builder setRecommendDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setRecommendDisable(z);
            return this;
        }

        public Builder setRecordScreenDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setRecordScreenDisable(z);
            return this;
        }

        public Builder setScaleModeDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setScaleModeDisable(z);
            return this;
        }

        public Builder setScreenShotDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setScreenShotDisable(z);
            return this;
        }

        public Builder setSelectionsDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setSelectionsDisable(z);
            return this;
        }

        public Builder setShakeDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setShakeDisable(z);
            return this;
        }

        public Builder setShareDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setShareDisable(z);
            return this;
        }

        public Builder setSkipOpedSwitchDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setSkipOpedSwitchDisable(z);
            return this;
        }

        public Builder setSmallWindowDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setSmallWindowDisable(z);
            return this;
        }

        public Builder setSubtitleDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setSubtitleDisable(z);
            return this;
        }

        public Builder setTimeUpDisable(boolean z) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setTimeUpDisable(z);
            return this;
        }

        private Builder() {
            super(PlayAbilityConf.DEFAULT_INSTANCE);
        }
    }

    static {
        PlayAbilityConf playAbilityConf = new PlayAbilityConf();
        DEFAULT_INSTANCE = playAbilityConf;
        GeneratedMessageLite.registerDefaultInstance(PlayAbilityConf.class, playAbilityConf);
    }

    public PlayAbilityConf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundPlayDisable() {
        this.backgroundPlayDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCastDisable() {
        this.castDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoinDisable() {
        this.coinDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColorOptimizeDisable() {
        this.colorOptimizeDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefinitionDisable() {
        this.definitionDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDislikeDisable() {
        this.dislikeDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDolbyDisable() {
        this.dolbyDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDubbingDisable() {
        this.dubbingDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditDmDisable() {
        this.editDmDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElecDisable() {
        this.elecDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedbackDisable() {
        this.feedbackDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlipDisable() {
        this.flipDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreyaEnterDisable() {
        this.freyaEnterDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreyaFullDisable() {
        this.freyaFullDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInnerDmDisable() {
        this.innerDmDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikeDisable() {
        this.likeDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLockScreenDisable() {
        this.lockScreenDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextDisable() {
        this.nextDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOuterDmDisable() {
        this.outerDmDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaybackModeDisable() {
        this.playbackModeDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaybackRateDisable() {
        this.playbackRateDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaybackSpeedDisable() {
        this.playbackSpeedDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecommendDisable() {
        this.recommendDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecordScreenDisable() {
        this.recordScreenDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScaleModeDisable() {
        this.scaleModeDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenShotDisable() {
        this.screenShotDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectionsDisable() {
        this.selectionsDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShakeDisable() {
        this.shakeDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareDisable() {
        this.shareDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkipOpedSwitchDisable() {
        this.skipOpedSwitchDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSmallWindowDisable() {
        this.smallWindowDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitleDisable() {
        this.subtitleDisable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeUpDisable() {
        this.timeUpDisable_ = false;
    }

    public static PlayAbilityConf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayAbilityConf parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayAbilityConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayAbilityConf parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayAbilityConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayAbilityConf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundPlayDisable(boolean z) {
        this.backgroundPlayDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCastDisable(boolean z) {
        this.castDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinDisable(boolean z) {
        this.coinDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorOptimizeDisable(boolean z) {
        this.colorOptimizeDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefinitionDisable(boolean z) {
        this.definitionDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDislikeDisable(boolean z) {
        this.dislikeDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDolbyDisable(boolean z) {
        this.dolbyDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDubbingDisable(boolean z) {
        this.dubbingDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditDmDisable(boolean z) {
        this.editDmDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElecDisable(boolean z) {
        this.elecDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbackDisable(boolean z) {
        this.feedbackDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlipDisable(boolean z) {
        this.flipDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreyaEnterDisable(boolean z) {
        this.freyaEnterDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreyaFullDisable(boolean z) {
        this.freyaFullDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInnerDmDisable(boolean z) {
        this.innerDmDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeDisable(boolean z) {
        this.likeDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLockScreenDisable(boolean z) {
        this.lockScreenDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextDisable(boolean z) {
        this.nextDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOuterDmDisable(boolean z) {
        this.outerDmDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackModeDisable(boolean z) {
        this.playbackModeDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackRateDisable(boolean z) {
        this.playbackRateDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeedDisable(boolean z) {
        this.playbackSpeedDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecommendDisable(boolean z) {
        this.recommendDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordScreenDisable(boolean z) {
        this.recordScreenDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScaleModeDisable(boolean z) {
        this.scaleModeDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenShotDisable(boolean z) {
        this.screenShotDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectionsDisable(boolean z) {
        this.selectionsDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShakeDisable(boolean z) {
        this.shakeDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareDisable(boolean z) {
        this.shareDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipOpedSwitchDisable(boolean z) {
        this.skipOpedSwitchDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallWindowDisable(boolean z) {
        this.smallWindowDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleDisable(boolean z) {
        this.subtitleDisable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeUpDisable(boolean z) {
        this.timeUpDisable_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78591.f17578xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayAbilityConf();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000!\u0000\u0000\u0001!!\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0007\u0013\u0007\u0014\u0007\u0015\u0007\u0016\u0007\u0017\u0007\u0018\u0007\u0019\u0007\u001a\u0007\u001b\u0007\u001c\u0007\u001d\u0007\u001e\u0007\u001f\u0007 \u0007!\u0007", new Object[]{"backgroundPlayDisable_", "flipDisable_", "castDisable_", "feedbackDisable_", "subtitleDisable_", "playbackRateDisable_", "timeUpDisable_", "playbackModeDisable_", "scaleModeDisable_", "likeDisable_", "dislikeDisable_", "coinDisable_", "elecDisable_", "shareDisable_", "screenShotDisable_", "lockScreenDisable_", "recommendDisable_", "playbackSpeedDisable_", "definitionDisable_", "selectionsDisable_", "nextDisable_", "editDmDisable_", "smallWindowDisable_", "shakeDisable_", "outerDmDisable_", "innerDmDisable_", "freyaEnterDisable_", "dolbyDisable_", "freyaFullDisable_", "skipOpedSwitchDisable_", "recordScreenDisable_", "colorOptimizeDisable_", "dubbingDisable_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayAbilityConf> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayAbilityConf.class) {
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

    public boolean getBackgroundPlayDisable() {
        return this.backgroundPlayDisable_;
    }

    public boolean getCastDisable() {
        return this.castDisable_;
    }

    public boolean getCoinDisable() {
        return this.coinDisable_;
    }

    public boolean getColorOptimizeDisable() {
        return this.colorOptimizeDisable_;
    }

    public boolean getDefinitionDisable() {
        return this.definitionDisable_;
    }

    public boolean getDislikeDisable() {
        return this.dislikeDisable_;
    }

    public boolean getDolbyDisable() {
        return this.dolbyDisable_;
    }

    public boolean getDubbingDisable() {
        return this.dubbingDisable_;
    }

    public boolean getEditDmDisable() {
        return this.editDmDisable_;
    }

    public boolean getElecDisable() {
        return this.elecDisable_;
    }

    public boolean getFeedbackDisable() {
        return this.feedbackDisable_;
    }

    public boolean getFlipDisable() {
        return this.flipDisable_;
    }

    public boolean getFreyaEnterDisable() {
        return this.freyaEnterDisable_;
    }

    public boolean getFreyaFullDisable() {
        return this.freyaFullDisable_;
    }

    public boolean getInnerDmDisable() {
        return this.innerDmDisable_;
    }

    public boolean getLikeDisable() {
        return this.likeDisable_;
    }

    public boolean getLockScreenDisable() {
        return this.lockScreenDisable_;
    }

    public boolean getNextDisable() {
        return this.nextDisable_;
    }

    public boolean getOuterDmDisable() {
        return this.outerDmDisable_;
    }

    public boolean getPlaybackModeDisable() {
        return this.playbackModeDisable_;
    }

    public boolean getPlaybackRateDisable() {
        return this.playbackRateDisable_;
    }

    public boolean getPlaybackSpeedDisable() {
        return this.playbackSpeedDisable_;
    }

    public boolean getRecommendDisable() {
        return this.recommendDisable_;
    }

    public boolean getRecordScreenDisable() {
        return this.recordScreenDisable_;
    }

    public boolean getScaleModeDisable() {
        return this.scaleModeDisable_;
    }

    public boolean getScreenShotDisable() {
        return this.screenShotDisable_;
    }

    public boolean getSelectionsDisable() {
        return this.selectionsDisable_;
    }

    public boolean getShakeDisable() {
        return this.shakeDisable_;
    }

    public boolean getShareDisable() {
        return this.shareDisable_;
    }

    public boolean getSkipOpedSwitchDisable() {
        return this.skipOpedSwitchDisable_;
    }

    public boolean getSmallWindowDisable() {
        return this.smallWindowDisable_;
    }

    public boolean getSubtitleDisable() {
        return this.subtitleDisable_;
    }

    public boolean getTimeUpDisable() {
        return this.timeUpDisable_;
    }

    public static Builder newBuilder(PlayAbilityConf playAbilityConf) {
        return DEFAULT_INSTANCE.createBuilder(playAbilityConf);
    }

    public static PlayAbilityConf parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayAbilityConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayAbilityConf parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayAbilityConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayAbilityConf parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayAbilityConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayAbilityConf parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayAbilityConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayAbilityConf parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayAbilityConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayAbilityConf parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayAbilityConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayAbilityConf parseFrom(InputStream inputStream) throws IOException {
        return (PlayAbilityConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayAbilityConf parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayAbilityConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayAbilityConf parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayAbilityConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayAbilityConf parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayAbilityConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
