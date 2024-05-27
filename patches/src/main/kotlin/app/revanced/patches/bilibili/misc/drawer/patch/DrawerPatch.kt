package app.revanced.patches.bilibili.misc.drawer.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstruction
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.extensions.InstructionExtensions.replaceInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.drawer.fingerprints.CloseDrawerControlFingerprint
import app.revanced.patches.bilibili.misc.drawer.fingerprints.DrawerIsOpenFingerprint
import app.revanced.patches.bilibili.misc.drawer.fingerprints.DrawerLayoutParamsFingerprint
import app.revanced.patches.bilibili.misc.drawer.fingerprints.OpenDrawerControlFingerprint
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.patches.bilibili.utils.isPublic
import app.revanced.patches.bilibili.utils.toPublic
import app.revanced.util.exception

@Patch(
    name = "Drawer",
    description = "我的页面移至侧滑栏辅助补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object DrawerPatch : BytecodePatch(
    setOf(
        OpenDrawerControlFingerprint,
        CloseDrawerControlFingerprint,
        DrawerIsOpenFingerprint,
        DrawerLayoutParamsFingerprint
    )
) {
    override fun execute(context: BytecodeContext) {
        val drawerExClass = context.findClass("Lapp/revanced/bilibili/patches/drawer/DrawerLayoutEx;")!!
        val openMethod = OpenDrawerControlFingerprint.result?.method
            ?: throw PatchException("not found openDrawer method")
        val closeMethod = CloseDrawerControlFingerprint.result?.method
            ?: throw PatchException("not found closeDrawer method")
        val isOpenMethod = DrawerIsOpenFingerprint.result?.method
            ?: throw PatchException("not found isDrawerOpen method")
        drawerExClass.mutableClass.methods.run {
            first { it.name == "openDrawerEx" }.addInstruction(
                0, "invoke-virtual {p0, p1, p2}, $openMethod"
            )
            first { it.name == "closeDrawerEx" }.addInstruction(
                0, "invoke-virtual {p0, p1, p2}, $closeMethod"
            )
            first { it.name == "isDrawerOpenEx" }.also { remove(it) }
                .cloneMutable(2, clearImplementation = true).apply {
                    addInstructions(
                        """
                        invoke-virtual {p0, p1}, $isOpenMethod
                        move-result p1
                        return p1
                    """.trimIndent()
                    )
                }.also { add(it) }
        }
        val layoutParamsExClass =
            context.findClass("Lapp/revanced/bilibili/patches/drawer/DrawerLayoutEx\$LayoutParamsEx;")!!
        val result = DrawerLayoutParamsFingerprint.result
            ?: throw DrawerLayoutParamsFingerprint.exception
        val gravityField = result.mutableClass.fields.first {
            it.type == "I" && it.accessFlags.isPublic()
        }
        val openStateField = result.mutableClass.fields.first {
            it.type == "I" && it.accessFlags == 0
        }.also { it.accessFlags = it.accessFlags.toPublic() }
        layoutParamsExClass.mutableClass.setSuperClass(gravityField.definingClass)
        layoutParamsExClass.mutableClass.methods.run {
            first { it.name == "<init>" }.replaceInstruction(
                0, """
                invoke-direct {p0, p1, p2}, ${gravityField.definingClass}-><init>(II)V
            """.trimIndent()
            )
            first { it.name == "setGravityEx" }.addInstruction(
                0, """
                iput p1, p0, $gravityField
            """.trimIndent()
            )
            first { it.name == "getOpenStateEx" }.also { remove(it) }
                .cloneMutable(registerCount = 2, clearImplementation = true).apply {
                    addInstructions(
                        0, """
                        iget v0, p0, $openStateField
                        return v0
                    """.trimIndent()
                    )
                }.also { add(it) }
        }
        context.findClass("Ltv/danmaku/bili/ui/main2/basic/BaseMainFrameFragment;")
            ?.mutableClass?.methods?.find { it.name == "onViewCreated" }?.run {
                val insertIdx = implementation!!.instructions.size - 1
                addInstructions(
                    insertIdx, """
                    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;
                    move-result-object p1
                    invoke-static {p1}, Lapp/revanced/bilibili/patches/drawer/DrawerPatch;->onMainFrameFragmentViewCreated(Landroid/view/View;)V
                """.trimIndent()
                )
            } ?: throw PatchException("can not found BaseMainFrameFragment")
    }
}
