package com.capitalism.empire.splash

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.koin.koinViewModel

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
    navigateToHomeScreen: @Composable () -> Unit,
    viewModel: SplashViewModel = koinViewModel(SplashViewModel::class)
) {
    val uiState by viewModel.uiState.collectAsState()

    if(uiState.showMainScreen) {
        navigateToHomeScreen()
    }

    AnimatedVisibility(
        visible = !uiState.showMainScreen,
        content = {
            Column(
                modifier = modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Splash Screen")
            }
        }
    )
}