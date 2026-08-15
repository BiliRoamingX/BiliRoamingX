package app.revanced.patches.bilibili.video.player.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableField.Companion.toMutable
import app.revanced.patches.bilibili.utils.Field
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.patches.bilibili.utils.proxy
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction

@Patch(
    name = "Long press lock",
    description = "实现长按倍速锁定",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili")
    ]
)
object LongPressLockPatch : BytecodePatch(setOf()) {
    override fun execute(context: BytecodeContext) {
        val patchListener = context.findClass("Lapp/revanced/bilibili/patches/LongPressLockPatch;")!!.mutableClass
        val patchOnLongPress = patchListener.methods.first { it.name == "onLongPress" }
        val patchOnLongPressEnd = patchListener.methods.first { it.name == "onLongPressEnd" }
        val gestureService = context.findClass("Lcom/bilibili/playerbizcommon/gesture/IGestureService;")?.mutableClass
            ?: throw PatchException("Failed to find IGestureService class")
        val proxyListenerType = gestureService.methods.firstOrNull { it.name == "addOnLongPressScrollListener" }?.parameterTypes?.firstOrNull()?.toString()
            ?: throw PatchException("Failed to find IGestureService#addOnLongPressScrollListener method")
        val addOnLongPressScrollListener = gestureService.methods.firstOrNull { it.name == $$"addOnLongPressScrollListener$default" } ?: throw PatchException("Failed to find IGestureService#addOnLongPressScrollListener method")
        patchListener.interfaces.let {
            it.clear()
            it.add(proxyListenerType)
        }
        val longPressListener = context.classes.firstOrNull {
            it.type.startsWith("Lcom/bilibili/ship/theseus/united/player/")
            && it.interfaces.contains("Lcom/bilibili/playerbizcommon/gesture/OnLongPressListener;")
        }?.proxy(context) ?: throw PatchException("Failed to find OnLongPressListener class")
        val initLongPressListener = longPressListener.methods.firstOrNull { it.name == "<init>" }.also { longPressListener.methods.remove(it) } ?: throw PatchException("Failed to find OnLongPressListener#<init> method")
        val onLongPress = longPressListener.methods.firstOrNull { it.name == "onLongPress" } ?: throw PatchException("Failed to find OnLongPressListener#onLongPress method")
        val onLongPressEnd = longPressListener.methods.firstOrNull { it.name == "onLongPressEnd" } ?: throw PatchException("Failed to find OnLongPressListener#onLongPressEnd method")
        val playerField = longPressListener.fields.firstOrNull { it.type.startsWith("Lcom/bilibili/ship/theseus/united/player/") } ?: throw PatchException("Failed to find Player field")
        Field(
            definingClass = longPressListener.type,
            name = "mOnLongPressScrollListener",
            type = patchListener.type,
            accessFlags = AccessFlags.PUBLIC.value,
        ).toMutable().let { longPressListener.fields.add(it) }
        initLongPressListener.cloneMutable(registerCount = 3, clearImplementation = true).apply {
            addInstructions(
                0, """
                invoke-direct {p0}, Ljava/lang/Object;-><init>()V
                iput-object p1, p0, $playerField
                new-instance v0, Lapp/revanced/bilibili/patches/LongPressLockPatch;
                invoke-direct {v0, p1, p0}, Lapp/revanced/bilibili/patches/LongPressLockPatch;-><init>(Ljava/lang/Object;Lcom/bilibili/playerbizcommon/gesture/OnLongPressListener;)V
                iput-object v0, p0, ${longPressListener.type}->mOnLongPressScrollListener:Lapp/revanced/bilibili/patches/LongPressLockPatch;
                return-void
                """.trimIndent()
            )
        }.also { longPressListener.methods.add(it) }
        onLongPress.cloneMutable(registerCount = 4, clearImplementation = true).apply {
            onLongPress.name += "_Origin"
            addInstructions(
                0, """
                iget-object v0, p0, ${longPressListener.type}->mOnLongPressScrollListener:Lapp/revanced/bilibili/patches/LongPressLockPatch;
                invoke-virtual {v0}, $patchOnLongPress
                move-result v1
                if-nez v1, :return
                invoke-virtual {p0, p1}, $onLongPress
                move-result v1
                :return
                return v1
                """.trimIndent()
            )
        }.also { longPressListener.methods.add(it) }
        onLongPressEnd.cloneMutable(registerCount = 4, clearImplementation = true).apply {
            onLongPressEnd.name += "_Origin"
            addInstructions(
                0, """
                iget-object v0, p0, ${longPressListener.type}->mOnLongPressScrollListener:Lapp/revanced/bilibili/patches/LongPressLockPatch;
                invoke-virtual {v0}, $patchOnLongPressEnd
                move-result v1
                if-nez v1, :return
                invoke-virtual {p0, p1}, $onLongPressEnd
                :return
                return-void
                """.trimIndent()
            )
        }.also { longPressListener.methods.add(it) }
        val registerClass = context.classes.firstOrNull {
            it.type.startsWith("Lcom/bilibili/ship/theseus/united/player/")
            && it.methods.any { m ->
                m.implementation?.instructions?.any { i ->
                    i is ReferenceInstruction
                    && i.reference.toString() == initLongPressListener.toString()
                } == true
            }
        }?.proxy(context) ?: throw PatchException("Failed to find OnLongPressListener register class")
        val registerMethod = registerClass.methods.firstOrNull {m ->
            m.implementation?.instructions?.any { i ->
                i is ReferenceInstruction
                && i.reference.toString() == initLongPressListener.toString()
            } == true
        } ?: throw PatchException("Failed to find OnLongPressListener register method")
        val longPressListenerField = registerClass.fields.firstOrNull { it.type == "Ljava/lang/Object;" } ?: throw PatchException("Failed to find OnLongPressListener field")
        val index = registerMethod.implementation!!.instructions.indexOfFirst { i ->
            i.opcode == Opcode.IPUT_OBJECT
            && i is ReferenceInstruction
            && i.reference.toString() == longPressListenerField.toString()
        }
        registerMethod.addInstructions(
            index + 1, """
            iget-object p1, p1, ${longPressListener.type}->mOnLongPressScrollListener:Lapp/revanced/bilibili/patches/LongPressLockPatch;
            invoke-static {v1, p1, v4, v5, v3}, $addOnLongPressScrollListener
            """.trimIndent()
        )
    }
}