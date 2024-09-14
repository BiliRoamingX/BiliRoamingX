package app.revanced.bilibili.utils

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.net.Uri
import androidx.documentfile.provider.DocumentFile
import app.revanced.bilibili.patches.SplashPatch
import app.revanced.bilibili.settings.*
import com.android.internal.util.XmlUtils
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.io.InputStream
import java.io.OutputStream
import java.util.Date
import java.util.zip.ZipEntry
import java.util.zip.ZipFile
import java.util.zip.ZipOutputStream

object BackupHelper {
    private const val DESCRIPTOR_ID_INTERNAL = "internal"
    private const val DESCRIPTOR_ID_EXTERNAL = "external"
    private const val TYPE_PREFS = "prefs"
    private const val TYPE_FILE = "file"
    private const val TYPE_BLKV = "blkv"

    private val internalDir: File
        get() = Utils.getContext().dataDir
    private val externalDir: File
        get() = Utils.getContext().getExternalFilesDir(null)?.parentFile!!
    private val tempFile: File
        get() = File(Utils.getContext().getExternalFilesDir(null), "biliroaming_backup.tmp")

    private val Any?.typeDescriptor: String
        get() = when (this) {
            is Boolean -> "Z"
            is Int -> "I"
            is Long -> "J"
            is Float -> "F"
            is String -> "LS"
            is Set<*> -> "LSS"
            else -> ""
        }

    fun backup(output: OutputStream) {
        val zipOut = ZipOutputStream(output)
        zipOut.setLevel(5)
        val metaInfo = JSONObject()
        metaInfo.put("version", 2)
        metaInfo.put("time", System.currentTimeMillis())
        val items = JSONArray()
        metaInfo.put("items", items)

        fun JSONArray.mergeFrom(prefs: SharedPreferences) = prefs.all.forEach { (k, v) ->
            put(JSONObject().apply {
                put("k", k)
                put("v", if (v is Set<*>) JSONArray(v) else v)
                put("t", v.typeDescriptor)
            })
        }

        val settings = JSONArray().apply { mergeFrom(Setting.prefs) }
        metaInfo.put("settings", settings)
        val videoHistory = JSONArray().apply { mergeFrom(vhPrefs) }
        metaInfo.put("video_history", videoHistory)

        @Suppress("UNUSED_VARIABLE")
        val backupPrefsIfExist = { name: String, blkv: Boolean ->
            val prefsFile = prefsPath(name, blkv)
            if (prefsFile.isFile) {
                val type = if (blkv) TYPE_BLKV else TYPE_PREFS
                val ext = if (blkv) "blkv" else "xml"
                val prefsItem = JSONObject().apply {
                    put("type", type)
                    put("name", name)
                }
                items.put(prefsItem)
                zipOut.putNextEntry(ZipEntry("$type/$name.$ext"))
                prefsFile.inputStream().use { it.copyTo(zipOut) }
            }
        }
        val backupFileIfExist = { file: File ->
            if (file.isFile) {
                val fileItem = JSONObject().apply {
                    put("type", TYPE_FILE)
                    put("location", file.name)
                    put("restore_path", file.toPathDescriptor())
                }
                items.put(fileItem)
                zipOut.putNextEntry(ZipEntry("$TYPE_FILE/${file.name}"))
                file.inputStream().use { it.copyTo(zipOut) }
            }
        }

        backupFileIfExist(SubtitleParamsCache.FONT_FILE)
        backupFileIfExist(File(Utils.getContext().filesDir, SplashPatch.SPLASH_IMAGE))
        backupFileIfExist(File(Utils.getContext().filesDir, SplashPatch.LOGO_IMAGE))

        zipOut.putNextEntry(ZipEntry("backup.json"))
        zipOut.write(metaInfo.toString(2).toByteArray())
        zipOut.finish()
    }

    @Suppress("UNCHECKED_CAST")
    private fun SharedPreferences.Editor.mergePrefsItem(key: String, value: Any?, isSetting: Boolean = true) {
        val setting = if (isSetting) Setting.all.find { it.key == key } else null
        if (value is Boolean && (!isSetting || setting is BooleanSetting)) {
            putBoolean(key, value)
        } else if (value is Int && (!isSetting || setting is IntSetting)) {
            putInt(key, value)
        } else if (value is Long && (!isSetting || setting is LongSetting)) {
            putLong(key, value)
        } else if (value is Float && (!isSetting || setting is FloatSetting)) {
            putFloat(key, value)
        } else if (value is String && (!isSetting || setting is StringSetting)) {
            putString(key, value)
        } else if (value is Set<*> && (!isSetting || setting is StringSetSetting)) {
            putStringSet(key, value as Set<String>)
        } else if (value != null) {
            Logger.warn { "Invalid prefs item ignored, key: $key, value: $value" }
        }
    }

