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
            baseName = "feature_investing"
            isStatic = true
        }
    }

    sourceSets {
        commonMainSourceSets()
    }
}

android {
    namespace = "com.capitalism.empire.investing"
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
                // Koin
                implementation(koin.bundles.all)
                // Navigation
                implementation(precompose.bundles.all)
            }
        }
    }
}