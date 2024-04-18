package app.revanced.patches.bilibili.misc.notification.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object LiveNotificationHelperFingerprint : MethodFingerprint(
    strings = listOf("buildLiveNotification"),
    returnType = "Landroid/app/Notification;",
    parameters = listOf("Landroid/graphics/Bitmap;")
)
