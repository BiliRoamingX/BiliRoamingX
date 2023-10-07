package app.revanced.bilibili.patches.main

import android.widget.Toast
import app.revanced.bilibili.meta.CouponInfo
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

object CouponAutoReceiver {

    @JvmStatic
    fun check() = if (Settings.AUTO_RECEIVE_COUPON.boolean) Utils.async {
        val successCount = getCouponInfo()?.list?.count { item ->
            if (item.type != 8 && item.state != 1 && item.nextReceiveDays != 0L)
                receiveCoupon(item.type)
            else false
        } ?: 0
        LogHelper.debug { "CouponAutoReceiver.successCount: $successCount" }
        if (successCount > 0) Toasts.show(
            Utils.getString("biliroaming_coupon_receive_success", successCount),
            Toast.LENGTH_LONG
        )
    } else Unit

    private fun getCouponInfo() = runCatchingOrNull {
        val connection = URL("https://api.bilibili.com/x/vip/privilege/my")
            .openConnection() as HttpURLConnection
        connection.setRequestMethod("GET")
        connection.setRequestProperty("Cookie", "SESSDATA=$cookieSESSDATA")
        connection.setRequestProperty("User-Agent", defaultUA)
        connection.connect()
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            val json = getStreamContent(connection.inputStream).toJSONObject()
            LogHelper.debug { "CouponAutoReceiver.couponInfo: $json" }
            if (json.optInt("code", -1) == 0) {
                json.optJSONObject("data")?.optJSONArray("list")
                    .orEmpty().asSequence<JSONObject>()
                    .map {
                        CouponInfo.Item(
                            it.optInt("type"),
                            it.optInt("state"),
                            it.optLong("next_receive_days")
                        )
                    }
                    .toList().let { CouponInfo(it) }
            } else null
        } else null
    }

    private fun receiveCoupon(type: Int) = runCatchingOrNull {
        val connection = URL("https://api.bilibili.com/x/vip/privilege/receive")
            .openConnection() as HttpURLConnection
        connection.setRequestMethod("POST")
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
        connection.setRequestProperty("Cookie", "SESSDATA=$cookieSESSDATA")
        connection.setRequestProperty("User-Agent", defaultUA)
        connection.setDoOutput(true)
        val output = connection.outputStream
        output.write("type=$type&csrf=$cookieBiliJct".toByteArray(Charsets.UTF_8))
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            val json = getStreamContent(connection.inputStream).toJSONObject()
            LogHelper.debug { "CouponAutoReceiver.receiveCoupon, type: $type, response: $json" }
            json.optInt("code", -1) == 0
        } else false
    } ?: false
}
