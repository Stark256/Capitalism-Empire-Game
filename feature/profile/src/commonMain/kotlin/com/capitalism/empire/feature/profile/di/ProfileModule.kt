package com.capitalism.empire.feature.profile.di

import com.capitalism.empire.feature.profile.ProfileViewModel
import org.koin.dsl.module

val profileModule = module {
    factory { ProfileViewModel() }
}