package app.revanced.patches.bilibili.misc.json.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod
import app.revanced.patches.bilibili.misc.json.fingerprints.JSONFingerprint
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction11x

@Patch(
    name = "Json",
    description = "通用阿里Fastjson反序列化数据修改",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object JSONPatch : BytecodePatch(setOf(JSONFingerprint)) {
    override fun execute(context: BytecodeContext) {
        val clazz = JSONFingerprint.result?.mutableClass
            ?: throw JSONFingerprint.exception
        val parseObject = if (clazz.type.endsWith("/JSON;")) "parseObject" else "a"
        fun MutableMethod.hookParseObject() {
            val (index, inst) = implementation!!.instructions.withIndex().last { (_, inst) ->
                inst.opcode == Opcode.RETURN_OBJECT
            }
            val register = (inst as BuilderInstruction11x).registerA
            addInstructions(
                index, """
                invoke-static {v$register}, Lapp/revanced/bilibili/patches/json/JSONPatch;->parseObjectHook(Ljava/lang/Object;)Ljava/lang/Object;
                move-result-object v$register
            """.trimIndent()
            )
        }
        clazz.methods.find { m ->
            m.name == parseObject && m.parameterTypes == listOf(
                "Ljava/lang/String;", "Ljava/lang/reflect/Type;", "I", "[Lcom/alibaba/fastjson/parser/Feature;"
            )
        }?.hookParseObject()
        clazz.methods.find { m ->
            m.name == parseObject && m.parameterTypes == listOf(
                "Ljava/lang/String;", "Ljava/lang/reflect/Type;", "[Lcom/alibaba/fastjson/parser/Feature;"
            )
        }?.hookParseObject()
        clazz.methods.find { m ->
            m.name == parseObject && m.parameterTypes == listOf("Ljava/lang/String;", "Ljava/lang/Class;")
        }?.hookParseObject()

        clazz.methods.find { m ->
            m.name == "parseArray" && m.parameterTypes == listOf("Ljava/lang/String;", "Ljava/lang/Class;")
        }?.run {
            val insetIndex = implementation!!.instructions.indexOfLast {
                it.opcode == Opcode.RETURN_OBJECT
            }
            addInstructions(
                insetIndex, """
                invoke-static {p1, v0}, Lapp/revanced/bilibili/patches/json/JSONPatch;->parseArrayHook(Ljava/lang/Class;Ljava/util/ArrayList;)V
            """.trimIndent()
            )
        }
    }
}
