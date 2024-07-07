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

class FilterSearchKeywordsFragment : BaseWidgetSettingFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val (root, content, saveButton) = rootViewTemplate()
        val (contentGroup, contentRegexSwitch) = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_content"), 40.dp, true
        )
        contentRegexSwitch.isChecked = Settings.FilterSearchContentRegexMode()
        val (upNameGroup, upNameRegexSwitch) = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_up"), 40.dp, true
        )
        upNameRegexSwitch.isChecked = Settings.FilterSearchUpRegexMode()
        val uidGroup = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_uid"),
            40.dp, inputType = EditorInfo.TYPE_CLASS_NUMBER
        ).first
        Settings.FilterSearchContent().forEach {
            contentGroup.addView(keywordInputItem(contentGroup, it).first)
        }
        Settings.FilterSearchUp().forEach {
            upNameGroup.addView(keywordInputItem(upNameGroup, it).first)
        }
        Settings.FilterSearchUid().forEach {
            uidGroup.addView(keywordInputItem(uidGroup, it, EditorInfo.TYPE_CLASS_NUMBER).first)
        }

        saveButton.onClick {
            val contents = contentGroup.getKeywords()
            val contentRegexMode = contentRegexSwitch.isChecked
            if (contentRegexMode && contents.runCatching { forEach { it.toRegex() } }.isFailure) {
                Toasts.showShortWithId("biliroaming_invalid_regex")
                return@onClick
            }
            val upNames = upNameGroup.getKeywords()
            val upNameRegexMode = upNameRegexSwitch.isChecked
            if (upNameRegexMode && upNames.runCatching { forEach { it.toRegex() } }.isFailure) {
                Toasts.showShortWithId("biliroaming_invalid_regex")
                return@onClick
            }

            Settings.FilterSearchContent.save(contents)
            Settings.FilterSearchContentRegexMode.save(contentRegexMode)
            Settings.FilterSearchUp.save(upNames)
            Settings.FilterSearchUpRegexMode.save(upNameRegexMode)
            Settings.FilterSearchUid.save(uidGroup.getKeywords())

            parentFragmentManager.popBackStack()
        }

        return root
    }
}
