package app.revanced.patches.bilibili.misc.toast.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object LessonsModeToastFingerprint : MethodFingerprint(
    strings = listOf("main.lessonmodel.enterdetail.change-pswd-success.click")
)
