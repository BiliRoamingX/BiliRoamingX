package app.revanced.patches.bilibili.misc.darkswitch.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.fingerprint.MethodFingerprint
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.darkswitch.fingerprints.HdNewSwitchDarkModeFingerprint
import app.revanced.patches.bilibili.misc.darkswitch.fingerprints.SwitchDarkModeFingerprint
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.patches.bilibili.utils.toPublic
import app.revanced.util.exception

@Patch(
    name = "Dark switch",
    description = "我的页面深色模式切换弹框确认",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object DarkSwitchPatch : BytecodePatch(
    setOf(SwitchDarkModeFingerprint, HdNewSwitchDarkModeFingerprint)
) {
    override fun execute(context: BytecodeContext) {
        fun MethodFingerprint.patch() = result?.run {
            val listenerType = "Lapp/revanced/bilibili/widget/OnSwitchDarkModeOriginListener;"
            mutableClass.interfaces.add(listenerType)
            mutableMethod.cloneMutable(registerCount = 2, clearImplementation = true).apply {
                addInstructions(
                    """
                    invoke-static {p0, p1}, Lapp/revanced/bilibili/patches/DarkSwitchPatch;->switchDarkMode(${listenerType}Z)V
                    return-void
                """.trimIndent()
                )
            }.also {
                mutableMethod.name = "switchDarkMode_Origin"
                mutableMethod.accessFlags = mutableMethod.accessFlags.toPublic()
                mutableClass.methods.add(it)
            }
        }

        SwitchDarkModeFingerprint.patch() ?: throw SwitchDarkModeFingerprint.exception
        HdNewSwitchDarkModeFingerprint.patch()
    }
}
