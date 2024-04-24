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
// Feature
include(":feature:splash")
include(":feature:home")
include(":feature:tabs:investing")
include(":feature:tabs:business")
include(":feature:tabs:wallet")
include(":feature:tabs:collections")
include(":feature:tabs:profile")
// Investing

// Business

// Wallet
include(":feature:wallet:cards")

// Collections

// Profile
