package app.revanced.bilibili.meta;

import androidx.annotation.NonNull;

import java.util.Objects;

public class VideoHistory {
    public int epId;
    public long time;
    public long progress;

    public VideoHistory(int epId, long time, long progress) {
        this.epId = epId;
        this.time = time;
        this.progress = progress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoHistory that = (VideoHistory) o;
        return epId == that.epId && time == that.time && progress == that.progress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(epId, time, progress);
    }

    @NonNull
    @Override
    public String toString() {
        return "VideoHistory{" + "epId=" + epId + ", time=" + time + ", progress=" + progress + '}';
    }
}
