@file:Suppress("UNCHECKED_CAST", "NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

import app.revanced.bilibili.utils.Reflex.*

inline fun Any.getIntField(field: String?) = getIntField(this, field)

inline fun Any.getObjectField(field: String?): Any? = getObjectField(this, field)

inline fun <T> Any.getObjectFieldAs(field: String?) = getObjectField(this, field) as T

inline fun <reified T> Any.getFirstFieldByExactType() =
    getFirstFieldByExactType(this, T::class.java) as T

inline fun Any.callMethod(methodName: String?, vararg args: Any?): Any? =
    callMethod(this, methodName, *args)

inline fun <T> Any.callMethodAs(methodName: String?, vararg args: Any?) =
    callMethod(this, methodName, *args) as T

inline fun <T> Class<T>.new(vararg args: Any?): T = newInstance(this, *args) as T
