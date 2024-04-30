package app.revanced.bilibili.patches.okhttp.hooks

import android.net.Uri
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.api.BiliRoamingApi.getSpace
import app.revanced.bilibili.meta.Client
import app.revanced.bilibili.patches.okhttp.BaseFakeClientRestHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.json.JSONArray
import org.json.JSONObject

object Space : BaseFakeClientRestHook() {
    override val fakeToClient: Client
        get() = Client.PINK

    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return Settings.FORCE_SHOW_IP.boolean && Utils.isPlay()
                && url.contains("/x/v2/space?")
    }

    override fun shouldHook(url: String, code: Int): Boolean {
        return (Settings.FIX_SPACE.boolean
                || Settings.SKIN.boolean
                || Settings.IGNORE_BLACKLIST.boolean)
                && url.contains("/x/v2/space?") && code.isOk
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        val respOk = response.contains("\"code\":0")
        if (respOk && Settings.SKIN.boolean && url.contains("vmid=${Accounts.mid}")) {
            val skinJson = Settings.SKIN_JSON.string.runCatchingOrNull {
                toJSONObject()
            } ?: return response
            val spaceBg = skinJson.optJSONObject("space_bg")
                ?: return response
            val respJson = response.toJSONObject()
            val data = respJson.optJSONObject("data")
                ?: return response
            data.writeSpaceImages(skinJson, spaceBg)
            return respJson.toString()
        } else if (respOk && Settings.IGNORE_BLACKLIST.boolean) {
            return response.toJSONObject().apply {
                optJSONObject("data")?.remove("hidden_attribute")
            }.toString()
        }
        if (!respOk && Settings.FIX_SPACE.boolean) {
            val vmid = Uri.parse(url).getQueryParameter("vmid")
            if (vmid.isNullOrEmpty()) return response
            val mid = vmid.toLong()
            val data = getSpace(mid) ?: return response
            return """{"code":0,"data":$data}"""
        }
        return response
    }

    private fun JSONObject.writeSpaceImages(skinJson: JSONObject, spaceBg: JSONObject) {
        val skinId = skinJson.optLong("id")
        val skinName = skinJson.optString("name")
        val spaceBgId = spaceBg.optLong("id")
        val imagesJson = optJSONObject("images") ?: run {
            JSONObject().also { this@writeSpaceImages.put("images", it) }
        }
        val collectionJson = imagesJson.optJSONObject("collection_top_simple") ?: run {
            JSONObject().also { imagesJson.put("collection_top_simple", it) }
        }
        val topJson = collectionJson.optJSONObject("top") ?: run {
            JSONObject().also { collectionJson.put("top", it) }
        }
        val resultJson = topJson.optJSONArray("result") ?: run {
            JSONArray().also { topJson.put("result", it) }
        }
        spaceBg.optJSONArray("images").orEmpty().iterator().withIndex().forEach { (index, image) ->
            val landscape = image.optString("landscape")
            val portrait = image.optString("portrait")
            mapOf(
                "biz_type" to 1,
                "biz_id" to skinId,
                "item_id" to "$spaceBgId-$index",
                "item" to mapOf(
                    "item_type" to 1,
                    "item_id" to "$spaceBgId-$index",
                    "image" to mapOf(
                        "default_image" to landscape,
                        "long_image" to portrait,
                        "shape_type" to 1,
                    ),
                    "extra" to mapOf("show_in_space" to true),
                    "garb_extra" to mapOf(
                        "space_item_id" to spaceBgId,
                        "space_item_index" to 0,
                    ),
                    "cover" to portrait,
                ),
                "title" to mapOf(
                    "title" to skinName,
                    "sub_title_background_color" to "#FFFFFFFF",
                    "sub_title_color_format" to mapOf(
                        "start_point" to "0,0",
                        "end_point" to "0,100",
                        "colors" to listOf("#FFFFFFFF", "#FFFFFFFF"),
                        "gradients" to listOf(0, 100),
                    )
                ),
                "extra" to mapOf(
                    "duration" to 5000,
                    "hidden" to false,
                    "item_count" to 1,
                ),
                "cover" to portrait,
            ).toJSONObject().let { resultJson.put(it) }
        }
    }
}
