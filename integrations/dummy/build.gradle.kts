plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "app.revanced.bilibili.dummy"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    api(files("libs/grpc_apis.jar"))
    api(libs.fastjson)
    compileOnly(libs.androidx.preference)
    compileOnly(libs.protobuf)
}
