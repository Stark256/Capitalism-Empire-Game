package com.capitalism.empire.investing.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import com.capitalism.empire.investing.InvestingScreen
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.PopUpTo
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.transition.NavTransition

const val investingScreenNavigationRoute = "investing_scene_route"

fun RouteBuilder.investingScreenGraph(
    bottomBarPaddings: PaddingValues
) {
    scene(
        route = investingScreenNavigationRoute,
        navTransition = NavTransition()
    ) {
        InvestingScreenRoute(bottomBarPaddings = bottomBarPaddings)
    }
}

@Composable
fun InvestingScreenRoute(
    bottomBarPaddings: PaddingValues
) {
    InvestingScreen(bottomBarPaddings = bottomBarPaddings)
}

fun Navigator.navigateToInvestingScreen() {
    this.navigate(
        route = investingScreenNavigationRoute,
        options = NavOptions(
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true,
            popUpTo = PopUpTo.First()
        )
    )
}