import com.android.tools.build.apkzlib.zip.ZFile

plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
}

tasks.register<Delete>("clean") {
    group = "build"
    delete(layout.buildDirectory)
}

tasks.register<Sync>("dist") {
    group = "build"
    dependsOn(":integrations:app:assembleRelease")
    dependsOn(":patches:dist")
    from(project(":integrations:app").layout.buildDirectory.dir("outputs/apk/release")) {
        include("*-$version.apk")
    }
    from(project(":integrations:app").layout.buildDirectory.dir("outputs/mapping/release")) {
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
