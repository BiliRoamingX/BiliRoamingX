@file:JvmName("Jsons")
@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

import org.json.JSONArray
import org.json.JSONObject

inline fun String?.toJSONObject() = JSONObject(this.orEmpty())

@Suppress("UNCHECKED_CAST")
fun <T> JSONArray.asSequence() = (0 until length()).asSequence().map { get(it) as T }

operator fun JSONArray.iterator(): Iterator<JSONObject> =
    (0 until length()).asSequence().map { get(it) as JSONObject }.iterator()

inline fun JSONArray?.orEmpty() = this ?: JSONArray()

inline fun Map<String, Any>.toJson() = JSONObject(this).toString()

inline fun Map<String, Any>.toJSONObject() = JSONObject(this)
