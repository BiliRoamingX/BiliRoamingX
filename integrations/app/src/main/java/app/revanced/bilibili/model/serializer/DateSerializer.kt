package app.revanced.bilibili.model.serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.util.Date

/**
 * seconds timestamp as Date
 */
typealias SecondsAsDate = @Serializable(SecondsTimestampAsDateSerializer::class) Date
/**
 * milliseconds timestamp as Date
 */
typealias MillisecondsAsDate = @Serializable(MillisecondsTimestampAsDateSerializer::class) Date

object SecondsTimestampAsDateSerializer : KSerializer<Date> {
    override val descriptor: SerialDescriptor
        get() = PrimitiveSerialDescriptor("SecondsAsDate", PrimitiveKind.LONG)

    override fun deserialize(decoder: Decoder): Date {
        val timestamp = decoder.decodeLong() * 1000
        return Date(timestamp)
    }

    override fun serialize(encoder: Encoder, value: Date) {
        encoder.encodeLong(value.time / 1000)
    }
}

object MillisecondsTimestampAsDateSerializer : KSerializer<Date> {
    override val descriptor: SerialDescriptor
        get() = PrimitiveSerialDescriptor("MillisecondsAsDate", PrimitiveKind.LONG)

    override fun deserialize(decoder: Decoder): Date {
        val timestamp = decoder.decodeLong()
        return Date(timestamp)
    }

    override fun serialize(encoder: Encoder, value: Date) {
        encoder.encodeLong(value.time)
    }
}
