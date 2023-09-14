package app.revanced.bilibili.patches.okhttp.hooks

import android.net.Uri
import app.revanced.bilibili.api.BiliRoamingApi.getSpace
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings

object Space : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.FIX_SPACE.boolean
                && url.startsWith("https://app.bilibili.com/x/v2/space?")
                && code.isOk
    }

    override fun hook(url: String, code: Int, response: String): String {
        if (response.contains("\"code\":0")) return response
        val vmid = Uri.parse(url).getQueryParameter("vmid")
        if (vmid.isNullOrEmpty()) return response
        val mid = vmid.toLong()
        val data = getSpace(mid) ?: return response
        return """{"code":0,"data":$data}"""
    }
}
