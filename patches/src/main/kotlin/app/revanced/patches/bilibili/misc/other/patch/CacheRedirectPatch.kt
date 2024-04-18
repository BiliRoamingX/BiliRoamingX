package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.OnOgvDownloadFingerprint
import app.revanced.patches.bilibili.misc.settings.patch.SettingsResourcePatch
import app.revanced.patches.bilibili.patcher.patch.MultiMethodBytecodePatch
import app.revanced.patches.bilibili.utils.*
import app.revanced.patches.shared.misc.mapping.ResourceMappingPatch
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.value.IntEncodedValue

@Patch(
    name = "Cache redirect",
    description = "缓存行为重定向，允许外部工具直接下载",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ],
    dependencies = [ResourceMappingPatch::class, SettingsResourcePatch::class]
)
object CacheRedirectPatch : MultiMethodBytecodePatch(
    multiFingerprints = setOf(OnOgvDownloadFingerprint)
) {
    override fun execute(context: BytecodeContext) {
        super.execute(context)
        val packageName = SettingsResourcePatch.packageName
        val dialogMenuLayoutName = if (packageName == "tv.danmaku.bilibilihd") {
            "bili_app_list_item_super_menu_hd_right_dialog_menu"
        } else {
            "bili_app_list_item_super_menu_dialog_menu"
        }
        val dialogMenuLayoutId = ResourceMappingPatch.resourceMappings.first {
            it.type == "layout" && it.name == dialogMenuLayoutName
        }.id
        val dialogMenuLayoutIdField = context.classes.firstNotNullOf { c ->
            c.fields.find { f ->
                f.accessFlags.let { it.isPublic() && it.isStatic() }
                        && f.type == "I" && (f.initialValue as? IntEncodedValue)?.value == dialogMenuLayoutId
            }
        }
        context.classes.firstNotNullOf { c ->
            if (c.methods.asSequence().filterNot { m ->
                    m.accessFlags.let { it.isAbstract() || it.isNative() }
                }.any { m ->
                    m.implementation!!.instructions.any {
                        it.opcode == Opcode.SGET && (it as ReferenceInstruction).reference == dialogMenuLayoutIdField
                    }
                }) c else null
        }.let { c ->
            val onClickOriginListenerType = "Lapp/revanced/bilibili/widget/OnClickOriginListener;"
            context.proxy(c).mutableClass.run {
                interfaces.add(onClickOriginListenerType)
                val originOnClickMethod = methods.first {
                    it.name == "onClick" && it.parameterTypes == listOf("Landroid/view/View;") && it.returnType == "V"
                }
                originOnClickMethod.cloneMutable(registerCount = 2, clearImplementation = true).apply {
                    originOnClickMethod.name += "_Origin"
                    addInstructions(
                        0, """
                        invoke-static {p1, p0}, Lapp/revanced/bilibili/patches/CacheRedirectPatch;->onMenuClick(Landroid/view/View;$onClickOriginListenerType)V
                        return-void
                    """.trimIndent()
                    )
                }.also { methods.add(it) }
            }
        }
        OnOgvDownloadFingerprint.result.ifEmpty {
            throw OnOgvDownloadFingerprint.exception
        }.forEach { r ->
            val originMethod = r.mutableMethod
            originMethod.cloneMutable(registerCount = 4, clearImplementation = true).apply {
                originMethod.name += "_Origin"
                addInstructionsWithLabels(
                    0, """
                    const-string v0, "${originMethod.name}"
                    invoke-static {p0, v0, p1, p2}, Lapp/revanced/bilibili/patches/CacheRedirectPatch;->onOgvDownload(Ljava/lang/Object;Ljava/lang/String;Landroid/content/Context;Ljava/lang/Enum;)Z
                    move-result v0
                    if-eqz v0, :invoke_origin
                    return-void
                    :invoke_origin
                    invoke-virtual {p0, p1, p2}, $originMethod
                    return-void
                """.trimIndent()
                )
            }.also { r.mutableClass.methods.add(it) }
        }
    }
}
