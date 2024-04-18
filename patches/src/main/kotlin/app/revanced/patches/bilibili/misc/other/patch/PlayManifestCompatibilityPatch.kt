package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.children
import app.revanced.util.get
import app.revanced.util.insertBefore
import app.revanced.util.set

@Patch(
    name = "Play manifest compatibility",
    description = "Play版 AndroidManifest 声明缺失补全",
    compatiblePackages = [CompatiblePackage(name = "com.bilibili.app.in")]
)
object PlayManifestCompatibilityPatch : ResourcePatch() {
    private val missingPerms = arrayOf(
        "android.permission.REQUEST_INSTALL_PACKAGES",
        "android.permission.QUERY_ALL_PACKAGES",
    )

    override fun execute(context: ResourceContext) {
        context.document["AndroidManifest.xml"].use { dom ->
            val manifest = dom["manifest"]
            val permTag = "uses-permission"
            val nameAttr = "android:name"
            missingPerms.forEach { perm ->
                if (manifest.children().none { it.tagName == permTag && it[nameAttr] == perm }) {
                    manifest.insertBefore(dom["application"], permTag) {
                        this[nameAttr] = perm
                    }
                }
            }
        }
    }
}
