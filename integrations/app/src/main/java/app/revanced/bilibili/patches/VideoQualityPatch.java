package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReq;
import com.bapis.bilibili.playershared.VideoVod;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Constants;
import app.revanced.bilibili.utils.KtUtils;

public class VideoQualityPatch {

    public static int halfScreenQuality() {
        String qualityStr = Settings.HalfScreenQuality.get();
        return Integer.parseInt(qualityStr);
    }

    public static int fullScreenQuality() {
        String qualityStr = Settings.FullScreenQuality.get();
        return Integer.parseInt(qualityStr);
    }

    public static int mobileFullScreenQuality() {
        String qualityStr = Settings.MobileFullScreenQuality.get();
        return Integer.parseInt(qualityStr);
    }

    /**
     * fullscreen video quality
     * <p>
     * codes will filled by patcher
     */
    @Keep
    public static int defaultQn() {
        return 0;
    }

    /**
     * unlock 8k limit
     * <p>
     * for old player PGC
     */
    public static void unlockLimit(com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReq playViewReq) {
        int halfScreenQuality = halfScreenQuality();
        int fulledScreenQuality = getMatchedFullScreenQuality();
        if (halfScreenQuality != 0 || fulledScreenQuality != 0) {
            playViewReq.setFnval(Constants.MAX_FNVAL);
            playViewReq.setFourk(true);
        }
    }

    /**
     * unlock 8k limit
     * <p>
     * for old player UGC
     */
    public static void unlockLimit(com.bapis.bilibili.app.playurl.v1.PlayViewReq playViewReq) {
        int halfScreenQuality = halfScreenQuality();
        int fulledScreenQuality = getMatchedFullScreenQuality();
        if (halfScreenQuality != 0 || fulledScreenQuality != 0) {
            playViewReq.setFnval(Constants.MAX_FNVAL);
            playViewReq.setFourk(true);
        }
    }

    /**
     * unlock 8k limit
     * <p>
     * for new unite(PGC + UGC) player
     */
    public static void unlockLimit(PlayViewUniteReq playViewReq) {
        VideoVod videoVod = playViewReq.getVod();
        int halfScreenQuality = halfScreenQuality();
        int fulledScreenQuality = getMatchedFullScreenQuality();
        if (halfScreenQuality != 0 || fulledScreenQuality != 0) {
            videoVod.setFnval(Constants.MAX_FNVAL);
            videoVod.setFourk(true);
        }
    }

    public static int getMatchedHalfScreenQuality() {
        int halfScreenQuality = halfScreenQuality();
        if (halfScreenQuality != 1) // not follow fullscreen quality
            return halfScreenQuality;
        return defaultQn();
    }

    @Keep
    public static int getMatchedFullScreenQuality() {
        return KtUtils.isWifiConnected() ? fullScreenQuality() : mobileFullScreenQuality();
    }
}
