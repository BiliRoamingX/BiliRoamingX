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
import app.revanced.util.getReference
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.OneRegisterInstruction
import com.android.tools.smali.dexlib2.iface.instruction.WideLiteralInstruction
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
        MusicPlayerPanelFingerprint,
    ),
    multiFingerprints = setOf(
        SpeedFunctionWidgetFingerprint,
        PlaybackSpeedSettingFingerprint,
        PlayerSpeedWidgetFingerprint,
        UnitePlayerSetSpeedMenuFingerprint,
    )
) {
    override fun execute(context: BytecodeContext) {
        super.execute(context)
        SpeedFunctionWidgetFingerprint.result.mapNotNull { r ->
            r.classDef.fields.firstNotNullOfOrNull { f ->
                f.type.toClassDefOrNull(context)?.takeIf {
                    it.interfaces == listOf("Landroid/view/View\$OnClickListener;")
                }?.let {
                    it.proxy(context).methods.first { it.name == "<init>" }
                }
            }
        }.ifEmpty {
            throw SpeedFunctionWidgetFingerprint.exception
        }.forEach { m ->
            val result = m.implementation!!.instructions.withIndex().firstNotNullOfOrNull { (index, inst) ->
                if (inst.opcode == Opcode.IPUT_OBJECT
                    && inst is OneRegisterInstruction
                    && inst.getReference<FieldReference>().type == "[F"
                ) index to inst.registerA else null
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
                    if (inst.opcode == Opcode.IPUT_OBJECT
                        && inst is OneRegisterInstruction
                        && inst.getReference<FieldReference>().type == "[F"
                    ) inst.registerA to index else null
                } ?: throw StoryMenuFingerprint.exception
            addInstructions(
                insertIndex, """
                invoke-static {v$register}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->getOverrideSpeedArray([F)[F
                move-result-object v$register
            """.trimIndent()
            )
        } ?: throw StoryMenuFingerprint.exception
        PlaybackSpeedSettingFingerprint.result.map { r ->
            r.mutableClass.methods.first { it.name == "<init>" }
        }.ifEmpty {
            throw PlaybackSpeedSettingFingerprint.exception
        }.forEach { m ->
            val insertIndex = m.implementation!!.instructions.indexOfLast {
                it.opcode == Opcode.IPUT_OBJECT && it.getReference<FieldReference>().type == "Landroid/widget/TextView;"
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
                    if (inst.opcode == Opcode.IPUT_OBJECT
                        && inst is OneRegisterInstruction
                        && inst.getReference<FieldReference>().type == "[F"
                    ) inst.registerA to index else null
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
                    it.opcode == Opcode.CONST && it is WideLiteralInstruction && it.wideLiteral == 0x3ffeb852L // 1.99f
                }?.takeIf { it != -1 }?.let { insertIndex ->
                    val oneIndex = m.implementation!!.instructions.indexOfFirst {
                        it.opcode == Opcode.CONST_HIGH16 && it is WideLiteralInstruction && it.wideLiteral == 0x3f800000L // 1.0f
                    }
                    Triple(m, insertIndex, oneIndex)
                }
            }
        }.ifEmpty {
            throw PlayerSpeedWidgetFingerprint.exception
        }.forEach { (m, insertIndex, oneIndex) ->
            m.addInstructionsWithLabels(
                insertIndex, "goto :cmp_one",
                ExternalLabel("cmp_one", m.getInstruction(oneIndex))
            )
        }
        // start from 7.80.0
        UnitePlayerSetSpeedMenuFingerprint.result.forEach { r ->
            val lastIndex = r.scanResult.stringsScanResult!!.matches.last().index
            val instructions = r.mutableMethod.implementation!!.instructions
            if (instructions[lastIndex + 1].opcode == Opcode.FILLED_NEW_ARRAY_RANGE && instructions[lastIndex + 2].opcode == Opcode.MOVE_RESULT_OBJECT) {
                val register = (instructions[lastIndex + 2] as OneRegisterInstruction).registerA
                r.mutableMethod.addInstructions(
                    lastIndex + 3, """
                    invoke-static {v$register}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->onUnitePlayerSetSpeedMenu([Ljava/lang/String;)[Ljava/lang/String;
                    move-result-object v$register
                """.trimIndent()
                )
            }
        }
    }
}
