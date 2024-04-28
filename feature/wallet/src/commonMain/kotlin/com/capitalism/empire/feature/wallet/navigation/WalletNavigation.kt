package com.capitalism.empire.wallet.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import com.capitalism.empire.feature.wallet.WalletScreen
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.PopUpTo
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.transition.NavTransition

const val walletScreenNavigationRoute = "wallet_scene_route"

fun RouteBuilder.walletScreenGraph(
    bottomBarPaddings: PaddingValues
) {
    scene(
        route = walletScreenNavigationRoute,
        navTransition = NavTransition()
    ) {
        WalletScreenRoute(
            bottomBarPaddings = bottomBarPaddings
        )
    }
}

@Composable
fun WalletScreenRoute(
    bottomBarPaddings: PaddingValues
) {
    WalletScreen(
        bottomBarPaddings = bottomBarPaddings
    )
}

fun Navigator.navigateToWalletScreen() {
    this.navigate(
        route = walletScreenNavigationRoute,
        options = NavOptions(
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true,
            popUpTo = PopUpTo.First()
        )
    )
}