import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.transition.NavTransition

const val mainNavigationRoute = "main_screen_route"

fun RouteBuilder.mainScreen() {
    scene(
        route = mainNavigationRoute,
        navTransition = NavTransition()
    ) {
        MainScreenRoute()
    }
}

@Composable
fun MainScreenRoute() {
    MainScreen()
}

fun navigateToMainScreen(navigator: Navigator) {
    navigator.navigate(mainNavigationRoute)
}