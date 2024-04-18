package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object StoryMenuFingerprint : MethodFingerprint(
    strings = listOf("story_action_normal_share", "story_setting_normal_share")
)
