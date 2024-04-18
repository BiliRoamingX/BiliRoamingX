package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstruction
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod.Companion.toMutable
import app.revanced.patches.bilibili.misc.other.fingerprints.BangumiSearchResultFingerprint
import app.revanced.patches.bilibili.misc.other.fingerprints.OgvSearchResultFingerprint
import app.revanced.patches.bilibili.misc.other.fingerprints.OgvSearchResultV2Fingerprint
import app.revanced.patches.bilibili.utils.*
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction22c
import com.android.tools.smali.dexlib2.iface.reference.FieldReference

@Patch(
    name = "Search type",
    description = "附加更多搜索类型补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object AppendExtraSearchTypePatch : BytecodePatch(
    setOf(
        OgvSearchResultFingerprint,
        OgvSearchResultV2Fingerprint,
        BangumiSearchResultFingerprint
    )
) {
    override fun execute(context: BytecodeContext) {
        val pagerTypesClass =
            context.findClass("Lcom/bilibili/search/result/pages/BiliMainSearchResultPage\$PageTypes;")
        /*?: throw PatchException("not found pager type class")*/ // removed from 7.64.0
        pagerTypesClass?.mutableClass?.run {
            methods.first { it.name == "<init>" && it.parameterTypes.size == 5 }.run {
                accessFlags = accessFlags.toPublic()
            }
            fields.first { it.name == "\$VALUES" }.run {
                accessFlags = accessFlags.toPublic().removeFinal()
            }
        }
        // start from 7.39.0?
        val pagerTypesV2Class =
            context.findClass("Lcom/bilibili/search2/result/pages/BiliMainSearchResultPage\$PageTypes;")
        pagerTypesV2Class?.mutableClass?.run {
            methods.first { it.name == "<init>" && it.parameterTypes.size == 5 }.run {
                accessFlags = accessFlags.toPublic()
            }
            fields.first { it.name == "\$VALUES" }.run {
                accessFlags = accessFlags.toPublic().removeFinal()
            }
        }
        arrayOf(
            OgvSearchResultFingerprint.result,
            OgvSearchResultV2Fingerprint.result,
            BangumiSearchResultFingerprint.result
        ).filterNotNull().ifEmpty { throw PatchException("not found search result fragment") }
            .forEach { r ->
                val typeFiled = r.mutableMethod.run {
                    implementation!!.instructions.firstNotNullOf {
                        if (it is BuilderInstruction22c && it.opcode == Opcode.IGET) {
                            it.reference as FieldReference
                        } else null
                    }
                }
                Method(
                    definingClass = r.mutableClass.type,
                    name = "getTypeForBiliRoaming",
                    returnType = "I",
                    accessFlags = AccessFlags.PUBLIC.value,
                    implementation = MethodImplementation(2)
                ).toMutable().apply {
                    addInstructions(
                        """
                        iget v0, p0, $typeFiled
                        return v0
                    """.trimIndent()
                    )
                }.also { r.mutableClass.methods.add(it) }
                Method(
                    definingClass = r.mutableClass.type,
                    name = "setTypeForBiliRoaming",
                    returnType = "V",
                    parameters = listOf(MethodParameter(type = "I", name = "type")),
                    accessFlags = AccessFlags.PUBLIC.value,
                    implementation = MethodImplementation(2)
                ).toMutable().apply {
                    addInstructions(
                        """
                        iput p1, p0, $typeFiled
                        return-void
                    """.trimIndent()
                    )
                }.also { r.mutableClass.methods.add(it) }
                r.mutableClass.methods.first { it.name == "setUserVisibleCompat" }.addInstruction(
                    0, """
                    invoke-static {p0}, Lapp/revanced/bilibili/patches/okhttp/BangumiSeasonHook;->onSearchResultFragmentVisible(${r.mutableClass.type})V
                """.trimIndent()
                )
            }
    }
}
