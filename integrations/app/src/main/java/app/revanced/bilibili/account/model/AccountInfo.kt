package app.revanced.bilibili.account.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class AccountInfo(
    @SerialName("answer_status")
    val answerStatus: Int = 0,
    @SerialName("face")
    val avatar: String = "",
    @SerialName("birthday")
    val birthday: String = "",
    @SerialName("coins")
    val coins: Float = 0f,
    @SerialName("email_status")
    val emailStatus: Int = 0,
    @SerialName("end_time")
    val endTime: Long = 0,
    @SerialName("has_face_nft")
    val hasNft: Boolean = false,
    @SerialName("identification")
    val identification: Int = 0,
    @SerialName("in_reg_audit")
    val inRegAudit: Int = 0,
    @SerialName("is_jury")
    val isJury: Boolean = false,
    @SerialName("is_senior_member")
    val isSeniorMember: Int = 0,
    @SerialName("set_birthday")
    val isSetBirthday: Boolean = false,
    @SerialName("is_tourist")
    val isTourist: Int = 0,
    @SerialName("level")
    val level: Int = 0,
    @SerialName("mid")
    val mid: Long = 0,
    @SerialName("pin_prompting")
    val pinPrompting: Int = 0,
    @SerialName("rank")
    val rank: Int = 0,
    @SerialName("sex")
    val sex: Int = 0,
    @SerialName("sign")
    val signature: String = "",
    @SerialName("silence")
    val silence: Int = 0,
    @SerialName("tel_status")
    val telStatus: Int = 0,
    @SerialName("name")
    val userName: String = "",
    @SerialName("vip")
    val vipInfo: VipUserInfo? = null
) {
    val silenceType: Int
        get() {
            if (silence == 0) return SILENCE_TYPE_NONE
            return if (endTime == 0L) SILENCE_TYPE_EVER else SILENCE_TYPE_NO_EVER
        }

    val vipLabelTheme: String
        get() = vipInfo?.labelTheme.orEmpty()

    val isFormalAccount: Boolean
        get() = rank >= 10000

    val isMobileVerified: Boolean
        get() = telStatus > 0

    val isRealName: Boolean
        get() = identification == 1

    companion object {
        const val ANSWER_STATUS_IN_PROGRESS: Int = 2
        const val ANSWER_STATUS_NOT: Int = 1
        const val SEX_TYPE_FEMALE: Int = 2
        const val SEX_TYPE_MALE: Int = 1
        const val SEX_TYPE_OTHER: Int = 0
        const val SILENCE_TYPE_EVER: Int = 2
        const val SILENCE_TYPE_NONE: Int = 0
        const val SILENCE_TYPE_NO_EVER: Int = 1
    }
}
