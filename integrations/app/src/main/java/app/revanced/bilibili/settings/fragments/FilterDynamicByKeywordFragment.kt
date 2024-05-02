package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Toasts
import app.revanced.bilibili.utils.dp
import app.revanced.bilibili.utils.onClick

class FilterDynamicByKeywordFragment : BaseWidgetSettingFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val (root, content, saveButton) = rootViewTemplate()
        val (contentGroup, contentRegexSwitch) = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_content"), 40.dp, true
        )
        contentRegexSwitch.isChecked = Settings.DYNAMIC_PURIFY_CONTENT_REGEX_MODE.boolean
        val upNameGroup =
            content.addKeywordGroup(string("biliroaming_keyword_group_name_up"), 40.dp).first
        val uidGroup = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_uid"),
            40.dp, inputType = EditorInfo.TYPE_CLASS_NUMBER
        ).first
        val topicGroup =
            content.addKeywordGroup(string("biliroaming_keyword_group_name_topic"), 40.dp).first
        Settings.DYNAMIC_PURIFY_CONTENT.stringSet.forEach {
            contentGroup.addView(keywordInputItem(contentGroup, it).first)
        }
        Settings.DYNAMIC_PURIFY_UP.stringSet.forEach {
            upNameGroup.addView(keywordInputItem(upNameGroup, it).first)
        }
        Settings.DYNAMIC_PURIFY_UID.stringSet.forEach {
            uidGroup.addView(keywordInputItem(uidGroup, it, EditorInfo.TYPE_CLASS_NUMBER).first)
        }
        Settings.DYNAMIC_PURIFY_TOPIC.stringSet.forEach {
            topicGroup.addView(keywordInputItem(topicGroup, it).first)
        }

        saveButton.onClick {
            val contents = contentGroup.getKeywords()
            val contentRegexMode = contentRegexSwitch.isChecked
            if (contentRegexMode && contents.runCatching { forEach { it.toRegex() } }.isFailure) {
                Toasts.showShortWithId("biliroaming_invalid_regex")
                return@onClick
            }

            Settings.DYNAMIC_PURIFY_CONTENT.saveValue(contents)
            Settings.DYNAMIC_PURIFY_CONTENT_REGEX_MODE.saveValue(contentRegexMode)
            Settings.DYNAMIC_PURIFY_UP.saveValue(upNameGroup.getKeywords())
            Settings.DYNAMIC_PURIFY_UID.saveValue(uidGroup.getKeywords())
            Settings.DYNAMIC_PURIFY_TOPIC.saveValue(topicGroup.getKeywords())

            Toasts.showShortWithId("biliroaming_save_success_and_refresh_dynamic")
            parentFragmentManager.popBackStack()
        }

        return root
    }
}
