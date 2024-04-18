package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.SectionFingerprint
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

@Patch(
    name = "Auto like",
    description = "视频自动点赞补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object AutoLikePatch : BytecodePatch(setOf(SectionFingerprint)) {
    override fun execute(context: BytecodeContext) {
        val clazz = SectionFingerprint.result?.mutableClass
            ?: throw SectionFingerprint.exception
        val likeMethod = context.classes.first { it.type == clazz.superclass }.virtualMethods.find { m ->
            m.parameterTypes.size == 1 && m.returnType == "V" && !AccessFlags.FINAL.isSet(m.accessFlags)
        } ?: throw PatchException("can not found like method")
        val realLikeMethod = clazz.methods.first { m ->
            m.name == likeMethod.name && m.parameterTypes == likeMethod.parameterTypes
        }
        val insertIndex = realLikeMethod.implementation!!.instructions
            .indexOfLast { it.opcode == Opcode.RETURN_VOID }
        realLikeMethod.addInstruction(
            insertIndex, """
            invoke-static {p0}, Lapp/revanced/bilibili/patches/AutoLikePatch;->autoLike(Ljava/lang/Object;)V
        """.trimIndent()
        )
    }
}
