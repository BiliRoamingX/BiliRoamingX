package tv.danmaku.ijk.media.player;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public class IjkMediaAsset {
    int defaultAudioId;
    int defaultVideoId;
    public List<MediaAssetStream> streamList = null;

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum AudioCodecType {
        UNKNOWN,
        AAC,
        MP3,
        EAC3
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static class MediaAssertSegment {
        public List<String> backupUrls;
        public int duration;
        public long size;
        public String url;

        /* compiled from: BL */
        /* loaded from: classes17.dex */
        public static class Builder {
            private MediaAssertSegment target;

            public Builder(@NonNull String str, int i14) {
                MediaAssertSegment mediaAssertSegment = new MediaAssertSegment();
                this.target = mediaAssertSegment;
                mediaAssertSegment.url = str;
                this.target.duration = i14;
                this.target.backupUrls = new ArrayList();
            }

            @NonNull
            public MediaAssertSegment build() {
                MediaAssertSegment mediaAssertSegment = this.target;
                this.target = null;
                return mediaAssertSegment;
            }

            @NonNull
            public Builder setBackupUrls(@Nullable Collection<String> collection) {
                if (collection != null) {
                    this.target.backupUrls.addAll(collection);
                } else {
                    this.target.backupUrls.clear();
                }
                return this;
            }

            @NonNull
            public Builder setSize(long j14) {
                this.target.size = j14;
                return this;
            }
        }

        private MediaAssertSegment() {
        }

        public String changeUrl() {
            if (this.backupUrls.size() <= 0x0) {
                return "";
            }
            this.url = this.backupUrls.get(0x0);
            this.backupUrls.remove(0x0);
            return this.url;
        }

        @NonNull
        public List<String> getBackupUrls() {
            return this.backupUrls;
        }

        public int getDuration() {
            return this.duration;
        }

        public long getSize() {
            return this.size;
        }

        @NonNull
        public String getUrl() {
            return this.url;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static class MediaAssetStream {
        private AudioCodecType audioCodecType;
        private int bandWidth;
        private String drmKid;
        private int drmType;
        private int groupId;
        private int qualityId;
        private List<MediaAssertSegment> segments;
        private StreamType streamType;
        private VideoCodecType videoCodecType;

        public AudioCodecType getAudioCodecType() {
            return this.audioCodecType;
        }

        public int getBandWidth() {
            return this.bandWidth;
        }

        public String getDrmKid() {
            return this.drmKid;
        }

        public int getDrmType() {
            return this.drmType;
        }

        public int getGroupId() {
            return this.groupId;
        }

        @NonNull
        public List<MediaAssertSegment> getMediaAssertSegments() {
            return this.segments;
        }

        public int getQualityId() {
            return this.qualityId;
        }

        public StreamType getStreamType() {
            return this.streamType;
        }

        public VideoCodecType getVideoCodecType() {
            return this.videoCodecType;
        }

        private MediaAssetStream() {
            this.segments = null;
        }

        /* compiled from: BL */
        /* loaded from: classes17.dex */
        public static class Builder {
            private MediaAssetStream target;

            public Builder(@NonNull StreamType streamType, @NonNull VideoCodecType videoCodecType, @NonNull int i14, @NonNull int i15, @NonNull String str) {
                MediaAssetStream mediaAssetStream = new MediaAssetStream();
                this.target = mediaAssetStream;
                mediaAssetStream.streamType = streamType;
                this.target.videoCodecType = videoCodecType;
                this.target.qualityId = i14;
                this.target.segments = new ArrayList();
                this.target.drmType = i15;
                this.target.drmKid = str;
            }

            @NonNull
            public MediaAssetStream build() {
                MediaAssetStream mediaAssetStream = this.target;
                this.target = null;
                return mediaAssetStream;
            }

            @NonNull
            public Builder setBandWith(int i14) {
                this.target.bandWidth = i14;
                return this;
            }

            @NonNull
            public Builder setGroupId(int i14) {
                this.target.groupId = i14;
                return this;
            }

            @NonNull
            public Builder setMediaAssertSegments(@Nullable Collection<MediaAssertSegment> collection) {
                if (collection != null) {
                    this.target.segments.addAll(collection);
                } else {
                    this.target.segments.clear();
                }
                return this;
            }

            public Builder(@NonNull StreamType streamType, @NonNull VideoCodecType videoCodecType, @NonNull int i14) {
                MediaAssetStream mediaAssetStream = new MediaAssetStream();
                this.target = mediaAssetStream;
                mediaAssetStream.streamType = streamType;
                this.target.videoCodecType = videoCodecType;
                this.target.qualityId = i14;
                this.target.segments = new ArrayList();
            }

            public Builder(@NonNull StreamType streamType, @NonNull AudioCodecType audioCodecType, @NonNull int i14, @NonNull int i15, @NonNull String str) {
                MediaAssetStream mediaAssetStream = new MediaAssetStream();
                this.target = mediaAssetStream;
                mediaAssetStream.streamType = streamType;
                this.target.audioCodecType = audioCodecType;
                this.target.qualityId = i14;
                this.target.segments = new ArrayList();
                this.target.drmType = i15;
                this.target.drmKid = str;
            }

            public Builder(@NonNull StreamType streamType, @NonNull AudioCodecType audioCodecType, @NonNull int i14) {
                MediaAssetStream mediaAssetStream = new MediaAssetStream();
                this.target = mediaAssetStream;
                mediaAssetStream.streamType = streamType;
                this.target.audioCodecType = audioCodecType;
                this.target.qualityId = i14;
                this.target.segments = new ArrayList();
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum StreamType {
        NORMAL,
        DASH_VIDEO,
        DASH_AUDIO
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum VideoCodecType {
        UNKNOWN,
        H264,
        H265,
        AV1
    }

    public int getDefaultAudioId() {
        return this.defaultAudioId;
    }

    public int getDefaultVideoId() {
        return this.defaultVideoId;
    }

    public int getDrmType() {
        return 0;
    }

    @NonNull
    public List<MediaAssetStream> getStreamList() {
        return this.streamList;
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static class Builder {
        private IjkMediaAsset target;

        public Builder(@NonNull List<MediaAssetStream> list, @NonNull int i14, @NonNull int i15) {
            IjkMediaAsset ijkMediaAsset = new IjkMediaAsset();
            this.target = ijkMediaAsset;
            ijkMediaAsset.streamList = list;
            ijkMediaAsset.defaultVideoId = i14;
            ijkMediaAsset.defaultAudioId = i15;
        }

        @NonNull
        public IjkMediaAsset build() {
            IjkMediaAsset ijkMediaAsset = this.target;
            this.target = null;
            return ijkMediaAsset;
        }

        public Builder(@NonNull String str, VideoCodecType videoCodecType, @NonNull int i14, @NonNull int i15) {
            MediaAssertSegment.Builder builder = new MediaAssertSegment.Builder(str, 0x0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(builder.build());
            MediaAssetStream.Builder builder2 = new MediaAssetStream.Builder(StreamType.NORMAL, videoCodecType, 0x0);
            builder2.setMediaAssertSegments(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(builder2.build());
            IjkMediaAsset ijkMediaAsset = new IjkMediaAsset();
            this.target = ijkMediaAsset;
            ijkMediaAsset.streamList = arrayList2;
            ijkMediaAsset.defaultVideoId = i14;
            ijkMediaAsset.defaultAudioId = i15;
        }
    }
}
