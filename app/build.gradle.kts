@file:SuppressLint("KtxExtensionAvailable")

import android.annotation.SuppressLint

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 34
    namespace = "app.revanced.bilibili.integrations"

    defaultConfig {
        applicationId = "app.revanced.bilibili.integrations"
        minSdk = 24
        targetSdk = 34
        multiDexEnabled = false
        val verName = project.version as String
        versionName = verName
        versionCode = verName.split('.', limit = 3).let { (m, s, f) ->
            m.toInt() * 1000000 + s.toInt() * 1000 + f.toInt()
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
        }
        applicationVariants.all {
            outputs.all {
                this as com.android.build.gradle.internal.api.ApkVariantOutputImpl

                outputFileName = "${rootProject.name}-$versionName.apk"
            }
        }
    }
    buildFeatures {
        buildConfig = true
        resValues = false
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_17)
        targetCompatibility(JavaVersion.VERSION_17)
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    implementation(project(mapOf("path" to ":extend")))
    implementation("org.lsposed.hiddenapibypass:hiddenapibypass:4.3")
    implementation("io.github.yubyf:truetypeparser-light:2.1.4")
    implementation("androidx.documentfile:documentfile:1.0.1") {
        isTransitive = false
    }
    compileOnly(project(mapOf("path" to ":dummy")))
    compileOnly("androidx.annotation:annotation:1.7.1")
    compileOnly("androidx.appcompat:appcompat:1.7.0-alpha03")
    compileOnly("androidx.preference:preference:1.2.1")
    compileOnly("com.google.protobuf:protobuf-javalite:3.25.2")
}

tasks.register("publish") { dependsOn("build") }
