package com.capitalism.empire.wallet.di

import com.capitalism.empire.wallet.WalletViewModel
import org.koin.dsl.module

val walletModule = module {
    factory { WalletViewModel(get()) }
}