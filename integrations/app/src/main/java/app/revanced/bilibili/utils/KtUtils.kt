@file:JvmName("KtUtils")
@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.*
import android.content.pm.PackageManager
import android.graphics.Color
import android.media.MediaScannerConnection
import android.net.ConnectivityManager
import android.net.Uri
import android.os.*
import android.util.Size
import android.util.SizeF
import android.util.SparseArray
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.View.MeasureSpec
import android.view.ViewGroup
import android.view.WindowManager
import androidx.annotation.ColorInt
import androidx.annotation.WorkerThread
import androidx.fragment.app.Fragment
import androidx.preference.Preference
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.meta.Client
import app.revanced.bilibili.meta.VideoHistory
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.settings.ModulePreferenceManager
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.metadata.Metadata
import com.bapis.bilibili.metadata.device.Device
import com.bilibili.lib.moss.api.BusinessException
import com.google.protobuf.*
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import org.json.JSONObject
import java.io.*
import java.lang.reflect.Proxy
import java.net.URL
import java.net.URLDecoder
import java.util.TreeMap
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import kotlin.Any
import kotlin.Boolean
import kotlin.math.roundToInt
import com.google.protobuf.Any as ProtoBufAny

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

@JvmOverloads
inline fun Context.inflateLayout(
    resIdName: String,
    root: ViewGroup? = null,
    attachToRoot: Boolean = root != null
): View {
    val resource = Utils.getResId(resIdName, "layout")
    return LayoutInflater.from(this).inflate(resource, root, attachToRoot)
}

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
        }.also { Logger.debug { "当前地区: $it" } }
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

private val onPreferenceTreeClickListenerField by lazy {
    ModulePreferenceManager::class.java.superclass.declaredFields.find { f ->
        f.type.isInterface && f.type.declaredMethods.let {
            it.size == 1 && it[0].returnType == Boolean::class.javaPrimitiveType && it[0].parameterTypes.let { ts ->
                ts.size == 1 && ts[0] == Preference::class.java
            }
        }
    }.also { it?.isAccessible = true }
}

fun ModulePreferenceManager.onPreferenceTreeClick(action: ((Preference) -> Boolean)?) {
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

val zippedLogFile by lazy {
    val context = Utils.getContext()
    val appName = context.applicationInfo.labelRes.let { context.getString(it) }
    File(context.cacheDir, "boxing/log_$appName.zip")
}

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
    val clipboardManager = systemService<ClipboardManager>()
    val clipData = ClipData.newPlainText(label, content)
    clipboardManager.setPrimaryClip(clipData)
}

fun newAny(typeUrl: String, message: MessageLite): ProtoBufAny =
    ProtoBufAny.newBuilder()
        .setTypeUrl(typeUrl)
        .setValue(message.toByteString())
        .build()

inline fun GeneratedMessageLite<*, *>.clearUnknownFields() {
    setUnknownFields(UnknownFieldSetLite.getDefaultInstance())
}

inline fun GeneratedMessageLite<*, *>.setUnknownFields(unknownFields: UnknownFieldSetLite) {
    GeneratedMessageLiteEx.setUnknownFields(this, unknownFields)
}

inline fun SparseArray<Any>.toUnknownFields(original: UnknownFieldSetLite? = null): UnknownFieldSetLite {
    return GeneratedMessageLiteEx.newUnknownFields(original, this)
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
    val vibrator = systemService<Vibrator>()
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
    details: List<ProtoBufAny>? = null
) = BusinessException(code, message, cause, reason, details)

@Suppress("DEPRECATION")
fun isWifiConnected(): Boolean {
    val manager = systemService<ConnectivityManager>()
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
        accessKey = Accounts.accessKey
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

inline fun <reified T> systemService(): T {
    return Utils.getContext().getSystemService(T::class.java)
}

fun <T : Dialog> T.constraintSize(
    maxHeight: Int = (context.resources.displayMetrics.heightPixels * 0.8f).toInt()
) = apply {
    create()
    val decorView = window?.decorView ?: return@apply
    val dm = context.resources.displayMetrics
    val width = (dm.widthPixels * 0.9f).toInt()
    if (maxHeight > 0) {
        decorView.measure(
            MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
            MeasureSpec.UNSPECIFIED
        )
        val height = decorView.measuredHeight
        window?.setLayout(width, height.coerceAtMost(maxHeight))
    } else {
        window?.setLayout(width, WindowManager.LayoutParams.WRAP_CONTENT)
    }
}

inline fun <T : Dialog> T.onShow(crossinline listener: T.() -> Unit) = apply {
    setOnShowListener { listener() }
}

inline fun <T : Dialog> T.onDismiss(crossinline listener: T.() -> Unit) = apply {
    setOnDismissListener { listener() }
}

private fun biliAes(bytes: ByteArray, decrypt: Boolean): ByteArray {
    val appKey = Utils.getAppKey()
    val key = appKey.toByteArray().copyOf(16)
    val keySpec = SecretKeySpec(key, "AES")
    val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
    val mode = if (decrypt) Cipher.DECRYPT_MODE else Cipher.ENCRYPT_MODE
    cipher.init(mode, keySpec, Utils.getAesIv(appKey))
    return cipher.doFinal(bytes)
}

fun biliAesDecrypt(bytes: ByteArray) = biliAes(bytes, true)
fun biliAesEncrypt(bytes: ByteArray) = biliAes(bytes, false)

inline fun <reified T : Serializable> Intent.serializableExtra(name: String): T? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        getSerializableExtra(name, T::class.java)
    } else {
        @Suppress("DEPRECATION")
        getSerializableExtra(name) as? T
    }
}

