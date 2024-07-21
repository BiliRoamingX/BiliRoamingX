package app.revanced.patches.bilibili.misc.integrations.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstruction
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.extensions.InstructionExtensions.replaceInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.integrations.fingerprints.AppCompatActivityFingerprint
import app.revanced.patches.bilibili.utils.isAbstract
import app.revanced.patches.bilibili.utils.isNative
import app.revanced.patches.bilibili.utils.proxy
import app.revanced.util.exception
import app.revanced.util.findMutableMethodOf
import app.revanced.util.getReference
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction35c
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

@Patch(
    name = "Dpi",
    description = "自定义dpi辅助补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object DpiPatch : BytecodePatch(setOf(AppCompatActivityFingerprint)) {
    override fun execute(context: BytecodeContext) {
        AppCompatActivityFingerprint.result?.mutableClass?.methods?.run {
            first { it.name == "onConfigurationChanged" }.addInstruction(
                0, """
                invoke-static {p0, p1}, Lapp/revanced/bilibili/patches/main/ApplicationDelegate;->onActivityPreConfigurationChanged(Landroid/app/Activity;Landroid/content/res/Configuration;)V
            """.trimIndent()
            )
            first { it.name == "attachBaseContext" }.addInstructions(
                0, """
                invoke-static {p0, p1}, Lapp/revanced/bilibili/patches/main/ApplicationDelegate;->onActivityPreAttachBaseContext(Landroid/app/Activity;Landroid/content/Context;)Landroid/content/Context;
                move-result-object p1
            """.trimIndent()
            )
        } ?: throw AppCompatActivityFingerprint.exception
        val (setMethod, index, register) = context.findClass("Lcom/bilibili/cron/ViewCoordinator;")?.mutableClass?.methods?.firstNotNullOfOrNull { m ->
            m.implementation?.instructions?.withIndex()?.firstNotNullOfOrNull { (index, inst) ->
                if (inst is BuilderInstruction35c && (inst.reference as MethodReference).name == "nativeSetDisplayDensity") {
                    index to inst.registerF
                } else null
            }?.let { (index, register) ->
                Triple(m, index, register)
            }
        } ?: throw PatchException("not found ViewCoordinator#setDisplayDensity method")
        setMethod.addInstructions(
            index, """
            invoke-static {v$register}, Lapp/revanced/bilibili/patches/DpiPatch;->onCronSetDisplayDensity(F)F
            move-result v$register
        """.trimIndent()
        )
        context.classes.filterNot { c ->
            c.type.let { it == "Lapp/revanced/bilibili/patches/main/ApplicationDelegate;" || it == "Lapp/revanced/bilibili/patches/DpiPatch;" }
        }.forEach { c ->
            c.methods.filterNot { m ->
                m.accessFlags.let { it.isAbstract() || it.isNative() }
            }.forEach { m ->
                val instructions = m.implementation!!.instructions.toList()
                val instIndex = instructions.withIndex().indexOfFirst { (index, inst) ->
                    inst.opcode == Opcode.INVOKE_STATIC && inst.getReference<MethodReference>()
                        .toString() == "Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;"
                            && instructions[index + 1].opcode == Opcode.MOVE_RESULT_OBJECT
                }
                if (instIndex != -1) {
                    c.proxy(context).findMutableMethodOf(m).replaceInstruction(
                        instIndex, """
                        invoke-static {}, Lapp/revanced/bilibili/patches/main/ApplicationDelegate;->getAppResources()Landroid/content/res/Resources;
                    """.trimIndent()
                    )
                }
            }
        }
    }
}
