package di

import com.capitalism.empire.splash.splashModule
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
    splashModule
)