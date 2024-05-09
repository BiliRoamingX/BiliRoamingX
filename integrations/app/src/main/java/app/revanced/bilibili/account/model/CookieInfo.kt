package app.revanced.bilibili.account.model

import app.revanced.bilibili.model.serializer.IntAsBoolean
import app.revanced.bilibili.model.serializer.SecondsAsDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.Date

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
        val expires: SecondsAsDate = Date(),
        @SerialName("http_only")
        val httpOnly: IntAsBoolean = false,
        @SerialName("name")
        val name: String = "",
        @SerialName("secure")
        val secure: IntAsBoolean = false,
        @SerialName("value")
        val value: String = ""
    )
}
