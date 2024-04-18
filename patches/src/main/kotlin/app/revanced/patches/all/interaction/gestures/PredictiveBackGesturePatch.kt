package app.revanced.patches.all.interaction.gestures

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.get
import app.revanced.util.set

@Patch(
    name = "Predictive back gesture",
    description = "Enables the predictive back gesture introduced on Android 13.",
    use = false
)
@Suppress("unused")
object PredictiveBackGesturePatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        context.document["AndroidManifest.xml"].use { dom ->
            dom["application"]["android:enableOnBackInvokedCallback"] = "true"
        }
    }
}
