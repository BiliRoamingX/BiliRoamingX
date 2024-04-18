package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.AttachChannelInfoFingerprint
import app.revanced.patches.bilibili.misc.other.fingerprints.MainCommonServiceImplFingerprint
import app.revanced.patches.bilibili.utils.className
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.Opcode

@Patch(
    name = "Upgrade",
    description = "自定义更新辅助补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object UpgradePatch : BytecodePatch(setOf(AttachChannelInfoFingerprint, MainCommonServiceImplFingerprint)) {
    override fun execute(context: BytecodeContext) {
        AttachChannelInfoFingerprint.result?.mutableMethod?.addInstructions(
            0, "return-void"
        ) ?: throw AttachChannelInfoFingerprint.exception
        MainCommonServiceImplFingerprint.result?.classDef?.methods?.find {
            it.returnType == "V" && it.parameterTypes == listOf("Landroid/app/Activity;")
        }?.let { m ->
            context.findClass(
                "Lapp/revanced/bilibili/settings/fragments/AboutFragment;"
            )!!.mutableClass.run {
                methods.first { it.name == "<init>" }.run {
                    val returnIndex = implementation!!.instructions.indexOfFirst {
                        it.opcode == Opcode.RETURN_VOID
                    }
                    val field = fields.first { it.name == "checkUpdateMethod" }
                    addInstructions(
                        returnIndex, """
                        const-string v0, "${m.definingClass.className}#${m.name}"
                        iput-object v0, p0, $field
                    """.trimIndent()
                    )
                }
            }
        } ?: throw MainCommonServiceImplFingerprint.exception
    }
}
