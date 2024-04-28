package com.capitalism.empire.feature.splash

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import moe.tlaster.precompose.viewmodel.ViewModel
import moe.tlaster.precompose.viewmodel.viewModelScope

data class SplashUiState(
    val showMainScreen: Boolean = false
)

class SplashViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(SplashUiState())
    val uiState = _uiState.asStateFlow()

    init {
        // TODO make calculations
        viewModelScope.launch {
            delay(2000L)
            _uiState.update { SplashUiState(showMainScreen = true) }
        }
    }
}