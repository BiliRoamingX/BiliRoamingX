package app.revanced.bilibili.patches

import android.net.Uri
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Logger
import app.revanced.bilibili.utils.UposReplacer.isBCacheUpos
import app.revanced.bilibili.utils.UposReplacer.isOssUpos
import app.revanced.bilibili.utils.UposReplacer.isPCdnUpos
import tv.danmaku.ijk.media.player.IjkMediaAsset.MediaAssertSegment

object PlayUrlPatch {
    @Keep
    @JvmStatic
    fun onBuildMediaAssetSegment(asset: MediaAssertSegment) {
        if (!Settings.PreferStableCdn())
            return
        val url = asset.url
        val backupUrls = asset.backupUrls
        if (url.isNullOrEmpty() || backupUrls.isNullOrEmpty())
            return
        val uri = Uri.parse(url)
        if (!uri.encodedPath.orEmpty().contains("live")
            && (url.isPCdnUpos() || url.isBCacheUpos() || url.isOssUpos())
        ) {
            // mirror > oss > bCache > pcdn
            val stableCdn = backupUrls.find {
                !it.isPCdnUpos() && !it.isBCacheUpos() && !it.isOssUpos()
            } ?: backupUrls.find {
                !it.isPCdnUpos() && !it.isBCacheUpos()
            } ?: backupUrls.find { !it.isPCdnUpos() }
            if (stableCdn != null) {
                asset.url = stableCdn
                asset.backupUrls.remove(stableCdn)
                asset.backupUrls.add(url)
                Logger.debug { "PlayUrlPatch, replace url: $url" }
                Logger.debug {
                    val originUrl = Uri.parse(url).buildUpon().clearQuery().toString()
                    val stableUrl = Uri.parse(stableCdn).buildUpon().clearQuery().toString()
                    "PlayUrlPatch, Replace cdn from $originUrl to $stableUrl"
                }
            }
        } else Logger.debug {
            "PlayUrlPatch, keep url: $url"
        }
    }
}