    private fun SharedPreferences.Editor.mergeJsonItem(key: String, value: Any?, type: String) {
        if (value is Boolean && type == "Z") {
            putBoolean(key, value)
        } else if (value is Number && type == "I") {
            putInt(key, value.toInt())
        } else if (value is Number && type == "J") {
            putLong(key, value.toLong())
        } else if (value is Number && type == "F") {
            putFloat(key, value.toFloat())
        } else if (value is String && type == "LS") {
            putString(key, value)
        } else if (value is JSONArray && type == "LSS") {
            putStringSet(key, value.asSequence<String>().toSet())
        } else if (value != null) {
            Logger.warn { "Invalid json item ignored, key: $key, value: $value, type: $type" }
        }
    }

    @SuppressLint("ApplySharedPref")
    fun restore(input: InputStream, uri: Uri) {
        val backupType = (DocumentFile.fromSingleUri(Utils.getContext(), uri)?.name
            ?: uri.toString()).substringAfterLast('.').lowercase()
        if (backupType == "xml") {
            val map = XmlUtils.readMapXml(input)
            Setting.prefs.edit(commit = true) {
                map.forEach { (k, v) -> mergePrefsItem(k, v) }
            }
            return
        }
        val tempFile = tempFile.apply { delete() }
        tempFile.outputStream().use { input.copyTo(it) }
        val zipFile = ZipFile(tempFile)
        fun ZipFile.entry(name: String) = run { getInputStream(getEntry(name)) }
        val metaInfo = zipFile.entry("backup.json")
            .use { it.readBytes() }.toString(Charsets.UTF_8).toJSONObject()
        val version = metaInfo.optInt("version")
        Logger.debug { "backup version: $version" }

        val time = metaInfo.optLong("time")
        Logger.debug { "backup time: ${Date(time).format()}" }

        val items = metaInfo.optJSONArray("items")
        Logger.debug { "backup items: ${items?.toString(2)}" }

        val settingPrefs = Setting.prefs.edit()
        val vhPrefs = vhPrefs.edit()

        fun JSONArray.exportTo(prefs: SharedPreferences.Editor) {
            prefs.clear()
            forEach {
                val key = it.optString("k")
                val value = it.opt("v")
                val type = it.optString("t")
                prefs.mergeJsonItem(key, value, type)
            }
        }

        metaInfo.optJSONArray("settings")?.exportTo(settingPrefs)
        metaInfo.optJSONArray("video_history")?.exportTo(vhPrefs)

        items?.forEach { item ->
            when (val type = item.optString("type")) {
                TYPE_PREFS, TYPE_BLKV -> {
                    val name = item.optString("name")
                    val blkv = type == TYPE_BLKV
                    val entryName = if (blkv) "$TYPE_BLKV/$name.blkv" else "$TYPE_PREFS/$name.xml"
                    @Suppress("CascadeIf")
                    if (name == Constants.PREFS_SETTING) {
                        zipFile.entry(entryName).use { input ->
                            XmlUtils.readMapXml(input).forEach { (k, v) ->
                                settingPrefs.mergePrefsItem(k, v)
                            }
                        }
                    } else if (name == Constants.PREFS_VH) {
                        zipFile.entry(entryName).use { input ->
                            XmlUtils.readMapXml(input).forEach { (k, v) ->
                                vhPrefs.mergePrefsItem(k, v, isSetting = false)
                            }
                        }
                    } else {
                        val prefsPath = prefsPath(name, blkv)
                        zipFile.entry(entryName).use { input ->
                            prefsPath.outputStream().use { output ->
                                input.copyTo(output)
                            }
                        }
                    }
                }

                TYPE_FILE -> {
                    val location = item.optString("location")
                    val restorePath = item.optString("restore_path")
                    zipFile.entry("$type/$location").use { input ->
                        restorePath.fromPathDescriptor().outputStream().use { output ->
                            input.copyTo(output)
                        }
                    }
                }

                else -> Logger.warn { "not supported backup item type: $type" }
            }
        }

        settingPrefs.commit()
        vhPrefs.commit()

        tempFile.delete()
    }

    private fun prefsPath(name: String, blkv: Boolean) = if (blkv) {
        File(Utils.getContext().getDir("blkv", Context.MODE_PRIVATE), "$name.blkv")
    } else {
        File(Utils.getContext().dataDir, "shared_prefs/$name.xml")
    }

    private fun File.toPathDescriptor(): String {
        val path = absolutePath

        val internalPath = internalDir.absolutePath
        if (path.startsWith(internalPath))
            return path.replace(internalPath, DESCRIPTOR_ID_INTERNAL)

        val externalPath = externalDir.absolutePath
        if (path.startsWith(externalPath))
            return path.replace(externalPath, DESCRIPTOR_ID_EXTERNAL)

        return path
    }

    private fun String.fromPathDescriptor(): File {
        if (startsWith(DESCRIPTOR_ID_INTERNAL))
            return File(replace(DESCRIPTOR_ID_INTERNAL, internalDir.absolutePath))

        if (startsWith(DESCRIPTOR_ID_EXTERNAL))
            return File(replace(DESCRIPTOR_ID_EXTERNAL, externalDir.absolutePath))

        return File(this)
    }
}
