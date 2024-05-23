package app.revanced.bilibili.settings.search

import androidx.fragment.app.Fragment
import app.revanced.bilibili.gen.getSearchFragmentsMap
import app.revanced.bilibili.settings.fragments.BiliRoamingSettingsFragment
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.runCatchingOrNull
import org.xmlpull.v1.XmlPullParser

data class PreferenceItem(
    val key: String,
    val title: String,
    val summary: String,
    val entries: List<String>,
    val belongFragment: Class<out Fragment>,
) {
    var parent: PreferenceItem? = null
    var score: Int = -1
        private set
    private var routeCache = ""

    fun calScore(keyword: String): Int {
        val keywords = keyword.split(' ')
        var score = 0
        if (keywords.all { title.contains(it, ignoreCase = true) })
            score += 8
        if (title.contains(keyword, ignoreCase = true))
            score += 4
        if (keywords.all { summary.contains(it, ignoreCase = true) })
            score += 2
        if (summary.contains(keyword, ignoreCase = true))
            score += 1
        this.score = score
        return score
    }

    fun route(): String {
        if (parent == null)
            return ""
        if (routeCache.isNotEmpty())
            return routeCache
        val routes = mutableListOf<String>()
        var pref = parent
        while (pref != null) {
            routes.add(pref.title)
            pref = pref.parent
        }
        return routes.asReversed().joinToString(" > ").also {
            routeCache = it
        }
    }
}

object SearchManager {
    @JvmStatic
    private val allPreferencesCache = mutableListOf<PreferenceItem>()
    private const val NS_ANDROID = "http://schemas.android.com/apk/res/android"
    private const val NS_APP = "http://schemas.android.com/apk/res-auto"

    @JvmStatic
    private val ignoreNodes: Array<String>
        get() = arrayOf(
            "androidx.preference.PreferenceScreen",
            "androidx.preference.PreferenceCategory",
            "tv.danmaku.bili.widget.RadioGroupPreference",
            "app.revanced.bilibili.widget.CheckBoxGroupPreference",
        )

    @JvmStatic
    fun search(keyword: String): List<PreferenceItem> {
        return readAllPreferences().sortedByDescending { it.calScore(keyword) }
            .filterNot { it.belongFragment == BiliRoamingSettingsFragment::class.java || it.score == 0 }
    }

    @Suppress("UNCHECKED_CAST")
    @JvmStatic
    @Synchronized
    fun readAllPreferences(): List<PreferenceItem> {
        if (allPreferencesCache.isNotEmpty())
            return allPreferencesCache
        val searchFragments = getSearchFragmentsMap()
        val items = mutableListOf<PreferenceItem>()
        val routeMap = mutableMapOf<Class<out Fragment>, PreferenceItem>()
        searchFragments.forEach { fragment ->
            val fragmentClazz = fragment.key
            val prefsXmlId = Utils.getResId(fragment.value, "xml")
            Utils.getContext().resources.getXml(prefsXmlId).use { xpp ->
                xpp.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, true)
                xpp.setFeature(XmlPullParser.FEATURE_REPORT_NAMESPACE_ATTRIBUTES, true)
                val ignoreNodes = ignoreNodes
                while (xpp.eventType != XmlPullParser.END_DOCUMENT) {
                    if (xpp.eventType == XmlPullParser.START_TAG && xpp.name !in ignoreNodes) {
                        val (fragmentName, preferenceItem) = xpp.readPreference(fragmentClazz)
                        if (fragmentName.isNotEmpty()) {
                            val clazz = Class.forName(fragmentName) as Class<Fragment>
                            routeMap[clazz] = preferenceItem
                        }
                        items.add(preferenceItem)
                    }
                    xpp.next()
                }
            }
        }
        items.forEach { item ->
            var pref: PreferenceItem? = item
            while (pref != null && routeMap.contains(pref.belongFragment)) {
                pref.parent = routeMap[pref.belongFragment]
                pref = pref.parent
            }
        }
        allPreferencesCache.clear()
        allPreferencesCache.addAll(items)
        return allPreferencesCache
    }

    fun clearPreferencesCache() {
        allPreferencesCache.clear()
    }

    private fun XmlPullParser.readPreference(belongFragment: Class<out Fragment>): Pair<String, PreferenceItem> {
        val key = getAttributeValue(NS_ANDROID, "key").resolveString()
        val title = getAttributeValue(NS_ANDROID, "title").resolveString()
        val summary = getAttributeValue(NS_ANDROID, "summary").resolveString()
        val entries = getAttributeValue(NS_ANDROID, "entries").resolveArray().ifEmpty {
            getAttributeValue(NS_APP, "radioEntries").resolveArray()
        }
        val fragmentName = getAttributeValue(NS_ANDROID, "fragment").resolveString()
        return fragmentName to PreferenceItem(key, title, summary, entries, belongFragment)
    }

    private fun String?.resolveString(): String {
        if (isNullOrEmpty()) return ""
        if (startsWith("@")) runCatchingOrNull {
            val id = substring(1).toInt()
            return Utils.getContext().resources.getString(id)
        }
        return this
    }

    private fun String?.resolveArray(): List<String> {
        if (isNullOrEmpty()) return listOf()
        if (startsWith("@")) runCatchingOrNull {
            val id = substring(1).toInt()
            return Utils.getContext().resources.getStringArray(id).toList()
        }
        return listOf()
    }
}
