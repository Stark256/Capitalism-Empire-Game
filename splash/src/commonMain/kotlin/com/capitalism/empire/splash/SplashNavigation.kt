package com.capitalism.empire.splash

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.transition.NavTransition


const val splashNavigationRoute = "splash_screen_route"

fun RouteBuilder.splashScreen(navigateToMainScreen: () -> Unit) {
    scene(
        route = splashNavigationRoute,
        navTransition = NavTransition()
    ) {
        SplashScreenRoute(navigateToMainScreen)
    }
}

@Composable
fun SplashScreenRoute(
    navigateToMainScreen: () -> Unit
) {
    SplashScreen(
        navigateToMainScreen = navigateToMainScreen
    )
}