package app.revanced.patches.bilibili.misc.protobuf.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.replaceInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod
import app.revanced.patches.bilibili.utils.*
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
            .flatMap { it.proxy(context).methods }.forEach { m ->
                // step 1, private to public
                if (m.accessFlags.isPrivate()
                    && !m.accessFlags.isStatic()
                    && m.name.matches(methodNameRegex)
                ) m.accessFlags = m.accessFlags.toPublic()
                else if (m.accessFlags.isSynthetic() && m.returnType.let { it == "V" || it == "Ljava/util/Map;" }) {
                    val inst = m.implementation!!.instructions[0]
                    // step 2, invoke-direct to invoke-virtual
                    if (inst.opcode == Opcode.INVOKE_DIRECT) {
                        val args = (inst as BuilderInstruction35c).args()
                        m.replaceInstruction(
                            0, """
                                invoke-virtual {$args}, ${inst.reference}
                            """.trimIndent()
                        )
                    }
                }
            }
        // add back XXX method copy from executeXXX method
        context.classes.filter {
            it.type.startsWith("Lcom/bapis") && it.type.endsWith("Moss;")
        }.forEach { c ->
            c.proxy(context).run {
                val newMethods = mutableListOf<MutableMethod>()
                methods.forEach { m ->
                    if (m.name.startsWith("execute") && m.name.length > 7 && m.returnType != "V") {
                        val noPrefixName = m.name.substringAfter("execute").replaceFirstChar { it.lowercaseChar() }
                        m.cloneMutable(name = noPrefixName).takeIf { mm ->
                            methods.none { it == mm }
                        }?.let { newMethods.add(it) }
                    }
                }
                methods.addAll(newMethods)
            }
        }
    }
}
