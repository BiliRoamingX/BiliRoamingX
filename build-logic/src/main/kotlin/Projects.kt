@file:Suppress("UnstableApiUsage")

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Project
import org.gradle.api.provider.Property

fun Project.setupLibraryModule(block: LibraryExtension.() -> Unit = {}) {
    setupBaseModule<LibraryExtension> {
        defaultConfig {
            if (file("consumer-rules.pro").isFile)
                consumerProguardFiles("consumer-rules.pro")
        }
        block()
    }
}

fun Project.setupAppModule(block: BaseAppModuleExtension.() -> Unit = {}) {
    setupBaseModule<BaseAppModuleExtension> {
        externalNativeBuild {
            cmake {
                version = Versions.CMAKE
            }
        }
        block()
    }
}

fun Property<*>.allowChanges() {
    val state = javaClass.superclass.declaredFields.first { it.name == "state" }
        .also { it.isAccessible = true }.get(this)
    state.javaClass.declaredFields.first { it.name == "disallowChanges" }
        .also { it.isAccessible = true }.setBoolean(state, false)
}

private inline fun <reified T : BaseExtension> Project.setupBaseModule(crossinline block: T.() -> Unit = {}) {
    extensions.configure<BaseExtension>("android") {
        compileSdkVersion(Versions.COMPILE_SDK)
        ndkVersion = Versions.NDK
        defaultConfig {
            minSdk = Versions.MIN_SDK
            targetSdk = Versions.TARGET_SDK
        }
        (this as T).block()
    }
}
