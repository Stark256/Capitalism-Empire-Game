import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.capitalism.empire.home.HomeScreen
import com.capitalism.empire.splash.SplashScreen
import moe.tlaster.precompose.PreComposeApp
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
    SplashScreen(
        navigateToHomeScreen = {
            HomeScreen()
        }
    )
}

