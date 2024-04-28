package com.capitalism.empire.feature.profile.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import com.capitalism.empire.feature.profile.ProfileScreen
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.PopUpTo
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.transition.NavTransition

const val profileScreenNavigationRoute = "profile_scene_route"

fun RouteBuilder.profileScreenGraph(
    bottomBarPaddings: PaddingValues
) {
    scene(
        route = profileScreenNavigationRoute,
        navTransition = NavTransition()
    ) {
        ProfileScreenRoute(
            bottomBarPaddings = bottomBarPaddings
        )
    }
}

@Composable
fun ProfileScreenRoute(
    bottomBarPaddings: PaddingValues
) {
    ProfileScreen(
        bottomBarPaddings = bottomBarPaddings
    )
}

fun Navigator.navigateToProfileScreen() {
    this.navigate(
        route = profileScreenNavigationRoute,
        options = NavOptions(
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true,
            popUpTo = PopUpTo.First()
        )
    )
}