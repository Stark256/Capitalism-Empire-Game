import androidx.compose.ui.window.ComposeUIViewController
import di.initKoin
import org.koin.compose.KoinApplication

fun MainViewController() = ComposeUIViewController {
    val onStartup: () -> Unit = {

    }
    KoinApplication(application = initKoin(onStartup)) {
        App()
    }
}