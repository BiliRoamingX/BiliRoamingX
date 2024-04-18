package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "Forbid switch live room",
    description = "禁止上下滑动切换直播间",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object ForbidSwitchLiveRoomPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        context.findClass("Lcom/bilibili/bililive/room/ui/roomv3/vertical/widget/LiveVerticalPagerView;")?.run {
            immutableClass.fields.firstNotNullOfOrNull { f ->
                context.findClass(f.type)?.let { c ->
                    if (c.immutableClass.superclass == "Landroidx/recyclerview/widget/RecyclerView;") c
                    else null
                }
            }?.mutableClass?.methods?.find { it.name == "onInterceptTouchEvent" }?.addInstructionsWithLabels(
                0, """
                    invoke-static {}, Lapp/revanced/bilibili/patches/LiveRoomPatch;->forbidSwitchLiveRoom()Z
                    move-result v0
                    if-eqz v0, :jump
                    const/4 v0, 0x0
                    return v0
                    :jump
                    nop
                    """.trimIndent()
            )
        } ?: throw PatchException("not found LivePagerRecyclerView class")
    }
}
