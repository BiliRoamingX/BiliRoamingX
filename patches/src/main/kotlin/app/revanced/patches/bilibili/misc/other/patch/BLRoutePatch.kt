package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.BLRouteBuilderFingerprint
import app.revanced.patches.bilibili.misc.other.fingerprints.RouteRequestFingerprint
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.patches.bilibili.utils.isPublic
import app.revanced.patches.bilibili.utils.isStatic
import app.revanced.util.exception

@Patch(
    name = "BL route intercept",
    description = "哔哩哔哩页面路由修改",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object BLRoutePatch : BytecodePatch(setOf(BLRouteBuilderFingerprint, RouteRequestFingerprint)) {
    override fun execute(context: BytecodeContext) {
        BLRouteBuilderFingerprint.result?.mutableClass?.methods?.find { m ->
            m.name == "<init>" && m.parameterTypes.let { it.size == 1 && it[0] == "Landroid/net/Uri;" }
        }?.addInstructions(
            0, """
            invoke-static {p1}, Lapp/revanced/bilibili/patches/BLRoutePatch;->intercept(Landroid/net/Uri;)Landroid/net/Uri;
            move-result-object p1
        """.trimIndent()
        ) ?: throw BLRouteBuilderFingerprint.exception
        val result = RouteRequestFingerprint.result
        result?.mutableClass?.methods?.find { m ->
            m.name == "<init>" && m.parameterTypes.let { it.size == 2 && it[0] == "Landroid/net/Uri;" }
        }?.addInstructions(
            0, """
            invoke-static {p1}, Lapp/revanced/bilibili/patches/BLRoutePatch;->intercept(Landroid/net/Uri;)Landroid/net/Uri;
            move-result-object p1
        """.trimIndent()
        ) ?: throw RouteRequestFingerprint.exception
        val routeToMethod = context.classes.asSequence().flatMap { it.methods }.first { m ->
            m.accessFlags.let { it.isStatic() && it.isPublic() }
                    && m.parameterTypes == listOf(
                result.classDef.type, "Landroid/content/Context;"
            )
        }
        val utilsClass = context.findClass("Lapp/revanced/bilibili/utils/Utils;")!!.mutableClass
        val utilsRouteToMethod = utilsClass.methods.first { it.name == "routeTo" }
        utilsRouteToMethod.also { utilsClass.methods.remove(it) }
            .cloneMutable(registerCount = 3, clearImplementation = true).apply {
                addInstructions(
                    """
                    new-instance v0, ${result.classDef}
                    invoke-direct {v0, p0}, ${result.classDef}-><init>(Landroid/net/Uri;)V
                    invoke-static {v0, p1}, $routeToMethod
                    return-void
                """.trimIndent()
                )
            }.also { utilsClass.methods.add(it) }
    }
}
