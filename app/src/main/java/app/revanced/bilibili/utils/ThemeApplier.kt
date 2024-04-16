package app.revanced.bilibili.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.settings.Settings
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.net.URL
import java.util.zip.ZipInputStream

object ThemeApplier {
    private const val PURE_GARB_TEMPLATE =
        """{"animateLoop":false,"bottomIconsEmpty":true,"btnBgEndColor":0,"btnBgStartColor":0,"btnIconColor":0,"btnIconPath":"","btnIconSelectedPath":"","changeable":true,"colorName":"%s","darkMode":true,"fontColor":0,"force":false,"hasAnimate":false,"headBgPath":"","headMineBgAnimatorPath":"","headMineBgPath":"","headMineSquaredBgPath":"","headTabBgPath":"","id":%d,"loadAllFile":false,"mainDarkMode":true,"mainFontColor":0,"mineAnimateLoop":false,"name":"","op":false,"primaryOnly":false,"secondaryPageColor":0,"sideBgColor":0,"sideBgPath":"","sideBottomBgPath":"","sideLineColor":0,"tailBgPath":"","tailColor":0,"tailColorModel":false,"tailIconColor":0,"tailIconColorNight":0,"tailIconColorSelected":0,"tailIconColorSelectedNight":0,"tailIconPath":[],"tailIconSelectedPath":[],"tailSelectedColor":0,"ver":0}"""

    private val garbChangeAction: String
        get() = "${Utils.getContext().packageName}.garb.GARB_CHANGE"

    private val loadEquipChangeAction: String
        get() = "${Utils.getContext().packageName}.garb.LOAD_EQUIP_CHANGE"

    private val garbDir: File
        get() = File(Utils.getContext().filesDir, "garb/${Accounts.mid}")

    val garbConf: File
        get() = File(garbDir, "garb.conf")

    val lastGarbConf: File
        get() = File(garbDir, "last.garb.conf")

    fun customThemeId() = Settings.SKIN_JSON.string.runCatchingOrNull {
        val json = toJSONObject()
        if (json.has("user_equip")) {
            json.getJSONObject("user_equip").optLong("id", -1L)
        } else {
            json.optLong("id", -1L)
        }
    } ?: -1L

    fun applyCustomTheme(activity: Context? = null): Boolean {
        val (userEquip, loadEquip) = Settings.SKIN_JSON.string.runCatchingOrNull {
            val json = toJSONObject()
            if (json.has("user_equip")) {
                json.getJSONObject("user_equip") to json.optJSONObject("load_equip")
            } else json to null
        } ?: return false
        applyThemeInner(userEquip, loadEquip, activity)
        return true
    }

    fun applyTheme(
        skin: JSONObject,
        skinProps: JSONObject,
        loading: JSONObject?
    ): JSONObject {
        val theme = convertToTheme(skin, skinProps, loading)
        val userEquip = theme.getJSONObject("user_equip")
        val loadEquip = theme.optJSONObject("load_equip")
        applyThemeInner(userEquip, loadEquip, null)
        return theme
    }

    private fun applyThemeInner(
        userEquip: JSONObject,
        loadEquip: JSONObject?,
        activity: Context?,
    ) {
        Toasts.showShort("主题下载中")
        val skinId = userEquip.optLong("id")
        val skinVer = userEquip.optLong("ver")
        val skinPkgUrl = userEquip.optString("package_url")
        val context = Utils.getContext()
        val garbDir = this.garbDir
        val assetsDir = File(garbDir, "$skinId/$skinVer").also { it.mkdirs() }
        val skinPkgFile = File(garbDir, "$skinId/$skinId")
        downloadToFile(skinPkgUrl, skinPkgFile)
        unzipToDir(skinPkgFile, assetsDir)
        val garb = convertToGarb(userEquip, assetsDir).toString()
        garbConf.writeText(garb)
        if (loadEquip != null) {
            val loadEquipDir = File(garbDir, "load_equip").also { it.mkdirs() }
            val url = loadEquip.optString("loading_url")
            val filename = url.toByteArray().base64
            downloadToFile(url, File(loadEquipDir, filename))
            blkvPrefs.edit {
                putString("garb_load_equip_conf", loadEquip.toString())
            }
        } else {
            blkvPrefs.edit { remove("garb_load_equip_conf") }
        }
        context.sendBroadcast(Intent(loadEquipChangeAction))
        if (Utils.isWebProcess()) {
            blkvPrefs.edit {
                putBoolean("pref_key_garb_has_changed", true)
                putString("pref_key_target_garb_theme_id", skinId.toString())
                putString("pref_key_target_garb_changeable", "true")
                putString("pref_key_target_garb_type", "asset")
            }
            Toasts.showLong("主题设置成功，回到首页生效！")
        } else {
            lastGarbConf.delete()
            notifyGarbChanged(garb)
            Toasts.showShort("主题设置成功！")
            Utils.runOnMainThread(300L) {
                if (activity is Activity)
                    activity.recreate()
            }
        }
    }

