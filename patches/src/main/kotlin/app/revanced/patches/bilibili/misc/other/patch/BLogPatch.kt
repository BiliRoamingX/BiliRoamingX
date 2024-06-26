package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.LogcatAdapterFingerprint
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.util.exception

@Patch(
    name = "BLog",
    description = "放宽日志打印级别",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object BLogPatch : BytecodePatch(setOf(LogcatAdapterFingerprint)) {
    override fun execute(context: BytecodeContext) {
        LogcatAdapterFingerprint.result?.mutableClass?.methods?.run {
            val origMethod = first { it.returnType == "Z" && it.parameterTypes == listOf("I", "Ljava/lang/String;") }
            origMethod.cloneMutable(registerCount = 4, clearImplementation = true).apply {
                origMethod.name += "_Origin"
                addInstructionsWithLabels(
                    0, """
                    invoke-static {}, Lapp/revanced/bilibili/patches/SettingsTransfer;->debuggable()Z
                    move-result v0
                    if-eqz v0, :jump
                    goto :return
                    :jump
                    invoke-virtual {p0, p1, p2}, $origMethod
                    move-result v0
                    :return
                    return v0
                """.trimIndent()
                )
            }.also { add(it) }
        } ?: throw LogcatAdapterFingerprint.exception
    }
}
