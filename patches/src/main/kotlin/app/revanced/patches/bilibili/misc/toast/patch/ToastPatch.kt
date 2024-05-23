package app.revanced.patches.bilibili.misc.toast.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.patches.bilibili.utils.toClassDef
import app.revanced.util.getReference
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

@Patch(
    name = "Toast",
    description = "调用APP自带Toast补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object ToastPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        val onBackPressedMethod = "Ltv/danmaku/bili/MainActivityV2;".toClassDef(context)
            .methods.find { it.name == "onBackPressed" }
            ?: throw PatchException("Not found MainActivityV2#onBackPressed method")
        val showToastRef = onBackPressedMethod.implementation
            ?.instructions?.firstNotNullOfOrNull { s ->
                if (s.opcode != Opcode.INVOKE_STATIC)
                    return@firstNotNullOfOrNull null
                s.getReference<MethodReference>().takeIf {
                    it.returnType == "V" && it.parameterTypes ==
                            listOf("Landroid/content/Context;", "Ljava/lang/String;", "I", "I")
                }
            } ?: throw PatchException("Not found show toast method reference")
        val myToastsClass = context.findClass("Lapp/revanced/bilibili/utils/Toasts;")!!
        val cancelMethod = showToastRef.definingClass.toClassDef(context).methods
            .find { it.parameterTypes.isEmpty() && it.name != "<init>" }
            ?: throw PatchException("Not found cancel toast method")
        myToastsClass.mutableClass.methods.run {
            first { it.name == "show" && it.parameterTypes.size == 4 }.also { remove(it) }
                .cloneMutable(registerCount = 4, clearImplementation = true).apply {
                    addInstructions(
                        """
                        invoke-static {p0, p1, p2, p3}, $showToastRef
                        return-void
                    """.trimIndent()
                    )
                }.also { add(it) }
            first { it.name == "cancel" }.also { remove(it) }
                .cloneMutable(registerCount = 0, clearImplementation = true).apply {
                    addInstructions(
                        """
                        invoke-static {}, $cancelMethod
                        return-void
                    """.trimIndent()
                    )
                }.also { add(it) }
        }
    }
}
