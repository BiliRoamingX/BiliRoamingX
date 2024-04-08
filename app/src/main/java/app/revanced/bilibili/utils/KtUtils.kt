@file:JvmName("KtUtils")
@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

import android.annotation.SuppressLint
import android.content.*
import android.content.pm.PackageManager
import android.graphics.Color
import android.net.ConnectivityManager
import android.os.*
import android.util.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.annotation.Keep
import androidx.annotation.WorkerThread
import androidx.preference.Preference
import androidx.preference.PreferenceManager
import app.revanced.bilibili.meta.Client
import app.revanced.bilibili.meta.CookieInfo
import app.revanced.bilibili.meta.VideoHistory
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.metadata.Metadata
import com.bapis.bilibili.metadata.device.Device
import com.bilibili.lib.moss.api.BusinessException
import com.google.protobuf.GeneratedMessageLite
import com.google.protobuf.GeneratedMessageLiteEx
import com.google.protobuf.UnknownFieldSetLite
import org.json.JSONObject
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter
import java.lang.reflect.Field
import java.lang.reflect.Proxy
import java.net.URL
import java.net.URLDecoder
import java.util.TreeMap
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit
import kotlin.Boolean
import kotlin.Pair
import kotlin.math.roundToInt

@get:JvmName("sp2px")
val Int.sp: Int
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_SP,
        toFloat(),
        Utils.getContext().resources.displayMetrics
    ).roundToInt()

@get:JvmName("dp2px")
val Int.dp: Int
    get() {
        val context = ApplicationDelegate.getTopActivity()
            ?: Utils.getContext()
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            toFloat(),
            context.resources.displayMetrics
        ).roundToInt()
    }

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

inline fun <T : View> View.findView(idName: String): T =
    findViewById(Utils.getResId(idName, "id"))

@JvmOverloads
inline fun Int.toHexColor(alpha: Boolean = true) = if (alpha)
    "%08X".format(0xFFFFFFFF.toInt() and this)
else "%06X".format(0xFFFFFF and this)

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

fun fetchJson(url: String) = try {
    JSONObject(URL(url).readText())
} catch (_: Throwable) {
    null
}

@JvmInline
value class Area private constructor(val value: String) {

    override fun toString() = value

    companion object {
        val cn = Area("cn")
        val hk = Area("hk")
        val tw = Area("tw")
        val th = Area("th")
        val global = Area("global")

        @JvmStatic
        fun of(value: String?) = when (value) {
            cn.value -> cn
            hk.value -> hk
            tw.value -> tw
            th.value -> th
            global.value -> global
            else -> null
        }
    }
}

val countryTask: Future<Area> by lazy {
    Utils.submitTask {
        when (fetchJson(Constants.ZONE_URL)?.optJSONObject("data")?.optInt("country_code") ?: 0) {
            86 -> Area.cn
            852, 853 -> Area.hk
            886 -> Area.tw
            else -> Area.global
        }.also { LogHelper.debug { "当前地区: $it" } }
    }
}

@get:WorkerThread
val country: Area?
    get() = try {
        countryTask.get(5L, TimeUnit.SECONDS)
    } catch (_: Throwable) {
        null
    }

@Suppress("DEPRECATION")
val versionName: String by lazy {
    Utils.getContext().packageManager.getPackageInfo(Utils.getContext().packageName, 0).versionName
}

@Suppress("DEPRECATION")
val versionCode by lazy {
    Utils.getContext().packageManager.getPackageInfo(Utils.getContext().packageName, 0).versionCode
}

