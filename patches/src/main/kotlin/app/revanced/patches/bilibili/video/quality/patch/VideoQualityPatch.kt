package app.revanced.patches.bilibili.video.quality.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.patches.bilibili.video.quality.fingerprints.PlayerSettingHelperFingerprint
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.iface.Method

@Patch(
    name = "Video default quality",
    description = "视频默认画质设置",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object VideoQualityPatch : BytecodePatch(setOf(PlayerSettingHelperFingerprint)) {
    override fun execute(context: BytecodeContext) {
        var defaultQnMethod: Method? = null
        PlayerSettingHelperFingerprint.result?.also {
            defaultQnMethod = it.method
        }?.mutableMethod?.addInstructionsWithLabels(
            0, """
            invoke-static {}, Lapp/revanced/bilibili/patches/VideoQualityPatch;->getMatchedFullScreenQuality()I
            move-result v0
            if-eqz v0, :jump
            return v0
            :jump
            nop
        """.trimIndent()
        ) ?: throw PlayerSettingHelperFingerprint.exception
        context.findClass("Lapp/revanced/bilibili/patches/VideoQualityPatch;")!!.mutableClass.run {
            methods.first { it.name == "defaultQn" }.also { methods.remove(it) }
                .cloneMutable(registerCount = 1, clearImplementation = true).apply {
                    addInstructions(
                        """
                        invoke-static {}, $defaultQnMethod
                        move-result v0
                        return v0
                    """.trimIndent()
                    )
                }.also { methods.add(it) }
        }
    }
}
