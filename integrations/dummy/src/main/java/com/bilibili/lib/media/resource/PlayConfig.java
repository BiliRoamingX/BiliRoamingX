package com.bilibili.lib.media.resource;

public class PlayConfig {
    public enum PlayConfigType {
        NoType,
        FLIPCONF,
        CASTCONF,
        FEEDBACK,
        SUBTITLE,
        PLAYBACKRATE,
        TIMEUP,
        PLAYBACKMODE,
        SCALEMODE,
        BACKGROUNDPLAY,
        LIKE,
        DISLIKE,
        COIN,
        CHARGE,
        SHARE,
        SNAPSHOT,
        SCREENRECORD,
        LOCKSCREEN,
        RECOMMEND,
        PLAYBACKSPEED,
        QUALITY,
        PAGES,
        NEXT,
        DANMAKU,
        MINIPLAYER,
        OUTDANMAKUSETTINGSWITCH,
        INNERDANMAKUSETTINGSWITCH,
        WHOLESCENE,
        DOLBY,
        HIRES,
        TOGETHERWATCHENTER,
        TOGETHERWATCHFULLENTER,
        SKIP_HEAD_TAIL,
        COLORFILTER,
        DUBBING,
        LISTEN
    }

    public static class PlayMenuConfig {
        public PlayMenuConfig(boolean z, PlayConfigType playConfigType) {
        }
    }
}
