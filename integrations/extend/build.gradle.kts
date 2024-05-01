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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    compileOnly(projects.integrations.dummy)
    compileOnly(libs.protobuf)
}
