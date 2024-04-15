package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.asSequence
import app.revanced.bilibili.utils.orEmpty
import app.revanced.bilibili.utils.toJSONObject
import org.json.JSONObject

object GarbTrialSuitAsset : ApiHook() {

    var shouldHandle = false

    override fun shouldHook(url: String, code: Int): Boolean {
        if (Settings.SKIN.boolean && shouldHandle && url.contains("/x/garb/user/trial/suit/asset")) {
            shouldHandle = false
            return code.isOk
        } else return false
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        val json = response.toJSONObject()
        if (json.optInt("code", -1) != 0)
            return response
        val assets = json.optJSONObject("data")?.optJSONArray("assets")
            .orEmpty().asSequence<JSONObject>().toList()
        val skin = assets.find { it.optString("part") == "skin" }?.optJSONObject("item")
        val loading = assets.find { it.optString("part") == "loading" }?.optJSONObject("item")
        if (skin == null)
            return response
        val themeJson = JSONObject()
        val skinProps = skin.optJSONObject("properties") ?: return response
        val skinJson = JSONObject().apply {
            put("id", skin.optLong("item_id"))
            put("name", skin.optString("name"))
            put("preview", skinProps.optString("image_preview"))
            put("ver", skinProps.optLong("ver"))
            put("package_url", skinProps.optString("package_url"))
            //put("package_md5", props.optString("package_md5"))
            put("data", JSONObject().apply {
                put("color_mode", skinProps.optString("color_mode"))
                put("color", skinProps.optString("color"))
                put("color_second_page", skinProps.optString("color_second_page"))
                put("side_bg_color", skinProps.optString("side_bg_color"))
                put("tail_color", skinProps.optString("tail_color"))
                put("tail_color_selected", skinProps.optString("tail_color_selected"))
                put("tail_icon_ani", skinProps.optBoolean("tail_icon_ani"))
                put("tail_icon_ani_mode", skinProps.optString("tail_icon_ani_mode"))
                put("head_myself_mp4_play", skinProps.optString("head_myself_mp4_play"))
                put("tail_icon_mode", skinProps.optString("tail_icon_mode"))
            })
        }
        val loadingJson = loading?.let {
            it.optJSONObject("properties")?.let { loadingProps ->
                JSONObject().apply {
                    put("id", it.optLong("item_id"))
                    put("name", it.optString("name"))
                    put("loading_url", loadingProps.optString("loading_url"))
                    put("ver", loadingProps.optLong("ver"))
                }
            }
        }
        themeJson.put("user_equip", skinJson)
        loadingJson?.let {
            themeJson.put("load_equip", it)
        }
        Settings.SKIN.saveValue(true)
        Settings.SKIN_JSON.saveValue(themeJson.toString())
        return response
    }
}
