package app.revanced.patches.bilibili.misc.copy.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object ConversationCopyFingerprint : MethodFingerprint(
    returnType = "V",
    strings = listOf("clipboard", "im.chat-group.msg.repost.click"),
    customFingerprint = { _, classDef ->
        classDef.type == "Lcom/bilibili/bplus/im/conversation/ConversationActivity;"
    }
)
