package com.capitalism.empire.home

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.transition.NavTransition

const val homeScreenNavigationRoute = "home_screen_route"

fun RouteBuilder.homeScreen() {
    scene(
        route = com.capitalism.empire.home.homeScreenNavigationRoute,
        navTransition = NavTransition()
    ) {
        HomeScreenRoute()
    }
}

@Composable
fun HomeScreenRoute() {
    MainScreen()
}

fun navigateToHomeScreen(navigator: Navigator) {
    navigator.navigate(homeScreenNavigationRoute)
}