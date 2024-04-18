package app.revanced.patches.bilibili.misc.integrations.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstruction
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod.Companion.toMutable
import app.revanced.patches.bilibili.misc.integrations.fingerprints.InitFingerprint
import app.revanced.patches.bilibili.utils.Method
import app.revanced.patches.bilibili.utils.MethodImplementation
import app.revanced.patches.shared.misc.integrations.BaseIntegrationsPatch
import com.android.tools.smali.dexlib2.AccessFlags

@Patch(
    name = "Integrations",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ],
    requiresIntegrations = true
)
object IntegrationsPatch : BaseIntegrationsPatch(
    "Lapp/revanced/bilibili/utils/Utils;",
    setOf(InitFingerprint)
) {
    override fun execute(context: BytecodeContext) {
        super.execute(context)
        val result = InitFingerprint.result!!
        result.mutableMethod.addInstruction(
            1, """
            invoke-static {p0}, Lapp/revanced/bilibili/patches/main/ApplicationDelegate;->onCreate(Landroid/app/Application;)V
        """.trimIndent()
        )
        val clazz = result.mutableClass
        if (clazz.methods.any { it.name == "getResources" && it.parameters.isEmpty() })
            throw PatchException("Application#getResources method existed, need rewrite logic!")
        Method(
            definingClass = clazz.type,
            name = "getResources",
            returnType = "Landroid/content/res/Resources;",
            accessFlags = AccessFlags.PUBLIC.value,
            implementation = MethodImplementation(registerCount = 2)
        ).toMutable().apply {
            addInstructions(
                0, """
                invoke-super {p0}, ${clazz.superclass}->getResources()Landroid/content/res/Resources;
                move-result-object v0
                invoke-static {v0}, Lapp/revanced/bilibili/patches/main/ApplicationDelegate;->getResources(Landroid/content/res/Resources;)Landroid/content/res/Resources;
                move-result-object v0
                return-object v0
            """.trimIndent()
            )
        }.let { clazz.methods.add(it) }
    }
}
