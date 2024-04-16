package app.revanced.bilibili.patches.okhttp.hooks

import android.app.AlertDialog
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*

object GarbSuitDetail : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.SKIN.boolean && url.contains("/x/garb/v2/mall/suit/detail") && code.isOk
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        val json = response.toJSONObject()
        if (json.optInt("code", -1) != 0)
            return response
        val suitItems = json.optJSONObject("data")?.optJSONObject("suit_items")
            ?: return response
        val skin = suitItems.optJSONArray("skin")?.optJSONObject(0)
            ?: return response
        val skinProps = skin.optJSONObject("properties")
            ?: return response
        val loading = suitItems.optJSONArray("loading")?.optJSONObject(0)
        if (skin.optLong("item_id") == ThemeApplier.customThemeId())
            return response
        Utils.runOnMainThread(1000L) {
            val topActivity = ApplicationDelegate.getTopActivity()
            if (topActivity != null) {
                AlertDialog.Builder(topActivity)
                    .setMessage("发现主题，是否保存为自制主题？")
                    .setNegativeButton(android.R.string.cancel, null)
                    .setPositiveButton(android.R.string.ok) { _, _ ->
                        Utils.async {
                            runCatching {
                                ThemeApplier.applyTheme(skin, skinProps, loading)
                            }.onFailure {
                                Logger.error(it) { "theme set failed" }
                                Toasts.showShort("主题设置失败！")
                            }.onSuccess {
                                Settings.SKIN_JSON.saveValue(it.toString())
                            }
                        }
                    }.create().constraintSize().show()
            }
        }
        return response
    }
}
