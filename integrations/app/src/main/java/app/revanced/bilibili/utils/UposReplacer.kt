package app.revanced.bilibili.utils

import android.net.Uri
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.playurl.v1.CodeType
import com.bapis.bilibili.app.playurl.v1.PlayURLMoss
import com.bapis.bilibili.app.playurl.v1.PlayViewReq
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

object UposReplacer {

    private val aliHost = Utils.getString("biliroaming_ali_host")
    private val cosHost = Utils.getString("biliroaming_cos_host")
    private val hwHost = Utils.getString("biliroaming_hw_host")
    private val aliovHost = Utils.getString("biliroaming_aliov_host")
    private val hkBcacheHost = Utils.getString("biliroaming_hk_bcache_host")

    private val isLocatedInCn by lazy { area.let { it == null || it == Area.China } }

    val uposBase: String
        get() = Settings.UposHost().ifEmpty {
            if (isLocatedInCn) hwHost else aliovHost
        }

    val uposBackups: List<String>
        get() = runCatchingOrNull {
            baseUposList.get(1L, TimeUnit.SECONDS)
                ?.filterNot { it == uposBase }?.subList(0, 2)
        } ?: extraUposList

    val replaceUpos inline get() = uposBase != Constants.NON_UPOS_VALUE

    private val uposList = Utils.getStringArray("biliroaming_upos_values")
    private val extraUposList: List<String>
        get() = when (uposList.indexOf(uposBase)) {
            in 1..4/* ali */ -> listOf(hwHost, cosHost)
            in 5..7/* cos */ -> listOf(hwHost, aliHost)
            in 8..15/* hw */ -> listOf(aliHost, cosHost)
            else/* oversea */ -> listOf(aliHost, hkBcacheHost)
        }

    private val ipPCdnRegex by lazy { Regex("""^https?://\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}""") }
    private val bCacheRegex by lazy { Regex("""^https?://cn-.*\.bilivideo""") }
    private val urlBwRegex by lazy { Regex("""(bw=[^&]*)""") }
    private val gotchaRegex by lazy { Regex("""https?://\w*--\w*-gotcha[\d-]*\.bilivideo""") }

    @JvmStatic
    val baseUposList: Future<List<String>> by lazy {
        Utils.submitTask {
            // https://b23.tv/BV1XX4y1k7U2 FOREVER1
            val playViewReq = PlayViewReq().apply {
                aid = 354638380L
                cid = 1085240781L
                qn = Constants.MAX_QN.toLong()
                fnval = Constants.MAX_FNVAL
                fourk = true
                forceHost = 2
                preferCodecType = CodeType.CODE265
            }
            val reply = PlayURLMoss().playView(playViewReq)
            val officialList = reply?.videoInfo?.run {
                buildList {
                    streamListList.forEach {
                        add(it.dashVideo.baseUrl)
                        addAll(it.dashVideo.backupUrlList)
                    }
                    dashAudioList.forEach {
                        add(it.baseUrl)
                        addAll(it.backupUrlList)
                    }
                }
            }?.mapNotNull { Uri.parse(it).encodedAuthority }?.distinct()
                ?.filterNot { it.isPCdnUpos() }.orEmpty()
            officialList.filterNot { it.isBCacheUpos() }
                .ifEmpty { officialList }
        }
    }

    fun String.isGotchaLiveCdn() = contains(gotchaRegex)

    fun String.isPCdnUpos() =
        contains("szbdyd.com") || contains(".mcdn.bilivideo") || contains(ipPCdnRegex)

    fun String.isBCacheUpos() = contains(bCacheRegex)

    fun String.isOssUpos() = Uri.parse(this).encodedAuthority.orEmpty().contains("oss")

    fun String.replaceUpos(upos: String = uposBase, needReplace: Boolean = true): String {
        fun String.replaceUposBw() = replace(urlBwRegex, "bw=1280000")

        return if (needReplace) {
            val uri = Uri.parse(this)
            val newUpos = uri.getQueryParameter("xy_usource") ?: upos
            uri.buildUpon().authority(newUpos).build().toString().replaceUposBw()
        } else replaceUposBw()
    }
}
