@file:SuppressLint("KtxExtensionAvailable")

import android.annotation.SuppressLint

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 34
    namespace = "app.revanced.integrations"

    defaultConfig {
        applicationId = "app.revanced.integrations"
        minSdk = 24
        targetSdk = 34
        multiDexEnabled = false
        versionName = project.version as String
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
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_11)
        targetCompatibility(JavaVersion.VERSION_11)
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

dependencies {
    implementation(project(mapOf("path" to ":extend")))
    implementation("org.lsposed.hiddenapibypass:hiddenapibypass:4.3")
    compileOnly(project(mapOf("path" to ":dummy")))
    compileOnly("androidx.annotation:annotation:1.6.0")
    compileOnly("androidx.appcompat:appcompat:1.7.0-alpha03")
    compileOnly("com.squareup.okhttp3:okhttp:5.0.0-alpha.11")
    compileOnly("com.squareup.retrofit2:retrofit:2.9.0")
    compileOnly("androidx.preference:preference:1.2.0")
    compileOnly("com.google.protobuf:protobuf-javalite:3.23.2")
}

tasks.register("publish") { dependsOn("build") }
