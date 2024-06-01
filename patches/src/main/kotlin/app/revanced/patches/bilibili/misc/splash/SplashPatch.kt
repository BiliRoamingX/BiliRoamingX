package app.revanced.patches.bilibili.misc.splash

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.patch.options.PatchOption.PatchExtensions.stringPatchOption
import app.revanced.util.appendChild
import app.revanced.util.children
import app.revanced.util.get
import app.revanced.util.set

@Patch(
    name = "Splash",
    description = "闪屏页背景色跟随深色模式",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object SplashPatch : ResourcePatch() {

    private const val BLACK_COLOR = "@android:color/black"
    private const val WHITE_COLOR = "@android:color/white"
    private const val STOCK_BG_COLOR = "@color/Wh0"

    private val darkThemeBackgroundColor by stringPatchOption(
        key = "darkThemeBackgroundColor",
        default = STOCK_BG_COLOR,
        values = mapOf(
            "Amoled black" to BLACK_COLOR,
            "Material You" to "@android:color/system_neutral1_900",
            "Classic (old YouTube)" to "#FF212121",
            "Catppuccin (Mocha)" to "#FF181825",
            "Dark pink" to "#FF290025",
            "Dark blue" to "#FF001029",
            "Dark green" to "#FF002905",
            "Dark yellow" to "#FF282900",
            "Dark orange" to "#FF291800",
            "Dark red" to "#FF290000"
        ),
        title = "Dark theme background color",
        description = "Can be a hex color (#AARRGGBB) or a color resource reference.",
    )

    private val lightThemeBackgroundColor by stringPatchOption(
        key = "lightThemeBackgroundColor",
        default = STOCK_BG_COLOR,
        values = mapOf(
            "White" to WHITE_COLOR,
            "Material You" to "@android:color/system_neutral1_50",
            "Catppuccin (Latte)" to "#FFE6E9EF",
            "Light pink" to "#FFFCCFF3",
            "Light blue" to "#FFD1E0FF",
            "Light green" to "#FFCCFFCC",
            "Light yellow" to "#FFFDFFCC",
            "Light orange" to "#FFFFE6CC",
            "Light red" to "#FFFFD6D6"
        ),
        title = "Light theme background color",
        description = "Can be a hex color (#AARRGGBB) or a color resource reference.",
    )

    override fun execute(context: ResourceContext) {
        addResourceStyleItem(
            context, "res/values/styles.xml",
            STYLE_NAME_APP_THEME, STYLE_ITEM_NAME_SPLASH_BG, lightThemeBackgroundColor!!
        )
        addResourceStyleItem(
            context, "res/values-night/styles.xml",
            STYLE_NAME_APP_THEME, STYLE_ITEM_NAME_SPLASH_BG, darkThemeBackgroundColor!!
        )
        addResourceColor(
            context, "res/values/colors.xml",
            COLOR_NAME_BILIROAMING_BG_SPLASH, lightThemeBackgroundColor!!
        )
        addResourceColor(
            context, "res/values-night/colors.xml",
            COLOR_NAME_BILIROAMING_BG_SPLASH, darkThemeBackgroundColor!!
        )
        context.document["res/drawable/layerlist_splash.xml"].use { dom ->
            dom["layer-list"].children().flatMap { it.children() }
                .first { it.tagName == "color" }["android:color"] = "@color/$COLOR_NAME_BILIROAMING_BG_SPLASH"
        }
        context.document["res/drawable/safe_mode_layerlist_splash.xml"].use { dom ->
            dom["layer-list"].children().flatMap { it.children() }
                .first { it.tagName == "color" }["android:color"] = "@color/$COLOR_NAME_BILIROAMING_BG_SPLASH"
        }
        context.document["res/layout/bili_app_layout_brand_splash_fragment.xml"].use { dom ->
            dom["androidx.constraintlayout.widget.ConstraintLayout"]["android:background"] =
                "@color/$COLOR_NAME_BILIROAMING_BG_SPLASH"
        }
    }

    private fun addResourceStyleItem(
        context: ResourceContext,
        resourceFile: String,
        styleName: String,
        name: String,
        value: String,
    ) = context.document[resourceFile].use { dom ->
        dom["resources"].children().find {
            it.tagName == "style" && it["name"] == styleName
        }?.appendChild("item") {
            this["name"] = name
            textContent = value
        }
    }

    private fun addResourceColor(
        context: ResourceContext,
        resourceFile: String,
        name: String,
        value: String
    ) = context.document[resourceFile].use {
        it["resources"].appendChild("color") {
            this["name"] = name
            textContent = value
        }
    }

    private const val STYLE_NAME_APP_THEME = "AppTheme"
    private const val STYLE_ITEM_NAME_SPLASH_BG = "android:windowSplashScreenBackground"
    private const val COLOR_NAME_BILIROAMING_BG_SPLASH = "biliroaming_bg_splash"
}
