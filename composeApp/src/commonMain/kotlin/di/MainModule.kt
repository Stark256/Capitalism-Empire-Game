package di

import com.capitalism.empire.ui.BottomBarItems
import org.koin.dsl.module

val mainModule = module {
    single<BottomBarItems> { ui.BottomBarMenuItems }
}