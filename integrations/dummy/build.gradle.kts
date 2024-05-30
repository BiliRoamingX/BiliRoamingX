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
    api(libs.protobuf)
    api(libs.androidx.annotation)
    api(libs.androidx.appcompat)
    api(libs.androidx.preference)
    api(libs.androidx.recyclerview)
}
