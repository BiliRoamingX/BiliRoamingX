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
public final class PlayArcConf extends GeneratedMessageLite<PlayArcConf, PlayArcConf.Builder> implements MessageLiteOrBuilder {
    public static final int BACKGROUND_PLAY_CONF_FIELD_NUMBER = 1;
    public static final int CAST_CONF_FIELD_NUMBER = 3;
    public static final int COIN_CONF_FIELD_NUMBER = 12;
    public static final int COLOR_FILTER_CONF_FIELD_NUMBER = 30;
    private static final PlayArcConf DEFAULT_INSTANCE;
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
    public static final int LOSS_LESS_CONF_FIELD_NUMBER = 31;
    public static final int NEXT_CONF_FIELD_NUMBER = 21;
    public static final int OUTER_DM_CONF_FIELD_NUMBER = 25;
    public static final int PANORAMA_CONF_FIELD_NUMBER = 27;
    private static volatile Parser<PlayArcConf> PARSER = null;
    public static final int PLAYBACK_MODE_CONF_FIELD_NUMBER = 8;
    public static final int PLAYBACK_RATE_CONF_FIELD_NUMBER = 6;
    public static final int PLAYBACK_SPEED_CONF_FIELD_NUMBER = 18;
    public static final int RECOMMEND_CONF_FIELD_NUMBER = 17;
    public static final int SCALE_MODE_CONF_FIELD_NUMBER = 9;
    public static final int SCREEN_RECORDING_CONF_FIELD_NUMBER = 29;
    public static final int SCREEN_SHOT_CONF_FIELD_NUMBER = 15;
    public static final int SELECTIONS_CONF_FIELD_NUMBER = 20;
    public static final int SHAKE_CONF_FIELD_NUMBER = 24;
    public static final int SHARE_CONF_FIELD_NUMBER = 14;
    public static final int SMALL_WINDOW_CONF_FIELD_NUMBER = 23;
    public static final int SUBTITLE_CONF_FIELD_NUMBER = 5;
    public static final int TIME_UP_CONF_FIELD_NUMBER = 7;
    private ArcConf backgroundPlayConf_;
    private ArcConf castConf_;
    private ArcConf coinConf_;
    private ArcConf colorFilterConf_;
    private ArcConf definitionConf_;
    private ArcConf dislikeConf_;
    private ArcConf dolbyConf_;
    private ArcConf editDmConf_;
    private ArcConf elecConf_;
    private ArcConf feedbackConf_;
    private ArcConf flipConf_;
    private ArcConf innerDmConf_;
    private ArcConf likeConf_;
    private ArcConf lockScreenConf_;
    private ArcConf lossLessConf_;
    private ArcConf nextConf_;
    private ArcConf outerDmConf_;
    private ArcConf panoramaConf_;
    private ArcConf playbackModeConf_;
    private ArcConf playbackRateConf_;
    private ArcConf playbackSpeedConf_;
    private ArcConf recommendConf_;
    private ArcConf scaleModeConf_;
    private ArcConf screenRecordingConf_;
    private ArcConf screenShotConf_;
    private ArcConf selectionsConf_;
    private ArcConf shakeConf_;
    private ArcConf shareConf_;
    private ArcConf smallWindowConf_;
    private ArcConf subtitleConf_;
    private ArcConf timeUpConf_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.PlayArcConf$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C64941 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16530xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16530xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16530xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16530xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16530xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16530xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16530xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16530xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayArcConf, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C64941 c64941) {
            this();
        }

        public Builder clearBackgroundPlayConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearBackgroundPlayConf();
            return this;
        }

        public Builder clearCastConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearCastConf();
            return this;
        }

        public Builder clearCoinConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearCoinConf();
            return this;
        }

        public Builder clearColorFilterConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearColorFilterConf();
            return this;
        }

        public Builder clearDefinitionConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearDefinitionConf();
            return this;
        }

        public Builder clearDislikeConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearDislikeConf();
            return this;
        }

        public Builder clearDolbyConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearDolbyConf();
            return this;
        }

        public Builder clearEditDmConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearEditDmConf();
            return this;
        }

        public Builder clearElecConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearElecConf();
            return this;
        }

        public Builder clearFeedbackConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearFeedbackConf();
            return this;
        }

        public Builder clearFlipConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearFlipConf();
            return this;
        }

        public Builder clearInnerDmConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearInnerDmConf();
            return this;
        }

        public Builder clearLikeConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearLikeConf();
            return this;
        }

        public Builder clearLockScreenConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearLockScreenConf();
            return this;
        }

        public Builder clearLossLessConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearLossLessConf();
            return this;
        }

        public Builder clearNextConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearNextConf();
            return this;
        }

        public Builder clearOuterDmConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearOuterDmConf();
            return this;
        }

        public Builder clearPanoramaConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearPanoramaConf();
            return this;
        }

        public Builder clearPlaybackModeConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearPlaybackModeConf();
            return this;
        }

        public Builder clearPlaybackRateConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearPlaybackRateConf();
            return this;
        }

        public Builder clearPlaybackSpeedConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearPlaybackSpeedConf();
            return this;
        }

        public Builder clearRecommendConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearRecommendConf();
            return this;
        }

        public Builder clearScaleModeConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearScaleModeConf();
            return this;
        }

        public Builder clearScreenRecordingConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearScreenRecordingConf();
            return this;
        }

        public Builder clearScreenShotConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearScreenShotConf();
            return this;
        }

        public Builder clearSelectionsConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearSelectionsConf();
            return this;
        }

        public Builder clearShakeConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearShakeConf();
            return this;
        }

        public Builder clearShareConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearShareConf();
            return this;
        }

        public Builder clearSmallWindowConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearSmallWindowConf();
            return this;
        }

        public Builder clearSubtitleConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearSubtitleConf();
            return this;
        }

        public Builder clearTimeUpConf() {
            copyOnWrite();
            ((PlayArcConf) this.instance).clearTimeUpConf();
            return this;
        }

        public ArcConf getBackgroundPlayConf() {
            return ((PlayArcConf) this.instance).getBackgroundPlayConf();
        }

        public ArcConf getCastConf() {
            return ((PlayArcConf) this.instance).getCastConf();
        }

        public ArcConf getCoinConf() {
            return ((PlayArcConf) this.instance).getCoinConf();
        }

        public ArcConf getColorFilterConf() {
            return ((PlayArcConf) this.instance).getColorFilterConf();
        }

        public ArcConf getDefinitionConf() {
            return ((PlayArcConf) this.instance).getDefinitionConf();
        }

        public ArcConf getDislikeConf() {
            return ((PlayArcConf) this.instance).getDislikeConf();
        }

        public ArcConf getDolbyConf() {
            return ((PlayArcConf) this.instance).getDolbyConf();
        }

        public ArcConf getEditDmConf() {
            return ((PlayArcConf) this.instance).getEditDmConf();
        }

        public ArcConf getElecConf() {
            return ((PlayArcConf) this.instance).getElecConf();
        }

        public ArcConf getFeedbackConf() {
            return ((PlayArcConf) this.instance).getFeedbackConf();
        }

        public ArcConf getFlipConf() {
            return ((PlayArcConf) this.instance).getFlipConf();
        }

        public ArcConf getInnerDmConf() {
            return ((PlayArcConf) this.instance).getInnerDmConf();
        }

        public ArcConf getLikeConf() {
            return ((PlayArcConf) this.instance).getLikeConf();
        }

        public ArcConf getLockScreenConf() {
            return ((PlayArcConf) this.instance).getLockScreenConf();
        }

        public ArcConf getLossLessConf() {
            return ((PlayArcConf) this.instance).getLossLessConf();
        }

        public ArcConf getNextConf() {
            return ((PlayArcConf) this.instance).getNextConf();
        }

        public ArcConf getOuterDmConf() {
            return ((PlayArcConf) this.instance).getOuterDmConf();
        }

        public ArcConf getPanoramaConf() {
            return ((PlayArcConf) this.instance).getPanoramaConf();
        }

        public ArcConf getPlaybackModeConf() {
            return ((PlayArcConf) this.instance).getPlaybackModeConf();
        }

        public ArcConf getPlaybackRateConf() {
            return ((PlayArcConf) this.instance).getPlaybackRateConf();
        }

        public ArcConf getPlaybackSpeedConf() {
            return ((PlayArcConf) this.instance).getPlaybackSpeedConf();
        }

        public ArcConf getRecommendConf() {
            return ((PlayArcConf) this.instance).getRecommendConf();
        }

        public ArcConf getScaleModeConf() {
            return ((PlayArcConf) this.instance).getScaleModeConf();
        }

        public ArcConf getScreenRecordingConf() {
            return ((PlayArcConf) this.instance).getScreenRecordingConf();
        }

        public ArcConf getScreenShotConf() {
            return ((PlayArcConf) this.instance).getScreenShotConf();
        }

        public ArcConf getSelectionsConf() {
            return ((PlayArcConf) this.instance).getSelectionsConf();
        }

        public ArcConf getShakeConf() {
            return ((PlayArcConf) this.instance).getShakeConf();
        }

        public ArcConf getShareConf() {
            return ((PlayArcConf) this.instance).getShareConf();
        }

        public ArcConf getSmallWindowConf() {
            return ((PlayArcConf) this.instance).getSmallWindowConf();
        }

        public ArcConf getSubtitleConf() {
            return ((PlayArcConf) this.instance).getSubtitleConf();
        }

        public ArcConf getTimeUpConf() {
            return ((PlayArcConf) this.instance).getTimeUpConf();
        }

        public boolean hasBackgroundPlayConf() {
            return ((PlayArcConf) this.instance).hasBackgroundPlayConf();
        }

        public boolean hasCastConf() {
            return ((PlayArcConf) this.instance).hasCastConf();
        }

        public boolean hasCoinConf() {
            return ((PlayArcConf) this.instance).hasCoinConf();
        }

        public boolean hasColorFilterConf() {
            return ((PlayArcConf) this.instance).hasColorFilterConf();
        }

        public boolean hasDefinitionConf() {
            return ((PlayArcConf) this.instance).hasDefinitionConf();
        }

        public boolean hasDislikeConf() {
            return ((PlayArcConf) this.instance).hasDislikeConf();
        }

        public boolean hasDolbyConf() {
            return ((PlayArcConf) this.instance).hasDolbyConf();
        }

        public boolean hasEditDmConf() {
            return ((PlayArcConf) this.instance).hasEditDmConf();
        }

        public boolean hasElecConf() {
            return ((PlayArcConf) this.instance).hasElecConf();
        }

        public boolean hasFeedbackConf() {
            return ((PlayArcConf) this.instance).hasFeedbackConf();
        }

        public boolean hasFlipConf() {
            return ((PlayArcConf) this.instance).hasFlipConf();
        }

        public boolean hasInnerDmConf() {
            return ((PlayArcConf) this.instance).hasInnerDmConf();
        }

        public boolean hasLikeConf() {
            return ((PlayArcConf) this.instance).hasLikeConf();
        }

        public boolean hasLockScreenConf() {
            return ((PlayArcConf) this.instance).hasLockScreenConf();
        }

        public boolean hasLossLessConf() {
            return ((PlayArcConf) this.instance).hasLossLessConf();
        }

        public boolean hasNextConf() {
            return ((PlayArcConf) this.instance).hasNextConf();
        }

        public boolean hasOuterDmConf() {
            return ((PlayArcConf) this.instance).hasOuterDmConf();
        }

        public boolean hasPanoramaConf() {
            return ((PlayArcConf) this.instance).hasPanoramaConf();
        }

        public boolean hasPlaybackModeConf() {
            return ((PlayArcConf) this.instance).hasPlaybackModeConf();
        }

        public boolean hasPlaybackRateConf() {
            return ((PlayArcConf) this.instance).hasPlaybackRateConf();
        }

        public boolean hasPlaybackSpeedConf() {
            return ((PlayArcConf) this.instance).hasPlaybackSpeedConf();
        }

        public boolean hasRecommendConf() {
            return ((PlayArcConf) this.instance).hasRecommendConf();
        }

        public boolean hasScaleModeConf() {
            return ((PlayArcConf) this.instance).hasScaleModeConf();
        }

        public boolean hasScreenRecordingConf() {
            return ((PlayArcConf) this.instance).hasScreenRecordingConf();
        }

        public boolean hasScreenShotConf() {
            return ((PlayArcConf) this.instance).hasScreenShotConf();
        }

        public boolean hasSelectionsConf() {
            return ((PlayArcConf) this.instance).hasSelectionsConf();
        }

        public boolean hasShakeConf() {
            return ((PlayArcConf) this.instance).hasShakeConf();
        }

        public boolean hasShareConf() {
            return ((PlayArcConf) this.instance).hasShareConf();
        }

        public boolean hasSmallWindowConf() {
            return ((PlayArcConf) this.instance).hasSmallWindowConf();
        }

        public boolean hasSubtitleConf() {
            return ((PlayArcConf) this.instance).hasSubtitleConf();
        }

        public boolean hasTimeUpConf() {
            return ((PlayArcConf) this.instance).hasTimeUpConf();
        }

        public Builder mergeBackgroundPlayConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeBackgroundPlayConf(arcConf);
            return this;
        }

        public Builder mergeCastConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeCastConf(arcConf);
            return this;
        }

        public Builder mergeCoinConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeCoinConf(arcConf);
            return this;
        }

        public Builder mergeColorFilterConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeColorFilterConf(arcConf);
            return this;
        }

        public Builder mergeDefinitionConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeDefinitionConf(arcConf);
            return this;
        }

        public Builder mergeDislikeConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeDislikeConf(arcConf);
            return this;
        }

        public Builder mergeDolbyConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeDolbyConf(arcConf);
            return this;
        }

        public Builder mergeEditDmConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeEditDmConf(arcConf);
            return this;
        }

        public Builder mergeElecConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeElecConf(arcConf);
            return this;
        }

        public Builder mergeFeedbackConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeFeedbackConf(arcConf);
            return this;
        }

        public Builder mergeFlipConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeFlipConf(arcConf);
            return this;
        }

        public Builder mergeInnerDmConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeInnerDmConf(arcConf);
            return this;
        }

        public Builder mergeLikeConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeLikeConf(arcConf);
            return this;
        }

        public Builder mergeLockScreenConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeLockScreenConf(arcConf);
            return this;
        }

        public Builder mergeLossLessConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeLossLessConf(arcConf);
            return this;
        }

        public Builder mergeNextConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeNextConf(arcConf);
            return this;
        }

        public Builder mergeOuterDmConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeOuterDmConf(arcConf);
            return this;
        }

        public Builder mergePanoramaConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergePanoramaConf(arcConf);
            return this;
        }

        public Builder mergePlaybackModeConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergePlaybackModeConf(arcConf);
            return this;
        }

        public Builder mergePlaybackRateConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergePlaybackRateConf(arcConf);
            return this;
        }

        public Builder mergePlaybackSpeedConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergePlaybackSpeedConf(arcConf);
            return this;
        }

        public Builder mergeRecommendConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeRecommendConf(arcConf);
            return this;
        }

        public Builder mergeScaleModeConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeScaleModeConf(arcConf);
            return this;
        }

        public Builder mergeScreenRecordingConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeScreenRecordingConf(arcConf);
            return this;
        }

        public Builder mergeScreenShotConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeScreenShotConf(arcConf);
            return this;
        }

        public Builder mergeSelectionsConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeSelectionsConf(arcConf);
            return this;
        }

        public Builder mergeShakeConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeShakeConf(arcConf);
            return this;
        }

        public Builder mergeShareConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeShareConf(arcConf);
            return this;
        }

        public Builder mergeSmallWindowConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeSmallWindowConf(arcConf);
            return this;
        }

        public Builder mergeSubtitleConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeSubtitleConf(arcConf);
            return this;
        }

        public Builder mergeTimeUpConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).mergeTimeUpConf(arcConf);
            return this;
        }

        public Builder setBackgroundPlayConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setBackgroundPlayConf(arcConf);
            return this;
        }

        public Builder setCastConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setCastConf(arcConf);
            return this;
        }

        public Builder setCoinConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setCoinConf(arcConf);
            return this;
        }

        public Builder setColorFilterConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setColorFilterConf(arcConf);
            return this;
        }

        public Builder setDefinitionConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setDefinitionConf(arcConf);
            return this;
        }

        public Builder setDislikeConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setDislikeConf(arcConf);
            return this;
        }

        public Builder setDolbyConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setDolbyConf(arcConf);
            return this;
        }

        public Builder setEditDmConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setEditDmConf(arcConf);
            return this;
        }

        public Builder setElecConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setElecConf(arcConf);
            return this;
        }

        public Builder setFeedbackConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setFeedbackConf(arcConf);
            return this;
        }

        public Builder setFlipConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setFlipConf(arcConf);
            return this;
        }

        public Builder setInnerDmConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setInnerDmConf(arcConf);
            return this;
        }

        public Builder setLikeConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setLikeConf(arcConf);
            return this;
        }

        public Builder setLockScreenConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setLockScreenConf(arcConf);
            return this;
        }

        public Builder setLossLessConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setLossLessConf(arcConf);
            return this;
        }

        public Builder setNextConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setNextConf(arcConf);
            return this;
        }

        public Builder setOuterDmConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setOuterDmConf(arcConf);
            return this;
        }

        public Builder setPanoramaConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setPanoramaConf(arcConf);
            return this;
        }

        public Builder setPlaybackModeConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setPlaybackModeConf(arcConf);
            return this;
        }

        public Builder setPlaybackRateConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setPlaybackRateConf(arcConf);
            return this;
        }

        public Builder setPlaybackSpeedConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setPlaybackSpeedConf(arcConf);
            return this;
        }

        public Builder setRecommendConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setRecommendConf(arcConf);
            return this;
        }

        public Builder setScaleModeConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setScaleModeConf(arcConf);
            return this;
        }

        public Builder setScreenRecordingConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setScreenRecordingConf(arcConf);
            return this;
        }

        public Builder setScreenShotConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setScreenShotConf(arcConf);
            return this;
        }

        public Builder setSelectionsConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setSelectionsConf(arcConf);
            return this;
        }

        public Builder setShakeConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setShakeConf(arcConf);
            return this;
        }

        public Builder setShareConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setShareConf(arcConf);
            return this;
        }

        public Builder setSmallWindowConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setSmallWindowConf(arcConf);
            return this;
        }

        public Builder setSubtitleConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setSubtitleConf(arcConf);
            return this;
        }

        public Builder setTimeUpConf(ArcConf arcConf) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setTimeUpConf(arcConf);
            return this;
        }

        private Builder() {
            super(PlayArcConf.DEFAULT_INSTANCE);
        }

        public Builder setBackgroundPlayConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setBackgroundPlayConf(builder.build());
            return this;
        }

        public Builder setCastConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setCastConf(builder.build());
            return this;
        }

        public Builder setCoinConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setCoinConf(builder.build());
            return this;
        }

        public Builder setColorFilterConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setColorFilterConf(builder.build());
            return this;
        }

        public Builder setDefinitionConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setDefinitionConf(builder.build());
            return this;
        }

        public Builder setDislikeConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setDislikeConf(builder.build());
            return this;
        }

        public Builder setDolbyConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setDolbyConf(builder.build());
            return this;
        }

        public Builder setEditDmConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setEditDmConf(builder.build());
            return this;
        }

        public Builder setElecConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setElecConf(builder.build());
            return this;
        }

        public Builder setFeedbackConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setFeedbackConf(builder.build());
            return this;
        }

        public Builder setFlipConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setFlipConf(builder.build());
            return this;
        }

        public Builder setInnerDmConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setInnerDmConf(builder.build());
            return this;
        }

        public Builder setLikeConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setLikeConf(builder.build());
            return this;
        }

        public Builder setLockScreenConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setLockScreenConf(builder.build());
            return this;
        }

        public Builder setLossLessConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setLossLessConf(builder.build());
            return this;
        }

        public Builder setNextConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setNextConf(builder.build());
            return this;
        }

        public Builder setOuterDmConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setOuterDmConf(builder.build());
            return this;
        }

        public Builder setPanoramaConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setPanoramaConf(builder.build());
            return this;
        }

        public Builder setPlaybackModeConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setPlaybackModeConf(builder.build());
            return this;
        }

        public Builder setPlaybackRateConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setPlaybackRateConf(builder.build());
            return this;
        }

        public Builder setPlaybackSpeedConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setPlaybackSpeedConf(builder.build());
            return this;
        }

        public Builder setRecommendConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setRecommendConf(builder.build());
            return this;
        }

        public Builder setScaleModeConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setScaleModeConf(builder.build());
            return this;
        }

        public Builder setScreenRecordingConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setScreenRecordingConf(builder.build());
            return this;
        }

        public Builder setScreenShotConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setScreenShotConf(builder.build());
            return this;
        }

        public Builder setSelectionsConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setSelectionsConf(builder.build());
            return this;
        }

        public Builder setShakeConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setShakeConf(builder.build());
            return this;
        }

        public Builder setShareConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setShareConf(builder.build());
            return this;
        }

        public Builder setSmallWindowConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setSmallWindowConf(builder.build());
            return this;
        }

        public Builder setSubtitleConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setSubtitleConf(builder.build());
            return this;
        }

        public Builder setTimeUpConf(ArcConf.Builder builder) {
            copyOnWrite();
            ((PlayArcConf) this.instance).setTimeUpConf(builder.build());
            return this;
        }
    }

    static {
        PlayArcConf playArcConf = new PlayArcConf();
        DEFAULT_INSTANCE = playArcConf;
        GeneratedMessageLite.registerDefaultInstance(PlayArcConf.class, playArcConf);
    }

    private PlayArcConf() {
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
    public void clearScreenRecordingConf() {
        this.screenRecordingConf_ = null;
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

    public static PlayArcConf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBackgroundPlayConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCastConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoinConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeColorFilterConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDefinitionConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDislikeConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDolbyConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEditDmConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeElecConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeedbackConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFlipConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInnerDmConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLikeConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLockScreenConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLossLessConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNextConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOuterDmConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePanoramaConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaybackModeConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaybackRateConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaybackSpeedConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRecommendConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScaleModeConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScreenRecordingConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScreenShotConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSelectionsConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShakeConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSmallWindowConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubtitleConf(ArcConf arcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeUpConf(ArcConf arcConf) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayArcConf parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayArcConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayArcConf parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayArcConf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundPlayConf(ArcConf arcConf) {
        arcConf.getClass();
        this.backgroundPlayConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCastConf(ArcConf arcConf) {
        arcConf.getClass();
        this.castConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinConf(ArcConf arcConf) {
        arcConf.getClass();
        this.coinConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorFilterConf(ArcConf arcConf) {
        arcConf.getClass();
        this.colorFilterConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefinitionConf(ArcConf arcConf) {
        arcConf.getClass();
        this.definitionConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDislikeConf(ArcConf arcConf) {
        arcConf.getClass();
        this.dislikeConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDolbyConf(ArcConf arcConf) {
        arcConf.getClass();
        this.dolbyConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditDmConf(ArcConf arcConf) {
        arcConf.getClass();
        this.editDmConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElecConf(ArcConf arcConf) {
        arcConf.getClass();
        this.elecConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbackConf(ArcConf arcConf) {
        arcConf.getClass();
        this.feedbackConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlipConf(ArcConf arcConf) {
        arcConf.getClass();
        this.flipConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInnerDmConf(ArcConf arcConf) {
        arcConf.getClass();
        this.innerDmConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeConf(ArcConf arcConf) {
        arcConf.getClass();
        this.likeConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLockScreenConf(ArcConf arcConf) {
        arcConf.getClass();
        this.lockScreenConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLossLessConf(ArcConf arcConf) {
        arcConf.getClass();
        this.lossLessConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextConf(ArcConf arcConf) {
        arcConf.getClass();
        this.nextConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOuterDmConf(ArcConf arcConf) {
        arcConf.getClass();
        this.outerDmConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPanoramaConf(ArcConf arcConf) {
        arcConf.getClass();
        this.panoramaConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackModeConf(ArcConf arcConf) {
        arcConf.getClass();
        this.playbackModeConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackRateConf(ArcConf arcConf) {
        arcConf.getClass();
        this.playbackRateConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeedConf(ArcConf arcConf) {
        arcConf.getClass();
        this.playbackSpeedConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecommendConf(ArcConf arcConf) {
        arcConf.getClass();
        this.recommendConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScaleModeConf(ArcConf arcConf) {
        arcConf.getClass();
        this.scaleModeConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenRecordingConf(ArcConf arcConf) {
        arcConf.getClass();
        this.screenRecordingConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenShotConf(ArcConf arcConf) {
        arcConf.getClass();
        this.screenShotConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectionsConf(ArcConf arcConf) {
        arcConf.getClass();
        this.selectionsConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShakeConf(ArcConf arcConf) {
        arcConf.getClass();
        this.shakeConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareConf(ArcConf arcConf) {
        arcConf.getClass();
        this.shareConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallWindowConf(ArcConf arcConf) {
        arcConf.getClass();
        this.smallWindowConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleConf(ArcConf arcConf) {
        arcConf.getClass();
        this.subtitleConf_ = arcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeUpConf(ArcConf arcConf) {
        arcConf.getClass();
        this.timeUpConf_ = arcConf;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C64941.f16530xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayArcConf();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001f\u0000\u0000\u0001\u001f\u001f\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016\t\u0017\t\u0018\t\u0019\t\u001a\t\u001b\t\u001c\t\u001d\t\u001e\t\u001f\t", new Object[]{"backgroundPlayConf_", "flipConf_", "castConf_", "feedbackConf_", "subtitleConf_", "playbackRateConf_", "timeUpConf_", "playbackModeConf_", "scaleModeConf_", "likeConf_", "dislikeConf_", "coinConf_", "elecConf_", "shareConf_", "screenShotConf_", "lockScreenConf_", "recommendConf_", "playbackSpeedConf_", "definitionConf_", "selectionsConf_", "nextConf_", "editDmConf_", "smallWindowConf_", "shakeConf_", "outerDmConf_", "innerDmConf_", "panoramaConf_", "dolbyConf_", "screenRecordingConf_", "colorFilterConf_", "lossLessConf_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayArcConf> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayArcConf.class) {
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

    public ArcConf getBackgroundPlayConf() {
        ArcConf arcConf = this.backgroundPlayConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getCastConf() {
        ArcConf arcConf = this.castConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getCoinConf() {
        ArcConf arcConf = this.coinConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getColorFilterConf() {
        ArcConf arcConf = this.colorFilterConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getDefinitionConf() {
        ArcConf arcConf = this.definitionConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getDislikeConf() {
        ArcConf arcConf = this.dislikeConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getDolbyConf() {
        ArcConf arcConf = this.dolbyConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getEditDmConf() {
        ArcConf arcConf = this.editDmConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getElecConf() {
        ArcConf arcConf = this.elecConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getFeedbackConf() {
        ArcConf arcConf = this.feedbackConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getFlipConf() {
        ArcConf arcConf = this.flipConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getInnerDmConf() {
        ArcConf arcConf = this.innerDmConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getLikeConf() {
        ArcConf arcConf = this.likeConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getLockScreenConf() {
        ArcConf arcConf = this.lockScreenConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getLossLessConf() {
        ArcConf arcConf = this.lossLessConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getNextConf() {
        ArcConf arcConf = this.nextConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getOuterDmConf() {
        ArcConf arcConf = this.outerDmConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getPanoramaConf() {
        ArcConf arcConf = this.panoramaConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getPlaybackModeConf() {
        ArcConf arcConf = this.playbackModeConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getPlaybackRateConf() {
        ArcConf arcConf = this.playbackRateConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getPlaybackSpeedConf() {
        ArcConf arcConf = this.playbackSpeedConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getRecommendConf() {
        ArcConf arcConf = this.recommendConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getScaleModeConf() {
        ArcConf arcConf = this.scaleModeConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getScreenRecordingConf() {
        ArcConf arcConf = this.screenRecordingConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getScreenShotConf() {
        ArcConf arcConf = this.screenShotConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getSelectionsConf() {
        ArcConf arcConf = this.selectionsConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getShakeConf() {
        ArcConf arcConf = this.shakeConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getShareConf() {
        ArcConf arcConf = this.shareConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getSmallWindowConf() {
        ArcConf arcConf = this.smallWindowConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getSubtitleConf() {
        ArcConf arcConf = this.subtitleConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
    }

    public ArcConf getTimeUpConf() {
        ArcConf arcConf = this.timeUpConf_;
        return arcConf == null ? ArcConf.getDefaultInstance() : arcConf;
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

    public boolean hasScreenRecordingConf() {
        return this.screenRecordingConf_ != null;
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

    public static Builder newBuilder(PlayArcConf playArcConf) {
        return DEFAULT_INSTANCE.createBuilder(playArcConf);
    }

    public static PlayArcConf parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayArcConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayArcConf parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayArcConf parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayArcConf parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayArcConf parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayArcConf parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayArcConf parseFrom(InputStream inputStream) throws IOException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayArcConf parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayArcConf parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayArcConf parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
