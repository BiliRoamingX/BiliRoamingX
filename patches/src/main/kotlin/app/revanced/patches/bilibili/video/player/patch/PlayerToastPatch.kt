package app.revanced.patches.bilibili.video.player.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.utils.isPublic
import app.revanced.patches.bilibili.utils.isStatic
import app.revanced.patches.bilibili.utils.toPublic
import app.revanced.patches.bilibili.video.player.fingerprints.ShowPlayerToastFingerprint
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction35c

@Patch(
    name = "Player toast",
    description = "播放器特定样式toast显示拦截",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object PlayerToastPatch : BytecodePatch(setOf(ShowPlayerToastFingerprint)) {
    var toastServiceInterfaceName = ""
        private set
    var showToastMethodName = ""
        private set

    override fun execute(context: BytecodeContext) {
        ShowPlayerToastFingerprint.result?.run {
            toastServiceInterfaceName = mutableClass.interfaces.first()
            showToastMethodName = mutableClass.methods.first { m ->
                m.accessFlags.let { !it.isStatic() && it.isPublic() }
                        && (m.implementation?.instructions?.any { inst ->
                    inst.opcode == Opcode.INVOKE_DIRECT && (inst as BuilderInstruction35c).reference == mutableMethod
                } ?: false)
            }.name
            mutableMethod.addInstructionsWithLabels(
                0, """
                invoke-static {p1}, Lapp/revanced/bilibili/patches/PlayerToastPatch;->onShow(Ltv/danmaku/biliplayerv2/widget/toast/PlayerToast;)Z
                move-result v0
                if-eqz v0, :jump
                return-void
                :jump
                nop
            """.trimIndent()
            )
        } ?: throw ShowPlayerToastFingerprint.exception
        context.findClass("Ltv/danmaku/biliplayerv2/widget/toast/PlayerToast;")
            ?.mutableClass?.run {
                fields.first { it.name == "mToastExtra" }.run {
                    accessFlags = accessFlags.toPublic()
                }
                methods.filter { it.name == "<init>" }.forEach {
                    it.accessFlags = it.accessFlags.toPublic()
                }
            } ?: throw PatchException("not found PlayerToast class")
    }
}
