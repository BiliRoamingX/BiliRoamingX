package app.revanced.patches.bilibili.misc.settings.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.removeInstruction
import app.revanced.patcher.extensions.InstructionExtensions.replaceInstruction
import app.revanced.patcher.fingerprint.MethodFingerprint
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod
import app.revanced.patches.bilibili.misc.settings.fingerprints.*
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction35c

@Patch(
    name = "Fix preference click",
    description = "HD版本修复Preference点击问题",
    compatiblePackages = [CompatiblePackage(name = "tv.danmaku.bilibilihd")],
)
class HdPreferenceClickFixPatch : BytecodePatch(
    setOf(
        HdOnSettingsClickFingerprint,
        HdOnWatchLaterClickFingerprint,
        HdOnImClickFingerprint,
        HdOnContactClickFingerprint,
        HdOnCourseClickFingerprint,
    )
) {
    override fun execute(context: BytecodeContext) {
        fun MutableMethod.patch() {
            val (index, rC, rD) = implementation!!.instructions.withIndex().firstNotNullOf { (index, inst) ->
                if (inst.opcode == Opcode.INVOKE_VIRTUAL && inst is BuilderInstruction35c
                    && inst.reference.toString() == "Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;"
                ) Triple(index, inst.registerC, inst.registerD) else null
            }
            // show to remove
            replaceInstruction(
                index, """
                invoke-virtual {v$rC, v$rD}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;
            """.trimIndent()
            )
            // remove goto instruction
            removeInstruction(index + 1)
        }

        fun MethodFingerprint.patch() =
            result?.mutableMethod?.patch() ?: throw exception

        arrayOf(
            HdOnSettingsClickFingerprint,
            HdOnWatchLaterClickFingerprint,
            HdOnImClickFingerprint,
            HdOnContactClickFingerprint,
            HdOnCourseClickFingerprint,
        ).forEach { it.patch() }
    }
}
