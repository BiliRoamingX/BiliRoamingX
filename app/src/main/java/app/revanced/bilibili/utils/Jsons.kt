package app.revanced.bilibili.utils

import org.json.JSONArray
import org.json.JSONObject

fun String?.toJSONObject() = JSONObject(this.orEmpty())

@Suppress("UNCHECKED_CAST")
fun <T> JSONArray.asSequence() = (0 until length()).asSequence().map { get(it) as T }

operator fun JSONArray.iterator(): Iterator<JSONObject> =
    (0 until length()).asSequence().map { get(it) as JSONObject }.iterator()

fun JSONArray?.orEmpty() = this ?: JSONArray()
