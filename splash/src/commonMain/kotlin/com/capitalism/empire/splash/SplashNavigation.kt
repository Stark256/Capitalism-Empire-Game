package com.capitalism.empire.splash

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.transition.NavTransition


const val splashNavigationRoute = "splash_screen_route"

fun RouteBuilder.splashScreen(navigateToHomeScreen: () -> Unit) {
    scene(
        route = splashNavigationRoute,
        navTransition = NavTransition()
    ) {
        SplashScreenRoute(navigateToHomeScreen)
    }
}

@Composable
fun SplashScreenRoute(
    navigateToHomeScreen: () -> Unit
) {
    SplashScreen(
        navigateToHomeScreen = navigateToHomeScreen
    )
}