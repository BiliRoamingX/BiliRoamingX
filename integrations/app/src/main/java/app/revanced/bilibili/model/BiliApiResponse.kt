package app.revanced.bilibili.model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PolymorphicKind
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.descriptors.buildSerialDescriptor
import kotlinx.serialization.descriptors.element
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.*

@Serializable(with = ResponseSerializer::class)
sealed class BiliApiResponse<out T> {
    data class Ok<out T>(val data: T) : BiliApiResponse<T>()
    data class Error(val code: Int, val message: String) : BiliApiResponse<Nothing>()
}

fun <T> BiliApiResponse<T>.dataOrNull() = if (this is BiliApiResponse.Ok) data else null

@OptIn(InternalSerializationApi::class, ExperimentalSerializationApi::class)
class ResponseSerializer<T>(private val dataSerializer: KSerializer<T>) :
    KSerializer<BiliApiResponse<T>> {
    override val descriptor = buildSerialDescriptor("BiliApiResponse", PolymorphicKind.SEALED) {
        element("Ok", dataSerializer.descriptor)
        element("Error", buildClassSerialDescriptor("Error") {
            element<Int>("code")
            element<String>("message")
        })
    }

    override fun deserialize(decoder: Decoder): BiliApiResponse<T> {
        // Decoder -> JsonDecoder
        require(decoder is JsonDecoder) // this class can be decoded only by Json
        // JsonDecoder -> JsonElement
        val element = decoder.decodeJsonElement()
        // JsonElement -> value
        val code = if (element is JsonObject) {
            element["code"]?.jsonPrimitive?.int ?: -1
        } else -1
        val data = if (code == 0 && element is JsonObject) {
            element["data"] ?: element["result"]
        } else null
        return if (code == 0 && data != null) {
            BiliApiResponse.Ok(decoder.json.decodeFromJsonElement(dataSerializer, data))
        } else {
            val message = if (element is JsonObject) {
                element["message"]?.jsonPrimitive?.content.orEmpty()
            } else ""
            BiliApiResponse.Error(code, message)
        }
    }

    override fun serialize(encoder: Encoder, value: BiliApiResponse<T>) {
        // Encoder -> JsonEncoder
        require(encoder is JsonEncoder) // This class can be encoded only by Json
        // value -> JsonElement
        val element = when (value) {
            is BiliApiResponse.Ok -> encoder.json.encodeToJsonElement(dataSerializer, value.data)
            is BiliApiResponse.Error -> buildJsonObject {
                put("code", value.code)
                put("message", value.message)
            }
        }
        // JsonElement -> JsonEncoder
        encoder.encodeJsonElement(element)
    }
}
