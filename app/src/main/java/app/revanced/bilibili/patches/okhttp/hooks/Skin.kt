package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.runCatchingOrNull
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONException
import org.json.JSONObject

object Skin : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.SKIN.boolean
                && Settings.SKIN_JSON.string.isNotEmpty()
                && url.contains("/x/resource/show/skin")
                && code.isOk
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        val skin = try {
            JSONObject(Settings.SKIN_JSON.string)
        } catch (_: JSONException) {
            return response
        }
        skin.remove("package_md5")
        val jo = response.toJSONObject()
        val data = jo.optJSONObject("data")
            ?: return response
        runCatchingOrNull {
            data.put("user_equip", skin)
        }
        return jo.toString()
    }
}
