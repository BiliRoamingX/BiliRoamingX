plugins {
    alias(libs.plugins.android.library)
}

setupLibraryModule {
    namespace = "app.revanced.bilibili.dummy"
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
