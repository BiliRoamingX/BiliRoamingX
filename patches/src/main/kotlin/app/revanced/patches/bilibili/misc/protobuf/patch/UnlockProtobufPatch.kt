package app.revanced.patches.bilibili.misc.protobuf.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.replaceInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.utils.toPublic
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction35c

@Patch(
    name = "Unlock ProtoBuf",
    description = "公开ProtoBuf实体构建方法",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object UnlockProtobufPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        val methodNameRegex = Regex("""^((set|add|remove|clear|merge|getMutable)\w+)|<init>$""")
        context.classes.filter { it.superclass == "Lcom/google/protobuf/GeneratedMessageLite;" }
            .flatMap { context.proxy(it).mutableClass.methods }.forEach { m ->
                // step 1, private to public
                if (AccessFlags.PRIVATE.isSet(m.accessFlags)
                    && !AccessFlags.STATIC.isSet(m.accessFlags)
                    && m.name.matches(methodNameRegex)
                ) m.accessFlags = m.accessFlags.toPublic()
                else if (AccessFlags.SYNTHETIC.isSet(m.accessFlags) && m.returnType.let { it == "V" || it == "Ljava/util/Map;" }) {
                    val inst = m.implementation!!.instructions[0]
                    // step 2, invoke-direct to invoke-virtual
                    if (inst.opcode == Opcode.INVOKE_DIRECT) {
                        inst as BuilderInstruction35c
                        val args = arrayOf(
                            inst.registerC, inst.registerD, inst.registerE, inst.registerF, inst.registerG
                        ).take(inst.registerCount).joinToString { "v$it" }
                        m.replaceInstruction(
                            0, """
                                invoke-virtual {$args}, ${inst.reference}
                            """.trimIndent()
                        )
                    }
                }
            }
    }
}
