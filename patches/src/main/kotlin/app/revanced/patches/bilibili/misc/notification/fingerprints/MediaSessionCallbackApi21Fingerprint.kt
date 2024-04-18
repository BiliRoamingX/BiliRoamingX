package app.revanced.patches.bilibili.misc.notification.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object MediaSessionCallbackApi21Fingerprint : MethodFingerprint(
    strings = listOf("android.support.v4.media.session.action.PLAY_FROM_URI", "Could not unparcel the data."),
    parameters = listOf("Ljava/lang/String;", "Landroid/os/Bundle;"),
    returnType = "V"
)
