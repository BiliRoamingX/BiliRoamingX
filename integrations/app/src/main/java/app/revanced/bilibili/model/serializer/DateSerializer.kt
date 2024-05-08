package app.revanced.bilibili.model.serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.util.Date

typealias DateAsSeconds = @Serializable(DateAsSecondsTimestampSerializer::class) Date
typealias DateAsMilliseconds = @Serializable(DateAsMillisecondsTimestampSerializer::class) Date

object DateAsSecondsTimestampSerializer : KSerializer<Date> {
    override val descriptor: SerialDescriptor
        get() = PrimitiveSerialDescriptor("DateAsSeconds", PrimitiveKind.LONG)

    override fun deserialize(decoder: Decoder): Date {
        val timestamp = decoder.decodeLong() * 1000
        return Date(timestamp)
    }

    override fun serialize(encoder: Encoder, value: Date) {
        encoder.encodeLong(value.time / 1000)
    }
}

object DateAsMillisecondsTimestampSerializer : KSerializer<Date> {
    override val descriptor: SerialDescriptor
        get() = PrimitiveSerialDescriptor("DateAsMilliseconds", PrimitiveKind.LONG)

    override fun deserialize(decoder: Decoder): Date {
        val timestamp = decoder.decodeLong()
        return Date(timestamp)
    }

    override fun serialize(encoder: Encoder, value: Date) {
        encoder.encodeLong(value.time)
    }
}
