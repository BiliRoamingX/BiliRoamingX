package app.revanced.patches.bilibili.misc.copy.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.copy.fingerprints.*
import app.revanced.patches.bilibili.patcher.patch.MultiMethodBytecodePatch
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.patches.bilibili.utils.exception
import app.revanced.patches.bilibili.utils.proxy
import app.revanced.util.exception

@Patch(
    name = "Copy enhance",
    description = "自由复制补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object CopyEnhancePatch : MultiMethodBytecodePatch(
    fingerprints = setOf(
        CommentCopyOldFingerprint,
        CommentCopyNewFingerprint,
        Comment3CopyFingerprint,
        Comment3DialogCopyFingerprint,
        ConversationCopyFingerprint,
    ),
    multiFingerprints = setOf(DescCopyFingerprint)
) {
    override fun execute(context: BytecodeContext) {
        super.execute(context)
        DescCopyFingerprint.result.ifEmpty {
            throw DescCopyFingerprint.exception
        }.forEach {
            it.mutableMethod.addInstructionsWithLabels(
                0, """
                invoke-static {p1, p2}, Lapp/revanced/bilibili/patches/CopyEnhancePatch;->onCopyDesc(ZLjava/lang/String;)Z
                move-result v0
                if-eqz v0, :jump
                return-void
                :jump
                nop
            """.trimIndent()
            )
        }
        val onLongClickOriginListenerType =
            "Lapp/revanced/bilibili/widget/OnLongClickOriginListener;"
        context.classes.filter {
            it.type.startsWith("Lcom/bilibili/bplus/followinglist/module/item")
                    && it.interfaces.contains("Landroid/view/View\$OnLongClickListener;")
        }.forEach { c ->
            c.proxy(context).interfaces.add(onLongClickOriginListenerType)
            c.proxy(context).methods.run {
                first { it.name == "onLongClick" }.also { m ->
                    m.cloneMutable(name = "onLongClick_Origin").also { add(it) }
                }.addInstructionsWithLabels(
                    0, """
                    invoke-static {p0, p1}, Lapp/revanced/bilibili/patches/CopyEnhancePatch;->onDynamicLongClick(${onLongClickOriginListenerType}Landroid/view/View;)Z
                    move-result v0
                    if-eqz v0, :jump
                    const/4 v0, 0x1
                    return v0
                    :jump
                    nop
                """.trimIndent()
                )
            }
        }
        listOf(
            CommentCopyOldFingerprint.result to "message",
            CommentCopyNewFingerprint.result to "comment_message",
            Comment3CopyFingerprint.result to "comment_message"
        ).apply {
            if (count { it.first != null } == 0)
                throw PatchException("CopyLongClickListener not found")
        }.forEach { (result, idName) ->
            result?.mutableClass?.interfaces?.add(onLongClickOriginListenerType)
            result?.mutableClass?.methods?.run {
                result.mutableMethod.also { m ->
                    m.cloneMutable(name = "onLongClick_Origin").also { add(it) }
                }.addInstructionsWithLabels(
                    0, """
                    const-string v0, "$idName"
                    invoke-static {p0, p1, v0}, Lapp/revanced/bilibili/patches/CopyEnhancePatch;->onCommentLongClick(${onLongClickOriginListenerType}Landroid/view/View;Ljava/lang/String;)Z
                    move-result v0
                    if-eqz v0, :jump
                    const/4 v0, 0x1
                    return v0
                    :jump
                    nop
                """.trimIndent()
                )
            }
        }
        ConversationCopyFingerprint.result?.mutableMethod?.addInstructionsWithLabels(
            0, """
            move-object/from16 v0, p8
            invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
            move-result v0
            if-eqz v0, :jump
            move-object/from16 v0, p7
            invoke-static {p0, p2, v0}, Lapp/revanced/bilibili/patches/CopyEnhancePatch;->onConversationCopy(Landroid/app/Activity;Lcom/bilibili/bplus/im/business/model/BaseTypedMessage;Landroid/widget/PopupWindow;)Z
            move-result v0
            if-eqz v0, :jump
            return-void
            :jump
            nop
        """.trimIndent()
        ) ?: throw ConversationCopyFingerprint.exception
        Comment3DialogCopyFingerprint.result?.run {
            mutableMethod.cloneMutable(registerCount = 3, clearImplementation = true).apply {
                mutableMethod.name += "_Origin"
                addInstructionsWithLabels(
                    0, """
                    const-string v0, "${mutableMethod.name}"
                    invoke-static {p0, p1, v0}, Lapp/revanced/bilibili/patches/CopyEnhancePatch;->onCommentMenuItemClick(Ljava/lang/Object;Ljava/lang/Enum;Ljava/lang/String;)Z
                    move-result v0
                    if-eqz v0, :call_origin_method
                    return-void
                    :call_origin_method
                    invoke-virtual {p0, p1}, $mutableMethod
                    return-void
                """.trimIndent()
                )
            }.also { mutableClass.methods.add(it) }
        }
    }
}
