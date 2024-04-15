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
    )

    sourceSets {
        commonMain.dependencies {
            // Modules
            api(project(":core:ui"))
            // Koin
            implementation(libs.koin.core)
            implementation(libs.koin.compose)
            // ViewModel
            implementation(libs.mvvm.core)
            implementation(libs.mvvm.compose)
            implementation(libs.mvvm.flow)
            implementation(libs.mvvm.flow.compose)
            // Navigation
            implementation(libs.precompose)
            implementation(libs.precompose.viewmodel)
            implementation(libs.precompose.koin)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.capitalism.empire.wallet"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
