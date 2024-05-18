@file:JvmName("Jsons")
@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

import kotlinx.serialization.json.*
import org.json.JSONArray
import org.json.JSONObject
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@Suppress("UNCHECKED_CAST")
fun <T> JSONArray.asSequence() = (0 until length()).asSequence().map { get(it) as T }

@OptIn(ExperimentalContracts::class)
inline fun JSONArray?.isNullOrEmpty(): Boolean {
    contract {
        returns(false) implies (this@isNullOrEmpty != null)
    }
    return this == null || length() == 0
}

operator fun JSONArray.iterator() = object : MutableIterator<JSONObject> {
    private var index = 0
    override fun hasNext() = index < length()
    override fun next() = getJSONObject(index++)
    override fun remove() {
        remove(--index)
    }
}

inline fun JSONArray?.orEmpty() = this ?: JSONArray()

inline fun String?.toJSONObject() = JSONObject(orEmpty())

inline fun Map<String, Any>.toJSONObject() = JSONObject(this)

inline fun JSONArray.removeIf(condition: (JSONObject) -> Boolean) {
    val it = iterator()
    while (it.hasNext()) {
        if (condition(it.next()))
            it.remove()
    }
}

inline fun JSONArray.forEach(operation: (JSONObject) -> Unit) = iterator().forEach(operation)

inline fun JSONArray.forEachIndexed(action: (index: Int, JSONObject) -> Unit) =
    iterator().withIndex().forEach { (index, e) -> action(index, e) }

inline fun JSONObject.putX(name: String, value: Any?): JSONObject = when (value) {
    is Boolean -> put(name, value)
    is Int -> put(name, value)
    is Long -> put(name, value)
    is Double -> put(name, value)
    else -> put(name, value)
}

inline fun JsonElement?.asBoolean(nullValue: Boolean = false) =
    if (this == null || this is JsonNull) nullValue else jsonPrimitive.boolean

inline fun JsonElement?.asInt(nullValue: Int = 0) =
    if (this == null || this is JsonNull) nullValue else jsonPrimitive.int

inline fun JsonElement?.asLong(nullValue: Long = 0L) =
    if (this == null || this is JsonNull) nullValue else jsonPrimitive.long

inline fun JsonElement?.asFloat(nullValue: Float = 0.0f) =
    if (this == null || this is JsonNull) nullValue else jsonPrimitive.float

inline fun JsonElement?.asDouble(nullValue: Double = 0.0) =
    if (this == null || this is JsonNull) nullValue else jsonPrimitive.double

inline fun JsonElement?.asString(nullValue: String = "") =
    if (this == null || this is JsonNull) nullValue else jsonPrimitive.content
