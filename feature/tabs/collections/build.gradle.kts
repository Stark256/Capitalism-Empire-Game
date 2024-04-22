import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsCompose)
}

kotlin {
    jvm()
    task("testClasses")

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "feature_tabs_collections"
            isStatic = true
        }
    }

    sourceSets {
        commonMainSourceSets()
    }
}

android {
    namespace = "com.capitalism.empire.collections"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
}

fun KotlinMultiplatformExtension.commonMainSourceSets() {
    sourceSets {
        commonMain {
            dependencies {
                // Modules
                api(project(":core:ui"))
                // Compose
                // Koin
                implementation(libs.koin.core)
                implementation(libs.koin.compose)
                // Navigation
                implementation(libs.precompose.core)
                implementation(libs.precompose.viewmodel)
                implementation(libs.precompose.koin)
            }
        }
    }
}