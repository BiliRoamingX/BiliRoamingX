package app.revanced.patches.bilibili.misc.protobuf.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "Comment word search url",
    description = "屏蔽评论关键词搜索功能",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object CommentReplyUrlPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        context.findClass("Lcom/bapis/bilibili/main/community/reply/v1/Content;")
            ?.mutableClass?.methods?.find { it.name == "internalGetUrls" }?.addInstruction(
                0, """
                invoke-static {p0}, Lapp/revanced/bilibili/patches/CommentReplyUrlPatch;->filterUrls(Lcom/bapis/bilibili/main/community/reply/v1/Content;)V
            """.trimIndent()
            ) ?: throw PatchException("can not found internalGetUrls method")
    }
}
