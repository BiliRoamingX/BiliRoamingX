package app.revanced.patches.bilibili.patcher.fingerprint

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.fingerprint.MethodFingerprint
import app.revanced.patcher.fingerprint.MethodFingerprintResult
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.ClassDef
import com.android.tools.smali.dexlib2.iface.Method
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.StringReference

private typealias StringMatch = MethodFingerprintResult.MethodFingerprintScanResult.StringsScanResult.StringMatch
private typealias StringsScanResult = MethodFingerprintResult.MethodFingerprintScanResult.StringsScanResult

/**
 * Represents the [MethodFingerprint] for a method.
 * @param returnType The return type of the method.
 * @param accessFlags The access flags of the method.
 * @param parameters The parameters of the method.
 * @param opcodes The list of opcodes of the method.
 * @param strings A list of strings which a method contains.
 * @param customFingerprint A custom condition for this fingerprint.
 * A `null` opcode is equals to an unknown opcode.
 */
abstract class MultiMethodFingerprint(
    val returnType: String? = null,
    val accessFlags: Int? = null,
    val parameters: Iterable<String>? = null,
    val opcodes: Iterable<Opcode?>? = null,
    val strings: Iterable<String>? = null,
    val customFingerprint: ((methodDef: Method, classDef: ClassDef) -> Boolean)? = null
) {
    /**
     * The result of the [MethodFingerprint].
     */
    var result = mutableListOf<MethodFingerprintResult>()
    private var resolved = false

    companion object {
        /**
         * Resolve a list of [MethodFingerprint] against a list of [ClassDef].
         *
         * @param classes The classes on which to resolve the [MethodFingerprint] in.
         * @param context The [BytecodeContext] to host proxies.
         * @return True if the resolution was successful, false otherwise.
         */
        fun Iterable<MultiMethodFingerprint>.resolve(context: BytecodeContext, classes: Iterable<ClassDef>) {
            for (fingerprint in this) { // For each fingerprint
                if (fingerprint.resolved) continue
                for (classDef in classes) // search through all classes for the fingerprint
                    fingerprint.resolve(context, classDef)
                fingerprint.resolved = true
            }
        }

        /**
         * Resolve a [MethodFingerprint] against a [ClassDef].
         *
         * @param forClass The class on which to resolve the [MethodFingerprint] in.
         * @param context The [BytecodeContext] to host proxies.
         * @return True if the resolution was successful, false otherwise.
         */
        fun MultiMethodFingerprint.resolve(context: BytecodeContext, forClass: ClassDef): Boolean {
            for (method in forClass.methods)
                if (this.resolve(context, method, forClass))
                    return true
            return false
        }

        /**
         * Resolve a [MethodFingerprint] against a [Method].
         *
         * @param method The class on which to resolve the [MethodFingerprint] in.
         * @param forClass The class on which to resolve the [MethodFingerprint].
         * @param context The [BytecodeContext] to host proxies.
         * @return True if the resolution was successful or if the fingerprint is already resolved, false otherwise.
         */
        fun MultiMethodFingerprint.resolve(context: BytecodeContext, method: Method, forClass: ClassDef): Boolean {
            val methodFingerprint = this

            if (methodFingerprint.returnType != null && !method.returnType.startsWith(methodFingerprint.returnType))
                return false

            if (methodFingerprint.accessFlags != null && methodFingerprint.accessFlags != method.accessFlags)
                return false

            fun parametersEqual(
                parameters1: Iterable<CharSequence>, parameters2: Iterable<CharSequence>
            ): Boolean {
                if (parameters1.count() != parameters2.count()) return false
                val iterator1 = parameters1.iterator()
                parameters2.forEach {
                    if (!it.startsWith(iterator1.next())) return false
                }
                return true
            }

            if (methodFingerprint.parameters != null && !parametersEqual(
                    methodFingerprint.parameters, // TODO: parseParameters()
                    method.parameterTypes
                )
            ) return false

            @Suppress("UNNECESSARY_NOT_NULL_ASSERTION")
            if (methodFingerprint.customFingerprint != null && !methodFingerprint.customFingerprint!!(method, forClass))
                return false

            val stringsScanResult = if (methodFingerprint.strings != null) {
                StringsScanResult(
                    buildList {
                        val implementation = method.implementation ?: return false

                        val stringsList = methodFingerprint.strings.toMutableList()

                        implementation.instructions.forEachIndexed { instructionIndex, instruction ->
                            if (
                                instruction.opcode != Opcode.CONST_STRING &&
                                instruction.opcode != Opcode.CONST_STRING_JUMBO
                            ) return@forEachIndexed

                            val string = ((instruction as ReferenceInstruction).reference as StringReference).string
                            val index = stringsList.indexOfFirst(string::contains)
                            if (index == -1) return@forEachIndexed

                            add(StringMatch(string, instructionIndex))
                            stringsList.removeAt(index)
                        }

                        if (stringsList.isNotEmpty()) return false
                    }
                )
            } else null

            val patternScanResult = if (methodFingerprint.opcodes != null) {
                method.implementation?.instructions ?: return false

                method.patternScan(methodFingerprint) ?: return false
            } else null

            methodFingerprint.result.add(
                MethodFingerprintResult(
                    method,
                    forClass,
                    MethodFingerprintResult.MethodFingerprintScanResult(
                        patternScanResult,
                        stringsScanResult
                    ),
                    context
                )
            )

            return true
        }

        private fun Method.patternScan(
            fingerprint: MultiMethodFingerprint
        ): MethodFingerprintResult.MethodFingerprintScanResult.PatternScanResult? {
            val instructions = this.implementation!!.instructions

            val pattern = fingerprint.opcodes!!
            val instructionLength = instructions.count()
            val patternLength = pattern.count()

            for (index in 0 until instructionLength) {
                var patternIndex = 0

                while (index + patternIndex < instructionLength) {
                    val originalOpcode = instructions.elementAt(index + patternIndex).opcode
                    val patternOpcode = pattern.elementAt(patternIndex)

                    if (patternOpcode != null && patternOpcode.ordinal != originalOpcode.ordinal) {
                        // reaching maximum threshold (0) means,
                        // the pattern does not match to the current instructions
                        break
                    }

                    if (patternIndex < patternLength - 1) {
                        // if the entire pattern has not been scanned yet
                        // continue the scan
                        patternIndex++
                        continue
                    }
                    return MethodFingerprintResult.MethodFingerprintScanResult.PatternScanResult(
                        index,
                        index + patternIndex
                    )
                }
            }

            return null
        }
    }
}
