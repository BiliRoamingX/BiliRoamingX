package app.revanced.patches.bilibili.video.player.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.settings.patch.SettingsResourcePatch
import app.revanced.patches.bilibili.video.player.fingerprints.PlaySpeedManagerImplFingerprint
import app.revanced.patches.bilibili.video.player.fingerprints.PlayerOnPreparedFingerprint
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction35c
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

@Patch(
    name = "Default playback speed",
    description = "自定义播放器默认播放速度",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ],
    dependencies = [SettingsResourcePatch::class]
)
object DefaultPlaybackSpeedPatch : BytecodePatch(
    setOf(PlayerOnPreparedFingerprint, PlaySpeedManagerImplFingerprint)
) {
    override fun execute(context: BytecodeContext) {
        PlayerOnPreparedFingerprint.result?.mutableMethod?.run {
            val instructions = implementation!!.instructions
            val (index, register) = instructions.withIndex().firstNotNullOfOrNull { (index, inst) ->
                if (inst.opcode == Opcode.INVOKE_VIRTUAL && ((inst as BuilderInstruction35c).reference as MethodReference)
                        .let { it.parameterTypes == listOf("F") && it.returnType == "V" }
                ) index to inst.registerD else null
            } ?: throw PatchException("not found updateSpeed method")
            addInstructions(
                index, """
                invoke-static {p1, v$register}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->defaultSpeed(Ltv/danmaku/ijk/media/player/IMediaPlayer;F)F
                move-result v$register
            """.trimIndent()
            )
        } ?: throw PlayerOnPreparedFingerprint.exception
        if (!SettingsResourcePatch.isHd) {
            PlaySpeedManagerImplFingerprint.result?.mutableMethod?.run {
                addInstructions(
                    2, """
                    invoke-static {v0}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->defaultSpeed(F)F
                    move-result v0
                """.trimIndent()
                )
            } ?: throw PlaySpeedManagerImplFingerprint.exception
        }
    }
}
