package app.revanced.patches.bilibili.misc.integrations.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.integrations.fingerprints.BLKVFingerprint
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.AccessFlags

@Patch(
    name = "Blkv",
    description = "集成BLKV",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object BLKVPatch : BytecodePatch(setOf(BLKVFingerprint)) {
    override fun execute(context: BytecodeContext) {
        val utilsClass = context.findClass("Lapp/revanced/bilibili/utils/Utils;")!!
        val result = BLKVFingerprint.result ?: throw BLKVFingerprint.exception
        val stockByNameMethod = result.method
        val stockByFileMethod = result.classDef.methods.first { m ->
            !AccessFlags.SYNTHETIC.isSet(m.accessFlags) && AccessFlags.STATIC.isSet(m.accessFlags)
                    && m.parameterTypes == listOf("Landroid/content/Context;", "Ljava/io/File;", "Z", "I")
        }
        val utilsGetContextMethod = utilsClass.mutableClass.methods.first { it.name == "getContext" }
        utilsClass.mutableClass.methods.run {
            first { it.name == "blkvPrefsByName" }.also { remove(it) }.cloneMutable(
                registerCount = 4, clearImplementation = true
            ).apply {
                addInstructions(
                    """
                    invoke-static {}, $utilsGetContextMethod
                    move-result-object v0
                    const/4 v1, 0x0
                    invoke-static {v0, p0, p1, v1}, $stockByNameMethod
                    move-result-object v0
                    return-object v0
                """.trimIndent()
                )
            }.also { add(it) }
            first { it.name == "blkvPrefsByFile" }.also { remove(it) }.cloneMutable(
                registerCount = 4, clearImplementation = true
            ).apply {
                addInstructions(
                    """
                    invoke-static {}, $utilsGetContextMethod
                    move-result-object v0
                    const/4 v1, 0x0
                    invoke-static {v0, p0, p1, v1}, $stockByFileMethod
                    move-result-object v0
                    return-object v0
                """.trimIndent()
                )
            }.also { add(it) }
        }
    }
}
