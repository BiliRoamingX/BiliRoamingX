@file:JvmName("Jsons")
@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

import org.json.JSONArray
import org.json.JSONObject
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

inline fun String?.toJSONObject() = JSONObject(this.orEmpty())

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

inline fun Map<String, Any>.toJson() = JSONObject(this).toString()

inline fun Map<String, Any>.toJSONObject() = JSONObject(this)
