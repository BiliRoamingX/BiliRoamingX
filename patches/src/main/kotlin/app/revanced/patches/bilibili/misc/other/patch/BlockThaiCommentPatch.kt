package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import com.android.tools.smali.dexlib2.AccessFlags

@Patch(
    name = "Block thai comment",
    description = "禁止泰区评论",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object BlockThaiCommentPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        context.findClass("Lcom/bilibili/bangumi/ui/page/detail/BangumiCommentInvalidFragmentV2;")
            ?.mutableClass?.methods?.find { it.name == "onViewCreated" }?.addInstructionsWithLabels(
                1, """
                    invoke-static {p0}, Lapp/revanced/bilibili/patches/okhttp/BangumiSeasonHook;->onCommentInvalidFragmentViewCreated(Landroidx/fragment/app/Fragment;)Z
                    move-result v0
                    if-eqz v0, :jump
                    return-void
                    :jump
                    nop
                """.trimIndent()
            )
        context.findClass("Lcom/bilibili/bangumi/ui/page/detail/OGVCommentFragment;")
            ?.mutableClass?.run {
                methods.find { m ->
                    AccessFlags.STATIC.isSet(m.accessFlags) && !AccessFlags.SYNTHETIC.isSet(m.accessFlags)
                            && m.parameterTypes.let {
                        it.size == 3 && it[0] == this.type && it[2] == "Lkotlin/Pair;"
                    } && m.returnType == "V"
                }
            }?.addInstructionsWithLabels(
                1, """
                invoke-static {v0}, Lapp/revanced/bilibili/patches/okhttp/BangumiSeasonHook;->onCommentInvalidFragmentViewCreated(Landroidx/fragment/app/Fragment;)Z
                move-result v1
                if-eqz v1, :jump
                return-void
                :jump
                nop
            """.trimIndent()
            )
    }
}
