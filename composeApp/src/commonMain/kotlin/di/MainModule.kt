package di

import com.capitalism.empire.core.ui.resources.Resources
import org.koin.dsl.module
import resources.ResourcesIml

val mainModule = module {
    single<Resources> { ResourcesIml }
}