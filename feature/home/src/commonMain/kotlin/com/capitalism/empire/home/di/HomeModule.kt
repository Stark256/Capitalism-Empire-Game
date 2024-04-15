package com.capitalism.empire.home.di

import com.capitalism.empire.home.HomeViewModel
import org.koin.dsl.module

val homeModule = module {
    factory { HomeViewModel() }
}