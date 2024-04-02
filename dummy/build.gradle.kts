plugins {
    id("com.android.library")
}

android {
    namespace = "app.revanced.dummy"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
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
    compileOnly("androidx.preference:preference:1.2.1")
    compileOnly("com.google.protobuf:protobuf-javalite:3.25.2")
}
