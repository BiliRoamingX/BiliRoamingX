package app.revanced.bilibili.patches

import android.view.View
import android.view.ViewGroup
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import tv.danmaku.bili.ui.main2.mine.HomeUserCenterFragment

object RemoveVipSectionPatch {

    @JvmStatic
    private fun processingLayout(view: View?) {
        view ?: return
        val vipLayout = view.findView<ViewGroup>("mine_vip_layout")
        val mineRecycle = view.findView<ViewGroup>("mine_recycle")
        mineRecycle.clipToPadding = false
        if (Settings.REMOVE_VIP_SECTION.boolean) {
            vipLayout.children.forEach { it.hide() }
            val currentTheme = blkvPrefs.getInt("theme_entries_current_key", 0)
            if (currentTheme == 1/*black*/ || currentTheme == 8/*white*/) {
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

    @Keep
    @JvmStatic
    fun onUserCenterFragmentResume(fragment: HomeUserCenterFragment) {
        processingLayout(fragment.view)
    }

    @Keep
    @JvmStatic
    fun onUserCenterFragmentSkinChanged(fragment: HomeUserCenterFragment) {
        processingLayout(fragment.view)
    }
}
