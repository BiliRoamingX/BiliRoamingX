package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction11n
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction22c
import com.android.tools.smali.dexlib2.iface.reference.FieldReference

@Patch(
    name = "Text fold",
    description = "文本折叠控制",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object TextFoldPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        context.findClass("Lcom/bapis/bilibili/main/community/reply/v1/ReplyControl;")
            ?.mutableClass?.methods?.find { it.name == "getMaxLine" }?.run {
                addInstructions(
                    implementation!!.instructions.size - 1, """
                        invoke-static/range {v0 .. v1}, Lapp/revanced/bilibili/patches/TextFoldPatch;->getCommentMaxLines(J)J
                        move-result-wide v0
                    """.trimIndent()
                )
            }
        context.findClass("Lcom/bilibili/bplus/followingcard/widget/EllipsizingTextView;")?.mutableClass?.run {
            methods.first { it.name == "setMaxLines" }.addInstructions(
                0, """
                invoke-static {p1}, Lapp/revanced/bilibili/patches/TextFoldPatch;->getDynMaxLines(I)I
                move-result p1
            """.trimIndent()
            )
            methods.first { it.name == "<init>" && it.parameterTypes.size == 3 }.run {
                val const4Index = implementation!!.instructions.indexOfFirst {
                    it.opcode == Opcode.CONST_4 && it is BuilderInstruction11n && it.wideLiteral == 0x4L
                }
                val maxLinesField = implementation!!.instructions.withIndex().firstNotNullOfOrNull { (index, value) ->
                    if (index > const4Index && value.opcode == Opcode.IPUT && value is BuilderInstruction22c) {
                        value.reference as FieldReference
                    } else null
                } ?: throw PatchException("not found EllipsizingTextView#maxLines field")
                addInstructions(
                    implementation!!.instructions.size - 1, """
                    const/4 p1, 0x4
                    invoke-static {p1}, Lapp/revanced/bilibili/patches/TextFoldPatch;->getDynMaxLines(I)I
                    move-result p1
                    iput p1, p0, $maxLinesField
                """.trimIndent()
                )
            }
            val linesToAllField = methods.firstNotNullOfOrNull { m ->
                if (m.implementation?.instructions?.map { it.opcode } == listOf(
                        Opcode.IGET,
                        Opcode.IF_LTZ,
                        Opcode.IF_LE,
                        Opcode.IGET_OBJECT,
                        Opcode.RETURN_OBJECT,
                        Opcode.IGET_OBJECT,
                        Opcode.RETURN_OBJECT,
                    )
                ) {
                    m.implementation!!.instructions.first { it.opcode == Opcode.IGET }.let {
                        it as BuilderInstruction22c; it.reference as FieldReference
                    }
                } else null
            } ?: throw PatchException("not found EllipsizingTextView#linesToAll field")
            val setLineToAllCountMethod = methods.first { m ->
                m.parameterTypes == listOf("I") && m.implementation?.instructions?.let { inst ->
                    inst.size == 2 && inst[0].let { it.opcode == Opcode.IPUT && (it as BuilderInstruction22c).reference == linesToAllField }
                            && inst[1].opcode == Opcode.RETURN_VOID
                } ?: false
            }
            setLineToAllCountMethod.addInstructions(
                0, """
                invoke-static {p1}, Lapp/revanced/bilibili/patches/TextFoldPatch;->getDynLinesToAll(I)I
                move-result p1
            """.trimIndent()
            )
        } ?: throw PatchException("not found EllipsizingTextView class")
    }
}
