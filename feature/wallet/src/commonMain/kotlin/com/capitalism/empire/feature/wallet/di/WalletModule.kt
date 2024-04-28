package com.capitalism.empire.feature.wallet.di

import com.capitalism.empire.feature.wallet.WalletViewModel
import org.koin.dsl.module

val walletModule = module {
    factory { WalletViewModel(get()) }
}