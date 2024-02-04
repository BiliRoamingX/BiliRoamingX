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
        val experienceSuccessCount = couponInfo?.list?.count { item ->
            if (item.type == 9 && item.state == 0 && item.vipType > 0)
                receiveExperience()
            else false
        } ?: 0
        LogHelper.debug { "CouponAutoReceiver.experienceSuccessCount: $experienceSuccessCount" }
        val coupon = if (couponSuccessCount > 0) "${couponSuccessCount}张卡券" else null
        val vipExp = if (experienceSuccessCount > 0) "大会员每日经验" else null
        val shareExp = if (receiveShareExperience()) "每日视频分享经验" else null
        arrayOf(coupon, vipExp, shareExp).filterNotNull().joinToString("、")
            .takeIf { it.isNotEmpty() }?.let {
                Toasts.show(
                    Utils.getString("biliroaming_coupon_receive_success", it),
                    Toast.LENGTH_LONG
                )
            }
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
        connection.outputStream.write("type=$type&csrf=$cookieBiliJct".toByteArray())
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
        connection.outputStream.write("csrf=$cookieBiliJct".toByteArray())
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            val json = getStreamContent(connection.inputStream).toJSONObject()
            LogHelper.debug { "CouponAutoReceiver.receiveExperience, response: $json" }
            json.optInt("code", -1) == 0
        } else false
    } ?: false

    private fun receiveShareExperience() = runCatchingOrNull {
        val connection = URL("https://api.bilibili.com/x/share/finish")
            .openConnection() as HttpURLConnection
        connection.setRequestMethod("POST")
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
        connection.setRequestProperty("User-Agent", defaultUA)
        val oid = "170001" // aid
        val sid = arrayOf(
            "279786",
            "275431",
            "279787",
            "280467",
            "280468",
            "280469",
            "274491",
            "267410",
            "267714",
            "270380",
        ).random() // cid
        val body = signQuery(
            mapOf(
                "access_key" to Utils.getAccessKey(),
                "oid" to oid,
                "panel_type" to "1",
                "share_channel" to "QQ",
                "share_id" to "main.ugc-video-detail.0.0.pv",
                "share_origin" to "vinfo_player",
                "sid" to sid,
                "success" to "true",
            )
        )
        connection.outputStream.write(body.toByteArray())
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            val json = getStreamContent(connection.inputStream).toJSONObject()
            LogHelper.debug { "CouponAutoReceiver.receiveShareExperience, response: $json" }
            json.optInt("code", -1) == 0
                    && !json.optJSONObject("data")?.optString("toast").isNullOrEmpty()
        } else false
    } ?: false
}
