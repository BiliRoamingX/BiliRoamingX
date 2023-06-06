plugins {
    id("com.android.library")
}

android {
    namespace = "app.revanced.dummy"
    compileSdk = 33
    buildToolsVersion = "33.0.1"

    defaultConfig {
        minSdk = 23
        targetSdk = 33
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    compileOnly("androidx.preference:preference:1.2.0")
    //compileOnly("com.google.protobuf:protobuf-javalite:3.23.2")
    // only make GeneratedMessageLite#unknownFields public, to make compile success
    // also patcher will patch it
    compileOnly(files("libs/protobuf-javalite-3.23.0-mod.jar"))
}
