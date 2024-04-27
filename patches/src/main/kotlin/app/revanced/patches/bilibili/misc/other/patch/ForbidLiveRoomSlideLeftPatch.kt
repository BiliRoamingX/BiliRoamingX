package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.LiveRoomTouchDispatchViewModelFingerprint
import app.revanced.util.exception

@Patch(
    name = "Forbid live room slide left",
    description = "禁止直播间向左滑动弹出抽屉",
    compatiblePackages = [CompatiblePackage(name = "tv.danmaku.bili"), CompatiblePackage(name = "com.bilibili.app.in")]
)
object ForbidLiveRoomSlideLeftPatch :
    BytecodePatch(setOf(LiveRoomTouchDispatchViewModelFingerprint)) {
    override fun execute(context: BytecodeContext) {
        LiveRoomTouchDispatchViewModelFingerprint.result?.mutableClass?.methods?.find {
            it.parameterTypes.isEmpty() && it.returnType == "V" && it.name != "<clinit>" && it.name != "<init>"
        }?.addInstructionsWithLabels(
            0, """
            invoke-static {}, Lapp/revanced/bilibili/patches/LiveRoomPatch;->disableSlideLeft()Z
            move-result v0
            if-eqz v0, :do_nothing
            return-void
            :do_nothing
            nop
        """.trimIndent()
        ) ?: throw LiveRoomTouchDispatchViewModelFingerprint.exception
    }
}
