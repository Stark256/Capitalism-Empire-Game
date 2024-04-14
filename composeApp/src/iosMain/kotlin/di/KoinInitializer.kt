package di

import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(doOnStart: () -> Unit): KoinAppDeclaration =
    customizeKoinApplication(
        module {
            single { doOnStart }
        }
    )