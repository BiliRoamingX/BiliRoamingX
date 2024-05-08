package app.revanced.bilibili.account.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class AccessToken(
    @SerialName("access_token")
    val accessKey: String = "",
    @SerialName("expires")
    val expires: Long = 0,
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
        get() = System.currentTimeMillis() > expires * 1000

    val isValid: Boolean
        get() = mid > 0 && accessKey.isNotEmpty()
}
