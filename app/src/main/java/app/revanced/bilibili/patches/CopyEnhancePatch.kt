package app.revanced.bilibili.patches

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.PopupWindow
import android.widget.TextView
import app.revanced.bilibili.patches.main.ApplicationDelegate
import app.revanced.bilibili.patches.protobuf.ViewUniteReplyHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import app.revanced.bilibili.widget.OnLongClickOriginListener
import com.bapis.bilibili.app.viewunite.common.DescType
import com.bilibili.bplus.followingcard.widget.EllipsizingTextView
import com.bilibili.bplus.im.business.model.BaseTypedMessage
import com.bilibili.ship.theseus.all.UnitedBizDetailsActivity
import org.json.JSONObject

object CopyEnhancePatch {
    private val DYNAMIC_COPYABLE_IDS = arrayOf(
        "dy_card_text",
        "dy_opus_paragraph_desc",
        "dy_opus_paragraph_title",
        "dy_opus_copy_right_id",
        "dy_opus_paragraph_text"
    )

    @JvmStatic
    fun onCopyDesc(isBv: Boolean, desc: String): Boolean {
        if (!Settings.COMMENT_COPY.boolean) return false
        if (!Settings.COMMENT_COPY_ENHANCE.boolean) return true
        val topActivity = ApplicationDelegate.requireTopActivity()
        val allDesc = if (Versions.ge7_39_0() && topActivity is UnitedBizDetailsActivity) {
            val view = ViewUniteReplyHook.viewUniteMap[topActivity.hashCode()]
            if (view != null) {
                val introTab = view.tab.tabModuleList.find { it.hasIntroduction() }?.introduction
                if (introTab != null) {
                    val modules = introTab.modulesList
                    val headline = modules.find { it.hasHeadLine() }?.headLine
                    val intro = modules.find { it.hasUgcIntroduction() }?.ugcIntroduction
                    if (headline != null && intro != null) {
                        buildSpannedString {
                            bold { appendLine("标题：") }
                            appendLine(headline.content).appendLine()
                            bold { appendLine("BV号：") }
                            appendLine(view.arc.bvid).appendLine()
                            bold { appendLine("封面：") }
                            clickable(0xFF2196F3.toInt(), onClick = {
                                Utils.async { Utils.saveImage(view.arc.cover) }
                            }) { append("点我保存") }
                            appendLine().appendLine()
                            val introDesc = intro.descList.joinToString("") {
                                if (it.type == DescType.DescTypeAt) "@${it.text}" else it.text
                            }
                            if (introDesc.isNotEmpty()) {
                                bold { appendLine("简介：") }
                                appendLine(introDesc).appendLine()
                            }
                            val introBgm = intro.bgmList.joinToString("\n") { m ->
                                m.author.let { if (it.isEmpty()) m.title else "${m.title} - $it" }
                            }
                            if (introBgm.isNotEmpty()) {
                                bold { appendLine("BGM：") }
                                appendLine(introBgm).appendLine()
                            }
                            val introTags = intro.tagsList.joinToString(" ") { it.name }
                            if (introTags.isNotEmpty()) {
                                bold { appendLine("标签：") }
                                appendLine(introTags).appendLine()
                            }
                        }.removeSuffix("\n\n")
                    } else desc
                } else desc
            } else desc
        } else {
            val view = ViewUniteReplyHook.viewMap[topActivity.hashCode()]
            if (view != null) {
                buildSpannedString {
                    bold { appendLine("标题：") }
                    appendLine(view.arc.title).appendLine()
                    bold { appendLine("BV号：") }
                    appendLine(view.bvid).appendLine()
                    bold { appendLine("封面：") }
                    clickable(0xFF2196F3.toInt(), onClick = {
                        Utils.async { Utils.saveImage(view.arc.pic) }
                    }) { append("点我保存") }
                    appendLine().appendLine()
                    val introDesc = view.arc.desc
                    if (desc.isNotEmpty()) {
                        bold { appendLine("简介：") }
                        appendLine(introDesc).appendLine()
                    }
                    val introBgm = view.bgmList.joinToString("\n") { m ->
                        m.author.let { if (it.isEmpty()) m.title else "${m.title} - $it" }
                    }
                    if (introBgm.isNotEmpty()) {
                        bold { appendLine("BGM：") }
                        appendLine(introBgm).appendLine()
                    }
                    val introTags = view.descTagList.joinToString(" ") { it.name }
                    if (introTags.isNotEmpty()) {
                        bold { appendLine("标签：") }
                        appendLine(introTags).appendLine()
                    }
                }.removeSuffix("\n\n")
            } else desc
        }
        showCopyDialog(topActivity, allDesc) { v ->
            setClipboardContent(label = "text", v)
            Toasts.showShortWithId("biliroaming_copy_success")
        }
        return true
    }

    @JvmStatic
    fun onDynamicLongClick(listener: OnLongClickOriginListener, view: View): Boolean {
        if (!Settings.COMMENT_COPY.boolean) return false
        if (!Settings.COMMENT_COPY_ENHANCE.boolean) return true
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

    @JvmStatic
    fun onCommentLongClick(
        listener: OnLongClickOriginListener,
        view: View,
        idName: String
    ): Boolean {
        if (!Settings.COMMENT_COPY.boolean) return false
        if (!Settings.COMMENT_COPY_ENHANCE.boolean) return true
        val resId = Utils.getResId(idName, "id")
        val textView = view.findViewById<TextView>(resId) ?: return false
        val text = textView.getFirstFieldByExactType<CharSequence>()
        showCopyDialog(textView.context, text) {
            listener.onLongClick_Origin(view)
        }
        return true
    }

    @JvmStatic
    fun onConversationCopy(
        activity: Activity,
        message: BaseTypedMessage<*>,
        popupWindow: PopupWindow
    ): Boolean {
        if (!Settings.COMMENT_COPY_ENHANCE.boolean) return false
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
            .show()
        (alertDialog.findViewById<TextView>(android.R.id.message)).run {
            setTextIsSelectable(true)
            movementMethod = LinkMovementMethod.getInstance()
        }
    }
}