inline fun <T, R> T.runCatchingOrNull(block: T.() -> R?) = try {
    block()
} catch (_: Throwable) {
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

fun Preference.onChange(onChange: (preference: Preference, newValue: Any?) -> Boolean) {
    val changeListenerField = Reflex.findFieldIfExists(Preference::class.java, "mOnChangeListener")
        ?: return
    val proxy = Proxy.newProxyInstance(
        javaClass.classLoader,
        arrayOf(changeListenerField.type)
    ) { _, _, args ->
        val preference = args[0] as Preference
        val newValue = args[1]
        onChange(preference, newValue)
    }
    changeListenerField.set(this, proxy)
}

private val onPreferenceTreeClickListenerField by lazy { retrieveOnPreferenceTreeClickListenerField() }

@Keep
private fun retrieveOnPreferenceTreeClickListenerField(): Field? {
    return PreferenceManager::class.java.declaredFields.find { f ->
        f.type.isInterface && f.type.declaredMethods.let {
            it.size == 1 && it[0].returnType == Boolean::class.javaPrimitiveType && it[0].parameterTypes.let { ts ->
                ts.size == 1 && ts[0] == Preference::class.java
            }
        }
    }.also { it?.isAccessible = true }
}

@Keep
fun PreferenceManager.onPreferenceTreeClick(action: ((Preference) -> Boolean)?) {
    val field = onPreferenceTreeClickListenerField ?: return
    if (action == null) {
        field.set(this, null)
        return
    }
    val proxy = Proxy.newProxyInstance(
        javaClass.classLoader,
        arrayOf(field.type)
    ) { _, _, args ->
        val preference = args[0] as Preference
        action(preference)
    }
    field.set(this, proxy)
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
    if (json.optInt("code", -1) != 0) {
        Toasts.showShort(
            (if (isCustomServer) "请求解析服务器发生错误: " else "请求发生错误: ")
                    + json.optString("message", "未知错误")
        )
    }
}

val cachePrefs: SharedPreferences by lazy {
    Utils.getContext().getSharedPreferences("biliroaming_cache", Context.MODE_PRIVATE)
}

val abPrefs by lazy {
    val abPath = "prod/blconfig/ab.sp"
    val file = File(Utils.getContext().getDir("foundation", Context.MODE_PRIVATE), abPath)
    Utils.blkvPrefsByFile(file, true)
}

val blkvPrefs by lazy {
    Utils.blkvPrefsByName("instance.bili_preference", true)
}

val accountPrefs by lazy {
    val accountDir = Utils.getContext().getDir("account", Context.MODE_PRIVATE)
    Utils.blkvPrefsByFile(File(accountDir, "controller.blkv"), true)
}

private val vhPrefs: SharedPreferences by lazy {
    Utils.getContext().getSharedPreferences(Constants.PREFS_VH, Context.MODE_PRIVATE)
}

fun getVideoHistory(sid: Int): VideoHistory {
    val sh = vhPrefs.getString(sid.toString(), "").orEmpty()
    val result = VideoHistory()
    if (sh.isNotEmpty()) sh.split(',').forEachIndexed { index, item ->
        if (index == 0) {
            result.lastEpId = item.toInt()
        } else {
            val (epId, progress) = item.split('|', limit = 2)
            result.histories.add(VideoHistory.Item(epId.toInt(), progress.toLong()))
        }
    }
    return result
}

fun saveVideoHistory(sid: Int, epId: Int, progress: Long) {
    val histories = getVideoHistory(sid).histories
    if (histories.isEmpty()) {
        histories.add(VideoHistory.Item(epId, progress))
    } else {
        histories.find { it.epId == epId }?.run {
            this.progress = progress
        } ?: histories.add(VideoHistory.Item(epId, progress))
    }
    histories.joinToString(separator = ",") {
        "${it.epId}|${it.progress}"
    }.let {
        vhPrefs.edit { putString(sid.toString(), "$epId,$it") }
    }
}

@JvmOverloads
fun setClipboardContent(label: String = "", content: CharSequence) {
    val clipboardManager = Utils.getContext().getSystemService(ClipboardManager::class.java)
    val clipData = ClipData.newPlainText(label, content)
    clipboardManager.setPrimaryClip(clipData)
}

fun newAny(typeUrl: String, message: GeneratedMessageLite<*, *>): com.google.protobuf.Any =
    com.google.protobuf.Any.newBuilder()
        .setTypeUrl(typeUrl)
        .setValue(message.toByteString())
        .build()

inline fun GeneratedMessageLite<*, *>.clearUnknownFields() {
    setUnknownFields(UnknownFieldSetLite.getDefaultInstance())
}

inline fun GeneratedMessageLite<*, *>.setUnknownFields(unknownFields: UnknownFieldSetLite) {
    GeneratedMessageLiteEx.setUnknownFields(this, unknownFields)
}

val cookieInfo get() = if (Utils.isLogin()) cookieInfoCache else null

val cookieSESSDATA get() = cookieInfo?.cookies?.find { it.name == "SESSDATA" }?.value.orEmpty()
val cookieBiliJct get() = cookieInfo?.cookies?.find { it.name == "bili_jct" }?.value.orEmpty()

private val cookieInfoCache by lazy {
    val cookieFile = File(Utils.getContext().filesDir, "bili.account.storage")
    val currentAccount = accountPrefs.getString("current_account", "").orEmpty()
    runCatching {
        val cookie = if (currentAccount.isNotEmpty()) {
            currentAccount.toJSONObject().optString("cookie")
        } else if (cookieFile.isFile) {
            cookieFile.bufferedReader().use { it.readText() }
        } else null
        if (cookie != null) {
            Base64.decode(cookie, Base64.NO_WRAP).toString(Charsets.UTF_8).toJSONObject()
                .optJSONArray("cookies")?.asSequence<JSONObject>().orEmpty()
                .map { CookieInfo.CookieBean(it.optString("name"), it.optString("value")) }
                .toList().let { CookieInfo(it) }
        } else null
    }.getOrNull()
}

val defaultUA = "Mozilla/5.0 BiliDroid/$versionName (bbcallen@gmail.com)"

val browserUA =
    "Mozilla/5.0 (Linux; Android ${Build.VERSION.RELEASE}; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36"

@JvmOverloads
@Suppress("DEPRECATION")
fun sigMd5(packageName: String = Utils.getContext().packageName): String {
    return Utils.getContext().packageManager
        .getPackageInfo(packageName, PackageManager.GET_SIGNATURES)
        .signatures.first().toByteArray().md5Hex
}

fun Long.cnCountFormat(invalid: String = "-"): String {
    if (this >= 100000000) {
        val count = toFloat() / 100000000
        val oneMod = count % 1
        if (oneMod < 0.95 && oneMod > 0.049)
            return "%.1f亿".format(count)
        return "%.0f亿".format(count)
    } else if (this >= 99999500) {
        return "1亿"
    } else if (this < 10000) {
        return if (this > 0) toString() else invalid
    } else {
        val count = toFloat() / 10000
        val oneMod = count % 1
        if (count > 1000)
            return "%d万".format(count.toInt())
        if (oneMod < 0.95 && oneMod > 0.049)
            return "%.1f万".format(count)
        return "%.0f万".format(count)
    }
}

fun Long.secondFormat(): String {
    val seconds = this % 60
    val minute = this / 60 % 60
    val hour = this / 60 / 60
    return if (hour > 0)
        "%d:%02d:%02d".format(hour, minute, seconds)
    else
        "%02d:%02d".format(minute, seconds)
}

fun decodeFormBody(body: String): Map<String, String> {
    if (body.isEmpty()) return mapOf()
    return body.split('&')
        .map { it.split('=', limit = 2) }
        .filter { it.size == 2 }
        .associate { (k, v) -> k to URLDecoder.decode(v, "UTF-8") }
}

@Suppress("DEPRECATION")
inline fun <reified T : Parcelable> Bundle.parcelable(key: String): T? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
        getParcelable(key, T::class.java)
    else getParcelable(key)
}

