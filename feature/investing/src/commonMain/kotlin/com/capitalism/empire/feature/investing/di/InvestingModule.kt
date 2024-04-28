package com.capitalism.empire.feature.investing.di

import com.capitalism.empire.feature.investing.InvestingViewModel
import org.koin.dsl.module

val investingModule = module {
    factory { InvestingViewModel() }
}