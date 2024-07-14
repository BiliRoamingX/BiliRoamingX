package app.revanced.patches.bilibili.video.subtitle.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableField.Companion.toMutable
import app.revanced.patches.bilibili.patcher.patch.MultiMethodBytecodePatch
import app.revanced.patches.bilibili.utils.*
import app.revanced.patches.bilibili.video.subtitle.fingerprints.*
import app.revanced.util.exception
import app.revanced.util.getReference
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.AnnotationVisibility
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction35c
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference

@Patch(
    name = "Subtitle import and save",
    description = "导入及保存字幕相关功能补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object SubtitleImportSavePatch : MultiMethodBytecodePatch(
    fingerprints = setOf(
        FunctionWidgetServiceFingerprint,
        SetDmViewReplyFingerprint,
        FunctionWidgetTokenFingerprint,
        RecordSelectedSubtitleFingerprint,
    ),
    multiFingerprints = setOf(PlayerSubtitleFunctionWidgetFingerprint)
) {
    override fun execute(context: BytecodeContext) {
        super.execute(context)
        PlayerSubtitleFunctionWidgetFingerprint.result.ifEmpty {
            throw PlayerSubtitleFunctionWidgetFingerprint.exception
        }.forEach { result ->
            val stockMethod = result.mutableClass.methods.first {
                it.parameterTypes == listOf("Landroid/content/Context;") && it.returnType == "Landroid/view/View;"
            }
            stockMethod.cloneMutable(registerCount = 3, clearImplementation = true).apply {
                stockMethod.name += "_Origin"
                addInstructions(
                    0, """
                    invoke-virtual {p0, p1}, $stockMethod
                    move-result-object v0
                    invoke-static {p0, v0}, Lapp/revanced/bilibili/patches/SubtitleImportSavePatch;->onCreateSubtitleWidget(Ljava/lang/Object;Landroid/view/View;)V
                    return-object v0
                """.trimIndent()
                )
            }.also { result.mutableClass.methods.add(it) }
        }
        val setDmResult = SetDmViewReplyFingerprint.result
        val setDmViewReplyMethod = setDmResult?.method?.name ?: throw SetDmViewReplyFingerprint.exception
        val (getDanmakuParamsMethod, danmakuParamsClass) = setDmResult.method.implementation!!.instructions.firstNotNullOfOrNull { inst ->
            if (inst.opcode == Opcode.INVOKE_VIRTUAL && inst is Instruction35c) {
                val mr = inst.reference as MethodReference
                if (mr.parameterTypes.isEmpty()) {
                    mr.name to mr.returnType
                } else null
            } else null
        } ?: throw PatchException("not found getDanmakuParams method")
        val getDmViewReplyMethod = danmakuParamsClass.toClassDef(context).methods.first {
            it.parameterTypes.isEmpty() && it.returnType == "Lcom/bapis/bilibili/community/service/dm/v1/DmViewReply;"
        }.name
        val loadSubtitleMethod = setDmResult.classDef.methods.first {
            it.parameterTypes == listOf(
                "Lcom/bapis/bilibili/community/service/dm/v1/SubtitleItem;",
                "Lcom/bapis/bilibili/community/service/dm/v1/SubtitleItem;"
            ) && it.returnType == "V"
        }.name
        val interactLayerServiceInterface = setDmResult.classDef.interfaces.first()
        val widgetResult = FunctionWidgetServiceFingerprint.result
        val widgetServiceInterface = widgetResult?.classDef?.interfaces?.first()
            ?: throw FunctionWidgetServiceFingerprint.exception
        PlayerSubtitleFunctionWidgetFingerprint.result.forEach { result ->
            Field(
                definingClass = result.classDef.type,
                name = "interactLayerServiceForBiliRoaming",
                type = interactLayerServiceInterface,
                accessFlags = AccessFlags.PUBLIC.value,
                annotations = setOf(
                    Annotation(
                        visibility = AnnotationVisibility.RUNTIME,
                        type = "Ltv/danmaku/biliplayerv2/injection/InjectPlayerService;"
                    )
                )
            ).toMutable().let { result.mutableClass.fields.add(it) }
            Field(
                definingClass = result.classDef.type,
                name = "widgetServiceForBiliRoaming",
                type = widgetServiceInterface,
                accessFlags = AccessFlags.PUBLIC.value,
                annotations = setOf(
                    Annotation(
                        visibility = AnnotationVisibility.RUNTIME,
                        type = "Ltv/danmaku/biliplayerv2/injection/InjectPlayerService;"
                    )
                )
            ).toMutable().let { result.mutableClass.fields.add(it) }
        }
        val absWidgetClass = PlayerSubtitleFunctionWidgetFingerprint.result.first().classDef.superclass
        val widgetTokenClass = FunctionWidgetTokenFingerprint.result?.classDef?.type
            ?: throw FunctionWidgetTokenFingerprint.exception
        val hideWidgetMethod = widgetResult.classDef.methods.first {
            it.parameterTypes == listOf(widgetTokenClass) && it.returnType == "V" && it.implementation!!.instructions.any { inst ->
                inst.opcode == Opcode.CONST_STRING && (inst.getReference<StringReference>().string.contains("hide widget"))
            }
        }.name
        val widgetTokenField = context.classes.first { it.type == absWidgetClass }.fields.first {
            it.type == widgetTokenClass
        }.name
        val recordSelectedSubtitleMethod = RecordSelectedSubtitleFingerprint.result?.method
            ?.name ?: throw RecordSelectedSubtitleFingerprint.exception
        val hookInfoProviderClass = context.findClass(
            "Lapp/revanced/bilibili/patches/SubtitleImportSavePatch\$HookInfo;"
        )!!.mutableClass
        val getDanmakuParamsMethodHook = hookInfoProviderClass.fields.first {
            it.name == "getDanmakuParamsMethod"
        }
        val getDmViewReplyMethodHook = hookInfoProviderClass.fields.first {
            it.name == "getDmViewReplyMethod"
        }
        val setDmViewReplyMethodHook = hookInfoProviderClass.fields.first {
            it.name == "setDmViewReplyMethod"
        }
        val loadSubtitleMethodHook = hookInfoProviderClass.fields.first {
            it.name == "loadSubtitleMethod"
        }
        val hideWidgetMethodHook = hookInfoProviderClass.fields.first {
            it.name == "hideWidgetMethod"
        }
        val widgetTokenFieldHook = hookInfoProviderClass.fields.first {
            it.name == "widgetTokenField"
        }
        val recordSelectedSubtitleMethodHook = hookInfoProviderClass.fields.first {
            it.name == "recordSelectedSubtitleMethod"
        }
        hookInfoProviderClass.methods.first { it.name == "init" }.also { hookInfoProviderClass.methods.remove(it) }
            .cloneMutable(registerCount = 1, clearImplementation = true).apply {
                addInstructions(
                    0, """
                    const-string v0, "$getDanmakuParamsMethod"
                    sput-object v0, $getDanmakuParamsMethodHook
                    
                    const-string v0, "$getDmViewReplyMethod"
                    sput-object v0, $getDmViewReplyMethodHook
                    
                    const-string v0, "$setDmViewReplyMethod"
                    sput-object v0, $setDmViewReplyMethodHook
                    
                    const-string v0, "$loadSubtitleMethod"
                    sput-object v0, $loadSubtitleMethodHook
                    
                    const-string v0, "$hideWidgetMethod"
                    sput-object v0, $hideWidgetMethodHook
                    
                    const-string v0, "$widgetTokenField"
                    sput-object v0, $widgetTokenFieldHook
                    
                    const-string v0, "$recordSelectedSubtitleMethod"
                    sput-object v0, $recordSelectedSubtitleMethodHook
                    
                    return-void
                """.trimIndent()
                )
            }.also { hookInfoProviderClass.methods.add(it) }
    }
}
