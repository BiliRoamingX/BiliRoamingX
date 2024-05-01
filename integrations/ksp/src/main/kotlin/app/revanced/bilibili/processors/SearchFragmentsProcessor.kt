package app.revanced.bilibili.processors

import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.ksp.toClassName
import com.squareup.kotlinpoet.ksp.writeTo

class SearchFragmentsProcessor(private val codeGenerator: CodeGenerator) : SymbolProcessor {
    override fun process(resolver: Resolver): List<KSAnnotated> {
        val annotationName = "app.revanced.bilibili.settings.search.annotation.SettingFragment"
        val classSymbols = resolver.getSymbolsWithAnnotation(annotationName)
            .filterIsInstance<KSClassDeclaration>()
            .toList().ifEmpty { return listOf() }
        val fragment = ClassName("androidx.fragment.app", "Fragment")
        val clazz = ClassName("java.lang", "Class")
            .parameterizedBy(WildcardTypeName.producerOf(fragment))
        val mapOfFragments = MAP.parameterizedBy(clazz, STRING)
        val getFunc = FunSpec.builder("getSearchFragmentsMap").apply {
            addCode(CodeBlock.builder().apply {
                returns(mapOfFragments)
                add("return mapOf(«")
                classSymbols.forEach { clazz ->
                    val className = clazz.toClassName()
                    val prefsXmlName = clazz.annotations.first {
                        it.shortName.asString() == "SettingFragment"
                    }.arguments.first().value
                    val format = "\n%T::class.java to %S,"
                    add(format, className, prefsXmlName)
                }
                add("\n")
                add("»)")
            }.build())
        }.build()
        val annotationSpec = AnnotationSpec.builder(JvmName::class).apply {
            addMember("%S", "SearchFragmentsMap")
        }.build()
        val dependencies = Dependencies(true, *Array(classSymbols.size) {
            classSymbols[it].containingFile!!
        })
        FileSpec.builder("app.revanced.bilibili.gen", "SearchFragmentsMap")
            .addAnnotation(annotationSpec)
            .addFunction(getFunc)
            .build()
            .writeTo(codeGenerator, dependencies)
        return listOf()
    }
}

class SearchFragmentsProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return SearchFragmentsProcessor(environment.codeGenerator)
    }
}
