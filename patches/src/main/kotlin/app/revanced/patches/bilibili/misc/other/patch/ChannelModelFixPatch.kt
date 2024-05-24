package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.utils.*
import com.android.tools.smali.dexlib2.iface.ClassDef
import com.android.tools.smali.dexlib2.iface.value.StringEncodedValue

@Patch(
    name = "Channel model fix",
    description = "频道相关 model 类构造修复(官方 BUG)",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object ChannelModelFixPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        fun BytecodeContext.findJSONFieldAnnotationMatchedClass(fieldsNames: Set<String>): ClassDef? {
            return classes.find { c ->
                c.fields.mapNotNull { f ->
                    f.annotation("Lcom/alibaba/fastjson/annotation/JSONField;")
                        ?.value<StringEncodedValue>("name")?.value
                }.toSet() == fieldsNames
            }
        }

        val channelClassDef = context.findJSONFieldAnnotationMatchedClass(setOf("stick", "normal", "scaned", "config"))
            ?: throw PatchException("not found channel model class")
        channelClassDef.memberClasses().map { it.toClassDef(context) }.forEach {
            it.proxy(context).addDefaultConstructorIfNeeded()
        }

        val extendClassDef = context.findJSONFieldAnnotationMatchedClass(setOf("label", "model_type", "items"))
            ?: throw PatchException("not found extend model class")
        extendClassDef.proxy(context).addDefaultConstructorIfNeeded()
    }
}
