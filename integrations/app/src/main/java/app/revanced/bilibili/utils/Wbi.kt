package app.revanced.bilibili.utils

import android.net.Uri
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.http.HttpClient
import java.util.Calendar
import java.util.TreeMap

object Wbi {
    private val mixinKeyEncTab = intArrayOf(
        46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49,
        33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40,
        61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11,
        36, 20, 34, 44, 52
    )

    private fun getMixinKey(imgKey: String, subKey: String): String {
        val s = imgKey + subKey
        val key = StringBuilder()
        for (i in 0 until 32)
            key.append(s[mixinKeyEncTab[i]])
        return key.toString()
    }

    private fun fetchWbiInfo(): Pair<String, String>? {
        val resp = HttpClient.get(
            "https://api.bilibili.com/x/web-interface/nav",
            headers = mapOf("Cookie" to "SESSDATA=${Accounts.cookieSESSDATA}"),
        )?.json() ?: return null
        val wbiImg = resp.optJSONObject("data")?.optJSONObject("wbi_img")
            ?: return null
        val imgUrl = wbiImg.optString("img_url")
        val subUrl = wbiImg.optString("sub_url")
        val imgKey = imgUrl.substringAfterLast('/').substringBefore('.')
        val subKey = subUrl.substringAfterLast('/').substringBefore('.')
        return imgKey to subKey
    }

    @Synchronized
    private fun getWbiKeys(): Pair<String, String>? {
        val lastFetchTime = cachePrefs.getLong("last_wbi_fetch_time", 0)
        val wbiKeys = cachePrefs.getString("wbi_keys", "")
        val now = Calendar.getInstance().apply { timeInMillis = System.currentTimeMillis() }
        val lastFetchInstant = Calendar.getInstance().apply { timeInMillis = lastFetchTime }
        return if (!wbiKeys.isNullOrEmpty()
            && lastFetchInstant.get(Calendar.YEAR) == now.get(Calendar.YEAR)
            && lastFetchInstant.get(Calendar.MONTH) == now.get(Calendar.MONTH)
            && lastFetchInstant.get(Calendar.DATE) == now.get(Calendar.DATE)
        ) wbiKeys.split('|', limit = 2).let { (imgKey, subKey) ->
            imgKey to subKey
        } else fetchWbiInfo()?.let { (imgKey, subKey) ->
            cachePrefs.edit(commit = true) {
                putLong("last_wbi_fetch_time", System.currentTimeMillis())
                putString("wbi_keys", "$imgKey|$subKey")
            }
            imgKey to subKey
        }
    }

    fun sign(query: Map<String, Any>): Map<String, Any> {
        val now = System.currentTimeMillis() / 1000
        val param = TreeMap(query).apply {
            put("wts", now)
        }.asSequence().joinToString(separator = "&") { (k, v) ->
            "$k=${Uri.encode(v.toString())}"
        }
        val (imgKey, subKey) = getWbiKeys()
            ?: return query
        val mixinKey = getMixinKey(imgKey, subKey)
        val wbiSign = "$param$mixinKey".toByteArray().md5Hex
        return query.toMutableMap().apply {
            put("wts", now)
            put("w_rid", wbiSign)
        }
    }
}
