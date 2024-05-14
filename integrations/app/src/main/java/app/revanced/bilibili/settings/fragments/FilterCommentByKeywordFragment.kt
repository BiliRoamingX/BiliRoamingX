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

class FilterCommentByKeywordFragment : BaseWidgetSettingFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val (root, content, saveButton) = rootViewTemplate()
        val upLevel = Settings.BlockCommentUpLevel()
        val upLevelTitle = string("biliroaming_block_comment_up_level_title")
        val upLevelIndicator = string("biliroaming_up_level")
        val upLevelIndicatorZero = string("biliroaming_disabled")
        val upLevelItem = seekBarItem(
            name = upLevelTitle,
            current = upLevel,
            indicator = upLevelIndicator,
            zeroIndicator = upLevelIndicatorZero,
            max = 6
        ).let { content.addView(it.first); it.second }
        val (contentGroup, contentRegexSwitch) = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_content"), 40.dp, true
        )
        contentRegexSwitch.isChecked = Settings.BlockCommentContentRegexMode()
        val (upNameGroup, upNameRegexSwitch) = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_up"), 40.dp, true
        )
        upNameRegexSwitch.isChecked = Settings.BlockCommentUpRegexMode()
        val uidGroup = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_uid"),
            40.dp, inputType = EditorInfo.TYPE_CLASS_NUMBER
        ).first
        Settings.BlockCommentContent().forEach {
            contentGroup.addView(keywordInputItem(contentGroup, it).first)
        }
        Settings.BlockCommentUp().forEach {
            upNameGroup.addView(keywordInputItem(upNameGroup, it).first)
        }
        Settings.BlockCommentUid().forEach {
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

            Settings.BlockCommentUpLevel.save(upLevelItem.progress)
            Settings.BlockCommentContent.save(contents)
            Settings.BlockCommentContentRegexMode.save(contentRegexMode)
            Settings.BlockCommentUp.save(upNames)
            Settings.BlockCommentUpRegexMode.save(upNameRegexMode)
            Settings.BlockCommentUid.save(uidGroup.getKeywords())

            parentFragmentManager.popBackStack()
        }

        return root
    }
}
