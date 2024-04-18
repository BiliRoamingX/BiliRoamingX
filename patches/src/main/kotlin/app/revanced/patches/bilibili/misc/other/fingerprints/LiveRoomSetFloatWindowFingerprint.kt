package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object LiveRoomSetFloatWindowFingerprint : MethodFingerprint(
    strings = listOf("live_float_window_is_open", "bundle_key_player_params_controller_enable_live_window_play"),
    parameters = listOf("Z"),
    returnType = "V"
)
