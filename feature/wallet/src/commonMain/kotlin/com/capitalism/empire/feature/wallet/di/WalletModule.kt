package com.capitalism.empire.feature.wallet.di

import com.capitalism.empire.core.ui.resources.icons.ResourceIconsWallet
import com.capitalism.empire.core.ui.resources.images.ResourceImagesWallet
import com.capitalism.empire.feature.wallet.WalletViewModel
import com.capitalism.empire.feature.wallet.resources.ResourceIconsWalletImpl
import com.capitalism.empire.feature.wallet.resources.ResourceImagesWalletImpl
import org.koin.dsl.module

val walletModule = module {
    factory {
        WalletViewModel(
            icons = get(),
            images = get()
        )
    }

    single<ResourceIconsWallet> {
        ResourceIconsWalletImpl(
            resources = get()
        )
    }
    single<ResourceImagesWallet> {
        ResourceImagesWalletImpl(
            resources = get()
        )
    }
}