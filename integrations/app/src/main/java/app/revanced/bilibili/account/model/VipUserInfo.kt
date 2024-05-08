package app.revanced.bilibili.account.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class VipUserInfo(
    @SerialName("avatar_subscript")
    val avatarSubscript: Int = 0,
    @SerialName("due_date")
    val endTime: Long = 0,
    @SerialName("label")
    val label: VipLabel? = null,
    @SerialName("nickname_color")
    val nicknameColor: String = "",
    @SerialName("theme_type")
    val themeType: Int = 0,
    @SerialName("vip_pay_type")
    val vipPayType: Int = 0,
    @SerialName("status")
    val vipStatus: Int = 0,
    @SerialName("type")
    val vipType: Int = 0,
) {

    @Serializable
    class VipLabel(
        @SerialName("image")
        val image: String = "",
        @SerialName("label_theme")
        val labelTheme: String = "",
        @SerialName("path")
        val path: String = "",
        @SerialName("text")
        val text: String = ""
    )

    val labelPath: String
        get() = label?.path.orEmpty()

    val labelTheme: String
        get() = label?.labelTheme.orEmpty()

    val isEffectiveVip: Boolean
        get() = (vipType == VIP_TYPE_VIP_TRUE || vipType == VIP_TYPE_VIP_TRUE_YEAR)
                && vipStatus == VIP_STATUS_WITHIN_DATE

    val isEffectiveYearVip: Boolean
        get() = vipType == VIP_TYPE_VIP_TRUE_YEAR && vipStatus == VIP_STATUS_WITHIN_DATE

    val isFrozen: Boolean
        get() = (vipType == VIP_TYPE_VIP_TRUE || vipType == VIP_TYPE_VIP_TRUE_YEAR)
                && vipStatus == VIP_STATUS_FREEZE

    val isLittleVip: Boolean
        get() = isEffectiveVip && themeType == VIP_THEME_TYPE_FOOL_DAY

    val isOutdated: Boolean
        get() = (vipType == VIP_TYPE_VIP_TRUE || vipType == VIP_TYPE_VIP_TRUE_YEAR)
                && vipStatus == VIP_STATUS_OUT_OF_DATE

    companion object {
        const val VIP_STATUS_BANNED: Int = 3
        const val VIP_STATUS_FREEZE: Int = 2
        const val VIP_STATUS_OUT_OF_DATE: Int = 0
        const val VIP_STATUS_WITHIN_DATE: Int = 1
        const val VIP_THEME_TYPE_FOOL_DAY: Int = 1
        const val VIP_THEME_TYPE_NORMAL: Int = 0
        const val VIP_TYPE_VIP_FALSE: Int = 0
        const val VIP_TYPE_VIP_TRUE: Int = 1
        const val VIP_TYPE_VIP_TRUE_YEAR: Int = 2
    }
}
