package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod.Companion.toMutable
import app.revanced.patches.bilibili.utils.Method
import app.revanced.patches.bilibili.utils.MethodImplementation
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.value.StringEncodedValue

@Patch(
    name = "Channel model fix",
    description = "频道相关 model 类构造修复(官方 BUG)",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object ChannelModelFixPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        val fieldsNames = setOf("stick", "normal", "scaned", "config")
        val modelClassDef = context.classes.find { c ->
            c.fields.mapNotNull { f ->
                f.annotations.find { it.type == "Lcom/alibaba/fastjson/annotation/JSONField;" }
            }.mapNotNull {
                it.elements.firstNotNullOfOrNull { e ->
                    if (e.name == "name")
                        (e.value as StringEncodedValue).value
                    else null
                }
            }.toSet() == fieldsNames
        } ?: throw PatchException("not found channel model class")
        context.classes.filter {
            it.type.startsWith("${modelClassDef.removeSuffix(";")}$")
        }.forEach { c ->
            context.proxy(c).mutableClass.run {
                if (methods.none { it.name == "<init>" && it.parameterTypes.isEmpty() }) {
                    Method(
                        definingClass = type,
                        name = "<init>",
                        returnType = "V",
                        accessFlags = AccessFlags.PUBLIC.value or AccessFlags.CONSTRUCTOR.value,
                        implementation = MethodImplementation(registerCount = 1),
                    ).toMutable().apply {
                        addInstructions(
                            0, """
                            invoke-direct {p0}, Ljava/lang/Object;-><init>()V
                            return-void
                        """.trimIndent()
                        )
                    }.also { methods.add(it) }
                }
            }
        }
    }
}
