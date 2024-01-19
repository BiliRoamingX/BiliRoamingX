package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.json.PegasusPatch
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.utils.Versions
import app.revanced.bilibili.utils.toJSONObject

object FeedIndex : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return code.isOk && Versions.ge7_62_0()
                && url.startsWith("https://app.bilibili.com/x/v2/feed/index?")
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        val resp = response.toJSONObject()
        if (resp.optInt("code", -1) == 0) {
            val data = resp.optJSONObject("data")
            if (data != null)
                PegasusPatch.pegasusHook(data)
            return resp.toString()
        }
        return response
    }
}
