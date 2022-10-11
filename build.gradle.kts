// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.3.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

// Tracking issue https://github.com/semantic-release/semantic-release/issues/963
tasks.register("publish", DefaultTask::class) {
    group = "publish"
    description = "Dummy publish to pass the verification phase of the gradle-semantic-release-plugin"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
