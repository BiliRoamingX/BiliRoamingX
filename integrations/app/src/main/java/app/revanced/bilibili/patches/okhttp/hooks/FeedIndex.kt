package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.json.PegasusPatch
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.Versions
import app.revanced.bilibili.utils.toJSONObject

object FeedIndex : ApiHook() {
    // 尊重官方，不强制关闭AB实验
    private val newPegasusEnabled by lazy {
        Utils.getAb("ff_key_use_new_pegasus", false)
    }

    override fun shouldHook(url: String, status: Int): Boolean {
        return status.isOk && Versions.ge7_76_0() && url.contains("/x/v2/feed/index?")
                && newPegasusEnabled
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
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
