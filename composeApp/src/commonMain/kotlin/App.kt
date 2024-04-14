import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.capitalism.empire.splash.splashNavigationRoute
import com.capitalism.empire.splash.splashScreen
import moe.tlaster.precompose.PreComposeApp
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    PreComposeApp {
        MaterialTheme {
            NavigationHost()
        }
    }
}

@Composable
fun NavigationHost() {
    val navigator = rememberNavigator()

    NavHost(
        navigator = navigator,
        navTransition = NavTransition(),
        initialRoute = splashNavigationRoute
    ) {
        splashScreen(
            navigateToMainScreen = {
                navigateToMainScreen(navigator)
            }
        )

        mainScreen()
    }
}

