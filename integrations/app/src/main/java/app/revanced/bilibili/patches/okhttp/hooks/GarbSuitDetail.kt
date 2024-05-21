package app.revanced.bilibili.patches.okhttp.hooks

import android.app.AlertDialog
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*

object GarbSuitDetail : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return Settings.Skin() && url.contains("/x/garb/v2/mall/suit/detail") && status.isOk
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        val json = response.toJSONObject()
        if (json.optInt("code", -1) != 0)
            return response
        val data = json.optJSONObject("data")
            ?: return response
        val id = data.optLong("item_id")
        val name = data.optString("name")
        val suitItems = data.optJSONObject("suit_items")
            ?: return response
        val skin = suitItems.optJSONArray("skin")?.optJSONObject(0)
            ?: return response
        val skinProps = skin.optJSONObject("properties")
            ?: return response
        val loading = suitItems.optJSONArray("loading")?.optJSONObject(0)
        val playIcon = suitItems.optJSONArray("play_icon")?.optJSONObject(0)
        val spaceBg = suitItems.optJSONArray("space_bg")?.optJSONObject(0)
        if (skin.optLong("item_id") == Themes.customThemeId())
            return response
        Utils.runOnMainThread(1000L) {
            val topActivity = ApplicationDelegate.getTopActivity()
            if (topActivity != null) {
                AlertDialog.Builder(topActivity)
                    .setMessage(Utils.getString("biliroaming_found_theme"))
                    .setNegativeButton(android.R.string.cancel, null)
                    .setPositiveButton(android.R.string.ok) { _, _ ->
                        Utils.async {
                            runCatching {
                                Themes.applyTheme(
                                    id, name, skin, skinProps, loading, playIcon, spaceBg
                                )
                            }.onFailure {
                                Logger.error(it) { "theme apply failed" }
                                Toasts.showShortWithId("biliroaming_theme_apply_failed")
                            }.onSuccess {
                                Settings.SkinJson.save(it.toString())
                            }
                        }
                    }.create().constraintSize().show()
            }
        }
        return response
    }
}
