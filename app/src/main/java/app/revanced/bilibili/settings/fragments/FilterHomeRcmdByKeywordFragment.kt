package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Toasts

class FilterHomeRcmdByKeywordFragment : BaseWidgetSettingFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val (root, content, saveButton) = rootViewTemplate()
        val applyToRelateSwitch = switchPrefsItem(string("biliroaming_apply_to_relate_title"))
            .let { content.addView(it.first); it.second }
        applyToRelateSwitch.isChecked = Settings.HOME_FILTER_APPLY_TO_VIDEO.boolean

        content.addView(textInputTitle(string("biliroaming_low_play_count_summary")))
        val lowPlayCountInput = textInputItem(string("biliroaming_low_play_count_title"))
            .let { content.addView(it.first); it.second }
        Settings.LOW_PLAY_COUNT_LIMIT.long.takeIf { it > 0 }
            ?.let { lowPlayCountInput.setText(it.toString()) }

        content.addView(textInputTitle(string("biliroaming_hide_duration_summary")))
        val shortDurationInput = textInputItem(string("biliroaming_short_duration_title"))
            .let { content.addView(it.first); it.second }
        val longDurationInput = textInputItem(string("biliroaming_long_duration_title"))
            .let { content.addView(it.first); it.second }
        Settings.SHORT_DURATION_LIMIT.int.takeIf { it > 0 }
            ?.let { shortDurationInput.setText(it.toString()) }
        Settings.LONG_DURATION_LIMIT.int.takeIf { it > 0 }
            ?.let { longDurationInput.setText(it.toString()) }

        content.addView(textInputTitle(string("biliroaming_keywords_filter_summary")))
        val (titleGroup, titleRegexModeSwitch) = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_title"), showRegex = true
        )
        titleRegexModeSwitch.isChecked = Settings.HOME_RCMD_FILTER_TITLE_REGEX_MODE.boolean
        val (reasonGroup, reasonRegexModeSwitch) = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_rcmd_reason"), showRegex = true
        )
        reasonRegexModeSwitch.isChecked = Settings.HOME_RCMD_FILTER_REASON_REGEX_MODE.boolean
        val uidGroup = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_uid"),
            inputType = EditorInfo.TYPE_CLASS_NUMBER
        ).first
        val (upGroup, upRegexModeSwitch) = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_up"), showRegex = true
        )
        upRegexModeSwitch.isChecked = Settings.HOME_RCMD_FILTER_UP_REGEX_MODE.boolean
        val categoryGroup =
            content.addKeywordGroup(string("biliroaming_keyword_group_name_category")).first
        val channelGroup =
            content.addKeywordGroup(string("biliroaming_keyword_group_name_channel")).first
        Settings.HOME_RCMD_FILTER_TITLE.stringSet?.forEach {
            titleGroup.addView(keywordInputItem(titleGroup, it).first)
        }
        Settings.HOME_RCMD_FILTER_REASON.stringSet?.forEach {
            reasonGroup.addView(keywordInputItem(reasonGroup, it).first)
        }
        Settings.HOME_RCMD_FILTER_UID.stringSet?.forEach {
            uidGroup.addView(keywordInputItem(uidGroup, it, EditorInfo.TYPE_CLASS_NUMBER).first)
        }
        Settings.HOME_RCMD_FILTER_UP.stringSet?.forEach {
            upGroup.addView(keywordInputItem(upGroup, it).first)
        }
        Settings.HOME_RCMD_FILTER_CATEGORY.stringSet?.forEach {
            categoryGroup.addView(keywordInputItem(categoryGroup, it).first)
        }
        Settings.HOME_RCMD_FILTER_CHANNEL.stringSet?.forEach {
            channelGroup.addView(keywordInputItem(channelGroup, it).first)
        }

        saveButton.setOnClickListener {
            val lowPlayCount = lowPlayCountInput.text.toString().toLongOrNull() ?: 0
            val shortDuration = shortDurationInput.text.toString().toIntOrNull() ?: 0
            val longDuration = longDurationInput.text.toString().toIntOrNull() ?: 0

            val titles = titleGroup.getKeywords()
            val titleRegexMode = titleRegexModeSwitch.isChecked
            if (titleRegexMode && titles.runCatching { forEach { it.toRegex() } }.isFailure) {
                Toasts.showShortWithId("biliroaming_invalid_regex")
                return@setOnClickListener
            }
            val reasons = reasonGroup.getKeywords()
            val reasonRegexMode = reasonRegexModeSwitch.isChecked
            if (reasonRegexMode && reasons.runCatching { forEach { it.toRegex() } }.isFailure) {
                Toasts.showShortWithId("biliroaming_invalid_regex")
                return@setOnClickListener
            }
            val ups = upGroup.getKeywords()
            val upRegexMode = upRegexModeSwitch.isChecked
            if (upRegexMode && ups.runCatching { forEach { it.toRegex() } }.isFailure) {
                Toasts.showShortWithId("biliroaming_invalid_regex")
                return@setOnClickListener
            }

            Settings.LOW_PLAY_COUNT_LIMIT.saveValue(lowPlayCount)
            Settings.SHORT_DURATION_LIMIT.saveValue(shortDuration)
            Settings.LONG_DURATION_LIMIT.saveValue(longDuration)
            Settings.HOME_RCMD_FILTER_TITLE.saveValue(titles)
            Settings.HOME_RCMD_FILTER_REASON.saveValue(reasons)
            Settings.HOME_RCMD_FILTER_UID.saveValue(uidGroup.getKeywords())
            Settings.HOME_RCMD_FILTER_UP.saveValue(ups)
            Settings.HOME_RCMD_FILTER_CATEGORY.saveValue(categoryGroup.getKeywords())
            Settings.HOME_RCMD_FILTER_CHANNEL.saveValue(channelGroup.getKeywords())
            Settings.HOME_RCMD_FILTER_TITLE_REGEX_MODE.saveValue(titleRegexMode)
            Settings.HOME_RCMD_FILTER_REASON_REGEX_MODE.saveValue(reasonRegexMode)
            Settings.HOME_RCMD_FILTER_UP_REGEX_MODE.saveValue(upRegexMode)
            Settings.HOME_FILTER_APPLY_TO_VIDEO.saveValue(applyToRelateSwitch.isChecked)

            Toasts.showShortWithId("biliroaming_save_success_and_refresh_home")
            requireActivity().onBackPressed()
        }

        return root
    }
}