fun changeComponentState(
    component: Class<*>,
    enabled: Boolean,
    flags: Int = PackageManager.DONT_KILL_APP
) {
    val context = Utils.getContext()
    val componentName = ComponentName(context, component)
    val state = if (enabled) PackageManager.COMPONENT_ENABLED_STATE_ENABLED
    else PackageManager.COMPONENT_ENABLED_STATE_DISABLED
    context.packageManager.setComponentEnabledSetting(componentName, state, flags)
}

fun Throwable.fullStackTraceString(): String {
    val writer = StringWriter()
    val printer = PrintWriter(writer)
    print(printer)
    return writer.toString()
}

private fun Throwable.print(printer: PrintWriter) {
    printer.println(this)
    for (ste in stackTrace)
        printer.println("\tat $ste")
    val cause = cause
    if (cause != null) {
        printer.print("Caused by: ")
        cause.print(printer)
    }
}

@Suppress("DEPRECATION")
@SuppressLint("MissingPermission")
fun vibrate(milliseconds: Long) {
    val vibrator = Utils.getContext().getSystemService(Vibrator::class.java)
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val effect = VibrationEffect.createOneShot(milliseconds, VibrationEffect.DEFAULT_AMPLITUDE)
        vibrator.vibrate(effect)
    } else {
        vibrator.vibrate(milliseconds)
    }
}

