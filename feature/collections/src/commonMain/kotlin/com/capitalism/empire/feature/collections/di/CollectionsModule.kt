package com.capitalism.empire.feature.collections.di

import com.capitalism.empire.feature.collections.CollectionsViewModel
import org.koin.dsl.module

val collectionsModule = module {
    factory { CollectionsViewModel() }
}