package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.FavFolderOnDataSuccessFingerprint
import app.revanced.patches.bilibili.misc.other.fingerprints.FavFolderOnDataSuccessNewFingerprint
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction35c

@Patch(
    name = "Forbid auto subscribe",
    description = "禁止自动勾选订阅合集",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object FavFolderDialogPatch : BytecodePatch(
    setOf(
        FavFolderOnDataSuccessFingerprint,
        FavFolderOnDataSuccessNewFingerprint
    )
) {
    override fun execute(context: BytecodeContext) {
        arrayOf(
            FavFolderOnDataSuccessFingerprint,
            FavFolderOnDataSuccessNewFingerprint
        ).mapNotNull { it.result }.forEach {
            it.mutableMethod.run {
                val (register, insertIndex) = implementation!!.instructions.withIndex()
                    .firstNotNullOfOrNull { (index, inst) ->
                        if (inst.opcode == Opcode.INVOKE_VIRTUAL && inst is BuilderInstruction35c
                            && inst.reference.toString() == "Landroid/widget/CheckBox;->setChecked(Z)V"
                        ) (inst.registerD to index) else null
                    } ?: return@run
                addInstructions(
                    insertIndex, """
                    invoke-static {v$register}, Lapp/revanced/bilibili/patches/SettingsTransfer;->shouldAutoSubscribe(Z)Z
                    move-result v$register
                """.trimIndent()
                )
            }
        }
    }
}
