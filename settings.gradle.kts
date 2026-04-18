pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.fabricmc.net/")
        maven("https://maven.kikugie.dev/snapshots")
    }
}

// When this addon is used as a submodule inside the Meteor workspace,
// wire the root project as a composite build so meteordevelopment:meteor-client
// can be resolved from source without requiring mavenLocal publication first.
val localMeteorRoot = file("../..")
if (localMeteorRoot.resolve("build.gradle.kts").exists()) {
    includeBuild(localMeteorRoot)
}

plugins {
    id("dev.kikugie.stonecutter") version "0.9"
}

stonecutter {
    create(rootProject) {
        versions("1.21.1", "1.21.4", "1.21.8", "1.21.10", "1.21.11")
        vcsVersion = "1.21.8"
    }
}

rootProject.name = "catppuccin-addon"