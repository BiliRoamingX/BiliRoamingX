package app.revanced.bilibili.patches

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.text.SpannableStringBuilder
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.PopupWindow
import android.widget.TextView
import androidx.annotation.Keep
import app.revanced.bilibili.http.HttpClient
import app.revanced.bilibili.model.AIConclusion
import app.revanced.bilibili.model.AIConclusionJudge
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.patches.main.Player
import app.revanced.bilibili.patches.main.VideoInfoHolder
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import app.revanced.bilibili.utils.PlayerHookProvider.seekTo
import app.revanced.bilibili.widget.OnLongClickOriginListener
import com.bapis.bilibili.app.viewunite.common.DescType
import com.bapis.bilibili.app.viewunite.v1.ViewReply
import com.bilibili.bplus.followingcard.widget.EllipsizingTextView
import com.bilibili.bplus.im.business.model.BaseTypedMessage
import org.json.JSONObject
import java.lang.ref.WeakReference

object CopyEnhancePatch {
    private val DYNAMIC_COPYABLE_IDS = arrayOf(
        "dy_card_text",
        "dy_opus_paragraph_desc",
        "dy_opus_paragraph_title",
        "dy_opus_copy_right_id",
        "dy_opus_paragraph_text"
    )
    private val canonicalizeRegex = Regex("""([,;])\s?""")
    private val aiConclusionAvailableCache = object : LinkedHashMap<Long, Boolean>() {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Long, Boolean>): Boolean {
            return size > 6
        }
    }

    private var copyDialogRef = WeakReference<Dialog>(null)
    private var aiConclusionDialogRef = WeakReference<Dialog>(null)

    @Keep
    @JvmStatic
    @Suppress("UNUSED_PARAMETER")
    fun onCopyDesc(isBv: Boolean, desc: String): Boolean {
        if (!Settings.CommentCopy()) return false
        if (!Settings.EnhanceCommentCopy()) return true

        fun SpannableStringBuilder.appendTitle(title: CharSequence) =
            relativeSize(proportion = 1.05f) { bold { appendLine(title) } }

        val view = VideoInfoHolder.current?.view
        val allDesc = if (view != null && view is com.bapis.bilibili.app.view.v1.ViewReply) {
            buildSpannedString {
                appendTitle("标题：")
                appendLine(view.arc.title).appendLine()
                appendTitle("AV号：")
                appendLine("AV${view.arc.aid}").appendLine()
                appendTitle("BV号：")
                appendLine(view.bvid).appendLine()
                appendTitle("封面：")
                clickable(0xFF2196F3.toInt(), onClick = {
                    saveImage(view.arc.pic)
                }) { append("点我保存") }
                appendLine().appendLine()
                appendTitle("AI总结：")
                val cid = VideoInfoHolder.current?.cid
                if (cid != null && cid != 0L && aiConclusionAvailableCache[cid] == false) {
                    appendLine("当前视频暂不支持AI总结").appendLine()
                } else {
                    clickable(0xFF2196F3.toInt(), onClick = {
                        viewAiConclusion()
                    }) { append("点我查看") }
                    appendLine().appendLine()
                }
                val introDesc = view.arc.desc
                if (introDesc.isNotEmpty()) {
                    appendTitle("简介：")
                    appendLine(introDesc).appendLine()
                }
                val introBgm = view.bgmList.joinToString("\n") { m ->
                    m.author.let { if (it.isEmpty()) m.title else "${m.title} - $it" }
                }
                if (introBgm.isNotEmpty()) {
                    appendTitle("BGM：")
                    appendLine(introBgm).appendLine()
                }
                val introTags = view.descTagList.joinToString(" ") { it.name }
                if (introTags.isNotEmpty()) {
                    appendTitle("标签：")
                    appendLine(introTags).appendLine()
                }
            }.removeSuffix("\n\n")
        } else if (view != null && view is ViewReply) {
            val introTab = view.tab.tabModuleList.find { it.hasIntroduction() }?.introduction
            if (introTab != null) {
                val modules = introTab.modulesList
                val headline = modules.find { it.hasHeadLine() }?.headLine
                val intro = modules.find { it.hasUgcIntroduction() }?.ugcIntroduction
                if (headline != null && intro != null) {
                    buildSpannedString {
                        appendTitle("标题：")
                        appendLine(headline.content).appendLine()
                        appendTitle("AV号：")
                        appendLine("AV${view.arc.aid}").appendLine()
                        appendTitle("BV号：")
                        appendLine(view.arc.bvid).appendLine()
                        appendTitle("封面：")
                        clickable(0xFF2196F3.toInt(), onClick = {
                            saveImage(view.arc.cover)
                        }) { append("点我保存") }
                        appendLine().appendLine()
                        appendTitle("AI总结：")
                        val cid = VideoInfoHolder.current?.cid
                        if (cid != null && cid != 0L && aiConclusionAvailableCache[cid] == false) {
                            appendLine("当前视频暂不支持AI总结").appendLine()
                        } else {
                            clickable(0xFF2196F3.toInt(), onClick = {
                                viewAiConclusion()
                            }) { append("点我查看") }
                            appendLine().appendLine()
                        }
                        val introDesc = intro.descList.joinToString("") {
                            if (it.type == DescType.DescTypeAt) "@${it.text}" else it.text
                        }
                        if (introDesc.isNotEmpty()) {
                            appendTitle("简介：")
                            appendLine(introDesc).appendLine()
                        }
                        val introBgm = intro.bgmList.joinToString("\n") { m ->
                            m.author.let { if (it.isEmpty()) m.title else "${m.title} - $it" }
                        }
                        if (introBgm.isNotEmpty()) {
                            appendTitle("BGM：")
                            appendLine(introBgm).appendLine()
                        }
                        val introTags = intro.tagsList.joinToString(" ") { it.name }
                        if (introTags.isNotEmpty()) {
                            appendTitle("标签：")
                            appendLine(introTags).appendLine()
                        }
                    }.removeSuffix("\n\n")
                } else desc
            } else desc
        } else desc

        showCopyDialog(ApplicationDelegate.requireTopActivity(), allDesc) { v ->
            setClipboardContent(label = "text", v)
            Toasts.showShortWithId("biliroaming_copy_success")
        }
        return true
    }

    @Keep
    @JvmStatic
    fun onDynamicLongClick(listener: OnLongClickOriginListener, view: View): Boolean {
        if (!Settings.CommentCopy()) return false
        if (!Settings.EnhanceCommentCopy()) return true
        DYNAMIC_COPYABLE_IDS.asSequence().firstNotNullOfOrNull { id ->
            Utils.getResId(id, "id").takeIf { it > 0 }
                ?.let { view.findViewById<TextView>(it) }
        }?.run {
            val text = if (this is EllipsizingTextView) {
                getFirstFieldByExactType<CharSequence>()
            } else text
            showCopyDialog(context, text) {
                listener.onLongClick_Origin(view)
            }
            return true
        }
        return false
    }

    @Keep
    @JvmStatic
    fun onCommentLongClick(
        listener: OnLongClickOriginListener,
        view: View,
        idName: String
    ): Boolean {
        if (!Settings.CommentCopy()) return false
        if (!Settings.EnhanceCommentCopy()) return true
        val resId = Utils.getResId(idName, "id")
        val textView = view.findViewById<TextView>(resId) ?: return false
        val text = textView.getFirstFieldByExactType<CharSequence>()
        showCopyDialog(textView.context, text) {
            listener.onLongClick_Origin(view)
        }
        return true
    }

    @Keep
    @JvmStatic
    fun onCommentMenuItemClick(self: Any, action: Enum<*>, originMethod: String): Boolean {
        if (!Settings.EnhanceCommentCopy()) return false
        if (action.name != "COPY") return false
        val context = self.getFirstFieldByExactType<Context>()
        val toCopyText = self.getFirstFieldByExactType<String?>()
            .orEmpty().ifEmpty { return false }
        showCopyDialog(context, toCopyText) {
            self.callMethod(originMethod, action)
        }
        return true
    }

    @Keep
    @JvmStatic
    fun onConversationCopy(
        activity: Activity,
        message: BaseTypedMessage<*>,
        popupWindow: PopupWindow
    ): Boolean {
        if (!Settings.EnhanceCommentCopy()) return false
        val text = message.contentString.toJSONObject().run {
            optString("content").ifEmpty {
                buildString {
                    appendLine(optString("title").trim())
                    appendLine(optString("text").trim())
                    optJSONArray("modules")?.run {
                        asSequence<JSONObject>().map {
                            it.optString("title") + "：" + it.optString("detail")
                        }.joinToString("\n").run {
                            append(this)
                        }
                    }
                }.run { removeSuffix("\n") }
            }
        }
        showCopyDialog(activity, text) {
            setClipboardContent(content = it)
        }
        popupWindow.dismiss()
        return true
    }

    private fun showCopyDialog(
        context: Context,
        text: CharSequence,
        onCopyAll: (CharSequence) -> Unit
    ) {
        val appDialogTheme = Utils.getResId("AppTheme.Dialog.Alert", "style")
        val title = Utils.getString("biliroaming_dialog_title_copy_enhance")
        val posButton = Utils.getString("biliroaming_dialog_btn_share")
        val neuButton = Utils.getString("biliroaming_dialog_btn_copy_all")
        val alertDialog = AlertDialog.Builder(context, appDialogTheme)
            .setTitle(title)
            .setMessage(text)
            .setPositiveButton(posButton) { _, _ ->
                val intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    type = "text/plain"
                    putExtra(Intent.EXTRA_TEXT, text)
                }
                context.startActivity(Intent.createChooser(intent, posButton))
            }
            .setNeutralButton(neuButton) { _, _ -> onCopyAll(text) }
            .setNegativeButton(android.R.string.cancel, null)
            .create().constraintSize()
            .apply { show() }
        (alertDialog.findViewById<TextView>(android.R.id.message)).run {
            setTextIsSelectable(true)
            movementMethod = LinkMovementMethod.getInstance()
        }
        copyDialogRef = WeakReference(alertDialog)
    }

    fun judgeAiConclusion(aid: Long, mid: Long, cid: Long) {
        if (aiConclusionAvailableCache[cid] == false)
            return
        Utils.async {
            val params = Wbi.sign(mapOf("aid" to aid, "cid" to cid, "up_mid" to mid))
            HttpClient.get(
                "https://api.bilibili.com/x/web-interface/view/conclusion/judge",
                params = params
            )?.data<AIConclusionJudge>()?.let {
                aiConclusionAvailableCache[cid] = it.available
            }
        }
    }

    private fun viewAiConclusion() {
        val (cid, view) = VideoInfoHolder.current
            ?: return
        if (cid == 0L) return
        var aid = 0L
        var mid = 0L
        if (view is com.bapis.bilibili.app.view.v1.ViewReply) {
            aid = view.arc.aid
            mid = view.arc.author.mid
        } else if (view is ViewReply) {
            aid = view.arc.aid
            mid = view.owner.mid
        }
        if (aid == 0L || mid == 0L) return
        Utils.async {
            val params = Wbi.sign(mapOf("aid" to aid, "cid" to cid, "up_mid" to mid))
            val aiConclusion = HttpClient.get(
                "https://api.bilibili.com/x/web-interface/view/conclusion/get",
                params = params
            )?.data<AIConclusion>()
            if (aiConclusion != null) Utils.runOnMainThread {
                showAiConclusion(aiConclusion, cid)
            }
        }
    }

    private fun showAiConclusion(aiConclusion: AIConclusion, cid: Long) {
        if (aiConclusion.code != 0) {
            if (aiConclusion.code == 1) {
                aiConclusionAvailableCache[cid] = true
                Toasts.showLong("当前视频由你首次尝试AI总结，系统正在处理中，请稍后再次查看是否支持AI总结。")
            } else {
                aiConclusionAvailableCache[cid] = false
                Toasts.showShort("当前视频暂不支持AI总结")
            }
            return
        }
        aiConclusionAvailableCache[cid] = true
        val topActivity = ApplicationDelegate.getTopActivity() ?: return
        val modelResult = aiConclusion.modelResult

        fun String.canonicalize() = replace(canonicalizeRegex) {
            val (_, symbol) = it.groupValues
            when (symbol) {
                "," -> "，"
                ";" -> "；"
                else -> symbol
            }
        }

        val message = buildSpannedString {
            if (modelResult.summary.isNotEmpty()) {
                absoluteSize(15.sp) {
                    bold { appendLine(modelResult.summary.canonicalize()) }
                }
                appendLine()
            }
            modelResult.outline.forEach { line ->
                val title = line.title
                absoluteSize(15.sp) {
                    bold { appendLine(title.canonicalize()) }
                }
                line.partOutline.forEach { partLine ->
                    val timestamp = partLine.timestamp
                    val timestampFormat = timestamp.toLong().secondFormat()
                    val content = partLine.content
                    absoluteSize(14.sp) {
                        clickable(0xFF2196F3.toInt(), onClick = {
                            copyDialogRef.get()?.dismiss()
                            aiConclusionDialogRef.get()?.dismiss()
                            Player.current()?.seekTo(timestamp * 1000)
                        }) { append(timestampFormat) }
                        append(' ')
                        appendLine(content.canonicalize())
                    }
                }
                appendLine()
            }
        }.trimEnd()
        val alertDialog = AlertDialog.Builder(topActivity)
            .setTitle("AI总结")
            .setMessage(message)
            .setPositiveButton(android.R.string.ok, null)
            .create().constraintSize()
            .apply { show() }
        (alertDialog.findViewById<TextView>(android.R.id.message)).run {
            setTextIsSelectable(true)
            movementMethod = LinkMovementMethod.getInstance()
        }
        aiConclusionDialogRef = WeakReference(alertDialog)
    }
}
