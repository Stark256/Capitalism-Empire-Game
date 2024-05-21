rootProject.name = "CapitalismEmpire"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    versionCatalogs {
        create("koin") {
            from(files("gradle/koin.versions.toml"))
        }
        create("precompose") {
            from(files("gradle/precompose.versions.toml"))
        }
    }
}

include(":composeApp")
// Core
include(":core:ui")
// UI
include(":ui:wallet")
// Data
include(":data:wallet")
// Domain
include(":domain:wallet")
// Feature
include(":feature:splash")
include(":feature:home")
include(":feature:investing")
include(":feature:business")
include(":feature:wallet")
include(":feature:collections")
include(":feature:profile")
