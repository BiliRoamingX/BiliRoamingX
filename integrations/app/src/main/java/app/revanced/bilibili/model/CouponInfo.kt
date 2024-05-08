package app.revanced.bilibili.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class CouponInfo(
    @SerialName("list")
    val list: List<Item> = listOf(),
) {
    @Serializable
    class Item(
        @SerialName("type")
        val type: Int = 0,
        @SerialName("state")
        val state: Int = 0,
        @SerialName("next_receive_days")
        val nextReceiveDays: Long = 0,
        @SerialName("vip_type")
        val vipType: Int = 0
    )
}
