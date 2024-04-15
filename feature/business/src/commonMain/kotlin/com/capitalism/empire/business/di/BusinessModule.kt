package com.capitalism.empire.business.di

import com.capitalism.empire.business.BusinessViewModel
import org.koin.dsl.module

val businessModule = module {
    factory { BusinessViewModel() }
}