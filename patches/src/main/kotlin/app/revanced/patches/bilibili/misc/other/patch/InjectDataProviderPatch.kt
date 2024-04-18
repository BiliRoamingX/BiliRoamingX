package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.appendChild
import app.revanced.util.get
import app.revanced.util.set

@Patch(
    name = "Inject DocumentsProvider",
    description = "注入可访问私有目录的 DocumentsProvider",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object InjectDataProviderPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        context.document["AndroidManifest.xml"].use { dom ->
            val packageName = dom["manifest"]["package"]
            dom["application"].appendChild("provider") {
                this["android:name"] = "app.revanced.bilibili.content.BiliDocumentsProvider"
                this["android:authorities"] = "$packageName.MTDataFilesProvider"
                this["android:enabled"] = "false"
                this["android:exported"] = "true"
                this["android:grantUriPermissions"] = "true"
                this["android:permission"] = "android.permission.MANAGE_DOCUMENTS"
                appendChild("intent-filter") {
                    appendChild("action") {
                        this["android:name"] = "android.content.action.DOCUMENTS_PROVIDER"
                    }
                }
            }
        }
    }
}
