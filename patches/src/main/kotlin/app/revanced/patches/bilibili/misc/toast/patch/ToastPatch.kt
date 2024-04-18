package app.revanced.patches.bilibili.misc.toast.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.toast.fingerprints.LessonsModeToastFingerprint
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction35c
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
object ToastPatch : BytecodePatch(setOf(LessonsModeToastFingerprint)) {
    override fun execute(context: BytecodeContext) {
        val showToastRef = LessonsModeToastFingerprint.result?.mutableMethod
            ?.implementation?.instructions?.firstNotNullOfOrNull { s ->
                if (s.opcode != Opcode.INVOKE_STATIC)
                    return@firstNotNullOfOrNull null
                ((s as Instruction35c).reference as MethodReference).let { mr ->
                    if (mr.returnType == "V" && mr.parameterTypes.let {
                            it.size == 3 && it[0] == "Landroid/content/Context;" && it[1] == "Ljava/lang/String;" && it[2] == "I"
                        }) mr else null
                }
            } ?: throw LessonsModeToastFingerprint.exception
        val myToastsClass = context.findClass("Lapp/revanced/bilibili/utils/Toasts;")!!
        val cancelMethod = context.findClass(showToastRef.definingClass)!!.immutableClass.methods.find {
            it.parameterTypes.isEmpty() && it.name != "<init>"
        } ?: throw PatchException("can not found cancel toast method")
        myToastsClass.mutableClass.methods.run {
            first { it.name == "show" && it.parameterTypes.size == 3 }.also { remove(it) }
                .cloneMutable(3, clearImplementation = true).apply {
                    addInstructions(
                        """
                        invoke-static {p0, p1, p2}, $showToastRef
                        return-void
                        """.trimIndent()
                    )
                }.also { add(it) }
            first { it.name == "cancel" }.also { remove(it) }
                .cloneMutable(0, clearImplementation = true).apply {
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
