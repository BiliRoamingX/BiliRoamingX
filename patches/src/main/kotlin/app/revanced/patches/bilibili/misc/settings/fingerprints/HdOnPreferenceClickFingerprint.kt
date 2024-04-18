package app.revanced.patches.bilibili.misc.settings.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction

open class HdOnPreferenceClickFingerprint(type: String) : MethodFingerprint(
    parameters = listOf("Landroid/app/Activity;", "Lcom/bilibili/lib/homepage/mine/MenuGroup\$Item;"),
    returnType = "V",
    customFingerprint = { methodDef, _ ->
        methodDef.implementation?.instructions?.let { insts ->
            insts.any { it.opcode == Opcode.INSTANCE_OF && (it as ReferenceInstruction).reference.toString() == "Ltv/danmaku/bilibilihd/ui/main/mine/HdHomeUserCenterFragment;" }
                    && insts.any { it.opcode == Opcode.INSTANCE_OF && (it as ReferenceInstruction).reference.toString() == "Ltv/danmaku/bilibilihd/ui/main/mine/HdMineFragment;" }
                    && insts.any { it.opcode == Opcode.INSTANCE_OF && (it as ReferenceInstruction).reference.toString() == type }
        } ?: false
    }
)

object HdOnSettingsClickFingerprint :
    HdOnPreferenceClickFingerprint("Ltv/danmaku/bilibilihd/ui/main/preference/HdPreferenceFragment;")

object HdOnWatchLaterClickFingerprint :
    HdOnPreferenceClickFingerprint("Ltv/danmaku/bilibilihd/ui/main/mine/HdWatchLaterFragment;")

object HdOnImClickFingerprint :
    HdOnPreferenceClickFingerprint("Lcom/bilibili/bplus/im/communication/HomeCommunicationFragment;")

object HdOnContactClickFingerprint :
    HdOnPreferenceClickFingerprint("Ltv/danmaku/bili/ui/webview/HDWebFragment;")

object HdOnCourseClickFingerprint : MethodFingerprint(
    parameters = listOf("Landroid/app/Activity;", "Lcom/bilibili/lib/homepage/mine/MenuGroup\$Item;"),
    returnType = "V",
    strings = listOf("bilibili://user_center/course")
)
