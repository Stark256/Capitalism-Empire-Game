package com.capitalism.empire.investing.di

import com.capitalism.empire.investing.InvestingViewModel
import org.koin.dsl.module

val investingModule = module {
    factory { InvestingViewModel() }
}