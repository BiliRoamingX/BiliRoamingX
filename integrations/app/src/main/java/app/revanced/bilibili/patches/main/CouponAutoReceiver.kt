package app.revanced.bilibili.patches.main

import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.http.ContentType
import app.revanced.bilibili.http.HttpClient
import app.revanced.bilibili.http.RequestBody
import app.revanced.bilibili.http.RequestBody.Companion.toRequestBody
import app.revanced.bilibili.model.CouponInfo
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Logger
import app.revanced.bilibili.utils.Toasts
import app.revanced.bilibili.utils.signQuery

object CouponAutoReceiver {

    @JvmStatic
    fun check() = if (Settings.AutoReceiveCoupon()) run {
        val couponInfo = getCouponInfo()
        val couponSuccessCount = couponInfo?.list?.count { item ->
            if (item.type <= 7 && item.state != 1 && item.vipType > 0)
                receiveCoupon(item.type)
            else false
        } ?: 0
        Logger.debug { "CouponAutoReceiver.couponSuccessCount: $couponSuccessCount" }
        val experienceSuccessCount = couponInfo?.list?.count { item ->
            if (item.type == 9 && item.state == 0 && item.vipType > 0)
                receiveExperience()
            else false
        } ?: 0
        Logger.debug { "CouponAutoReceiver.experienceSuccessCount: $experienceSuccessCount" }
        val coupon = if (couponSuccessCount > 0) "${couponSuccessCount}张卡券" else null
        val vipExp = if (experienceSuccessCount > 0) "大会员每日经验" else null
        val shareExp = if (receiveShareExperience()) "每日视频分享经验" else null
        arrayOf(coupon, vipExp, shareExp).filterNotNull().joinToString("、")
            .takeIf { it.isNotEmpty() }?.let {
                Toasts.showLongWithId("biliroaming_coupon_receive_success", it)
            }
    } else Unit

    private fun getCouponInfo() = HttpClient.get(
        "https://api.bilibili.com/x/vip/privilege/my",
        headers = mapOf("Cookie" to "SESSDATA=${Accounts.cookieSESSDATA}")
    )?.data<CouponInfo>()

    private fun receiveCoupon(type: Int) = HttpClient.post(
        "https://api.bilibili.com/x/vip/privilege/receive",
        headers = mapOf("Cookie" to "SESSDATA=${Accounts.cookieSESSDATA}"),
        body = RequestBody.form("type" to type, "csrf" to Accounts.cookieBiliJct)
    )?.json()?.run {
        Logger.debug { "CouponAutoReceiver.receiveCoupon, type: $type, response: $this" }
        optInt("code", -1) == 0
    } ?: false

    private fun receiveExperience() = HttpClient.post(
        "https://api.bilibili.com/x/vip/experience/add",
        headers = mapOf("Cookie" to "SESSDATA=${Accounts.cookieSESSDATA}"),
        body = RequestBody.form("csrf" to Accounts.cookieBiliJct)
    )?.json()?.run {
        Logger.debug { "CouponAutoReceiver.receiveExperience, response: $this" }
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
        val body = mapOf(
            "access_key" to Accounts.accessKey,
            "oid" to oid,
            "panel_type" to "1",
            "share_channel" to "QQ",
            "share_id" to "main.ugc-video-detail.0.0.pv",
            "share_origin" to "vinfo_player",
            "sid" to sid,
            "success" to "true",
        ).let { signQuery(it) }
        return HttpClient.post(
            "https://api.bilibili.com/x/share/finish",
            body = body.toRequestBody(ContentType.Form)
        )?.json()?.run {
            Logger.debug { "CouponAutoReceiver.receiveShareExperience, response: $this" }
            optInt("code", -1) == 0
                    && !optJSONObject("data")?.optString("toast").isNullOrEmpty()
        } ?: false
    }
}
