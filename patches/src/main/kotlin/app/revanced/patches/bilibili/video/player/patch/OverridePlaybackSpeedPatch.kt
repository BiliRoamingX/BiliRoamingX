package app.revanced.patches.bilibili.video.player.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.extensions.InstructionExtensions.getInstruction
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod.Companion.toMutable
import app.revanced.patcher.util.smali.ExternalLabel
import app.revanced.patches.bilibili.patcher.patch.MultiMethodBytecodePatch
import app.revanced.patches.bilibili.utils.*
import app.revanced.patches.bilibili.video.player.fingerprints.*
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.AnnotationVisibility
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction21ih
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction22c
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction31i
import com.android.tools.smali.dexlib2.iface.reference.FieldReference

@Patch(
    name = "Override playback speed",
    description = "自定义播放器播放速度列表",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object OverridePlaybackSpeedPatch : MultiMethodBytecodePatch(
    fingerprints = setOf(
        StoryMenuFingerprint,
        MenuFuncSegmentFingerprint,
        NewShareServiceFingerprint,
        MusicPlayerPanelFingerprint
    ),
    multiFingerprints = setOf(
        SpeedFunctionWidgetFingerprint,
        PlaybackSpeedSettingFingerprint,
        PlayerSpeedWidgetFingerprint
    )
) {
    override fun execute(context: BytecodeContext) {
        super.execute(context)
        SpeedFunctionWidgetFingerprint.result.mapNotNull { r ->
            r.classDef.fields.firstNotNullOfOrNull { f ->
                context.classes.find { it.type == f.type }?.takeIf {
                    it.interfaces == listOf("Landroid/view/View\$OnClickListener;")
                }?.let { c ->
                    context.proxy(c).mutableClass.methods.first { it.name == "<init>" }
                }
            }
        }.ifEmpty {
            throw SpeedFunctionWidgetFingerprint.exception
        }.forEach { m ->
            val result = m.implementation!!.instructions.withIndex().firstNotNullOfOrNull { (index, inst) ->
                if (inst.opcode == Opcode.IPUT_OBJECT && inst is BuilderInstruction22c && (inst.reference as FieldReference).type == "[F") {
                    index to inst.registerA
                } else null
            }
            if (result != null) {
                val (insertIndex, register) = result
                m.addInstructions(
                    insertIndex, """
                    invoke-static {v$register}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->getOverrideSpeedArray([F)[F
                    move-result-object v$register
                """.trimIndent()
                )
            }
        }
        StoryMenuFingerprint.result?.mutableClass?.methods?.first { it.name == "<init>" }?.run {
            val (register, insertIndex) = implementation!!.instructions.withIndex()
                .firstNotNullOfOrNull { (index, inst) ->
                    if (inst.opcode == Opcode.IPUT_OBJECT && inst is BuilderInstruction22c
                        && (inst.reference as FieldReference).type == "[F"
                    ) (inst.registerA to index) else null
                } ?: throw StoryMenuFingerprint.exception
            addInstructions(
                insertIndex, """
                invoke-static {v$register}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->getOverrideSpeedArray([F)[F
                move-result-object v$register
            """.trimIndent()
            )
        } ?: throw StoryMenuFingerprint.exception
        MenuFuncSegmentFingerprint.result?.mutableClass?.fields
            ?.find { it.type == "[F" && AccessFlags.STATIC.isSet(it.accessFlags) }?.let { f ->
                f.accessFlags = f.accessFlags.toPublic().removeFinal()
                context.findClass("Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;")!!.mutableClass.methods
                    .first { it.name == "refreshMenuFuncSegmentSpeedArray" }.addInstructions(
                        0, """
                        sput-object p0, $f
                    """.trimIndent()
                    )
            } ?: MenuFuncSegmentFingerprint.result?.mutableClass?.methods?.first { it.name == "<init>" }?.run {
            val (register, insertIndex) = implementation!!.instructions.withIndex()
                .firstNotNullOfOrNull { (index, inst) ->
                    if (inst.opcode == Opcode.IPUT_OBJECT && inst is BuilderInstruction22c
                        && (inst.reference as FieldReference).type == "[F"
                    ) (inst.registerA to index) else null
                } ?: throw MenuFuncSegmentFingerprint.exception
            addInstructions(
                insertIndex, """
                invoke-static {v$register}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->getOverrideSpeedArray([F)[F
                move-result-object v$register
            """.trimIndent()
            )
        } ?: throw MenuFuncSegmentFingerprint.exception
        NewShareServiceFingerprint.result?.mutableClass?.fields?.find { it.type == "[F" }?.let { f ->
            f.accessFlags = f.accessFlags.toPublic().removeFinal()
            context.findClass("Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;")!!.mutableClass.methods
                .first { it.name == "refreshNewShareServiceSpeedArray" }.addInstructions(
                    0, """
                    sput-object p0, $f
                """.trimIndent()
                )
        } ?: throw NewShareServiceFingerprint.exception
        PlaybackSpeedSettingFingerprint.result.map { r ->
            r.mutableClass.methods.first { it.name == "<init>" }
        }.ifEmpty {
            throw PlaybackSpeedSettingFingerprint.exception
        }.forEach { m ->
            val insertIndex = m.implementation!!.instructions.indexOfLast {
                it.opcode == Opcode.IPUT_OBJECT && it is BuilderInstruction22c
                        && (it.reference as FieldReference).type == "Landroid/widget/TextView;"
            }
            m.addInstructions(
                insertIndex, """
                    invoke-static {p0}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->onNewPlaybackSpeedSetting(Ljava/lang/Object;)V
                """.trimIndent()
            )
        }
        context.findClass("Lcom/bilibili/music/podcast/view/PodcastSpeedSeekBar;")?.mutableClass?.run {
            val speedNameListField = fields.first { it.type == "Ljava/util/List;" }
            val speedArrayField = fields.first { it.type == "[F" }.apply {
                accessFlags = accessFlags.removeFinal()
            }
            methods.find { it.name == "<init>" && it.parameterTypes.size == 3 }?.run {
                val insertIndex = implementation!!.instructions.indexOfFirst {
                    it.opcode == Opcode.RETURN_VOID
                }
                addInstructions(
                    insertIndex, """
                    invoke-static {p0}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->onNewPodcastSpeedSeekBar(Lcom/bilibili/music/podcast/view/PodcastSpeedSeekBar;)V
                """.trimIndent()
                )
            }
            Method(
                definingClass = type,
                name = "getSpeedNameListForBiliRoaming",
                returnType = "Ljava/util/List;",
                accessFlags = AccessFlags.PUBLIC.value,
                annotations = setOf(
                    Annotation(
                        visibility = AnnotationVisibility.SYSTEM,
                        type = "Ldalvik/annotation/Signature;",
                        elements = setOf(
                            AnnotationElement(
                                name = "value",
                                value = ArrayEncodedValue(
                                    value = listOf(
                                        "()".encodedValue,
                                        "Ljava/util/List<".encodedValue,
                                        "Lkotlin/Pair<".encodedValue,
                                        "Ljava/lang/Float;".encodedValue,
                                        "Ljava/lang/String;".encodedValue,
                                        ">;>;".encodedValue
                                    )
                                )
                            )
                        )
                    )
                ),
                implementation = MethodImplementation(2)
            ).toMutable().also { methods.add(it) }.addInstructions(
                """
                iget-object v0, p0, $speedNameListField
                return-object v0
            """.trimIndent()
            )
            Method(
                definingClass = type,
                name = "setSpeedArrayForBiliRoaming",
                "V",
                accessFlags = AccessFlags.PUBLIC.value,
                parameters = listOf(MethodParameter(type = "[F", name = "array")),
                implementation = MethodImplementation(registerCount = 2)
            ).toMutable().also { methods.add(it) }.addInstructions(
                """
                iput-object p1, p0, $speedArrayField
                return-void
            """.trimIndent()
            )
        } /*?: throw PatchException("not found PodcastSpeedSeekBar")*/ // not exist on hd
        MusicPlayerPanelFingerprint.result?.mutableClass?.methods?.first { it.name == "<init>" }?.run {
            val (register, insertIndex) = implementation!!.instructions.withIndex()
                .firstNotNullOfOrNull { (index, inst) ->
                    if (inst.opcode == Opcode.IPUT_OBJECT && inst is BuilderInstruction22c
                        && (inst.reference as FieldReference).type == "[F"
                    ) (inst.registerA to index) else null
                } ?: throw MusicPlayerPanelFingerprint.exception
            addInstructions(
                insertIndex, """
                invoke-static {v$register}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->getOverrideReverseSpeedArray([F)[F
                move-result-object v$register
            """.trimIndent()
            )
        } /*?: throw MusicPlayerPanelFingerprint.exception*/ // not exist on hd
        PlayerSpeedWidgetFingerprint.result.mapNotNull { r ->
            r.mutableClass.methods.firstNotNullOfOrNull { m ->
                m.implementation?.instructions?.indexOfFirst {
                    it.opcode == Opcode.CONST && it is BuilderInstruction31i && it.wideLiteral == 0x3ffeb852L // 1.99f
                }?.takeIf { it != -1 }?.let { insertIndex ->
                    val oneIndex = m.implementation!!.instructions.indexOfFirst {
                        it.opcode == Opcode.CONST_HIGH16 && it is BuilderInstruction21ih && it.wideLiteral == 0x3f800000L // 1.0f
                    }
                    Triple(m, insertIndex, oneIndex)
                }
            }
        }.ifEmpty {
            throw PlayerSpeedWidgetFingerprint.exception
        }.forEach { (m, insertIndex, oneIndex) ->
            m.addInstructionsWithLabels(
                insertIndex,
                """
                goto :cmp_one
            """.trimIndent(),
                ExternalLabel("cmp_one", m.getInstruction(oneIndex))
            )
        }
    }
}
