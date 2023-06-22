package com.bapis.bilibili.community.service.dm.v1;

import androidx.annotation.Keep;

@Keep
public class VideoSubtitleEx {
    public static void addAllSubtitles(VideoSubtitle videoSubtitle, Iterable<? extends SubtitleItem> items) {
        VideoSubtitle.access$1000(videoSubtitle, items);
    }
}
