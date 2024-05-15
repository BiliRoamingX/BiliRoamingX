package app.revanced.patches.bilibili.video.player.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.utils.removeFinal
import app.revanced.patches.bilibili.utils.toPublic
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.OneRegisterInstruction

@Patch(
    name = "Play url",
    description = "播放地址拦截处理",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object PlayUrlPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        val mediaAssetSegmentType =
            "Ltv/danmaku/ijk/media/player/IjkMediaAsset\$MediaAssertSegment;"
        context.findClass(mediaAssetSegmentType)?.mutableClass?.fields?.forEach {
            it.accessFlags = it.accessFlags.toPublic().removeFinal()
        } ?: throw PatchException("Not found MediaAssertSegment class")
        context.findClass("Ltv/danmaku/ijk/media/player/IjkMediaAsset\$MediaAssertSegment\$Builder;")
            ?.mutableClass?.methods?.find { it.name == "build" }?.run {
                val instructions = implementation!!.instructions
                val (index, register) = instructions.withIndex().firstNotNullOf { (index, inst) ->
                    if (inst.opcode == Opcode.RETURN_OBJECT) {
                        index to (inst as OneRegisterInstruction).registerA
                    } else null
                }
                addInstructions(
                    index, """
                    invoke-static {v$register}, Lapp/revanced/bilibili/patches/PlayUrlPatch;->onBuildMediaAssetSegment($mediaAssetSegmentType)V
                """.trimIndent()
                )
            } ?: throw PatchException("Not found MediaAssertSegment\$Builder#build method")
    }
}
