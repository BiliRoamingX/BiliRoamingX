package tv.danmaku.ijk.media.player;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

/* compiled from: BL */
/* loaded from: classes15.dex */
public interface IMediaPlayer {
    public static final int BUFFERING_START_REASON_BITRATE_HIGHER = 9;
    public static final int BUFFERING_START_REASON_DNS_FAIL = 16;
    public static final int BUFFERING_START_REASON_FILE_UNREACHABLE = 17;
    public static final int BUFFERING_START_REASON_FIRST_PLAY = 4;
    public static final int BUFFERING_START_REASON_LOW_PERFORMANCE = 12;
    public static final int BUFFERING_START_REASON_NETWORK_CHANGE = 15;
    public static final int BUFFERING_START_REASON_NETWORK_ERROR = 10;
    public static final int BUFFERING_START_REASON_SEEK = 1;
    public static final int BUFFERING_START_REASON_SPARSE_AUDIO = 13;
    public static final int BUFFERING_START_REASON_SWITCH_ITEM = 2;
    public static final int BUFFERING_START_REASON_SWITCH_SOURCE = 3;
    public static final int BUFFERING_START_REASON_TCP_CONNECT_TIMEOUT = 14;
    public static final int BUFFERING_START_REASON_TCP_READ_TIMEOUT = 7;
    public static final int BUFFERING_START_REASON_TCP_SPEED_LOW = 8;
    public static final int BUFFERING_START_REASON_UNKNOWN = 6;
    public static final int BUFFERING_START_REASON_VDECODEC_ERROR = 11;
    public static final int MEDIA_ERROR_DISCONNECT = 10001;
    public static final int MEDIA_ERROR_IO = -1004;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_TIMED_OUT = -110;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
    public static final int MEDIA_INFO_APPEND_ITEM = 704;
    public static final int MEDIA_INFO_AUDIO_DECODED_START = 10003;
    public static final int MEDIA_INFO_AUDIO_RENDERING_START = 10002;
    public static final int MEDIA_INFO_AUDIO_SEEK_RENDERING_START = 10009;
    public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
    public static final int MEDIA_INFO_BILIDRM_ERROR = 13001;
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_COMPONENT_OPEN = 10007;
    public static final int MEDIA_INFO_FIND_STREAM_INFO = 10006;
    public static final int MEDIA_INFO_MEDIA_ACCURATE_SEEK_COMPLETE = 10100;
    public static final int MEDIA_INFO_MEDIA_DECODER_SWITCH = 10106;
    public static final int MEDIA_INFO_MEDIA_END_PREPARE = 10102;
    public static final int MEDIA_INFO_MEDIA_END_SEEK = 10104;
    public static final int MEDIA_INFO_MEDIA_LOOP = 10110;
    public static final int MEDIA_INFO_MEDIA_START_PREPARE = 10101;
    public static final int MEDIA_INFO_MEDIA_START_QUALITY_CHANGED = 10111;
    public static final int MEDIA_INFO_MEDIA_START_SEEK = 10103;
    public static final int MEDIA_INFO_MEDIA_STATE_CHANGED = 10105;
    public static final int MEDIA_INFO_MEDIA_SWITCH_SOURCE = 10107;
    public static final int MEDIA_INFO_METADATA_UPDATE = 802;
    public static final int MEDIA_INFO_NETWORK_BANDWIDTH = 703;
    public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
    public static final int MEDIA_INFO_OPEN_INPUT = 10005;
    public static final int MEDIA_INFO_REMOVE_ITEM = 705;
    public static final int MEDIA_INFO_STARTED_AS_NEXT = 2;
    public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = 902;
    public static final int MEDIA_INFO_TIMED_TEXT_ERROR = 900;
    public static final int MEDIA_INFO_UNKNOWN = 1;
    public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = 901;
    public static final int MEDIA_INFO_VIDEO_DECODED_START = 10004;
    public static final int MEDIA_INFO_VIDEO_DECODED_STOP = 10109;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
    public static final int MEDIA_INFO_VIDEO_ROTATION_CHANGED = 10001;
    public static final int MEDIA_INFO_VIDEO_SEEK_RENDERING_START = 10008;
    public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
    public static final int MEDIA_INFO_WIDEVINE_ERROR = 13000;

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public interface OnBufferingUpdateListener {
        void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i);
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public interface OnCompletionListener {
        void onCompletion(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public interface OnErrorListener {
        boolean onError(IMediaPlayer iMediaPlayer, int i, int i2);
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public interface OnInfoListener {
        boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2, Bundle bundle);
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public interface OnPlayerClockChangedListener {
        void onPlayerClockChanged(IMediaPlayer iMediaPlayer, float f, long j);
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public interface OnPreparedListener {
        void onPrepared(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public interface OnSeekCompleteListener {
        void onSeekComplete(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public interface OnTimedTextListener {
        void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText);
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public interface OnTrackerListener {
        void onTrackerReport(boolean z, String str, Map<String, String> map, String str2, Map<String, String> map2);
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public interface OnVideoSizeChangedListener {
        void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4);
    }

    int getAudioSessionId();

    long getCurrentPosition();

    String getDataSource();

    long getDuration();

    MediaInfo getMediaInfo();

    ITrackInfo[] getTrackInfo();

    int getVideoHeight();

    int getVideoSarDen();

    int getVideoSarNum();

    int getVideoWidth();

    boolean isLooping();

    @Deprecated
    boolean isPlayable();

    boolean isPlaying();

    void pause() throws IllegalStateException;

    void prepareAsync() throws IllegalStateException;

    void release();

    void reset();

    void seekTo(long j) throws IllegalStateException;

    void setAudioStreamType(int i);

    void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDataSource(FileDescriptor fileDescriptor) throws IOException, IllegalArgumentException, IllegalStateException;

    void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDataSource(IMediaDataSource iMediaDataSource);

    void setDisplay(SurfaceHolder surfaceHolder);

    @Deprecated
    void setKeepInBackground(boolean z);

    @Deprecated
    void setLogEnabled(boolean z);

    void setLooping(boolean z);

    void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener);

    void setOnCompletionListener(OnCompletionListener onCompletionListener);

    void setOnErrorListener(OnErrorListener onErrorListener);

    void setOnInfoListener(OnInfoListener onInfoListener);

    void setOnPlayerClockChangedListener(@Nullable Looper looper, OnPlayerClockChangedListener onPlayerClockChangedListener);

    void setOnPreparedListener(OnPreparedListener onPreparedListener);

    void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener);

    void setOnTimedTextListener(OnTimedTextListener onTimedTextListener);

    void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener);

    void setScreenOnWhilePlaying(boolean z);

    void setSurface(Surface surface);

    void setVolume(float f, float f2);

    @Deprecated
    void setWakeMode(Context context, int i);

    void start() throws IllegalStateException;

    void stop() throws IllegalStateException;
}
