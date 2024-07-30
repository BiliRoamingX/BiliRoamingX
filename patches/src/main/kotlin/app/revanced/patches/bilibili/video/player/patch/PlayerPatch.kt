package app.revanced.patches.bilibili.video.player.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.utils.classDescriptor
import app.revanced.patches.bilibili.video.player.fingerprints.PlayerSeekToFingerprint
import app.revanced.patches.bilibili.video.player.fingerprints.RemoteServiceHandlerOnStartFingerprint
import app.revanced.util.exception

@Patch(
    name = "Player core",
    description = "播放器核心hook",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object PlayerPatch : BytecodePatch(setOf(PlayerSeekToFingerprint, RemoteServiceHandlerOnStartFingerprint)) {
    override fun execute(context: BytecodeContext) {
        PlayerSeekToFingerprint.result?.run {
            val playerClass = context.classes.first { it.type == "Lapp/revanced/bilibili/patches/main/Player;" }
            val addPlayerMethod = playerClass.methods.first { it.name == "add" }
            val hookProviderClass =
                context.findClass("Lapp/revanced/bilibili/utils/PlayerHookProvider;")!!.mutableClass
            mutableClass.methods.first { it.name == "<init>" }.run {
                addInstructions(
                    implementation!!.instructions.lastIndex, """
                    invoke-static {p0}, $addPlayerMethod
                """.trimIndent()
                )
            }
            val seekToMethodField = hookProviderClass.fields.first { it.name == "seekToMethodName" }
            hookProviderClass.methods.first { it.name == "init" }.addInstructions(
                0, """
                const-string v0, "${method.name}"
                sput-object v0, $seekToMethodField
            """.trimIndent()
            )
        } ?: throw PlayerSeekToFingerprint.exception
        val onlineInfoChangeRequestType =
            "tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.OnlineInfoChange\$Request".classDescriptor
        val playerPatchType = "app.revanced.bilibili.patches.PlayerPatch".classDescriptor
        RemoteServiceHandlerOnStartFingerprint.result?.mutableClass?.methods?.find {
            it.parameterTypes == listOf(onlineInfoChangeRequestType) && it.returnType == "V"
        }?.addInstructionsWithLabels(
            0, """
            invoke-static {p1}, $playerPatchType->onOnlineInfoChanged($onlineInfoChangeRequestType)Z
            move-result v0
            if-eqz v0, :jump
            return-void
            :jump
            nop
        """.trimIndent()
        )
    }
}
