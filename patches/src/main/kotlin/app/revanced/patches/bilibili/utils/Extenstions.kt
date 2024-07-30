package app.revanced.patches.bilibili.utils

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.util.proxy.mutableTypes.MutableClass
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod.Companion.toMutable
import app.revanced.patches.bilibili.patcher.fingerprint.MultiMethodFingerprint
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.HiddenApiRestriction
import com.android.tools.smali.dexlib2.iface.*
import com.android.tools.smali.dexlib2.iface.Annotation
import com.android.tools.smali.dexlib2.iface.instruction.FiveRegisterInstruction
import com.android.tools.smali.dexlib2.iface.value.ArrayEncodedValue
import com.android.tools.smali.dexlib2.iface.value.EncodedValue
import com.android.tools.smali.dexlib2.iface.value.TypeEncodedValue
import com.android.tools.smali.dexlib2.immutable.*
import com.android.tools.smali.dexlib2.immutable.debug.ImmutableDebugItem
import com.android.tools.smali.dexlib2.immutable.instruction.ImmutableInstruction
import com.android.tools.smali.dexlib2.immutable.value.ImmutableArrayEncodedValue
import com.android.tools.smali.dexlib2.immutable.value.ImmutableEncodedValue
import com.android.tools.smali.dexlib2.immutable.value.ImmutableStringEncodedValue

fun Method.clone(
    registerCount: Int = implementation?.registerCount ?: 0,
    clearImplementation: Boolean = false,
    name: String = this.name,
    accessFlags: Int = this.accessFlags,
    parameters: List<MethodParameter> = this.parameters,
): ImmutableMethod {
    val clonedImplementation = implementation?.let {
        ImmutableMethodImplementation(
            registerCount,
            if (clearImplementation) emptyList() else it.instructions,
            if (clearImplementation) emptyList() else it.tryBlocks,
            if (clearImplementation) emptyList() else it.debugItems,
        )
    }
    return ImmutableMethod(
        definingClass,
        name,
        parameters,
        returnType,
        accessFlags,
        annotations,
        hiddenApiRestrictions,
        clonedImplementation
    )
}

fun Method.cloneMutable(
    registerCount: Int = implementation?.registerCount ?: 0,
    clearImplementation: Boolean = false,
    name: String = this.name,
    accessFlags: Int = this.accessFlags,
    parameters: List<MethodParameter> = this.parameters,
) = clone(registerCount, clearImplementation, name, accessFlags, parameters).toMutable()

fun Int.toPublic() = or(AccessFlags.PUBLIC.value).and(AccessFlags.PRIVATE.value.inv())
fun Int.removeFinal() = and(AccessFlags.FINAL.value.inv())
fun Int.isAbstract() = !AccessFlags.INTERFACE.isSet(this) && AccessFlags.ABSTRACT.isSet(this)
fun Int.isInterface() = AccessFlags.INTERFACE.isSet(this) && AccessFlags.ABSTRACT.isSet(this)
fun Int.isNative() = AccessFlags.NATIVE.isSet(this)
fun Int.isStatic() = AccessFlags.STATIC.isSet(this)
fun Int.isPublic() = AccessFlags.PUBLIC.isSet(this)
fun Int.isPrivate() = AccessFlags.PRIVATE.isSet(this)
fun Int.isSynthetic() = AccessFlags.SYNTHETIC.isSet(this)

fun Method(
    definingClass: String,
    name: String,
    returnType: String,
    accessFlags: Int,
    parameters: List<ImmutableMethodParameter>? = null,
    annotations: Set<ImmutableAnnotation>? = null,
    hiddenApiRestrictions: Set<HiddenApiRestriction>? = null,
    implementation: ImmutableMethodImplementation? = null
) = ImmutableMethod(
    definingClass,
    name,
    parameters,
    returnType,
    accessFlags,
    annotations,
    hiddenApiRestrictions,
    implementation
)

fun MethodParameter(
    type: String,
    name: String? = null,
    annotations: Set<ImmutableAnnotation>? = null
) = ImmutableMethodParameter(type, annotations, name)

val String.encodedValue: ImmutableStringEncodedValue
    get() = StringEncodedValue(this)

fun StringEncodedValue(value: String) = ImmutableStringEncodedValue(value)

fun ArrayEncodedValue(
    value: List<ImmutableEncodedValue>
) = ImmutableArrayEncodedValue(value)

fun AnnotationElement(
    name: String,
    value: ImmutableEncodedValue
) = ImmutableAnnotationElement(name, value)

fun Annotation(
    visibility: Int,
    type: String,
    elements: Set<ImmutableAnnotationElement>? = null,
) = ImmutableAnnotation(visibility, type, elements)

fun MethodImplementation(
    registerCount: Int,
    instructions: List<ImmutableInstruction>? = null,
    tryBlocks: List<ImmutableTryBlock>? = null,
    debugItems: List<ImmutableDebugItem>? = null
) = ImmutableMethodImplementation(registerCount, instructions, tryBlocks, debugItems)

val MultiMethodFingerprint.exception
    get() = PatchException("Failed to resolve ${this.javaClass.simpleName}")

val String.className: String
    get() = if (startsWith("L") && endsWith(";"))
        substring(1, length - 1).replace('/', '.')
    else replace('/', '.')

val String.classDescriptor: String
    get() = "L${replace('.', '/')};"

fun Field(
    definingClass: String,
    name: String,
    type: String,
    accessFlags: Int,
    initialValue: ImmutableEncodedValue? = null,
    annotations: Set<ImmutableAnnotation>? = null,
    hiddenApiRestrictions: Set<HiddenApiRestriction>? = null,
) = ImmutableField(
    definingClass,
    name,
    type,
    accessFlags,
    initialValue,
    annotations,
    hiddenApiRestrictions
)

fun FiveRegisterInstruction.args(): String {
    return arrayOf(registerC, registerD, registerE, registerF, registerG)
        .take(registerCount).joinToString(",") { "v$it" }
}

fun Annotatable.annotation(type: String) = annotations.find { it.type == type }

inline fun <reified T : EncodedValue> Annotation.value(name: String): T? =
    elements.find { it.name == name }?.value as? T

fun ClassDef.memberClasses() = annotation("Ldalvik/annotation/MemberClasses;")
    ?.value<ArrayEncodedValue>("value")?.value
    ?.filterIsInstance<TypeEncodedValue>()?.map { it.value }.orEmpty()

fun String.toClassDef(context: BytecodeContext): ClassDef {
    return context.classes.first { it.type == this }
}

fun String.toClassDefOrNull(context: BytecodeContext): ClassDef? {
    return context.classes.find { it.type == this }
}

fun ClassDef.proxy(context: BytecodeContext): MutableClass {
    return context.proxy(this).mutableClass
}

fun MutableClass.addDefaultConstructorIfNeeded() {
    if (methods.any { it.name == "<init>" && it.parameterTypes.isEmpty() })
        return
    Method(
        definingClass = type,
        name = "<init>",
        returnType = "V",
        accessFlags = AccessFlags.PUBLIC.value or AccessFlags.CONSTRUCTOR.value,
        implementation = MethodImplementation(registerCount = 1),
    ).toMutable().apply {
        addInstructions(
            0, """
            invoke-direct {p0}, Ljava/lang/Object;-><init>()V
            return-void
        """.trimIndent()
        )
    }.also { methods.add(it) }
}
