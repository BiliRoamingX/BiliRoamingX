package app.revanced.bilibili.patches

import android.view.View
import android.view.ViewGroup
import androidx.annotation.Keep
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import tv.danmaku.bili.ui.main2.mine.HomeUserCenterFragment
import java.io.File

object RemoveVipSectionPatch {

    @JvmStatic
    private var currentResolvedThemeId = -1

    @JvmStatic
    private var lastResolvedThemeId = -1

    @JvmStatic
    private fun processingLayout(view: View?) {
        view ?: return
        val vipLayout = view.findView<ViewGroup>("mine_vip_layout")
        val mineRecycle = view.findView<ViewGroup>("mine_recycle")
        mineRecycle.clipToPadding = false
        if (Settings.REMOVE_VIP_SECTION.boolean) {
            vipLayout.children.forEach { it.hide() }
            val currentThemeId = currentThemeId()
            val lastThemeId = lastThemeId()
            val pureThemeIds = CustomThemePatch.getThemeNames().values
            if (currentThemeId == 8/*white*/ || (currentThemeId == 1/*black*/ && (lastThemeId == -1 || lastThemeId in pureThemeIds))) {
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
    private fun currentThemeId(): Int {
        val mid = Accounts.mid
        if (mid == 0L) return 8
        if (currentResolvedThemeId != -1)
            return currentResolvedThemeId
        val confFile = File(Utils.getContext().filesDir, "garb/$mid/garb.conf")
        return (if (confFile.isFile) runCatchingOrNull {
            confFile.readText().toJSONObject().optInt("id", 8)
        } ?: 8 else 8).also { currentResolvedThemeId = it }
    }

    @JvmStatic
    private fun lastThemeId(): Int {
        val mid = Accounts.mid
        if (mid == 0L) return -1
        if (lastResolvedThemeId != -1)
            return lastResolvedThemeId
        val confFile = File(Utils.getContext().filesDir, "garb/$mid/last.garb.conf")
        return (if (confFile.isFile) runCatchingOrNull {
            confFile.readText().toJSONObject().optInt("id", -1)
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
