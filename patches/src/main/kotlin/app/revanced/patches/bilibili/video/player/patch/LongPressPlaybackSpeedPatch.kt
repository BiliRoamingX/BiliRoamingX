package app.revanced.patches.bilibili.video.player.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.patcher.patch.MultiMethodBytecodePatch
import app.revanced.patches.bilibili.utils.exception
import app.revanced.patches.bilibili.video.player.fingerprints.TripleSpeedServiceFingerprint
import app.revanced.patches.bilibili.video.player.fingerprints.TripleSpeedServiceUniteFingerprint
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction35c
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

@Patch(
    name = "Long press playback speed",
    description = "自定义播放器长按播放速度",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object LongPressPlaybackSpeedPatch : MultiMethodBytecodePatch(
    fingerprints = setOf(TripleSpeedServiceUniteFingerprint),
    multiFingerprints = setOf(TripleSpeedServiceFingerprint),
) {
    override fun execute(context: BytecodeContext) {
        super.execute(context)
        TripleSpeedServiceFingerprint.result.mapNotNull { r ->
            r.method.implementation!!.instructions.firstNotNullOfOrNull { inst ->
                if (inst is Instruction35c && inst.opcode == Opcode.INVOKE_DIRECT) {
                    (inst.reference as MethodReference).takeIf {
                        it.returnType == "V" && it.parameterTypes == listOf("F")
                    }
                } else null
            }?.let { r.mutableClass.methods.first { m -> m == it } }
        }.ifEmpty {
            throw TripleSpeedServiceFingerprint.exception
        }.forEach {
            it.addInstructions(
                0, """
                invoke-static {p1}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->longPressSpeed(F)F
                move-result p1
            """.trimIndent()
            )
        }
        TripleSpeedServiceUniteFingerprint.result?.mutableClass?.methods?.first { m ->
            m.name == "<init>" && m.parameterTypes.let { it.size == 4 && it[1] == "F" }
        }?.addInstructions(
            0, """
            invoke-static {p2}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->longPressSpeed(F)F
            move-result p2
        """.trimIndent()
        )
    }
}
