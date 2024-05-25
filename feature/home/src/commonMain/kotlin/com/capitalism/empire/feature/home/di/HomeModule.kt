package com.capitalism.empire.feature.home.di

import com.capitalism.empire.core.ui.resources.icons.ResourceIconsTabs
import com.capitalism.empire.core.ui.resources.strings.ResourceStringsTabs
import com.capitalism.empire.feature.home.HomeViewModel
import com.capitalism.empire.feature.home.resources.ResourceIconsTabsImpl
import com.capitalism.empire.feature.home.resources.ResourceStringsTabsImpl
import org.koin.dsl.module

val homeModule = module {
    factory {
        HomeViewModel(
            icons = get(),
            strings = get()
        )
    }

    single<ResourceIconsTabs> {
        ResourceIconsTabsImpl(
            resources = get()
        )
    }

    single<ResourceStringsTabs> {
        ResourceStringsTabsImpl(
            resources = get()
        )
    }

}