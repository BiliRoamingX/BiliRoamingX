package app.revanced.bilibili.account.model

import app.revanced.bilibili.model.serializer.SecondsAsDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.Date

@Serializable
class AccessToken(
    @SerialName("access_token")
    val accessKey: String = "",
    @SerialName("expires")
    val expires: SecondsAsDate = Date(),
    @SerialName("expire_in")
    val expiresIn: Long = 0,
    @SerialName("fast_login_token")
    val fastLoginToken: String = "",
    @SerialName("mid")
    val mid: Long = 0,
    @SerialName("refresh_token")
    val refreshToken: String = ""
) {
    val canRefresh: Boolean
        get() = mid > 0 && refreshToken.isNotEmpty()

    val isExpired: Boolean
        get() = System.currentTimeMillis() > expires.time

    val isValid: Boolean
        get() = mid > 0 && accessKey.isNotEmpty()
}
