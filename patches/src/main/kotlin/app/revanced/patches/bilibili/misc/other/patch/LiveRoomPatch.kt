package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction35c

@Patch(
    name = "Disable live room double click",
    description = "禁用直播间双击点赞",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object LiveRoomPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        context.findClass("Lcom/bilibili/bililive/room/ui/roomv3/player/container/LiveRoomPlayerContainerView;")
            ?.mutableClass?.run {
                methods.find { it.name == "onDoubleTap" }?.addInstructionsWithLabels(
                    0, """
                    invoke-static {p0}, Lapp/revanced/bilibili/patches/LiveRoomPatch;->onDoubleTap(${this.type})Z
                    move-result v0
                    if-eqz v0, :jump
                    const/4 v0, 0x1
                    return v0
                    :jump
                    nop
                """.trimIndent()
                )
                val info = methods.firstNotNullOfOrNull { m ->
                    val index = m.implementation?.instructions?.indexOfFirst {
                        it is Instruction35c && it.reference.toString() ==
                                "Landroid/os/SystemClock;->elapsedRealtime()J"
                    }
                    if (index != null && index != -1) m to index + 2 else null
                }
                if (info != null) {
                    val (m, insertIndex) = info
                    m.addInstructionsWithLabels(
                        insertIndex, """
                        invoke-static {}, Lapp/revanced/bilibili/patches/LiveRoomPatch;->disableLiveRoomDoubleClick()Z
                        move-result v3
                        if-eqz v3, :jump
                        return-void
                        :jump
                        nop
                    """.trimIndent()
                    )
                }
            } ?: throw PatchException("not found LiveRoomPlayerContainerView class")
    }
}