    fun unloadTheme(activity: Context? = null) {
        val context = Utils.getContext()
        val (name, id) = "white" to 8
        val garb = PURE_GARB_TEMPLATE.format(name, id)
        garbConf.writeText(garb)
        if (Utils.isWebProcess()) {
            blkvPrefs.edit {
                putBoolean("pref_key_garb_has_changed", true)
                putString("pref_key_target_garb_theme_id", name)
                putString("pref_key_target_garb_changeable", "true")
                putString("pref_key_target_garb_type", "color")
            }
        } else {
            lastGarbConf.delete()
            notifyGarbChanged(garb)
            Utils.runOnMainThread(300L) {
                if (activity is Activity)
                    activity.recreate()
            }
        }
        blkvPrefs.edit { remove("garb_load_equip_conf") }
        context.sendBroadcast(Intent(loadEquipChangeAction))
    }

    private fun notifyGarbChanged(garb: String) {
        val context = Utils.getContext()
        Intent(garbChangeAction).apply {
            putExtra("key_broadcast_data_type", 1)
            putExtra("key_garb_data", garb)
            putExtra("key_theme_change_sync_garb", false)
            putExtra("key_theme_change_should_report", true)
            putExtra("key_theme_change_sync_from_main_process", false)
        }.let { context.sendBroadcast(it) }
    }

    private fun downloadToFile(url: String, file: File) {
        URL(url).openStream().use { input ->
            file.outputStream().use { output ->
                input.copyTo(output)
            }
        }
    }

    private fun unzipToDir(zipFile: File, dir: File) {
        ZipInputStream(zipFile.inputStream()).use {
            var entry = it.nextEntry
            while (entry != null) {
                if (!entry.isDirectory) {
                    File(dir, entry.name).outputStream().use { output ->
                        it.buffered().copyTo(output)
                    }
                }
                entry = it.nextEntry
            }
        }
    }

