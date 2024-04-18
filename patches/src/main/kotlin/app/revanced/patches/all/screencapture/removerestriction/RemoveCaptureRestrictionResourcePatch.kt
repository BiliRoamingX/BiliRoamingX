package app.revanced.patches.all.screencapture.removerestriction

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.get
import app.revanced.util.set

@Patch(description = "Sets allowAudioPlaybackCapture in manifest to true.")
internal object RemoveCaptureRestrictionResourcePatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        // create an xml editor instance
        context.document["AndroidManifest.xml"].use { dom ->
            dom["application"]["android:allowAudioPlaybackCapture"] = "true"
        }
    }
}
