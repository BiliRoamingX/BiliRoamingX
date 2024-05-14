package app.revanced.bilibili.patches

import android.view.View
import android.view.ViewGroup
import androidx.annotation.Keep
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import tv.danmaku.bili.ui.main2.mine.HomeUserCenterFragment

object RemoveVipSectionPatch {

    @JvmStatic
    private var currentResolvedThemeId = -1L

    @JvmStatic
    private var lastResolvedThemeId = -1L

    @JvmStatic
    private fun processingLayout(view: View?) {
        view ?: return
        val vipLayout = view.findView<ViewGroup>("mine_vip_layout")
        val mineRecycle = view.findView<ViewGroup>("mine_recycle")
        mineRecycle.clipToPadding = false
        if (Settings.RemoveVipSection()) {
            vipLayout.children.forEach { it.hide() }
            val currentThemeId = currentThemeId()
            val lastThemeId = lastThemeId()
            val pureThemeIds = CustomThemePatch.getThemeNames().values.map { it.toLong() }
            if (currentThemeId == 8L/*white*/ || (currentThemeId == 1L/*black*/ && (lastThemeId == -1L || lastThemeId in pureThemeIds))) {
                mineRecycle.updatePadding(top = 0)
                vipLayout.updateLayoutParams {
                    height = 0
                }
            } else {
                mineRecycle.updatePadding(top = 10.dp)
                vipLayout.updateLayoutParams {
                    height = 10.dp
                }
            }
        } else {
            vipLayout.children.forEach { it.show() }
            mineRecycle.updatePadding(top = 0)
            vipLayout.updateLayoutParams {
                height = ViewGroup.LayoutParams.WRAP_CONTENT
            }
        }
    }

    @JvmStatic
    private fun currentThemeId(): Long {
        if (!Accounts.isLogin)
            return 8
        if (currentResolvedThemeId != -1L)
            return currentResolvedThemeId
        val confFile = Themes.garbConf
        return (if (confFile.isFile) runCatchingOrNull {
            confFile.readText().toJSONObject().optLong("id", 8)
        } ?: 8 else 8).also { currentResolvedThemeId = it }
    }

    @JvmStatic
    private fun lastThemeId(): Long {
        if (!Accounts.isLogin)
            return -1
        if (lastResolvedThemeId != -1L)
            return lastResolvedThemeId
        val confFile = Themes.lastGarbConf
        return (if (confFile.isFile) runCatchingOrNull {
            confFile.readText().toJSONObject().optLong("id", -1)
        } ?: -1 else -1).also { lastResolvedThemeId = it }
    }

    @Keep
    @JvmStatic
    fun onUserCenterFragmentResume(fragment: HomeUserCenterFragment) {
        processingLayout(fragment.view)
    }

    @Keep
    @JvmStatic
    fun onUserCenterFragmentSkinChanged(fragment: HomeUserCenterFragment) {
        currentResolvedThemeId = -1
        lastResolvedThemeId = -1
        processingLayout(fragment.view)
    }
}
