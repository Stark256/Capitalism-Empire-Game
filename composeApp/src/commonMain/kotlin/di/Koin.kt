package di

import com.capitalism.empire.feature.business.di.businessModule
import com.capitalism.empire.feature.collections.di.collectionsModule
import com.capitalism.empire.feature.home.di.homeModule
import com.capitalism.empire.feature.investing.di.investingModule
import com.capitalism.empire.feature.profile.di.profileModule
import com.capitalism.empire.feature.splash.di.splashModule
import com.capitalism.empire.feature.wallet.di.walletModule
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration

fun customizeKoinApplication(customModule: Module): KoinAppDeclaration {
    val koinAppInitializer: KoinAppDeclaration = {
        printLogger()
        modules(appModule(customModule))

        koin.get<() -> Unit>().invoke()
    }

    return koinAppInitializer
}

fun appModule(module: Module) = listOf(
    module,
    mainModule,
    splashModule,
    homeModule,
    // Bottom Tabs
    investingModule,
    businessModule,
    walletModule,
    collectionsModule,
    profileModule
)