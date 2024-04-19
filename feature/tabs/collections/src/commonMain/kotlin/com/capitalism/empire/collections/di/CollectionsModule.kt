package com.capitalism.empire.collections.di

import com.capitalism.empire.collections.CollectionsViewModel
import org.koin.dsl.module

val collectionsModule = module {
    factory { CollectionsViewModel() }
}