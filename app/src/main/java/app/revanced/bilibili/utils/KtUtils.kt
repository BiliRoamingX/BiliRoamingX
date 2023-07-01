@file:JvmName("KtUtils")
@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.graphics.Color
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.preference.Preference
import org.json.JSONObject
import java.io.File
import java.io.InputStream
import java.lang.reflect.Proxy
import java.net.URL
import java.util.TreeMap
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit
import kotlin.math.roundToInt

@get:JvmName("sp2px")
val Int.sp: Int
    inline get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_SP,
        toFloat(),
        Utils.getContext().resources.displayMetrics
    ).roundToInt()

@get:JvmName("dp2px")
val Int.dp: Int
    inline get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        toFloat(),
        Utils.getContext().resources.displayMetrics
    ).roundToInt()

operator fun ViewGroup.iterator(): MutableIterator<View> = object : MutableIterator<View> {
    private var index = 0
    override fun hasNext() = index < childCount
    override fun next() = getChildAt(index++) ?: throw IndexOutOfBoundsException()
    override fun remove() = removeViewAt(--index)
}

val ViewGroup.children: Sequence<View>
    get() = object : Sequence<View> {
        override fun iterator() = this@children.iterator()
    }

inline fun View.setRippleBackground() = with(TypedValue()) {
    context.theme.resolveAttribute(android.R.attr.selectableItemBackground, this, true)
    setBackgroundResource(resourceId)
}

@SuppressLint("UseCompatLoadingForDrawables")
inline fun View.setRippleForeground() = with(TypedValue()) {
    context.theme.resolveAttribute(android.R.attr.selectableItemBackground, this, true)
    foreground = context.getDrawable(resourceId)
}

@JvmOverloads
inline fun Context.inflateLayout(
    resIdName: String,
    root: ViewGroup? = null,
    attachToRoot: Boolean = root != null
): View {
    val resource = Utils.getResId(resIdName, "layout")
    return LayoutInflater.from(this).inflate(resource, root, attachToRoot)
}

inline fun <T : View> View.findViewByIdName(idName: String): T =
    findViewById(Utils.getResId(idName, "id"))

inline fun Int.toHexColor() = "%08X".format(0xFFFFFFFF.toInt() and this)

@ColorInt
@JvmOverloads
inline fun String.toIntColor(error: Int = Color.BLACK): Int = try {
    Color.parseColor(if (startsWith('#')) this else "#$this")
} catch (_: IllegalArgumentException) {
    error
}

@SuppressLint("ApplySharedPref")
inline fun SharedPreferences.edit(
    commit: Boolean = false,
    action: SharedPreferences.Editor.() -> Unit
) = edit().apply(action).run { if (commit) commit() else apply() }

fun getStreamContent(input: InputStream) = try {
    input.bufferedReader().use { it.readText() }
} catch (e: Throwable) {
    LogHelper.error({ "get stream content failed" }, e)
    null
}

fun fetchJson(url: String) = try {
    JSONObject(URL(url).readText())
} catch (_: Throwable) {
    null
}

enum class Area(@JvmField val value: String) {
    CN("cn"), HK("hk"), TW("tw"), TH("th"), GLOBAL("global");

    override fun toString() = value

    companion object {
        fun of(value: String?) = when (value) {
            CN.value -> CN
            HK.value -> HK
            TW.value -> TW
            TH.value -> TH
            GLOBAL.value -> GLOBAL
            else -> error("invalid area value: $value")
        }
    }
}

val countryTask: Future<Area> by lazy {
    Utils.submitTask {
        fun JSONObject.optStringFix(name: String, fallback: String = "") =
            if (isNull(name)) fallback else optString(name, fallback)

        when (arrayOf(Constants.ZONE_URL, Constants.INFO_URL).firstNotNullOfOrNull { url ->
            fetchJson(url)?.optJSONObject("data")?.optStringFix("country")
                .let { if (it.isNullOrEmpty()) null else it }
        }) {
            "中国" -> Area.CN
            "香港", "澳门" -> Area.HK
            "台湾" -> Area.TW
            else -> Area.GLOBAL
        }.also { LogHelper.debug { "当前地区: $it" } }
    }
}

val country: Area?
    get() = try {
        countryTask.get(5L, TimeUnit.SECONDS)
    } catch (_: Throwable) {
        null
    }

@Suppress("DEPRECATION")
val versionCode by lazy {
    Utils.getContext().packageManager.getPackageInfo(Utils.getContext().packageName, 0).versionCode
}

inline fun <T, R> T.runCatchingOrNull(block: T.() -> R?) = try {
    block()
} catch (e: Throwable) {
    null
}

fun Preference.onClick(onClick: (Preference) -> Boolean) {
    val clickListenerField = Reflex.findFieldIfExists(Preference::class.java, "mOnClickListener")
        ?: return
    val proxy = Proxy.newProxyInstance(
        javaClass.classLoader,
        arrayOf(clickListenerField.type)
    ) { _, _, args ->
        val preference = args[0] as Preference
        onClick(preference)
    }
    clickListenerField.set(this, proxy)
}

fun signQuery(query: String?, extraMap: Map<String, String> = emptyMap()): String? {
    query ?: return null
    val queryMap = query.split('&')
        .map { it.split('=', limit = 2) }
        .filter { it.size == 2 }
        .associate { Pair(it[0], it[1]) }
    return signQuery(queryMap, extraMap)
}

fun signQuery(query: Map<String, String>, extraMap: Map<String, String> = emptyMap()): String {
    val queryMap = TreeMap<String, String>()
    queryMap.putAll(query)
    queryMap["appkey"] = Utils.getAppKey()
    queryMap["build"] = versionCode.toString()
    queryMap["device"] = "android"
    queryMap["mobi_app"] = Utils.getMobiApp()
    queryMap["platform"] = "android"
    queryMap.putAll(extraMap)
    queryMap.remove("ts")
    queryMap.remove("sign")
    return Utils.signQuery(queryMap)
}

val logFile by lazy { File(Utils.getContext().externalCacheDir, "log.txt") }

val oldLogFile by lazy { File(Utils.getContext().externalCacheDir, "old_log.txt") }

fun checkErrorToast(json: JSONObject, isCustomServer: Boolean = false) {
    if (json.optInt("code", 0) != 0) {
        Toasts.showShort(
            (if (isCustomServer) "请求解析服务器发生错误: " else "请求发生错误: ")
                    + json.optString("message", "未知错误")
        )
    }
}

val cachePrefs: SharedPreferences by lazy {
    Utils.getContext().getSharedPreferences("biliroaming_cache", Context.MODE_PRIVATE)
}
