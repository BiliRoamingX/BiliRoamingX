package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod.Companion.toMutable
import app.revanced.patches.bilibili.utils.Method
import app.revanced.patches.bilibili.utils.MethodImplementation
import app.revanced.patches.bilibili.utils.cloneMutable
import com.android.tools.smali.dexlib2.AccessFlags

@Patch(
    name = "Fake not in multi window mode",
    description = "播放页伪装未处于多窗口模式",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object FakeNotInMultiWindowPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        val activityTypes = arrayOf(
            "Lcom/bilibili/ship/theseus/playlist/UnitedPlaylistActivity;",
            "Lcom/bilibili/ship/theseus/detail/UnitedBizDetailsActivity;",
            "Lcom/bilibili/bangumi/ui/page/detail/BangumiDetailActivityV3;",
            "Lcom/bilibili/video/videodetail/VideoDetailsActivity;",
            "Lcom/bilibili/multitypeplayerV2/MultiTypeVideoContentActivity;",
            "Lcom/bilibili/bililive/room/ui/roomv3/LiveRoomActivityV3;",
        )
        activityTypes.mapNotNull { context.findClass(it)?.mutableClass }.forEach { clazz ->
            Method(
                definingClass = clazz.type,
                name = "isInMultiWindowMode",
                returnType = "Z",
                accessFlags = AccessFlags.PUBLIC.value,
                implementation = MethodImplementation(registerCount = 2)
            ).toMutable().apply {
                addInstructions(
                    0, """
                    invoke-static {}, Lapp/revanced/bilibili/patches/SettingsTransfer;->fakeNotInMultiWindow()Z
                    move-result v0
                    if-eqz v0, :not_fake
                    const/4 v0, 0x0
                    return v0
                    :not_fake
                    invoke-super {p0}, ${clazz.superclass}->isInMultiWindowMode()Z
                    move-result v0
                    return v0
                """.trimIndent()
                )
            }.let { clazz.methods.add(it) }

            clazz.methods.find {
                it.name == "onMultiWindowModeChanged" && it.parameterTypes == listOf("Z")
            }?.let {
                it.cloneMutable(registerCount = 3, clearImplementation = true).apply {
                    it.name += "_Origin"
                    addInstructions(
                        0, """
                        invoke-static {}, Lapp/revanced/bilibili/patches/SettingsTransfer;->fakeNotInMultiWindow()Z
                        move-result v0
                        if-eqz v0, :jump
                        return-void
                        :jump
                        invoke-virtual {p0, p1}, $it
                        return-void
                    """.trimIndent()
                    )
                }.also { clazz.methods.add(it) }
            }
        }
    }
}
