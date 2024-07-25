package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Toasts
import app.revanced.bilibili.utils.onClick

class FilterHomeRcmdByKeywordFragment : BaseWidgetSettingFragment() {
    companion object {
        const val EXTRA_FROM = "biliroaming_from"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val from = arguments?.getString(EXTRA_FROM).orEmpty()

        val (root, content, saveButton) = rootViewTemplate()
        val applyToRelateSwitch = switchPrefsItem(string("biliroaming_apply_to_relate_title"))
            .let { content.addView(it.first); it.second }
        applyToRelateSwitch.isChecked = Settings.HomeFilterApplyToVideo()
        val applyToPopularSwitch = switchPrefsItem(string("biliroaming_apply_to_popular_title"))
            .let { content.addView(it.first); it.second }
        applyToPopularSwitch.isChecked = Settings.HomeFilterApplyToPopular()
        val applyToStorySwitch = switchPrefsItem(string("biliroaming_apply_to_story_title"))
            .let { content.addView(it.first); it.second }
        applyToStorySwitch.isChecked = Settings.HomeFilterApplyToStory()

        content.addView(textInputTitle(string("biliroaming_low_play_count_summary")))
        val lowPlayCountInput = textInputItem(string("biliroaming_low_play_count_title"))
            .let { content.addView(it.first); it.second }
        Settings.LowPlayCountLimit().takeIf { it > 0 }
            ?.let { lowPlayCountInput.setText(it.toString()) }

        content.addView(textInputTitle(string("biliroaming_hide_duration_summary")))
        val shortDurationInput = textInputItem(string("biliroaming_short_duration_title"))
            .let { content.addView(it.first); it.second }
        val longDurationInput = textInputItem(string("biliroaming_long_duration_title"))
            .let { content.addView(it.first); it.second }
        Settings.ShortDurationLimit().takeIf { it > 0 }
            ?.let { shortDurationInput.setText(it.toString()) }
        Settings.LongDurationLimit().takeIf { it > 0 }
            ?.let { longDurationInput.setText(it.toString()) }

        content.addView(textInputTitle(string("biliroaming_hide_duration_story_summary")))
        val shortDurationInputStory = textInputItem(string("biliroaming_short_duration_story_title"))
            .let { content.addView(it.first); it.second }
        val longDurationInputStory = textInputItem(string("biliroaming_long_duration_story_title"))
            .let { content.addView(it.first); it.second }
        Settings.ShortDurationLimitStory().takeIf { it > 0 }
            ?.let { shortDurationInputStory.setText(it.toString()) }
        Settings.LongDurationLimitStory().takeIf { it > 0 }
            ?.let { longDurationInputStory.setText(it.toString()) }

        content.addView(textInputTitle(string("biliroaming_keywords_filter_summary")))
        val (titleGroup, titleRegexModeSwitch) = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_title"), showRegex = true
        )
        titleRegexModeSwitch.isChecked = Settings.HomeRcmdFilterTitleRegexMode()
        val (reasonGroup, reasonRegexModeSwitch) = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_rcmd_reason"), showRegex = true
        )
        reasonRegexModeSwitch.isChecked = Settings.HomeRcmdFilterReasonRegexMode()
        val uidGroup = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_uid"),
            inputType = EditorInfo.TYPE_CLASS_NUMBER
        ).first
        val (upGroup, upRegexModeSwitch) = content.addKeywordGroup(
            string("biliroaming_keyword_group_name_up"), showRegex = true
        )
        upRegexModeSwitch.isChecked = Settings.HomeRcmdFilterUpRegexMode()
        val categoryGroup =
            content.addKeywordGroup(string("biliroaming_keyword_group_name_category")).first
        val channelGroup =
            content.addKeywordGroup(string("biliroaming_keyword_group_name_channel")).first
        Settings.HomeRcmdFilterTitle().forEach {
            titleGroup.addView(keywordInputItem(titleGroup, it).first)
        }
        Settings.HomeRcmdFilterReason().forEach {
            reasonGroup.addView(keywordInputItem(reasonGroup, it).first)
        }
        Settings.HomeRcmdFilterUid().forEach {
            uidGroup.addView(keywordInputItem(uidGroup, it, EditorInfo.TYPE_CLASS_NUMBER).first)
        }
        Settings.HomeRcmdFilterUp().forEach {
            upGroup.addView(keywordInputItem(upGroup, it).first)
        }
        Settings.HomeRcmdFilterCategory().forEach {
            categoryGroup.addView(keywordInputItem(categoryGroup, it).first)
        }
        Settings.HomeRcmdFilterChannel().forEach {
            channelGroup.addView(keywordInputItem(channelGroup, it).first)
        }

        saveButton.onClick {
            val lowPlayCount = lowPlayCountInput.text.toString().toLongOrNull() ?: 0
            val shortDuration = shortDurationInput.text.toString().toIntOrNull() ?: 0
            val longDuration = longDurationInput.text.toString().toIntOrNull() ?: 0
            val shortDurationStory = shortDurationInputStory.text.toString().toIntOrNull() ?: 0
            val longDurationStory = longDurationInputStory.text.toString().toIntOrNull() ?: 0

            val titles = titleGroup.getKeywords()
            val titleRegexMode = titleRegexModeSwitch.isChecked
            if (titleRegexMode && titles.runCatching { forEach { it.toRegex() } }.isFailure) {
                Toasts.showShortWithId("biliroaming_invalid_regex")
                return@onClick
            }
            val reasons = reasonGroup.getKeywords()
            val reasonRegexMode = reasonRegexModeSwitch.isChecked
            if (reasonRegexMode && reasons.runCatching { forEach { it.toRegex() } }.isFailure) {
                Toasts.showShortWithId("biliroaming_invalid_regex")
                return@onClick
            }
            val ups = upGroup.getKeywords()
            val upRegexMode = upRegexModeSwitch.isChecked
            if (upRegexMode && ups.runCatching { forEach { it.toRegex() } }.isFailure) {
                Toasts.showShortWithId("biliroaming_invalid_regex")
                return@onClick
            }

            Settings.LowPlayCountLimit.save(lowPlayCount)
            Settings.ShortDurationLimit.save(shortDuration)
            Settings.LongDurationLimit.save(longDuration)
            Settings.ShortDurationLimitStory.save(shortDurationStory)
            Settings.LongDurationLimitStory.save(longDurationStory)
            Settings.HomeRcmdFilterTitle.save(titles)
            Settings.HomeRcmdFilterReason.save(reasons)
            Settings.HomeRcmdFilterUid.save(uidGroup.getKeywords())
            Settings.HomeRcmdFilterUp.save(ups)
            Settings.HomeRcmdFilterCategory.save(categoryGroup.getKeywords())
            Settings.HomeRcmdFilterChannel.save(channelGroup.getKeywords())
            Settings.HomeRcmdFilterTitleRegexMode.save(titleRegexMode)
            Settings.HomeRcmdFilterReasonRegexMode.save(reasonRegexMode)
            Settings.HomeRcmdFilterUpRegexMode.save(upRegexMode)
            Settings.HomeFilterApplyToVideo.save(applyToRelateSwitch.isChecked)
            Settings.HomeFilterApplyToPopular.save(applyToPopularSwitch.isChecked)
            Settings.HomeFilterApplyToStory.save(applyToStorySwitch.isChecked)

            when (from) {
                "home" -> Toasts.showShortWithId("biliroaming_save_success_and_refresh_home")
                "popular" -> Toasts.showShortWithId("biliroaming_save_success_and_refresh_popular")
                "story" -> Toasts.showShortWithId("biliroaming_save_ok")
            }
            parentFragmentManager.popBackStack()
        }

        return root
    }
}
