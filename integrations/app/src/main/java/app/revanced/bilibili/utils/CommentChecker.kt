package app.revanced.bilibili.utils

import android.app.AlertDialog
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.patches.protobuf.MossPatch
import app.revanced.bilibili.patches.protobuf.hooks.DmSegMobile
import com.bapis.bilibili.community.service.dm.v1.DMMoss
import com.bapis.bilibili.community.service.dm.v1.DmSegMobileReq
import com.bapis.bilibili.main.community.reply.v1.ReplyInfoReply
import com.bapis.bilibili.main.community.reply.v1.ReplyInfoReq
import com.bapis.bilibili.main.community.reply.v1.ReplyMoss
import com.bilibili.lib.moss.api.BusinessException

object CommentChecker {

    fun checkComment(id: Long, message: String, hasPicture: Boolean) {
        Utils.runOnMainThread(500) {
            Utils.async {
                if (!checkCommentInternal(id, message, quick = true)) {
                    val delay = if (hasPicture) 15_000L else 5_000L
                    Utils.runOnMainThread(delay) {
                        Utils.async {
                            checkCommentInternal(id, message, quick = false)
                        }
                    }
                    Toasts.showShort("评论审核结果将在${delay / 1000}秒后报告。")
                }
            }
        }
    }

    fun checkDanmaku(oid: Long, aid: Long, progress: Long, dmId: Long, message: String) {
        val segment = (progress / (6 * 60 * 1000)) + 1
        Utils.runOnMainThread(60_000L) {
            Utils.async {
                MossPatch.tmpDisableAuthApiList.add(MossPatch.DM_SEG_MOBILE_API)
                DmSegMobile.tempNotHook.set(true)
                val resp = DMMoss().runCatchingOrNull {
                    dmSegMobile(DmSegMobileReq().apply {
                        this.oid = oid
                        this.pid = aid
                        this.segmentIndex = segment
                        this.type = 1
                        this.pullMode = 1
                        this.fromScene = 11
                    })
                }
                val invalid = resp == null || resp.elemsList.none { it.id == dmId }
                showCheckResult(message, quick = false, danmaku = true, invalid = invalid)
            }
        }
        Toasts.showShort("弹幕审核结果将在1分钟后报告。")
    }

    private fun checkCommentInternal(id: Long, message: String, quick: Boolean): Boolean {
        MossPatch.tmpDisableAuthApiList.add(MossPatch.REPLY_INFO_API)
        var notFound = false
        val resp = ReplyMoss().runCatching {
            replyInfo(ReplyInfoReq().apply { rpid = id })
        }.onFailure {
            if (it is BusinessException)
                notFound = it.code == -404
        }.getOrNull()
        val invalid = !notFound && resp == ReplyInfoReply.getDefaultInstance()
        showCheckResult(message, quick, danmaku = false, invalid = invalid)
        return invalid
    }

    private fun showCheckResult(
        message: String,
        quick: Boolean,
        danmaku: Boolean,
        invalid: Boolean
    ) = Utils.runOnMainThread {
        val activity = ApplicationDelegate.getTopActivity()
        val type = if (danmaku) "弹幕" else "评论"
        if (invalid) {
            val tips = if (quick) {
                "你发布的$type “$message” 被阿瓦隆自净系统秒删了喔！"
            } else {
                "你发布的$type “$message” 疑似被阿瓦隆自净系统屏蔽或删除！"
            }
            if (activity != null) {
                AlertDialog.Builder(activity)
                    .setTitle("${type}检查结果")
                    .setMessage(tips)
                    .setPositiveButton(android.R.string.ok, null)
                    .create().constraintSize().apply {
                        setCancelable(false)
                        setCanceledOnTouchOutside(false)
                    }.show()
            } else Toasts.showLong(tips)
        } else if (!quick) {
            val tips = "你发布的$type “$message” 通过了叔叔的审核！"
            if (activity != null) {
                AlertDialog.Builder(activity)
                    .setTitle("${type}检查结果")
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
