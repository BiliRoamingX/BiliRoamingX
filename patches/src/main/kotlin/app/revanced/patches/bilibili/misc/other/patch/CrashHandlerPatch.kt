package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.utils.isAbstract
import app.revanced.patches.bilibili.utils.isNative
import app.revanced.patches.bilibili.utils.proxy

@Patch(
    name = "Crash handler",
    description = "崩溃日志记录",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object CrashHandlerPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        context.classes.filter { it.interfaces.contains("Ljava/lang/Thread\$UncaughtExceptionHandler;") }
            .map { it.proxy(context) }.flatMap { it.methods }
            .filter {
                it.name == "uncaughtException" && !it.accessFlags.isAbstract() && !it.accessFlags.isNative()
            }.forEach {
                if (it.implementation!!.registerCount > 16) {
                    it.addInstruction(
                        0, """
                        invoke-static/range {p1 .. p2}, Lapp/revanced/bilibili/patches/CrashHandlerPatch;->onCrash(Ljava/lang/Thread;Ljava/lang/Throwable;)V
                    """.trimIndent()
                    )
                } else {
                    it.addInstruction(
                        0, """
                        invoke-static {p1, p2}, Lapp/revanced/bilibili/patches/CrashHandlerPatch;->onCrash(Ljava/lang/Thread;Ljava/lang/Throwable;)V
                    """.trimIndent()
                    )
                }
            }
    }
}
