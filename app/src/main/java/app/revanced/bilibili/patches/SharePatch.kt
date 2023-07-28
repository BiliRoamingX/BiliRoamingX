package app.revanced.bilibili.patches

import android.net.Uri
import android.os.Bundle
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.LogHelper
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

object SharePatch {

    @JvmStatic
    fun disableAppendTrackingInfo(): Boolean {
        return Settings.PURIFY_SHARE.boolean
    }

    @JvmStatic
    fun onShareTo(platform: String, params: Bundle) {
        LogHelper.debug {
            "shareTo, platform: $platform, params: ${
                JSONObject(params.keySet().associateWith { params.get(it) })
            }"
        }
        if (Settings.PURIFY_SHARE.boolean) {
            val targetUrl = params.getString("params_target_url").orEmpty()
            if (targetUrl.startsWith("http")) {
                val connection = URL(targetUrl).openConnection() as HttpURLConnection
                connection.requestMethod = "GET"
                connection.instanceFollowRedirects = false
                connection.connect()
                if (connection.responseCode == HttpURLConnection.HTTP_MOVED_TEMP) {
                    val realUrl = connection.getHeaderField("Location")
                    if (!realUrl.isNullOrEmpty()) {
                        val newUrl = Uri.parse(realUrl).buildUpon()
                            .clearQuery().encodedFragment(null)
                            .build().toString()
                        params.putString("params_target_url", newUrl)
                    }
                }
            }
        }
        if (Settings.FUCK_MINI_PROGRAM.boolean) {
            if (params.getString("params_type") == "type_min_program")
                params.putString("params_type", "type_web")
        }
    }
}
