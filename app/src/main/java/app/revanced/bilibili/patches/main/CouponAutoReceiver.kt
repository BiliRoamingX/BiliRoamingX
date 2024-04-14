package app.revanced.bilibili.patches.main

import android.widget.Toast
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.http.ContentType
import app.revanced.bilibili.http.HttpClient
import app.revanced.bilibili.http.RequestBody
import app.revanced.bilibili.http.RequestBody.Companion.toRequestBody
import app.revanced.bilibili.meta.CouponInfo
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.json.JSONObject

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

    private fun getCouponInfo() = HttpClient.get(
        "https://api.bilibili.com/x/vip/privilege/my",
        headers = mapOf("Cookie" to "SESSDATA=${Accounts.cookieSESSDATA}")
    )?.json()?.run {
        LogHelper.debug { "CouponAutoReceiver.couponInfo: $this" }
        if (optInt("code", -1) == 0) {
            optJSONObject("data")?.optJSONArray("list")
                .orEmpty().asSequence<JSONObject>().map {
                    CouponInfo.Item(
                        it.optInt("type"),
                        it.optInt("state"),
                        it.optLong("next_receive_days"),
                        it.optInt("vip_type"),
                    )
                }.toList().let { CouponInfo(it) }
        } else null
    }

    private fun receiveCoupon(type: Int) = HttpClient.post(
        "https://api.bilibili.com/x/vip/privilege/receive",
        headers = mapOf("Cookie" to "SESSDATA=${Accounts.cookieSESSDATA}"),
        body = RequestBody.form(listOf("type" to type, "csrf" to Accounts.cookieBiliJct))
    )?.json()?.run {
        LogHelper.debug { "CouponAutoReceiver.receiveCoupon, type: $type, response: $this" }
        optInt("code", -1) == 0
    } ?: false

    private fun receiveExperience() = HttpClient.post(
        "https://api.bilibili.com/x/vip/experience/add",
        headers = mapOf("Cookie" to "SESSDATA=${Accounts.cookieSESSDATA}"),
        body = RequestBody.form(listOf("csrf" to Accounts.cookieBiliJct))
    )?.json()?.run {
        LogHelper.debug { "CouponAutoReceiver.receiveExperience, response: $this" }
        optInt("code", -1) == 0
    } ?: false

    private fun receiveShareExperience(): Boolean {
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
                "access_key" to Accounts.accessKey,
                "oid" to oid,
                "panel_type" to "1",
                "share_channel" to "QQ",
                "share_id" to "main.ugc-video-detail.0.0.pv",
                "share_origin" to "vinfo_player",
                "sid" to sid,
                "success" to "true",
            )
        )
        return HttpClient.post(
            "https://api.bilibili.com/x/share/finish",
            body = body.toRequestBody(ContentType.form)
        )?.json()?.run {
            LogHelper.debug { "CouponAutoReceiver.receiveShareExperience, response: $this" }
            optInt("code", -1) == 0
                    && !optJSONObject("data")?.optString("toast").isNullOrEmpty()
        } ?: false
    }
}
