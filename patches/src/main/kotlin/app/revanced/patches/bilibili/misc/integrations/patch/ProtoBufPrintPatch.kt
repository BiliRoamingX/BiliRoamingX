package app.revanced.patches.bilibili.misc.integrations.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.extensions.InstructionExtensions.replaceInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.utils.args
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.patches.bilibili.utils.toClassDef
import app.revanced.util.getReference
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.FiveRegisterInstruction
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

@Patch(
    name = "ProtoBuf print",
    description = "使 ProtoBuf toString 打印更具可读性",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object ProtoBufPrintPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        val toStringClass = context.findClass("Lcom/google/protobuf/MessageLiteToString;")!!
        val toStringExClass = "Lcom/google/protobuf/MessageLiteToStringEx;".toClassDef(context)
        val unknownFieldSetLiteClass = context.findClass("Lcom/google/protobuf/UnknownFieldSetLite;")!!
        val exToStringMethod = toStringExClass.methods.first { it.name == "toString" }
        val exPrintFieldMethod = toStringExClass.methods.first { it.name == "printField" }
        toStringClass.mutableClass.methods.run {
            first { it.name == exToStringMethod.name }.also { remove(it) }
                .cloneMutable(2, clearImplementation = true).apply {
                    addInstructions(
                        """
                        invoke-static {p0, p1}, $exToStringMethod
                        move-result-object p0
                        return-object p0
                    """.trimIndent()
                    )
                }.also { add(it) }
            first { it.name == exPrintFieldMethod.name }.also { remove(it) }
                .cloneMutable(4, clearImplementation = true).apply {
                    addInstructions(
                        """
                        invoke-static {p0, p1, p2, p3}, $exPrintFieldMethod
                        return-void
                        """.trimIndent()
                    )
                }.also { add(it) }
        }
        unknownFieldSetLiteClass.mutableClass.methods.first { it.name == "printWithIndent" }.run {
            val (printIndex, printInst) = implementation!!.instructions.withIndex()
                .firstNotNullOf { (index, inst) ->
                    if (inst.opcode == Opcode.INVOKE_STATIC && inst is FiveRegisterInstruction && inst.getReference<MethodReference>().name == "printField") {
                        index to inst
                    } else null
                }
            if (printIndex != -1) {
                replaceInstruction(
                    printIndex, """
                    invoke-static {${printInst.args()}}, $exPrintFieldMethod
                """.trimIndent()
                )
            }
        }
    }
}
