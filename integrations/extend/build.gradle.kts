plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "app.revanced.bilibili.extend"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    compileOnly(parent!!.childProjects["dummy"]!!)
    compileOnly(libs.protobuf)
}
