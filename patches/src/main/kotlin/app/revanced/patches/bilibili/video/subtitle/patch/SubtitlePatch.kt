package app.revanced.patches.bilibili.video.subtitle.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstruction
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.patches.bilibili.utils.toPublic
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

@Patch(
    name = "Subtitle style",
    description = "字幕样式相关补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object SubtitlePatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        context.findClass("Lcom/bilibili/cron/Canvas;")?.mutableClass?.run {
            accessFlags = accessFlags.toPublic()
            fields.filterNot { AccessFlags.STATIC.isSet(it.accessFlags) }.forEach {
                it.accessFlags = it.accessFlags.toPublic()
            }
            methods.first { it.name == "setPaint" }.run {
                val insertIndex = implementation!!.instructions.indexOfLast {
                    it.opcode == Opcode.RETURN_VOID
                }
                addInstruction(
                    insertIndex, """
                    invoke-static {p0}, Lapp/revanced/bilibili/patches/SubtitlePatch;->setPaint(Lcom/bilibili/cron/Canvas;)V
                """.trimIndent()
                )
            }
            methods.first { it.name == "drawPath" }.addInstructionsWithLabels(
                0, """
                invoke-static {p0}, Lapp/revanced/bilibili/patches/SubtitlePatch;->drawPath(Lcom/bilibili/cron/Canvas;)Z
                move-result v0
                if-eqz v0, :jump
                return-void
                :jump
                nop
            """.trimIndent()
            )
            methods.first { it.name == "measureTextFromLayout" }.run {
                accessFlags = accessFlags.toPublic()
            }
            methods.first { it.name == "measureTextImpl" }.also { methods.remove(it) }
                .cloneMutable(registerCount = 3, clearImplementation = true).apply {
                    addInstructions(
                        """
                        invoke-static {p0, p1}, Lapp/revanced/bilibili/patches/SubtitlePatch;->measureTextImpl(Lcom/bilibili/cron/Canvas;Ljava/lang/String;)Landroid/graphics/Rect;
                        move-result-object v0
                        return-object v0
                    """.trimIndent()
                    )
                }.also { methods.add(it) }
            methods.first { it.name == "drawText" }.run {
                val originalAccessFlags = accessFlags
                accessFlags = accessFlags.toPublic()
                name = "drawTextReal"
                cloneMutable(
                    registerCount = 5,
                    clearImplementation = true,
                    name = "drawText",
                    accessFlags = originalAccessFlags
                ).apply {
                    addInstructions(
                        """
                        invoke-static {p0, p1, p2, p3, p4}, Lapp/revanced/bilibili/patches/SubtitlePatch;->drawText(Lcom/bilibili/cron/Canvas;Ljava/lang/String;FFZ)V
                        return-void
                    """.trimIndent()
                    )
                }.also { methods.add(it) }
            }
        }
        arrayOf(
            "Ltv/danmaku/biliplayerv2/service/interact/biz/chronos/chronosrpc/methods/receive/GetDanmakuConfig\$SubtitleConfig;",
            "Ltv/danmaku/biliplayerv2/service/interact/biz/chronos/chronosrpc/methods/send/DanmakuConfigChange\$SubtitleConfig;"
        ).forEach { name ->
            context.findClass(name)?.mutableClass?.methods?.first { it.name == "setBottomMargin" }?.addInstructions(
                0, """
                invoke-static {p1}, Lapp/revanced/bilibili/patches/SubtitlePatch;->offset(Ljava/lang/Float;)Ljava/lang/Float;
                move-result-object p1
            """.trimIndent()
            )
        }
    }
}