    private fun convertToGarb(skin: JSONObject, assetsDir: File): JSONObject {
        val assetsPaths = assetsDir.listFiles()?.associate { file ->
            file.nameWithoutExtension to "file://${file.absolutePath}"
        }.orEmpty()
        val garb = JSONObject()
        garb.put("id", skin.optLong("id"))
        garb.put("name", skin.optString("name"))
        garb.put("ver", skin.optLong("ver"))
        garb.put("loadAllFile", true)
        val data = skin.optJSONObject("data")
        if (data != null) {
            garb.put("fontColor", data.optString("color").toIntColor(0))
            garb.put("secondaryPageColor", data.optString("color_second_page").toIntColor(0))
            garb.put("darkMode", data.optString("color_mode") == "light")
            garb.put("mainFontColor", data.optString("color").toIntColor(0))
            garb.put("mainDarkMode", data.optString("color_mode") == "light")
            garb.put("sideBgColor", data.optString("side_bg_color").toIntColor(0))
            garb.put("sideLineColor", data.optString("side_line_color").toIntColor(0))
            garb.put("tailColor", data.optString("tail_color").toIntColor(0))
            garb.put("tailSelectedColor", data.optString("tail_color_selected").toIntColor(0))
            garb.put("btnBgStartColor", data.optString("pub_btn_shade_color_top").toIntColor(0))
            garb.put("btnBgEndColor", data.optString("pub_btn_shade_color_bottom").toIntColor(0))
            garb.put("btnIconColor", data.optString("pub_btn_plus_color").toIntColor(0))
            garb.put("hasAnimate", data.optBoolean("tail_icon_ani"))
            garb.put("animateLoop", data.optString("tail_icon_ani_mode") == "cycle")
            garb.put("mineAnimateLoop", data.optString("head_myself_mp4_play") == "loop")
            garb.put("tailColorModel", data.optString("tail_icon_mode") == "color")
            garb.put("tailIconColor", data.optString("tail_icon_color").toIntColor(0))
            garb.put("tailIconColorNight", data.optString("tail_icon_color_dark").toIntColor(0))
            garb.put(
                "tailIconColorSelected", data.optString("tail_icon_color_selected").toIntColor(0)
            )
            garb.put(
                "tailIconColorSelectedNight",
                data.optString("tail_icon_color_selected_dark").toIntColor(0)
            )
        }
        garb.put("headBgPath", assetsPaths["head_bg"].orEmpty())
        garb.put("headTabBgPath", assetsPaths["head_tab_bg"].orEmpty())
        garb.put("sideBgPath", assetsPaths["side_bg"].orEmpty())
        garb.put("sideBottomBgPath", assetsPaths["side_bg_bottom"].orEmpty())
        garb.put("tailBgPath", assetsPaths["tail_bg"].orEmpty())
        garb.put("headMineBgPath", assetsPaths["head_myself_bg"].orEmpty())
        garb.put("headMineSquaredBgPath", assetsPaths["head_myself_squared_bg"].orEmpty())
        garb.put("headMineBgAnimatorPath", assetsPaths["head_myself_mp4_bg"].orEmpty())
        garb.put("btnIconPath", assetsPaths["tail_icon_pub_btn_bg"].orEmpty())
        garb.put(
            "btnIconSelectedPath",
            assetsPaths["tail_icon_selected_pub_btn_bg"].orEmpty()
        )
        garb.put("tailIconPath", JSONArray().apply {
            put(assetsPaths["tail_icon_main"].orEmpty())
            put(assetsPaths["tail_icon_channel"].orEmpty())
            put(assetsPaths["tail_icon_dynamic"].orEmpty())
            put(assetsPaths["tail_icon_shop"].orEmpty())
            put(assetsPaths["tail_icon_myself"].orEmpty())
        })
        garb.put("tailIconSelectedPath", JSONArray().apply {
            put(assetsPaths["tail_icon_selected_main"].orEmpty())
            put(assetsPaths["tail_icon_selected_channel"].orEmpty())
            put(assetsPaths["tail_icon_selected_dynamic"].orEmpty())
            put(assetsPaths["tail_icon_selected_shop"].orEmpty())
            put(assetsPaths["tail_icon_selected_myself"].orEmpty())
        })
        garb.put("force", false)
        garb.put("changeable", true)
        garb.put("primaryOnly", false)
        garb.put("op", false)
        return garb
    }

    private fun convertToTheme(
        skin: JSONObject,
        skinProps: JSONObject,
        loading: JSONObject?
    ): JSONObject {
        val themeJson = JSONObject()
        val skinJson = JSONObject().apply {
            put("id", skin.optLong("item_id"))
            put("name", skin.optString("name"))
            put("preview", skinProps.optString("image_preview"))
            put("ver", skinProps.optLong("ver"))
            put("package_url", skinProps.optString("package_url"))
            //put("package_md5", props.optString("package_md5"))
            put("data", JSONObject().apply {
                put("color_mode", skinProps.optString("color_mode"))
                put("color", skinProps.optString("color"))
                put("color_second_page", skinProps.optString("color_second_page"))
                put("side_bg_color", skinProps.optString("side_bg_color"))
                put("tail_color", skinProps.optString("tail_color"))
                put("tail_color_selected", skinProps.optString("tail_color_selected"))
                put("tail_icon_ani", skinProps.optBoolean("tail_icon_ani"))
                put("tail_icon_ani_mode", skinProps.optString("tail_icon_ani_mode"))
                put("head_myself_mp4_play", skinProps.optString("head_myself_mp4_play"))
                put("tail_icon_mode", skinProps.optString("tail_icon_mode"))
            })
        }
        val loadingJson = loading?.let {
            it.optJSONObject("properties")?.let { loadingProps ->
                JSONObject().apply {
                    put("id", it.optLong("item_id"))
                    put("name", it.optString("name"))
                    put("loading_url", loadingProps.optString("loading_url"))
                    put("ver", loadingProps.optLong("ver"))
                }
            }
        }
        themeJson.put("user_equip", skinJson)
        loadingJson?.let {
            themeJson.put("load_equip", it)
        }
        return themeJson
    }
}
