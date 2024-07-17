@file:Suppress("UnstableApiUsage")

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.ksp)
}

setupAppModule {
    namespace = "app.revanced.bilibili.integrations"

    defaultConfig {
        applicationId = "app.revanced.bilibili.integrations"
        multiDexEnabled = false

        val verName = version as String
        versionName = verName
        versionCode = verName.split('.').let { (m, s, f) ->
            m.toInt() * 1000000 + s.toInt() * 1000 + f.toInt()
        }

        externalNativeBuild {
            cmake {
                val flags = arrayOf(
                    "-Qunused-arguments",
                    "-Wno-gnu-string-literal-operator-template",
                    "-fno-rtti",
                    "-fvisibility=hidden",
                    "-fvisibility-inlines-hidden",
                    "-fno-exceptions",
                    "-fno-stack-protector",
                    "-fomit-frame-pointer",
                    "-Wno-builtin-macro-redefined",
                    "-ffunction-sections",
                    "-fdata-sections",
                    "-Wno-unused-value",
                    "-D__FILE__=__FILE_NAME__",
                    "-Wl,--exclude-libs,ALL",
                )
                cFlags("-std=c18", *flags)
                cppFlags("-std=c++20", *flags)
                targets("biliroamingx")
            }
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            signingConfig = signingConfigs.getByName("debug")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            val flags = arrayOf(
                "-Wl,--gc-sections",
                "-flto",
                "-fno-unwind-tables",
                "-fno-asynchronous-unwind-tables",
            )
            val configFlags = arrayOf(
                "-Oz",
                "-DNDEBUG"
            ).joinToString(" ")
            val args = arrayOf(
                "-DANDROID_STL=c++_shared",
                "-DCMAKE_BUILD_TYPE=Release",
                "-DCMAKE_CXX_FLAGS_RELEASE=$configFlags",
                "-DCMAKE_C_FLAGS_RELEASE=$configFlags",
            )
            externalNativeBuild.cmake {
                cFlags += flags
                cppFlags += flags
                arguments += args
            }
        }
        applicationVariants.all {
            outputs.all {
                this as com.android.build.gradle.internal.api.ApkVariantOutputImpl

                outputFileName = "${rootProject.name}-${parent!!.name}-$versionName.apk"
            }
        }
    }

    buildFeatures {
        buildConfig = true
        resValues = false
    }

    packaging {
        // since it's already packaged in host client
        jniLibs.excludes += "**/libc++_shared.so"
        resources.excludes += setOf(
            "kotlin/**",
            "META-INF/**",
            "kotlin-tooling-metadata.json",
        )
    }

    externalNativeBuild {
        cmake {
            path = file("src/main/jni/CMakeLists.txt")
        }
    }
}

dependencies {
    implementation(projects.integrations.extend)
    implementation(libs.hiddenapibypass)
    implementation(libs.truetypeparser)
    implementation(libs.androidx.documentfile) {
        exclude(libs.androidx.annotation.get().group)
    }
    implementation(libs.kotlinx.serialization.json)
    ksp(projects.integrations.ksp)
    compileOnly(projects.integrations.dummy)
}

tasks.named<Delete>("clean") {
    delete(layout.projectDirectory.dir(".cxx"))
}
