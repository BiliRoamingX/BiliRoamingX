package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.meta.Client
import app.revanced.bilibili.patches.okhttp.BaseFakeClientRestHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils

object PlayFakeToPinkRest : BaseFakeClientRestHook() {
    private val apis = arrayOf(
        "https://api.bilibili.com/pgc/view/v2/app/season",
        "https://api.bilibili.com/pgc/view/v2/app/fav/season",
        "https://api.bilibili.com/pgc/view/v2/app/eps",
    )

    override val fakeToClient: Client
        get() = Client.PINK

    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return Settings.UNLOCK_AREA_LIMIT.boolean && Utils.isPlay()
                && apis.any { url.startsWith(it) }
    }
}
