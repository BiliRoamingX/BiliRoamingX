import com.android.tools.build.apkzlib.zip.ZFile

plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    id("build-logic") apply false
}

allprojects {
    plugins.withType<JavaBasePlugin>().configureEach {
        extensions.configure<JavaPluginExtension> {
            if (name == "patches") {
                toolchain.languageVersion = JavaLanguageVersion.of(Versions.JVM_TARGET_PATCHES)
            } else {
                toolchain.languageVersion = JavaLanguageVersion.of(Versions.JVM_TARGET)
            }
        }
    }
}

tasks.register<Delete>("clean") {
    group = "build"
    delete(layout.buildDirectory)
}

tasks.register<Sync>("dist") {
    distTask(true)
}

tasks.register<Sync>("distDev") {
    distTask(false)
}

fun Sync.distTask(release: Boolean) {
    group = "build"
    if (release) {
        dependsOn(":integrations:app:assembleRelease")
    } else {
        dependsOn(":integrations:app:assembleDev")
    }
    dependsOn(":patches:dist")
    val path = if (release) "release" else "dev"
    from(project(":integrations:app").layout.buildDirectory.dir("outputs/apk/$path")) {
        include("*-$version.apk")
    }
    from(project(":integrations:app").layout.buildDirectory.dir("outputs/mapping/$path")) {
        include("mapping.txt")
    }
    from(project(":patches").layout.buildDirectory.dir("libs")) {
        include("*-$version.jar")
    }
    from(project(":patches").layout.projectDirectory) {
        include("patches.json")
    }
    into(layout.buildDirectory)
    doLast {
        val apkFile = layout.buildDirectory.asFileTree.first { it.extension == "apk" }
        val jarFile = layout.buildDirectory.asFileTree.first { it.extension == "jar" }
        ZFile.openReadWrite(jarFile).use { jar ->
            ZFile.openReadOnly(apkFile).use { apk ->
                apk.entries().filter {
                    it.centralDirectoryHeader.name.startsWith("lib")
                }.forEach { entry ->
                    val name = entry.centralDirectoryHeader.name
                    jar.add("bilibili/$name", entry.open())
                }
            }
        }
    }
}
