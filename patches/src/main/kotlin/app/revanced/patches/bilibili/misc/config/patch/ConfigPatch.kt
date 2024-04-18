package app.revanced.patches.bilibili.misc.config.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableClass
import app.revanced.patches.bilibili.misc.config.fingerprints.ABSourceFingerprint
import app.revanced.patches.bilibili.misc.config.fingerprints.ConfigSourceFingerprint
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.iface.Method
import app.revanced.patches.bilibili.misc.integrations.patch.ConfigPatch as IntegrationConfigPatch

@Patch(
    name = "Config",
    description = "Config hook",
    dependencies = [IntegrationConfigPatch::class],
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object ConfigPatch : BytecodePatch(fingerprints = setOf(ABSourceFingerprint, ConfigSourceFingerprint)) {
    override fun execute(context: BytecodeContext) {
        fun Method.isAb() = parameterTypes == listOf("Ljava/lang/String;", "Ljava/lang/Boolean;")
                && returnType == "Ljava/lang/Boolean;"

        fun Method.isConfig() = parameterTypes == listOf("Ljava/lang/String;", "Ljava/lang/String;")
                && returnType == "Ljava/lang/String;"

        fun MutableClass.patchAb() {
            val method = methods.first { it.isAb() }
            method.cloneMutable(registerCount = 4, clearImplementation = true).apply {
                method.name += "_Origin"
                addInstructions(
                    """
                    invoke-virtual {p0, p1, p2}, $method
                    move-result-object v0
                    invoke-static {p1, p2, v0}, Lapp/revanced/bilibili/patches/ConfigPatch;->getAb(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/Boolean;
                    move-result-object v0
                    return-object v0
                """.trimIndent()
                )
            }.also { methods.add(it) }
        }

        fun MutableClass.patchConfig() {
            val method = methods.first { it.isConfig() }
            method.cloneMutable(registerCount = 4, clearImplementation = true).apply {
                method.name += "_Origin"
                addInstructions(
                    """
                    invoke-virtual {p0, p1, p2}, $method
                    move-result-object v0
                    invoke-static {p1, p2, v0}, Lapp/revanced/bilibili/patches/ConfigPatch;->getConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
                    move-result-object v0
                    return-object v0
                """.trimIndent()
                )
            }.also { methods.add(it) }
        }

        ABSourceFingerprint.result?.mutableClass?.patchAb()
            ?: throw ABSourceFingerprint.exception
        ConfigSourceFingerprint.result?.mutableClass?.patchConfig()
            ?: throw ConfigSourceFingerprint.exception

        val configManagerType = IntegrationConfigPatch.configManagerType
        context.classes.filter { cl ->
            cl.interfaces.size == 1 && cl.interfaces.first().startsWith("${configManagerType.removeSuffix(";")}$")
                    && cl.methods.any { it.isAb() } && cl.methods.any { it.isConfig() }
        }.forEach {
            context.proxy(it).mutableClass.run {
                patchAb()
                patchConfig()
            }
        }
    }
}
