package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import androidx.preference.Preference
import app.revanced.bilibili.settings.search.annotation.SettingFragment
import app.revanced.bilibili.utils.GarbWatcher
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.onClick
import com.bilibili.lib.ui.garb.Garb

@SettingFragment("biliroaming_settings")
class BiliRoamingSettingsFragment : BiliRoamingBaseSettingFragment(), GarbWatcher.Observer {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        findPreference<Preference>("reboot")?.onClick { Utils.reboot(); true }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GarbWatcher.subscribe(this)
    }

    override fun onDestroy() {
        GarbWatcher.unsubscribe(this)
        super.onDestroy()
    }

    override fun onSkinChanged(garb: Garb) {
        tintSearchMenu(garb = garb)
    }
}
