package app.revanced.bilibili.patches

import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import com.bilibili.lib.ui.BaseFragment

object ForceCommentNavigablePatch {
    @Keep
    @JvmStatic
    fun enabled() = Settings.TimeAirborne()

    @Keep
    @JvmStatic
    fun onPrimaryCommentMainFragmentCreate(fragment: BaseFragment) {
        if (enabled()) {
            fragment.arguments?.putBoolean("enableTimeParser", true)
        }
    }
}
