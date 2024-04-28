package com.capitalism.empire.feature.business.di

import com.capitalism.empire.feature.business.BusinessViewModel
import org.koin.dsl.module

val businessModule = module {
    factory { BusinessViewModel() }
}