package app.revanced.bilibili.account.model


import app.revanced.bilibili.model.serializer.SecondsAsDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.Date

@Serializable
class BlacklistInfo(
    @SerialName("uid")
    val uid: Long = 0,
    @SerialName("is_blacklist")
    val isBlacklist: Boolean = false,
    @SerialName("is_whitelist")
    val isWhitelist: Boolean = false,
    @SerialName("status")
    val status: Int = 0, // 0，正常，1 白名单，2 黑名单
    @SerialName("ban_until")
    val banUntil: SecondsAsDate = Date(),
)
