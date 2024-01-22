package app.revanced.bilibili.patches

import android.net.Uri
import android.view.View
import android.widget.ImageView
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.findView
import java.io.File

object SplashPatch {
    const val SPLASH_IMAGE = "biliroaming_splash"
    const val LOGO_IMAGE = "biliroaming_logo"

    @JvmStatic
    fun getMode(origin: String): String {
        return if (Settings.FULL_SPLASH.boolean) "full" else origin
    }

    @JvmStatic
    fun onBrandSplashFragmentViewCreated(view: View) {
        if (Settings.CUSTOM_SPLASH.boolean) {
            val splash = view.findView<ImageView>("brand_splash")
            val fullSplash = view.findView<ImageView>("full_brand_splash")
            val splashImage = File(Utils.getContext().filesDir, SPLASH_IMAGE)
            if (splashImage.isFile) {
                val uri = Uri.fromFile(splashImage)
                splash.setImageURI(uri)
                fullSplash.setImageURI(uri)
            } else {
                splash.alpha = 0f
                fullSplash.alpha = 0f
            }
        }
        if (Settings.CUSTOM_SPLASH_LOGO.boolean) {
            val logo = view.findView<ImageView>("brand_logo")
            val logoImage = File(Utils.getContext().filesDir, LOGO_IMAGE)
            if (logoImage.isFile) {
                logo.setImageURI(Uri.fromFile(logoImage))
            } else {
                logo.alpha = 0f
            }
        }
    }
}
