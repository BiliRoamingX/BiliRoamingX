package app.revanced.bilibili.settings.search.annotation

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class SettingFragment(val prefsXmlName: String)
