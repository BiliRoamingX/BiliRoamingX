package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.meta.Client
import app.revanced.bilibili.patches.okhttp.BaseFakeClientRestHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils

object UnlockEpisodesForPlay : BaseFakeClientRestHook() {
    private val apis = arrayOf(
        "/pgc/view/v2/app/season",
        "/pgc/view/v2/app/fav/season",
        "/pgc/view/v2/app/eps",
    )

    override val fakeToClient: Client
        get() = Client.Pink

    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return Settings.UnlockAreaLimit() && Utils.isPlay()
                && apis.any { url.contains(it) }
    }
}
