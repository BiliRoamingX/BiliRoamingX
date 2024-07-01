package app.revanced.bilibili.utils

import android.app.AlertDialog
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.main.community.reply.v1.DetailListReq
import com.bapis.bilibili.main.community.reply.v1.ReplyInfoReply
import com.bapis.bilibili.main.community.reply.v1.ReplyInfoReq
import com.bapis.bilibili.main.community.reply.v1.ReplyMoss
import com.bilibili.lib.moss.api.BusinessException

object CommentChecker {

    @Suppress("ConvertObjectToDataObject")
    sealed class CheckResult {
        object Valid : CheckResult()
        object Blocked : CheckResult()
        object Deleted : CheckResult()
    }

    fun checkComment(oid: Long, id: Long, message: String, hasPicture: Boolean) {
        if (Settings.CheckComment()) Utils.async(500) {
            if (checkCommentInternal(oid, id, message, quick = true) == CheckResult.Valid) {
                val delay = if (hasPicture) 15_000L else 8_000L
                Utils.async(delay) {
                    checkCommentInternal(oid, id, message, quick = false)
                }
                Toasts.showShortWithId("biliroaming_check_comment_toast", delay / 1000)
            }
        }
        Utils.runOnMainThread(300) {
            val moduleKeywords = arrayOf("漫游", "漫y", "roaming")
            val lowerMessage = message.replace(" ", "").lowercase()
            if (moduleKeywords.any { lowerMessage.contains(it) })
                Toasts.showLong("你貌似正在站内发表违反模块使用规则的言论，请考虑删除，否则将被拉黑")
        }
    }

    private fun checkCommentInternal(
        oid: Long,
        id: Long,
        message: String,
        quick: Boolean
    ): CheckResult {
        var notFound = false
        val resp = ReplyMoss().runCatching {
            replyInfo(ReplyInfoReq().apply { rpid = id })
        }.onFailure {
            if (it is BusinessException)
                notFound = it.code == -404
        }.getOrNull()
        val invalid = !notFound && resp == ReplyInfoReply.getDefaultInstance()
        val checkResult = if (invalid) {
            var deleted = false
            ReplyMoss().runCatching {
                detailList(DetailListReq().apply {
                    this.oid = oid
                    root = id
                    type = 1
                })
            }.onFailure {
                if (it is BusinessException)
                    deleted = it.code == 12006
            }
            if (deleted) CheckResult.Deleted else CheckResult.Blocked
        } else CheckResult.Valid
        showCheckResult(message, quick, checkResult)
        return checkResult
    }

    private fun showCheckResult(
        message: String,
        quick: Boolean,
        result: CheckResult,
    ) = Utils.runOnMainThread {
        val activity = ApplicationDelegate.getTopActivity()
        val title = Utils.getString("biliroaming_comment_check_result_title")
        val contentTitle = Utils.getString("biliroaming_comment_content")
        if (result != CheckResult.Valid) {
            var tips = if (quick) {
                if (result == CheckResult.Blocked) {
                    Utils.getString("biliroaming_comment_invalid_quick_blocked")
                } else {
                    Utils.getString("biliroaming_comment_invalid_quick_deleted")
                }
            } else {
                if (result == CheckResult.Blocked) {
                    Utils.getString("biliroaming_comment_invalid_normal_blocked")
                } else {
                    Utils.getString("biliroaming_comment_invalid_normal_deleted")
                }
            }
            tips += "\n\n$contentTitle\n$message"
            if (activity != null) {
                AlertDialog.Builder(activity)
                    .setTitle(title)
                    .setMessage(tips)
                    .setPositiveButton(android.R.string.ok, null)
                    .create().constraintSize().apply {
                        setCancelable(false)
                        setCanceledOnTouchOutside(false)
                    }.show()
            } else Toasts.showLong(tips)
        } else if (!quick) {
            var tips = Utils.getString("biliroaming_comment_valid_message")
            tips += "\n\n$contentTitle\n$message"
            if (activity != null) {
                AlertDialog.Builder(activity)
                    .setTitle(title)
                    .setMessage(tips)
                    .setPositiveButton(android.R.string.ok, null)
                    .create().constraintSize().apply {
                        setCancelable(false)
                        setCanceledOnTouchOutside(false)
                    }.show()
            } else Toasts.showLong(tips)
        }
    }
}
