package com.capitalism.empire.profile.di

import com.capitalism.empire.profile.ProfileViewModel
import org.koin.dsl.module

val profileModule = module {
    factory { ProfileViewModel() }
}