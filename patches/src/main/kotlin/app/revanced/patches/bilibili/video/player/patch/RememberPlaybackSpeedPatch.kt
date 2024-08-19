package app.revanced.patches.bilibili.video.player.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.settings.patch.SettingsResourcePatch
import app.revanced.patches.bilibili.patcher.patch.MultiMethodBytecodePatch
import app.revanced.patches.bilibili.utils.exception
import app.revanced.patches.bilibili.video.player.fingerprints.PlayerSpeedChooseWidgetFingerprint

@Patch(
    name = "Remember playback speed",
    description = "记住播放速度变化",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ],
    dependencies = [SettingsResourcePatch::class]
)
object RememberPlaybackSpeedPatch : MultiMethodBytecodePatch(
    multiFingerprints = setOf(PlayerSpeedChooseWidgetFingerprint),
) {
    override fun execute(context: BytecodeContext) {
        super.execute(context)
        PlayerSpeedChooseWidgetFingerprint.result.ifEmpty {
            throw PlayerSpeedChooseWidgetFingerprint.exception
        }.forEach { r ->
            r.mutableMethod.addInstructions(
                0, """
                invoke-static {p1}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->onPlaybackSpeedSelected(F)V
            """.trimIndent()
            )
        }
    }
}
