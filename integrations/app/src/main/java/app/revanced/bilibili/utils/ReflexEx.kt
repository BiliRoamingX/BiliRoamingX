@file:Suppress("UNCHECKED_CAST", "NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

import app.revanced.bilibili.utils.Reflex.*

inline fun Any.getField(field: String?): Any? = getObjectField(this, field)

inline fun <T> Any.getFieldAs(field: String?) = getObjectField(this, field) as T

inline fun Any.setField(fieldName: String, value: Any?) = setObjectField(this, fieldName, value)

inline fun <reified T> Any.getFirstFieldByExactType() =
    getFirstFieldByExactType(this, T::class.java) as T

inline fun Any.callMethod(methodName: String?, vararg args: Any?): Any? =
    callMethod(this, methodName, *args)

inline fun <T> Any.callMethodAs(methodName: String?, vararg args: Any?) =
    callMethod(this, methodName, *args) as T

inline fun <T> Class<T>.new(vararg args: Any?): T = newInstance(this, *args) as T
