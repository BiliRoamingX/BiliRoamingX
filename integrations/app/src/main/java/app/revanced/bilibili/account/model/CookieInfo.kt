package app.revanced.bilibili.account.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class CookieInfo(
    @SerialName("cookies")
    val cookies: List<CookieBean> = listOf(),
    @SerialName("domains")
    val domains: List<String> = listOf(),
) {
    @Serializable
    class CookieBean(
        @SerialName("expires")
        val expires: Long = 0,
        @SerialName("http_only")
        val httpOnly: Int = 0,
        @SerialName("name")
        val name: String = "",
        @SerialName("secure")
        val secure: Int = 0,
        @SerialName("value")
        val value: String = ""
    )
}
