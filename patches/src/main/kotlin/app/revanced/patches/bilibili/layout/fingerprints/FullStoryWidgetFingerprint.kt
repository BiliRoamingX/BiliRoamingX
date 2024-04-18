package app.revanced.patches.bilibili.layout.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

open class FullStoryWidgetFingerprint(tagName: String) : MethodFingerprint(
    strings = listOf(tagName, "player.player.story-button.0.player")
)

object PlayerFullStoryWidgetFingerprint : FullStoryWidgetFingerprint("PlayerFullStoryWidget")
object GeminiPlayerFullStoryWidgetFingerprint : FullStoryWidgetFingerprint("GeminiPlayerFullStoryWidget")
