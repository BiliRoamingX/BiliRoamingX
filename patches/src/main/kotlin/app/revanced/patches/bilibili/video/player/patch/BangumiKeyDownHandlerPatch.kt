package app.revanced.patches.bilibili.video.player.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.replaceInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.video.player.fingerprints.BangumiKeyDownHandlerFingerprint
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.Opcode

@Patch(
    name = "Enable Key mapping",
    description = "HD版启用番剧页面键盘按键映射",
    compatiblePackages = [CompatiblePackage(name = "tv.danmaku.bilibilihd")]
)
object BangumiKeyDownHandlerPatch : BytecodePatch(setOf(BangumiKeyDownHandlerFingerprint)) {
    override fun execute(context: BytecodeContext) {
        BangumiKeyDownHandlerFingerprint.result?.mutableMethod?.run {
            val returnIndex = implementation!!.instructions.withIndex().firstNotNullOf { (index, inst) ->
                if (inst.opcode == Opcode.RETURN) index else null
            }
            replaceInstruction(returnIndex, "nop")
        } ?: throw BangumiKeyDownHandlerFingerprint.exception
    }
}
