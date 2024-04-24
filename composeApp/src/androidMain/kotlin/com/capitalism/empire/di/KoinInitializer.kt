package com.capitalism.empire.di

import di.customizeKoinApplication
import com.capitalism.empire.MainActivity
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun MainActivity.initKoin(onStart: () -> Unit): KoinAppDeclaration {
    val androidModule = module {
        single { onStart }
    }

    return customizeKoinApplication(androidModule)
}