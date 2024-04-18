package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import com.android.tools.smali.dexlib2.Opcode

@Patch(
    name = "Save comment images",
    description = "保存评论图片补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object SaveCommentImagePatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        context.findClass("Lcom/bilibili/lib/imageviewer/fragment/ImageFragment;")
            ?.mutableClass?.methods?.find { it.name == "onViewCreated" }?.run {
                val insertIndex = implementation!!.instructions.indexOfLast { it.opcode == Opcode.RETURN_VOID }
                addInstruction(
                    insertIndex, """
                    invoke-static {p0}, Lapp/revanced/bilibili/patches/CommentImagePatch;->bindClickListener(Lcom/bilibili/lib/imageviewer/fragment/ImageFragment;)V
                """.trimIndent()
                )
            } ?: throw PatchException("can not found ImageFragment#onViewCreated method")
    }
}
