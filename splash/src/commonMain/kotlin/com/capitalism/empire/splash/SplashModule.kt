package com.capitalism.empire.splash

import org.koin.dsl.module

val splashModule = module {
    factory { SplashViewModel() }
}

