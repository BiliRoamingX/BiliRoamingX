package com.bapis.bilibili.playershared;

/**
 * for export {@link VideoVod}'s synthetic methods.
 */
public class VideoVodEx {
    public static void setQn(VideoVod vod, long qn) {
        VideoVod.access$500(vod, qn);
    }

    public static void setFnval(VideoVod vod, int fnval) {
        VideoVod.access$900(vod, fnval);
    }

    public static void setDownload(VideoVod vod, int download) {
        VideoVod.access$1100(vod, download);
    }

    public static void setFourk(VideoVod vod, boolean fourk) {
        VideoVod.access$1500(vod, fourk);
    }
}
