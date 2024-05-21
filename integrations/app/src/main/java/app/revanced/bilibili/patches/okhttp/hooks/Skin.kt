package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONException
import org.json.JSONObject

object Skin : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return Settings.SkinJson().isNotEmpty()
                && url.contains("/x/resource/show/skin")
                && status.isOk
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        val skin = try {
            JSONObject(Settings.SkinJson())
        } catch (_: JSONException) {
            return response
        }
        val jo = response.toJSONObject()
        val data = jo.optJSONObject("data")
            ?: return response
        if (skin.has("user_equip")) {
            val userEquip = skin.getJSONObject("user_equip")
            val loadEquip = skin.optJSONObject("load_equip")
            data.put("user_equip", userEquip.apply { remove("package_md5") })
            loadEquip?.let { data.put("load_equip", it) }
        } else {
            data.put("user_equip", skin.apply { remove("package_md5") })
        }
        return jo.toString()
    }
}
