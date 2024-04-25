package com.capitalism.empire.splash.di

import com.capitalism.empire.splash.SplashViewModel
import org.koin.dsl.module

val splashModule = module {
    factory { SplashViewModel() }
}

