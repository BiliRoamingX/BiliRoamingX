package app.revanced.patches.bilibili.misc.integrations.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.replaceInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.integrations.fingerprints.RecyclerViewHolderFingerprint
import app.revanced.patches.bilibili.utils.classDescriptor
import app.revanced.patches.bilibili.utils.isSynthetic
import app.revanced.util.exception

@Patch(
    name = "Anti RecyclerView obfuscation",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object NormalizeRecyclerViewPatch : BytecodePatch(setOf(RecyclerViewHolderFingerprint)) {
    override fun execute(context: BytecodeContext) {
        val recyclerViewHolderType = RecyclerViewHolderFingerprint.result?.classDef?.type
            ?: throw RecyclerViewHolderFingerprint.exception
        val myViewHolderType = "app.revanced.bilibili.widget.RecyclerViewHolder".classDescriptor
        context.findClass(myViewHolderType)!!.mutableClass.run {
            annotations.clear()
            setSuperClass(recyclerViewHolderType)
            methods.first { it.name == "<init>" }.run {
                annotations.clear()
                replaceInstructions(
                    0, """
                    invoke-direct {p0, p1}, $recyclerViewHolderType-><init>(Landroid/view/View;)V
                """.trimIndent()
                )
            }
            methods.first { it.name == "bindingAdapterPosition" }.replaceInstructions(
                0, """
                invoke-virtual {p0}, $recyclerViewHolderType->getBindingAdapterPosition()I
            """.trimIndent()
            )
        }
        val myAdapterType = "app.revanced.bilibili.widget.RecyclerViewAdapter".classDescriptor
        context.findClass(myAdapterType)!!.mutableClass.run {
            methods.find { it.name == "onCreateViewHolder" && it.accessFlags.isSynthetic() }
                ?.returnType = recyclerViewHolderType
            methods.find { it.name == "onBindViewHolder" && it.accessFlags.isSynthetic() }
                ?.parameterTypes?.set(0, recyclerViewHolderType)
        }
    }
}
