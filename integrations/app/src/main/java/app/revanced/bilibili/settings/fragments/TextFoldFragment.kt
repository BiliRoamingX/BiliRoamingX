package app.revanced.bilibili.settings.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Constants
import app.revanced.bilibili.utils.onClick

class TextFoldFragment : BaseWidgetSettingFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val (root, content, saveButton) = rootViewTemplate()

        val commentMaxLines = Settings.TextFoldCommentMaxLines()
        val commentMaxLinesTitle = string("biliroaming_text_fold_comment_max_lines_title")
        val commentMaxLinesItem = seekBarItem(commentMaxLinesTitle, current = commentMaxLines).let {
            content.addView(it.first); it.second
        }
        val dynMaxLines = Settings.TextFoldDynMaxLines()
        val dynMaxLinesTitle = string("biliroaming_text_fold_dyn_max_lines_title")
        val dynMaxLinesItem = seekBarItem(dynMaxLinesTitle, current = dynMaxLines).let {
            content.addView(it.first); it.second
        }
        val dynLinesToAll = Settings.TextFoldDynLinesToAll()
        val dynLinesToAllTitle = string("biliroaming_text_fold_dyn_lines_to_all_title")
        val dynLinesToAllItem = seekBarItem(dynLinesToAllTitle, current = dynLinesToAll).let {
            content.addView(it.first); it.second
        }

        saveButton.onClick {
            Settings.TextFoldCommentMaxLines.save(commentMaxLinesItem.progress.takeIf { it != 0 }
                ?: Constants.DEF_COMMENT_MAX_LINES)
            Settings.TextFoldDynMaxLines.save(dynMaxLinesItem.progress.takeIf { it != 0 }
                ?: Constants.DEF_DYN_MAX_LINES)
            Settings.TextFoldDynLinesToAll.save(dynLinesToAllItem.progress.takeIf { it != 0 }
                ?: Constants.DEF_DYN_LINES_TO_ALL)
            parentFragmentManager.popBackStack()
        }

        return root
    }
}
