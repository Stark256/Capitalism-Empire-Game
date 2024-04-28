package com.capitalism.empire.feature.splash.di

import com.capitalism.empire.feature.splash.SplashViewModel
import org.koin.dsl.module

val splashModule = module {
    factory { SplashViewModel() }
}

