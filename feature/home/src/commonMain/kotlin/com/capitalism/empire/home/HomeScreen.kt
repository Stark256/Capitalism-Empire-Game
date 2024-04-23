package com.capitalism.empire.home

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.capitalism.empire.business.navigation.businessScreenGraph
import com.capitalism.empire.business.navigation.navigateToBusinessScreen
import com.capitalism.empire.collections.navigation.collectionsScreenGraph
import com.capitalism.empire.collections.navigation.navigateToCollectionsScreen
import com.capitalism.empire.investing.navigation.investingScreenGraph
import com.capitalism.empire.investing.navigation.navigateToInvestingScreen
import com.capitalism.empire.profile.navigation.navigateToProfileScreen
import com.capitalism.empire.profile.navigation.profileScreenGraph
import com.capitalism.empire.ui.BottomBar
import com.capitalism.empire.ui.MenuItemsList
import com.capitalism.empire.wallet.navigation.navigateToWalletScreen
import com.capitalism.empire.wallet.navigation.walletScreenGraph
import com.capitalism.empire.wallet.navigation.walletScreenNavigationRoute
import moe.tlaster.precompose.koin.koinViewModel
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = koinViewModel(HomeViewModel::class)
) {

    val notShowBottomBar =
        listOf(
            ""
        )

    val navigator = rememberNavigator()

    val currentEntry = navigator.currentEntry.collectAsState(initial = null)
    val showBottomBar = currentEntry.value?.route?.route !in notShowBottomBar

    val currentBottomBarMenuItem = remember { mutableStateOf(viewModel.defaultMenuItem) }

    Scaffold(
        modifier = modifier,
        bottomBar = {
            AnimatedVisibility(
                visible = showBottomBar,
                enter = slideInVertically(initialOffsetY = { it }),
                exit = slideOutVertically(targetOffsetY = { it })
            ) {
                BottomBar(
                    menuItems = MenuItemsList(viewModel.bottomMenuItems),
                    onMenuItemClicked = { menuItem ->
                        currentBottomBarMenuItem.value = menuItem
                        when (menuItem) {
                            viewModel.investingMenuItem -> {
                                navigator.navigateToInvestingScreen()
                            }

                            viewModel.businessMenuItem -> {
                                navigator.navigateToBusinessScreen()
                            }

                            viewModel.walletMenuItem -> {
                                navigator.navigateToWalletScreen()
                            }

                            viewModel.collectionsMenuItem -> {
                                navigator.navigateToCollectionsScreen()
                            }

                            viewModel.profileMenuItem -> {
                                navigator.navigateToProfileScreen()
                            }
                        }
                    },
                    currentMenuItem = currentBottomBarMenuItem.value
                )
            }
        }
    ) { paddings ->
        HomeNavHost(
            bottomBarPaddings = paddings,
            navigator = navigator
        )
    }
}

@Composable
fun HomeNavHost(
    bottomBarPaddings: PaddingValues,
    navigator: Navigator,
    modifier: Modifier = Modifier
) {
    NavHost(
        navigator = navigator,
        navTransition = NavTransition(),
        initialRoute = walletScreenNavigationRoute,
        modifier = modifier
    ) {
        investingScreenGraph(
            bottomBarPaddings = bottomBarPaddings
        )
        businessScreenGraph(
            bottomBarPaddings = bottomBarPaddings
        )
        walletScreenGraph(
            bottomBarPaddings = bottomBarPaddings
        )
        collectionsScreenGraph(
            bottomBarPaddings = bottomBarPaddings
        )
        profileScreenGraph(
            bottomBarPaddings = bottomBarPaddings
        )
    }
}
