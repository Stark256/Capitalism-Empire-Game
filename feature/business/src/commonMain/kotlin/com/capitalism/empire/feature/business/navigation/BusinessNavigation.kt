package com.capitalism.empire.feature.business.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import com.capitalism.empire.feature.business.BusinessScreen
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.PopUpTo
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.transition.NavTransition

const val businessScreenNavigationRoute = "business_scene_route"

fun RouteBuilder.businessScreenGraph(
    bottomBarPaddings: PaddingValues
) {
    scene(
        route = businessScreenNavigationRoute,
        navTransition = NavTransition()
    ) {
        BusinessScreenRoute(
            bottomBarPaddings = bottomBarPaddings
        )
    }
}

@Composable
fun BusinessScreenRoute(
    bottomBarPaddings: PaddingValues
) {
    BusinessScreen(
        bottomBarPaddings = bottomBarPaddings
    )
}

fun Navigator.navigateToBusinessScreen() {
    this.navigate(
        route = businessScreenNavigationRoute,
        options = NavOptions(
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true,
            popUpTo = PopUpTo.First()
        )
    )
}