package app.revanced.patches.bilibili.layout.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "Hide follow button",
    description = "不显示关注按钮",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object HideFollowButtonPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        context.findClass("Lcom/bapis/bilibili/main/community/reply/v1/ReplyControl;")
            ?.mutableClass?.methods?.find { it.name == "getShowFollowBtn" }?.run {
                addInstructions(
                    implementation!!.instructions.size - 1, """
                        invoke-static {v0}, Lapp/revanced/bilibili/patches/SettingsTransfer;->shouldShowCommentFollow(Z)Z
                        move-result v0
                    """.trimIndent()
                )
            }
        arrayOf(
            "Lcom/bapis/bilibili/app/dynamic/v2/ModuleAuthor;",
            "Lcom/bapis/bilibili/app/dynamic/v2/ModuleAuthorForward;"
        ).forEach { name ->
            context.findClass(name)?.mutableClass?.methods?.find { it.name == "getShowFollow" }?.run {
                addInstructions(
                    implementation!!.instructions.size - 1, """
                        invoke-static {v0}, Lapp/revanced/bilibili/patches/SettingsTransfer;->shouldShowDynamicFollow(Z)Z
                        move-result v0
                    """.trimIndent()
                )
            }
        }
    }
}
