package app.revanced.patches.bilibili.misc.webview.patch

import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod
import app.revanced.patches.all.misc.transformation.BaseTransformInstructionsPatch
import app.revanced.patches.all.misc.transformation.IMethodCall
import app.revanced.patches.all.misc.transformation.Instruction35cInfo
import app.revanced.patches.all.misc.transformation.filterMapInstruction35c
import com.android.tools.smali.dexlib2.iface.ClassDef
import com.android.tools.smali.dexlib2.iface.Method
import com.android.tools.smali.dexlib2.iface.instruction.Instruction

@Patch(
    name = "Webview",
    description = "WebView 补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object WebViewPatch : BaseTransformInstructionsPatch<Instruction35cInfo>() {
    enum class MethodCall(
        override val definedClassName: String,
        override val methodName: String,
        override val methodParams: Array<String>,
        override val returnType: String
    ) : IMethodCall {
        SetWebViewClient(
            "Landroid/webkit/WebView;",
            "setWebViewClient",
            arrayOf("Landroid/webkit/WebViewClient;"),
            "V"
        ),
    }

    override fun filterMap(
        classDef: ClassDef,
        method: Method,
        instruction: Instruction,
        instructionIndex: Int
    ) = filterMapInstruction35c<MethodCall>(
        INTEGRATIONS_CLASS_DESCRIPTOR_PREFIX,
        classDef,
        instruction,
        instructionIndex
    )

    override fun transform(mutableMethod: MutableMethod, entry: Instruction35cInfo) {
        val (methodType, instruction, instructionIndex) = entry
        methodType.replaceInvokeVirtualWithIntegrations(
            INTEGRATIONS_CLASS_DESCRIPTOR,
            mutableMethod,
            instruction,
            instructionIndex
        )
    }

    private const val INTEGRATIONS_CLASS_DESCRIPTOR_PREFIX =
        "Lapp/revanced/bilibili/patches/webview/WebViewPatch"
    private const val INTEGRATIONS_CLASS_DESCRIPTOR = "$INTEGRATIONS_CLASS_DESCRIPTOR_PREFIX;"
}
