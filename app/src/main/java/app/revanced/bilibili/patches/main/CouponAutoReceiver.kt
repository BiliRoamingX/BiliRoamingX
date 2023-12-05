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
        val couponInfo = getCouponInfo()
        val couponSuccessCount = couponInfo?.list?.count { item ->
            if (item.type <= 7 && item.state != 1 && item.nextReceiveDays != 0L)
                receiveCoupon(item.type)
            else false
        } ?: 0
        LogHelper.debug { "CouponAutoReceiver.couponSuccessCount: $couponSuccessCount" }
        if (couponSuccessCount > 0) Toasts.show(
            Utils.getString("biliroaming_coupon_receive_success", couponSuccessCount),
            Toast.LENGTH_LONG
        )
        val experienceSuccessCount = couponInfo?.list?.count { item ->
            if (item.type == 9 && item.state == 0 && item.vipType > 0)
                receiveExperience()
            else false
        } ?: 0
        LogHelper.debug { "CouponAutoReceiver.experienceSuccessCount: $experienceSuccessCount" }
        if (experienceSuccessCount > 0)
            Toasts.showShortWithId("biliroaming_experience_receive_success")
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
                            it.optLong("next_receive_days"),
                            it.optInt("vip_type"),
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
        connection.outputStream.write("type=$type&csrf=$cookieBiliJct".toByteArray(Charsets.UTF_8))
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            val json = getStreamContent(connection.inputStream).toJSONObject()
            LogHelper.debug { "CouponAutoReceiver.receiveCoupon, type: $type, response: $json" }
            json.optInt("code", -1) == 0
        } else false
    } ?: false

    private fun receiveExperience() = runCatchingOrNull {
        val connection = URL("https://api.bilibili.com/x/vip/experience/add")
            .openConnection() as HttpURLConnection
        connection.setRequestMethod("POST")
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
        connection.setRequestProperty("Cookie", "SESSDATA=$cookieSESSDATA")
        connection.setRequestProperty("User-Agent", defaultUA)
        connection.outputStream.write("csrf=$cookieBiliJct".toByteArray(Charsets.UTF_8))
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            val json = getStreamContent(connection.inputStream).toJSONObject()
            LogHelper.debug { "CouponAutoReceiver.receiveExperience, response: $json" }
            json.optInt("code", -1) == 0
        } else false
    } ?: false
}
