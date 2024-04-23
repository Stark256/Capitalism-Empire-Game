package di

import com.capitalism.empire.ui.BottomBarItems
import org.koin.dsl.module

val mainModule = module {
    //single<Service> { ServiceImp() }
    single<BottomBarItems> { ui.BottomBarMenuItems }
}