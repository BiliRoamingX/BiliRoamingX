plugins {
    id("com.android.library")
}

android {
    namespace = "app.revanced.dummy"
    compileSdk = 32

    defaultConfig {
        minSdk = 26
        targetSdk = 32
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
}