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
            api(project(":feature:tabs:investing"))
            api(project(":feature:tabs:business"))
            api(project(":feature:tabs:wallet"))
            api(project(":feature:tabs:collections"))
            api(project(":feature:tabs:profile"))
            // Koin
            implementation(libs.koin.core)
            implementation(libs.koin.compose)
            // Navigation
            implementation(libs.precompose.core)
            implementation(libs.precompose.viewmodel)
            implementation(libs.precompose.koin)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.capitalism.empire.home"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
}
