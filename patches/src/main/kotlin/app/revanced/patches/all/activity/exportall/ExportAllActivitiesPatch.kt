package app.revanced.patches.all.activity.exportall

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.children
import app.revanced.util.get
import app.revanced.util.set

@Patch(
    name = "Export all activities",
    description = "Makes all app activities exportable.",
    use = false
)
@Suppress("unused")
object ExportAllActivitiesPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        context.document["AndroidManifest.xml"].use { dom ->
            dom["application"].children().forEach { child ->
                if (child.tagName == "activity")
                    child["android:exported"] = "true"
            }
        }
    }
}
