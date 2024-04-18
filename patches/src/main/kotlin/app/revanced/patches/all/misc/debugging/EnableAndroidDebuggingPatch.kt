package app.revanced.patches.all.misc.debugging

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.get
import app.revanced.util.set

@Patch(
    name = "Enable Android debugging",
    description = "Enables Android debugging capabilities. This can slow down the app.",
    use = false
)
@Suppress("unused")
object EnableAndroidDebuggingPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        context.document["AndroidManifest.xml"].use { dom ->
            dom["application"]["android:debuggable"] = "true"
        }
    }
}
