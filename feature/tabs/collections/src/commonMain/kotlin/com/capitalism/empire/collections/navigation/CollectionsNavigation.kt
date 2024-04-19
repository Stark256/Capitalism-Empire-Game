package com.capitalism.empire.collections.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import com.capitalism.empire.collections.CollectionsScreen
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.PopUpTo
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.transition.NavTransition

const val collectionsScreenNavigationRoute = "collections_screen_route"

fun RouteBuilder.collectionsScreenGraph(
    bottomBarPaddings: PaddingValues
) {
    scene(
        route = collectionsScreenNavigationRoute,
        navTransition = NavTransition()
    ) {
        CollectionsScreenRoute(
            bottomBarPaddings = bottomBarPaddings
        )
    }
}

@Composable
fun CollectionsScreenRoute(
    bottomBarPaddings: PaddingValues
) {
    CollectionsScreen(
        bottomBarPaddings = bottomBarPaddings
    )
}

fun Navigator.navigateToCollectionsScreen() {
    this.navigate(
        route = collectionsScreenNavigationRoute,
        options = NavOptions(
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true,
            popUpTo = PopUpTo.First()
        )
    )
}