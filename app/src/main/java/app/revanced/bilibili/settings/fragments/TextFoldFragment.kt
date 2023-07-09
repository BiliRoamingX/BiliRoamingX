package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Constants

class TextFoldFragment : BaseWidgetSettingFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val (root, content, saveButton) = rootViewTemplate()

        val commentMaxLines = Settings.TEXT_FOLD_COMMENT_MAX_LINES.int
        val commentMaxLinesTitle = string("biliroaming_text_fold_comment_max_lines_title")
        val commentMaxLinesItem = seekBarItem(commentMaxLinesTitle, current = commentMaxLines).let {
            content.addView(it.first); it.second
        }
        val dynMaxLines = Settings.TEXT_FOLD_DYN_MAX_LINES.int
        val dynMaxLinesTitle = string("biliroaming_text_fold_dyn_max_lines_title")
        val dynMaxLinesItem = seekBarItem(dynMaxLinesTitle, current = dynMaxLines).let {
            content.addView(it.first); it.second
        }
        val dynLinesToAll = Settings.TEXT_FOLD_DYN_LINES_TO_ALL.int
        val dynLinesToAllTitle = string("biliroaming_text_fold_dyn_lines_to_all_title")
        val dynLinesToAllItem = seekBarItem(dynLinesToAllTitle, current = dynLinesToAll).let {
            content.addView(it.first); it.second
        }

        saveButton.setOnClickListener {
            Settings.TEXT_FOLD_COMMENT_MAX_LINES.saveValue(commentMaxLinesItem.progress.takeIf { it != 0 }
                ?: Constants.DEF_COMMENT_MAX_LINES)
            Settings.TEXT_FOLD_DYN_MAX_LINES.saveValue(dynMaxLinesItem.progress.takeIf { it != 0 }
                ?: Constants.DEF_DYN_MAX_LINES)
            Settings.TEXT_FOLD_DYN_LINES_TO_ALL.saveValue(dynLinesToAllItem.progress.takeIf { it != 0 }
                ?: Constants.DEF_DYN_LINES_TO_ALL)
            parentFragmentManager.popBackStack()
        }

        return root
    }
}
