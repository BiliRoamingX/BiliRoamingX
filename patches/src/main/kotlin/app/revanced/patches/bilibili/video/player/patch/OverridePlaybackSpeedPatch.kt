package app.revanced.patches.bilibili.video.player.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.extensions.InstructionExtensions.getInstruction
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableClass
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod
import app.revanced.patcher.util.smali.ExternalLabel
import app.revanced.patches.bilibili.patcher.patch.MultiMethodBytecodePatch
import app.revanced.patches.bilibili.utils.exception
import app.revanced.patches.bilibili.utils.proxy
import app.revanced.patches.bilibili.video.player.fingerprints.PlaybackSpeedSettingFingerprint
import app.revanced.patches.bilibili.video.player.fingerprints.PlayerSpeedWidgetFingerprint
import app.revanced.patches.bilibili.video.player.fingerprints.UnitePlayerSetSpeedMenuFingerprint
import app.revanced.util.getReference
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.dexbacked.instruction.DexBackedArrayPayload
import com.android.tools.smali.dexlib2.dexbacked.instruction.DexBackedInstruction31t
import com.android.tools.smali.dexlib2.iface.instruction.OneRegisterInstruction
import com.android.tools.smali.dexlib2.iface.instruction.WideLiteralInstruction
import com.android.tools.smali.dexlib2.iface.instruction.formats.ArrayPayload
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction11n
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
    multiFingerprints = setOf(
        PlaybackSpeedSettingFingerprint,
        PlayerSpeedWidgetFingerprint,
        UnitePlayerSetSpeedMenuFingerprint,
    )
) {
    override fun execute(context: BytecodeContext) {
        super.execute(context)
        val settingMethods = PlaybackSpeedSettingFingerprint.result.map { r ->
            r.mutableClass.methods.first { it.name == "<init>" }
        }
        settingMethods.ifEmpty {
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

        val speedBytesList = listOf(2.0f, 1.5f, 1.25f, 1.0f, 0.75f, 0.5f).map { it.toBits() }
        val speedBytesReversedList = speedBytesList.reversed()
        val settingTypes = settingMethods.map { it.definingClass }

        data class Info(val clazz: MutableClass, val method: MutableMethod, val index: Int, val register: Int)
        context.classes.filterNot { c ->
            c.type.let { settingTypes.contains(it) || it.startsWith("Lapp/revanced/bilibili/") || it.startsWith("Lkofua/") }
        }.flatMap { c ->
            c.methods.mapNotNull { m ->
                val payload = m.implementation?.instructions?.find { inst ->
                    inst is ArrayPayload && inst.arrayElements.let { it == speedBytesList || it == speedBytesReversedList }
                } as? DexBackedArrayPayload
                if (payload != null) {
                    val (index, inst) = m.implementation?.instructions!!.withIndex().firstNotNullOf { (index, inst) ->
                        if (inst.opcode == Opcode.FILL_ARRAY_DATA && inst is DexBackedInstruction31t
                            && inst.let { it.instructionStart + it.codeOffset * 2 } == payload.instructionStart
                        ) index to inst else null
                    }
                    val clazz = c.proxy(context)
                    val method = clazz.methods.first { it == m }
                    Info(clazz, method, index, inst.registerA)
                } else null
            }
        }.ifEmpty {
            throw PatchException("Retrieve speed array info failed")
        }.forEach { (clazz, method, index, register) ->
            val instructions = method.implementation!!.instructions
            val payloadInst = instructions.first { inst ->
                inst is ArrayPayload && inst.arrayElements.let { it == speedBytesList || it == speedBytesReversedList }
            } as ArrayPayload
            val reverse = payloadInst.arrayElements == speedBytesReversedList
            val patchMethodName = if (reverse) "getOverrideReverseSpeedArray" else "getOverrideSpeedArray"
            method.addInstructions(
                index + 1, """
                invoke-static {v$register}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->$patchMethodName([F)[F
                move-result-object v$register
            """.trimIndent()
            )
            // fix for StorySpeedDialogManager
            if (method.parameterTypes.isEmpty() && method.returnType == "Landroid/app/Dialog;") {
                val (constIndex, constRegister) = instructions.withIndex().reversed().firstNotNullOf { (index, inst) ->
                    if (inst.opcode == Opcode.CONST_4 && inst is Instruction11n && inst.wideLiteral == 0x6L) {
                        index to inst.registerA
                    } else null
                }
                method.addInstructions(
                    constIndex + 1, """
                    invoke-static {}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->getOverrideSpeedArraySize()I
                    move-result v$constRegister
                """.trimIndent()
                )
            }
            if (method.name == "<clinit>") {
                clazz.methods.singleOrNull { m ->
                    m.parameterTypes == listOf("F") && m.returnType == "V"
                            && m.implementation?.instructions.orEmpty().any {
                        it.opcode == Opcode.CONST_16 && it is WideLiteralInstruction && it.wideLiteral == 0x58L
                    }
                }?.addInstructions(
                    0, """
                    invoke-static {p1}, Lapp/revanced/bilibili/patches/PlaybackSpeedPatch;->onPlaybackSpeedSelected(F)V
                """.trimIndent()
                )
            }
        }
    }
}
