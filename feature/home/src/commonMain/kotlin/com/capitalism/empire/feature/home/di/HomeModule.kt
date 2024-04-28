package com.capitalism.empire.feature.home.di

import com.capitalism.empire.feature.home.HomeViewModel
import org.koin.dsl.module

val homeModule = module {
    factory { HomeViewModel(get()) }
}