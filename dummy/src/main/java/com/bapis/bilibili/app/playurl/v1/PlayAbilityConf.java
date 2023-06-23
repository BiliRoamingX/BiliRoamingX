package com.bapis.bilibili.app.playurl.v1;

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
public final class PlayAbilityConf extends GeneratedMessageLite<PlayAbilityConf, PlayAbilityConf.Builder> implements MessageLiteOrBuilder {
    public static final int BACKGROUND_PLAY_CONF_FIELD_NUMBER = 1;
    public static final int CAST_CONF_FIELD_NUMBER = 3;
    public static final int COIN_CONF_FIELD_NUMBER = 12;
    public static final int COLOR_FILTER_CONF_FIELD_NUMBER = 29;
    private static final PlayAbilityConf DEFAULT_INSTANCE;
    public static final int DEFINITION_CONF_FIELD_NUMBER = 19;
    public static final int DISLIKE_CONF_FIELD_NUMBER = 11;
    public static final int DOLBY_CONF_FIELD_NUMBER = 28;
    public static final int EDIT_DM_CONF_FIELD_NUMBER = 22;
    public static final int ELEC_CONF_FIELD_NUMBER = 13;
    public static final int FEEDBACK_CONF_FIELD_NUMBER = 4;
    public static final int FLIP_CONF_FIELD_NUMBER = 2;
    public static final int INNER_DM_CONF_FIELD_NUMBER = 26;
    public static final int LIKE_CONF_FIELD_NUMBER = 10;
    public static final int LOCK_SCREEN_CONF_FIELD_NUMBER = 16;
    public static final int LOSS_LESS_CONF_FIELD_NUMBER = 30;
    public static final int NEXT_CONF_FIELD_NUMBER = 21;
    public static final int OUTER_DM_CONF_FIELD_NUMBER = 25;
    public static final int PANORAMA_CONF_FIELD_NUMBER = 27;
    private static volatile Parser<PlayAbilityConf> PARSER = null;
    public static final int PLAYBACK_MODE_CONF_FIELD_NUMBER = 8;
    public static final int PLAYBACK_RATE_CONF_FIELD_NUMBER = 6;
    public static final int PLAYBACK_SPEED_CONF_FIELD_NUMBER = 18;
    public static final int RECOMMEND_CONF_FIELD_NUMBER = 17;
    public static final int SCALE_MODE_CONF_FIELD_NUMBER = 9;
    public static final int SCREEN_SHOT_CONF_FIELD_NUMBER = 15;
    public static final int SELECTIONS_CONF_FIELD_NUMBER = 20;
    public static final int SHAKE_CONF_FIELD_NUMBER = 24;
    public static final int SHARE_CONF_FIELD_NUMBER = 14;
    public static final int SMALL_WINDOW_CONF_FIELD_NUMBER = 23;
    public static final int SUBTITLE_CONF_FIELD_NUMBER = 5;
    public static final int TIME_UP_CONF_FIELD_NUMBER = 7;
    private CloudConf backgroundPlayConf_;
    private CloudConf castConf_;
    private CloudConf coinConf_;
    private CloudConf colorFilterConf_;
    private CloudConf definitionConf_;
    private CloudConf dislikeConf_;
    private CloudConf dolbyConf_;
    private CloudConf editDmConf_;
    private CloudConf elecConf_;
    private CloudConf feedbackConf_;
    private CloudConf flipConf_;
    private CloudConf innerDmConf_;
    private CloudConf likeConf_;
    private CloudConf lockScreenConf_;
    private CloudConf lossLessConf_;
    private CloudConf nextConf_;
    private CloudConf outerDmConf_;
    private CloudConf panoramaConf_;
    private CloudConf playbackModeConf_;
    private CloudConf playbackRateConf_;
    private CloudConf playbackSpeedConf_;
    private CloudConf recommendConf_;
    private CloudConf scaleModeConf_;
    private CloudConf screenShotConf_;
    private CloudConf selectionsConf_;
    private CloudConf shakeConf_;
    private CloudConf shareConf_;
    private CloudConf smallWindowConf_;
    private CloudConf subtitleConf_;
    private CloudConf timeUpConf_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.PlayAbilityConf$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C64931 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16529xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16529xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16529xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16529xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16529xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16529xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16529xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16529xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayAbilityConf, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C64931 c64931) {
            this();
        }

        public Builder clearBackgroundPlayConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearBackgroundPlayConf();
            return this;
        }

        public Builder clearCastConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearCastConf();
            return this;
        }

        public Builder clearCoinConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearCoinConf();
            return this;
        }

        public Builder clearColorFilterConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearColorFilterConf();
            return this;
        }

        public Builder clearDefinitionConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearDefinitionConf();
            return this;
        }

        public Builder clearDislikeConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearDislikeConf();
            return this;
        }

        public Builder clearDolbyConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearDolbyConf();
            return this;
        }

        public Builder clearEditDmConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearEditDmConf();
            return this;
        }

        public Builder clearElecConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearElecConf();
            return this;
        }

        public Builder clearFeedbackConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearFeedbackConf();
            return this;
        }

        public Builder clearFlipConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearFlipConf();
            return this;
        }

        public Builder clearInnerDmConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearInnerDmConf();
            return this;
        }

        public Builder clearLikeConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearLikeConf();
            return this;
        }

        public Builder clearLockScreenConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearLockScreenConf();
            return this;
        }

        public Builder clearLossLessConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearLossLessConf();
            return this;
        }

        public Builder clearNextConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearNextConf();
            return this;
        }

        public Builder clearOuterDmConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearOuterDmConf();
            return this;
        }

        public Builder clearPanoramaConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearPanoramaConf();
            return this;
        }

        public Builder clearPlaybackModeConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearPlaybackModeConf();
            return this;
        }

        public Builder clearPlaybackRateConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearPlaybackRateConf();
            return this;
        }

        public Builder clearPlaybackSpeedConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearPlaybackSpeedConf();
            return this;
        }

        public Builder clearRecommendConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearRecommendConf();
            return this;
        }

        public Builder clearScaleModeConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearScaleModeConf();
            return this;
        }

        public Builder clearScreenShotConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearScreenShotConf();
            return this;
        }

        public Builder clearSelectionsConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearSelectionsConf();
            return this;
        }

        public Builder clearShakeConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearShakeConf();
            return this;
        }

        public Builder clearShareConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearShareConf();
            return this;
        }

        public Builder clearSmallWindowConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearSmallWindowConf();
            return this;
        }

        public Builder clearSubtitleConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearSubtitleConf();
            return this;
        }

        public Builder clearTimeUpConf() {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).clearTimeUpConf();
            return this;
        }

        public CloudConf getBackgroundPlayConf() {
            return ((PlayAbilityConf) this.instance).getBackgroundPlayConf();
        }

        public CloudConf getCastConf() {
            return ((PlayAbilityConf) this.instance).getCastConf();
        }

        public CloudConf getCoinConf() {
            return ((PlayAbilityConf) this.instance).getCoinConf();
        }

        public CloudConf getColorFilterConf() {
            return ((PlayAbilityConf) this.instance).getColorFilterConf();
        }

        public CloudConf getDefinitionConf() {
            return ((PlayAbilityConf) this.instance).getDefinitionConf();
        }

        public CloudConf getDislikeConf() {
            return ((PlayAbilityConf) this.instance).getDislikeConf();
        }

        public CloudConf getDolbyConf() {
            return ((PlayAbilityConf) this.instance).getDolbyConf();
        }

        public CloudConf getEditDmConf() {
            return ((PlayAbilityConf) this.instance).getEditDmConf();
        }

        public CloudConf getElecConf() {
            return ((PlayAbilityConf) this.instance).getElecConf();
        }

        public CloudConf getFeedbackConf() {
            return ((PlayAbilityConf) this.instance).getFeedbackConf();
        }

        public CloudConf getFlipConf() {
            return ((PlayAbilityConf) this.instance).getFlipConf();
        }

        public CloudConf getInnerDmConf() {
            return ((PlayAbilityConf) this.instance).getInnerDmConf();
        }

        public CloudConf getLikeConf() {
            return ((PlayAbilityConf) this.instance).getLikeConf();
        }

        public CloudConf getLockScreenConf() {
            return ((PlayAbilityConf) this.instance).getLockScreenConf();
        }

        public CloudConf getLossLessConf() {
            return ((PlayAbilityConf) this.instance).getLossLessConf();
        }

        public CloudConf getNextConf() {
            return ((PlayAbilityConf) this.instance).getNextConf();
        }

        public CloudConf getOuterDmConf() {
            return ((PlayAbilityConf) this.instance).getOuterDmConf();
        }

        public CloudConf getPanoramaConf() {
            return ((PlayAbilityConf) this.instance).getPanoramaConf();
        }

        public CloudConf getPlaybackModeConf() {
            return ((PlayAbilityConf) this.instance).getPlaybackModeConf();
        }

        public CloudConf getPlaybackRateConf() {
            return ((PlayAbilityConf) this.instance).getPlaybackRateConf();
        }

        public CloudConf getPlaybackSpeedConf() {
            return ((PlayAbilityConf) this.instance).getPlaybackSpeedConf();
        }

        public CloudConf getRecommendConf() {
            return ((PlayAbilityConf) this.instance).getRecommendConf();
        }

        public CloudConf getScaleModeConf() {
            return ((PlayAbilityConf) this.instance).getScaleModeConf();
        }

        public CloudConf getScreenShotConf() {
            return ((PlayAbilityConf) this.instance).getScreenShotConf();
        }

        public CloudConf getSelectionsConf() {
            return ((PlayAbilityConf) this.instance).getSelectionsConf();
        }

        public CloudConf getShakeConf() {
            return ((PlayAbilityConf) this.instance).getShakeConf();
        }

        public CloudConf getShareConf() {
            return ((PlayAbilityConf) this.instance).getShareConf();
        }

        public CloudConf getSmallWindowConf() {
            return ((PlayAbilityConf) this.instance).getSmallWindowConf();
        }

        public CloudConf getSubtitleConf() {
            return ((PlayAbilityConf) this.instance).getSubtitleConf();
        }

        public CloudConf getTimeUpConf() {
            return ((PlayAbilityConf) this.instance).getTimeUpConf();
        }

        public boolean hasBackgroundPlayConf() {
            return ((PlayAbilityConf) this.instance).hasBackgroundPlayConf();
        }

        public boolean hasCastConf() {
            return ((PlayAbilityConf) this.instance).hasCastConf();
        }

        public boolean hasCoinConf() {
            return ((PlayAbilityConf) this.instance).hasCoinConf();
        }

        public boolean hasColorFilterConf() {
            return ((PlayAbilityConf) this.instance).hasColorFilterConf();
        }

        public boolean hasDefinitionConf() {
            return ((PlayAbilityConf) this.instance).hasDefinitionConf();
        }

        public boolean hasDislikeConf() {
            return ((PlayAbilityConf) this.instance).hasDislikeConf();
        }

        public boolean hasDolbyConf() {
            return ((PlayAbilityConf) this.instance).hasDolbyConf();
        }

        public boolean hasEditDmConf() {
            return ((PlayAbilityConf) this.instance).hasEditDmConf();
        }

        public boolean hasElecConf() {
            return ((PlayAbilityConf) this.instance).hasElecConf();
        }

        public boolean hasFeedbackConf() {
            return ((PlayAbilityConf) this.instance).hasFeedbackConf();
        }

        public boolean hasFlipConf() {
            return ((PlayAbilityConf) this.instance).hasFlipConf();
        }

        public boolean hasInnerDmConf() {
            return ((PlayAbilityConf) this.instance).hasInnerDmConf();
        }

        public boolean hasLikeConf() {
            return ((PlayAbilityConf) this.instance).hasLikeConf();
        }

        public boolean hasLockScreenConf() {
            return ((PlayAbilityConf) this.instance).hasLockScreenConf();
        }

        public boolean hasLossLessConf() {
            return ((PlayAbilityConf) this.instance).hasLossLessConf();
        }

        public boolean hasNextConf() {
            return ((PlayAbilityConf) this.instance).hasNextConf();
        }

        public boolean hasOuterDmConf() {
            return ((PlayAbilityConf) this.instance).hasOuterDmConf();
        }

        public boolean hasPanoramaConf() {
            return ((PlayAbilityConf) this.instance).hasPanoramaConf();
        }

        public boolean hasPlaybackModeConf() {
            return ((PlayAbilityConf) this.instance).hasPlaybackModeConf();
        }

        public boolean hasPlaybackRateConf() {
            return ((PlayAbilityConf) this.instance).hasPlaybackRateConf();
        }

        public boolean hasPlaybackSpeedConf() {
            return ((PlayAbilityConf) this.instance).hasPlaybackSpeedConf();
        }

        public boolean hasRecommendConf() {
            return ((PlayAbilityConf) this.instance).hasRecommendConf();
        }

        public boolean hasScaleModeConf() {
            return ((PlayAbilityConf) this.instance).hasScaleModeConf();
        }

        public boolean hasScreenShotConf() {
            return ((PlayAbilityConf) this.instance).hasScreenShotConf();
        }

        public boolean hasSelectionsConf() {
            return ((PlayAbilityConf) this.instance).hasSelectionsConf();
        }

        public boolean hasShakeConf() {
            return ((PlayAbilityConf) this.instance).hasShakeConf();
        }

        public boolean hasShareConf() {
            return ((PlayAbilityConf) this.instance).hasShareConf();
        }

        public boolean hasSmallWindowConf() {
            return ((PlayAbilityConf) this.instance).hasSmallWindowConf();
        }

        public boolean hasSubtitleConf() {
            return ((PlayAbilityConf) this.instance).hasSubtitleConf();
        }

        public boolean hasTimeUpConf() {
            return ((PlayAbilityConf) this.instance).hasTimeUpConf();
        }

        public Builder mergeBackgroundPlayConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeBackgroundPlayConf(cloudConf);
            return this;
        }

        public Builder mergeCastConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeCastConf(cloudConf);
            return this;
        }

        public Builder mergeCoinConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeCoinConf(cloudConf);
            return this;
        }

        public Builder mergeColorFilterConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeColorFilterConf(cloudConf);
            return this;
        }

        public Builder mergeDefinitionConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeDefinitionConf(cloudConf);
            return this;
        }

        public Builder mergeDislikeConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeDislikeConf(cloudConf);
            return this;
        }

        public Builder mergeDolbyConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeDolbyConf(cloudConf);
            return this;
        }

        public Builder mergeEditDmConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeEditDmConf(cloudConf);
            return this;
        }

        public Builder mergeElecConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeElecConf(cloudConf);
            return this;
        }

        public Builder mergeFeedbackConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeFeedbackConf(cloudConf);
            return this;
        }

        public Builder mergeFlipConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeFlipConf(cloudConf);
            return this;
        }

        public Builder mergeInnerDmConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeInnerDmConf(cloudConf);
            return this;
        }

        public Builder mergeLikeConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeLikeConf(cloudConf);
            return this;
        }

        public Builder mergeLockScreenConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeLockScreenConf(cloudConf);
            return this;
        }

        public Builder mergeLossLessConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeLossLessConf(cloudConf);
            return this;
        }

        public Builder mergeNextConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeNextConf(cloudConf);
            return this;
        }

        public Builder mergeOuterDmConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeOuterDmConf(cloudConf);
            return this;
        }

        public Builder mergePanoramaConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergePanoramaConf(cloudConf);
            return this;
        }

        public Builder mergePlaybackModeConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergePlaybackModeConf(cloudConf);
            return this;
        }

        public Builder mergePlaybackRateConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergePlaybackRateConf(cloudConf);
            return this;
        }

        public Builder mergePlaybackSpeedConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergePlaybackSpeedConf(cloudConf);
            return this;
        }

        public Builder mergeRecommendConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeRecommendConf(cloudConf);
            return this;
        }

        public Builder mergeScaleModeConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeScaleModeConf(cloudConf);
            return this;
        }

        public Builder mergeScreenShotConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeScreenShotConf(cloudConf);
            return this;
        }

        public Builder mergeSelectionsConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeSelectionsConf(cloudConf);
            return this;
        }

        public Builder mergeShakeConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeShakeConf(cloudConf);
            return this;
        }

        public Builder mergeShareConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeShareConf(cloudConf);
            return this;
        }

        public Builder mergeSmallWindowConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeSmallWindowConf(cloudConf);
            return this;
        }

        public Builder mergeSubtitleConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeSubtitleConf(cloudConf);
            return this;
        }

        public Builder mergeTimeUpConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).mergeTimeUpConf(cloudConf);
            return this;
        }

        public Builder setBackgroundPlayConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setBackgroundPlayConf(cloudConf);
            return this;
        }

        public Builder setCastConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setCastConf(cloudConf);
            return this;
        }

        public Builder setCoinConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setCoinConf(cloudConf);
            return this;
        }

        public Builder setColorFilterConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setColorFilterConf(cloudConf);
            return this;
        }

        public Builder setDefinitionConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setDefinitionConf(cloudConf);
            return this;
        }

        public Builder setDislikeConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setDislikeConf(cloudConf);
            return this;
        }

        public Builder setDolbyConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setDolbyConf(cloudConf);
            return this;
        }

        public Builder setEditDmConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setEditDmConf(cloudConf);
            return this;
        }

        public Builder setElecConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setElecConf(cloudConf);
            return this;
        }

        public Builder setFeedbackConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setFeedbackConf(cloudConf);
            return this;
        }

        public Builder setFlipConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setFlipConf(cloudConf);
            return this;
        }

        public Builder setInnerDmConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setInnerDmConf(cloudConf);
            return this;
        }

        public Builder setLikeConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setLikeConf(cloudConf);
            return this;
        }

        public Builder setLockScreenConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setLockScreenConf(cloudConf);
            return this;
        }

        public Builder setLossLessConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setLossLessConf(cloudConf);
            return this;
        }

        public Builder setNextConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setNextConf(cloudConf);
            return this;
        }

        public Builder setOuterDmConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setOuterDmConf(cloudConf);
            return this;
        }

        public Builder setPanoramaConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setPanoramaConf(cloudConf);
            return this;
        }

        public Builder setPlaybackModeConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setPlaybackModeConf(cloudConf);
            return this;
        }

        public Builder setPlaybackRateConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setPlaybackRateConf(cloudConf);
            return this;
        }

        public Builder setPlaybackSpeedConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setPlaybackSpeedConf(cloudConf);
            return this;
        }

        public Builder setRecommendConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setRecommendConf(cloudConf);
            return this;
        }

        public Builder setScaleModeConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setScaleModeConf(cloudConf);
            return this;
        }

        public Builder setScreenShotConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setScreenShotConf(cloudConf);
            return this;
        }

        public Builder setSelectionsConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setSelectionsConf(cloudConf);
            return this;
        }

        public Builder setShakeConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setShakeConf(cloudConf);
            return this;
        }

        public Builder setShareConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setShareConf(cloudConf);
            return this;
        }

        public Builder setSmallWindowConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setSmallWindowConf(cloudConf);
            return this;
        }

        public Builder setSubtitleConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setSubtitleConf(cloudConf);
            return this;
        }

        public Builder setTimeUpConf(CloudConf cloudConf) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setTimeUpConf(cloudConf);
            return this;
        }

        private Builder() {
            super(PlayAbilityConf.DEFAULT_INSTANCE);
        }

        public Builder setBackgroundPlayConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setBackgroundPlayConf(builder.build());
            return this;
        }

        public Builder setCastConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setCastConf(builder.build());
            return this;
        }

        public Builder setCoinConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setCoinConf(builder.build());
            return this;
        }

        public Builder setColorFilterConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setColorFilterConf(builder.build());
            return this;
        }

        public Builder setDefinitionConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setDefinitionConf(builder.build());
            return this;
        }

        public Builder setDislikeConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setDislikeConf(builder.build());
            return this;
        }

        public Builder setDolbyConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setDolbyConf(builder.build());
            return this;
        }

        public Builder setEditDmConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setEditDmConf(builder.build());
            return this;
        }

        public Builder setElecConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setElecConf(builder.build());
            return this;
        }

        public Builder setFeedbackConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setFeedbackConf(builder.build());
            return this;
        }

        public Builder setFlipConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setFlipConf(builder.build());
            return this;
        }

        public Builder setInnerDmConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setInnerDmConf(builder.build());
            return this;
        }

        public Builder setLikeConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setLikeConf(builder.build());
            return this;
        }

        public Builder setLockScreenConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setLockScreenConf(builder.build());
            return this;
        }

        public Builder setLossLessConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setLossLessConf(builder.build());
            return this;
        }

        public Builder setNextConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setNextConf(builder.build());
            return this;
        }

        public Builder setOuterDmConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setOuterDmConf(builder.build());
            return this;
        }

        public Builder setPanoramaConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setPanoramaConf(builder.build());
            return this;
        }

        public Builder setPlaybackModeConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setPlaybackModeConf(builder.build());
            return this;
        }

        public Builder setPlaybackRateConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setPlaybackRateConf(builder.build());
            return this;
        }

        public Builder setPlaybackSpeedConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setPlaybackSpeedConf(builder.build());
            return this;
        }

        public Builder setRecommendConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setRecommendConf(builder.build());
            return this;
        }

        public Builder setScaleModeConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setScaleModeConf(builder.build());
            return this;
        }

        public Builder setScreenShotConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setScreenShotConf(builder.build());
            return this;
        }

        public Builder setSelectionsConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setSelectionsConf(builder.build());
            return this;
        }

        public Builder setShakeConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setShakeConf(builder.build());
            return this;
        }

        public Builder setShareConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setShareConf(builder.build());
            return this;
        }

        public Builder setSmallWindowConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setSmallWindowConf(builder.build());
            return this;
        }

        public Builder setSubtitleConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setSubtitleConf(builder.build());
            return this;
        }

        public Builder setTimeUpConf(CloudConf.Builder builder) {
            copyOnWrite();
            ((PlayAbilityConf) this.instance).setTimeUpConf(builder.build());
            return this;
        }
    }

    static {
        PlayAbilityConf playAbilityConf = new PlayAbilityConf();
        DEFAULT_INSTANCE = playAbilityConf;
        GeneratedMessageLite.registerDefaultInstance(PlayAbilityConf.class, playAbilityConf);
    }

    private PlayAbilityConf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundPlayConf() {
        this.backgroundPlayConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCastConf() {
        this.castConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoinConf() {
        this.coinConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColorFilterConf() {
        this.colorFilterConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefinitionConf() {
        this.definitionConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDislikeConf() {
        this.dislikeConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDolbyConf() {
        this.dolbyConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditDmConf() {
        this.editDmConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElecConf() {
        this.elecConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedbackConf() {
        this.feedbackConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlipConf() {
        this.flipConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInnerDmConf() {
        this.innerDmConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikeConf() {
        this.likeConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLockScreenConf() {
        this.lockScreenConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLossLessConf() {
        this.lossLessConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextConf() {
        this.nextConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOuterDmConf() {
        this.outerDmConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPanoramaConf() {
        this.panoramaConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaybackModeConf() {
        this.playbackModeConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaybackRateConf() {
        this.playbackRateConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaybackSpeedConf() {
        this.playbackSpeedConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecommendConf() {
        this.recommendConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScaleModeConf() {
        this.scaleModeConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenShotConf() {
        this.screenShotConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectionsConf() {
        this.selectionsConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShakeConf() {
        this.shakeConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareConf() {
        this.shareConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSmallWindowConf() {
        this.smallWindowConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitleConf() {
        this.subtitleConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeUpConf() {
        this.timeUpConf_ = null;
    }

    public static PlayAbilityConf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBackgroundPlayConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCastConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoinConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeColorFilterConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDefinitionConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDislikeConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDolbyConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEditDmConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeElecConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeedbackConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFlipConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInnerDmConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLikeConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLockScreenConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLossLessConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNextConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOuterDmConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePanoramaConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaybackModeConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaybackRateConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaybackSpeedConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRecommendConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScaleModeConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScreenShotConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSelectionsConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShakeConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSmallWindowConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubtitleConf(CloudConf cloudConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeUpConf(CloudConf cloudConf) {
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
    public void setBackgroundPlayConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.backgroundPlayConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCastConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.castConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.coinConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorFilterConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.colorFilterConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefinitionConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.definitionConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDislikeConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.dislikeConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDolbyConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.dolbyConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditDmConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.editDmConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElecConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.elecConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbackConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.feedbackConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlipConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.flipConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInnerDmConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.innerDmConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.likeConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLockScreenConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.lockScreenConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLossLessConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.lossLessConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.nextConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOuterDmConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.outerDmConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPanoramaConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.panoramaConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackModeConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.playbackModeConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackRateConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.playbackRateConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeedConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.playbackSpeedConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecommendConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.recommendConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScaleModeConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.scaleModeConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenShotConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.screenShotConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectionsConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.selectionsConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShakeConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.shakeConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.shareConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallWindowConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.smallWindowConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.subtitleConf_ = cloudConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeUpConf(CloudConf cloudConf) {
        cloudConf.getClass();
        this.timeUpConf_ = cloudConf;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C64931.f16529xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayAbilityConf();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001e\u0000\u0000\u0001\u001e\u001e\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016\t\u0017\t\u0018\t\u0019\t\u001a\t\u001b\t\u001c\t\u001d\t\u001e\t", new Object[]{"backgroundPlayConf_", "flipConf_", "castConf_", "feedbackConf_", "subtitleConf_", "playbackRateConf_", "timeUpConf_", "playbackModeConf_", "scaleModeConf_", "likeConf_", "dislikeConf_", "coinConf_", "elecConf_", "shareConf_", "screenShotConf_", "lockScreenConf_", "recommendConf_", "playbackSpeedConf_", "definitionConf_", "selectionsConf_", "nextConf_", "editDmConf_", "smallWindowConf_", "shakeConf_", "outerDmConf_", "innerDmConf_", "panoramaConf_", "dolbyConf_", "colorFilterConf_", "lossLessConf_"});
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

    public CloudConf getBackgroundPlayConf() {
        CloudConf cloudConf = this.backgroundPlayConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getCastConf() {
        CloudConf cloudConf = this.castConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getCoinConf() {
        CloudConf cloudConf = this.coinConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getColorFilterConf() {
        CloudConf cloudConf = this.colorFilterConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getDefinitionConf() {
        CloudConf cloudConf = this.definitionConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getDislikeConf() {
        CloudConf cloudConf = this.dislikeConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getDolbyConf() {
        CloudConf cloudConf = this.dolbyConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getEditDmConf() {
        CloudConf cloudConf = this.editDmConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getElecConf() {
        CloudConf cloudConf = this.elecConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getFeedbackConf() {
        CloudConf cloudConf = this.feedbackConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getFlipConf() {
        CloudConf cloudConf = this.flipConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getInnerDmConf() {
        CloudConf cloudConf = this.innerDmConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getLikeConf() {
        CloudConf cloudConf = this.likeConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getLockScreenConf() {
        CloudConf cloudConf = this.lockScreenConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getLossLessConf() {
        CloudConf cloudConf = this.lossLessConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getNextConf() {
        CloudConf cloudConf = this.nextConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getOuterDmConf() {
        CloudConf cloudConf = this.outerDmConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getPanoramaConf() {
        CloudConf cloudConf = this.panoramaConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getPlaybackModeConf() {
        CloudConf cloudConf = this.playbackModeConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getPlaybackRateConf() {
        CloudConf cloudConf = this.playbackRateConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getPlaybackSpeedConf() {
        CloudConf cloudConf = this.playbackSpeedConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getRecommendConf() {
        CloudConf cloudConf = this.recommendConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getScaleModeConf() {
        CloudConf cloudConf = this.scaleModeConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getScreenShotConf() {
        CloudConf cloudConf = this.screenShotConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getSelectionsConf() {
        CloudConf cloudConf = this.selectionsConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getShakeConf() {
        CloudConf cloudConf = this.shakeConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getShareConf() {
        CloudConf cloudConf = this.shareConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getSmallWindowConf() {
        CloudConf cloudConf = this.smallWindowConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getSubtitleConf() {
        CloudConf cloudConf = this.subtitleConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public CloudConf getTimeUpConf() {
        CloudConf cloudConf = this.timeUpConf_;
        return cloudConf == null ? CloudConf.getDefaultInstance() : cloudConf;
    }

    public boolean hasBackgroundPlayConf() {
        return this.backgroundPlayConf_ != null;
    }

    public boolean hasCastConf() {
        return this.castConf_ != null;
    }

    public boolean hasCoinConf() {
        return this.coinConf_ != null;
    }

    public boolean hasColorFilterConf() {
        return this.colorFilterConf_ != null;
    }

    public boolean hasDefinitionConf() {
        return this.definitionConf_ != null;
    }

    public boolean hasDislikeConf() {
        return this.dislikeConf_ != null;
    }

    public boolean hasDolbyConf() {
        return this.dolbyConf_ != null;
    }

    public boolean hasEditDmConf() {
        return this.editDmConf_ != null;
    }

    public boolean hasElecConf() {
        return this.elecConf_ != null;
    }

    public boolean hasFeedbackConf() {
        return this.feedbackConf_ != null;
    }

    public boolean hasFlipConf() {
        return this.flipConf_ != null;
    }

    public boolean hasInnerDmConf() {
        return this.innerDmConf_ != null;
    }

    public boolean hasLikeConf() {
        return this.likeConf_ != null;
    }

    public boolean hasLockScreenConf() {
        return this.lockScreenConf_ != null;
    }

    public boolean hasLossLessConf() {
        return this.lossLessConf_ != null;
    }

    public boolean hasNextConf() {
        return this.nextConf_ != null;
    }

    public boolean hasOuterDmConf() {
        return this.outerDmConf_ != null;
    }

    public boolean hasPanoramaConf() {
        return this.panoramaConf_ != null;
    }

    public boolean hasPlaybackModeConf() {
        return this.playbackModeConf_ != null;
    }

    public boolean hasPlaybackRateConf() {
        return this.playbackRateConf_ != null;
    }

    public boolean hasPlaybackSpeedConf() {
        return this.playbackSpeedConf_ != null;
    }

    public boolean hasRecommendConf() {
        return this.recommendConf_ != null;
    }

    public boolean hasScaleModeConf() {
        return this.scaleModeConf_ != null;
    }

    public boolean hasScreenShotConf() {
        return this.screenShotConf_ != null;
    }

    public boolean hasSelectionsConf() {
        return this.selectionsConf_ != null;
    }

    public boolean hasShakeConf() {
        return this.shakeConf_ != null;
    }

    public boolean hasShareConf() {
        return this.shareConf_ != null;
    }

    public boolean hasSmallWindowConf() {
        return this.smallWindowConf_ != null;
    }

    public boolean hasSubtitleConf() {
        return this.subtitleConf_ != null;
    }

    public boolean hasTimeUpConf() {
        return this.timeUpConf_ != null;
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
