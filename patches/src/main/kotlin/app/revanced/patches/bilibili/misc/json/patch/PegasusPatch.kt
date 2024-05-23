package app.revanced.patches.bilibili.misc.json.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod
import app.revanced.patches.bilibili.misc.json.fingerprints.CardClickProcessorFingerprint
import app.revanced.patches.bilibili.misc.json.fingerprints.CardClickProcessorNewFingerprint
import app.revanced.patches.bilibili.misc.json.fingerprints.PegasusParserFingerprint
import app.revanced.patches.bilibili.utils.annotation
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.patches.bilibili.utils.proxy
import app.revanced.patches.bilibili.utils.value
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.iface.value.StringEncodedValue

@Patch(
    name = "Pegasus hook",
    description = "首页推荐流hook",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object PegasusPatch : BytecodePatch(
    setOf(
        PegasusParserFingerprint,
        CardClickProcessorFingerprint,
        CardClickProcessorNewFingerprint
    )
) {
    override fun execute(context: BytecodeContext) {
        PegasusParserFingerprint.result?.run {
            val method = mutableClass.methods.first {
                it.returnType == "Lcom/bilibili/okretro/GeneralResponse;"
            }
            method.cloneMutable(registerCount = 2, clearImplementation = true).apply {
                method.name += "_Origin"
                addInstructions(
                    """
                    invoke-virtual {p0, p1}, $method
                    move-result-object p1
                    invoke-static {p1}, Lapp/revanced/bilibili/patches/json/PegasusPatch;->pegasusHook(Lcom/bilibili/okretro/GeneralResponse;)V
                    return-object p1
                """.trimIndent()
                )
            }.also {
                mutableClass.methods.add(it)
            }
        } ?: throw PegasusParserFingerprint.exception
        val (stockBannersItemClass, bannerItemFiled) = context.classes.firstNotNullOfOrNull { c ->
            if (c.superclass == "Lcom/bilibili/pegasus/api/model/BasicIndexItem;") c.fields.find {
                it.annotation("Lcom/alibaba/fastjson/annotation/JSONField;")
                    ?.value<StringEncodedValue>("name")?.value == "banner_item"
            }?.let { c to it } else null
        } ?: throw PatchException("not found banner item field")
        val myBannersItemClassName = "Lapp/revanced/bilibili/meta/pegasus/BannersItem;"
        val myBannersItemClass = context.findClass(myBannersItemClassName)!!
        stockBannersItemClass.proxy(context).setSuperClass(myBannersItemClassName)
        myBannersItemClass.mutableClass.methods.run {
            find { it.name == "getBanners" }?.also { remove(it) }
                ?.cloneMutable(3, clearImplementation = true)
                ?.apply {
                    addInstructions(
                        """
                        move-object v0, p0
                        check-cast v0, $stockBannersItemClass
                        iget-object v1, v0, $bannerItemFiled
                        return-object v1
                    """.trimIndent()
                    )
                }?.also { add(it) }
        }
        fun MutableMethod.hookOnFeedClick() = addInstructionsWithLabels(
            0, """
            invoke-static {p3}, Lapp/revanced/bilibili/patches/json/PegasusPatch;->onFeedClick(Lcom/bilibili/app/comm/list/common/data/DislikeReason;)Z
            move-result v0
            if-eqz v0, :jump
            return-void
            :jump
            nop
        """.trimIndent()
        )
        CardClickProcessorFingerprint.result?.mutableMethod?.hookOnFeedClick()
            ?: throw CardClickProcessorFingerprint.exception
        // only exist on 7.63.0 alpha version now
        CardClickProcessorNewFingerprint.result?.mutableMethod?.hookOnFeedClick()
    }
}
