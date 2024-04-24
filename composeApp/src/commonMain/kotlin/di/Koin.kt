package di

import com.capitalism.empire.business.di.businessModule
import com.capitalism.empire.collections.di.collectionsModule
import com.capitalism.empire.home.di.homeModule
import com.capitalism.empire.investing.di.investingModule
import com.capitalism.empire.profile.di.profileModule
import com.capitalism.empire.splash.di.splashModule
import com.capitalism.empire.wallet.di.walletModule
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