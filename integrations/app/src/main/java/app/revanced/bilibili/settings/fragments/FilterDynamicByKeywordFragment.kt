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
        contentRegexSwitch.isChecked = Settings.DynPurifyContentRegexMode()
        val upNameGroup =
            content.addKeywordGroup(string("biliroaming_keyword_group_name_up"), 40.dp).first
        val uidGroup = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_uid"),
            40.dp, inputType = EditorInfo.TYPE_CLASS_NUMBER
        ).first
        val topicGroup =
            content.addKeywordGroup(string("biliroaming_keyword_group_name_topic"), 40.dp).first
        Settings.DynPurifyContent().forEach {
            contentGroup.addView(keywordInputItem(contentGroup, it).first)
        }
        Settings.DynPurifyUp().forEach {
            upNameGroup.addView(keywordInputItem(upNameGroup, it).first)
        }
        Settings.DynPurifyUid().forEach {
            uidGroup.addView(keywordInputItem(uidGroup, it, EditorInfo.TYPE_CLASS_NUMBER).first)
        }
        Settings.DynPurifyTopic().forEach {
            topicGroup.addView(keywordInputItem(topicGroup, it).first)
        }

        saveButton.onClick {
            val contents = contentGroup.getKeywords()
            val contentRegexMode = contentRegexSwitch.isChecked
            if (contentRegexMode && contents.runCatching { forEach { it.toRegex() } }.isFailure) {
                Toasts.showShortWithId("biliroaming_invalid_regex")
                return@onClick
            }

            Settings.DynPurifyContent.save(contents)
            Settings.DynPurifyContentRegexMode.save(contentRegexMode)
            Settings.DynPurifyUp.save(upNameGroup.getKeywords())
            Settings.DynPurifyUid.save(uidGroup.getKeywords())
            Settings.DynPurifyTopic.save(topicGroup.getKeywords())

            Toasts.showShortWithId("biliroaming_save_success_and_refresh_dynamic")
            parentFragmentManager.popBackStack()
        }

        return root
    }
}
