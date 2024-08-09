package app.revanced.patches.bilibili.layout.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.ResourceGroup
import app.revanced.util.copyResources

@Patch(
    name = "Restore pay coins",
    description = "恢复旧版2233娘投币页面",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object PayCoinsPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        val icons = arrayOf(
            "ic_coins_one_v2.png",
            "ic_coins_two_v2.png",
            "ic_pay_1coin_22_playpage.png",
            "ic_pay_2coin_22_playpage.png",
            "ic_22_not_enough_pay_v2.png",
            "ic_pay_coins_box_v2.png",
        )
        context.copyResources(
            "bilibili/paycoins",
            ResourceGroup("drawable-xxhdpi", *icons)
        )
    }
}
