package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.extensions.InstructionExtensions.getInstruction
import app.revanced.patcher.extensions.InstructionExtensions.getInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.CommentConfigFingerprint
import app.revanced.patches.bilibili.utils.classDescriptor
import app.revanced.patches.bilibili.utils.isAbstract
import app.revanced.util.getReference
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.reference.FieldReference

@Patch(
    name = "Force comment time navigable",
    description = "允许分P及交互视频评论时间点可点击",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object ForceCommentNavigablePatch : BytecodePatch(fingerprints = setOf(CommentConfigFingerprint)) {
    override fun execute(context: BytecodeContext) {
        val primaryCommentMainFragmentType =
            "com.bilibili.app.comm.comment2.comments.view.PrimaryCommentMainFragment".classDescriptor
        val patchType = "app.revanced.bilibili.patches.ForceCommentNavigablePatch".classDescriptor
        val baseFragmentType = "com.bilibili.lib.ui.BaseFragment".classDescriptor
        context.findClass(primaryCommentMainFragmentType)?.mutableClass?.methods?.first {
            it.name == "onCreate" && it.parameterTypes == listOf("Landroid/os/Bundle;")
        }?.addInstructions(
            0, """
            invoke-static {p0}, $patchType->onPrimaryCommentMainFragmentCreate($baseFragmentType)V
        """.trimIndent()
        ) ?: throw PatchException("not found PrimaryCommentMainFragment")
        CommentConfigFingerprint.result?.run {
            val index = scanResult.stringsScanResult!!.matches.last().index
            val seekEnabledField = mutableMethod.getInstructions().withIndex().firstNotNullOf { (i, inst) ->
                if (i > index && inst.opcode == Opcode.IGET_BOOLEAN) {
                    inst.getReference<FieldReference>()
                } else null
            }
            mutableClass.methods.first { m ->
                m.parameterTypes.isEmpty() && m.returnType == "Z" && !m.accessFlags.isAbstract()
                        && m.getInstruction(0).let {
                    if (it.opcode == Opcode.IGET_BOOLEAN) it.getReference<FieldReference>() else null
                } == seekEnabledField
            }.addInstructionsWithLabels(
                0, """
                invoke-static {}, $patchType->enabled()Z
                move-result v0
                if-eqz v0, :jump
                const/4 v0, 0x1
                return v0
                :jump
                nop
            """.trimIndent()
            )
        }
    }
}
