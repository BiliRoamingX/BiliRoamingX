package app.revanced.patches.bilibili.video.player.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstruction
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod
import app.revanced.patches.bilibili.utils.*
import app.revanced.patches.bilibili.video.player.fingerprints.PlayerGestureListenerFingerprint
import app.revanced.patches.bilibili.video.player.fingerprints.PlayerGestureRotateFingerprint
import app.revanced.patches.bilibili.video.player.fingerprints.PlayerResizableGestureListenerFingerprint
import app.revanced.patches.bilibili.video.player.fingerprints.ResetResizeFunctionWidgetFingerprint
import app.revanced.util.exception
import app.revanced.util.getReference
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction22c
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction35c
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

@Patch(
    name = "Player gesture detector hook",
    description = "播放器 GestureDetector hook",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ],
    dependencies = [PlayerToastPatch::class]
)
object PlayerGestureDetectorPatch : BytecodePatch(
    setOf(
        PlayerGestureListenerFingerprint,
        PlayerResizableGestureListenerFingerprint,
        PlayerGestureRotateFingerprint,
        ResetResizeFunctionWidgetFingerprint,
    )
) {
    override fun execute(context: BytecodeContext) {
        val patchClass =
            context.findClass("Lapp/revanced/bilibili/patches/PlayerGestureDetectorPatch;")!!.mutableClass
        val hookProviderClass =
            context.findClass("Lapp/revanced/bilibili/utils/PlayerHookProvider;")!!.mutableClass
        PlayerGestureListenerFingerprint.result?.mutableMethod?.addInstructionsWithLabels(
            0, """
            invoke-static {}, $patchClass->disableLongPress()Z
            move-result v0
            if-eqz v0, :jump
            return-void
            :jump
            nop
        """.trimIndent()
        ) ?: throw PlayerGestureListenerFingerprint.exception
        PlayerResizableGestureListenerFingerprint.result?.mutableClass?.run {
            fun MutableMethod.disablePatch() = addInstructionsWithLabels(
                0, """
                invoke-static {}, $patchClass->scaleToSwitchRatio()Z
                move-result v0
                if-eqz v0, :jump
                const/4 v0, 0x1
                return v0
                :jump
                nop
            """.trimIndent()
            )
            // disable translate
            methods.first { it.name == "onScroll" }.disablePatch()
            // disable rotate
            PlayerGestureRotateFingerprint.result?.mutableMethod
                ?.disablePatch() ?: throw PlayerGestureRotateFingerprint.exception
            val onScaleMethod = methods.first { it.name == "onScale" }
            onScaleMethod.addInstruction(
                0, """
                invoke-static {p1}, $patchClass->onScale(Landroid/view/ScaleGestureDetector;)V
            """.trimIndent()
            )
            methods.first { it.name == "onScaleBegin" }.addInstruction(
                0, """
                invoke-static {p1}, $patchClass->onScaleBegin(Landroid/view/ScaleGestureDetector;)V
            """.trimIndent()
            )
            methods.first { it.name == "onScaleEnd" }.addInstruction(
                0, """
                invoke-static {p0, p1}, $patchClass->onScaleEnd(Ljava/lang/Object;Landroid/view/ScaleGestureDetector;)V
            """.trimIndent()
            )
            val onScaleMethodInstructions = onScaleMethod.implementation!!.instructions
            val gestureServiceFieldName = onScaleMethodInstructions.firstNotNullOf {
                if (it.opcode == Opcode.IGET_OBJECT) {
                    ((it as BuilderInstruction22c).reference as FieldReference).name
                } else null
            }
            val (getPlayerMethodName, playerClassName) = onScaleMethodInstructions.withIndex()
                .firstNotNullOf { (index, inst) ->
                    if (inst.opcode == Opcode.INVOKE_STATIC && index != 0) {
                        ((inst as BuilderInstruction35c).reference as MethodReference).let {
                            it.name to it.returnType
                        }
                    } else null
                }
            val (getRenderServiceMethodName, renderServiceType) = onScaleMethodInstructions.firstNotNullOf { inst ->
                if (inst.opcode == Opcode.INVOKE_INTERFACE || inst.opcode == Opcode.INVOKE_VIRTUAL) {
                    inst.getReference<MethodReference>().let {
                        if (it.parameterTypes.isEmpty() && it.returnType.toClassDefOrNull(context)?.accessFlags?.isInterface() == true)
                            it.name to it.returnType
                        else null
                    }
                } else null
            }
            val renderServiceClass = renderServiceType.toClassDef(context)
            val getAspectRatioMethodName = renderServiceClass.methods.first {
                it.returnType == "Ltv/danmaku/videoplayer/core/videoview/AspectRatio;"
            }.name
            val setAspectRatioMethodName = renderServiceClass.methods.first {
                it.parameterTypes == listOf("Ltv/danmaku/videoplayer/core/videoview/AspectRatio;")
            }.name
            val restoreMethodName = renderServiceClass.methods.first {
                it.parameterTypes == listOf("Z", "Landroid/animation/AnimatorListenerAdapter;")
            }.name
            val playerInterfaceClass = playerClassName.toClassDef(context).run {
                if (superclass == "Ljava/lang/Object;") this else context.classes.first { it.type == superclass }
            }.interfaces.first().toClassDef(context)
            val getToastServiceMethodName = playerInterfaceClass.methods.first {
                it.returnType == PlayerToastPatch.toastServiceInterfaceName
            }.name
            val showToastMethodName = PlayerToastPatch.showToastMethodName
            val gestureServiceFieldNameField =
                patchClass.fields.first { it.name == "gestureServiceFieldName" }
            val getPlayerMethodNameField =
                patchClass.fields.first { it.name == "getPlayerMethodName" }
            val getRenderServiceMethodNameField =
                hookProviderClass.fields.first { it.name == "getRenderServiceMethodName" }
            val getAspectRatioMethodNameField =
                hookProviderClass.fields.first { it.name == "getAspectRatioMethodName" }
            val setAspectRatioMethodNameField =
                hookProviderClass.fields.first { it.name == "setAspectRatioMethodName" }
            val restoreMethodNameField =
                hookProviderClass.fields.first { it.name == "restoreMethodName" }
            val getToastServiceMethodNameField =
                hookProviderClass.fields.first { it.name == "getToastServiceMethodName" }
            val showToastMethodNameField =
                hookProviderClass.fields.first { it.name == "showToastMethodName" }
            patchClass.methods.first { it.name == "init" }.addInstructions(
                0, """
                const-string v0, "$gestureServiceFieldName"
                sput-object v0, $gestureServiceFieldNameField
                const-string v0, "$getPlayerMethodName"
                sput-object v0, $getPlayerMethodNameField
            """.trimIndent()
            )
            hookProviderClass.methods.first { it.name == "init" }.addInstructions(
                0, """
                const-string v0, "$getRenderServiceMethodName"
                sput-object v0, $getRenderServiceMethodNameField
                const-string v0, "$getAspectRatioMethodName"
                sput-object v0, $getAspectRatioMethodNameField
                const-string v0, "$setAspectRatioMethodName"
                sput-object v0, $setAspectRatioMethodNameField
                const-string v0, "$restoreMethodName"
                sput-object v0, $restoreMethodNameField
                const-string v0, "$getToastServiceMethodName"
                sput-object v0, $getToastServiceMethodNameField
                const-string v0, "$showToastMethodName"
                sput-object v0, $showToastMethodNameField
            """.trimIndent()
            )
        } ?: throw PlayerResizableGestureListenerFingerprint.exception
        ResetResizeFunctionWidgetFingerprint.result?.mutableClass?.run {
            val textField = fields.first { it.type == "Landroid/widget/TextView;" }
            methods.filter { m ->
                m.implementation?.instructions?.any { inst ->
                    inst is BuilderInstruction35c && (inst.reference as MethodReference).name == "setVisibility"
                } ?: false
            }.forEach { m ->
                val opcode =
                    if (m.accessFlags.isPrivate()) Opcode.INVOKE_DIRECT else Opcode.INVOKE_VIRTUAL
                val regs = (0..m.parameters.size).joinToString { "p$it" }
                m.cloneMutable(
                    registerCount = m.parameters.size + 2,
                    clearImplementation = true
                ).apply {
                    m.name += "_Origin"
                    addInstructions(
                        """
                        ${opcode.name} {$regs}, $m
                        iget-object v0, p0, $textField
                        invoke-static {v0}, $patchClass->onSetResizeTextVisibility(Landroid/widget/TextView;)V
                        return-void
                    """.trimIndent()
                    )
                }.also { methods.add(it) }
            }
        } ?: throw ResetResizeFunctionWidgetFingerprint.exception
    }
}
