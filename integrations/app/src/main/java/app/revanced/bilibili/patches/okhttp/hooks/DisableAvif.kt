package app.revanced.bilibili.patches.okhttp.hooks

import android.util.Pair
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings

object DisableAvif : ApiHook() {
    private val avifRegex = Regex("""^(https?://[^@]+@\w*)\.avif$""")

    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return Settings.DisableAvif() && url.endsWith(".avif") && url.matches(avifRegex)
    }

    override fun hookBefore(url: String, headers: Array<String>): Pair<String, Array<String>> {
        avifRegex.replace(url) {
            val (_, prefix) = it.groupValues
            "$prefix.webp"
        }.let {
            return Pair.create(it, headers)
        }
    }
}
