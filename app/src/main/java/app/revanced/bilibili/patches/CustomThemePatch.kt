@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.patches

import android.graphics.Color
import android.util.SparseArray
import android.view.View
import androidx.annotation.ColorInt
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.settings.dialog.ColorChooseDialog
import app.revanced.bilibili.utils.blkvPrefs
import app.revanced.bilibili.widget.OnClickOriginListener
import com.bilibili.compose.theme.ThemeDayNight
import com.bilibili.lib.ui.garb.Garb
import tv.danmaku.bili.ui.theme.api.BiliSkin
import tv.danmaku.bili.ui.theme.api.BiliSkinList

@Suppress("UNUSED")
object CustomThemePatch {
    private const val CUSTOM_THEME_NAME1 = "custom1"
    private const val CUSTOM_THEME_NAME2 = "custom2"
    private const val CUSTOM_THEME_ID1 = 114514 // ん？
    private const val CUSTOM_THEME_ID2 = 1919810 // ん？

    init {
        Settings.registerPreferenceChangeListener { _, key ->
            if (key == Settings.CUSTOM_THEME.key) refresh()
        }
    }

    private val currentKey: Int
        inline get() = blkvPrefs.getInt("theme_entries_current_key", 0)

    private var customColor: Int
        inline get() = Settings.CUSTOM_COLOR.int
        inline set(value) = Settings.CUSTOM_COLOR.saveValue(value)

    @JvmStatic
    fun refresh() {
        getThemeNamesMap().run {
            this[CUSTOM_THEME_NAME1] = CUSTOM_THEME_ID1
            this[CUSTOM_THEME_NAME2] = CUSTOM_THEME_ID2
        }
        getColorArray().run {
            generateColorArray(customColor).let { colors ->
                put(CUSTOM_THEME_ID1, colors)
                put(CUSTOM_THEME_ID2, colors)
            }
        }
        getAllThemes().run {
            customColor.toTheme().let { theme ->
                put(CUSTOM_THEME_ID1.toLong(), theme)
                put(CUSTOM_THEME_ID2.toLong(), theme)
            }
        }
    }

    // codes will filled by patcher
    @JvmStatic
    fun getThemeNamesMap(): MutableMap<String, Int> {
        return mutableMapOf()
    }

    // codes will filled by patcher
    @JvmStatic
    fun getColorArray(): SparseArray<IntArray> {
        return SparseArray()
    }

    // codes will filled by patcher
    @JvmStatic
    fun getAllThemes(): MutableMap<Long, Any> {
        return mutableMapOf()
    }

    // codes will filled by patcher
    @JvmStatic
    fun newTheme(
        garb: Garb,
        currentDayNight: ThemeDayNight,
        primary: Long,      // !!important
        secondary: Long,    // !!important
        background: Long,   // !!important
        textTitle: Long,    // !!important
        textSubtitle: Long,
        textOther: Long,
        actionIcon: Long,   // !!important
        isPure: Boolean
    ) = Any()

    @JvmStatic
    fun onSetSkinList(skinList: BiliSkinList) {
        val biliSkins = skinList.mList
        if (Settings.CUSTOM_THEME.boolean) {
            val skin = BiliSkin().apply {
                mId = if (currentKey == CUSTOM_THEME_ID2) CUSTOM_THEME_ID2 else CUSTOM_THEME_ID1
                mName = "自选颜色"
                mIsFree = true
            }
            biliSkins.add(3, skin)
        }
    }

    @JvmStatic
    fun onThemeClick(listener: OnClickOriginListener, view: View): Boolean {
        if (view.resources.getResourceEntryName(view.id) != "list_item")
            return false
        val biliSkin = view.tag as? BiliSkin ?: return false
        val mId = biliSkin.mId
        // Make colors updated immediately
        if (mId == CUSTOM_THEME_ID1 || mId == CUSTOM_THEME_ID2) {
            ColorChooseDialog(view.context, customColor) { color ->
                customColor = color
                refresh()
                val newId = if (mId == CUSTOM_THEME_ID1) CUSTOM_THEME_ID2 else CUSTOM_THEME_ID1
                biliSkin.mId = newId
                listener.onClick_Origin(view)
            }.show()
            return true
        }
        return false
    }

    @JvmStatic
    fun onThemeReset(): Boolean {
        return Thread.currentThread().stackTrace.any { s ->
            s.className == "tv.danmaku.bili.MainActivityV2" && s.methodName == "onPostCreate"
        }
    }

    @JvmStatic
    private fun generateColorArray(primaryColor: Int): IntArray {
        val colors = IntArray(4)
        val hsv = FloatArray(3)
        val result = FloatArray(3)
        Color.colorToHSV(primaryColor, hsv)
        colors[0] = primaryColor

        // Decrease brightness
        hsv.copyInto(result)
        result[2] -= result[2] * 0.2f
        colors[1] = Color.HSVToColor(result)

        // Increase brightness
        hsv.copyInto(result)
        result[2] += result[2] * 0.1f
        colors[2] = Color.HSVToColor(result)

        // Increase transparency
        colors[3] = -0x4c000000 or 0xFFFFFF and colors[1]
        return colors
    }

    @JvmStatic
    private inline fun @receiver:ColorInt Int.pack() = toLong() and 0xFFFFFFFF shl 32

    @JvmStatic
    private fun @receiver:ColorInt Int.toTheme() = newTheme(
        Garb(),                 // garb
        ThemeDayNight.Day,      // currentDayNight ThemeDayNight#Day
        pack(),                 // primary !!important
        pack(),                 // secondary !!important
        Color.WHITE.pack(),     // background !!important
        Color.WHITE.pack(),     // textTitle !!important
        Color.WHITE.pack(),     // textSubtitle
        Color.WHITE.pack(),     // textOther
        Color.WHITE.pack(),     // actionIcon !!important
        isPure = true,          // isPure
    )
}
