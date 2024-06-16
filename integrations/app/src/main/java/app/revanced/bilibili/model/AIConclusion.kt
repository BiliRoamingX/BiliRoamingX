package app.revanced.bilibili.model


import app.revanced.bilibili.model.serializer.IntAsBoolean
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// BV1L94y1H7CV
@Serializable
class AIConclusion(
    @SerialName("code")
    val code: Int = 0, // 0
    @SerialName("model_result")
    val modelResult: ModelResult = ModelResult(),
    @SerialName("stid")
    val stid: String = "", // 5117037934391059183
    @SerialName("status")
    val status: Int = 0, // 0
    @SerialName("like_num")
    val likeNum: Int = 0, // 10
    @SerialName("dislike_num")
    val dislikeNum: Int = 0 // 2
) {
    @Serializable
    class ModelResult(
        @SerialName("result_type")
        val resultType: Int = 0, // 2
        @SerialName("summary")
        val summary: String = "", // 在网上阅读时遇到错别字和语言梗的烦恼,以及正确使用语言的重要性。作者认为,我们每个人都应该有包容心,不掉渣,不纠正别人的错误,同时也需要明辨是非,规范使用语言。视频还提到了一些常见的语言梗和错误用法,呼吁大家不要过分使用网络词汇,而应该注重语言的艺术性和深度。最后,作者欢迎大家关注他的微信公众号。
        @SerialName("outline")
        val outline: List<Outline> = listOf()
    ) {
        @Serializable
        class Outline(
            @SerialName("title")
            val title: String = "", // 现代人使用中文时面临的困境,包括错别字、用法不正确等问题,并呼吁大家规范使用中文。
            @SerialName("part_outline")
            val partOutline: List<PartOutline> = listOf(),
            @SerialName("timestamp")
            val timestamp: Int = 0 // 1
        ) {
            @Serializable
            class PartOutline(
                @SerialName("timestamp")
                val timestamp: Int = 0, // 1
                @SerialName("content")
                val content: String = "" // 网友评论有错别字，勉强能看懂，但难受。
            )
        }
    }
}

@Serializable
class AIConclusionJudge(@SerialName("judge") val available: IntAsBoolean)
