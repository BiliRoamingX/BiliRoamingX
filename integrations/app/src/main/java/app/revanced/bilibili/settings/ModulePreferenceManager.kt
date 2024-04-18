package app.revanced.bilibili.settings

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.annotation.Keep
import androidx.preference.PreferenceManager

@Keep
@SuppressLint("RestrictedApi")
class ModulePreferenceManager(
    context: Context,
    val prefs: SharedPreferences
) : PreferenceManager(context) {
    override fun getSharedPreferences(): SharedPreferences = prefs
}
