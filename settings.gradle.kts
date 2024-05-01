@file:Suppress("UnstableApiUsage")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

val gprUser = providers.gradleProperty("gpr.user")
val gprKey = providers.gradleProperty("gpr.key")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        mavenLocal()
        google()
        maven { url = uri("https://jitpack.io") }
        maven {
            // A repository must be specified for some reason. "registry" is a dummy.
            url = uri("https://maven.pkg.github.com/zjns/registry")
            credentials {
                username = gprUser.orNull ?: System.getenv("GITHUB_ACTOR")
                password = gprKey.orNull ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

include(
    ":integrations:app",
    ":integrations:dummy",
    ":integrations:extend",
    ":integrations:ksp",
    ":integrations",
    ":patches"
)
rootProject.name = "BiliRoamingX"
