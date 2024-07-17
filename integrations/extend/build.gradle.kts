plugins {
    alias(libs.plugins.android.library)
}

setupLibraryModule {
    namespace = "app.revanced.bilibili.extend"
}

dependencies {
    compileOnly(projects.integrations.dummy)
}