@Suppress("DEPRECATION")
private fun Any?.jsonValue(): Any? {
    val value = this
    return if (value is Size) {
        mapOf("width" to value.width, "height" to value.height)
    } else if (value is SizeF) {
        mapOf("width" to value.width, "height" to value.height)
    } else if (value is Array<*> && value.isArrayOf<Parcelable>()) {
        value.map { it.jsonValue() }
    } else if (value is SparseArray<*>) {
        (0 until value.size()).associate {
            value.keyAt(it).toString() to value.valueAt(it).jsonValue()
        }
    } else if (value is Bundle) {
        value.keySet().associateWith { k -> value.get(k).jsonValue() }
    } else if (value is Parcelable) {
        value.toString()
    } else value
}

@Suppress("DEPRECATION")
fun Bundle.toJson(pretty: Boolean = false): String {
    return keySet().associateWith { key -> get(key).jsonValue() }.let {
        if (pretty) {
            JSONObject(it).toString(2)
        } else JSONObject(it).toString()
    }
}

inline fun BusinessException(
    code: Int,
    message: String?,
    cause: Throwable? = null,
    reason: String? = null,
    details: List<com.google.protobuf.Any>? = null
) = BusinessException(code, message, cause, reason, details)

@Suppress("DEPRECATION")
fun isWifiConnected(): Boolean {
    val manager = Utils.getContext().getSystemService(Context.CONNECTIVITY_SERVICE)
            as ConnectivityManager
    val networkInfo = manager.activeNetworkInfo ?: return false
    return networkInfo.isConnected && networkInfo.type == ConnectivityManager.TYPE_WIFI
}

@WorkerThread
fun speedupGhUrl(url: String): String {
    return if (country == Area.cn) "${Constants.GITHUB_SPEEDUP_URL}/$url" else url
}

val buvidPrefs by lazy {
    Utils.rawBlkvPrefsByFile(Utils.getContext().packageName + "_buvid", true)
}
val fpPrefs by lazy { Utils.rawBlkvPrefsByFile("fingerprint", true) }
val envPrefs: SharedPreferences by lazy {
    Utils.getContext().getSharedPreferences("environment_prefs", Context.MODE_PRIVATE)
}

fun grpcMetadataHeader(client: Client): String {
    val buvid = buvidPrefs.getString("buvid", "").orEmpty()
    val privacyAllowed = blkvPrefs.getBoolean("bili.privacy.allowed", false)
    val buvidFinal = if (privacyAllowed) buvid else ""
    return Metadata().apply {
        accessKey = Utils.getAccessKey()
        mobiApp = client.mobiApp
        device = ""
        build = client.verCode
        channel = "master"
        this.buvid = buvidFinal
        platform = "android"
    }.toByteArray().base64
}

fun grpcDeviceHeader(client: Client): String {
    val buvid = buvidPrefs.getString("buvid", "").orEmpty()
    val fpLocal = fpPrefs.getString("fp_local", "").orEmpty()
    val fpServer = fpPrefs.getString("fp_server", "").orEmpty()
    val fp = fpServer.ifEmpty { fpLocal }
    val privacyAllowed = blkvPrefs.getBoolean("bili.privacy.allowed", false)
    val buvidFinal = if (privacyAllowed) buvid else ""
    val firstRunTime = envPrefs.getLong("first_run_time", 0L)
    return Device().apply {
        appId = client.appId
        build = client.verCode
        this.buvid = buvidFinal
        mobiApp = client.mobiApp
        platform = "android"
        device = ""
        channel = "master"
        brand = Build.BRAND
        model = Build.MODEL
        osver = Build.VERSION.RELEASE
        this.fpLocal = fpLocal
        this.fpRemote = fpServer
        versionName = client.verName
        this.fp = fp
        fts = firstRunTime
    }.toByteArray().base64
}

val pinkMetadataHeader: String
    get() = grpcMetadataHeader(Client.PINK)

val pinkDeviceHeader: String
    get() = grpcDeviceHeader(Client.PINK)

val isChinaEnv: Boolean
    get() = Utils.getContext().resources.configuration.locales[0].let {
        it.language == "zh" && (it.country == "CN" || it.script == "Hans")
    }

fun getServerByArea(area: Area): String {
    return when (area) {
        Area.cn -> Settings.CN_SERVER.string
        Area.hk -> Settings.HK_SERVER.string
        Area.tw -> Settings.TW_SERVER.string
        Area.th -> Settings.TH_SERVER.string
        else -> ""
    }
}

fun getExtraSearchByType(type: String): Boolean {
    if (type.isEmpty())
        return false
    if ("bangumi" == type)
        return Settings.SEARCH_BANGUMI.boolean
    if ("movie" == type)
        return Settings.SEARCH_MOVIE.boolean
    return false
}
