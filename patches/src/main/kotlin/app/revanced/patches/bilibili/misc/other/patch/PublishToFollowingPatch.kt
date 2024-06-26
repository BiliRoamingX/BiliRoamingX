package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.PublishToFollowingConfigFingerprint

@Patch(
    name = "Disable auto select",
    description = "禁止自动转到动态",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object PublishToFollowingPatch : BytecodePatch(setOf(PublishToFollowingConfigFingerprint)) {
    override fun execute(context: BytecodeContext) {
        PublishToFollowingConfigFingerprint.result?.mutableClass?.methods?.find { m ->
            m.name == "<init>" && m.parameterTypes.let { ts -> ts.size == 4 && ts.all { it == "Z" } }
        }?.addInstructions(
            0, """
            invoke-static {p3}, Lapp/revanced/bilibili/patches/SettingsTransfer;->shouldAutoSelectOnce(Z)Z
            move-result p3
        """.trimIndent()
        )
    }
}