@SuppressLint("UnspecifiedRegisterReceiverFlag", "InlinedApi")
fun Context.registerReceiverCompat(
    receiver: BroadcastReceiver,
    intentFilter: IntentFilter,
    flags: Int = Context.RECEIVER_NOT_EXPORTED
) = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
    registerReceiver(receiver, intentFilter, flags)
} else {
    registerReceiver(receiver, intentFilter)
}

fun saveImage(url: String) {
    fun save(url: String) = runCatching {
        URL(url).openStream().use { input ->
            val picDir =
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
            val filename = url.substringAfterLast('/')
            val saveDir = File(picDir, "bili").also { it.mkdirs() }
            val imageFile = File(saveDir, filename)
            imageFile.outputStream().use { input.copyTo(it) }
            MediaScannerConnection.scanFile(
                Utils.getContext(), arrayOf(imageFile.absolutePath), null, null
            )
            Toasts.showLongWithId("biliroaming_toast_image_save_success", imageFile.path)
        }
    }.onFailure {
        Logger.error(it) { "image save failed, url: $url" }
        Toasts.showShortWithId("biliroaming_toast_image_save_failed")
    }
    if (Build.VERSION.SDK_INT > Build.VERSION_CODES.Q) {
        Utils.async { save(url) }
    } else {
        val activity = ApplicationDelegate.requireTopActivity()
        activity.requestPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) { granted, shouldExplain ->
            if (granted) {
                Utils.async { save(url) }
            } else if (shouldExplain) {
                Toasts.showShortWithId("biliroaming_write_storage_failed")
            }
        }
    }
}

inline fun <reified T : MessageLite> getDeviceSetting(): T? {
    val context = Utils.getContext()
    val callUri = "content://${context.packageName}.device.settings.DeviceSettingProvider/call"
    val cr = context.contentResolver
    val typeClass = T::class.java
    val typeUrl = MessageLiteToStringEx.typeMap.entries.find {
        it.value == typeClass
    }?.key ?: return null
    val callResult = cr.call(Uri.parse(callUri), "method_call_get_setting", typeUrl, null)
    val bytes = callResult?.getByteArray(typeUrl) ?: return null
    return bytes.runCatchingOrNull {
        val any = ProtoBufAny.parseFrom(this)
        Reflex.callStaticMethod(typeClass, "parseFrom", any.value) as? T
    }
}

fun setDeviceSetting(message: MessageLite): Boolean {
    val context = Utils.getContext()
    val callUri = "content://${context.packageName}.device.settings.DeviceSettingProvider/call"
    val cr = context.contentResolver
    val typeClass = message.javaClass
    val typeUrl = MessageLiteToStringEx.typeMap.entries.find {
        it.value == typeClass
    }?.key ?: return false
    val any = newAny(typeUrl, message)
    val extras = Bundle().apply { putByteArray(typeUrl, any.toByteArray()) }
    return cr.runCatchingOrNull {
        call(Uri.parse(callUri), "method_call_set_setting", typeUrl, extras); true
    } ?: false
}

val Fragment.hostActivity inline get() = context as Activity
val Fragment.hostContext inline get() = context!!

inline fun <T> unsafeLazy(noinline initializer: () -> T) =
    lazy(LazyThreadSafetyMode.NONE, initializer)

val jsonFormat = Json {
    ignoreUnknownKeys = true
    coerceInputValues = true
}

inline fun <reified T> String.fromJson(json: Json = jsonFormat) =
    json.decodeFromString<T>(this)

@OptIn(ExperimentalSerializationApi::class)
inline fun <reified T> InputStream.fromJson(json: Json = jsonFormat) =
    json.decodeFromStream<T>(this)

inline fun <reified T> T.toJson(json: Json = jsonFormat) =
    json.encodeToString(this)
