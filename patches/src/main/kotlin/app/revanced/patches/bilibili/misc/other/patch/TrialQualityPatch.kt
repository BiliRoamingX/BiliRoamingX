package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.QualityViewHolderFingerprint
import app.revanced.patches.bilibili.patcher.patch.MultiMethodBytecodePatch
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.patches.bilibili.utils.exception

@Patch(
    name = "Trial quality",
    description = "试用画质辅助补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object TrialQualityPatch : MultiMethodBytecodePatch(
    multiFingerprints = setOf(QualityViewHolderFingerprint)
) {
    override fun execute(context: BytecodeContext) {
        super.execute(context)
        val patchMethod = context.findClass("Lapp/revanced/bilibili/patches/TrialQualityPatch;")!!
            .mutableClass.methods.first { it.name == "onBindOnline" }
        QualityViewHolderFingerprint.result.associate { r ->
            r.mutableClass.methods to r.mutableClass.methods.first { m ->
                m.parameterTypes.let { it.size == 5 && it[1] == "Z" && it[3] == "Landroid/widget/TextView;" && it[4] == "Landroid/widget/TextView;" }
            }
        }.ifEmpty {
            throw QualityViewHolderFingerprint.exception
        }.forEach { (methods, method) ->
            val originMethod = method.cloneMutable(name = method.name + "_Origin")
                .also { methods.add(it) }
            method.also { methods.remove(it) }.cloneMutable(registerCount = 6, clearImplementation = true).apply {
                addInstructions(
                    """
                    invoke-direct/range {p0 .. p5}, $originMethod
                    invoke-static {p2, p4, p5}, $patchMethod
                    return-void
                """.trimIndent()
                )
            }.also { methods.add(it) }
        }
    }
}
